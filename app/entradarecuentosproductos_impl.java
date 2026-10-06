package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradarecuentosproductos_impl extends GXDataArea
{
   public entradarecuentosproductos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradarecuentosproductos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradarecuentosproductos_impl.class ));
   }

   public entradarecuentosproductos_impl( int remoteHandle ,
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
      nRC_GXsfl_56 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_56"))) ;
      nGXsfl_56_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_56_idx"))) ;
      sGXsfl_56_idx = httpContext.GetPar( "sGXsfl_56_idx") ;
      edtRecExiTcc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavRecexircc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavDifercc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_56_Refreshing);
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
      AV7RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV35FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV10EmprCod = httpContext.GetPar( "EmprCod") ;
      AV49ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV44ColumnsSelector);
      AV50TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV51TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV52TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV53TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV54TFRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo"), ".") ;
      AV55TFRecExiTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo_To"), ".") ;
      AV56TFRecExiTcc = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTcc"), ".") ;
      AV57TFRecExiTcc_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTcc_To"), ".") ;
      AV78Pgmname = httpContext.GetPar( "Pgmname") ;
      AV32OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV33OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtRecExiTcc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavRecexircc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavDifercc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      AV9Station = httpContext.GetPar( "Station") ;
      AV24FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
      AV23FlagCcs = (short)(GXutil.lval( httpContext.GetPar( "FlagCcs"))) ;
      AV13FlagCColor = GXutil.lval( httpContext.GetPar( "FlagCColor")) ;
      AV21Nalmcc = (short)(GXutil.lval( httpContext.GetPar( "Nalmcc"))) ;
      AV17Val_stk = (short)(GXutil.lval( httpContext.GetPar( "Val_stk"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV7RecFec, AV35FilterFullText, AV10EmprCod, AV49ManageFiltersExecutionStep, AV44ColumnsSelector, AV50TFPrdNum, AV51TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV54TFRecExiTeo, AV55TFRecExiTeo_To, AV56TFRecExiTcc, AV57TFRecExiTcc_To, AV78Pgmname, AV32OrderedBy, AV33OrderedDsc, AV9Station, AV24FlagPreMed, AV23FlagCcs, AV13FlagCColor, AV21Nalmcc, AV17Val_stk) ;
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
      pa13C2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start13C2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entradarecuentosproductos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Val_stk), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vRECFEC", localUtil.format(AV7RecFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV35FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_56", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_56, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV47ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV47ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV44ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV44ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV49ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV50TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV51TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV52TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV53TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV54TFRecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITEO_TO", GXutil.ltrim( localUtil.ntoc( AV55TFRecExiTeo_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITCC", GXutil.ltrim( localUtil.ntoc( AV56TFRecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITCC_TO", GXutil.ltrim( localUtil.ntoc( AV57TFRecExiTcc_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV78Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV32OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV33OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "RECMEMCANT", GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIREA", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIRCC", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOT", GXutil.rtrim( A12285RecLot));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV30GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV30GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFECHR", localUtil.ttoc( AV15Recfechr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV12UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV9Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV24FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECUBIC", GXutil.rtrim( AV60RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV23FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECREC", localUtil.dtoc( AV64FecRec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV13FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALMCC", GXutil.ltrim( localUtil.ntoc( AV21Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV17Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Val_stk), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDREC", GXutil.rtrim( A727PrdRec));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITCC_Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECEXIRCC_Visible", GXutil.ltrim( localUtil.ntoc( edtavRecexircc_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIFERCC_Visible", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         we13C2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt13C2( ) ;
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
      return formatLink("app.entradarecuentosproductos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "EntradaRecuentosProductos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " RECUENTOS", "") ;
   }

   public void wb13C0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfec_Internalname, httpContext.getMessage( "Fecha Recuento", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_56_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavRecfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfec_Internalname, localUtil.format(AV7RecFec, "99/99/99"), localUtil.format( AV7RecFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRecfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRecfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_EntradaRecuentosProductos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcstkhor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcstkhor_Internalname, httpContext.getMessage( "Hora", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_56_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcstkhor_Internalname, GXutil.rtrim( AV16CCStkHor), GXutil.rtrim( localUtil.format( AV16CCStkHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcstkhor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcstkhor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_31_13C2( true) ;
      }
      else
      {
         wb_table1_31_13C2( false) ;
      }
      return  ;
   }

   public void wb_table1_31_13C2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmemorizarcantreal_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "Memorizar Cant Real?", ""), bttBtnmemorizarcantreal_Jsonclick, 5, httpContext.getMessage( "Memorizar Cant Real?", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOMEMORIZARCANTREAL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 56, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1113c1_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol56( ) ;
      }
      if ( wbEnd == 56 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_56 = (int)(nGXsfl_56_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV44ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_71_13C2( true) ;
      }
      else
      {
         wb_table2_71_13C2( false) ;
      }
      return  ;
   }

   public void wb_table2_71_13C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 56 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start13C2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " RECUENTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup13C0( ) ;
   }

   public void ws13C2( )
   {
      start13C2( ) ;
      evt13C2( ) ;
   }

   public void evt13C2( )
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
                           e1213C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1313C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1413C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1513C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMEMORIZARCANTREAL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoMemorizarCantReal' */
                           e1613C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e1713C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e1813C2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
                           AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
                           AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
                           AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
                           AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
                           AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
                           AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
                           AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
                           AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_56_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_562( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
                              GX_FocusControl = edtavRecexirea_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV36RecExiRea = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
                           }
                           else
                           {
                              AV36RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
                              GX_FocusControl = edtavDifer_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV37Difer = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV37Difer, 12, 4));
                           }
                           else
                           {
                              AV37Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV37Difer, 12, 4));
                           }
                           A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
                              GX_FocusControl = edtavRecexircc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV14RecExiRcc = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
                           }
                           else
                           {
                              AV14RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
                              GX_FocusControl = edtavDifercc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV38DiferCC = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV38DiferCC, 12, 4));
                           }
                           else
                           {
                              AV38DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV38DiferCC, 12, 4));
                           }
                           AV39RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV39RecLot);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1913C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2013C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2113C2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Recfec Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vRECFEC"), 0), AV7RecFec) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV35FilterFullText) != 0 )
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

   public void we13C2( )
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

   public void pa13C2( )
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
            GX_FocusControl = edtavRecfec_Internalname ;
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
      subsflControlProps_562( ) ;
      while ( nGXsfl_56_idx <= nRC_GXsfl_56 )
      {
         sendrow_562( ) ;
         nGXsfl_56_idx = ((subGrid_Islastpage==1)&&(nGXsfl_56_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_56_idx+1) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV7RecFec ,
                                 String AV35FilterFullText ,
                                 String AV10EmprCod ,
                                 byte AV49ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV44ColumnsSelector ,
                                 String AV50TFPrdNum ,
                                 String AV51TFPrdNum_Sel ,
                                 String AV52TFPrdNom ,
                                 String AV53TFPrdNom_Sel ,
                                 java.math.BigDecimal AV54TFRecExiTeo ,
                                 java.math.BigDecimal AV55TFRecExiTeo_To ,
                                 java.math.BigDecimal AV56TFRecExiTcc ,
                                 java.math.BigDecimal AV57TFRecExiTcc_To ,
                                 String AV78Pgmname ,
                                 short AV32OrderedBy ,
                                 boolean AV33OrderedDsc ,
                                 String AV9Station ,
                                 short AV24FlagPreMed ,
                                 short AV23FlagCcs ,
                                 long AV13FlagCColor ,
                                 short AV21Nalmcc ,
                                 short AV17Val_stk )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2013C2 ();
      GRID_nCurrentRecord = 0 ;
      rf13C2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITEO", getSecureSignedToken( "", localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITCC", getSecureSignedToken( "", localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_56_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf13C2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV78Pgmname = "EntradaRecuentosProductos" ;
      Gx_err = (short)(0) ;
      edtavRecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfec_Enabled), 5, 0), true);
      edtavCcstkhor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcstkhor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkhor_Enabled), 5, 0), true);
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_56_Refreshing);
      edtavDifercc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Enabled), 5, 0), !bGXsfl_56_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
      AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Entradarecuentosproductosds_1_filterfulltext ,
                                           AV71Entradarecuentosproductosds_3_tfprdnum_sel ,
                                           AV70Entradarecuentosproductosds_2_tfprdnum ,
                                           AV73Entradarecuentosproductosds_5_tfprdnom_sel ,
                                           AV72Entradarecuentosproductosds_4_tfprdnom ,
                                           AV74Entradarecuentosproductosds_6_tfrecexiteo ,
                                           AV75Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                           AV76Entradarecuentosproductosds_8_tfrecexitcc ,
                                           AV77Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           Short.valueOf(AV32OrderedBy) ,
                                           Boolean.valueOf(AV33OrderedDsc) ,
                                           A727PrdRec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV10EmprCod ,
                                           AV7RecFec ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                           TypeConstants.DATE
                                           }
      });
      lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
      lV70Entradarecuentosproductosds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Entradarecuentosproductosds_2_tfprdnum), 6, "%") ;
      lV72Entradarecuentosproductosds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Entradarecuentosproductosds_4_tfprdnom), 26, "%") ;
      /* Using cursor H013C2 */
      pr_default.execute(0, new Object[] {AV10EmprCod, AV7RecFec, lV69Entradarecuentosproductosds_1_filterfulltext, lV69Entradarecuentosproductosds_1_filterfulltext, lV69Entradarecuentosproductosds_1_filterfulltext, lV69Entradarecuentosproductosds_1_filterfulltext, lV70Entradarecuentosproductosds_2_tfprdnum, AV71Entradarecuentosproductosds_3_tfprdnum_sel, lV72Entradarecuentosproductosds_4_tfprdnom, AV73Entradarecuentosproductosds_5_tfprdnom_sel, AV74Entradarecuentosproductosds_6_tfrecexiteo, AV75Entradarecuentosproductosds_7_tfrecexiteo_to, AV76Entradarecuentosproductosds_8_tfrecexitcc, AV77Entradarecuentosproductosds_9_tfrecexitcc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = H013C2_A810RecFec[0] ;
         A727PrdRec = H013C2_A727PrdRec[0] ;
         A13416RecEstInv = H013C2_A13416RecEstInv[0] ;
         A807RecExiRea = H013C2_A807RecExiRea[0] ;
         A11624RecMemCant = H013C2_A11624RecMemCant[0] ;
         A806RecExiRcc = H013C2_A806RecExiRcc[0] ;
         A12285RecLot = H013C2_A12285RecLot[0] ;
         A396EmprCod = H013C2_A396EmprCod[0] ;
         A724PrdPreAct = H013C2_A724PrdPreAct[0] ;
         A726PrdPreMed = H013C2_A726PrdPreMed[0] ;
         A808RecExiTcc = H013C2_A808RecExiTcc[0] ;
         A809RecExiTeo = H013C2_A809RecExiTeo[0] ;
         A718PrdNom = H013C2_A718PrdNom[0] ;
         A719PrdNum = H013C2_A719PrdNum[0] ;
         A727PrdRec = H013C2_A727PrdRec[0] ;
         A724PrdPreAct = H013C2_A724PrdPreAct[0] ;
         A726PrdPreMed = H013C2_A726PrdPreMed[0] ;
         A718PrdNom = H013C2_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
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

   public void rf13C2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(56) ;
      /* Execute user event: Refresh */
      e2013C2 ();
      nGXsfl_56_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_562( ) ;
      bGXsfl_56_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_562( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV69Entradarecuentosproductosds_1_filterfulltext ,
                                              AV71Entradarecuentosproductosds_3_tfprdnum_sel ,
                                              AV70Entradarecuentosproductosds_2_tfprdnum ,
                                              AV73Entradarecuentosproductosds_5_tfprdnom_sel ,
                                              AV72Entradarecuentosproductosds_4_tfprdnom ,
                                              AV74Entradarecuentosproductosds_6_tfrecexiteo ,
                                              AV75Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                              AV76Entradarecuentosproductosds_8_tfrecexitcc ,
                                              AV77Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A809RecExiTeo ,
                                              A808RecExiTcc ,
                                              Short.valueOf(AV32OrderedBy) ,
                                              Boolean.valueOf(AV33OrderedDsc) ,
                                              A727PrdRec ,
                                              Byte.valueOf(A13416RecEstInv) ,
                                              AV10EmprCod ,
                                              AV7RecFec ,
                                              A396EmprCod ,
                                              A810RecFec } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING,
                                              TypeConstants.DATE
                                              }
         });
         lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
         lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
         lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
         lV69Entradarecuentosproductosds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentosproductosds_1_filterfulltext), "%", "") ;
         lV70Entradarecuentosproductosds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Entradarecuentosproductosds_2_tfprdnum), 6, "%") ;
         lV72Entradarecuentosproductosds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Entradarecuentosproductosds_4_tfprdnom), 26, "%") ;
         /* Using cursor H013C3 */
         pr_default.execute(1, new Object[] {AV10EmprCod, AV7RecFec, lV69Entradarecuentosproductosds_1_filterfulltext, lV69Entradarecuentosproductosds_1_filterfulltext, lV69Entradarecuentosproductosds_1_filterfulltext, lV69Entradarecuentosproductosds_1_filterfulltext, lV70Entradarecuentosproductosds_2_tfprdnum, AV71Entradarecuentosproductosds_3_tfprdnum_sel, lV72Entradarecuentosproductosds_4_tfprdnom, AV73Entradarecuentosproductosds_5_tfprdnom_sel, AV74Entradarecuentosproductosds_6_tfrecexiteo, AV75Entradarecuentosproductosds_7_tfrecexiteo_to, AV76Entradarecuentosproductosds_8_tfrecexitcc, AV77Entradarecuentosproductosds_9_tfrecexitcc_to});
         nGXsfl_56_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A810RecFec = H013C3_A810RecFec[0] ;
            A727PrdRec = H013C3_A727PrdRec[0] ;
            A13416RecEstInv = H013C3_A13416RecEstInv[0] ;
            A807RecExiRea = H013C3_A807RecExiRea[0] ;
            A11624RecMemCant = H013C3_A11624RecMemCant[0] ;
            A806RecExiRcc = H013C3_A806RecExiRcc[0] ;
            A12285RecLot = H013C3_A12285RecLot[0] ;
            A396EmprCod = H013C3_A396EmprCod[0] ;
            A724PrdPreAct = H013C3_A724PrdPreAct[0] ;
            A726PrdPreMed = H013C3_A726PrdPreMed[0] ;
            A808RecExiTcc = H013C3_A808RecExiTcc[0] ;
            A809RecExiTeo = H013C3_A809RecExiTeo[0] ;
            A718PrdNom = H013C3_A718PrdNom[0] ;
            A719PrdNum = H013C3_A719PrdNum[0] ;
            A727PrdRec = H013C3_A727PrdRec[0] ;
            A724PrdPreAct = H013C3_A724PrdPreAct[0] ;
            A726PrdPreMed = H013C3_A726PrdPreMed[0] ;
            A718PrdNom = H013C3_A718PrdNom[0] ;
            if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
            {
               e2113C2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(56) ;
         wb13C0( ) ;
      }
      bGXsfl_56_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes13C2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV78Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV78Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV9Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV24FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITEO"+"_"+sGXsfl_56_idx, getSecureSignedToken( sGXsfl_56_idx, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITCC"+"_"+sGXsfl_56_idx, getSecureSignedToken( sGXsfl_56_idx, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV23FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV13FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALMCC", GXutil.ltrim( localUtil.ntoc( AV21Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV17Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Val_stk), "ZZZ9")));
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
      AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
      AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7RecFec, AV35FilterFullText, AV10EmprCod, AV49ManageFiltersExecutionStep, AV44ColumnsSelector, AV50TFPrdNum, AV51TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV54TFRecExiTeo, AV55TFRecExiTeo_To, AV56TFRecExiTcc, AV57TFRecExiTcc_To, AV78Pgmname, AV32OrderedBy, AV33OrderedDsc, AV9Station, AV24FlagPreMed, AV23FlagCcs, AV13FlagCColor, AV21Nalmcc, AV17Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
      AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV7RecFec, AV35FilterFullText, AV10EmprCod, AV49ManageFiltersExecutionStep, AV44ColumnsSelector, AV50TFPrdNum, AV51TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV54TFRecExiTeo, AV55TFRecExiTeo_To, AV56TFRecExiTcc, AV57TFRecExiTcc_To, AV78Pgmname, AV32OrderedBy, AV33OrderedDsc, AV9Station, AV24FlagPreMed, AV23FlagCcs, AV13FlagCColor, AV21Nalmcc, AV17Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
      AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7RecFec, AV35FilterFullText, AV10EmprCod, AV49ManageFiltersExecutionStep, AV44ColumnsSelector, AV50TFPrdNum, AV51TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV54TFRecExiTeo, AV55TFRecExiTeo_To, AV56TFRecExiTcc, AV57TFRecExiTcc_To, AV78Pgmname, AV32OrderedBy, AV33OrderedDsc, AV9Station, AV24FlagPreMed, AV23FlagCcs, AV13FlagCColor, AV21Nalmcc, AV17Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
      AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7RecFec, AV35FilterFullText, AV10EmprCod, AV49ManageFiltersExecutionStep, AV44ColumnsSelector, AV50TFPrdNum, AV51TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV54TFRecExiTeo, AV55TFRecExiTeo_To, AV56TFRecExiTcc, AV57TFRecExiTcc_To, AV78Pgmname, AV32OrderedBy, AV33OrderedDsc, AV9Station, AV24FlagPreMed, AV23FlagCcs, AV13FlagCColor, AV21Nalmcc, AV17Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
      AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV7RecFec, AV35FilterFullText, AV10EmprCod, AV49ManageFiltersExecutionStep, AV44ColumnsSelector, AV50TFPrdNum, AV51TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV54TFRecExiTeo, AV55TFRecExiTeo_To, AV56TFRecExiTcc, AV57TFRecExiTcc_To, AV78Pgmname, AV32OrderedBy, AV33OrderedDsc, AV9Station, AV24FlagPreMed, AV23FlagCcs, AV13FlagCColor, AV21Nalmcc, AV17Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV78Pgmname = "EntradaRecuentosProductos" ;
      Gx_err = (short)(0) ;
      edtavRecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfec_Enabled), 5, 0), true);
      edtavCcstkhor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcstkhor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkhor_Enabled), 5, 0), true);
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_56_Refreshing);
      edtavDifercc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Enabled), 5, 0), !bGXsfl_56_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup13C0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1913C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV47ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV44ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_56 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_56"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavRecfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vRECFEC");
            GX_FocusControl = edtavRecfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7RecFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
         }
         else
         {
            AV7RecFec = localUtil.ctod( httpContext.cgiGet( edtavRecfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
         }
         AV16CCStkHor = httpContext.cgiGet( edtavCcstkhor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CCStkHor", AV16CCStkHor);
         AV35FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35FilterFullText", AV35FilterFullText);
         /* Read subfile selected row values. */
         nGXsfl_56_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
         if ( nGXsfl_56_idx > 0 )
         {
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
               GX_FocusControl = edtavRecexirea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV36RecExiRea = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
            }
            else
            {
               AV36RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
               GX_FocusControl = edtavDifer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV37Difer = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV37Difer, 12, 4));
            }
            else
            {
               AV37Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV37Difer, 12, 4));
            }
            A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
               GX_FocusControl = edtavRecexircc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV14RecExiRcc = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
            }
            else
            {
               AV14RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
               GX_FocusControl = edtavDifercc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV38DiferCC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV38DiferCC, 12, 4));
            }
            else
            {
               AV38DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV38DiferCC, 12, 4));
            }
            AV39RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV39RecLot);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vRECFEC"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV7RecFec)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV35FilterFullText) != 0 )
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
      e1913C2 ();
      if (returnInSub) return;
   }

   public void e1913C2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV9Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradarecuentosproductos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Station, ""))));
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradarecuentosproductos_impl.this.AV10EmprCod = GXv_char2[0] ;
      entradarecuentosproductos_impl.this.AV11EmprNom = GXv_char3[0] ;
      entradarecuentosproductos_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
      GXt_int5 = (byte)(AV17Val_stk) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Val_stk), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Val_stk), "ZZZ9")));
      GXt_int7 = AV18Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      entradarecuentosproductos_impl.this.GXt_int7 = GXv_int8[0] ;
      AV18Precio_stk = (short)(GXt_int7) ;
      GXt_int5 = (byte)(AV19Artextil) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV19Artextil = GXt_int5 ;
      GXt_int5 = (byte)(AV20Intexco) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20Intexco = GXt_int5 ;
      GXt_int5 = (byte)(AV21Nalmcc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV21Nalmcc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Nalmcc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Nalmcc), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21Nalmcc), "ZZZ9")));
      GXt_int5 = (byte)(AV22Ubicacion) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "LOCPRD", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV22Ubicacion = GXt_int5 ;
      GXv_int6[0] = (byte)(AV23FlagCcs) ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.AV23FlagCcs = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23FlagCcs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23FlagCcs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23FlagCcs), "ZZZ9")));
      GXt_int5 = (byte)(AV24FlagPreMed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV24FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24FlagPreMed), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24FlagPreMed), "ZZZ9")));
      GXt_int5 = (byte)(AV13FlagCColor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV10EmprCod, httpContext.getMessage( "10002E", ""), GXv_int6) ;
      entradarecuentosproductos_impl.this.GXt_int5 = GXv_int6[0] ;
      AV13FlagCColor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13FlagCColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13FlagCColor), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13FlagCColor), "ZZZZZZZZZ9")));
      edtRecExiTcc_Visible = (((AV13FlagCColor==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavRecexircc_Visible = (((AV13FlagCColor==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavDifercc_Visible = (((AV13FlagCColor==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      /* Execute user subroutine: 'LASTRECUEN' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV9Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradarecuentosproductos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV9Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Station", AV9Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9Station, ""))));
      GXv_char4[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradarecuentosproductos_impl.this.AV10EmprCod = GXv_char4[0] ;
      entradarecuentosproductos_impl.this.AV11EmprNom = GXv_char3[0] ;
      entradarecuentosproductos_impl.this.AV12UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV27HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " RECUENTOS", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV32OrderedBy < 1 )
      {
         AV32OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e2013C2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV26WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV26WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV49ManageFiltersExecutionStep == 1 )
      {
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV49ManageFiltersExecutionStep == 2 )
      {
         AV49ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV46Session.getValue("EntradaRecuentosProductosColumnsSelector"), "") != 0 )
      {
         AV42ColumnsSelectorXML = AV46Session.getValue("EntradaRecuentosProductosColumnsSelector") ;
         AV44ColumnsSelector.fromxml(AV42ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtRecExiTeo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTeo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTeo_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavRecexirea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexirea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexirea_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavDifer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtRecExiTcc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavRecexircc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavDifercc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_56_Refreshing);
      edtavReclot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV44ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclot_Visible), 5, 0), !bGXsfl_56_Refreshing);
      AV69Entradarecuentosproductosds_1_filterfulltext = AV35FilterFullText ;
      AV70Entradarecuentosproductosds_2_tfprdnum = AV50TFPrdNum ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = AV51TFPrdNum_Sel ;
      AV72Entradarecuentosproductosds_4_tfprdnom = AV52TFPrdNom ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = AV54TFRecExiTeo ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = AV55TFRecExiTeo_To ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = AV56TFRecExiTcc ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = AV57TFRecExiTcc_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30GridState", AV30GridState);
   }

   public void e1313C2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV32OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
         AV33OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedDsc", AV33OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV50TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdNum", AV50TFPrdNum);
            AV51TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdNum_Sel", AV51TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV52TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrdNom", AV52TFPrdNom);
            AV53TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTeo") == 0 )
         {
            AV54TFRecExiTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFRecExiTeo", GXutil.ltrimstr( AV54TFRecExiTeo, 12, 4));
            AV55TFRecExiTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFRecExiTeo_To", GXutil.ltrimstr( AV55TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTcc") == 0 )
         {
            AV56TFRecExiTcc = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecExiTcc", GXutil.ltrimstr( AV56TFRecExiTcc, 12, 4));
            AV57TFRecExiTcc_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecExiTcc_To", GXutil.ltrimstr( AV57TFRecExiTcc_To, 12, 4));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2113C2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV36RecExiRea = ((A11624RecMemCant==1) ? A807RecExiRea : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A807RecExiRea)==0) ? A809RecExiTeo : A807RecExiRea)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
         AV37Difer = A809RecExiTeo.subtract(AV36RecExiRea) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV37Difer, 12, 4));
         AV14RecExiRcc = ((A11624RecMemCant==1) ? A806RecExiRcc : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A806RecExiRcc)==0) ? A808RecExiTcc : A806RecExiRcc)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
         AV38DiferCC = A808RecExiTcc.subtract(AV14RecExiRcc) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV38DiferCC, 12, 4));
         AV39RecLot = A12285RecLot ;
         httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV39RecLot);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(56) ;
         }
         sendrow_562( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_56_Refreshing )
      {
         httpContext.doAjaxLoad(56, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e1413C2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV42ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV44ColumnsSelector.fromJSonString(AV42ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "EntradaRecuentosProductosColumnsSelector", ((GXutil.strcmp("", AV42ColumnsSelectorXML)==0) ? "" : AV44ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30GridState", AV30GridState);
   }

   public void e1213C2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("EntradaRecuentosProductosFilters")),GXutil.URLEncode(GXutil.rtrim(AV78Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("EntradaRecuentosProductosFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV49ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49ManageFiltersExecutionStep", GXutil.str( AV49ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV48ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "EntradaRecuentosProductosFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         entradarecuentosproductos_impl.this.GXt_char1 = GXv_char4[0] ;
         AV48ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV48ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV48ManageFiltersXml) ;
            AV30GridState.fromxml(AV48ManageFiltersXml, null, null);
            AV32OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
            AV33OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedDsc", AV33OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30GridState", AV30GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47ManageFiltersData", AV47ManageFiltersData);
   }

   public void e1613C2( )
   {
      /* 'DoMemorizarCantReal' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_56 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_56"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_56_fel_idx = 0 ;
      while ( nGXsfl_56_fel_idx < nRC_GXsfl_56 )
      {
         nGXsfl_56_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_56_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_56_fel_idx+1) ;
         sGXsfl_56_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_562( ) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
            GX_FocusControl = edtavRecexirea_Internalname ;
            wbErr = true ;
            AV36RecExiRea = DecimalUtil.ZERO ;
         }
         else
         {
            AV36RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
            GX_FocusControl = edtavDifer_Internalname ;
            wbErr = true ;
            AV37Difer = DecimalUtil.ZERO ;
         }
         else
         {
            AV37Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
         }
         A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
            GX_FocusControl = edtavRecexircc_Internalname ;
            wbErr = true ;
            AV14RecExiRcc = DecimalUtil.ZERO ;
         }
         else
         {
            AV14RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
            GX_FocusControl = edtavDifercc_Internalname ;
            wbErr = true ;
            AV38DiferCC = DecimalUtil.ZERO ;
         }
         else
         {
            AV38DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
         }
         AV39RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date12[0] = AV7RecFec ;
         GXv_decimal13[0] = AV36RecExiRea ;
         GXv_decimal14[0] = AV14RecExiRcc ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime16[0] = AV15Recfechr ;
         GXv_char2[0] = " " ;
         new app.pmemocant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_dtime16, GXv_char2) ;
         entradarecuentosproductos_impl.this.A396EmprCod = GXv_char4[0] ;
         entradarecuentosproductos_impl.this.A719PrdNum = GXv_char3[0] ;
         entradarecuentosproductos_impl.this.AV7RecFec = GXv_date12[0] ;
         entradarecuentosproductos_impl.this.AV36RecExiRea = GXv_decimal13[0] ;
         entradarecuentosproductos_impl.this.AV14RecExiRcc = GXv_decimal14[0] ;
         entradarecuentosproductos_impl.this.AV15Recfechr = GXv_dtime16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* End For Each Line */
      }
      if ( nGXsfl_56_fel_idx == 0 )
      {
         nGXsfl_56_idx = 1 ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
      }
      nGXsfl_56_fel_idx = 1 ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30GridState", AV30GridState);
   }

   public void e1513C2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         AV59Inc_obs = httpContext.getMessage( "Inicio Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV10EmprCod, GXutil.substring( AV78Pgmname, 1, 10), AV12UsurCod, AV9Station, AV59Inc_obs, 99999999, (byte)(0), " ") ;
         /* Start For Each Line */
         nRC_GXsfl_56 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_56"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_56_fel_idx = 0 ;
         while ( nGXsfl_56_fel_idx < nRC_GXsfl_56 )
         {
            nGXsfl_56_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_56_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_56_fel_idx+1) ;
            sGXsfl_56_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_562( ) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
               GX_FocusControl = edtavRecexirea_Internalname ;
               wbErr = true ;
               AV36RecExiRea = DecimalUtil.ZERO ;
            }
            else
            {
               AV36RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
               GX_FocusControl = edtavDifer_Internalname ;
               wbErr = true ;
               AV37Difer = DecimalUtil.ZERO ;
            }
            else
            {
               AV37Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
            }
            A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
               GX_FocusControl = edtavRecexircc_Internalname ;
               wbErr = true ;
               AV14RecExiRcc = DecimalUtil.ZERO ;
            }
            else
            {
               AV14RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
               GX_FocusControl = edtavDifercc_Internalname ;
               wbErr = true ;
               AV38DiferCC = DecimalUtil.ZERO ;
            }
            else
            {
               AV38DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
            }
            AV39RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
            AV65Precio_mov = ((AV24FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
            AV66TotDet = DecimalUtil.doubleToDec(0) ;
            AV37Difer = A809RecExiTeo.subtract(AV36RecExiRea) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV37Difer, 12, 4));
            AV38DiferCC = A808RecExiTcc.subtract(AV14RecExiRcc) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV38DiferCC, 12, 4));
            if ( AV37Difer.doubleValue() != 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = A719PrdNum ;
               GXv_decimal15[0] = AV37Difer ;
               GXv_date12[0] = AV7RecFec ;
               new app.pmodrem(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal15, GXv_date12) ;
               entradarecuentosproductos_impl.this.A396EmprCod = GXv_char4[0] ;
               entradarecuentosproductos_impl.this.A719PrdNum = GXv_char3[0] ;
               entradarecuentosproductos_impl.this.AV37Difer = GXv_decimal15[0] ;
               entradarecuentosproductos_impl.this.AV7RecFec = GXv_date12[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV37Difer, 12, 4));
               httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
            }
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_date12[0] = AV7RecFec ;
            GXv_decimal15[0] = AV36RecExiRea ;
            GXv_decimal14[0] = AV14RecExiRcc ;
            GXv_decimal13[0] = AV65Precio_mov ;
            GXv_dtime16[0] = AV15Recfechr ;
            GXv_char2[0] = " " ;
            GXv_char17[0] = AV39RecLot ;
            GXv_char18[0] = AV60RecUbic ;
            new app.pmodexi2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date12, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_dtime16, GXv_char2, GXv_char17, GXv_char18) ;
            entradarecuentosproductos_impl.this.A396EmprCod = GXv_char4[0] ;
            entradarecuentosproductos_impl.this.A719PrdNum = GXv_char3[0] ;
            entradarecuentosproductos_impl.this.AV7RecFec = GXv_date12[0] ;
            entradarecuentosproductos_impl.this.AV36RecExiRea = GXv_decimal15[0] ;
            entradarecuentosproductos_impl.this.AV14RecExiRcc = GXv_decimal14[0] ;
            entradarecuentosproductos_impl.this.AV65Precio_mov = GXv_decimal13[0] ;
            entradarecuentosproductos_impl.this.AV15Recfechr = GXv_dtime16[0] ;
            entradarecuentosproductos_impl.this.AV39RecLot = GXv_char17[0] ;
            entradarecuentosproductos_impl.this.AV60RecUbic = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV39RecLot);
            httpContext.ajax_rsp_assign_attri("", false, "AV60RecUbic", AV60RecUbic);
            if ( AV23FlagCcs == 1 )
            {
               AV61Fecha = GXutil.today( ) ;
               if ( AV37Difer.doubleValue() < 0 )
               {
                  AV62CCStkCanE = AV37Difer.negate() ;
                  AV63CCStkCanS = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  AV62CCStkCanE = DecimalUtil.doubleToDec(0) ;
                  AV63CCStkCanS = AV37Difer ;
               }
               GXv_char18[0] = A396EmprCod ;
               GXv_char17[0] = A719PrdNum ;
               GXv_decimal15[0] = AV62CCStkCanE ;
               GXv_decimal14[0] = AV63CCStkCanS ;
               GXv_char4[0] = httpContext.getMessage( "SR", "") ;
               GXv_char3[0] = "1" ;
               GXv_decimal13[0] = AV65Precio_mov ;
               GXv_int8[0] = 0 ;
               GXv_int6[0] = (byte)(0) ;
               GXv_char2[0] = " " ;
               GXv_int19[0] = 0 ;
               GXv_char20[0] = " " ;
               GXv_char21[0] = AV12UsurCod ;
               GXv_char22[0] = httpContext.getMessage( "Recuento de Almacen", "") ;
               GXv_int23[0] = (short)(0) ;
               GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal25[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date12[0] = AV64FecRec ;
               GXv_char26[0] = AV39RecLot ;
               GXv_char27[0] = AV16CCStkHor ;
               new app.precccstks(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_decimal15, GXv_decimal14, GXv_char4, GXv_char3, GXv_decimal13, GXv_int8, GXv_int6, GXv_char2, GXv_int19, GXv_char20, GXv_char21, GXv_char22, GXv_int23, GXv_decimal24, GXv_decimal25, GXv_date12, GXv_char26, GXv_char27) ;
               entradarecuentosproductos_impl.this.A396EmprCod = GXv_char18[0] ;
               entradarecuentosproductos_impl.this.A719PrdNum = GXv_char17[0] ;
               entradarecuentosproductos_impl.this.AV62CCStkCanE = GXv_decimal15[0] ;
               entradarecuentosproductos_impl.this.AV63CCStkCanS = GXv_decimal14[0] ;
               entradarecuentosproductos_impl.this.AV65Precio_mov = GXv_decimal13[0] ;
               entradarecuentosproductos_impl.this.AV12UsurCod = GXv_char21[0] ;
               entradarecuentosproductos_impl.this.AV64FecRec = GXv_date12[0] ;
               entradarecuentosproductos_impl.this.AV39RecLot = GXv_char26[0] ;
               entradarecuentosproductos_impl.this.AV16CCStkHor = GXv_char27[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV64FecRec", localUtil.format(AV64FecRec, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV39RecLot);
               httpContext.ajax_rsp_assign_attri("", false, "AV16CCStkHor", AV16CCStkHor);
               if ( AV13FlagCColor == 1 )
               {
                  if ( AV38DiferCC.doubleValue() < 0 )
                  {
                     AV62CCStkCanE = AV38DiferCC.negate() ;
                     AV63CCStkCanS = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     AV62CCStkCanE = DecimalUtil.doubleToDec(0) ;
                     AV63CCStkCanS = AV38DiferCC ;
                  }
                  GXv_char27[0] = A396EmprCod ;
                  GXv_char26[0] = A719PrdNum ;
                  GXv_decimal25[0] = AV62CCStkCanE ;
                  GXv_decimal24[0] = AV63CCStkCanS ;
                  GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                  GXv_char21[0] = "1" ;
                  GXv_decimal15[0] = AV65Precio_mov ;
                  GXv_int19[0] = 0 ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char20[0] = " " ;
                  GXv_int8[0] = 0 ;
                  GXv_char18[0] = " " ;
                  GXv_char17[0] = AV12UsurCod ;
                  GXv_char4[0] = httpContext.getMessage( "Recuento de CC", "") ;
                  GXv_int23[0] = (short)(0) ;
                  GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date12[0] = AV7RecFec ;
                  GXv_char3[0] = AV39RecLot ;
                  GXv_char2[0] = AV16CCStkHor ;
                  new app.precccstks(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24, GXv_char22, GXv_char21, GXv_decimal15, GXv_int19, GXv_int6, GXv_char20, GXv_int8, GXv_char18, GXv_char17, GXv_char4, GXv_int23, GXv_decimal14, GXv_decimal13, GXv_date12, GXv_char3, GXv_char2) ;
                  entradarecuentosproductos_impl.this.A396EmprCod = GXv_char27[0] ;
                  entradarecuentosproductos_impl.this.A719PrdNum = GXv_char26[0] ;
                  entradarecuentosproductos_impl.this.AV62CCStkCanE = GXv_decimal25[0] ;
                  entradarecuentosproductos_impl.this.AV63CCStkCanS = GXv_decimal24[0] ;
                  entradarecuentosproductos_impl.this.AV65Precio_mov = GXv_decimal15[0] ;
                  entradarecuentosproductos_impl.this.AV12UsurCod = GXv_char17[0] ;
                  entradarecuentosproductos_impl.this.AV7RecFec = GXv_date12[0] ;
                  entradarecuentosproductos_impl.this.AV39RecLot = GXv_char3[0] ;
                  entradarecuentosproductos_impl.this.AV16CCStkHor = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV39RecLot);
                  httpContext.ajax_rsp_assign_attri("", false, "AV16CCStkHor", AV16CCStkHor);
                  if ( AV21Nalmcc == 1 )
                  {
                     GXv_char27[0] = A396EmprCod ;
                     GXv_char26[0] = A719PrdNum ;
                     GXv_decimal25[0] = AV14RecExiRcc ;
                     GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                     GXv_decimal24[0] = AV65Precio_mov ;
                     GXv_char21[0] = AV12UsurCod ;
                     GXv_char20[0] = httpContext.getMessage( "Recuento de CC p/Almacenes", "") ;
                     GXv_date12[0] = AV7RecFec ;
                     GXv_dtime16[0] = AV15Recfechr ;
                     new app.pccalm1(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_char22, GXv_decimal24, GXv_char21, GXv_char20, GXv_date12, GXv_dtime16) ;
                     entradarecuentosproductos_impl.this.A396EmprCod = GXv_char27[0] ;
                     entradarecuentosproductos_impl.this.A719PrdNum = GXv_char26[0] ;
                     entradarecuentosproductos_impl.this.AV14RecExiRcc = GXv_decimal25[0] ;
                     entradarecuentosproductos_impl.this.AV65Precio_mov = GXv_decimal24[0] ;
                     entradarecuentosproductos_impl.this.AV12UsurCod = GXv_char21[0] ;
                     entradarecuentosproductos_impl.this.AV7RecFec = GXv_date12[0] ;
                     entradarecuentosproductos_impl.this.AV15Recfechr = GXv_dtime16[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV14RecExiRcc, 12, 4));
                     httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  }
               }
            }
            if ( AV17Val_stk == 0 )
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               new app.pstm017(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
               entradarecuentosproductos_impl.this.A396EmprCod = GXv_char27[0] ;
               entradarecuentosproductos_impl.this.A719PrdNum = GXv_char26[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            }
            else
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               GXv_decimal25[0] = AV36RecExiRea ;
               GXv_decimal24[0] = AV65Precio_mov ;
               new app.pvalstksr(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24) ;
               entradarecuentosproductos_impl.this.A396EmprCod = GXv_char27[0] ;
               entradarecuentosproductos_impl.this.A719PrdNum = GXv_char26[0] ;
               entradarecuentosproductos_impl.this.AV36RecExiRea = GXv_decimal25[0] ;
               entradarecuentosproductos_impl.this.AV65Precio_mov = GXv_decimal24[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV36RecExiRea, 12, 4));
            }
            /* End For Each Line */
         }
         if ( nGXsfl_56_fel_idx == 0 )
         {
            nGXsfl_56_idx = 1 ;
            sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_562( ) ;
         }
         nGXsfl_56_fel_idx = 1 ;
         AV59Inc_obs = httpContext.getMessage( "Fin Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV10EmprCod, GXutil.substring( AV78Pgmname, 1, 10), AV12UsurCod, AV9Station, AV59Inc_obs, 99999999, (byte)(0), " ") ;
         GXv_char27[0] = AV10EmprCod ;
         new app.pinvprd(remoteHandle, context).execute( GXv_char27) ;
         entradarecuentosproductos_impl.this.AV10EmprCod = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
         GRID_nFirstRecordOnPage = 0 ;
         GRID_nCurrentRecord = 0 ;
         GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_56_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         gxgrgrid_refresh( subGrid_Rows, AV7RecFec, AV35FilterFullText, AV10EmprCod, AV49ManageFiltersExecutionStep, AV44ColumnsSelector, AV50TFPrdNum, AV51TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV54TFRecExiTeo, AV55TFRecExiTeo_To, AV56TFRecExiTcc, AV57TFRecExiTcc_To, AV78Pgmname, AV32OrderedBy, AV33OrderedDsc, AV9Station, AV24FlagPreMed, AV23FlagCcs, AV13FlagCColor, AV21Nalmcc, AV17Val_stk) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44ColumnsSelector", AV44ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV47ManageFiltersData", AV47ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30GridState", AV30GridState);
   }

   public void e1713C2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      GXv_char27[0] = AV40ExcelFilename ;
      GXv_char26[0] = AV41ErrorMessage ;
      new app.entradarecuentosproductosexport(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
      entradarecuentosproductos_impl.this.AV40ExcelFilename = GXv_char27[0] ;
      entradarecuentosproductos_impl.this.AV41ErrorMessage = GXv_char26[0] ;
      if ( GXutil.strcmp(AV40ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV40ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV41ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30GridState", AV30GridState);
   }

   public void e1813C2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.entradarecuentosproductosexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV30GridState", AV30GridState);
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV32OrderedBy, 4, 0))+":"+(AV33OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV44ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "PrdNum", "", "Producto", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "PrdNom", "", "Descripcion", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "RecExiTeo", "", "Cant Teorica", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&RecExiRea", "", "Cant Real", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&Difer", "", "Dif", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "RecExiTcc", "", "Cant Teo CC", false, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&RecExiRcc", "", "Cant Real CC", false, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&DiferCC", "", "Dif", false, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV44ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&RecLot", "", "Lote", true, "") ;
      AV44ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXt_char1 = AV43UserCustomValue ;
      GXv_char27[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "EntradaRecuentosProductosColumnsSelector", GXv_char27) ;
      entradarecuentosproductos_impl.this.GXt_char1 = GXv_char27[0] ;
      AV43UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV43UserCustomValue)==0) ) )
      {
         AV45ColumnsSelectorAux.fromxml(AV43UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector28[0] = AV45ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector29[0] = AV44ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, GXv_SdtWWPColumnsSelector29) ;
         AV45ColumnsSelectorAux = GXv_SdtWWPColumnsSelector28[0] ;
         AV44ColumnsSelector = GXv_SdtWWPColumnsSelector29[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item30 = AV47ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item31[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item30 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "EntradaRecuentosProductosFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item31) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item30 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item31[0] ;
      AV47ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item30 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV35FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35FilterFullText", AV35FilterFullText);
      AV50TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdNum", AV50TFPrdNum);
      AV51TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdNum_Sel", AV51TFPrdNum_Sel);
      AV52TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrdNom", AV52TFPrdNom);
      AV53TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
      AV54TFRecExiTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54TFRecExiTeo", GXutil.ltrimstr( AV54TFRecExiTeo, 12, 4));
      AV55TFRecExiTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55TFRecExiTeo_To", GXutil.ltrimstr( AV55TFRecExiTeo_To, 12, 4));
      AV56TFRecExiTcc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecExiTcc", GXutil.ltrimstr( AV56TFRecExiTcc, 12, 4));
      AV57TFRecExiTcc_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecExiTcc_To", GXutil.ltrimstr( AV57TFRecExiTcc_To, 12, 4));
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
      if ( GXutil.strcmp(AV46Session.getValue(AV78Pgmname+"GridState"), "") == 0 )
      {
         AV30GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV78Pgmname+"GridState"), null, null);
      }
      else
      {
         AV30GridState.fromxml(AV46Session.getValue(AV78Pgmname+"GridState"), null, null);
      }
      AV32OrderedBy = AV30GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32OrderedBy), 4, 0));
      AV33OrderedDsc = AV30GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33OrderedDsc", AV33OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV81GXV1 = 1 ;
      while ( AV81GXV1 <= AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV31GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV81GXV1));
         if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV35FilterFullText = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35FilterFullText", AV35FilterFullText);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV50TFPrdNum = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFPrdNum", AV50TFPrdNum);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV51TFPrdNum_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFPrdNum_Sel", AV51TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV52TFPrdNom = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFPrdNom", AV52TFPrdNom);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV53TFPrdNom_Sel = AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV54TFRecExiTeo = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFRecExiTeo", GXutil.ltrimstr( AV54TFRecExiTeo, 12, 4));
            AV55TFRecExiTeo_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFRecExiTeo_To", GXutil.ltrimstr( AV55TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV56TFRecExiTcc = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFRecExiTcc", GXutil.ltrimstr( AV56TFRecExiTcc, 12, 4));
            AV57TFRecExiTcc_To = CommonUtil.decimalVal( AV31GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFRecExiTcc_To", GXutil.ltrimstr( AV57TFRecExiTcc_To, 12, 4));
         }
         AV81GXV1 = (int)(AV81GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char27[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFPrdNum_Sel)==0), AV51TFPrdNum_Sel, GXv_char27) ;
      entradarecuentosproductos_impl.this.GXt_char1 = GXv_char27[0] ;
      GXt_char32 = "" ;
      GXv_char26[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFPrdNom_Sel)==0), AV53TFPrdNom_Sel, GXv_char26) ;
      entradarecuentosproductos_impl.this.GXt_char32 = GXv_char26[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char32+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char32 = "" ;
      GXv_char27[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFPrdNum)==0), AV50TFPrdNum, GXv_char27) ;
      entradarecuentosproductos_impl.this.GXt_char32 = GXv_char27[0] ;
      GXt_char1 = "" ;
      GXv_char26[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFPrdNom)==0), AV52TFPrdNom, GXv_char26) ;
      entradarecuentosproductos_impl.this.GXt_char1 = GXv_char26[0] ;
      Ddo_grid_Filteredtext_set = GXt_char32+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFRecExiTeo)==0) ? "" : GXutil.str( AV54TFRecExiTeo, 12, 4))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFRecExiTcc)==0) ? "" : GXutil.str( AV56TFRecExiTcc, 12, 4))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFRecExiTeo_To)==0) ? "" : GXutil.str( AV55TFRecExiTeo_To, 12, 4))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFRecExiTcc_To)==0) ? "" : GXutil.str( AV57TFRecExiTcc_To, 12, 4))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV30GridState.fromxml(AV46Session.getValue(AV78Pgmname+"GridState"), null, null);
      AV30GridState.setgxTv_SdtWWPGridState_Orderedby( AV32OrderedBy );
      AV30GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV33OrderedDsc );
      AV30GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState33[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV35FilterFullText)==0), (short)(0), AV35FilterFullText, "") ;
      AV30GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFPRDNUM", "", !(GXutil.strcmp("", AV50TFPrdNum)==0), (short)(0), AV50TFPrdNum, "", !(GXutil.strcmp("", AV51TFPrdNum_Sel)==0), AV51TFPrdNum_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFPRDNOM", "", !(GXutil.strcmp("", AV52TFPrdNom)==0), (short)(0), AV52TFPrdNom, "", !(GXutil.strcmp("", AV53TFPrdNom_Sel)==0), AV53TFPrdNom_Sel, "") ;
      AV30GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFRECEXITEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFRecExiTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFRecExiTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV54TFRecExiTeo, 12, 4)), GXutil.trim( GXutil.str( AV55TFRecExiTeo_To, 12, 4))) ;
      AV30GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV30GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFRECEXITCC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFRecExiTcc)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFRecExiTcc_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV56TFRecExiTcc, 12, 4)), GXutil.trim( GXutil.str( AV57TFRecExiTcc_To, 12, 4))) ;
      AV30GridState = GXv_SdtWWPGridState33[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV30GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV28TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV28TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV78Pgmname );
      AV28TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV28TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV27HTTPRequest.getScriptName()+"?"+AV27HTTPRequest.getQuerystring() );
      AV28TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TRECUEN" );
      AV46Session.setValue("TrnContext", AV28TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LASTRECUEN' Routine */
      returnInSub = false ;
      AV5RecHora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV5RecHora", localUtil.ttoc( AV5RecHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV6Diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor H013C4 */
      pr_default.execute(2, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H013C4_A396EmprCod[0] ;
         A810RecFec = H013C4_A810RecFec[0] ;
         A13416RecEstInv = H013C4_A13416RecEstInv[0] ;
         A13455Rechora = H013C4_A13455Rechora[0] ;
         AV7RecFec = A810RecFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7RecFec", localUtil.format(AV7RecFec, "99/99/99"));
         AV5RecHora = A13455Rechora ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5RecHora", localUtil.ttoc( AV5RecHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV8Invprd = (short)(0) ;
      /* Using cursor H013C5 */
      pr_default.execute(3, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H013C5_A396EmprCod[0] ;
         A8577RecFecHr = H013C5_A8577RecFecHr[0] ;
         AV15Recfechr = A8577RecFecHr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Recfechr", localUtil.ttoc( AV15Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV8Invprd = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV16CCStkHor = (GXutil.dateCompare(GXutil.nullDate(), AV5RecHora) ? localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.ttoc( AV5RecHora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CCStkHor", AV16CCStkHor);
   }

   public void wb_table2_71_13C2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_71_13C2e( true) ;
      }
      else
      {
         wb_table2_71_13C2e( false) ;
      }
   }

   public void wb_table1_31_13C2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV47ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_36_13C2( true) ;
      }
      else
      {
         wb_table3_36_13C2( false) ;
      }
      return  ;
   }

   public void wb_table3_36_13C2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_31_13C2e( true) ;
      }
      else
      {
         wb_table1_31_13C2e( false) ;
      }
   }

   public void wb_table3_36_13C2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_56_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV35FilterFullText, GXutil.rtrim( localUtil.format( AV35FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_EntradaRecuentosProductos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_36_13C2e( true) ;
      }
      else
      {
         wb_table3_36_13C2e( false) ;
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
      pa13C2( ) ;
      ws13C2( ) ;
      we13C2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116131424", true, true);
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
      httpContext.AddJavascriptSource("entradarecuentosproductos.js", "?202682116131425", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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

   public void subsflControlProps_562( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_56_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_56_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_56_idx ;
      edtavRecexirea_Internalname = "vRECEXIREA_"+sGXsfl_56_idx ;
      edtavDifer_Internalname = "vDIFER_"+sGXsfl_56_idx ;
      edtRecExiTcc_Internalname = "RECEXITCC_"+sGXsfl_56_idx ;
      edtavRecexircc_Internalname = "vRECEXIRCC_"+sGXsfl_56_idx ;
      edtavDifercc_Internalname = "vDIFERCC_"+sGXsfl_56_idx ;
      edtavReclot_Internalname = "vRECLOT_"+sGXsfl_56_idx ;
   }

   public void subsflControlProps_fel_562( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_56_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_56_fel_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_56_fel_idx ;
      edtavRecexirea_Internalname = "vRECEXIREA_"+sGXsfl_56_fel_idx ;
      edtavDifer_Internalname = "vDIFER_"+sGXsfl_56_fel_idx ;
      edtRecExiTcc_Internalname = "RECEXITCC_"+sGXsfl_56_fel_idx ;
      edtavRecexircc_Internalname = "vRECEXIRCC_"+sGXsfl_56_fel_idx ;
      edtavDifercc_Internalname = "vDIFERCC_"+sGXsfl_56_fel_idx ;
      edtavReclot_Internalname = "vRECLOT_"+sGXsfl_56_fel_idx ;
   }

   public void sendrow_562( )
   {
      subsflControlProps_562( ) ;
      wb13C0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_56_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_56_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_56_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecExiTeo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecexirea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexirea_Internalname,GXutil.ltrim( localUtil.ntoc( AV36RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV36RecExiRea, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecexirea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecexirea_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifer_Internalname,GXutil.ltrim( localUtil.ntoc( AV37Difer, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifer_Enabled!=0) ? localUtil.format( AV37Difer, "ZZZZZZ9.9999") : localUtil.format( AV37Difer, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDifer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifer_Visible),Integer.valueOf(edtavDifer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiTcc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTcc_Internalname,GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecExiTcc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecexircc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexircc_Enabled!=0)&&(edtavRecexircc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexircc_Internalname,GXutil.ltrim( localUtil.ntoc( AV14RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV14RecExiRcc, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexircc_Enabled!=0)&&(edtavRecexircc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,63);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecexircc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecexircc_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifercc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifercc_Enabled!=0)&&(edtavDifercc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifercc_Internalname,GXutil.ltrim( localUtil.ntoc( AV38DiferCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifercc_Enabled!=0) ? localUtil.format( AV38DiferCC, "ZZZZZZ9.9999") : localUtil.format( AV38DiferCC, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavDifercc_Enabled!=0)&&(edtavDifercc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,64);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDifercc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifercc_Visible),Integer.valueOf(edtavDifercc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavReclot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_56_idx+"',56)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavReclot_Internalname,GXutil.rtrim( AV39RecLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,65);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavReclot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavReclot_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(56),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes13C2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_56_idx = ((subGrid_Islastpage==1)&&(nGXsfl_56_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_56_idx+1) ;
         sGXsfl_56_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_56_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_562( ) ;
      }
      /* End function sendrow_562 */
   }

   public void startgridcontrol56( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"56\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Teorica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecexirea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiTcc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Teo CC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecexircc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Real CC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifercc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavReclot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV36RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecexirea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37Difer, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV14RecExiRcc, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecexircc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV38DiferCC, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV39RecLot));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavReclot_Visible, (byte)(5), (byte)(0), ".", "")));
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
      edtavRecfec_Internalname = "vRECFEC" ;
      edtavCcstkhor_Internalname = "vCCSTKHOR" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnmemorizarcantreal_Internalname = "BTNMEMORIZARCANTREAL" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtRecExiTeo_Internalname = "RECEXITEO" ;
      edtavRecexirea_Internalname = "vRECEXIREA" ;
      edtavDifer_Internalname = "vDIFER" ;
      edtRecExiTcc_Internalname = "RECEXITCC" ;
      edtavRecexircc_Internalname = "vRECEXIRCC" ;
      edtavDifercc_Internalname = "vDIFERCC" ;
      edtavReclot_Internalname = "vRECLOT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavReclot_Jsonclick = "" ;
      edtavReclot_Enabled = 1 ;
      edtavDifercc_Jsonclick = "" ;
      edtavDifercc_Enabled = 1 ;
      edtavRecexircc_Jsonclick = "" ;
      edtavRecexircc_Enabled = 1 ;
      edtRecExiTcc_Jsonclick = "" ;
      edtavDifer_Jsonclick = "" ;
      edtavDifer_Enabled = 1 ;
      edtavRecexirea_Jsonclick = "" ;
      edtavRecexirea_Enabled = 1 ;
      edtRecExiTeo_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavReclot_Visible = -1 ;
      edtavDifer_Visible = -1 ;
      edtavRecexirea_Visible = -1 ;
      edtRecExiTeo_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavCcstkhor_Jsonclick = "" ;
      edtavCcstkhor_Enabled = 1 ;
      edtavRecfec_Jsonclick = "" ;
      edtavRecfec_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma el Inventario introducido?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "EntradaRecuentosProductosGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "T|T|||||||" ;
      Ddo_grid_Filterisrange = "||T|||T|||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|||Numeric|||" ;
      Ddo_grid_Includefilter = "T|T|T|||T|||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|||T|||" ;
      Ddo_grid_Columnssortvalues = "2|1|3|||4|||" ;
      Ddo_grid_Columnids = "0:PrdNum|1:PrdNom|2:RecExiTeo|3:RecExiRea|4:Difer|5:RecExiTcc|6:RecExiRcc|7:DiferCC|8:RecLot" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Acciones", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( " RECUENTOS", "") );
      edtavDifercc_Visible = -1 ;
      edtavRecexircc_Visible = -1 ;
      edtRecExiTcc_Visible = -1 ;
      subGrid_Rows = 50 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1313C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2113C2',iparms:[{av:'A11624RecMemCant',fld:'RECMEMCANT',pic:'9'},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'A12285RecLot',fld:'RECLOT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV36RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV37Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'AV14RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV38DiferCC',fld:'vDIFERCC',pic:'ZZZZZZ9.9999'},{av:'AV39RecLot',fld:'vRECLOT',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1413C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1213C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOMEMORIZARCANTREAL'","{handler:'e1613C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',grid:56,pic:''},{av:'nRC_GXsfl_56',ctrl:'GRID',grid:56,prop:'GridRC',grid:56},{av:'AV36RecExiRea',fld:'vRECEXIREA',grid:56,pic:'ZZZZZZ9.9999'},{av:'AV14RecExiRcc',fld:'vRECEXIRCC',grid:56,pic:'ZZZZZZ9.9999'},{av:'AV15Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOMEMORIZARCANTREAL'",",oparms:[{av:'AV15Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV14RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV36RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1113C1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e1513C2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV12UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A809RecExiTeo',fld:'RECEXITEO',grid:56,pic:'ZZZZZZ9.9999',hsh:true},{av:'nRC_GXsfl_56',ctrl:'GRID',grid:56,prop:'GridRC',grid:56},{av:'AV36RecExiRea',fld:'vRECEXIREA',grid:56,pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',grid:56,pic:'ZZZZZZ9.9999',hsh:true},{av:'AV14RecExiRcc',fld:'vRECEXIRCC',grid:56,pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',grid:56,pic:''},{av:'AV15Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV39RecLot',fld:'vRECLOT',grid:56,pic:''},{av:'AV60RecUbic',fld:'vRECUBIC',pic:''},{av:'AV64FecRec',fld:'vFECREC',pic:''},{av:'AV16CCStkHor',fld:'vCCSTKHOR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV37Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'AV38DiferCC',fld:'vDIFERCC',pic:'ZZZZZZ9.9999'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV60RecUbic',fld:'vRECUBIC',pic:''},{av:'AV39RecLot',fld:'vRECLOT',pic:''},{av:'AV15Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV14RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV36RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV16CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV64FecRec',fld:'vFECREC',pic:''},{av:'AV12UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1713C2',iparms:[{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1813C2',iparms:[{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV30GridState',fld:'vGRIDSTATE',pic:''},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV7RecFec',fld:'vRECFEC',pic:''},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV9Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV24FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV23FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV13FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV21Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV17Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV35FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV50TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV51TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV55TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV56TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV57TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV78Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV32OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV49ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV44ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'},{av:'AV47ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV30GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALIDV_RECFEC","{handler:'validv_Recfec',iparms:[]");
      setEventMetadata("VALIDV_RECFEC",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Reclot',iparms:[]");
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
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV7RecFec = GXutil.nullDate() ;
      AV35FilterFullText = "" ;
      AV10EmprCod = "" ;
      AV44ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV50TFPrdNum = "" ;
      AV51TFPrdNum_Sel = "" ;
      AV52TFPrdNom = "" ;
      AV53TFPrdNom_Sel = "" ;
      AV54TFRecExiTeo = DecimalUtil.ZERO ;
      AV55TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV56TFRecExiTcc = DecimalUtil.ZERO ;
      AV57TFRecExiTcc_To = DecimalUtil.ZERO ;
      AV78Pgmname = "" ;
      AV9Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV47ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A807RecExiRea = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      AV30GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
      AV15Recfechr = GXutil.resetTime( GXutil.nullDate() );
      AV12UsurCod = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV60RecUbic = "" ;
      AV64FecRec = GXutil.nullDate() ;
      A727PrdRec = "" ;
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
      AV16CCStkHor = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnmemorizarcantreal_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV69Entradarecuentosproductosds_1_filterfulltext = "" ;
      AV70Entradarecuentosproductosds_2_tfprdnum = "" ;
      AV71Entradarecuentosproductosds_3_tfprdnum_sel = "" ;
      AV72Entradarecuentosproductosds_4_tfprdnom = "" ;
      AV73Entradarecuentosproductosds_5_tfprdnom_sel = "" ;
      AV74Entradarecuentosproductosds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV75Entradarecuentosproductosds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV76Entradarecuentosproductosds_8_tfrecexitcc = DecimalUtil.ZERO ;
      AV77Entradarecuentosproductosds_9_tfrecexitcc_to = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      AV36RecExiRea = DecimalUtil.ZERO ;
      AV37Difer = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      AV14RecExiRcc = DecimalUtil.ZERO ;
      AV38DiferCC = DecimalUtil.ZERO ;
      AV39RecLot = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV69Entradarecuentosproductosds_1_filterfulltext = "" ;
      lV70Entradarecuentosproductosds_2_tfprdnum = "" ;
      lV72Entradarecuentosproductosds_4_tfprdnom = "" ;
      A810RecFec = GXutil.nullDate() ;
      H013C2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H013C2_A727PrdRec = new String[] {""} ;
      H013C2_A13416RecEstInv = new byte[1] ;
      H013C2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C2_A11624RecMemCant = new byte[1] ;
      H013C2_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C2_A12285RecLot = new String[] {""} ;
      H013C2_A396EmprCod = new String[] {""} ;
      H013C2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C2_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C2_A718PrdNom = new String[] {""} ;
      H013C2_A719PrdNum = new String[] {""} ;
      H013C3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H013C3_A727PrdRec = new String[] {""} ;
      H013C3_A13416RecEstInv = new byte[1] ;
      H013C3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C3_A11624RecMemCant = new byte[1] ;
      H013C3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C3_A12285RecLot = new String[] {""} ;
      H013C3_A396EmprCod = new String[] {""} ;
      H013C3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H013C3_A718PrdNom = new String[] {""} ;
      H013C3_A719PrdNum = new String[] {""} ;
      AV11EmprNom = "" ;
      AV27HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV26WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV46Session = httpContext.getWebSession();
      AV42ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV48ManageFiltersXml = "" ;
      AV59Inc_obs = "" ;
      AV65Precio_mov = DecimalUtil.ZERO ;
      AV66TotDet = DecimalUtil.ZERO ;
      AV61Fecha = GXutil.nullDate() ;
      AV62CCStkCanE = DecimalUtil.ZERO ;
      AV63CCStkCanS = DecimalUtil.ZERO ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int19 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int8 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int23 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_dtime16 = new java.util.Date[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      AV40ExcelFilename = "" ;
      AV41ErrorMessage = "" ;
      AV43UserCustomValue = "" ;
      AV45ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector28 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector29 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item30 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item31 = new GXBaseCollection[1] ;
      AV31GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char32 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char26 = new String[1] ;
      GXv_SdtWWPGridState33 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV28TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV5RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV6Diahora = GXutil.resetTime( GXutil.nullDate() );
      H013C4_A719PrdNum = new String[] {""} ;
      H013C4_A396EmprCod = new String[] {""} ;
      H013C4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H013C4_A13416RecEstInv = new byte[1] ;
      H013C4_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      H013C5_A719PrdNum = new String[] {""} ;
      H013C5_A396EmprCod = new String[] {""} ;
      H013C5_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentosproductos__default(),
         new Object[] {
             new Object[] {
            H013C2_A810RecFec, H013C2_A727PrdRec, H013C2_A13416RecEstInv, H013C2_A807RecExiRea, H013C2_A11624RecMemCant, H013C2_A806RecExiRcc, H013C2_A12285RecLot, H013C2_A396EmprCod, H013C2_A724PrdPreAct, H013C2_A726PrdPreMed,
            H013C2_A808RecExiTcc, H013C2_A809RecExiTeo, H013C2_A718PrdNom, H013C2_A719PrdNum
            }
            , new Object[] {
            H013C3_A810RecFec, H013C3_A727PrdRec, H013C3_A13416RecEstInv, H013C3_A807RecExiRea, H013C3_A11624RecMemCant, H013C3_A806RecExiRcc, H013C3_A12285RecLot, H013C3_A396EmprCod, H013C3_A724PrdPreAct, H013C3_A726PrdPreMed,
            H013C3_A808RecExiTcc, H013C3_A809RecExiTeo, H013C3_A718PrdNom, H013C3_A719PrdNum
            }
            , new Object[] {
            H013C4_A719PrdNum, H013C4_A396EmprCod, H013C4_A810RecFec, H013C4_A13416RecEstInv, H013C4_A13455Rechora
            }
            , new Object[] {
            H013C5_A719PrdNum, H013C5_A396EmprCod, H013C5_A8577RecFecHr
            }
         }
      );
      AV78Pgmname = "EntradaRecuentosProductos" ;
      /* GeneXus formulas. */
      AV78Pgmname = "EntradaRecuentosProductos" ;
      Gx_err = (short)(0) ;
      edtavRecfec_Enabled = 0 ;
      edtavCcstkhor_Enabled = 0 ;
      edtavDifer_Enabled = 0 ;
      edtavDifercc_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV49ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A11624RecMemCant ;
   private byte nDonePA ;
   private byte A13416RecEstInv ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV32OrderedBy ;
   private short AV24FlagPreMed ;
   private short AV23FlagCcs ;
   private short AV21Nalmcc ;
   private short AV17Val_stk ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV18Precio_stk ;
   private short AV19Artextil ;
   private short AV20Intexco ;
   private short AV22Ubicacion ;
   private short GXv_int23[] ;
   private short AV8Invprd ;
   private int edtRecExiTcc_Visible ;
   private int edtavRecexircc_Visible ;
   private int edtavDifercc_Visible ;
   private int nRC_GXsfl_56 ;
   private int subGrid_Rows ;
   private int nGXsfl_56_idx=1 ;
   private int edtavRecfec_Enabled ;
   private int edtavCcstkhor_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDifer_Enabled ;
   private int edtavDifercc_Enabled ;
   private int GXt_int7 ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtRecExiTeo_Visible ;
   private int edtavRecexirea_Visible ;
   private int edtavDifer_Visible ;
   private int edtavReclot_Visible ;
   private int nGXsfl_56_fel_idx=1 ;
   private int GXv_int19[] ;
   private int GXv_int8[] ;
   private int AV81GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavRecexirea_Enabled ;
   private int edtavRecexircc_Enabled ;
   private int edtavReclot_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV13FlagCColor ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV54TFRecExiTeo ;
   private java.math.BigDecimal AV55TFRecExiTeo_To ;
   private java.math.BigDecimal AV56TFRecExiTcc ;
   private java.math.BigDecimal AV57TFRecExiTcc_To ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV74Entradarecuentosproductosds_6_tfrecexiteo ;
   private java.math.BigDecimal AV75Entradarecuentosproductosds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV76Entradarecuentosproductosds_8_tfrecexitcc ;
   private java.math.BigDecimal AV77Entradarecuentosproductosds_9_tfrecexitcc_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV36RecExiRea ;
   private java.math.BigDecimal AV37Difer ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal AV14RecExiRcc ;
   private java.math.BigDecimal AV38DiferCC ;
   private java.math.BigDecimal AV65Precio_mov ;
   private java.math.BigDecimal AV66TotDet ;
   private java.math.BigDecimal AV62CCStkCanE ;
   private java.math.BigDecimal AV63CCStkCanS ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_56_idx="0001" ;
   private String edtRecExiTcc_Internalname ;
   private String edtavRecexircc_Internalname ;
   private String edtavDifercc_Internalname ;
   private String AV10EmprCod ;
   private String AV50TFPrdNum ;
   private String AV51TFPrdNum_Sel ;
   private String AV52TFPrdNom ;
   private String AV53TFPrdNom_Sel ;
   private String AV78Pgmname ;
   private String AV9Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A12285RecLot ;
   private String A396EmprCod ;
   private String AV12UsurCod ;
   private String AV60RecUbic ;
   private String A727PrdRec ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
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
   private String edtavRecfec_Internalname ;
   private String edtavRecfec_Jsonclick ;
   private String edtavCcstkhor_Internalname ;
   private String AV16CCStkHor ;
   private String edtavCcstkhor_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnmemorizarcantreal_Internalname ;
   private String bttBtnmemorizarcantreal_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV70Entradarecuentosproductosds_2_tfprdnum ;
   private String AV71Entradarecuentosproductosds_3_tfprdnum_sel ;
   private String AV72Entradarecuentosproductosds_4_tfprdnom ;
   private String AV73Entradarecuentosproductosds_5_tfprdnom_sel ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtavRecexirea_Internalname ;
   private String edtavDifer_Internalname ;
   private String AV39RecLot ;
   private String edtavReclot_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV70Entradarecuentosproductosds_2_tfprdnum ;
   private String lV72Entradarecuentosproductosds_4_tfprdnom ;
   private String edtavFilterfulltext_Internalname ;
   private String AV11EmprNom ;
   private String sGXsfl_56_fel_idx="0001" ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char22[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXt_char32 ;
   private String GXv_char27[] ;
   private String GXt_char1 ;
   private String GXv_char26[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtavRecexirea_Jsonclick ;
   private String edtavDifer_Jsonclick ;
   private String edtRecExiTcc_Jsonclick ;
   private String edtavRecexircc_Jsonclick ;
   private String edtavDifercc_Jsonclick ;
   private String edtavReclot_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV15Recfechr ;
   private java.util.Date GXv_dtime16[] ;
   private java.util.Date AV5RecHora ;
   private java.util.Date AV6Diahora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date A8577RecFecHr ;
   private java.util.Date AV7RecFec ;
   private java.util.Date AV64FecRec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV61Fecha ;
   private java.util.Date GXv_date12[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_56_Refreshing=false ;
   private boolean AV33OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV42ColumnsSelectorXML ;
   private String AV48ManageFiltersXml ;
   private String AV43UserCustomValue ;
   private String AV35FilterFullText ;
   private String AV69Entradarecuentosproductosds_1_filterfulltext ;
   private String lV69Entradarecuentosproductosds_1_filterfulltext ;
   private String AV59Inc_obs ;
   private String AV40ExcelFilename ;
   private String AV41ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV27HTTPRequest ;
   private com.genexus.webpanels.WebSession AV46Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H013C2_A810RecFec ;
   private String[] H013C2_A727PrdRec ;
   private byte[] H013C2_A13416RecEstInv ;
   private java.math.BigDecimal[] H013C2_A807RecExiRea ;
   private byte[] H013C2_A11624RecMemCant ;
   private java.math.BigDecimal[] H013C2_A806RecExiRcc ;
   private String[] H013C2_A12285RecLot ;
   private String[] H013C2_A396EmprCod ;
   private java.math.BigDecimal[] H013C2_A724PrdPreAct ;
   private java.math.BigDecimal[] H013C2_A726PrdPreMed ;
   private java.math.BigDecimal[] H013C2_A808RecExiTcc ;
   private java.math.BigDecimal[] H013C2_A809RecExiTeo ;
   private String[] H013C2_A718PrdNom ;
   private String[] H013C2_A719PrdNum ;
   private java.util.Date[] H013C3_A810RecFec ;
   private String[] H013C3_A727PrdRec ;
   private byte[] H013C3_A13416RecEstInv ;
   private java.math.BigDecimal[] H013C3_A807RecExiRea ;
   private byte[] H013C3_A11624RecMemCant ;
   private java.math.BigDecimal[] H013C3_A806RecExiRcc ;
   private String[] H013C3_A12285RecLot ;
   private String[] H013C3_A396EmprCod ;
   private java.math.BigDecimal[] H013C3_A724PrdPreAct ;
   private java.math.BigDecimal[] H013C3_A726PrdPreMed ;
   private java.math.BigDecimal[] H013C3_A808RecExiTcc ;
   private java.math.BigDecimal[] H013C3_A809RecExiTeo ;
   private String[] H013C3_A718PrdNom ;
   private String[] H013C3_A719PrdNum ;
   private String[] H013C4_A719PrdNum ;
   private String[] H013C4_A396EmprCod ;
   private java.util.Date[] H013C4_A810RecFec ;
   private byte[] H013C4_A13416RecEstInv ;
   private java.util.Date[] H013C4_A13455Rechora ;
   private String[] H013C5_A719PrdNum ;
   private String[] H013C5_A396EmprCod ;
   private java.util.Date[] H013C5_A8577RecFecHr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV47ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item30 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item31[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV44ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV45ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector28[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector29[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV30GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState33[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV31GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV28TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV26WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class entradarecuentosproductos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H013C2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Entradarecuentosproductosds_1_filterfulltext ,
                                          String AV71Entradarecuentosproductosds_3_tfprdnum_sel ,
                                          String AV70Entradarecuentosproductosds_2_tfprdnum ,
                                          String AV73Entradarecuentosproductosds_5_tfprdnom_sel ,
                                          String AV72Entradarecuentosproductosds_4_tfprdnom ,
                                          java.math.BigDecimal AV74Entradarecuentosproductosds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV75Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV76Entradarecuentosproductosds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV77Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          short AV32OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String AV10EmprCod ,
                                          java.util.Date AV7RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[14];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.RecFec, T2.PrdRec, T1.RecEstInv, T1.RecExiRea, T1.RecMemCant, T1.RecExiRcc, T1.RecLot, T1.EmprCod, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc," ;
      scmdbuf += " T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV69Entradarecuentosproductosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
         GXv_int34[3] = (byte)(1) ;
         GXv_int34[4] = (byte)(1) ;
         GXv_int34[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Entradarecuentosproductosds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Entradarecuentosproductosds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Entradarecuentosproductosds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Entradarecuentosproductosds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Entradarecuentosproductosds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Entradarecuentosproductosds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Entradarecuentosproductosds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Entradarecuentosproductosds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Entradarecuentosproductosds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Entradarecuentosproductosds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV32OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV32OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc DESC" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_H013C3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Entradarecuentosproductosds_1_filterfulltext ,
                                          String AV71Entradarecuentosproductosds_3_tfprdnum_sel ,
                                          String AV70Entradarecuentosproductosds_2_tfprdnum ,
                                          String AV73Entradarecuentosproductosds_5_tfprdnom_sel ,
                                          String AV72Entradarecuentosproductosds_4_tfprdnom ,
                                          java.math.BigDecimal AV74Entradarecuentosproductosds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV75Entradarecuentosproductosds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV76Entradarecuentosproductosds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV77Entradarecuentosproductosds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          short AV32OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String AV10EmprCod ,
                                          java.util.Date AV7RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[14];
      Object[] GXv_Object37 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.RecFec, T2.PrdRec, T1.RecEstInv, T1.RecExiRea, T1.RecMemCant, T1.RecExiRcc, T1.RecLot, T1.EmprCod, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc," ;
      scmdbuf += " T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV69Entradarecuentosproductosds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int36[2] = (byte)(1) ;
         GXv_int36[3] = (byte)(1) ;
         GXv_int36[4] = (byte)(1) ;
         GXv_int36[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Entradarecuentosproductosds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Entradarecuentosproductosds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Entradarecuentosproductosds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int36[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Entradarecuentosproductosds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Entradarecuentosproductosds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Entradarecuentosproductosds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int36[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Entradarecuentosproductosds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int36[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Entradarecuentosproductosds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int36[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Entradarecuentosproductosds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int36[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Entradarecuentosproductosds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int36[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV32OrderedBy == 1 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV32OrderedBy == 1 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV32OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV32OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc" ;
      }
      else if ( ( AV32OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc DESC" ;
      }
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
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
                  return conditional_H013C2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
            case 1 :
                  return conditional_H013C3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (java.util.Date)dynConstraints[18] , (String)dynConstraints[19] , (java.util.Date)dynConstraints[20] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H013C2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H013C3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H013C4", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PrdNum, EmprCod, RecFec, RecEstInv, Rechora FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H013C5", "SELECT * FROM (SELECT PrdNum, EmprCod, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? ORDER BY EmprCod, RecFecHr DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[18], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

