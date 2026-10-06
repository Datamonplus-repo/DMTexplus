package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwincctrl_impl extends GXDataArea
{
   public webwincctrl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwincctrl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwincctrl_impl.class ));
   }

   public webwincctrl_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
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
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
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
      AV88Inc_Dia = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia")) ;
      A4931Inc_Linea = GXutil.lval( httpContext.GetPar( "Inc_Linea")) ;
      A4933Inc_Usuari = httpContext.GetPar( "Inc_Usuari") ;
      A4934Inc_Termin = httpContext.GetPar( "Inc_Termin") ;
      A4935Inc_Prog = httpContext.GetPar( "Inc_Prog") ;
      A13713Inc_Hdr = httpContext.GetPar( "Inc_Hdr") ;
      A4936Inc_Obs = httpContext.GetPar( "Inc_Obs") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36ColumnsSelector);
      AV89Inc_Dia_To = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia_To")) ;
      AV87FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV43TFInc_Dia = localUtil.parseDateParm( httpContext.GetPar( "TFInc_Dia")) ;
      AV48TFInc_Linea = GXutil.lval( httpContext.GetPar( "TFInc_Linea")) ;
      AV49TFInc_Linea_To = GXutil.lval( httpContext.GetPar( "TFInc_Linea_To")) ;
      AV51TFInc_Hora = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFInc_Hora"))) ;
      AV56TFInc_Usuario = httpContext.GetPar( "TFInc_Usuario") ;
      AV57TFInc_Usuario_Sel = httpContext.GetPar( "TFInc_Usuario_Sel") ;
      AV59TFInc_Terminal = httpContext.GetPar( "TFInc_Terminal") ;
      AV60TFInc_Terminal_Sel = httpContext.GetPar( "TFInc_Terminal_Sel") ;
      AV62TFInc_Prog = httpContext.GetPar( "TFInc_Prog") ;
      AV63TFInc_Prog_Sel = httpContext.GetPar( "TFInc_Prog_Sel") ;
      AV68TFInc_Hdr = httpContext.GetPar( "TFInc_Hdr") ;
      AV69TFInc_Hdr_Sel = httpContext.GetPar( "TFInc_Hdr_Sel") ;
      AV93Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV88Inc_Dia, A4931Inc_Linea, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A13713Inc_Hdr, A4936Inc_Obs, A396EmprCod, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89Inc_Dia_To, AV87FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Usuario, AV57TFInc_Usuario_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Prog, AV63TFInc_Prog_Sel, AV68TFInc_Hdr, AV69TFInc_Hdr_Sel, AV93Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
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
      paFN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startFN2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwincctrl", new String[] {}, new String[] {}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WebWIncCtrl");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV93Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("webwincctrl:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_DIA", localUtil.format(AV88Inc_Dia, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV73GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV74GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA", localUtil.dtoc( AV88Inc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA_TO", localUtil.dtoc( AV89Inc_Dia_To, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV71DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV71DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV41ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_DIA", localUtil.dtoc( AV43TFInc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_LINEA", GXutil.ltrim( localUtil.ntoc( AV48TFInc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_LINEA_TO", GXutil.ltrim( localUtil.ntoc( AV49TFInc_Linea_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_HORA", localUtil.ttoc( AV51TFInc_Hora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_USUARIO", GXutil.rtrim( AV56TFInc_Usuario));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_USUARIO_SEL", GXutil.rtrim( AV57TFInc_Usuario_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_TERMINAL", GXutil.rtrim( AV59TFInc_Terminal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_TERMINAL_SEL", GXutil.rtrim( AV60TFInc_Terminal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_PROG", GXutil.rtrim( AV62TFInc_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_PROG_SEL", GXutil.rtrim( AV63TFInc_Prog_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_HDR", GXutil.rtrim( AV68TFInc_Hdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_HDR_SEL", GXutil.rtrim( AV69TFInc_Hdr_Sel));
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
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
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
         weFN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtFN2( ) ;
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
      return formatLink("app.webwincctrl", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWIncCtrl" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Control de Incidencias", "") ;
   }

   public void wbFN0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_FN2( true) ;
      }
      else
      {
         wb_table1_23_FN2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_FN2e( boolean wbgen )
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
         startgridcontrol44( ) ;
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (int)(nGXsfl_44_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV73GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV74GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV93Pgmname), GXutil.rtrim( localUtil.format( AV93Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
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
         ucInc_dia_rangepicker.setProperty("Start Date", AV88Inc_Dia);
         ucInc_dia_rangepicker.setProperty("End Date", AV89Inc_Dia_To);
         ucInc_dia_rangepicker.render(context, "wwp.daterangepicker", Inc_dia_rangepicker_Internalname, "INC_DIA_RANGEPICKERContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV71DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV71DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV36ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_inc_diaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_inc_diaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_inc_diaauxdate_Internalname, localUtil.format(AV45DDO_Inc_DiaAuxDate, "99/99/99"), localUtil.format( AV45DDO_Inc_DiaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_inc_diaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_inc_diaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWIncCtrl.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_inc_horaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_inc_horaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_inc_horaauxdate_Internalname, localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"), localUtil.format( AV53DDO_Inc_HoraAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_inc_horaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_inc_horaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWIncCtrl.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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

   public void startFN2( )
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
      strupFN0( ) ;
   }

   public void wsFN2( )
   {
      startFN2( ) ;
      evtFN2( ) ;
   }

   public void evtFN2( )
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
                           e11FN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12FN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13FN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "INC_DIA_RANGEPICKER.DATERANGECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14FN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15FN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16FN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17FN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18FN2 ();
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
                           nGXsfl_44_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           A4929Inc_Dia = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInc_Dia_Internalname), 0)) ;
                           A4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtInc_Hora_Internalname), 0)) ;
                           A4933Inc_Usuari = GXutil.upper( httpContext.cgiGet( edtInc_Usuari_Internalname)) ;
                           A4934Inc_Termin = httpContext.cgiGet( edtInc_Termin_Internalname) ;
                           A4935Inc_Prog = httpContext.cgiGet( edtInc_Prog_Internalname) ;
                           A13713Inc_Hdr = httpContext.cgiGet( edtInc_Hdr_Internalname) ;
                           A4936Inc_Obs = httpContext.cgiGet( edtInc_Obs_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19FN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20FN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21FN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Inc_dia Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vINC_DIA"), 0), AV88Inc_Dia) ) )
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

   public void weFN2( )
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

   public void paFN2( )
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
            GX_FocusControl = edtavInc_dia_rangetext_Internalname ;
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
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV88Inc_Dia ,
                                 long A4931Inc_Linea ,
                                 String A4933Inc_Usuari ,
                                 String A4934Inc_Termin ,
                                 String A4935Inc_Prog ,
                                 String A13713Inc_Hdr ,
                                 String A4936Inc_Obs ,
                                 String A396EmprCod ,
                                 byte AV41ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ,
                                 java.util.Date AV89Inc_Dia_To ,
                                 String AV87FilterFullText ,
                                 java.util.Date AV43TFInc_Dia ,
                                 long AV48TFInc_Linea ,
                                 long AV49TFInc_Linea_To ,
                                 java.util.Date AV51TFInc_Hora ,
                                 String AV56TFInc_Usuario ,
                                 String AV57TFInc_Usuario_Sel ,
                                 String AV59TFInc_Terminal ,
                                 String AV60TFInc_Terminal_Sel ,
                                 String AV62TFInc_Prog ,
                                 String AV63TFInc_Prog_Sel ,
                                 String AV68TFInc_Hdr ,
                                 String AV69TFInc_Hdr_Sel ,
                                 String AV93Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20FN2 ();
      GRID_nCurrentRecord = 0 ;
      rfFN2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WebWIncCtrl");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV93Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("webwincctrl:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rfFN2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV93Pgmname = "WebWIncCtrl" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV95Webwincctrlds_1_inc_dia = AV88Inc_Dia ;
      AV96Webwincctrlds_2_inc_dia_to = AV89Inc_Dia_To ;
      AV97Webwincctrlds_3_filterfulltext = AV87FilterFullText ;
      AV98Webwincctrlds_4_tfinc_dia = AV43TFInc_Dia ;
      AV99Webwincctrlds_5_tfinc_linea = AV48TFInc_Linea ;
      AV100Webwincctrlds_6_tfinc_linea_to = AV49TFInc_Linea_To ;
      AV101Webwincctrlds_7_tfinc_hora = AV51TFInc_Hora ;
      AV102Webwincctrlds_8_tfinc_usuario = AV56TFInc_Usuario ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = AV57TFInc_Usuario_Sel ;
      AV104Webwincctrlds_10_tfinc_terminal = AV59TFInc_Terminal ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = AV60TFInc_Terminal_Sel ;
      AV106Webwincctrlds_12_tfinc_prog = AV62TFInc_Prog ;
      AV107Webwincctrlds_13_tfinc_prog_sel = AV63TFInc_Prog_Sel ;
      AV108Webwincctrlds_14_tfinc_hdr = AV68TFInc_Hdr ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = AV69TFInc_Hdr_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV95Webwincctrlds_1_inc_dia ,
                                           AV96Webwincctrlds_2_inc_dia_to ,
                                           AV98Webwincctrlds_4_tfinc_dia ,
                                           Long.valueOf(AV99Webwincctrlds_5_tfinc_linea) ,
                                           Long.valueOf(AV100Webwincctrlds_6_tfinc_linea_to) ,
                                           AV101Webwincctrlds_7_tfinc_hora ,
                                           AV103Webwincctrlds_9_tfinc_usuario_sel ,
                                           AV102Webwincctrlds_8_tfinc_usuario ,
                                           AV105Webwincctrlds_11_tfinc_terminal_sel ,
                                           AV104Webwincctrlds_10_tfinc_terminal ,
                                           AV107Webwincctrlds_13_tfinc_prog_sel ,
                                           AV106Webwincctrlds_12_tfinc_prog ,
                                           AV109Webwincctrlds_15_tfinc_hdr_sel ,
                                           AV108Webwincctrlds_14_tfinc_hdr ,
                                           A4929Inc_Dia ,
                                           Long.valueOf(A4931Inc_Linea) ,
                                           A4932Inc_Hora ,
                                           A4933Inc_Usuari ,
                                           A4934Inc_Termin ,
                                           A4935Inc_Prog ,
                                           Integer.valueOf(A5299Inc_Barcod) ,
                                           Byte.valueOf(A5300Inc_BarReo) ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           AV97Webwincctrlds_3_filterfulltext ,
                                           A4936Inc_Obs ,
                                           A13713Inc_Hdr ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H00FN2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV95Webwincctrlds_1_inc_dia, AV96Webwincctrlds_2_inc_dia_to, AV98Webwincctrlds_4_tfinc_dia});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4929Inc_Dia = H00FN2_A4929Inc_Dia[0] ;
         if ( (GXutil.strcmp("", AV97Webwincctrlds_3_filterfulltext)==0) || ( ( GXutil.like( localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") , GXutil.padr( "%" + AV97Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4931Inc_Linea, 10, 0) , GXutil.padr( "%" + AV97Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4933Inc_Usuari) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4934Inc_Termin) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4935Inc_Prog) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4936Inc_Obs) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13713Inc_Hdr) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfFN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(44) ;
      /* Execute user event: Refresh */
      e20FN2 ();
      nGXsfl_44_idx = 1 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
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
         subsflControlProps_442( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV95Webwincctrlds_1_inc_dia ,
                                              AV96Webwincctrlds_2_inc_dia_to ,
                                              AV98Webwincctrlds_4_tfinc_dia ,
                                              Long.valueOf(AV99Webwincctrlds_5_tfinc_linea) ,
                                              Long.valueOf(AV100Webwincctrlds_6_tfinc_linea_to) ,
                                              AV101Webwincctrlds_7_tfinc_hora ,
                                              AV103Webwincctrlds_9_tfinc_usuario_sel ,
                                              AV102Webwincctrlds_8_tfinc_usuario ,
                                              AV105Webwincctrlds_11_tfinc_terminal_sel ,
                                              AV104Webwincctrlds_10_tfinc_terminal ,
                                              AV107Webwincctrlds_13_tfinc_prog_sel ,
                                              AV106Webwincctrlds_12_tfinc_prog ,
                                              AV109Webwincctrlds_15_tfinc_hdr_sel ,
                                              AV108Webwincctrlds_14_tfinc_hdr ,
                                              A4929Inc_Dia ,
                                              Long.valueOf(A4931Inc_Linea) ,
                                              A4932Inc_Hora ,
                                              A4933Inc_Usuari ,
                                              A4934Inc_Termin ,
                                              A4935Inc_Prog ,
                                              Integer.valueOf(A5299Inc_Barcod) ,
                                              Byte.valueOf(A5300Inc_BarReo) ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              AV97Webwincctrlds_3_filterfulltext ,
                                              A4936Inc_Obs ,
                                              A13713Inc_Hdr ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor H00FN3 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV95Webwincctrlds_1_inc_dia, AV96Webwincctrlds_2_inc_dia_to, AV98Webwincctrlds_4_tfinc_dia});
         nGXsfl_44_idx = 1 ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4929Inc_Dia = H00FN3_A4929Inc_Dia[0] ;
            if ( (GXutil.strcmp("", AV97Webwincctrlds_3_filterfulltext)==0) || ( ( GXutil.like( localUtil.dtoc( A4929Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") , GXutil.padr( "%" + AV97Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A4931Inc_Linea, 10, 0) , GXutil.padr( "%" + AV97Webwincctrlds_3_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4933Inc_Usuari) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4934Inc_Termin) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4935Inc_Prog) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A4936Inc_Obs) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13713Inc_Hdr) , GXutil.padr( "%" + GXutil.upper( AV97Webwincctrlds_3_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e21FN2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(44) ;
         wbFN0( ) ;
      }
      bGXsfl_44_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesFN2( )
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
      AV95Webwincctrlds_1_inc_dia = AV88Inc_Dia ;
      AV96Webwincctrlds_2_inc_dia_to = AV89Inc_Dia_To ;
      AV97Webwincctrlds_3_filterfulltext = AV87FilterFullText ;
      AV98Webwincctrlds_4_tfinc_dia = AV43TFInc_Dia ;
      AV99Webwincctrlds_5_tfinc_linea = AV48TFInc_Linea ;
      AV100Webwincctrlds_6_tfinc_linea_to = AV49TFInc_Linea_To ;
      AV101Webwincctrlds_7_tfinc_hora = AV51TFInc_Hora ;
      AV102Webwincctrlds_8_tfinc_usuario = AV56TFInc_Usuario ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = AV57TFInc_Usuario_Sel ;
      AV104Webwincctrlds_10_tfinc_terminal = AV59TFInc_Terminal ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = AV60TFInc_Terminal_Sel ;
      AV106Webwincctrlds_12_tfinc_prog = AV62TFInc_Prog ;
      AV107Webwincctrlds_13_tfinc_prog_sel = AV63TFInc_Prog_Sel ;
      AV108Webwincctrlds_14_tfinc_hdr = AV68TFInc_Hdr ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = AV69TFInc_Hdr_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV88Inc_Dia, A4931Inc_Linea, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A13713Inc_Hdr, A4936Inc_Obs, A396EmprCod, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89Inc_Dia_To, AV87FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Usuario, AV57TFInc_Usuario_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Prog, AV63TFInc_Prog_Sel, AV68TFInc_Hdr, AV69TFInc_Hdr_Sel, AV93Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV95Webwincctrlds_1_inc_dia = AV88Inc_Dia ;
      AV96Webwincctrlds_2_inc_dia_to = AV89Inc_Dia_To ;
      AV97Webwincctrlds_3_filterfulltext = AV87FilterFullText ;
      AV98Webwincctrlds_4_tfinc_dia = AV43TFInc_Dia ;
      AV99Webwincctrlds_5_tfinc_linea = AV48TFInc_Linea ;
      AV100Webwincctrlds_6_tfinc_linea_to = AV49TFInc_Linea_To ;
      AV101Webwincctrlds_7_tfinc_hora = AV51TFInc_Hora ;
      AV102Webwincctrlds_8_tfinc_usuario = AV56TFInc_Usuario ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = AV57TFInc_Usuario_Sel ;
      AV104Webwincctrlds_10_tfinc_terminal = AV59TFInc_Terminal ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = AV60TFInc_Terminal_Sel ;
      AV106Webwincctrlds_12_tfinc_prog = AV62TFInc_Prog ;
      AV107Webwincctrlds_13_tfinc_prog_sel = AV63TFInc_Prog_Sel ;
      AV108Webwincctrlds_14_tfinc_hdr = AV68TFInc_Hdr ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = AV69TFInc_Hdr_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV88Inc_Dia, A4931Inc_Linea, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A13713Inc_Hdr, A4936Inc_Obs, A396EmprCod, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89Inc_Dia_To, AV87FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Usuario, AV57TFInc_Usuario_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Prog, AV63TFInc_Prog_Sel, AV68TFInc_Hdr, AV69TFInc_Hdr_Sel, AV93Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV95Webwincctrlds_1_inc_dia = AV88Inc_Dia ;
      AV96Webwincctrlds_2_inc_dia_to = AV89Inc_Dia_To ;
      AV97Webwincctrlds_3_filterfulltext = AV87FilterFullText ;
      AV98Webwincctrlds_4_tfinc_dia = AV43TFInc_Dia ;
      AV99Webwincctrlds_5_tfinc_linea = AV48TFInc_Linea ;
      AV100Webwincctrlds_6_tfinc_linea_to = AV49TFInc_Linea_To ;
      AV101Webwincctrlds_7_tfinc_hora = AV51TFInc_Hora ;
      AV102Webwincctrlds_8_tfinc_usuario = AV56TFInc_Usuario ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = AV57TFInc_Usuario_Sel ;
      AV104Webwincctrlds_10_tfinc_terminal = AV59TFInc_Terminal ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = AV60TFInc_Terminal_Sel ;
      AV106Webwincctrlds_12_tfinc_prog = AV62TFInc_Prog ;
      AV107Webwincctrlds_13_tfinc_prog_sel = AV63TFInc_Prog_Sel ;
      AV108Webwincctrlds_14_tfinc_hdr = AV68TFInc_Hdr ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = AV69TFInc_Hdr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88Inc_Dia, A4931Inc_Linea, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A13713Inc_Hdr, A4936Inc_Obs, A396EmprCod, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89Inc_Dia_To, AV87FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Usuario, AV57TFInc_Usuario_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Prog, AV63TFInc_Prog_Sel, AV68TFInc_Hdr, AV69TFInc_Hdr_Sel, AV93Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV95Webwincctrlds_1_inc_dia = AV88Inc_Dia ;
      AV96Webwincctrlds_2_inc_dia_to = AV89Inc_Dia_To ;
      AV97Webwincctrlds_3_filterfulltext = AV87FilterFullText ;
      AV98Webwincctrlds_4_tfinc_dia = AV43TFInc_Dia ;
      AV99Webwincctrlds_5_tfinc_linea = AV48TFInc_Linea ;
      AV100Webwincctrlds_6_tfinc_linea_to = AV49TFInc_Linea_To ;
      AV101Webwincctrlds_7_tfinc_hora = AV51TFInc_Hora ;
      AV102Webwincctrlds_8_tfinc_usuario = AV56TFInc_Usuario ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = AV57TFInc_Usuario_Sel ;
      AV104Webwincctrlds_10_tfinc_terminal = AV59TFInc_Terminal ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = AV60TFInc_Terminal_Sel ;
      AV106Webwincctrlds_12_tfinc_prog = AV62TFInc_Prog ;
      AV107Webwincctrlds_13_tfinc_prog_sel = AV63TFInc_Prog_Sel ;
      AV108Webwincctrlds_14_tfinc_hdr = AV68TFInc_Hdr ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = AV69TFInc_Hdr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88Inc_Dia, A4931Inc_Linea, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A13713Inc_Hdr, A4936Inc_Obs, A396EmprCod, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89Inc_Dia_To, AV87FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Usuario, AV57TFInc_Usuario_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Prog, AV63TFInc_Prog_Sel, AV68TFInc_Hdr, AV69TFInc_Hdr_Sel, AV93Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV95Webwincctrlds_1_inc_dia = AV88Inc_Dia ;
      AV96Webwincctrlds_2_inc_dia_to = AV89Inc_Dia_To ;
      AV97Webwincctrlds_3_filterfulltext = AV87FilterFullText ;
      AV98Webwincctrlds_4_tfinc_dia = AV43TFInc_Dia ;
      AV99Webwincctrlds_5_tfinc_linea = AV48TFInc_Linea ;
      AV100Webwincctrlds_6_tfinc_linea_to = AV49TFInc_Linea_To ;
      AV101Webwincctrlds_7_tfinc_hora = AV51TFInc_Hora ;
      AV102Webwincctrlds_8_tfinc_usuario = AV56TFInc_Usuario ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = AV57TFInc_Usuario_Sel ;
      AV104Webwincctrlds_10_tfinc_terminal = AV59TFInc_Terminal ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = AV60TFInc_Terminal_Sel ;
      AV106Webwincctrlds_12_tfinc_prog = AV62TFInc_Prog ;
      AV107Webwincctrlds_13_tfinc_prog_sel = AV63TFInc_Prog_Sel ;
      AV108Webwincctrlds_14_tfinc_hdr = AV68TFInc_Hdr ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = AV69TFInc_Hdr_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88Inc_Dia, A4931Inc_Linea, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A13713Inc_Hdr, A4936Inc_Obs, A396EmprCod, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89Inc_Dia_To, AV87FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Usuario, AV57TFInc_Usuario_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Prog, AV63TFInc_Prog_Sel, AV68TFInc_Hdr, AV69TFInc_Hdr_Sel, AV93Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV93Pgmname = "WebWIncCtrl" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupFN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19FN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV71DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV36ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV73GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV74GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV88Inc_Dia = localUtil.ctod( httpContext.cgiGet( "vINC_DIA"), 0) ;
         AV89Inc_Dia_To = localUtil.ctod( httpContext.cgiGet( "vINC_DIA_TO"), 0) ;
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
         AV90Inc_Dia_RangeText = httpContext.cgiGet( edtavInc_dia_rangetext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Inc_Dia_RangeText", AV90Inc_Dia_RangeText);
         AV87FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87FilterFullText", AV87FilterFullText);
         AV93Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_inc_diaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_INC_DIAAUXDATE");
            GX_FocusControl = edtavDdo_inc_diaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45DDO_Inc_DiaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45DDO_Inc_DiaAuxDate", localUtil.format(AV45DDO_Inc_DiaAuxDate, "99/99/99"));
         }
         else
         {
            AV45DDO_Inc_DiaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_inc_diaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45DDO_Inc_DiaAuxDate", localUtil.format(AV45DDO_Inc_DiaAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_inc_horaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_INC_HORAAUXDATE");
            GX_FocusControl = edtavDdo_inc_horaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53DDO_Inc_HoraAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DDO_Inc_HoraAuxDate", localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         else
         {
            AV53DDO_Inc_HoraAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_inc_horaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DDO_Inc_HoraAuxDate", localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WebWIncCtrl");
         AV93Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Pgmname", AV93Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV93Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("webwincctrl:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vINC_DIA"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV88Inc_Dia)) ) )
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
      e19FN2 ();
      if (returnInSub) return;
   }

   public void e19FN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV75Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwincctrl_impl.this.GXt_char1 = GXv_char2[0] ;
      AV75Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV76EmprNom ;
      GXv_char4[0] = AV77UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV75Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwincctrl_impl.this.A396EmprCod = GXv_char2[0] ;
      webwincctrl_impl.this.AV76EmprNom = GXv_char3[0] ;
      webwincctrl_impl.this.AV77UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV88Inc_Dia = GXutil.resetTime(GXutil.now( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Inc_Dia", localUtil.format(AV88Inc_Dia, "99/99/99"));
      AV89Inc_Dia_To = GXutil.resetTime(GXutil.now( )) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Inc_Dia_To", localUtil.format(AV89Inc_Dia_To, "99/99/99"));
      GXt_char1 = AV75Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwincctrl_impl.this.GXt_char1 = GXv_char4[0] ;
      AV75Station = GXt_char1 ;
      GXv_char4[0] = AV94Emprcod ;
      GXv_char3[0] = AV76EmprNom ;
      GXv_char2[0] = AV77UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV75Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwincctrl_impl.this.AV94Emprcod = GXv_char4[0] ;
      webwincctrl_impl.this.AV76EmprNom = GXv_char3[0] ;
      webwincctrl_impl.this.AV77UsurCod = GXv_char2[0] ;
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
         if (returnInSub) return;
      }
      this.executeUsercontrolMethod("", false, "INC_DIA_RANGEPICKERContainer", "Attach", "", new Object[] {edtavInc_dia_rangetext_Internalname});
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Control de Incidencias", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV71DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV71DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20FN2( )
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
      if ( AV41ManageFiltersExecutionStep == 1 )
      {
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV41ManageFiltersExecutionStep == 2 )
      {
         AV41ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV38Session.getValue("WebWIncCtrlColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV38Session.getValue("WebWIncCtrlColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtInc_Dia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtInc_Linea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtInc_Hora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hora_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtInc_Usuari_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Usuari_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Usuari_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtInc_Termin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Termin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Termin_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtInc_Prog_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Prog_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Prog_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtInc_Hdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hdr_Visible), 5, 0), !bGXsfl_44_Refreshing);
      edtInc_Obs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Obs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Obs_Visible), 5, 0), !bGXsfl_44_Refreshing);
      AV73GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73GridCurrentPage), 10, 0));
      AV74GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridPageCount), 10, 0));
      AV95Webwincctrlds_1_inc_dia = AV88Inc_Dia ;
      AV96Webwincctrlds_2_inc_dia_to = AV89Inc_Dia_To ;
      AV97Webwincctrlds_3_filterfulltext = AV87FilterFullText ;
      AV98Webwincctrlds_4_tfinc_dia = AV43TFInc_Dia ;
      AV99Webwincctrlds_5_tfinc_linea = AV48TFInc_Linea ;
      AV100Webwincctrlds_6_tfinc_linea_to = AV49TFInc_Linea_To ;
      AV101Webwincctrlds_7_tfinc_hora = AV51TFInc_Hora ;
      AV102Webwincctrlds_8_tfinc_usuario = AV56TFInc_Usuario ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = AV57TFInc_Usuario_Sel ;
      AV104Webwincctrlds_10_tfinc_terminal = AV59TFInc_Terminal ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = AV60TFInc_Terminal_Sel ;
      AV106Webwincctrlds_12_tfinc_prog = AV62TFInc_Prog ;
      AV107Webwincctrlds_13_tfinc_prog_sel = AV63TFInc_Prog_Sel ;
      AV108Webwincctrlds_14_tfinc_hdr = AV68TFInc_Hdr ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = AV69TFInc_Hdr_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12FN2( )
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
         AV72PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV72PageToGo) ;
      }
   }

   public void e13FN2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e15FN2( )
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
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Dia") == 0 )
         {
            AV43TFInc_Dia = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFInc_Dia", localUtil.format(AV43TFInc_Dia, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Linea") == 0 )
         {
            AV48TFInc_Linea = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFInc_Linea), 10, 0));
            AV49TFInc_Linea_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFInc_Linea_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Hora") == 0 )
         {
            AV51TFInc_Hora = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Hora", localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Usuario") == 0 )
         {
            AV56TFInc_Usuario = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFInc_Usuario", AV56TFInc_Usuario);
            AV57TFInc_Usuario_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFInc_Usuario_Sel", AV57TFInc_Usuario_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Terminal") == 0 )
         {
            AV59TFInc_Terminal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Terminal", AV59TFInc_Terminal);
            AV60TFInc_Terminal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Terminal_Sel", AV60TFInc_Terminal_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Prog") == 0 )
         {
            AV62TFInc_Prog = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Prog", AV62TFInc_Prog);
            AV63TFInc_Prog_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Prog_Sel", AV63TFInc_Prog_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Hdr") == 0 )
         {
            AV68TFInc_Hdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFInc_Hdr", AV68TFInc_Hdr);
            AV69TFInc_Hdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFInc_Hdr_Sel", AV69TFInc_Hdr_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21FN2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(44) ;
         }
         sendrow_442( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
      {
         httpContext.doAjaxLoad(44, GridRow);
      }
   }

   public void e16FN2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV36ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWIncCtrlColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV36ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11FN2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWIncCtrlFilters")),GXutil.URLEncode(GXutil.rtrim(AV93Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebWIncCtrlFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV40ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebWIncCtrlFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webwincctrl_impl.this.GXt_char1 = GXv_char4[0] ;
         AV40ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV40ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV93Pgmname+"GridState", AV40ManageFiltersXml) ;
            AV10GridState.fromxml(AV40ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e17FN2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.webwincctrlexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webwincctrl_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      webwincctrl_impl.this.AV33ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV32ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV32ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV33ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18FN2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webwincctrlexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e14FN2( )
   {
      /* Inc_dia_rangepicker_Daterangechanged Routine */
      returnInSub = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Inc_Dia", localUtil.format(AV88Inc_Dia, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV89Inc_Dia_To", localUtil.format(AV89Inc_Dia_To, "99/99/99"));
      gxgrgrid_refresh( subGrid_Rows, AV88Inc_Dia, A4931Inc_Linea, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A13713Inc_Hdr, A4936Inc_Obs, A396EmprCod, AV41ManageFiltersExecutionStep, AV36ColumnsSelector, AV89Inc_Dia_To, AV87FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Usuario, AV57TFInc_Usuario_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Prog, AV63TFInc_Prog_Sel, AV68TFInc_Hdr, AV69TFInc_Hdr_Sel, AV93Pgmname, AV13OrderedBy, AV14OrderedDsc) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV36ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Dia", "", "Dia", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Linea", "", "#", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Hora", "", "Hora", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Usuario", "", "Usuario", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Terminal", "", "Terminal", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Prog", "", "Programa", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Hdr", "", "Documento", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Obs", "", "Observación", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV35UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWIncCtrlColumnsSelector", GXv_char4) ;
      webwincctrl_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV35UserCustomValue)==0) ) )
      {
         AV37ColumnsSelectorAux.fromxml(AV35UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV36ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV37ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV36ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV39ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebWIncCtrlFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV88Inc_Dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Inc_Dia", localUtil.format(AV88Inc_Dia, "99/99/99"));
      AV89Inc_Dia_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Inc_Dia_To", localUtil.format(AV89Inc_Dia_To, "99/99/99"));
      AV87FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87FilterFullText", AV87FilterFullText);
      AV43TFInc_Dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFInc_Dia", localUtil.format(AV43TFInc_Dia, "99/99/99"));
      AV48TFInc_Linea = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFInc_Linea), 10, 0));
      AV49TFInc_Linea_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFInc_Linea_To), 10, 0));
      AV51TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Hora", localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV56TFInc_Usuario = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFInc_Usuario", AV56TFInc_Usuario);
      AV57TFInc_Usuario_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFInc_Usuario_Sel", AV57TFInc_Usuario_Sel);
      AV59TFInc_Terminal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Terminal", AV59TFInc_Terminal);
      AV60TFInc_Terminal_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Terminal_Sel", AV60TFInc_Terminal_Sel);
      AV62TFInc_Prog = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Prog", AV62TFInc_Prog);
      AV63TFInc_Prog_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Prog_Sel", AV63TFInc_Prog_Sel);
      AV68TFInc_Hdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFInc_Hdr", AV68TFInc_Hdr);
      AV69TFInc_Hdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69TFInc_Hdr_Sel", AV69TFInc_Hdr_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV93Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV93Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV38Session.getValue(AV93Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV110GXV1 = 1 ;
      while ( AV110GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV110GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "INC_DIA") == 0 )
         {
            AV88Inc_Dia = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88Inc_Dia", localUtil.format(AV88Inc_Dia, "99/99/99"));
            AV89Inc_Dia_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89Inc_Dia_To", localUtil.format(AV89Inc_Dia_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV87FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87FilterFullText", AV87FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV43TFInc_Dia = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFInc_Dia", localUtil.format(AV43TFInc_Dia, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV48TFInc_Linea = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFInc_Linea), 10, 0));
            AV49TFInc_Linea_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFInc_Linea_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV51TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Hora", localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV53DDO_Inc_HoraAuxDate = GXutil.resetTime(AV51TFInc_Hora) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DDO_Inc_HoraAuxDate", localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV56TFInc_Usuario = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFInc_Usuario", AV56TFInc_Usuario);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV57TFInc_Usuario_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFInc_Usuario_Sel", AV57TFInc_Usuario_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV59TFInc_Terminal = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Terminal", AV59TFInc_Terminal);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV60TFInc_Terminal_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Terminal_Sel", AV60TFInc_Terminal_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV62TFInc_Prog = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Prog", AV62TFInc_Prog);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV63TFInc_Prog_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Prog_Sel", AV63TFInc_Prog_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR") == 0 )
         {
            AV68TFInc_Hdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFInc_Hdr", AV68TFInc_Hdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HDR_SEL") == 0 )
         {
            AV69TFInc_Hdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFInc_Hdr_Sel", AV69TFInc_Hdr_Sel);
         }
         AV110GXV1 = (int)(AV110GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFInc_Usuario_Sel)==0), AV57TFInc_Usuario_Sel, GXv_char4) ;
      webwincctrl_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFInc_Terminal_Sel)==0), AV60TFInc_Terminal_Sel, GXv_char3) ;
      webwincctrl_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFInc_Prog_Sel)==0), AV63TFInc_Prog_Sel, GXv_char2) ;
      webwincctrl_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFInc_Hdr_Sel)==0), AV69TFInc_Hdr_Sel, GXv_char15) ;
      webwincctrl_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFInc_Usuario)==0), AV56TFInc_Usuario, GXv_char15) ;
      webwincctrl_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFInc_Terminal)==0), AV59TFInc_Terminal, GXv_char4) ;
      webwincctrl_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFInc_Prog)==0), AV62TFInc_Prog, GXv_char3) ;
      webwincctrl_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFInc_Hdr)==0), AV68TFInc_Hdr, GXv_char2) ;
      webwincctrl_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFInc_Dia)) ? "" : localUtil.dtoc( AV43TFInc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV48TFInc_Linea) ? "" : GXutil.str( AV48TFInc_Linea, 10, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV51TFInc_Hora) ? "" : localUtil.dtoc( AV53DDO_Inc_HoraAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV49TFInc_Linea_To) ? "" : GXutil.str( AV49TFInc_Linea_To, 10, 0))+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV38Session.getValue(AV93Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "INC_DIA", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88Inc_Dia))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89Inc_Dia_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV88Inc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV89Inc_Dia_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV87FilterFullText)==0), (short)(0), AV87FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINC_DIA", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFInc_Dia)), (short)(0), GXutil.trim( localUtil.dtoc( AV43TFInc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINC_LINEA", "", !((0==AV48TFInc_Linea)&&(0==AV49TFInc_Linea_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFInc_Linea, 10, 0)), GXutil.trim( GXutil.str( AV49TFInc_Linea_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINC_HORA", "", !GXutil.dateCompare(GXutil.nullDate(), AV51TFInc_Hora), (short)(0), GXutil.trim( localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINC_USUARIO", "", !(GXutil.strcmp("", AV56TFInc_Usuario)==0), (short)(0), AV56TFInc_Usuario, "", !(GXutil.strcmp("", AV57TFInc_Usuario_Sel)==0), AV57TFInc_Usuario_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINC_TERMINAL", "", !(GXutil.strcmp("", AV59TFInc_Terminal)==0), (short)(0), AV59TFInc_Terminal, "", !(GXutil.strcmp("", AV60TFInc_Terminal_Sel)==0), AV60TFInc_Terminal_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINC_PROG", "", !(GXutil.strcmp("", AV62TFInc_Prog)==0), (short)(0), AV62TFInc_Prog, "", !(GXutil.strcmp("", AV63TFInc_Prog_Sel)==0), AV63TFInc_Prog_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFINC_HDR", "", !(GXutil.strcmp("", AV68TFInc_Hdr)==0), (short)(0), AV68TFInc_Hdr, "", !(GXutil.strcmp("", AV69TFInc_Hdr_Sel)==0), AV69TFInc_Hdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV93Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV93Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCRTINC" );
      AV38Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_FN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavInc_dia_rangetext_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_dia_rangetext_Internalname, httpContext.getMessage( "Dia", ""), "gx-form-item AttributeLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_dia_rangetext_Internalname, AV90Inc_Dia_RangeText, GXutil.rtrim( localUtil.format( AV90Inc_Dia_RangeText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavInc_dia_rangetext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavInc_dia_rangetext_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV87FilterFullText, GXutil.rtrim( localUtil.format( AV87FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebWIncCtrl.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV39ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_FN2e( true) ;
      }
      else
      {
         wb_table1_23_FN2e( false) ;
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
      paFN2( ) ;
      wsFN2( ) ;
      weFN2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116115714", true, true);
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
      httpContext.AddJavascriptSource("webwincctrl.js", "?202682116115715", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_442( )
   {
      edtInc_Dia_Internalname = "INC_DIA_"+sGXsfl_44_idx ;
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_44_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_44_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_44_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_44_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_44_idx ;
      edtInc_Hdr_Internalname = "INC_HDR_"+sGXsfl_44_idx ;
      edtInc_Obs_Internalname = "INC_OBS_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      edtInc_Dia_Internalname = "INC_DIA_"+sGXsfl_44_fel_idx ;
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_44_fel_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_44_fel_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_44_fel_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_44_fel_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_44_fel_idx ;
      edtInc_Hdr_Internalname = "INC_HDR_"+sGXsfl_44_fel_idx ;
      edtInc_Obs_Internalname = "INC_OBS_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wbFN0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Dia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Dia_Internalname,localUtil.format(A4929Inc_Dia, "99/99/99"),localUtil.format( A4929Inc_Dia, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Dia_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Linea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Linea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Hora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Hora_Internalname,localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4932Inc_Hora, "99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Hora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Hora_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Usuari_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Usuari_Internalname,GXutil.rtrim( A4933Inc_Usuari),GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Usuari_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Usuari_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Termin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Termin_Internalname,GXutil.rtrim( A4934Inc_Termin),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Termin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Termin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Prog_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Prog_Internalname,GXutil.rtrim( A4935Inc_Prog),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Prog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Prog_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Hdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Hdr_Internalname,GXutil.rtrim( A13713Inc_Hdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Hdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Obs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Obs_Internalname,A4936Inc_Obs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Obs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesFN2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void startgridcontrol44( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"44\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Dia_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Linea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Hora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Usuari_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Termin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Prog_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Programa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Hdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Obs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observación", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4933Inc_Usuari));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Usuari_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4934Inc_Termin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Termin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4935Inc_Prog));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Prog_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13713Inc_Hdr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Hdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A4936Inc_Obs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Obs_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      edtavInc_dia_rangetext_Internalname = "vINC_DIA_RANGETEXT" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtInc_Dia_Internalname = "INC_DIA" ;
      edtInc_Linea_Internalname = "INC_LINEA" ;
      edtInc_Hora_Internalname = "INC_HORA" ;
      edtInc_Usuari_Internalname = "INC_USUARI" ;
      edtInc_Termin_Internalname = "INC_TERMIN" ;
      edtInc_Prog_Internalname = "INC_PROG" ;
      edtInc_Hdr_Internalname = "INC_HDR" ;
      edtInc_Obs_Internalname = "INC_OBS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Inc_dia_rangepicker_Internalname = "INC_DIA_RANGEPICKER" ;
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
      edtInc_Obs_Jsonclick = "" ;
      edtInc_Hdr_Jsonclick = "" ;
      edtInc_Prog_Jsonclick = "" ;
      edtInc_Termin_Jsonclick = "" ;
      edtInc_Usuari_Jsonclick = "" ;
      edtInc_Hora_Jsonclick = "" ;
      edtInc_Linea_Jsonclick = "" ;
      edtInc_Dia_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavInc_dia_rangetext_Jsonclick = "" ;
      edtavInc_dia_rangetext_Enabled = 1 ;
      edtInc_Obs_Visible = -1 ;
      edtInc_Hdr_Visible = -1 ;
      edtInc_Prog_Visible = -1 ;
      edtInc_Termin_Visible = -1 ;
      edtInc_Usuari_Visible = -1 ;
      edtInc_Hora_Visible = -1 ;
      edtInc_Linea_Visible = -1 ;
      edtInc_Dia_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_inc_horaauxdate_Jsonclick = "" ;
      edtavDdo_inc_diaauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebWIncCtrlGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "|||T|T|T|T|" ;
      Ddo_grid_Filterisrange = "|T||||||" ;
      Ddo_grid_Filtertype = "Date|Numeric|Date|Character|Character|Character|Character|" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T|" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7||" ;
      Ddo_grid_Columnids = "0:Inc_Dia|1:Inc_Linea|2:Inc_Hora|3:Inc_Usuario|4:Inc_Terminal|5:Inc_Prog|6:Inc_Hdr|7:Inc_Obs" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV73GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV74GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12FN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13FN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e15FN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21FN2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e16FN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV73GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV74GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11FN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV73GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV74GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17FN2',iparms:[{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18FN2',iparms:[{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("INC_DIA_RANGEPICKER.DATERANGECHANGED","{handler:'e14FN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'A4931Inc_Linea',fld:'INC_LINEA',pic:'ZZZZZZZZZ9'},{av:'A4933Inc_Usuari',fld:'INC_USUARI',pic:'@!'},{av:'A4934Inc_Termin',fld:'INC_TERMIN',pic:''},{av:'A4935Inc_Prog',fld:'INC_PROG',pic:''},{av:'A13713Inc_Hdr',fld:'INC_HDR',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV87FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV57TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV63TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV68TFInc_Hdr',fld:'vTFINC_HDR',pic:''},{av:'AV69TFInc_Hdr_Sel',fld:'vTFINC_HDR_SEL',pic:''},{av:'AV93Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("INC_DIA_RANGEPICKER.DATERANGECHANGED",",oparms:[{av:'AV88Inc_Dia',fld:'vINC_DIA',pic:''},{av:'AV89Inc_Dia_To',fld:'vINC_DIA_TO',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Hdr_Visible',ctrl:'INC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV73GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV74GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_INC_DIA","{handler:'valid_Inc_dia',iparms:[]");
      setEventMetadata("VALID_INC_DIA",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_linea',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_usuari',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_termin',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_prog',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_hdr',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_obs',iparms:[]");
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
      AV88Inc_Dia = GXutil.nullDate() ;
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A13713Inc_Hdr = "" ;
      A4936Inc_Obs = "" ;
      A396EmprCod = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV89Inc_Dia_To = GXutil.nullDate() ;
      AV87FilterFullText = "" ;
      AV43TFInc_Dia = GXutil.nullDate() ;
      AV51TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV56TFInc_Usuario = "" ;
      AV57TFInc_Usuario_Sel = "" ;
      AV59TFInc_Terminal = "" ;
      AV60TFInc_Terminal_Sel = "" ;
      AV62TFInc_Prog = "" ;
      AV63TFInc_Prog_Sel = "" ;
      AV68TFInc_Hdr = "" ;
      AV69TFInc_Hdr_Sel = "" ;
      AV93Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV71DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucInc_dia_rangepicker = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV45DDO_Inc_DiaAuxDate = GXutil.nullDate() ;
      AV53DDO_Inc_HoraAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV95Webwincctrlds_1_inc_dia = GXutil.nullDate() ;
      AV96Webwincctrlds_2_inc_dia_to = GXutil.nullDate() ;
      AV97Webwincctrlds_3_filterfulltext = "" ;
      AV98Webwincctrlds_4_tfinc_dia = GXutil.nullDate() ;
      AV101Webwincctrlds_7_tfinc_hora = GXutil.resetTime( GXutil.nullDate() );
      AV102Webwincctrlds_8_tfinc_usuario = "" ;
      AV103Webwincctrlds_9_tfinc_usuario_sel = "" ;
      AV104Webwincctrlds_10_tfinc_terminal = "" ;
      AV105Webwincctrlds_11_tfinc_terminal_sel = "" ;
      AV106Webwincctrlds_12_tfinc_prog = "" ;
      AV107Webwincctrlds_13_tfinc_prog_sel = "" ;
      AV108Webwincctrlds_14_tfinc_hdr = "" ;
      AV109Webwincctrlds_15_tfinc_hdr_sel = "" ;
      scmdbuf = "" ;
      lV97Webwincctrlds_3_filterfulltext = "" ;
      H00FN2_A396EmprCod = new String[] {""} ;
      H00FN2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H00FN3_A396EmprCod = new String[] {""} ;
      H00FN3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      AV90Inc_Dia_RangeText = "" ;
      hsh = "" ;
      AV75Station = "" ;
      AV76EmprNom = "" ;
      AV77UsurCod = "" ;
      AV94Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38Session = httpContext.getWebSession();
      AV34ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV40ManageFiltersXml = "" ;
      AV32ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV35UserCustomValue = "" ;
      AV37ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwincctrl__default(),
         new Object[] {
             new Object[] {
            H00FN2_A396EmprCod, H00FN2_A4929Inc_Dia
            }
            , new Object[] {
            H00FN3_A396EmprCod, H00FN3_A4929Inc_Dia
            }
         }
      );
      AV93Pgmname = "WebWIncCtrl" ;
      /* GeneXus formulas. */
      AV93Pgmname = "WebWIncCtrl" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV41ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte A5300Inc_BarReo ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_44 ;
   private int nGXsfl_44_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int A5299Inc_Barcod ;
   private int edtInc_Dia_Visible ;
   private int edtInc_Linea_Visible ;
   private int edtInc_Hora_Visible ;
   private int edtInc_Usuari_Visible ;
   private int edtInc_Termin_Visible ;
   private int edtInc_Prog_Visible ;
   private int edtInc_Hdr_Visible ;
   private int edtInc_Obs_Visible ;
   private int AV72PageToGo ;
   private int AV110GXV1 ;
   private int edtavInc_dia_rangetext_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A4931Inc_Linea ;
   private long AV48TFInc_Linea ;
   private long AV49TFInc_Linea_To ;
   private long AV73GridCurrentPage ;
   private long AV74GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long AV99Webwincctrlds_5_tfinc_linea ;
   private long AV100Webwincctrlds_6_tfinc_linea_to ;
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
   private String sGXsfl_44_idx="0001" ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A13713Inc_Hdr ;
   private String A396EmprCod ;
   private String AV56TFInc_Usuario ;
   private String AV57TFInc_Usuario_Sel ;
   private String AV59TFInc_Terminal ;
   private String AV60TFInc_Terminal_Sel ;
   private String AV62TFInc_Prog ;
   private String AV63TFInc_Prog_Sel ;
   private String AV68TFInc_Hdr ;
   private String AV69TFInc_Hdr_Sel ;
   private String AV93Pgmname ;
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
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Inc_dia_rangepicker_Internalname ;
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
   private String edtInc_Dia_Internalname ;
   private String edtInc_Linea_Internalname ;
   private String edtInc_Hora_Internalname ;
   private String edtInc_Usuari_Internalname ;
   private String edtInc_Termin_Internalname ;
   private String edtInc_Prog_Internalname ;
   private String edtInc_Hdr_Internalname ;
   private String edtInc_Obs_Internalname ;
   private String edtavInc_dia_rangetext_Internalname ;
   private String AV102Webwincctrlds_8_tfinc_usuario ;
   private String AV103Webwincctrlds_9_tfinc_usuario_sel ;
   private String AV104Webwincctrlds_10_tfinc_terminal ;
   private String AV105Webwincctrlds_11_tfinc_terminal_sel ;
   private String AV106Webwincctrlds_12_tfinc_prog ;
   private String AV107Webwincctrlds_13_tfinc_prog_sel ;
   private String AV108Webwincctrlds_14_tfinc_hdr ;
   private String AV109Webwincctrlds_15_tfinc_hdr_sel ;
   private String scmdbuf ;
   private String edtavFilterfulltext_Internalname ;
   private String hsh ;
   private String AV75Station ;
   private String AV76EmprNom ;
   private String AV77UsurCod ;
   private String AV94Emprcod ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String edtavInc_dia_rangetext_Jsonclick ;
   private String edtavFilterfulltext_Jsonclick ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtInc_Dia_Jsonclick ;
   private String edtInc_Linea_Jsonclick ;
   private String edtInc_Hora_Jsonclick ;
   private String edtInc_Usuari_Jsonclick ;
   private String edtInc_Termin_Jsonclick ;
   private String edtInc_Prog_Jsonclick ;
   private String edtInc_Hdr_Jsonclick ;
   private String edtInc_Obs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV51TFInc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV101Webwincctrlds_7_tfinc_hora ;
   private java.util.Date AV88Inc_Dia ;
   private java.util.Date AV89Inc_Dia_To ;
   private java.util.Date AV43TFInc_Dia ;
   private java.util.Date AV45DDO_Inc_DiaAuxDate ;
   private java.util.Date AV53DDO_Inc_HoraAuxDate ;
   private java.util.Date A4929Inc_Dia ;
   private java.util.Date AV95Webwincctrlds_1_inc_dia ;
   private java.util.Date AV96Webwincctrlds_2_inc_dia_to ;
   private java.util.Date AV98Webwincctrlds_4_tfinc_dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV14OrderedDsc ;
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
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV34ColumnsSelectorXML ;
   private String AV40ManageFiltersXml ;
   private String AV35UserCustomValue ;
   private String A4936Inc_Obs ;
   private String AV87FilterFullText ;
   private String AV97Webwincctrlds_3_filterfulltext ;
   private String lV97Webwincctrlds_3_filterfulltext ;
   private String AV90Inc_Dia_RangeText ;
   private String AV32ExcelFilename ;
   private String AV33ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucInc_dia_rangepicker ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H00FN2_A396EmprCod ;
   private java.util.Date[] H00FN2_A4929Inc_Dia ;
   private String[] H00FN3_A396EmprCod ;
   private java.util.Date[] H00FN3_A4929Inc_Dia ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV71DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class webwincctrl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00FN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV95Webwincctrlds_1_inc_dia ,
                                          java.util.Date AV96Webwincctrlds_2_inc_dia_to ,
                                          java.util.Date AV98Webwincctrlds_4_tfinc_dia ,
                                          long AV99Webwincctrlds_5_tfinc_linea ,
                                          long AV100Webwincctrlds_6_tfinc_linea_to ,
                                          java.util.Date AV101Webwincctrlds_7_tfinc_hora ,
                                          String AV103Webwincctrlds_9_tfinc_usuario_sel ,
                                          String AV102Webwincctrlds_8_tfinc_usuario ,
                                          String AV105Webwincctrlds_11_tfinc_terminal_sel ,
                                          String AV104Webwincctrlds_10_tfinc_terminal ,
                                          String AV107Webwincctrlds_13_tfinc_prog_sel ,
                                          String AV106Webwincctrlds_12_tfinc_prog ,
                                          String AV109Webwincctrlds_15_tfinc_hdr_sel ,
                                          String AV108Webwincctrlds_14_tfinc_hdr ,
                                          java.util.Date A4929Inc_Dia ,
                                          long A4931Inc_Linea ,
                                          java.util.Date A4932Inc_Hora ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV97Webwincctrlds_3_filterfulltext ,
                                          String A4936Inc_Obs ,
                                          String A13713Inc_Hdr ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[4];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Dia FROM TXPCRTINC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Webwincctrlds_1_inc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Webwincctrlds_2_inc_dia_to)) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Webwincctrlds_4_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV13OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Dia" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
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
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H00FN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV95Webwincctrlds_1_inc_dia ,
                                          java.util.Date AV96Webwincctrlds_2_inc_dia_to ,
                                          java.util.Date AV98Webwincctrlds_4_tfinc_dia ,
                                          long AV99Webwincctrlds_5_tfinc_linea ,
                                          long AV100Webwincctrlds_6_tfinc_linea_to ,
                                          java.util.Date AV101Webwincctrlds_7_tfinc_hora ,
                                          String AV103Webwincctrlds_9_tfinc_usuario_sel ,
                                          String AV102Webwincctrlds_8_tfinc_usuario ,
                                          String AV105Webwincctrlds_11_tfinc_terminal_sel ,
                                          String AV104Webwincctrlds_10_tfinc_terminal ,
                                          String AV107Webwincctrlds_13_tfinc_prog_sel ,
                                          String AV106Webwincctrlds_12_tfinc_prog ,
                                          String AV109Webwincctrlds_15_tfinc_hdr_sel ,
                                          String AV108Webwincctrlds_14_tfinc_hdr ,
                                          java.util.Date A4929Inc_Dia ,
                                          long A4931Inc_Linea ,
                                          java.util.Date A4932Inc_Hora ,
                                          String A4933Inc_Usuari ,
                                          String A4934Inc_Termin ,
                                          String A4935Inc_Prog ,
                                          int A5299Inc_Barcod ,
                                          byte A5300Inc_BarReo ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String AV97Webwincctrlds_3_filterfulltext ,
                                          String A4936Inc_Obs ,
                                          String A13713Inc_Hdr ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[4];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT EmprCod, Inc_Dia FROM TXPCRTINC" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95Webwincctrlds_1_inc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int19[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV96Webwincctrlds_2_inc_dia_to)) )
      {
         addWhere(sWhereString, "(Inc_Dia <= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Webwincctrlds_4_tfinc_dia)) )
      {
         addWhere(sWhereString, "(Inc_Dia >= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV13OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY Inc_Dia" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY Inc_Dia DESC" ;
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
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H00FN2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
            case 1 :
                  return conditional_H00FN3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (java.util.Date)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , ((Number) dynConstraints[4]).longValue() , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , ((Number) dynConstraints[23]).shortValue() , ((Boolean) dynConstraints[24]).booleanValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00FN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
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
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[4], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[5]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[6]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[7]);
               }
               return;
      }
   }

}

