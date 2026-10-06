package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultaloteproducto_impl extends GXDataArea
{
   public consultaloteproducto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultaloteproducto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaloteproducto_impl.class ));
   }

   public consultaloteproducto_impl( int remoteHandle ,
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
            AV5Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6Prdnum = httpContext.GetPar( "Prdnum") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Prdnum", AV6Prdnum);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Prdnum, ""))));
               AV7PrdNom = httpContext.GetPar( "PrdNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7PrdNom", AV7PrdNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PrdNom, ""))));
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
      AV18FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Prdnum = httpContext.GetPar( "Prdnum") ;
      AV28ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23ColumnsSelector);
      AV29TFLoteFec = localUtil.parseDateParm( httpContext.GetPar( "TFLoteFec")) ;
      AV33TFLoteID = httpContext.GetPar( "TFLoteID") ;
      AV34TFLoteID_Sel = httpContext.GetPar( "TFLoteID_Sel") ;
      AV35TFLotePed = (int)(GXutil.lval( httpContext.GetPar( "TFLotePed"))) ;
      AV36TFLotePed_To = (int)(GXutil.lval( httpContext.GetPar( "TFLotePed_To"))) ;
      AV37TFLoteCtf = httpContext.GetPar( "TFLoteCtf") ;
      AV38TFLoteCtf_Sel = httpContext.GetPar( "TFLoteCtf_Sel") ;
      AV39TFLoteCon = httpContext.GetPar( "TFLoteCon") ;
      AV40TFLoteCon_Sel = httpContext.GetPar( "TFLoteCon_Sel") ;
      AV41TFLoteCtfNm = httpContext.GetPar( "TFLoteCtfNm") ;
      AV42TFLoteCtfNm_Sel = httpContext.GetPar( "TFLoteCtfNm_Sel") ;
      AV43TFLoteCtfNF = httpContext.GetPar( "TFLoteCtfNF") ;
      AV44TFLoteCtfNF_Sel = httpContext.GetPar( "TFLoteCtfNF_Sel") ;
      AV51Pgmname = httpContext.GetPar( "Pgmname") ;
      AV15OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV16OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV7PrdNom = httpContext.GetPar( "PrdNom") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV5Emprcod, AV6Prdnum, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLoteFec, AV33TFLoteID, AV34TFLoteID_Sel, AV35TFLotePed, AV36TFLotePed_To, AV37TFLoteCtf, AV38TFLoteCtf_Sel, AV39TFLoteCon, AV40TFLoteCon_Sel, AV41TFLoteCtfNm, AV42TFLoteCtfNm_Sel, AV43TFLoteCtfNF, AV44TFLoteCtfNF_Sel, AV51Pgmname, AV15OrderedBy, AV16OrderedDsc, AV7PrdNom) ;
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
      pa1VN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1VN2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.consultaloteproducto", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Prdnum)),GXutil.URLEncode(GXutil.rtrim(AV7PrdNom))}, new String[] {"Emprcod","Prdnum","PrdNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Prdnum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PrdNom, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaLoteProducto");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultaloteproducto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV18FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV26ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV47GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV48GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV28ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTEFEC", localUtil.dtoc( AV29TFLoteFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTEID", GXutil.rtrim( AV33TFLoteID));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTEID_SEL", GXutil.rtrim( AV34TFLoteID_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTEPED", GXutil.ltrim( localUtil.ntoc( AV35TFLotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTEPED_TO", GXutil.ltrim( localUtil.ntoc( AV36TFLotePed_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECTF", GXutil.rtrim( AV37TFLoteCtf));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECTF_SEL", GXutil.rtrim( AV38TFLoteCtf_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECON", GXutil.rtrim( AV39TFLoteCon));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECON_SEL", GXutil.rtrim( AV40TFLoteCon_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECTFNM", GXutil.rtrim( AV41TFLoteCtfNm));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECTFNM_SEL", GXutil.rtrim( AV42TFLoteCtfNm_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECTFNF", GXutil.rtrim( AV43TFLoteCtfNF));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLOTECTFNF_SEL", GXutil.rtrim( AV44TFLoteCtfNF_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV15OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV16OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV6Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Prdnum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOM", GXutil.rtrim( AV7PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PrdNom, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV13GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV13GridState);
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
         we1VN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1VN2( ) ;
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
      return formatLink("app.consultaloteproducto", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Prdnum)),GXutil.URLEncode(GXutil.rtrim(AV7PrdNom))}, new String[] {"Emprcod","Prdnum","PrdNom"})  ;
   }

   public String getPgmname( )
   {
      return "ConsultaLoteProducto" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Lotes Productos", "") ;
   }

   public void wb1VN0( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaLoteProducto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaLoteProducto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ConsultaLoteProducto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1VN2( true) ;
      }
      else
      {
         wb_table1_23_1VN2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1VN2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV47GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV48GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV51Pgmname), GXutil.rtrim( localUtil.format( AV51Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ConsultaLoteProducto.htm");
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
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV45DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV45DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lotefecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lotefecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lotefecauxdate_Internalname, localUtil.format(AV31DDO_LoteFecAuxDate, "99/99/99"), localUtil.format( AV31DDO_LoteFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lotefecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ConsultaLoteProducto.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lotefecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ConsultaLoteProducto.htm");
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

   public void start1VN2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Lotes Productos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1VN0( ) ;
   }

   public void ws1VN2( )
   {
      start1VN2( ) ;
      evt1VN2( ) ;
   }

   public void evt1VN2( )
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
                           e111VN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121VN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131VN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141VN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151VN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e161VN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e171VN2 ();
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
                           A11665LoteFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtLoteFec_Internalname), 0)) ;
                           A11664LoteID = httpContext.cgiGet( edtLoteID_Internalname) ;
                           A11666LotePed = (int)(localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11667LoteCtf = GXutil.upper( httpContext.cgiGet( edtLoteCtf_Internalname)) ;
                           A11668LoteCon = GXutil.upper( httpContext.cgiGet( edtLoteCon_Internalname)) ;
                           A11711LoteCtfNm = httpContext.cgiGet( edtLoteCtfNm_Internalname) ;
                           A12352LoteCtfNF = httpContext.cgiGet( edtLoteCtfNF_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e181VN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e191VN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201VN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV18FilterFullText) != 0 )
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

   public void we1VN2( )
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

   public void pa1VN2( )
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
                                 String AV18FilterFullText ,
                                 String AV5Emprcod ,
                                 String AV6Prdnum ,
                                 byte AV28ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ,
                                 java.util.Date AV29TFLoteFec ,
                                 String AV33TFLoteID ,
                                 String AV34TFLoteID_Sel ,
                                 int AV35TFLotePed ,
                                 int AV36TFLotePed_To ,
                                 String AV37TFLoteCtf ,
                                 String AV38TFLoteCtf_Sel ,
                                 String AV39TFLoteCon ,
                                 String AV40TFLoteCon_Sel ,
                                 String AV41TFLoteCtfNm ,
                                 String AV42TFLoteCtfNm_Sel ,
                                 String AV43TFLoteCtfNF ,
                                 String AV44TFLoteCtfNF_Sel ,
                                 String AV51Pgmname ,
                                 short AV15OrderedBy ,
                                 boolean AV16OrderedDsc ,
                                 String AV7PrdNom )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191VN2 ();
      GRID_nCurrentRecord = 0 ;
      rf1VN2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaLoteProducto");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("consultaloteproducto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1VN2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV51Pgmname = "ConsultaLoteProducto" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1VN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191VN2 ();
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
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV55Consultaloteproductods_1_filterfulltext ,
                                              AV56Consultaloteproductods_2_tflotefec ,
                                              AV58Consultaloteproductods_4_tfloteid_sel ,
                                              AV57Consultaloteproductods_3_tfloteid ,
                                              Integer.valueOf(AV59Consultaloteproductods_5_tfloteped) ,
                                              Integer.valueOf(AV60Consultaloteproductods_6_tfloteped_to) ,
                                              AV62Consultaloteproductods_8_tflotectf_sel ,
                                              AV61Consultaloteproductods_7_tflotectf ,
                                              AV64Consultaloteproductods_10_tflotecon_sel ,
                                              AV63Consultaloteproductods_9_tflotecon ,
                                              AV66Consultaloteproductods_12_tflotectfnm_sel ,
                                              AV65Consultaloteproductods_11_tflotectfnm ,
                                              AV68Consultaloteproductods_14_tflotectfnf_sel ,
                                              AV67Consultaloteproductods_13_tflotectfnf ,
                                              A11664LoteID ,
                                              Integer.valueOf(A11666LotePed) ,
                                              A11667LoteCtf ,
                                              A11668LoteCon ,
                                              A11711LoteCtfNm ,
                                              A12352LoteCtfNF ,
                                              A11665LoteFec ,
                                              Short.valueOf(AV15OrderedBy) ,
                                              Boolean.valueOf(AV16OrderedDsc) ,
                                              AV5Emprcod ,
                                              AV6Prdnum ,
                                              A396EmprCod ,
                                              A719PrdNum } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
         lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
         lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
         lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
         lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
         lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
         lV57Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV57Consultaloteproductods_3_tfloteid), 26, "%") ;
         lV61Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV61Consultaloteproductods_7_tflotectf), 1, "%") ;
         lV63Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV63Consultaloteproductods_9_tflotecon), 1, "%") ;
         lV65Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV65Consultaloteproductods_11_tflotectfnm), 50, "%") ;
         lV67Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV67Consultaloteproductods_13_tflotectfnf), 50, "%") ;
         /* Using cursor H01VN2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, AV6Prdnum, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, AV56Consultaloteproductods_2_tflotefec, lV57Consultaloteproductods_3_tfloteid, AV58Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV59Consultaloteproductods_5_tfloteped), Integer.valueOf(AV60Consultaloteproductods_6_tfloteped_to), lV61Consultaloteproductods_7_tflotectf, AV62Consultaloteproductods_8_tflotectf_sel, lV63Consultaloteproductods_9_tflotecon, AV64Consultaloteproductods_10_tflotecon_sel, lV65Consultaloteproductods_11_tflotectfnm, AV66Consultaloteproductods_12_tflotectfnm_sel, lV67Consultaloteproductods_13_tflotectfnf, AV68Consultaloteproductods_14_tflotectfnf_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01VN2_A396EmprCod[0] ;
            A719PrdNum = H01VN2_A719PrdNum[0] ;
            A12352LoteCtfNF = H01VN2_A12352LoteCtfNF[0] ;
            A11711LoteCtfNm = H01VN2_A11711LoteCtfNm[0] ;
            A11668LoteCon = H01VN2_A11668LoteCon[0] ;
            A11667LoteCtf = H01VN2_A11667LoteCtf[0] ;
            A11666LotePed = H01VN2_A11666LotePed[0] ;
            A11664LoteID = H01VN2_A11664LoteID[0] ;
            A11665LoteFec = H01VN2_A11665LoteFec[0] ;
            e201VN2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(41) ;
         wb1VN0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1VN2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV6Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Prdnum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOM", GXutil.rtrim( AV7PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PrdNom, ""))));
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
      AV55Consultaloteproductods_1_filterfulltext = AV18FilterFullText ;
      AV56Consultaloteproductods_2_tflotefec = AV29TFLoteFec ;
      AV57Consultaloteproductods_3_tfloteid = AV33TFLoteID ;
      AV58Consultaloteproductods_4_tfloteid_sel = AV34TFLoteID_Sel ;
      AV59Consultaloteproductods_5_tfloteped = AV35TFLotePed ;
      AV60Consultaloteproductods_6_tfloteped_to = AV36TFLotePed_To ;
      AV61Consultaloteproductods_7_tflotectf = AV37TFLoteCtf ;
      AV62Consultaloteproductods_8_tflotectf_sel = AV38TFLoteCtf_Sel ;
      AV63Consultaloteproductods_9_tflotecon = AV39TFLoteCon ;
      AV64Consultaloteproductods_10_tflotecon_sel = AV40TFLoteCon_Sel ;
      AV65Consultaloteproductods_11_tflotectfnm = AV41TFLoteCtfNm ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = AV42TFLoteCtfNm_Sel ;
      AV67Consultaloteproductods_13_tflotectfnf = AV43TFLoteCtfNF ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = AV44TFLoteCtfNF_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV55Consultaloteproductods_1_filterfulltext ,
                                           AV56Consultaloteproductods_2_tflotefec ,
                                           AV58Consultaloteproductods_4_tfloteid_sel ,
                                           AV57Consultaloteproductods_3_tfloteid ,
                                           Integer.valueOf(AV59Consultaloteproductods_5_tfloteped) ,
                                           Integer.valueOf(AV60Consultaloteproductods_6_tfloteped_to) ,
                                           AV62Consultaloteproductods_8_tflotectf_sel ,
                                           AV61Consultaloteproductods_7_tflotectf ,
                                           AV64Consultaloteproductods_10_tflotecon_sel ,
                                           AV63Consultaloteproductods_9_tflotecon ,
                                           AV66Consultaloteproductods_12_tflotectfnm_sel ,
                                           AV65Consultaloteproductods_11_tflotectfnm ,
                                           AV68Consultaloteproductods_14_tflotectfnf_sel ,
                                           AV67Consultaloteproductods_13_tflotectfnf ,
                                           A11664LoteID ,
                                           Integer.valueOf(A11666LotePed) ,
                                           A11667LoteCtf ,
                                           A11668LoteCon ,
                                           A11711LoteCtfNm ,
                                           A12352LoteCtfNF ,
                                           A11665LoteFec ,
                                           Short.valueOf(AV15OrderedBy) ,
                                           Boolean.valueOf(AV16OrderedDsc) ,
                                           AV5Emprcod ,
                                           AV6Prdnum ,
                                           A396EmprCod ,
                                           A719PrdNum } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV55Consultaloteproductods_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV55Consultaloteproductods_1_filterfulltext), "%", "") ;
      lV57Consultaloteproductods_3_tfloteid = GXutil.padr( GXutil.rtrim( AV57Consultaloteproductods_3_tfloteid), 26, "%") ;
      lV61Consultaloteproductods_7_tflotectf = GXutil.padr( GXutil.rtrim( AV61Consultaloteproductods_7_tflotectf), 1, "%") ;
      lV63Consultaloteproductods_9_tflotecon = GXutil.padr( GXutil.rtrim( AV63Consultaloteproductods_9_tflotecon), 1, "%") ;
      lV65Consultaloteproductods_11_tflotectfnm = GXutil.padr( GXutil.rtrim( AV65Consultaloteproductods_11_tflotectfnm), 50, "%") ;
      lV67Consultaloteproductods_13_tflotectfnf = GXutil.padr( GXutil.rtrim( AV67Consultaloteproductods_13_tflotectfnf), 50, "%") ;
      /* Using cursor H01VN3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, AV6Prdnum, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, lV55Consultaloteproductods_1_filterfulltext, AV56Consultaloteproductods_2_tflotefec, lV57Consultaloteproductods_3_tfloteid, AV58Consultaloteproductods_4_tfloteid_sel, Integer.valueOf(AV59Consultaloteproductods_5_tfloteped), Integer.valueOf(AV60Consultaloteproductods_6_tfloteped_to), lV61Consultaloteproductods_7_tflotectf, AV62Consultaloteproductods_8_tflotectf_sel, lV63Consultaloteproductods_9_tflotecon, AV64Consultaloteproductods_10_tflotecon_sel, lV65Consultaloteproductods_11_tflotectfnm, AV66Consultaloteproductods_12_tflotectfnm_sel, lV67Consultaloteproductods_13_tflotectfnf, AV68Consultaloteproductods_14_tflotectfnf_sel});
      GRID_nRecordCount = H01VN3_AGRID_nRecordCount[0] ;
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
      AV55Consultaloteproductods_1_filterfulltext = AV18FilterFullText ;
      AV56Consultaloteproductods_2_tflotefec = AV29TFLoteFec ;
      AV57Consultaloteproductods_3_tfloteid = AV33TFLoteID ;
      AV58Consultaloteproductods_4_tfloteid_sel = AV34TFLoteID_Sel ;
      AV59Consultaloteproductods_5_tfloteped = AV35TFLotePed ;
      AV60Consultaloteproductods_6_tfloteped_to = AV36TFLotePed_To ;
      AV61Consultaloteproductods_7_tflotectf = AV37TFLoteCtf ;
      AV62Consultaloteproductods_8_tflotectf_sel = AV38TFLoteCtf_Sel ;
      AV63Consultaloteproductods_9_tflotecon = AV39TFLoteCon ;
      AV64Consultaloteproductods_10_tflotecon_sel = AV40TFLoteCon_Sel ;
      AV65Consultaloteproductods_11_tflotectfnm = AV41TFLoteCtfNm ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = AV42TFLoteCtfNm_Sel ;
      AV67Consultaloteproductods_13_tflotectfnf = AV43TFLoteCtfNF ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = AV44TFLoteCtfNF_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV5Emprcod, AV6Prdnum, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLoteFec, AV33TFLoteID, AV34TFLoteID_Sel, AV35TFLotePed, AV36TFLotePed_To, AV37TFLoteCtf, AV38TFLoteCtf_Sel, AV39TFLoteCon, AV40TFLoteCon_Sel, AV41TFLoteCtfNm, AV42TFLoteCtfNm_Sel, AV43TFLoteCtfNF, AV44TFLoteCtfNF_Sel, AV51Pgmname, AV15OrderedBy, AV16OrderedDsc, AV7PrdNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV55Consultaloteproductods_1_filterfulltext = AV18FilterFullText ;
      AV56Consultaloteproductods_2_tflotefec = AV29TFLoteFec ;
      AV57Consultaloteproductods_3_tfloteid = AV33TFLoteID ;
      AV58Consultaloteproductods_4_tfloteid_sel = AV34TFLoteID_Sel ;
      AV59Consultaloteproductods_5_tfloteped = AV35TFLotePed ;
      AV60Consultaloteproductods_6_tfloteped_to = AV36TFLotePed_To ;
      AV61Consultaloteproductods_7_tflotectf = AV37TFLoteCtf ;
      AV62Consultaloteproductods_8_tflotectf_sel = AV38TFLoteCtf_Sel ;
      AV63Consultaloteproductods_9_tflotecon = AV39TFLoteCon ;
      AV64Consultaloteproductods_10_tflotecon_sel = AV40TFLoteCon_Sel ;
      AV65Consultaloteproductods_11_tflotectfnm = AV41TFLoteCtfNm ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = AV42TFLoteCtfNm_Sel ;
      AV67Consultaloteproductods_13_tflotectfnf = AV43TFLoteCtfNF ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = AV44TFLoteCtfNF_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV5Emprcod, AV6Prdnum, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLoteFec, AV33TFLoteID, AV34TFLoteID_Sel, AV35TFLotePed, AV36TFLotePed_To, AV37TFLoteCtf, AV38TFLoteCtf_Sel, AV39TFLoteCon, AV40TFLoteCon_Sel, AV41TFLoteCtfNm, AV42TFLoteCtfNm_Sel, AV43TFLoteCtfNF, AV44TFLoteCtfNF_Sel, AV51Pgmname, AV15OrderedBy, AV16OrderedDsc, AV7PrdNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV55Consultaloteproductods_1_filterfulltext = AV18FilterFullText ;
      AV56Consultaloteproductods_2_tflotefec = AV29TFLoteFec ;
      AV57Consultaloteproductods_3_tfloteid = AV33TFLoteID ;
      AV58Consultaloteproductods_4_tfloteid_sel = AV34TFLoteID_Sel ;
      AV59Consultaloteproductods_5_tfloteped = AV35TFLotePed ;
      AV60Consultaloteproductods_6_tfloteped_to = AV36TFLotePed_To ;
      AV61Consultaloteproductods_7_tflotectf = AV37TFLoteCtf ;
      AV62Consultaloteproductods_8_tflotectf_sel = AV38TFLoteCtf_Sel ;
      AV63Consultaloteproductods_9_tflotecon = AV39TFLoteCon ;
      AV64Consultaloteproductods_10_tflotecon_sel = AV40TFLoteCon_Sel ;
      AV65Consultaloteproductods_11_tflotectfnm = AV41TFLoteCtfNm ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = AV42TFLoteCtfNm_Sel ;
      AV67Consultaloteproductods_13_tflotectfnf = AV43TFLoteCtfNF ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = AV44TFLoteCtfNF_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV5Emprcod, AV6Prdnum, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLoteFec, AV33TFLoteID, AV34TFLoteID_Sel, AV35TFLotePed, AV36TFLotePed_To, AV37TFLoteCtf, AV38TFLoteCtf_Sel, AV39TFLoteCon, AV40TFLoteCon_Sel, AV41TFLoteCtfNm, AV42TFLoteCtfNm_Sel, AV43TFLoteCtfNF, AV44TFLoteCtfNF_Sel, AV51Pgmname, AV15OrderedBy, AV16OrderedDsc, AV7PrdNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV55Consultaloteproductods_1_filterfulltext = AV18FilterFullText ;
      AV56Consultaloteproductods_2_tflotefec = AV29TFLoteFec ;
      AV57Consultaloteproductods_3_tfloteid = AV33TFLoteID ;
      AV58Consultaloteproductods_4_tfloteid_sel = AV34TFLoteID_Sel ;
      AV59Consultaloteproductods_5_tfloteped = AV35TFLotePed ;
      AV60Consultaloteproductods_6_tfloteped_to = AV36TFLotePed_To ;
      AV61Consultaloteproductods_7_tflotectf = AV37TFLoteCtf ;
      AV62Consultaloteproductods_8_tflotectf_sel = AV38TFLoteCtf_Sel ;
      AV63Consultaloteproductods_9_tflotecon = AV39TFLoteCon ;
      AV64Consultaloteproductods_10_tflotecon_sel = AV40TFLoteCon_Sel ;
      AV65Consultaloteproductods_11_tflotectfnm = AV41TFLoteCtfNm ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = AV42TFLoteCtfNm_Sel ;
      AV67Consultaloteproductods_13_tflotectfnf = AV43TFLoteCtfNF ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = AV44TFLoteCtfNF_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV5Emprcod, AV6Prdnum, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLoteFec, AV33TFLoteID, AV34TFLoteID_Sel, AV35TFLotePed, AV36TFLotePed_To, AV37TFLoteCtf, AV38TFLoteCtf_Sel, AV39TFLoteCon, AV40TFLoteCon_Sel, AV41TFLoteCtfNm, AV42TFLoteCtfNm_Sel, AV43TFLoteCtfNF, AV44TFLoteCtfNF_Sel, AV51Pgmname, AV15OrderedBy, AV16OrderedDsc, AV7PrdNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV55Consultaloteproductods_1_filterfulltext = AV18FilterFullText ;
      AV56Consultaloteproductods_2_tflotefec = AV29TFLoteFec ;
      AV57Consultaloteproductods_3_tfloteid = AV33TFLoteID ;
      AV58Consultaloteproductods_4_tfloteid_sel = AV34TFLoteID_Sel ;
      AV59Consultaloteproductods_5_tfloteped = AV35TFLotePed ;
      AV60Consultaloteproductods_6_tfloteped_to = AV36TFLotePed_To ;
      AV61Consultaloteproductods_7_tflotectf = AV37TFLoteCtf ;
      AV62Consultaloteproductods_8_tflotectf_sel = AV38TFLoteCtf_Sel ;
      AV63Consultaloteproductods_9_tflotecon = AV39TFLoteCon ;
      AV64Consultaloteproductods_10_tflotecon_sel = AV40TFLoteCon_Sel ;
      AV65Consultaloteproductods_11_tflotectfnm = AV41TFLoteCtfNm ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = AV42TFLoteCtfNm_Sel ;
      AV67Consultaloteproductods_13_tflotectfnf = AV43TFLoteCtfNF ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = AV44TFLoteCtfNF_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV18FilterFullText, AV5Emprcod, AV6Prdnum, AV28ManageFiltersExecutionStep, AV23ColumnsSelector, AV29TFLoteFec, AV33TFLoteID, AV34TFLoteID_Sel, AV35TFLotePed, AV36TFLotePed_To, AV37TFLoteCtf, AV38TFLoteCtf_Sel, AV39TFLoteCon, AV40TFLoteCon_Sel, AV41TFLoteCtfNm, AV42TFLoteCtfNm_Sel, AV43TFLoteCtfNF, AV44TFLoteCtfNF_Sel, AV51Pgmname, AV15OrderedBy, AV16OrderedDsc, AV7PrdNom) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV51Pgmname = "ConsultaLoteProducto" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1VN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181VN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV26ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV45DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV47GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV48GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         AV18FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18FilterFullText", AV18FilterFullText);
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lotefecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LOTEFECAUXDATE");
            GX_FocusControl = edtavDdo_lotefecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31DDO_LoteFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31DDO_LoteFecAuxDate", localUtil.format(AV31DDO_LoteFecAuxDate, "99/99/99"));
         }
         else
         {
            AV31DDO_LoteFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lotefecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31DDO_LoteFecAuxDate", localUtil.format(AV31DDO_LoteFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ConsultaLoteProducto");
         AV51Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Pgmname", AV51Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV51Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("consultaloteproducto:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV18FilterFullText) != 0 )
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
      e181VN2 ();
      if (returnInSub) return;
   }

   public void e181VN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV52Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultaloteproducto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV53Emprnom ;
      GXv_char4[0] = AV54Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultaloteproducto_impl.this.AV5Emprcod = GXv_char2[0] ;
      consultaloteproducto_impl.this.AV53Emprnom = GXv_char3[0] ;
      consultaloteproducto_impl.this.AV54Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV10HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Consulta Lotes Productos", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV15OrderedBy < 1 )
      {
         AV15OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV45DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV45DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191VN2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV9WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV28ManageFiltersExecutionStep == 1 )
      {
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV28ManageFiltersExecutionStep == 2 )
      {
         AV28ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV25Session.getValue("ConsultaLoteProductoColumnsSelector"), "") != 0 )
      {
         AV21ColumnsSelectorXML = AV25Session.getValue("ConsultaLoteProductoColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV21ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtLoteFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLoteID_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLotePed_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLoteCtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtf_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLoteCon_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCon_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLoteCtfNm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtLoteCtfNF_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNF_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNF_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV47GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridCurrentPage), 10, 0));
      AV48GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridPageCount), 10, 0));
      AV55Consultaloteproductods_1_filterfulltext = AV18FilterFullText ;
      AV56Consultaloteproductods_2_tflotefec = AV29TFLoteFec ;
      AV57Consultaloteproductods_3_tfloteid = AV33TFLoteID ;
      AV58Consultaloteproductods_4_tfloteid_sel = AV34TFLoteID_Sel ;
      AV59Consultaloteproductods_5_tfloteped = AV35TFLotePed ;
      AV60Consultaloteproductods_6_tfloteped_to = AV36TFLotePed_To ;
      AV61Consultaloteproductods_7_tflotectf = AV37TFLoteCtf ;
      AV62Consultaloteproductods_8_tflotectf_sel = AV38TFLoteCtf_Sel ;
      AV63Consultaloteproductods_9_tflotecon = AV39TFLoteCon ;
      AV64Consultaloteproductods_10_tflotecon_sel = AV40TFLoteCon_Sel ;
      AV65Consultaloteproductods_11_tflotectfnm = AV41TFLoteCtfNm ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = AV42TFLoteCtfNm_Sel ;
      AV67Consultaloteproductods_13_tflotectfnf = AV43TFLoteCtfNF ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = AV44TFLoteCtfNF_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13GridState", AV13GridState);
   }

   public void e121VN2( )
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
         AV46PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV46PageToGo) ;
      }
   }

   public void e131VN2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141VN2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV15OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
         AV16OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedDsc", AV16OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LoteFec") == 0 )
         {
            AV29TFLoteFec = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFLoteFec", localUtil.format(AV29TFLoteFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LoteID") == 0 )
         {
            AV33TFLoteID = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFLoteID", AV33TFLoteID);
            AV34TFLoteID_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFLoteID_Sel", AV34TFLoteID_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LotePed") == 0 )
         {
            AV35TFLotePed = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFLotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFLotePed), 8, 0));
            AV36TFLotePed_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFLotePed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFLotePed_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LoteCtf") == 0 )
         {
            AV37TFLoteCtf = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFLoteCtf", AV37TFLoteCtf);
            AV38TFLoteCtf_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLoteCtf_Sel", AV38TFLoteCtf_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LoteCon") == 0 )
         {
            AV39TFLoteCon = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFLoteCon", AV39TFLoteCon);
            AV40TFLoteCon_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLoteCon_Sel", AV40TFLoteCon_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LoteCtfNm") == 0 )
         {
            AV41TFLoteCtfNm = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLoteCtfNm", AV41TFLoteCtfNm);
            AV42TFLoteCtfNm_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLoteCtfNm_Sel", AV42TFLoteCtfNm_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LoteCtfNF") == 0 )
         {
            AV43TFLoteCtfNF = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLoteCtfNF", AV43TFLoteCtfNF);
            AV44TFLoteCtfNF_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLoteCtfNF_Sel", AV44TFLoteCtfNF_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201VN2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(41) ;
      }
      sendrow_412( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
   }

   public void e151VN2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV21ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV23ColumnsSelector.fromJSonString(AV21ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ConsultaLoteProductoColumnsSelector", ((GXutil.strcmp("", AV21ColumnsSelectorXML)==0) ? "" : AV23ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ManageFiltersData", AV26ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13GridState", AV13GridState);
   }

   public void e111VN2( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsultaLoteProductoFilters")),GXutil.URLEncode(GXutil.rtrim(AV51Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ConsultaLoteProductoFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV28ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28ManageFiltersExecutionStep", GXutil.str( AV28ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV27ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ConsultaLoteProductoFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultaloteproducto_impl.this.GXt_char1 = GXv_char4[0] ;
         AV27ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV27ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV51Pgmname+"GridState", AV27ManageFiltersXml) ;
            AV13GridState.fromxml(AV27ManageFiltersXml, null, null);
            AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
            AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedDsc", AV16OrderedDsc);
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13GridState", AV13GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26ManageFiltersData", AV26ManageFiltersData);
   }

   public void e161VN2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV19ExcelFilename ;
      GXv_char3[0] = AV20ErrorMessage ;
      new app.consultaloteproductoexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      consultaloteproducto_impl.this.AV19ExcelFilename = GXv_char4[0] ;
      consultaloteproducto_impl.this.AV20ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV19ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV19ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV20ErrorMessage);
      }
   }

   public void e171VN2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.consultaloteproductoexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV15OrderedBy, 4, 0))+":"+(AV16OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LoteFec", "", "Fecha Lote", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LoteID", "", "Lote ID", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LotePed", "", "Pedido", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LoteCtf", "", "Certificado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LoteCon", "", "Consumido", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LoteCtfNm", "", "Cerficado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LoteCtfNF", "", "Certificado Proveedor", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV22UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ConsultaLoteProductoColumnsSelector", GXv_char4) ;
      consultaloteproducto_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV22UserCustomValue)==0) ) )
      {
         AV24ColumnsSelectorAux.fromxml(AV22UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV24ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV24ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV26ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ConsultaLoteProductoFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV26ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV18FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18FilterFullText", AV18FilterFullText);
      AV29TFLoteFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFLoteFec", localUtil.format(AV29TFLoteFec, "99/99/99"));
      AV33TFLoteID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFLoteID", AV33TFLoteID);
      AV34TFLoteID_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFLoteID_Sel", AV34TFLoteID_Sel);
      AV35TFLotePed = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFLotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFLotePed), 8, 0));
      AV36TFLotePed_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFLotePed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFLotePed_To), 8, 0));
      AV37TFLoteCtf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFLoteCtf", AV37TFLoteCtf);
      AV38TFLoteCtf_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFLoteCtf_Sel", AV38TFLoteCtf_Sel);
      AV39TFLoteCon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFLoteCon", AV39TFLoteCon);
      AV40TFLoteCon_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFLoteCon_Sel", AV40TFLoteCon_Sel);
      AV41TFLoteCtfNm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFLoteCtfNm", AV41TFLoteCtfNm);
      AV42TFLoteCtfNm_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42TFLoteCtfNm_Sel", AV42TFLoteCtfNm_Sel);
      AV43TFLoteCtfNF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFLoteCtfNF", AV43TFLoteCtfNF);
      AV44TFLoteCtfNF_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44TFLoteCtfNF_Sel", AV44TFLoteCtfNF_Sel);
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
      if ( GXutil.strcmp(AV25Session.getValue(AV51Pgmname+"GridState"), "") == 0 )
      {
         AV13GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV51Pgmname+"GridState"), null, null);
      }
      else
      {
         AV13GridState.fromxml(AV25Session.getValue(AV51Pgmname+"GridState"), null, null);
      }
      AV15OrderedBy = AV13GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15OrderedBy), 4, 0));
      AV16OrderedDsc = AV13GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16OrderedDsc", AV16OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV13GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV13GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV13GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV69GXV1 = 1 ;
      while ( AV69GXV1 <= AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV69GXV1));
         if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV18FilterFullText = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18FilterFullText", AV18FilterFullText);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEFEC") == 0 )
         {
            AV29TFLoteFec = localUtil.ctod( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFLoteFec", localUtil.format(AV29TFLoteFec, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID") == 0 )
         {
            AV33TFLoteID = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFLoteID", AV33TFLoteID);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEID_SEL") == 0 )
         {
            AV34TFLoteID_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFLoteID_Sel", AV34TFLoteID_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTEPED") == 0 )
         {
            AV35TFLotePed = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFLotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFLotePed), 8, 0));
            AV36TFLotePed_To = (int)(GXutil.lval( AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFLotePed_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFLotePed_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF") == 0 )
         {
            AV37TFLoteCtf = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFLoteCtf", AV37TFLoteCtf);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTF_SEL") == 0 )
         {
            AV38TFLoteCtf_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFLoteCtf_Sel", AV38TFLoteCtf_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON") == 0 )
         {
            AV39TFLoteCon = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFLoteCon", AV39TFLoteCon);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECON_SEL") == 0 )
         {
            AV40TFLoteCon_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFLoteCon_Sel", AV40TFLoteCon_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM") == 0 )
         {
            AV41TFLoteCtfNm = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFLoteCtfNm", AV41TFLoteCtfNm);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNM_SEL") == 0 )
         {
            AV42TFLoteCtfNm_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFLoteCtfNm_Sel", AV42TFLoteCtfNm_Sel);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF") == 0 )
         {
            AV43TFLoteCtfNF = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFLoteCtfNF", AV43TFLoteCtfNF);
         }
         else if ( GXutil.strcmp(AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLOTECTFNF_SEL") == 0 )
         {
            AV44TFLoteCtfNF_Sel = AV14GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFLoteCtfNF_Sel", AV44TFLoteCtfNF_Sel);
         }
         AV69GXV1 = (int)(AV69GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFLoteID_Sel)==0), AV34TFLoteID_Sel, GXv_char4) ;
      consultaloteproducto_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFLoteCtf_Sel)==0), AV38TFLoteCtf_Sel, GXv_char3) ;
      consultaloteproducto_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFLoteCon_Sel)==0), AV40TFLoteCon_Sel, GXv_char2) ;
      consultaloteproducto_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFLoteCtfNm_Sel)==0), AV42TFLoteCtfNm_Sel, GXv_char15) ;
      consultaloteproducto_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFLoteCtfNF_Sel)==0), AV44TFLoteCtfNF_Sel, GXv_char17) ;
      consultaloteproducto_impl.this.GXt_char16 = GXv_char17[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char12+"|"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFLoteID)==0), AV33TFLoteID, GXv_char17) ;
      consultaloteproducto_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFLoteCtf)==0), AV37TFLoteCtf, GXv_char15) ;
      consultaloteproducto_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFLoteCon)==0), AV39TFLoteCon, GXv_char4) ;
      consultaloteproducto_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFLoteCtfNm)==0), AV41TFLoteCtfNm, GXv_char3) ;
      consultaloteproducto_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFLoteCtfNF)==0), AV43TFLoteCtfNF, GXv_char2) ;
      consultaloteproducto_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFLoteFec)) ? "" : localUtil.dtoc( AV29TFLoteFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char16+"|"+((0==AV35TFLotePed) ? "" : GXutil.str( AV35TFLotePed, 8, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV36TFLotePed_To) ? "" : GXutil.str( AV36TFLotePed_To, 8, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV13GridState.fromxml(AV25Session.getValue(AV51Pgmname+"GridState"), null, null);
      AV13GridState.setgxTv_SdtWWPGridState_Orderedby( AV15OrderedBy );
      AV13GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV16OrderedDsc );
      AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV18FilterFullText)==0), (short)(0), AV18FilterFullText, "") ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFLOTEFEC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV29TFLoteFec)), (short)(0), GXutil.trim( localUtil.dtoc( AV29TFLoteFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFLOTEID", "", !(GXutil.strcmp("", AV33TFLoteID)==0), (short)(0), AV33TFLoteID, "", !(GXutil.strcmp("", AV34TFLoteID_Sel)==0), AV34TFLoteID_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFLOTEPED", "", !((0==AV35TFLotePed)&&(0==AV36TFLotePed_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFLotePed, 8, 0)), GXutil.trim( GXutil.str( AV36TFLotePed_To, 8, 0))) ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFLOTECTF", "", !(GXutil.strcmp("", AV37TFLoteCtf)==0), (short)(0), AV37TFLoteCtf, "", !(GXutil.strcmp("", AV38TFLoteCtf_Sel)==0), AV38TFLoteCtf_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFLOTECON", "", !(GXutil.strcmp("", AV39TFLoteCon)==0), (short)(0), AV39TFLoteCon, "", !(GXutil.strcmp("", AV40TFLoteCon_Sel)==0), AV40TFLoteCon_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFLOTECTFNM", "", !(GXutil.strcmp("", AV41TFLoteCtfNm)==0), (short)(0), AV41TFLoteCtfNm, "", !(GXutil.strcmp("", AV42TFLoteCtfNm_Sel)==0), AV42TFLoteCtfNm_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV13GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFLOTECTFNF", "", !(GXutil.strcmp("", AV43TFLoteCtfNF)==0), (short)(0), AV43TFLoteCtfNF, "", !(GXutil.strcmp("", AV44TFLoteCtfNF_Sel)==0), AV44TFLoteCtfNF_Sel, "") ;
      AV13GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV6Prdnum)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV6Prdnum );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7PrdNom)==0) )
      {
         AV14GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNOM" );
         AV14GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7PrdNom );
         AV13GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV14GridStateFilterValue, 0);
      }
      AV13GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV13GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV51Pgmname+"GridState", AV13GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV11TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV51Pgmname );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV10HTTPRequest.getScriptName()+"?"+AV10HTTPRequest.getQuerystring() );
      AV11TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "EntradaLoteProducto" );
      AV25Session.setValue("TrnContext", AV11TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1VN2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV26ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_1VN2( true) ;
      }
      else
      {
         wb_table2_28_1VN2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1VN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1VN2e( true) ;
      }
      else
      {
         wb_table1_23_1VN2e( false) ;
      }
   }

   public void wb_table2_28_1VN2( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV18FilterFullText, GXutil.rtrim( localUtil.format( AV18FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ConsultaLoteProducto.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1VN2e( true) ;
      }
      else
      {
         wb_table2_28_1VN2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      AV6Prdnum = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Prdnum", AV6Prdnum);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6Prdnum, ""))));
      AV7PrdNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7PrdNom", AV7PrdNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7PrdNom, ""))));
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
      pa1VN2( ) ;
      ws1VN2( ) ;
      we1VN2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614571", true, true);
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
      httpContext.AddJavascriptSource("consultaloteproducto.js", "?20268211614571", false, true);
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
      edtLoteFec_Internalname = "LOTEFEC_"+sGXsfl_41_idx ;
      edtLoteID_Internalname = "LOTEID_"+sGXsfl_41_idx ;
      edtLotePed_Internalname = "LOTEPED_"+sGXsfl_41_idx ;
      edtLoteCtf_Internalname = "LOTECTF_"+sGXsfl_41_idx ;
      edtLoteCon_Internalname = "LOTECON_"+sGXsfl_41_idx ;
      edtLoteCtfNm_Internalname = "LOTECTFNM_"+sGXsfl_41_idx ;
      edtLoteCtfNF_Internalname = "LOTECTFNF_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtLoteFec_Internalname = "LOTEFEC_"+sGXsfl_41_fel_idx ;
      edtLoteID_Internalname = "LOTEID_"+sGXsfl_41_fel_idx ;
      edtLotePed_Internalname = "LOTEPED_"+sGXsfl_41_fel_idx ;
      edtLoteCtf_Internalname = "LOTECTF_"+sGXsfl_41_fel_idx ;
      edtLoteCon_Internalname = "LOTECON_"+sGXsfl_41_fel_idx ;
      edtLoteCtfNm_Internalname = "LOTECTFNM_"+sGXsfl_41_fel_idx ;
      edtLoteCtfNF_Internalname = "LOTECTFNF_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1VN0( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLoteFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteFec_Internalname,localUtil.format(A11665LoteFec, "99/99/99"),localUtil.format( A11665LoteFec, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLoteFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLoteID_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteID_Internalname,GXutil.rtrim( A11664LoteID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLoteID_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLotePed_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLotePed_Internalname,GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11666LotePed), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLotePed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLotePed_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLoteCtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteCtf_Internalname,GXutil.rtrim( A11667LoteCtf),GXutil.rtrim( localUtil.format( A11667LoteCtf, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteCtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLoteCtf_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLoteCon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteCon_Internalname,GXutil.rtrim( A11668LoteCon),GXutil.rtrim( localUtil.format( A11668LoteCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLoteCon_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLoteCtfNm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteCtfNm_Internalname,GXutil.rtrim( A11711LoteCtfNm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteCtfNm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLoteCtfNm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLoteCtfNF_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteCtfNF_Internalname,GXutil.rtrim( A12352LoteCtfNF),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteCtfNF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtLoteCtfNF_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1VN2( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLoteFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLoteID_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote ID", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLotePed_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLoteCtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Certificado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLoteCon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Consumido", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLoteCtfNm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerficado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLoteCtfNF_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Certificado Proveedor", "")) ;
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
         GridColumn.AddObjectProperty("Value", localUtil.format(A11665LoteFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLoteFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11664LoteID));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLoteID_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLotePed_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11667LoteCtf));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLoteCtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11668LoteCon));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLoteCon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11711LoteCtfNm));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12352LoteCtfNF));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNF_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtLoteFec_Internalname = "LOTEFEC" ;
      edtLoteID_Internalname = "LOTEID" ;
      edtLotePed_Internalname = "LOTEPED" ;
      edtLoteCtf_Internalname = "LOTECTF" ;
      edtLoteCon_Internalname = "LOTECON" ;
      edtLoteCtfNm_Internalname = "LOTECTFNM" ;
      edtLoteCtfNF_Internalname = "LOTECTFNF" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_lotefecauxdate_Internalname = "vDDO_LOTEFECAUXDATE" ;
      divDdo_lotefecauxdates_Internalname = "DDO_LOTEFECAUXDATES" ;
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
      edtLoteCtfNF_Jsonclick = "" ;
      edtLoteCtfNm_Jsonclick = "" ;
      edtLoteCon_Jsonclick = "" ;
      edtLoteCtf_Jsonclick = "" ;
      edtLotePed_Jsonclick = "" ;
      edtLoteID_Jsonclick = "" ;
      edtLoteFec_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtLoteCtfNF_Visible = -1 ;
      edtLoteCtfNm_Visible = -1 ;
      edtLoteCon_Visible = -1 ;
      edtLoteCtf_Visible = -1 ;
      edtLotePed_Visible = -1 ;
      edtLoteID_Visible = -1 ;
      edtLoteFec_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lotefecauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ConsultaLoteProductoGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T||T|T|T|T" ;
      Ddo_grid_Filterisrange = "||T||||" ;
      Ddo_grid_Filtertype = "Date|Character|Numeric|Character|Character|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "0:LoteFec|1:LoteID|2:LotePed|3:LoteCtf|4:LoteCon|5:LoteCtfNm|6:LoteCtfNF" ;
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
      Form.setCaption( httpContext.getMessage( "Consulta Lotes Productos", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6Prdnum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLoteFec_Visible',ctrl:'LOTEFEC',prop:'Visible'},{av:'edtLoteID_Visible',ctrl:'LOTEID',prop:'Visible'},{av:'edtLotePed_Visible',ctrl:'LOTEPED',prop:'Visible'},{av:'edtLoteCtf_Visible',ctrl:'LOTECTF',prop:'Visible'},{av:'edtLoteCon_Visible',ctrl:'LOTECON',prop:'Visible'},{av:'edtLoteCtfNm_Visible',ctrl:'LOTECTFNM',prop:'Visible'},{av:'edtLoteCtfNF_Visible',ctrl:'LOTECTFNF',prop:'Visible'},{av:'AV47GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV48GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121VN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6Prdnum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131VN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6Prdnum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141VN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6Prdnum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201VN2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151VN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6Prdnum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtLoteFec_Visible',ctrl:'LOTEFEC',prop:'Visible'},{av:'edtLoteID_Visible',ctrl:'LOTEID',prop:'Visible'},{av:'edtLotePed_Visible',ctrl:'LOTEPED',prop:'Visible'},{av:'edtLoteCtf_Visible',ctrl:'LOTECTF',prop:'Visible'},{av:'edtLoteCon_Visible',ctrl:'LOTECON',prop:'Visible'},{av:'edtLoteCtfNm_Visible',ctrl:'LOTECTFNM',prop:'Visible'},{av:'edtLoteCtfNF_Visible',ctrl:'LOTECTFNF',prop:'Visible'},{av:'AV47GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV48GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111VN2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6Prdnum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'AV51Pgmname',fld:'vPGMNAME',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7PrdNom',fld:'vPRDNOM',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV28ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV13GridState',fld:'vGRIDSTATE',pic:''},{av:'AV15OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV16OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV18FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV29TFLoteFec',fld:'vTFLOTEFEC',pic:''},{av:'AV33TFLoteID',fld:'vTFLOTEID',pic:''},{av:'AV34TFLoteID_Sel',fld:'vTFLOTEID_SEL',pic:''},{av:'AV35TFLotePed',fld:'vTFLOTEPED',pic:'ZZZZZZZ9'},{av:'AV36TFLotePed_To',fld:'vTFLOTEPED_TO',pic:'ZZZZZZZ9'},{av:'AV37TFLoteCtf',fld:'vTFLOTECTF',pic:'@!'},{av:'AV38TFLoteCtf_Sel',fld:'vTFLOTECTF_SEL',pic:'@!'},{av:'AV39TFLoteCon',fld:'vTFLOTECON',pic:'@!'},{av:'AV40TFLoteCon_Sel',fld:'vTFLOTECON_SEL',pic:'@!'},{av:'AV41TFLoteCtfNm',fld:'vTFLOTECTFNM',pic:''},{av:'AV42TFLoteCtfNm_Sel',fld:'vTFLOTECTFNM_SEL',pic:''},{av:'AV43TFLoteCtfNF',fld:'vTFLOTECTFNF',pic:''},{av:'AV44TFLoteCtfNF_Sel',fld:'vTFLOTECTFNF_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtLoteFec_Visible',ctrl:'LOTEFEC',prop:'Visible'},{av:'edtLoteID_Visible',ctrl:'LOTEID',prop:'Visible'},{av:'edtLotePed_Visible',ctrl:'LOTEPED',prop:'Visible'},{av:'edtLoteCtf_Visible',ctrl:'LOTECTF',prop:'Visible'},{av:'edtLoteCon_Visible',ctrl:'LOTECON',prop:'Visible'},{av:'edtLoteCtfNm_Visible',ctrl:'LOTECTFNM',prop:'Visible'},{av:'edtLoteCtfNF_Visible',ctrl:'LOTECTFNF',prop:'Visible'},{av:'AV47GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV48GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV26ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161VN2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171VN2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lotectfnf',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV6Prdnum = "" ;
      wcpOAV7PrdNom = "" ;
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
      AV5Emprcod = "" ;
      AV6Prdnum = "" ;
      AV7PrdNom = "" ;
      AV18FilterFullText = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV29TFLoteFec = GXutil.nullDate() ;
      AV33TFLoteID = "" ;
      AV34TFLoteID_Sel = "" ;
      AV37TFLoteCtf = "" ;
      AV38TFLoteCtf_Sel = "" ;
      AV39TFLoteCon = "" ;
      AV40TFLoteCon_Sel = "" ;
      AV41TFLoteCtfNm = "" ;
      AV42TFLoteCtfNm_Sel = "" ;
      AV43TFLoteCtfNF = "" ;
      AV44TFLoteCtfNF_Sel = "" ;
      AV51Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV26ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV45DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV13GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
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
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV31DDO_LoteFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      A11664LoteID = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      scmdbuf = "" ;
      lV55Consultaloteproductods_1_filterfulltext = "" ;
      lV57Consultaloteproductods_3_tfloteid = "" ;
      lV61Consultaloteproductods_7_tflotectf = "" ;
      lV63Consultaloteproductods_9_tflotecon = "" ;
      lV65Consultaloteproductods_11_tflotectfnm = "" ;
      lV67Consultaloteproductods_13_tflotectfnf = "" ;
      AV55Consultaloteproductods_1_filterfulltext = "" ;
      AV56Consultaloteproductods_2_tflotefec = GXutil.nullDate() ;
      AV58Consultaloteproductods_4_tfloteid_sel = "" ;
      AV57Consultaloteproductods_3_tfloteid = "" ;
      AV62Consultaloteproductods_8_tflotectf_sel = "" ;
      AV61Consultaloteproductods_7_tflotectf = "" ;
      AV64Consultaloteproductods_10_tflotecon_sel = "" ;
      AV63Consultaloteproductods_9_tflotecon = "" ;
      AV66Consultaloteproductods_12_tflotectfnm_sel = "" ;
      AV65Consultaloteproductods_11_tflotectfnm = "" ;
      AV68Consultaloteproductods_14_tflotectfnf_sel = "" ;
      AV67Consultaloteproductods_13_tflotectfnf = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      H01VN2_A396EmprCod = new String[] {""} ;
      H01VN2_A719PrdNum = new String[] {""} ;
      H01VN2_A12352LoteCtfNF = new String[] {""} ;
      H01VN2_A11711LoteCtfNm = new String[] {""} ;
      H01VN2_A11668LoteCon = new String[] {""} ;
      H01VN2_A11667LoteCtf = new String[] {""} ;
      H01VN2_A11666LotePed = new int[1] ;
      H01VN2_A11664LoteID = new String[] {""} ;
      H01VN2_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01VN3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV52Station = "" ;
      AV53Emprnom = "" ;
      AV54Usurcod = "" ;
      AV10HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV25Session = httpContext.getWebSession();
      AV21ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV27ManageFiltersXml = "" ;
      AV19ExcelFilename = "" ;
      AV20ErrorMessage = "" ;
      AV22UserCustomValue = "" ;
      AV24ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV14GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
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
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.consultaloteproducto__default(),
         new Object[] {
             new Object[] {
            H01VN2_A396EmprCod, H01VN2_A719PrdNum, H01VN2_A12352LoteCtfNF, H01VN2_A11711LoteCtfNm, H01VN2_A11668LoteCon, H01VN2_A11667LoteCtf, H01VN2_A11666LotePed, H01VN2_A11664LoteID, H01VN2_A11665LoteFec
            }
            , new Object[] {
            H01VN3_AGRID_nRecordCount
            }
         }
      );
      AV51Pgmname = "ConsultaLoteProducto" ;
      /* GeneXus formulas. */
      AV51Pgmname = "ConsultaLoteProducto" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV28ManageFiltersExecutionStep ;
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
   private short AV15OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int nGXsfl_41_idx=1 ;
   private int AV35TFLotePed ;
   private int AV36TFLotePed_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A11666LotePed ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV59Consultaloteproductods_5_tfloteped ;
   private int AV60Consultaloteproductods_6_tfloteped_to ;
   private int edtLoteFec_Visible ;
   private int edtLoteID_Visible ;
   private int edtLotePed_Visible ;
   private int edtLoteCtf_Visible ;
   private int edtLoteCon_Visible ;
   private int edtLoteCtfNm_Visible ;
   private int edtLoteCtfNF_Visible ;
   private int AV46PageToGo ;
   private int AV69GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV47GridCurrentPage ;
   private long AV48GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6Prdnum ;
   private String wcpOAV7PrdNom ;
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
   private String AV5Emprcod ;
   private String AV6Prdnum ;
   private String AV7PrdNom ;
   private String sGXsfl_41_idx="0001" ;
   private String AV33TFLoteID ;
   private String AV34TFLoteID_Sel ;
   private String AV37TFLoteCtf ;
   private String AV38TFLoteCtf_Sel ;
   private String AV39TFLoteCon ;
   private String AV40TFLoteCon_Sel ;
   private String AV41TFLoteCtfNm ;
   private String AV42TFLoteCtfNm_Sel ;
   private String AV43TFLoteCtfNF ;
   private String AV44TFLoteCtfNF_Sel ;
   private String AV51Pgmname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lotefecauxdates_Internalname ;
   private String edtavDdo_lotefecauxdate_Internalname ;
   private String edtavDdo_lotefecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtLoteFec_Internalname ;
   private String A11664LoteID ;
   private String edtLoteID_Internalname ;
   private String edtLotePed_Internalname ;
   private String A11667LoteCtf ;
   private String edtLoteCtf_Internalname ;
   private String A11668LoteCon ;
   private String edtLoteCon_Internalname ;
   private String A11711LoteCtfNm ;
   private String edtLoteCtfNm_Internalname ;
   private String A12352LoteCtfNF ;
   private String edtLoteCtfNF_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV57Consultaloteproductods_3_tfloteid ;
   private String lV61Consultaloteproductods_7_tflotectf ;
   private String lV63Consultaloteproductods_9_tflotecon ;
   private String lV65Consultaloteproductods_11_tflotectfnm ;
   private String lV67Consultaloteproductods_13_tflotectfnf ;
   private String AV58Consultaloteproductods_4_tfloteid_sel ;
   private String AV57Consultaloteproductods_3_tfloteid ;
   private String AV62Consultaloteproductods_8_tflotectf_sel ;
   private String AV61Consultaloteproductods_7_tflotectf ;
   private String AV64Consultaloteproductods_10_tflotecon_sel ;
   private String AV63Consultaloteproductods_9_tflotecon ;
   private String AV66Consultaloteproductods_12_tflotectfnm_sel ;
   private String AV65Consultaloteproductods_11_tflotectfnm ;
   private String AV68Consultaloteproductods_14_tflotectfnf_sel ;
   private String AV67Consultaloteproductods_13_tflotectfnf ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String hsh ;
   private String AV52Station ;
   private String AV53Emprnom ;
   private String AV54Usurcod ;
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
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtLoteFec_Jsonclick ;
   private String edtLoteID_Jsonclick ;
   private String edtLotePed_Jsonclick ;
   private String edtLoteCtf_Jsonclick ;
   private String edtLoteCon_Jsonclick ;
   private String edtLoteCtfNm_Jsonclick ;
   private String edtLoteCtfNF_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV29TFLoteFec ;
   private java.util.Date AV31DDO_LoteFecAuxDate ;
   private java.util.Date A11665LoteFec ;
   private java.util.Date AV56Consultaloteproductods_2_tflotefec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV16OrderedDsc ;
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
   private String AV21ColumnsSelectorXML ;
   private String AV27ManageFiltersXml ;
   private String AV22UserCustomValue ;
   private String AV18FilterFullText ;
   private String lV55Consultaloteproductods_1_filterfulltext ;
   private String AV55Consultaloteproductods_1_filterfulltext ;
   private String AV19ExcelFilename ;
   private String AV20ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV10HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01VN2_A396EmprCod ;
   private String[] H01VN2_A719PrdNum ;
   private String[] H01VN2_A12352LoteCtfNF ;
   private String[] H01VN2_A11711LoteCtfNm ;
   private String[] H01VN2_A11668LoteCon ;
   private String[] H01VN2_A11667LoteCtf ;
   private int[] H01VN2_A11666LotePed ;
   private String[] H01VN2_A11664LoteID ;
   private java.util.Date[] H01VN2_A11665LoteFec ;
   private long[] H01VN3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV26ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV13GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV14GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV24ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV45DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultaloteproducto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01VN2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV56Consultaloteproductods_2_tflotefec ,
                                          String AV58Consultaloteproductods_4_tfloteid_sel ,
                                          String AV57Consultaloteproductods_3_tfloteid ,
                                          int AV59Consultaloteproductods_5_tfloteped ,
                                          int AV60Consultaloteproductods_6_tfloteped_to ,
                                          String AV62Consultaloteproductods_8_tflotectf_sel ,
                                          String AV61Consultaloteproductods_7_tflotectf ,
                                          String AV64Consultaloteproductods_10_tflotecon_sel ,
                                          String AV63Consultaloteproductods_9_tflotecon ,
                                          String AV66Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV65Consultaloteproductods_11_tflotectfnm ,
                                          String AV68Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV67Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV5Emprcod ,
                                          String AV6Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[26];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, PrdNum, LoteCtfNF, LoteCtfNm, LoteCon, LoteCtf, LotePed, LoteID, LoteFec" ;
      sFromString = " FROM TXPLOTPRD" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV55Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV57Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV59Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (0==AV60Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV61Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV63Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV65Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV67Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY LoteFec" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY LoteFec DESC" ;
      }
      else if ( AV15OrderedBy == 2 )
      {
         sOrderString += " ORDER BY PrdNum" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY LoteID" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY LoteID DESC" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY LotePed" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY LotePed DESC" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY LoteCtf" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY LoteCtf DESC" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY LoteCon" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY LoteCon DESC" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY LoteCtfNm" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY LoteCtfNm DESC" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         sOrderString += " ORDER BY LoteCtfNF" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         sOrderString += " ORDER BY LoteCtfNF DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, PrdNum, LoteID, LoteFec" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01VN3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV55Consultaloteproductods_1_filterfulltext ,
                                          java.util.Date AV56Consultaloteproductods_2_tflotefec ,
                                          String AV58Consultaloteproductods_4_tfloteid_sel ,
                                          String AV57Consultaloteproductods_3_tfloteid ,
                                          int AV59Consultaloteproductods_5_tfloteped ,
                                          int AV60Consultaloteproductods_6_tfloteped_to ,
                                          String AV62Consultaloteproductods_8_tflotectf_sel ,
                                          String AV61Consultaloteproductods_7_tflotectf ,
                                          String AV64Consultaloteproductods_10_tflotecon_sel ,
                                          String AV63Consultaloteproductods_9_tflotecon ,
                                          String AV66Consultaloteproductods_12_tflotectfnm_sel ,
                                          String AV65Consultaloteproductods_11_tflotectfnm ,
                                          String AV68Consultaloteproductods_14_tflotectfnf_sel ,
                                          String AV67Consultaloteproductods_13_tflotectfnf ,
                                          String A11664LoteID ,
                                          int A11666LotePed ,
                                          String A11667LoteCtf ,
                                          String A11668LoteCon ,
                                          String A11711LoteCtfNm ,
                                          String A12352LoteCtfNF ,
                                          java.util.Date A11665LoteFec ,
                                          short AV15OrderedBy ,
                                          boolean AV16OrderedDsc ,
                                          String AV5Emprcod ,
                                          String AV6Prdnum ,
                                          String A396EmprCod ,
                                          String A719PrdNum )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[21];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLOTPRD" ;
      addWhere(sWhereString, "(EmprCod = ? and PrdNum = ?)");
      if ( ! (GXutil.strcmp("", AV55Consultaloteproductods_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(LoteID) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(LotePed,'99999990'), 2) like '%' || ?) or ( UPPER(LoteCtf) like '%' || UPPER(?)) or ( UPPER(LoteCon) like '%' || UPPER(?)) or ( UPPER(LoteCtfNm) like '%' || UPPER(?)) or ( UPPER(LoteCtfNF) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
         GXv_int21[3] = (byte)(1) ;
         GXv_int21[4] = (byte)(1) ;
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56Consultaloteproductods_2_tflotefec)) )
      {
         addWhere(sWhereString, "(LoteFec >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV58Consultaloteproductods_4_tfloteid_sel)==0) && ( ! (GXutil.strcmp("", AV57Consultaloteproductods_3_tfloteid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV58Consultaloteproductods_4_tfloteid_sel)==0) )
      {
         addWhere(sWhereString, "(LoteID = ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (0==AV59Consultaloteproductods_5_tfloteped) )
      {
         addWhere(sWhereString, "(LotePed >= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (0==AV60Consultaloteproductods_6_tfloteped_to) )
      {
         addWhere(sWhereString, "(LotePed <= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62Consultaloteproductods_8_tflotectf_sel)==0) && ( ! (GXutil.strcmp("", AV61Consultaloteproductods_7_tflotectf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtf) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62Consultaloteproductods_8_tflotectf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtf = ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV64Consultaloteproductods_10_tflotecon_sel)==0) && ( ! (GXutil.strcmp("", AV63Consultaloteproductods_9_tflotecon)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCon) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64Consultaloteproductods_10_tflotecon_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCon = ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Consultaloteproductods_12_tflotectfnm_sel)==0) && ( ! (GXutil.strcmp("", AV65Consultaloteproductods_11_tflotectfnm)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNm) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Consultaloteproductods_12_tflotectfnm_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNm = ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV68Consultaloteproductods_14_tflotectfnf_sel)==0) && ( ! (GXutil.strcmp("", AV67Consultaloteproductods_13_tflotectfnf)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(LoteCtfNF) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Consultaloteproductods_14_tflotectfnf_sel)==0) )
      {
         addWhere(sWhereString, "(LoteCtfNF = ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV15OrderedBy == 1 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 1 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( AV15OrderedBy == 2 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 3 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 4 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 5 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 6 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 7 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ! AV16OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV15OrderedBy == 8 ) && ( AV16OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H01VN2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
            case 1 :
                  return conditional_H01VN3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (java.util.Date)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01VN2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01VN3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 50);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 26);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
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
                  stmt.setString(sIdx, (String)parms[26], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[34]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 50);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[29]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 1);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 50);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 50);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 50);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 50);
               }
               return;
      }
   }

}

