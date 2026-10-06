package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webpromptdibujo_impl extends GXDataArea
{
   public webpromptdibujo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webpromptdibujo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webpromptdibujo_impl.class ));
   }

   public webpromptdibujo_impl( int remoteHandle ,
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
      lstDibTipMaq = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            AV60InOutEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60InOutEmprCod", AV60InOutEmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8InOutDibCli = httpContext.GetPar( "InOutDibCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8InOutDibCli", AV8InOutDibCli);
               AV61InOutCliCod = (int)(GXutil.lval( httpContext.GetPar( "InOutCliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61InOutCliCod), 6, 0));
               AV10InOutDibInt = (int)(GXutil.lval( httpContext.GetPar( "InOutDibInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10InOutDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10InOutDibInt), 8, 0));
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
      nRC_GXsfl_108 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_108"))) ;
      nGXsfl_108_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_108_idx"))) ;
      sGXsfl_108_idx = httpContext.GetPar( "sGXsfl_108_idx") ;
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
      AV59FilterFullText = httpContext.GetPar( "FilterFullText") ;
      cmbavDynamicfiltersselector1.fromJSonString( httpContext.GetNextPar( ));
      AV19DynamicFiltersSelector1 = httpContext.GetPar( "DynamicFiltersSelector1") ;
      cmbavDynamicfiltersoperator1.fromJSonString( httpContext.GetNextPar( ));
      AV20DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator1"))) ;
      AV21DibDsc1 = httpContext.GetPar( "DibDsc1") ;
      AV22GrabNom1 = httpContext.GetPar( "GrabNom1") ;
      AV23TipMqnDsc1 = httpContext.GetPar( "TipMqnDsc1") ;
      cmbavDynamicfiltersselector2.fromJSonString( httpContext.GetNextPar( ));
      AV25DynamicFiltersSelector2 = httpContext.GetPar( "DynamicFiltersSelector2") ;
      cmbavDynamicfiltersoperator2.fromJSonString( httpContext.GetNextPar( ));
      AV26DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator2"))) ;
      AV27DibDsc2 = httpContext.GetPar( "DibDsc2") ;
      AV28GrabNom2 = httpContext.GetPar( "GrabNom2") ;
      AV29TipMqnDsc2 = httpContext.GetPar( "TipMqnDsc2") ;
      cmbavDynamicfiltersselector3.fromJSonString( httpContext.GetNextPar( ));
      AV31DynamicFiltersSelector3 = httpContext.GetPar( "DynamicFiltersSelector3") ;
      cmbavDynamicfiltersoperator3.fromJSonString( httpContext.GetNextPar( ));
      AV32DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator3"))) ;
      AV33DibDsc3 = httpContext.GetPar( "DibDsc3") ;
      AV34GrabNom3 = httpContext.GetPar( "GrabNom3") ;
      AV35TipMqnDsc3 = httpContext.GetPar( "TipMqnDsc3") ;
      AV24DynamicFiltersEnabled2 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled2")) ;
      AV30DynamicFiltersEnabled3 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled3")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
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
      paK62( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startK62( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeText( " "+"class=\"form-horizontal FormNoBackgroundColor\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.webpromptdibujo", new String[] {GXutil.URLEncode(GXutil.rtrim(AV60InOutEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8InOutDibCli)),GXutil.URLEncode(GXutil.ltrimstr(AV61InOutCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10InOutDibInt,8,0))}, new String[] {"InOutEmprCod","InOutDibCli","InOutCliCod","InOutDibInt"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormNoBackgroundColor", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV59FilterFullText);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR1", AV19DynamicFiltersSelector1);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR1", GXutil.ltrim( localUtil.ntoc( AV20DynamicFiltersOperator1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDIBDSC1", GXutil.rtrim( AV21DibDsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vGRABNOM1", GXutil.rtrim( AV22GrabNom1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIPMQNDSC1", GXutil.rtrim( AV23TipMqnDsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR2", AV25DynamicFiltersSelector2);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR2", GXutil.ltrim( localUtil.ntoc( AV26DynamicFiltersOperator2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDIBDSC2", GXutil.rtrim( AV27DibDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vGRABNOM2", GXutil.rtrim( AV28GrabNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIPMQNDSC2", GXutil.rtrim( AV29TipMqnDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR3", AV31DynamicFiltersSelector3);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR3", GXutil.ltrim( localUtil.ntoc( AV32DynamicFiltersOperator3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDIBDSC3", GXutil.rtrim( AV33DibDsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vGRABNOM3", GXutil.rtrim( AV34GrabNom3));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vTIPMQNDSC3", GXutil.rtrim( AV35TipMqnDsc3));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_108", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_108, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV56GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV57GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED2", AV24DynamicFiltersEnabled2);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED3", AV30DynamicFiltersEnabled3);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV18OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV14GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV14GridState);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSIGNOREFIRST", AV37DynamicFiltersIgnoreFirst);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSREMOVING", AV36DynamicFiltersRemoving);
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTEMPRCOD", GXutil.rtrim( AV60InOutEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTDIBCLI", GXutil.rtrim( AV8InOutDibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTCLICOD", GXutil.ltrim( localUtil.ntoc( AV61InOutCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTDIBINT", GXutil.ltrim( localUtil.ntoc( AV10InOutDibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormNoBackgroundColor" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weK62( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtK62( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.webpromptdibujo", new String[] {GXutil.URLEncode(GXutil.rtrim(AV60InOutEmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8InOutDibCli)),GXutil.URLEncode(GXutil.ltrimstr(AV61InOutCliCod,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10InOutDibInt,8,0))}, new String[] {"InOutEmprCod","InOutDibCli","InOutCliCod","InOutDibInt"})  ;
   }

   public String getPgmname( )
   {
      return "WebPromptDibujo" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selecciona LLAMADA TRN DESDE FUERA", "") ;
   }

   public void wbK60( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainPrompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         wb_table1_12_K62( true) ;
      }
      else
      {
         wb_table1_12_K62( false) ;
      }
      return  ;
   }

   public void wb_table1_12_K62e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol108( ) ;
      }
      if ( wbEnd == 108 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_108 = (int)(nGXsfl_108_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV56GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV57GridPageCount);
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblJsdynamicfilters_Internalname, lblJsdynamicfilters_Caption, "", "", lblJsdynamicfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "", 0, "", 1, 1, 0, (short)(1), "HLP_WebPromptDibujo.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV54DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 108 )
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

   public void startK62( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Selecciona LLAMADA TRN DESDE FUERA", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupK60( ) ;
   }

   public void wsK62( )
   {
      startK62( ) ;
      evtK62( ) ;
   }

   public void evtK62( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters1' */
                           e14K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters2' */
                           e15K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS3'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters3' */
                           e16K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCLEANFILTERS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCleanFilters' */
                           e17K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters1' */
                           e18K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR1.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e19K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters2' */
                           e20K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR2.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e21K62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR3.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e22K62 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_108_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1082( ) ;
                           AV58Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV58Select);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1017DibFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDibFecEnt_Internalname), 0)) ;
                           n1017DibFecEnt = false ;
                           A1005GrabCod = (short)(localUtil.ctol( httpContext.cgiGet( edtGrabCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1005GrabCod = false ;
                           A3911TipMqnCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipMqnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3911TipMqnCod = false ;
                           lstDibTipMaq.setName( lstDibTipMaq.getInternalname() );
                           lstDibTipMaq.setValue( httpContext.cgiGet( lstDibTipMaq.getInternalname()) );
                           A1823DibTipMaq = httpContext.cgiGet( lstDibTipMaq.getInternalname()) ;
                           n1823DibTipMaq = false ;
                           A1019DibMolCil = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1019DibMolCil = false ;
                           A2090DibMolCi2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCi2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2090DibMolCi2 = false ;
                           A1015DibFecUlt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtDibFecUlt_Internalname), 0)) ;
                           n1015DibFecUlt = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e23K62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e24K62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e25K62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV59FilterFullText) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV19DynamicFiltersSelector1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator1 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV20DynamicFiltersOperator1 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dibdsc1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDIBDSC1"), AV21DibDsc1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Grabnom1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vGRABNOM1"), AV22GrabNom1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tipmqndsc1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPMQNDSC1"), AV23TipMqnDsc1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV25DynamicFiltersSelector2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV26DynamicFiltersOperator2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dibdsc2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDIBDSC2"), AV27DibDsc2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Grabnom2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vGRABNOM2"), AV28GrabNom2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tipmqndsc2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPMQNDSC2"), AV29TipMqnDsc2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV31DynamicFiltersSelector3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator3 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV32DynamicFiltersOperator3 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dibdsc3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDIBDSC3"), AV33DibDsc3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Grabnom3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vGRABNOM3"), AV34GrabNom3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Tipmqndsc3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPMQNDSC3"), AV35TipMqnDsc3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e26K62 ();
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

   public void weK62( )
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

   public void paK62( )
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
      subsflControlProps_1082( ) ;
      while ( nGXsfl_108_idx <= nRC_GXsfl_108 )
      {
         sendrow_1082( ) ;
         nGXsfl_108_idx = ((subGrid_Islastpage==1)&&(nGXsfl_108_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_108_idx+1) ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1082( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV59FilterFullText ,
                                 String AV19DynamicFiltersSelector1 ,
                                 short AV20DynamicFiltersOperator1 ,
                                 String AV21DibDsc1 ,
                                 String AV22GrabNom1 ,
                                 String AV23TipMqnDsc1 ,
                                 String AV25DynamicFiltersSelector2 ,
                                 short AV26DynamicFiltersOperator2 ,
                                 String AV27DibDsc2 ,
                                 String AV28GrabNom2 ,
                                 String AV29TipMqnDsc2 ,
                                 String AV31DynamicFiltersSelector3 ,
                                 short AV32DynamicFiltersOperator3 ,
                                 String AV33DibDsc3 ,
                                 String AV34GrabNom3 ,
                                 String AV35TipMqnDsc3 ,
                                 boolean AV24DynamicFiltersEnabled2 ,
                                 boolean AV30DynamicFiltersEnabled3 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e24K62 ();
      GRID_nCurrentRecord = 0 ;
      rfK62( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DIBCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A1013DibCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBCLI", GXutil.rtrim( A1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DIBINT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "DIBINT", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
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
         AV19DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV19DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersSelector1", AV19DynamicFiltersSelector1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV19DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV20DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV25DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV25DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersSelector2", AV25DynamicFiltersSelector2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV25DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV26DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV31DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV31DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersSelector3", AV31DynamicFiltersSelector3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV31DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV32DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfK62( ) ;
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
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_108_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV19DynamicFiltersSelector1 ,
                                           Short.valueOf(AV20DynamicFiltersOperator1) ,
                                           AV21DibDsc1 ,
                                           AV22GrabNom1 ,
                                           AV23TipMqnDsc1 ,
                                           Boolean.valueOf(AV24DynamicFiltersEnabled2) ,
                                           AV25DynamicFiltersSelector2 ,
                                           Short.valueOf(AV26DynamicFiltersOperator2) ,
                                           AV27DibDsc2 ,
                                           AV28GrabNom2 ,
                                           AV29TipMqnDsc2 ,
                                           Boolean.valueOf(AV30DynamicFiltersEnabled3) ,
                                           AV31DynamicFiltersSelector3 ,
                                           Short.valueOf(AV32DynamicFiltersOperator3) ,
                                           AV33DibDsc3 ,
                                           AV34GrabNom3 ,
                                           AV35TipMqnDsc3 ,
                                           Short.valueOf(AV47TFDibMolCil) ,
                                           Short.valueOf(AV48TFDibMolCil_To) ,
                                           Short.valueOf(AV50TFDibMolCi2) ,
                                           Short.valueOf(AV51TFDibMolCi2_To) ,
                                           A6841DibDsc ,
                                           A1006GrabNom ,
                                           A3912TipMqnDsc ,
                                           Short.valueOf(A1019DibMolCil) ,
                                           Short.valueOf(A2090DibMolCi2) ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           AV59FilterFullText ,
                                           A1013DibCli ,
                                           Integer.valueOf(A252CliCod) ,
                                           Integer.valueOf(A1014DibInt) ,
                                           Short.valueOf(A1005GrabCod) ,
                                           Byte.valueOf(A3911TipMqnCod) ,
                                           A1823DibTipMaq } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      lV21DibDsc1 = GXutil.padr( GXutil.rtrim( AV21DibDsc1), 30, "%") ;
      lV21DibDsc1 = GXutil.padr( GXutil.rtrim( AV21DibDsc1), 30, "%") ;
      lV22GrabNom1 = GXutil.padr( GXutil.rtrim( AV22GrabNom1), 30, "%") ;
      lV22GrabNom1 = GXutil.padr( GXutil.rtrim( AV22GrabNom1), 30, "%") ;
      lV23TipMqnDsc1 = GXutil.padr( GXutil.rtrim( AV23TipMqnDsc1), 30, "%") ;
      lV23TipMqnDsc1 = GXutil.padr( GXutil.rtrim( AV23TipMqnDsc1), 30, "%") ;
      lV27DibDsc2 = GXutil.padr( GXutil.rtrim( AV27DibDsc2), 30, "%") ;
      lV27DibDsc2 = GXutil.padr( GXutil.rtrim( AV27DibDsc2), 30, "%") ;
      lV28GrabNom2 = GXutil.padr( GXutil.rtrim( AV28GrabNom2), 30, "%") ;
      lV28GrabNom2 = GXutil.padr( GXutil.rtrim( AV28GrabNom2), 30, "%") ;
      lV29TipMqnDsc2 = GXutil.padr( GXutil.rtrim( AV29TipMqnDsc2), 30, "%") ;
      lV29TipMqnDsc2 = GXutil.padr( GXutil.rtrim( AV29TipMqnDsc2), 30, "%") ;
      lV33DibDsc3 = GXutil.padr( GXutil.rtrim( AV33DibDsc3), 30, "%") ;
      lV33DibDsc3 = GXutil.padr( GXutil.rtrim( AV33DibDsc3), 30, "%") ;
      lV34GrabNom3 = GXutil.padr( GXutil.rtrim( AV34GrabNom3), 30, "%") ;
      lV34GrabNom3 = GXutil.padr( GXutil.rtrim( AV34GrabNom3), 30, "%") ;
      lV35TipMqnDsc3 = GXutil.padr( GXutil.rtrim( AV35TipMqnDsc3), 30, "%") ;
      lV35TipMqnDsc3 = GXutil.padr( GXutil.rtrim( AV35TipMqnDsc3), 30, "%") ;
      /* Using cursor H00K62 */
      pr_default.execute(0, new Object[] {lV21DibDsc1, lV21DibDsc1, lV22GrabNom1, lV22GrabNom1, lV23TipMqnDsc1, lV23TipMqnDsc1, lV27DibDsc2, lV27DibDsc2, lV28GrabNom2, lV28GrabNom2, lV29TipMqnDsc2, lV29TipMqnDsc2, lV33DibDsc3, lV33DibDsc3, lV34GrabNom3, lV34GrabNom3, lV35TipMqnDsc3, lV35TipMqnDsc3, Short.valueOf(AV47TFDibMolCil), Short.valueOf(AV48TFDibMolCil_To), Short.valueOf(AV50TFDibMolCi2), Short.valueOf(AV51TFDibMolCi2_To)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A3912TipMqnDsc = H00K62_A3912TipMqnDsc[0] ;
         n3912TipMqnDsc = H00K62_n3912TipMqnDsc[0] ;
         A1006GrabNom = H00K62_A1006GrabNom[0] ;
         n1006GrabNom = H00K62_n1006GrabNom[0] ;
         A6841DibDsc = H00K62_A6841DibDsc[0] ;
         n6841DibDsc = H00K62_n6841DibDsc[0] ;
         A1015DibFecUlt = H00K62_A1015DibFecUlt[0] ;
         n1015DibFecUlt = H00K62_n1015DibFecUlt[0] ;
         A2090DibMolCi2 = H00K62_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = H00K62_n2090DibMolCi2[0] ;
         A1019DibMolCil = H00K62_A1019DibMolCil[0] ;
         n1019DibMolCil = H00K62_n1019DibMolCil[0] ;
         A1823DibTipMaq = H00K62_A1823DibTipMaq[0] ;
         n1823DibTipMaq = H00K62_n1823DibTipMaq[0] ;
         A3911TipMqnCod = H00K62_A3911TipMqnCod[0] ;
         n3911TipMqnCod = H00K62_n3911TipMqnCod[0] ;
         A1005GrabCod = H00K62_A1005GrabCod[0] ;
         n1005GrabCod = H00K62_n1005GrabCod[0] ;
         A1017DibFecEnt = H00K62_A1017DibFecEnt[0] ;
         n1017DibFecEnt = H00K62_n1017DibFecEnt[0] ;
         A1014DibInt = H00K62_A1014DibInt[0] ;
         A252CliCod = H00K62_A252CliCod[0] ;
         A1013DibCli = H00K62_A1013DibCli[0] ;
         A396EmprCod = H00K62_A396EmprCod[0] ;
         A1006GrabNom = H00K62_A1006GrabNom[0] ;
         n1006GrabNom = H00K62_n1006GrabNom[0] ;
         A3912TipMqnDsc = H00K62_A3912TipMqnDsc[0] ;
         n3912TipMqnDsc = H00K62_n3912TipMqnDsc[0] ;
         if ( (GXutil.strcmp("", AV59FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A1013DibCli) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1014DibInt, 8, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1005GrabCod, 4, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3911TipMqnCod, 2, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "rotativa", "") , GXutil.padr( "%" + GXutil.lower( AV59FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A1823DibTipMaq, "R") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "plana", "") , GXutil.padr( "%" + GXutil.lower( AV59FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A1823DibTipMaq, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "digital", "") , GXutil.padr( "%" + GXutil.lower( AV59FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A1823DibTipMaq, "D") == 0 ) ) || ( GXutil.like( GXutil.str( A1019DibMolCil, 4, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2090DibMolCi2, 4, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) ) )
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

   public void rfK62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(108) ;
      /* Execute user event: Refresh */
      e24K62 ();
      nGXsfl_108_idx = 1 ;
      sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1082( ) ;
      bGXsfl_108_Refreshing = true ;
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
         subsflControlProps_1082( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV19DynamicFiltersSelector1 ,
                                              Short.valueOf(AV20DynamicFiltersOperator1) ,
                                              AV21DibDsc1 ,
                                              AV22GrabNom1 ,
                                              AV23TipMqnDsc1 ,
                                              Boolean.valueOf(AV24DynamicFiltersEnabled2) ,
                                              AV25DynamicFiltersSelector2 ,
                                              Short.valueOf(AV26DynamicFiltersOperator2) ,
                                              AV27DibDsc2 ,
                                              AV28GrabNom2 ,
                                              AV29TipMqnDsc2 ,
                                              Boolean.valueOf(AV30DynamicFiltersEnabled3) ,
                                              AV31DynamicFiltersSelector3 ,
                                              Short.valueOf(AV32DynamicFiltersOperator3) ,
                                              AV33DibDsc3 ,
                                              AV34GrabNom3 ,
                                              AV35TipMqnDsc3 ,
                                              Short.valueOf(AV47TFDibMolCil) ,
                                              Short.valueOf(AV48TFDibMolCil_To) ,
                                              Short.valueOf(AV50TFDibMolCi2) ,
                                              Short.valueOf(AV51TFDibMolCi2_To) ,
                                              A6841DibDsc ,
                                              A1006GrabNom ,
                                              A3912TipMqnDsc ,
                                              Short.valueOf(A1019DibMolCil) ,
                                              Short.valueOf(A2090DibMolCi2) ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              AV59FilterFullText ,
                                              A1013DibCli ,
                                              Integer.valueOf(A252CliCod) ,
                                              Integer.valueOf(A1014DibInt) ,
                                              Short.valueOf(A1005GrabCod) ,
                                              Byte.valueOf(A3911TipMqnCod) ,
                                              A1823DibTipMaq } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN
                                              }
         });
         lV21DibDsc1 = GXutil.padr( GXutil.rtrim( AV21DibDsc1), 30, "%") ;
         lV21DibDsc1 = GXutil.padr( GXutil.rtrim( AV21DibDsc1), 30, "%") ;
         lV22GrabNom1 = GXutil.padr( GXutil.rtrim( AV22GrabNom1), 30, "%") ;
         lV22GrabNom1 = GXutil.padr( GXutil.rtrim( AV22GrabNom1), 30, "%") ;
         lV23TipMqnDsc1 = GXutil.padr( GXutil.rtrim( AV23TipMqnDsc1), 30, "%") ;
         lV23TipMqnDsc1 = GXutil.padr( GXutil.rtrim( AV23TipMqnDsc1), 30, "%") ;
         lV27DibDsc2 = GXutil.padr( GXutil.rtrim( AV27DibDsc2), 30, "%") ;
         lV27DibDsc2 = GXutil.padr( GXutil.rtrim( AV27DibDsc2), 30, "%") ;
         lV28GrabNom2 = GXutil.padr( GXutil.rtrim( AV28GrabNom2), 30, "%") ;
         lV28GrabNom2 = GXutil.padr( GXutil.rtrim( AV28GrabNom2), 30, "%") ;
         lV29TipMqnDsc2 = GXutil.padr( GXutil.rtrim( AV29TipMqnDsc2), 30, "%") ;
         lV29TipMqnDsc2 = GXutil.padr( GXutil.rtrim( AV29TipMqnDsc2), 30, "%") ;
         lV33DibDsc3 = GXutil.padr( GXutil.rtrim( AV33DibDsc3), 30, "%") ;
         lV33DibDsc3 = GXutil.padr( GXutil.rtrim( AV33DibDsc3), 30, "%") ;
         lV34GrabNom3 = GXutil.padr( GXutil.rtrim( AV34GrabNom3), 30, "%") ;
         lV34GrabNom3 = GXutil.padr( GXutil.rtrim( AV34GrabNom3), 30, "%") ;
         lV35TipMqnDsc3 = GXutil.padr( GXutil.rtrim( AV35TipMqnDsc3), 30, "%") ;
         lV35TipMqnDsc3 = GXutil.padr( GXutil.rtrim( AV35TipMqnDsc3), 30, "%") ;
         /* Using cursor H00K63 */
         pr_default.execute(1, new Object[] {lV21DibDsc1, lV21DibDsc1, lV22GrabNom1, lV22GrabNom1, lV23TipMqnDsc1, lV23TipMqnDsc1, lV27DibDsc2, lV27DibDsc2, lV28GrabNom2, lV28GrabNom2, lV29TipMqnDsc2, lV29TipMqnDsc2, lV33DibDsc3, lV33DibDsc3, lV34GrabNom3, lV34GrabNom3, lV35TipMqnDsc3, lV35TipMqnDsc3, Short.valueOf(AV47TFDibMolCil), Short.valueOf(AV48TFDibMolCil_To), Short.valueOf(AV50TFDibMolCi2), Short.valueOf(AV51TFDibMolCi2_To)});
         nGXsfl_108_idx = 1 ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1082( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A3912TipMqnDsc = H00K63_A3912TipMqnDsc[0] ;
            n3912TipMqnDsc = H00K63_n3912TipMqnDsc[0] ;
            A1006GrabNom = H00K63_A1006GrabNom[0] ;
            n1006GrabNom = H00K63_n1006GrabNom[0] ;
            A6841DibDsc = H00K63_A6841DibDsc[0] ;
            n6841DibDsc = H00K63_n6841DibDsc[0] ;
            A1015DibFecUlt = H00K63_A1015DibFecUlt[0] ;
            n1015DibFecUlt = H00K63_n1015DibFecUlt[0] ;
            A2090DibMolCi2 = H00K63_A2090DibMolCi2[0] ;
            n2090DibMolCi2 = H00K63_n2090DibMolCi2[0] ;
            A1019DibMolCil = H00K63_A1019DibMolCil[0] ;
            n1019DibMolCil = H00K63_n1019DibMolCil[0] ;
            A1823DibTipMaq = H00K63_A1823DibTipMaq[0] ;
            n1823DibTipMaq = H00K63_n1823DibTipMaq[0] ;
            A3911TipMqnCod = H00K63_A3911TipMqnCod[0] ;
            n3911TipMqnCod = H00K63_n3911TipMqnCod[0] ;
            A1005GrabCod = H00K63_A1005GrabCod[0] ;
            n1005GrabCod = H00K63_n1005GrabCod[0] ;
            A1017DibFecEnt = H00K63_A1017DibFecEnt[0] ;
            n1017DibFecEnt = H00K63_n1017DibFecEnt[0] ;
            A1014DibInt = H00K63_A1014DibInt[0] ;
            A252CliCod = H00K63_A252CliCod[0] ;
            A1013DibCli = H00K63_A1013DibCli[0] ;
            A396EmprCod = H00K63_A396EmprCod[0] ;
            A1006GrabNom = H00K63_A1006GrabNom[0] ;
            n1006GrabNom = H00K63_n1006GrabNom[0] ;
            A3912TipMqnDsc = H00K63_A3912TipMqnDsc[0] ;
            n3912TipMqnDsc = H00K63_n3912TipMqnDsc[0] ;
            if ( (GXutil.strcmp("", AV59FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A1013DibCli) , GXutil.padr( "%" + GXutil.upper( AV59FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A252CliCod, 6, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1014DibInt, 8, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1005GrabCod, 4, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A3911TipMqnCod, 2, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "rotativa", "") , GXutil.padr( "%" + GXutil.lower( AV59FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A1823DibTipMaq, "R") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "plana", "") , GXutil.padr( "%" + GXutil.lower( AV59FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A1823DibTipMaq, "P") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "digital", "") , GXutil.padr( "%" + GXutil.lower( AV59FilterFullText) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A1823DibTipMaq, "D") == 0 ) ) || ( GXutil.like( GXutil.str( A1019DibMolCil, 4, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A2090DibMolCi2, 4, 0) , GXutil.padr( "%" + AV59FilterFullText , 254 , "%"),  ' ' ) ) ) )
            {
               e25K62 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(108) ;
         wbK60( ) ;
      }
      bGXsfl_108_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesK62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_108_idx, getSecureSignedToken( sGXsfl_108_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DIBCLI"+"_"+sGXsfl_108_idx, getSecureSignedToken( sGXsfl_108_idx, GXutil.rtrim( localUtil.format( A1013DibCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_108_idx, getSecureSignedToken( sGXsfl_108_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DIBINT"+"_"+sGXsfl_108_idx, getSecureSignedToken( sGXsfl_108_idx, localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9")));
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupK60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e23K62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV54DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_108 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_108"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV56GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV57GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         AV59FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59FilterFullText", AV59FilterFullText);
         cmbavDynamicfiltersselector1.setName( cmbavDynamicfiltersselector1.getInternalname() );
         cmbavDynamicfiltersselector1.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) );
         AV19DynamicFiltersSelector1 = httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersSelector1", AV19DynamicFiltersSelector1);
         cmbavDynamicfiltersoperator1.setName( cmbavDynamicfiltersoperator1.getInternalname() );
         cmbavDynamicfiltersoperator1.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()) );
         AV20DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
         AV21DibDsc1 = httpContext.cgiGet( edtavDibdsc1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DibDsc1", AV21DibDsc1);
         AV22GrabNom1 = httpContext.cgiGet( edtavGrabnom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22GrabNom1", AV22GrabNom1);
         AV23TipMqnDsc1 = httpContext.cgiGet( edtavTipmqndsc1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23TipMqnDsc1", AV23TipMqnDsc1);
         cmbavDynamicfiltersselector2.setName( cmbavDynamicfiltersselector2.getInternalname() );
         cmbavDynamicfiltersselector2.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) );
         AV25DynamicFiltersSelector2 = httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersSelector2", AV25DynamicFiltersSelector2);
         cmbavDynamicfiltersoperator2.setName( cmbavDynamicfiltersoperator2.getInternalname() );
         cmbavDynamicfiltersoperator2.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()) );
         AV26DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
         AV27DibDsc2 = httpContext.cgiGet( edtavDibdsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DibDsc2", AV27DibDsc2);
         AV28GrabNom2 = httpContext.cgiGet( edtavGrabnom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28GrabNom2", AV28GrabNom2);
         AV29TipMqnDsc2 = httpContext.cgiGet( edtavTipmqndsc2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29TipMqnDsc2", AV29TipMqnDsc2);
         cmbavDynamicfiltersselector3.setName( cmbavDynamicfiltersselector3.getInternalname() );
         cmbavDynamicfiltersselector3.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) );
         AV31DynamicFiltersSelector3 = httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersSelector3", AV31DynamicFiltersSelector3);
         cmbavDynamicfiltersoperator3.setName( cmbavDynamicfiltersoperator3.getInternalname() );
         cmbavDynamicfiltersoperator3.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()) );
         AV32DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
         AV33DibDsc3 = httpContext.cgiGet( edtavDibdsc3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33DibDsc3", AV33DibDsc3);
         AV34GrabNom3 = httpContext.cgiGet( edtavGrabnom3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34GrabNom3", AV34GrabNom3);
         AV35TipMqnDsc3 = httpContext.cgiGet( edtavTipmqndsc3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35TipMqnDsc3", AV35TipMqnDsc3);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV59FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV19DynamicFiltersSelector1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV20DynamicFiltersOperator1 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDIBDSC1"), AV21DibDsc1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vGRABNOM1"), AV22GrabNom1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPMQNDSC1"), AV23TipMqnDsc1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV25DynamicFiltersSelector2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV26DynamicFiltersOperator2 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDIBDSC2"), AV27DibDsc2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vGRABNOM2"), AV28GrabNom2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPMQNDSC2"), AV29TipMqnDsc2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV31DynamicFiltersSelector3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV32DynamicFiltersOperator3 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDIBDSC3"), AV33DibDsc3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vGRABNOM3"), AV34GrabNom3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vTIPMQNDSC3"), AV35TipMqnDsc3) != 0 )
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
      e23K62 ();
      if (returnInSub) return;
   }

   public void e23K62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV64Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webpromptdibujo_impl.this.GXt_char1 = GXv_char2[0] ;
      AV64Station = GXt_char1 ;
      GXv_char2[0] = AV65Emprcod ;
      GXv_char3[0] = AV66Emprnom ;
      GXv_char4[0] = AV67Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV64Station, GXv_char2, GXv_char3, GXv_char4) ;
      webpromptdibujo_impl.this.AV65Emprcod = GXv_char2[0] ;
      webpromptdibujo_impl.this.AV66Emprnom = GXv_char3[0] ;
      webpromptdibujo_impl.this.AV67Usurcod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      lblJsdynamicfilters_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      AV19DynamicFiltersSelector1 = "DIBDSC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersSelector1", AV19DynamicFiltersSelector1);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S112 ();
      if (returnInSub) return;
      AV25DynamicFiltersSelector2 = "DIBDSC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersSelector2", AV25DynamicFiltersSelector2);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S122 ();
      if (returnInSub) return;
      AV31DynamicFiltersSelector3 = "DIBDSC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersSelector3", AV31DynamicFiltersSelector3);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S132 ();
      if (returnInSub) return;
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
      Form.setCaption( httpContext.getMessage( "Selecciona LLAMADA TRN DESDE FUERA", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      lblCleanfilters_Jsonclick = GXutil.format( "WWPDynFilterHideAll_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblCleanfilters_Internalname, "Jsonclick", lblCleanfilters_Jsonclick, true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV54DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV54DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e24K62( )
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
      cmbavDynamicfiltersoperator1.removeAllItems();
      if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 )
      {
         cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
         cmbavDynamicfiltersoperator1.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      }
      else if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 )
      {
         cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
         cmbavDynamicfiltersoperator1.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      }
      else if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 )
      {
         cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
         cmbavDynamicfiltersoperator1.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      }
      if ( AV24DynamicFiltersEnabled2 )
      {
         cmbavDynamicfiltersoperator2.removeAllItems();
         if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 )
         {
            cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
            cmbavDynamicfiltersoperator2.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
         }
         else if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 )
         {
            cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
            cmbavDynamicfiltersoperator2.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
         }
         else if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 )
         {
            cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
            cmbavDynamicfiltersoperator2.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
         }
         if ( AV30DynamicFiltersEnabled3 )
         {
            cmbavDynamicfiltersoperator3.removeAllItems();
            if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 )
            {
               cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
               cmbavDynamicfiltersoperator3.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
            }
            else if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 )
            {
               cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
               cmbavDynamicfiltersoperator3.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
            }
            else if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 )
            {
               cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
               cmbavDynamicfiltersoperator3.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
            }
         }
      }
      AV56GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridCurrentPage), 10, 0));
      AV57GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e11K62( )
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
         AV55PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV55PageToGo) ;
      }
   }

   public void e12K62( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13K62( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DibMolCil") == 0 )
         {
            AV47TFDibMolCil = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFDibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFDibMolCil), 4, 0));
            AV48TFDibMolCil_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFDibMolCil_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFDibMolCil_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DibMolCi2") == 0 )
         {
            AV50TFDibMolCi2 = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFDibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDibMolCi2), 4, 0));
            AV51TFDibMolCi2_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFDibMolCi2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDibMolCi2_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e25K62( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV58Select = "<i class=\"fas fa-check\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV58Select);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(108) ;
         }
         sendrow_1082( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_108_Refreshing )
      {
         httpContext.doAjaxLoad(108, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e26K62 ();
      if (returnInSub) return;
   }

   public void e26K62( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV60InOutEmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60InOutEmprCod", AV60InOutEmprCod);
      AV8InOutDibCli = A1013DibCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8InOutDibCli", AV8InOutDibCli);
      AV61InOutCliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61InOutCliCod), 6, 0));
      AV10InOutDibInt = A1014DibInt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10InOutDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10InOutDibInt), 8, 0));
      httpContext.setWebReturnParms(new Object[] {AV60InOutEmprCod,AV8InOutDibCli,Integer.valueOf(AV61InOutCliCod),Integer.valueOf(AV10InOutDibInt)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV60InOutEmprCod","AV8InOutDibCli","AV61InOutCliCod","AV10InOutDibInt"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e18K62( )
   {
      /* 'AddDynamicFilters1' Routine */
      returnInSub = false ;
      AV24DynamicFiltersEnabled2 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersEnabled2", AV24DynamicFiltersEnabled2);
      imgAdddynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e14K62( )
   {
      /* 'RemoveDynamicFilters1' Routine */
      returnInSub = false ;
      AV36DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36DynamicFiltersRemoving", AV36DynamicFiltersRemoving);
      AV37DynamicFiltersIgnoreFirst = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37DynamicFiltersIgnoreFirst", AV37DynamicFiltersIgnoreFirst);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S142 ();
      if (returnInSub) return;
      AV36DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36DynamicFiltersRemoving", AV36DynamicFiltersRemoving);
      AV37DynamicFiltersIgnoreFirst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37DynamicFiltersIgnoreFirst", AV37DynamicFiltersIgnoreFirst);
      gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV25DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV31DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV19DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
   }

   public void e19K62( )
   {
      /* Dynamicfiltersselector1_Click Routine */
      returnInSub = false ;
      AV20DynamicFiltersOperator1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
   }

   public void e20K62( )
   {
      /* 'AddDynamicFilters2' Routine */
      returnInSub = false ;
      AV30DynamicFiltersEnabled3 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersEnabled3", AV30DynamicFiltersEnabled3);
      imgAdddynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e15K62( )
   {
      /* 'RemoveDynamicFilters2' Routine */
      returnInSub = false ;
      AV36DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36DynamicFiltersRemoving", AV36DynamicFiltersRemoving);
      AV24DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersEnabled2", AV24DynamicFiltersEnabled2);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S142 ();
      if (returnInSub) return;
      AV36DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36DynamicFiltersRemoving", AV36DynamicFiltersRemoving);
      gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV25DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV31DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV19DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
   }

   public void e21K62( )
   {
      /* Dynamicfiltersselector2_Click Routine */
      returnInSub = false ;
      AV26DynamicFiltersOperator2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
   }

   public void e16K62( )
   {
      /* 'RemoveDynamicFilters3' Routine */
      returnInSub = false ;
      AV36DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36DynamicFiltersRemoving", AV36DynamicFiltersRemoving);
      AV30DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersEnabled3", AV30DynamicFiltersEnabled3);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S142 ();
      if (returnInSub) return;
      AV36DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36DynamicFiltersRemoving", AV36DynamicFiltersRemoving);
      gxgrgrid_refresh( subGrid_Rows, AV59FilterFullText, AV19DynamicFiltersSelector1, AV20DynamicFiltersOperator1, AV21DibDsc1, AV22GrabNom1, AV23TipMqnDsc1, AV25DynamicFiltersSelector2, AV26DynamicFiltersOperator2, AV27DibDsc2, AV28GrabNom2, AV29TipMqnDsc2, AV31DynamicFiltersSelector3, AV32DynamicFiltersOperator3, AV33DibDsc3, AV34GrabNom3, AV35TipMqnDsc3, AV24DynamicFiltersEnabled2, AV30DynamicFiltersEnabled3) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV25DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV31DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV19DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
   }

   public void e22K62( )
   {
      /* Dynamicfiltersselector3_Click Routine */
      returnInSub = false ;
      AV32DynamicFiltersOperator3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e17K62( )
   {
      /* 'DoCleanFilters' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CLEANFILTERS' */
      S182 ();
      if (returnInSub) return;
      subgrid_firstpage( ) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV19DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14GridState", AV14GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV25DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV31DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S112( )
   {
      /* 'ENABLEDYNAMICFILTERS1' Routine */
      returnInSub = false ;
      edtavDibdsc1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDibdsc1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDibdsc1_Visible), 5, 0), true);
      edtavGrabnom1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrabnom1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrabnom1_Visible), 5, 0), true);
      edtavTipmqndsc1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipmqndsc1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmqndsc1_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator1.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 )
      {
         edtavDibdsc1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavDibdsc1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDibdsc1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 )
      {
         edtavGrabnom1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavGrabnom1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrabnom1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 )
      {
         edtavTipmqndsc1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTipmqndsc1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmqndsc1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
   }

   public void S122( )
   {
      /* 'ENABLEDYNAMICFILTERS2' Routine */
      returnInSub = false ;
      edtavDibdsc2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDibdsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDibdsc2_Visible), 5, 0), true);
      edtavGrabnom2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrabnom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrabnom2_Visible), 5, 0), true);
      edtavTipmqndsc2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipmqndsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmqndsc2_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator2.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 )
      {
         edtavDibdsc2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavDibdsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDibdsc2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 )
      {
         edtavGrabnom2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavGrabnom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrabnom2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 )
      {
         edtavTipmqndsc2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTipmqndsc2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmqndsc2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
   }

   public void S132( )
   {
      /* 'ENABLEDYNAMICFILTERS3' Routine */
      returnInSub = false ;
      edtavDibdsc3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDibdsc3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDibdsc3_Visible), 5, 0), true);
      edtavGrabnom3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrabnom3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrabnom3_Visible), 5, 0), true);
      edtavTipmqndsc3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTipmqndsc3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmqndsc3_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator3.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 )
      {
         edtavDibdsc3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavDibdsc3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDibdsc3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 )
      {
         edtavGrabnom3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavGrabnom3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrabnom3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 )
      {
         edtavTipmqndsc3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTipmqndsc3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTipmqndsc3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
   }

   public void S172( )
   {
      /* 'RESETDYNFILTERS' Routine */
      returnInSub = false ;
      AV24DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersEnabled2", AV24DynamicFiltersEnabled2);
      AV25DynamicFiltersSelector2 = "DIBDSC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersSelector2", AV25DynamicFiltersSelector2);
      AV26DynamicFiltersOperator2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
      AV27DibDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DibDsc2", AV27DibDsc2);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S122 ();
      if (returnInSub) return;
      AV30DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersEnabled3", AV30DynamicFiltersEnabled3);
      AV31DynamicFiltersSelector3 = "DIBDSC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersSelector3", AV31DynamicFiltersSelector3);
      AV32DynamicFiltersOperator3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
      AV33DibDsc3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33DibDsc3", AV33DibDsc3);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S132 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV59FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59FilterFullText", AV59FilterFullText);
      AV47TFDibMolCil = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47TFDibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFDibMolCil), 4, 0));
      AV48TFDibMolCil_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFDibMolCil_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFDibMolCil_To), 4, 0));
      AV50TFDibMolCi2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFDibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFDibMolCi2), 4, 0));
      AV51TFDibMolCi2_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFDibMolCi2_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFDibMolCi2_To), 4, 0));
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV19DynamicFiltersSelector1 = "DIBDSC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersSelector1", AV19DynamicFiltersSelector1);
      AV20DynamicFiltersOperator1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
      AV21DibDsc1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DibDsc1", AV21DibDsc1);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S172 ();
      if (returnInSub) return;
      AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S142 ();
      if (returnInSub) return;
   }

   public void S142( )
   {
      /* 'LOADDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      imgAdddynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      imgAdddynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      if ( AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV16GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV19DynamicFiltersSelector1 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersSelector1", AV19DynamicFiltersSelector1);
         if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 )
         {
            AV20DynamicFiltersOperator1 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
            AV21DibDsc1 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21DibDsc1", AV21DibDsc1);
         }
         else if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 )
         {
            AV20DynamicFiltersOperator1 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
            AV22GrabNom1 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22GrabNom1", AV22GrabNom1);
         }
         else if ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 )
         {
            AV20DynamicFiltersOperator1 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
            AV23TipMqnDsc1 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TipMqnDsc1", AV23TipMqnDsc1);
         }
         /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
         S112 ();
         if (returnInSub) return;
         if ( AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            lblJsdynamicfilters_Caption = "<script type=\"text/javascript\">$(document).ready(function() {" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 2, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            imgAdddynamicfilters1_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
            imgRemovedynamicfilters1_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
            AV24DynamicFiltersEnabled2 = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24DynamicFiltersEnabled2", AV24DynamicFiltersEnabled2);
            AV16GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV25DynamicFiltersSelector2 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersSelector2", AV25DynamicFiltersSelector2);
            if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 )
            {
               AV26DynamicFiltersOperator2 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
               AV27DibDsc2 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27DibDsc2", AV27DibDsc2);
            }
            else if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 )
            {
               AV26DynamicFiltersOperator2 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
               AV28GrabNom2 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28GrabNom2", AV28GrabNom2);
            }
            else if ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 )
            {
               AV26DynamicFiltersOperator2 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
               AV29TipMqnDsc2 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29TipMqnDsc2", AV29TipMqnDsc2);
            }
            /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
            S122 ();
            if (returnInSub) return;
            if ( AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 3, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
               imgAdddynamicfilters2_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
               imgRemovedynamicfilters2_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
               AV30DynamicFiltersEnabled3 = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersEnabled3", AV30DynamicFiltersEnabled3);
               AV16GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV31DynamicFiltersSelector3 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersSelector3", AV31DynamicFiltersSelector3);
               if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 )
               {
                  AV32DynamicFiltersOperator3 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
                  AV33DibDsc3 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV33DibDsc3", AV33DibDsc3);
               }
               else if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 )
               {
                  AV32DynamicFiltersOperator3 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
                  AV34GrabNom3 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV34GrabNom3", AV34GrabNom3);
               }
               else if ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 )
               {
                  AV32DynamicFiltersOperator3 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
                  AV35TipMqnDsc3 = AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV35TipMqnDsc3", AV35TipMqnDsc3);
               }
               /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
               S132 ();
               if (returnInSub) return;
            }
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+"});</script>" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
         }
      }
      if ( AV36DynamicFiltersRemoving )
      {
         lblJsdynamicfilters_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      }
   }

   public void S162( )
   {
      /* 'SAVEDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      if ( ! AV37DynamicFiltersIgnoreFirst )
      {
         AV16GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV19DynamicFiltersSelector1 );
         if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 ) && ! (GXutil.strcmp("", AV21DibDsc1)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV21DibDsc1 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV20DynamicFiltersOperator1 );
         }
         else if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 ) && ! (GXutil.strcmp("", AV22GrabNom1)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV22GrabNom1 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV20DynamicFiltersOperator1 );
         }
         else if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 ) && ! (GXutil.strcmp("", AV23TipMqnDsc1)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV23TipMqnDsc1 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV20DynamicFiltersOperator1 );
         }
         if ( AV36DynamicFiltersRemoving || ! (GXutil.strcmp("", AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV16GridStateDynamicFilter, 0);
         }
      }
      if ( AV24DynamicFiltersEnabled2 )
      {
         AV16GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV25DynamicFiltersSelector2 );
         if ( ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 ) && ! (GXutil.strcmp("", AV27DibDsc2)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV27DibDsc2 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV26DynamicFiltersOperator2 );
         }
         else if ( ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 ) && ! (GXutil.strcmp("", AV28GrabNom2)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV28GrabNom2 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV26DynamicFiltersOperator2 );
         }
         else if ( ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 ) && ! (GXutil.strcmp("", AV29TipMqnDsc2)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV29TipMqnDsc2 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV26DynamicFiltersOperator2 );
         }
         if ( AV36DynamicFiltersRemoving || ! (GXutil.strcmp("", AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV16GridStateDynamicFilter, 0);
         }
      }
      if ( AV30DynamicFiltersEnabled3 )
      {
         AV16GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV31DynamicFiltersSelector3 );
         if ( ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 ) && ! (GXutil.strcmp("", AV33DibDsc3)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV33DibDsc3 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV32DynamicFiltersOperator3 );
         }
         else if ( ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 ) && ! (GXutil.strcmp("", AV34GrabNom3)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV34GrabNom3 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV32DynamicFiltersOperator3 );
         }
         else if ( ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 ) && ! (GXutil.strcmp("", AV35TipMqnDsc3)==0) )
         {
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV35TipMqnDsc3 );
            AV16GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV32DynamicFiltersOperator3 );
         }
         if ( AV36DynamicFiltersRemoving || ! (GXutil.strcmp("", AV16GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV14GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV16GridStateDynamicFilter, 0);
         }
      }
   }

   public void wb_table1_12_K62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='CellAlignTopPaddingTop10'>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblCleanfilters_Internalname, httpContext.getMessage( "<i class=\"fas fa-filter CleanFiltersIcon\"></i>", ""), "", "", lblCleanfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOCLEANFILTERS\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "WWP_CleanFiltersTooltip", ""), 1, 1, 0, (short)(1), "HLP_WebPromptDibujo.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV59FilterFullText, GXutil.rtrim( localUtil.format( AV59FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,18);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix1_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector1.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector1, cmbavDynamicfiltersselector1.getInternalname(), GXutil.rtrim( AV19DynamicFiltersSelector1), 1, cmbavDynamicfiltersselector1.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR1.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "", true, (byte)(0), "HLP_WebPromptDibujo.htm");
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV19DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle1_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         wb_table2_31_K62( true) ;
      }
      else
      {
         wb_table2_31_K62( false) ;
      }
      return  ;
   }

   public void wb_table2_31_K62e( boolean wbgen )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix2_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector2.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector2, cmbavDynamicfiltersselector2.getInternalname(), GXutil.rtrim( AV25DynamicFiltersSelector2), 1, cmbavDynamicfiltersselector2.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR2.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "", true, (byte)(0), "HLP_WebPromptDibujo.htm");
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV25DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle2_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table3_59_K62( true) ;
      }
      else
      {
         wb_table3_59_K62( false) ;
      }
      return  ;
   }

   public void wb_table3_59_K62e( boolean wbgen )
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix3_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector3.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector3, cmbavDynamicfiltersselector3.getInternalname(), GXutil.rtrim( AV31DynamicFiltersSelector3), 1, cmbavDynamicfiltersselector3.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR3.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "", true, (byte)(0), "HLP_WebPromptDibujo.htm");
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV31DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle3_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table4_87_K62( true) ;
      }
      else
      {
         wb_table4_87_K62( false) ;
      }
      return  ;
   }

   public void wb_table4_87_K62e( boolean wbgen )
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
         wb_table1_12_K62e( true) ;
      }
      else
      {
         wb_table1_12_K62e( false) ;
      }
   }

   public void wb_table4_87_K62( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator3, cmbavDynamicfiltersoperator3.getInternalname(), GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)), 1, cmbavDynamicfiltersoperator3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator3.getVisible(), cmbavDynamicfiltersoperator3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, (byte)(0), "HLP_WebPromptDibujo.htm");
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_dibdsc3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDibdsc3_Internalname, httpContext.getMessage( "Dib Dsc3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDibdsc3_Internalname, GXutil.rtrim( AV33DibDsc3), GXutil.rtrim( localUtil.format( AV33DibDsc3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDibdsc3_Jsonclick, 0, "Attribute", "", "", "", "", edtavDibdsc3_Visible, edtavDibdsc3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_grabnom3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGrabnom3_Internalname, httpContext.getMessage( "Grab Nom3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrabnom3_Internalname, GXutil.rtrim( AV34GrabNom3), GXutil.rtrim( localUtil.format( AV34GrabNom3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrabnom3_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrabnom3_Visible, edtavGrabnom3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_tipmqndsc3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipmqndsc3_Internalname, httpContext.getMessage( "Tip Mqn Dsc3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipmqndsc3_Internalname, GXutil.rtrim( AV35TipMqnDsc3), GXutil.rtrim( localUtil.format( AV35TipMqnDsc3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipmqndsc3_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipmqndsc3_Visible, edtavTipmqndsc3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter3_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters3_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters3_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters3_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS3\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPromptDibujo.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_87_K62e( true) ;
      }
      else
      {
         wb_table4_87_K62e( false) ;
      }
   }

   public void wb_table3_59_K62( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator2, cmbavDynamicfiltersoperator2.getInternalname(), GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)), 1, cmbavDynamicfiltersoperator2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator2.getVisible(), cmbavDynamicfiltersoperator2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "", true, (byte)(0), "HLP_WebPromptDibujo.htm");
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_dibdsc2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDibdsc2_Internalname, httpContext.getMessage( "Dib Dsc2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDibdsc2_Internalname, GXutil.rtrim( AV27DibDsc2), GXutil.rtrim( localUtil.format( AV27DibDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDibdsc2_Jsonclick, 0, "Attribute", "", "", "", "", edtavDibdsc2_Visible, edtavDibdsc2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_grabnom2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGrabnom2_Internalname, httpContext.getMessage( "Grab Nom2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrabnom2_Internalname, GXutil.rtrim( AV28GrabNom2), GXutil.rtrim( localUtil.format( AV28GrabNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrabnom2_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrabnom2_Visible, edtavGrabnom2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_tipmqndsc2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipmqndsc2_Internalname, httpContext.getMessage( "Tip Mqn Dsc2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipmqndsc2_Internalname, GXutil.rtrim( AV29TipMqnDsc2), GXutil.rtrim( localUtil.format( AV29TipMqnDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipmqndsc2_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipmqndsc2_Visible, edtavTipmqndsc2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters2_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPromptDibujo.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters2_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPromptDibujo.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_59_K62e( true) ;
      }
      else
      {
         wb_table3_59_K62e( false) ;
      }
   }

   public void wb_table2_31_K62( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator1, cmbavDynamicfiltersoperator1.getInternalname(), GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)), 1, cmbavDynamicfiltersoperator1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator1.getVisible(), cmbavDynamicfiltersoperator1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "", true, (byte)(0), "HLP_WebPromptDibujo.htm");
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_dibdsc1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDibdsc1_Internalname, httpContext.getMessage( "Dib Dsc1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDibdsc1_Internalname, GXutil.rtrim( AV21DibDsc1), GXutil.rtrim( localUtil.format( AV21DibDsc1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDibdsc1_Jsonclick, 0, "Attribute", "", "", "", "", edtavDibdsc1_Visible, edtavDibdsc1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_grabnom1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGrabnom1_Internalname, httpContext.getMessage( "Grab Nom1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrabnom1_Internalname, GXutil.rtrim( AV22GrabNom1), GXutil.rtrim( localUtil.format( AV22GrabNom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrabnom1_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrabnom1_Visible, edtavGrabnom1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_tipmqndsc1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipmqndsc1_Internalname, httpContext.getMessage( "Tip Mqn Dsc1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_108_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipmqndsc1_Internalname, GXutil.rtrim( AV23TipMqnDsc1), GXutil.rtrim( localUtil.format( AV23TipMqnDsc1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipmqndsc1_Jsonclick, 0, "Attribute", "", "", "", "", edtavTipmqndsc1_Visible, edtavTipmqndsc1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebPromptDibujo.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters1_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPromptDibujo.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters1_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WebPromptDibujo.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_31_K62e( true) ;
      }
      else
      {
         wb_table2_31_K62e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV60InOutEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60InOutEmprCod", AV60InOutEmprCod);
      AV8InOutDibCli = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8InOutDibCli", AV8InOutDibCli);
      AV61InOutCliCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61InOutCliCod), 6, 0));
      AV10InOutDibInt = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10InOutDibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10InOutDibInt), 8, 0));
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
      paK62( ) ;
      wsK62( ) ;
      weK62( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116121853", true, true);
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
      httpContext.AddJavascriptSource("webpromptdibujo.js", "?202682116121854", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1082( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_108_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_108_idx ;
      edtDibCli_Internalname = "DIBCLI_"+sGXsfl_108_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_108_idx ;
      edtDibInt_Internalname = "DIBINT_"+sGXsfl_108_idx ;
      edtDibFecEnt_Internalname = "DIBFECENT_"+sGXsfl_108_idx ;
      edtGrabCod_Internalname = "GRABCOD_"+sGXsfl_108_idx ;
      edtTipMqnCod_Internalname = "TIPMQNCOD_"+sGXsfl_108_idx ;
      lstDibTipMaq.setInternalname( "DIBTIPMAQ_"+sGXsfl_108_idx );
      edtDibMolCil_Internalname = "DIBMOLCIL_"+sGXsfl_108_idx ;
      edtDibMolCi2_Internalname = "DIBMOLCI2_"+sGXsfl_108_idx ;
      edtDibFecUlt_Internalname = "DIBFECULT_"+sGXsfl_108_idx ;
   }

   public void subsflControlProps_fel_1082( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_108_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_108_fel_idx ;
      edtDibCli_Internalname = "DIBCLI_"+sGXsfl_108_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_108_fel_idx ;
      edtDibInt_Internalname = "DIBINT_"+sGXsfl_108_fel_idx ;
      edtDibFecEnt_Internalname = "DIBFECENT_"+sGXsfl_108_fel_idx ;
      edtGrabCod_Internalname = "GRABCOD_"+sGXsfl_108_fel_idx ;
      edtTipMqnCod_Internalname = "TIPMQNCOD_"+sGXsfl_108_fel_idx ;
      lstDibTipMaq.setInternalname( "DIBTIPMAQ_"+sGXsfl_108_fel_idx );
      edtDibMolCil_Internalname = "DIBMOLCIL_"+sGXsfl_108_fel_idx ;
      edtDibMolCi2_Internalname = "DIBMOLCI2_"+sGXsfl_108_fel_idx ;
      edtDibFecUlt_Internalname = "DIBFECULT_"+sGXsfl_108_fel_idx ;
   }

   public void sendrow_1082( )
   {
      subsflControlProps_1082( ) ;
      wbK60( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_108_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_108_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_108_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 109,'',false,'"+sGXsfl_108_idx+"',108)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV58Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,109);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_108_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibCli_Internalname,GXutil.rtrim( A1013DibCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibInt_Internalname,GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibInt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibFecEnt_Internalname,localUtil.format(A1017DibFecEnt, "99/99/99"),localUtil.format( A1017DibFecEnt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibFecEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrabCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1005GrabCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1005GrabCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrabCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipMqnCod_Internalname,GXutil.ltrim( localUtil.ntoc( A3911TipMqnCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3911TipMqnCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipMqnCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( lstDibTipMaq.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "DIBTIPMAQ_" + sGXsfl_108_idx ;
            lstDibTipMaq.setName( GXCCtl );
            lstDibTipMaq.setWebtags( "" );
            lstDibTipMaq.addItem("R", httpContext.getMessage( "Rotativa", ""), (short)(0));
            lstDibTipMaq.addItem("P", httpContext.getMessage( "Plana", ""), (short)(0));
            lstDibTipMaq.addItem("D", httpContext.getMessage( "Digital", ""), (short)(0));
            if ( lstDibTipMaq.getItemCount() > 0 )
            {
               A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
               n1823DibTipMaq = false ;
            }
         }
         /* ListBox */
         GridRow.AddColumnProperties("listbox", 2, isAjaxCallMode( ), new Object[] {lstDibTipMaq,lstDibTipMaq.getInternalname(),GXutil.rtrim( A1823DibTipMaq),Integer.valueOf(2),lstDibTipMaq.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(17),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
         httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), !bGXsfl_108_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibMolCil_Internalname,GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibMolCil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibMolCi2_Internalname,GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2090DibMolCi2), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibMolCi2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDibFecUlt_Internalname,localUtil.format(A1015DibFecUlt, "99/99/99"),localUtil.format( A1015DibFecUlt, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDibFecUlt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesK62( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_108_idx = ((subGrid_Islastpage==1)&&(nGXsfl_108_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_108_idx+1) ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1082( ) ;
      }
      /* End function sendrow_1082 */
   }

   public void startgridcontrol108( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"108\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dib Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dib Int", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fec Ent", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cód. Grab", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Maq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N° Mol/Cil", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ULt Fec", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV58Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1013DibCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A1017DibFecEnt, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1005GrabCod, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3911TipMqnCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1823DibTipMaq));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A1015DibFecUlt, "99/99/99"));
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
      lblCleanfilters_Internalname = "CLEANFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      lblDynamicfiltersprefix1_Internalname = "DYNAMICFILTERSPREFIX1" ;
      cmbavDynamicfiltersselector1.setInternalname( "vDYNAMICFILTERSSELECTOR1" );
      lblDynamicfiltersmiddle1_Internalname = "DYNAMICFILTERSMIDDLE1" ;
      cmbavDynamicfiltersoperator1.setInternalname( "vDYNAMICFILTERSOPERATOR1" );
      edtavDibdsc1_Internalname = "vDIBDSC1" ;
      cellFilter_dibdsc1_cell_Internalname = "FILTER_DIBDSC1_CELL" ;
      edtavGrabnom1_Internalname = "vGRABNOM1" ;
      cellFilter_grabnom1_cell_Internalname = "FILTER_GRABNOM1_CELL" ;
      edtavTipmqndsc1_Internalname = "vTIPMQNDSC1" ;
      cellFilter_tipmqndsc1_cell_Internalname = "FILTER_TIPMQNDSC1_CELL" ;
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
      edtavDibdsc2_Internalname = "vDIBDSC2" ;
      cellFilter_dibdsc2_cell_Internalname = "FILTER_DIBDSC2_CELL" ;
      edtavGrabnom2_Internalname = "vGRABNOM2" ;
      cellFilter_grabnom2_cell_Internalname = "FILTER_GRABNOM2_CELL" ;
      edtavTipmqndsc2_Internalname = "vTIPMQNDSC2" ;
      cellFilter_tipmqndsc2_cell_Internalname = "FILTER_TIPMQNDSC2_CELL" ;
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
      edtavDibdsc3_Internalname = "vDIBDSC3" ;
      cellFilter_dibdsc3_cell_Internalname = "FILTER_DIBDSC3_CELL" ;
      edtavGrabnom3_Internalname = "vGRABNOM3" ;
      cellFilter_grabnom3_cell_Internalname = "FILTER_GRABNOM3_CELL" ;
      edtavTipmqndsc3_Internalname = "vTIPMQNDSC3" ;
      cellFilter_tipmqndsc3_cell_Internalname = "FILTER_TIPMQNDSC3_CELL" ;
      imgRemovedynamicfilters3_Internalname = "REMOVEDYNAMICFILTERS3" ;
      cellDynamicfilters_removefilter3_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER3_CELL" ;
      tblTablemergeddynamicfilters3_Internalname = "TABLEMERGEDDYNAMICFILTERS3" ;
      divTabledynamicfiltersrow3_Internalname = "TABLEDYNAMICFILTERSROW3" ;
      divTabledynamicfilters_Internalname = "TABLEDYNAMICFILTERS" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDibCli_Internalname = "DIBCLI" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtDibInt_Internalname = "DIBINT" ;
      edtDibFecEnt_Internalname = "DIBFECENT" ;
      edtGrabCod_Internalname = "GRABCOD" ;
      edtTipMqnCod_Internalname = "TIPMQNCOD" ;
      lstDibTipMaq.setInternalname( "DIBTIPMAQ" );
      edtDibMolCil_Internalname = "DIBMOLCIL" ;
      edtDibMolCi2_Internalname = "DIBMOLCI2" ;
      edtDibFecUlt_Internalname = "DIBFECULT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      lblJsdynamicfilters_Internalname = "JSDYNAMICFILTERS" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      edtDibFecUlt_Jsonclick = "" ;
      edtDibMolCi2_Jsonclick = "" ;
      edtDibMolCil_Jsonclick = "" ;
      lstDibTipMaq.setJsonclick( "" );
      edtTipMqnCod_Jsonclick = "" ;
      edtGrabCod_Jsonclick = "" ;
      edtDibFecEnt_Jsonclick = "" ;
      edtDibInt_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtDibCli_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgRemovedynamicfilters1_Visible = 1 ;
      imgAdddynamicfilters1_Visible = 1 ;
      edtavTipmqndsc1_Jsonclick = "" ;
      edtavTipmqndsc1_Enabled = 1 ;
      edtavGrabnom1_Jsonclick = "" ;
      edtavGrabnom1_Enabled = 1 ;
      edtavDibdsc1_Jsonclick = "" ;
      edtavDibdsc1_Enabled = 1 ;
      cmbavDynamicfiltersoperator1.setJsonclick( "" );
      cmbavDynamicfiltersoperator1.setEnabled( 1 );
      imgRemovedynamicfilters2_Visible = 1 ;
      imgAdddynamicfilters2_Visible = 1 ;
      edtavTipmqndsc2_Jsonclick = "" ;
      edtavTipmqndsc2_Enabled = 1 ;
      edtavGrabnom2_Jsonclick = "" ;
      edtavGrabnom2_Enabled = 1 ;
      edtavDibdsc2_Jsonclick = "" ;
      edtavDibdsc2_Enabled = 1 ;
      cmbavDynamicfiltersoperator2.setJsonclick( "" );
      cmbavDynamicfiltersoperator2.setEnabled( 1 );
      edtavTipmqndsc3_Jsonclick = "" ;
      edtavTipmqndsc3_Enabled = 1 ;
      edtavGrabnom3_Jsonclick = "" ;
      edtavGrabnom3_Enabled = 1 ;
      edtavDibdsc3_Jsonclick = "" ;
      edtavDibdsc3_Enabled = 1 ;
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
      edtavTipmqndsc3_Visible = 1 ;
      edtavGrabnom3_Visible = 1 ;
      edtavDibdsc3_Visible = 1 ;
      cmbavDynamicfiltersoperator2.setVisible( 1 );
      edtavTipmqndsc2_Visible = 1 ;
      edtavGrabnom2_Visible = 1 ;
      edtavDibdsc2_Visible = 1 ;
      cmbavDynamicfiltersoperator1.setVisible( 1 );
      edtavTipmqndsc1_Visible = 1 ;
      edtavGrabnom1_Visible = 1 ;
      edtavDibdsc1_Visible = 1 ;
      subGrid_Sortable = (byte)(0) ;
      lblJsdynamicfilters_Caption = httpContext.getMessage( "JSDynamicFilters", "") ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Filterisrange = "|||||||T|T|" ;
      Ddo_grid_Filtertype = "|||||||Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "|||||||T|T|" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "2:DibCli|3:CliCod|4:DibInt|5:DibFecEnt|6:GrabCod|7:TipMqnCod|8:DibTipMaq|9:DibMolCil|10:DibMolCi2|11:DibFecUlt" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Selecciona LLAMADA TRN DESDE FUERA", "") );
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDynamicfiltersselector1.setName( "vDYNAMICFILTERSSELECTOR1" );
      cmbavDynamicfiltersselector1.setWebtags( "" );
      cmbavDynamicfiltersselector1.addItem("DIBDSC", httpContext.getMessage( "Desc del Dibujo", ""), (short)(0));
      cmbavDynamicfiltersselector1.addItem("GRABNOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      cmbavDynamicfiltersselector1.addItem("TIPMQNDSC", httpContext.getMessage( "Descripcion", ""), (short)(0));
      if ( cmbavDynamicfiltersselector1.getItemCount() > 0 )
      {
         AV19DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV19DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19DynamicFiltersSelector1", AV19DynamicFiltersSelector1);
      }
      cmbavDynamicfiltersoperator1.setName( "vDYNAMICFILTERSOPERATOR1" );
      cmbavDynamicfiltersoperator1.setWebtags( "" );
      cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      cmbavDynamicfiltersoperator1.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV20DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV20DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20DynamicFiltersOperator1), 4, 0));
      }
      cmbavDynamicfiltersselector2.setName( "vDYNAMICFILTERSSELECTOR2" );
      cmbavDynamicfiltersselector2.setWebtags( "" );
      cmbavDynamicfiltersselector2.addItem("DIBDSC", httpContext.getMessage( "Desc del Dibujo", ""), (short)(0));
      cmbavDynamicfiltersselector2.addItem("GRABNOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      cmbavDynamicfiltersselector2.addItem("TIPMQNDSC", httpContext.getMessage( "Descripcion", ""), (short)(0));
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV25DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV25DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersSelector2", AV25DynamicFiltersSelector2);
      }
      cmbavDynamicfiltersoperator2.setName( "vDYNAMICFILTERSOPERATOR2" );
      cmbavDynamicfiltersoperator2.setWebtags( "" );
      cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      cmbavDynamicfiltersoperator2.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV26DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV26DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26DynamicFiltersOperator2), 4, 0));
      }
      cmbavDynamicfiltersselector3.setName( "vDYNAMICFILTERSSELECTOR3" );
      cmbavDynamicfiltersselector3.setWebtags( "" );
      cmbavDynamicfiltersselector3.addItem("DIBDSC", httpContext.getMessage( "Desc del Dibujo", ""), (short)(0));
      cmbavDynamicfiltersselector3.addItem("GRABNOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      cmbavDynamicfiltersselector3.addItem("TIPMQNDSC", httpContext.getMessage( "Descripcion", ""), (short)(0));
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV31DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV31DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersSelector3", AV31DynamicFiltersSelector3);
      }
      cmbavDynamicfiltersoperator3.setName( "vDYNAMICFILTERSOPERATOR3" );
      cmbavDynamicfiltersoperator3.setWebtags( "" );
      cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      cmbavDynamicfiltersoperator3.addItem("1", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV32DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV32DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32DynamicFiltersOperator3), 4, 0));
      }
      GXCCtl = "DIBTIPMAQ_" + sGXsfl_108_idx ;
      lstDibTipMaq.setName( GXCCtl );
      lstDibTipMaq.setWebtags( "" );
      lstDibTipMaq.addItem("R", httpContext.getMessage( "Rotativa", ""), (short)(0));
      lstDibTipMaq.addItem("P", httpContext.getMessage( "Plana", ""), (short)(0));
      lstDibTipMaq.addItem("D", httpContext.getMessage( "Digital", ""), (short)(0));
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e13K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV47TFDibMolCil',fld:'vTFDIBMOLCIL',pic:'ZZZ9'},{av:'AV48TFDibMolCil_To',fld:'vTFDIBMOLCIL_TO',pic:'ZZZ9'},{av:'AV50TFDibMolCi2',fld:'vTFDIBMOLCI2',pic:'ZZZ9'},{av:'AV51TFDibMolCi2_To',fld:'vTFDIBMOLCI2_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e25K62',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV58Select',fld:'vSELECT',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e26K62',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A1013DibCli',fld:'DIBCLI',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV60InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV8InOutDibCli',fld:'vINOUTDIBCLI',pic:''},{av:'AV61InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'AV10InOutDibInt',fld:'vINOUTDIBINT',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("'ADDDYNAMICFILTERS1'","{handler:'e18K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''}]");
      setEventMetadata("'ADDDYNAMICFILTERS1'",",oparms:[{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'","{handler:'e14K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV36DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'",",oparms:[{av:'AV36DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV37DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'edtavDibdsc2_Visible',ctrl:'vDIBDSC2',prop:'Visible'},{av:'edtavGrabnom2_Visible',ctrl:'vGRABNOM2',prop:'Visible'},{av:'edtavTipmqndsc2_Visible',ctrl:'vTIPMQNDSC2',prop:'Visible'},{av:'edtavDibdsc3_Visible',ctrl:'vDIBDSC3',prop:'Visible'},{av:'edtavGrabnom3_Visible',ctrl:'vGRABNOM3',prop:'Visible'},{av:'edtavTipmqndsc3_Visible',ctrl:'vTIPMQNDSC3',prop:'Visible'},{av:'edtavDibdsc1_Visible',ctrl:'vDIBDSC1',prop:'Visible'},{av:'edtavGrabnom1_Visible',ctrl:'vGRABNOM1',prop:'Visible'},{av:'edtavTipmqndsc1_Visible',ctrl:'vTIPMQNDSC1',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK","{handler:'e19K62',iparms:[{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'edtavDibdsc1_Visible',ctrl:'vDIBDSC1',prop:'Visible'},{av:'edtavGrabnom1_Visible',ctrl:'vGRABNOM1',prop:'Visible'},{av:'edtavTipmqndsc1_Visible',ctrl:'vTIPMQNDSC1',prop:'Visible'}]}");
      setEventMetadata("'ADDDYNAMICFILTERS2'","{handler:'e20K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''}]");
      setEventMetadata("'ADDDYNAMICFILTERS2'",",oparms:[{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'","{handler:'e15K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV36DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'",",oparms:[{av:'AV36DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'edtavDibdsc2_Visible',ctrl:'vDIBDSC2',prop:'Visible'},{av:'edtavGrabnom2_Visible',ctrl:'vGRABNOM2',prop:'Visible'},{av:'edtavTipmqndsc2_Visible',ctrl:'vTIPMQNDSC2',prop:'Visible'},{av:'edtavDibdsc3_Visible',ctrl:'vDIBDSC3',prop:'Visible'},{av:'edtavGrabnom3_Visible',ctrl:'vGRABNOM3',prop:'Visible'},{av:'edtavTipmqndsc3_Visible',ctrl:'vTIPMQNDSC3',prop:'Visible'},{av:'edtavDibdsc1_Visible',ctrl:'vDIBDSC1',prop:'Visible'},{av:'edtavGrabnom1_Visible',ctrl:'vGRABNOM1',prop:'Visible'},{av:'edtavTipmqndsc1_Visible',ctrl:'vTIPMQNDSC1',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK","{handler:'e21K62',iparms:[{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'edtavDibdsc2_Visible',ctrl:'vDIBDSC2',prop:'Visible'},{av:'edtavGrabnom2_Visible',ctrl:'vGRABNOM2',prop:'Visible'},{av:'edtavTipmqndsc2_Visible',ctrl:'vTIPMQNDSC2',prop:'Visible'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'","{handler:'e16K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV37DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV36DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'",",oparms:[{av:'AV36DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'edtavDibdsc2_Visible',ctrl:'vDIBDSC2',prop:'Visible'},{av:'edtavGrabnom2_Visible',ctrl:'vGRABNOM2',prop:'Visible'},{av:'edtavTipmqndsc2_Visible',ctrl:'vTIPMQNDSC2',prop:'Visible'},{av:'edtavDibdsc3_Visible',ctrl:'vDIBDSC3',prop:'Visible'},{av:'edtavGrabnom3_Visible',ctrl:'vGRABNOM3',prop:'Visible'},{av:'edtavTipmqndsc3_Visible',ctrl:'vTIPMQNDSC3',prop:'Visible'},{av:'edtavDibdsc1_Visible',ctrl:'vDIBDSC1',prop:'Visible'},{av:'edtavGrabnom1_Visible',ctrl:'vGRABNOM1',prop:'Visible'},{av:'edtavTipmqndsc1_Visible',ctrl:'vTIPMQNDSC1',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK","{handler:'e22K62',iparms:[{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'edtavDibdsc3_Visible',ctrl:'vDIBDSC3',prop:'Visible'},{av:'edtavGrabnom3_Visible',ctrl:'vGRABNOM3',prop:'Visible'},{av:'edtavTipmqndsc3_Visible',ctrl:'vTIPMQNDSC3',prop:'Visible'}]}");
      setEventMetadata("'DOCLEANFILTERS'","{handler:'e17K62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'AV36DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''}]");
      setEventMetadata("'DOCLEANFILTERS'",",oparms:[{av:'AV59FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47TFDibMolCil',fld:'vTFDIBMOLCIL',pic:'ZZZ9'},{av:'AV48TFDibMolCil_To',fld:'vTFDIBMOLCIL_TO',pic:'ZZZ9'},{av:'AV50TFDibMolCi2',fld:'vTFDIBMOLCI2',pic:'ZZZ9'},{av:'AV51TFDibMolCi2_To',fld:'vTFDIBMOLCI2_TO',pic:'ZZZ9'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'cmbavDynamicfiltersselector1'},{av:'AV19DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV20DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV21DibDsc1',fld:'vDIBDSC1',pic:''},{av:'AV14GridState',fld:'vGRIDSTATE',pic:''},{av:'edtavDibdsc1_Visible',ctrl:'vDIBDSC1',prop:'Visible'},{av:'edtavGrabnom1_Visible',ctrl:'vGRABNOM1',prop:'Visible'},{av:'edtavTipmqndsc1_Visible',ctrl:'vTIPMQNDSC1',prop:'Visible'},{av:'AV24DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV25DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV26DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV27DibDsc2',fld:'vDIBDSC2',pic:''},{av:'AV30DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV31DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV32DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV33DibDsc3',fld:'vDIBDSC3',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'AV22GrabNom1',fld:'vGRABNOM1',pic:''},{av:'AV23TipMqnDsc1',fld:'vTIPMQNDSC1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV28GrabNom2',fld:'vGRABNOM2',pic:''},{av:'AV29TipMqnDsc2',fld:'vTIPMQNDSC2',pic:''},{av:'AV34GrabNom3',fld:'vGRABNOM3',pic:''},{av:'AV35TipMqnDsc3',fld:'vTIPMQNDSC3',pic:''},{av:'edtavDibdsc2_Visible',ctrl:'vDIBDSC2',prop:'Visible'},{av:'edtavGrabnom2_Visible',ctrl:'vGRABNOM2',prop:'Visible'},{av:'edtavTipmqndsc2_Visible',ctrl:'vTIPMQNDSC2',prop:'Visible'},{av:'edtavDibdsc3_Visible',ctrl:'vDIBDSC3',prop:'Visible'},{av:'edtavGrabnom3_Visible',ctrl:'vGRABNOM3',prop:'Visible'},{av:'edtavTipmqndsc3_Visible',ctrl:'vTIPMQNDSC3',prop:'Visible'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[]");
      setEventMetadata("VALID_DIBINT",",oparms:[]}");
      setEventMetadata("VALID_GRABCOD","{handler:'valid_Grabcod',iparms:[]");
      setEventMetadata("VALID_GRABCOD",",oparms:[]}");
      setEventMetadata("VALID_TIPMQNCOD","{handler:'valid_Tipmqncod',iparms:[]");
      setEventMetadata("VALID_TIPMQNCOD",",oparms:[]}");
      setEventMetadata("VALID_DIBTIPMAQ","{handler:'valid_Dibtipmaq',iparms:[]");
      setEventMetadata("VALID_DIBTIPMAQ",",oparms:[]}");
      setEventMetadata("VALID_DIBMOLCIL","{handler:'valid_Dibmolcil',iparms:[]");
      setEventMetadata("VALID_DIBMOLCIL",",oparms:[]}");
      setEventMetadata("VALID_DIBMOLCI2","{handler:'valid_Dibmolci2',iparms:[]");
      setEventMetadata("VALID_DIBMOLCI2",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Dibfecult',iparms:[]");
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
      wcpOAV60InOutEmprCod = "" ;
      wcpOAV8InOutDibCli = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV60InOutEmprCod = "" ;
      AV8InOutDibCli = "" ;
      AV59FilterFullText = "" ;
      AV19DynamicFiltersSelector1 = "" ;
      AV21DibDsc1 = "" ;
      AV22GrabNom1 = "" ;
      AV23TipMqnDsc1 = "" ;
      AV25DynamicFiltersSelector2 = "" ;
      AV27DibDsc2 = "" ;
      AV28GrabNom2 = "" ;
      AV29TipMqnDsc2 = "" ;
      AV31DynamicFiltersSelector3 = "" ;
      AV33DibDsc3 = "" ;
      AV34GrabNom3 = "" ;
      AV35TipMqnDsc3 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV54DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV14GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      lblJsdynamicfilters_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV58Select = "" ;
      A396EmprCod = "" ;
      A1013DibCli = "" ;
      A1017DibFecEnt = GXutil.nullDate() ;
      A1823DibTipMaq = "" ;
      A1015DibFecUlt = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV59FilterFullText = "" ;
      lV21DibDsc1 = "" ;
      lV22GrabNom1 = "" ;
      lV23TipMqnDsc1 = "" ;
      lV27DibDsc2 = "" ;
      lV28GrabNom2 = "" ;
      lV29TipMqnDsc2 = "" ;
      lV33DibDsc3 = "" ;
      lV34GrabNom3 = "" ;
      lV35TipMqnDsc3 = "" ;
      A6841DibDsc = "" ;
      A1006GrabNom = "" ;
      A3912TipMqnDsc = "" ;
      H00K62_A3912TipMqnDsc = new String[] {""} ;
      H00K62_n3912TipMqnDsc = new boolean[] {false} ;
      H00K62_A1006GrabNom = new String[] {""} ;
      H00K62_n1006GrabNom = new boolean[] {false} ;
      H00K62_A6841DibDsc = new String[] {""} ;
      H00K62_n6841DibDsc = new boolean[] {false} ;
      H00K62_A1015DibFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H00K62_n1015DibFecUlt = new boolean[] {false} ;
      H00K62_A2090DibMolCi2 = new short[1] ;
      H00K62_n2090DibMolCi2 = new boolean[] {false} ;
      H00K62_A1019DibMolCil = new short[1] ;
      H00K62_n1019DibMolCil = new boolean[] {false} ;
      H00K62_A1823DibTipMaq = new String[] {""} ;
      H00K62_n1823DibTipMaq = new boolean[] {false} ;
      H00K62_A3911TipMqnCod = new byte[1] ;
      H00K62_n3911TipMqnCod = new boolean[] {false} ;
      H00K62_A1005GrabCod = new short[1] ;
      H00K62_n1005GrabCod = new boolean[] {false} ;
      H00K62_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00K62_n1017DibFecEnt = new boolean[] {false} ;
      H00K62_A1014DibInt = new int[1] ;
      H00K62_A252CliCod = new int[1] ;
      H00K62_A1013DibCli = new String[] {""} ;
      H00K62_A396EmprCod = new String[] {""} ;
      H00K63_A3912TipMqnDsc = new String[] {""} ;
      H00K63_n3912TipMqnDsc = new boolean[] {false} ;
      H00K63_A1006GrabNom = new String[] {""} ;
      H00K63_n1006GrabNom = new boolean[] {false} ;
      H00K63_A6841DibDsc = new String[] {""} ;
      H00K63_n6841DibDsc = new boolean[] {false} ;
      H00K63_A1015DibFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      H00K63_n1015DibFecUlt = new boolean[] {false} ;
      H00K63_A2090DibMolCi2 = new short[1] ;
      H00K63_n2090DibMolCi2 = new boolean[] {false} ;
      H00K63_A1019DibMolCil = new short[1] ;
      H00K63_n1019DibMolCil = new boolean[] {false} ;
      H00K63_A1823DibTipMaq = new String[] {""} ;
      H00K63_n1823DibTipMaq = new boolean[] {false} ;
      H00K63_A3911TipMqnCod = new byte[1] ;
      H00K63_n3911TipMqnCod = new boolean[] {false} ;
      H00K63_A1005GrabCod = new short[1] ;
      H00K63_n1005GrabCod = new boolean[] {false} ;
      H00K63_A1017DibFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      H00K63_n1017DibFecEnt = new boolean[] {false} ;
      H00K63_A1014DibInt = new int[1] ;
      H00K63_A252CliCod = new int[1] ;
      H00K63_A1013DibCli = new String[] {""} ;
      H00K63_A396EmprCod = new String[] {""} ;
      AV64Station = "" ;
      GXt_char1 = "" ;
      AV65Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV66Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV67Usurcod = "" ;
      GXv_char4 = new String[1] ;
      imgAdddynamicfilters1_Jsonclick = "" ;
      imgRemovedynamicfilters1_Jsonclick = "" ;
      imgAdddynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters3_Jsonclick = "" ;
      lblCleanfilters_Jsonclick = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV16GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      TempTags = "" ;
      lblDynamicfiltersprefix1_Jsonclick = "" ;
      lblDynamicfiltersmiddle1_Jsonclick = "" ;
      lblDynamicfiltersprefix2_Jsonclick = "" ;
      lblDynamicfiltersmiddle2_Jsonclick = "" ;
      lblDynamicfiltersprefix3_Jsonclick = "" ;
      lblDynamicfiltersmiddle3_Jsonclick = "" ;
      ClassString = "" ;
      imgRemovedynamicfilters3_gximage = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      imgAdddynamicfilters2_gximage = "" ;
      imgRemovedynamicfilters2_gximage = "" ;
      imgAdddynamicfilters1_gximage = "" ;
      imgRemovedynamicfilters1_gximage = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webpromptdibujo__default(),
         new Object[] {
             new Object[] {
            H00K62_A3912TipMqnDsc, H00K62_n3912TipMqnDsc, H00K62_A1006GrabNom, H00K62_n1006GrabNom, H00K62_A6841DibDsc, H00K62_n6841DibDsc, H00K62_A1015DibFecUlt, H00K62_n1015DibFecUlt, H00K62_A2090DibMolCi2, H00K62_n2090DibMolCi2,
            H00K62_A1019DibMolCil, H00K62_n1019DibMolCil, H00K62_A1823DibTipMaq, H00K62_n1823DibTipMaq, H00K62_A3911TipMqnCod, H00K62_n3911TipMqnCod, H00K62_A1005GrabCod, H00K62_n1005GrabCod, H00K62_A1017DibFecEnt, H00K62_n1017DibFecEnt,
            H00K62_A1014DibInt, H00K62_A252CliCod, H00K62_A1013DibCli, H00K62_A396EmprCod
            }
            , new Object[] {
            H00K63_A3912TipMqnDsc, H00K63_n3912TipMqnDsc, H00K63_A1006GrabNom, H00K63_n1006GrabNom, H00K63_A6841DibDsc, H00K63_n6841DibDsc, H00K63_A1015DibFecUlt, H00K63_n1015DibFecUlt, H00K63_A2090DibMolCi2, H00K63_n2090DibMolCi2,
            H00K63_A1019DibMolCil, H00K63_n1019DibMolCil, H00K63_A1823DibTipMaq, H00K63_n1823DibTipMaq, H00K63_A3911TipMqnCod, H00K63_n3911TipMqnCod, H00K63_A1005GrabCod, H00K63_n1005GrabCod, H00K63_A1017DibFecEnt, H00K63_n1017DibFecEnt,
            H00K63_A1014DibInt, H00K63_A252CliCod, H00K63_A1013DibCli, H00K63_A396EmprCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSelect_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A3911TipMqnCod ;
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
   private short AV20DynamicFiltersOperator1 ;
   private short AV26DynamicFiltersOperator2 ;
   private short AV32DynamicFiltersOperator3 ;
   private short AV17OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A1005GrabCod ;
   private short A1019DibMolCil ;
   private short A2090DibMolCi2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV47TFDibMolCil ;
   private short AV48TFDibMolCil_To ;
   private short AV50TFDibMolCi2 ;
   private short AV51TFDibMolCi2_To ;
   private int wcpOAV61InOutCliCod ;
   private int wcpOAV10InOutDibInt ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_108 ;
   private int subGrid_Rows ;
   private int AV61InOutCliCod ;
   private int AV10InOutDibInt ;
   private int nGXsfl_108_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int AV55PageToGo ;
   private int imgAdddynamicfilters1_Visible ;
   private int imgRemovedynamicfilters1_Visible ;
   private int imgAdddynamicfilters2_Visible ;
   private int imgRemovedynamicfilters2_Visible ;
   private int edtavDibdsc1_Visible ;
   private int edtavGrabnom1_Visible ;
   private int edtavTipmqndsc1_Visible ;
   private int edtavDibdsc2_Visible ;
   private int edtavGrabnom2_Visible ;
   private int edtavTipmqndsc2_Visible ;
   private int edtavDibdsc3_Visible ;
   private int edtavGrabnom3_Visible ;
   private int edtavTipmqndsc3_Visible ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavDibdsc3_Enabled ;
   private int edtavGrabnom3_Enabled ;
   private int edtavTipmqndsc3_Enabled ;
   private int edtavDibdsc2_Enabled ;
   private int edtavGrabnom2_Enabled ;
   private int edtavTipmqndsc2_Enabled ;
   private int edtavDibdsc1_Enabled ;
   private int edtavGrabnom1_Enabled ;
   private int edtavTipmqndsc1_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV56GridCurrentPage ;
   private long AV57GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV60InOutEmprCod ;
   private String wcpOAV8InOutDibCli ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV60InOutEmprCod ;
   private String AV8InOutDibCli ;
   private String sGXsfl_108_idx="0001" ;
   private String AV21DibDsc1 ;
   private String AV22GrabNom1 ;
   private String AV23TipMqnDsc1 ;
   private String AV27DibDsc2 ;
   private String AV28GrabNom2 ;
   private String AV29TipMqnDsc2 ;
   private String AV33DibDsc3 ;
   private String AV34GrabNom3 ;
   private String AV35TipMqnDsc3 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTableheader_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String lblJsdynamicfilters_Internalname ;
   private String lblJsdynamicfilters_Caption ;
   private String lblJsdynamicfilters_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV58Select ;
   private String edtavSelect_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A1013DibCli ;
   private String edtDibCli_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtDibInt_Internalname ;
   private String edtDibFecEnt_Internalname ;
   private String edtGrabCod_Internalname ;
   private String edtTipMqnCod_Internalname ;
   private String A1823DibTipMaq ;
   private String edtDibMolCil_Internalname ;
   private String edtDibMolCi2_Internalname ;
   private String edtDibFecUlt_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV21DibDsc1 ;
   private String lV22GrabNom1 ;
   private String lV23TipMqnDsc1 ;
   private String lV27DibDsc2 ;
   private String lV28GrabNom2 ;
   private String lV29TipMqnDsc2 ;
   private String lV33DibDsc3 ;
   private String lV34GrabNom3 ;
   private String lV35TipMqnDsc3 ;
   private String A6841DibDsc ;
   private String A1006GrabNom ;
   private String A3912TipMqnDsc ;
   private String edtavDibdsc1_Internalname ;
   private String edtavGrabnom1_Internalname ;
   private String edtavTipmqndsc1_Internalname ;
   private String edtavDibdsc2_Internalname ;
   private String edtavGrabnom2_Internalname ;
   private String edtavTipmqndsc2_Internalname ;
   private String edtavDibdsc3_Internalname ;
   private String edtavGrabnom3_Internalname ;
   private String edtavTipmqndsc3_Internalname ;
   private String AV64Station ;
   private String GXt_char1 ;
   private String AV65Emprcod ;
   private String GXv_char2[] ;
   private String AV66Emprnom ;
   private String GXv_char3[] ;
   private String AV67Usurcod ;
   private String GXv_char4[] ;
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
   private String lblCleanfilters_Jsonclick ;
   private String lblCleanfilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String TempTags ;
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
   private String cellFilter_dibdsc3_cell_Internalname ;
   private String edtavDibdsc3_Jsonclick ;
   private String cellFilter_grabnom3_cell_Internalname ;
   private String edtavGrabnom3_Jsonclick ;
   private String cellFilter_tipmqndsc3_cell_Internalname ;
   private String edtavTipmqndsc3_Jsonclick ;
   private String cellDynamicfilters_removefilter3_cell_Internalname ;
   private String ClassString ;
   private String imgRemovedynamicfilters3_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String tblTablemergeddynamicfilters2_Internalname ;
   private String cellFilter_dibdsc2_cell_Internalname ;
   private String edtavDibdsc2_Jsonclick ;
   private String cellFilter_grabnom2_cell_Internalname ;
   private String edtavGrabnom2_Jsonclick ;
   private String cellFilter_tipmqndsc2_cell_Internalname ;
   private String edtavTipmqndsc2_Jsonclick ;
   private String cellDynamicfilters_addfilter2_cell_Internalname ;
   private String imgAdddynamicfilters2_gximage ;
   private String cellDynamicfilters_removefilter2_cell_Internalname ;
   private String imgRemovedynamicfilters2_gximage ;
   private String tblTablemergeddynamicfilters1_Internalname ;
   private String cellFilter_dibdsc1_cell_Internalname ;
   private String edtavDibdsc1_Jsonclick ;
   private String cellFilter_grabnom1_cell_Internalname ;
   private String edtavGrabnom1_Jsonclick ;
   private String cellFilter_tipmqndsc1_cell_Internalname ;
   private String edtavTipmqndsc1_Jsonclick ;
   private String cellDynamicfilters_addfilter1_cell_Internalname ;
   private String imgAdddynamicfilters1_gximage ;
   private String cellDynamicfilters_removefilter1_cell_Internalname ;
   private String imgRemovedynamicfilters1_gximage ;
   private String sGXsfl_108_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtDibCli_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtDibInt_Jsonclick ;
   private String edtDibFecEnt_Jsonclick ;
   private String edtGrabCod_Jsonclick ;
   private String edtTipMqnCod_Jsonclick ;
   private String GXCCtl ;
   private String edtDibMolCil_Jsonclick ;
   private String edtDibMolCi2_Jsonclick ;
   private String edtDibFecUlt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A1017DibFecEnt ;
   private java.util.Date A1015DibFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV24DynamicFiltersEnabled2 ;
   private boolean AV30DynamicFiltersEnabled3 ;
   private boolean AV18OrderedDsc ;
   private boolean AV37DynamicFiltersIgnoreFirst ;
   private boolean AV36DynamicFiltersRemoving ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n1017DibFecEnt ;
   private boolean n1005GrabCod ;
   private boolean n3911TipMqnCod ;
   private boolean n1823DibTipMaq ;
   private boolean n1019DibMolCil ;
   private boolean n2090DibMolCi2 ;
   private boolean n1015DibFecUlt ;
   private boolean bGXsfl_108_Refreshing=false ;
   private boolean n3912TipMqnDsc ;
   private boolean n1006GrabNom ;
   private boolean n6841DibDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV59FilterFullText ;
   private String AV19DynamicFiltersSelector1 ;
   private String AV25DynamicFiltersSelector2 ;
   private String AV31DynamicFiltersSelector3 ;
   private String lV59FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private HTMLChoice cmbavDynamicfiltersselector1 ;
   private HTMLChoice cmbavDynamicfiltersoperator1 ;
   private HTMLChoice cmbavDynamicfiltersselector2 ;
   private HTMLChoice cmbavDynamicfiltersoperator2 ;
   private HTMLChoice cmbavDynamicfiltersselector3 ;
   private HTMLChoice cmbavDynamicfiltersoperator3 ;
   private HTMLChoice lstDibTipMaq ;
   private IDataStoreProvider pr_default ;
   private String[] H00K62_A3912TipMqnDsc ;
   private boolean[] H00K62_n3912TipMqnDsc ;
   private String[] H00K62_A1006GrabNom ;
   private boolean[] H00K62_n1006GrabNom ;
   private String[] H00K62_A6841DibDsc ;
   private boolean[] H00K62_n6841DibDsc ;
   private java.util.Date[] H00K62_A1015DibFecUlt ;
   private boolean[] H00K62_n1015DibFecUlt ;
   private short[] H00K62_A2090DibMolCi2 ;
   private boolean[] H00K62_n2090DibMolCi2 ;
   private short[] H00K62_A1019DibMolCil ;
   private boolean[] H00K62_n1019DibMolCil ;
   private String[] H00K62_A1823DibTipMaq ;
   private boolean[] H00K62_n1823DibTipMaq ;
   private byte[] H00K62_A3911TipMqnCod ;
   private boolean[] H00K62_n3911TipMqnCod ;
   private short[] H00K62_A1005GrabCod ;
   private boolean[] H00K62_n1005GrabCod ;
   private java.util.Date[] H00K62_A1017DibFecEnt ;
   private boolean[] H00K62_n1017DibFecEnt ;
   private int[] H00K62_A1014DibInt ;
   private int[] H00K62_A252CliCod ;
   private String[] H00K62_A1013DibCli ;
   private String[] H00K62_A396EmprCod ;
   private String[] H00K63_A3912TipMqnDsc ;
   private boolean[] H00K63_n3912TipMqnDsc ;
   private String[] H00K63_A1006GrabNom ;
   private boolean[] H00K63_n1006GrabNom ;
   private String[] H00K63_A6841DibDsc ;
   private boolean[] H00K63_n6841DibDsc ;
   private java.util.Date[] H00K63_A1015DibFecUlt ;
   private boolean[] H00K63_n1015DibFecUlt ;
   private short[] H00K63_A2090DibMolCi2 ;
   private boolean[] H00K63_n2090DibMolCi2 ;
   private short[] H00K63_A1019DibMolCil ;
   private boolean[] H00K63_n1019DibMolCil ;
   private String[] H00K63_A1823DibTipMaq ;
   private boolean[] H00K63_n1823DibTipMaq ;
   private byte[] H00K63_A3911TipMqnCod ;
   private boolean[] H00K63_n3911TipMqnCod ;
   private short[] H00K63_A1005GrabCod ;
   private boolean[] H00K63_n1005GrabCod ;
   private java.util.Date[] H00K63_A1017DibFecEnt ;
   private boolean[] H00K63_n1017DibFecEnt ;
   private int[] H00K63_A1014DibInt ;
   private int[] H00K63_A252CliCod ;
   private String[] H00K63_A1013DibCli ;
   private String[] H00K63_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV14GridState ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV16GridStateDynamicFilter ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV54DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webpromptdibujo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00K62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV19DynamicFiltersSelector1 ,
                                          short AV20DynamicFiltersOperator1 ,
                                          String AV21DibDsc1 ,
                                          String AV22GrabNom1 ,
                                          String AV23TipMqnDsc1 ,
                                          boolean AV24DynamicFiltersEnabled2 ,
                                          String AV25DynamicFiltersSelector2 ,
                                          short AV26DynamicFiltersOperator2 ,
                                          String AV27DibDsc2 ,
                                          String AV28GrabNom2 ,
                                          String AV29TipMqnDsc2 ,
                                          boolean AV30DynamicFiltersEnabled3 ,
                                          String AV31DynamicFiltersSelector3 ,
                                          short AV32DynamicFiltersOperator3 ,
                                          String AV33DibDsc3 ,
                                          String AV34GrabNom3 ,
                                          String AV35TipMqnDsc3 ,
                                          short AV47TFDibMolCil ,
                                          short AV48TFDibMolCil_To ,
                                          short AV50TFDibMolCi2 ,
                                          short AV51TFDibMolCi2_To ,
                                          String A6841DibDsc ,
                                          String A1006GrabNom ,
                                          String A3912TipMqnDsc ,
                                          short A1019DibMolCil ,
                                          short A2090DibMolCi2 ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV59FilterFullText ,
                                          String A1013DibCli ,
                                          int A252CliCod ,
                                          int A1014DibInt ,
                                          short A1005GrabCod ,
                                          byte A3911TipMqnCod ,
                                          String A1823DibTipMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int8 = new byte[22];
      Object[] GXv_Object9 = new Object[2];
      scmdbuf = "SELECT T3.TipMqnDsc, T2.GrabNom, T1.DibDsc, T1.DibFecUlt, T1.DibMolCi2, T1.DibMolCil, T1.DibTipMaq, T1.TipMqnCod, T1.GrabCod, T1.DibFecEnt, T1.DibInt, T1.CliCod," ;
      scmdbuf += " T1.DibCli, T1.EmprCod FROM ((TXPCDIBUJ T1 LEFT JOIN TXPGRABAD T2 ON T2.EmprCod = T1.EmprCod AND T2.GrabCod = T1.GrabCod) LEFT JOIN TXPTIPMQN T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.TipMqnCod = T1.TipMqnCod)" ;
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV21DibDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like ?)");
      }
      else
      {
         GXv_int8[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV21DibDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like '%' || ?)");
      }
      else
      {
         GXv_int8[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 ) && ( AV20DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV22GrabNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like ?)");
      }
      else
      {
         GXv_int8[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 ) && ( AV20DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV22GrabNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like '%' || ?)");
      }
      else
      {
         GXv_int8[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV23TipMqnDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like ?)");
      }
      else
      {
         GXv_int8[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV23TipMqnDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like '%' || ?)");
      }
      else
      {
         GXv_int8[5] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV27DibDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like ?)");
      }
      else
      {
         GXv_int8[6] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV27DibDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like '%' || ?)");
      }
      else
      {
         GXv_int8[7] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 ) && ( AV26DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV28GrabNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like ?)");
      }
      else
      {
         GXv_int8[8] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 ) && ( AV26DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV28GrabNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like '%' || ?)");
      }
      else
      {
         GXv_int8[9] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV29TipMqnDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like ?)");
      }
      else
      {
         GXv_int8[10] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV29TipMqnDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like '%' || ?)");
      }
      else
      {
         GXv_int8[11] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV33DibDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like ?)");
      }
      else
      {
         GXv_int8[12] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV33DibDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like '%' || ?)");
      }
      else
      {
         GXv_int8[13] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 ) && ( AV32DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV34GrabNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like ?)");
      }
      else
      {
         GXv_int8[14] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 ) && ( AV32DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV34GrabNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like '%' || ?)");
      }
      else
      {
         GXv_int8[15] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV35TipMqnDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like ?)");
      }
      else
      {
         GXv_int8[16] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV35TipMqnDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like '%' || ?)");
      }
      else
      {
         GXv_int8[17] = (byte)(1) ;
      }
      if ( ! (0==AV47TFDibMolCil) )
      {
         addWhere(sWhereString, "(T1.DibMolCil >= ?)");
      }
      else
      {
         GXv_int8[18] = (byte)(1) ;
      }
      if ( ! (0==AV48TFDibMolCil_To) )
      {
         addWhere(sWhereString, "(T1.DibMolCil <= ?)");
      }
      else
      {
         GXv_int8[19] = (byte)(1) ;
      }
      if ( ! (0==AV50TFDibMolCi2) )
      {
         addWhere(sWhereString, "(T1.DibMolCi2 >= ?)");
      }
      else
      {
         GXv_int8[20] = (byte)(1) ;
      }
      if ( ! (0==AV51TFDibMolCi2_To) )
      {
         addWhere(sWhereString, "(T1.DibMolCi2 <= ?)");
      }
      else
      {
         GXv_int8[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV17OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.DibDsc" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibCli" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibCli DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibInt" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibInt DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibFecEnt" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibFecEnt DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GrabCod" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GrabCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMqnCod" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMqnCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibTipMaq" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibTipMaq DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibMolCil" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibMolCil DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibMolCi2" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibMolCi2 DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibFecUlt" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibFecUlt DESC" ;
      }
      GXv_Object9[0] = scmdbuf ;
      GXv_Object9[1] = GXv_int8 ;
      return GXv_Object9 ;
   }

   protected Object[] conditional_H00K63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV19DynamicFiltersSelector1 ,
                                          short AV20DynamicFiltersOperator1 ,
                                          String AV21DibDsc1 ,
                                          String AV22GrabNom1 ,
                                          String AV23TipMqnDsc1 ,
                                          boolean AV24DynamicFiltersEnabled2 ,
                                          String AV25DynamicFiltersSelector2 ,
                                          short AV26DynamicFiltersOperator2 ,
                                          String AV27DibDsc2 ,
                                          String AV28GrabNom2 ,
                                          String AV29TipMqnDsc2 ,
                                          boolean AV30DynamicFiltersEnabled3 ,
                                          String AV31DynamicFiltersSelector3 ,
                                          short AV32DynamicFiltersOperator3 ,
                                          String AV33DibDsc3 ,
                                          String AV34GrabNom3 ,
                                          String AV35TipMqnDsc3 ,
                                          short AV47TFDibMolCil ,
                                          short AV48TFDibMolCil_To ,
                                          short AV50TFDibMolCi2 ,
                                          short AV51TFDibMolCi2_To ,
                                          String A6841DibDsc ,
                                          String A1006GrabNom ,
                                          String A3912TipMqnDsc ,
                                          short A1019DibMolCil ,
                                          short A2090DibMolCi2 ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV59FilterFullText ,
                                          String A1013DibCli ,
                                          int A252CliCod ,
                                          int A1014DibInt ,
                                          short A1005GrabCod ,
                                          byte A3911TipMqnCod ,
                                          String A1823DibTipMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int10 = new byte[22];
      Object[] GXv_Object11 = new Object[2];
      scmdbuf = "SELECT T3.TipMqnDsc, T2.GrabNom, T1.DibDsc, T1.DibFecUlt, T1.DibMolCi2, T1.DibMolCil, T1.DibTipMaq, T1.TipMqnCod, T1.GrabCod, T1.DibFecEnt, T1.DibInt, T1.CliCod," ;
      scmdbuf += " T1.DibCli, T1.EmprCod FROM ((TXPCDIBUJ T1 LEFT JOIN TXPGRABAD T2 ON T2.EmprCod = T1.EmprCod AND T2.GrabCod = T1.GrabCod) LEFT JOIN TXPTIPMQN T3 ON T3.EmprCod =" ;
      scmdbuf += " T1.EmprCod AND T3.TipMqnCod = T1.TipMqnCod)" ;
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV21DibDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like ?)");
      }
      else
      {
         GXv_int10[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "DIBDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV21DibDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like '%' || ?)");
      }
      else
      {
         GXv_int10[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 ) && ( AV20DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV22GrabNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like ?)");
      }
      else
      {
         GXv_int10[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "GRABNOM") == 0 ) && ( AV20DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV22GrabNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like '%' || ?)");
      }
      else
      {
         GXv_int10[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV23TipMqnDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like ?)");
      }
      else
      {
         GXv_int10[4] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV19DynamicFiltersSelector1, "TIPMQNDSC") == 0 ) && ( AV20DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV23TipMqnDsc1)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like '%' || ?)");
      }
      else
      {
         GXv_int10[5] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV27DibDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like ?)");
      }
      else
      {
         GXv_int10[6] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "DIBDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV27DibDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like '%' || ?)");
      }
      else
      {
         GXv_int10[7] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 ) && ( AV26DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV28GrabNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like ?)");
      }
      else
      {
         GXv_int10[8] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "GRABNOM") == 0 ) && ( AV26DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV28GrabNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like '%' || ?)");
      }
      else
      {
         GXv_int10[9] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV29TipMqnDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like ?)");
      }
      else
      {
         GXv_int10[10] = (byte)(1) ;
      }
      if ( AV24DynamicFiltersEnabled2 && ( GXutil.strcmp(AV25DynamicFiltersSelector2, "TIPMQNDSC") == 0 ) && ( AV26DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV29TipMqnDsc2)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like '%' || ?)");
      }
      else
      {
         GXv_int10[11] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV33DibDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like ?)");
      }
      else
      {
         GXv_int10[12] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "DIBDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV33DibDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T1.DibDsc like '%' || ?)");
      }
      else
      {
         GXv_int10[13] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 ) && ( AV32DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV34GrabNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like ?)");
      }
      else
      {
         GXv_int10[14] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "GRABNOM") == 0 ) && ( AV32DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV34GrabNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.GrabNom like '%' || ?)");
      }
      else
      {
         GXv_int10[15] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV35TipMqnDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like ?)");
      }
      else
      {
         GXv_int10[16] = (byte)(1) ;
      }
      if ( AV30DynamicFiltersEnabled3 && ( GXutil.strcmp(AV31DynamicFiltersSelector3, "TIPMQNDSC") == 0 ) && ( AV32DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV35TipMqnDsc3)==0) ) )
      {
         addWhere(sWhereString, "(T3.TipMqnDsc like '%' || ?)");
      }
      else
      {
         GXv_int10[17] = (byte)(1) ;
      }
      if ( ! (0==AV47TFDibMolCil) )
      {
         addWhere(sWhereString, "(T1.DibMolCil >= ?)");
      }
      else
      {
         GXv_int10[18] = (byte)(1) ;
      }
      if ( ! (0==AV48TFDibMolCil_To) )
      {
         addWhere(sWhereString, "(T1.DibMolCil <= ?)");
      }
      else
      {
         GXv_int10[19] = (byte)(1) ;
      }
      if ( ! (0==AV50TFDibMolCi2) )
      {
         addWhere(sWhereString, "(T1.DibMolCi2 >= ?)");
      }
      else
      {
         GXv_int10[20] = (byte)(1) ;
      }
      if ( ! (0==AV51TFDibMolCi2_To) )
      {
         addWhere(sWhereString, "(T1.DibMolCi2 <= ?)");
      }
      else
      {
         GXv_int10[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV17OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.DibDsc" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibCli" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibCli DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibInt" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibInt DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibFecEnt" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibFecEnt DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GrabCod" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GrabCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.TipMqnCod" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.TipMqnCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibTipMaq" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibTipMaq DESC" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibMolCil" ;
      }
      else if ( ( AV17OrderedBy == 9 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibMolCil DESC" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibMolCi2" ;
      }
      else if ( ( AV17OrderedBy == 10 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibMolCi2 DESC" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ! AV18OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.DibFecUlt" ;
      }
      else if ( ( AV17OrderedBy == 11 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.DibFecUlt DESC" ;
      }
      GXv_Object11[0] = scmdbuf ;
      GXv_Object11[1] = GXv_int10 ;
      return GXv_Object11 ;
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
                  return conditional_H00K62(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H00K63(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , ((Boolean) dynConstraints[5]).booleanValue() , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).shortValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).shortValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00K62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00K63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(11);
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((String[]) buf[22])[0] = rslt.getString(13, 16);
               ((String[]) buf[23])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(11);
               ((int[]) buf[21])[0] = rslt.getInt(12);
               ((String[]) buf[22])[0] = rslt.getString(13, 16);
               ((String[]) buf[23])[0] = rslt.getString(14, 3);
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
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               return;
      }
   }

}

