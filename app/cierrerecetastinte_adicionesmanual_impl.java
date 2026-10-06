package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_adicionesmanual_impl extends GXDataArea
{
   public cierrerecetastinte_adicionesmanual_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cierrerecetastinte_adicionesmanual_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_adicionesmanual_impl.class ));
   }

   public cierrerecetastinte_adicionesmanual_impl( int remoteHandle ,
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
            AV72Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72Emprcod", AV72Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV73Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV73Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Barcod), 8, 0));
               AV74Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV74Barcodreo", GXutil.str( AV74Barcodreo, 1, 0));
               AV75Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75Barcodpar", AV75Barcodpar);
               AV69RecLinMAL = (short)(GXutil.lval( httpContext.GetPar( "RecLinMAL"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV69RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69RecLinMAL), 4, 0));
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV72Emprcod = httpContext.GetPar( "Emprcod") ;
      AV73Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV74Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV75Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV69RecLinMAL = (short)(GXutil.lval( httpContext.GetPar( "RecLinMAL"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV34TFRecLinMAL = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMAL"))) ;
      AV35TFRecLinMAL_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLinMAL_To"))) ;
      AV36TFRecNumAny = (byte)(GXutil.lval( httpContext.GetPar( "TFRecNumAny"))) ;
      AV37TFRecNumAny_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecNumAny_To"))) ;
      AV38TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV39TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV67TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV68TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV40TFPrdCFin = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCFin"), ".") ;
      AV41TFPrdCFin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCFin_To"), ".") ;
      AV50TFLanyUsr = httpContext.GetPar( "TFLanyUsr") ;
      AV51TFLanyUsr_Sel = httpContext.GetPar( "TFLanyUsr_Sel") ;
      AV52TFLanyFec = localUtil.parseDTimeParm( httpContext.GetPar( "TFLanyFec")) ;
      AV56TFLanyLote = httpContext.GetPar( "TFLanyLote") ;
      AV57TFLanyLote_Sel = httpContext.GetPar( "TFLanyLote_Sel") ;
      AV102Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV72Emprcod, AV73Barcod, AV74Barcodreo, AV75Barcodpar, AV69RecLinMAL, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV34TFRecLinMAL, AV35TFRecLinMAL_To, AV36TFRecNumAny, AV37TFRecNumAny_To, AV38TFPrdNum, AV39TFPrdNum_Sel, AV67TFPrdNom, AV68TFPrdNom_Sel, AV40TFPrdCFin, AV41TFPrdCFin_To, AV50TFLanyUsr, AV51TFLanyUsr_Sel, AV52TFLanyFec, AV56TFLanyLote, AV57TFLanyLote_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa1B32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1B32( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.cierrerecetastinte_adicionesmanual", new String[] {GXutil.URLEncode(GXutil.rtrim(AV72Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV73Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV75Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV69RecLinMAL,4,0))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMAL"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_55", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_55, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV64GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV65GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV62DDO_TitleSettingsIcons);
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINMAL", GXutil.ltrim( localUtil.ntoc( AV34TFRecLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINMAL_TO", GXutil.ltrim( localUtil.ntoc( AV35TFRecLinMAL_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECNUMANY", GXutil.ltrim( localUtil.ntoc( AV36TFRecNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECNUMANY_TO", GXutil.ltrim( localUtil.ntoc( AV37TFRecNumAny_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV38TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV39TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV67TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV68TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCFIN", GXutil.ltrim( localUtil.ntoc( AV40TFPrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCFIN_TO", GXutil.ltrim( localUtil.ntoc( AV41TFPrdCFin_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLANYUSR", GXutil.rtrim( AV50TFLanyUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLANYUSR_SEL", GXutil.rtrim( AV51TFLanyUsr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLANYFEC", localUtil.ttoc( AV52TFLanyFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLANYLOTE", GXutil.rtrim( AV56TFLanyLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFLANYLOTE_SEL", GXutil.rtrim( AV57TFLanyLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV102Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102Pgmname, ""))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV76Emprcod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV77Barcod_Selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO_SELECTED", GXutil.ltrim( localUtil.ntoc( AV78Barcodreo_Selected, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR_SELECTED", GXutil.rtrim( AV79Barcodpar_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAL_SELECTED", GXutil.ltrim( localUtil.ntoc( AV80RecLinMal_Selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECNUMANY_SELECTED", GXutil.ltrim( localUtil.ntoc( AV81RecNumAny_Selected, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM_SELECTED", GXutil.rtrim( AV82Prdnum_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV70UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV71Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAL", GXutil.ltrim( localUtil.ntoc( AV69RecLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV75Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV74Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV73Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV72Emprcod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Width", GXutil.rtrim( Dvpanel_acciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Autowidth", GXutil.booltostr( Dvpanel_acciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Autoheight", GXutil.booltostr( Dvpanel_acciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Cls", GXutil.rtrim( Dvpanel_acciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Title", GXutil.rtrim( Dvpanel_acciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Collapsible", GXutil.booltostr( Dvpanel_acciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Collapsed", GXutil.booltostr( Dvpanel_acciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_acciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Iconposition", GXutil.rtrim( Dvpanel_acciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_ACCIONES_Autoscroll", GXutil.booltostr( Dvpanel_acciones_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we1B32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1B32( ) ;
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
      return formatLink("app.cierrerecetastinte_adicionesmanual", new String[] {GXutil.URLEncode(GXutil.rtrim(AV72Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV73Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV75Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV69RecLinMAL,4,0))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMAL"})  ;
   }

   public String getPgmname( )
   {
      return "CierreRecetasTinte_AdicionesManual" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos añadidos o Pesados", "") ;
   }

   public void wb1B30( )
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnagregar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtnagregar_Jsonclick, 5, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOAGREGAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTREPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_27_1B32( true) ;
      }
      else
      {
         wb_table1_27_1B32( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1B32e( boolean wbgen )
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
         /* User Defined Control */
         ucDvpanel_acciones.setProperty("Width", Dvpanel_acciones_Width);
         ucDvpanel_acciones.setProperty("AutoWidth", Dvpanel_acciones_Autowidth);
         ucDvpanel_acciones.setProperty("AutoHeight", Dvpanel_acciones_Autoheight);
         ucDvpanel_acciones.setProperty("Cls", Dvpanel_acciones_Cls);
         ucDvpanel_acciones.setProperty("Title", Dvpanel_acciones_Title);
         ucDvpanel_acciones.setProperty("Collapsible", Dvpanel_acciones_Collapsible);
         ucDvpanel_acciones.setProperty("Collapsed", Dvpanel_acciones_Collapsed);
         ucDvpanel_acciones.setProperty("ShowCollapseIcon", Dvpanel_acciones_Showcollapseicon);
         ucDvpanel_acciones.setProperty("IconPosition", Dvpanel_acciones_Iconposition);
         ucDvpanel_acciones.setProperty("AutoScroll", Dvpanel_acciones_Autoscroll);
         ucDvpanel_acciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_acciones_Internalname, "DVPANEL_ACCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_ACCIONESContainer"+"Acciones"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAcciones_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 55, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucGridpaginationbar.setProperty("CurrentPage", AV64GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV65GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV62DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV62DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_78_1B32( true) ;
      }
      else
      {
         wb_table2_78_1B32( false) ;
      }
      return  ;
   }

   public void wb_table2_78_1B32e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_lanyfecauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_55_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_lanyfecauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_lanyfecauxdate_Internalname, localUtil.format(AV54DDO_LanyFecAuxDate, "99/99/99"), localUtil.format( AV54DDO_LanyFecAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_lanyfecauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_lanyfecauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CierreRecetasTinte_AdicionesManual.htm");
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

   public void start1B32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos añadidos o Pesados", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1B30( ) ;
   }

   public void ws1B32( )
   {
      start1B32( ) ;
      evt1B32( ) ;
   }

   public void evt1B32( )
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
                           e111B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e171B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOAGREGAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAgregar' */
                           e181B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e191B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTREPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportReport' */
                           e201B32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e211B32 ();
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
                           nGXsfl_55_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_552( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV66GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2808RecLinMAL = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMAL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1377RecNumAny = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecNumAny_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A1378PrdCFin = localUtil.ctond( httpContext.cgiGet( edtPrdCFin_Internalname)) ;
                           n1378PrdCFin = false ;
                           A4578LanyUsr = GXutil.upper( httpContext.cgiGet( edtLanyUsr_Internalname)) ;
                           n4578LanyUsr = false ;
                           A4579LanyFec = localUtil.ctot( httpContext.cgiGet( edtLanyFec_Internalname), 0) ;
                           n4579LanyFec = false ;
                           A5807LanyLote = httpContext.cgiGet( edtLanyLote_Internalname) ;
                           n5807LanyLote = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e221B32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e231B32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e241B32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e251B32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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

   public void we1B32( )
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

   public void pa1B32( )
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
                                 String AV15FilterFullText ,
                                 String AV72Emprcod ,
                                 int AV73Barcod ,
                                 byte AV74Barcodreo ,
                                 String AV75Barcodpar ,
                                 short AV69RecLinMAL ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 short AV34TFRecLinMAL ,
                                 short AV35TFRecLinMAL_To ,
                                 byte AV36TFRecNumAny ,
                                 byte AV37TFRecNumAny_To ,
                                 String AV38TFPrdNum ,
                                 String AV39TFPrdNum_Sel ,
                                 String AV67TFPrdNom ,
                                 String AV68TFPrdNom_Sel ,
                                 java.math.BigDecimal AV40TFPrdCFin ,
                                 java.math.BigDecimal AV41TFPrdCFin_To ,
                                 String AV50TFLanyUsr ,
                                 String AV51TFLanyUsr_Sel ,
                                 java.util.Date AV52TFLanyFec ,
                                 String AV56TFLanyLote ,
                                 String AV57TFLanyLote_Sel ,
                                 String AV102Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231B32 ();
      GRID_nCurrentRecord = 0 ;
      rf1B32( ) ;
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
      rf1B32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV102Pgmname = "CierreRecetasTinte_AdicionesManual" ;
      Gx_err = (short)(0) ;
   }

   public void rf1B32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(55) ;
      /* Execute user event: Refresh */
      e231B32 ();
      nGXsfl_55_idx = 1 ;
      sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_552( ) ;
      bGXsfl_55_Refreshing = true ;
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
         subsflControlProps_552( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                              Short.valueOf(AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                              Short.valueOf(AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                              Byte.valueOf(AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                              Byte.valueOf(AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                              AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                              AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                              AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                              AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                              AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                              AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                              AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                              AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                              AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                              AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                              AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                              Short.valueOf(A2808RecLinMAL) ,
                                              Byte.valueOf(A1377RecNumAny) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A1378PrdCFin ,
                                              A4578LanyUsr ,
                                              A5807LanyLote ,
                                              A4579LanyFec ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV72Emprcod ,
                                              Integer.valueOf(AV73Barcod) ,
                                              Byte.valueOf(AV74Barcodreo) ,
                                              AV75Barcodpar ,
                                              Short.valueOf(AV69RecLinMAL) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
         lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
         lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
         lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
         lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
         lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
         lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
         lV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
         lV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
         lV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
         lV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
         /* Using cursor H01B32 */
         pr_default.execute(0, new Object[] {AV72Emprcod, Integer.valueOf(AV73Barcod), Byte.valueOf(AV74Barcodreo), AV75Barcodpar, Short.valueOf(AV69RecLinMAL), lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV100Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_55_idx = 1 ;
         sGXsfl_55_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_55_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_552( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A5807LanyLote = H01B32_A5807LanyLote[0] ;
            n5807LanyLote = H01B32_n5807LanyLote[0] ;
            A4579LanyFec = H01B32_A4579LanyFec[0] ;
            n4579LanyFec = H01B32_n4579LanyFec[0] ;
            A4578LanyUsr = H01B32_A4578LanyUsr[0] ;
            n4578LanyUsr = H01B32_n4578LanyUsr[0] ;
            A1378PrdCFin = H01B32_A1378PrdCFin[0] ;
            n1378PrdCFin = H01B32_n1378PrdCFin[0] ;
            A718PrdNom = H01B32_A718PrdNom[0] ;
            A719PrdNum = H01B32_A719PrdNum[0] ;
            A1377RecNumAny = H01B32_A1377RecNumAny[0] ;
            A2808RecLinMAL = H01B32_A2808RecLinMAL[0] ;
            A130BarCodPar = H01B32_A130BarCodPar[0] ;
            A132BarCodReo = H01B32_A132BarCodReo[0] ;
            A129BarCod = H01B32_A129BarCod[0] ;
            A396EmprCod = H01B32_A396EmprCod[0] ;
            A718PrdNom = H01B32_A718PrdNom[0] ;
            e241B32 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(55) ;
         wb1B30( ) ;
      }
      bGXsfl_55_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1B32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV102Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102Pgmname, ""))));
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
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV15FilterFullText ;
      AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV34TFRecLinMAL ;
      AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV35TFRecLinMAL_To ;
      AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV36TFRecNumAny ;
      AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV37TFRecNumAny_To ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV38TFPrdNum ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV67TFPrdNom ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV68TFPrdNom_Sel ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV40TFPrdCFin ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV41TFPrdCFin_To ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV50TFLanyUsr ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV51TFLanyUsr_Sel ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV52TFLanyFec ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV56TFLanyLote ;
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV57TFLanyLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                           Short.valueOf(AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) ,
                                           Short.valueOf(AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) ,
                                           Byte.valueOf(AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) ,
                                           Byte.valueOf(AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) ,
                                           AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                           AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                           AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                           AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                           AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                           AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                           AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                           AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                           AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                           AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                           AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                           Short.valueOf(A2808RecLinMAL) ,
                                           Byte.valueOf(A1377RecNumAny) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A1378PrdCFin ,
                                           A4578LanyUsr ,
                                           A5807LanyLote ,
                                           A4579LanyFec ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV72Emprcod ,
                                           Integer.valueOf(AV73Barcod) ,
                                           Byte.valueOf(AV74Barcodreo) ,
                                           AV75Barcodpar ,
                                           Short.valueOf(AV69RecLinMAL) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext), "%", "") ;
      lV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = GXutil.padr( GXutil.rtrim( AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum), 6, "%") ;
      lV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = GXutil.padr( GXutil.rtrim( AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom), 26, "%") ;
      lV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = GXutil.padr( GXutil.rtrim( AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr), 8, "%") ;
      lV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = GXutil.padr( GXutil.rtrim( AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote), 26, "%") ;
      /* Using cursor H01B33 */
      pr_default.execute(1, new Object[] {AV72Emprcod, Integer.valueOf(AV73Barcod), Byte.valueOf(AV74Barcodreo), AV75Barcodpar, Short.valueOf(AV69RecLinMAL), lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext, Short.valueOf(AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal), Short.valueOf(AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to), Byte.valueOf(AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany), Byte.valueOf(AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to), lV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum, AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel, lV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom, AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel, AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin, AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to, lV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr, AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel, AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec, lV100Cierrerecetastinte_adicionesmanualds_15_tflanylote, AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel});
      GRID_nRecordCount = H01B33_AGRID_nRecordCount[0] ;
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
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV15FilterFullText ;
      AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV34TFRecLinMAL ;
      AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV35TFRecLinMAL_To ;
      AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV36TFRecNumAny ;
      AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV37TFRecNumAny_To ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV38TFPrdNum ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV67TFPrdNom ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV68TFPrdNom_Sel ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV40TFPrdCFin ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV41TFPrdCFin_To ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV50TFLanyUsr ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV51TFLanyUsr_Sel ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV52TFLanyFec ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV56TFLanyLote ;
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV57TFLanyLote_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV72Emprcod, AV73Barcod, AV74Barcodreo, AV75Barcodpar, AV69RecLinMAL, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV34TFRecLinMAL, AV35TFRecLinMAL_To, AV36TFRecNumAny, AV37TFRecNumAny_To, AV38TFPrdNum, AV39TFPrdNum_Sel, AV67TFPrdNom, AV68TFPrdNom_Sel, AV40TFPrdCFin, AV41TFPrdCFin_To, AV50TFLanyUsr, AV51TFLanyUsr_Sel, AV52TFLanyFec, AV56TFLanyLote, AV57TFLanyLote_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV15FilterFullText ;
      AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV34TFRecLinMAL ;
      AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV35TFRecLinMAL_To ;
      AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV36TFRecNumAny ;
      AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV37TFRecNumAny_To ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV38TFPrdNum ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV67TFPrdNom ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV68TFPrdNom_Sel ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV40TFPrdCFin ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV41TFPrdCFin_To ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV50TFLanyUsr ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV51TFLanyUsr_Sel ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV52TFLanyFec ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV56TFLanyLote ;
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV57TFLanyLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV72Emprcod, AV73Barcod, AV74Barcodreo, AV75Barcodpar, AV69RecLinMAL, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV34TFRecLinMAL, AV35TFRecLinMAL_To, AV36TFRecNumAny, AV37TFRecNumAny_To, AV38TFPrdNum, AV39TFPrdNum_Sel, AV67TFPrdNom, AV68TFPrdNom_Sel, AV40TFPrdCFin, AV41TFPrdCFin_To, AV50TFLanyUsr, AV51TFLanyUsr_Sel, AV52TFLanyFec, AV56TFLanyLote, AV57TFLanyLote_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV15FilterFullText ;
      AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV34TFRecLinMAL ;
      AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV35TFRecLinMAL_To ;
      AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV36TFRecNumAny ;
      AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV37TFRecNumAny_To ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV38TFPrdNum ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV67TFPrdNom ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV68TFPrdNom_Sel ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV40TFPrdCFin ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV41TFPrdCFin_To ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV50TFLanyUsr ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV51TFLanyUsr_Sel ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV52TFLanyFec ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV56TFLanyLote ;
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV57TFLanyLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV72Emprcod, AV73Barcod, AV74Barcodreo, AV75Barcodpar, AV69RecLinMAL, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV34TFRecLinMAL, AV35TFRecLinMAL_To, AV36TFRecNumAny, AV37TFRecNumAny_To, AV38TFPrdNum, AV39TFPrdNum_Sel, AV67TFPrdNom, AV68TFPrdNom_Sel, AV40TFPrdCFin, AV41TFPrdCFin_To, AV50TFLanyUsr, AV51TFLanyUsr_Sel, AV52TFLanyFec, AV56TFLanyLote, AV57TFLanyLote_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV15FilterFullText ;
      AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV34TFRecLinMAL ;
      AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV35TFRecLinMAL_To ;
      AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV36TFRecNumAny ;
      AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV37TFRecNumAny_To ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV38TFPrdNum ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV67TFPrdNom ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV68TFPrdNom_Sel ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV40TFPrdCFin ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV41TFPrdCFin_To ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV50TFLanyUsr ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV51TFLanyUsr_Sel ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV52TFLanyFec ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV56TFLanyLote ;
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV57TFLanyLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV72Emprcod, AV73Barcod, AV74Barcodreo, AV75Barcodpar, AV69RecLinMAL, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV34TFRecLinMAL, AV35TFRecLinMAL_To, AV36TFRecNumAny, AV37TFRecNumAny_To, AV38TFPrdNum, AV39TFPrdNum_Sel, AV67TFPrdNom, AV68TFPrdNom_Sel, AV40TFPrdCFin, AV41TFPrdCFin_To, AV50TFLanyUsr, AV51TFLanyUsr_Sel, AV52TFLanyFec, AV56TFLanyLote, AV57TFLanyLote_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV15FilterFullText ;
      AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV34TFRecLinMAL ;
      AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV35TFRecLinMAL_To ;
      AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV36TFRecNumAny ;
      AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV37TFRecNumAny_To ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV38TFPrdNum ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV67TFPrdNom ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV68TFPrdNom_Sel ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV40TFPrdCFin ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV41TFPrdCFin_To ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV50TFLanyUsr ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV51TFLanyUsr_Sel ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV52TFLanyFec ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV56TFLanyLote ;
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV57TFLanyLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV72Emprcod, AV73Barcod, AV74Barcodreo, AV75Barcodpar, AV69RecLinMAL, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV34TFRecLinMAL, AV35TFRecLinMAL_To, AV36TFRecNumAny, AV37TFRecNumAny_To, AV38TFPrdNum, AV39TFPrdNum_Sel, AV67TFPrdNom, AV68TFPrdNom_Sel, AV40TFPrdCFin, AV41TFPrdCFin_To, AV50TFLanyUsr, AV51TFLanyUsr_Sel, AV52TFLanyFec, AV56TFLanyLote, AV57TFLanyLote_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV102Pgmname = "CierreRecetasTinte_AdicionesManual" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1B30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e221B32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV62DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_55 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_55"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV64GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV65GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvpanel_acciones_Width = httpContext.cgiGet( "DVPANEL_ACCIONES_Width") ;
         Dvpanel_acciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_ACCIONES_Autowidth")) ;
         Dvpanel_acciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_ACCIONES_Autoheight")) ;
         Dvpanel_acciones_Cls = httpContext.cgiGet( "DVPANEL_ACCIONES_Cls") ;
         Dvpanel_acciones_Title = httpContext.cgiGet( "DVPANEL_ACCIONES_Title") ;
         Dvpanel_acciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_ACCIONES_Collapsible")) ;
         Dvpanel_acciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_ACCIONES_Collapsed")) ;
         Dvpanel_acciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_ACCIONES_Showcollapseicon")) ;
         Dvpanel_acciones_Iconposition = httpContext.cgiGet( "DVPANEL_ACCIONES_Iconposition") ;
         Dvpanel_acciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_ACCIONES_Autoscroll")) ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_lanyfecauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_LANYFECAUXDATE");
            GX_FocusControl = edtavDdo_lanyfecauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_LanyFecAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_LanyFecAuxDate", localUtil.format(AV54DDO_LanyFecAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_LanyFecAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_lanyfecauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_LanyFecAuxDate", localUtil.format(AV54DDO_LanyFecAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e221B32 ();
      if (returnInSub) return;
   }

   public void e221B32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV71Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Station", AV71Station);
      GXv_char2[0] = AV72Emprcod ;
      GXv_char3[0] = AV85Emprnom ;
      GXv_char4[0] = AV70UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
      cierrerecetastinte_adicionesmanual_impl.this.AV72Emprcod = GXv_char2[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV85Emprnom = GXv_char3[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV70UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Emprcod", AV72Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV70UsurCod", AV70UsurCod);
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
      Form.setCaption( httpContext.getMessage( "Productos añadidos o Pesados", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV62DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV62DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e231B32( )
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
      if ( GXutil.strcmp(AV22Session.getValue("CierreRecetasTinte_AdicionesManualColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("CierreRecetasTinte_AdicionesManualColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtRecLinMAL_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinMAL_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinMAL_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtRecNumAny_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecNumAny_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecNumAny_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtPrdCFin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCFin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCFin_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtLanyUsr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyUsr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyUsr_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtLanyFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyFec_Visible), 5, 0), !bGXsfl_55_Refreshing);
      edtLanyLote_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtLanyLote_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLanyLote_Visible), 5, 0), !bGXsfl_55_Refreshing);
      AV64GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64GridCurrentPage), 10, 0));
      AV65GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65GridPageCount), 10, 0));
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = AV15FilterFullText ;
      AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal = AV34TFRecLinMAL ;
      AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to = AV35TFRecLinMAL_To ;
      AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany = AV36TFRecNumAny ;
      AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to = AV37TFRecNumAny_To ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = AV38TFPrdNum ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = AV39TFPrdNum_Sel ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = AV67TFPrdNom ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = AV68TFPrdNom_Sel ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = AV40TFPrdCFin ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = AV41TFPrdCFin_To ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = AV50TFLanyUsr ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = AV51TFLanyUsr_Sel ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = AV52TFLanyFec ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = AV56TFLanyLote ;
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = AV57TFLanyLote_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121B32( )
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
         AV63PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV63PageToGo) ;
      }
   }

   public void e131B32( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141B32( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinMAL") == 0 )
         {
            AV34TFRecLinMAL = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFRecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFRecLinMAL), 4, 0));
            AV35TFRecLinMAL_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFRecLinMAL_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFRecLinMAL_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecNumAny") == 0 )
         {
            AV36TFRecNumAny = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFRecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRecNumAny), 2, 0));
            AV37TFRecNumAny_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFRecNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRecNumAny_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV38TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdNum", AV38TFPrdNum);
            AV39TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdNum_Sel", AV39TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV67TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdNom", AV67TFPrdNom);
            AV68TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdNom_Sel", AV68TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCFin") == 0 )
         {
            AV40TFPrdCFin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdCFin", GXutil.ltrimstr( AV40TFPrdCFin, 11, 3));
            AV41TFPrdCFin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdCFin_To", GXutil.ltrimstr( AV41TFPrdCFin_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LanyUsr") == 0 )
         {
            AV50TFLanyUsr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFLanyUsr", AV50TFLanyUsr);
            AV51TFLanyUsr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFLanyUsr_Sel", AV51TFLanyUsr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LanyFec") == 0 )
         {
            AV52TFLanyFec = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFLanyFec", localUtil.ttoc( AV52TFLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "LanyLote") == 0 )
         {
            AV56TFLanyLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFLanyLote", AV56TFLanyLote);
            AV57TFLanyLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFLanyLote_Sel", AV57TFLanyLote_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e241B32( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV66GridActions, 4, 0)) );
   }

   public void e151B32( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "CierreRecetasTinte_AdicionesManualColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111B32( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CierreRecetasTinte_AdicionesManualFilters")),GXutil.URLEncode(GXutil.rtrim(AV102Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CierreRecetasTinte_AdicionesManualFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CierreRecetasTinte_AdicionesManualFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         cierrerecetastinte_adicionesmanual_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e251B32( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV66GridActions == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV66GridActions == 2 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S202 ();
         if (returnInSub) return;
      }
      AV66GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV66GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e161B32( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e171B32( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV72Emprcod,Integer.valueOf(AV73Barcod),Byte.valueOf(AV74Barcodreo),AV75Barcodpar,Short.valueOf(AV69RecLinMAL)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV72Emprcod","AV73Barcod","AV74Barcodreo","AV75Barcodpar","AV69RecLinMAL"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e181B32( )
   {
      /* 'DoAgregar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.cierrerecetastinte_adicionesmanual_ins_upd", new String[] {GXutil.URLEncode(GXutil.rtrim(AV72Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV73Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV74Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV75Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV69RecLinMAL,4,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(DecimalUtil.decToString(DecimalUtil.ZERO)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "INS", "")))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMal","RecNumAnyIn","PrdnumIn","PrdCFinIn","LanyLoteIn","Mode"}) , new Object[] {"AV72Emprcod","AV73Barcod","AV74Barcodreo","AV75Barcodpar","AV69RecLinMAL","","","","",""});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e191B32( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.cierrerecetastinte_adicionesmanualexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      cierrerecetastinte_adicionesmanual_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e201B32( )
   {
      /* 'DoExportReport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      Innewwindow1_Target = formatLink("app.cierrerecetastinte_adicionesmanualexportreport", new String[] {}, new String[] {})  ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Target", Innewwindow1_Target);
      Innewwindow1_Height = "600" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Height", Innewwindow1_Height);
      Innewwindow1_Width = "800" ;
      ucInnewwindow1.sendProperty(context, "", false, Innewwindow1_Internalname, "Width", Innewwindow1_Width);
      this.executeUsercontrolMethod("", false, "INNEWWINDOW1Container", "OpenWindow", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e211B32( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.cierrerecetastinte_adicionesmanualexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecLinMAL", "", "#", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "RecNumAny", "", "##", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNum", "", "Producto", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdNom", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "PrdCFin", "", "Cantidad", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LanyUsr", "", "Usuario", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LanyFec", "", "Fecha Hora", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "LanyLote", "", "Lote", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CierreRecetasTinte_AdicionesManualColumnsSelector", GXv_char4) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CierreRecetasTinte_AdicionesManualFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
      AV34TFRecLinMAL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFRecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFRecLinMAL), 4, 0));
      AV35TFRecLinMAL_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35TFRecLinMAL_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFRecLinMAL_To), 4, 0));
      AV36TFRecNumAny = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36TFRecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRecNumAny), 2, 0));
      AV37TFRecNumAny_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TFRecNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRecNumAny_To), 2, 0));
      AV38TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdNum", AV38TFPrdNum);
      AV39TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdNum_Sel", AV39TFPrdNum_Sel);
      AV67TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdNom", AV67TFPrdNom);
      AV68TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdNom_Sel", AV68TFPrdNom_Sel);
      AV40TFPrdCFin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdCFin", GXutil.ltrimstr( AV40TFPrdCFin, 11, 3));
      AV41TFPrdCFin_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdCFin_To", GXutil.ltrimstr( AV41TFPrdCFin_To, 11, 3));
      AV50TFLanyUsr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFLanyUsr", AV50TFLanyUsr);
      AV51TFLanyUsr_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFLanyUsr_Sel", AV51TFLanyUsr_Sel);
      AV52TFLanyFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFLanyFec", localUtil.ttoc( AV52TFLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV56TFLanyLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFLanyLote", AV56TFLanyLote);
      AV57TFLanyLote_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFLanyLote_Sel", AV57TFLanyLote_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV76Emprcod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Emprcod_Selected", AV76Emprcod_Selected);
      AV77Barcod_Selected = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Barcod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Barcod_Selected), 8, 0));
      AV78Barcodreo_Selected = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Barcodreo_Selected", GXutil.str( AV78Barcodreo_Selected, 1, 0));
      AV79Barcodpar_Selected = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79Barcodpar_Selected", AV79Barcodpar_Selected);
      AV80RecLinMal_Selected = A2808RecLinMAL ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80RecLinMal_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80RecLinMal_Selected), 4, 0));
      AV81RecNumAny_Selected = A1377RecNumAny ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81RecNumAny_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81RecNumAny_Selected), 2, 0));
      AV82Prdnum_Selected = A719PrdNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Prdnum_Selected", AV82Prdnum_Selected);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV76Emprcod_Selected ;
      GXv_int12[0] = AV77Barcod_Selected ;
      GXv_int13[0] = AV78Barcodreo_Selected ;
      GXv_char3[0] = AV79Barcodpar_Selected ;
      GXv_int14[0] = AV80RecLinMal_Selected ;
      GXv_int15[0] = AV81RecNumAny_Selected ;
      GXv_char2[0] = AV82Prdnum_Selected ;
      GXv_char16[0] = AV70UsurCod ;
      GXv_char17[0] = AV71Station ;
      new app.pdltlanyad(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int13, GXv_char3, GXv_int14, GXv_int15, GXv_char2, GXv_char16, GXv_char17) ;
      cierrerecetastinte_adicionesmanual_impl.this.AV76Emprcod_Selected = GXv_char4[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV77Barcod_Selected = GXv_int12[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV78Barcodreo_Selected = GXv_int13[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV79Barcodpar_Selected = GXv_char3[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV80RecLinMal_Selected = GXv_int14[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV81RecNumAny_Selected = GXv_int15[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV82Prdnum_Selected = GXv_char2[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV70UsurCod = GXv_char16[0] ;
      cierrerecetastinte_adicionesmanual_impl.this.AV71Station = GXv_char17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Emprcod_Selected", AV76Emprcod_Selected);
      httpContext.ajax_rsp_assign_attri("", false, "AV77Barcod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Barcod_Selected), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV78Barcodreo_Selected", GXutil.str( AV78Barcodreo_Selected, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV79Barcodpar_Selected", AV79Barcodpar_Selected);
      httpContext.ajax_rsp_assign_attri("", false, "AV80RecLinMal_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80RecLinMal_Selected), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV81RecNumAny_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81RecNumAny_Selected), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV82Prdnum_Selected", AV82Prdnum_Selected);
      httpContext.ajax_rsp_assign_attri("", false, "AV70UsurCod", AV70UsurCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV71Station", AV71Station);
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.cierrerecetastinte_adicionesmanual_ins_upd", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2808RecLinMAL,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A1377RecNumAny,2,0)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(DecimalUtil.decToString(A1378PrdCFin)),GXutil.URLEncode(GXutil.rtrim(A5807LanyLote)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", "")))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMal","RecNumAnyIn","PrdnumIn","PrdCFinIn","LanyLoteIn","Mode"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A2808RecLinMAL","A1377RecNumAny","A719PrdNum","A1378PrdCFin","A5807LanyLote",""});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV102Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV102Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV102Pgmname+"GridState"), null, null);
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
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINMAL") == 0 )
         {
            AV34TFRecLinMAL = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFRecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFRecLinMAL), 4, 0));
            AV35TFRecLinMAL_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFRecLinMAL_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFRecLinMAL_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECNUMANY") == 0 )
         {
            AV36TFRecNumAny = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFRecNumAny", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRecNumAny), 2, 0));
            AV37TFRecNumAny_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFRecNumAny_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRecNumAny_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV38TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdNum", AV38TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV39TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdNum_Sel", AV39TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV67TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdNom", AV67TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV68TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdNom_Sel", AV68TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCFIN") == 0 )
         {
            AV40TFPrdCFin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdCFin", GXutil.ltrimstr( AV40TFPrdCFin, 11, 3));
            AV41TFPrdCFin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdCFin_To", GXutil.ltrimstr( AV41TFPrdCFin_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR") == 0 )
         {
            AV50TFLanyUsr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFLanyUsr", AV50TFLanyUsr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYUSR_SEL") == 0 )
         {
            AV51TFLanyUsr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFLanyUsr_Sel", AV51TFLanyUsr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYFEC") == 0 )
         {
            AV52TFLanyFec = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFLanyFec", localUtil.ttoc( AV52TFLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV54DDO_LanyFecAuxDate = GXutil.resetTime(AV52TFLanyFec) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_LanyFecAuxDate", localUtil.format(AV54DDO_LanyFecAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE") == 0 )
         {
            AV56TFLanyLote = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFLanyLote", AV56TFLanyLote);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFLANYLOTE_SEL") == 0 )
         {
            AV57TFLanyLote_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFLanyLote_Sel", AV57TFLanyLote_Sel);
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFPrdNum_Sel)==0), AV39TFPrdNum_Sel, GXv_char17) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char1 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char16[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFPrdNom_Sel)==0), AV68TFPrdNom_Sel, GXv_char16) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char18 = GXv_char16[0] ;
      GXt_char19 = "" ;
      GXv_char4[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFLanyUsr_Sel)==0), AV51TFLanyUsr_Sel, GXv_char4) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char19 = GXv_char4[0] ;
      GXt_char20 = "" ;
      GXv_char3[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFLanyLote_Sel)==0), AV57TFLanyLote_Sel, GXv_char3) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char20 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char18+"||"+GXt_char19+"||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char17[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFPrdNum)==0), AV38TFPrdNum, GXv_char17) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char20 = GXv_char17[0] ;
      GXt_char19 = "" ;
      GXv_char16[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFPrdNom)==0), AV67TFPrdNom, GXv_char16) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char19 = GXv_char16[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFLanyUsr)==0), AV50TFLanyUsr, GXv_char4) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFLanyLote)==0), AV56TFLanyLote, GXv_char3) ;
      cierrerecetastinte_adicionesmanual_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV34TFRecLinMAL) ? "" : GXutil.str( AV34TFRecLinMAL, 4, 0))+"|"+((0==AV36TFRecNumAny) ? "" : GXutil.str( AV36TFRecNumAny, 2, 0))+"|"+GXt_char20+"|"+GXt_char19+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdCFin)==0) ? "" : GXutil.str( AV40TFPrdCFin, 11, 3))+"|"+GXt_char18+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV52TFLanyFec) ? "" : localUtil.dtoc( AV54DDO_LanyFecAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV35TFRecLinMAL_To) ? "" : GXutil.str( AV35TFRecLinMAL_To, 4, 0))+"|"+((0==AV37TFRecNumAny_To) ? "" : GXutil.str( AV37TFRecNumAny_To, 2, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdCFin_To)==0) ? "" : GXutil.str( AV41TFPrdCFin_To, 11, 3))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV102Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFRECLINMAL", "", !((0==AV34TFRecLinMAL)&&(0==AV35TFRecLinMAL_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFRecLinMAL, 4, 0)), GXutil.trim( GXutil.str( AV35TFRecLinMAL_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFRECNUMANY", "", !((0==AV36TFRecNumAny)&&(0==AV37TFRecNumAny_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFRecNumAny, 2, 0)), GXutil.trim( GXutil.str( AV37TFRecNumAny_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDNUM", "", !(GXutil.strcmp("", AV38TFPrdNum)==0), (short)(0), AV38TFPrdNum, "", !(GXutil.strcmp("", AV39TFPrdNum_Sel)==0), AV39TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDNOM", "", !(GXutil.strcmp("", AV67TFPrdNom)==0), (short)(0), AV67TFPrdNom, "", !(GXutil.strcmp("", AV68TFPrdNom_Sel)==0), AV68TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFPRDCFIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdCFin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdCFin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFPrdCFin, 11, 3)), GXutil.trim( GXutil.str( AV41TFPrdCFin_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLANYUSR", "", !(GXutil.strcmp("", AV50TFLanyUsr)==0), (short)(0), AV50TFLanyUsr, "", !(GXutil.strcmp("", AV51TFLanyUsr_Sel)==0), AV51TFLanyUsr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLANYFEC", "", !GXutil.dateCompare(GXutil.nullDate(), AV52TFLanyFec), (short)(0), GXutil.trim( localUtil.ttoc( AV52TFLanyFec, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      GXv_SdtWWPGridState21[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState21, "TFLANYLOTE", "", !(GXutil.strcmp("", AV56TFLanyLote)==0), (short)(0), AV56TFLanyLote, "", !(GXutil.strcmp("", AV57TFLanyLote_Sel)==0), AV57TFLanyLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState21[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV102Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TLANYAD" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_78_1B32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_78_1B32e( true) ;
      }
      else
      {
         wb_table2_78_1B32e( false) ;
      }
   }

   public void wb_table1_27_1B32( boolean wbgen )
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
         wb_table3_32_1B32( true) ;
      }
      else
      {
         wb_table3_32_1B32( false) ;
      }
      return  ;
   }

   public void wb_table3_32_1B32e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1B32e( true) ;
      }
      else
      {
         wb_table1_27_1B32e( false) ;
      }
   }

   public void wb_table3_32_1B32( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CierreRecetasTinte_AdicionesManual.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_32_1B32e( true) ;
      }
      else
      {
         wb_table3_32_1B32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV72Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Emprcod", AV72Emprcod);
      AV73Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73Barcod), 8, 0));
      AV74Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Barcodreo", GXutil.str( AV74Barcodreo, 1, 0));
      AV75Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Barcodpar", AV75Barcodpar);
      AV69RecLinMAL = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69RecLinMAL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV69RecLinMAL), 4, 0));
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
      pa1B32( ) ;
      ws1B32( ) ;
      we1B32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116132566", true, true);
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
      httpContext.AddJavascriptSource("cierrerecetastinte_adicionesmanual.js", "?202682116132567", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_552( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_idx ;
      edtRecLinMAL_Internalname = "RECLINMAL_"+sGXsfl_55_idx ;
      edtRecNumAny_Internalname = "RECNUMANY_"+sGXsfl_55_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_55_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_55_idx ;
      edtPrdCFin_Internalname = "PRDCFIN_"+sGXsfl_55_idx ;
      edtLanyUsr_Internalname = "LANYUSR_"+sGXsfl_55_idx ;
      edtLanyFec_Internalname = "LANYFEC_"+sGXsfl_55_idx ;
      edtLanyLote_Internalname = "LANYLOTE_"+sGXsfl_55_idx ;
   }

   public void subsflControlProps_fel_552( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_55_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_55_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_55_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_55_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_55_fel_idx ;
      edtRecLinMAL_Internalname = "RECLINMAL_"+sGXsfl_55_fel_idx ;
      edtRecNumAny_Internalname = "RECNUMANY_"+sGXsfl_55_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_55_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_55_fel_idx ;
      edtPrdCFin_Internalname = "PRDCFIN_"+sGXsfl_55_fel_idx ;
      edtLanyUsr_Internalname = "LANYUSR_"+sGXsfl_55_fel_idx ;
      edtLanyFec_Internalname = "LANYFEC_"+sGXsfl_55_fel_idx ;
      edtLanyLote_Internalname = "LANYLOTE_"+sGXsfl_55_fel_idx ;
   }

   public void sendrow_552( )
   {
      subsflControlProps_552( ) ;
      wb1B30( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_55_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_55_idx+"',55)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV66GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV66GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV66GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_55_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV66GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_55_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecLinMAL_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMAL_Internalname,GXutil.ltrim( localUtil.ntoc( A2808RecLinMAL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2808RecLinMAL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMAL_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecLinMAL_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecNumAny_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecNumAny_Internalname,GXutil.ltrim( localUtil.ntoc( A1377RecNumAny, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1377RecNumAny), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecNumAny_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtRecNumAny_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdCFin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCFin_Internalname,GXutil.ltrim( localUtil.ntoc( A1378PrdCFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A1378PrdCFin, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdCFin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLanyUsr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLanyUsr_Internalname,GXutil.rtrim( A4578LanyUsr),GXutil.rtrim( localUtil.format( A4578LanyUsr, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLanyUsr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLanyUsr_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtLanyFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLanyFec_Internalname,localUtil.ttoc( A4579LanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4579LanyFec, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLanyFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLanyFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtLanyLote_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLanyLote_Internalname,GXutil.rtrim( A5807LanyLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLanyLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtLanyLote_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(55),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1B32( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecLinMAL_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecNumAny_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdCFin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLanyUsr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLanyFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtLanyLote_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV66GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2808RecLinMAL, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecLinMAL_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1377RecNumAny, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecNumAny_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1378PrdCFin, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdCFin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4578LanyUsr));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLanyUsr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4579LanyFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLanyFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5807LanyLote));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtLanyLote_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnagregar_Internalname = "BTNAGREGAR" ;
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
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divAcciones_Internalname = "ACCIONES" ;
      Dvpanel_acciones_Internalname = "DVPANEL_ACCIONES" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMAL_Internalname = "RECLINMAL" ;
      edtRecNumAny_Internalname = "RECNUMANY" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdCFin_Internalname = "PRDCFIN" ;
      edtLanyUsr_Internalname = "LANYUSR" ;
      edtLanyFec_Internalname = "LANYFEC" ;
      edtLanyLote_Internalname = "LANYLOTE" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_lanyfecauxdate_Internalname = "vDDO_LANYFECAUXDATE" ;
      divDdo_lanyfecauxdates_Internalname = "DDO_LANYFECAUXDATES" ;
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
      edtLanyLote_Jsonclick = "" ;
      edtLanyFec_Jsonclick = "" ;
      edtLanyUsr_Jsonclick = "" ;
      edtPrdCFin_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtRecNumAny_Jsonclick = "" ;
      edtRecLinMAL_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtLanyLote_Visible = -1 ;
      edtLanyFec_Visible = -1 ;
      edtLanyUsr_Visible = -1 ;
      edtPrdCFin_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      edtRecNumAny_Visible = -1 ;
      edtRecLinMAL_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_lanyfecauxdate_Jsonclick = "" ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "CierreRecetasTinte_AdicionesManualGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T||T||T" ;
      Ddo_grid_Filterisrange = "T|T|||T|||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Character|Numeric|Character|Date|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "3|2|4|1|5|6|7|8" ;
      Ddo_grid_Columnids = "5:RecLinMAL|6:RecNumAny|7:PrdNum|8:PrdNom|9:PrdCFin|10:LanyUsr|11:LanyFec|12:LanyLote" ;
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
      Dvpanel_acciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Iconposition = "Right" ;
      Dvpanel_acciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_acciones_Title = httpContext.getMessage( "Acciones", "") ;
      Dvpanel_acciones_Cls = "PanelNoHeader" ;
      Dvpanel_acciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_acciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_acciones_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Productos añadidos o Pesados", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_55_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV66GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV66GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLinMAL_Visible',ctrl:'RECLINMAL',prop:'Visible'},{av:'edtRecNumAny_Visible',ctrl:'RECNUMANY',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdCFin_Visible',ctrl:'PRDCFIN',prop:'Visible'},{av:'edtLanyUsr_Visible',ctrl:'LANYUSR',prop:'Visible'},{av:'edtLanyFec_Visible',ctrl:'LANYFEC',prop:'Visible'},{av:'edtLanyLote_Visible',ctrl:'LANYLOTE',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121B32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131B32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141B32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e241B32',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV66GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151B32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtRecLinMAL_Visible',ctrl:'RECLINMAL',prop:'Visible'},{av:'edtRecNumAny_Visible',ctrl:'RECNUMANY',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdCFin_Visible',ctrl:'PRDCFIN',prop:'Visible'},{av:'edtLanyUsr_Visible',ctrl:'LANYUSR',prop:'Visible'},{av:'edtLanyFec_Visible',ctrl:'LANYFEC',prop:'Visible'},{av:'edtLanyLote_Visible',ctrl:'LANYLOTE',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111B32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLinMAL_Visible',ctrl:'RECLINMAL',prop:'Visible'},{av:'edtRecNumAny_Visible',ctrl:'RECNUMANY',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdCFin_Visible',ctrl:'PRDCFIN',prop:'Visible'},{av:'edtLanyUsr_Visible',ctrl:'LANYUSR',prop:'Visible'},{av:'edtLanyFec_Visible',ctrl:'LANYFEC',prop:'Visible'},{av:'edtLanyLote_Visible',ctrl:'LANYLOTE',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e251B32',iparms:[{av:'cmbavGridactions'},{av:'AV66GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A1378PrdCFin',fld:'PRDCFIN',pic:'ZZZZZZ9.999'},{av:'A5807LanyLote',fld:'LANYLOTE',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV66GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV76Emprcod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV77Barcod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV78Barcodreo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV79Barcodpar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV80RecLinMal_Selected',fld:'vRECLINMAL_SELECTED',pic:'ZZZ9'},{av:'AV81RecNumAny_Selected',fld:'vRECNUMANY_SELECTED',pic:'Z9'},{av:'AV82Prdnum_Selected',fld:'vPRDNUM_SELECTED',pic:''},{av:'A5807LanyLote',fld:'LANYLOTE',pic:''},{av:'A1378PrdCFin',fld:'PRDCFIN',pic:'ZZZZZZ9.999'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A2808RecLinMAL',fld:'RECLINMAL',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLinMAL_Visible',ctrl:'RECLINMAL',prop:'Visible'},{av:'edtRecNumAny_Visible',ctrl:'RECNUMANY',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdCFin_Visible',ctrl:'PRDCFIN',prop:'Visible'},{av:'edtLanyUsr_Visible',ctrl:'LANYUSR',prop:'Visible'},{av:'edtLanyFec_Visible',ctrl:'LANYFEC',prop:'Visible'},{av:'edtLanyLote_Visible',ctrl:'LANYLOTE',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e161B32',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV76Emprcod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV77Barcod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV78Barcodreo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV79Barcodpar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV80RecLinMal_Selected',fld:'vRECLINMAL_SELECTED',pic:'ZZZ9'},{av:'AV81RecNumAny_Selected',fld:'vRECNUMANY_SELECTED',pic:'Z9'},{av:'AV82Prdnum_Selected',fld:'vPRDNUM_SELECTED',pic:''},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV71Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV71Station',fld:'vSTATION',pic:''},{av:'AV70UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV82Prdnum_Selected',fld:'vPRDNUM_SELECTED',pic:''},{av:'AV81RecNumAny_Selected',fld:'vRECNUMANY_SELECTED',pic:'Z9'},{av:'AV80RecLinMal_Selected',fld:'vRECLINMAL_SELECTED',pic:'ZZZ9'},{av:'AV79Barcodpar_Selected',fld:'vBARCODPAR_SELECTED',pic:''},{av:'AV78Barcodreo_Selected',fld:'vBARCODREO_SELECTED',pic:'9'},{av:'AV77Barcod_Selected',fld:'vBARCOD_SELECTED',pic:'ZZZZZZZ9'},{av:'AV76Emprcod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLinMAL_Visible',ctrl:'RECLINMAL',prop:'Visible'},{av:'edtRecNumAny_Visible',ctrl:'RECNUMANY',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdCFin_Visible',ctrl:'PRDCFIN',prop:'Visible'},{av:'edtLanyUsr_Visible',ctrl:'LANYUSR',prop:'Visible'},{av:'edtLanyFec_Visible',ctrl:'LANYFEC',prop:'Visible'},{av:'edtLanyLote_Visible',ctrl:'LANYLOTE',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e171B32',iparms:[{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOAGREGAR'","{handler:'e181B32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A1378PrdCFin',fld:'PRDCFIN',pic:'ZZZZZZ9.999'},{av:'A5807LanyLote',fld:'LANYLOTE',pic:''}]");
      setEventMetadata("'DOAGREGAR'",",oparms:[{av:'A5807LanyLote',fld:'LANYLOTE',pic:''},{av:'A1378PrdCFin',fld:'PRDCFIN',pic:'ZZZZZZ9.999'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A1377RecNumAny',fld:'RECNUMANY',pic:'Z9'},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtRecLinMAL_Visible',ctrl:'RECLINMAL',prop:'Visible'},{av:'edtRecNumAny_Visible',ctrl:'RECNUMANY',prop:'Visible'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrdCFin_Visible',ctrl:'PRDCFIN',prop:'Visible'},{av:'edtLanyUsr_Visible',ctrl:'LANYUSR',prop:'Visible'},{av:'edtLanyFec_Visible',ctrl:'LANYFEC',prop:'Visible'},{av:'edtLanyLote_Visible',ctrl:'LANYLOTE',prop:'Visible'},{av:'AV64GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV65GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e191B32',iparms:[{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e201B32',iparms:[{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e211B32',iparms:[{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV72Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV73Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV74Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV75Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV69RecLinMAL',fld:'vRECLINMAL',pic:'ZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV34TFRecLinMAL',fld:'vTFRECLINMAL',pic:'ZZZ9'},{av:'AV35TFRecLinMAL_To',fld:'vTFRECLINMAL_TO',pic:'ZZZ9'},{av:'AV36TFRecNumAny',fld:'vTFRECNUMANY',pic:'Z9'},{av:'AV37TFRecNumAny_To',fld:'vTFRECNUMANY_TO',pic:'Z9'},{av:'AV38TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV39TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV67TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV68TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdCFin',fld:'vTFPRDCFIN',pic:'ZZZZZZ9.999'},{av:'AV41TFPrdCFin_To',fld:'vTFPRDCFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV50TFLanyUsr',fld:'vTFLANYUSR',pic:'@!'},{av:'AV51TFLanyUsr_Sel',fld:'vTFLANYUSR_SEL',pic:'@!'},{av:'AV52TFLanyFec',fld:'vTFLANYFEC',pic:'99/99/99 99:99:99'},{av:'AV56TFLanyLote',fld:'vTFLANYLOTE',pic:''},{av:'AV57TFLanyLote_Sel',fld:'vTFLANYLOTE_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV54DDO_LanyFecAuxDate',fld:'vDDO_LANYFECAUXDATE',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lanylote',iparms:[]");
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
      wcpOAV72Emprcod = "" ;
      wcpOAV75Barcodpar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV72Emprcod = "" ;
      AV75Barcodpar = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV38TFPrdNum = "" ;
      AV39TFPrdNum_Sel = "" ;
      AV67TFPrdNom = "" ;
      AV68TFPrdNom_Sel = "" ;
      AV40TFPrdCFin = DecimalUtil.ZERO ;
      AV41TFPrdCFin_To = DecimalUtil.ZERO ;
      AV50TFLanyUsr = "" ;
      AV51TFLanyUsr_Sel = "" ;
      AV52TFLanyFec = GXutil.resetTime( GXutil.nullDate() );
      AV56TFLanyLote = "" ;
      AV57TFLanyLote_Sel = "" ;
      AV102Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV62DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV76Emprcod_Selected = "" ;
      AV79Barcodpar_Selected = "" ;
      AV82Prdnum_Selected = "" ;
      AV70UsurCod = "" ;
      AV71Station = "" ;
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
      bttBtnagregar_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      ucDvpanel_acciones = new com.genexus.webpanels.GXUserControl();
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV54DDO_LanyFecAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A1378PrdCFin = DecimalUtil.ZERO ;
      A4578LanyUsr = "" ;
      A4579LanyFec = GXutil.resetTime( GXutil.nullDate() );
      A5807LanyLote = "" ;
      scmdbuf = "" ;
      lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      lV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      lV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      lV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      lV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext = "" ;
      AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel = "" ;
      AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum = "" ;
      AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel = "" ;
      AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom = "" ;
      AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin = DecimalUtil.ZERO ;
      AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to = DecimalUtil.ZERO ;
      AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel = "" ;
      AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr = "" ;
      AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec = GXutil.resetTime( GXutil.nullDate() );
      AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel = "" ;
      AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote = "" ;
      H01B32_A5807LanyLote = new String[] {""} ;
      H01B32_n5807LanyLote = new boolean[] {false} ;
      H01B32_A4579LanyFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01B32_n4579LanyFec = new boolean[] {false} ;
      H01B32_A4578LanyUsr = new String[] {""} ;
      H01B32_n4578LanyUsr = new boolean[] {false} ;
      H01B32_A1378PrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01B32_n1378PrdCFin = new boolean[] {false} ;
      H01B32_A718PrdNom = new String[] {""} ;
      H01B32_A719PrdNum = new String[] {""} ;
      H01B32_A1377RecNumAny = new byte[1] ;
      H01B32_A2808RecLinMAL = new short[1] ;
      H01B32_A130BarCodPar = new String[] {""} ;
      H01B32_A132BarCodReo = new byte[1] ;
      H01B32_A129BarCod = new int[1] ;
      H01B32_A396EmprCod = new String[] {""} ;
      H01B33_AGRID_nRecordCount = new long[1] ;
      AV85Emprnom = "" ;
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
      GXv_int12 = new int[1] ;
      GXv_int13 = new byte[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState21 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.cierrerecetastinte_adicionesmanual__default(),
         new Object[] {
             new Object[] {
            H01B32_A5807LanyLote, H01B32_n5807LanyLote, H01B32_A4579LanyFec, H01B32_n4579LanyFec, H01B32_A4578LanyUsr, H01B32_n4578LanyUsr, H01B32_A1378PrdCFin, H01B32_n1378PrdCFin, H01B32_A718PrdNom, H01B32_A719PrdNum,
            H01B32_A1377RecNumAny, H01B32_A2808RecLinMAL, H01B32_A130BarCodPar, H01B32_A132BarCodReo, H01B32_A129BarCod, H01B32_A396EmprCod
            }
            , new Object[] {
            H01B33_AGRID_nRecordCount
            }
         }
      );
      AV102Pgmname = "CierreRecetasTinte_AdicionesManual" ;
      /* GeneXus formulas. */
      AV102Pgmname = "CierreRecetasTinte_AdicionesManual" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV74Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV74Barcodreo ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte AV36TFRecNumAny ;
   private byte AV37TFRecNumAny_To ;
   private byte gxajaxcallmode ;
   private byte AV78Barcodreo_Selected ;
   private byte AV81RecNumAny_Selected ;
   private byte A132BarCodReo ;
   private byte A1377RecNumAny ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ;
   private byte AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ;
   private byte GXv_int13[] ;
   private byte GXv_int15[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV69RecLinMAL ;
   private short AV69RecLinMAL ;
   private short AV34TFRecLinMAL ;
   private short AV35TFRecLinMAL_To ;
   private short AV12OrderedBy ;
   private short AV80RecLinMal_Selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV66GridActions ;
   private short A2808RecLinMAL ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ;
   private short AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ;
   private short GXv_int14[] ;
   private int wcpOAV73Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_55 ;
   private int AV73Barcod ;
   private int nGXsfl_55_idx=1 ;
   private int AV77Barcod_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtRecLinMAL_Visible ;
   private int edtRecNumAny_Visible ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrdCFin_Visible ;
   private int edtLanyUsr_Visible ;
   private int edtLanyFec_Visible ;
   private int edtLanyLote_Visible ;
   private int AV63PageToGo ;
   private int GXv_int12[] ;
   private int AV103GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV64GridCurrentPage ;
   private long AV65GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV40TFPrdCFin ;
   private java.math.BigDecimal AV41TFPrdCFin_To ;
   private java.math.BigDecimal A1378PrdCFin ;
   private java.math.BigDecimal AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ;
   private java.math.BigDecimal AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ;
   private String wcpOAV72Emprcod ;
   private String wcpOAV75Barcodpar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV72Emprcod ;
   private String AV75Barcodpar ;
   private String sGXsfl_55_idx="0001" ;
   private String AV38TFPrdNum ;
   private String AV39TFPrdNum_Sel ;
   private String AV67TFPrdNom ;
   private String AV68TFPrdNom_Sel ;
   private String AV50TFLanyUsr ;
   private String AV51TFLanyUsr_Sel ;
   private String AV56TFLanyLote ;
   private String AV57TFLanyLote_Sel ;
   private String AV102Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV76Emprcod_Selected ;
   private String AV79Barcodpar_Selected ;
   private String AV82Prdnum_Selected ;
   private String AV70UsurCod ;
   private String AV71Station ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_acciones_Width ;
   private String Dvpanel_acciones_Cls ;
   private String Dvpanel_acciones_Title ;
   private String Dvpanel_acciones_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
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
   private String bttBtnagregar_Internalname ;
   private String bttBtnagregar_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String Dvpanel_acciones_Internalname ;
   private String divAcciones_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_lanyfecauxdates_Internalname ;
   private String edtavDdo_lanyfecauxdate_Internalname ;
   private String edtavDdo_lanyfecauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMAL_Internalname ;
   private String edtRecNumAny_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPrdCFin_Internalname ;
   private String A4578LanyUsr ;
   private String edtLanyUsr_Internalname ;
   private String edtLanyFec_Internalname ;
   private String A5807LanyLote ;
   private String edtLanyLote_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String lV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String lV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String lV100Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ;
   private String AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum ;
   private String AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ;
   private String AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom ;
   private String AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ;
   private String AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr ;
   private String AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ;
   private String AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote ;
   private String AV85Emprnom ;
   private String GXv_char2[] ;
   private String GXt_char20 ;
   private String GXv_char17[] ;
   private String GXt_char19 ;
   private String GXv_char16[] ;
   private String GXt_char18 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_55_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMAL_Jsonclick ;
   private String edtRecNumAny_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdCFin_Jsonclick ;
   private String edtLanyUsr_Jsonclick ;
   private String edtLanyFec_Jsonclick ;
   private String edtLanyLote_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV52TFLanyFec ;
   private java.util.Date A4579LanyFec ;
   private java.util.Date AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec ;
   private java.util.Date AV54DDO_LanyFecAuxDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_acciones_Autowidth ;
   private boolean Dvpanel_acciones_Autoheight ;
   private boolean Dvpanel_acciones_Collapsible ;
   private boolean Dvpanel_acciones_Collapsed ;
   private boolean Dvpanel_acciones_Showcollapseicon ;
   private boolean Dvpanel_acciones_Autoscroll ;
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
   private boolean n1378PrdCFin ;
   private boolean n4578LanyUsr ;
   private boolean n4579LanyFec ;
   private boolean n5807LanyLote ;
   private boolean bGXsfl_55_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
   private String AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext ;
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
   private com.genexus.webpanels.GXUserControl ucDvpanel_acciones ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H01B32_A5807LanyLote ;
   private boolean[] H01B32_n5807LanyLote ;
   private java.util.Date[] H01B32_A4579LanyFec ;
   private boolean[] H01B32_n4579LanyFec ;
   private String[] H01B32_A4578LanyUsr ;
   private boolean[] H01B32_n4578LanyUsr ;
   private java.math.BigDecimal[] H01B32_A1378PrdCFin ;
   private boolean[] H01B32_n1378PrdCFin ;
   private String[] H01B32_A718PrdNom ;
   private String[] H01B32_A719PrdNum ;
   private byte[] H01B32_A1377RecNumAny ;
   private short[] H01B32_A2808RecLinMAL ;
   private String[] H01B32_A130BarCodPar ;
   private byte[] H01B32_A132BarCodReo ;
   private int[] H01B32_A129BarCod ;
   private String[] H01B32_A396EmprCod ;
   private long[] H01B33_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState21[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV62DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class cierrerecetastinte_adicionesmanual__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01B32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV72Emprcod ,
                                          int AV73Barcod ,
                                          byte AV74Barcodreo ,
                                          String AV75Barcodpar ,
                                          short AV69RecLinMAL ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[32];
      Object[] GXv_Object23 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.LanyLote, T1.LanyFec, T1.LanyUsr, T1.PrdCFin, T2.PrdNom, T1.PrdNum, T1.RecNumAny, T1.RecLinMAL, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
         GXv_int22[6] = (byte)(1) ;
         GXv_int22[7] = (byte)(1) ;
         GXv_int22[8] = (byte)(1) ;
         GXv_int22[9] = (byte)(1) ;
         GXv_int22[10] = (byte)(1) ;
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! (0==AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! (0==AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int22[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int22[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int22[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int22[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int22[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int22[26] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecNumAny" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecNumAny DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinMAL" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinMAL DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCFin" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCFin DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.LanyUsr" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.LanyUsr DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.LanyFec" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.LanyFec DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.LanyLote" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.LanyLote DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMAL, T1.RecNumAny, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H01B33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext ,
                                          short AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal ,
                                          short AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to ,
                                          byte AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany ,
                                          byte AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to ,
                                          String AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel ,
                                          String AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum ,
                                          String AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel ,
                                          String AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom ,
                                          java.math.BigDecimal AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin ,
                                          java.math.BigDecimal AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to ,
                                          String AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel ,
                                          String AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr ,
                                          java.util.Date AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec ,
                                          String AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel ,
                                          String AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote ,
                                          short A2808RecLinMAL ,
                                          byte A1377RecNumAny ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A1378PrdCFin ,
                                          String A4578LanyUsr ,
                                          String A5807LanyLote ,
                                          java.util.Date A4579LanyFec ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV72Emprcod ,
                                          int AV73Barcod ,
                                          byte AV74Barcodreo ,
                                          String AV75Barcodpar ,
                                          short AV69RecLinMAL ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[27];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLANYAD T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMAL = ?)");
      if ( ! (GXutil.strcmp("", AV86Cierrerecetastinte_adicionesmanualds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.RecLinMAL,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecNumAny,'90'), 2) like '%' || ?) or ( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.PrdCFin,'9999990.999'), 2) like '%' || ?) or ( UPPER(T1.LanyUsr) like '%' || UPPER(?)) or ( UPPER(T1.LanyLote) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
         GXv_int24[6] = (byte)(1) ;
         GXv_int24[7] = (byte)(1) ;
         GXv_int24[8] = (byte)(1) ;
         GXv_int24[9] = (byte)(1) ;
         GXv_int24[10] = (byte)(1) ;
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (0==AV87Cierrerecetastinte_adicionesmanualds_2_tfreclinmal) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL >= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (0==AV88Cierrerecetastinte_adicionesmanualds_3_tfreclinmal_to) )
      {
         addWhere(sWhereString, "(T1.RecLinMAL <= ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( ! (0==AV89Cierrerecetastinte_adicionesmanualds_4_tfrecnumany) )
      {
         addWhere(sWhereString, "(T1.RecNumAny >= ?)");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (0==AV90Cierrerecetastinte_adicionesmanualds_5_tfrecnumany_to) )
      {
         addWhere(sWhereString, "(T1.RecNumAny <= ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV91Cierrerecetastinte_adicionesmanualds_6_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Cierrerecetastinte_adicionesmanualds_7_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV93Cierrerecetastinte_adicionesmanualds_8_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Cierrerecetastinte_adicionesmanualds_9_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int24[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Cierrerecetastinte_adicionesmanualds_10_tfprdcfin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin >= ?)");
      }
      else
      {
         GXv_int24[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Cierrerecetastinte_adicionesmanualds_11_tfprdcfin_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCFin <= ?)");
      }
      else
      {
         GXv_int24[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) && ( ! (GXutil.strcmp("", AV97Cierrerecetastinte_adicionesmanualds_12_tflanyusr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyUsr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Cierrerecetastinte_adicionesmanualds_13_tflanyusr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyUsr = ?)");
      }
      else
      {
         GXv_int24[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV99Cierrerecetastinte_adicionesmanualds_14_tflanyfec) )
      {
         addWhere(sWhereString, "(T1.LanyFec >= ?)");
      }
      else
      {
         GXv_int24[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) && ( ! (GXutil.strcmp("", AV100Cierrerecetastinte_adicionesmanualds_15_tflanylote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.LanyLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV101Cierrerecetastinte_adicionesmanualds_16_tflanylote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.LanyLote = ?)");
      }
      else
      {
         GXv_int24[26] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H01B32(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H01B33(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).shortValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , ((Boolean) dynConstraints[25]).booleanValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).byteValue() , (String)dynConstraints[34] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01B32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01B33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 8);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,3);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 26);
               ((String[]) buf[9])[0] = rslt.getString(6, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(10);
               ((int[]) buf[14])[0] = rslt.getInt(11);
               ((String[]) buf[15])[0] = rslt.getString(12, 3);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[56], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[51], false);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 26);
               }
               return;
      }
   }

}

