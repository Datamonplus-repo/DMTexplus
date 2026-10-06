package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransporteproveedor_3_impl extends GXDataArea
{
   public documentotransporteproveedor_3_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransporteproveedor_3_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransporteproveedor_3_impl.class ));
   }

   public documentotransporteproveedor_3_impl( int remoteHandle ,
                                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbAlbProUnd = new HTMLChoice();
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
            AV36Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV37AlbProId = (int)(GXutil.lval( httpContext.GetPar( "AlbProId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProId), 8, 0));
               AV38ALbProIDAT = httpContext.GetPar( "ALbProIDAT") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38ALbProIDAT", AV38ALbProIDAT);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38ALbProIDAT, ""))));
               AV39AlbProSys = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSys")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProSys", localUtil.ttoc( AV39AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV40AlbProDate = localUtil.parseDateParm( httpContext.GetPar( "AlbProDate")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProDate", localUtil.format(AV40AlbProDate, "99/99/99"));
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
      nRC_GXsfl_49 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_49"))) ;
      nGXsfl_49_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_49_idx"))) ;
      sGXsfl_49_idx = httpContext.GetPar( "sGXsfl_49_idx") ;
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
      AV36Emprcod = httpContext.GetPar( "Emprcod") ;
      AV37AlbProId = (int)(GXutil.lval( httpContext.GetPar( "AlbProId"))) ;
      AV45TFAlbProLinea = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProLinea"))) ;
      AV46TFAlbProLinea_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProLinea_To"))) ;
      AV47TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV48TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV49TFAlbProDsc = httpContext.GetPar( "TFAlbProDsc") ;
      AV50TFAlbProDsc_Sel = httpContext.GetPar( "TFAlbProDsc_Sel") ;
      AV51TFAlbProCnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbProCnt"), ".") ;
      AV52TFAlbProCnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbProCnt_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV54TFAlbProUnd_Sels);
      AV55TFAlbProCajas = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProCajas"))) ;
      AV56TFAlbProCajas_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbProCajas_To"))) ;
      AV67Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV38ALbProIDAT = httpContext.GetPar( "ALbProIDAT") ;
      AV39AlbProSys = localUtil.parseDTimeParm( httpContext.GetPar( "AlbProSys")) ;
      AV40AlbProDate = localUtil.parseDateParm( httpContext.GetPar( "AlbProDate")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV36Emprcod, AV37AlbProId, AV45TFAlbProLinea, AV46TFAlbProLinea_To, AV47TFPrdNum, AV48TFPrdNum_Sel, AV49TFAlbProDsc, AV50TFAlbProDsc_Sel, AV51TFAlbProCnt, AV52TFAlbProCnt_To, AV54TFAlbProUnd_Sels, AV55TFAlbProCajas, AV56TFAlbProCajas_To, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38ALbProIDAT, AV39AlbProSys, AV40AlbProDate) ;
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
      pa1WL2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1WL2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.documentotransporteproveedor_3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV37AlbProId,8,0)),GXutil.URLEncode(GXutil.rtrim(AV38ALbProIDAT)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV39AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(AV40AlbProDate))}, new String[] {"Emprcod","AlbProId","ALbProIDAT","AlbProSys","AlbProDate"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38ALbProIDAT, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_3");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_3:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_49, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV33GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV34GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV31DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROLINEA", GXutil.ltrim( localUtil.ntoc( AV45TFAlbProLinea, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROLINEA_TO", GXutil.ltrim( localUtil.ntoc( AV46TFAlbProLinea_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV47TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV48TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPRODSC", GXutil.rtrim( AV49TFAlbProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPRODSC_SEL", GXutil.rtrim( AV50TFAlbProDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCNT", GXutil.ltrim( localUtil.ntoc( AV51TFAlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCNT_TO", GXutil.ltrim( localUtil.ntoc( AV52TFAlbProCnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROUND_SELS", AV54TFAlbProUnd_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROUND_SELS", AV54TFAlbProUnd_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCAJAS", GXutil.ltrim( localUtil.ntoc( AV55TFAlbProCajas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCAJAS_TO", GXutil.ltrim( localUtil.ntoc( AV56TFAlbProCajas_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV36Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROID", GXutil.ltrim( localUtil.ntoc( AV37AlbProId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROIDAT", GXutil.rtrim( AV38ALbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38ALbProIDAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSYS", localUtil.ttoc( AV39AlbProSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPRODATE", localUtil.dtoc( AV40AlbProDate, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we1WL2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1WL2( ) ;
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
      return formatLink("app.stocksquimicos.documentotransporteproveedor_3", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV37AlbProId,8,0)),GXutil.URLEncode(GXutil.rtrim(AV38ALbProIDAT)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV39AlbProSys)),GXutil.URLEncode(GXutil.formatDateParm(AV40AlbProDate))}, new String[] {"Emprcod","AlbProId","ALbProIDAT","AlbProSys","AlbProDate"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.DocumentoTransporteProveedor_3" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Transporte Proveedor", "") ;
   }

   public void wb1WL0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabletxtcomunicadaat_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktxtcomunicadaat_Internalname, "", "", "", lblTextblocktxtcomunicadaat_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTxtcomunicadaat_Internalname, httpContext.getMessage( "txtcomunicadaat", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTxtcomunicadaat_Internalname, AV44txtcomunicadaat, GXutil.rtrim( localUtil.format( AV44txtcomunicadaat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTxtcomunicadaat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTxtcomunicadaat_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1WL2( true) ;
      }
      else
      {
         wb_table1_27_1WL2( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1WL2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\DocumentoTransporteProveedor_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol49( ) ;
      }
      if ( wbEnd == 49 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_49 = (int)(nGXsfl_49_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV33GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV34GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\DocumentoTransporteProveedor_3.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV31DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 49 )
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

   public void start1WL2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento Transporte Proveedor", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1WL0( ) ;
   }

   public void ws1WL2( )
   {
      start1WL2( ) ;
      evt1WL2( ) ;
   }

   public void evt1WL2( )
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
                           e111WL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121WL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131WL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e141WL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCancelar' */
                           e151WL2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e161WL2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_49_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_492( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV35GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridActions), 4, 0));
                           A13442AlbProLine = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A13448AlbProDsc = httpContext.cgiGet( edtAlbProDsc_Internalname) ;
                           n13448AlbProDsc = false ;
                           A13443AlbProCnt = localUtil.ctond( httpContext.cgiGet( edtAlbProCnt_Internalname)) ;
                           n13443AlbProCnt = false ;
                           cmbAlbProUnd.setName( cmbAlbProUnd.getInternalname() );
                           cmbAlbProUnd.setValue( httpContext.cgiGet( cmbAlbProUnd.getInternalname()) );
                           A13444AlbProUnd = httpContext.cgiGet( cmbAlbProUnd.getInternalname()) ;
                           n13444AlbProUnd = false ;
                           A13449AlbProCaja = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbProCaja_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n13449AlbProCaja = false ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A13418AlbProID = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbProID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e171WL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e181WL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191WL2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201WL2 ();
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

   public void we1WL2( )
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

   public void pa1WL2( )
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
            GX_FocusControl = edtavTxtcomunicadaat_Internalname ;
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
      subsflControlProps_492( ) ;
      while ( nGXsfl_49_idx <= nRC_GXsfl_49 )
      {
         sendrow_492( ) ;
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV36Emprcod ,
                                 int AV37AlbProId ,
                                 short AV45TFAlbProLinea ,
                                 short AV46TFAlbProLinea_To ,
                                 String AV47TFPrdNum ,
                                 String AV48TFPrdNum_Sel ,
                                 String AV49TFAlbProDsc ,
                                 String AV50TFAlbProDsc_Sel ,
                                 java.math.BigDecimal AV51TFAlbProCnt ,
                                 java.math.BigDecimal AV52TFAlbProCnt_To ,
                                 GXSimpleCollection<String> AV54TFAlbProUnd_Sels ,
                                 short AV55TFAlbProCajas ,
                                 short AV56TFAlbProCajas_To ,
                                 String AV67Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV38ALbProIDAT ,
                                 java.util.Date AV39AlbProSys ,
                                 java.util.Date AV40AlbProDate )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181WL2 ();
      GRID_nCurrentRecord = 0 ;
      rf1WL2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_3");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\documentotransporteproveedor_3:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROID", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROLINE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROLINE", GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), ".", "")));
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
      rf1WL2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavTxtcomunicadaat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTxtcomunicadaat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxtcomunicadaat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1WL2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(49) ;
      /* Execute user event: Refresh */
      e181WL2 ();
      nGXsfl_49_idx = 1 ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_492( ) ;
      bGXsfl_49_Refreshing = true ;
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
         subsflControlProps_492( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A13444AlbProUnd ,
                                              AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                              Short.valueOf(AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) ,
                                              Short.valueOf(AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) ,
                                              AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                              AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                              AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                              AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                              AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                              AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                              Integer.valueOf(AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels.size()) ,
                                              Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) ,
                                              Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) ,
                                              Short.valueOf(A13442AlbProLine) ,
                                              A719PrdNum ,
                                              A13448AlbProDsc ,
                                              A13443AlbProCnt ,
                                              Short.valueOf(A13449AlbProCaja) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV36Emprcod ,
                                              Integer.valueOf(AV37AlbProId) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A13418AlbProID) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum), 6, "%") ;
         lV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc), 60, "%") ;
         /* Using cursor H01WL2 */
         pr_default.execute(0, new Object[] {AV36Emprcod, Integer.valueOf(AV37AlbProId), Short.valueOf(AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea), Short.valueOf(AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to), lV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum, AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel, lV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc, AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel, AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt, AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to, Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas), Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_49_idx = 1 ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13418AlbProID = H01WL2_A13418AlbProID[0] ;
            A396EmprCod = H01WL2_A396EmprCod[0] ;
            A13449AlbProCaja = H01WL2_A13449AlbProCaja[0] ;
            n13449AlbProCaja = H01WL2_n13449AlbProCaja[0] ;
            A13444AlbProUnd = H01WL2_A13444AlbProUnd[0] ;
            n13444AlbProUnd = H01WL2_n13444AlbProUnd[0] ;
            A13443AlbProCnt = H01WL2_A13443AlbProCnt[0] ;
            n13443AlbProCnt = H01WL2_n13443AlbProCnt[0] ;
            A13448AlbProDsc = H01WL2_A13448AlbProDsc[0] ;
            n13448AlbProDsc = H01WL2_n13448AlbProDsc[0] ;
            A719PrdNum = H01WL2_A719PrdNum[0] ;
            A13442AlbProLine = H01WL2_A13442AlbProLine[0] ;
            e191WL2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(49) ;
         wb1WL0( ) ;
      }
      bGXsfl_49_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1WL2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROIDAT", GXutil.rtrim( AV38ALbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38ALbProIDAT, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROID"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROLINE"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9")));
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
      AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A13444AlbProUnd ,
                                           AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                           Short.valueOf(AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) ,
                                           Short.valueOf(AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) ,
                                           AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                           AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                           AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                           AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                           AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                           AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                           Integer.valueOf(AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels.size()) ,
                                           Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) ,
                                           Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) ,
                                           Short.valueOf(A13442AlbProLine) ,
                                           A719PrdNum ,
                                           A13448AlbProDsc ,
                                           A13443AlbProCnt ,
                                           Short.valueOf(A13449AlbProCaja) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV36Emprcod ,
                                           Integer.valueOf(AV37AlbProId) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A13418AlbProID) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum), 6, "%") ;
      lV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = GXutil.padr( GXutil.rtrim( AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc), 60, "%") ;
      /* Using cursor H01WL3 */
      pr_default.execute(1, new Object[] {AV36Emprcod, Integer.valueOf(AV37AlbProId), Short.valueOf(AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea), Short.valueOf(AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to), lV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum, AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel, lV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc, AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel, AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt, AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to, Short.valueOf(AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas), Short.valueOf(AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to)});
      GRID_nRecordCount = H01WL3_AGRID_nRecordCount[0] ;
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
      AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV36Emprcod, AV37AlbProId, AV45TFAlbProLinea, AV46TFAlbProLinea_To, AV47TFPrdNum, AV48TFPrdNum_Sel, AV49TFAlbProDsc, AV50TFAlbProDsc_Sel, AV51TFAlbProCnt, AV52TFAlbProCnt_To, AV54TFAlbProUnd_Sels, AV55TFAlbProCajas, AV56TFAlbProCajas_To, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38ALbProIDAT, AV39AlbProSys, AV40AlbProDate) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36Emprcod, AV37AlbProId, AV45TFAlbProLinea, AV46TFAlbProLinea_To, AV47TFPrdNum, AV48TFPrdNum_Sel, AV49TFAlbProDsc, AV50TFAlbProDsc_Sel, AV51TFAlbProCnt, AV52TFAlbProCnt_To, AV54TFAlbProUnd_Sels, AV55TFAlbProCajas, AV56TFAlbProCajas_To, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38ALbProIDAT, AV39AlbProSys, AV40AlbProDate) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36Emprcod, AV37AlbProId, AV45TFAlbProLinea, AV46TFAlbProLinea_To, AV47TFPrdNum, AV48TFPrdNum_Sel, AV49TFAlbProDsc, AV50TFAlbProDsc_Sel, AV51TFAlbProCnt, AV52TFAlbProCnt_To, AV54TFAlbProUnd_Sels, AV55TFAlbProCajas, AV56TFAlbProCajas_To, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38ALbProIDAT, AV39AlbProSys, AV40AlbProDate) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36Emprcod, AV37AlbProId, AV45TFAlbProLinea, AV46TFAlbProLinea_To, AV47TFPrdNum, AV48TFPrdNum_Sel, AV49TFAlbProDsc, AV50TFAlbProDsc_Sel, AV51TFAlbProCnt, AV52TFAlbProCnt_To, AV54TFAlbProUnd_Sels, AV55TFAlbProCajas, AV56TFAlbProCajas_To, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38ALbProIDAT, AV39AlbProSys, AV40AlbProDate) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV36Emprcod, AV37AlbProId, AV45TFAlbProLinea, AV46TFAlbProLinea_To, AV47TFPrdNum, AV48TFPrdNum_Sel, AV49TFAlbProDsc, AV50TFAlbProDsc_Sel, AV51TFAlbProCnt, AV52TFAlbProCnt_To, AV54TFAlbProUnd_Sels, AV55TFAlbProCajas, AV56TFAlbProCajas_To, AV67Pgmname, AV12OrderedBy, AV13OrderedDsc, AV38ALbProIDAT, AV39AlbProSys, AV40AlbProDate) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_3" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavTxtcomunicadaat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTxtcomunicadaat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxtcomunicadaat_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1WL0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171WL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV31DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_49 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_49"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV33GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV34GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
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
         /* Read variables values. */
         AV44txtcomunicadaat = httpContext.cgiGet( edtavTxtcomunicadaat_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44txtcomunicadaat", AV44txtcomunicadaat);
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteProveedor_3");
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("stocksquimicos\\documentotransporteproveedor_3:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
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
      e171WL2 ();
      if (returnInSub) return;
   }

   public void e171WL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV42Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransporteproveedor_3_impl.this.GXt_char1 = GXv_char2[0] ;
      AV42Station = GXt_char1 ;
      GXv_char2[0] = AV36Emprcod ;
      GXv_char3[0] = AV43EmprNom ;
      GXv_char4[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransporteproveedor_3_impl.this.AV36Emprcod = GXv_char2[0] ;
      documentotransporteproveedor_3_impl.this.AV43EmprNom = GXv_char3[0] ;
      documentotransporteproveedor_3_impl.this.AV41UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      AV44txtcomunicadaat = ((GXutil.strcmp("", AV38ALbProIDAT)==0) ? " " : httpContext.getMessage( "Guia Comunicada AT", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44txtcomunicadaat", AV44txtcomunicadaat);
      GXt_char1 = AV57Path ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV36Emprcod, httpContext.getMessage( "CPRPEM", ""), GXv_char4) ;
      documentotransporteproveedor_3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV57Path = GXt_char1 ;
      GXt_char1 = AV42Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      documentotransporteproveedor_3_impl.this.GXt_char1 = GXv_char4[0] ;
      AV42Station = GXt_char1 ;
      GXv_char4[0] = AV36Emprcod ;
      GXv_char3[0] = AV43EmprNom ;
      GXv_char2[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV42Station, GXv_char4, GXv_char3, GXv_char2) ;
      documentotransporteproveedor_3_impl.this.AV36Emprcod = GXv_char4[0] ;
      documentotransporteproveedor_3_impl.this.AV43EmprNom = GXv_char3[0] ;
      documentotransporteproveedor_3_impl.this.AV41UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV31DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV31DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e181WL2( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV33GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridCurrentPage), 10, 0));
      AV34GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34GridPageCount), 10, 0));
      AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea = AV45TFAlbProLinea ;
      AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to = AV46TFAlbProLinea_To ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = AV47TFPrdNum ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = AV48TFPrdNum_Sel ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = AV49TFAlbProDsc ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = AV50TFAlbProDsc_Sel ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = AV51TFAlbProCnt ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = AV52TFAlbProCnt_To ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = AV54TFAlbProUnd_Sels ;
      AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas = AV55TFAlbProCajas ;
      AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to = AV56TFAlbProCajas_To ;
      /*  Sending Event outputs  */
   }

   public void e111WL2( )
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
         AV32PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV32PageToGo) ;
      }
   }

   public void e121WL2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131WL2( )
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
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProLinea") == 0 )
         {
            AV45TFAlbProLinea = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbProLinea), 4, 0));
            AV46TFAlbProLinea_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbProLinea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbProLinea_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV47TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdNum", AV47TFPrdNum);
            AV48TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdNum_Sel", AV48TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProDsc") == 0 )
         {
            AV49TFAlbProDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbProDsc", AV49TFAlbProDsc);
            AV50TFAlbProDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbProDsc_Sel", AV50TFAlbProDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCnt") == 0 )
         {
            AV51TFAlbProCnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbProCnt", GXutil.ltrimstr( AV51TFAlbProCnt, 9, 2));
            AV52TFAlbProCnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbProCnt_To", GXutil.ltrimstr( AV52TFAlbProCnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProUnd") == 0 )
         {
            AV53TFAlbProUnd_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbProUnd_SelsJson", AV53TFAlbProUnd_SelsJson);
            AV54TFAlbProUnd_Sels.fromJSonString(AV53TFAlbProUnd_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCajas") == 0 )
         {
            AV55TFAlbProCajas = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFAlbProCajas), 4, 0));
            AV56TFAlbProCajas_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbProCajas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbProCajas_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54TFAlbProUnd_Sels", AV54TFAlbProUnd_Sels);
   }

   private void e191WL2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(49) ;
      }
      sendrow_492( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_49_Refreshing )
      {
         httpContext.doAjaxLoad(49, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV35GridActions, 4, 0)) );
   }

   public void e201WL2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV35GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV35GridActions == 2 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S162 ();
         if (returnInSub) return;
      }
      AV35GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV35GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e141WL2( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV36Emprcod ;
      GXv_int8[0] = AV37AlbProId ;
      GXv_date9[0] = AV40AlbProDate ;
      GXv_dtime10[0] = AV39AlbProSys ;
      GXv_char3[0] = AV59Cadena ;
      GXv_char2[0] = AV58firma ;
      new app.stocksquimicos.obtengocadenaparahashdocumentoproveedor(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date9, GXv_dtime10, GXv_char3, GXv_char2) ;
      documentotransporteproveedor_3_impl.this.AV36Emprcod = GXv_char4[0] ;
      documentotransporteproveedor_3_impl.this.AV37AlbProId = GXv_int8[0] ;
      documentotransporteproveedor_3_impl.this.AV40AlbProDate = GXv_date9[0] ;
      documentotransporteproveedor_3_impl.this.AV39AlbProSys = GXv_dtime10[0] ;
      documentotransporteproveedor_3_impl.this.AV59Cadena = GXv_char3[0] ;
      documentotransporteproveedor_3_impl.this.AV58firma = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProId), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProDate", localUtil.format(AV40AlbProDate, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProSys", localUtil.ttoc( AV39AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXv_char4[0] = AV60Hash ;
      GXv_objcol_SdtMessages_Message11[0] = AV61Messages ;
      GXv_boolean12[0] = AV62ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV59Cadena, GXv_char4, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
      documentotransporteproveedor_3_impl.this.AV60Hash = GXv_char4[0] ;
      AV61Messages = GXv_objcol_SdtMessages_Message11[0] ;
      documentotransporteproveedor_3_impl.this.AV62ok = GXv_boolean12[0] ;
      GXv_char4[0] = AV36Emprcod ;
      GXv_int8[0] = AV37AlbProId ;
      GXv_char3[0] = AV59Cadena ;
      GXv_char2[0] = AV60Hash ;
      new app.stocksquimicos.actualizohashdocumentoproveedor(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      documentotransporteproveedor_3_impl.this.AV36Emprcod = GXv_char4[0] ;
      documentotransporteproveedor_3_impl.this.AV37AlbProId = GXv_int8[0] ;
      documentotransporteproveedor_3_impl.this.AV59Cadena = GXv_char3[0] ;
      documentotransporteproveedor_3_impl.this.AV60Hash = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProId), 8, 0));
      httpContext.popup(formatLink("app.stocksquimicos.horasalidadocumentoenvioatdocumentoproveedor", new String[] {GXutil.URLEncode(GXutil.rtrim(AV36Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV37AlbProId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV39AlbProSys)),GXutil.URLEncode(GXutil.rtrim(AV59Cadena)),GXutil.URLEncode(GXutil.rtrim(AV60Hash))}, new String[] {"Emprcod","AlbProID","AlbProSys","cadena","hash"}) , new Object[] {"AV36Emprcod","AV37AlbProId","AV39AlbProSys","AV59Cadena","AV60Hash"});
      GXv_char4[0] = AV36Emprcod ;
      GXv_int8[0] = AV37AlbProId ;
      new app.stocksquimicos.panucalpro(remoteHandle, context).execute( GXv_char4, GXv_int8) ;
      documentotransporteproveedor_3_impl.this.AV36Emprcod = GXv_char4[0] ;
      documentotransporteproveedor_3_impl.this.AV37AlbProId = GXv_int8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProId), 8, 0));
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e151WL2( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV36Emprcod ;
      GXv_int8[0] = AV37AlbProId ;
      GXv_date9[0] = AV40AlbProDate ;
      GXv_dtime10[0] = AV39AlbProSys ;
      GXv_char3[0] = AV59Cadena ;
      GXv_char2[0] = AV58firma ;
      new app.stocksquimicos.obtengocadenaparahashdocumentoproveedor(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_date9, GXv_dtime10, GXv_char3, GXv_char2) ;
      documentotransporteproveedor_3_impl.this.AV36Emprcod = GXv_char4[0] ;
      documentotransporteproveedor_3_impl.this.AV37AlbProId = GXv_int8[0] ;
      documentotransporteproveedor_3_impl.this.AV40AlbProDate = GXv_date9[0] ;
      documentotransporteproveedor_3_impl.this.AV39AlbProSys = GXv_dtime10[0] ;
      documentotransporteproveedor_3_impl.this.AV59Cadena = GXv_char3[0] ;
      documentotransporteproveedor_3_impl.this.AV58firma = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProId), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProDate", localUtil.format(AV40AlbProDate, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProSys", localUtil.ttoc( AV39AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      GXv_char4[0] = AV60Hash ;
      GXv_objcol_SdtMessages_Message11[0] = AV61Messages ;
      GXv_boolean12[0] = AV62ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV59Cadena, GXv_char4, GXv_objcol_SdtMessages_Message11, GXv_boolean12) ;
      documentotransporteproveedor_3_impl.this.AV60Hash = GXv_char4[0] ;
      AV61Messages = GXv_objcol_SdtMessages_Message11[0] ;
      documentotransporteproveedor_3_impl.this.AV62ok = GXv_boolean12[0] ;
      GXv_char4[0] = AV36Emprcod ;
      GXv_int8[0] = AV37AlbProId ;
      GXv_char3[0] = AV59Cadena ;
      GXv_char2[0] = AV60Hash ;
      new app.stocksquimicos.actualizohashdocumentoproveedor(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2) ;
      documentotransporteproveedor_3_impl.this.AV36Emprcod = GXv_char4[0] ;
      documentotransporteproveedor_3_impl.this.AV37AlbProId = GXv_int8[0] ;
      documentotransporteproveedor_3_impl.this.AV59Cadena = GXv_char3[0] ;
      documentotransporteproveedor_3_impl.this.AV60Hash = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProId), 8, 0));
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e161WL2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV38ALbProIDAT)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT", ""));
      }
      else
      {
         httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV36Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV37AlbProId,8,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbProID","AlbProLinea"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbProID","AlbProLinea"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV38ALbProIDAT)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT", ""));
      }
      else
      {
         httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A13442AlbProLine,4,0))}, new String[] {"Mode","EmprCod","AlbProID","AlbProLinea"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A13442AlbProLine,4,0))}, new String[] {"Mode","EmprCod","AlbProID","AlbProLinea"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S162( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV38ALbProIDAT)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT", ""));
      }
      else
      {
         httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A13442AlbProLine,4,0))}, new String[] {"Mode","EmprCod","AlbProID","AlbProLinea"}) , new Object[] {});
         httpContext.doAjaxRefresh();
         if ( 1 == 0 )
         {
            httpContext.popup(formatLink("app.stocksquimicos.documentotransporteproveedor_2", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A13418AlbProID,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A13442AlbProLine,4,0))}, new String[] {"Mode","EmprCod","AlbProID","AlbProLinea"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV67Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV67Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV67Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV79GXV1 = 1 ;
      while ( AV79GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV79GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROLINEA") == 0 )
         {
            AV45TFAlbProLinea = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbProLinea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFAlbProLinea), 4, 0));
            AV46TFAlbProLinea_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbProLinea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFAlbProLinea_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV47TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFPrdNum", AV47TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV48TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFPrdNum_Sel", AV48TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC") == 0 )
         {
            AV49TFAlbProDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbProDsc", AV49TFAlbProDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPRODSC_SEL") == 0 )
         {
            AV50TFAlbProDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbProDsc_Sel", AV50TFAlbProDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCNT") == 0 )
         {
            AV51TFAlbProCnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbProCnt", GXutil.ltrimstr( AV51TFAlbProCnt, 9, 2));
            AV52TFAlbProCnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbProCnt_To", GXutil.ltrimstr( AV52TFAlbProCnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROUND_SEL") == 0 )
         {
            AV53TFAlbProUnd_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbProUnd_SelsJson", AV53TFAlbProUnd_SelsJson);
            AV54TFAlbProUnd_Sels.fromJSonString(AV53TFAlbProUnd_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCAJAS") == 0 )
         {
            AV55TFAlbProCajas = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbProCajas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFAlbProCajas), 4, 0));
            AV56TFAlbProCajas_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbProCajas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbProCajas_To), 4, 0));
         }
         AV79GXV1 = (int)(AV79GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFPrdNum_Sel)==0), AV48TFPrdNum_Sel, GXv_char4) ;
      documentotransporteproveedor_3_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFAlbProDsc_Sel)==0), AV50TFAlbProDsc_Sel, GXv_char3) ;
      documentotransporteproveedor_3_impl.this.GXt_char13 = GXv_char3[0] ;
      GXt_char14 = "" ;
      GXv_char2[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV54TFAlbProUnd_Sels.size()==0), AV53TFAlbProUnd_SelsJson, GXv_char2) ;
      documentotransporteproveedor_3_impl.this.GXt_char14 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char13+"||"+GXt_char14+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char4[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFPrdNum)==0), AV47TFPrdNum, GXv_char4) ;
      documentotransporteproveedor_3_impl.this.GXt_char14 = GXv_char4[0] ;
      GXt_char13 = "" ;
      GXv_char3[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbProDsc)==0), AV49TFAlbProDsc, GXv_char3) ;
      documentotransporteproveedor_3_impl.this.GXt_char13 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV45TFAlbProLinea) ? "" : GXutil.str( AV45TFAlbProLinea, 4, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbProCnt)==0) ? "" : GXutil.str( AV51TFAlbProCnt, 9, 2))+"||"+((0==AV55TFAlbProCajas) ? "" : GXutil.str( AV55TFAlbProCajas, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV46TFAlbProLinea_To) ? "" : GXutil.str( AV46TFAlbProLinea_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbProCnt_To)==0) ? "" : GXutil.str( AV52TFAlbProCnt_To, 9, 2))+"||"+((0==AV56TFAlbProCajas_To) ? "" : GXutil.str( AV56TFAlbProCajas_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV67Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROLINEA", "", !((0==AV45TFAlbProLinea)&&(0==AV46TFAlbProLinea_To)), (short)(0), GXutil.trim( GXutil.str( AV45TFAlbProLinea, 4, 0)), GXutil.trim( GXutil.str( AV46TFAlbProLinea_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDNUM", "", !(GXutil.strcmp("", AV47TFPrdNum)==0), (short)(0), AV47TFPrdNum, "", !(GXutil.strcmp("", AV48TFPrdNum_Sel)==0), AV48TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPRODSC", "", !(GXutil.strcmp("", AV49TFAlbProDsc)==0), (short)(0), AV49TFAlbProDsc, "", !(GXutil.strcmp("", AV50TFAlbProDsc_Sel)==0), AV50TFAlbProDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROCNT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbProCnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFAlbProCnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV51TFAlbProCnt, 9, 2)), GXutil.trim( GXutil.str( AV52TFAlbProCnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROUND_SEL", "", !(AV54TFAlbProUnd_Sels.size()==0), (short)(0), AV54TFAlbProUnd_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFALBPROCAJAS", "", !((0==AV55TFAlbProCajas)&&(0==AV56TFAlbProCajas_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFAlbProCajas, 4, 0)), GXutil.trim( GXutil.str( AV56TFAlbProCajas_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState15[0] ;
      if ( ! (GXutil.strcmp("", AV36Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV36Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV37AlbProId) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROID" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV37AlbProId, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV38ALbProIDAT)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROIDAT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV38ALbProIDAT );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV39AlbProSys) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROSYS" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV39AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV40AlbProDate)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPRODATE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV40AlbProDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV67Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV67Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.DocumentoTransporteProveedor_2" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_27_1WL2( boolean wbgen )
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
         wb_table1_27_1WL2e( true) ;
      }
      else
      {
         wb_table1_27_1WL2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV36Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Emprcod", AV36Emprcod);
      AV37AlbProId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37AlbProId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AlbProId), 8, 0));
      AV38ALbProIDAT = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ALbProIDAT", AV38ALbProIDAT);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROIDAT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38ALbProIDAT, ""))));
      AV39AlbProSys = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39AlbProSys", localUtil.ttoc( AV39AlbProSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV40AlbProDate = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40AlbProDate", localUtil.format(AV40AlbProDate, "99/99/99"));
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
      pa1WL2( ) ;
      ws1WL2( ) ;
      we1WL2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116141330", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/documentotransporteproveedor_3.js", "?202682116141331", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_492( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_49_idx );
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_49_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_49_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_49_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_49_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_49_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_49_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_49_idx ;
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_492( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_49_fel_idx );
      edtAlbProLine_Internalname = "ALBPROLINE_"+sGXsfl_49_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_49_fel_idx ;
      edtAlbProDsc_Internalname = "ALBPRODSC_"+sGXsfl_49_fel_idx ;
      edtAlbProCnt_Internalname = "ALBPROCNT_"+sGXsfl_49_fel_idx ;
      cmbAlbProUnd.setInternalname( "ALBPROUND_"+sGXsfl_49_fel_idx );
      edtAlbProCaja_Internalname = "ALBPROCAJA_"+sGXsfl_49_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_49_fel_idx ;
      edtAlbProID_Internalname = "ALBPROID_"+sGXsfl_49_fel_idx ;
   }

   public void sendrow_492( )
   {
      subsflControlProps_492( ) ;
      wb1WL0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_49_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_49_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_49_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_49_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV35GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV35GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV35GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_49_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV35GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_49_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProLine_Internalname,GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13442AlbProLine), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProLine_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProDsc_Internalname,GXutil.rtrim( A13448AlbProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCnt_Internalname,GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13443AlbProCnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProUnd.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROUND_" + sGXsfl_49_idx ;
            cmbAlbProUnd.setName( GXCCtl );
            cmbAlbProUnd.setWebtags( "" );
            cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
            cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
            cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
            cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
            cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
            if ( cmbAlbProUnd.getItemCount() > 0 )
            {
               A13444AlbProUnd = cmbAlbProUnd.getValidValue(A13444AlbProUnd) ;
               n13444AlbProUnd = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProUnd,cmbAlbProUnd.getInternalname(),GXutil.rtrim( A13444AlbProUnd),Integer.valueOf(1),cmbAlbProUnd.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProUnd.setValue( GXutil.rtrim( A13444AlbProUnd) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProUnd.getInternalname(), "Values", cmbAlbProUnd.ToJavascriptSource(), !bGXsfl_49_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCaja_Internalname,GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13449AlbProCaja), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCaja_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProID_Internalname,GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13418AlbProID), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1WL2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      /* End function sendrow_492 */
   }

   public void startgridcontrol49( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"49\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Embalaje", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV35GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13442AlbProLine, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13448AlbProDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13443AlbProCnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13444AlbProUnd));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13449AlbProCaja, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), ".", "")));
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      lblTextblocktxtcomunicadaat_Internalname = "TEXTBLOCKTXTCOMUNICADAAT" ;
      edtavTxtcomunicadaat_Internalname = "vTXTCOMUNICADAAT" ;
      divUnnamedtabletxtcomunicadaat_Internalname = "UNNAMEDTABLETXTCOMUNICADAAT" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = "BTNCANCELAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbProLine_Internalname = "ALBPROLINE" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtAlbProDsc_Internalname = "ALBPRODSC" ;
      edtAlbProCnt_Internalname = "ALBPROCNT" ;
      cmbAlbProUnd.setInternalname( "ALBPROUND" );
      edtAlbProCaja_Internalname = "ALBPROCAJA" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbProID_Internalname = "ALBPROID" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      edtAlbProID_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtAlbProCaja_Jsonclick = "" ;
      cmbAlbProUnd.setJsonclick( "" );
      edtAlbProCnt_Jsonclick = "" ;
      edtAlbProDsc_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtAlbProLine_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavTxtcomunicadaat_Jsonclick = "" ;
      edtavTxtcomunicadaat_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "StocksQuimicos.DocumentoTransporteProveedor_3GetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||kg:kilos,lt:litros,mt:metros,und:unidades,:n/a|" ;
      Ddo_grid_Allowmultipleselection = "||||T|" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||FixedValues|" ;
      Ddo_grid_Includedatalist = "|T|T||T|" ;
      Ddo_grid_Filterisrange = "T|||T||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T||T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6" ;
      Ddo_grid_Columnids = "1:AlbProLinea|2:PrdNum|3:AlbProDsc|4:AlbProCnt|5:AlbProUnd|6:AlbProCajas" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Documento Transporte Proveedor", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_49_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV35GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV35GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridActions), 4, 0));
      }
      GXCCtl = "ALBPROUND_" + sGXsfl_49_idx ;
      cmbAlbProUnd.setName( GXCCtl );
      cmbAlbProUnd.setWebtags( "" );
      cmbAlbProUnd.addItem("kg", httpContext.getMessage( "kilos", ""), (short)(0));
      cmbAlbProUnd.addItem("lt", httpContext.getMessage( "litros", ""), (short)(0));
      cmbAlbProUnd.addItem("mt", httpContext.getMessage( "metros", ""), (short)(0));
      cmbAlbProUnd.addItem("und", httpContext.getMessage( "unidades", ""), (short)(0));
      cmbAlbProUnd.addItem("", httpContext.getMessage( "n/a", ""), (short)(0));
      if ( cmbAlbProUnd.getItemCount() > 0 )
      {
         A13444AlbProUnd = cmbAlbProUnd.getValidValue(A13444AlbProUnd) ;
         n13444AlbProUnd = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV45TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV46TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV50TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV51TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV55TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV56TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111WL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV45TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV46TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV50TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV51TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV55TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV56TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121WL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV45TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV46TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV50TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV51TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV55TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV56TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131WL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV45TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV46TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV50TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV51TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV55TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV56TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV56TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV53TFAlbProUnd_SelsJson',fld:'vTFALBPROUND_SELSJSON',pic:''},{av:'AV54TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV51TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV49TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV50TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV45TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV46TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191WL2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV35GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e201WL2',iparms:[{av:'cmbavGridactions'},{av:'AV35GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV45TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV46TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV50TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV51TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV55TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV56TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9',hsh:true},{av:'A13442AlbProLine',fld:'ALBPROLINE',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV35GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e141WL2',iparms:[{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e151WL2',iparms:[{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOCANCELAR'",",oparms:[{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161WL2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV36Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV37AlbProId',fld:'vALBPROID',pic:'ZZZZZZZ9'},{av:'AV45TFAlbProLinea',fld:'vTFALBPROLINEA',pic:'ZZZ9'},{av:'AV46TFAlbProLinea_To',fld:'vTFALBPROLINEA_TO',pic:'ZZZ9'},{av:'AV47TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV48TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV49TFAlbProDsc',fld:'vTFALBPRODSC',pic:''},{av:'AV50TFAlbProDsc_Sel',fld:'vTFALBPRODSC_SEL',pic:''},{av:'AV51TFAlbProCnt',fld:'vTFALBPROCNT',pic:'ZZZZZ9.99'},{av:'AV52TFAlbProCnt_To',fld:'vTFALBPROCNT_TO',pic:'ZZZZZ9.99'},{av:'AV54TFAlbProUnd_Sels',fld:'vTFALBPROUND_SELS',pic:''},{av:'AV55TFAlbProCajas',fld:'vTFALBPROCAJAS',pic:'ZZZ9'},{av:'AV56TFAlbProCajas_To',fld:'vTFALBPROCAJAS_TO',pic:'ZZZ9'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38ALbProIDAT',fld:'vALBPROIDAT',pic:'',hsh:true},{av:'AV39AlbProSys',fld:'vALBPROSYS',pic:'99/99/99 99:99'},{av:'AV40AlbProDate',fld:'vALBPRODATE',pic:''},{av:'A13442AlbProLine',fld:'ALBPROLINE',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV33GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV34GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("NULL","{handler:'valid_Albproid',iparms:[]");
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
      wcpOAV36Emprcod = "" ;
      wcpOAV38ALbProIDAT = "" ;
      wcpOAV39AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV40AlbProDate = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV36Emprcod = "" ;
      AV38ALbProIDAT = "" ;
      AV39AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      AV40AlbProDate = GXutil.nullDate() ;
      AV47TFPrdNum = "" ;
      AV48TFPrdNum_Sel = "" ;
      AV49TFAlbProDsc = "" ;
      AV50TFAlbProDsc_Sel = "" ;
      AV51TFAlbProCnt = DecimalUtil.ZERO ;
      AV52TFAlbProCnt_To = DecimalUtil.ZERO ;
      AV54TFAlbProUnd_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV67Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV31DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      lblTextblocktxtcomunicadaat_Jsonclick = "" ;
      AV44txtcomunicadaat = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A13448AlbProDsc = "" ;
      A13443AlbProCnt = DecimalUtil.ZERO ;
      A13444AlbProUnd = "" ;
      A396EmprCod = "" ;
      AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = "" ;
      lV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = "" ;
      AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel = "" ;
      AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum = "" ;
      AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel = "" ;
      AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc = "" ;
      AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt = DecimalUtil.ZERO ;
      AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to = DecimalUtil.ZERO ;
      H01WL2_A13418AlbProID = new int[1] ;
      H01WL2_A396EmprCod = new String[] {""} ;
      H01WL2_A13449AlbProCaja = new short[1] ;
      H01WL2_n13449AlbProCaja = new boolean[] {false} ;
      H01WL2_A13444AlbProUnd = new String[] {""} ;
      H01WL2_n13444AlbProUnd = new boolean[] {false} ;
      H01WL2_A13443AlbProCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01WL2_n13443AlbProCnt = new boolean[] {false} ;
      H01WL2_A13448AlbProDsc = new String[] {""} ;
      H01WL2_n13448AlbProDsc = new boolean[] {false} ;
      H01WL2_A719PrdNum = new String[] {""} ;
      H01WL2_A13442AlbProLine = new short[1] ;
      H01WL3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV42Station = "" ;
      AV43EmprNom = "" ;
      AV41UsurCod = "" ;
      AV57Path = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53TFAlbProUnd_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV59Cadena = "" ;
      AV58firma = "" ;
      AV60Hash = "" ;
      AV61Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_date9 = new java.util.Date[1] ;
      GXv_dtime10 = new java.util.Date[1] ;
      GXv_objcol_SdtMessages_Message11 = new GXBaseCollection[1] ;
      GXv_boolean12 = new boolean[1] ;
      GXv_int8 = new int[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.documentotransporteproveedor_3__default(),
         new Object[] {
             new Object[] {
            H01WL2_A13418AlbProID, H01WL2_A396EmprCod, H01WL2_A13449AlbProCaja, H01WL2_n13449AlbProCaja, H01WL2_A13444AlbProUnd, H01WL2_n13444AlbProUnd, H01WL2_A13443AlbProCnt, H01WL2_n13443AlbProCnt, H01WL2_A13448AlbProDsc, H01WL2_n13448AlbProDsc,
            H01WL2_A719PrdNum, H01WL2_A13442AlbProLine
            }
            , new Object[] {
            H01WL3_AGRID_nRecordCount
            }
         }
      );
      AV67Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_3" ;
      /* GeneXus formulas. */
      AV67Pgmname = "StocksQuimicos.DocumentoTransporteProveedor_3" ;
      Gx_err = (short)(0) ;
      edtavTxtcomunicadaat_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
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
   private short AV45TFAlbProLinea ;
   private short AV46TFAlbProLinea_To ;
   private short AV55TFAlbProCajas ;
   private short AV56TFAlbProCajas_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV35GridActions ;
   private short A13442AlbProLine ;
   private short A13449AlbProCaja ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea ;
   private short AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to ;
   private short AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas ;
   private short AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to ;
   private int wcpOAV37AlbProId ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_49 ;
   private int AV37AlbProId ;
   private int nGXsfl_49_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavTxtcomunicadaat_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A13418AlbProID ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size ;
   private int AV32PageToGo ;
   private int GXv_int8[] ;
   private int AV79GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV33GridCurrentPage ;
   private long AV34GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV51TFAlbProCnt ;
   private java.math.BigDecimal AV52TFAlbProCnt_To ;
   private java.math.BigDecimal A13443AlbProCnt ;
   private java.math.BigDecimal AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ;
   private java.math.BigDecimal AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ;
   private String wcpOAV36Emprcod ;
   private String wcpOAV38ALbProIDAT ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV36Emprcod ;
   private String AV38ALbProIDAT ;
   private String sGXsfl_49_idx="0001" ;
   private String AV47TFPrdNum ;
   private String AV48TFPrdNum_Sel ;
   private String AV49TFAlbProDsc ;
   private String AV50TFAlbProDsc_Sel ;
   private String AV67Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
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
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String divUnnamedtabletxtcomunicadaat_Internalname ;
   private String lblTextblocktxtcomunicadaat_Internalname ;
   private String lblTextblocktxtcomunicadaat_Jsonclick ;
   private String edtavTxtcomunicadaat_Internalname ;
   private String edtavTxtcomunicadaat_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbProLine_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A13448AlbProDsc ;
   private String edtAlbProDsc_Internalname ;
   private String edtAlbProCnt_Internalname ;
   private String A13444AlbProUnd ;
   private String edtAlbProCaja_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtAlbProID_Internalname ;
   private String scmdbuf ;
   private String lV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ;
   private String lV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ;
   private String AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ;
   private String AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ;
   private String AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ;
   private String AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ;
   private String hsh ;
   private String AV42Station ;
   private String AV43EmprNom ;
   private String AV41UsurCod ;
   private String AV57Path ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char14 ;
   private String GXv_char4[] ;
   private String GXt_char13 ;
   private String GXv_char3[] ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_49_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbProLine_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtAlbProDsc_Jsonclick ;
   private String edtAlbProCnt_Jsonclick ;
   private String edtAlbProCaja_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbProID_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV39AlbProSys ;
   private java.util.Date AV39AlbProSys ;
   private java.util.Date GXv_dtime10[] ;
   private java.util.Date wcpOAV40AlbProDate ;
   private java.util.Date AV40AlbProDate ;
   private java.util.Date GXv_date9[] ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n13448AlbProDsc ;
   private boolean n13443AlbProCnt ;
   private boolean n13444AlbProUnd ;
   private boolean n13449AlbProCaja ;
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV62ok ;
   private boolean GXv_boolean12[] ;
   private String AV53TFAlbProUnd_SelsJson ;
   private String AV44txtcomunicadaat ;
   private String AV59Cadena ;
   private String AV58firma ;
   private String AV60Hash ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProUnd ;
   private IDataStoreProvider pr_default ;
   private int[] H01WL2_A13418AlbProID ;
   private String[] H01WL2_A396EmprCod ;
   private short[] H01WL2_A13449AlbProCaja ;
   private boolean[] H01WL2_n13449AlbProCaja ;
   private String[] H01WL2_A13444AlbProUnd ;
   private boolean[] H01WL2_n13444AlbProUnd ;
   private java.math.BigDecimal[] H01WL2_A13443AlbProCnt ;
   private boolean[] H01WL2_n13443AlbProCnt ;
   private String[] H01WL2_A13448AlbProDsc ;
   private boolean[] H01WL2_n13448AlbProDsc ;
   private String[] H01WL2_A719PrdNum ;
   private short[] H01WL2_A13442AlbProLine ;
   private long[] H01WL3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV54TFAlbProUnd_Sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV61Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV31DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class documentotransporteproveedor_3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01WL2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                          short AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea ,
                                          short AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to ,
                                          String AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                          String AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                          String AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                          String AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                          int AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size ,
                                          short AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas ,
                                          short AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV36Emprcod ,
                                          int AV37AlbProId ,
                                          String A396EmprCod ,
                                          int A13418AlbProID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[17];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " AlbProID, EmprCod, AlbProCaja, AlbProUnd, AlbProCnt, AlbProDsc, PrdNum, AlbProLine" ;
      sFromString = " FROM TXPLALPRO" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProID = ?)");
      if ( ! (0==AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (0==AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProLine" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProLine DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProCnt" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProCnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProUnd" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProUnd DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbProCaja" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbProCaja DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, AlbProID, AlbProLine" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01WL3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A13444AlbProUnd ,
                                          GXSimpleCollection<String> AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels ,
                                          short AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea ,
                                          short AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to ,
                                          String AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel ,
                                          String AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum ,
                                          String AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel ,
                                          String AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc ,
                                          java.math.BigDecimal AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt ,
                                          java.math.BigDecimal AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to ,
                                          int AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size ,
                                          short AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas ,
                                          short AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to ,
                                          short A13442AlbProLine ,
                                          String A719PrdNum ,
                                          String A13448AlbProDsc ,
                                          java.math.BigDecimal A13443AlbProCnt ,
                                          short A13449AlbProCaja ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV36Emprcod ,
                                          int AV37AlbProId ,
                                          String A396EmprCod ,
                                          int A13418AlbProID )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[12];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLALPRO" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbProID = ?)");
      if ( ! (0==AV68Stocksquimicos_documentotransporteproveedor_3ds_1_tfalbprolinea) )
      {
         addWhere(sWhereString, "(AlbProLine >= ?)");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
      }
      if ( ! (0==AV69Stocksquimicos_documentotransporteproveedor_3ds_2_tfalbprolinea_to) )
      {
         addWhere(sWhereString, "(AlbProLine <= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Stocksquimicos_documentotransporteproveedor_3ds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Stocksquimicos_documentotransporteproveedor_3ds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(PrdNum = ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) && ( ! (GXutil.strcmp("", AV72Stocksquimicos_documentotransporteproveedor_3ds_5_tfalbprodsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbProDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Stocksquimicos_documentotransporteproveedor_3ds_6_tfalbprodsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbProDsc = ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Stocksquimicos_documentotransporteproveedor_3ds_7_tfalbprocnt)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Stocksquimicos_documentotransporteproveedor_3ds_8_tfalbprocnt_to)==0) )
      {
         addWhere(sWhereString, "(AlbProCnt <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV76Stocksquimicos_documentotransporteproveedor_3ds_9_tfalbpround_sels, "AlbProUnd IN (", ")")+")");
      }
      if ( ! (0==AV77Stocksquimicos_documentotransporteproveedor_3ds_10_tfalbprocajas) )
      {
         addWhere(sWhereString, "(AlbProCaja >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV78Stocksquimicos_documentotransporteproveedor_3ds_11_tfalbprocajas_to) )
      {
         addWhere(sWhereString, "(AlbProCaja <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
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
                  return conditional_H01WL2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
            case 1 :
                  return conditional_H01WL3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , ((Number) dynConstraints[17]).shortValue() , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01WL2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01WL3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 60);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 6);
               ((short[]) buf[11])[0] = rslt.getShort(8);
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[20]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[14]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[15]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 60);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 60);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               return;
      }
   }

}

