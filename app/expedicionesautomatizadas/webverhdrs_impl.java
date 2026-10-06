package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webverhdrs_impl extends GXDataArea
{
   public webverhdrs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webverhdrs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webverhdrs_impl.class ));
   }

   public webverhdrs_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      try
      {
         AV26EmprCod = (String) args[0];
         AV88Maqcod1 = (String) args[1];
         AV89Maqcod2 = (String) args[2];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            AV88Maqcod1 = httpContext.GetPar( "Maqcod1") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Maqcod1", AV88Maqcod1);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Maqcod1, ""))));
            AV89Maqcod2 = httpContext.GetPar( "Maqcod2") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89Maqcod2", AV89Maqcod2);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Maqcod2, ""))));
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod1DU0( A396EmprCod, AV88Maqcod1, AV89Maqcod2, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            AV88Maqcod1 = httpContext.GetPar( "Maqcod1") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Maqcod1", AV88Maqcod1);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Maqcod1, ""))));
            AV89Maqcod2 = httpContext.GetPar( "Maqcod2") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89Maqcod2", AV89Maqcod2);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Maqcod2, ""))));
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcod1DU0( A396EmprCod, AV88Maqcod1, AV89Maqcod2, A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD") == 0 )
         {
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            AV88Maqcod1 = httpContext.GetPar( "Maqcod1") ;
            AV89Maqcod2 = httpContext.GetPar( "Maqcod2") ;
            hV87MaqCod = httpContext.GetPar( "hV87MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcod1DU2( A396EmprCod, AV88Maqcod1, AV89Maqcod2, hV87MaqCod) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV26EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV88Maqcod1 = httpContext.GetPar( "Maqcod1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV88Maqcod1", AV88Maqcod1);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Maqcod1, ""))));
               AV89Maqcod2 = httpContext.GetPar( "Maqcod2") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV89Maqcod2", AV89Maqcod2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Maqcod2, ""))));
            }
         }
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_55 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_55"))) ;
      nGXsfl_55_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_55_idx"))) ;
      sGXsfl_55_idx = httpContext.GetPar( "sGXsfl_55_idx") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
      AV34FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV87MaqCod = httpContext.GetPar( "MaqCod") ;
      AV47HisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF")) ;
      AV88Maqcod1 = httpContext.GetPar( "Maqcod1") ;
      AV89Maqcod2 = httpContext.GetPar( "Maqcod2") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV85ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV13ColumnsSelector);
      AV49HisProDTF_To = localUtil.parseDTimeParm( httpContext.GetPar( "HisProDTF_To")) ;
      AV104TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV105TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV110TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV111TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV106TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV107TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV130TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV131TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV132TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV133TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV126TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV127TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV128TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV129TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV168TFHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr"), ".") ;
      AV169TFHisProKgr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProKgr_To"), ".") ;
      AV178TFHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr"), ".") ;
      AV179TFHisProMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFHisProMtr_To"), ".") ;
      AV154TFHisProDTF = localUtil.parseDTimeParm( httpContext.GetPar( "TFHisProDTF")) ;
      AV116TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV117TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV152TFHisProCod = httpContext.GetPar( "TFHisProCod") ;
      AV153TFHisProCod_Sel = httpContext.GetPar( "TFHisProCod_Sel") ;
      AV198TFMaqCod = httpContext.GetPar( "TFMaqCod") ;
      AV199TFMaqCod_Sel = httpContext.GetPar( "TFMaqCod_Sel") ;
      AV218TFMaqCDsc = httpContext.GetPar( "TFMaqCDsc") ;
      AV219TFMaqCDsc_Sel = httpContext.GetPar( "TFMaqCDsc_Sel") ;
      AV222Pgmname = httpContext.GetPar( "Pgmname") ;
      AV98OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV100OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV26EmprCod = httpContext.GetPar( "EmprCod") ;
      AV207TotHisProKgr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProKgr"), ".") ;
      AV208TotHisProMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotHisProMtr"), ".") ;
      AV57Intdsc = httpContext.GetPar( "Intdsc") ;
      AV93Matiz = httpContext.GetPar( "Matiz") ;
      AV92MatCod = (short)(GXutil.lval( httpContext.GetPar( "MatCod"))) ;
      AV204TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV203TipCol = httpContext.GetPar( "TipCol") ;
      AV206Tonalidad = httpContext.GetPar( "Tonalidad") ;
      AV97Numcli = (int)(GXutil.lval( httpContext.GetPar( "Numcli"))) ;
      AV37ForTonal = httpContext.GetPar( "ForTonal") ;
      AV25DscSol = httpContext.GetPar( "DscSol") ;
      AV12CodSol = (short)(GXutil.lval( httpContext.GetPar( "CodSol"))) ;
      AV83Macprocod = httpContext.GetPar( "Macprocod") ;
      AV35Fornomcli = httpContext.GetPar( "Fornomcli") ;
      AV8barcodpar = httpContext.GetPar( "barcodpar") ;
      AV213Turno = (byte)(GXutil.lval( httpContext.GetPar( "Turno"))) ;
      AV5AlbRfen = localUtil.parseDateParm( httpContext.GetPar( "AlbRfen")) ;
      A200BarPieCod = httpContext.GetPar( "BarPieCod") ;
      AV7barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV9barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      A49AlbRFen = localUtil.parseDateParm( httpContext.GetPar( "AlbRFen")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV34FilterFullText, AV87MaqCod, AV47HisProDTF, AV88Maqcod1, AV89Maqcod2, A396EmprCod, AV85ManageFiltersExecutionStep, AV13ColumnsSelector, AV49HisProDTF_To, AV104TFBarCod, AV105TFBarCod_To, AV110TFBarCodReo, AV111TFBarCodReo_To, AV106TFBarCodPar, AV107TFBarCodPar_Sel, AV130TFCliCod, AV131TFCliCod_To, AV132TFCliNom, AV133TFCliNom_Sel, AV126TFBarSer, AV127TFBarSer_Sel, AV128TFBarSerDsc, AV129TFBarSerDsc_Sel, AV168TFHisProKgr, AV169TFHisProKgr_To, AV178TFHisProMtr, AV179TFHisProMtr_To, AV154TFHisProDTF, AV116TFBarColNom, AV117TFBarColNom_Sel, AV152TFHisProCod, AV153TFHisProCod_Sel, AV198TFMaqCod, AV199TFMaqCod_Sel, AV218TFMaqCDsc, AV219TFMaqCDsc_Sel, AV222Pgmname, AV98OrderedBy, AV100OrderedDsc, AV26EmprCod, AV207TotHisProKgr, AV208TotHisProMtr, AV57Intdsc, AV93Matiz, AV92MatCod, AV204TipColCod, AV203TipCol, AV206Tonalidad, AV97Numcli, AV37ForTonal, AV25DscSol, AV12CodSol, AV83Macprocod, AV35Fornomcli, AV8barcodpar, AV213Turno, AV5AlbRfen, A200BarPieCod, AV7barcod, AV9barcodreo, A49AlbRFen) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
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
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public byte executeStartEvent( )
   {
      pa1DU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1DU2( ) ;
      }
      return gxajaxcallmode ;
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webverhdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV88Maqcod1)),GXutil.URLEncode(GXutil.rtrim(AV89Maqcod2))}, new String[] {"EmprCod","Maqcod1","Maqcod2"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV222Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROKGR", getSecureSignedToken( "", localUtil.format( AV207TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROMTR", getSecureSignedToken( "", localUtil.format( AV208TotHisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Intdsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATIZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Matiz, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92MatCod), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV204TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV203TipCol, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTONALIDAD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV206Tonalidad, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Numcli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORTONAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37ForTonal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDSCSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25DscSol, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCODSOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CodSol), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Macprocod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Fornomcli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFEN", getSecureSignedToken( "", AV5AlbRfen));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Maqcod2, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV34FilterFullText);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vMAQCOD", GXutil.rtrim( AV87MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vHISPRODTF", localUtil.ttoc( AV47HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV84ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV84ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV39GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV40GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTF", localUtil.ttoc( AV47HisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTF_TO", localUtil.ttoc( AV49HisProDTF_To, 10, 8, 0, 0, "/", ":", " "));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV24DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV13ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV13ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV85ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV104TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV105TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV110TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV111TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR", GXutil.rtrim( AV106TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR_SEL", GXutil.rtrim( AV107TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV130TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV131TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV132TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV133TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV126TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV127TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV128TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV129TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV168TFHisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROKGR_TO", GXutil.ltrim( localUtil.ntoc( AV169TFHisProKgr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV178TFHisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROMTR_TO", GXutil.ltrim( localUtil.ntoc( AV179TFHisProMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPRODTF", localUtil.ttoc( AV154TFHisProDTF, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV116TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV117TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROCOD", GXutil.rtrim( AV152TFHisProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFHISPROCOD_SEL", GXutil.rtrim( AV153TFHisProCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD", GXutil.rtrim( AV198TFMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCOD_SEL", GXutil.rtrim( AV199TFMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCDSC", AV218TFMaqCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCDSC_SEL", AV219TFMaqCDsc_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV222Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV222Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV98OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV100OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV207TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROKGR", getSecureSignedToken( "", localUtil.format( AV207TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV208TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROMTR", getSecureSignedToken( "", localUtil.format( AV208TotHisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTDSC", GXutil.rtrim( AV57Intdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Intdsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMATIZ", GXutil.rtrim( AV93Matiz));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATIZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Matiz, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMATCOD", GXutil.ltrim( localUtil.ntoc( AV92MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92MatCod), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV204TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV204TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOL", GXutil.rtrim( AV203TipCol));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV203TipCol, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTONALIDAD", GXutil.rtrim( AV206Tonalidad));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTONALIDAD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV206Tonalidad, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMCLI", GXutil.ltrim( localUtil.ntoc( AV97Numcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Numcli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORTONAL", GXutil.rtrim( AV37ForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORTONAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37ForTonal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDSCSOL", GXutil.rtrim( AV25DscSol));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDSCSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25DscSol, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODSOL", GXutil.ltrim( localUtil.ntoc( AV12CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCODSOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CodSol), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACPROCOD", GXutil.rtrim( AV83Macprocod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Macprocod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNOMCLI", GXutil.rtrim( AV35Fornomcli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Fornomcli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROHF", localUtil.ttoc( A5609HisProHf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "FASE", GXutil.rtrim( A461Fase));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPART", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFEN", localUtil.dtoc( AV5AlbRfen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFEN", getSecureSignedToken( "", AV5AlbRfen));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIECOD", GXutil.rtrim( A200BarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV7barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRFEN", localUtil.dtoc( A49AlbRFen, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV41GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV41GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCODFM", AV90MaqCodFM);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCODFM", AV90MaqCodFM);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEXCELFILENAME", AV29ExcelFilename);
      app.GxWebStd.gx_hidden_field( httpContext, "vERRORMESSAGE", AV28ErrorMessage);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD", GXutil.rtrim( AV87MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD1", GXutil.rtrim( AV88Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV89Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSC", GXutil.rtrim( A606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
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
      httpContext.writeText( "<script type=\"text/javascript\">") ;
      httpContext.writeText( "gx.setLanguageCode(\""+httpContext.getLanguageProperty( "code")+"\");") ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         httpContext.writeText( "gx.setDateFormat(\""+httpContext.getLanguageProperty( "date_fmt")+"\");") ;
         httpContext.writeText( "gx.setTimeFormat("+httpContext.getLanguageProperty( "time_fmt")+");") ;
         httpContext.writeText( "gx.setCenturyFirstYear("+40+");") ;
         httpContext.writeText( "gx.setDecimalPoint(\""+httpContext.getLanguageProperty( "decimal_point")+"\");") ;
         httpContext.writeText( "gx.setThousandSeparator(\""+httpContext.getLanguageProperty( "thousand_sep")+"\");") ;
         httpContext.writeText( "gx.StorageTimeZone = "+2+";") ;
      }
      httpContext.writeText( "</script>") ;
   }

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we1DU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1DU2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.expedicionesautomatizadas.webverhdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV88Maqcod1)),GXutil.URLEncode(GXutil.rtrim(AV89Maqcod2))}, new String[] {"EmprCod","Maqcod1","Maqcod2"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebVerhdrs" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Table LHIPRO", "") ;
   }

   public void wb1DU0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111du1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1DU2( true) ;
      }
      else
      {
         wb_table1_27_1DU2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1DU2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         startgridcontrol55( ) ;
      }
      if ( wbEnd == 55 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_55 = (int)(nGXsfl_55_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_78_1DU2( true) ;
      }
      else
      {
         wb_table2_78_1DU2( false) ;
      }
      return  ;
   }

   public void wb_table2_78_1DU2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV39GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV40GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         ucHisprodtf_rangepicker.setProperty("Start Date", AV47HisProDTF);
         ucHisprodtf_rangepicker.setProperty("End Date", AV49HisProDTF_To);
         ucHisprodtf_rangepicker.render(context, "wwp.daterangepicker", Hisprodtf_rangepicker_Internalname, "HISPRODTF_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV24DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV13ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_hisprodtfauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_hisprodtfauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_hisprodtfauxdate_Internalname, localUtil.format(AV18DDO_HisProDTFAuxDate, "99/99/99"), localUtil.format( AV18DDO_HisProDTFAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_hisprodtfauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_hisprodtfauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 55 )
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
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1DU2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
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
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1DU0( ) ;
   }

   public void ws1DU2( )
   {
      start1DU2( ) ;
      evt1DU2( ) ;
   }

   public void evt1DU2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "M") != 0 )
               {
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "HISPRODTF_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImprimir' */
                           e181DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e191DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e201DU2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_55_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           AV202TipArtDsc = httpContext.cgiGet( edtavTipartdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTipartdsc_Internalname, AV202TipArtDsc);
                           AV30FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV30FasDsc);
                           A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
                           A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
                           A4441HisProDTF = localUtil.ctot( httpContext.cgiGet( edtHisProDTF_Internalname), 0) ;
                           n4441HisProDTF = false ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           AV213Turno = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTurno_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTurno_Internalname, GXutil.str( AV213Turno, 1, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNO"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV213Turno), "9")));
                           A2504HisProCod = httpContext.cgiGet( edtHisProCod_Internalname) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A558HisProFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtHisProFec_Internalname), 0)) ;
                           A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
                           A13734MaqCDsc = httpContext.cgiGet( edtMaqCDsc_Internalname) ;
                           if ( ! httpContext.isAjaxRequest( ) )
                           {
                              GXCCtl = "GXHCvMAQCOD_" + sGXsfl_55_idx ;
                              AV87MaqCod = httpContext.cgiGet( GXCCtl) ;
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e211DU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e221DU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e231DU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV34FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Maqcod Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMAQCOD"), AV87MaqCod) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Hisprodtf Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vHISPRODTF"), 0), AV47HisProDTF) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
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

   public void we1DU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void pa1DU2( )
   {
      if ( nDonePA == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
         {
            gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
         init_web_controls( ) ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmaqcod1DU0( String A396EmprCod ,
                                 String AV88Maqcod1 ,
                                 String AV89Maqcod2 ,
                                 String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_data1DU0( A396EmprCod, AV88Maqcod1, AV89Maqcod2, A13734MaqCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvmaqcod_data1DU0( String A396EmprCod ,
                                         String AV88Maqcod1 ,
                                         String AV89Maqcod2 ,
                                         String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H01DU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, l13734MaqCDsc, AV88Maqcod1, AV89Maqcod2});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         gxdynajaxctrlcodr.add(H01DU2_A13734MaqCDsc[0]);
         gxdynajaxctrldescr.add(H01DU2_A13734MaqCDsc[0]);
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvmaqcod1DU2( String A396EmprCod ,
                                 String AV88Maqcod1 ,
                                 String AV89Maqcod2 ,
                                 String A13734MaqCDsc )
   {
      /* Using cursor H01DU3 */
      pr_default.execute(1, new Object[] {A13734MaqCDsc, A396EmprCod, AV88Maqcod1, AV89Maqcod2});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13734MaqCDsc = H01DU3_A13734MaqCDsc[0] ;
         A396EmprCod = H01DU3_A396EmprCod[0] ;
         A602MaqCod = H01DU3_A602MaqCod[0] ;
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(1);
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_552( ) ;
      while ( nGXsfl_55_idx <= nRC_GXsfl_55 )
      {
         sendrow_552( ) ;
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV34FilterFullText ,
                                 String AV87MaqCod ,
                                 java.util.Date AV47HisProDTF ,
                                 String AV88Maqcod1 ,
                                 String AV89Maqcod2 ,
                                 String A396EmprCod ,
                                 byte AV85ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelector ,
                                 java.util.Date AV49HisProDTF_To ,
                                 int AV104TFBarCod ,
                                 int AV105TFBarCod_To ,
                                 byte AV110TFBarCodReo ,
                                 byte AV111TFBarCodReo_To ,
                                 String AV106TFBarCodPar ,
                                 String AV107TFBarCodPar_Sel ,
                                 int AV130TFCliCod ,
                                 int AV131TFCliCod_To ,
                                 String AV132TFCliNom ,
                                 String AV133TFCliNom_Sel ,
                                 String AV126TFBarSer ,
                                 String AV127TFBarSer_Sel ,
                                 String AV128TFBarSerDsc ,
                                 String AV129TFBarSerDsc_Sel ,
                                 java.math.BigDecimal AV168TFHisProKgr ,
                                 java.math.BigDecimal AV169TFHisProKgr_To ,
                                 java.math.BigDecimal AV178TFHisProMtr ,
                                 java.math.BigDecimal AV179TFHisProMtr_To ,
                                 java.util.Date AV154TFHisProDTF ,
                                 String AV116TFBarColNom ,
                                 String AV117TFBarColNom_Sel ,
                                 String AV152TFHisProCod ,
                                 String AV153TFHisProCod_Sel ,
                                 String AV198TFMaqCod ,
                                 String AV199TFMaqCod_Sel ,
                                 String AV218TFMaqCDsc ,
                                 String AV219TFMaqCDsc_Sel ,
                                 String AV222Pgmname ,
                                 short AV98OrderedBy ,
                                 boolean AV100OrderedDsc ,
                                 String AV26EmprCod ,
                                 java.math.BigDecimal AV207TotHisProKgr ,
                                 java.math.BigDecimal AV208TotHisProMtr ,
                                 String AV57Intdsc ,
                                 String AV93Matiz ,
                                 short AV92MatCod ,
                                 byte AV204TipColCod ,
                                 String AV203TipCol ,
                                 String AV206Tonalidad ,
                                 int AV97Numcli ,
                                 String AV37ForTonal ,
                                 String AV25DscSol ,
                                 short AV12CodSol ,
                                 String AV83Macprocod ,
                                 String AV35Fornomcli ,
                                 String AV8barcodpar ,
                                 byte AV213Turno ,
                                 java.util.Date AV5AlbRfen ,
                                 String A200BarPieCod ,
                                 int AV7barcod ,
                                 byte AV9barcodreo ,
                                 java.util.Date A49AlbRFen )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e221DU2 ();
      GRID_nCurrentRecord = 0 ;
      rf1DU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV213Turno), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTURNO", GXutil.ltrim( localUtil.ntoc( AV213Turno, (byte)(1), (byte)(0), ".", "")));
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
      rf1DU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV222Pgmname = "ExpedicionesAutomatizadas.WebVerhdrs" ;
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavTurno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTurno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurno_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
   }

   public void rf1DU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(55) ;
      /* Execute user event: Refresh */
      e221DU2 ();
      nGXsfl_55_idx = 1 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_552( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(2, new Object[]{ new Object[]{
                                              AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                              AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                              AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                              AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                              Integer.valueOf(AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                              Integer.valueOf(AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                              Byte.valueOf(AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                              Byte.valueOf(AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                              AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                              AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                              Integer.valueOf(AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                              Integer.valueOf(AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                              AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                              AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                              AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                              AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                              AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                              AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                              AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                              AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                              AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                              AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                              AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                              AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                              AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                              AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                              AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                              AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                              AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                              AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                              AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A1525HisProKgr ,
                                              A1526HisProMtr ,
                                              A135BarColNom ,
                                              A2504HisProCod ,
                                              A602MaqCod ,
                                              A606MaqDsc ,
                                              A4441HisProDTF ,
                                              Short.valueOf(AV98OrderedBy) ,
                                              Boolean.valueOf(AV100OrderedDsc) ,
                                              AV88Maqcod1 ,
                                              AV89Maqcod2 ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
         lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
         lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
         lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
         lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
         lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
         lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
         lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
         lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
         lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
         /* Using cursor H01DU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV88Maqcod1, AV89Maqcod2, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_55_idx = 1 ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A136BarColNum = H01DU4_A136BarColNum[0] ;
            A218BarTipCol = H01DU4_A218BarTipCol[0] ;
            A5609HisProHf = H01DU4_A5609HisProHf[0] ;
            A461Fase = H01DU4_A461Fase[0] ;
            A217BarTipArt = H01DU4_A217BarTipArt[0] ;
            n217BarTipArt = H01DU4_n217BarTipArt[0] ;
            A561HisProLin = H01DU4_A561HisProLin[0] ;
            A558HisProFec = H01DU4_A558HisProFec[0] ;
            A2504HisProCod = H01DU4_A2504HisProCod[0] ;
            A135BarColNom = H01DU4_A135BarColNom[0] ;
            A4441HisProDTF = H01DU4_A4441HisProDTF[0] ;
            n4441HisProDTF = H01DU4_n4441HisProDTF[0] ;
            A1526HisProMtr = H01DU4_A1526HisProMtr[0] ;
            A1525HisProKgr = H01DU4_A1525HisProKgr[0] ;
            A1652BarSerDsc = H01DU4_A1652BarSerDsc[0] ;
            A212BarSer = H01DU4_A212BarSer[0] ;
            A279CliNom = H01DU4_A279CliNom[0] ;
            A252CliCod = H01DU4_A252CliCod[0] ;
            n252CliCod = H01DU4_n252CliCod[0] ;
            A130BarCodPar = H01DU4_A130BarCodPar[0] ;
            A132BarCodReo = H01DU4_A132BarCodReo[0] ;
            A129BarCod = H01DU4_A129BarCod[0] ;
            A606MaqDsc = H01DU4_A606MaqDsc[0] ;
            n606MaqDsc = H01DU4_n606MaqDsc[0] ;
            A602MaqCod = H01DU4_A602MaqCod[0] ;
            A606MaqDsc = H01DU4_A606MaqDsc[0] ;
            n606MaqDsc = H01DU4_n606MaqDsc[0] ;
            A136BarColNum = H01DU4_A136BarColNum[0] ;
            A218BarTipCol = H01DU4_A218BarTipCol[0] ;
            A217BarTipArt = H01DU4_A217BarTipArt[0] ;
            n217BarTipArt = H01DU4_n217BarTipArt[0] ;
            A135BarColNom = H01DU4_A135BarColNom[0] ;
            A1652BarSerDsc = H01DU4_A1652BarSerDsc[0] ;
            A212BarSer = H01DU4_A212BarSer[0] ;
            A252CliCod = H01DU4_A252CliCod[0] ;
            n252CliCod = H01DU4_n252CliCod[0] ;
            A279CliNom = H01DU4_A279CliNom[0] ;
            A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
            e231DU2 ();
            pr_default.readNext(2);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(2);
         wbEnd = (short)(55) ;
         wb1DU0( ) ;
      }
      bGXsfl_55_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1DU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV222Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV222Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHISPROKGR", GXutil.ltrim( localUtil.ntoc( AV207TotHisProKgr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROKGR", getSecureSignedToken( "", localUtil.format( AV207TotHisProKgr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTHISPROMTR", GXutil.ltrim( localUtil.ntoc( AV208TotHisProMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROMTR", getSecureSignedToken( "", localUtil.format( AV208TotHisProMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTDSC", GXutil.rtrim( AV57Intdsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Intdsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMATIZ", GXutil.rtrim( AV93Matiz));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATIZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Matiz, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMATCOD", GXutil.ltrim( localUtil.ntoc( AV92MatCod, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92MatCod), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV204TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV204TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOL", GXutil.rtrim( AV203TipCol));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV203TipCol, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTONALIDAD", GXutil.rtrim( AV206Tonalidad));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTONALIDAD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV206Tonalidad, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMCLI", GXutil.ltrim( localUtil.ntoc( AV97Numcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Numcli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORTONAL", GXutil.rtrim( AV37ForTonal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORTONAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37ForTonal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDSCSOL", GXutil.rtrim( AV25DscSol));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDSCSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25DscSol, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCODSOL", GXutil.ltrim( localUtil.ntoc( AV12CodSol, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCODSOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CodSol), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACPROCOD", GXutil.rtrim( AV83Macprocod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Macprocod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNOMCLI", GXutil.rtrim( AV35Fornomcli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Fornomcli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNO"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV213Turno), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFEN", localUtil.dtoc( AV5AlbRfen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFEN", getSecureSignedToken( "", AV5AlbRfen));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV7barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9barcodreo), "9")));
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
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
      pr_default.dynParam(3, new Object[]{ new Object[]{
                                           AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           Short.valueOf(AV98OrderedBy) ,
                                           Boolean.valueOf(AV100OrderedDsc) ,
                                           AV88Maqcod1 ,
                                           AV89Maqcod2 ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor H01DU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV88Maqcod1, AV89Maqcod2, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      GRID_nRecordCount = H01DU5_AGRID_nRecordCount[0] ;
      pr_default.close(3);
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
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34FilterFullText, AV87MaqCod, AV47HisProDTF, AV88Maqcod1, AV89Maqcod2, A396EmprCod, AV85ManageFiltersExecutionStep, AV13ColumnsSelector, AV49HisProDTF_To, AV104TFBarCod, AV105TFBarCod_To, AV110TFBarCodReo, AV111TFBarCodReo_To, AV106TFBarCodPar, AV107TFBarCodPar_Sel, AV130TFCliCod, AV131TFCliCod_To, AV132TFCliNom, AV133TFCliNom_Sel, AV126TFBarSer, AV127TFBarSer_Sel, AV128TFBarSerDsc, AV129TFBarSerDsc_Sel, AV168TFHisProKgr, AV169TFHisProKgr_To, AV178TFHisProMtr, AV179TFHisProMtr_To, AV154TFHisProDTF, AV116TFBarColNom, AV117TFBarColNom_Sel, AV152TFHisProCod, AV153TFHisProCod_Sel, AV198TFMaqCod, AV199TFMaqCod_Sel, AV218TFMaqCDsc, AV219TFMaqCDsc_Sel, AV222Pgmname, AV98OrderedBy, AV100OrderedDsc, AV26EmprCod, AV207TotHisProKgr, AV208TotHisProMtr, AV57Intdsc, AV93Matiz, AV92MatCod, AV204TipColCod, AV203TipCol, AV206Tonalidad, AV97Numcli, AV37ForTonal, AV25DscSol, AV12CodSol, AV83Macprocod, AV35Fornomcli, AV8barcodpar, AV213Turno, AV5AlbRfen, A200BarPieCod, AV7barcod, AV9barcodreo, A49AlbRFen) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34FilterFullText, AV87MaqCod, AV47HisProDTF, AV88Maqcod1, AV89Maqcod2, A396EmprCod, AV85ManageFiltersExecutionStep, AV13ColumnsSelector, AV49HisProDTF_To, AV104TFBarCod, AV105TFBarCod_To, AV110TFBarCodReo, AV111TFBarCodReo_To, AV106TFBarCodPar, AV107TFBarCodPar_Sel, AV130TFCliCod, AV131TFCliCod_To, AV132TFCliNom, AV133TFCliNom_Sel, AV126TFBarSer, AV127TFBarSer_Sel, AV128TFBarSerDsc, AV129TFBarSerDsc_Sel, AV168TFHisProKgr, AV169TFHisProKgr_To, AV178TFHisProMtr, AV179TFHisProMtr_To, AV154TFHisProDTF, AV116TFBarColNom, AV117TFBarColNom_Sel, AV152TFHisProCod, AV153TFHisProCod_Sel, AV198TFMaqCod, AV199TFMaqCod_Sel, AV218TFMaqCDsc, AV219TFMaqCDsc_Sel, AV222Pgmname, AV98OrderedBy, AV100OrderedDsc, AV26EmprCod, AV207TotHisProKgr, AV208TotHisProMtr, AV57Intdsc, AV93Matiz, AV92MatCod, AV204TipColCod, AV203TipCol, AV206Tonalidad, AV97Numcli, AV37ForTonal, AV25DscSol, AV12CodSol, AV83Macprocod, AV35Fornomcli, AV8barcodpar, AV213Turno, AV5AlbRfen, A200BarPieCod, AV7barcod, AV9barcodreo, A49AlbRFen) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34FilterFullText, AV87MaqCod, AV47HisProDTF, AV88Maqcod1, AV89Maqcod2, A396EmprCod, AV85ManageFiltersExecutionStep, AV13ColumnsSelector, AV49HisProDTF_To, AV104TFBarCod, AV105TFBarCod_To, AV110TFBarCodReo, AV111TFBarCodReo_To, AV106TFBarCodPar, AV107TFBarCodPar_Sel, AV130TFCliCod, AV131TFCliCod_To, AV132TFCliNom, AV133TFCliNom_Sel, AV126TFBarSer, AV127TFBarSer_Sel, AV128TFBarSerDsc, AV129TFBarSerDsc_Sel, AV168TFHisProKgr, AV169TFHisProKgr_To, AV178TFHisProMtr, AV179TFHisProMtr_To, AV154TFHisProDTF, AV116TFBarColNom, AV117TFBarColNom_Sel, AV152TFHisProCod, AV153TFHisProCod_Sel, AV198TFMaqCod, AV199TFMaqCod_Sel, AV218TFMaqCDsc, AV219TFMaqCDsc_Sel, AV222Pgmname, AV98OrderedBy, AV100OrderedDsc, AV26EmprCod, AV207TotHisProKgr, AV208TotHisProMtr, AV57Intdsc, AV93Matiz, AV92MatCod, AV204TipColCod, AV203TipCol, AV206Tonalidad, AV97Numcli, AV37ForTonal, AV25DscSol, AV12CodSol, AV83Macprocod, AV35Fornomcli, AV8barcodpar, AV213Turno, AV5AlbRfen, A200BarPieCod, AV7barcod, AV9barcodreo, A49AlbRFen) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34FilterFullText, AV87MaqCod, AV47HisProDTF, AV88Maqcod1, AV89Maqcod2, A396EmprCod, AV85ManageFiltersExecutionStep, AV13ColumnsSelector, AV49HisProDTF_To, AV104TFBarCod, AV105TFBarCod_To, AV110TFBarCodReo, AV111TFBarCodReo_To, AV106TFBarCodPar, AV107TFBarCodPar_Sel, AV130TFCliCod, AV131TFCliCod_To, AV132TFCliNom, AV133TFCliNom_Sel, AV126TFBarSer, AV127TFBarSer_Sel, AV128TFBarSerDsc, AV129TFBarSerDsc_Sel, AV168TFHisProKgr, AV169TFHisProKgr_To, AV178TFHisProMtr, AV179TFHisProMtr_To, AV154TFHisProDTF, AV116TFBarColNom, AV117TFBarColNom_Sel, AV152TFHisProCod, AV153TFHisProCod_Sel, AV198TFMaqCod, AV199TFMaqCod_Sel, AV218TFMaqCDsc, AV219TFMaqCDsc_Sel, AV222Pgmname, AV98OrderedBy, AV100OrderedDsc, AV26EmprCod, AV207TotHisProKgr, AV208TotHisProMtr, AV57Intdsc, AV93Matiz, AV92MatCod, AV204TipColCod, AV203TipCol, AV206Tonalidad, AV97Numcli, AV37ForTonal, AV25DscSol, AV12CodSol, AV83Macprocod, AV35Fornomcli, AV8barcodpar, AV213Turno, AV5AlbRfen, A200BarPieCod, AV7barcod, AV9barcodreo, A49AlbRFen) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV34FilterFullText, AV87MaqCod, AV47HisProDTF, AV88Maqcod1, AV89Maqcod2, A396EmprCod, AV85ManageFiltersExecutionStep, AV13ColumnsSelector, AV49HisProDTF_To, AV104TFBarCod, AV105TFBarCod_To, AV110TFBarCodReo, AV111TFBarCodReo_To, AV106TFBarCodPar, AV107TFBarCodPar_Sel, AV130TFCliCod, AV131TFCliCod_To, AV132TFCliNom, AV133TFCliNom_Sel, AV126TFBarSer, AV127TFBarSer_Sel, AV128TFBarSerDsc, AV129TFBarSerDsc_Sel, AV168TFHisProKgr, AV169TFHisProKgr_To, AV178TFHisProMtr, AV179TFHisProMtr_To, AV154TFHisProDTF, AV116TFBarColNom, AV117TFBarColNom_Sel, AV152TFHisProCod, AV153TFHisProCod_Sel, AV198TFMaqCod, AV199TFMaqCod_Sel, AV218TFMaqCDsc, AV219TFMaqCDsc_Sel, AV222Pgmname, AV98OrderedBy, AV100OrderedDsc, AV26EmprCod, AV207TotHisProKgr, AV208TotHisProMtr, AV57Intdsc, AV93Matiz, AV92MatCod, AV204TipColCod, AV203TipCol, AV206Tonalidad, AV97Numcli, AV37ForTonal, AV25DscSol, AV12CodSol, AV83Macprocod, AV35Fornomcli, AV8barcodpar, AV213Turno, AV5AlbRfen, A200BarPieCod, AV7barcod, AV9barcodreo, A49AlbRFen) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV222Pgmname = "ExpedicionesAutomatizadas.WebVerhdrs" ;
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavTurno_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTurno_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurno_Enabled), 5, 0), !bGXsfl_55_Refreshing);
      edtavTotvaluehisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehisprokgr_Enabled), 5, 0), true);
      edtavTotvaluehispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluehispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluehispromtr_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1DU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e211DU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV84ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV24DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV13ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV40GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47HisProDTF = localUtil.ctot( httpContext.cgiGet( "vHISPRODTF"), 0) ;
         AV49HisProDTF_To = localUtil.ctot( httpContext.cgiGet( "vHISPRODTF_TO"), 0) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( "INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( "INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( "INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV34FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34FilterFullText", AV34FilterFullText);
         AV48HisProDTF_RangeText = httpContext.cgiGet( edtavHisprodtf_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48HisProDTF_RangeText", AV48HisProDTF_RangeText);
         hV87MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV87MaqCod)==0) )
         {
            AV87MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87MaqCod", AV87MaqCod);
         }
         else
         {
            A13734MaqCDsc = hV87MaqCod ;
            /* Using cursor H01DU6 */
            pr_default.execute(4, new Object[] {A13734MaqCDsc, A396EmprCod, AV88Maqcod1, AV89Maqcod2});
            AV87MaqCod = H01DU6_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(4) == 101) ) )
            {
               pr_default.readNext(4);
               if ( ! ( (pr_default.getStatus(4) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(4);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV87MaqCod", hV87MaqCod);
         AV209TotValueHisProKgr = httpContext.cgiGet( edtavTotvaluehisprokgr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV209TotValueHisProKgr", AV209TotValueHisProKgr);
         AV210TotValueHisProMtr = httpContext.cgiGet( edtavTotvaluehispromtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV210TotValueHisProMtr", AV210TotValueHisProMtr);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_HISPRODTFAUXDATE");
            GX_FocusControl = edtavDdo_hisprodtfauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18DDO_HisProDTFAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DDO_HisProDTFAuxDate", localUtil.format(AV18DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else
         {
            AV18DDO_HisProDTFAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_hisprodtfauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DDO_HisProDTFAuxDate", localUtil.format(AV18DDO_HisProDTFAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         AV87MaqCod = httpContext.cgiGet( "GXH_vMAQCOD") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87MaqCod", AV87MaqCod);
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV34FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMAQCOD"), AV87MaqCod) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vHISPRODTF")), AV47HisProDTF) ) )
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
      e211DU2 ();
      if (returnInSub) return;
   }

   public void e211DU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV61Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV61Lit0 = GXt_char1 ;
      GXt_char1 = AV82LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV82LitFe = GXt_char1 ;
      GXt_char1 = AV72Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV222Pgmname, (byte)(99), GXv_char2) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Lit2 = GXt_char1 ;
      AV215UsurCod = " " ;
      GXt_char1 = AV103Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV103Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV215UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV103Station, GXv_char2, GXv_char3, GXv_char4) ;
      webverhdrs_impl.this.A396EmprCod = GXv_char2[0] ;
      webverhdrs_impl.this.AV27EmprNom = GXv_char3[0] ;
      webverhdrs_impl.this.AV215UsurCod = GXv_char4[0] ;
      AV47HisProDTF = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47HisProDTF", localUtil.ttoc( AV47HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV47HisProDTF = GXutil.addmth( AV47HisProDTF, (short)(-3)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47HisProDTF", localUtil.ttoc( AV47HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV49HisProDTF_To = GXutil.serverNow( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49HisProDTF_To", localUtil.ttoc( AV49HisProDTF_To, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      /* Execute user subroutine: 'LOADCOLECCION' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV11Carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char4) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Carpeta = GXt_char1 ;
      AV95Nom_inf = AV222Pgmname ;
      GXt_int5 = AV10Cambiarcpp ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CAMCPP", ""), GXv_int6) ;
      webverhdrs_impl.this.GXt_int5 = GXv_int6[0] ;
      AV10Cambiarcpp = GXt_int5 ;
      GXt_char1 = AV103Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char4[0] ;
      AV103Station = GXt_char1 ;
      GXv_char4[0] = AV26EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char2[0] = AV215UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV103Station, GXv_char4, GXv_char3, GXv_char2) ;
      webverhdrs_impl.this.AV26EmprCod = GXv_char4[0] ;
      webverhdrs_impl.this.AV27EmprNom = GXv_char3[0] ;
      webverhdrs_impl.this.AV215UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV56HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      this.executeUsercontrolMethod("", false, "HISPRODTF_RANGEPICKERContainer", "Attach", "", new Object[] {edtavHisprodtf_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Table LHIPRO", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV98OrderedBy < 1 )
      {
         AV98OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV24DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV24DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e221DU2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV216WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV216WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV85ManageFiltersExecutionStep == 1 )
      {
         AV85ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85ManageFiltersExecutionStep", GXutil.str( AV85ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV85ManageFiltersExecutionStep == 2 )
      {
         AV85ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85ManageFiltersExecutionStep", GXutil.str( AV85ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV102Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV102Session.getValue("ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector") ;
         AV13ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtBarCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarCodPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtCliCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarSer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarSerDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtavTipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipartdsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtavFasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProKgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProKgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProMtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProDTF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDTF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDTF_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtBarColNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtavTurno_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTurno_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTurno_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtHisProCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtMaqCDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV13ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCDsc_Visible), 5, 0), !bGXsfl_55_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV39GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridCurrentPage), 10, 0));
      AV40GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV84ManageFiltersData", AV84ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
   }

   public void e131DU2( )
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
         AV101PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV101PageToGo) ;
      }
   }

   public void e141DU2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e161DU2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV98OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OrderedBy), 4, 0));
         AV100OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100OrderedDsc", AV100OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV104TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarCod), 8, 0));
            AV105TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV110TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFBarCodReo", GXutil.str( AV110TFBarCodReo, 1, 0));
            AV111TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFBarCodReo_To", GXutil.str( AV111TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV106TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarCodPar", AV106TFBarCodPar);
            AV107TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFBarCodPar_Sel", AV107TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV130TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV130TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130TFCliCod), 6, 0));
            AV131TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV131TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV132TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV132TFCliNom", AV132TFCliNom);
            AV133TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133TFCliNom_Sel", AV133TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV126TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarSer", AV126TFBarSer);
            AV127TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFBarSer_Sel", AV127TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV128TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarSerDsc", AV128TFBarSerDsc);
            AV129TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarSerDsc_Sel", AV129TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProKgr") == 0 )
         {
            AV168TFHisProKgr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV168TFHisProKgr", GXutil.ltrimstr( AV168TFHisProKgr, 9, 2));
            AV169TFHisProKgr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV169TFHisProKgr_To", GXutil.ltrimstr( AV169TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProMtr") == 0 )
         {
            AV178TFHisProMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178TFHisProMtr", GXutil.ltrimstr( AV178TFHisProMtr, 9, 2));
            AV179TFHisProMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV179TFHisProMtr_To", GXutil.ltrimstr( AV179TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProDTF") == 0 )
         {
            AV154TFHisProDTF = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154TFHisProDTF", localUtil.ttoc( AV154TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV116TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFBarColNom", AV116TFBarColNom);
            AV117TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFBarColNom_Sel", AV117TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HisProCod") == 0 )
         {
            AV152TFHisProCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152TFHisProCod", AV152TFHisProCod);
            AV153TFHisProCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV153TFHisProCod_Sel", AV153TFHisProCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCod") == 0 )
         {
            AV198TFMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV198TFMaqCod", AV198TFMaqCod);
            AV199TFMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV199TFMaqCod_Sel", AV199TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCDsc") == 0 )
         {
            AV218TFMaqCDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV218TFMaqCDsc", AV218TFMaqCDsc);
            AV219TFMaqCDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV219TFMaqCDsc_Sel", AV219TFMaqCDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e231DU2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXv_char4[0] = AV57Intdsc ;
      GXv_char3[0] = AV93Matiz ;
      GXv_int10[0] = AV92MatCod ;
      GXv_int6[0] = AV204TipColCod ;
      GXv_char2[0] = AV203TipCol ;
      GXv_char11[0] = AV206Tonalidad ;
      GXv_int12[0] = AV97Numcli ;
      GXv_char13[0] = AV37ForTonal ;
      GXv_char14[0] = AV25DscSol ;
      GXv_int15[0] = AV12CodSol ;
      GXv_char16[0] = AV83Macprocod ;
      GXv_char17[0] = AV35Fornomcli ;
      new app.pmasinf(remoteHandle, context).execute( A396EmprCod, A252CliCod, A212BarSer, A135BarColNom, A136BarColNum, A218BarTipCol, GXv_char4, GXv_char3, GXv_int10, GXv_int6, GXv_char2, GXv_char11, GXv_int12, GXv_char13, GXv_char14, GXv_int15, GXv_char16, GXv_char17) ;
      webverhdrs_impl.this.AV57Intdsc = GXv_char4[0] ;
      webverhdrs_impl.this.AV93Matiz = GXv_char3[0] ;
      webverhdrs_impl.this.AV92MatCod = GXv_int10[0] ;
      webverhdrs_impl.this.AV204TipColCod = GXv_int6[0] ;
      webverhdrs_impl.this.AV203TipCol = GXv_char2[0] ;
      webverhdrs_impl.this.AV206Tonalidad = GXv_char11[0] ;
      webverhdrs_impl.this.AV97Numcli = GXv_int12[0] ;
      webverhdrs_impl.this.AV37ForTonal = GXv_char13[0] ;
      webverhdrs_impl.this.AV25DscSol = GXv_char14[0] ;
      webverhdrs_impl.this.AV12CodSol = GXv_int15[0] ;
      webverhdrs_impl.this.AV83Macprocod = GXv_char16[0] ;
      webverhdrs_impl.this.AV35Fornomcli = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Intdsc", AV57Intdsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINTDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57Intdsc, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV93Matiz", AV93Matiz);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATIZ", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93Matiz, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV92MatCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92MatCod), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMATCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92MatCod), "ZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV204TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV204TipColCod), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV204TipColCod), "Z9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV203TipCol", AV203TipCol);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV203TipCol, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV206Tonalidad", AV206Tonalidad);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTONALIDAD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV206Tonalidad, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV97Numcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97Numcli), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97Numcli), "ZZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV37ForTonal", AV37ForTonal);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORTONAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37ForTonal, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25DscSol", AV25DscSol);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDSCSOL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25DscSol, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV12CodSol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12CodSol), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCODSOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12CodSol), "ZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV83Macprocod", AV83Macprocod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV83Macprocod, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV35Fornomcli", AV35Fornomcli);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35Fornomcli, ""))));
      AV7barcod = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7barcod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7barcod), "ZZZZZZZ9")));
      AV9barcodreo = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9barcodreo", GXutil.str( AV9barcodreo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9barcodreo), "9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV8barcodpar", AV8barcodpar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8barcodpar, ""))));
      /* Execute user subroutine: 'BARPIE' */
      S202 ();
      if (returnInSub) return;
      GXv_char17[0] = A396EmprCod ;
      GXv_dtime18[0] = A5609HisProHf ;
      GXv_int6[0] = AV213Turno ;
      new app.pcturno(remoteHandle, context).execute( GXv_char17, GXv_dtime18, GXv_int6) ;
      webverhdrs_impl.this.A396EmprCod = GXv_char17[0] ;
      webverhdrs_impl.this.A5609HisProHf = GXutil.resetDate(GXv_dtime18[0]) ;
      webverhdrs_impl.this.AV213Turno = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5609HisProHf", localUtil.ttoc( A5609HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, edtavTurno_Internalname, GXutil.str( AV213Turno, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNO"+"_"+sGXsfl_55_idx, getSecureSignedToken( sGXsfl_55_idx, localUtil.format( DecimalUtil.doubleToDec(AV213Turno), "9")));
      GXv_char17[0] = AV30FasDsc ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char17) ;
      webverhdrs_impl.this.AV30FasDsc = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV30FasDsc);
      GXv_char17[0] = AV202TipArtDsc ;
      new app.ptipartdsc(remoteHandle, context).execute( A396EmprCod, A217BarTipArt, GXv_char17) ;
      webverhdrs_impl.this.AV202TipArtDsc = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTipartdsc_Internalname, AV202TipArtDsc);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(55) ;
      }
      sendrow_552( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_55_Refreshing )
      {
         httpContext.doAjaxLoad(55, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e171DU2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV13ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV13ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV84ManageFiltersData", AV84ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
   }

   public void e121DU2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S212 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebVerhdrsFilters")),GXutil.URLEncode(GXutil.rtrim(AV222Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV85ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85ManageFiltersExecutionStep", GXutil.str( AV85ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebVerhdrsFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV85ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85ManageFiltersExecutionStep", GXutil.str( AV85ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV86ManageFiltersXml ;
         GXv_char17[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebVerhdrsFilters", Ddo_managefilters_Activeeventkey, GXv_char17) ;
         webverhdrs_impl.this.GXt_char1 = GXv_char17[0] ;
         AV86ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV86ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S212 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV222Pgmname+"GridState", AV86ManageFiltersXml) ;
            AV41GridState.fromxml(AV86ManageFiltersXml, null, null);
            AV98OrderedBy = AV41GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OrderedBy), 4, 0));
            AV100OrderedDsc = AV41GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100OrderedDsc", AV100OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S222 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV84ManageFiltersData", AV84ManageFiltersData);
   }

   public void e181DU2( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      if ( ( AV90MaqCodFM.size() <= 0 ) && GXutil.dateCompare(GXutil.nullDate(), AV47HisProDTF) && GXutil.dateCompare(GXutil.nullDate(), AV49HisProDTF_To) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "Variables de filtro vacias.", ""), "", "", "", "", "", "", "", "", ""));
      }
      else
      {
         new app.expedicionesautomatizadas.wverhdrsexport(remoteHandle, context).execute( ) ;
         if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
         {
            callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(0) ;
         }
         else
         {
            httpContext.GX_msglist.addItem(AV28ErrorMessage);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90MaqCodFM", AV90MaqCodFM);
   }

   public void e191DU2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char17[0] = AV29ExcelFilename ;
      GXv_char16[0] = AV28ErrorMessage ;
      new app.expedicionesautomatizadas.webverhdrsexport(remoteHandle, context).execute( GXv_char17, GXv_char16) ;
      webverhdrs_impl.this.AV29ExcelFilename = GXv_char17[0] ;
      webverhdrs_impl.this.AV28ErrorMessage = GXv_char16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ExcelFilename", AV29ExcelFilename);
      httpContext.ajax_rsp_assign_attri("", false, "AV28ErrorMessage", AV28ErrorMessage);
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV28ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e201DU2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.expedicionesautomatizadas.webverhdrsexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void e151DU2( )
   {
      /* Hisprodtf_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47HisProDTF", localUtil.ttoc( AV47HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV49HisProDTF_To", localUtil.ttoc( AV49HisProDTF_To, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      gxgrgrid_refresh( subGrid_Rows, AV34FilterFullText, AV87MaqCod, AV47HisProDTF, AV88Maqcod1, AV89Maqcod2, A396EmprCod, AV85ManageFiltersExecutionStep, AV13ColumnsSelector, AV49HisProDTF_To, AV104TFBarCod, AV105TFBarCod_To, AV110TFBarCodReo, AV111TFBarCodReo_To, AV106TFBarCodPar, AV107TFBarCodPar_Sel, AV130TFCliCod, AV131TFCliCod_To, AV132TFCliNom, AV133TFCliNom_Sel, AV126TFBarSer, AV127TFBarSer_Sel, AV128TFBarSerDsc, AV129TFBarSerDsc_Sel, AV168TFHisProKgr, AV169TFHisProKgr_To, AV178TFHisProMtr, AV179TFHisProMtr_To, AV154TFHisProDTF, AV116TFBarColNom, AV117TFBarColNom_Sel, AV152TFHisProCod, AV153TFHisProCod_Sel, AV198TFMaqCod, AV199TFMaqCod_Sel, AV218TFMaqCDsc, AV219TFMaqCDsc_Sel, AV222Pgmname, AV98OrderedBy, AV100OrderedDsc, AV26EmprCod, AV207TotHisProKgr, AV208TotHisProMtr, AV57Intdsc, AV93Matiz, AV92MatCod, AV204TipColCod, AV203TipCol, AV206Tonalidad, AV97Numcli, AV37ForTonal, AV25DscSol, AV12CodSol, AV83Macprocod, AV35Fornomcli, AV8barcodpar, AV213Turno, AV5AlbRfen, A200BarPieCod, AV7barcod, AV9barcodreo, A49AlbRFen) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13ColumnsSelector", AV13ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV84ManageFiltersData", AV84ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV41GridState", AV41GridState);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV98OrderedBy, 4, 0))+":"+(AV100OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV13ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarCod", "", "Codigo Barcada", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarCodReo", "", "Codigo Reoperado Barcada", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarCodPar", "", "Codigo Particion Barcada", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "CliCod", "", "Cliente", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "CliNom", "", "Nombre Cliente", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarSer", "", "Serie", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarSerDsc", "", "Descripción Serie", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&TipArtDsc", "", "Tipo Artículo", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&FasDsc", "", "Descripcion ", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "HisProKgr", "", "HisProKgr", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "HisProMtr", "", "HisProMtr", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "HisProDTF", "", "Fin", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "BarColNom", "", "Nombre Color", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "&Turno", "", "Turno", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "HisProCod", "", "Codigo Proceso", true, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "MaqCod", "", "Código Máquina", false, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXv_SdtWWPColumnsSelector19[0] = AV13ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, "MaqCDsc", "", "Codigo+Descripcion", false, "") ;
      AV13ColumnsSelector = GXv_SdtWWPColumnsSelector19[0] ;
      GXt_char1 = AV214UserCustomValue ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebVerhdrsColumnsSelector", GXv_char17) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char17[0] ;
      AV214UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV214UserCustomValue)==0) ) )
      {
         AV14ColumnsSelectorAux.fromxml(AV214UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector19[0] = AV14ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector20[0] = AV13ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector19, GXv_SdtWWPColumnsSelector20) ;
         AV14ColumnsSelectorAux = GXv_SdtWWPColumnsSelector19[0] ;
         AV13ColumnsSelector = GXv_SdtWWPColumnsSelector20[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 = AV84ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebVerhdrsFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22[0] ;
      AV84ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 ;
   }

   public void S212( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV34FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34FilterFullText", AV34FilterFullText);
      AV47HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV47HisProDTF", localUtil.ttoc( AV47HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV49HisProDTF_To = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV49HisProDTF_To", localUtil.ttoc( AV49HisProDTF_To, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV87MaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87MaqCod", AV87MaqCod);
      /* Using cursor H01DU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV88Maqcod1, AV89Maqcod2, AV87MaqCod});
      hV87MaqCod = "" ;
      while ( (pr_default.getStatus(5) != 101) )
      {
         hV87MaqCod = H01DU7_A13734MaqCDsc[0] ;
         if (true) break;
      }
      pr_default.close(5);
      httpContext.ajax_rsp_assign_attri("", false, "hV87MaqCod", hV87MaqCod);
      AV104TFBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarCod), 8, 0));
      AV105TFBarCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarCod_To), 8, 0));
      AV110TFBarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TFBarCodReo", GXutil.str( AV110TFBarCodReo, 1, 0));
      AV111TFBarCodReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111TFBarCodReo_To", GXutil.str( AV111TFBarCodReo_To, 1, 0));
      AV106TFBarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarCodPar", AV106TFBarCodPar);
      AV107TFBarCodPar_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFBarCodPar_Sel", AV107TFBarCodPar_Sel);
      AV130TFCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130TFCliCod), 6, 0));
      AV131TFCliCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV131TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131TFCliCod_To), 6, 0));
      AV132TFCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV132TFCliNom", AV132TFCliNom);
      AV133TFCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133TFCliNom_Sel", AV133TFCliNom_Sel);
      AV126TFBarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarSer", AV126TFBarSer);
      AV127TFBarSer_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127TFBarSer_Sel", AV127TFBarSer_Sel);
      AV128TFBarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarSerDsc", AV128TFBarSerDsc);
      AV129TFBarSerDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarSerDsc_Sel", AV129TFBarSerDsc_Sel);
      AV168TFHisProKgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV168TFHisProKgr", GXutil.ltrimstr( AV168TFHisProKgr, 9, 2));
      AV169TFHisProKgr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV169TFHisProKgr_To", GXutil.ltrimstr( AV169TFHisProKgr_To, 9, 2));
      AV178TFHisProMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV178TFHisProMtr", GXutil.ltrimstr( AV178TFHisProMtr, 9, 2));
      AV179TFHisProMtr_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV179TFHisProMtr_To", GXutil.ltrimstr( AV179TFHisProMtr_To, 9, 2));
      AV154TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV154TFHisProDTF", localUtil.ttoc( AV154TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV116TFBarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116TFBarColNom", AV116TFBarColNom);
      AV117TFBarColNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117TFBarColNom_Sel", AV117TFBarColNom_Sel);
      AV152TFHisProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV152TFHisProCod", AV152TFHisProCod);
      AV153TFHisProCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV153TFHisProCod_Sel", AV153TFHisProCod_Sel);
      AV198TFMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV198TFMaqCod", AV198TFMaqCod);
      AV199TFMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV199TFMaqCod_Sel", AV199TFMaqCod_Sel);
      AV218TFMaqCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV218TFMaqCDsc", AV218TFMaqCDsc);
      AV219TFMaqCDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV219TFMaqCDsc_Sel", AV219TFMaqCDsc_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV102Session.getValue(AV222Pgmname+"GridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV222Pgmname+"GridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV102Session.getValue(AV222Pgmname+"GridState"), null, null);
      }
      AV98OrderedBy = AV41GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98OrderedBy), 4, 0));
      AV100OrderedDsc = AV41GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100OrderedDsc", AV100OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV41GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV41GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV41GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S222( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV254GXV1 = 1 ;
      while ( AV254GXV1 <= AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV254GXV1));
         if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV34FilterFullText = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34FilterFullText", AV34FilterFullText);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "HISPRODTF") == 0 )
         {
            AV47HisProDTF = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47HisProDTF", localUtil.ttoc( AV47HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV49HisProDTF_To = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49HisProDTF_To", localUtil.ttoc( AV49HisProDTF_To, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "MAQCOD") == 0 )
         {
            AV87MaqCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87MaqCod", AV87MaqCod);
            /* Using cursor H01DU8 */
            pr_default.execute(6, new Object[] {A396EmprCod, AV88Maqcod1, AV89Maqcod2, AV87MaqCod});
            hV87MaqCod = "" ;
            while ( (pr_default.getStatus(6) != 101) )
            {
               hV87MaqCod = H01DU8_A13734MaqCDsc[0] ;
               if (true) break;
            }
            pr_default.close(6);
            httpContext.ajax_rsp_assign_attri("", false, "hV87MaqCod", hV87MaqCod);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV104TFBarCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104TFBarCod), 8, 0));
            AV105TFBarCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV110TFBarCodReo = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV110TFBarCodReo", GXutil.str( AV110TFBarCodReo, 1, 0));
            AV111TFBarCodReo_To = (byte)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV111TFBarCodReo_To", GXutil.str( AV111TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV106TFBarCodPar = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarCodPar", AV106TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV107TFBarCodPar_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFBarCodPar_Sel", AV107TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV130TFCliCod = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV130TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV130TFCliCod), 6, 0));
            AV131TFCliCod_To = (int)(GXutil.lval( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV131TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV131TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV132TFCliNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV132TFCliNom", AV132TFCliNom);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV133TFCliNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV133TFCliNom_Sel", AV133TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV126TFBarSer = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV126TFBarSer", AV126TFBarSer);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV127TFBarSer_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV127TFBarSer_Sel", AV127TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV128TFBarSerDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128TFBarSerDsc", AV128TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV129TFBarSerDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129TFBarSerDsc_Sel", AV129TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROKGR") == 0 )
         {
            AV168TFHisProKgr = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV168TFHisProKgr", GXutil.ltrimstr( AV168TFHisProKgr, 9, 2));
            AV169TFHisProKgr_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV169TFHisProKgr_To", GXutil.ltrimstr( AV169TFHisProKgr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROMTR") == 0 )
         {
            AV178TFHisProMtr = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV178TFHisProMtr", GXutil.ltrimstr( AV178TFHisProMtr, 9, 2));
            AV179TFHisProMtr_To = CommonUtil.decimalVal( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV179TFHisProMtr_To", GXutil.ltrimstr( AV179TFHisProMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPRODTF") == 0 )
         {
            AV154TFHisProDTF = localUtil.ctot( AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV154TFHisProDTF", localUtil.ttoc( AV154TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV18DDO_HisProDTFAuxDate = GXutil.resetTime(AV154TFHisProDTF) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18DDO_HisProDTFAuxDate", localUtil.format(AV18DDO_HisProDTFAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV116TFBarColNom = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116TFBarColNom", AV116TFBarColNom);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV117TFBarColNom_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117TFBarColNom_Sel", AV117TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD") == 0 )
         {
            AV152TFHisProCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV152TFHisProCod", AV152TFHisProCod);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHISPROCOD_SEL") == 0 )
         {
            AV153TFHisProCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV153TFHisProCod_Sel", AV153TFHisProCod_Sel);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD") == 0 )
         {
            AV198TFMaqCod = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV198TFMaqCod", AV198TFMaqCod);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCOD_SEL") == 0 )
         {
            AV199TFMaqCod_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV199TFMaqCod_Sel", AV199TFMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC") == 0 )
         {
            AV218TFMaqCDsc = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV218TFMaqCDsc", AV218TFMaqCDsc);
         }
         else if ( GXutil.strcmp(AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCDSC_SEL") == 0 )
         {
            AV219TFMaqCDsc_Sel = AV42GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV219TFMaqCDsc_Sel", AV219TFMaqCDsc_Sel);
         }
         AV254GXV1 = (int)(AV254GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV107TFBarCodPar_Sel)==0), AV107TFBarCodPar_Sel, GXv_char17) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char17[0] ;
      GXt_char23 = "" ;
      GXv_char16[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV133TFCliNom_Sel)==0), AV133TFCliNom_Sel, GXv_char16) ;
      webverhdrs_impl.this.GXt_char23 = GXv_char16[0] ;
      GXt_char24 = "" ;
      GXv_char14[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV127TFBarSer_Sel)==0), AV127TFBarSer_Sel, GXv_char14) ;
      webverhdrs_impl.this.GXt_char24 = GXv_char14[0] ;
      GXt_char25 = "" ;
      GXv_char13[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV129TFBarSerDsc_Sel)==0), AV129TFBarSerDsc_Sel, GXv_char13) ;
      webverhdrs_impl.this.GXt_char25 = GXv_char13[0] ;
      GXt_char26 = "" ;
      GXv_char11[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV117TFBarColNom_Sel)==0), AV117TFBarColNom_Sel, GXv_char11) ;
      webverhdrs_impl.this.GXt_char26 = GXv_char11[0] ;
      GXt_char27 = "" ;
      GXv_char4[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV153TFHisProCod_Sel)==0), AV153TFHisProCod_Sel, GXv_char4) ;
      webverhdrs_impl.this.GXt_char27 = GXv_char4[0] ;
      GXt_char28 = "" ;
      GXv_char3[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV199TFMaqCod_Sel)==0), AV199TFMaqCod_Sel, GXv_char3) ;
      webverhdrs_impl.this.GXt_char28 = GXv_char3[0] ;
      GXt_char29 = "" ;
      GXv_char2[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV219TFMaqCDsc_Sel)==0), AV219TFMaqCDsc_Sel, GXv_char2) ;
      webverhdrs_impl.this.GXt_char29 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"||"+GXt_char23+"|"+GXt_char24+"|"+GXt_char25+"||||||"+GXt_char26+"||"+GXt_char27+"|"+GXt_char28+"|"+GXt_char29 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char29 = "" ;
      GXv_char17[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV106TFBarCodPar)==0), AV106TFBarCodPar, GXv_char17) ;
      webverhdrs_impl.this.GXt_char29 = GXv_char17[0] ;
      GXt_char28 = "" ;
      GXv_char16[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV132TFCliNom)==0), AV132TFCliNom, GXv_char16) ;
      webverhdrs_impl.this.GXt_char28 = GXv_char16[0] ;
      GXt_char27 = "" ;
      GXv_char14[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV126TFBarSer)==0), AV126TFBarSer, GXv_char14) ;
      webverhdrs_impl.this.GXt_char27 = GXv_char14[0] ;
      GXt_char26 = "" ;
      GXv_char13[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV128TFBarSerDsc)==0), AV128TFBarSerDsc, GXv_char13) ;
      webverhdrs_impl.this.GXt_char26 = GXv_char13[0] ;
      GXt_char25 = "" ;
      GXv_char11[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV116TFBarColNom)==0), AV116TFBarColNom, GXv_char11) ;
      webverhdrs_impl.this.GXt_char25 = GXv_char11[0] ;
      GXt_char24 = "" ;
      GXv_char4[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV152TFHisProCod)==0), AV152TFHisProCod, GXv_char4) ;
      webverhdrs_impl.this.GXt_char24 = GXv_char4[0] ;
      GXt_char23 = "" ;
      GXv_char3[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV198TFMaqCod)==0), AV198TFMaqCod, GXv_char3) ;
      webverhdrs_impl.this.GXt_char23 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV218TFMaqCDsc)==0), AV218TFMaqCDsc, GXv_char2) ;
      webverhdrs_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV104TFBarCod) ? "" : GXutil.str( AV104TFBarCod, 8, 0))+"|"+((0==AV110TFBarCodReo) ? "" : GXutil.str( AV110TFBarCodReo, 1, 0))+"|"+GXt_char29+"|"+((0==AV130TFCliCod) ? "" : GXutil.str( AV130TFCliCod, 6, 0))+"|"+GXt_char28+"|"+GXt_char27+"|"+GXt_char26+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV168TFHisProKgr)==0) ? "" : GXutil.str( AV168TFHisProKgr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV178TFHisProMtr)==0) ? "" : GXutil.str( AV178TFHisProMtr, 9, 2))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV154TFHisProDTF) ? "" : localUtil.dtoc( AV18DDO_HisProDTFAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char25+"||"+GXt_char24+"|"+GXt_char23+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV105TFBarCod_To) ? "" : GXutil.str( AV105TFBarCod_To, 8, 0))+"|"+((0==AV111TFBarCodReo_To) ? "" : GXutil.str( AV111TFBarCodReo_To, 1, 0))+"||"+((0==AV131TFCliCod_To) ? "" : GXutil.str( AV131TFCliCod_To, 6, 0))+"||||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV169TFHisProKgr_To)==0) ? "" : GXutil.str( AV169TFHisProKgr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV179TFHisProMtr_To)==0) ? "" : GXutil.str( AV179TFHisProMtr_To, 9, 2))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV41GridState.fromxml(AV102Session.getValue(AV222Pgmname+"GridState"), null, null);
      AV41GridState.setgxTv_SdtWWPGridState_Orderedby( AV98OrderedBy );
      AV41GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV100OrderedDsc );
      AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV34FilterFullText)==0), (short)(0), AV34FilterFullText, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "HISPRODTF", "", !(GXutil.dateCompare(GXutil.nullDate(), AV47HisProDTF)&&GXutil.dateCompare(GXutil.nullDate(), AV49HisProDTF_To)), (short)(0), GXutil.trim( localUtil.ttoc( AV47HisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), GXutil.trim( localUtil.ttoc( AV49HisProDTF_To, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))) ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "MAQCOD", "", !(GXutil.strcmp("", AV87MaqCod)==0), (short)(0), AV87MaqCod, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCOD", "", !((0==AV104TFBarCod)&&(0==AV105TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV104TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV105TFBarCod_To, 8, 0))) ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCODREO", "", !((0==AV110TFBarCodReo)&&(0==AV111TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV110TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV111TFBarCodReo_To, 1, 0))) ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCODPAR", "", !(GXutil.strcmp("", AV106TFBarCodPar)==0), (short)(0), AV106TFBarCodPar, "", !(GXutil.strcmp("", AV107TFBarCodPar_Sel)==0), AV107TFBarCodPar_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFCLICOD", "", !((0==AV130TFCliCod)&&(0==AV131TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV130TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV131TFCliCod_To, 6, 0))) ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFCLINOM", "", !(GXutil.strcmp("", AV132TFCliNom)==0), (short)(0), AV132TFCliNom, "", !(GXutil.strcmp("", AV133TFCliNom_Sel)==0), AV133TFCliNom_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSER", "", !(GXutil.strcmp("", AV126TFBarSer)==0), (short)(0), AV126TFBarSer, "", !(GXutil.strcmp("", AV127TFBarSer_Sel)==0), AV127TFBarSer_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARSERDSC", "", !(GXutil.strcmp("", AV128TFBarSerDsc)==0), (short)(0), AV128TFBarSerDsc, "", !(GXutil.strcmp("", AV129TFBarSerDsc_Sel)==0), AV129TFBarSerDsc_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFHISPROKGR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV168TFHisProKgr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV169TFHisProKgr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV168TFHisProKgr, 9, 2)), GXutil.trim( GXutil.str( AV169TFHisProKgr_To, 9, 2))) ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFHISPROMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV178TFHisProMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV179TFHisProMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV178TFHisProMtr, 9, 2)), GXutil.trim( GXutil.str( AV179TFHisProMtr_To, 9, 2))) ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFHISPRODTF", "", !GXutil.dateCompare(GXutil.nullDate(), AV154TFHisProDTF), (short)(0), GXutil.trim( localUtil.ttoc( AV154TFHisProDTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV116TFBarColNom)==0), (short)(0), AV116TFBarColNom, "", !(GXutil.strcmp("", AV117TFBarColNom_Sel)==0), AV117TFBarColNom_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFHISPROCOD", "", !(GXutil.strcmp("", AV152TFHisProCod)==0), (short)(0), AV152TFHisProCod, "", !(GXutil.strcmp("", AV153TFHisProCod_Sel)==0), AV153TFHisProCod_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFMAQCOD", "", !(GXutil.strcmp("", AV198TFMaqCod)==0), (short)(0), AV198TFMaqCod, "", !(GXutil.strcmp("", AV199TFMaqCod_Sel)==0), AV199TFMaqCod_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      GXv_SdtWWPGridState30[0] = AV41GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState30, "TFMAQCDSC", "", !(GXutil.strcmp("", AV218TFMaqCDsc)==0), (short)(0), AV218TFMaqCDsc, "", !(GXutil.strcmp("", AV219TFMaqCDsc_Sel)==0), AV219TFMaqCDsc_Sel, "") ;
      AV41GridState = GXv_SdtWWPGridState30[0] ;
      if ( ! (GXutil.strcmp("", AV26EmprCod)==0) )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV42GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV42GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV26EmprCod );
         AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV42GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV88Maqcod1)==0) )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV42GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD1" );
         AV42GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV88Maqcod1 );
         AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV42GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV89Maqcod2)==0) )
      {
         AV42GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV42GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD2" );
         AV42GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV89Maqcod2 );
         AV41GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV42GridStateFilterValue, 0);
      }
      AV41GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV41GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV222Pgmname+"GridState", AV41GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV211TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV211TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV222Pgmname );
      AV211TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV211TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV56HTTPRequest.getScriptName()+"?"+AV56HTTPRequest.getQuerystring() );
      AV211TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LHIPRO" );
      AV102Session.setValue("TrnContext", AV211TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S182( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV207TotHisProKgr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV207TotHisProKgr", GXutil.ltrimstr( AV207TotHisProKgr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROKGR", getSecureSignedToken( "", localUtil.format( AV207TotHisProKgr, "ZZZZZ9.99")));
      AV208TotHisProMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV208TotHisProMtr", GXutil.ltrimstr( AV208TotHisProMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROMTR", getSecureSignedToken( "", localUtil.format( AV208TotHisProMtr, "ZZZZZ9.99")));
   }

   public void S192( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = AV34FilterFullText ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = AV47HisProDTF ;
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = AV49HisProDTF_To ;
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = AV87MaqCod ;
      AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod = AV104TFBarCod ;
      AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to = AV105TFBarCod_To ;
      AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo = AV110TFBarCodReo ;
      AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to = AV111TFBarCodReo_To ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = AV106TFBarCodPar ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = AV107TFBarCodPar_Sel ;
      AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod = AV130TFCliCod ;
      AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to = AV131TFCliCod_To ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = AV132TFCliNom ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = AV133TFCliNom_Sel ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = AV126TFBarSer ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = AV127TFBarSer_Sel ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = AV128TFBarSerDsc ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = AV129TFBarSerDsc_Sel ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = AV168TFHisProKgr ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = AV169TFHisProKgr_To ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = AV178TFHisProMtr ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = AV179TFHisProMtr_To ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = AV154TFHisProDTF ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = AV116TFBarColNom ;
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = AV117TFBarColNom_Sel ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = AV152TFHisProCod ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = AV153TFHisProCod_Sel ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = AV198TFMaqCod ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = AV199TFMaqCod_Sel ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = AV218TFMaqCDsc ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = AV219TFMaqCDsc_Sel ;
      pr_default.dynParam(7, new Object[]{ new Object[]{
                                           AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                           AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                           AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                           AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                           Integer.valueOf(AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) ,
                                           Integer.valueOf(AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) ,
                                           Byte.valueOf(AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) ,
                                           Byte.valueOf(AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) ,
                                           AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                           AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                           Integer.valueOf(AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod) ,
                                           Integer.valueOf(AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) ,
                                           AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                           AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                           AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                           AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                           AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                           AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                           AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                           AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                           AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                           AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                           AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                           AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                           AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                           AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                           AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                           AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                           AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                           AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                           AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A1525HisProKgr ,
                                           A1526HisProMtr ,
                                           A135BarColNom ,
                                           A2504HisProCod ,
                                           A602MaqCod ,
                                           A606MaqDsc ,
                                           A4441HisProDTF ,
                                           AV26EmprCod ,
                                           AV88Maqcod1 ,
                                           A396EmprCod ,
                                           AV89Maqcod2 } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext), "%", "") ;
      lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = GXutil.padr( GXutil.rtrim( AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod), 6, "%") ;
      lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar), 1, "%") ;
      lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = GXutil.padr( GXutil.rtrim( AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom), 30, "%") ;
      lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = GXutil.padr( GXutil.rtrim( AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser), 16, "%") ;
      lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc), 26, "%") ;
      lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom), 13, "%") ;
      lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = GXutil.padr( GXutil.rtrim( AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod), 8, "%") ;
      lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = GXutil.padr( GXutil.rtrim( AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod), 6, "%") ;
      lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = GXutil.concat( GXutil.rtrim( AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc), "%", "") ;
      /* Using cursor H01DU9 */
      pr_default.execute(7, new Object[] {AV26EmprCod, AV88Maqcod1, AV89Maqcod2, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext, AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf, AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to, lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod, Integer.valueOf(AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod), Integer.valueOf(AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to), Byte.valueOf(AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo), Byte.valueOf(AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to), lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar, AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel, Integer.valueOf(AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod), Integer.valueOf(AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to), lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom, AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel, lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser, AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel, lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc, AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel, AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr, AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to, AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr, AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to, AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf, lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom, AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel, lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod, AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel, lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod, AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel, lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc, AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A2504HisProCod = H01DU9_A2504HisProCod[0] ;
         A135BarColNom = H01DU9_A135BarColNom[0] ;
         A1526HisProMtr = H01DU9_A1526HisProMtr[0] ;
         A1525HisProKgr = H01DU9_A1525HisProKgr[0] ;
         A1652BarSerDsc = H01DU9_A1652BarSerDsc[0] ;
         A212BarSer = H01DU9_A212BarSer[0] ;
         A279CliNom = H01DU9_A279CliNom[0] ;
         A252CliCod = H01DU9_A252CliCod[0] ;
         n252CliCod = H01DU9_n252CliCod[0] ;
         A130BarCodPar = H01DU9_A130BarCodPar[0] ;
         A132BarCodReo = H01DU9_A132BarCodReo[0] ;
         A129BarCod = H01DU9_A129BarCod[0] ;
         A4441HisProDTF = H01DU9_A4441HisProDTF[0] ;
         n4441HisProDTF = H01DU9_n4441HisProDTF[0] ;
         A606MaqDsc = H01DU9_A606MaqDsc[0] ;
         n606MaqDsc = H01DU9_n606MaqDsc[0] ;
         A602MaqCod = H01DU9_A602MaqCod[0] ;
         A135BarColNom = H01DU9_A135BarColNom[0] ;
         A1652BarSerDsc = H01DU9_A1652BarSerDsc[0] ;
         A212BarSer = H01DU9_A212BarSer[0] ;
         A252CliCod = H01DU9_A252CliCod[0] ;
         n252CliCod = H01DU9_n252CliCod[0] ;
         A279CliNom = H01DU9_A279CliNom[0] ;
         A606MaqDsc = H01DU9_A606MaqDsc[0] ;
         n606MaqDsc = H01DU9_n606MaqDsc[0] ;
         A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
         AV207TotHisProKgr = A1525HisProKgr.add(AV207TotHisProKgr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV207TotHisProKgr", GXutil.ltrimstr( AV207TotHisProKgr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROKGR", getSecureSignedToken( "", localUtil.format( AV207TotHisProKgr, "ZZZZZ9.99")));
         AV208TotHisProMtr = A1526HisProMtr.add(AV208TotHisProMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV208TotHisProMtr", GXutil.ltrimstr( AV208TotHisProMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTHISPROMTR", getSecureSignedToken( "", localUtil.format( AV208TotHisProMtr, "ZZZZZ9.99")));
         pr_default.readNext(7);
      }
      pr_default.close(7);
      AV209TotValueHisProKgr = localUtil.format( AV207TotHisProKgr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV209TotValueHisProKgr", AV209TotValueHisProKgr);
      AV210TotValueHisProMtr = localUtil.format( AV208TotHisProMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV210TotValueHisProMtr", AV210TotValueHisProMtr);
   }

   public void S202( )
   {
      /* 'BARPIE' Routine */
      returnInSub = false ;
      AV5AlbRfen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRfen", localUtil.format(AV5AlbRfen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFEN", getSecureSignedToken( "", AV5AlbRfen));
      /* Using cursor H01DU10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV7barcod), Byte.valueOf(AV9barcodreo), AV8barcodpar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A44AlbRecCod = H01DU10_A44AlbRecCod[0] ;
         A130BarCodPar = H01DU10_A130BarCodPar[0] ;
         A132BarCodReo = H01DU10_A132BarCodReo[0] ;
         A129BarCod = H01DU10_A129BarCod[0] ;
         A49AlbRFen = H01DU10_A49AlbRFen[0] ;
         A200BarPieCod = H01DU10_A200BarPieCod[0] ;
         A49AlbRFen = H01DU10_A49AlbRFen[0] ;
         AV5AlbRfen = A49AlbRFen ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5AlbRfen", localUtil.format(AV5AlbRfen, "99/99/99"));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFEN", getSecureSignedToken( "", AV5AlbRfen));
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S112( )
   {
      /* 'LOADCOLECCION' Routine */
      returnInSub = false ;
      /* Using cursor H01DU11 */
      pr_default.execute(9, new Object[] {A396EmprCod, AV88Maqcod1, AV89Maqcod2});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A602MaqCod = H01DU11_A602MaqCod[0] ;
         AV90MaqCodFM.add(A602MaqCod, 0);
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   public void wb_table2_78_1DU2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehisprokgr_Internalname, httpContext.getMessage( "Tot Value His Pro Kgr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehisprokgr_Internalname, AV209TotValueHisProKgr, GXutil.rtrim( localUtil.format( AV209TotValueHisProKgr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehisprokgr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehisprokgr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluehispromtr_Internalname, httpContext.getMessage( "Tot Value His Pro Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluehispromtr_Internalname, AV210TotValueHisProMtr, GXutil.rtrim( localUtil.format( AV210TotValueHisProMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluehispromtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluehispromtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
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
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_78_1DU2e( true) ;
      }
      else
      {
         wb_table2_78_1DU2e( false) ;
      }
   }

   public void wb_table1_27_1DU2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV84ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_32_1DU2( true) ;
      }
      else
      {
         wb_table3_32_1DU2( false) ;
      }
      return  ;
   }

   public void wb_table3_32_1DU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1DU2e( true) ;
      }
      else
      {
         wb_table1_27_1DU2e( false) ;
      }
   }

   public void wb_table3_32_1DU2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV34FilterFullText, GXutil.rtrim( localUtil.format( AV34FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHisprodtf_rangetext_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHisprodtf_rangetext_Internalname, httpContext.getMessage( "Fin", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHisprodtf_rangetext_Internalname, AV48HisProDTF_RangeText, GXutil.rtrim( localUtil.format( AV48HisProDTF_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavHisprodtf_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavHisprodtf_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Código Máquina", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, hV87MaqCod, GXutil.rtrim( localUtil.format( hV87MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebVerhdrs.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_32_1DU2e( true) ;
      }
      else
      {
         wb_table3_32_1DU2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV26EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      AV88Maqcod1 = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Maqcod1", AV88Maqcod1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV88Maqcod1, ""))));
      AV89Maqcod2 = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Maqcod2", AV89Maqcod2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV89Maqcod2, ""))));
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
      pa1DU2( ) ;
      ws1DU2( ) ;
      we1DU2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613494", true, true);
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
      httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webverhdrs.js", "?20268211613494", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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

   public void subsflControlProps_552( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_55_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_55_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_55_idx ;
      edtavTipartdsc_Internalname = "vTIPARTDSC_"+sGXsfl_55_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_55_idx ;
      edtHisProKgr_Internalname = "HISPROKGR_"+sGXsfl_55_idx ;
      edtHisProMtr_Internalname = "HISPROMTR_"+sGXsfl_55_idx ;
      edtHisProDTF_Internalname = "HISPRODTF_"+sGXsfl_55_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_55_idx ;
      edtavTurno_Internalname = "vTURNO_"+sGXsfl_55_idx ;
      edtHisProCod_Internalname = "HISPROCOD_"+sGXsfl_55_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_idx ;
      edtHisProFec_Internalname = "HISPROFEC_"+sGXsfl_55_idx ;
      edtHisProLin_Internalname = "HISPROLIN_"+sGXsfl_55_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_55_idx ;
      edtMaqCDsc_Internalname = "MAQCDSC_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_55_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_55_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_55_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_55_fel_idx ;
      edtavTipartdsc_Internalname = "vTIPARTDSC_"+sGXsfl_55_fel_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_55_fel_idx ;
      edtHisProKgr_Internalname = "HISPROKGR_"+sGXsfl_55_fel_idx ;
      edtHisProMtr_Internalname = "HISPROMTR_"+sGXsfl_55_fel_idx ;
      edtHisProDTF_Internalname = "HISPRODTF_"+sGXsfl_55_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_55_fel_idx ;
      edtavTurno_Internalname = "vTURNO_"+sGXsfl_55_fel_idx ;
      edtHisProCod_Internalname = "HISPROCOD_"+sGXsfl_55_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_fel_idx ;
      edtHisProFec_Internalname = "HISPROFEC_"+sGXsfl_55_fel_idx ;
      edtHisProLin_Internalname = "HISPROLIN_"+sGXsfl_55_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_55_fel_idx ;
      edtMaqCDsc_Internalname = "MAQCDSC_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wb1DU0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_55_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_55_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCodReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCodPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSer_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarSerDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTipartdsc_Internalname,GXutil.rtrim( AV202TipArtDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTipartdsc_Visible),Integer.valueOf(edtavTipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavFasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV30FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavFasdsc_Visible),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProKgr_Internalname,GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1525HisProKgr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProKgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProKgr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1526HisProMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHisProMtr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProDTF_Internalname,localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4441HisProDTF, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProDTF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProDTF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtBarColNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavTurno_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTurno_Internalname,GXutil.ltrim( localUtil.ntoc( AV213Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTurno_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV213Turno), "9") : localUtil.format( DecimalUtil.doubleToDec(AV213Turno), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTurno_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavTurno_Visible),Integer.valueOf(edtavTurno_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHisProCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProCod_Internalname,GXutil.rtrim( A2504HisProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtHisProCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProFec_Internalname,localUtil.format(A558HisProFec, "99/99/99"),localUtil.format( A558HisProFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHisProLin_Internalname,GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtHisProLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtMaqCDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCDsc_Internalname,A13734MaqCDsc,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtMaqCDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1DU2( ) ;
         GXCCtl = "GXHCvMAQCOD_" + sGXsfl_55_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV87MaqCod));
         GridContainer.AddRow(GridRow);
         nGXsfl_55_idx = ((subGrid_Islastpage==1)&&(nGXsfl_55_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_55_idx+1) ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
      }
      /* End function sendrow_552 */
   }

   public void startgridcontrol55( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"55\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCodPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtCliNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarSerDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavFasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProKgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HisProKgr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProMtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HisProMtr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProDTF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarColNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavTurno_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHisProCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Máquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtMaqCDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo+Descripcion", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCodPar_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarSerDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV202TipArtDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV30FasDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4441HisProDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProDTF_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarColNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV213Turno, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTurno_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavTurno_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2504HisProCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHisProCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A558HisProFec, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13734MaqCDsc);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtMaqCDsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportreport_Internalname = "BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtnimprimir_Internalname = "BTNIMPRIMIR" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      edtavHisprodtf_rangetext_Internalname = "vHISPRODTF_RANGETEXT" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtavTipartdsc_Internalname = "vTIPARTDSC" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtHisProKgr_Internalname = "HISPROKGR" ;
      edtHisProMtr_Internalname = "HISPROMTR" ;
      edtHisProDTF_Internalname = "HISPRODTF" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtavTurno_Internalname = "vTURNO" ;
      edtHisProCod_Internalname = "HISPROCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtHisProFec_Internalname = "HISPROFEC" ;
      edtHisProLin_Internalname = "HISPROLIN" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqCDsc_Internalname = "MAQCDSC" ;
      edtavTotvaluehisprokgr_Internalname = "vTOTVALUEHISPROKGR" ;
      edtavTotvaluehispromtr_Internalname = "vTOTVALUEHISPROMTR" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Hisprodtf_rangepicker_Internalname = "HISPRODTF_RANGEPICKER" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_hisprodtfauxdate_Internalname = "vDDO_HISPRODTFAUXDATE" ;
      divDdo_hisprodtfauxdates_Internalname = "DDO_HISPRODTFAUXDATES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtMaqCDsc_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProFec_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtHisProCod_Jsonclick = "" ;
      edtavTurno_Jsonclick = "" ;
      edtavTurno_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtHisProDTF_Jsonclick = "" ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProKgr_Jsonclick = "" ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Enabled = 0 ;
      edtavTipartdsc_Jsonclick = "" ;
      edtavTipartdsc_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavHisprodtf_rangetext_Jsonclick = "" ;
      edtavHisprodtf_rangetext_Enabled = 1 ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluehispromtr_Jsonclick = "" ;
      edtavTotvaluehispromtr_Enabled = 1 ;
      edtavTotvaluehisprokgr_Jsonclick = "" ;
      edtavTotvaluehisprokgr_Enabled = 1 ;
      edtMaqCDsc_Visible = -1 ;
      edtMaqCod_Visible = -1 ;
      edtHisProCod_Visible = -1 ;
      edtavTurno_Visible = -1 ;
      edtBarColNom_Visible = -1 ;
      edtHisProDTF_Visible = -1 ;
      edtHisProMtr_Visible = -1 ;
      edtHisProKgr_Visible = -1 ;
      edtavFasdsc_Visible = -1 ;
      edtavTipartdsc_Visible = -1 ;
      edtBarSerDsc_Visible = -1 ;
      edtBarSer_Visible = -1 ;
      edtCliNom_Visible = -1 ;
      edtCliCod_Visible = -1 ;
      edtBarCodPar_Visible = -1 ;
      edtBarCodReo_Visible = -1 ;
      edtBarCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_hisprodtfauxdate_Jsonclick = "" ;
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
      Ddo_grid_Datalistproc = "ExpedicionesAutomatizadas.WebVerhdrsGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic||Dynamic|Dynamic|Dynamic||||||Dynamic||Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||T||T|T|T||||||T||T|T|T" ;
      Ddo_grid_Filterisrange = "T|T||T||||||T|T||||||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Numeric|Character|Character|Character|||Numeric|Numeric|Date|Character||Character|Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|||T|T|T|T||T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|||T|T|T|T||T|T|" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|||8|9|10|11||12|13|" ;
      Ddo_grid_Columnids = "0:BarCod|1:BarCodReo|2:BarCodPar|3:CliCod|4:CliNom|5:BarSer|6:BarSerDsc|7:TipArtDsc|8:FasDsc|9:HisProKgr|10:HisProMtr|11:HisProDTF|12:BarColNom|13:Turno|14:HisProCod|18:MaqCod|19:MaqCDsc" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Table LHIPRO", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void validv_Maqcod( )
   {
      if ( (GXutil.strcmp("", hV87MaqCod)==0) )
      {
         AV87MaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV87MaqCod ;
         /* Using cursor H01DU12 */
         pr_default.execute(10, new Object[] {A13734MaqCDsc, A396EmprCod, AV88Maqcod1, AV89Maqcod2});
         AV87MaqCod = H01DU12_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(10) == 101) ) )
         {
            pr_default.readNext(10);
            if ( ! ( (pr_default.getStatus(10) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
               GX_FocusControl = edtavMaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(10);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV87MaqCod", hV87MaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV87MaqCod", GXutil.rtrim( AV87MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV87MaqCod", hV87MaqCod);
   }

   public void valid_Barcod( )
   {
      n252CliCod = false ;
      n217BarTipArt = false ;
      /* Using cursor H01DU13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"TXPBARCAD"}), 1, "BARCODPAR");
      }
      A136BarColNum = H01DU13_A136BarColNum[0] ;
      A218BarTipCol = H01DU13_A218BarTipCol[0] ;
      A217BarTipArt = H01DU13_A217BarTipArt[0] ;
      n217BarTipArt = H01DU13_n217BarTipArt[0] ;
      A135BarColNom = H01DU13_A135BarColNom[0] ;
      A1652BarSerDsc = H01DU13_A1652BarSerDsc[0] ;
      A212BarSer = H01DU13_A212BarSer[0] ;
      A252CliCod = H01DU13_A252CliCod[0] ;
      n252CliCod = H01DU13_n252CliCod[0] ;
      pr_default.close(11);
      /* Using cursor H01DU14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"CLIENT"}), 1, "CLICOD");
      }
      A279CliNom = H01DU14_A279CliNom[0] ;
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Emprcod( )
   {
      n606MaqDsc = false ;
      /* Using cursor H01DU15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A602MaqCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"MAQUIN"}), 1, "MAQCOD");
      }
      A606MaqDsc = H01DU15_A606MaqDsc[0] ;
      n606MaqDsc = H01DU15_n606MaqDsc[0] ;
      pr_default.close(13);
      A13734MaqCDsc = GXutil.trim( A602MaqCod) + "-" + GXutil.trim( A606MaqDsc) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13734MaqCDsc", A13734MaqCDsc);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV222Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavFasdsc_Visible',ctrl:'vFASDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtavTurno_Visible',ctrl:'vTURNO',prop:'Visible'},{av:'edtHisProCod_Visible',ctrl:'HISPROCOD',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqCDsc_Visible',ctrl:'MAQCDSC',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV84ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV209TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV210TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131DU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV222Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141DU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV222Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161DU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV222Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e231DU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A5609HisProHf',fld:'HISPROHF',pic:'99:99'},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'A461Fase',fld:'FASE',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'A5609HisProHf',fld:'HISPROHF',pic:'99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV30FasDsc',fld:'vFASDSC',pic:''},{av:'AV202TipArtDsc',fld:'vTIPARTDSC',pic:''},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e171DU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV222Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavFasdsc_Visible',ctrl:'vFASDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtavTurno_Visible',ctrl:'vTURNO',prop:'Visible'},{av:'edtHisProCod_Visible',ctrl:'HISPROCOD',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqCDsc_Visible',ctrl:'MAQCDSC',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV84ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV209TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV210TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121DU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV222Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV18DDO_HisProDTFAuxDate',fld:'vDDO_HISPRODTFAUXDATE',pic:''},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavFasdsc_Visible',ctrl:'vFASDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtavTurno_Visible',ctrl:'vTURNO',prop:'Visible'},{av:'edtHisProCod_Visible',ctrl:'HISPROCOD',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqCDsc_Visible',ctrl:'MAQCDSC',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV84ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV209TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV210TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e181DU2',iparms:[{av:'AV90MaqCodFM',fld:'vMAQCODFM',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29ExcelFilename',fld:'vEXCELFILENAME',pic:''},{av:'AV28ErrorMessage',fld:'vERRORMESSAGE',pic:''}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV28ErrorMessage',fld:'vERRORMESSAGE',pic:''},{av:'AV29ExcelFilename',fld:'vEXCELFILENAME',pic:''},{av:'AV90MaqCodFM',fld:'vMAQCODFM',pic:''},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e191DU2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV28ErrorMessage',fld:'vERRORMESSAGE',pic:''},{av:'AV29ExcelFilename',fld:'vEXCELFILENAME',pic:''}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e111DU1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e201DU2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("HISPRODTF_RANGEPICKER.DATERANGECHANGED","{handler:'e151DU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV34FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV104TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV105TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV110TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV111TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV106TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV107TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV130TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV131TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV132TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV133TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV126TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV127TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV128TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV129TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV168TFHisProKgr',fld:'vTFHISPROKGR',pic:'ZZZZZ9.99'},{av:'AV169TFHisProKgr_To',fld:'vTFHISPROKGR_TO',pic:'ZZZZZ9.99'},{av:'AV178TFHisProMtr',fld:'vTFHISPROMTR',pic:'ZZZZZ9.99'},{av:'AV179TFHisProMtr_To',fld:'vTFHISPROMTR_TO',pic:'ZZZZZ9.99'},{av:'AV154TFHisProDTF',fld:'vTFHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV116TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV117TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV152TFHisProCod',fld:'vTFHISPROCOD',pic:''},{av:'AV153TFHisProCod_Sel',fld:'vTFHISPROCOD_SEL',pic:''},{av:'AV198TFMaqCod',fld:'vTFMAQCOD',pic:''},{av:'AV199TFMaqCod_Sel',fld:'vTFMAQCOD_SEL',pic:''},{av:'AV218TFMaqCDsc',fld:'vTFMAQCDSC',pic:''},{av:'AV219TFMaqCDsc_Sel',fld:'vTFMAQCDSC_SEL',pic:''},{av:'AV222Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV98OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV100OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Intdsc',fld:'vINTDSC',pic:'',hsh:true},{av:'AV93Matiz',fld:'vMATIZ',pic:'',hsh:true},{av:'AV92MatCod',fld:'vMATCOD',pic:'ZZ9',hsh:true},{av:'AV204TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV203TipCol',fld:'vTIPCOL',pic:'',hsh:true},{av:'AV206Tonalidad',fld:'vTONALIDAD',pic:'',hsh:true},{av:'AV97Numcli',fld:'vNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV37ForTonal',fld:'vFORTONAL',pic:'',hsh:true},{av:'AV25DscSol',fld:'vDSCSOL',pic:'',hsh:true},{av:'AV12CodSol',fld:'vCODSOL',pic:'ZZ9',hsh:true},{av:'AV83Macprocod',fld:'vMACPROCOD',pic:'',hsh:true},{av:'AV35Fornomcli',fld:'vFORNOMCLI',pic:'',hsh:true},{av:'AV8barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV213Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV5AlbRfen',fld:'vALBRFEN',pic:'',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV7barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV9barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'}]");
      setEventMetadata("HISPRODTF_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV47HisProDTF',fld:'vHISPRODTF',pic:'99/99/99 99:99:99'},{av:'AV49HisProDTF_To',fld:'vHISPRODTF_TO',pic:'99/99/99 99:99:99'},{av:'AV85ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarCod_Visible',ctrl:'BARCOD',prop:'Visible'},{av:'edtBarCodReo_Visible',ctrl:'BARCODREO',prop:'Visible'},{av:'edtBarCodPar_Visible',ctrl:'BARCODPAR',prop:'Visible'},{av:'edtCliCod_Visible',ctrl:'CLICOD',prop:'Visible'},{av:'edtCliNom_Visible',ctrl:'CLINOM',prop:'Visible'},{av:'edtBarSer_Visible',ctrl:'BARSER',prop:'Visible'},{av:'edtBarSerDsc_Visible',ctrl:'BARSERDSC',prop:'Visible'},{av:'edtavTipartdsc_Visible',ctrl:'vTIPARTDSC',prop:'Visible'},{av:'edtavFasdsc_Visible',ctrl:'vFASDSC',prop:'Visible'},{av:'edtHisProKgr_Visible',ctrl:'HISPROKGR',prop:'Visible'},{av:'edtHisProMtr_Visible',ctrl:'HISPROMTR',prop:'Visible'},{av:'edtHisProDTF_Visible',ctrl:'HISPRODTF',prop:'Visible'},{av:'edtBarColNom_Visible',ctrl:'BARCOLNOM',prop:'Visible'},{av:'edtavTurno_Visible',ctrl:'vTURNO',prop:'Visible'},{av:'edtHisProCod_Visible',ctrl:'HISPROCOD',prop:'Visible'},{av:'edtMaqCod_Visible',ctrl:'MAQCOD',prop:'Visible'},{av:'edtMaqCDsc_Visible',ctrl:'MAQCDSC',prop:'Visible'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV84ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV41GridState',fld:'vGRIDSTATE',pic:''},{av:'AV207TotHisProKgr',fld:'vTOTHISPROKGR',pic:'ZZZZZ9.99',hsh:true},{av:'AV208TotHisProMtr',fld:'vTOTHISPROMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV209TotValueHisProKgr',fld:'vTOTVALUEHISPROKGR',pic:''},{av:'AV210TotValueHisProMtr',fld:'vTOTVALUEHISPROMTR',pic:''}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[{av:'hV87MaqCod'},{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV88Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV89Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true}]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[{av:'AV87MaqCod',fld:'vMAQCOD',pic:''},{av:'hV87MaqCod'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A13734MaqCDsc',fld:'MAQCDSC',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A13734MaqCDsc',fld:'MAQCDSC',pic:''}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Maqcdsc',iparms:[]");
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
      pr_default.close(13);
      pr_default.close(11);
      pr_default.close(12);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV26EmprCod = "" ;
      wcpOAV88Maqcod1 = "" ;
      wcpOAV89Maqcod2 = "" ;
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
      A396EmprCod = "" ;
      AV88Maqcod1 = "" ;
      AV89Maqcod2 = "" ;
      A13734MaqCDsc = "" ;
      hV87MaqCod = "" ;
      AV26EmprCod = "" ;
      AV34FilterFullText = "" ;
      AV87MaqCod = "" ;
      AV47HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV13ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV49HisProDTF_To = GXutil.resetTime( GXutil.nullDate() );
      AV106TFBarCodPar = "" ;
      AV107TFBarCodPar_Sel = "" ;
      AV132TFCliNom = "" ;
      AV133TFCliNom_Sel = "" ;
      AV126TFBarSer = "" ;
      AV127TFBarSer_Sel = "" ;
      AV128TFBarSerDsc = "" ;
      AV129TFBarSerDsc_Sel = "" ;
      AV168TFHisProKgr = DecimalUtil.ZERO ;
      AV169TFHisProKgr_To = DecimalUtil.ZERO ;
      AV178TFHisProMtr = DecimalUtil.ZERO ;
      AV179TFHisProMtr_To = DecimalUtil.ZERO ;
      AV154TFHisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV116TFBarColNom = "" ;
      AV117TFBarColNom_Sel = "" ;
      AV152TFHisProCod = "" ;
      AV153TFHisProCod_Sel = "" ;
      AV198TFMaqCod = "" ;
      AV199TFMaqCod_Sel = "" ;
      AV218TFMaqCDsc = "" ;
      AV219TFMaqCDsc_Sel = "" ;
      AV222Pgmname = "" ;
      AV207TotHisProKgr = DecimalUtil.ZERO ;
      AV208TotHisProMtr = DecimalUtil.ZERO ;
      AV57Intdsc = "" ;
      AV93Matiz = "" ;
      AV203TipCol = "" ;
      AV206Tonalidad = "" ;
      AV37ForTonal = "" ;
      AV25DscSol = "" ;
      AV83Macprocod = "" ;
      AV35Fornomcli = "" ;
      AV8barcodpar = "" ;
      AV5AlbRfen = GXutil.nullDate() ;
      A200BarPieCod = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV84ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV24DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      A461Fase = "" ;
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV90MaqCodFM = new GXSimpleCollection<String>(String.class, "internal", "");
      AV29ExcelFilename = "" ;
      AV28ErrorMessage = "" ;
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucHisprodtf_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV18DDO_HisProDTFAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A130BarCodPar = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      AV202TipArtDsc = "" ;
      AV30FasDsc = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A135BarColNom = "" ;
      A2504HisProCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      GXCCtl = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H01DU2_A13734MaqCDsc = new String[] {""} ;
      H01DU3_A13734MaqCDsc = new String[] {""} ;
      H01DU3_A396EmprCod = new String[] {""} ;
      H01DU3_A602MaqCod = new String[] {""} ;
      lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext = "" ;
      AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to = GXutil.resetTime( GXutil.nullDate() );
      AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod = "" ;
      AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel = "" ;
      AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar = "" ;
      AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel = "" ;
      AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom = "" ;
      AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel = "" ;
      AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser = "" ;
      AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel = "" ;
      AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc = "" ;
      AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr = DecimalUtil.ZERO ;
      AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to = DecimalUtil.ZERO ;
      AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr = DecimalUtil.ZERO ;
      AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to = DecimalUtil.ZERO ;
      AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf = GXutil.resetTime( GXutil.nullDate() );
      AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel = "" ;
      AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom = "" ;
      AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel = "" ;
      AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod = "" ;
      AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel = "" ;
      AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod = "" ;
      AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel = "" ;
      AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc = "" ;
      H01DU4_A396EmprCod = new String[] {""} ;
      H01DU4_A136BarColNum = new int[1] ;
      H01DU4_A218BarTipCol = new byte[1] ;
      H01DU4_A5609HisProHf = new java.util.Date[] {GXutil.nullDate()} ;
      H01DU4_A461Fase = new String[] {""} ;
      H01DU4_A217BarTipArt = new short[1] ;
      H01DU4_n217BarTipArt = new boolean[] {false} ;
      H01DU4_A561HisProLin = new int[1] ;
      H01DU4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01DU4_A2504HisProCod = new String[] {""} ;
      H01DU4_A135BarColNom = new String[] {""} ;
      H01DU4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01DU4_n4441HisProDTF = new boolean[] {false} ;
      H01DU4_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DU4_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DU4_A1652BarSerDsc = new String[] {""} ;
      H01DU4_A212BarSer = new String[] {""} ;
      H01DU4_A279CliNom = new String[] {""} ;
      H01DU4_A252CliCod = new int[1] ;
      H01DU4_n252CliCod = new boolean[] {false} ;
      H01DU4_A130BarCodPar = new String[] {""} ;
      H01DU4_A132BarCodReo = new byte[1] ;
      H01DU4_A129BarCod = new int[1] ;
      H01DU4_A606MaqDsc = new String[] {""} ;
      H01DU4_n606MaqDsc = new boolean[] {false} ;
      H01DU4_A602MaqCod = new String[] {""} ;
      H01DU5_AGRID_nRecordCount = new long[1] ;
      AV48HisProDTF_RangeText = "" ;
      H01DU6_A13734MaqCDsc = new String[] {""} ;
      H01DU6_A396EmprCod = new String[] {""} ;
      H01DU6_A602MaqCod = new String[] {""} ;
      AV209TotValueHisProKgr = "" ;
      AV210TotValueHisProMtr = "" ;
      AV61Lit0 = "" ;
      AV82LitFe = "" ;
      AV72Lit2 = "" ;
      AV215UsurCod = "" ;
      AV103Station = "" ;
      AV27EmprNom = "" ;
      AV11Carpeta = "" ;
      AV95Nom_inf = "" ;
      AV56HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV216WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV102Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      GXv_int10 = new short[1] ;
      GXv_int12 = new int[1] ;
      GXv_int15 = new short[1] ;
      GXv_dtime18 = new java.util.Date[1] ;
      GXv_int6 = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV86ManageFiltersXml = "" ;
      AV214UserCustomValue = "" ;
      AV14ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector19 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector20 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22 = new GXBaseCollection[1] ;
      H01DU7_A13734MaqCDsc = new String[] {""} ;
      H01DU7_A396EmprCod = new String[] {""} ;
      H01DU7_A602MaqCod = new String[] {""} ;
      AV42GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      H01DU8_A13734MaqCDsc = new String[] {""} ;
      H01DU8_A396EmprCod = new String[] {""} ;
      H01DU8_A602MaqCod = new String[] {""} ;
      GXt_char29 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char28 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char27 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char26 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char25 = "" ;
      GXv_char11 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState30 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV211TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      H01DU9_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01DU9_A561HisProLin = new int[1] ;
      H01DU9_A396EmprCod = new String[] {""} ;
      H01DU9_A2504HisProCod = new String[] {""} ;
      H01DU9_A135BarColNom = new String[] {""} ;
      H01DU9_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DU9_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DU9_A1652BarSerDsc = new String[] {""} ;
      H01DU9_A212BarSer = new String[] {""} ;
      H01DU9_A279CliNom = new String[] {""} ;
      H01DU9_A252CliCod = new int[1] ;
      H01DU9_n252CliCod = new boolean[] {false} ;
      H01DU9_A130BarCodPar = new String[] {""} ;
      H01DU9_A132BarCodReo = new byte[1] ;
      H01DU9_A129BarCod = new int[1] ;
      H01DU9_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H01DU9_n4441HisProDTF = new boolean[] {false} ;
      H01DU9_A606MaqDsc = new String[] {""} ;
      H01DU9_n606MaqDsc = new boolean[] {false} ;
      H01DU9_A602MaqCod = new String[] {""} ;
      H01DU10_A44AlbRecCod = new int[1] ;
      H01DU10_A396EmprCod = new String[] {""} ;
      H01DU10_A130BarCodPar = new String[] {""} ;
      H01DU10_A132BarCodReo = new byte[1] ;
      H01DU10_A129BarCod = new int[1] ;
      H01DU10_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H01DU10_A200BarPieCod = new String[] {""} ;
      H01DU11_A396EmprCod = new String[] {""} ;
      H01DU11_A602MaqCod = new String[] {""} ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H01DU12_A13734MaqCDsc = new String[] {""} ;
      H01DU12_A396EmprCod = new String[] {""} ;
      H01DU12_A602MaqCod = new String[] {""} ;
      ZV87MaqCod = "" ;
      ZhV87MaqCod = "" ;
      H01DU13_A136BarColNum = new int[1] ;
      H01DU13_A218BarTipCol = new byte[1] ;
      H01DU13_A217BarTipArt = new short[1] ;
      H01DU13_n217BarTipArt = new boolean[] {false} ;
      H01DU13_A135BarColNom = new String[] {""} ;
      H01DU13_A1652BarSerDsc = new String[] {""} ;
      H01DU13_A212BarSer = new String[] {""} ;
      H01DU13_A252CliCod = new int[1] ;
      H01DU13_n252CliCod = new boolean[] {false} ;
      H01DU14_A279CliNom = new String[] {""} ;
      Z135BarColNom = "" ;
      Z1652BarSerDsc = "" ;
      Z212BarSer = "" ;
      Z279CliNom = "" ;
      H01DU15_A606MaqDsc = new String[] {""} ;
      H01DU15_n606MaqDsc = new boolean[] {false} ;
      Z606MaqDsc = "" ;
      Z13734MaqCDsc = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webverhdrs__default(),
         new Object[] {
             new Object[] {
            H01DU2_A13734MaqCDsc
            }
            , new Object[] {
            H01DU3_A13734MaqCDsc, H01DU3_A396EmprCod, H01DU3_A602MaqCod
            }
            , new Object[] {
            H01DU4_A396EmprCod, H01DU4_A136BarColNum, H01DU4_A218BarTipCol, H01DU4_A5609HisProHf, H01DU4_A461Fase, H01DU4_A217BarTipArt, H01DU4_n217BarTipArt, H01DU4_A561HisProLin, H01DU4_A558HisProFec, H01DU4_A2504HisProCod,
            H01DU4_A135BarColNom, H01DU4_A4441HisProDTF, H01DU4_n4441HisProDTF, H01DU4_A1526HisProMtr, H01DU4_A1525HisProKgr, H01DU4_A1652BarSerDsc, H01DU4_A212BarSer, H01DU4_A279CliNom, H01DU4_A252CliCod, H01DU4_n252CliCod,
            H01DU4_A130BarCodPar, H01DU4_A132BarCodReo, H01DU4_A129BarCod, H01DU4_A606MaqDsc, H01DU4_n606MaqDsc, H01DU4_A602MaqCod
            }
            , new Object[] {
            H01DU5_AGRID_nRecordCount
            }
            , new Object[] {
            H01DU6_A13734MaqCDsc, H01DU6_A396EmprCod, H01DU6_A602MaqCod
            }
            , new Object[] {
            H01DU7_A13734MaqCDsc, H01DU7_A396EmprCod, H01DU7_A602MaqCod
            }
            , new Object[] {
            H01DU8_A13734MaqCDsc, H01DU8_A396EmprCod, H01DU8_A602MaqCod
            }
            , new Object[] {
            H01DU9_A558HisProFec, H01DU9_A561HisProLin, H01DU9_A396EmprCod, H01DU9_A2504HisProCod, H01DU9_A135BarColNom, H01DU9_A1526HisProMtr, H01DU9_A1525HisProKgr, H01DU9_A1652BarSerDsc, H01DU9_A212BarSer, H01DU9_A279CliNom,
            H01DU9_A252CliCod, H01DU9_n252CliCod, H01DU9_A130BarCodPar, H01DU9_A132BarCodReo, H01DU9_A129BarCod, H01DU9_A4441HisProDTF, H01DU9_n4441HisProDTF, H01DU9_A606MaqDsc, H01DU9_n606MaqDsc, H01DU9_A602MaqCod
            }
            , new Object[] {
            H01DU10_A44AlbRecCod, H01DU10_A396EmprCod, H01DU10_A130BarCodPar, H01DU10_A132BarCodReo, H01DU10_A129BarCod, H01DU10_A49AlbRFen, H01DU10_A200BarPieCod
            }
            , new Object[] {
            H01DU11_A396EmprCod, H01DU11_A602MaqCod
            }
            , new Object[] {
            H01DU12_A13734MaqCDsc, H01DU12_A396EmprCod, H01DU12_A602MaqCod
            }
            , new Object[] {
            H01DU13_A136BarColNum, H01DU13_A218BarTipCol, H01DU13_A217BarTipArt, H01DU13_n217BarTipArt, H01DU13_A135BarColNom, H01DU13_A1652BarSerDsc, H01DU13_A212BarSer, H01DU13_A252CliCod, H01DU13_n252CliCod
            }
            , new Object[] {
            H01DU14_A279CliNom
            }
            , new Object[] {
            H01DU15_A606MaqDsc, H01DU15_n606MaqDsc
            }
         }
      );
      AV222Pgmname = "ExpedicionesAutomatizadas.WebVerhdrs" ;
      /* GeneXus formulas. */
      AV222Pgmname = "ExpedicionesAutomatizadas.WebVerhdrs" ;
      Gx_err = (short)(0) ;
      edtavTipartdsc_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavTurno_Enabled = 0 ;
      edtavTotvaluehisprokgr_Enabled = 0 ;
      edtavTotvaluehispromtr_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRID_nEOF ;
   private byte GxWebError ;
   private byte AV85ManageFiltersExecutionStep ;
   private byte AV110TFBarCodReo ;
   private byte AV111TFBarCodReo_To ;
   private byte AV204TipColCod ;
   private byte AV213Turno ;
   private byte AV9barcodreo ;
   private byte gxajaxcallmode ;
   private byte A218BarTipCol ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ;
   private byte AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ;
   private byte AV10Cambiarcpp ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte Z218BarTipCol ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV98OrderedBy ;
   private short AV92MatCod ;
   private short AV12CodSol ;
   private short A217BarTipArt ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short GXv_int10[] ;
   private short GXv_int15[] ;
   private short Z217BarTipArt ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_55 ;
   private int nGXsfl_55_idx=1 ;
   private int AV104TFBarCod ;
   private int AV105TFBarCod_To ;
   private int AV130TFCliCod ;
   private int AV131TFCliCod_To ;
   private int AV97Numcli ;
   private int AV7barcod ;
   private int A136BarColNum ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A561HisProLin ;
   private int gxdynajaxindex ;
   private int subGrid_Islastpage ;
   private int edtavTipartdsc_Enabled ;
   private int edtavFasdsc_Enabled ;
   private int edtavTurno_Enabled ;
   private int edtavTotvaluehisprokgr_Enabled ;
   private int edtavTotvaluehispromtr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ;
   private int AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ;
   private int AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod ;
   private int AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ;
   private int edtBarCod_Visible ;
   private int edtBarCodReo_Visible ;
   private int edtBarCodPar_Visible ;
   private int edtCliCod_Visible ;
   private int edtCliNom_Visible ;
   private int edtBarSer_Visible ;
   private int edtBarSerDsc_Visible ;
   private int edtavTipartdsc_Visible ;
   private int edtavFasdsc_Visible ;
   private int edtHisProKgr_Visible ;
   private int edtHisProMtr_Visible ;
   private int edtHisProDTF_Visible ;
   private int edtBarColNom_Visible ;
   private int edtavTurno_Visible ;
   private int edtHisProCod_Visible ;
   private int edtMaqCod_Visible ;
   private int edtMaqCDsc_Visible ;
   private int AV101PageToGo ;
   private int GXv_int12[] ;
   private int AV254GXV1 ;
   private int A44AlbRecCod ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavHisprodtf_rangetext_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV39GridCurrentPage ;
   private long AV40GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV168TFHisProKgr ;
   private java.math.BigDecimal AV169TFHisProKgr_To ;
   private java.math.BigDecimal AV178TFHisProMtr ;
   private java.math.BigDecimal AV179TFHisProMtr_To ;
   private java.math.BigDecimal AV207TotHisProKgr ;
   private java.math.BigDecimal AV208TotHisProMtr ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ;
   private java.math.BigDecimal AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ;
   private java.math.BigDecimal AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ;
   private java.math.BigDecimal AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ;
   private String wcpOAV26EmprCod ;
   private String wcpOAV88Maqcod1 ;
   private String wcpOAV89Maqcod2 ;
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
   private String A396EmprCod ;
   private String AV88Maqcod1 ;
   private String AV89Maqcod2 ;
   private String AV26EmprCod ;
   private String sGXsfl_55_idx="0001" ;
   private String AV87MaqCod ;
   private String AV106TFBarCodPar ;
   private String AV107TFBarCodPar_Sel ;
   private String AV132TFCliNom ;
   private String AV133TFCliNom_Sel ;
   private String AV126TFBarSer ;
   private String AV127TFBarSer_Sel ;
   private String AV128TFBarSerDsc ;
   private String AV129TFBarSerDsc_Sel ;
   private String AV116TFBarColNom ;
   private String AV117TFBarColNom_Sel ;
   private String AV152TFHisProCod ;
   private String AV153TFHisProCod_Sel ;
   private String AV198TFMaqCod ;
   private String AV199TFMaqCod_Sel ;
   private String AV222Pgmname ;
   private String AV57Intdsc ;
   private String AV93Matiz ;
   private String AV203TipCol ;
   private String AV206Tonalidad ;
   private String AV37ForTonal ;
   private String AV25DscSol ;
   private String AV83Macprocod ;
   private String AV35Fornomcli ;
   private String AV8barcodpar ;
   private String A200BarPieCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A461Fase ;
   private String A602MaqCod ;
   private String A606MaqDsc ;
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
   private String sPrefix ;
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
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Hisprodtf_rangepicker_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_hisprodtfauxdates_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Internalname ;
   private String edtavDdo_hisprodtfauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String AV202TipArtDsc ;
   private String edtavTipartdsc_Internalname ;
   private String AV30FasDsc ;
   private String edtavFasdsc_Internalname ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProDTF_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtavTurno_Internalname ;
   private String A2504HisProCod ;
   private String edtHisProCod_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtHisProFec_Internalname ;
   private String edtHisProLin_Internalname ;
   private String edtMaqCod_Internalname ;
   private String edtMaqCDsc_Internalname ;
   private String GXCCtl ;
   private String edtavFilterfulltext_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String edtavTotvaluehisprokgr_Internalname ;
   private String edtavTotvaluehispromtr_Internalname ;
   private String lV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String lV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String lV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String lV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String lV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String lV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String lV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String lV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ;
   private String AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ;
   private String AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ;
   private String AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ;
   private String AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ;
   private String AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ;
   private String AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ;
   private String AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ;
   private String AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ;
   private String AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ;
   private String AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ;
   private String AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ;
   private String AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ;
   private String AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ;
   private String AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ;
   private String edtavHisprodtf_rangetext_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String AV61Lit0 ;
   private String AV82LitFe ;
   private String AV72Lit2 ;
   private String AV215UsurCod ;
   private String AV103Station ;
   private String AV27EmprNom ;
   private String AV11Carpeta ;
   private String AV95Nom_inf ;
   private String GXt_char29 ;
   private String GXv_char17[] ;
   private String GXt_char28 ;
   private String GXv_char16[] ;
   private String GXt_char27 ;
   private String GXv_char14[] ;
   private String GXt_char26 ;
   private String GXv_char13[] ;
   private String GXt_char25 ;
   private String GXv_char11[] ;
   private String GXt_char24 ;
   private String GXv_char4[] ;
   private String GXt_char23 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluehisprokgr_Jsonclick ;
   private String edtavTotvaluehispromtr_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String edtavHisprodtf_rangetext_Jsonclick ;
   private String edtavMaqcod_Jsonclick ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtavTipartdsc_Jsonclick ;
   private String edtavFasdsc_Jsonclick ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProDTF_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtavTurno_Jsonclick ;
   private String edtHisProCod_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqCDsc_Jsonclick ;
   private String subGrid_Header ;
   private String ZV87MaqCod ;
   private String Z135BarColNom ;
   private String Z1652BarSerDsc ;
   private String Z212BarSer ;
   private String Z279CliNom ;
   private String Z606MaqDsc ;
   private java.util.Date AV47HisProDTF ;
   private java.util.Date AV49HisProDTF_To ;
   private java.util.Date AV154TFHisProDTF ;
   private java.util.Date A5609HisProHf ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ;
   private java.util.Date AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ;
   private java.util.Date AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ;
   private java.util.Date GXv_dtime18[] ;
   private java.util.Date AV5AlbRfen ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date AV18DDO_HisProDTFAuxDate ;
   private java.util.Date A558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV100OrderedDsc ;
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
   private boolean n252CliCod ;
   private boolean n4441HisProDTF ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n217BarTipArt ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV15ColumnsSelectorXML ;
   private String AV86ManageFiltersXml ;
   private String AV214UserCustomValue ;
   private String A13734MaqCDsc ;
   private String hV87MaqCod ;
   private String AV34FilterFullText ;
   private String AV218TFMaqCDsc ;
   private String AV219TFMaqCDsc_Sel ;
   private String AV29ExcelFilename ;
   private String AV28ErrorMessage ;
   private String l13734MaqCDsc ;
   private String lV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String lV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ;
   private String AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ;
   private String AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ;
   private String AV48HisProDTF_RangeText ;
   private String AV209TotValueHisProKgr ;
   private String AV210TotValueHisProMtr ;
   private String ZhV87MaqCod ;
   private String Z13734MaqCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV56HTTPRequest ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV102Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucHisprodtf_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01DU2_A13734MaqCDsc ;
   private String[] H01DU3_A13734MaqCDsc ;
   private String[] H01DU3_A396EmprCod ;
   private String[] H01DU3_A602MaqCod ;
   private String[] H01DU4_A396EmprCod ;
   private int[] H01DU4_A136BarColNum ;
   private byte[] H01DU4_A218BarTipCol ;
   private java.util.Date[] H01DU4_A5609HisProHf ;
   private String[] H01DU4_A461Fase ;
   private short[] H01DU4_A217BarTipArt ;
   private boolean[] H01DU4_n217BarTipArt ;
   private int[] H01DU4_A561HisProLin ;
   private java.util.Date[] H01DU4_A558HisProFec ;
   private String[] H01DU4_A2504HisProCod ;
   private String[] H01DU4_A135BarColNom ;
   private java.util.Date[] H01DU4_A4441HisProDTF ;
   private boolean[] H01DU4_n4441HisProDTF ;
   private java.math.BigDecimal[] H01DU4_A1526HisProMtr ;
   private java.math.BigDecimal[] H01DU4_A1525HisProKgr ;
   private String[] H01DU4_A1652BarSerDsc ;
   private String[] H01DU4_A212BarSer ;
   private String[] H01DU4_A279CliNom ;
   private int[] H01DU4_A252CliCod ;
   private boolean[] H01DU4_n252CliCod ;
   private String[] H01DU4_A130BarCodPar ;
   private byte[] H01DU4_A132BarCodReo ;
   private int[] H01DU4_A129BarCod ;
   private String[] H01DU4_A606MaqDsc ;
   private boolean[] H01DU4_n606MaqDsc ;
   private String[] H01DU4_A602MaqCod ;
   private long[] H01DU5_AGRID_nRecordCount ;
   private String[] H01DU6_A13734MaqCDsc ;
   private String[] H01DU6_A396EmprCod ;
   private String[] H01DU6_A602MaqCod ;
   private String[] H01DU7_A13734MaqCDsc ;
   private String[] H01DU7_A396EmprCod ;
   private String[] H01DU7_A602MaqCod ;
   private String[] H01DU8_A13734MaqCDsc ;
   private String[] H01DU8_A396EmprCod ;
   private String[] H01DU8_A602MaqCod ;
   private java.util.Date[] H01DU9_A558HisProFec ;
   private int[] H01DU9_A561HisProLin ;
   private String[] H01DU9_A396EmprCod ;
   private String[] H01DU9_A2504HisProCod ;
   private String[] H01DU9_A135BarColNom ;
   private java.math.BigDecimal[] H01DU9_A1526HisProMtr ;
   private java.math.BigDecimal[] H01DU9_A1525HisProKgr ;
   private String[] H01DU9_A1652BarSerDsc ;
   private String[] H01DU9_A212BarSer ;
   private String[] H01DU9_A279CliNom ;
   private int[] H01DU9_A252CliCod ;
   private boolean[] H01DU9_n252CliCod ;
   private String[] H01DU9_A130BarCodPar ;
   private byte[] H01DU9_A132BarCodReo ;
   private int[] H01DU9_A129BarCod ;
   private java.util.Date[] H01DU9_A4441HisProDTF ;
   private boolean[] H01DU9_n4441HisProDTF ;
   private String[] H01DU9_A606MaqDsc ;
   private boolean[] H01DU9_n606MaqDsc ;
   private String[] H01DU9_A602MaqCod ;
   private int[] H01DU10_A44AlbRecCod ;
   private String[] H01DU10_A396EmprCod ;
   private String[] H01DU10_A130BarCodPar ;
   private byte[] H01DU10_A132BarCodReo ;
   private int[] H01DU10_A129BarCod ;
   private java.util.Date[] H01DU10_A49AlbRFen ;
   private String[] H01DU10_A200BarPieCod ;
   private String[] H01DU11_A396EmprCod ;
   private String[] H01DU11_A602MaqCod ;
   private String[] H01DU12_A13734MaqCDsc ;
   private String[] H01DU12_A396EmprCod ;
   private String[] H01DU12_A602MaqCod ;
   private int[] H01DU13_A136BarColNum ;
   private byte[] H01DU13_A218BarTipCol ;
   private short[] H01DU13_A217BarTipArt ;
   private boolean[] H01DU13_n217BarTipArt ;
   private String[] H01DU13_A135BarColNom ;
   private String[] H01DU13_A1652BarSerDsc ;
   private String[] H01DU13_A212BarSer ;
   private int[] H01DU13_A252CliCod ;
   private boolean[] H01DU13_n252CliCod ;
   private String[] H01DU14_A279CliNom ;
   private String[] H01DU15_A606MaqDsc ;
   private boolean[] H01DU15_n606MaqDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV90MaqCodFM ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV84ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item21 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item22[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV13ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV14ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector19[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector20[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV24DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState30[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV42GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV211TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV216WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class webverhdrs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01DU4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV98OrderedBy ,
                                          boolean AV100OrderedDsc ,
                                          String AV88Maqcod1 ,
                                          String AV89Maqcod2 ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[51];
      Object[] GXv_Object32 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T3.BarColNum, T3.BarTipCol, T1.HisProHf, T1.Fase, T3.BarTipArt, T1.HisProLin, T1.HisProFec, T1.HisProCod, T3.BarColNom, T1.HisProDTF, T1.HisProMtr," ;
      sSelectString += " T1.HisProKgr, T3.BarSerDsc, T3.BarSer, T4.CliNom, T3.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.MaqDsc, T1.MaqCod" ;
      sFromString = " FROM (((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod" ;
      sFromString += " = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T2.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int31[3] = (byte)(1) ;
         GXv_int31[4] = (byte)(1) ;
         GXv_int31[5] = (byte)(1) ;
         GXv_int31[6] = (byte)(1) ;
         GXv_int31[7] = (byte)(1) ;
         GXv_int31[8] = (byte)(1) ;
         GXv_int31[9] = (byte)(1) ;
         GXv_int31[10] = (byte)(1) ;
         GXv_int31[11] = (byte)(1) ;
         GXv_int31[12] = (byte)(1) ;
         GXv_int31[13] = (byte)(1) ;
         GXv_int31[14] = (byte)(1) ;
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (0==AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (0==AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( ! (0==AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (0==AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (0==AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (0==AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int31[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int31[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int31[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int31[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int31[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int31[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int31[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int31[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int31[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int31[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T2.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T2.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int31[45] = (byte)(1) ;
      }
      if ( ( AV98OrderedBy == 1 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV98OrderedBy == 1 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV98OrderedBy == 2 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV98OrderedBy == 2 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV98OrderedBy == 3 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV98OrderedBy == 3 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV98OrderedBy == 4 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliCod" ;
      }
      else if ( ( AV98OrderedBy == 4 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliCod DESC" ;
      }
      else if ( ( AV98OrderedBy == 5 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV98OrderedBy == 5 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV98OrderedBy == 6 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T3.BarSer" ;
      }
      else if ( ( AV98OrderedBy == 6 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.BarSer DESC" ;
      }
      else if ( ( AV98OrderedBy == 7 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T3.BarSerDsc" ;
      }
      else if ( ( AV98OrderedBy == 7 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.BarSerDsc DESC" ;
      }
      else if ( ( AV98OrderedBy == 8 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProKgr" ;
      }
      else if ( ( AV98OrderedBy == 8 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProKgr DESC" ;
      }
      else if ( ( AV98OrderedBy == 9 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProMtr" ;
      }
      else if ( ( AV98OrderedBy == 9 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProMtr DESC" ;
      }
      else if ( ( AV98OrderedBy == 10 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProDTF" ;
      }
      else if ( ( AV98OrderedBy == 10 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProDTF DESC" ;
      }
      else if ( ( AV98OrderedBy == 11 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T3.BarColNom" ;
      }
      else if ( ( AV98OrderedBy == 11 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.BarColNom DESC" ;
      }
      else if ( ( AV98OrderedBy == 12 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.HisProCod" ;
      }
      else if ( ( AV98OrderedBy == 12 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.HisProCod DESC" ;
      }
      else if ( ( AV98OrderedBy == 13 ) && ! AV100OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCod" ;
      }
      else if ( ( AV98OrderedBy == 13 ) && ( AV100OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
   }

   protected Object[] conditional_H01DU5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          short AV98OrderedBy ,
                                          boolean AV100OrderedDsc ,
                                          String AV88Maqcod1 ,
                                          String AV89Maqcod2 ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[46];
      Object[] GXv_Object34 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T3.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T3.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T4.CliNom) like '%' || UPPER(?)) or ( UPPER(T3.BarSer) like '%' || UPPER(?)) or ( UPPER(T3.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T3.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T2.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
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
         GXv_int33[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int33[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int33[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[18] = (byte)(1) ;
      }
      if ( ! (0==AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int33[19] = (byte)(1) ;
      }
      if ( ! (0==AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int33[20] = (byte)(1) ;
      }
      if ( ! (0==AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int33[21] = (byte)(1) ;
      }
      if ( ! (0==AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int33[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int33[24] = (byte)(1) ;
      }
      if ( ! (0==AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T3.CliCod >= ?)");
      }
      else
      {
         GXv_int33[25] = (byte)(1) ;
      }
      if ( ! (0==AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T3.CliCod <= ?)");
      }
      else
      {
         GXv_int33[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int33[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSer = ?)");
      }
      else
      {
         GXv_int33[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarSerDsc = ?)");
      }
      else
      {
         GXv_int33[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int33[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int33[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int33[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int33[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int33[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.BarColNom = ?)");
      }
      else
      {
         GXv_int33[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int33[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int33[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T2.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T2.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int33[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV98OrderedBy == 1 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 1 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 2 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 2 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 3 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 3 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 4 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 4 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 5 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 5 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 6 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 6 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 7 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 7 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 8 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 8 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 9 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 9 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 10 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 10 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 11 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 11 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 12 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 12 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 13 ) && ! AV100OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV98OrderedBy == 13 ) && ( AV100OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H01DU9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext ,
                                          java.util.Date AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf ,
                                          java.util.Date AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to ,
                                          String AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod ,
                                          int AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod ,
                                          int AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to ,
                                          byte AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo ,
                                          byte AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to ,
                                          String AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel ,
                                          String AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar ,
                                          int AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod ,
                                          int AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to ,
                                          String AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel ,
                                          String AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom ,
                                          String AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel ,
                                          String AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser ,
                                          String AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel ,
                                          String AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc ,
                                          java.math.BigDecimal AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr ,
                                          java.math.BigDecimal AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to ,
                                          java.math.BigDecimal AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr ,
                                          java.math.BigDecimal AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to ,
                                          java.util.Date AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf ,
                                          String AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel ,
                                          String AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom ,
                                          String AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel ,
                                          String AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod ,
                                          String AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel ,
                                          String AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod ,
                                          String AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel ,
                                          String AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          java.math.BigDecimal A1525HisProKgr ,
                                          java.math.BigDecimal A1526HisProMtr ,
                                          String A135BarColNom ,
                                          String A2504HisProCod ,
                                          String A602MaqCod ,
                                          String A606MaqDsc ,
                                          java.util.Date A4441HisProDTF ,
                                          String AV26EmprCod ,
                                          String AV88Maqcod1 ,
                                          String A396EmprCod ,
                                          String AV89Maqcod2 )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[46];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT T1.HisProFec, T1.HisProLin, T1.EmprCod, T1.HisProCod, T2.BarColNom, T1.HisProMtr, T1.HisProKgr, T2.BarSerDsc, T2.BarSer, T3.CliNom, T2.CliCod, T1.BarCodPar," ;
      scmdbuf += " T1.BarCodReo, T1.BarCod, T1.HisProDTF, T4.MaqDsc, T1.MaqCod FROM (((TXPLHIPRO T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND" ;
      scmdbuf += " T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) INNER JOIN TXPMAQUIN T4" ;
      scmdbuf += " ON T4.EmprCod = T1.EmprCod AND T4.MaqCod = T1.MaqCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.MaqCod >= ?)");
      addWhere(sWhereString, "(T1.MaqCod <= ?)");
      if ( ! (GXutil.strcmp("", AV223Expedicionesautomatizadas_webverhdrsds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2) like '%' || ?) or ( UPPER(T1.BarCodPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T2.CliCod,'999990'), 2) like '%' || ?) or ( UPPER(T3.CliNom) like '%' || UPPER(?)) or ( UPPER(T2.BarSer) like '%' || UPPER(?)) or ( UPPER(T2.BarSerDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.HisProKgr,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.HisProMtr,'999990.99'), 2) like '%' || ?) or ( UPPER(T2.BarColNom) like '%' || UPPER(?)) or ( UPPER(T1.HisProCod) like '%' || UPPER(?)) or ( UPPER(T1.MaqCod) like '%' || UPPER(?)) or ( UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?)))");
      }
      else
      {
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
         GXv_int35[15] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV224Expedicionesautomatizadas_webverhdrsds_2_hisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int35[16] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV225Expedicionesautomatizadas_webverhdrsds_3_hisprodtf_to) )
      {
         addWhere(sWhereString, "(T1.HisProDTF <= ?)");
      }
      else
      {
         GXv_int35[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV226Expedicionesautomatizadas_webverhdrsds_4_maqcod)==0) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[18] = (byte)(1) ;
      }
      if ( ! (0==AV227Expedicionesautomatizadas_webverhdrsds_5_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int35[19] = (byte)(1) ;
      }
      if ( ! (0==AV228Expedicionesautomatizadas_webverhdrsds_6_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int35[20] = (byte)(1) ;
      }
      if ( ! (0==AV229Expedicionesautomatizadas_webverhdrsds_7_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int35[21] = (byte)(1) ;
      }
      if ( ! (0==AV230Expedicionesautomatizadas_webverhdrsds_8_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int35[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV231Expedicionesautomatizadas_webverhdrsds_9_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV232Expedicionesautomatizadas_webverhdrsds_10_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int35[24] = (byte)(1) ;
      }
      if ( ! (0==AV233Expedicionesautomatizadas_webverhdrsds_11_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int35[25] = (byte)(1) ;
      }
      if ( ! (0==AV234Expedicionesautomatizadas_webverhdrsds_12_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int35[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV235Expedicionesautomatizadas_webverhdrsds_13_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV236Expedicionesautomatizadas_webverhdrsds_14_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int35[28] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV237Expedicionesautomatizadas_webverhdrsds_15_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[29] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV238Expedicionesautomatizadas_webverhdrsds_16_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int35[30] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV239Expedicionesautomatizadas_webverhdrsds_17_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV240Expedicionesautomatizadas_webverhdrsds_18_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSerDsc = ?)");
      }
      else
      {
         GXv_int35[32] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV241Expedicionesautomatizadas_webverhdrsds_19_tfhisprokgr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr >= ?)");
      }
      else
      {
         GXv_int35[33] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV242Expedicionesautomatizadas_webverhdrsds_20_tfhisprokgr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProKgr <= ?)");
      }
      else
      {
         GXv_int35[34] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV243Expedicionesautomatizadas_webverhdrsds_21_tfhispromtr)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr >= ?)");
      }
      else
      {
         GXv_int35[35] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV244Expedicionesautomatizadas_webverhdrsds_22_tfhispromtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.HisProMtr <= ?)");
      }
      else
      {
         GXv_int35[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV245Expedicionesautomatizadas_webverhdrsds_23_tfhisprodtf) )
      {
         addWhere(sWhereString, "(T1.HisProDTF >= ?)");
      }
      else
      {
         GXv_int35[37] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV246Expedicionesautomatizadas_webverhdrsds_24_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[38] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV247Expedicionesautomatizadas_webverhdrsds_25_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int35[39] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) && ( ! (GXutil.strcmp("", AV248Expedicionesautomatizadas_webverhdrsds_26_tfhisprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.HisProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[40] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV249Expedicionesautomatizadas_webverhdrsds_27_tfhisprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.HisProCod = ?)");
      }
      else
      {
         GXv_int35[41] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV250Expedicionesautomatizadas_webverhdrsds_28_tfmaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV251Expedicionesautomatizadas_webverhdrsds_29_tfmaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCod = ?)");
      }
      else
      {
         GXv_int35[43] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) && ( ! (GXutil.strcmp("", AV252Expedicionesautomatizadas_webverhdrsds_30_tfmaqcdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc))) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[44] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV253Expedicionesautomatizadas_webverhdrsds_31_tfmaqcdsc_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(T1.MaqCod)) || '-' || RTRIM(LTRIM(T4.MaqDsc)) = ?)");
      }
      else
      {
         GXv_int35[45] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
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
            case 2 :
                  return conditional_H01DU4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 3 :
                  return conditional_H01DU5(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , (String)dynConstraints[48] , (String)dynConstraints[49] );
            case 7 :
                  return conditional_H01DU9(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).byteValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , (java.math.BigDecimal)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , (java.util.Date)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] , (String)dynConstraints[48] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01DU2", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) AND (MaqCod >= ?) AND (MaqCod <= ?)) WHERE rownum <= 5 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU3", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU6", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU7", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (MaqCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU8", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) AND (MaqCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU10", "SELECT T1.AlbRecCod, T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.AlbRFen, T1.BarPieCod FROM (TXPBARPIE T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU11", "SELECT EmprCod, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ? and MaqCod >= ?) AND (MaqCod <= ?) ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU12", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE (RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ?) AND (EmprCod = ?) AND (MaqCod >= ?) AND (MaqCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU13", "SELECT BarColNum, BarTipCol, BarTipArt, BarColNom, BarSerDsc, BarSer, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DU15", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[15])[0] = rslt.getString(14, 26);
               ((String[]) buf[16])[0] = rslt.getString(15, 16);
               ((String[]) buf[17])[0] = rslt.getString(16, 30);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               ((int[]) buf[22])[0] = rslt.getInt(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(22, 6);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 7 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(17, 6);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 13);
               ((String[]) buf[5])[0] = rslt.getString(5, 26);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[62], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[63], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[64], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[65], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[66], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[67], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[68], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[72]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[76]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[77]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[84], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[85], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[86], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[87], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[88], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[90], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[93], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[94], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[95], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[96], 40);
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[97]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[98]).intValue());
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[101]).intValue());
               }
               return;
            case 3 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 7 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[49], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[50], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[51], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[52], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[53], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[54], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[55], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[56], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[57], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[58], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[59], 100);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[60], 100);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[61], 100);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[62], false);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[63], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 6);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[67]).byteValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 1);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 30);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 30);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 16);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 16);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 26);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 26);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[79], 2);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[80], 2);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[81], 2);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[82], 2);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[83], false);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 13);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 13);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 8);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 8);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 6);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[89], 6);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[90], 40);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[91], 40);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

