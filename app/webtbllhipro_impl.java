package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webtbllhipro_impl extends GXDataArea
{
   public webtbllhipro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webtbllhipro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webtbllhipro_impl.class ));
   }

   public webtbllhipro_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV30Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30Emprcod", AV30Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV34MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV34MaqcodIni", AV34MaqcodIni);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34MaqcodIni, ""))));
               AV33MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33MaqcodFin", AV33MaqcodFin);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33MaqcodFin, ""))));
               AV32FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32FInicio", localUtil.ttoc( AV32FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFINICIO", getSecureSignedToken( "", localUtil.format( AV32FInicio, "99/99/99 99:99:99")));
               AV31FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31FFin", localUtil.ttoc( AV31FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFFIN", getSecureSignedToken( "", localUtil.format( AV31FFin, "99/99/99 99:99:99")));
               AV35TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV35TipoProduccion", GXutil.str( AV35TipoProduccion, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPOPRODUCCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35TipoProduccion), "9")));
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV30Emprcod = httpContext.GetPar( "Emprcod") ;
      AV34MaqcodIni = httpContext.GetPar( "MaqcodIni") ;
      AV33MaqcodFin = httpContext.GetPar( "MaqcodFin") ;
      AV32FInicio = localUtil.parseDTimeParm( httpContext.GetPar( "FInicio")) ;
      AV31FFin = localUtil.parseDTimeParm( httpContext.GetPar( "FFin")) ;
      AV35TipoProduccion = (byte)(GXutil.lval( httpContext.GetPar( "TipoProduccion"))) ;
      AV22ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV17ColumnsSelector);
      AV66Pgmname = httpContext.GetPar( "Pgmname") ;
      AV29OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV37FilterFullText = httpContext.GetPar( "FilterFullText") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV30Emprcod, AV34MaqcodIni, AV33MaqcodFin, AV32FInicio, AV31FFin, AV35TipoProduccion, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV66Pgmname, AV29OrderedBy, AV37FilterFullText) ;
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
      paDP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startDP2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webtbllhipro", new String[] {GXutil.URLEncode(GXutil.rtrim(AV30Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV34MaqcodIni)),GXutil.URLEncode(GXutil.rtrim(AV33MaqcodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV32FInicio)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV31FFin)),GXutil.URLEncode(GXutil.ltrimstr(AV35TipoProduccion,1,0))}, new String[] {"Emprcod","MaqcodIni","MaqcodFin","FInicio","FFin","TipoProduccion"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34MaqcodIni, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33MaqcodFin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFINICIO", getSecureSignedToken( "", localUtil.format( AV32FInicio, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFFIN", getSecureSignedToken( "", localUtil.format( AV31FFin, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPOPRODUCCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35TipoProduccion), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdttbllhipros", AV12SDTtblLhipros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdttbllhipros", AV12SDTtblLhipros);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV20ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV20ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV25GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV26GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV17ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV30Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODINI", GXutil.rtrim( AV34MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34MaqcodIni, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODFIN", GXutil.rtrim( AV33MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33MaqcodFin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFINICIO", localUtil.ttoc( AV32FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFINICIO", getSecureSignedToken( "", localUtil.format( AV32FInicio, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFFIN", localUtil.ttoc( AV31FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFFIN", getSecureSignedToken( "", localUtil.format( AV31FFin, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV35TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPOPRODUCCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35TipoProduccion), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV22ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV66Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV29OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTTBLLHIPROS", AV12SDTtblLhipros);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTTBLLHIPROS", AV12SDTtblLhipros);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         weDP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtDP2( ) ;
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
      return formatLink("app.webtbllhipro", new String[] {GXutil.URLEncode(GXutil.rtrim(AV30Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV34MaqcodIni)),GXutil.URLEncode(GXutil.rtrim(AV33MaqcodFin)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV32FInicio)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV31FFin)),GXutil.URLEncode(GXutil.ltrimstr(AV35TipoProduccion,1,0))}, new String[] {"Emprcod","MaqcodIni","MaqcodFin","FInicio","FFin","TipoProduccion"})  ;
   }

   public String getPgmname( )
   {
      return "WEBtblLhipro" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WEBtbl Lhipro", "") ;
   }

   public void wbDP0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WEBtblLhipro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WEBtblLhipro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WEBtblLhipro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_DP2( true) ;
      }
      else
      {
         wb_table1_23_DP2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_DP2e( boolean wbgen )
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
            AV41GXV1 = nGXsfl_41_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV25GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV26GridPageCount);
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
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV17ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
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
               AV41GXV1 = nGXsfl_41_idx ;
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

   public void startDP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "WEBtbl Lhipro", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupDP0( ) ;
   }

   public void wsDP2( )
   {
      startDP2( ) ;
      evtDP2( ) ;
   }

   public void evtDP2( )
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
                           e11DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e15DP2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e16DP2 ();
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
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           AV41GXV1 = (int)(nGXsfl_41_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12SDTtblLhipros.size() >= AV41GXV1 ) && ( AV41GXV1 > 0 ) )
                           {
                              AV12SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)) );
                              cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                              cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                              AV38GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridActions), 4, 0));
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
                                 e17DP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e18DP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e19DP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
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

   public void weDP2( )
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

   public void paDP2( )
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
                                 String AV30Emprcod ,
                                 String AV34MaqcodIni ,
                                 String AV33MaqcodFin ,
                                 java.util.Date AV32FInicio ,
                                 java.util.Date AV31FFin ,
                                 byte AV35TipoProduccion ,
                                 byte AV22ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ,
                                 String AV66Pgmname ,
                                 short AV29OrderedBy ,
                                 String AV37FilterFullText )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e18DP2 ();
      GRID_nCurrentRecord = 0 ;
      rfDP2( ) ;
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
      rfDP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "WEBtblLhipro" ;
      Gx_err = (short)(0) ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
   }

   public void rfDP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e18DP2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
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
         subsflControlProps_412( ) ;
         e19DP2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_41_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e19DP2 ();
         }
         wbEnd = (short)(41) ;
         wbDP0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesDP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV30Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODINI", GXutil.rtrim( AV34MaqcodIni));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34MaqcodIni, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODFIN", GXutil.rtrim( AV33MaqcodFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33MaqcodFin, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFINICIO", localUtil.ttoc( AV32FInicio, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFINICIO", getSecureSignedToken( "", localUtil.format( AV32FInicio, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFFIN", localUtil.ttoc( AV31FFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFFIN", getSecureSignedToken( "", localUtil.format( AV31FFin, "99/99/99 99:99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPOPRODUCCION", GXutil.ltrim( localUtil.ntoc( AV35TipoProduccion, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPOPRODUCCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35TipoProduccion), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV66Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV66Pgmname, ""))));
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
      return AV12SDTtblLhipros.size() ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV30Emprcod, AV34MaqcodIni, AV33MaqcodFin, AV32FInicio, AV31FFin, AV35TipoProduccion, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV66Pgmname, AV29OrderedBy, AV37FilterFullText) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV30Emprcod, AV34MaqcodIni, AV33MaqcodFin, AV32FInicio, AV31FFin, AV35TipoProduccion, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV66Pgmname, AV29OrderedBy, AV37FilterFullText) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV30Emprcod, AV34MaqcodIni, AV33MaqcodFin, AV32FInicio, AV31FFin, AV35TipoProduccion, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV66Pgmname, AV29OrderedBy, AV37FilterFullText) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV30Emprcod, AV34MaqcodIni, AV33MaqcodFin, AV32FInicio, AV31FFin, AV35TipoProduccion, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV66Pgmname, AV29OrderedBy, AV37FilterFullText) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV30Emprcod, AV34MaqcodIni, AV33MaqcodFin, AV32FInicio, AV31FFin, AV35TipoProduccion, AV22ManageFiltersExecutionStep, AV17ColumnsSelector, AV66Pgmname, AV29OrderedBy, AV37FilterFullText) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "WEBtblLhipro" ;
      Gx_err = (short)(0) ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprodti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprodtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprof_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprokgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hispromtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprolot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__fase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__fase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotr2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__parcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__parcodnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__tipartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupDP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e17DP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdttbllhipros"), AV12SDTtblLhipros);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV20ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV17ColumnsSelector);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTTBLLHIPROS"), AV12SDTtblLhipros);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV26GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_41_fel_idx = 0 ;
         while ( nGXsfl_41_fel_idx < nRC_GXsfl_41 )
         {
            nGXsfl_41_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_fel_idx+1) ;
            sGXsfl_41_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_412( ) ;
            AV41GXV1 = (int)(nGXsfl_41_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12SDTtblLhipros.size() >= AV41GXV1 ) && ( AV41GXV1 > 0 ) )
            {
               AV12SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)) );
               cmbavGridactions.setName( cmbavGridactions.getInternalname() );
               cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
               AV38GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            }
         }
         if ( nGXsfl_41_fel_idx == 0 )
         {
            nGXsfl_41_idx = 1 ;
            sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_412( ) ;
         }
         nGXsfl_41_fel_idx = 1 ;
         /* Read variables values. */
         AV37FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37FilterFullText", AV37FilterFullText);
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
      e17DP2 ();
      if (returnInSub) return;
   }

   public void e17DP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV63Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webtbllhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      AV63Station = GXt_char1 ;
      GXv_char2[0] = AV30Emprcod ;
      GXv_char3[0] = AV64Emprnom ;
      GXv_char4[0] = AV65Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV63Station, GXv_char2, GXv_char3, GXv_char4) ;
      webtbllhipro_impl.this.AV30Emprcod = GXv_char2[0] ;
      webtbllhipro_impl.this.AV64Emprnom = GXv_char3[0] ;
      webtbllhipro_impl.this.AV65Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Emprcod", AV30Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Emprcod, "@!"))));
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
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "WEBtbl Lhipro", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV29OrderedBy < 1 )
      {
         AV29OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OrderedBy), 4, 0));
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e18DP2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTtblLhipro7 = AV36sdttbllhiproCollection ;
      GXv_objcol_SdtSDTtblLhipro8[0] = GXt_objcol_SdtSDTtblLhipro7 ;
      new app.dptbllhipro(remoteHandle, context).execute( AV30Emprcod, AV34MaqcodIni, AV33MaqcodFin, AV32FInicio, AV31FFin, AV35TipoProduccion, GXv_objcol_SdtSDTtblLhipro8) ;
      GXt_objcol_SdtSDTtblLhipro7 = GXv_objcol_SdtSDTtblLhipro8[0] ;
      AV36sdttbllhiproCollection = GXt_objcol_SdtSDTtblLhipro7 ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      if ( AV22ManageFiltersExecutionStep == 1 )
      {
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV22ManageFiltersExecutionStep == 2 )
      {
         AV22ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV19Session.getValue("WEBtblLhiproColumnsSelector"), "") != 0 )
      {
         AV15ColumnsSelectorXML = AV19Session.getValue("WEBtblLhiproColumnsSelector") ;
         AV17ColumnsSelector.fromxml(AV15ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavSdttbllhipros__maqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__maqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqcod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__maqdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__maqdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__maqdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprodti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprodti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodti_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprodtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprodtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprodtf_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprof_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprof_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprof_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprokgr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprokgr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprokgr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hispromtr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hispromtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hispromtr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barnhdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barnhdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnhdr_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprolot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprolot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprolot_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotur_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotur_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotur_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__fase_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__fase_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fase_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__fasdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__fasdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__fasdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotr2_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotr2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotr2_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__parcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__parcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcod_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__parcodnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__parcodnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__parcodnom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barser_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barserdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barserdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barserdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__hisprotip_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__hisprotip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__hisprotip_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__tipartdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__tipartdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__tipartdsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barcolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barcolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barcolnom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavSdttbllhipros__barnomcli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV17ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdttbllhipros__barnomcli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdttbllhipros__barnomcli_Visible), 5, 0), !bGXsfl_41_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV25GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25GridCurrentPage), 10, 0));
      AV26GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12DP2( )
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
         AV24PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV24PageToGo) ;
      }
   }

   public void e13DP2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e19DP2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV12SDTtblLhipros.size() )
      {
         AV12SDTtblLhipros.currentItem( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)) );
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_412( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
         {
            httpContext.doAjaxLoad(41, GridRow);
         }
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV38GridActions, 4, 0)) );
   }

   public void e14DP2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV15ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV17ColumnsSelector.fromJSonString(AV15ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WEBtblLhiproColumnsSelector", ((GXutil.strcmp("", AV15ColumnsSelectorXML)==0) ? "" : AV17ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11DP2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WEBtblLhiproFilters")),GXutil.URLEncode(GXutil.rtrim(AV66Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WEBtblLhiproFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV22ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ManageFiltersExecutionStep", GXutil.str( AV22ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV21ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WEBtblLhiproFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webtbllhipro_impl.this.GXt_char1 = GXv_char4[0] ;
         AV21ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV21ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV21ManageFiltersXml) ;
            AV10GridState.fromxml(AV21ManageFiltersXml, null, null);
            AV29OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OrderedBy), 4, 0));
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17ColumnsSelector", AV17ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ManageFiltersData", AV20ManageFiltersData);
   }

   public void e15DP2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXv_char4[0] = AV13ExcelFilename ;
      GXv_char3[0] = AV14ErrorMessage ;
      new app.webtbllhiproexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webtbllhipro_impl.this.AV13ExcelFilename = GXv_char4[0] ;
      webtbllhipro_impl.this.AV14ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV13ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV13ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV14ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16DP2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webtbllhiproexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV17ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Maqcod", "", "Maquina", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__MaqDsc", "", "Descripcion ", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprodti", "", "Inicio", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprodtf", "", "Fin", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProf", "", "Fin?", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProKgr", "", "HisProKgr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProMtr", "", "HisProMtr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarNhdr", "", "N Hdr", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprolot", "", "Lote", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprotur", "", "Turno", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Fase", "", "Fase Pantalla", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__FasDsc", "", "Descripcion ", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Hisprotr2", "", "Tiempo(m)", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Parcod", "", "Paro", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Parcodnom", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__Barser", "", "Articulo", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarSerdsc", "", "Descripcion", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__HisProTip", "", "Tipo Articulo", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__TipArtDsc", "", "Descripción", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarColNom", "", "Color", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXv_SdtWWPColumnsSelector10[0] = AV17ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, "SDTtblLhipros__BarNomCli", "", "Color Cliente", true, "") ;
      AV17ColumnsSelector = GXv_SdtWWPColumnsSelector10[0] ;
      GXt_char1 = AV16UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WEBtblLhiproColumnsSelector", GXv_char4) ;
      webtbllhipro_impl.this.GXt_char1 = GXv_char4[0] ;
      AV16UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV16UserCustomValue)==0) ) )
      {
         AV18ColumnsSelectorAux.fromxml(AV16UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector10[0] = AV18ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector11[0] = AV17ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector10, GXv_SdtWWPColumnsSelector11) ;
         AV18ColumnsSelectorAux = GXv_SdtWWPColumnsSelector10[0] ;
         AV17ColumnsSelector = GXv_SdtWWPColumnsSelector11[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = AV20ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WEBtblLhiproFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[0] ;
      AV20ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV37FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37FilterFullText", AV37FilterFullText);
   }

   public void S182( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
   }

   public void S192( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV66Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV66Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV19Session.getValue(AV66Pgmname+"GridState"), null, null);
      }
      AV29OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29OrderedBy), 4, 0));
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV67GXV23 = 1 ;
      while ( AV67GXV23 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV67GXV23));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV37FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37FilterFullText", AV37FilterFullText);
         }
         AV67GXV23 = (int)(AV67GXV23+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV19Session.getValue(AV66Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV29OrderedBy );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV37FilterFullText)==0), (short)(0), AV37FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table1_23_DP2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV20ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_DP2( true) ;
      }
      else
      {
         wb_table2_28_DP2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_DP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_DP2e( true) ;
      }
      else
      {
         wb_table1_23_DP2e( false) ;
      }
   }

   public void wb_table2_28_DP2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV37FilterFullText, GXutil.rtrim( localUtil.format( AV37FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WEBtblLhipro.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_DP2e( true) ;
      }
      else
      {
         wb_table2_28_DP2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV30Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Emprcod", AV30Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30Emprcod, "@!"))));
      AV34MaqcodIni = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34MaqcodIni", AV34MaqcodIni);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODINI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34MaqcodIni, ""))));
      AV33MaqcodFin = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33MaqcodFin", AV33MaqcodFin);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODFIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33MaqcodFin, ""))));
      AV32FInicio = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32FInicio", localUtil.ttoc( AV32FInicio, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFINICIO", getSecureSignedToken( "", localUtil.format( AV32FInicio, "99/99/99 99:99:99")));
      AV31FFin = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31FFin", localUtil.ttoc( AV31FFin, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFFIN", getSecureSignedToken( "", localUtil.format( AV31FFin, "99/99/99 99:99:99")));
      AV35TipoProduccion = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TipoProduccion", GXutil.str( AV35TipoProduccion, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPOPRODUCCION", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35TipoProduccion), "9")));
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
      paDP2( ) ;
      wsDP2( ) ;
      weDP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116114664", true, true);
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
      httpContext.AddJavascriptSource("webtbllhipro.js", "?202682116114664", false, true);
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
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_41_idx );
      edtavSdttbllhipros__maqcod_Internalname = "SDTTBLLHIPROS__MAQCOD_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__maqdsc_Internalname = "SDTTBLLHIPROS__MAQDSC_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprodti_Internalname = "SDTTBLLHIPROS__HISPRODTI_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprodtf_Internalname = "SDTTBLLHIPROS__HISPRODTF_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprof_Internalname = "SDTTBLLHIPROS__HISPROF_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprokgr_Internalname = "SDTTBLLHIPROS__HISPROKGR_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hispromtr_Internalname = "SDTTBLLHIPROS__HISPROMTR_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__barnhdr_Internalname = "SDTTBLLHIPROS__BARNHDR_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprolot_Internalname = "SDTTBLLHIPROS__HISPROLOT_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprotur_Internalname = "SDTTBLLHIPROS__HISPROTUR_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__fase_Internalname = "SDTTBLLHIPROS__FASE_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__fasdsc_Internalname = "SDTTBLLHIPROS__FASDSC_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprotr2_Internalname = "SDTTBLLHIPROS__HISPROTR2_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__parcod_Internalname = "SDTTBLLHIPROS__PARCOD_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__parcodnom_Internalname = "SDTTBLLHIPROS__PARCODNOM_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__barser_Internalname = "SDTTBLLHIPROS__BARSER_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__barserdsc_Internalname = "SDTTBLLHIPROS__BARSERDSC_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__hisprotip_Internalname = "SDTTBLLHIPROS__HISPROTIP_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__tipartdsc_Internalname = "SDTTBLLHIPROS__TIPARTDSC_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__barcolnom_Internalname = "SDTTBLLHIPROS__BARCOLNOM_"+sGXsfl_41_idx ;
      edtavSdttbllhipros__barnomcli_Internalname = "SDTTBLLHIPROS__BARNOMCLI_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_41_fel_idx );
      edtavSdttbllhipros__maqcod_Internalname = "SDTTBLLHIPROS__MAQCOD_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__maqdsc_Internalname = "SDTTBLLHIPROS__MAQDSC_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprodti_Internalname = "SDTTBLLHIPROS__HISPRODTI_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprodtf_Internalname = "SDTTBLLHIPROS__HISPRODTF_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprof_Internalname = "SDTTBLLHIPROS__HISPROF_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprokgr_Internalname = "SDTTBLLHIPROS__HISPROKGR_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hispromtr_Internalname = "SDTTBLLHIPROS__HISPROMTR_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__barnhdr_Internalname = "SDTTBLLHIPROS__BARNHDR_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprolot_Internalname = "SDTTBLLHIPROS__HISPROLOT_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprotur_Internalname = "SDTTBLLHIPROS__HISPROTUR_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__fase_Internalname = "SDTTBLLHIPROS__FASE_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__fasdsc_Internalname = "SDTTBLLHIPROS__FASDSC_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprotr2_Internalname = "SDTTBLLHIPROS__HISPROTR2_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__parcod_Internalname = "SDTTBLLHIPROS__PARCOD_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__parcodnom_Internalname = "SDTTBLLHIPROS__PARCODNOM_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__barser_Internalname = "SDTTBLLHIPROS__BARSER_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__barserdsc_Internalname = "SDTTBLLHIPROS__BARSERDSC_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__hisprotip_Internalname = "SDTTBLLHIPROS__HISPROTIP_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__tipartdsc_Internalname = "SDTTBLLHIPROS__TIPARTDSC_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__barcolnom_Internalname = "SDTTBLLHIPROS__BARCOLNOM_"+sGXsfl_41_fel_idx ;
      edtavSdttbllhipros__barnomcli_Internalname = "SDTTBLLHIPROS__BARNOMCLI_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wbDP0( ) ;
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
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'',false,'"+sGXsfl_41_idx+"',41)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               if ( ( AV41GXV1 > 0 ) && ( AV12SDTtblLhipros.size() >= AV41GXV1 ) && (0==AV38GridActions) )
               {
                  AV38GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV38GridActions, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridActions), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV38GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e20dp2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,42);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV38GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_41_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__maqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__maqcod_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Maqcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__maqcod_Visible),Integer.valueOf(edtavSdttbllhipros__maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__maqdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__maqdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Maqdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__maqdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__maqdsc_Visible),Integer.valueOf(edtavSdttbllhipros__maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprodti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprodti_Internalname,localUtil.ttoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodti(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodti(), "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprodti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprodti_Visible),Integer.valueOf(edtavSdttbllhipros__hisprodti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprodtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprodtf_Internalname,localUtil.ttoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodtf(), 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprodtf(), "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprodtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprodtf_Visible),Integer.valueOf(edtavSdttbllhipros__hisprodtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__hisprof_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprof_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprof()),GXutil.rtrim( localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprof(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprof_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprof_Visible),Integer.valueOf(edtavSdttbllhipros__hisprof_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprokgr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprokgr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprokgr_Enabled!=0) ? localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprokgr(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprokgr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprokgr_Visible),Integer.valueOf(edtavSdttbllhipros__hisprokgr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hispromtr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hispromtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hispromtr_Enabled!=0) ? localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hispromtr(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hispromtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hispromtr_Visible),Integer.valueOf(edtavSdttbllhipros__hispromtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barnhdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barnhdr_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Barnhdr()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barnhdr_Visible),Integer.valueOf(edtavSdttbllhipros__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__hisprolot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprolot_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprolot()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprolot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprolot_Visible),Integer.valueOf(edtavSdttbllhipros__hisprolot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprotur_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotur_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotur()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotur_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprotur_Visible),Integer.valueOf(edtavSdttbllhipros__hisprotur_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__fase_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__fase_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Fase()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__fase_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__fase_Visible),Integer.valueOf(edtavSdttbllhipros__fase_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__fasdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__fasdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Fasdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__fasdsc_Visible),Integer.valueOf(edtavSdttbllhipros__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprotr2_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotr2_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotr2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotr2()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotr2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprotr2_Visible),Integer.valueOf(edtavSdttbllhipros__hisprotr2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__parcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__parcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Parcod(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__parcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Parcod()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Parcod()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__parcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__parcod_Visible),Integer.valueOf(edtavSdttbllhipros__parcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__parcodnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__parcodnom_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Parcodnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__parcodnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__parcodnom_Visible),Integer.valueOf(edtavSdttbllhipros__parcodnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barser_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barser_Visible),Integer.valueOf(edtavSdttbllhipros__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barserdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barserdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Barserdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barserdsc_Visible),Integer.valueOf(edtavSdttbllhipros__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavSdttbllhipros__hisprotip_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__hisprotip_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdttbllhipros__hisprotip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Hisprotip()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__hisprotip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__hisprotip_Visible),Integer.valueOf(edtavSdttbllhipros__hisprotip_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__tipartdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__tipartdsc_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Tipartdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__tipartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__tipartdsc_Visible),Integer.valueOf(edtavSdttbllhipros__tipartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barcolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barcolnom_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barcolnom_Visible),Integer.valueOf(edtavSdttbllhipros__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavSdttbllhipros__barnomcli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdttbllhipros__barnomcli_Internalname,GXutil.rtrim( ((app.SdtSDTtblLhipro)AV12SDTtblLhipros.elementAt(-1+AV41GXV1)).getgxTv_SdtSDTtblLhipro_Barnomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdttbllhipros__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavSdttbllhipros__barnomcli_Visible),Integer.valueOf(edtavSdttbllhipros__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesDP2( ) ;
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
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__maqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__maqdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprodti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprodtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprof_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprokgr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HisProKgr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hispromtr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "HisProMtr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barnhdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprolot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprotur_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Turno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__fase_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Pantalla", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__fasdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprotr2_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo(m)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__parcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Paro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__parcodnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barserdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__hisprotip_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__tipartdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barcolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavSdttbllhipros__barnomcli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__maqdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprodtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprof_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprof_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprokgr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprokgr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hispromtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hispromtr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnhdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprolot_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprolot_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotur_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotur_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fase_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fase_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__fasdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotr2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotr2_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcodnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__parcodnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barserdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotip_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__hisprotip_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__tipartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__tipartdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barcolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavSdttbllhipros__barnomcli_Visible, (byte)(5), (byte)(0), ".", "")));
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
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtavSdttbllhipros__maqcod_Internalname = "SDTTBLLHIPROS__MAQCOD" ;
      edtavSdttbllhipros__maqdsc_Internalname = "SDTTBLLHIPROS__MAQDSC" ;
      edtavSdttbllhipros__hisprodti_Internalname = "SDTTBLLHIPROS__HISPRODTI" ;
      edtavSdttbllhipros__hisprodtf_Internalname = "SDTTBLLHIPROS__HISPRODTF" ;
      edtavSdttbllhipros__hisprof_Internalname = "SDTTBLLHIPROS__HISPROF" ;
      edtavSdttbllhipros__hisprokgr_Internalname = "SDTTBLLHIPROS__HISPROKGR" ;
      edtavSdttbllhipros__hispromtr_Internalname = "SDTTBLLHIPROS__HISPROMTR" ;
      edtavSdttbllhipros__barnhdr_Internalname = "SDTTBLLHIPROS__BARNHDR" ;
      edtavSdttbllhipros__hisprolot_Internalname = "SDTTBLLHIPROS__HISPROLOT" ;
      edtavSdttbllhipros__hisprotur_Internalname = "SDTTBLLHIPROS__HISPROTUR" ;
      edtavSdttbllhipros__fase_Internalname = "SDTTBLLHIPROS__FASE" ;
      edtavSdttbllhipros__fasdsc_Internalname = "SDTTBLLHIPROS__FASDSC" ;
      edtavSdttbllhipros__hisprotr2_Internalname = "SDTTBLLHIPROS__HISPROTR2" ;
      edtavSdttbllhipros__parcod_Internalname = "SDTTBLLHIPROS__PARCOD" ;
      edtavSdttbllhipros__parcodnom_Internalname = "SDTTBLLHIPROS__PARCODNOM" ;
      edtavSdttbllhipros__barser_Internalname = "SDTTBLLHIPROS__BARSER" ;
      edtavSdttbllhipros__barserdsc_Internalname = "SDTTBLLHIPROS__BARSERDSC" ;
      edtavSdttbllhipros__hisprotip_Internalname = "SDTTBLLHIPROS__HISPROTIP" ;
      edtavSdttbllhipros__tipartdsc_Internalname = "SDTTBLLHIPROS__TIPARTDSC" ;
      edtavSdttbllhipros__barcolnom_Internalname = "SDTTBLLHIPROS__BARCOLNOM" ;
      edtavSdttbllhipros__barnomcli_Internalname = "SDTTBLLHIPROS__BARNOMCLI" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
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
      edtavSdttbllhipros__barnomcli_Jsonclick = "" ;
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
      edtavSdttbllhipros__barnomcli_Visible = -1 ;
      edtavSdttbllhipros__barcolnom_Jsonclick = "" ;
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      edtavSdttbllhipros__barcolnom_Visible = -1 ;
      edtavSdttbllhipros__tipartdsc_Jsonclick = "" ;
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      edtavSdttbllhipros__tipartdsc_Visible = -1 ;
      edtavSdttbllhipros__hisprotip_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      edtavSdttbllhipros__hisprotip_Visible = -1 ;
      edtavSdttbllhipros__barserdsc_Jsonclick = "" ;
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      edtavSdttbllhipros__barserdsc_Visible = -1 ;
      edtavSdttbllhipros__barser_Jsonclick = "" ;
      edtavSdttbllhipros__barser_Enabled = 0 ;
      edtavSdttbllhipros__barser_Visible = -1 ;
      edtavSdttbllhipros__parcodnom_Jsonclick = "" ;
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      edtavSdttbllhipros__parcodnom_Visible = -1 ;
      edtavSdttbllhipros__parcod_Jsonclick = "" ;
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      edtavSdttbllhipros__parcod_Visible = -1 ;
      edtavSdttbllhipros__hisprotr2_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      edtavSdttbllhipros__hisprotr2_Visible = -1 ;
      edtavSdttbllhipros__fasdsc_Jsonclick = "" ;
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      edtavSdttbllhipros__fasdsc_Visible = -1 ;
      edtavSdttbllhipros__fase_Jsonclick = "" ;
      edtavSdttbllhipros__fase_Enabled = 0 ;
      edtavSdttbllhipros__fase_Visible = -1 ;
      edtavSdttbllhipros__hisprotur_Jsonclick = "" ;
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      edtavSdttbllhipros__hisprotur_Visible = -1 ;
      edtavSdttbllhipros__hisprolot_Jsonclick = "" ;
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      edtavSdttbllhipros__hisprolot_Visible = -1 ;
      edtavSdttbllhipros__barnhdr_Jsonclick = "" ;
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      edtavSdttbllhipros__barnhdr_Visible = -1 ;
      edtavSdttbllhipros__hispromtr_Jsonclick = "" ;
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      edtavSdttbllhipros__hispromtr_Visible = -1 ;
      edtavSdttbllhipros__hisprokgr_Jsonclick = "" ;
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      edtavSdttbllhipros__hisprokgr_Visible = -1 ;
      edtavSdttbllhipros__hisprof_Jsonclick = "" ;
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      edtavSdttbllhipros__hisprof_Visible = -1 ;
      edtavSdttbllhipros__hisprodtf_Jsonclick = "" ;
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      edtavSdttbllhipros__hisprodtf_Visible = -1 ;
      edtavSdttbllhipros__hisprodti_Jsonclick = "" ;
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      edtavSdttbllhipros__hisprodti_Visible = -1 ;
      edtavSdttbllhipros__maqdsc_Jsonclick = "" ;
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      edtavSdttbllhipros__maqdsc_Visible = -1 ;
      edtavSdttbllhipros__maqcod_Jsonclick = "" ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      edtavSdttbllhipros__maqcod_Visible = -1 ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavSdttbllhipros__barnomcli_Visible = -1 ;
      edtavSdttbllhipros__barcolnom_Visible = -1 ;
      edtavSdttbllhipros__tipartdsc_Visible = -1 ;
      edtavSdttbllhipros__hisprotip_Visible = -1 ;
      edtavSdttbllhipros__barserdsc_Visible = -1 ;
      edtavSdttbllhipros__barser_Visible = -1 ;
      edtavSdttbllhipros__parcodnom_Visible = -1 ;
      edtavSdttbllhipros__parcod_Visible = -1 ;
      edtavSdttbllhipros__hisprotr2_Visible = -1 ;
      edtavSdttbllhipros__fasdsc_Visible = -1 ;
      edtavSdttbllhipros__fase_Visible = -1 ;
      edtavSdttbllhipros__hisprotur_Visible = -1 ;
      edtavSdttbllhipros__hisprolot_Visible = -1 ;
      edtavSdttbllhipros__barnhdr_Visible = -1 ;
      edtavSdttbllhipros__hispromtr_Visible = -1 ;
      edtavSdttbllhipros__hisprokgr_Visible = -1 ;
      edtavSdttbllhipros__hisprof_Visible = -1 ;
      edtavSdttbllhipros__hisprodtf_Visible = -1 ;
      edtavSdttbllhipros__hisprodti_Visible = -1 ;
      edtavSdttbllhipros__maqdsc_Visible = -1 ;
      edtavSdttbllhipros__maqcod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavSdttbllhipros__barnomcli_Enabled = -1 ;
      edtavSdttbllhipros__barcolnom_Enabled = -1 ;
      edtavSdttbllhipros__tipartdsc_Enabled = -1 ;
      edtavSdttbllhipros__hisprotip_Enabled = -1 ;
      edtavSdttbllhipros__barserdsc_Enabled = -1 ;
      edtavSdttbllhipros__barser_Enabled = -1 ;
      edtavSdttbllhipros__parcodnom_Enabled = -1 ;
      edtavSdttbllhipros__parcod_Enabled = -1 ;
      edtavSdttbllhipros__hisprotr2_Enabled = -1 ;
      edtavSdttbllhipros__fasdsc_Enabled = -1 ;
      edtavSdttbllhipros__fase_Enabled = -1 ;
      edtavSdttbllhipros__hisprotur_Enabled = -1 ;
      edtavSdttbllhipros__hisprolot_Enabled = -1 ;
      edtavSdttbllhipros__barnhdr_Enabled = -1 ;
      edtavSdttbllhipros__hispromtr_Enabled = -1 ;
      edtavSdttbllhipros__hisprokgr_Enabled = -1 ;
      edtavSdttbllhipros__hisprof_Enabled = -1 ;
      edtavSdttbllhipros__hisprodtf_Enabled = -1 ;
      edtavSdttbllhipros__hisprodti_Enabled = -1 ;
      edtavSdttbllhipros__maqdsc_Enabled = -1 ;
      edtavSdttbllhipros__maqcod_Enabled = -1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||" ;
      Ddo_grid_Columnids = "1:SDTtblLhipros__Maqcod|2:SDTtblLhipros__MaqDsc|3:SDTtblLhipros__Hisprodti|4:SDTtblLhipros__Hisprodtf|5:SDTtblLhipros__HisProf|6:SDTtblLhipros__HisProKgr|7:SDTtblLhipros__HisProMtr|8:SDTtblLhipros__BarNhdr|9:SDTtblLhipros__Hisprolot|10:SDTtblLhipros__Hisprotur|11:SDTtblLhipros__Fase|12:SDTtblLhipros__FasDsc|13:SDTtblLhipros__Hisprotr2|14:SDTtblLhipros__Parcod|15:SDTtblLhipros__Parcodnom|16:SDTtblLhipros__Barser|17:SDTtblLhipros__BarSerdsc|18:SDTtblLhipros__HisProTip|19:SDTtblLhipros__TipArtDsc|20:SDTtblLhipros__BarColNom|21:SDTtblLhipros__BarNomCli" ;
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
      Form.setCaption( httpContext.getMessage( "WEBtbl Lhipro", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_41_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         if ( ( AV41GXV1 > 0 ) && ( AV12SDTtblLhipros.size() >= AV41GXV1 ) && (0==AV38GridActions) )
         {
            AV38GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV38GridActions, 4, 0))))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridActions), 4, 0));
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MaqcodIni',fld:'vMAQCODINI',pic:'',hsh:true},{av:'AV33MaqcodFin',fld:'vMAQCODFIN',pic:'',hsh:true},{av:'AV32FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV31FFin',fld:'vFFIN',pic:'99/99/99 99:99:99',hsh:true},{av:'AV35TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9',hsh:true},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTTBLLHIPROS__MAQCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__MAQDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTI',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROKGR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROMTR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNHDR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROLOT',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTUR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASE',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTR2',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCODNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSER',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSERDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTIP',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNOMCLI',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MaqcodIni',fld:'vMAQCODINI',pic:'',hsh:true},{av:'AV33MaqcodFin',fld:'vMAQCODFIN',pic:'',hsh:true},{av:'AV32FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV31FFin',fld:'vFFIN',pic:'99/99/99 99:99:99',hsh:true},{av:'AV35TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9',hsh:true},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MaqcodIni',fld:'vMAQCODINI',pic:'',hsh:true},{av:'AV33MaqcodFin',fld:'vMAQCODFIN',pic:'',hsh:true},{av:'AV32FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV31FFin',fld:'vFFIN',pic:'99/99/99 99:99:99',hsh:true},{av:'AV35TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9',hsh:true},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e19DP2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV38GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e14DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MaqcodIni',fld:'vMAQCODINI',pic:'',hsh:true},{av:'AV33MaqcodFin',fld:'vMAQCODFIN',pic:'',hsh:true},{av:'AV32FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV31FFin',fld:'vFFIN',pic:'99/99/99 99:99:99',hsh:true},{av:'AV35TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9',hsh:true},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{ctrl:'SDTTBLLHIPROS__MAQCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__MAQDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTI',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROKGR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROMTR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNHDR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROLOT',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTUR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASE',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTR2',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCODNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSER',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSERDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTIP',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNOMCLI',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MaqcodIni',fld:'vMAQCODINI',pic:'',hsh:true},{av:'AV33MaqcodFin',fld:'vMAQCODFIN',pic:'',hsh:true},{av:'AV32FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV31FFin',fld:'vFFIN',pic:'99/99/99 99:99:99',hsh:true},{av:'AV35TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9',hsh:true},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{ctrl:'SDTTBLLHIPROS__MAQCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__MAQDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTI',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPRODTF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROF',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROKGR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROMTR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNHDR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROLOT',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTUR',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASE',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__FASDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTR2',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCOD',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__PARCODNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSER',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARSERDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__HISPROTIP',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__TIPARTDSC',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARCOLNOM',prop:'Visible'},{ctrl:'SDTTBLLHIPROS__BARNOMCLI',prop:'Visible'},{av:'AV25GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV26GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV20ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e20DP2',iparms:[{av:'cmbavGridactions'},{av:'AV38GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV38GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e15DP2',iparms:[{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV30Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MaqcodIni',fld:'vMAQCODINI',pic:'',hsh:true},{av:'AV33MaqcodFin',fld:'vMAQCODFIN',pic:'',hsh:true},{av:'AV32FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV31FFin',fld:'vFFIN',pic:'99/99/99 99:99:99',hsh:true},{av:'AV35TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9',hsh:true},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e16DP2',iparms:[{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV29OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12SDTtblLhipros',fld:'vSDTTBLLHIPROS',grid:41,pic:''},{av:'nGXsfl_41_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:41},{av:'nRC_GXsfl_41',ctrl:'GRID',prop:'GridRC',grid:41},{av:'AV30Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34MaqcodIni',fld:'vMAQCODINI',pic:'',hsh:true},{av:'AV33MaqcodFin',fld:'vMAQCODFIN',pic:'',hsh:true},{av:'AV32FInicio',fld:'vFINICIO',pic:'99/99/99 99:99:99',hsh:true},{av:'AV31FFin',fld:'vFFIN',pic:'99/99/99 99:99:99',hsh:true},{av:'AV35TipoProduccion',fld:'vTIPOPRODUCCION',pic:'9',hsh:true},{av:'AV22ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV17ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV66Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV37FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]}");
      setEventMetadata("VALIDV_GXV6","{handler:'validv_Gxv6',iparms:[]");
      setEventMetadata("VALIDV_GXV6",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv22',iparms:[]");
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
      wcpOAV30Emprcod = "" ;
      wcpOAV34MaqcodIni = "" ;
      wcpOAV33MaqcodFin = "" ;
      wcpOAV32FInicio = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV31FFin = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV30Emprcod = "" ;
      AV34MaqcodIni = "" ;
      AV33MaqcodFin = "" ;
      AV32FInicio = GXutil.resetTime( GXutil.nullDate() );
      AV31FFin = GXutil.resetTime( GXutil.nullDate() );
      AV17ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV66Pgmname = "" ;
      AV37FilterFullText = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV12SDTtblLhipros = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      AV20ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV63Station = "" ;
      GXv_char2 = new String[1] ;
      AV64Emprnom = "" ;
      AV65Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV36sdttbllhiproCollection = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      GXt_objcol_SdtSDTtblLhipro7 = new GXBaseCollection<app.SdtSDTtblLhipro>(app.SdtSDTtblLhipro.class, "SDTtblLhipro", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTtblLhipro8 = new GXBaseCollection[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19Session = httpContext.getWebSession();
      AV15ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV21ManageFiltersXml = "" ;
      AV13ExcelFilename = "" ;
      AV14ErrorMessage = "" ;
      GXv_char3 = new String[1] ;
      AV16UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      AV18ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector10 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector11 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV66Pgmname = "WEBtblLhipro" ;
      /* GeneXus formulas. */
      AV66Pgmname = "WEBtblLhipro" ;
      Gx_err = (short)(0) ;
      edtavSdttbllhipros__maqcod_Enabled = 0 ;
      edtavSdttbllhipros__maqdsc_Enabled = 0 ;
      edtavSdttbllhipros__hisprodti_Enabled = 0 ;
      edtavSdttbllhipros__hisprodtf_Enabled = 0 ;
      edtavSdttbllhipros__hisprof_Enabled = 0 ;
      edtavSdttbllhipros__hisprokgr_Enabled = 0 ;
      edtavSdttbllhipros__hispromtr_Enabled = 0 ;
      edtavSdttbllhipros__barnhdr_Enabled = 0 ;
      edtavSdttbllhipros__hisprolot_Enabled = 0 ;
      edtavSdttbllhipros__hisprotur_Enabled = 0 ;
      edtavSdttbllhipros__fase_Enabled = 0 ;
      edtavSdttbllhipros__fasdsc_Enabled = 0 ;
      edtavSdttbllhipros__hisprotr2_Enabled = 0 ;
      edtavSdttbllhipros__parcod_Enabled = 0 ;
      edtavSdttbllhipros__parcodnom_Enabled = 0 ;
      edtavSdttbllhipros__barser_Enabled = 0 ;
      edtavSdttbllhipros__barserdsc_Enabled = 0 ;
      edtavSdttbllhipros__hisprotip_Enabled = 0 ;
      edtavSdttbllhipros__tipartdsc_Enabled = 0 ;
      edtavSdttbllhipros__barcolnom_Enabled = 0 ;
      edtavSdttbllhipros__barnomcli_Enabled = 0 ;
   }

   private byte wcpOAV35TipoProduccion ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV35TipoProduccion ;
   private byte AV22ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
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
   private short AV29OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV38GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV41GXV1 ;
   private int subGrid_Islastpage ;
   private int edtavSdttbllhipros__maqcod_Enabled ;
   private int edtavSdttbllhipros__maqdsc_Enabled ;
   private int edtavSdttbllhipros__hisprodti_Enabled ;
   private int edtavSdttbllhipros__hisprodtf_Enabled ;
   private int edtavSdttbllhipros__hisprof_Enabled ;
   private int edtavSdttbllhipros__hisprokgr_Enabled ;
   private int edtavSdttbllhipros__hispromtr_Enabled ;
   private int edtavSdttbllhipros__barnhdr_Enabled ;
   private int edtavSdttbllhipros__hisprolot_Enabled ;
   private int edtavSdttbllhipros__hisprotur_Enabled ;
   private int edtavSdttbllhipros__fase_Enabled ;
   private int edtavSdttbllhipros__fasdsc_Enabled ;
   private int edtavSdttbllhipros__hisprotr2_Enabled ;
   private int edtavSdttbllhipros__parcod_Enabled ;
   private int edtavSdttbllhipros__parcodnom_Enabled ;
   private int edtavSdttbllhipros__barser_Enabled ;
   private int edtavSdttbllhipros__barserdsc_Enabled ;
   private int edtavSdttbllhipros__hisprotip_Enabled ;
   private int edtavSdttbllhipros__tipartdsc_Enabled ;
   private int edtavSdttbllhipros__barcolnom_Enabled ;
   private int edtavSdttbllhipros__barnomcli_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_41_fel_idx=1 ;
   private int edtavSdttbllhipros__maqcod_Visible ;
   private int edtavSdttbllhipros__maqdsc_Visible ;
   private int edtavSdttbllhipros__hisprodti_Visible ;
   private int edtavSdttbllhipros__hisprodtf_Visible ;
   private int edtavSdttbllhipros__hisprof_Visible ;
   private int edtavSdttbllhipros__hisprokgr_Visible ;
   private int edtavSdttbllhipros__hispromtr_Visible ;
   private int edtavSdttbllhipros__barnhdr_Visible ;
   private int edtavSdttbllhipros__hisprolot_Visible ;
   private int edtavSdttbllhipros__hisprotur_Visible ;
   private int edtavSdttbllhipros__fase_Visible ;
   private int edtavSdttbllhipros__fasdsc_Visible ;
   private int edtavSdttbllhipros__hisprotr2_Visible ;
   private int edtavSdttbllhipros__parcod_Visible ;
   private int edtavSdttbllhipros__parcodnom_Visible ;
   private int edtavSdttbllhipros__barser_Visible ;
   private int edtavSdttbllhipros__barserdsc_Visible ;
   private int edtavSdttbllhipros__hisprotip_Visible ;
   private int edtavSdttbllhipros__tipartdsc_Visible ;
   private int edtavSdttbllhipros__barcolnom_Visible ;
   private int edtavSdttbllhipros__barnomcli_Visible ;
   private int AV24PageToGo ;
   private int AV67GXV23 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV25GridCurrentPage ;
   private long AV26GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV30Emprcod ;
   private String wcpOAV34MaqcodIni ;
   private String wcpOAV33MaqcodFin ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV30Emprcod ;
   private String AV34MaqcodIni ;
   private String AV33MaqcodFin ;
   private String sGXsfl_41_idx="0001" ;
   private String AV66Pgmname ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtavSdttbllhipros__maqcod_Internalname ;
   private String edtavSdttbllhipros__maqdsc_Internalname ;
   private String edtavSdttbllhipros__hisprodti_Internalname ;
   private String edtavSdttbllhipros__hisprodtf_Internalname ;
   private String edtavSdttbllhipros__hisprof_Internalname ;
   private String edtavSdttbllhipros__hisprokgr_Internalname ;
   private String edtavSdttbllhipros__hispromtr_Internalname ;
   private String edtavSdttbllhipros__barnhdr_Internalname ;
   private String edtavSdttbllhipros__hisprolot_Internalname ;
   private String edtavSdttbllhipros__hisprotur_Internalname ;
   private String edtavSdttbllhipros__fase_Internalname ;
   private String edtavSdttbllhipros__fasdsc_Internalname ;
   private String edtavSdttbllhipros__hisprotr2_Internalname ;
   private String edtavSdttbllhipros__parcod_Internalname ;
   private String edtavSdttbllhipros__parcodnom_Internalname ;
   private String edtavSdttbllhipros__barser_Internalname ;
   private String edtavSdttbllhipros__barserdsc_Internalname ;
   private String edtavSdttbllhipros__hisprotip_Internalname ;
   private String edtavSdttbllhipros__tipartdsc_Internalname ;
   private String edtavSdttbllhipros__barcolnom_Internalname ;
   private String edtavSdttbllhipros__barnomcli_Internalname ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String AV63Station ;
   private String GXv_char2[] ;
   private String AV64Emprnom ;
   private String AV65Usurcod ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSdttbllhipros__maqcod_Jsonclick ;
   private String edtavSdttbllhipros__maqdsc_Jsonclick ;
   private String edtavSdttbllhipros__hisprodti_Jsonclick ;
   private String edtavSdttbllhipros__hisprodtf_Jsonclick ;
   private String edtavSdttbllhipros__hisprof_Jsonclick ;
   private String edtavSdttbllhipros__hisprokgr_Jsonclick ;
   private String edtavSdttbllhipros__hispromtr_Jsonclick ;
   private String edtavSdttbllhipros__barnhdr_Jsonclick ;
   private String edtavSdttbllhipros__hisprolot_Jsonclick ;
   private String edtavSdttbllhipros__hisprotur_Jsonclick ;
   private String edtavSdttbllhipros__fase_Jsonclick ;
   private String edtavSdttbllhipros__fasdsc_Jsonclick ;
   private String edtavSdttbllhipros__hisprotr2_Jsonclick ;
   private String edtavSdttbllhipros__parcod_Jsonclick ;
   private String edtavSdttbllhipros__parcodnom_Jsonclick ;
   private String edtavSdttbllhipros__barser_Jsonclick ;
   private String edtavSdttbllhipros__barserdsc_Jsonclick ;
   private String edtavSdttbllhipros__hisprotip_Jsonclick ;
   private String edtavSdttbllhipros__tipartdsc_Jsonclick ;
   private String edtavSdttbllhipros__barcolnom_Jsonclick ;
   private String edtavSdttbllhipros__barnomcli_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV32FInicio ;
   private java.util.Date wcpOAV31FFin ;
   private java.util.Date AV32FInicio ;
   private java.util.Date AV31FFin ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV15ColumnsSelectorXML ;
   private String AV21ManageFiltersXml ;
   private String AV16UserCustomValue ;
   private String AV37FilterFullText ;
   private String AV13ExcelFilename ;
   private String AV14ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV20ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item12 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item13[] ;
   private GXBaseCollection<app.SdtSDTtblLhipro> AV12SDTtblLhipros ;
   private GXBaseCollection<app.SdtSDTtblLhipro> AV36sdttbllhiproCollection ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXt_objcol_SdtSDTtblLhipro7 ;
   private GXBaseCollection<app.SdtSDTtblLhipro> GXv_objcol_SdtSDTtblLhipro8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV17ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV18ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector10[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

