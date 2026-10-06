package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webhdsto5_impl extends GXDataArea
{
   public webhdsto5_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webhdsto5_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webhdsto5_impl.class ));
   }

   public webhdsto5_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAcciones = new HTMLChoice();
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV48FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV30TFStp_Lin = (short)(GXutil.lval( httpContext.GetPar( "TFStp_Lin"))) ;
      AV31TFStp_Lin_To = (short)(GXutil.lval( httpContext.GetPar( "TFStp_Lin_To"))) ;
      AV33TFStp_Dia = localUtil.parseDTimeParm( httpContext.GetPar( "TFStp_Dia")) ;
      AV38TFStp_Mot = httpContext.GetPar( "TFStp_Mot") ;
      AV39TFStp_Mot_Sel = httpContext.GetPar( "TFStp_Mot_Sel") ;
      AV27TFStpHdr = httpContext.GetPar( "TFStpHdr") ;
      AV28TFStpHdr_Sel = httpContext.GetPar( "TFStpHdr_Sel") ;
      AV49TFStpClicod = (int)(GXutil.lval( httpContext.GetPar( "TFStpClicod"))) ;
      AV50TFStpClicod_To = (int)(GXutil.lval( httpContext.GetPar( "TFStpClicod_To"))) ;
      AV51TFStpCliNom = httpContext.GetPar( "TFStpCliNom") ;
      AV52TFStpCliNom_Sel = httpContext.GetPar( "TFStpCliNom_Sel") ;
      AV53TFStpBarser = httpContext.GetPar( "TFStpBarser") ;
      AV54TFStpBarser_Sel = httpContext.GetPar( "TFStpBarser_Sel") ;
      AV55TFStpBarserDsc = httpContext.GetPar( "TFStpBarserDsc") ;
      AV56TFStpBarserDsc_Sel = httpContext.GetPar( "TFStpBarserDsc_Sel") ;
      AV57TFStpColor = httpContext.GetPar( "TFStpColor") ;
      AV58TFStpColor_Sel = httpContext.GetPar( "TFStpColor_Sel") ;
      AV109Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV48FilterFullText, AV30TFStp_Lin, AV31TFStp_Lin_To, AV33TFStp_Dia, AV38TFStp_Mot, AV39TFStp_Mot_Sel, AV27TFStpHdr, AV28TFStpHdr_Sel, AV49TFStpClicod, AV50TFStpClicod_To, AV51TFStpCliNom, AV52TFStpCliNom_Sel, AV53TFStpBarser, AV54TFStpBarser_Sel, AV55TFStpBarserDsc, AV56TFStpBarserDsc_Sel, AV57TFStpColor, AV58TFStpColor_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      paJ02( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startJ02( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webhdsto5", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV43GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV44GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTP_LIN", GXutil.ltrim( localUtil.ntoc( AV30TFStp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTP_LIN_TO", GXutil.ltrim( localUtil.ntoc( AV31TFStp_Lin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTP_DIA", localUtil.ttoc( AV33TFStp_Dia, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTP_MOT", AV38TFStp_Mot);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTP_MOT_SEL", AV39TFStp_Mot_Sel);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPHDR", GXutil.rtrim( AV27TFStpHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPHDR_SEL", GXutil.rtrim( AV28TFStpHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPCLICOD", GXutil.ltrim( localUtil.ntoc( AV49TFStpClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV50TFStpClicod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPCLINOM", GXutil.rtrim( AV51TFStpCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPCLINOM_SEL", GXutil.rtrim( AV52TFStpCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPBARSER", GXutil.rtrim( AV53TFStpBarser));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPBARSER_SEL", GXutil.rtrim( AV54TFStpBarser_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPBARSERDSC", GXutil.rtrim( AV55TFStpBarserDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPBARSERDSC_SEL", GXutil.rtrim( AV56TFStpBarserDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPCOLOR", GXutil.rtrim( AV57TFStpColor));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSTPCOLOR_SEL", GXutil.rtrim( AV58TFStpColor_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV109Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV46usurcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV47station));
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
         weJ02( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtJ02( ) ;
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
      return formatLink("app.webhdsto5", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebHDSTO5" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Activacion HDR", "") ;
   }

   public void wbJ00( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebHDSTO5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebHDSTO5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebHDSTO5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebHDSTO5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_J02( true) ;
      }
      else
      {
         wb_table1_25_J02( false) ;
      }
      return  ;
   }

   public void wb_table1_25_J02e( boolean wbgen )
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
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV43GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV44GridPageCount);
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
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_stp_diaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_stp_diaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_stp_diaauxdate_Internalname, localUtil.format(AV35DDO_Stp_DiaAuxDate, "99/99/99"), localUtil.format( AV35DDO_Stp_DiaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_stp_diaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebHDSTO5.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_stp_diaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebHDSTO5.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void startJ02( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Activacion HDR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupJ00( ) ;
   }

   public void wsJ02( )
   {
      startJ02( ) ;
      evtJ02( ) ;
   }

   public void evtJ02( )
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
                           e11J02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12J02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13J02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14J02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15J02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e16J02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e17J02 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18J02 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VACCIONES.CLICK") == 0 ) )
                        {
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           cmbavAcciones.setName( cmbavAcciones.getInternalname() );
                           cmbavAcciones.setValue( httpContext.cgiGet( cmbavAcciones.getInternalname()) );
                           AV60Acciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavAcciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Acciones), 4, 0));
                           A10750Stp_Lin = (short)(localUtil.ctol( httpContext.cgiGet( edtStp_Lin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A10751Stp_Dia = localUtil.ctot( httpContext.cgiGet( edtStp_Dia_Internalname), 0) ;
                           A10752Stp_Mot = httpContext.cgiGet( edtStp_Mot_Internalname) ;
                           A10746Stp_hdr = (int)(localUtil.ctol( httpContext.cgiGet( edtStp_hdr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A10747Stp_r = (byte)(localUtil.ctol( httpContext.cgiGet( edtStp_r_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A10748Stp_p = httpContext.cgiGet( edtStp_p_Internalname) ;
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
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e19J02 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e20J02 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e21J02 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e22J02 ();
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

   public void weJ02( )
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

   public void paJ02( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 String AV48FilterFullText ,
                                 short AV30TFStp_Lin ,
                                 short AV31TFStp_Lin_To ,
                                 java.util.Date AV33TFStp_Dia ,
                                 String AV38TFStp_Mot ,
                                 String AV39TFStp_Mot_Sel ,
                                 String AV27TFStpHdr ,
                                 String AV28TFStpHdr_Sel ,
                                 int AV49TFStpClicod ,
                                 int AV50TFStpClicod_To ,
                                 String AV51TFStpCliNom ,
                                 String AV52TFStpCliNom_Sel ,
                                 String AV53TFStpBarser ,
                                 String AV54TFStpBarser_Sel ,
                                 String AV55TFStpBarserDsc ,
                                 String AV56TFStpBarserDsc_Sel ,
                                 String AV57TFStpColor ,
                                 String AV58TFStpColor_Sel ,
                                 String AV109Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e20J02 ();
      GRID_nCurrentRecord = 0 ;
      rfJ02( ) ;
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
      rfJ02( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV109Pgmname = "WebHDSTO5" ;
      Gx_err = (short)(0) ;
   }

   public void rfJ02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e20J02 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV92Webhdsto5ds_2_tfstp_lin) ,
                                              Short.valueOf(AV93Webhdsto5ds_3_tfstp_lin_to) ,
                                              AV94Webhdsto5ds_4_tfstp_dia ,
                                              AV96Webhdsto5ds_6_tfstp_mot_sel ,
                                              AV95Webhdsto5ds_5_tfstp_mot ,
                                              AV98Webhdsto5ds_8_tfstphdr_sel ,
                                              AV97Webhdsto5ds_7_tfstphdr ,
                                              Short.valueOf(A10750Stp_Lin) ,
                                              A10751Stp_Dia ,
                                              A10752Stp_Mot ,
                                              Integer.valueOf(A10746Stp_hdr) ,
                                              Byte.valueOf(A10747Stp_r) ,
                                              A10748Stp_p ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV91Webhdsto5ds_1_filterfulltext ,
                                              A13723StpHdr ,
                                              Integer.valueOf(A13726StpClicod) ,
                                              A13727StpCliNom ,
                                              A13724StpBarser ,
                                              A13725StpBarserD ,
                                              A13728StpColor ,
                                              Integer.valueOf(AV99Webhdsto5ds_9_tfstpclicod) ,
                                              Integer.valueOf(AV100Webhdsto5ds_10_tfstpclicod_to) ,
                                              AV102Webhdsto5ds_12_tfstpclinom_sel ,
                                              AV101Webhdsto5ds_11_tfstpclinom ,
                                              AV104Webhdsto5ds_14_tfstpbarser_sel ,
                                              AV103Webhdsto5ds_13_tfstpbarser ,
                                              AV106Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                              AV105Webhdsto5ds_15_tfstpbarserdsc ,
                                              AV108Webhdsto5ds_18_tfstpcolor_sel ,
                                              AV107Webhdsto5ds_17_tfstpcolor ,
                                              A396EmprCod ,
                                              Byte.valueOf(A10755Stp_Est) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
         lV101Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV101Webhdsto5ds_11_tfstpclinom), 30, "%") ;
         lV103Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV103Webhdsto5ds_13_tfstpbarser), 16, "%") ;
         lV105Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV105Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
         lV107Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV107Webhdsto5ds_17_tfstpcolor), 13, "%") ;
         lV95Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV95Webhdsto5ds_5_tfstp_mot), "%", "") ;
         lV97Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV97Webhdsto5ds_7_tfstphdr), 11, "%") ;
         /* Using cursor H00J03 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV99Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV99Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV100Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV100Webhdsto5ds_10_tfstpclicod_to), AV102Webhdsto5ds_12_tfstpclinom_sel, AV101Webhdsto5ds_11_tfstpclinom, lV101Webhdsto5ds_11_tfstpclinom, AV102Webhdsto5ds_12_tfstpclinom_sel, AV102Webhdsto5ds_12_tfstpclinom_sel, AV104Webhdsto5ds_14_tfstpbarser_sel, AV103Webhdsto5ds_13_tfstpbarser, lV103Webhdsto5ds_13_tfstpbarser, AV104Webhdsto5ds_14_tfstpbarser_sel, AV104Webhdsto5ds_14_tfstpbarser_sel, AV106Webhdsto5ds_16_tfstpbarserdsc_sel, AV105Webhdsto5ds_15_tfstpbarserdsc, lV105Webhdsto5ds_15_tfstpbarserdsc, AV106Webhdsto5ds_16_tfstpbarserdsc_sel, AV106Webhdsto5ds_16_tfstpbarserdsc_sel, AV108Webhdsto5ds_18_tfstpcolor_sel, AV107Webhdsto5ds_17_tfstpcolor, lV107Webhdsto5ds_17_tfstpcolor, AV108Webhdsto5ds_18_tfstpcolor_sel, AV108Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV92Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV93Webhdsto5ds_3_tfstp_lin_to), AV94Webhdsto5ds_4_tfstp_dia, lV95Webhdsto5ds_5_tfstp_mot, AV96Webhdsto5ds_6_tfstp_mot_sel, lV97Webhdsto5ds_7_tfstphdr, AV98Webhdsto5ds_8_tfstphdr_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A10755Stp_Est = H00J03_A10755Stp_Est[0] ;
            A13723StpHdr = H00J03_A13723StpHdr[0] ;
            A10752Stp_Mot = H00J03_A10752Stp_Mot[0] ;
            A10751Stp_Dia = H00J03_A10751Stp_Dia[0] ;
            A10750Stp_Lin = H00J03_A10750Stp_Lin[0] ;
            A13728StpColor = H00J03_A13728StpColor[0] ;
            n13728StpColor = H00J03_n13728StpColor[0] ;
            A13725StpBarserD = H00J03_A13725StpBarserD[0] ;
            n13725StpBarserD = H00J03_n13725StpBarserD[0] ;
            A13724StpBarser = H00J03_A13724StpBarser[0] ;
            n13724StpBarser = H00J03_n13724StpBarser[0] ;
            A13727StpCliNom = H00J03_A13727StpCliNom[0] ;
            n13727StpCliNom = H00J03_n13727StpCliNom[0] ;
            A13726StpClicod = H00J03_A13726StpClicod[0] ;
            n13726StpClicod = H00J03_n13726StpClicod[0] ;
            A10746Stp_hdr = H00J03_A10746Stp_hdr[0] ;
            A10747Stp_r = H00J03_A10747Stp_r[0] ;
            A10748Stp_p = H00J03_A10748Stp_p[0] ;
            A13723StpHdr = H00J03_A13723StpHdr[0] ;
            A13728StpColor = H00J03_A13728StpColor[0] ;
            n13728StpColor = H00J03_n13728StpColor[0] ;
            A13725StpBarserD = H00J03_A13725StpBarserD[0] ;
            n13725StpBarserD = H00J03_n13725StpBarserD[0] ;
            A13724StpBarser = H00J03_A13724StpBarser[0] ;
            n13724StpBarser = H00J03_n13724StpBarser[0] ;
            A13726StpClicod = H00J03_A13726StpClicod[0] ;
            n13726StpClicod = H00J03_n13726StpClicod[0] ;
            A13727StpCliNom = H00J03_A13727StpCliNom[0] ;
            n13727StpCliNom = H00J03_n13727StpCliNom[0] ;
            e21J02 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wbJ00( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesJ02( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV109Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
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
      AV91Webhdsto5ds_1_filterfulltext = AV48FilterFullText ;
      AV92Webhdsto5ds_2_tfstp_lin = AV30TFStp_Lin ;
      AV93Webhdsto5ds_3_tfstp_lin_to = AV31TFStp_Lin_To ;
      AV94Webhdsto5ds_4_tfstp_dia = AV33TFStp_Dia ;
      AV95Webhdsto5ds_5_tfstp_mot = AV38TFStp_Mot ;
      AV96Webhdsto5ds_6_tfstp_mot_sel = AV39TFStp_Mot_Sel ;
      AV97Webhdsto5ds_7_tfstphdr = AV27TFStpHdr ;
      AV98Webhdsto5ds_8_tfstphdr_sel = AV28TFStpHdr_Sel ;
      AV99Webhdsto5ds_9_tfstpclicod = AV49TFStpClicod ;
      AV100Webhdsto5ds_10_tfstpclicod_to = AV50TFStpClicod_To ;
      AV101Webhdsto5ds_11_tfstpclinom = AV51TFStpCliNom ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV103Webhdsto5ds_13_tfstpbarser = AV53TFStpBarser ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV107Webhdsto5ds_17_tfstpcolor = AV57TFStpColor ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = AV58TFStpColor_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV92Webhdsto5ds_2_tfstp_lin) ,
                                           Short.valueOf(AV93Webhdsto5ds_3_tfstp_lin_to) ,
                                           AV94Webhdsto5ds_4_tfstp_dia ,
                                           AV96Webhdsto5ds_6_tfstp_mot_sel ,
                                           AV95Webhdsto5ds_5_tfstp_mot ,
                                           AV98Webhdsto5ds_8_tfstphdr_sel ,
                                           AV97Webhdsto5ds_7_tfstphdr ,
                                           Short.valueOf(A10750Stp_Lin) ,
                                           A10751Stp_Dia ,
                                           A10752Stp_Mot ,
                                           Integer.valueOf(A10746Stp_hdr) ,
                                           Byte.valueOf(A10747Stp_r) ,
                                           A10748Stp_p ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV91Webhdsto5ds_1_filterfulltext ,
                                           A13723StpHdr ,
                                           Integer.valueOf(A13726StpClicod) ,
                                           A13727StpCliNom ,
                                           A13724StpBarser ,
                                           A13725StpBarserD ,
                                           A13728StpColor ,
                                           Integer.valueOf(AV99Webhdsto5ds_9_tfstpclicod) ,
                                           Integer.valueOf(AV100Webhdsto5ds_10_tfstpclicod_to) ,
                                           AV102Webhdsto5ds_12_tfstpclinom_sel ,
                                           AV101Webhdsto5ds_11_tfstpclinom ,
                                           AV104Webhdsto5ds_14_tfstpbarser_sel ,
                                           AV103Webhdsto5ds_13_tfstpbarser ,
                                           AV106Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                           AV105Webhdsto5ds_15_tfstpbarserdsc ,
                                           AV108Webhdsto5ds_18_tfstpcolor_sel ,
                                           AV107Webhdsto5ds_17_tfstpcolor ,
                                           A396EmprCod ,
                                           Byte.valueOf(A10755Stp_Est) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV91Webhdsto5ds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV91Webhdsto5ds_1_filterfulltext), "%", "") ;
      lV101Webhdsto5ds_11_tfstpclinom = GXutil.padr( GXutil.rtrim( AV101Webhdsto5ds_11_tfstpclinom), 30, "%") ;
      lV103Webhdsto5ds_13_tfstpbarser = GXutil.padr( GXutil.rtrim( AV103Webhdsto5ds_13_tfstpbarser), 16, "%") ;
      lV105Webhdsto5ds_15_tfstpbarserdsc = GXutil.padr( GXutil.rtrim( AV105Webhdsto5ds_15_tfstpbarserdsc), 26, "%") ;
      lV107Webhdsto5ds_17_tfstpcolor = GXutil.padr( GXutil.rtrim( AV107Webhdsto5ds_17_tfstpcolor), 13, "%") ;
      lV95Webhdsto5ds_5_tfstp_mot = GXutil.concat( GXutil.rtrim( AV95Webhdsto5ds_5_tfstp_mot), "%", "") ;
      lV97Webhdsto5ds_7_tfstphdr = GXutil.padr( GXutil.rtrim( AV97Webhdsto5ds_7_tfstphdr), 11, "%") ;
      /* Using cursor H00J05 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, lV91Webhdsto5ds_1_filterfulltext, Integer.valueOf(AV99Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV99Webhdsto5ds_9_tfstpclicod), Integer.valueOf(AV100Webhdsto5ds_10_tfstpclicod_to), Integer.valueOf(AV100Webhdsto5ds_10_tfstpclicod_to), AV102Webhdsto5ds_12_tfstpclinom_sel, AV101Webhdsto5ds_11_tfstpclinom, lV101Webhdsto5ds_11_tfstpclinom, AV102Webhdsto5ds_12_tfstpclinom_sel, AV102Webhdsto5ds_12_tfstpclinom_sel, AV104Webhdsto5ds_14_tfstpbarser_sel, AV103Webhdsto5ds_13_tfstpbarser, lV103Webhdsto5ds_13_tfstpbarser, AV104Webhdsto5ds_14_tfstpbarser_sel, AV104Webhdsto5ds_14_tfstpbarser_sel, AV106Webhdsto5ds_16_tfstpbarserdsc_sel, AV105Webhdsto5ds_15_tfstpbarserdsc, lV105Webhdsto5ds_15_tfstpbarserdsc, AV106Webhdsto5ds_16_tfstpbarserdsc_sel, AV106Webhdsto5ds_16_tfstpbarserdsc_sel, AV108Webhdsto5ds_18_tfstpcolor_sel, AV107Webhdsto5ds_17_tfstpcolor, lV107Webhdsto5ds_17_tfstpcolor, AV108Webhdsto5ds_18_tfstpcolor_sel, AV108Webhdsto5ds_18_tfstpcolor_sel, Short.valueOf(AV92Webhdsto5ds_2_tfstp_lin), Short.valueOf(AV93Webhdsto5ds_3_tfstp_lin_to), AV94Webhdsto5ds_4_tfstp_dia, lV95Webhdsto5ds_5_tfstp_mot, AV96Webhdsto5ds_6_tfstp_mot_sel, lV97Webhdsto5ds_7_tfstphdr, AV98Webhdsto5ds_8_tfstphdr_sel});
      GRID_nRecordCount = H00J05_AGRID_nRecordCount[0] ;
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
      AV91Webhdsto5ds_1_filterfulltext = AV48FilterFullText ;
      AV92Webhdsto5ds_2_tfstp_lin = AV30TFStp_Lin ;
      AV93Webhdsto5ds_3_tfstp_lin_to = AV31TFStp_Lin_To ;
      AV94Webhdsto5ds_4_tfstp_dia = AV33TFStp_Dia ;
      AV95Webhdsto5ds_5_tfstp_mot = AV38TFStp_Mot ;
      AV96Webhdsto5ds_6_tfstp_mot_sel = AV39TFStp_Mot_Sel ;
      AV97Webhdsto5ds_7_tfstphdr = AV27TFStpHdr ;
      AV98Webhdsto5ds_8_tfstphdr_sel = AV28TFStpHdr_Sel ;
      AV99Webhdsto5ds_9_tfstpclicod = AV49TFStpClicod ;
      AV100Webhdsto5ds_10_tfstpclicod_to = AV50TFStpClicod_To ;
      AV101Webhdsto5ds_11_tfstpclinom = AV51TFStpCliNom ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV103Webhdsto5ds_13_tfstpbarser = AV53TFStpBarser ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV107Webhdsto5ds_17_tfstpcolor = AV57TFStpColor ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = AV58TFStpColor_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV48FilterFullText, AV30TFStp_Lin, AV31TFStp_Lin_To, AV33TFStp_Dia, AV38TFStp_Mot, AV39TFStp_Mot_Sel, AV27TFStpHdr, AV28TFStpHdr_Sel, AV49TFStpClicod, AV50TFStpClicod_To, AV51TFStpCliNom, AV52TFStpCliNom_Sel, AV53TFStpBarser, AV54TFStpBarser_Sel, AV55TFStpBarserDsc, AV56TFStpBarserDsc_Sel, AV57TFStpColor, AV58TFStpColor_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV91Webhdsto5ds_1_filterfulltext = AV48FilterFullText ;
      AV92Webhdsto5ds_2_tfstp_lin = AV30TFStp_Lin ;
      AV93Webhdsto5ds_3_tfstp_lin_to = AV31TFStp_Lin_To ;
      AV94Webhdsto5ds_4_tfstp_dia = AV33TFStp_Dia ;
      AV95Webhdsto5ds_5_tfstp_mot = AV38TFStp_Mot ;
      AV96Webhdsto5ds_6_tfstp_mot_sel = AV39TFStp_Mot_Sel ;
      AV97Webhdsto5ds_7_tfstphdr = AV27TFStpHdr ;
      AV98Webhdsto5ds_8_tfstphdr_sel = AV28TFStpHdr_Sel ;
      AV99Webhdsto5ds_9_tfstpclicod = AV49TFStpClicod ;
      AV100Webhdsto5ds_10_tfstpclicod_to = AV50TFStpClicod_To ;
      AV101Webhdsto5ds_11_tfstpclinom = AV51TFStpCliNom ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV103Webhdsto5ds_13_tfstpbarser = AV53TFStpBarser ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV107Webhdsto5ds_17_tfstpcolor = AV57TFStpColor ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = AV58TFStpColor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV48FilterFullText, AV30TFStp_Lin, AV31TFStp_Lin_To, AV33TFStp_Dia, AV38TFStp_Mot, AV39TFStp_Mot_Sel, AV27TFStpHdr, AV28TFStpHdr_Sel, AV49TFStpClicod, AV50TFStpClicod_To, AV51TFStpCliNom, AV52TFStpCliNom_Sel, AV53TFStpBarser, AV54TFStpBarser_Sel, AV55TFStpBarserDsc, AV56TFStpBarserDsc_Sel, AV57TFStpColor, AV58TFStpColor_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV91Webhdsto5ds_1_filterfulltext = AV48FilterFullText ;
      AV92Webhdsto5ds_2_tfstp_lin = AV30TFStp_Lin ;
      AV93Webhdsto5ds_3_tfstp_lin_to = AV31TFStp_Lin_To ;
      AV94Webhdsto5ds_4_tfstp_dia = AV33TFStp_Dia ;
      AV95Webhdsto5ds_5_tfstp_mot = AV38TFStp_Mot ;
      AV96Webhdsto5ds_6_tfstp_mot_sel = AV39TFStp_Mot_Sel ;
      AV97Webhdsto5ds_7_tfstphdr = AV27TFStpHdr ;
      AV98Webhdsto5ds_8_tfstphdr_sel = AV28TFStpHdr_Sel ;
      AV99Webhdsto5ds_9_tfstpclicod = AV49TFStpClicod ;
      AV100Webhdsto5ds_10_tfstpclicod_to = AV50TFStpClicod_To ;
      AV101Webhdsto5ds_11_tfstpclinom = AV51TFStpCliNom ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV103Webhdsto5ds_13_tfstpbarser = AV53TFStpBarser ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV107Webhdsto5ds_17_tfstpcolor = AV57TFStpColor ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = AV58TFStpColor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV48FilterFullText, AV30TFStp_Lin, AV31TFStp_Lin_To, AV33TFStp_Dia, AV38TFStp_Mot, AV39TFStp_Mot_Sel, AV27TFStpHdr, AV28TFStpHdr_Sel, AV49TFStpClicod, AV50TFStpClicod_To, AV51TFStpCliNom, AV52TFStpCliNom_Sel, AV53TFStpBarser, AV54TFStpBarser_Sel, AV55TFStpBarserDsc, AV56TFStpBarserDsc_Sel, AV57TFStpColor, AV58TFStpColor_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV91Webhdsto5ds_1_filterfulltext = AV48FilterFullText ;
      AV92Webhdsto5ds_2_tfstp_lin = AV30TFStp_Lin ;
      AV93Webhdsto5ds_3_tfstp_lin_to = AV31TFStp_Lin_To ;
      AV94Webhdsto5ds_4_tfstp_dia = AV33TFStp_Dia ;
      AV95Webhdsto5ds_5_tfstp_mot = AV38TFStp_Mot ;
      AV96Webhdsto5ds_6_tfstp_mot_sel = AV39TFStp_Mot_Sel ;
      AV97Webhdsto5ds_7_tfstphdr = AV27TFStpHdr ;
      AV98Webhdsto5ds_8_tfstphdr_sel = AV28TFStpHdr_Sel ;
      AV99Webhdsto5ds_9_tfstpclicod = AV49TFStpClicod ;
      AV100Webhdsto5ds_10_tfstpclicod_to = AV50TFStpClicod_To ;
      AV101Webhdsto5ds_11_tfstpclinom = AV51TFStpCliNom ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV103Webhdsto5ds_13_tfstpbarser = AV53TFStpBarser ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV107Webhdsto5ds_17_tfstpcolor = AV57TFStpColor ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = AV58TFStpColor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV48FilterFullText, AV30TFStp_Lin, AV31TFStp_Lin_To, AV33TFStp_Dia, AV38TFStp_Mot, AV39TFStp_Mot_Sel, AV27TFStpHdr, AV28TFStpHdr_Sel, AV49TFStpClicod, AV50TFStpClicod_To, AV51TFStpCliNom, AV52TFStpCliNom_Sel, AV53TFStpBarser, AV54TFStpBarser_Sel, AV55TFStpBarserDsc, AV56TFStpBarserDsc_Sel, AV57TFStpColor, AV58TFStpColor_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV91Webhdsto5ds_1_filterfulltext = AV48FilterFullText ;
      AV92Webhdsto5ds_2_tfstp_lin = AV30TFStp_Lin ;
      AV93Webhdsto5ds_3_tfstp_lin_to = AV31TFStp_Lin_To ;
      AV94Webhdsto5ds_4_tfstp_dia = AV33TFStp_Dia ;
      AV95Webhdsto5ds_5_tfstp_mot = AV38TFStp_Mot ;
      AV96Webhdsto5ds_6_tfstp_mot_sel = AV39TFStp_Mot_Sel ;
      AV97Webhdsto5ds_7_tfstphdr = AV27TFStpHdr ;
      AV98Webhdsto5ds_8_tfstphdr_sel = AV28TFStpHdr_Sel ;
      AV99Webhdsto5ds_9_tfstpclicod = AV49TFStpClicod ;
      AV100Webhdsto5ds_10_tfstpclicod_to = AV50TFStpClicod_To ;
      AV101Webhdsto5ds_11_tfstpclinom = AV51TFStpCliNom ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV103Webhdsto5ds_13_tfstpbarser = AV53TFStpBarser ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV107Webhdsto5ds_17_tfstpcolor = AV57TFStpColor ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = AV58TFStpColor_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV48FilterFullText, AV30TFStp_Lin, AV31TFStp_Lin_To, AV33TFStp_Dia, AV38TFStp_Mot, AV39TFStp_Mot_Sel, AV27TFStpHdr, AV28TFStpHdr_Sel, AV49TFStpClicod, AV50TFStpClicod_To, AV51TFStpCliNom, AV52TFStpCliNom_Sel, AV53TFStpBarser, AV54TFStpBarser_Sel, AV55TFStpBarserDsc, AV56TFStpBarserDsc_Sel, AV57TFStpColor, AV58TFStpColor_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV109Pgmname = "WebHDSTO5" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupJ00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e19J02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV44GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV48FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48FilterFullText", AV48FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_stp_diaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_STP_DIAAUXDATE");
            GX_FocusControl = edtavDdo_stp_diaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35DDO_Stp_DiaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35DDO_Stp_DiaAuxDate", localUtil.format(AV35DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         else
         {
            AV35DDO_Stp_DiaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_stp_diaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35DDO_Stp_DiaAuxDate", localUtil.format(AV35DDO_Stp_DiaAuxDate, "99/99/99"));
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
      e19J02 ();
      if (returnInSub) return;
   }

   public void e19J02( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV47station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webhdsto5_impl.this.GXt_char1 = GXv_char2[0] ;
      AV47station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47station", AV47station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV87EmprNom ;
      GXv_char4[0] = AV46usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV47station, GXv_char2, GXv_char3, GXv_char4) ;
      webhdsto5_impl.this.A396EmprCod = GXv_char2[0] ;
      webhdsto5_impl.this.AV87EmprNom = GXv_char3[0] ;
      webhdsto5_impl.this.AV46usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV46usurcod", AV46usurcod);
      GXt_char1 = AV47station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webhdsto5_impl.this.GXt_char1 = GXv_char4[0] ;
      AV47station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47station", AV47station);
      GXv_char4[0] = AV90Emprcod ;
      GXv_char3[0] = AV87EmprNom ;
      GXv_char2[0] = AV46usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV47station, GXv_char4, GXv_char3, GXv_char2) ;
      webhdsto5_impl.this.AV90Emprcod = GXv_char4[0] ;
      webhdsto5_impl.this.AV87EmprNom = GXv_char3[0] ;
      webhdsto5_impl.this.AV46usurcod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46usurcod", AV46usurcod);
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
      Form.setCaption( httpContext.getMessage( "Activacion HDR", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e20J02( )
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
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("WebHDSTO5ColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("WebHDSTO5ColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtStp_Lin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Lin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Lin_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStp_Dia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Dia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Dia_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStp_Mot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStp_Mot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStp_Mot_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStpHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStpHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpHdr_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStpClicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStpClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpClicod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStpCliNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStpCliNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpCliNom_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStpBarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStpBarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpBarser_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStpBarserD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStpBarserD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpBarserD_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtStpColor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtStpColor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtStpColor_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV43GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridCurrentPage), 10, 0));
      AV44GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridPageCount), 10, 0));
      AV91Webhdsto5ds_1_filterfulltext = AV48FilterFullText ;
      AV92Webhdsto5ds_2_tfstp_lin = AV30TFStp_Lin ;
      AV93Webhdsto5ds_3_tfstp_lin_to = AV31TFStp_Lin_To ;
      AV94Webhdsto5ds_4_tfstp_dia = AV33TFStp_Dia ;
      AV95Webhdsto5ds_5_tfstp_mot = AV38TFStp_Mot ;
      AV96Webhdsto5ds_6_tfstp_mot_sel = AV39TFStp_Mot_Sel ;
      AV97Webhdsto5ds_7_tfstphdr = AV27TFStpHdr ;
      AV98Webhdsto5ds_8_tfstphdr_sel = AV28TFStpHdr_Sel ;
      AV99Webhdsto5ds_9_tfstpclicod = AV49TFStpClicod ;
      AV100Webhdsto5ds_10_tfstpclicod_to = AV50TFStpClicod_To ;
      AV101Webhdsto5ds_11_tfstpclinom = AV51TFStpCliNom ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = AV52TFStpCliNom_Sel ;
      AV103Webhdsto5ds_13_tfstpbarser = AV53TFStpBarser ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = AV54TFStpBarser_Sel ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = AV55TFStpBarserDsc ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = AV56TFStpBarserDsc_Sel ;
      AV107Webhdsto5ds_17_tfstpcolor = AV57TFStpColor ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = AV58TFStpColor_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12J02( )
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
         AV42PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV42PageToGo) ;
      }
   }

   public void e13J02( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e14J02( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Lin") == 0 )
         {
            AV30TFStp_Lin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFStp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFStp_Lin), 4, 0));
            AV31TFStp_Lin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFStp_Lin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFStp_Lin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Dia") == 0 )
         {
            AV33TFStp_Dia = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFStp_Dia", localUtil.ttoc( AV33TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Stp_Mot") == 0 )
         {
            AV38TFStp_Mot = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFStp_Mot", AV38TFStp_Mot);
            AV39TFStp_Mot_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFStp_Mot_Sel", AV39TFStp_Mot_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpHdr") == 0 )
         {
            AV27TFStpHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFStpHdr", AV27TFStpHdr);
            AV28TFStpHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFStpHdr_Sel", AV28TFStpHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpClicod") == 0 )
         {
            AV49TFStpClicod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFStpClicod), 6, 0));
            AV50TFStpClicod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFStpClicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpCliNom") == 0 )
         {
            AV51TFStpCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFStpCliNom", AV51TFStpCliNom);
            AV52TFStpCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFStpCliNom_Sel", AV52TFStpCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpBarser") == 0 )
         {
            AV53TFStpBarser = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFStpBarser", AV53TFStpBarser);
            AV54TFStpBarser_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFStpBarser_Sel", AV54TFStpBarser_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpBarserDsc") == 0 )
         {
            AV55TFStpBarserDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFStpBarserDsc", AV55TFStpBarserDsc);
            AV56TFStpBarserDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFStpBarserDsc_Sel", AV56TFStpBarserDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "StpColor") == 0 )
         {
            AV57TFStpColor = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFStpColor", AV57TFStpColor);
            AV58TFStpColor_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFStpColor_Sel", AV58TFStpColor_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e21J02( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavAcciones.removeAllItems();
      cmbavAcciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavAcciones.addItem("1", httpContext.getMessage( "Activar", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV60Acciones, 4, 0)) );
   }

   public void e15J02( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebHDSTO5ColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e11J02( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WebHDSTO5Filters")),GXutil.URLEncode(GXutil.rtrim(AV109Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WebHDSTO5Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WebHDSTO5Filters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webhdsto5_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV109Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e22J02( )
   {
      /* Acciones_Click Routine */
      returnInSub = false ;
      if ( AV60Acciones == 1 )
      {
         /* Execute user subroutine: 'DO ACTIVAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV60Acciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Acciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV60Acciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAcciones.getInternalname(), "Values", cmbavAcciones.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e16J02( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.webhdsto5export(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webhdsto5_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      webhdsto5_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e17J02( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.webhdsto5exportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e18J02( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webhdsto5exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Lin", "", "#", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Dia", "", "Dia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Stp_Mot", "", "Motivo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
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
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebHDSTO5ColumnsSelector", GXv_char4) ;
      webhdsto5_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WebHDSTO5Filters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV48FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48FilterFullText", AV48FilterFullText);
      AV30TFStp_Lin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFStp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFStp_Lin), 4, 0));
      AV31TFStp_Lin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFStp_Lin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFStp_Lin_To), 4, 0));
      AV33TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFStp_Dia", localUtil.ttoc( AV33TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV38TFStp_Mot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFStp_Mot", AV38TFStp_Mot);
      AV39TFStp_Mot_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFStp_Mot_Sel", AV39TFStp_Mot_Sel);
      AV27TFStpHdr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFStpHdr", AV27TFStpHdr);
      AV28TFStpHdr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFStpHdr_Sel", AV28TFStpHdr_Sel);
      AV49TFStpClicod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFStpClicod), 6, 0));
      AV50TFStpClicod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFStpClicod_To), 6, 0));
      AV51TFStpCliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFStpCliNom", AV51TFStpCliNom);
      AV52TFStpCliNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFStpCliNom_Sel", AV52TFStpCliNom_Sel);
      AV53TFStpBarser = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFStpBarser", AV53TFStpBarser);
      AV54TFStpBarser_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFStpBarser_Sel", AV54TFStpBarser_Sel);
      AV55TFStpBarserDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFStpBarserDsc", AV55TFStpBarserDsc);
      AV56TFStpBarserDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFStpBarserDsc_Sel", AV56TFStpBarserDsc_Sel);
      AV57TFStpColor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFStpColor", AV57TFStpColor);
      AV58TFStpColor_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TFStpColor_Sel", AV58TFStpColor_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ACTIVAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webhdsto4", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A10746Stp_hdr,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A10747Stp_r,1,0)),GXutil.URLEncode(GXutil.rtrim(A10748Stp_p)),GXutil.URLEncode(GXutil.rtrim(AV46usurcod)),GXutil.URLEncode(GXutil.rtrim(AV47station))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","UsurCod","Station"}) , new Object[] {"A396EmprCod","A10746Stp_hdr","A10747Stp_r","A10748Stp_p","AV46usurcod","AV47station"});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV109Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV109Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV109Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
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
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV48FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48FilterFullText", AV48FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_LIN") == 0 )
         {
            AV30TFStp_Lin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFStp_Lin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFStp_Lin), 4, 0));
            AV31TFStp_Lin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFStp_Lin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TFStp_Lin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_DIA") == 0 )
         {
            AV33TFStp_Dia = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFStp_Dia", localUtil.ttoc( AV33TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV35DDO_Stp_DiaAuxDate = GXutil.resetTime(AV33TFStp_Dia) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35DDO_Stp_DiaAuxDate", localUtil.format(AV35DDO_Stp_DiaAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT") == 0 )
         {
            AV38TFStp_Mot = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFStp_Mot", AV38TFStp_Mot);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTP_MOT_SEL") == 0 )
         {
            AV39TFStp_Mot_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFStp_Mot_Sel", AV39TFStp_Mot_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR") == 0 )
         {
            AV27TFStpHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFStpHdr", AV27TFStpHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPHDR_SEL") == 0 )
         {
            AV28TFStpHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFStpHdr_Sel", AV28TFStpHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLICOD") == 0 )
         {
            AV49TFStpClicod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFStpClicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFStpClicod), 6, 0));
            AV50TFStpClicod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFStpClicod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFStpClicod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM") == 0 )
         {
            AV51TFStpCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFStpCliNom", AV51TFStpCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCLINOM_SEL") == 0 )
         {
            AV52TFStpCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFStpCliNom_Sel", AV52TFStpCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER") == 0 )
         {
            AV53TFStpBarser = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFStpBarser", AV53TFStpBarser);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSER_SEL") == 0 )
         {
            AV54TFStpBarser_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFStpBarser_Sel", AV54TFStpBarser_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC") == 0 )
         {
            AV55TFStpBarserDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFStpBarserDsc", AV55TFStpBarserDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPBARSERDSC_SEL") == 0 )
         {
            AV56TFStpBarserDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFStpBarserDsc_Sel", AV56TFStpBarserDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR") == 0 )
         {
            AV57TFStpColor = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFStpColor", AV57TFStpColor);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSTPCOLOR_SEL") == 0 )
         {
            AV58TFStpColor_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFStpColor_Sel", AV58TFStpColor_Sel);
         }
         AV110GXV1 = (int)(AV110GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFStp_Mot_Sel)==0), AV39TFStp_Mot_Sel, GXv_char4) ;
      webhdsto5_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFStpHdr_Sel)==0), AV28TFStpHdr_Sel, GXv_char3) ;
      webhdsto5_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFStpCliNom_Sel)==0), AV52TFStpCliNom_Sel, GXv_char2) ;
      webhdsto5_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFStpBarser_Sel)==0), AV54TFStpBarser_Sel, GXv_char15) ;
      webhdsto5_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFStpBarserDsc_Sel)==0), AV56TFStpBarserDsc_Sel, GXv_char17) ;
      webhdsto5_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFStpColor_Sel)==0), AV58TFStpColor_Sel, GXv_char19) ;
      webhdsto5_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char12+"||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"|"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFStp_Mot)==0), AV38TFStp_Mot, GXv_char19) ;
      webhdsto5_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFStpHdr)==0), AV27TFStpHdr, GXv_char17) ;
      webhdsto5_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFStpCliNom)==0), AV51TFStpCliNom, GXv_char15) ;
      webhdsto5_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFStpBarser)==0), AV53TFStpBarser, GXv_char4) ;
      webhdsto5_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFStpBarserDsc)==0), AV55TFStpBarserDsc, GXv_char3) ;
      webhdsto5_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFStpColor)==0), AV57TFStpColor, GXv_char2) ;
      webhdsto5_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV30TFStp_Lin) ? "" : GXutil.str( AV30TFStp_Lin, 4, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV33TFStp_Dia) ? "" : localUtil.dtoc( AV35DDO_Stp_DiaAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV49TFStpClicod) ? "" : GXutil.str( AV49TFStpClicod, 6, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV31TFStp_Lin_To) ? "" : GXutil.str( AV31TFStp_Lin_To, 4, 0))+"||||"+((0==AV50TFStpClicod_To) ? "" : GXutil.str( AV50TFStpClicod_To, 6, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV109Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV48FilterFullText)==0), (short)(0), AV48FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTP_LIN", "", !((0==AV30TFStp_Lin)&&(0==AV31TFStp_Lin_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFStp_Lin, 4, 0)), GXutil.trim( GXutil.str( AV31TFStp_Lin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTP_DIA", "", !GXutil.dateCompare(GXutil.nullDate(), AV33TFStp_Dia), (short)(0), GXutil.trim( localUtil.ttoc( AV33TFStp_Dia, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTP_MOT", "", !(GXutil.strcmp("", AV38TFStp_Mot)==0), (short)(0), AV38TFStp_Mot, "", !(GXutil.strcmp("", AV39TFStp_Mot_Sel)==0), AV39TFStp_Mot_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPHDR", "", !(GXutil.strcmp("", AV27TFStpHdr)==0), (short)(0), AV27TFStpHdr, "", !(GXutil.strcmp("", AV28TFStpHdr_Sel)==0), AV28TFStpHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPCLICOD", "", !((0==AV49TFStpClicod)&&(0==AV50TFStpClicod_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFStpClicod, 6, 0)), GXutil.trim( GXutil.str( AV50TFStpClicod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPCLINOM", "", !(GXutil.strcmp("", AV51TFStpCliNom)==0), (short)(0), AV51TFStpCliNom, "", !(GXutil.strcmp("", AV52TFStpCliNom_Sel)==0), AV52TFStpCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPBARSER", "", !(GXutil.strcmp("", AV53TFStpBarser)==0), (short)(0), AV53TFStpBarser, "", !(GXutil.strcmp("", AV54TFStpBarser_Sel)==0), AV54TFStpBarser_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPBARSERDSC", "", !(GXutil.strcmp("", AV55TFStpBarserDsc)==0), (short)(0), AV55TFStpBarserDsc, "", !(GXutil.strcmp("", AV56TFStpBarserDsc_Sel)==0), AV56TFStpBarserDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFSTPCOLOR", "", !(GXutil.strcmp("", AV57TFStpColor)==0), (short)(0), AV57TFStpColor, "", !(GXutil.strcmp("", AV58TFStpColor_Sel)==0), AV58TFStpColor_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV109Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV109Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HDSTO1" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_J02( boolean wbgen )
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
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_J02( true) ;
      }
      else
      {
         wb_table2_30_J02( false) ;
      }
      return  ;
   }

   public void wb_table2_30_J02e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_J02e( true) ;
      }
      else
      {
         wb_table1_25_J02e( false) ;
      }
   }

   public void wb_table2_30_J02( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV48FilterFullText, GXutil.rtrim( localUtil.format( AV48FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WebHDSTO5.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_J02e( true) ;
      }
      else
      {
         wb_table2_30_J02e( false) ;
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
      paJ02( ) ;
      wsJ02( ) ;
      weJ02( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116122360", true, true);
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
      httpContext.AddJavascriptSource("webhdsto5.js", "?202682116122361", false, true);
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
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      cmbavAcciones.setInternalname( "vACCIONES_"+sGXsfl_43_idx );
      edtStp_Lin_Internalname = "STP_LIN_"+sGXsfl_43_idx ;
      edtStp_Dia_Internalname = "STP_DIA_"+sGXsfl_43_idx ;
      edtStp_Mot_Internalname = "STP_MOT_"+sGXsfl_43_idx ;
      edtStp_hdr_Internalname = "STP_HDR_"+sGXsfl_43_idx ;
      edtStp_r_Internalname = "STP_R_"+sGXsfl_43_idx ;
      edtStp_p_Internalname = "STP_P_"+sGXsfl_43_idx ;
      edtStpHdr_Internalname = "STPHDR_"+sGXsfl_43_idx ;
      edtStpClicod_Internalname = "STPCLICOD_"+sGXsfl_43_idx ;
      edtStpCliNom_Internalname = "STPCLINOM_"+sGXsfl_43_idx ;
      edtStpBarser_Internalname = "STPBARSER_"+sGXsfl_43_idx ;
      edtStpBarserD_Internalname = "STPBARSERD_"+sGXsfl_43_idx ;
      edtStpColor_Internalname = "STPCOLOR_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      cmbavAcciones.setInternalname( "vACCIONES_"+sGXsfl_43_fel_idx );
      edtStp_Lin_Internalname = "STP_LIN_"+sGXsfl_43_fel_idx ;
      edtStp_Dia_Internalname = "STP_DIA_"+sGXsfl_43_fel_idx ;
      edtStp_Mot_Internalname = "STP_MOT_"+sGXsfl_43_fel_idx ;
      edtStp_hdr_Internalname = "STP_HDR_"+sGXsfl_43_fel_idx ;
      edtStp_r_Internalname = "STP_R_"+sGXsfl_43_fel_idx ;
      edtStp_p_Internalname = "STP_P_"+sGXsfl_43_fel_idx ;
      edtStpHdr_Internalname = "STPHDR_"+sGXsfl_43_fel_idx ;
      edtStpClicod_Internalname = "STPCLICOD_"+sGXsfl_43_fel_idx ;
      edtStpCliNom_Internalname = "STPCLINOM_"+sGXsfl_43_fel_idx ;
      edtStpBarser_Internalname = "STPBARSER_"+sGXsfl_43_fel_idx ;
      edtStpBarserD_Internalname = "STPBARSERD_"+sGXsfl_43_fel_idx ;
      edtStpColor_Internalname = "STPCOLOR_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wbJ00( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAcciones.getEnabled()!=0)&&(cmbavAcciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         if ( ( cmbavAcciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONES_" + sGXsfl_43_idx ;
            cmbavAcciones.setName( GXCCtl );
            cmbavAcciones.setWebtags( "" );
            if ( cmbavAcciones.getItemCount() > 0 )
            {
               AV60Acciones = (short)(GXutil.lval( cmbavAcciones.getValidValue(GXutil.trim( GXutil.str( AV60Acciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Acciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAcciones,cmbavAcciones.getInternalname(),GXutil.trim( GXutil.str( AV60Acciones, 4, 0)),Integer.valueOf(1),cmbavAcciones.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVACCIONES.CLICK."+sGXsfl_43_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAcciones.getEnabled()!=0)&&(cmbavAcciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV60Acciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAcciones.getInternalname(), "Values", cmbavAcciones.ToJavascriptSource(), !bGXsfl_43_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStp_Lin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Lin_Internalname,GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10750Stp_Lin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Lin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStp_Lin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStp_Dia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Dia_Internalname,localUtil.ttoc( A10751Stp_Dia, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10751Stp_Dia, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtStp_Dia_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStp_Mot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_Mot_Internalname,A10752Stp_Mot,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_Mot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStp_Mot_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(300),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_hdr_Internalname,GXutil.ltrim( localUtil.ntoc( A10746Stp_hdr, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10746Stp_hdr), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_r_Internalname,GXutil.ltrim( localUtil.ntoc( A10747Stp_r, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10747Stp_r), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_r_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStp_p_Internalname,GXutil.rtrim( A10748Stp_p),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStp_p_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpHdr_Internalname,GXutil.rtrim( A13723StpHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStpHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtStpHdr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtStpClicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpClicod_Internalname,GXutil.ltrim( localUtil.ntoc( A13726StpClicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13726StpClicod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStpClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpClicod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpCliNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpCliNom_Internalname,GXutil.rtrim( A13727StpCliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStpCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpCliNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpBarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpBarser_Internalname,GXutil.rtrim( A13724StpBarser),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStpBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpBarser_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpBarserD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpBarserD_Internalname,GXutil.rtrim( A13725StpBarserD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStpBarserD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpBarserD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtStpColor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtStpColor_Internalname,GXutil.rtrim( A13728StpColor),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtStpColor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtStpColor_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesJ02( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV60Acciones, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10750Stp_Lin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtStp_Lin_Visible, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10746Stp_hdr, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10747Stp_r, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10748Stp_p));
         GridContainer.AddColumnProperties(GridColumn);
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
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavAcciones.setInternalname( "vACCIONES" );
      edtStp_Lin_Internalname = "STP_LIN" ;
      edtStp_Dia_Internalname = "STP_DIA" ;
      edtStp_Mot_Internalname = "STP_MOT" ;
      edtStp_hdr_Internalname = "STP_HDR" ;
      edtStp_r_Internalname = "STP_R" ;
      edtStp_p_Internalname = "STP_P" ;
      edtStpHdr_Internalname = "STPHDR" ;
      edtStpClicod_Internalname = "STPCLICOD" ;
      edtStpCliNom_Internalname = "STPCLINOM" ;
      edtStpBarser_Internalname = "STPBARSER" ;
      edtStpBarserD_Internalname = "STPBARSERD" ;
      edtStpColor_Internalname = "STPCOLOR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_stp_diaauxdate_Internalname = "vDDO_STP_DIAAUXDATE" ;
      divDdo_stp_diaauxdates_Internalname = "DDO_STP_DIAAUXDATES" ;
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
      edtStpColor_Jsonclick = "" ;
      edtStpBarserD_Jsonclick = "" ;
      edtStpBarser_Jsonclick = "" ;
      edtStpCliNom_Jsonclick = "" ;
      edtStpClicod_Jsonclick = "" ;
      edtStpHdr_Jsonclick = "" ;
      edtStp_p_Jsonclick = "" ;
      edtStp_r_Jsonclick = "" ;
      edtStp_hdr_Jsonclick = "" ;
      edtStp_Mot_Jsonclick = "" ;
      edtStp_Dia_Jsonclick = "" ;
      edtStp_Lin_Jsonclick = "" ;
      cmbavAcciones.setJsonclick( "" );
      cmbavAcciones.setVisible( -1 );
      cmbavAcciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
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
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "WebHDSTO5GetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T||T|T|T|T" ;
      Ddo_grid_Filterisrange = "T||||T||||" ;
      Ddo_grid_Filtertype = "Numeric|Date|Character|Character|Numeric|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T||||||" ;
      Ddo_grid_Columnssortvalues = "2|1|3||||||" ;
      Ddo_grid_Columnids = "1:Stp_Lin|2:Stp_Dia|3:Stp_Mot|7:StpHdr|8:StpClicod|9:StpCliNom|10:StpBarser|11:StpBarserDsc|12:StpColor" ;
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
      Form.setCaption( httpContext.getMessage( "Activacion HDR", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vACCIONES_" + sGXsfl_43_idx ;
      cmbavAcciones.setName( GXCCtl );
      cmbavAcciones.setWebtags( "" );
      if ( cmbavAcciones.getItemCount() > 0 )
      {
         AV60Acciones = (short)(GXutil.lval( cmbavAcciones.getValidValue(GXutil.trim( GXutil.str( AV60Acciones, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60Acciones), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e12J02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e13J02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e14J02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e21J02',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavAcciones'},{av:'AV60Acciones',fld:'vACCIONES',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e15J02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11J02',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VACCIONES.CLICK","{handler:'e22J02',iparms:[{av:'cmbavAcciones'},{av:'AV60Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A10746Stp_hdr',fld:'STP_HDR',pic:'ZZZZZZZ9'},{av:'A10747Stp_r',fld:'STP_R',pic:'9'},{av:'A10748Stp_p',fld:'STP_P',pic:''},{av:'AV46usurcod',fld:'vUSURCOD',pic:'@!'},{av:'AV47station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VACCIONES.CLICK",",oparms:[{av:'cmbavAcciones'},{av:'AV60Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'AV47station',fld:'vSTATION',pic:''},{av:'AV46usurcod',fld:'vUSURCOD',pic:'@!'},{av:'A10748Stp_p',fld:'STP_P',pic:''},{av:'A10747Stp_r',fld:'STP_R',pic:'9'},{av:'A10746Stp_hdr',fld:'STP_HDR',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtStp_Lin_Visible',ctrl:'STP_LIN',prop:'Visible'},{av:'edtStp_Dia_Visible',ctrl:'STP_DIA',prop:'Visible'},{av:'edtStp_Mot_Visible',ctrl:'STP_MOT',prop:'Visible'},{av:'edtStpHdr_Visible',ctrl:'STPHDR',prop:'Visible'},{av:'edtStpClicod_Visible',ctrl:'STPCLICOD',prop:'Visible'},{av:'edtStpCliNom_Visible',ctrl:'STPCLINOM',prop:'Visible'},{av:'edtStpBarser_Visible',ctrl:'STPBARSER',prop:'Visible'},{av:'edtStpBarserD_Visible',ctrl:'STPBARSERD',prop:'Visible'},{av:'edtStpColor_Visible',ctrl:'STPCOLOR',prop:'Visible'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16J02',iparms:[{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e17J02',iparms:[{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18J02',iparms:[{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV48FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV30TFStp_Lin',fld:'vTFSTP_LIN',pic:'ZZZ9'},{av:'AV31TFStp_Lin_To',fld:'vTFSTP_LIN_TO',pic:'ZZZ9'},{av:'AV33TFStp_Dia',fld:'vTFSTP_DIA',pic:'99/99/99 99:99'},{av:'AV38TFStp_Mot',fld:'vTFSTP_MOT',pic:''},{av:'AV39TFStp_Mot_Sel',fld:'vTFSTP_MOT_SEL',pic:''},{av:'AV27TFStpHdr',fld:'vTFSTPHDR',pic:''},{av:'AV28TFStpHdr_Sel',fld:'vTFSTPHDR_SEL',pic:''},{av:'AV49TFStpClicod',fld:'vTFSTPCLICOD',pic:'ZZZZZ9'},{av:'AV50TFStpClicod_To',fld:'vTFSTPCLICOD_TO',pic:'ZZZZZ9'},{av:'AV51TFStpCliNom',fld:'vTFSTPCLINOM',pic:''},{av:'AV52TFStpCliNom_Sel',fld:'vTFSTPCLINOM_SEL',pic:''},{av:'AV53TFStpBarser',fld:'vTFSTPBARSER',pic:''},{av:'AV54TFStpBarser_Sel',fld:'vTFSTPBARSER_SEL',pic:''},{av:'AV55TFStpBarserDsc',fld:'vTFSTPBARSERDSC',pic:''},{av:'AV56TFStpBarserDsc_Sel',fld:'vTFSTPBARSERDSC_SEL',pic:''},{av:'AV57TFStpColor',fld:'vTFSTPCOLOR',pic:''},{av:'AV58TFStpColor_Sel',fld:'vTFSTPCOLOR_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV35DDO_Stp_DiaAuxDate',fld:'vDDO_STP_DIAAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_STP_HDR","{handler:'valid_Stp_hdr',iparms:[]");
      setEventMetadata("VALID_STP_HDR",",oparms:[]}");
      setEventMetadata("VALID_STP_R","{handler:'valid_Stp_r',iparms:[]");
      setEventMetadata("VALID_STP_R",",oparms:[]}");
      setEventMetadata("VALID_STP_P","{handler:'valid_Stp_p',iparms:[]");
      setEventMetadata("VALID_STP_P",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Stpcolor',iparms:[]");
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
      A396EmprCod = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV48FilterFullText = "" ;
      AV33TFStp_Dia = GXutil.resetTime( GXutil.nullDate() );
      AV38TFStp_Mot = "" ;
      AV39TFStp_Mot_Sel = "" ;
      AV27TFStpHdr = "" ;
      AV28TFStpHdr_Sel = "" ;
      AV51TFStpCliNom = "" ;
      AV52TFStpCliNom_Sel = "" ;
      AV53TFStpBarser = "" ;
      AV54TFStpBarser_Sel = "" ;
      AV55TFStpBarserDsc = "" ;
      AV56TFStpBarserDsc_Sel = "" ;
      AV57TFStpColor = "" ;
      AV58TFStpColor_Sel = "" ;
      AV109Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV46usurcod = "" ;
      AV47station = "" ;
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
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV35DDO_Stp_DiaAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A10751Stp_Dia = GXutil.resetTime( GXutil.nullDate() );
      A10752Stp_Mot = "" ;
      A10748Stp_p = "" ;
      A13723StpHdr = "" ;
      A13727StpCliNom = "" ;
      A13724StpBarser = "" ;
      A13725StpBarserD = "" ;
      A13728StpColor = "" ;
      scmdbuf = "" ;
      lV91Webhdsto5ds_1_filterfulltext = "" ;
      lV101Webhdsto5ds_11_tfstpclinom = "" ;
      lV103Webhdsto5ds_13_tfstpbarser = "" ;
      lV105Webhdsto5ds_15_tfstpbarserdsc = "" ;
      lV107Webhdsto5ds_17_tfstpcolor = "" ;
      lV95Webhdsto5ds_5_tfstp_mot = "" ;
      lV97Webhdsto5ds_7_tfstphdr = "" ;
      AV94Webhdsto5ds_4_tfstp_dia = GXutil.resetTime( GXutil.nullDate() );
      AV96Webhdsto5ds_6_tfstp_mot_sel = "" ;
      AV95Webhdsto5ds_5_tfstp_mot = "" ;
      AV98Webhdsto5ds_8_tfstphdr_sel = "" ;
      AV97Webhdsto5ds_7_tfstphdr = "" ;
      AV91Webhdsto5ds_1_filterfulltext = "" ;
      AV102Webhdsto5ds_12_tfstpclinom_sel = "" ;
      AV101Webhdsto5ds_11_tfstpclinom = "" ;
      AV104Webhdsto5ds_14_tfstpbarser_sel = "" ;
      AV103Webhdsto5ds_13_tfstpbarser = "" ;
      AV106Webhdsto5ds_16_tfstpbarserdsc_sel = "" ;
      AV105Webhdsto5ds_15_tfstpbarserdsc = "" ;
      AV108Webhdsto5ds_18_tfstpcolor_sel = "" ;
      AV107Webhdsto5ds_17_tfstpcolor = "" ;
      H00J03_A129BarCod = new int[1] ;
      H00J03_A132BarCodReo = new byte[1] ;
      H00J03_A130BarCodPar = new String[] {""} ;
      H00J03_A396EmprCod = new String[] {""} ;
      H00J03_A10755Stp_Est = new byte[1] ;
      H00J03_A13723StpHdr = new String[] {""} ;
      H00J03_A10752Stp_Mot = new String[] {""} ;
      H00J03_A10751Stp_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H00J03_A10750Stp_Lin = new short[1] ;
      H00J03_A13728StpColor = new String[] {""} ;
      H00J03_n13728StpColor = new boolean[] {false} ;
      H00J03_A13725StpBarserD = new String[] {""} ;
      H00J03_n13725StpBarserD = new boolean[] {false} ;
      H00J03_A13724StpBarser = new String[] {""} ;
      H00J03_n13724StpBarser = new boolean[] {false} ;
      H00J03_A13727StpCliNom = new String[] {""} ;
      H00J03_n13727StpCliNom = new boolean[] {false} ;
      H00J03_A13726StpClicod = new int[1] ;
      H00J03_n13726StpClicod = new boolean[] {false} ;
      H00J03_A10746Stp_hdr = new int[1] ;
      H00J03_A10747Stp_r = new byte[1] ;
      H00J03_A10748Stp_p = new String[] {""} ;
      H00J05_AGRID_nRecordCount = new long[1] ;
      AV87EmprNom = "" ;
      AV90Emprcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
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
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webhdsto5__default(),
         new Object[] {
             new Object[] {
            H00J03_A129BarCod, H00J03_A132BarCodReo, H00J03_A130BarCodPar, H00J03_A396EmprCod, H00J03_A10755Stp_Est, H00J03_A13723StpHdr, H00J03_A10752Stp_Mot, H00J03_A10751Stp_Dia, H00J03_A10750Stp_Lin, H00J03_A13728StpColor,
            H00J03_n13728StpColor, H00J03_A13725StpBarserD, H00J03_n13725StpBarserD, H00J03_A13724StpBarser, H00J03_n13724StpBarser, H00J03_A13727StpCliNom, H00J03_n13727StpCliNom, H00J03_A13726StpClicod, H00J03_n13726StpClicod, H00J03_A10746Stp_hdr,
            H00J03_A10747Stp_r, H00J03_A10748Stp_p
            }
            , new Object[] {
            H00J05_AGRID_nRecordCount
            }
         }
      );
      AV109Pgmname = "WebHDSTO5" ;
      /* GeneXus formulas. */
      AV109Pgmname = "WebHDSTO5" ;
      Gx_err = (short)(0) ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A10747Stp_r ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte A10755Stp_Est ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV30TFStp_Lin ;
   private short AV31TFStp_Lin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV60Acciones ;
   private short A10750Stp_Lin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV92Webhdsto5ds_2_tfstp_lin ;
   private short AV93Webhdsto5ds_3_tfstp_lin_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int nGXsfl_43_idx=1 ;
   private int AV49TFStpClicod ;
   private int AV50TFStpClicod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A10746Stp_hdr ;
   private int A13726StpClicod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV99Webhdsto5ds_9_tfstpclicod ;
   private int AV100Webhdsto5ds_10_tfstpclicod_to ;
   private int edtStp_Lin_Visible ;
   private int edtStp_Dia_Visible ;
   private int edtStp_Mot_Visible ;
   private int edtStpHdr_Visible ;
   private int edtStpClicod_Visible ;
   private int edtStpCliNom_Visible ;
   private int edtStpBarser_Visible ;
   private int edtStpBarserD_Visible ;
   private int edtStpColor_Visible ;
   private int AV42PageToGo ;
   private int AV110GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV43GridCurrentPage ;
   private long AV44GridPageCount ;
   private long GRID_nCurrentRecord ;
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
   private String sGXsfl_43_idx="0001" ;
   private String A396EmprCod ;
   private String AV27TFStpHdr ;
   private String AV28TFStpHdr_Sel ;
   private String AV51TFStpCliNom ;
   private String AV52TFStpCliNom_Sel ;
   private String AV53TFStpBarser ;
   private String AV54TFStpBarser_Sel ;
   private String AV55TFStpBarserDsc ;
   private String AV56TFStpBarserDsc_Sel ;
   private String AV57TFStpColor ;
   private String AV58TFStpColor_Sel ;
   private String AV109Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV46usurcod ;
   private String AV47station ;
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
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_stp_diaauxdates_Internalname ;
   private String edtavDdo_stp_diaauxdate_Internalname ;
   private String edtavDdo_stp_diaauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtStp_Lin_Internalname ;
   private String edtStp_Dia_Internalname ;
   private String edtStp_Mot_Internalname ;
   private String edtStp_hdr_Internalname ;
   private String edtStp_r_Internalname ;
   private String A10748Stp_p ;
   private String edtStp_p_Internalname ;
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
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV101Webhdsto5ds_11_tfstpclinom ;
   private String lV103Webhdsto5ds_13_tfstpbarser ;
   private String lV105Webhdsto5ds_15_tfstpbarserdsc ;
   private String lV107Webhdsto5ds_17_tfstpcolor ;
   private String lV97Webhdsto5ds_7_tfstphdr ;
   private String AV98Webhdsto5ds_8_tfstphdr_sel ;
   private String AV97Webhdsto5ds_7_tfstphdr ;
   private String AV102Webhdsto5ds_12_tfstpclinom_sel ;
   private String AV101Webhdsto5ds_11_tfstpclinom ;
   private String AV104Webhdsto5ds_14_tfstpbarser_sel ;
   private String AV103Webhdsto5ds_13_tfstpbarser ;
   private String AV106Webhdsto5ds_16_tfstpbarserdsc_sel ;
   private String AV105Webhdsto5ds_15_tfstpbarserdsc ;
   private String AV108Webhdsto5ds_18_tfstpcolor_sel ;
   private String AV107Webhdsto5ds_17_tfstpcolor ;
   private String AV87EmprNom ;
   private String AV90Emprcod ;
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
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtStp_Lin_Jsonclick ;
   private String edtStp_Dia_Jsonclick ;
   private String edtStp_Mot_Jsonclick ;
   private String edtStp_hdr_Jsonclick ;
   private String edtStp_r_Jsonclick ;
   private String edtStp_p_Jsonclick ;
   private String edtStpHdr_Jsonclick ;
   private String edtStpClicod_Jsonclick ;
   private String edtStpCliNom_Jsonclick ;
   private String edtStpBarser_Jsonclick ;
   private String edtStpBarserD_Jsonclick ;
   private String edtStpColor_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV33TFStp_Dia ;
   private java.util.Date A10751Stp_Dia ;
   private java.util.Date AV94Webhdsto5ds_4_tfstp_dia ;
   private java.util.Date AV35DDO_Stp_DiaAuxDate ;
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
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV48FilterFullText ;
   private String AV38TFStp_Mot ;
   private String AV39TFStp_Mot_Sel ;
   private String A10752Stp_Mot ;
   private String lV91Webhdsto5ds_1_filterfulltext ;
   private String lV95Webhdsto5ds_5_tfstp_mot ;
   private String AV96Webhdsto5ds_6_tfstp_mot_sel ;
   private String AV95Webhdsto5ds_5_tfstp_mot ;
   private String AV91Webhdsto5ds_1_filterfulltext ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavAcciones ;
   private IDataStoreProvider pr_default ;
   private int[] H00J03_A129BarCod ;
   private byte[] H00J03_A132BarCodReo ;
   private String[] H00J03_A130BarCodPar ;
   private String[] H00J03_A396EmprCod ;
   private byte[] H00J03_A10755Stp_Est ;
   private String[] H00J03_A13723StpHdr ;
   private String[] H00J03_A10752Stp_Mot ;
   private java.util.Date[] H00J03_A10751Stp_Dia ;
   private short[] H00J03_A10750Stp_Lin ;
   private String[] H00J03_A13728StpColor ;
   private boolean[] H00J03_n13728StpColor ;
   private String[] H00J03_A13725StpBarserD ;
   private boolean[] H00J03_n13725StpBarserD ;
   private String[] H00J03_A13724StpBarser ;
   private boolean[] H00J03_n13724StpBarser ;
   private String[] H00J03_A13727StpCliNom ;
   private boolean[] H00J03_n13727StpCliNom ;
   private int[] H00J03_A13726StpClicod ;
   private boolean[] H00J03_n13726StpClicod ;
   private int[] H00J03_A10746Stp_hdr ;
   private byte[] H00J03_A10747Stp_r ;
   private String[] H00J03_A10748Stp_p ;
   private long[] H00J05_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class webhdsto5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00J03( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV92Webhdsto5ds_2_tfstp_lin ,
                                          short AV93Webhdsto5ds_3_tfstp_lin_to ,
                                          java.util.Date AV94Webhdsto5ds_4_tfstp_dia ,
                                          String AV96Webhdsto5ds_6_tfstp_mot_sel ,
                                          String AV95Webhdsto5ds_5_tfstp_mot ,
                                          String AV98Webhdsto5ds_8_tfstphdr_sel ,
                                          String AV97Webhdsto5ds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV91Webhdsto5ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV99Webhdsto5ds_9_tfstpclicod ,
                                          int AV100Webhdsto5ds_10_tfstpclicod_to ,
                                          String AV102Webhdsto5ds_12_tfstpclinom_sel ,
                                          String AV101Webhdsto5ds_11_tfstpclinom ,
                                          String AV104Webhdsto5ds_14_tfstpbarser_sel ,
                                          String AV103Webhdsto5ds_13_tfstpbarser ,
                                          String AV106Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                          String AV105Webhdsto5ds_15_tfstpbarserdsc ,
                                          String AV108Webhdsto5ds_18_tfstpcolor_sel ,
                                          String AV107Webhdsto5ds_17_tfstpcolor ,
                                          String A396EmprCod ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[46];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T3.BarCod, T3.BarCodReo, T3.BarCodPar, T1.EmprCod, T1.Stp_Est, RTRIM(LTRIM(SUBSTR(TO_CHAR(T2.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T2.Stp_r,'90')," ;
      sSelectString += " 2) || T2.Stp_p AS StpHdr, T1.Stp_Mot, T1.Stp_Dia, T1.Stp_Lin, COALESCE( T3.BarColNom, ' ') AS StpColor, COALESCE( T3.BarSerDsc, ' ') AS StpBarserD, COALESCE( T3.BarSer," ;
      sSelectString += " ' ') AS StpBarser, COALESCE( T4.StpCliNom, ' ') AS StpCliNom, COALESCE( T3.CliCod, 0) AS StpClicod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p" ;
      sFromString = " FROM (((TXPHDSTO1 T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p) LEFT JOIN TXPBARCAD" ;
      sFromString += " T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom AS StpCliNom, T5.EmprCod," ;
      sFromString += " T5.BarCod, T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod AND T6.CliCod = T5.CliCod)" ;
      sFromString += " INNER JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p ) T4 ON T4.EmprCod = T1.EmprCod" ;
      sFromString += " AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
      sOrderString = "" ;
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
      if ( ! (0==AV92Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int21[34] = (byte)(1) ;
      }
      if ( ! (0==AV93Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int21[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV94Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int21[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV95Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int21[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV97Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int21[40] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Stp_Dia" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Stp_Dia DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Stp_Lin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Stp_Lin DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Stp_Mot" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Stp_Mot DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Stp_hdr, T1.Stp_r, T1.Stp_p, T1.Stp_Lin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H00J05( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV92Webhdsto5ds_2_tfstp_lin ,
                                          short AV93Webhdsto5ds_3_tfstp_lin_to ,
                                          java.util.Date AV94Webhdsto5ds_4_tfstp_dia ,
                                          String AV96Webhdsto5ds_6_tfstp_mot_sel ,
                                          String AV95Webhdsto5ds_5_tfstp_mot ,
                                          String AV98Webhdsto5ds_8_tfstphdr_sel ,
                                          String AV97Webhdsto5ds_7_tfstphdr ,
                                          short A10750Stp_Lin ,
                                          java.util.Date A10751Stp_Dia ,
                                          String A10752Stp_Mot ,
                                          int A10746Stp_hdr ,
                                          byte A10747Stp_r ,
                                          String A10748Stp_p ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV91Webhdsto5ds_1_filterfulltext ,
                                          String A13723StpHdr ,
                                          int A13726StpClicod ,
                                          String A13727StpCliNom ,
                                          String A13724StpBarser ,
                                          String A13725StpBarserD ,
                                          String A13728StpColor ,
                                          int AV99Webhdsto5ds_9_tfstpclicod ,
                                          int AV100Webhdsto5ds_10_tfstpclicod_to ,
                                          String AV102Webhdsto5ds_12_tfstpclinom_sel ,
                                          String AV101Webhdsto5ds_11_tfstpclinom ,
                                          String AV104Webhdsto5ds_14_tfstpbarser_sel ,
                                          String AV103Webhdsto5ds_13_tfstpbarser ,
                                          String AV106Webhdsto5ds_16_tfstpbarserdsc_sel ,
                                          String AV105Webhdsto5ds_15_tfstpbarserdsc ,
                                          String AV108Webhdsto5ds_18_tfstpcolor_sel ,
                                          String AV107Webhdsto5ds_17_tfstpcolor ,
                                          String A396EmprCod ,
                                          byte A10755Stp_Est )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[41];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((TXPHDSTO1 T1 INNER JOIN TXPHDSTOP T2 ON T2.EmprCod = T1.EmprCod AND T2.Stp_hdr = T1.Stp_hdr AND T2.Stp_r = T1.Stp_r AND T2.Stp_p = T1.Stp_p)" ;
      scmdbuf += " LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.Stp_hdr AND T3.BarCodReo = T1.Stp_r AND T3.BarCodPar = T1.Stp_p) LEFT JOIN (SELECT T6.CliNom" ;
      scmdbuf += " AS StpCliNom, T5.EmprCod, T5.BarCod, T7.Stp_hdr, T5.BarCodReo, T7.Stp_r, T5.BarCodPar, T7.Stp_p FROM ((TXPBARCAD T5 LEFT JOIN TXPCLIENT T6 ON T6.EmprCod = T5.EmprCod" ;
      scmdbuf += " AND T6.CliCod = T5.CliCod) INNER JOIN TXPHDSTOP T7 ON T7.EmprCod = T5.EmprCod) WHERE T5.BarCod = T7.Stp_hdr and T5.BarCodReo = T7.Stp_r and T5.BarCodPar = T7.Stp_p" ;
      scmdbuf += " ) T4 ON T4.EmprCod = T1.EmprCod AND T4.Stp_hdr = T1.Stp_hdr AND T4.Stp_r = T1.Stp_r AND T4.Stp_p = T1.Stp_p)" ;
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
      if ( ! (0==AV92Webhdsto5ds_2_tfstp_lin) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin >= ?)");
      }
      else
      {
         GXv_int23[34] = (byte)(1) ;
      }
      if ( ! (0==AV93Webhdsto5ds_3_tfstp_lin_to) )
      {
         addWhere(sWhereString, "(T1.Stp_Lin <= ?)");
      }
      else
      {
         GXv_int23[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV94Webhdsto5ds_4_tfstp_dia) )
      {
         addWhere(sWhereString, "(T1.Stp_Dia >= ?)");
      }
      else
      {
         GXv_int23[36] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Webhdsto5ds_6_tfstp_mot_sel)==0) && ( ! (GXutil.strcmp("", AV95Webhdsto5ds_5_tfstp_mot)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.Stp_Mot) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[37] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Webhdsto5ds_6_tfstp_mot_sel)==0) )
      {
         addWhere(sWhereString, "(T1.Stp_Mot = ?)");
      }
      else
      {
         GXv_int23[38] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Webhdsto5ds_8_tfstphdr_sel)==0) && ( ! (GXutil.strcmp("", AV97Webhdsto5ds_7_tfstphdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[39] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Webhdsto5ds_8_tfstphdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.Stp_hdr,'99999990'), 2))) || '-' || SUBSTR(TO_CHAR(T1.Stp_r,'90'), 2) || T1.Stp_p = ?)");
      }
      else
      {
         GXv_int23[40] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H00J03(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
            case 1 :
                  return conditional_H00J05(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (java.util.Date)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00J03", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00J05", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
                  stmt.setString(sIdx, (String)parms[46], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
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
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 30);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 30);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 30);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 30);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[65], 16);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[66], 16);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 16);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[74], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 13);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 13);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 13);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 13);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 13);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[80]).shortValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[81]).shortValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[82], false);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[83], 300);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[84], 300);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 11);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 11);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[87]).intValue());
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[88]).intValue());
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[91]).intValue());
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

