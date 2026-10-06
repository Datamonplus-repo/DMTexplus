package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_header_trnww_impl extends GXDataArea
{
   public trabajoexterno_header_trnww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_header_trnww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_header_trnww_impl.class ));
   }

   public trabajoexterno_header_trnww_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavSalsts = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbSalExtLis = new HTMLChoice();
      cmbSalSts = new HTMLChoice();
      cmbSalEnvAT = new HTMLChoice();
      cmbSalExtAT = new HTMLChoice();
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
      nRC_GXsfl_63 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_63"))) ;
      nGXsfl_63_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_63_idx"))) ;
      sGXsfl_63_idx = httpContext.GetPar( "sGXsfl_63_idx") ;
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
      AV70SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      cmbavSalsts.fromJSonString( httpContext.GetNextPar( ));
      AV88SalSts = httpContext.GetPar( "SalSts") ;
      AV71ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
      AV72SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
      AV73SalExtFecTo = localUtil.parseDateParm( httpContext.GetPar( "SalExtFecTo")) ;
      AV47EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV54TFSalExtLis_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV58TFSalSts_Sels);
      AV84TFSalFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFSalFecSal")) ;
      AV55TFSalCodeID = httpContext.GetPar( "TFSalCodeID") ;
      AV56TFSalCodeID_Sel = httpContext.GetPar( "TFSalCodeID_Sel") ;
      AV40TFSalExtATCUD = httpContext.GetPar( "TFSalExtATCUD") ;
      AV41TFSalExtATCUD_Sel = httpContext.GetPar( "TFSalExtATCUD_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV81TFSalEnvAT_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV83TFSalExtAT_Sels);
      AV86TFSalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "TFSalFhh")) ;
      AV78TFSalFirma4d = httpContext.GetPar( "TFSalFirma4d") ;
      AV79TFSalFirma4d_Sel = httpContext.GetPar( "TFSalFirma4d_Sel") ;
      AV95Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV77Messages_json = httpContext.GetPar( "Messages_json") ;
      AV61firmad = (short)(GXutil.lval( httpContext.GetPar( "firmad"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV70SalExtAlb, AV88SalSts, AV71ManCod, AV72SalExtFec, AV73SalExtFecTo, AV47EmprCod, AV54TFSalExtLis_Sels, AV58TFSalSts_Sels, AV84TFSalFecSal, AV55TFSalCodeID, AV56TFSalCodeID_Sel, AV40TFSalExtATCUD, AV41TFSalExtATCUD_Sel, AV81TFSalEnvAT_Sels, AV83TFSalExtAT_Sels, AV86TFSalFhh, AV78TFSalFirma4d, AV79TFSalFirma4d_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77Messages_json, AV61firmad, Gx_date, A396EmprCod) ;
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
      pa2782( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2782( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_header_trnww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV77Messages_json));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61firmad), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Header_TRNWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_header_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV70SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vSALSTS", GXutil.rtrim( AV88SalSts));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vMANCOD", GXutil.ltrim( localUtil.ntoc( AV71ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vSALEXTFEC", localUtil.format(AV72SalExtFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vSALEXTFECTO", localUtil.format(AV73SalExtFecTo, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_63", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_63, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV44GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV45GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFSALEXTLIS_SELS", AV54TFSalExtLis_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFSALEXTLIS_SELS", AV54TFSalExtLis_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFSALSTS_SELS", AV58TFSalSts_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFSALSTS_SELS", AV58TFSalSts_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALFECSAL", localUtil.dtoc( AV84TFSalFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALCODEID", GXutil.rtrim( AV55TFSalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALCODEID_SEL", GXutil.rtrim( AV56TFSalCodeID_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXTATCUD", GXutil.rtrim( AV40TFSalExtATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXTATCUD_SEL", GXutil.rtrim( AV41TFSalExtATCUD_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFSALENVAT_SELS", AV81TFSalEnvAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFSALENVAT_SELS", AV81TFSalEnvAT_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFSALEXTAT_SELS", AV83TFSalExtAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFSALEXTAT_SELS", AV83TFSalExtAT_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALFHH", localUtil.ttoc( AV86TFSalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALFIRMA4D", GXutil.rtrim( AV78TFSalFirma4d));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALFIRMA4D_SEL", GXutil.rtrim( AV79TFSalFirma4d_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV47EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV65Hash);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOK", AV67ok);
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV77Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV77Messages_json));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV64Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV61firmad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61firmad), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERTRABAJOEXTERNO_HEADER_TRNWW", AV91FilterTrabajoExterno_Header_TRNWW);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERTRABAJOEXTERNO_HEADER_TRNWW", AV91FilterTrabajoExterno_Header_TRNWW);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminardocumento_Result));
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
         we2782( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2782( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_header_trnww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Header_TRNWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Trabajo Externo (Header)", "") ;
   }

   public void wb2780( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         wb_table1_17_2782( true) ;
      }
      else
      {
         wb_table1_17_2782( false) ;
      }
      return  ;
   }

   public void wb_table1_17_2782e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavSalsts.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavSalsts.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavSalsts, cmbavSalsts.getInternalname(), GXutil.rtrim( AV88SalSts), 1, cmbavSalsts.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavSalsts.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "", true, (byte)(0), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         cmbavSalsts.setValue( GXutil.rtrim( AV88SalSts) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSalsts.getInternalname(), "Values", cmbavSalsts.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMancod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMancod_Internalname, httpContext.getMessage( "Manufacturador", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancod_Internalname, GXutil.ltrim( localUtil.ntoc( AV71ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMancod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV71ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV71ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMancod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextfec_Internalname, httpContext.getMessage( "Data Envio", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavSalextfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextfec_Internalname, localUtil.format(AV72SalExtFec, "99/99/99"), localUtil.format( AV72SalExtFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavSalextfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavSalextfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextfecto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextfecto_Internalname, httpContext.getMessage( "Data ENvio", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavSalextfecto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextfecto_Internalname, localUtil.format(AV73SalExtFecTo, "99/99/99"), localUtil.format( AV73SalExtFecTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextfecto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextfecto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavSalextfecto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavSalextfecto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_52_2782( true) ;
      }
      else
      {
         wb_table2_52_2782( false) ;
      }
      return  ;
   }

   public void wb_table2_52_2782e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         startgridcontrol63( ) ;
      }
      if ( wbEnd == 63 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_63 = (int)(nGXsfl_63_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV44GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV45GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV95Pgmname), GXutil.rtrim( localUtil.format( AV95Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
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
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV42DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table3_94_2782( true) ;
      }
      else
      {
         wb_table3_94_2782( false) ;
      }
      return  ;
   }

   public void wb_table3_94_2782e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_salfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_salfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_salfecsalauxdate_Internalname, localUtil.format(AV85DDO_SalFecSalAuxDate, "99/99/99"), localUtil.format( AV85DDO_SalFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_salfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_salfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_salfhhauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_salfhhauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_salfhhauxdate_Internalname, localUtil.format(AV87DDO_SalFhhAuxDate, "99/99/99"), localUtil.format( AV87DDO_SalFhhAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_salfhhauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_salfhhauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 63 )
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

   public void start2782( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Trabajo Externo (Header)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2780( ) ;
   }

   public void ws2782( )
   {
      start2782( ) ;
      evt2782( ) ;
   }

   public void evt2782( )
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
                           e112782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e152782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMANCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSALEXTALB.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSALEXTFEC.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182782 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSALEXTFECTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192782 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 26), "SALSTS.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_63_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_632( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV46GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridActions), 4, 0));
                           A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
                           n2249ManNom = false ;
                           cmbSalExtLis.setName( cmbSalExtLis.getInternalname() );
                           cmbSalExtLis.setValue( httpContext.cgiGet( cmbSalExtLis.getInternalname()) );
                           A2258SalExtLis = (byte)(GXutil.lval( httpContext.cgiGet( cmbSalExtLis.getInternalname()))) ;
                           cmbSalSts.setName( cmbSalSts.getInternalname() );
                           cmbSalSts.setValue( httpContext.cgiGet( cmbSalSts.getInternalname()) );
                           A10080SalSts = httpContext.cgiGet( cmbSalSts.getInternalname()) ;
                           A2256SalExtFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtSalExtFec_Internalname), 0)) ;
                           A14398SalFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtSalFecSal_Internalname), 0)) ;
                           A6396SalExtHor = httpContext.cgiGet( edtSalExtHor_Internalname) ;
                           A10742SalCodeID = httpContext.cgiGet( edtSalCodeID_Internalname) ;
                           A14348SalExtATCU = httpContext.cgiGet( edtSalExtATCU_Internalname) ;
                           cmbSalEnvAT.setName( cmbSalEnvAT.getInternalname() );
                           cmbSalEnvAT.setValue( httpContext.cgiGet( cmbSalEnvAT.getInternalname()) );
                           A10741SalEnvAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbSalEnvAT.getInternalname()))) ;
                           cmbSalExtAT.setName( cmbSalExtAT.getInternalname() );
                           cmbSalExtAT.setValue( httpContext.cgiGet( cmbSalExtAT.getInternalname()) );
                           A10767SalExtAT = httpContext.cgiGet( cmbSalExtAT.getInternalname()) ;
                           A10076SalFhh = localUtil.ctot( httpContext.cgiGet( edtSalFhh_Internalname), 0) ;
                           A14373SalFirma4d = httpContext.cgiGet( edtSalFirma4d_Internalname) ;
                           A10077SalFmd = httpContext.cgiGet( edtSalFmd_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e202782 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e212782 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222782 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232782 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "SALSTS.CONTROLVALUECHANGED") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242782 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Salextalb Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vSALEXTALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV70SalExtAlb )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Salsts Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vSALSTS"), AV88SalSts) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Mancod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vMANCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV71ManCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Salextfec Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vSALEXTFEC"), 0), AV72SalExtFec) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Salextfecto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vSALEXTFECTO"), 0), AV73SalExtFecTo) ) )
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

   public void we2782( )
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

   public void pa2782( )
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
            GX_FocusControl = edtavSalextalb_Internalname ;
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
      subsflControlProps_632( ) ;
      while ( nGXsfl_63_idx <= nRC_GXsfl_63 )
      {
         sendrow_632( ) ;
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV70SalExtAlb ,
                                 String AV88SalSts ,
                                 short AV71ManCod ,
                                 java.util.Date AV72SalExtFec ,
                                 java.util.Date AV73SalExtFecTo ,
                                 String AV47EmprCod ,
                                 GXSimpleCollection<Byte> AV54TFSalExtLis_Sels ,
                                 GXSimpleCollection<String> AV58TFSalSts_Sels ,
                                 java.util.Date AV84TFSalFecSal ,
                                 String AV55TFSalCodeID ,
                                 String AV56TFSalCodeID_Sel ,
                                 String AV40TFSalExtATCUD ,
                                 String AV41TFSalExtATCUD_Sel ,
                                 GXSimpleCollection<Byte> AV81TFSalEnvAT_Sels ,
                                 GXSimpleCollection<String> AV83TFSalExtAT_Sels ,
                                 java.util.Date AV86TFSalFhh ,
                                 String AV78TFSalFirma4d ,
                                 String AV79TFSalFirma4d_Sel ,
                                 String AV95Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV77Messages_json ,
                                 short AV61firmad ,
                                 java.util.Date Gx_date ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212782 ();
      GRID_nCurrentRecord = 0 ;
      rf2782( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Header_TRNWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_header_trnww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALCODEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A10742SalCodeID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "SALCODEID", GXutil.rtrim( A10742SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALENVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A10741SalEnvAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALENVAT", GXutil.ltrim( localUtil.ntoc( A10741SalEnvAT, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALSTS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A10080SalSts, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "SALSTS", GXutil.rtrim( A10080SalSts));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALFECSAL", getSecureSignedToken( "", A14398SalFecSal));
      app.GxWebStd.gx_hidden_field( httpContext, "SALFECSAL", localUtil.format(A14398SalFecSal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALEXTHOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A6396SalExtHor, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTHOR", GXutil.rtrim( A6396SalExtHor));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MANCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANCOD", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
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
      if ( cmbavSalsts.getItemCount() > 0 )
      {
         AV88SalSts = cmbavSalsts.getValidValue(AV88SalSts) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88SalSts", AV88SalSts);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavSalsts.setValue( GXutil.rtrim( AV88SalSts) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSalsts.getInternalname(), "Values", cmbavSalsts.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2782( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV95Pgmname = "TrabajosExternos.TrabajoExterno_Header_TRNWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2782( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(63) ;
      /* Execute user event: Refresh */
      e212782 ();
      nGXsfl_63_idx = 1 ;
      sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_632( ) ;
      bGXsfl_63_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_632( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A2258SalExtLis) ,
                                              AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                              A10080SalSts ,
                                              AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                              Byte.valueOf(A10741SalEnvAT) ,
                                              AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                              A10767SalExtAT ,
                                              AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                              Integer.valueOf(AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels.size()) ,
                                              Integer.valueOf(AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels.size()) ,
                                              AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                              AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                              AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                              AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                              AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                              Integer.valueOf(AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels.size()) ,
                                              Integer.valueOf(AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels.size()) ,
                                              AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                              AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                              AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                              Integer.valueOf(AV70SalExtAlb) ,
                                              Short.valueOf(AV71ManCod) ,
                                              AV72SalExtFec ,
                                              AV73SalExtFecTo ,
                                              A14398SalFecSal ,
                                              A10742SalCodeID ,
                                              A14348SalExtATCU ,
                                              A10076SalFhh ,
                                              A10077SalFmd ,
                                              Integer.valueOf(A2253SalExtAlb) ,
                                              Short.valueOf(A2248ManCod) ,
                                              A2256SalExtFec ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV88SalSts ,
                                              AV47EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = GXutil.padr( GXutil.rtrim( AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid), 20, "%") ;
         lV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = GXutil.padr( GXutil.rtrim( AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud), 20, "%") ;
         lV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = GXutil.padr( GXutil.rtrim( AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d), 6, "%") ;
         /* Using cursor H02782 */
         pr_default.execute(0, new Object[] {AV47EmprCod, AV88SalSts, AV88SalSts, AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal, lV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid, AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel, lV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud, AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel, AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh, lV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d, AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel, Integer.valueOf(AV70SalExtAlb), Short.valueOf(AV71ManCod), AV72SalExtFec, AV73SalExtFecTo, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_63_idx = 1 ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02782_A396EmprCod[0] ;
            A10076SalFhh = H02782_A10076SalFhh[0] ;
            A10767SalExtAT = H02782_A10767SalExtAT[0] ;
            A10741SalEnvAT = H02782_A10741SalEnvAT[0] ;
            A14348SalExtATCU = H02782_A14348SalExtATCU[0] ;
            A10742SalCodeID = H02782_A10742SalCodeID[0] ;
            A6396SalExtHor = H02782_A6396SalExtHor[0] ;
            A14398SalFecSal = H02782_A14398SalFecSal[0] ;
            A2256SalExtFec = H02782_A2256SalExtFec[0] ;
            A10080SalSts = H02782_A10080SalSts[0] ;
            A2258SalExtLis = H02782_A2258SalExtLis[0] ;
            A2249ManNom = H02782_A2249ManNom[0] ;
            n2249ManNom = H02782_n2249ManNom[0] ;
            A2248ManCod = H02782_A2248ManCod[0] ;
            A2253SalExtAlb = H02782_A2253SalExtAlb[0] ;
            A10077SalFmd = H02782_A10077SalFmd[0] ;
            A2249ManNom = H02782_A2249ManNom[0] ;
            n2249ManNom = H02782_n2249ManNom[0] ;
            A14373SalFirma4d = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
            e222782 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(63) ;
         wb2780( ) ;
      }
      bGXsfl_63_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2782( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALCODEID"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, GXutil.rtrim( localUtil.format( A10742SalCodeID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALENVAT"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, localUtil.format( DecimalUtil.doubleToDec(A10741SalEnvAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALSTS"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, GXutil.rtrim( localUtil.format( A10080SalSts, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALFECSAL"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, A14398SalFecSal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALEXTHOR"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, GXutil.rtrim( localUtil.format( A6396SalExtHor, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MANCOD"+"_"+sGXsfl_63_idx, getSecureSignedToken( sGXsfl_63_idx, localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV77Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV77Messages_json));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV61firmad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61firmad), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV54TFSalExtLis_Sels ;
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV58TFSalSts_Sels ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV84TFSalFecSal ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV55TFSalCodeID ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV56TFSalCodeID_Sel ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV40TFSalExtATCUD ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV41TFSalExtATCUD_Sel ;
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV81TFSalEnvAT_Sels ;
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV83TFSalExtAT_Sels ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV86TFSalFhh ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV78TFSalFirma4d ;
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV79TFSalFirma4d_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A2258SalExtLis) ,
                                           AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                           A10080SalSts ,
                                           AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                           Byte.valueOf(A10741SalEnvAT) ,
                                           AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                           A10767SalExtAT ,
                                           AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                           Integer.valueOf(AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels.size()) ,
                                           Integer.valueOf(AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels.size()) ,
                                           AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                           AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                           AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                           AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                           AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                           Integer.valueOf(AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels.size()) ,
                                           Integer.valueOf(AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels.size()) ,
                                           AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                           AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                           AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                           Integer.valueOf(AV70SalExtAlb) ,
                                           Short.valueOf(AV71ManCod) ,
                                           AV72SalExtFec ,
                                           AV73SalExtFecTo ,
                                           A14398SalFecSal ,
                                           A10742SalCodeID ,
                                           A14348SalExtATCU ,
                                           A10076SalFhh ,
                                           A10077SalFmd ,
                                           Integer.valueOf(A2253SalExtAlb) ,
                                           Short.valueOf(A2248ManCod) ,
                                           A2256SalExtFec ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV88SalSts ,
                                           AV47EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = GXutil.padr( GXutil.rtrim( AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid), 20, "%") ;
      lV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = GXutil.padr( GXutil.rtrim( AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud), 20, "%") ;
      lV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = GXutil.padr( GXutil.rtrim( AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d), 6, "%") ;
      /* Using cursor H02783 */
      pr_default.execute(1, new Object[] {AV47EmprCod, AV88SalSts, AV88SalSts, AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal, lV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid, AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel, lV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud, AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel, AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh, lV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d, AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel, Integer.valueOf(AV70SalExtAlb), Short.valueOf(AV71ManCod), AV72SalExtFec, AV73SalExtFecTo});
      GRID_nRecordCount = H02783_AGRID_nRecordCount[0] ;
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
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV54TFSalExtLis_Sels ;
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV58TFSalSts_Sels ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV84TFSalFecSal ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV55TFSalCodeID ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV56TFSalCodeID_Sel ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV40TFSalExtATCUD ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV41TFSalExtATCUD_Sel ;
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV81TFSalEnvAT_Sels ;
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV83TFSalExtAT_Sels ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV86TFSalFhh ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV78TFSalFirma4d ;
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV79TFSalFirma4d_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV70SalExtAlb, AV88SalSts, AV71ManCod, AV72SalExtFec, AV73SalExtFecTo, AV47EmprCod, AV54TFSalExtLis_Sels, AV58TFSalSts_Sels, AV84TFSalFecSal, AV55TFSalCodeID, AV56TFSalCodeID_Sel, AV40TFSalExtATCUD, AV41TFSalExtATCUD_Sel, AV81TFSalEnvAT_Sels, AV83TFSalExtAT_Sels, AV86TFSalFhh, AV78TFSalFirma4d, AV79TFSalFirma4d_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77Messages_json, AV61firmad, Gx_date, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV54TFSalExtLis_Sels ;
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV58TFSalSts_Sels ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV84TFSalFecSal ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV55TFSalCodeID ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV56TFSalCodeID_Sel ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV40TFSalExtATCUD ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV41TFSalExtATCUD_Sel ;
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV81TFSalEnvAT_Sels ;
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV83TFSalExtAT_Sels ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV86TFSalFhh ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV78TFSalFirma4d ;
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV79TFSalFirma4d_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70SalExtAlb, AV88SalSts, AV71ManCod, AV72SalExtFec, AV73SalExtFecTo, AV47EmprCod, AV54TFSalExtLis_Sels, AV58TFSalSts_Sels, AV84TFSalFecSal, AV55TFSalCodeID, AV56TFSalCodeID_Sel, AV40TFSalExtATCUD, AV41TFSalExtATCUD_Sel, AV81TFSalEnvAT_Sels, AV83TFSalExtAT_Sels, AV86TFSalFhh, AV78TFSalFirma4d, AV79TFSalFirma4d_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77Messages_json, AV61firmad, Gx_date, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV54TFSalExtLis_Sels ;
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV58TFSalSts_Sels ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV84TFSalFecSal ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV55TFSalCodeID ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV56TFSalCodeID_Sel ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV40TFSalExtATCUD ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV41TFSalExtATCUD_Sel ;
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV81TFSalEnvAT_Sels ;
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV83TFSalExtAT_Sels ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV86TFSalFhh ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV78TFSalFirma4d ;
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV79TFSalFirma4d_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70SalExtAlb, AV88SalSts, AV71ManCod, AV72SalExtFec, AV73SalExtFecTo, AV47EmprCod, AV54TFSalExtLis_Sels, AV58TFSalSts_Sels, AV84TFSalFecSal, AV55TFSalCodeID, AV56TFSalCodeID_Sel, AV40TFSalExtATCUD, AV41TFSalExtATCUD_Sel, AV81TFSalEnvAT_Sels, AV83TFSalExtAT_Sels, AV86TFSalFhh, AV78TFSalFirma4d, AV79TFSalFirma4d_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77Messages_json, AV61firmad, Gx_date, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV54TFSalExtLis_Sels ;
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV58TFSalSts_Sels ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV84TFSalFecSal ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV55TFSalCodeID ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV56TFSalCodeID_Sel ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV40TFSalExtATCUD ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV41TFSalExtATCUD_Sel ;
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV81TFSalEnvAT_Sels ;
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV83TFSalExtAT_Sels ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV86TFSalFhh ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV78TFSalFirma4d ;
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV79TFSalFirma4d_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70SalExtAlb, AV88SalSts, AV71ManCod, AV72SalExtFec, AV73SalExtFecTo, AV47EmprCod, AV54TFSalExtLis_Sels, AV58TFSalSts_Sels, AV84TFSalFecSal, AV55TFSalCodeID, AV56TFSalCodeID_Sel, AV40TFSalExtATCUD, AV41TFSalExtATCUD_Sel, AV81TFSalEnvAT_Sels, AV83TFSalExtAT_Sels, AV86TFSalFhh, AV78TFSalFirma4d, AV79TFSalFirma4d_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77Messages_json, AV61firmad, Gx_date, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV54TFSalExtLis_Sels ;
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV58TFSalSts_Sels ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV84TFSalFecSal ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV55TFSalCodeID ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV56TFSalCodeID_Sel ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV40TFSalExtATCUD ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV41TFSalExtATCUD_Sel ;
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV81TFSalEnvAT_Sels ;
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV83TFSalExtAT_Sels ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV86TFSalFhh ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV78TFSalFirma4d ;
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV79TFSalFirma4d_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70SalExtAlb, AV88SalSts, AV71ManCod, AV72SalExtFec, AV73SalExtFecTo, AV47EmprCod, AV54TFSalExtLis_Sels, AV58TFSalSts_Sels, AV84TFSalFecSal, AV55TFSalCodeID, AV56TFSalCodeID_Sel, AV40TFSalExtATCUD, AV41TFSalExtATCUD_Sel, AV81TFSalEnvAT_Sels, AV83TFSalExtAT_Sels, AV86TFSalFhh, AV78TFSalFirma4d, AV79TFSalFirma4d_Sel, AV95Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77Messages_json, AV61firmad, Gx_date, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV95Pgmname = "TrabajosExternos.TrabajoExterno_Header_TRNWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2780( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202782 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV42DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_63 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_63"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV44GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV45GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminardocumento_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Title") ;
         Dvelop_confirmpanel_eliminardocumento_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmationtext") ;
         Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminardocumento_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminardocumento_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalextalb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalextalb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXTALB");
            GX_FocusControl = edtavSalextalb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70SalExtAlb = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70SalExtAlb), 8, 0));
         }
         else
         {
            AV70SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtavSalextalb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70SalExtAlb), 8, 0));
         }
         cmbavSalsts.setName( cmbavSalsts.getInternalname() );
         cmbavSalsts.setValue( httpContext.cgiGet( cmbavSalsts.getInternalname()) );
         AV88SalSts = httpContext.cgiGet( cmbavSalsts.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88SalSts", AV88SalSts);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMancod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMancod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMANCOD");
            GX_FocusControl = edtavMancod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71ManCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ManCod), 4, 0));
         }
         else
         {
            AV71ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavMancod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ManCod), 4, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavSalextfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vSALEXTFEC");
            GX_FocusControl = edtavSalextfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72SalExtFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72SalExtFec", localUtil.format(AV72SalExtFec, "99/99/99"));
         }
         else
         {
            AV72SalExtFec = localUtil.ctod( httpContext.cgiGet( edtavSalextfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72SalExtFec", localUtil.format(AV72SalExtFec, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavSalextfecto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vSALEXTFECTO");
            GX_FocusControl = edtavSalextfecto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73SalExtFecTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73SalExtFecTo", localUtil.format(AV73SalExtFecTo, "99/99/99"));
         }
         else
         {
            AV73SalExtFecTo = localUtil.ctod( httpContext.cgiGet( edtavSalextfecto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73SalExtFecTo", localUtil.format(AV73SalExtFecTo, "99/99/99"));
         }
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_salfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_SALFECSALAUXDATE");
            GX_FocusControl = edtavDdo_salfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85DDO_SalFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85DDO_SalFecSalAuxDate", localUtil.format(AV85DDO_SalFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV85DDO_SalFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_salfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85DDO_SalFecSalAuxDate", localUtil.format(AV85DDO_SalFecSalAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_salfhhauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_SALFHHAUXDATE");
            GX_FocusControl = edtavDdo_salfhhauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV87DDO_SalFhhAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87DDO_SalFhhAuxDate", localUtil.format(AV87DDO_SalFhhAuxDate, "99/99/99"));
         }
         else
         {
            AV87DDO_SalFhhAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_salfhhauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87DDO_SalFhhAuxDate", localUtil.format(AV87DDO_SalFhhAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_63_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
         if ( nGXsfl_63_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV46GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridActions), 4, 0));
            A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2249ManNom = httpContext.cgiGet( edtManNom_Internalname) ;
            n2249ManNom = false ;
            cmbSalExtLis.setName( cmbSalExtLis.getInternalname() );
            cmbSalExtLis.setValue( httpContext.cgiGet( cmbSalExtLis.getInternalname()) );
            A2258SalExtLis = (byte)(GXutil.lval( httpContext.cgiGet( cmbSalExtLis.getInternalname()))) ;
            cmbSalSts.setName( cmbSalSts.getInternalname() );
            cmbSalSts.setValue( httpContext.cgiGet( cmbSalSts.getInternalname()) );
            A10080SalSts = httpContext.cgiGet( cmbSalSts.getInternalname()) ;
            A2256SalExtFec = localUtil.ctod( httpContext.cgiGet( edtSalExtFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A14398SalFecSal = localUtil.ctod( httpContext.cgiGet( edtSalFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A6396SalExtHor = httpContext.cgiGet( edtSalExtHor_Internalname) ;
            A10742SalCodeID = httpContext.cgiGet( edtSalCodeID_Internalname) ;
            A14348SalExtATCU = httpContext.cgiGet( edtSalExtATCU_Internalname) ;
            cmbSalEnvAT.setName( cmbSalEnvAT.getInternalname() );
            cmbSalEnvAT.setValue( httpContext.cgiGet( cmbSalEnvAT.getInternalname()) );
            A10741SalEnvAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbSalEnvAT.getInternalname()))) ;
            cmbSalExtAT.setName( cmbSalExtAT.getInternalname() );
            cmbSalExtAT.setValue( httpContext.cgiGet( cmbSalExtAT.getInternalname()) );
            A10767SalExtAT = httpContext.cgiGet( cmbSalExtAT.getInternalname()) ;
            A10076SalFhh = localUtil.ctot( httpContext.cgiGet( edtSalFhh_Internalname)) ;
            A14373SalFirma4d = httpContext.cgiGet( edtSalFirma4d_Internalname) ;
            A10077SalFmd = httpContext.cgiGet( edtSalFmd_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Header_TRNWW");
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_header_trnww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vSALEXTALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV70SalExtAlb )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vSALSTS"), AV88SalSts) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vMANCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV71ManCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vSALEXTFEC"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV72SalExtFec)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vSALEXTFECTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV73SalExtFecTo)) ) )
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
      e202782 ();
      if (returnInSub) return;
   }

   public void e202782( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV88SalSts = "T" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88SalSts", AV88SalSts);
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts())==0) )
      {
         AV88SalSts = "T" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88SalSts", AV88SalSts);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto())) )
      {
         AV72SalExtFec = AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72SalExtFec", localUtil.format(AV72SalExtFec, "99/99/99"));
         AV73SalExtFecTo = AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73SalExtFecTo", localUtil.format(AV73SalExtFecTo, "99/99/99"));
      }
      else
      {
         if ( (0==AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb()) )
         {
            AV72SalExtFec = GXutil.dadd(GXutil.today( ),-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72SalExtFec", localUtil.format(AV72SalExtFec, "99/99/99"));
            AV73SalExtFecTo = GXutil.today( ) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73SalExtFecTo", localUtil.format(AV73SalExtFecTo, "99/99/99"));
         }
      }
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_header_trnww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      GXv_char2[0] = AV47EmprCod ;
      GXv_char3[0] = AV51EmprNom ;
      GXv_char4[0] = AV52UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_header_trnww_impl.this.AV47EmprCod = GXv_char2[0] ;
      trabajoexterno_header_trnww_impl.this.AV51EmprNom = GXv_char3[0] ;
      trabajoexterno_header_trnww_impl.this.AV52UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Trabajo Externo (Header)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV42DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV42DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV61firmad) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV47EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int8) ;
      trabajoexterno_header_trnww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV61firmad = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61firmad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61firmad), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61firmad), "ZZZ9")));
   }

   public void e212782( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV44GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridCurrentPage), 10, 0));
      AV45GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_63_Refreshing);
      edtSalExtAlb_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Columnheaderclass", edtSalExtAlb_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtManCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Columnheaderclass", edtManCod_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtManNom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtManNom_Internalname, "Columnheaderclass", edtManNom_Columnheaderclass, !bGXsfl_63_Refreshing);
      cmbSalExtLis.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalExtLis.getInternalname(), "Columnheaderclass", cmbSalExtLis.getColumnHeaderClass(), !bGXsfl_63_Refreshing);
      cmbSalSts.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalSts.getInternalname(), "Columnheaderclass", cmbSalSts.getColumnHeaderClass(), !bGXsfl_63_Refreshing);
      edtSalExtFec_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtFec_Internalname, "Columnheaderclass", edtSalExtFec_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtSalFecSal_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFecSal_Internalname, "Columnheaderclass", edtSalFecSal_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtSalExtHor_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtHor_Internalname, "Columnheaderclass", edtSalExtHor_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtSalCodeID_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalCodeID_Internalname, "Columnheaderclass", edtSalCodeID_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtSalExtATCU_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtATCU_Internalname, "Columnheaderclass", edtSalExtATCU_Columnheaderclass, !bGXsfl_63_Refreshing);
      cmbSalEnvAT.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalEnvAT.getInternalname(), "Columnheaderclass", cmbSalEnvAT.getColumnHeaderClass(), !bGXsfl_63_Refreshing);
      cmbSalExtAT.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalExtAT.getInternalname(), "Columnheaderclass", cmbSalExtAT.getColumnHeaderClass(), !bGXsfl_63_Refreshing);
      edtSalFhh_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFhh_Internalname, "Columnheaderclass", edtSalFhh_Columnheaderclass, !bGXsfl_63_Refreshing);
      edtSalFirma4d_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFirma4d_Internalname, "Columnheaderclass", edtSalFirma4d_Columnheaderclass, !bGXsfl_63_Refreshing);
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = AV54TFSalExtLis_Sels ;
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = AV58TFSalSts_Sels ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = AV84TFSalFecSal ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = AV55TFSalCodeID ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = AV56TFSalCodeID_Sel ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = AV40TFSalExtATCUD ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = AV41TFSalExtATCUD_Sel ;
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = AV81TFSalEnvAT_Sels ;
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = AV83TFSalExtAT_Sels ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = AV86TFSalFhh ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = AV78TFSalFirma4d ;
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = AV79TFSalFirma4d_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112782( )
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
         AV43PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV43PageToGo) ;
      }
   }

   public void e122782( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132782( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExtLis") == 0 )
         {
            AV53TFSalExtLis_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFSalExtLis_SelsJson", AV53TFSalExtLis_SelsJson);
            AV54TFSalExtLis_Sels.fromJSonString(GXutil.strReplace( AV53TFSalExtLis_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalSts") == 0 )
         {
            AV57TFSalSts_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFSalSts_SelsJson", AV57TFSalSts_SelsJson);
            AV58TFSalSts_Sels.fromJSonString(AV57TFSalSts_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalFecSal") == 0 )
         {
            AV84TFSalFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFSalFecSal", localUtil.format(AV84TFSalFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalCodeID") == 0 )
         {
            AV55TFSalCodeID = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFSalCodeID", AV55TFSalCodeID);
            AV56TFSalCodeID_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFSalCodeID_Sel", AV56TFSalCodeID_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExtATCUD") == 0 )
         {
            AV40TFSalExtATCUD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFSalExtATCUD", AV40TFSalExtATCUD);
            AV41TFSalExtATCUD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFSalExtATCUD_Sel", AV41TFSalExtATCUD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalEnvAT") == 0 )
         {
            AV80TFSalEnvAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFSalEnvAT_SelsJson", AV80TFSalEnvAT_SelsJson);
            AV81TFSalEnvAT_Sels.fromJSonString(GXutil.strReplace( AV80TFSalEnvAT_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExtAT") == 0 )
         {
            AV82TFSalExtAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFSalExtAT_SelsJson", AV82TFSalExtAT_SelsJson);
            AV83TFSalExtAT_Sels.fromJSonString(AV82TFSalExtAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalFhh") == 0 )
         {
            AV86TFSalFhh = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFSalFhh", localUtil.ttoc( AV86TFSalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalFirma4d") == 0 )
         {
            AV78TFSalFirma4d = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFSalFirma4d", AV78TFSalFirma4d);
            AV79TFSalFirma4d_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFSalFirma4d_Sel", AV79TFSalFirma4d_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV83TFSalExtAT_Sels", AV83TFSalExtAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81TFSalEnvAT_Sels", AV81TFSalEnvAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV58TFSalSts_Sels", AV58TFSalSts_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54TFSalExtLis_Sels", AV54TFSalExtLis_Sels);
   }

   private void e222782( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Anular GUIA", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Lineas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Generar HASH", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Envio AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Entrada Manual Codigo de AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.setColumnClass( ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtSalExtAlb_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtManCod_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtManNom_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbSalExtLis.setColumnClass( ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      cmbSalSts.setColumnClass( ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      edtSalExtFec_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtSalFecSal_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtSalExtHor_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtSalCodeID_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtSalExtATCU_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbSalEnvAT.setColumnClass( ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      cmbSalExtAT.setColumnClass( ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      edtSalFhh_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtSalFirma4d_Columnclass = ((GXutil.strcmp(A10080SalSts, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(63) ;
      }
      sendrow_632( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_63_Refreshing )
      {
         httpContext.doAjaxLoad(63, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV46GridActions, 4, 0)) );
   }

   public void e232782( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV46GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ANULARGUIA' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 4 )
      {
         /* Execute user subroutine: 'DO LINEASV02' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 5 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 6 )
      {
         /* Execute user subroutine: 'DO HASH' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 7 )
      {
         /* Execute user subroutine: 'DO ENVIOAT' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 8 )
      {
         /* Execute user subroutine: 'DO ELIMINARDOCUMENTO' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV46GridActions == 9 )
      {
         /* Execute user subroutine: 'DO MANUALCODIGOAT' */
         S242 ();
         if (returnInSub) return;
      }
      AV46GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV46GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142782( )
   {
      /* Dvelop_confirmpanel_eliminardocumento_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminardocumento_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARDOCUMENTO' */
         S252 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e152782( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.trabajosexternos.trabajoexterno_header_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","SalExtAlb"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
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
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.trabajosexternos.trabajoexterno_header_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0))}, new String[] {"Mode","EmprCod","SalExtAlb"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S172( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", A10742SalCodeID)==0) || ( A10741SalEnvAT == 3 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
      }
      else
      {
         callWebObject(formatLink("app.trabajosexternos.trabajoexterno_header_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0))}, new String[] {"Mode","EmprCod","SalExtAlb"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S182( )
   {
      /* 'DO ANULARGUIA' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A10080SalSts, "A") == 0 )
      {
         Gx_msg = httpContext.getMessage( "Este Guia foi ANULADA", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( (GXutil.strcmp("", A10742SalCodeID)==0) )
         {
            Gx_msg = httpContext.getMessage( "Este guia não tem código AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A10741SalEnvAT == 0 )
            {
               Gx_msg = httpContext.getMessage( "Este guia não foi enviado para a AT", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_anulacion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A2256SalExtFec)),GXutil.URLEncode(GXutil.formatDateParm(A14398SalFecSal)),GXutil.URLEncode(GXutil.rtrim(A6396SalExtHor)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10076SalFhh)),GXutil.URLEncode(GXutil.rtrim(A10742SalCodeID))}, new String[] {"EmprCod","SalExtAlb","SalExtFec","SalFecSal","SalExtHor","SalFhh","SalCodeID"}) , new Object[] {});
            }
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO LINEASV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.trabajoexterno_detail__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A2256SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10076SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(A2248ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(A2249ManNom)),GXutil.URLEncode(GXutil.rtrim(A10742SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(A10741SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV65Hash)),GXutil.URLEncode(GXutil.booltostr(AV67ok)),GXutil.URLEncode(GXutil.rtrim(AV77Messages_json))}, new String[] {"Emprcod","SalExtAlb","SalExtFec","SalFhh","ManCod","ManNom","SalCodeID","SalEnvAT","HashIN","okIN","Messages_jsonIN"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_impresion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0))}, new String[] {"Emprcod","SalExtAlb"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO HASH' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV47EmprCod ;
      GXv_int10[0] = A2253SalExtAlb ;
      GXv_date11[0] = A2256SalExtFec ;
      GXv_dtime12[0] = A10076SalFhh ;
      GXv_char3[0] = AV64Cadena ;
      GXv_char2[0] = AV69firma ;
      new app.trabajosexternos.trabajoexterno_actualizohash_cadenaparahash(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_date11, GXv_dtime12, GXv_char3, GXv_char2) ;
      trabajoexterno_header_trnww_impl.this.AV47EmprCod = GXv_char4[0] ;
      trabajoexterno_header_trnww_impl.this.A2253SalExtAlb = GXv_int10[0] ;
      trabajoexterno_header_trnww_impl.this.A2256SalExtFec = GXv_date11[0] ;
      trabajoexterno_header_trnww_impl.this.A10076SalFhh = GXv_dtime12[0] ;
      trabajoexterno_header_trnww_impl.this.AV64Cadena = GXv_char3[0] ;
      trabajoexterno_header_trnww_impl.this.AV69firma = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV64Cadena", AV64Cadena);
      GXv_char4[0] = AV65Hash ;
      GXv_objcol_SdtMessages_Message13[0] = AV66Messages ;
      GXv_boolean14[0] = AV67ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV64Cadena, GXv_char4, GXv_objcol_SdtMessages_Message13, GXv_boolean14) ;
      trabajoexterno_header_trnww_impl.this.AV65Hash = GXv_char4[0] ;
      AV66Messages = GXv_objcol_SdtMessages_Message13[0] ;
      trabajoexterno_header_trnww_impl.this.AV67ok = GXv_boolean14[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Hash", AV65Hash);
      httpContext.ajax_rsp_assign_attri("", false, "AV67ok", AV67ok);
      if ( AV67ok )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
         GXv_char4[0] = AV47EmprCod ;
         GXv_int10[0] = A2253SalExtAlb ;
         GXv_char3[0] = AV64Cadena ;
         GXv_char2[0] = AV65Hash ;
         new app.trabajosexternos.trabajoexterno_actualizohash(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2) ;
         trabajoexterno_header_trnww_impl.this.AV47EmprCod = GXv_char4[0] ;
         trabajoexterno_header_trnww_impl.this.A2253SalExtAlb = GXv_int10[0] ;
         trabajoexterno_header_trnww_impl.this.AV64Cadena = GXv_char3[0] ;
         trabajoexterno_header_trnww_impl.this.AV65Hash = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV64Cadena", AV64Cadena);
         httpContext.ajax_rsp_assign_attri("", false, "AV65Hash", AV65Hash);
      }
      else
      {
         AV109GXV1 = 1 ;
         while ( AV109GXV1 <= AV66Messages.size() )
         {
            AV68Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV66Messages.elementAt(-1+AV109GXV1));
            httpContext.GX_msglist.addItem(AV68Message.getgxTv_SdtMessages_Message_Description());
            AV109GXV1 = (int)(AV109GXV1+1) ;
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO ENVIOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A10742SalCodeID, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A10742SalCodeID ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A10741SalEnvAT == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_diahorasalida_hash_xml", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A2256SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10076SalFhh)),GXutil.URLEncode(GXutil.rtrim(AV64Cadena)),GXutil.URLEncode(GXutil.rtrim(AV65Hash))}, new String[] {"EmprCod","SalExtAlb","SalExtFec","SalFhh","Cadena","Hash"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S232( )
   {
      /* 'DO ELIMINARDOCUMENTO' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", A10742SalCodeID)==0) || ( A10741SalEnvAT == 3 ) && ( AV61firmad == 1 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
      }
      else
      {
         if ( GXutil.strcmp(A10080SalSts, "A") == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran ANULADO", ""));
         }
         else
         {
            AV110Emprcod_selected = A396EmprCod ;
            AV111Salextalb_selected = A2253SalExtAlb ;
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer", "Confirm", "", new Object[] {});
         }
      }
   }

   public void S252( )
   {
      /* 'DO ACTION ELIMINARDOCUMENTO' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV47EmprCod ;
      GXv_int10[0] = A2253SalExtAlb ;
      new app.phdrde6(remoteHandle, context).execute( GXv_char4, GXv_int10) ;
      trabajoexterno_header_trnww_impl.this.AV47EmprCod = GXv_char4[0] ;
      trabajoexterno_header_trnww_impl.this.A2253SalExtAlb = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47EmprCod", AV47EmprCod);
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO MANUALCODIGOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A10742SalCodeID, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A10742SalCodeID ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A10741SalEnvAT == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_entradamanualcodigoat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV47EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A2256SalExtFec)),GXutil.URLEncode(GXutil.formatDateParm(A14398SalFecSal)),GXutil.URLEncode(GXutil.rtrim(A6396SalExtHor)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10076SalFhh))}, new String[] {"Emprcod","SalExtAlb","SalExtFec","SalFecSal","SalExtHor","SalFhh"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV95Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV95Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV95Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV112GXV2 = 1 ;
      while ( AV112GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV112GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTLIS_SEL") == 0 )
         {
            AV53TFSalExtLis_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFSalExtLis_SelsJson", AV53TFSalExtLis_SelsJson);
            AV54TFSalExtLis_Sels.fromJSonString(AV53TFSalExtLis_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALSTS_SEL") == 0 )
         {
            AV57TFSalSts_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFSalSts_SelsJson", AV57TFSalSts_SelsJson);
            AV58TFSalSts_Sels.fromJSonString(AV57TFSalSts_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFECSAL") == 0 )
         {
            AV84TFSalFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84TFSalFecSal", localUtil.format(AV84TFSalFecSal, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALCODEID") == 0 )
         {
            AV55TFSalCodeID = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFSalCodeID", AV55TFSalCodeID);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALCODEID_SEL") == 0 )
         {
            AV56TFSalCodeID_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFSalCodeID_Sel", AV56TFSalCodeID_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTATCUD") == 0 )
         {
            AV40TFSalExtATCUD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFSalExtATCUD", AV40TFSalExtATCUD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTATCUD_SEL") == 0 )
         {
            AV41TFSalExtATCUD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFSalExtATCUD_Sel", AV41TFSalExtATCUD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALENVAT_SEL") == 0 )
         {
            AV80TFSalEnvAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFSalEnvAT_SelsJson", AV80TFSalEnvAT_SelsJson);
            AV81TFSalEnvAT_Sels.fromJSonString(AV80TFSalEnvAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXTAT_SEL") == 0 )
         {
            AV82TFSalExtAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFSalExtAT_SelsJson", AV82TFSalExtAT_SelsJson);
            AV83TFSalExtAT_Sels.fromJSonString(AV82TFSalExtAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFHH") == 0 )
         {
            AV86TFSalFhh = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFSalFhh", localUtil.ttoc( AV86TFSalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV87DDO_SalFhhAuxDate = GXutil.resetTime(AV86TFSalFhh) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87DDO_SalFhhAuxDate", localUtil.format(AV87DDO_SalFhhAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFIRMA4D") == 0 )
         {
            AV78TFSalFirma4d = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFSalFirma4d", AV78TFSalFirma4d);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALFIRMA4D_SEL") == 0 )
         {
            AV79TFSalFirma4d_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79TFSalFirma4d_Sel", AV79TFSalFirma4d_Sel);
         }
         AV112GXV2 = (int)(AV112GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV58TFSalSts_Sels.size()==0), AV57TFSalSts_SelsJson, GXv_char4) ;
      trabajoexterno_header_trnww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFSalCodeID_Sel)==0), AV56TFSalCodeID_Sel, GXv_char3) ;
      trabajoexterno_header_trnww_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char16 = "" ;
      GXv_char2[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFSalExtATCUD_Sel)==0), AV41TFSalExtATCUD_Sel, GXv_char2) ;
      trabajoexterno_header_trnww_impl.this.GXt_char16 = GXv_char2[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV83TFSalExtAT_Sels.size()==0), AV82TFSalExtAT_SelsJson, GXv_char18) ;
      trabajoexterno_header_trnww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV79TFSalFirma4d_Sel)==0), AV79TFSalFirma4d_Sel, GXv_char20) ;
      trabajoexterno_header_trnww_impl.this.GXt_char19 = GXv_char20[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+((AV54TFSalExtLis_Sels.size()==0) ? "" : AV53TFSalExtLis_SelsJson)+"|"+GXt_char1+"||||"+GXt_char15+"|"+GXt_char16+"|"+((AV81TFSalEnvAT_Sels.size()==0) ? "" : AV80TFSalEnvAT_SelsJson)+"|"+GXt_char17+"||"+GXt_char19 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char20[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFSalCodeID)==0), AV55TFSalCodeID, GXv_char20) ;
      trabajoexterno_header_trnww_impl.this.GXt_char19 = GXv_char20[0] ;
      GXt_char17 = "" ;
      GXv_char18[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFSalExtATCUD)==0), AV40TFSalExtATCUD, GXv_char18) ;
      trabajoexterno_header_trnww_impl.this.GXt_char17 = GXv_char18[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV78TFSalFirma4d)==0), AV78TFSalFirma4d, GXv_char4) ;
      trabajoexterno_header_trnww_impl.this.GXt_char16 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = "||||||"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFSalFecSal)) ? "" : localUtil.dtoc( AV84TFSalFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"||"+GXt_char19+"|"+GXt_char17+"|||"+(GXutil.dateCompare(GXutil.nullDate(), AV86TFSalFhh) ? "" : localUtil.dtoc( AV87DDO_SalFhhAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV95Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALEXTLIS_SEL", "", !(AV54TFSalExtLis_Sels.size()==0), (short)(0), AV54TFSalExtLis_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALSTS_SEL", "", !(AV58TFSalSts_Sels.size()==0), (short)(0), AV58TFSalSts_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV84TFSalFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV84TFSalFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALCODEID", "", !(GXutil.strcmp("", AV55TFSalCodeID)==0), (short)(0), AV55TFSalCodeID, "", !(GXutil.strcmp("", AV56TFSalCodeID_Sel)==0), AV56TFSalCodeID_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALEXTATCUD", "", !(GXutil.strcmp("", AV40TFSalExtATCUD)==0), (short)(0), AV40TFSalExtATCUD, "", !(GXutil.strcmp("", AV41TFSalExtATCUD_Sel)==0), AV41TFSalExtATCUD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALENVAT_SEL", "", !(AV81TFSalEnvAT_Sels.size()==0), (short)(0), AV81TFSalEnvAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALEXTAT_SEL", "", !(AV83TFSalExtAT_Sels.size()==0), (short)(0), AV83TFSalExtAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALFHH", "", !GXutil.dateCompare(GXutil.nullDate(), AV86TFSalFhh), (short)(0), GXutil.trim( localUtil.ttoc( AV86TFSalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFSALFIRMA4D", "", !(GXutil.strcmp("", AV78TFSalFirma4d)==0), (short)(0), AV78TFSalFirma4d, "", !(GXutil.strcmp("", AV79TFSalFirma4d_Sel)==0), AV79TFSalFirma4d_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV95Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TrabajosExternos.TrabajoExterno_Header_TRN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e162782( )
   {
      /* Mancod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91FilterTrabajoExterno_Header_TRNWW", AV91FilterTrabajoExterno_Header_TRNWW);
   }

   public void e172782( )
   {
      /* Salextalb_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV70SalExtAlb) )
      {
         AV72SalExtFec = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72SalExtFec", localUtil.format(AV72SalExtFec, "99/99/99"));
         AV73SalExtFecTo = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73SalExtFecTo", localUtil.format(AV73SalExtFecTo, "99/99/99"));
         AV71ManCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ManCod), 4, 0));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S262 ();
         if (returnInSub) return;
      }
      else
      {
         AV72SalExtFec = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72SalExtFec", localUtil.format(AV72SalExtFec, "99/99/99"));
         AV73SalExtFecTo = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73SalExtFecTo", localUtil.format(AV73SalExtFecTo, "99/99/99"));
         AV71ManCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ManCod), 4, 0));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91FilterTrabajoExterno_Header_TRNWW", AV91FilterTrabajoExterno_Header_TRNWW);
   }

   public void e182782( )
   {
      /* Salextfec_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91FilterTrabajoExterno_Header_TRNWW", AV91FilterTrabajoExterno_Header_TRNWW);
   }

   public void e192782( )
   {
      /* Salextfecto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91FilterTrabajoExterno_Header_TRNWW", AV91FilterTrabajoExterno_Header_TRNWW);
   }

   public void e242782( )
   {
      /* SalSts_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV91FilterTrabajoExterno_Header_TRNWW", AV91FilterTrabajoExterno_Header_TRNWW);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV91FilterTrabajoExterno_Header_TRNWW.fromJSonString(AV92WebSession.getValue(httpContext.getMessage( "FilterTrabajoExterno_Header_TRNWW", "")), null);
      AV70SalExtAlb = AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70SalExtAlb), 8, 0));
      AV88SalSts = AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88SalSts", AV88SalSts);
      AV71ManCod = AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71ManCod), 4, 0));
      AV72SalExtFec = AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72SalExtFec", localUtil.format(AV72SalExtFec, "99/99/99"));
      AV73SalExtFecTo = AV91FilterTrabajoExterno_Header_TRNWW.getgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73SalExtFecTo", localUtil.format(AV73SalExtFecTo, "99/99/99"));
   }

   public void S262( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV91FilterTrabajoExterno_Header_TRNWW.setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod( AV71ManCod );
      AV91FilterTrabajoExterno_Header_TRNWW.setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb( AV70SalExtAlb );
      AV91FilterTrabajoExterno_Header_TRNWW.setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts( AV88SalSts );
      AV91FilterTrabajoExterno_Header_TRNWW.setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec( AV72SalExtFec );
      AV91FilterTrabajoExterno_Header_TRNWW.setgxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto( AV73SalExtFecTo );
      AV92WebSession.setValue(httpContext.getMessage( "FilterTrabajoExterno_Header_TRNWW", ""), AV91FilterTrabajoExterno_Header_TRNWW.toJSonString(false, true));
   }

   public void wb_table3_94_2782( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, tblTabledvelop_confirmpanel_eliminardocumento_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminardocumento.setProperty("Title", Dvelop_confirmpanel_eliminardocumento_Title);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminardocumento_Confirmationtext);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminardocumento.setProperty("ConfirmType", Dvelop_confirmpanel_eliminardocumento_Confirmtype);
         ucDvelop_confirmpanel_eliminardocumento.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminardocumento_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_94_2782e( true) ;
      }
      else
      {
         wb_table3_94_2782e( false) ;
      }
   }

   public void wb_table2_52_2782( boolean wbgen )
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
         wb_table2_52_2782e( true) ;
      }
      else
      {
         wb_table2_52_2782e( false) ;
      }
   }

   public void wb_table1_17_2782( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedactiongroup_actions_Internalname, tblTablemergedactiongroup_actions_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 63, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablesalextalb_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksalextalb_Internalname, httpContext.getMessage( "Nº Guia", ""), "", "", lblTextblocksalextalb_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextalb_Internalname, httpContext.getMessage( "Sal Ext Alb", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_63_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextalb_Internalname, GXutil.ltrim( localUtil.ntoc( AV70SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalextalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV70SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextalb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextalb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRNWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_2782e( true) ;
      }
      else
      {
         wb_table1_17_2782e( false) ;
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
      pa2782( ) ;
      ws2782( ) ;
      we2782( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615133", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_header_trnww.js", "?20268211615133", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_632( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_63_idx );
      edtSalExtAlb_Internalname = "SALEXTALB_"+sGXsfl_63_idx ;
      edtManCod_Internalname = "MANCOD_"+sGXsfl_63_idx ;
      edtManNom_Internalname = "MANNOM_"+sGXsfl_63_idx ;
      cmbSalExtLis.setInternalname( "SALEXTLIS_"+sGXsfl_63_idx );
      cmbSalSts.setInternalname( "SALSTS_"+sGXsfl_63_idx );
      edtSalExtFec_Internalname = "SALEXTFEC_"+sGXsfl_63_idx ;
      edtSalFecSal_Internalname = "SALFECSAL_"+sGXsfl_63_idx ;
      edtSalExtHor_Internalname = "SALEXTHOR_"+sGXsfl_63_idx ;
      edtSalCodeID_Internalname = "SALCODEID_"+sGXsfl_63_idx ;
      edtSalExtATCU_Internalname = "SALEXTATCU_"+sGXsfl_63_idx ;
      cmbSalEnvAT.setInternalname( "SALENVAT_"+sGXsfl_63_idx );
      cmbSalExtAT.setInternalname( "SALEXTAT_"+sGXsfl_63_idx );
      edtSalFhh_Internalname = "SALFHH_"+sGXsfl_63_idx ;
      edtSalFirma4d_Internalname = "SALFIRMA4D_"+sGXsfl_63_idx ;
      edtSalFmd_Internalname = "SALFMD_"+sGXsfl_63_idx ;
   }

   public void subsflControlProps_fel_632( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_63_fel_idx );
      edtSalExtAlb_Internalname = "SALEXTALB_"+sGXsfl_63_fel_idx ;
      edtManCod_Internalname = "MANCOD_"+sGXsfl_63_fel_idx ;
      edtManNom_Internalname = "MANNOM_"+sGXsfl_63_fel_idx ;
      cmbSalExtLis.setInternalname( "SALEXTLIS_"+sGXsfl_63_fel_idx );
      cmbSalSts.setInternalname( "SALSTS_"+sGXsfl_63_fel_idx );
      edtSalExtFec_Internalname = "SALEXTFEC_"+sGXsfl_63_fel_idx ;
      edtSalFecSal_Internalname = "SALFECSAL_"+sGXsfl_63_fel_idx ;
      edtSalExtHor_Internalname = "SALEXTHOR_"+sGXsfl_63_fel_idx ;
      edtSalCodeID_Internalname = "SALCODEID_"+sGXsfl_63_fel_idx ;
      edtSalExtATCU_Internalname = "SALEXTATCU_"+sGXsfl_63_fel_idx ;
      cmbSalEnvAT.setInternalname( "SALENVAT_"+sGXsfl_63_fel_idx );
      cmbSalExtAT.setInternalname( "SALEXTAT_"+sGXsfl_63_fel_idx );
      edtSalFhh_Internalname = "SALFHH_"+sGXsfl_63_fel_idx ;
      edtSalFirma4d_Internalname = "SALFIRMA4D_"+sGXsfl_63_fel_idx ;
      edtSalFmd_Internalname = "SALFMD_"+sGXsfl_63_fel_idx ;
   }

   public void sendrow_632( )
   {
      subsflControlProps_632( ) ;
      wb2780( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_63_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_63_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_63_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_63_idx+"',63)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_63_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV46GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV46GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV46GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_63_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,64);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV46GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_63_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtAlb_Internalname,GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtAlb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalExtAlb_Columnclass,edtSalExtAlb_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManCod_Internalname,GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtManCod_Columnclass,edtManCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtManNom_Internalname,GXutil.rtrim( A2249ManNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtManNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtManNom_Columnclass,edtManNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbSalExtLis.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SALEXTLIS_" + sGXsfl_63_idx ;
            cmbSalExtLis.setName( GXCCtl );
            cmbSalExtLis.setWebtags( "" );
            cmbSalExtLis.addItem("1", httpContext.getMessage( "Impreso", ""), (short)(0));
            cmbSalExtLis.addItem("0", httpContext.getMessage( "No Impreso", ""), (short)(0));
            if ( cmbSalExtLis.getItemCount() > 0 )
            {
               A2258SalExtLis = (byte)(GXutil.lval( cmbSalExtLis.getValidValue(GXutil.trim( GXutil.str( A2258SalExtLis, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbSalExtLis,cmbSalExtLis.getInternalname(),GXutil.trim( GXutil.str( A2258SalExtLis, 1, 0)),Integer.valueOf(1),cmbSalExtLis.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbSalExtLis.getColumnClass(),cmbSalExtLis.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbSalExtLis.setValue( GXutil.trim( GXutil.str( A2258SalExtLis, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSalExtLis.getInternalname(), "Values", cmbSalExtLis.ToJavascriptSource(), !bGXsfl_63_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbSalSts.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SALSTS_" + sGXsfl_63_idx ;
            cmbSalSts.setName( GXCCtl );
            cmbSalSts.setWebtags( "" );
            cmbSalSts.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
            cmbSalSts.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            cmbSalSts.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
            if ( cmbSalSts.getItemCount() > 0 )
            {
               A10080SalSts = cmbSalSts.getValidValue(A10080SalSts) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbSalSts,cmbSalSts.getInternalname(),GXutil.rtrim( A10080SalSts),Integer.valueOf(1),cmbSalSts.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbSalSts.getColumnClass(),cmbSalSts.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbSalSts.setValue( GXutil.rtrim( A10080SalSts) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSalSts.getInternalname(), "Values", cmbSalSts.ToJavascriptSource(), !bGXsfl_63_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtFec_Internalname,localUtil.format(A2256SalExtFec, "99/99/99"),localUtil.format( A2256SalExtFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalExtFec_Columnclass,edtSalExtFec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalFecSal_Internalname,localUtil.format(A14398SalFecSal, "99/99/99"),localUtil.format( A14398SalFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalFecSal_Columnclass,edtSalFecSal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtHor_Internalname,GXutil.rtrim( A6396SalExtHor),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalExtHor_Columnclass,edtSalExtHor_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalCodeID_Internalname,GXutil.rtrim( A10742SalCodeID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalCodeID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalCodeID_Columnclass,edtSalCodeID_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExtATCU_Internalname,GXutil.rtrim( A14348SalExtATCU),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExtATCU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalExtATCU_Columnclass,edtSalExtATCU_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbSalEnvAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SALENVAT_" + sGXsfl_63_idx ;
            cmbSalEnvAT.setName( GXCCtl );
            cmbSalEnvAT.setWebtags( "" );
            cmbSalEnvAT.addItem("0", httpContext.getMessage( "Pdte. Envio AT", ""), (short)(0));
            cmbSalEnvAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
            if ( cmbSalEnvAT.getItemCount() > 0 )
            {
               A10741SalEnvAT = (byte)(GXutil.lval( cmbSalEnvAT.getValidValue(GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbSalEnvAT,cmbSalEnvAT.getInternalname(),GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0)),Integer.valueOf(1),cmbSalEnvAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbSalEnvAT.getColumnClass(),cmbSalEnvAT.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbSalEnvAT.setValue( GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSalEnvAT.getInternalname(), "Values", cmbSalEnvAT.ToJavascriptSource(), !bGXsfl_63_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbSalExtAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SALEXTAT_" + sGXsfl_63_idx ;
            cmbSalExtAT.setName( GXCCtl );
            cmbSalExtAT.setWebtags( "" );
            cmbSalExtAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
            cmbSalExtAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
            if ( cmbSalExtAT.getItemCount() > 0 )
            {
               A10767SalExtAT = cmbSalExtAT.getValidValue(A10767SalExtAT) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbSalExtAT,cmbSalExtAT.getInternalname(),GXutil.rtrim( A10767SalExtAT),Integer.valueOf(1),cmbSalExtAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbSalExtAT.getColumnClass(),cmbSalExtAT.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbSalExtAT.setValue( GXutil.rtrim( A10767SalExtAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSalExtAT.getInternalname(), "Values", cmbSalExtAT.ToJavascriptSource(), !bGXsfl_63_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalFhh_Internalname,localUtil.ttoc( A10076SalFhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10076SalFhh, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalFhh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalFhh_Columnclass,edtSalFhh_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalFirma4d_Internalname,GXutil.rtrim( A14373SalFirma4d),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalFirma4d_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtSalFirma4d_Columnclass,edtSalFirma4d_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalFmd_Internalname,GXutil.rtrim( A10077SalFmd),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalFmd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(63),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2782( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_63_idx = ((subGrid_Islastpage==1)&&(nGXsfl_63_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_63_idx+1) ;
         sGXsfl_63_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_63_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_632( ) ;
      }
      /* End function sendrow_632 */
   }

   public void startgridcontrol63( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"63\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Manufacturador", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATCUD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A/M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV46GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalExtAlb_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalExtAlb_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtManCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtManCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2249ManNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtManNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtManNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2258SalExtLis, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbSalExtLis.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbSalExtLis.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10080SalSts));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbSalSts.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbSalSts.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A2256SalExtFec, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalExtFec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalExtFec_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A14398SalFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalFecSal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalFecSal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6396SalExtHor));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalExtHor_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalExtHor_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10742SalCodeID));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalCodeID_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalCodeID_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14348SalExtATCU));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalExtATCU_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalExtATCU_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10741SalEnvAT, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbSalEnvAT.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbSalEnvAT.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10767SalExtAT));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbSalExtAT.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbSalExtAT.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10076SalFhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalFhh_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalFhh_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14373SalFirma4d));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtSalFirma4d_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtSalFirma4d_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10077SalFmd));
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
      lblTextblocksalextalb_Internalname = "TEXTBLOCKSALEXTALB" ;
      edtavSalextalb_Internalname = "vSALEXTALB" ;
      divUnnamedtablesalextalb_Internalname = "UNNAMEDTABLESALEXTALB" ;
      tblTablemergedactiongroup_actions_Internalname = "TABLEMERGEDACTIONGROUP_ACTIONS" ;
      cmbavSalsts.setInternalname( "vSALSTS" );
      edtavMancod_Internalname = "vMANCOD" ;
      edtavSalextfec_Internalname = "vSALEXTFEC" ;
      edtavSalextfecto_Internalname = "vSALEXTFECTO" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtSalExtAlb_Internalname = "SALEXTALB" ;
      edtManCod_Internalname = "MANCOD" ;
      edtManNom_Internalname = "MANNOM" ;
      cmbSalExtLis.setInternalname( "SALEXTLIS" );
      cmbSalSts.setInternalname( "SALSTS" );
      edtSalExtFec_Internalname = "SALEXTFEC" ;
      edtSalFecSal_Internalname = "SALFECSAL" ;
      edtSalExtHor_Internalname = "SALEXTHOR" ;
      edtSalCodeID_Internalname = "SALCODEID" ;
      edtSalExtATCU_Internalname = "SALEXTATCU" ;
      cmbSalEnvAT.setInternalname( "SALENVAT" );
      cmbSalExtAT.setInternalname( "SALEXTAT" );
      edtSalFhh_Internalname = "SALFHH" ;
      edtSalFirma4d_Internalname = "SALFIRMA4D" ;
      edtSalFmd_Internalname = "SALFMD" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminardocumento_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
      tblTabledvelop_confirmpanel_eliminardocumento_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_salfecsalauxdate_Internalname = "vDDO_SALFECSALAUXDATE" ;
      divDdo_salfecsalauxdates_Internalname = "DDO_SALFECSALAUXDATES" ;
      edtavDdo_salfhhauxdate_Internalname = "vDDO_SALFHHAUXDATE" ;
      divDdo_salfhhauxdates_Internalname = "DDO_SALFHHAUXDATES" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtSalFmd_Jsonclick = "" ;
      edtSalFirma4d_Jsonclick = "" ;
      edtSalFirma4d_Columnclass = "WWColumn" ;
      edtSalFhh_Jsonclick = "" ;
      edtSalFhh_Columnclass = "WWColumn" ;
      cmbSalExtAT.setJsonclick( "" );
      cmbSalExtAT.setColumnClass( "WWColumn hidden-xs" );
      cmbSalEnvAT.setJsonclick( "" );
      cmbSalEnvAT.setColumnClass( "WWColumn hidden-xs" );
      edtSalExtATCU_Jsonclick = "" ;
      edtSalExtATCU_Columnclass = "WWColumn" ;
      edtSalCodeID_Jsonclick = "" ;
      edtSalCodeID_Columnclass = "WWColumn hidden-xs" ;
      edtSalExtHor_Jsonclick = "" ;
      edtSalExtHor_Columnclass = "WWColumn hidden-xs" ;
      edtSalFecSal_Jsonclick = "" ;
      edtSalFecSal_Columnclass = "WWColumn" ;
      edtSalExtFec_Jsonclick = "" ;
      edtSalExtFec_Columnclass = "WWColumn" ;
      cmbSalSts.setJsonclick( "" );
      cmbSalSts.setColumnClass( "WWColumn" );
      cmbSalExtLis.setJsonclick( "" );
      cmbSalExtLis.setColumnClass( "WWColumn hidden-xs" );
      edtManNom_Jsonclick = "" ;
      edtManNom_Columnclass = "WWColumn" ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Columnclass = "WWColumn" ;
      edtSalExtAlb_Jsonclick = "" ;
      edtSalExtAlb_Columnclass = "WWColumn" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavSalextalb_Jsonclick = "" ;
      edtavSalextalb_Enabled = 1 ;
      edtSalFirma4d_Columnheaderclass = "" ;
      edtSalFhh_Columnheaderclass = "" ;
      cmbSalExtAT.setColumnHeaderClass( "" );
      cmbSalEnvAT.setColumnHeaderClass( "" );
      edtSalExtATCU_Columnheaderclass = "" ;
      edtSalCodeID_Columnheaderclass = "" ;
      edtSalExtHor_Columnheaderclass = "" ;
      edtSalFecSal_Columnheaderclass = "" ;
      edtSalExtFec_Columnheaderclass = "" ;
      cmbSalSts.setColumnHeaderClass( "" );
      cmbSalExtLis.setColumnHeaderClass( "" );
      edtManNom_Columnheaderclass = "" ;
      edtManCod_Columnheaderclass = "" ;
      edtSalExtAlb_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_salfhhauxdate_Jsonclick = "" ;
      edtavDdo_salfecsalauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavSalextfecto_Jsonclick = "" ;
      edtavSalextfecto_Enabled = 1 ;
      edtavSalextfec_Jsonclick = "" ;
      edtavSalextfec_Enabled = 1 ;
      edtavMancod_Jsonclick = "" ;
      edtavMancod_Enabled = 1 ;
      cmbavSalsts.setJsonclick( "" );
      cmbavSalsts.setEnabled( 1 );
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;SAIDA;SAIDA;AT;AT;AT;AT;AT;AT;" ;
      Dvelop_confirmpanel_eliminardocumento_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminardocumento_Confirmationtext = "¿Desea Eliminar Documento?" ;
      Dvelop_confirmpanel_eliminardocumento_Title = "" ;
      Ddo_grid_Datalistproc = "TrabajosExternos.TrabajoExterno_Header_TRNWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||1:Impreso,0:No Impreso|:Em preparação,A:Anulado,F:Finalizado||||||0:Pdte. Envio AT,3:Enviada AT|A:Automatico,M:Manual||" ;
      Ddo_grid_Allowmultipleselection = "|||T|T||||||T|T||" ;
      Ddo_grid_Datalisttype = "|||FixedValues|FixedValues||||Dynamic|Dynamic|FixedValues|FixedValues||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T|T||||T|T|T|T||T" ;
      Ddo_grid_Filtertype = "||||||Date||Character|Character|||Date|Character" ;
      Ddo_grid_Includefilter = "||||||T||T|T|||T|T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|" ;
      Ddo_grid_Columnids = "1:SalExtAlb|2:ManCod|3:ManNom|4:SalExtLis|5:SalSts|6:SalExtFec|7:SalFecSal|8:SalExtHor|9:SalCodeID|10:SalExtATCUD|11:SalEnvAT|12:SalExtAT|13:SalFhh|14:SalFirma4d" ;
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
      Form.setCaption( httpContext.getMessage( " Trabajo Externo (Header)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavSalsts.setName( "vSALSTS" );
      cmbavSalsts.setWebtags( "" );
      cmbavSalsts.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavSalsts.addItem("", httpContext.getMessage( "Em preparação ", ""), (short)(0));
      cmbavSalsts.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbavSalsts.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbavSalsts.getItemCount() > 0 )
      {
         AV88SalSts = cmbavSalsts.getValidValue(AV88SalSts) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88SalSts", AV88SalSts);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_63_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV46GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV46GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridActions), 4, 0));
      }
      GXCCtl = "SALEXTLIS_" + sGXsfl_63_idx ;
      cmbSalExtLis.setName( GXCCtl );
      cmbSalExtLis.setWebtags( "" );
      cmbSalExtLis.addItem("1", httpContext.getMessage( "Impreso", ""), (short)(0));
      cmbSalExtLis.addItem("0", httpContext.getMessage( "No Impreso", ""), (short)(0));
      if ( cmbSalExtLis.getItemCount() > 0 )
      {
         A2258SalExtLis = (byte)(GXutil.lval( cmbSalExtLis.getValidValue(GXutil.trim( GXutil.str( A2258SalExtLis, 1, 0))))) ;
      }
      GXCCtl = "SALSTS_" + sGXsfl_63_idx ;
      cmbSalSts.setName( GXCCtl );
      cmbSalSts.setWebtags( "" );
      cmbSalSts.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
      cmbSalSts.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      cmbSalSts.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      if ( cmbSalSts.getItemCount() > 0 )
      {
         A10080SalSts = cmbSalSts.getValidValue(A10080SalSts) ;
      }
      GXCCtl = "SALENVAT_" + sGXsfl_63_idx ;
      cmbSalEnvAT.setName( GXCCtl );
      cmbSalEnvAT.setWebtags( "" );
      cmbSalEnvAT.addItem("0", httpContext.getMessage( "Pdte. Envio AT", ""), (short)(0));
      cmbSalEnvAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
      if ( cmbSalEnvAT.getItemCount() > 0 )
      {
         A10741SalEnvAT = (byte)(GXutil.lval( cmbSalEnvAT.getValidValue(GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0))))) ;
      }
      GXCCtl = "SALEXTAT_" + sGXsfl_63_idx ;
      cmbSalExtAT.setName( GXCCtl );
      cmbSalExtAT.setWebtags( "" );
      cmbSalExtAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      cmbSalExtAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbSalExtAT.getItemCount() > 0 )
      {
         A10767SalExtAT = cmbSalExtAT.getValidValue(A10767SalExtAT) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV54TFSalExtLis_Sels',fld:'vTFSALEXTLIS_SELS',pic:''},{av:'AV58TFSalSts_Sels',fld:'vTFSALSTS_SELS',pic:''},{av:'AV84TFSalFecSal',fld:'vTFSALFECSAL',pic:''},{av:'AV55TFSalCodeID',fld:'vTFSALCODEID',pic:''},{av:'AV56TFSalCodeID_Sel',fld:'vTFSALCODEID_SEL',pic:''},{av:'AV40TFSalExtATCUD',fld:'vTFSALEXTATCUD',pic:''},{av:'AV41TFSalExtATCUD_Sel',fld:'vTFSALEXTATCUD_SEL',pic:''},{av:'AV81TFSalEnvAT_Sels',fld:'vTFSALENVAT_SELS',pic:''},{av:'AV83TFSalExtAT_Sels',fld:'vTFSALEXTAT_SELS',pic:''},{av:'AV86TFSalFhh',fld:'vTFSALFHH',pic:'99/99/99 99:99'},{av:'AV78TFSalFirma4d',fld:'vTFSALFIRMA4D',pic:''},{av:'AV79TFSalFirma4d_Sel',fld:'vTFSALFIRMA4D_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV61firmad',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV44GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV45GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtSalExtAlb_Columnheaderclass',ctrl:'SALEXTALB',prop:'Columnheaderclass'},{av:'edtManCod_Columnheaderclass',ctrl:'MANCOD',prop:'Columnheaderclass'},{av:'edtManNom_Columnheaderclass',ctrl:'MANNOM',prop:'Columnheaderclass'},{av:'cmbSalExtLis'},{av:'cmbSalSts'},{av:'edtSalExtFec_Columnheaderclass',ctrl:'SALEXTFEC',prop:'Columnheaderclass'},{av:'edtSalFecSal_Columnheaderclass',ctrl:'SALFECSAL',prop:'Columnheaderclass'},{av:'edtSalExtHor_Columnheaderclass',ctrl:'SALEXTHOR',prop:'Columnheaderclass'},{av:'edtSalCodeID_Columnheaderclass',ctrl:'SALCODEID',prop:'Columnheaderclass'},{av:'edtSalExtATCU_Columnheaderclass',ctrl:'SALEXTATCU',prop:'Columnheaderclass'},{av:'cmbSalEnvAT'},{av:'cmbSalExtAT'},{av:'edtSalFhh_Columnheaderclass',ctrl:'SALFHH',prop:'Columnheaderclass'},{av:'edtSalFirma4d_Columnheaderclass',ctrl:'SALFIRMA4D',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112782',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54TFSalExtLis_Sels',fld:'vTFSALEXTLIS_SELS',pic:''},{av:'AV58TFSalSts_Sels',fld:'vTFSALSTS_SELS',pic:''},{av:'AV84TFSalFecSal',fld:'vTFSALFECSAL',pic:''},{av:'AV55TFSalCodeID',fld:'vTFSALCODEID',pic:''},{av:'AV56TFSalCodeID_Sel',fld:'vTFSALCODEID_SEL',pic:''},{av:'AV40TFSalExtATCUD',fld:'vTFSALEXTATCUD',pic:''},{av:'AV41TFSalExtATCUD_Sel',fld:'vTFSALEXTATCUD_SEL',pic:''},{av:'AV81TFSalEnvAT_Sels',fld:'vTFSALENVAT_SELS',pic:''},{av:'AV83TFSalExtAT_Sels',fld:'vTFSALEXTAT_SELS',pic:''},{av:'AV86TFSalFhh',fld:'vTFSALFHH',pic:'99/99/99 99:99'},{av:'AV78TFSalFirma4d',fld:'vTFSALFIRMA4D',pic:''},{av:'AV79TFSalFirma4d_Sel',fld:'vTFSALFIRMA4D_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV61firmad',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122782',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54TFSalExtLis_Sels',fld:'vTFSALEXTLIS_SELS',pic:''},{av:'AV58TFSalSts_Sels',fld:'vTFSALSTS_SELS',pic:''},{av:'AV84TFSalFecSal',fld:'vTFSALFECSAL',pic:''},{av:'AV55TFSalCodeID',fld:'vTFSALCODEID',pic:''},{av:'AV56TFSalCodeID_Sel',fld:'vTFSALCODEID_SEL',pic:''},{av:'AV40TFSalExtATCUD',fld:'vTFSALEXTATCUD',pic:''},{av:'AV41TFSalExtATCUD_Sel',fld:'vTFSALEXTATCUD_SEL',pic:''},{av:'AV81TFSalEnvAT_Sels',fld:'vTFSALENVAT_SELS',pic:''},{av:'AV83TFSalExtAT_Sels',fld:'vTFSALEXTAT_SELS',pic:''},{av:'AV86TFSalFhh',fld:'vTFSALFHH',pic:'99/99/99 99:99'},{av:'AV78TFSalFirma4d',fld:'vTFSALFIRMA4D',pic:''},{av:'AV79TFSalFirma4d_Sel',fld:'vTFSALFIRMA4D_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV61firmad',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132782',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54TFSalExtLis_Sels',fld:'vTFSALEXTLIS_SELS',pic:''},{av:'AV58TFSalSts_Sels',fld:'vTFSALSTS_SELS',pic:''},{av:'AV84TFSalFecSal',fld:'vTFSALFECSAL',pic:''},{av:'AV55TFSalCodeID',fld:'vTFSALCODEID',pic:''},{av:'AV56TFSalCodeID_Sel',fld:'vTFSALCODEID_SEL',pic:''},{av:'AV40TFSalExtATCUD',fld:'vTFSALEXTATCUD',pic:''},{av:'AV41TFSalExtATCUD_Sel',fld:'vTFSALEXTATCUD_SEL',pic:''},{av:'AV81TFSalEnvAT_Sels',fld:'vTFSALENVAT_SELS',pic:''},{av:'AV83TFSalExtAT_Sels',fld:'vTFSALEXTAT_SELS',pic:''},{av:'AV86TFSalFhh',fld:'vTFSALFHH',pic:'99/99/99 99:99'},{av:'AV78TFSalFirma4d',fld:'vTFSALFIRMA4D',pic:''},{av:'AV79TFSalFirma4d_Sel',fld:'vTFSALFIRMA4D_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV61firmad',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78TFSalFirma4d',fld:'vTFSALFIRMA4D',pic:''},{av:'AV79TFSalFirma4d_Sel',fld:'vTFSALFIRMA4D_SEL',pic:''},{av:'AV86TFSalFhh',fld:'vTFSALFHH',pic:'99/99/99 99:99'},{av:'AV82TFSalExtAT_SelsJson',fld:'vTFSALEXTAT_SELSJSON',pic:''},{av:'AV83TFSalExtAT_Sels',fld:'vTFSALEXTAT_SELS',pic:''},{av:'AV80TFSalEnvAT_SelsJson',fld:'vTFSALENVAT_SELSJSON',pic:''},{av:'AV81TFSalEnvAT_Sels',fld:'vTFSALENVAT_SELS',pic:''},{av:'AV40TFSalExtATCUD',fld:'vTFSALEXTATCUD',pic:''},{av:'AV41TFSalExtATCUD_Sel',fld:'vTFSALEXTATCUD_SEL',pic:''},{av:'AV55TFSalCodeID',fld:'vTFSALCODEID',pic:''},{av:'AV56TFSalCodeID_Sel',fld:'vTFSALCODEID_SEL',pic:''},{av:'AV84TFSalFecSal',fld:'vTFSALFECSAL',pic:''},{av:'AV57TFSalSts_SelsJson',fld:'vTFSALSTS_SELSJSON',pic:''},{av:'AV58TFSalSts_Sels',fld:'vTFSALSTS_SELS',pic:''},{av:'AV53TFSalExtLis_SelsJson',fld:'vTFSALEXTLIS_SELSJSON',pic:''},{av:'AV54TFSalExtLis_Sels',fld:'vTFSALEXTLIS_SELS',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222782',iparms:[{av:'cmbSalSts'},{av:'A10080SalSts',fld:'SALSTS',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV46GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtSalExtAlb_Columnclass',ctrl:'SALEXTALB',prop:'Columnclass'},{av:'edtManCod_Columnclass',ctrl:'MANCOD',prop:'Columnclass'},{av:'edtManNom_Columnclass',ctrl:'MANNOM',prop:'Columnclass'},{av:'cmbSalExtLis'},{av:'cmbSalSts'},{av:'edtSalExtFec_Columnclass',ctrl:'SALEXTFEC',prop:'Columnclass'},{av:'edtSalFecSal_Columnclass',ctrl:'SALFECSAL',prop:'Columnclass'},{av:'edtSalExtHor_Columnclass',ctrl:'SALEXTHOR',prop:'Columnclass'},{av:'edtSalCodeID_Columnclass',ctrl:'SALCODEID',prop:'Columnclass'},{av:'edtSalExtATCU_Columnclass',ctrl:'SALEXTATCU',prop:'Columnclass'},{av:'cmbSalEnvAT'},{av:'cmbSalExtAT'},{av:'edtSalFhh_Columnclass',ctrl:'SALFHH',prop:'Columnclass'},{av:'edtSalFirma4d_Columnclass',ctrl:'SALFIRMA4D',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e232782',iparms:[{av:'cmbavGridactions'},{av:'AV46GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A10742SalCodeID',fld:'SALCODEID',pic:'',hsh:true},{av:'cmbSalEnvAT'},{av:'A10741SalEnvAT',fld:'SALENVAT',pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54TFSalExtLis_Sels',fld:'vTFSALEXTLIS_SELS',pic:''},{av:'AV58TFSalSts_Sels',fld:'vTFSALSTS_SELS',pic:''},{av:'AV84TFSalFecSal',fld:'vTFSALFECSAL',pic:''},{av:'AV55TFSalCodeID',fld:'vTFSALCODEID',pic:''},{av:'AV56TFSalCodeID_Sel',fld:'vTFSALCODEID_SEL',pic:''},{av:'AV40TFSalExtATCUD',fld:'vTFSALEXTATCUD',pic:''},{av:'AV41TFSalExtATCUD_Sel',fld:'vTFSALEXTATCUD_SEL',pic:''},{av:'AV81TFSalEnvAT_Sels',fld:'vTFSALENVAT_SELS',pic:''},{av:'AV83TFSalExtAT_Sels',fld:'vTFSALEXTAT_SELS',pic:''},{av:'AV86TFSalFhh',fld:'vTFSALFHH',pic:'99/99/99 99:99'},{av:'AV78TFSalFirma4d',fld:'vTFSALFIRMA4D',pic:''},{av:'AV79TFSalFirma4d_Sel',fld:'vTFSALFIRMA4D_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV61firmad',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbSalSts'},{av:'A10080SalSts',fld:'SALSTS',pic:'',hsh:true},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A14398SalFecSal',fld:'SALFECSAL',pic:'',hsh:true},{av:'A6396SalExtHor',fld:'SALEXTHOR',pic:'',hsh:true},{av:'A10076SalFhh',fld:'SALFHH',pic:'99/99/99 99:99'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9',hsh:true},{av:'A2249ManNom',fld:'MANNOM',pic:''},{av:'AV65Hash',fld:'vHASH',pic:''},{av:'AV67ok',fld:'vOK',pic:''},{av:'AV64Cadena',fld:'vCADENA',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV46GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV64Cadena',fld:'vCADENA',pic:''},{av:'A10076SalFhh',fld:'SALFHH',pic:'99/99/99 99:99'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67ok',fld:'vOK',pic:''},{av:'AV65Hash',fld:'vHASH',pic:''},{av:'AV44GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV45GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtSalExtAlb_Columnheaderclass',ctrl:'SALEXTALB',prop:'Columnheaderclass'},{av:'edtManCod_Columnheaderclass',ctrl:'MANCOD',prop:'Columnheaderclass'},{av:'edtManNom_Columnheaderclass',ctrl:'MANNOM',prop:'Columnheaderclass'},{av:'cmbSalExtLis'},{av:'cmbSalSts'},{av:'edtSalExtFec_Columnheaderclass',ctrl:'SALEXTFEC',prop:'Columnheaderclass'},{av:'edtSalFecSal_Columnheaderclass',ctrl:'SALFECSAL',prop:'Columnheaderclass'},{av:'edtSalExtHor_Columnheaderclass',ctrl:'SALEXTHOR',prop:'Columnheaderclass'},{av:'edtSalCodeID_Columnheaderclass',ctrl:'SALCODEID',prop:'Columnheaderclass'},{av:'edtSalExtATCU_Columnheaderclass',ctrl:'SALEXTATCU',prop:'Columnheaderclass'},{av:'cmbSalEnvAT'},{av:'cmbSalExtAT'},{av:'edtSalFhh_Columnheaderclass',ctrl:'SALFHH',prop:'Columnheaderclass'},{av:'edtSalFirma4d_Columnheaderclass',ctrl:'SALFIRMA4D',prop:'Columnheaderclass'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE","{handler:'e142782',iparms:[{av:'Dvelop_confirmpanel_eliminardocumento_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54TFSalExtLis_Sels',fld:'vTFSALEXTLIS_SELS',pic:''},{av:'AV58TFSalSts_Sels',fld:'vTFSALSTS_SELS',pic:''},{av:'AV84TFSalFecSal',fld:'vTFSALFECSAL',pic:''},{av:'AV55TFSalCodeID',fld:'vTFSALCODEID',pic:''},{av:'AV56TFSalCodeID_Sel',fld:'vTFSALCODEID_SEL',pic:''},{av:'AV40TFSalExtATCUD',fld:'vTFSALEXTATCUD',pic:''},{av:'AV41TFSalExtATCUD_Sel',fld:'vTFSALEXTATCUD_SEL',pic:''},{av:'AV81TFSalEnvAT_Sels',fld:'vTFSALENVAT_SELS',pic:''},{av:'AV83TFSalExtAT_Sels',fld:'vTFSALEXTAT_SELS',pic:''},{av:'AV86TFSalFhh',fld:'vTFSALFHH',pic:'99/99/99 99:99'},{av:'AV78TFSalFirma4d',fld:'vTFSALFIRMA4D',pic:''},{av:'AV79TFSalFirma4d_Sel',fld:'vTFSALFIRMA4D_SEL',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV61firmad',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARDOCUMENTO.CLOSE",",oparms:[{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV45GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtSalExtAlb_Columnheaderclass',ctrl:'SALEXTALB',prop:'Columnheaderclass'},{av:'edtManCod_Columnheaderclass',ctrl:'MANCOD',prop:'Columnheaderclass'},{av:'edtManNom_Columnheaderclass',ctrl:'MANNOM',prop:'Columnheaderclass'},{av:'cmbSalExtLis'},{av:'cmbSalSts'},{av:'edtSalExtFec_Columnheaderclass',ctrl:'SALEXTFEC',prop:'Columnheaderclass'},{av:'edtSalFecSal_Columnheaderclass',ctrl:'SALFECSAL',prop:'Columnheaderclass'},{av:'edtSalExtHor_Columnheaderclass',ctrl:'SALEXTHOR',prop:'Columnheaderclass'},{av:'edtSalCodeID_Columnheaderclass',ctrl:'SALCODEID',prop:'Columnheaderclass'},{av:'edtSalExtATCU_Columnheaderclass',ctrl:'SALEXTATCU',prop:'Columnheaderclass'},{av:'cmbSalEnvAT'},{av:'cmbSalExtAT'},{av:'edtSalFhh_Columnheaderclass',ctrl:'SALFHH',prop:'Columnheaderclass'},{av:'edtSalFirma4d_Columnheaderclass',ctrl:'SALFIRMA4D',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e152782',iparms:[{av:'AV47EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("VMANCOD.CONTROLVALUECHANGED","{handler:'e162782',iparms:[{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''}]");
      setEventMetadata("VMANCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''}]}");
      setEventMetadata("VSALEXTALB.CONTROLVALUECHANGED","{handler:'e172782',iparms:[{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''}]");
      setEventMetadata("VSALEXTALB.CONTROLVALUECHANGED",",oparms:[{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''},{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''}]}");
      setEventMetadata("VSALEXTFEC.CONTROLVALUECHANGED","{handler:'e182782',iparms:[{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''}]");
      setEventMetadata("VSALEXTFEC.CONTROLVALUECHANGED",",oparms:[{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''}]}");
      setEventMetadata("VSALEXTFECTO.CONTROLVALUECHANGED","{handler:'e192782',iparms:[{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''}]");
      setEventMetadata("VSALEXTFECTO.CONTROLVALUECHANGED",",oparms:[{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''}]}");
      setEventMetadata("SALSTS.CONTROLVALUECHANGED","{handler:'e242782',iparms:[{av:'AV71ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''},{av:'AV70SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'cmbavSalsts'},{av:'AV88SalSts',fld:'vSALSTS',pic:''},{av:'AV72SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV73SalExtFecTo',fld:'vSALEXTFECTO',pic:''}]");
      setEventMetadata("SALSTS.CONTROLVALUECHANGED",",oparms:[{av:'AV91FilterTrabajoExterno_Header_TRNWW',fld:'vFILTERTRABAJOEXTERNO_HEADER_TRNWW',pic:''}]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[]");
      setEventMetadata("VALID_MANCOD",",oparms:[]}");
      setEventMetadata("VALID_SALFMD","{handler:'valid_Salfmd',iparms:[]");
      setEventMetadata("VALID_SALFMD",",oparms:[]}");
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
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminardocumento_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV88SalSts = "" ;
      AV72SalExtFec = GXutil.nullDate() ;
      AV73SalExtFecTo = GXutil.nullDate() ;
      AV47EmprCod = "" ;
      AV54TFSalExtLis_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV58TFSalSts_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV84TFSalFecSal = GXutil.nullDate() ;
      AV55TFSalCodeID = "" ;
      AV56TFSalCodeID_Sel = "" ;
      AV40TFSalExtATCUD = "" ;
      AV41TFSalExtATCUD_Sel = "" ;
      AV81TFSalEnvAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV83TFSalExtAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86TFSalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV78TFSalFirma4d = "" ;
      AV79TFSalFirma4d_Sel = "" ;
      AV95Pgmname = "" ;
      AV77Messages_json = "" ;
      Gx_date = GXutil.nullDate() ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV42DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV65Hash = "" ;
      AV64Cadena = "" ;
      AV91FilterTrabajoExterno_Header_TRNWW = new app.trabajosexternos.SdtFilterTrabajoExterno_Header_TRNWW(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV85DDO_SalFecSalAuxDate = GXutil.nullDate() ;
      AV87DDO_SalFhhAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A2249ManNom = "" ;
      A10080SalSts = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A14398SalFecSal = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A10742SalCodeID = "" ;
      A14348SalExtATCU = "" ;
      A10767SalExtAT = "" ;
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      A14373SalFirma4d = "" ;
      A10077SalFmd = "" ;
      AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = "" ;
      lV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = "" ;
      lV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = "" ;
      AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal = GXutil.nullDate() ;
      AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel = "" ;
      AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid = "" ;
      AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel = "" ;
      AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud = "" ;
      AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh = GXutil.resetTime( GXutil.nullDate() );
      AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel = "" ;
      AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d = "" ;
      H02782_A396EmprCod = new String[] {""} ;
      H02782_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      H02782_A10767SalExtAT = new String[] {""} ;
      H02782_A10741SalEnvAT = new byte[1] ;
      H02782_A14348SalExtATCU = new String[] {""} ;
      H02782_A10742SalCodeID = new String[] {""} ;
      H02782_A6396SalExtHor = new String[] {""} ;
      H02782_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H02782_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      H02782_A10080SalSts = new String[] {""} ;
      H02782_A2258SalExtLis = new byte[1] ;
      H02782_A2249ManNom = new String[] {""} ;
      H02782_n2249ManNom = new boolean[] {false} ;
      H02782_A2248ManCod = new short[1] ;
      H02782_A2253SalExtAlb = new int[1] ;
      H02782_A10077SalFmd = new String[] {""} ;
      H02783_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV50Station = "" ;
      AV51EmprNom = "" ;
      AV52UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53TFSalExtLis_SelsJson = "" ;
      AV57TFSalSts_SelsJson = "" ;
      AV80TFSalEnvAT_SelsJson = "" ;
      AV82TFSalExtAT_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_dtime12 = new java.util.Date[1] ;
      AV69firma = "" ;
      AV66Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message13 = new GXBaseCollection[1] ;
      GXv_boolean14 = new boolean[1] ;
      AV68Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV110Emprcod_selected = "" ;
      GXv_int10 = new int[1] ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char15 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV92WebSession = httpContext.getWebSession();
      ucDvelop_confirmpanel_eliminardocumento = new com.genexus.webpanels.GXUserControl();
      bttBtninsert_Jsonclick = "" ;
      lblTextblocksalextalb_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trnww__default(),
         new Object[] {
             new Object[] {
            H02782_A396EmprCod, H02782_A10076SalFhh, H02782_A10767SalExtAT, H02782_A10741SalEnvAT, H02782_A14348SalExtATCU, H02782_A10742SalCodeID, H02782_A6396SalExtHor, H02782_A14398SalFecSal, H02782_A2256SalExtFec, H02782_A10080SalSts,
            H02782_A2258SalExtLis, H02782_A2249ManNom, H02782_n2249ManNom, H02782_A2248ManCod, H02782_A2253SalExtAlb, H02782_A10077SalFmd
            }
            , new Object[] {
            H02783_AGRID_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV95Pgmname = "TrabajosExternos.TrabajoExterno_Header_TRNWW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV95Pgmname = "TrabajosExternos.TrabajoExterno_Header_TRNWW" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A2258SalExtLis ;
   private byte A10741SalEnvAT ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV71ManCod ;
   private short AV12OrderedBy ;
   private short AV61firmad ;
   private short wbEnd ;
   private short wbStart ;
   private short AV46GridActions ;
   private short A2248ManCod ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_63 ;
   private int nGXsfl_63_idx=1 ;
   private int AV70SalExtAlb ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavMancod_Enabled ;
   private int edtavSalextfec_Enabled ;
   private int edtavSalextfecto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A2253SalExtAlb ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size ;
   private int AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size ;
   private int AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size ;
   private int AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size ;
   private int AV43PageToGo ;
   private int AV109GXV1 ;
   private int AV111Salextalb_selected ;
   private int GXv_int10[] ;
   private int AV112GXV2 ;
   private int edtavSalextalb_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV44GridCurrentPage ;
   private long AV45GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminardocumento_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_63_idx="0001" ;
   private String AV88SalSts ;
   private String AV47EmprCod ;
   private String AV55TFSalCodeID ;
   private String AV56TFSalCodeID_Sel ;
   private String AV40TFSalExtATCUD ;
   private String AV41TFSalExtATCUD_Sel ;
   private String AV78TFSalFirma4d ;
   private String AV79TFSalFirma4d_Sel ;
   private String AV95Pgmname ;
   private String A396EmprCod ;
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
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminardocumento_Title ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminardocumento_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminardocumento_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String edtavMancod_Internalname ;
   private String edtavMancod_Jsonclick ;
   private String edtavSalextfec_Internalname ;
   private String edtavSalextfec_Jsonclick ;
   private String edtavSalextfecto_Internalname ;
   private String edtavSalextfecto_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_salfecsalauxdates_Internalname ;
   private String edtavDdo_salfecsalauxdate_Internalname ;
   private String edtavDdo_salfecsalauxdate_Jsonclick ;
   private String divDdo_salfhhauxdates_Internalname ;
   private String edtavDdo_salfhhauxdate_Internalname ;
   private String edtavDdo_salfhhauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtSalExtAlb_Internalname ;
   private String edtManCod_Internalname ;
   private String A2249ManNom ;
   private String edtManNom_Internalname ;
   private String A10080SalSts ;
   private String edtSalExtFec_Internalname ;
   private String edtSalFecSal_Internalname ;
   private String A6396SalExtHor ;
   private String edtSalExtHor_Internalname ;
   private String A10742SalCodeID ;
   private String edtSalCodeID_Internalname ;
   private String A14348SalExtATCU ;
   private String edtSalExtATCU_Internalname ;
   private String A10767SalExtAT ;
   private String edtSalFhh_Internalname ;
   private String A14373SalFirma4d ;
   private String edtSalFirma4d_Internalname ;
   private String A10077SalFmd ;
   private String edtSalFmd_Internalname ;
   private String edtavSalextalb_Internalname ;
   private String scmdbuf ;
   private String lV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ;
   private String lV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ;
   private String lV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ;
   private String AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ;
   private String AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ;
   private String AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ;
   private String AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ;
   private String AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ;
   private String AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ;
   private String hsh ;
   private String AV50Station ;
   private String AV51EmprNom ;
   private String AV52UsurCod ;
   private String edtSalExtAlb_Columnheaderclass ;
   private String edtManCod_Columnheaderclass ;
   private String edtManNom_Columnheaderclass ;
   private String edtSalExtFec_Columnheaderclass ;
   private String edtSalFecSal_Columnheaderclass ;
   private String edtSalExtHor_Columnheaderclass ;
   private String edtSalCodeID_Columnheaderclass ;
   private String edtSalExtATCU_Columnheaderclass ;
   private String edtSalFhh_Columnheaderclass ;
   private String edtSalFirma4d_Columnheaderclass ;
   private String edtSalExtAlb_Columnclass ;
   private String edtManCod_Columnclass ;
   private String edtManNom_Columnclass ;
   private String edtSalExtFec_Columnclass ;
   private String edtSalFecSal_Columnclass ;
   private String edtSalExtHor_Columnclass ;
   private String edtSalCodeID_Columnclass ;
   private String edtSalExtATCU_Columnclass ;
   private String edtSalFhh_Columnclass ;
   private String edtSalFirma4d_Columnclass ;
   private String Gx_msg ;
   private String AV110Emprcod_selected ;
   private String GXt_char1 ;
   private String GXt_char15 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminardocumento_Internalname ;
   private String Dvelop_confirmpanel_eliminardocumento_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String tblTablemergedactiongroup_actions_Internalname ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String divUnnamedtablesalextalb_Internalname ;
   private String lblTextblocksalextalb_Internalname ;
   private String lblTextblocksalextalb_Jsonclick ;
   private String edtavSalextalb_Jsonclick ;
   private String sGXsfl_63_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtSalExtAlb_Jsonclick ;
   private String edtManCod_Jsonclick ;
   private String edtManNom_Jsonclick ;
   private String edtSalExtFec_Jsonclick ;
   private String edtSalFecSal_Jsonclick ;
   private String edtSalExtHor_Jsonclick ;
   private String edtSalCodeID_Jsonclick ;
   private String edtSalExtATCU_Jsonclick ;
   private String edtSalFhh_Jsonclick ;
   private String edtSalFirma4d_Jsonclick ;
   private String edtSalFmd_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV86TFSalFhh ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ;
   private java.util.Date GXv_dtime12[] ;
   private java.util.Date AV72SalExtFec ;
   private java.util.Date AV73SalExtFecTo ;
   private java.util.Date AV84TFSalFecSal ;
   private java.util.Date Gx_date ;
   private java.util.Date AV85DDO_SalFecSalAuxDate ;
   private java.util.Date AV87DDO_SalFhhAuxDate ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A14398SalFecSal ;
   private java.util.Date AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ;
   private java.util.Date GXv_date11[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean AV67ok ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n2249ManNom ;
   private boolean bGXsfl_63_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean GXv_boolean14[] ;
   private String AV77Messages_json ;
   private String AV53TFSalExtLis_SelsJson ;
   private String AV57TFSalSts_SelsJson ;
   private String AV80TFSalEnvAT_SelsJson ;
   private String AV82TFSalExtAT_SelsJson ;
   private String AV65Hash ;
   private String AV64Cadena ;
   private String AV69firma ;
   private GXSimpleCollection<Byte> AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ;
   private GXSimpleCollection<Byte> AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ;
   private GXSimpleCollection<Byte> AV54TFSalExtLis_Sels ;
   private GXSimpleCollection<Byte> AV81TFSalEnvAT_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV92WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminardocumento ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ;
   private GXSimpleCollection<String> AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ;
   private HTMLChoice cmbavSalsts ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbSalExtLis ;
   private HTMLChoice cmbSalSts ;
   private HTMLChoice cmbSalEnvAT ;
   private HTMLChoice cmbSalExtAT ;
   private IDataStoreProvider pr_default ;
   private String[] H02782_A396EmprCod ;
   private java.util.Date[] H02782_A10076SalFhh ;
   private String[] H02782_A10767SalExtAT ;
   private byte[] H02782_A10741SalEnvAT ;
   private String[] H02782_A14348SalExtATCU ;
   private String[] H02782_A10742SalCodeID ;
   private String[] H02782_A6396SalExtHor ;
   private java.util.Date[] H02782_A14398SalFecSal ;
   private java.util.Date[] H02782_A2256SalExtFec ;
   private String[] H02782_A10080SalSts ;
   private byte[] H02782_A2258SalExtLis ;
   private String[] H02782_A2249ManNom ;
   private boolean[] H02782_n2249ManNom ;
   private short[] H02782_A2248ManCod ;
   private int[] H02782_A2253SalExtAlb ;
   private String[] H02782_A10077SalFmd ;
   private long[] H02783_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV58TFSalSts_Sels ;
   private GXSimpleCollection<String> AV83TFSalExtAT_Sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV66Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message13[] ;
   private com.genexus.SdtMessages_Message AV68Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV42DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.trabajosexternos.SdtFilterTrabajoExterno_Header_TRNWW AV91FilterTrabajoExterno_Header_TRNWW ;
}

final  class trabajoexterno_header_trnww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02782( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A2258SalExtLis ,
                                          GXSimpleCollection<Byte> AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                          String A10080SalSts ,
                                          GXSimpleCollection<String> AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                          byte A10741SalEnvAT ,
                                          GXSimpleCollection<Byte> AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                          String A10767SalExtAT ,
                                          GXSimpleCollection<String> AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                          int AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size ,
                                          int AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size ,
                                          java.util.Date AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                          String AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                          String AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                          String AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                          String AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                          int AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size ,
                                          int AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size ,
                                          java.util.Date AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                          String AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                          String AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                          int AV70SalExtAlb ,
                                          short AV71ManCod ,
                                          java.util.Date AV72SalExtFec ,
                                          java.util.Date AV73SalExtFecTo ,
                                          java.util.Date A14398SalFecSal ,
                                          String A10742SalCodeID ,
                                          String A14348SalExtATCU ,
                                          java.util.Date A10076SalFhh ,
                                          String A10077SalFmd ,
                                          int A2253SalExtAlb ,
                                          short A2248ManCod ,
                                          java.util.Date A2256SalExtFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV88SalSts ,
                                          String AV47EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[20];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.SalFhh, T1.SalExtAT, T1.SalEnvAT, T1.SalExtATCU, T1.SalCodeID, T1.SalExtHor, T1.SalFecSal, T1.SalExtFec, T1.SalSts, T1.SalExtLis, T2.ManNom, T1.ManCod," ;
      sSelectString += " T1.SalExtAlb, T1.SalFmd" ;
      sFromString = " FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalSts = ? or ? = 'T')");
      if ( AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels, "T1.SalExtLis IN (", ")")+")");
      }
      if ( AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels, "T1.SalSts IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal)) )
      {
         addWhere(sWhereString, "(T1.SalFecSal >= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) && ( ! (GXutil.strcmp("", AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalCodeID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalCodeID = ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtATCU = ?)");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels, "T1.SalEnvAT IN (", ")")+")");
      }
      if ( AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels, "T1.SalExtAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh) )
      {
         addWhere(sWhereString, "(T1.SalFhh >= ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) && ( ! (GXutil.strcmp("", AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.SalFmd, 1, 1) || SUBSTR(T1.SalFmd, 11, 1) || SUBSTR(T1.SalFmd, 21, 1) || SUBSTR(T1.SalFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.SalFmd, 1, 1) || SUBSTR(T1.SalFmd, 11, 1) || SUBSTR(T1.SalFmd, 21, 1) || SUBSTR(T1.SalFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (0==AV70SalExtAlb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (0==AV71ManCod) )
      {
         addWhere(sWhereString, "(T1.ManCod = ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72SalExtFec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73SalExtFecTo)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec <= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.SalExtAlb DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExtAlb" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExtAlb DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ManCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ManCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ManNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ManNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExtLis" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExtLis DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalSts" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalSts DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExtFec" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExtFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalFecSal" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExtHor" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExtHor DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalCodeID" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalCodeID DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExtATCU" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExtATCU DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalEnvAT" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalEnvAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExtAT" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExtAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalFhh" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalFhh DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.SalExtAlb" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H02783( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A2258SalExtLis ,
                                          GXSimpleCollection<Byte> AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels ,
                                          String A10080SalSts ,
                                          GXSimpleCollection<String> AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels ,
                                          byte A10741SalEnvAT ,
                                          GXSimpleCollection<Byte> AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels ,
                                          String A10767SalExtAT ,
                                          GXSimpleCollection<String> AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels ,
                                          int AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size ,
                                          int AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size ,
                                          java.util.Date AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal ,
                                          String AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel ,
                                          String AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid ,
                                          String AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel ,
                                          String AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud ,
                                          int AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size ,
                                          int AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size ,
                                          java.util.Date AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh ,
                                          String AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel ,
                                          String AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d ,
                                          int AV70SalExtAlb ,
                                          short AV71ManCod ,
                                          java.util.Date AV72SalExtFec ,
                                          java.util.Date AV73SalExtFecTo ,
                                          java.util.Date A14398SalFecSal ,
                                          String A10742SalCodeID ,
                                          String A14348SalExtATCU ,
                                          java.util.Date A10076SalFhh ,
                                          String A10077SalFmd ,
                                          int A2253SalExtAlb ,
                                          short A2248ManCod ,
                                          java.util.Date A2256SalExtFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV88SalSts ,
                                          String AV47EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[15];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.SalSts = ? or ? = 'T')");
      if ( AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV96Trabajosexternos_trabajoexterno_header_trnwwds_1_tfsalextlis_sels, "T1.SalExtLis IN (", ")")+")");
      }
      if ( AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Trabajosexternos_trabajoexterno_header_trnwwds_2_tfsalsts_sels, "T1.SalSts IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV98Trabajosexternos_trabajoexterno_header_trnwwds_3_tfsalfecsal)) )
      {
         addWhere(sWhereString, "(T1.SalFecSal >= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) && ( ! (GXutil.strcmp("", AV99Trabajosexternos_trabajoexterno_header_trnwwds_4_tfsalcodeid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalCodeID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Trabajosexternos_trabajoexterno_header_trnwwds_5_tfsalcodeid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalCodeID = ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) && ( ! (GXutil.strcmp("", AV101Trabajosexternos_trabajoexterno_header_trnwwds_6_tfsalextatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExtATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Trabajosexternos_trabajoexterno_header_trnwwds_7_tfsalextatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExtATCU = ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV103Trabajosexternos_trabajoexterno_header_trnwwds_8_tfsalenvat_sels, "T1.SalEnvAT IN (", ")")+")");
      }
      if ( AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV104Trabajosexternos_trabajoexterno_header_trnwwds_9_tfsalextat_sels, "T1.SalExtAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV105Trabajosexternos_trabajoexterno_header_trnwwds_10_tfsalfhh) )
      {
         addWhere(sWhereString, "(T1.SalFhh >= ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) && ( ! (GXutil.strcmp("", AV106Trabajosexternos_trabajoexterno_header_trnwwds_11_tfsalfirma4d)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.SalFmd, 1, 1) || SUBSTR(T1.SalFmd, 11, 1) || SUBSTR(T1.SalFmd, 21, 1) || SUBSTR(T1.SalFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Trabajosexternos_trabajoexterno_header_trnwwds_12_tfsalfirma4d_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.SalFmd, 1, 1) || SUBSTR(T1.SalFmd, 11, 1) || SUBSTR(T1.SalFmd, 21, 1) || SUBSTR(T1.SalFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (0==AV70SalExtAlb) )
      {
         addWhere(sWhereString, "(T1.SalExtAlb = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV71ManCod) )
      {
         addWhere(sWhereString, "(T1.ManCod = ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72SalExtFec)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec >= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73SalExtFecTo)) )
      {
         addWhere(sWhereString, "(T1.SalExtFec <= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
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
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
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
                  return conditional_H02782(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).shortValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
            case 1 :
                  return conditional_H02783(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (java.util.Date)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).shortValue() , (java.util.Date)dynConstraints[22] , (java.util.Date)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.util.Date)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).shortValue() , (java.util.Date)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() , ((Boolean) dynConstraints[33]).booleanValue() , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02782", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02783", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 200);
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
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 20);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 20);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 20);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 20);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[28]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               return;
      }
   }

}

