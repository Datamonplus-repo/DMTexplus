package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpincidencias_impl extends GXDataArea
{
   public wpincidencias_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpincidencias_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpincidencias_impl.class ));
   }

   public wpincidencias_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavDynamicfiltersselector1 = new HTMLChoice();
      cmbavDynamicfiltersoperator1 = new HTMLChoice();
      cmbavDynamicfiltersselector2 = new HTMLChoice();
      cmbavDynamicfiltersoperator2 = new HTMLChoice();
      cmbavDynamicfiltersselector3 = new HTMLChoice();
      cmbavDynamicfiltersoperator3 = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_124 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_124"))) ;
      nGXsfl_124_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_124_idx"))) ;
      sGXsfl_124_idx = httpContext.GetPar( "sGXsfl_124_idx") ;
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
      AV115FilterFullText = httpContext.GetPar( "FilterFullText") ;
      cmbavDynamicfiltersselector1.fromJSonString( httpContext.GetNextPar( ));
      AV16DynamicFiltersSelector1 = httpContext.GetPar( "DynamicFiltersSelector1") ;
      cmbavDynamicfiltersoperator1.fromJSonString( httpContext.GetNextPar( ));
      AV17DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator1"))) ;
      AV20Inc_Prog1 = httpContext.GetPar( "Inc_Prog1") ;
      AV98Inc_Hdr1 = httpContext.GetPar( "Inc_Hdr1") ;
      cmbavDynamicfiltersselector2.fromJSonString( httpContext.GetNextPar( ));
      AV22DynamicFiltersSelector2 = httpContext.GetPar( "DynamicFiltersSelector2") ;
      cmbavDynamicfiltersoperator2.fromJSonString( httpContext.GetNextPar( ));
      AV23DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator2"))) ;
      AV26Inc_Prog2 = httpContext.GetPar( "Inc_Prog2") ;
      AV99Inc_Hdr2 = httpContext.GetPar( "Inc_Hdr2") ;
      cmbavDynamicfiltersselector3.fromJSonString( httpContext.GetNextPar( ));
      AV28DynamicFiltersSelector3 = httpContext.GetPar( "DynamicFiltersSelector3") ;
      cmbavDynamicfiltersoperator3.fromJSonString( httpContext.GetNextPar( ));
      AV29DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator3"))) ;
      AV32Inc_Prog3 = httpContext.GetPar( "Inc_Prog3") ;
      AV100Inc_Hdr3 = httpContext.GetPar( "Inc_Hdr3") ;
      AV18Inc_Dia1 = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia1")) ;
      AV24Inc_Dia2 = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia2")) ;
      AV30Inc_Dia3 = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia3")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV44ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV21DynamicFiltersEnabled2 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled2")) ;
      AV27DynamicFiltersEnabled3 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled3")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV39ColumnsSelector);
      AV19Inc_Dia_To1 = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia_To1")) ;
      AV25Inc_Dia_To2 = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia_To2")) ;
      AV31Inc_Dia_To3 = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia_To3")) ;
      AV46TFInc_Dia = localUtil.parseDateParm( httpContext.GetPar( "TFInc_Dia")) ;
      AV51TFInc_Linea = GXutil.lval( httpContext.GetPar( "TFInc_Linea")) ;
      AV52TFInc_Linea_To = GXutil.lval( httpContext.GetPar( "TFInc_Linea_To")) ;
      AV54TFInc_Hora = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFInc_Hora"))) ;
      AV59TFInc_Prog = httpContext.GetPar( "TFInc_Prog") ;
      AV60TFInc_Prog_Sel = httpContext.GetPar( "TFInc_Prog_Sel") ;
      AV62TFInc_Terminal = httpContext.GetPar( "TFInc_Terminal") ;
      AV63TFInc_Terminal_Sel = httpContext.GetPar( "TFInc_Terminal_Sel") ;
      AV65TFInc_Usuario = httpContext.GetPar( "TFInc_Usuario") ;
      AV66TFInc_Usuario_Sel = httpContext.GetPar( "TFInc_Usuario_Sel") ;
      AV102TFInc_Hdr = httpContext.GetPar( "TFInc_Hdr") ;
      AV103TFInc_Hdr_Sel = httpContext.GetPar( "TFInc_Hdr_Sel") ;
      AV156Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10GridState);
      AV34DynamicFiltersIgnoreFirst = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersIgnoreFirst")) ;
      AV33DynamicFiltersRemoving = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersRemoving")) ;
      A4936Inc_Obs = httpContext.GetPar( "Inc_Obs") ;
      AV157Pgmdesc = httpContext.GetPar( "Pgmdesc") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
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
      paF62( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startF62( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpincidencias", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV156Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMDESC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Pgmdesc, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV115FilterFullText);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR1", AV16DynamicFiltersSelector1);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR1", GXutil.ltrim( localUtil.ntoc( AV17DynamicFiltersOperator1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_PROG1", GXutil.rtrim( AV20Inc_Prog1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_HDR1", GXutil.rtrim( AV98Inc_Hdr1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR2", AV22DynamicFiltersSelector2);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR2", GXutil.ltrim( localUtil.ntoc( AV23DynamicFiltersOperator2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_PROG2", GXutil.rtrim( AV26Inc_Prog2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_HDR2", GXutil.rtrim( AV99Inc_Hdr2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR3", AV28DynamicFiltersSelector3);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR3", GXutil.ltrim( localUtil.ntoc( AV29DynamicFiltersOperator3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_PROG3", GXutil.rtrim( AV32Inc_Prog3));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_HDR3", GXutil.rtrim( AV100Inc_Hdr3));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_DIA1", localUtil.format(AV18Inc_Dia1, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_DIA2", localUtil.format(AV24Inc_Dia2, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_DIA3", localUtil.format(AV30Inc_Dia3, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_124", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_124, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV42ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV82GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV83GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA1", localUtil.dtoc( AV18Inc_Dia1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA_TO1", localUtil.dtoc( AV19Inc_Dia_To1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA2", localUtil.dtoc( AV24Inc_Dia2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA_TO2", localUtil.dtoc( AV25Inc_Dia_To2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA3", localUtil.dtoc( AV30Inc_Dia3, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA_TO3", localUtil.dtoc( AV31Inc_Dia_To3, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV80DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV80DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV39ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV44ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED2", AV21DynamicFiltersEnabled2);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED3", AV27DynamicFiltersEnabled3);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_DIA", localUtil.dtoc( AV46TFInc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_LINEA", GXutil.ltrim( localUtil.ntoc( AV51TFInc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_LINEA_TO", GXutil.ltrim( localUtil.ntoc( AV52TFInc_Linea_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_HORA", localUtil.ttoc( AV54TFInc_Hora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_PROG", GXutil.rtrim( AV59TFInc_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_PROG_SEL", GXutil.rtrim( AV60TFInc_Prog_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_TERMINAL", GXutil.rtrim( AV62TFInc_Terminal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_TERMINAL_SEL", GXutil.rtrim( AV63TFInc_Terminal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_USUARIO", GXutil.rtrim( AV65TFInc_Usuario));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_USUARIO_SEL", GXutil.rtrim( AV66TFInc_Usuario_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_HDR", GXutil.rtrim( AV102TFInc_Hdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_HDR_SEL", GXutil.rtrim( AV103TFInc_Hdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV156Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV156Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSIGNOREFIRST", AV34DynamicFiltersIgnoreFirst);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSREMOVING", AV33DynamicFiltersRemoving);
      app.GxWebStd.gx_hidden_field( httpContext, "INC_OBS", A4936Inc_Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV157Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMDESC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Pgmdesc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRORMESSAGE", AV36ErrorMessage);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
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
         weF62( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtF62( ) ;
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
      return formatLink("app.wpincidencias", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WPIncidencias" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Control de Incidencias", "") ;
   }

   public void wbF60( )
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
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 124, 3, 0)+","+"null"+");", httpContext.getMessage( "Exportar", ""), bttBtnexportar_Jsonclick, 5, httpContext.getMessage( "Exportar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_F62( true) ;
      }
      else
      {
         wb_table1_21_F62( false) ;
      }
      return  ;
   }

   public void wb_table1_21_F62e( boolean wbgen )
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
         startgridcontrol124( ) ;
      }
      if ( wbEnd == 124 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_124 = (int)(nGXsfl_124_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV82GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV83GridPageCount);
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
         ucInc_dia_rangepicker1.setProperty("Start Date", AV18Inc_Dia1);
         ucInc_dia_rangepicker1.setProperty("End Date", AV19Inc_Dia_To1);
         ucInc_dia_rangepicker1.render(context, "wwp.daterangepicker", Inc_dia_rangepicker1_Internalname, "INC_DIA_RANGEPICKER1Container");
         /* User Defined Control */
         ucInc_dia_rangepicker2.setProperty("Start Date", AV24Inc_Dia2);
         ucInc_dia_rangepicker2.setProperty("End Date", AV25Inc_Dia_To2);
         ucInc_dia_rangepicker2.render(context, "wwp.daterangepicker", Inc_dia_rangepicker2_Internalname, "INC_DIA_RANGEPICKER2Container");
         /* User Defined Control */
         ucInc_dia_rangepicker3.setProperty("Start Date", AV30Inc_Dia3);
         ucInc_dia_rangepicker3.setProperty("End Date", AV31Inc_Dia_To3);
         ucInc_dia_rangepicker3.render(context, "wwp.daterangepicker", Inc_dia_rangepicker3_Internalname, "INC_DIA_RANGEPICKER3Container");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblJsdynamicfilters_Internalname, lblJsdynamicfilters_Caption, "", "", lblJsdynamicfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "", 0, "", 1, 1, 0, (short)(1), "HLP_WPIncidencias.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV80DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV80DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV39ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_inc_diaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_inc_diaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_inc_diaauxdate_Internalname, localUtil.format(AV48DDO_Inc_DiaAuxDate, "99/99/99"), localUtil.format( AV48DDO_Inc_DiaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_inc_diaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_inc_diaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPIncidencias.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_inc_horaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_inc_horaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_inc_horaauxdate_Internalname, localUtil.format(AV56DDO_Inc_HoraAuxDate, "99/99/99"), localUtil.format( AV56DDO_Inc_HoraAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_inc_horaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_inc_horaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPIncidencias.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 124 )
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

   public void startF62( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Control de Incidencias", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupF60( ) ;
   }

   public void wsF62( )
   {
      startF62( ) ;
      evtF62( ) ;
   }

   public void evtF62( )
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
                           e11F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "INC_DIA_RANGEPICKER1.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "INC_DIA_RANGEPICKER2.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "INC_DIA_RANGEPICKER3.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e17F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e18F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters1' */
                           e19F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters2' */
                           e20F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS3'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters3' */
                           e21F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportar' */
                           e22F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters1' */
                           e23F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR1.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e24F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters2' */
                           e25F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR2.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e26F62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR3.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e27F62 ();
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
                           nGXsfl_124_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1242( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV116GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A4929Inc_Dia = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInc_Dia_Internalname), 0)) ;
                           A4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtInc_Hora_Internalname), 0)) ;
                           A4935Inc_Prog = httpContext.cgiGet( edtInc_Prog_Internalname) ;
                           A4934Inc_Termin = httpContext.cgiGet( edtInc_Termin_Internalname) ;
                           A4933Inc_Usuari = GXutil.upper( httpContext.cgiGet( edtInc_Usuari_Internalname)) ;
                           A5299Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5300Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5301Inc_BarPar = httpContext.cgiGet( edtInc_BarPar_Internalname) ;
                           AV97Obs = httpContext.cgiGet( edtavObs_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavObs_Internalname, AV97Obs);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV97Obs, ""))));
                           A13713Inc_Hdr = httpContext.cgiGet( edtInc_Hdr_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e28F62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e29F62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e30F62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV115FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV16DynamicFiltersSelector1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator1 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV17DynamicFiltersOperator1 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_prog1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_PROG1"), AV20Inc_Prog1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_hdr1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_HDR1"), AV98Inc_Hdr1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV22DynamicFiltersSelector2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23DynamicFiltersOperator2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_prog2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_PROG2"), AV26Inc_Prog2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_hdr2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_HDR2"), AV99Inc_Hdr2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV28DynamicFiltersSelector3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator3 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV29DynamicFiltersOperator3 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_prog3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_PROG3"), AV32Inc_Prog3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_hdr3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_HDR3"), AV100Inc_Hdr3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_dia1 Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vINC_DIA1"), 0), AV18Inc_Dia1) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_dia2 Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vINC_DIA2"), 0), AV24Inc_Dia2) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_dia3 Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vINC_DIA3"), 0), AV30Inc_Dia3) ) )
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

   public void weF62( )
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

   public void paF62( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1242( ) ;
      while ( nGXsfl_124_idx <= nRC_GXsfl_124 )
      {
         sendrow_1242( ) ;
         nGXsfl_124_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV115FilterFullText ,
                                 String AV16DynamicFiltersSelector1 ,
                                 short AV17DynamicFiltersOperator1 ,
                                 String AV20Inc_Prog1 ,
                                 String AV98Inc_Hdr1 ,
                                 String AV22DynamicFiltersSelector2 ,
                                 short AV23DynamicFiltersOperator2 ,
                                 String AV26Inc_Prog2 ,
                                 String AV99Inc_Hdr2 ,
                                 String AV28DynamicFiltersSelector3 ,
                                 short AV29DynamicFiltersOperator3 ,
                                 String AV32Inc_Prog3 ,
                                 String AV100Inc_Hdr3 ,
                                 java.util.Date AV18Inc_Dia1 ,
                                 java.util.Date AV24Inc_Dia2 ,
                                 java.util.Date AV30Inc_Dia3 ,
                                 String A396EmprCod ,
                                 byte AV44ManageFiltersExecutionStep ,
                                 boolean AV21DynamicFiltersEnabled2 ,
                                 boolean AV27DynamicFiltersEnabled3 ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ,
                                 java.util.Date AV19Inc_Dia_To1 ,
                                 java.util.Date AV25Inc_Dia_To2 ,
                                 java.util.Date AV31Inc_Dia_To3 ,
                                 java.util.Date AV46TFInc_Dia ,
                                 long AV51TFInc_Linea ,
                                 long AV52TFInc_Linea_To ,
                                 java.util.Date AV54TFInc_Hora ,
                                 String AV59TFInc_Prog ,
                                 String AV60TFInc_Prog_Sel ,
                                 String AV62TFInc_Terminal ,
                                 String AV63TFInc_Terminal_Sel ,
                                 String AV65TFInc_Usuario ,
                                 String AV66TFInc_Usuario_Sel ,
                                 String AV102TFInc_Hdr ,
                                 String AV103TFInc_Hdr_Sel ,
                                 String AV156Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 app.wwpbaseobjects.SdtWWPGridState AV10GridState ,
                                 boolean AV34DynamicFiltersIgnoreFirst ,
                                 boolean AV33DynamicFiltersRemoving ,
                                 String A4936Inc_Obs ,
                                 String AV157Pgmdesc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e29F62 ();
      GRID_nCurrentRecord = 0 ;
      rfF62( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_DIA", getSecureSignedToken( "", A4929Inc_Dia));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_DIA", localUtil.format(A4929Inc_Dia, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_LINEA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_LINEA", GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_HORA", getSecureSignedToken( "", localUtil.format( A4932Inc_Hora, "99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_HORA", localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_TERMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4934Inc_Termin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_TERMIN", GXutil.rtrim( A4934Inc_Termin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_USUARI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_USUARI", GXutil.rtrim( A4933Inc_Usuari));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_PROG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4935Inc_Prog, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_PROG", GXutil.rtrim( A4935Inc_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_HDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A13713Inc_Hdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_HDR", GXutil.rtrim( A13713Inc_Hdr));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV97Obs, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vOBS", AV97Obs);
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
      if ( cmbavDynamicfiltersselector1.getItemCount() > 0 )
      {
         AV16DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV16DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV22DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV22DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersSelector2", AV22DynamicFiltersSelector2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV22DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV23DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DynamicFiltersOperator2), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV28DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV28DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersSelector3", AV28DynamicFiltersSelector3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV28DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV29DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DynamicFiltersOperator3), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfF62( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV157Pgmdesc = httpContext.getMessage( " Control de Incidencias", "") ;
      AV156Pgmname = "WPIncidencias" ;
      Gx_err = (short)(0) ;
      edtavObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObs_Enabled), 5, 0), !bGXsfl_124_Refreshing);
   }

   public void rfF62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(124) ;
      /* Execute user event: Refresh */
      e29F62 ();
      nGXsfl_124_idx = 1 ;
      sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1242( ) ;
      bGXsfl_124_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_1242( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV123Wpincidenciasds_1_filterfulltext ,
                                              AV124Wpincidenciasds_2_dynamicfiltersselector1 ,
                                              AV126Wpincidenciasds_4_inc_dia1 ,
                                              AV127Wpincidenciasds_5_inc_dia_to1 ,
                                              Short.valueOf(AV125Wpincidenciasds_3_dynamicfiltersoperator1) ,
                                              AV128Wpincidenciasds_6_inc_prog1 ,
                                              AV129Wpincidenciasds_7_inc_hdr1 ,
                                              Boolean.valueOf(AV130Wpincidenciasds_8_dynamicfiltersenabled2) ,
                                              AV131Wpincidenciasds_9_dynamicfiltersselector2 ,
                                              AV133Wpincidenciasds_11_inc_dia2 ,
                                              AV134Wpincidenciasds_12_inc_dia_to2 ,
                                              Short.valueOf(AV132Wpincidenciasds_10_dynamicfiltersoperator2) ,
                                              AV135Wpincidenciasds_13_inc_prog2 ,
                                              AV136Wpincidenciasds_14_inc_hdr2 ,
                                              Boolean.valueOf(AV137Wpincidenciasds_15_dynamicfiltersenabled3) ,
                                              AV138Wpincidenciasds_16_dynamicfiltersselector3 ,
                                              AV140Wpincidenciasds_18_inc_dia3 ,
                                              AV141Wpincidenciasds_19_inc_dia_to3 ,
                                              Short.valueOf(AV139Wpincidenciasds_17_dynamicfiltersoperator3) ,
                                              AV142Wpincidenciasds_20_inc_prog3 ,
                                              AV143Wpincidenciasds_21_inc_hdr3 ,
                                              AV144Wpincidenciasds_22_tfinc_dia ,
                                              Long.valueOf(AV145Wpincidenciasds_23_tfinc_linea) ,
                                              Long.valueOf(AV146Wpincidenciasds_24_tfinc_linea_to) ,
                                              AV147Wpincidenciasds_25_tfinc_hora ,
                                              AV149Wpincidenciasds_27_tfinc_prog_sel ,
                                              AV148Wpincidenciasds_26_tfinc_prog ,
                                              AV151Wpincidenciasds_29_tfinc_terminal_sel ,
                                              AV150Wpincidenciasds_28_tfinc_terminal ,
                                              AV153Wpincidenciasds_31_tfinc_usuario_sel ,
                                              AV152Wpincidenciasds_30_tfinc_usuario ,
                                              AV155Wpincidenciasds_33_tfinc_hdr_sel ,
                                              AV154Wpincidenciasds_32_tfinc_hdr ,
                                              Long.valueOf(A4931Inc_Linea) ,
                                              A4935Inc_Prog ,
                                              A4934Inc_Termin ,
                                              A4933Inc_Usuari ,
                                              Integer.valueOf(A5299Inc_Barcod) ,
                                              Byte.valueOf(A5300Inc_BarReo) ,
                                              A5301Inc_BarPar ,
                                              A4929Inc_Dia ,
                                              A4932Inc_Hora ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         /* Using cursor H00F62 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV126Wpincidenciasds_4_inc_dia1, AV127Wpincidenciasds_5_inc_dia_to1, AV133Wpincidenciasds_11_inc_dia2, AV134Wpincidenciasds_12_inc_dia_to2, AV140Wpincidenciasds_18_inc_dia3, AV141Wpincidenciasds_19_inc_dia_to3, AV144Wpincidenciasds_22_tfinc_dia, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_124_idx = 1 ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4929Inc_Dia = H00F62_A4929Inc_Dia[0] ;
            e30F62 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(124) ;
         wbF60( ) ;
      }
      bGXsfl_124_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesF62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV156Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV156Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_DIA"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, A4929Inc_Dia));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV157Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMDESC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV157Pgmdesc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_LINEA"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_HORA"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, localUtil.format( A4932Inc_Hora, "99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_TERMIN"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A4934Inc_Termin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_USUARI"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_PROG"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A4935Inc_Prog, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_HDR"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( A13713Inc_Hdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV97Obs, ""))));
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
      AV123Wpincidenciasds_1_filterfulltext = AV115FilterFullText ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV125Wpincidenciasds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV126Wpincidenciasds_4_inc_dia1 = AV18Inc_Dia1 ;
      AV127Wpincidenciasds_5_inc_dia_to1 = AV19Inc_Dia_To1 ;
      AV128Wpincidenciasds_6_inc_prog1 = AV20Inc_Prog1 ;
      AV129Wpincidenciasds_7_inc_hdr1 = AV98Inc_Hdr1 ;
      AV130Wpincidenciasds_8_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV132Wpincidenciasds_10_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV133Wpincidenciasds_11_inc_dia2 = AV24Inc_Dia2 ;
      AV134Wpincidenciasds_12_inc_dia_to2 = AV25Inc_Dia_To2 ;
      AV135Wpincidenciasds_13_inc_prog2 = AV26Inc_Prog2 ;
      AV136Wpincidenciasds_14_inc_hdr2 = AV99Inc_Hdr2 ;
      AV137Wpincidenciasds_15_dynamicfiltersenabled3 = AV27DynamicFiltersEnabled3 ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = AV28DynamicFiltersSelector3 ;
      AV139Wpincidenciasds_17_dynamicfiltersoperator3 = AV29DynamicFiltersOperator3 ;
      AV140Wpincidenciasds_18_inc_dia3 = AV30Inc_Dia3 ;
      AV141Wpincidenciasds_19_inc_dia_to3 = AV31Inc_Dia_To3 ;
      AV142Wpincidenciasds_20_inc_prog3 = AV32Inc_Prog3 ;
      AV143Wpincidenciasds_21_inc_hdr3 = AV100Inc_Hdr3 ;
      AV144Wpincidenciasds_22_tfinc_dia = AV46TFInc_Dia ;
      AV145Wpincidenciasds_23_tfinc_linea = AV51TFInc_Linea ;
      AV146Wpincidenciasds_24_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV147Wpincidenciasds_25_tfinc_hora = AV54TFInc_Hora ;
      AV148Wpincidenciasds_26_tfinc_prog = AV59TFInc_Prog ;
      AV149Wpincidenciasds_27_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV150Wpincidenciasds_28_tfinc_terminal = AV62TFInc_Terminal ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = AV63TFInc_Terminal_Sel ;
      AV152Wpincidenciasds_30_tfinc_usuario = AV65TFInc_Usuario ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = AV66TFInc_Usuario_Sel ;
      AV154Wpincidenciasds_32_tfinc_hdr = AV102TFInc_Hdr ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = AV103TFInc_Hdr_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV123Wpincidenciasds_1_filterfulltext ,
                                           AV124Wpincidenciasds_2_dynamicfiltersselector1 ,
                                           AV126Wpincidenciasds_4_inc_dia1 ,
                                           AV127Wpincidenciasds_5_inc_dia_to1 ,
                                           Short.valueOf(AV125Wpincidenciasds_3_dynamicfiltersoperator1) ,
                                           AV128Wpincidenciasds_6_inc_prog1 ,
                                           AV129Wpincidenciasds_7_inc_hdr1 ,
                                           Boolean.valueOf(AV130Wpincidenciasds_8_dynamicfiltersenabled2) ,
                                           AV131Wpincidenciasds_9_dynamicfiltersselector2 ,
                                           AV133Wpincidenciasds_11_inc_dia2 ,
                                           AV134Wpincidenciasds_12_inc_dia_to2 ,
                                           Short.valueOf(AV132Wpincidenciasds_10_dynamicfiltersoperator2) ,
                                           AV135Wpincidenciasds_13_inc_prog2 ,
                                           AV136Wpincidenciasds_14_inc_hdr2 ,
                                           Boolean.valueOf(AV137Wpincidenciasds_15_dynamicfiltersenabled3) ,
                                           AV138Wpincidenciasds_16_dynamicfiltersselector3 ,
                                           AV140Wpincidenciasds_18_inc_dia3 ,
                                           AV141Wpincidenciasds_19_inc_dia_to3 ,
                                           Short.valueOf(AV139Wpincidenciasds_17_dynamicfiltersoperator3) ,
                                           AV142Wpincidenciasds_20_inc_prog3 ,
                                           AV143Wpincidenciasds_21_inc_hdr3 ,
                                           AV144Wpincidenciasds_22_tfinc_dia ,
                                           Long.valueOf(AV145Wpincidenciasds_23_tfinc_linea) ,
                                           Long.valueOf(AV146Wpincidenciasds_24_tfinc_linea_to) ,
                                           AV147Wpincidenciasds_25_tfinc_hora ,
                                           AV149Wpincidenciasds_27_tfinc_prog_sel ,
                                           AV148Wpincidenciasds_26_tfinc_prog ,
                                           AV151Wpincidenciasds_29_tfinc_terminal_sel ,
                                           AV150Wpincidenciasds_28_tfinc_terminal ,
                                           AV153Wpincidenciasds_31_tfinc_usuario_sel ,
                                           AV152Wpincidenciasds_30_tfinc_usuario ,
                                           AV155Wpincidenciasds_33_tfinc_hdr_sel ,
                                           AV154Wpincidenciasds_32_tfinc_hdr ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4935Inc_Prog ,
                                           A4934Inc_Termin ,
                                           A4933Inc_Usuari ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           A5301Inc_BarPar ,
                                           A4929Inc_Dia ,
                                           A4932Inc_Hora ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      /* Using cursor H00F63 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV126Wpincidenciasds_4_inc_dia1, AV127Wpincidenciasds_5_inc_dia_to1, AV133Wpincidenciasds_11_inc_dia2, AV134Wpincidenciasds_12_inc_dia_to2, AV140Wpincidenciasds_18_inc_dia3, AV141Wpincidenciasds_19_inc_dia_to3, AV144Wpincidenciasds_22_tfinc_dia});
      GRID_nRecordCount = H00F63_AGRID_nRecordCount[0] ;
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
      AV123Wpincidenciasds_1_filterfulltext = AV115FilterFullText ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV125Wpincidenciasds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV126Wpincidenciasds_4_inc_dia1 = AV18Inc_Dia1 ;
      AV127Wpincidenciasds_5_inc_dia_to1 = AV19Inc_Dia_To1 ;
      AV128Wpincidenciasds_6_inc_prog1 = AV20Inc_Prog1 ;
      AV129Wpincidenciasds_7_inc_hdr1 = AV98Inc_Hdr1 ;
      AV130Wpincidenciasds_8_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV132Wpincidenciasds_10_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV133Wpincidenciasds_11_inc_dia2 = AV24Inc_Dia2 ;
      AV134Wpincidenciasds_12_inc_dia_to2 = AV25Inc_Dia_To2 ;
      AV135Wpincidenciasds_13_inc_prog2 = AV26Inc_Prog2 ;
      AV136Wpincidenciasds_14_inc_hdr2 = AV99Inc_Hdr2 ;
      AV137Wpincidenciasds_15_dynamicfiltersenabled3 = AV27DynamicFiltersEnabled3 ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = AV28DynamicFiltersSelector3 ;
      AV139Wpincidenciasds_17_dynamicfiltersoperator3 = AV29DynamicFiltersOperator3 ;
      AV140Wpincidenciasds_18_inc_dia3 = AV30Inc_Dia3 ;
      AV141Wpincidenciasds_19_inc_dia_to3 = AV31Inc_Dia_To3 ;
      AV142Wpincidenciasds_20_inc_prog3 = AV32Inc_Prog3 ;
      AV143Wpincidenciasds_21_inc_hdr3 = AV100Inc_Hdr3 ;
      AV144Wpincidenciasds_22_tfinc_dia = AV46TFInc_Dia ;
      AV145Wpincidenciasds_23_tfinc_linea = AV51TFInc_Linea ;
      AV146Wpincidenciasds_24_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV147Wpincidenciasds_25_tfinc_hora = AV54TFInc_Hora ;
      AV148Wpincidenciasds_26_tfinc_prog = AV59TFInc_Prog ;
      AV149Wpincidenciasds_27_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV150Wpincidenciasds_28_tfinc_terminal = AV62TFInc_Terminal ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = AV63TFInc_Terminal_Sel ;
      AV152Wpincidenciasds_30_tfinc_usuario = AV65TFInc_Usuario ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = AV66TFInc_Usuario_Sel ;
      AV154Wpincidenciasds_32_tfinc_hdr = AV102TFInc_Hdr ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = AV103TFInc_Hdr_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV123Wpincidenciasds_1_filterfulltext = AV115FilterFullText ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV125Wpincidenciasds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV126Wpincidenciasds_4_inc_dia1 = AV18Inc_Dia1 ;
      AV127Wpincidenciasds_5_inc_dia_to1 = AV19Inc_Dia_To1 ;
      AV128Wpincidenciasds_6_inc_prog1 = AV20Inc_Prog1 ;
      AV129Wpincidenciasds_7_inc_hdr1 = AV98Inc_Hdr1 ;
      AV130Wpincidenciasds_8_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV132Wpincidenciasds_10_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV133Wpincidenciasds_11_inc_dia2 = AV24Inc_Dia2 ;
      AV134Wpincidenciasds_12_inc_dia_to2 = AV25Inc_Dia_To2 ;
      AV135Wpincidenciasds_13_inc_prog2 = AV26Inc_Prog2 ;
      AV136Wpincidenciasds_14_inc_hdr2 = AV99Inc_Hdr2 ;
      AV137Wpincidenciasds_15_dynamicfiltersenabled3 = AV27DynamicFiltersEnabled3 ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = AV28DynamicFiltersSelector3 ;
      AV139Wpincidenciasds_17_dynamicfiltersoperator3 = AV29DynamicFiltersOperator3 ;
      AV140Wpincidenciasds_18_inc_dia3 = AV30Inc_Dia3 ;
      AV141Wpincidenciasds_19_inc_dia_to3 = AV31Inc_Dia_To3 ;
      AV142Wpincidenciasds_20_inc_prog3 = AV32Inc_Prog3 ;
      AV143Wpincidenciasds_21_inc_hdr3 = AV100Inc_Hdr3 ;
      AV144Wpincidenciasds_22_tfinc_dia = AV46TFInc_Dia ;
      AV145Wpincidenciasds_23_tfinc_linea = AV51TFInc_Linea ;
      AV146Wpincidenciasds_24_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV147Wpincidenciasds_25_tfinc_hora = AV54TFInc_Hora ;
      AV148Wpincidenciasds_26_tfinc_prog = AV59TFInc_Prog ;
      AV149Wpincidenciasds_27_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV150Wpincidenciasds_28_tfinc_terminal = AV62TFInc_Terminal ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = AV63TFInc_Terminal_Sel ;
      AV152Wpincidenciasds_30_tfinc_usuario = AV65TFInc_Usuario ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = AV66TFInc_Usuario_Sel ;
      AV154Wpincidenciasds_32_tfinc_hdr = AV102TFInc_Hdr ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = AV103TFInc_Hdr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV123Wpincidenciasds_1_filterfulltext = AV115FilterFullText ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV125Wpincidenciasds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV126Wpincidenciasds_4_inc_dia1 = AV18Inc_Dia1 ;
      AV127Wpincidenciasds_5_inc_dia_to1 = AV19Inc_Dia_To1 ;
      AV128Wpincidenciasds_6_inc_prog1 = AV20Inc_Prog1 ;
      AV129Wpincidenciasds_7_inc_hdr1 = AV98Inc_Hdr1 ;
      AV130Wpincidenciasds_8_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV132Wpincidenciasds_10_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV133Wpincidenciasds_11_inc_dia2 = AV24Inc_Dia2 ;
      AV134Wpincidenciasds_12_inc_dia_to2 = AV25Inc_Dia_To2 ;
      AV135Wpincidenciasds_13_inc_prog2 = AV26Inc_Prog2 ;
      AV136Wpincidenciasds_14_inc_hdr2 = AV99Inc_Hdr2 ;
      AV137Wpincidenciasds_15_dynamicfiltersenabled3 = AV27DynamicFiltersEnabled3 ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = AV28DynamicFiltersSelector3 ;
      AV139Wpincidenciasds_17_dynamicfiltersoperator3 = AV29DynamicFiltersOperator3 ;
      AV140Wpincidenciasds_18_inc_dia3 = AV30Inc_Dia3 ;
      AV141Wpincidenciasds_19_inc_dia_to3 = AV31Inc_Dia_To3 ;
      AV142Wpincidenciasds_20_inc_prog3 = AV32Inc_Prog3 ;
      AV143Wpincidenciasds_21_inc_hdr3 = AV100Inc_Hdr3 ;
      AV144Wpincidenciasds_22_tfinc_dia = AV46TFInc_Dia ;
      AV145Wpincidenciasds_23_tfinc_linea = AV51TFInc_Linea ;
      AV146Wpincidenciasds_24_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV147Wpincidenciasds_25_tfinc_hora = AV54TFInc_Hora ;
      AV148Wpincidenciasds_26_tfinc_prog = AV59TFInc_Prog ;
      AV149Wpincidenciasds_27_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV150Wpincidenciasds_28_tfinc_terminal = AV62TFInc_Terminal ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = AV63TFInc_Terminal_Sel ;
      AV152Wpincidenciasds_30_tfinc_usuario = AV65TFInc_Usuario ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = AV66TFInc_Usuario_Sel ;
      AV154Wpincidenciasds_32_tfinc_hdr = AV102TFInc_Hdr ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = AV103TFInc_Hdr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV123Wpincidenciasds_1_filterfulltext = AV115FilterFullText ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV125Wpincidenciasds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV126Wpincidenciasds_4_inc_dia1 = AV18Inc_Dia1 ;
      AV127Wpincidenciasds_5_inc_dia_to1 = AV19Inc_Dia_To1 ;
      AV128Wpincidenciasds_6_inc_prog1 = AV20Inc_Prog1 ;
      AV129Wpincidenciasds_7_inc_hdr1 = AV98Inc_Hdr1 ;
      AV130Wpincidenciasds_8_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV132Wpincidenciasds_10_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV133Wpincidenciasds_11_inc_dia2 = AV24Inc_Dia2 ;
      AV134Wpincidenciasds_12_inc_dia_to2 = AV25Inc_Dia_To2 ;
      AV135Wpincidenciasds_13_inc_prog2 = AV26Inc_Prog2 ;
      AV136Wpincidenciasds_14_inc_hdr2 = AV99Inc_Hdr2 ;
      AV137Wpincidenciasds_15_dynamicfiltersenabled3 = AV27DynamicFiltersEnabled3 ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = AV28DynamicFiltersSelector3 ;
      AV139Wpincidenciasds_17_dynamicfiltersoperator3 = AV29DynamicFiltersOperator3 ;
      AV140Wpincidenciasds_18_inc_dia3 = AV30Inc_Dia3 ;
      AV141Wpincidenciasds_19_inc_dia_to3 = AV31Inc_Dia_To3 ;
      AV142Wpincidenciasds_20_inc_prog3 = AV32Inc_Prog3 ;
      AV143Wpincidenciasds_21_inc_hdr3 = AV100Inc_Hdr3 ;
      AV144Wpincidenciasds_22_tfinc_dia = AV46TFInc_Dia ;
      AV145Wpincidenciasds_23_tfinc_linea = AV51TFInc_Linea ;
      AV146Wpincidenciasds_24_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV147Wpincidenciasds_25_tfinc_hora = AV54TFInc_Hora ;
      AV148Wpincidenciasds_26_tfinc_prog = AV59TFInc_Prog ;
      AV149Wpincidenciasds_27_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV150Wpincidenciasds_28_tfinc_terminal = AV62TFInc_Terminal ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = AV63TFInc_Terminal_Sel ;
      AV152Wpincidenciasds_30_tfinc_usuario = AV65TFInc_Usuario ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = AV66TFInc_Usuario_Sel ;
      AV154Wpincidenciasds_32_tfinc_hdr = AV102TFInc_Hdr ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = AV103TFInc_Hdr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV123Wpincidenciasds_1_filterfulltext = AV115FilterFullText ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV125Wpincidenciasds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV126Wpincidenciasds_4_inc_dia1 = AV18Inc_Dia1 ;
      AV127Wpincidenciasds_5_inc_dia_to1 = AV19Inc_Dia_To1 ;
      AV128Wpincidenciasds_6_inc_prog1 = AV20Inc_Prog1 ;
      AV129Wpincidenciasds_7_inc_hdr1 = AV98Inc_Hdr1 ;
      AV130Wpincidenciasds_8_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV132Wpincidenciasds_10_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV133Wpincidenciasds_11_inc_dia2 = AV24Inc_Dia2 ;
      AV134Wpincidenciasds_12_inc_dia_to2 = AV25Inc_Dia_To2 ;
      AV135Wpincidenciasds_13_inc_prog2 = AV26Inc_Prog2 ;
      AV136Wpincidenciasds_14_inc_hdr2 = AV99Inc_Hdr2 ;
      AV137Wpincidenciasds_15_dynamicfiltersenabled3 = AV27DynamicFiltersEnabled3 ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = AV28DynamicFiltersSelector3 ;
      AV139Wpincidenciasds_17_dynamicfiltersoperator3 = AV29DynamicFiltersOperator3 ;
      AV140Wpincidenciasds_18_inc_dia3 = AV30Inc_Dia3 ;
      AV141Wpincidenciasds_19_inc_dia_to3 = AV31Inc_Dia_To3 ;
      AV142Wpincidenciasds_20_inc_prog3 = AV32Inc_Prog3 ;
      AV143Wpincidenciasds_21_inc_hdr3 = AV100Inc_Hdr3 ;
      AV144Wpincidenciasds_22_tfinc_dia = AV46TFInc_Dia ;
      AV145Wpincidenciasds_23_tfinc_linea = AV51TFInc_Linea ;
      AV146Wpincidenciasds_24_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV147Wpincidenciasds_25_tfinc_hora = AV54TFInc_Hora ;
      AV148Wpincidenciasds_26_tfinc_prog = AV59TFInc_Prog ;
      AV149Wpincidenciasds_27_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV150Wpincidenciasds_28_tfinc_terminal = AV62TFInc_Terminal ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = AV63TFInc_Terminal_Sel ;
      AV152Wpincidenciasds_30_tfinc_usuario = AV65TFInc_Usuario ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = AV66TFInc_Usuario_Sel ;
      AV154Wpincidenciasds_32_tfinc_hdr = AV102TFInc_Hdr ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = AV103TFInc_Hdr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV157Pgmdesc = httpContext.getMessage( " Control de Incidencias", "") ;
      AV156Pgmname = "WPIncidencias" ;
      Gx_err = (short)(0) ;
      edtavObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObs_Enabled), 5, 0), !bGXsfl_124_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupF60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e28F62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      /* Using cursor H00F64 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      A407EmprNom = H00F64_A407EmprNom[0] ;
      n407EmprNom = H00F64_n407EmprNom[0] ;
      pr_default.close(2);
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV42ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV80DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV39ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_124 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_124"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV82GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV83GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV18Inc_Dia1 = localUtil.ctod( httpContext.cgiGet( "vINC_DIA1"), 0) ;
         AV19Inc_Dia_To1 = localUtil.ctod( httpContext.cgiGet( "vINC_DIA_TO1"), 0) ;
         AV24Inc_Dia2 = localUtil.ctod( httpContext.cgiGet( "vINC_DIA2"), 0) ;
         AV25Inc_Dia_To2 = localUtil.ctod( httpContext.cgiGet( "vINC_DIA_TO2"), 0) ;
         AV30Inc_Dia3 = localUtil.ctod( httpContext.cgiGet( "vINC_DIA3"), 0) ;
         AV31Inc_Dia_To3 = localUtil.ctod( httpContext.cgiGet( "vINC_DIA_TO3"), 0) ;
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
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
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
         AV115FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV115FilterFullText", AV115FilterFullText);
         cmbavDynamicfiltersselector1.setName( cmbavDynamicfiltersselector1.getInternalname() );
         cmbavDynamicfiltersselector1.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) );
         AV16DynamicFiltersSelector1 = httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
         cmbavDynamicfiltersoperator1.setName( cmbavDynamicfiltersoperator1.getInternalname() );
         cmbavDynamicfiltersoperator1.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()) );
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
         AV117Inc_Dia_RangeText1 = httpContext.cgiGet( edtavInc_dia_rangetext1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117Inc_Dia_RangeText1", AV117Inc_Dia_RangeText1);
         AV20Inc_Prog1 = httpContext.cgiGet( edtavInc_prog1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Inc_Prog1", AV20Inc_Prog1);
         AV98Inc_Hdr1 = httpContext.cgiGet( edtavInc_hdr1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98Inc_Hdr1", AV98Inc_Hdr1);
         cmbavDynamicfiltersselector2.setName( cmbavDynamicfiltersselector2.getInternalname() );
         cmbavDynamicfiltersselector2.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) );
         AV22DynamicFiltersSelector2 = httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersSelector2", AV22DynamicFiltersSelector2);
         cmbavDynamicfiltersoperator2.setName( cmbavDynamicfiltersoperator2.getInternalname() );
         cmbavDynamicfiltersoperator2.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()) );
         AV23DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DynamicFiltersOperator2), 4, 0));
         AV118Inc_Dia_RangeText2 = httpContext.cgiGet( edtavInc_dia_rangetext2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118Inc_Dia_RangeText2", AV118Inc_Dia_RangeText2);
         AV26Inc_Prog2 = httpContext.cgiGet( edtavInc_prog2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_Prog2", AV26Inc_Prog2);
         AV99Inc_Hdr2 = httpContext.cgiGet( edtavInc_hdr2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99Inc_Hdr2", AV99Inc_Hdr2);
         cmbavDynamicfiltersselector3.setName( cmbavDynamicfiltersselector3.getInternalname() );
         cmbavDynamicfiltersselector3.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) );
         AV28DynamicFiltersSelector3 = httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersSelector3", AV28DynamicFiltersSelector3);
         cmbavDynamicfiltersoperator3.setName( cmbavDynamicfiltersoperator3.getInternalname() );
         cmbavDynamicfiltersoperator3.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()) );
         AV29DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DynamicFiltersOperator3), 4, 0));
         AV119Inc_Dia_RangeText3 = httpContext.cgiGet( edtavInc_dia_rangetext3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV119Inc_Dia_RangeText3", AV119Inc_Dia_RangeText3);
         AV32Inc_Prog3 = httpContext.cgiGet( edtavInc_prog3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_Prog3", AV32Inc_Prog3);
         AV100Inc_Hdr3 = httpContext.cgiGet( edtavInc_hdr3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100Inc_Hdr3", AV100Inc_Hdr3);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_inc_diaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_INC_DIAAUXDATE");
            GX_FocusControl = edtavDdo_inc_diaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48DDO_Inc_DiaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48DDO_Inc_DiaAuxDate", localUtil.format(AV48DDO_Inc_DiaAuxDate, "99/99/99"));
         }
         else
         {
            AV48DDO_Inc_DiaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_inc_diaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48DDO_Inc_DiaAuxDate", localUtil.format(AV48DDO_Inc_DiaAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_inc_horaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_INC_HORAAUXDATE");
            GX_FocusControl = edtavDdo_inc_horaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56DDO_Inc_HoraAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56DDO_Inc_HoraAuxDate", localUtil.format(AV56DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         else
         {
            AV56DDO_Inc_HoraAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_inc_horaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56DDO_Inc_HoraAuxDate", localUtil.format(AV56DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV115FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV16DynamicFiltersSelector1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV17DynamicFiltersOperator1 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_PROG1"), AV20Inc_Prog1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_HDR1"), AV98Inc_Hdr1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV22DynamicFiltersSelector2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23DynamicFiltersOperator2 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_PROG2"), AV26Inc_Prog2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_HDR2"), AV99Inc_Hdr2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV28DynamicFiltersSelector3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV29DynamicFiltersOperator3 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_PROG3"), AV32Inc_Prog3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vINC_HDR3"), AV100Inc_Hdr3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vINC_DIA1"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV18Inc_Dia1)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vINC_DIA2"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV24Inc_Dia2)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vINC_DIA3"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV30Inc_Dia3)) ) )
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
      e28F62 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e28F62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV94Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpincidencias_impl.this.GXt_char1 = GXv_char2[0] ;
      AV94Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV88EmprNom ;
      GXv_char4[0] = AV89UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV94Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpincidencias_impl.this.A396EmprCod = GXv_char2[0] ;
      wpincidencias_impl.this.AV88EmprNom = GXv_char3[0] ;
      wpincidencias_impl.this.AV89UsurCod = GXv_char4[0] ;
      AV86Inc_Dia = GXutil.resetTime(GXutil.now( )) ;
      AV87Inc_Dia_To = GXutil.resetTime(GXutil.now( )) ;
      AV114AplicarConfirmar = false ;
      GXt_char1 = AV94Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wpincidencias_impl.this.GXt_char1 = GXv_char4[0] ;
      AV94Station = GXt_char1 ;
      GXv_char4[0] = AV122Emprcod ;
      GXv_char3[0] = AV88EmprNom ;
      GXv_char2[0] = AV89UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV94Station, GXv_char4, GXv_char3, GXv_char2) ;
      wpincidencias_impl.this.AV122Emprcod = GXv_char4[0] ;
      wpincidencias_impl.this.AV88EmprNom = GXv_char3[0] ;
      wpincidencias_impl.this.AV89UsurCod = GXv_char2[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      lblJsdynamicfilters_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      this.executeUsercontrolMethod("", false, "INC_DIA_RANGEPICKER1Container", "Attach", "", new Object[] {edtavInc_dia_rangetext1_Internalname});
      AV16DynamicFiltersSelector1 = "INC_DIA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      this.executeUsercontrolMethod("", false, "INC_DIA_RANGEPICKER2Container", "Attach", "", new Object[] {edtavInc_dia_rangetext2_Internalname});
      AV22DynamicFiltersSelector2 = "INC_DIA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersSelector2", AV22DynamicFiltersSelector2);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      this.executeUsercontrolMethod("", false, "INC_DIA_RANGEPICKER3Container", "Attach", "", new Object[] {edtavInc_dia_rangetext3_Internalname});
      AV28DynamicFiltersSelector3 = "INC_DIA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersSelector3", AV28DynamicFiltersSelector3);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      imgAdddynamicfilters1_Jsonclick = GXutil.format( "WWPDynFilterShow_AL('%1', 2, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Jsonclick", imgAdddynamicfilters1_Jsonclick, true);
      imgRemovedynamicfilters1_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Jsonclick", imgRemovedynamicfilters1_Jsonclick, true);
      imgAdddynamicfilters2_Jsonclick = GXutil.format( "WWPDynFilterShow_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Jsonclick", imgAdddynamicfilters2_Jsonclick, true);
      imgRemovedynamicfilters2_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Jsonclick", imgRemovedynamicfilters2_Jsonclick, true);
      imgRemovedynamicfilters3_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters3_Internalname, "Jsonclick", imgRemovedynamicfilters3_Jsonclick, true);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Control de Incidencias", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV80DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV80DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e29F62( )
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
      if ( AV44ManageFiltersExecutionStep == 1 )
      {
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV44ManageFiltersExecutionStep == 2 )
      {
         AV44ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      cmbavDynamicfiltersoperator1.removeAllItems();
      if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_PROG") == 0 )
      {
         cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      }
      else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_HDR") == 0 )
      {
         cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      }
      if ( AV21DynamicFiltersEnabled2 )
      {
         cmbavDynamicfiltersoperator2.removeAllItems();
         if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_PROG") == 0 )
         {
            cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
         }
         else if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_HDR") == 0 )
         {
            cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
         }
         if ( AV27DynamicFiltersEnabled3 )
         {
            cmbavDynamicfiltersoperator3.removeAllItems();
            if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_PROG") == 0 )
            {
               cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
            }
            else if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_HDR") == 0 )
            {
               cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
            }
         }
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S182 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      if ( GXutil.strcmp(AV41Session.getValue("WPIncidenciasColumnsSelector"), "") != 0 )
      {
         AV37ColumnsSelectorXML = AV41Session.getValue("WPIncidenciasColumnsSelector") ;
         AV39ColumnsSelector.fromxml(AV37ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S192 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
      }
      edtInc_Dia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Visible), 5, 0), !bGXsfl_124_Refreshing);
      edtInc_Linea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Visible), 5, 0), !bGXsfl_124_Refreshing);
      edtInc_Hora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hora_Visible), 5, 0), !bGXsfl_124_Refreshing);
      edtInc_Prog_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Prog_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Prog_Visible), 5, 0), !bGXsfl_124_Refreshing);
      edtInc_Termin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Termin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Termin_Visible), 5, 0), !bGXsfl_124_Refreshing);
      edtInc_Usuari_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Usuari_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Usuari_Visible), 5, 0), !bGXsfl_124_Refreshing);
      edtavObs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavObs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavObs_Visible), 5, 0), !bGXsfl_124_Refreshing);
      edtInc_Hdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV39ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hdr_Visible), 5, 0), !bGXsfl_124_Refreshing);
      AV82GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82GridCurrentPage), 10, 0));
      AV83GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83GridPageCount), 10, 0));
      AV123Wpincidenciasds_1_filterfulltext = AV115FilterFullText ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = AV16DynamicFiltersSelector1 ;
      AV125Wpincidenciasds_3_dynamicfiltersoperator1 = AV17DynamicFiltersOperator1 ;
      AV126Wpincidenciasds_4_inc_dia1 = AV18Inc_Dia1 ;
      AV127Wpincidenciasds_5_inc_dia_to1 = AV19Inc_Dia_To1 ;
      AV128Wpincidenciasds_6_inc_prog1 = AV20Inc_Prog1 ;
      AV129Wpincidenciasds_7_inc_hdr1 = AV98Inc_Hdr1 ;
      AV130Wpincidenciasds_8_dynamicfiltersenabled2 = AV21DynamicFiltersEnabled2 ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = AV22DynamicFiltersSelector2 ;
      AV132Wpincidenciasds_10_dynamicfiltersoperator2 = AV23DynamicFiltersOperator2 ;
      AV133Wpincidenciasds_11_inc_dia2 = AV24Inc_Dia2 ;
      AV134Wpincidenciasds_12_inc_dia_to2 = AV25Inc_Dia_To2 ;
      AV135Wpincidenciasds_13_inc_prog2 = AV26Inc_Prog2 ;
      AV136Wpincidenciasds_14_inc_hdr2 = AV99Inc_Hdr2 ;
      AV137Wpincidenciasds_15_dynamicfiltersenabled3 = AV27DynamicFiltersEnabled3 ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = AV28DynamicFiltersSelector3 ;
      AV139Wpincidenciasds_17_dynamicfiltersoperator3 = AV29DynamicFiltersOperator3 ;
      AV140Wpincidenciasds_18_inc_dia3 = AV30Inc_Dia3 ;
      AV141Wpincidenciasds_19_inc_dia_to3 = AV31Inc_Dia_To3 ;
      AV142Wpincidenciasds_20_inc_prog3 = AV32Inc_Prog3 ;
      AV143Wpincidenciasds_21_inc_hdr3 = AV100Inc_Hdr3 ;
      AV144Wpincidenciasds_22_tfinc_dia = AV46TFInc_Dia ;
      AV145Wpincidenciasds_23_tfinc_linea = AV51TFInc_Linea ;
      AV146Wpincidenciasds_24_tfinc_linea_to = AV52TFInc_Linea_To ;
      AV147Wpincidenciasds_25_tfinc_hora = AV54TFInc_Hora ;
      AV148Wpincidenciasds_26_tfinc_prog = AV59TFInc_Prog ;
      AV149Wpincidenciasds_27_tfinc_prog_sel = AV60TFInc_Prog_Sel ;
      AV150Wpincidenciasds_28_tfinc_terminal = AV62TFInc_Terminal ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = AV63TFInc_Terminal_Sel ;
      AV152Wpincidenciasds_30_tfinc_usuario = AV65TFInc_Usuario ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = AV66TFInc_Usuario_Sel ;
      AV154Wpincidenciasds_32_tfinc_hdr = AV102TFInc_Hdr ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = AV103TFInc_Hdr_Sel ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12F62( )
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
         AV81PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV81PageToGo) ;
      }
   }

   public void e13F62( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e17F62( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Dia") == 0 )
         {
            AV46TFInc_Dia = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFInc_Dia", localUtil.format(AV46TFInc_Dia, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Linea") == 0 )
         {
            AV51TFInc_Linea = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFInc_Linea), 10, 0));
            AV52TFInc_Linea_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFInc_Linea_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Hora") == 0 )
         {
            AV54TFInc_Hora = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFInc_Hora", localUtil.ttoc( AV54TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Prog") == 0 )
         {
            AV59TFInc_Prog = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Prog", AV59TFInc_Prog);
            AV60TFInc_Prog_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Prog_Sel", AV60TFInc_Prog_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Terminal") == 0 )
         {
            AV62TFInc_Terminal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Terminal", AV62TFInc_Terminal);
            AV63TFInc_Terminal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Terminal_Sel", AV63TFInc_Terminal_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Usuario") == 0 )
         {
            AV65TFInc_Usuario = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFInc_Usuario", AV65TFInc_Usuario);
            AV66TFInc_Usuario_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFInc_Usuario_Sel", AV66TFInc_Usuario_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Hdr") == 0 )
         {
            AV102TFInc_Hdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFInc_Hdr", AV102TFInc_Hdr);
            AV103TFInc_Hdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFInc_Hdr_Sel", AV103TFInc_Hdr_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e30F62( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      AV95Nlin = (short)(GXutil.gxmlines( A4936Inc_Obs, (short)(60))) ;
      AV96i = (short)(1) ;
      AV97Obs = " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtavObs_Internalname, AV97Obs);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV97Obs, ""))));
      while ( AV96i <= AV95Nlin )
      {
         AV97Obs += GXutil.gxgetmli( A4936Inc_Obs, AV96i, (short)(60)) + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavObs_Internalname, AV97Obs);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOBS"+"_"+sGXsfl_124_idx, getSecureSignedToken( sGXsfl_124_idx, GXutil.rtrim( localUtil.format( AV97Obs, ""))));
         AV96i = (short)(AV96i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(124) ;
      }
      sendrow_1242( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_124_Refreshing )
      {
         httpContext.doAjaxLoad(124, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV116GridActions, 4, 0)) );
   }

   public void e18F62( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV37ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV39ColumnsSelector.fromJSonString(AV37ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WPIncidenciasColumnsSelector", ((GXutil.strcmp("", AV37ColumnsSelectorXML)==0) ? "" : AV39ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e23F62( )
   {
      /* 'AddDynamicFilters1' Routine */
      returnInSub = false ;
      AV21DynamicFiltersEnabled2 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersEnabled2", AV21DynamicFiltersEnabled2);
      imgAdddynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      /*  Sending Event outputs  */
   }

   public void e19F62( )
   {
      /* 'RemoveDynamicFilters1' Routine */
      returnInSub = false ;
      AV33DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DynamicFiltersRemoving", AV33DynamicFiltersRemoving);
      AV34DynamicFiltersIgnoreFirst = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34DynamicFiltersIgnoreFirst", AV34DynamicFiltersIgnoreFirst);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV33DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DynamicFiltersRemoving", AV33DynamicFiltersRemoving);
      AV34DynamicFiltersIgnoreFirst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34DynamicFiltersIgnoreFirst", AV34DynamicFiltersIgnoreFirst);
      gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV22DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV28DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e24F62( )
   {
      /* Dynamicfiltersselector1_Click Routine */
      returnInSub = false ;
      AV17DynamicFiltersOperator1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
   }

   public void e14F62( )
   {
      /* Inc_dia_rangepicker1_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Inc_Dia1", localUtil.format(AV18Inc_Dia1, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_Dia_To1", localUtil.format(AV19Inc_Dia_To1, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e25F62( )
   {
      /* 'AddDynamicFilters2' Routine */
      returnInSub = false ;
      AV27DynamicFiltersEnabled3 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersEnabled3", AV27DynamicFiltersEnabled3);
      imgAdddynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      /*  Sending Event outputs  */
   }

   public void e20F62( )
   {
      /* 'RemoveDynamicFilters2' Routine */
      returnInSub = false ;
      AV33DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DynamicFiltersRemoving", AV33DynamicFiltersRemoving);
      AV21DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersEnabled2", AV21DynamicFiltersEnabled2);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV33DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DynamicFiltersRemoving", AV33DynamicFiltersRemoving);
      gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV22DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV28DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e26F62( )
   {
      /* Dynamicfiltersselector2_Click Routine */
      returnInSub = false ;
      AV23DynamicFiltersOperator2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DynamicFiltersOperator2), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
   }

   public void e15F62( )
   {
      /* Inc_dia_rangepicker2_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Inc_Dia2", localUtil.format(AV24Inc_Dia2, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_Dia_To2", localUtil.format(AV25Inc_Dia_To2, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e21F62( )
   {
      /* 'RemoveDynamicFilters3' Routine */
      returnInSub = false ;
      AV33DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DynamicFiltersRemoving", AV33DynamicFiltersRemoving);
      AV27DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersEnabled3", AV27DynamicFiltersEnabled3);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV33DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DynamicFiltersRemoving", AV33DynamicFiltersRemoving);
      gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV22DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV28DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e27F62( )
   {
      /* Dynamicfiltersselector3_Click Routine */
      returnInSub = false ;
      AV29DynamicFiltersOperator3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DynamicFiltersOperator3), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e16F62( )
   {
      /* Inc_dia_rangepicker3_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Inc_Dia3", localUtil.format(AV30Inc_Dia3, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV31Inc_Dia_To3", localUtil.format(AV31Inc_Dia_To3, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV115FilterFullText, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV20Inc_Prog1, AV98Inc_Hdr1, AV22DynamicFiltersSelector2, AV23DynamicFiltersOperator2, AV26Inc_Prog2, AV99Inc_Hdr2, AV28DynamicFiltersSelector3, AV29DynamicFiltersOperator3, AV32Inc_Prog3, AV100Inc_Hdr3, AV18Inc_Dia1, AV24Inc_Dia2, AV30Inc_Dia3, A396EmprCod, AV44ManageFiltersExecutionStep, AV21DynamicFiltersEnabled2, AV27DynamicFiltersEnabled3, AV39ColumnsSelector, AV19Inc_Dia_To1, AV25Inc_Dia_To2, AV31Inc_Dia_To3, AV46TFInc_Dia, AV51TFInc_Linea, AV52TFInc_Linea_To, AV54TFInc_Hora, AV59TFInc_Prog, AV60TFInc_Prog_Sel, AV62TFInc_Terminal, AV63TFInc_Terminal_Sel, AV65TFInc_Usuario, AV66TFInc_Usuario_Sel, AV102TFInc_Hdr, AV103TFInc_Hdr_Sel, AV156Pgmname, AV13OrderedBy, AV14OrderedDsc, AV10GridState, AV34DynamicFiltersIgnoreFirst, AV33DynamicFiltersRemoving, A4936Inc_Obs, AV157Pgmdesc) ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11F62( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S232 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S182 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WPIncidenciasFilters")),GXutil.URLEncode(GXutil.rtrim(AV156Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WPIncidenciasFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV44ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44ManageFiltersExecutionStep", GXutil.str( AV44ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV43ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WPIncidenciasFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wpincidencias_impl.this.GXt_char1 = GXv_char4[0] ;
         AV43ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV43ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S232 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV156Pgmname+"GridState", AV43ManageFiltersXml) ;
            AV10GridState.fromxml(AV43ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S172 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S242 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
            S222 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV22DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV28DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ColumnsSelector", AV39ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV42ManageFiltersData", AV42ManageFiltersData);
   }

   public void e22F62( )
   {
      /* 'DoExportar' Routine */
      returnInSub = false ;
      AV104NomInf = GXutil.trim( AV157Pgmdesc) ;
      AV112Random = (int)(GXutil.random( )*10000) ;
      AV113Filename = GXutil.trim( AV104NomInf) + GXutil.trim( GXutil.str( AV112Random, 8, 0)) + ".xlsx" ;
      AV107XLS.Open(AV113Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S272 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV107XLS.Clear();
      AV108Row = (short)(1) ;
      AV109Col = (short)(1) ;
      while ( AV109Col <= 8 )
      {
         AV107XLS.Cells(AV108Row, AV109Col, 1, 1).setBold( (short)(1) );
         AV107XLS.Cells(AV108Row, AV109Col, 1, 1).setColor( 11 );
         AV109Col = (short)(AV109Col+1) ;
      }
      AV107XLS.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Dia", "") );
      AV107XLS.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Linea", "") );
      AV107XLS.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Hora", "") );
      AV107XLS.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Terminal", "") );
      AV107XLS.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Usuario", "") );
      AV107XLS.Cells(1, 6, 1, 1).setText( httpContext.getMessage( "Programa", "") );
      AV107XLS.Cells(1, 7, 1, 1).setText( httpContext.getMessage( "N Doc", "") );
      AV107XLS.Cells(1, 8, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV108Row = (short)(2) ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_124 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_124"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_124_fel_idx = 0 ;
      while ( nGXsfl_124_fel_idx < nRC_GXsfl_124 )
      {
         nGXsfl_124_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_fel_idx+1) ;
         sGXsfl_124_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1242( ) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV116GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A4929Inc_Dia = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInc_Dia_Internalname), 0)) ;
         A4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtInc_Hora_Internalname), 0)) ;
         A4935Inc_Prog = httpContext.cgiGet( edtInc_Prog_Internalname) ;
         A4934Inc_Termin = httpContext.cgiGet( edtInc_Termin_Internalname) ;
         A4933Inc_Usuari = GXutil.upper( httpContext.cgiGet( edtInc_Usuari_Internalname)) ;
         A5299Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5300Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5301Inc_BarPar = httpContext.cgiGet( edtInc_BarPar_Internalname) ;
         AV97Obs = httpContext.cgiGet( edtavObs_Internalname) ;
         A13713Inc_Hdr = httpContext.cgiGet( edtInc_Hdr_Internalname) ;
         GXt_dtime8 = GXutil.resetTime( A4929Inc_Dia );
         AV107XLS.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
         AV107XLS.Cells(AV108Row, 1, 1, 1).setDate( GXt_dtime8 );
         AV107XLS.Cells(AV108Row, 2, 1, 1).setNumber( A4931Inc_Linea );
         AV107XLS.Cells(AV108Row, 3, 1, 1).setText( localUtil.ttoc( A4932Inc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV107XLS.Cells(AV108Row, 4, 1, 1).setText( A4934Inc_Termin );
         AV107XLS.Cells(AV108Row, 5, 1, 1).setText( A4933Inc_Usuari );
         AV107XLS.Cells(AV108Row, 6, 1, 1).setText( A4935Inc_Prog );
         AV107XLS.Cells(AV108Row, 7, 1, 1).setText( A13713Inc_Hdr );
         AV107XLS.Cells(AV108Row, 8, 1, 1).setText( AV97Obs );
         AV108Row = (short)(AV108Row+1) ;
         /* End For Each Line */
      }
      if ( nGXsfl_124_fel_idx == 0 )
      {
         nGXsfl_124_idx = 1 ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      nGXsfl_124_fel_idx = 1 ;
      AV107XLS.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S272 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV107XLS.Show();
      if ( GXutil.strcmp(AV113Filename, "") != 0 )
      {
         callWebObject(formatLink(AV113Filename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV36ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void S172( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S192( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV39ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Inc_Dia", "", "Dia", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Inc_Linea", "", "#", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Inc_Hora", "", "Hora", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Inc_Prog", "", "Programa", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Inc_Terminal", "", "Terminal", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Inc_Usuario", "", "Usuario", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "&Obs", "", "Observaciones", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXv_SdtWWPColumnsSelector9[0] = AV39ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, "Inc_Hdr", "", "Nº documento", true, "") ;
      AV39ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      GXt_char1 = AV38UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPIncidenciasColumnsSelector", GXv_char4) ;
      wpincidencias_impl.this.GXt_char1 = GXv_char4[0] ;
      AV38UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV38UserCustomValue)==0) ) )
      {
         AV40ColumnsSelectorAux.fromxml(AV38UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector9[0] = AV40ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector10[0] = AV39ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector9, GXv_SdtWWPColumnsSelector10) ;
         AV40ColumnsSelectorAux = GXv_SdtWWPColumnsSelector9[0] ;
         AV39ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      }
   }

   public void S122( )
   {
      /* 'ENABLEDYNAMICFILTERS1' Routine */
      returnInSub = false ;
      edtavInc_dia_rangetext1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_dia_rangetext1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_dia_rangetext1_Visible), 5, 0), true);
      edtavInc_prog1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_prog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_prog1_Visible), 5, 0), true);
      edtavInc_hdr1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr1_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator1.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_DIA") == 0 )
      {
         edtavInc_dia_rangetext1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_dia_rangetext1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_dia_rangetext1_Visible), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_PROG") == 0 )
      {
         edtavInc_prog1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_prog1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_prog1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_HDR") == 0 )
      {
         edtavInc_hdr1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
   }

   public void S132( )
   {
      /* 'ENABLEDYNAMICFILTERS2' Routine */
      returnInSub = false ;
      edtavInc_dia_rangetext2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_dia_rangetext2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_dia_rangetext2_Visible), 5, 0), true);
      edtavInc_prog2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_prog2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_prog2_Visible), 5, 0), true);
      edtavInc_hdr2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr2_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator2.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_DIA") == 0 )
      {
         edtavInc_dia_rangetext2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_dia_rangetext2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_dia_rangetext2_Visible), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_PROG") == 0 )
      {
         edtavInc_prog2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_prog2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_prog2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_HDR") == 0 )
      {
         edtavInc_hdr2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
   }

   public void S142( )
   {
      /* 'ENABLEDYNAMICFILTERS3' Routine */
      returnInSub = false ;
      edtavInc_dia_rangetext3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_dia_rangetext3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_dia_rangetext3_Visible), 5, 0), true);
      edtavInc_prog3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_prog3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_prog3_Visible), 5, 0), true);
      edtavInc_hdr3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr3_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator3.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_DIA") == 0 )
      {
         edtavInc_dia_rangetext3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_dia_rangetext3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_dia_rangetext3_Visible), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_PROG") == 0 )
      {
         edtavInc_prog3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_prog3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_prog3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_HDR") == 0 )
      {
         edtavInc_hdr3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
   }

   public void S212( )
   {
      /* 'RESETDYNFILTERS' Routine */
      returnInSub = false ;
      AV21DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersEnabled2", AV21DynamicFiltersEnabled2);
      AV22DynamicFiltersSelector2 = "INC_DIA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersSelector2", AV22DynamicFiltersSelector2);
      AV24Inc_Dia2 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Inc_Dia2", localUtil.format(AV24Inc_Dia2, "99/99/99"));
      AV25Inc_Dia_To2 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_Dia_To2", localUtil.format(AV25Inc_Dia_To2, "99/99/99"));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV27DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersEnabled3", AV27DynamicFiltersEnabled3);
      AV28DynamicFiltersSelector3 = "INC_DIA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersSelector3", AV28DynamicFiltersSelector3);
      AV30Inc_Dia3 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Inc_Dia3", localUtil.format(AV30Inc_Dia3, "99/99/99"));
      AV31Inc_Dia_To3 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Inc_Dia_To3", localUtil.format(AV31Inc_Dia_To3, "99/99/99"));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = AV42ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WPIncidenciasFilters", "WWPDynFilterHideAll_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[0] ;
      AV42ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   }

   public void S232( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV115FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115FilterFullText", AV115FilterFullText);
      AV46TFInc_Dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46TFInc_Dia", localUtil.format(AV46TFInc_Dia, "99/99/99"));
      AV51TFInc_Linea = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFInc_Linea), 10, 0));
      AV52TFInc_Linea_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFInc_Linea_To), 10, 0));
      AV54TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFInc_Hora", localUtil.ttoc( AV54TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV59TFInc_Prog = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Prog", AV59TFInc_Prog);
      AV60TFInc_Prog_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Prog_Sel", AV60TFInc_Prog_Sel);
      AV62TFInc_Terminal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Terminal", AV62TFInc_Terminal);
      AV63TFInc_Terminal_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Terminal_Sel", AV63TFInc_Terminal_Sel);
      AV65TFInc_Usuario = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TFInc_Usuario", AV65TFInc_Usuario);
      AV66TFInc_Usuario_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TFInc_Usuario_Sel", AV66TFInc_Usuario_Sel);
      AV102TFInc_Hdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TFInc_Hdr", AV102TFInc_Hdr);
      AV103TFInc_Hdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TFInc_Hdr_Sel", AV103TFInc_Hdr_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV16DynamicFiltersSelector1 = "INC_DIA" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      AV18Inc_Dia1 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Inc_Dia1", localUtil.format(AV18Inc_Dia1, "99/99/99"));
      AV19Inc_Dia_To1 = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_Dia_To1", localUtil.format(AV19Inc_Dia_To1, "99/99/99"));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S252( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcrtinc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(A4929Inc_Dia))}, new String[] {"Mode","EmprCod","Inc_Dia"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S262( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcrtinc", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(A4929Inc_Dia))}, new String[] {"Mode","EmprCod","Inc_Dia"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV41Session.getValue(AV156Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV156Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV41Session.getValue(AV156Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S172 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S242 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S242( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV159GXV1 = 1 ;
      while ( AV159GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV159GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV115FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115FilterFullText", AV115FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV46TFInc_Dia = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFInc_Dia", localUtil.format(AV46TFInc_Dia, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV51TFInc_Linea = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFInc_Linea), 10, 0));
            AV52TFInc_Linea_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFInc_Linea_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV54TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFInc_Hora", localUtil.ttoc( AV54TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV56DDO_Inc_HoraAuxDate = GXutil.resetTime(AV54TFInc_Hora) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56DDO_Inc_HoraAuxDate", localUtil.format(AV56DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV59TFInc_Prog = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Prog", AV59TFInc_Prog);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV60TFInc_Prog_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Prog_Sel", AV60TFInc_Prog_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV62TFInc_Terminal = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Terminal", AV62TFInc_Terminal);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV63TFInc_Terminal_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Terminal_Sel", AV63TFInc_Terminal_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV65TFInc_Usuario = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFInc_Usuario", AV65TFInc_Usuario);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV66TFInc_Usuario_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFInc_Usuario_Sel", AV66TFInc_Usuario_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV102TFInc_Hdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFInc_Hdr", AV102TFInc_Hdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV103TFInc_Hdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFInc_Hdr_Sel", AV103TFInc_Hdr_Sel);
         }
         AV159GXV1 = (int)(AV159GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFInc_Prog_Sel)==0), AV60TFInc_Prog_Sel, GXv_char4) ;
      wpincidencias_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFInc_Terminal_Sel)==0), AV63TFInc_Terminal_Sel, GXv_char3) ;
      wpincidencias_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFInc_Usuario_Sel)==0), AV66TFInc_Usuario_Sel, GXv_char2) ;
      wpincidencias_impl.this.GXt_char14 = GXv_char2[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV103TFInc_Hdr_Sel)==0), AV103TFInc_Hdr_Sel, GXv_char16) ;
      wpincidencias_impl.this.GXt_char15 = GXv_char16[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char13+"|"+GXt_char14+"||"+GXt_char15 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFInc_Prog)==0), AV59TFInc_Prog, GXv_char16) ;
      wpincidencias_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFInc_Terminal)==0), AV62TFInc_Terminal, GXv_char4) ;
      wpincidencias_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFInc_Usuario)==0), AV65TFInc_Usuario, GXv_char3) ;
      wpincidencias_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV102TFInc_Hdr)==0), AV102TFInc_Hdr, GXv_char2) ;
      wpincidencias_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFInc_Dia)) ? "" : localUtil.dtoc( AV46TFInc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV51TFInc_Linea) ? "" : GXutil.str( AV51TFInc_Linea, 10, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV54TFInc_Hora) ? "" : localUtil.dtoc( AV56DDO_Inc_HoraAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char15+"|"+GXt_char14+"|"+GXt_char13+"||"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV52TFInc_Linea_To) ? "" : GXutil.str( AV52TFInc_Linea_To, 10, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S222( )
   {
      /* 'LOADDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      imgAdddynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator1.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      imgAdddynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator2.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      cmbavDynamicfiltersoperator3.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV16DynamicFiltersSelector1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
         if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_DIA") == 0 )
         {
            AV18Inc_Dia1 = localUtil.ctod( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Inc_Dia1", localUtil.format(AV18Inc_Dia1, "99/99/99"));
            AV19Inc_Dia_To1 = localUtil.ctod( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Inc_Dia_To1", localUtil.format(AV19Inc_Dia_To1, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_PROG") == 0 )
         {
            AV17DynamicFiltersOperator1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
            AV20Inc_Prog1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Inc_Prog1", AV20Inc_Prog1);
         }
         else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_HDR") == 0 )
         {
            AV17DynamicFiltersOperator1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
            AV98Inc_Hdr1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98Inc_Hdr1", AV98Inc_Hdr1);
         }
         /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            lblJsdynamicfilters_Caption = "<script type=\"text/javascript\">$(document).ready(function() {" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 2, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            imgAdddynamicfilters1_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
            imgRemovedynamicfilters1_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
            AV21DynamicFiltersEnabled2 = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersEnabled2", AV21DynamicFiltersEnabled2);
            AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV22DynamicFiltersSelector2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersSelector2", AV22DynamicFiltersSelector2);
            if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_DIA") == 0 )
            {
               AV24Inc_Dia2 = localUtil.ctod( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24Inc_Dia2", localUtil.format(AV24Inc_Dia2, "99/99/99"));
               AV25Inc_Dia_To2 = localUtil.ctod( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25Inc_Dia_To2", localUtil.format(AV25Inc_Dia_To2, "99/99/99"));
            }
            else if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_PROG") == 0 )
            {
               AV23DynamicFiltersOperator2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DynamicFiltersOperator2), 4, 0));
               AV26Inc_Prog2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26Inc_Prog2", AV26Inc_Prog2);
            }
            else if ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_HDR") == 0 )
            {
               AV23DynamicFiltersOperator2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DynamicFiltersOperator2), 4, 0));
               AV99Inc_Hdr2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV99Inc_Hdr2", AV99Inc_Hdr2);
            }
            /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
            S132 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 3, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
               imgAdddynamicfilters2_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
               imgRemovedynamicfilters2_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
               AV27DynamicFiltersEnabled3 = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersEnabled3", AV27DynamicFiltersEnabled3);
               AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV28DynamicFiltersSelector3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersSelector3", AV28DynamicFiltersSelector3);
               if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_DIA") == 0 )
               {
                  AV30Inc_Dia3 = localUtil.ctod( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV30Inc_Dia3", localUtil.format(AV30Inc_Dia3, "99/99/99"));
                  AV31Inc_Dia_To3 = localUtil.ctod( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31Inc_Dia_To3", localUtil.format(AV31Inc_Dia_To3, "99/99/99"));
               }
               else if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_PROG") == 0 )
               {
                  AV29DynamicFiltersOperator3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV29DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DynamicFiltersOperator3), 4, 0));
                  AV32Inc_Prog3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Inc_Prog3", AV32Inc_Prog3);
               }
               else if ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_HDR") == 0 )
               {
                  AV29DynamicFiltersOperator3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV29DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DynamicFiltersOperator3), 4, 0));
                  AV100Inc_Hdr3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV100Inc_Hdr3", AV100Inc_Hdr3);
               }
               /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
               S142 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  if (true) return;
               }
            }
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+"});</script>" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
         }
      }
      if ( AV33DynamicFiltersRemoving )
      {
         lblJsdynamicfilters_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      }
   }

   public void S182( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV41Session.getValue(AV156Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV115FilterFullText)==0), (short)(0), AV115FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFINC_DIA", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV46TFInc_Dia)), (short)(0), GXutil.trim( localUtil.dtoc( AV46TFInc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFINC_LINEA", "", !((0==AV51TFInc_Linea)&&(0==AV52TFInc_Linea_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFInc_Linea, 10, 0)), GXutil.trim( GXutil.str( AV52TFInc_Linea_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFINC_HORA", "", !GXutil.dateCompare(GXutil.nullDate(), AV54TFInc_Hora), (short)(0), GXutil.trim( localUtil.ttoc( AV54TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFINC_PROG", "", !(GXutil.strcmp("", AV59TFInc_Prog)==0), (short)(0), AV59TFInc_Prog, "", !(GXutil.strcmp("", AV60TFInc_Prog_Sel)==0), AV60TFInc_Prog_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFINC_TERMINAL", "", !(GXutil.strcmp("", AV62TFInc_Terminal)==0), (short)(0), AV62TFInc_Terminal, "", !(GXutil.strcmp("", AV63TFInc_Terminal_Sel)==0), AV63TFInc_Terminal_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFINC_USUARIO", "", !(GXutil.strcmp("", AV65TFInc_Usuario)==0), (short)(0), AV65TFInc_Usuario, "", !(GXutil.strcmp("", AV66TFInc_Usuario_Sel)==0), AV66TFInc_Usuario_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFINC_HDR", "", !(GXutil.strcmp("", AV102TFInc_Hdr)==0), (short)(0), AV102TFInc_Hdr, "", !(GXutil.strcmp("", AV103TFInc_Hdr_Sel)==0), AV103TFInc_Hdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV156Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S202( )
   {
      /* 'SAVEDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      if ( ! AV34DynamicFiltersIgnoreFirst )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV16DynamicFiltersSelector1 );
         if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_DIA") == 0 ) && ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV18Inc_Dia1)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19Inc_Dia_To1)) ) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( localUtil.dtoc( AV18Inc_Dia1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Valueto( localUtil.dtoc( AV19Inc_Dia_To1, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         }
         else if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_PROG") == 0 ) && ! (GXutil.strcmp("", AV20Inc_Prog1)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV20Inc_Prog1 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV17DynamicFiltersOperator1 );
         }
         else if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_HDR") == 0 ) && ! (GXutil.strcmp("", AV98Inc_Hdr1)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV98Inc_Hdr1 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV17DynamicFiltersOperator1 );
         }
         if ( AV33DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
      if ( AV21DynamicFiltersEnabled2 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV22DynamicFiltersSelector2 );
         if ( ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_DIA") == 0 ) && ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24Inc_Dia2)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV25Inc_Dia_To2)) ) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( localUtil.dtoc( AV24Inc_Dia2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Valueto( localUtil.dtoc( AV25Inc_Dia_To2, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         }
         else if ( ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_PROG") == 0 ) && ! (GXutil.strcmp("", AV26Inc_Prog2)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV26Inc_Prog2 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV23DynamicFiltersOperator2 );
         }
         else if ( ( GXutil.strcmp(AV22DynamicFiltersSelector2, "INC_HDR") == 0 ) && ! (GXutil.strcmp("", AV99Inc_Hdr2)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV99Inc_Hdr2 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV23DynamicFiltersOperator2 );
         }
         if ( AV33DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
      if ( AV27DynamicFiltersEnabled3 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV28DynamicFiltersSelector3 );
         if ( ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_DIA") == 0 ) && ! ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV30Inc_Dia3)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV31Inc_Dia_To3)) ) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( localUtil.dtoc( AV30Inc_Dia3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Valueto( localUtil.dtoc( AV31Inc_Dia_To3, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         }
         else if ( ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_PROG") == 0 ) && ! (GXutil.strcmp("", AV32Inc_Prog3)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV32Inc_Prog3 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV29DynamicFiltersOperator3 );
         }
         else if ( ( GXutil.strcmp(AV28DynamicFiltersSelector3, "INC_HDR") == 0 ) && ! (GXutil.strcmp("", AV100Inc_Hdr3)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV100Inc_Hdr3 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV29DynamicFiltersOperator3 );
         }
         if ( AV33DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Valueto())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
   }

   public void S152( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV156Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCRTINC" );
      AV41Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S272( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV107XLS.getErrCode() != 0 )
      {
         AV113Filename = "" ;
         AV36ErrorMessage = AV107XLS.getErrDescription() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36ErrorMessage", AV36ErrorMessage);
         AV107XLS.Close();
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(2);
         returnInSub = true;
         if (true) return;
      }
   }

   public void wb_table1_21_F62( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV42ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_26_F62( true) ;
      }
      else
      {
         wb_table2_26_F62( false) ;
      }
      return  ;
   }

   public void wb_table2_26_F62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_F62e( true) ;
      }
      else
      {
         wb_table1_21_F62e( false) ;
      }
   }

   public void wb_table2_26_F62( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV115FilterFullText, GXutil.rtrim( localUtil.format( AV115FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfilters_Internalname, 1, 0, "px", 0, "px", "TableDynamicFilters", "left", "top", " "+"data-gx-flex"+" ", "flex-direction:column;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DynRowVisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix1_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector1.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector1, cmbavDynamicfiltersselector1.getInternalname(), GXutil.rtrim( AV16DynamicFiltersSelector1), 1, cmbavDynamicfiltersselector1.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR1.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "", true, (byte)(0), "HLP_WPIncidencias.htm");
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle1_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         wb_table3_44_F62( true) ;
      }
      else
      {
         wb_table3_44_F62( false) ;
      }
      return  ;
   }

   public void wb_table3_44_F62e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix2_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector2.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector2, cmbavDynamicfiltersselector2.getInternalname(), GXutil.rtrim( AV22DynamicFiltersSelector2), 1, cmbavDynamicfiltersselector2.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR2.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "", true, (byte)(0), "HLP_WPIncidencias.htm");
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV22DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle2_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table4_72_F62( true) ;
      }
      else
      {
         wb_table4_72_F62( false) ;
      }
      return  ;
   }

   public void wb_table4_72_F62e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix3_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector3.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector3, cmbavDynamicfiltersselector3.getInternalname(), GXutil.rtrim( AV28DynamicFiltersSelector3), 1, cmbavDynamicfiltersselector3.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR3.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "", true, (byte)(0), "HLP_WPIncidencias.htm");
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV28DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle3_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table5_100_F62( true) ;
      }
      else
      {
         wb_table5_100_F62( false) ;
      }
      return  ;
   }

   public void wb_table5_100_F62e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_26_F62e( true) ;
      }
      else
      {
         wb_table2_26_F62e( false) ;
      }
   }

   public void wb_table5_100_F62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters3_Internalname, tblTablemergeddynamicfilters3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator3.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator3, cmbavDynamicfiltersoperator3.getInternalname(), GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)), 1, cmbavDynamicfiltersoperator3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator3.getVisible(), cmbavDynamicfiltersoperator3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "", true, (byte)(0), "HLP_WPIncidencias.htm");
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_dia3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_dia_rangetext3_Internalname, httpContext.getMessage( "Inc_Dia_Range Text3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_dia_rangetext3_Internalname, AV119Inc_Dia_RangeText3, GXutil.rtrim( localUtil.format( AV119Inc_Dia_RangeText3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,107);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_dia_rangetext3_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_dia_rangetext3_Visible, edtavInc_dia_rangetext3_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_prog3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_prog3_Internalname, httpContext.getMessage( "Inc_Prog3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_prog3_Internalname, GXutil.rtrim( AV32Inc_Prog3), GXutil.rtrim( localUtil.format( AV32Inc_Prog3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_prog3_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_prog3_Visible, edtavInc_prog3_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_hdr3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_hdr3_Internalname, httpContext.getMessage( "Inc_Hdr3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_hdr3_Internalname, GXutil.rtrim( AV100Inc_Hdr3), GXutil.rtrim( localUtil.format( AV100Inc_Hdr3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_hdr3_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_hdr3_Visible, edtavInc_hdr3_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter3_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters3_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters3_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters3_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS3\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_100_F62e( true) ;
      }
      else
      {
         wb_table5_100_F62e( false) ;
      }
   }

   public void wb_table4_72_F62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters2_Internalname, tblTablemergeddynamicfilters2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator2.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator2, cmbavDynamicfiltersoperator2.getInternalname(), GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)), 1, cmbavDynamicfiltersoperator2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator2.getVisible(), cmbavDynamicfiltersoperator2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "", true, (byte)(0), "HLP_WPIncidencias.htm");
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_dia2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_dia_rangetext2_Internalname, httpContext.getMessage( "Inc_Dia_Range Text2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_dia_rangetext2_Internalname, AV118Inc_Dia_RangeText2, GXutil.rtrim( localUtil.format( AV118Inc_Dia_RangeText2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_dia_rangetext2_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_dia_rangetext2_Visible, edtavInc_dia_rangetext2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_prog2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_prog2_Internalname, httpContext.getMessage( "Inc_Prog2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_prog2_Internalname, GXutil.rtrim( AV26Inc_Prog2), GXutil.rtrim( localUtil.format( AV26Inc_Prog2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_prog2_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_prog2_Visible, edtavInc_prog2_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_hdr2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_hdr2_Internalname, httpContext.getMessage( "Inc_Hdr2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_hdr2_Internalname, GXutil.rtrim( AV99Inc_Hdr2), GXutil.rtrim( localUtil.format( AV99Inc_Hdr2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_hdr2_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_hdr2_Visible, edtavInc_hdr2_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters2_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters2_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_72_F62e( true) ;
      }
      else
      {
         wb_table4_72_F62e( false) ;
      }
   }

   public void wb_table3_44_F62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters1_Internalname, tblTablemergeddynamicfilters1_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator1.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator1, cmbavDynamicfiltersoperator1.getInternalname(), GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)), 1, cmbavDynamicfiltersoperator1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator1.getVisible(), cmbavDynamicfiltersoperator1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "", true, (byte)(0), "HLP_WPIncidencias.htm");
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_dia1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_dia_rangetext1_Internalname, httpContext.getMessage( "Inc_Dia_Range Text1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_dia_rangetext1_Internalname, AV117Inc_Dia_RangeText1, GXutil.rtrim( localUtil.format( AV117Inc_Dia_RangeText1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_dia_rangetext1_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_dia_rangetext1_Visible, edtavInc_dia_rangetext1_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_prog1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_prog1_Internalname, httpContext.getMessage( "Inc_Prog1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_prog1_Internalname, GXutil.rtrim( AV20Inc_Prog1), GXutil.rtrim( localUtil.format( AV20Inc_Prog1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_prog1_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_prog1_Visible, edtavInc_prog1_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_hdr1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_hdr1_Internalname, httpContext.getMessage( "Inc_Hdr1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_124_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_hdr1_Internalname, GXutil.rtrim( AV98Inc_Hdr1), GXutil.rtrim( localUtil.format( AV98Inc_Hdr1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_hdr1_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_hdr1_Visible, edtavInc_hdr1_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters1_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters1_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_44_F62e( true) ;
      }
      else
      {
         wb_table3_44_F62e( false) ;
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
      paF62( ) ;
      wsF62( ) ;
      weF62( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Shared/daterangepicker/daterangepicker.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211612111", true, true);
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
      httpContext.AddJavascriptSource("wpincidencias.js", "?20268211612111", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/locales.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/wwp-daterangepicker.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/moment.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/daterangepicker/daterangepicker.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DateRangePicker/DateRangePickerRender.js", "", false, true);
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

   public void subsflControlProps_1242( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_124_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_124_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_124_idx ;
      edtInc_Dia_Internalname = "INC_DIA_"+sGXsfl_124_idx ;
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_124_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_124_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_124_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_124_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_124_idx ;
      edtInc_Barcod_Internalname = "INC_BARCOD_"+sGXsfl_124_idx ;
      edtInc_BarReo_Internalname = "INC_BARREO_"+sGXsfl_124_idx ;
      edtInc_BarPar_Internalname = "INC_BARPAR_"+sGXsfl_124_idx ;
      edtavObs_Internalname = "vOBS_"+sGXsfl_124_idx ;
      edtInc_Hdr_Internalname = "INC_HDR_"+sGXsfl_124_idx ;
   }

   public void subsflControlProps_fel_1242( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_124_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_124_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_124_fel_idx ;
      edtInc_Dia_Internalname = "INC_DIA_"+sGXsfl_124_fel_idx ;
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_124_fel_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_124_fel_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_124_fel_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_124_fel_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_124_fel_idx ;
      edtInc_Barcod_Internalname = "INC_BARCOD_"+sGXsfl_124_fel_idx ;
      edtInc_BarReo_Internalname = "INC_BARREO_"+sGXsfl_124_fel_idx ;
      edtInc_BarPar_Internalname = "INC_BARPAR_"+sGXsfl_124_fel_idx ;
      edtavObs_Internalname = "vOBS_"+sGXsfl_124_fel_idx ;
      edtInc_Hdr_Internalname = "INC_HDR_"+sGXsfl_124_fel_idx ;
   }

   public void sendrow_1242( )
   {
      subsflControlProps_1242( ) ;
      wbF60( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_124_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_124_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_124_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 125,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_124_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV116GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV116GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV116GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e31f62_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,125);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV116GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_124_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Dia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Dia_Internalname,localUtil.format(A4929Inc_Dia, "99/99/99"),localUtil.format( A4929Inc_Dia, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Dia_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Linea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Linea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Hora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Hora_Internalname,localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4932Inc_Hora, "99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Hora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Hora_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Prog_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Prog_Internalname,GXutil.rtrim( A4935Inc_Prog),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Prog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Prog_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Termin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Termin_Internalname,GXutil.rtrim( A4934Inc_Termin),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Termin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Termin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Usuari_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Usuari_Internalname,GXutil.rtrim( A4933Inc_Usuari),GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Usuari_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Usuari_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Barcod_Internalname,GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5299Inc_Barcod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_BarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5300Inc_BarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_BarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_BarPar_Internalname,GXutil.rtrim( A5301Inc_BarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_BarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavObs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavObs_Enabled!=0)&&(edtavObs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 137,'',false,'"+sGXsfl_124_idx+"',124)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavObs_Internalname,AV97Obs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavObs_Enabled!=0)&&(edtavObs_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,137);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavObs_Visible),Integer.valueOf(edtavObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Hdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Hdr_Internalname,GXutil.rtrim( A13713Inc_Hdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Hdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(124),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesF62( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_124_idx = ((subGrid_Islastpage==1)&&(nGXsfl_124_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_124_idx+1) ;
         sGXsfl_124_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_124_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1242( ) ;
      }
      /* End function sendrow_1242 */
   }

   public void startgridcontrol124( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"124\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Dia_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Linea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Hora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Prog_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Programa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Termin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Usuari_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavObs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Hdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº documento", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV116GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4929Inc_Dia, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Dia_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Linea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Hora_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4935Inc_Prog));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Prog_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4934Inc_Termin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Termin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4933Inc_Usuari));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Usuari_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5301Inc_BarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV97Obs);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavObs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavObs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13713Inc_Hdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Hdr_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      bttBtnexportar_Internalname = "BTNEXPORTAR" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      lblDynamicfiltersprefix1_Internalname = "DYNAMICFILTERSPREFIX1" ;
      cmbavDynamicfiltersselector1.setInternalname( "vDYNAMICFILTERSSELECTOR1" );
      lblDynamicfiltersmiddle1_Internalname = "DYNAMICFILTERSMIDDLE1" ;
      cmbavDynamicfiltersoperator1.setInternalname( "vDYNAMICFILTERSOPERATOR1" );
      edtavInc_dia_rangetext1_Internalname = "vINC_DIA_RANGETEXT1" ;
      cellFilter_inc_dia1_cell_Internalname = "FILTER_INC_DIA1_CELL" ;
      edtavInc_prog1_Internalname = "vINC_PROG1" ;
      cellFilter_inc_prog1_cell_Internalname = "FILTER_INC_PROG1_CELL" ;
      edtavInc_hdr1_Internalname = "vINC_HDR1" ;
      cellFilter_inc_hdr1_cell_Internalname = "FILTER_INC_HDR1_CELL" ;
      imgAdddynamicfilters1_Internalname = "ADDDYNAMICFILTERS1" ;
      cellDynamicfilters_addfilter1_cell_Internalname = "DYNAMICFILTERS_ADDFILTER1_CELL" ;
      imgRemovedynamicfilters1_Internalname = "REMOVEDYNAMICFILTERS1" ;
      cellDynamicfilters_removefilter1_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER1_CELL" ;
      tblTablemergeddynamicfilters1_Internalname = "TABLEMERGEDDYNAMICFILTERS1" ;
      divTabledynamicfiltersrow1_Internalname = "TABLEDYNAMICFILTERSROW1" ;
      lblDynamicfiltersprefix2_Internalname = "DYNAMICFILTERSPREFIX2" ;
      cmbavDynamicfiltersselector2.setInternalname( "vDYNAMICFILTERSSELECTOR2" );
      lblDynamicfiltersmiddle2_Internalname = "DYNAMICFILTERSMIDDLE2" ;
      cmbavDynamicfiltersoperator2.setInternalname( "vDYNAMICFILTERSOPERATOR2" );
      edtavInc_dia_rangetext2_Internalname = "vINC_DIA_RANGETEXT2" ;
      cellFilter_inc_dia2_cell_Internalname = "FILTER_INC_DIA2_CELL" ;
      edtavInc_prog2_Internalname = "vINC_PROG2" ;
      cellFilter_inc_prog2_cell_Internalname = "FILTER_INC_PROG2_CELL" ;
      edtavInc_hdr2_Internalname = "vINC_HDR2" ;
      cellFilter_inc_hdr2_cell_Internalname = "FILTER_INC_HDR2_CELL" ;
      imgAdddynamicfilters2_Internalname = "ADDDYNAMICFILTERS2" ;
      cellDynamicfilters_addfilter2_cell_Internalname = "DYNAMICFILTERS_ADDFILTER2_CELL" ;
      imgRemovedynamicfilters2_Internalname = "REMOVEDYNAMICFILTERS2" ;
      cellDynamicfilters_removefilter2_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER2_CELL" ;
      tblTablemergeddynamicfilters2_Internalname = "TABLEMERGEDDYNAMICFILTERS2" ;
      divTabledynamicfiltersrow2_Internalname = "TABLEDYNAMICFILTERSROW2" ;
      lblDynamicfiltersprefix3_Internalname = "DYNAMICFILTERSPREFIX3" ;
      cmbavDynamicfiltersselector3.setInternalname( "vDYNAMICFILTERSSELECTOR3" );
      lblDynamicfiltersmiddle3_Internalname = "DYNAMICFILTERSMIDDLE3" ;
      cmbavDynamicfiltersoperator3.setInternalname( "vDYNAMICFILTERSOPERATOR3" );
      edtavInc_dia_rangetext3_Internalname = "vINC_DIA_RANGETEXT3" ;
      cellFilter_inc_dia3_cell_Internalname = "FILTER_INC_DIA3_CELL" ;
      edtavInc_prog3_Internalname = "vINC_PROG3" ;
      cellFilter_inc_prog3_cell_Internalname = "FILTER_INC_PROG3_CELL" ;
      edtavInc_hdr3_Internalname = "vINC_HDR3" ;
      cellFilter_inc_hdr3_cell_Internalname = "FILTER_INC_HDR3_CELL" ;
      imgRemovedynamicfilters3_Internalname = "REMOVEDYNAMICFILTERS3" ;
      cellDynamicfilters_removefilter3_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER3_CELL" ;
      tblTablemergeddynamicfilters3_Internalname = "TABLEMERGEDDYNAMICFILTERS3" ;
      divTabledynamicfiltersrow3_Internalname = "TABLEDYNAMICFILTERSROW3" ;
      divTabledynamicfilters_Internalname = "TABLEDYNAMICFILTERS" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtInc_Dia_Internalname = "INC_DIA" ;
      edtInc_Linea_Internalname = "INC_LINEA" ;
      edtInc_Hora_Internalname = "INC_HORA" ;
      edtInc_Prog_Internalname = "INC_PROG" ;
      edtInc_Termin_Internalname = "INC_TERMIN" ;
      edtInc_Usuari_Internalname = "INC_USUARI" ;
      edtInc_Barcod_Internalname = "INC_BARCOD" ;
      edtInc_BarReo_Internalname = "INC_BARREO" ;
      edtInc_BarPar_Internalname = "INC_BARPAR" ;
      edtavObs_Internalname = "vOBS" ;
      edtInc_Hdr_Internalname = "INC_HDR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Inc_dia_rangepicker1_Internalname = "INC_DIA_RANGEPICKER1" ;
      Inc_dia_rangepicker2_Internalname = "INC_DIA_RANGEPICKER2" ;
      Inc_dia_rangepicker3_Internalname = "INC_DIA_RANGEPICKER3" ;
      lblJsdynamicfilters_Internalname = "JSDYNAMICFILTERS" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_inc_diaauxdate_Internalname = "vDDO_INC_DIAAUXDATE" ;
      divDdo_inc_diaauxdates_Internalname = "DDO_INC_DIAAUXDATES" ;
      edtavDdo_inc_horaauxdate_Internalname = "vDDO_INC_HORAAUXDATE" ;
      divDdo_inc_horaauxdates_Internalname = "DDO_INC_HORAAUXDATES" ;
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
      edtInc_Hdr_Jsonclick = "" ;
      edtavObs_Jsonclick = "" ;
      edtavObs_Enabled = 1 ;
      edtInc_BarPar_Jsonclick = "" ;
      edtInc_BarReo_Jsonclick = "" ;
      edtInc_Barcod_Jsonclick = "" ;
      edtInc_Usuari_Jsonclick = "" ;
      edtInc_Termin_Jsonclick = "" ;
      edtInc_Prog_Jsonclick = "" ;
      edtInc_Hora_Jsonclick = "" ;
      edtInc_Linea_Jsonclick = "" ;
      edtInc_Dia_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgRemovedynamicfilters1_Visible = 1 ;
      imgAdddynamicfilters1_Visible = 1 ;
      edtavInc_hdr1_Jsonclick = "" ;
      edtavInc_hdr1_Enabled = 1 ;
      edtavInc_prog1_Jsonclick = "" ;
      edtavInc_prog1_Enabled = 1 ;
      edtavInc_dia_rangetext1_Jsonclick = "" ;
      edtavInc_dia_rangetext1_Enabled = 1 ;
      cmbavDynamicfiltersoperator1.setJsonclick( "" );
      cmbavDynamicfiltersoperator1.setEnabled( 1 );
      imgRemovedynamicfilters2_Visible = 1 ;
      imgAdddynamicfilters2_Visible = 1 ;
      edtavInc_hdr2_Jsonclick = "" ;
      edtavInc_hdr2_Enabled = 1 ;
      edtavInc_prog2_Jsonclick = "" ;
      edtavInc_prog2_Enabled = 1 ;
      edtavInc_dia_rangetext2_Jsonclick = "" ;
      edtavInc_dia_rangetext2_Enabled = 1 ;
      cmbavDynamicfiltersoperator2.setJsonclick( "" );
      cmbavDynamicfiltersoperator2.setEnabled( 1 );
      edtavInc_hdr3_Jsonclick = "" ;
      edtavInc_hdr3_Enabled = 1 ;
      edtavInc_prog3_Jsonclick = "" ;
      edtavInc_prog3_Enabled = 1 ;
      edtavInc_dia_rangetext3_Jsonclick = "" ;
      edtavInc_dia_rangetext3_Enabled = 1 ;
      cmbavDynamicfiltersoperator3.setJsonclick( "" );
      cmbavDynamicfiltersoperator3.setEnabled( 1 );
      cmbavDynamicfiltersselector3.setJsonclick( "" );
      cmbavDynamicfiltersselector3.setEnabled( 1 );
      cmbavDynamicfiltersselector2.setJsonclick( "" );
      cmbavDynamicfiltersselector2.setEnabled( 1 );
      cmbavDynamicfiltersselector1.setJsonclick( "" );
      cmbavDynamicfiltersselector1.setEnabled( 1 );
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbavDynamicfiltersoperator3.setVisible( 1 );
      edtavInc_hdr3_Visible = 1 ;
      edtavInc_prog3_Visible = 1 ;
      edtavInc_dia_rangetext3_Visible = 1 ;
      cmbavDynamicfiltersoperator2.setVisible( 1 );
      edtavInc_hdr2_Visible = 1 ;
      edtavInc_prog2_Visible = 1 ;
      edtavInc_dia_rangetext2_Visible = 1 ;
      cmbavDynamicfiltersoperator1.setVisible( 1 );
      edtavInc_hdr1_Visible = 1 ;
      edtavInc_prog1_Visible = 1 ;
      edtavInc_dia_rangetext1_Visible = 1 ;
      edtInc_Hdr_Visible = -1 ;
      edtavObs_Visible = -1 ;
      edtInc_Usuari_Visible = -1 ;
      edtInc_Termin_Visible = -1 ;
      edtInc_Prog_Visible = -1 ;
      edtInc_Hora_Visible = -1 ;
      edtInc_Linea_Visible = -1 ;
      edtInc_Dia_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_inc_horaauxdate_Jsonclick = "" ;
      edtavDdo_inc_diaauxdate_Jsonclick = "" ;
      lblJsdynamicfilters_Caption = httpContext.getMessage( "JSDynamicFilters", "") ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WPIncidenciasGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T|T|T||T" ;
      Ddo_grid_Filterisrange = "|T||||||" ;
      Ddo_grid_Filtertype = "Date|Numeric|Date|Character|Character|Character||Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7||" ;
      Ddo_grid_Columnids = "3:Inc_Dia|4:Inc_Linea|5:Inc_Hora|6:Inc_Prog|7:Inc_Terminal|8:Inc_Usuario|12:Obs|13:Inc_Hdr" ;
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
      Form.setCaption( httpContext.getMessage( " Control de Incidencias", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDynamicfiltersselector1.setName( "vDYNAMICFILTERSSELECTOR1" );
      cmbavDynamicfiltersselector1.setWebtags( "" );
      cmbavDynamicfiltersselector1.addItem("INC_DIA", httpContext.getMessage( "Dia", ""), (short)(0));
      cmbavDynamicfiltersselector1.addItem("INC_PROG", httpContext.getMessage( "Programa", ""), (short)(0));
      cmbavDynamicfiltersselector1.addItem("INC_HDR", httpContext.getMessage( "Nº documento", ""), (short)(0));
      if ( cmbavDynamicfiltersselector1.getItemCount() > 0 )
      {
         AV16DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV16DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      }
      cmbavDynamicfiltersoperator1.setName( "vDYNAMICFILTERSOPERATOR1" );
      cmbavDynamicfiltersoperator1.setWebtags( "" );
      cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      }
      cmbavDynamicfiltersselector2.setName( "vDYNAMICFILTERSSELECTOR2" );
      cmbavDynamicfiltersselector2.setWebtags( "" );
      cmbavDynamicfiltersselector2.addItem("INC_DIA", httpContext.getMessage( "Dia", ""), (short)(0));
      cmbavDynamicfiltersselector2.addItem("INC_PROG", httpContext.getMessage( "Programa", ""), (short)(0));
      cmbavDynamicfiltersselector2.addItem("INC_HDR", httpContext.getMessage( "Nº documento", ""), (short)(0));
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV22DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV22DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersSelector2", AV22DynamicFiltersSelector2);
      }
      cmbavDynamicfiltersoperator2.setName( "vDYNAMICFILTERSOPERATOR2" );
      cmbavDynamicfiltersoperator2.setWebtags( "" );
      cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV23DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV23DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DynamicFiltersOperator2), 4, 0));
      }
      cmbavDynamicfiltersselector3.setName( "vDYNAMICFILTERSSELECTOR3" );
      cmbavDynamicfiltersselector3.setWebtags( "" );
      cmbavDynamicfiltersselector3.addItem("INC_DIA", httpContext.getMessage( "Dia", ""), (short)(0));
      cmbavDynamicfiltersselector3.addItem("INC_PROG", httpContext.getMessage( "Programa", ""), (short)(0));
      cmbavDynamicfiltersselector3.addItem("INC_HDR", httpContext.getMessage( "Nº documento", ""), (short)(0));
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV28DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV28DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28DynamicFiltersSelector3", AV28DynamicFiltersSelector3);
      }
      cmbavDynamicfiltersoperator3.setName( "vDYNAMICFILTERSOPERATOR3" );
      cmbavDynamicfiltersoperator3.setWebtags( "" );
      cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV29DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV29DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29DynamicFiltersOperator3), 4, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_124_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV116GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV116GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV116GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e17F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e30F62',iparms:[{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV116GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV97Obs',fld:'vOBS',pic:'',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e18F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'ADDDYNAMICFILTERS1'","{handler:'e23F62',iparms:[]");
      setEventMetadata("'ADDDYNAMICFILTERS1'",",oparms:[{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'","{handler:'e19F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'",",oparms:[{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'cmbavDynamicfiltersoperator1'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersoperator2'},{av:'cmbavDynamicfiltersoperator3'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'edtavInc_dia_rangetext2_Visible',ctrl:'vINC_DIA_RANGETEXT2',prop:'Visible'},{av:'edtavInc_prog2_Visible',ctrl:'vINC_PROG2',prop:'Visible'},{av:'edtavInc_hdr2_Visible',ctrl:'vINC_HDR2',prop:'Visible'},{av:'edtavInc_dia_rangetext3_Visible',ctrl:'vINC_DIA_RANGETEXT3',prop:'Visible'},{av:'edtavInc_prog3_Visible',ctrl:'vINC_PROG3',prop:'Visible'},{av:'edtavInc_hdr3_Visible',ctrl:'vINC_HDR3',prop:'Visible'},{av:'edtavInc_dia_rangetext1_Visible',ctrl:'vINC_DIA_RANGETEXT1',prop:'Visible'},{av:'edtavInc_prog1_Visible',ctrl:'vINC_PROG1',prop:'Visible'},{av:'edtavInc_hdr1_Visible',ctrl:'vINC_HDR1',prop:'Visible'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK","{handler:'e24F62',iparms:[{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'edtavInc_dia_rangetext1_Visible',ctrl:'vINC_DIA_RANGETEXT1',prop:'Visible'},{av:'edtavInc_prog1_Visible',ctrl:'vINC_PROG1',prop:'Visible'},{av:'edtavInc_hdr1_Visible',ctrl:'vINC_HDR1',prop:'Visible'}]}");
      setEventMetadata("INC_DIA_RANGEPICKER1.DATERANGECHANGED","{handler:'e14F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true}]");
      setEventMetadata("INC_DIA_RANGEPICKER1.DATERANGECHANGED",",oparms:[{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'ADDDYNAMICFILTERS2'","{handler:'e25F62',iparms:[]");
      setEventMetadata("'ADDDYNAMICFILTERS2'",",oparms:[{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'","{handler:'e20F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'",",oparms:[{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'cmbavDynamicfiltersoperator1'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersoperator2'},{av:'cmbavDynamicfiltersoperator3'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'edtavInc_dia_rangetext2_Visible',ctrl:'vINC_DIA_RANGETEXT2',prop:'Visible'},{av:'edtavInc_prog2_Visible',ctrl:'vINC_PROG2',prop:'Visible'},{av:'edtavInc_hdr2_Visible',ctrl:'vINC_HDR2',prop:'Visible'},{av:'edtavInc_dia_rangetext3_Visible',ctrl:'vINC_DIA_RANGETEXT3',prop:'Visible'},{av:'edtavInc_prog3_Visible',ctrl:'vINC_PROG3',prop:'Visible'},{av:'edtavInc_hdr3_Visible',ctrl:'vINC_HDR3',prop:'Visible'},{av:'edtavInc_dia_rangetext1_Visible',ctrl:'vINC_DIA_RANGETEXT1',prop:'Visible'},{av:'edtavInc_prog1_Visible',ctrl:'vINC_PROG1',prop:'Visible'},{av:'edtavInc_hdr1_Visible',ctrl:'vINC_HDR1',prop:'Visible'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK","{handler:'e26F62',iparms:[{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'edtavInc_dia_rangetext2_Visible',ctrl:'vINC_DIA_RANGETEXT2',prop:'Visible'},{av:'edtavInc_prog2_Visible',ctrl:'vINC_PROG2',prop:'Visible'},{av:'edtavInc_hdr2_Visible',ctrl:'vINC_HDR2',prop:'Visible'}]}");
      setEventMetadata("INC_DIA_RANGEPICKER2.DATERANGECHANGED","{handler:'e15F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true}]");
      setEventMetadata("INC_DIA_RANGEPICKER2.DATERANGECHANGED",",oparms:[{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'","{handler:'e21F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'",",oparms:[{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'cmbavDynamicfiltersoperator1'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersoperator2'},{av:'cmbavDynamicfiltersoperator3'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'edtavInc_dia_rangetext2_Visible',ctrl:'vINC_DIA_RANGETEXT2',prop:'Visible'},{av:'edtavInc_prog2_Visible',ctrl:'vINC_PROG2',prop:'Visible'},{av:'edtavInc_hdr2_Visible',ctrl:'vINC_HDR2',prop:'Visible'},{av:'edtavInc_dia_rangetext3_Visible',ctrl:'vINC_DIA_RANGETEXT3',prop:'Visible'},{av:'edtavInc_prog3_Visible',ctrl:'vINC_PROG3',prop:'Visible'},{av:'edtavInc_hdr3_Visible',ctrl:'vINC_HDR3',prop:'Visible'},{av:'edtavInc_dia_rangetext1_Visible',ctrl:'vINC_DIA_RANGETEXT1',prop:'Visible'},{av:'edtavInc_prog1_Visible',ctrl:'vINC_PROG1',prop:'Visible'},{av:'edtavInc_hdr1_Visible',ctrl:'vINC_HDR1',prop:'Visible'},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK","{handler:'e27F62',iparms:[{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'edtavInc_dia_rangetext3_Visible',ctrl:'vINC_DIA_RANGETEXT3',prop:'Visible'},{av:'edtavInc_prog3_Visible',ctrl:'vINC_PROG3',prop:'Visible'},{av:'edtavInc_hdr3_Visible',ctrl:'vINC_HDR3',prop:'Visible'}]}");
      setEventMetadata("INC_DIA_RANGEPICKER3.DATERANGECHANGED","{handler:'e16F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true}]");
      setEventMetadata("INC_DIA_RANGEPICKER3.DATERANGECHANGED",",oparms:[{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11F62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV156Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV34DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV33DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV56DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV44ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV115FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV46TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV51TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV52TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV54TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV59TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV60TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV62TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV63TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV65TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV66TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV102TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV103TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV18Inc_Dia1',fld:'vINC_DIA1',pic:''},{av:'AV19Inc_Dia_To1',fld:'vINC_DIA_TO1',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV56DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'cmbavDynamicfiltersoperator1'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersoperator2'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV20Inc_Prog1',fld:'vINC_PROG1',pic:''},{av:'AV98Inc_Hdr1',fld:'vINC_HDR1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV21DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV22DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV24Inc_Dia2',fld:'vINC_DIA2',pic:''},{av:'AV25Inc_Dia_To2',fld:'vINC_DIA_TO2',pic:''},{av:'AV23DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV26Inc_Prog2',fld:'vINC_PROG2',pic:''},{av:'AV99Inc_Hdr2',fld:'vINC_HDR2',pic:''},{av:'AV27DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV28DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV30Inc_Dia3',fld:'vINC_DIA3',pic:''},{av:'AV31Inc_Dia_To3',fld:'vINC_DIA_TO3',pic:''},{av:'AV29DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV32Inc_Prog3',fld:'vINC_PROG3',pic:''},{av:'AV100Inc_Hdr3',fld:'vINC_HDR3',pic:''},{av:'edtavInc_dia_rangetext1_Visible',ctrl:'vINC_DIA_RANGETEXT1',prop:'Visible'},{av:'edtavInc_prog1_Visible',ctrl:'vINC_PROG1',prop:'Visible'},{av:'edtavInc_hdr1_Visible',ctrl:'vINC_HDR1',prop:'Visible'},{av:'edtavInc_dia_rangetext2_Visible',ctrl:'vINC_DIA_RANGETEXT2',prop:'Visible'},{av:'edtavInc_prog2_Visible',ctrl:'vINC_PROG2',prop:'Visible'},{av:'edtavInc_hdr2_Visible',ctrl:'vINC_HDR2',prop:'Visible'},{av:'edtavInc_dia_rangetext3_Visible',ctrl:'vINC_DIA_RANGETEXT3',prop:'Visible'},{av:'edtavInc_prog3_Visible',ctrl:'vINC_PROG3',prop:'Visible'},{av:'edtavInc_hdr3_Visible',ctrl:'vINC_HDR3',prop:'Visible'},{av:'AV39ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavObs_Visible',ctrl:'vOBS',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'AV82GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV83GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV42ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e31F62',iparms:[{av:'cmbavGridactions'},{av:'AV116GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4929Inc_Dia',fld:'INC_DIA',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV116GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORTAR'","{handler:'e22F62',iparms:[{av:'AV157Pgmdesc',fld:'vPGMDESC',pic:'',hsh:true},{av:'A4929Inc_Dia',fld:'INC_DIA',grid:124,pic:'',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_124',ctrl:'GRID',grid:124,prop:'GridRC',grid:124},{av:'A4931Inc_Linea',fld:'INC_LINEA',grid:124,pic:'ZZZZZZZZZ9',hsh:true},{av:'A4932Inc_Hora',fld:'INC_HORA',grid:124,pic:'99:99:99',hsh:true},{av:'A4934Inc_Termin',fld:'INC_TERMIN',grid:124,pic:'',hsh:true},{av:'A4933Inc_Usuari',fld:'INC_USUARI',grid:124,pic:'@!',hsh:true},{av:'A4935Inc_Prog',fld:'INC_PROG',grid:124,pic:'',hsh:true},{av:'A13713Inc_Hdr',fld:'INC_HDR',grid:124,pic:'',hsh:true},{av:'AV97Obs',fld:'vOBS',grid:124,pic:'',hsh:true},{av:'AV36ErrorMessage',fld:'vERRORMESSAGE',pic:''}]");
      setEventMetadata("'DOEXPORTAR'",",oparms:[{av:'AV36ErrorMessage',fld:'vERRORMESSAGE',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_hdr',iparms:[]");
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
      AV107XLS.cleanup();
   }

   protected void CloseOpenCursors( )
   {
      pr_default.close(2);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
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
      AV115FilterFullText = "" ;
      AV16DynamicFiltersSelector1 = "" ;
      AV20Inc_Prog1 = "" ;
      AV98Inc_Hdr1 = "" ;
      AV22DynamicFiltersSelector2 = "" ;
      AV26Inc_Prog2 = "" ;
      AV99Inc_Hdr2 = "" ;
      AV28DynamicFiltersSelector3 = "" ;
      AV32Inc_Prog3 = "" ;
      AV100Inc_Hdr3 = "" ;
      AV18Inc_Dia1 = GXutil.nullDate() ;
      AV24Inc_Dia2 = GXutil.nullDate() ;
      AV30Inc_Dia3 = GXutil.nullDate() ;
      AV39ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV19Inc_Dia_To1 = GXutil.nullDate() ;
      AV25Inc_Dia_To2 = GXutil.nullDate() ;
      AV31Inc_Dia_To3 = GXutil.nullDate() ;
      AV46TFInc_Dia = GXutil.nullDate() ;
      AV54TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV59TFInc_Prog = "" ;
      AV60TFInc_Prog_Sel = "" ;
      AV62TFInc_Terminal = "" ;
      AV63TFInc_Terminal_Sel = "" ;
      AV65TFInc_Usuario = "" ;
      AV66TFInc_Usuario_Sel = "" ;
      AV102TFInc_Hdr = "" ;
      AV103TFInc_Hdr_Sel = "" ;
      AV156Pgmname = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A4936Inc_Obs = "" ;
      AV157Pgmdesc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV42ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV80DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV36ErrorMessage = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      bttBtnexportar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucInc_dia_rangepicker1 = new com.genexus.webpanels.GXUserControl();
      ucInc_dia_rangepicker2 = new com.genexus.webpanels.GXUserControl();
      ucInc_dia_rangepicker3 = new com.genexus.webpanels.GXUserControl();
      lblJsdynamicfilters_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV48DDO_Inc_DiaAuxDate = GXutil.nullDate() ;
      AV56DDO_Inc_HoraAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A407EmprNom = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4935Inc_Prog = "" ;
      A4934Inc_Termin = "" ;
      A4933Inc_Usuari = "" ;
      A5301Inc_BarPar = "" ;
      AV97Obs = "" ;
      A13713Inc_Hdr = "" ;
      scmdbuf = "" ;
      AV123Wpincidenciasds_1_filterfulltext = "" ;
      AV124Wpincidenciasds_2_dynamicfiltersselector1 = "" ;
      AV126Wpincidenciasds_4_inc_dia1 = GXutil.nullDate() ;
      AV127Wpincidenciasds_5_inc_dia_to1 = GXutil.nullDate() ;
      AV128Wpincidenciasds_6_inc_prog1 = "" ;
      AV129Wpincidenciasds_7_inc_hdr1 = "" ;
      AV131Wpincidenciasds_9_dynamicfiltersselector2 = "" ;
      AV133Wpincidenciasds_11_inc_dia2 = GXutil.nullDate() ;
      AV134Wpincidenciasds_12_inc_dia_to2 = GXutil.nullDate() ;
      AV135Wpincidenciasds_13_inc_prog2 = "" ;
      AV136Wpincidenciasds_14_inc_hdr2 = "" ;
      AV138Wpincidenciasds_16_dynamicfiltersselector3 = "" ;
      AV140Wpincidenciasds_18_inc_dia3 = GXutil.nullDate() ;
      AV141Wpincidenciasds_19_inc_dia_to3 = GXutil.nullDate() ;
      AV142Wpincidenciasds_20_inc_prog3 = "" ;
      AV143Wpincidenciasds_21_inc_hdr3 = "" ;
      AV144Wpincidenciasds_22_tfinc_dia = GXutil.nullDate() ;
      AV147Wpincidenciasds_25_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV149Wpincidenciasds_27_tfinc_prog_sel = "" ;
      AV148Wpincidenciasds_26_tfinc_prog = "" ;
      AV151Wpincidenciasds_29_tfinc_terminal_sel = "" ;
      AV150Wpincidenciasds_28_tfinc_terminal = "" ;
      AV153Wpincidenciasds_31_tfinc_usuario_sel = "" ;
      AV152Wpincidenciasds_30_tfinc_usuario = "" ;
      AV155Wpincidenciasds_33_tfinc_hdr_sel = "" ;
      AV154Wpincidenciasds_32_tfinc_hdr = "" ;
      H00F62_A396EmprCod = new String[] {""} ;
      H00F62_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H00F62_A407EmprNom = new String[] {""} ;
      H00F62_n407EmprNom = new boolean[] {false} ;
      H00F63_AGRID_nRecordCount = new long[1] ;
      H00F64_A407EmprNom = new String[] {""} ;
      H00F64_n407EmprNom = new boolean[] {false} ;
      AV117Inc_Dia_RangeText1 = "" ;
      AV118Inc_Dia_RangeText2 = "" ;
      AV119Inc_Dia_RangeText3 = "" ;
      AV94Station = "" ;
      AV88EmprNom = "" ;
      AV89UsurCod = "" ;
      AV86Inc_Dia = GXutil.nullDate() ;
      AV87Inc_Dia_To = GXutil.nullDate() ;
      AV122Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      imgAdddynamicfilters1_Jsonclick = "" ;
      imgRemovedynamicfilters1_Jsonclick = "" ;
      imgAdddynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters3_Jsonclick = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41Session = httpContext.getWebSession();
      AV37ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV43ManageFiltersXml = "" ;
      AV104NomInf = "" ;
      AV113Filename = "" ;
      AV107XLS = new com.genexus.gxoffice.ExcelDoc();
      GXt_dtime8 = GXutil.resetTime( GXutil.nullDate() );
      AV38UserCustomValue = "" ;
      AV40ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV12GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      GXv_SdtWWPGridState17 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      lblDynamicfiltersprefix1_Jsonclick = "" ;
      lblDynamicfiltersmiddle1_Jsonclick = "" ;
      lblDynamicfiltersprefix2_Jsonclick = "" ;
      lblDynamicfiltersmiddle2_Jsonclick = "" ;
      lblDynamicfiltersprefix3_Jsonclick = "" ;
      lblDynamicfiltersmiddle3_Jsonclick = "" ;
      imgRemovedynamicfilters3_gximage = "" ;
      sImgUrl = "" ;
      imgAdddynamicfilters2_gximage = "" ;
      imgRemovedynamicfilters2_gximage = "" ;
      imgAdddynamicfilters1_gximage = "" ;
      imgRemovedynamicfilters1_gximage = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpincidencias__default(),
         new Object[] {
             new Object[] {
            H00F62_A396EmprCod, H00F62_A4929Inc_Dia, H00F62_A407EmprNom, H00F62_n407EmprNom
            }
            , new Object[] {
            H00F63_AGRID_nRecordCount
            }
            , new Object[] {
            H00F64_A407EmprNom, H00F64_n407EmprNom
            }
         }
      );
      AV157Pgmdesc = httpContext.getMessage( " Control de Incidencias", "") ;
      AV156Pgmname = "WPIncidencias" ;
      /* GeneXus formulas. */
      AV157Pgmdesc = httpContext.getMessage( " Control de Incidencias", "") ;
      AV156Pgmname = "WPIncidencias" ;
      Gx_err = (short)(0) ;
      edtavObs_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV44ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A5300Inc_BarReo ;
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
   private short AV17DynamicFiltersOperator1 ;
   private short AV23DynamicFiltersOperator2 ;
   private short AV29DynamicFiltersOperator3 ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV116GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV125Wpincidenciasds_3_dynamicfiltersoperator1 ;
   private short AV132Wpincidenciasds_10_dynamicfiltersoperator2 ;
   private short AV139Wpincidenciasds_17_dynamicfiltersoperator3 ;
   private short AV95Nlin ;
   private short AV96i ;
   private short AV108Row ;
   private short AV109Col ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_124 ;
   private int nGXsfl_124_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A5299Inc_Barcod ;
   private int subGrid_Islastpage ;
   private int edtavObs_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtInc_Dia_Visible ;
   private int edtInc_Linea_Visible ;
   private int edtInc_Hora_Visible ;
   private int edtInc_Prog_Visible ;
   private int edtInc_Termin_Visible ;
   private int edtInc_Usuari_Visible ;
   private int edtavObs_Visible ;
   private int edtInc_Hdr_Visible ;
   private int AV81PageToGo ;
   private int imgAdddynamicfilters1_Visible ;
   private int imgRemovedynamicfilters1_Visible ;
   private int imgAdddynamicfilters2_Visible ;
   private int imgRemovedynamicfilters2_Visible ;
   private int AV112Random ;
   private int nGXsfl_124_fel_idx=1 ;
   private int edtavInc_dia_rangetext1_Visible ;
   private int edtavInc_prog1_Visible ;
   private int edtavInc_hdr1_Visible ;
   private int edtavInc_dia_rangetext2_Visible ;
   private int edtavInc_prog2_Visible ;
   private int edtavInc_hdr2_Visible ;
   private int edtavInc_dia_rangetext3_Visible ;
   private int edtavInc_prog3_Visible ;
   private int edtavInc_hdr3_Visible ;
   private int AV159GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavInc_dia_rangetext3_Enabled ;
   private int edtavInc_prog3_Enabled ;
   private int edtavInc_hdr3_Enabled ;
   private int edtavInc_dia_rangetext2_Enabled ;
   private int edtavInc_prog2_Enabled ;
   private int edtavInc_hdr2_Enabled ;
   private int edtavInc_dia_rangetext1_Enabled ;
   private int edtavInc_prog1_Enabled ;
   private int edtavInc_hdr1_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV51TFInc_Linea ;
   private long AV52TFInc_Linea_To ;
   private long AV82GridCurrentPage ;
   private long AV83GridPageCount ;
   private long A4931Inc_Linea ;
   private long GRID_nCurrentRecord ;
   private long AV145Wpincidenciasds_23_tfinc_linea ;
   private long AV146Wpincidenciasds_24_tfinc_linea_to ;
   private long GRID_nRecordCount ;
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
   private String sGXsfl_124_idx="0001" ;
   private String A396EmprCod ;
   private String AV20Inc_Prog1 ;
   private String AV98Inc_Hdr1 ;
   private String AV26Inc_Prog2 ;
   private String AV99Inc_Hdr2 ;
   private String AV32Inc_Prog3 ;
   private String AV100Inc_Hdr3 ;
   private String AV59TFInc_Prog ;
   private String AV60TFInc_Prog_Sel ;
   private String AV62TFInc_Terminal ;
   private String AV63TFInc_Terminal_Sel ;
   private String AV65TFInc_Usuario ;
   private String AV66TFInc_Usuario_Sel ;
   private String AV102TFInc_Hdr ;
   private String AV103TFInc_Hdr_Sel ;
   private String AV156Pgmname ;
   private String AV157Pgmdesc ;
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
   private String Grid_empowerer_Fixedcolumns ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String bttBtnexportar_Internalname ;
   private String bttBtnexportar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Inc_dia_rangepicker1_Internalname ;
   private String Inc_dia_rangepicker2_Internalname ;
   private String Inc_dia_rangepicker3_Internalname ;
   private String lblJsdynamicfilters_Internalname ;
   private String lblJsdynamicfilters_Caption ;
   private String lblJsdynamicfilters_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_inc_diaauxdates_Internalname ;
   private String edtavDdo_inc_diaauxdate_Internalname ;
   private String edtavDdo_inc_diaauxdate_Jsonclick ;
   private String divDdo_inc_horaauxdates_Internalname ;
   private String edtavDdo_inc_horaauxdate_Internalname ;
   private String edtavDdo_inc_horaauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtInc_Dia_Internalname ;
   private String edtInc_Linea_Internalname ;
   private String edtInc_Hora_Internalname ;
   private String A4935Inc_Prog ;
   private String edtInc_Prog_Internalname ;
   private String A4934Inc_Termin ;
   private String edtInc_Termin_Internalname ;
   private String A4933Inc_Usuari ;
   private String edtInc_Usuari_Internalname ;
   private String edtInc_Barcod_Internalname ;
   private String edtInc_BarReo_Internalname ;
   private String A5301Inc_BarPar ;
   private String edtInc_BarPar_Internalname ;
   private String edtavObs_Internalname ;
   private String A13713Inc_Hdr ;
   private String edtInc_Hdr_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String AV128Wpincidenciasds_6_inc_prog1 ;
   private String AV129Wpincidenciasds_7_inc_hdr1 ;
   private String AV135Wpincidenciasds_13_inc_prog2 ;
   private String AV136Wpincidenciasds_14_inc_hdr2 ;
   private String AV142Wpincidenciasds_20_inc_prog3 ;
   private String AV143Wpincidenciasds_21_inc_hdr3 ;
   private String AV149Wpincidenciasds_27_tfinc_prog_sel ;
   private String AV148Wpincidenciasds_26_tfinc_prog ;
   private String AV151Wpincidenciasds_29_tfinc_terminal_sel ;
   private String AV150Wpincidenciasds_28_tfinc_terminal ;
   private String AV153Wpincidenciasds_31_tfinc_usuario_sel ;
   private String AV152Wpincidenciasds_30_tfinc_usuario ;
   private String AV155Wpincidenciasds_33_tfinc_hdr_sel ;
   private String AV154Wpincidenciasds_32_tfinc_hdr ;
   private String edtavInc_dia_rangetext1_Internalname ;
   private String edtavInc_prog1_Internalname ;
   private String edtavInc_hdr1_Internalname ;
   private String edtavInc_dia_rangetext2_Internalname ;
   private String edtavInc_prog2_Internalname ;
   private String edtavInc_hdr2_Internalname ;
   private String edtavInc_dia_rangetext3_Internalname ;
   private String edtavInc_prog3_Internalname ;
   private String edtavInc_hdr3_Internalname ;
   private String AV94Station ;
   private String AV88EmprNom ;
   private String AV89UsurCod ;
   private String AV122Emprcod ;
   private String imgAdddynamicfilters1_Jsonclick ;
   private String divTabledynamicfilters_Internalname ;
   private String imgAdddynamicfilters1_Internalname ;
   private String imgRemovedynamicfilters1_Jsonclick ;
   private String imgRemovedynamicfilters1_Internalname ;
   private String imgAdddynamicfilters2_Jsonclick ;
   private String imgAdddynamicfilters2_Internalname ;
   private String imgRemovedynamicfilters2_Jsonclick ;
   private String imgRemovedynamicfilters2_Internalname ;
   private String imgRemovedynamicfilters3_Jsonclick ;
   private String imgRemovedynamicfilters3_Internalname ;
   private String AV104NomInf ;
   private String sGXsfl_124_fel_idx="0001" ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String divTabledynamicfiltersrow1_Internalname ;
   private String lblDynamicfiltersprefix1_Internalname ;
   private String lblDynamicfiltersprefix1_Jsonclick ;
   private String lblDynamicfiltersmiddle1_Internalname ;
   private String lblDynamicfiltersmiddle1_Jsonclick ;
   private String divTabledynamicfiltersrow2_Internalname ;
   private String lblDynamicfiltersprefix2_Internalname ;
   private String lblDynamicfiltersprefix2_Jsonclick ;
   private String lblDynamicfiltersmiddle2_Internalname ;
   private String lblDynamicfiltersmiddle2_Jsonclick ;
   private String divTabledynamicfiltersrow3_Internalname ;
   private String lblDynamicfiltersprefix3_Internalname ;
   private String lblDynamicfiltersprefix3_Jsonclick ;
   private String lblDynamicfiltersmiddle3_Internalname ;
   private String lblDynamicfiltersmiddle3_Jsonclick ;
   private String tblTablemergeddynamicfilters3_Internalname ;
   private String cellFilter_inc_dia3_cell_Internalname ;
   private String edtavInc_dia_rangetext3_Jsonclick ;
   private String cellFilter_inc_prog3_cell_Internalname ;
   private String edtavInc_prog3_Jsonclick ;
   private String cellFilter_inc_hdr3_cell_Internalname ;
   private String edtavInc_hdr3_Jsonclick ;
   private String cellDynamicfilters_removefilter3_cell_Internalname ;
   private String imgRemovedynamicfilters3_gximage ;
   private String sImgUrl ;
   private String tblTablemergeddynamicfilters2_Internalname ;
   private String cellFilter_inc_dia2_cell_Internalname ;
   private String edtavInc_dia_rangetext2_Jsonclick ;
   private String cellFilter_inc_prog2_cell_Internalname ;
   private String edtavInc_prog2_Jsonclick ;
   private String cellFilter_inc_hdr2_cell_Internalname ;
   private String edtavInc_hdr2_Jsonclick ;
   private String cellDynamicfilters_addfilter2_cell_Internalname ;
   private String imgAdddynamicfilters2_gximage ;
   private String cellDynamicfilters_removefilter2_cell_Internalname ;
   private String imgRemovedynamicfilters2_gximage ;
   private String tblTablemergeddynamicfilters1_Internalname ;
   private String cellFilter_inc_dia1_cell_Internalname ;
   private String edtavInc_dia_rangetext1_Jsonclick ;
   private String cellFilter_inc_prog1_cell_Internalname ;
   private String edtavInc_prog1_Jsonclick ;
   private String cellFilter_inc_hdr1_cell_Internalname ;
   private String edtavInc_hdr1_Jsonclick ;
   private String cellDynamicfilters_addfilter1_cell_Internalname ;
   private String imgAdddynamicfilters1_gximage ;
   private String cellDynamicfilters_removefilter1_cell_Internalname ;
   private String imgRemovedynamicfilters1_gximage ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtInc_Dia_Jsonclick ;
   private String edtInc_Linea_Jsonclick ;
   private String edtInc_Hora_Jsonclick ;
   private String edtInc_Prog_Jsonclick ;
   private String edtInc_Termin_Jsonclick ;
   private String edtInc_Usuari_Jsonclick ;
   private String edtInc_Barcod_Jsonclick ;
   private String edtInc_BarReo_Jsonclick ;
   private String edtInc_BarPar_Jsonclick ;
   private String edtavObs_Jsonclick ;
   private String edtInc_Hdr_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV54TFInc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV147Wpincidenciasds_25_tfinc_hora ;
   private java.util.Date GXt_dtime8 ;
   private java.util.Date AV18Inc_Dia1 ;
   private java.util.Date AV24Inc_Dia2 ;
   private java.util.Date AV30Inc_Dia3 ;
   private java.util.Date AV19Inc_Dia_To1 ;
   private java.util.Date AV25Inc_Dia_To2 ;
   private java.util.Date AV31Inc_Dia_To3 ;
   private java.util.Date AV46TFInc_Dia ;
   private java.util.Date AV48DDO_Inc_DiaAuxDate ;
   private java.util.Date AV56DDO_Inc_HoraAuxDate ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV126Wpincidenciasds_4_inc_dia1 ;
   private java.util.Date AV127Wpincidenciasds_5_inc_dia_to1 ;
   private java.util.Date AV133Wpincidenciasds_11_inc_dia2 ;
   private java.util.Date AV134Wpincidenciasds_12_inc_dia_to2 ;
   private java.util.Date AV140Wpincidenciasds_18_inc_dia3 ;
   private java.util.Date AV141Wpincidenciasds_19_inc_dia_to3 ;
   private java.util.Date AV144Wpincidenciasds_22_tfinc_dia ;
   private java.util.Date AV86Inc_Dia ;
   private java.util.Date AV87Inc_Dia_To ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV21DynamicFiltersEnabled2 ;
   private boolean AV27DynamicFiltersEnabled3 ;
   private boolean AV14OrderedDsc ;
   private boolean AV34DynamicFiltersIgnoreFirst ;
   private boolean AV33DynamicFiltersRemoving ;
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
   private boolean n407EmprNom ;
   private boolean bGXsfl_124_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean AV130Wpincidenciasds_8_dynamicfiltersenabled2 ;
   private boolean AV137Wpincidenciasds_15_dynamicfiltersenabled3 ;
   private boolean returnInSub ;
   private boolean AV114AplicarConfirmar ;
   private boolean gx_refresh_fired ;
   private String AV37ColumnsSelectorXML ;
   private String AV43ManageFiltersXml ;
   private String AV38UserCustomValue ;
   private String AV115FilterFullText ;
   private String AV16DynamicFiltersSelector1 ;
   private String AV22DynamicFiltersSelector2 ;
   private String AV28DynamicFiltersSelector3 ;
   private String A4936Inc_Obs ;
   private String AV36ErrorMessage ;
   private String AV97Obs ;
   private String AV123Wpincidenciasds_1_filterfulltext ;
   private String AV124Wpincidenciasds_2_dynamicfiltersselector1 ;
   private String AV131Wpincidenciasds_9_dynamicfiltersselector2 ;
   private String AV138Wpincidenciasds_16_dynamicfiltersselector3 ;
   private String AV117Inc_Dia_RangeText1 ;
   private String AV118Inc_Dia_RangeText2 ;
   private String AV119Inc_Dia_RangeText3 ;
   private String AV113Filename ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV41Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucInc_dia_rangepicker1 ;
   private com.genexus.webpanels.GXUserControl ucInc_dia_rangepicker2 ;
   private com.genexus.webpanels.GXUserControl ucInc_dia_rangepicker3 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavDynamicfiltersselector1 ;
   private HTMLChoice cmbavDynamicfiltersoperator1 ;
   private HTMLChoice cmbavDynamicfiltersselector2 ;
   private HTMLChoice cmbavDynamicfiltersoperator2 ;
   private HTMLChoice cmbavDynamicfiltersselector3 ;
   private HTMLChoice cmbavDynamicfiltersoperator3 ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H00F62_A396EmprCod ;
   private java.util.Date[] H00F62_A4929Inc_Dia ;
   private String[] H00F62_A407EmprNom ;
   private boolean[] H00F62_n407EmprNom ;
   private long[] H00F63_AGRID_nRecordCount ;
   private String[] H00F64_A407EmprNom ;
   private boolean[] H00F64_n407EmprNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.gxoffice.ExcelDoc AV107XLS ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV42ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item11 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV39ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV40ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV80DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState17[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV12GridStateDynamicFilter ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wpincidencias__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00F62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Wpincidenciasds_1_filterfulltext ,
                                          String AV124Wpincidenciasds_2_dynamicfiltersselector1 ,
                                          java.util.Date AV126Wpincidenciasds_4_inc_dia1 ,
                                          java.util.Date AV127Wpincidenciasds_5_inc_dia_to1 ,
                                          short AV125Wpincidenciasds_3_dynamicfiltersoperator1 ,
                                          String AV128Wpincidenciasds_6_inc_prog1 ,
                                          String AV129Wpincidenciasds_7_inc_hdr1 ,
                                          boolean AV130Wpincidenciasds_8_dynamicfiltersenabled2 ,
                                          String AV131Wpincidenciasds_9_dynamicfiltersselector2 ,
                                          java.util.Date AV133Wpincidenciasds_11_inc_dia2 ,
                                          java.util.Date AV134Wpincidenciasds_12_inc_dia_to2 ,
                                          short AV132Wpincidenciasds_10_dynamicfiltersoperator2 ,
                                          String AV135Wpincidenciasds_13_inc_prog2 ,
                                          String AV136Wpincidenciasds_14_inc_hdr2 ,
                                          boolean AV137Wpincidenciasds_15_dynamicfiltersenabled3 ,
                                          String AV138Wpincidenciasds_16_dynamicfiltersselector3 ,
                                          java.util.Date AV140Wpincidenciasds_18_inc_dia3 ,
                                          java.util.Date AV141Wpincidenciasds_19_inc_dia_to3 ,
                                          short AV139Wpincidenciasds_17_dynamicfiltersoperator3 ,
                                          String AV142Wpincidenciasds_20_inc_prog3 ,
                                          String AV143Wpincidenciasds_21_inc_hdr3 ,
                                          java.util.Date AV144Wpincidenciasds_22_tfinc_dia ,
                                          long AV145Wpincidenciasds_23_tfinc_linea ,
                                          long AV146Wpincidenciasds_24_tfinc_linea_to ,
                                          java.util.Date AV147Wpincidenciasds_25_tfinc_hora ,
                                          String AV149Wpincidenciasds_27_tfinc_prog_sel ,
                                          String AV148Wpincidenciasds_26_tfinc_prog ,
                                          String AV151Wpincidenciasds_29_tfinc_terminal_sel ,
                                          String AV150Wpincidenciasds_28_tfinc_terminal ,
                                          String AV153Wpincidenciasds_31_tfinc_usuario_sel ,
                                          String AV152Wpincidenciasds_30_tfinc_usuario ,
                                          String AV155Wpincidenciasds_33_tfinc_hdr_sel ,
                                          String AV154Wpincidenciasds_32_tfinc_hdr ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[13];
      Object[] GXv_Object19 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.Inc_Dia, T2.EmprNom" ;
      sFromString = " FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ( GXutil.strcmp(AV124Wpincidenciasds_2_dynamicfiltersselector1, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Wpincidenciasds_4_inc_dia1)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV124Wpincidenciasds_2_dynamicfiltersselector1, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Wpincidenciasds_5_inc_dia_to1)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia <= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( AV130Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV131Wpincidenciasds_9_dynamicfiltersselector2, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Wpincidenciasds_11_inc_dia2)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( AV130Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV131Wpincidenciasds_9_dynamicfiltersselector2, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Wpincidenciasds_12_inc_dia_to2)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia <= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( AV137Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV138Wpincidenciasds_16_dynamicfiltersselector3, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Wpincidenciasds_18_inc_dia3)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( AV137Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV138Wpincidenciasds_16_dynamicfiltersselector3, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141Wpincidenciasds_19_inc_dia_to3)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia <= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Wpincidenciasds_22_tfinc_dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( AV13OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.Inc_Dia" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Inc_Dia" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Inc_Dia DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Inc_Dia" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H00F63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV123Wpincidenciasds_1_filterfulltext ,
                                          String AV124Wpincidenciasds_2_dynamicfiltersselector1 ,
                                          java.util.Date AV126Wpincidenciasds_4_inc_dia1 ,
                                          java.util.Date AV127Wpincidenciasds_5_inc_dia_to1 ,
                                          short AV125Wpincidenciasds_3_dynamicfiltersoperator1 ,
                                          String AV128Wpincidenciasds_6_inc_prog1 ,
                                          String AV129Wpincidenciasds_7_inc_hdr1 ,
                                          boolean AV130Wpincidenciasds_8_dynamicfiltersenabled2 ,
                                          String AV131Wpincidenciasds_9_dynamicfiltersselector2 ,
                                          java.util.Date AV133Wpincidenciasds_11_inc_dia2 ,
                                          java.util.Date AV134Wpincidenciasds_12_inc_dia_to2 ,
                                          short AV132Wpincidenciasds_10_dynamicfiltersoperator2 ,
                                          String AV135Wpincidenciasds_13_inc_prog2 ,
                                          String AV136Wpincidenciasds_14_inc_hdr2 ,
                                          boolean AV137Wpincidenciasds_15_dynamicfiltersenabled3 ,
                                          String AV138Wpincidenciasds_16_dynamicfiltersselector3 ,
                                          java.util.Date AV140Wpincidenciasds_18_inc_dia3 ,
                                          java.util.Date AV141Wpincidenciasds_19_inc_dia_to3 ,
                                          short AV139Wpincidenciasds_17_dynamicfiltersoperator3 ,
                                          String AV142Wpincidenciasds_20_inc_prog3 ,
                                          String AV143Wpincidenciasds_21_inc_hdr3 ,
                                          java.util.Date AV144Wpincidenciasds_22_tfinc_dia ,
                                          long AV145Wpincidenciasds_23_tfinc_linea ,
                                          long AV146Wpincidenciasds_24_tfinc_linea_to ,
                                          java.util.Date AV147Wpincidenciasds_25_tfinc_hora ,
                                          String AV149Wpincidenciasds_27_tfinc_prog_sel ,
                                          String AV148Wpincidenciasds_26_tfinc_prog ,
                                          String AV151Wpincidenciasds_29_tfinc_terminal_sel ,
                                          String AV150Wpincidenciasds_28_tfinc_terminal ,
                                          String AV153Wpincidenciasds_31_tfinc_usuario_sel ,
                                          String AV152Wpincidenciasds_30_tfinc_usuario ,
                                          String AV155Wpincidenciasds_33_tfinc_hdr_sel ,
                                          String AV154Wpincidenciasds_32_tfinc_hdr ,
                                          long A4931Inc_Linea ,
                                          String A4935Inc_Prog ,
                                          String A4934Inc_Termin ,
                                          String A4933Inc_Usuari ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          String A5301Inc_BarPar ,
                                          java.util.Date A4929Inc_Dia ,
                                          java.util.Date A4932Inc_Hora ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[8];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ( GXutil.strcmp(AV124Wpincidenciasds_2_dynamicfiltersselector1, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV126Wpincidenciasds_4_inc_dia1)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int20[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV124Wpincidenciasds_2_dynamicfiltersselector1, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV127Wpincidenciasds_5_inc_dia_to1)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia <= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( AV130Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV131Wpincidenciasds_9_dynamicfiltersselector2, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV133Wpincidenciasds_11_inc_dia2)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( AV130Wpincidenciasds_8_dynamicfiltersenabled2 && ( GXutil.strcmp(AV131Wpincidenciasds_9_dynamicfiltersselector2, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Wpincidenciasds_12_inc_dia_to2)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia <= ?)");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( AV137Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV138Wpincidenciasds_16_dynamicfiltersselector3, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV140Wpincidenciasds_18_inc_dia3)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( AV137Wpincidenciasds_15_dynamicfiltersenabled3 && ( GXutil.strcmp(AV138Wpincidenciasds_16_dynamicfiltersselector3, "INC_DIA") == 0 ) && ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV141Wpincidenciasds_19_inc_dia_to3)) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia <= ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Wpincidenciasds_22_tfinc_dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV13OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_H00F62(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , ((Number) dynConstraints[23]).longValue() , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] );
            case 1 :
                  return conditional_H00F63(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Boolean) dynConstraints[7]).booleanValue() , (String)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (java.util.Date)dynConstraints[21] , ((Number) dynConstraints[22]).longValue() , ((Number) dynConstraints[23]).longValue() , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).longValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00F62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F64", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[19]);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[9]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[10]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

