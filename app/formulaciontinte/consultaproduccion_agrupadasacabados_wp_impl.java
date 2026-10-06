package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class consultaproduccion_agrupadasacabados_wp_impl extends GXDataArea
{
   public consultaproduccion_agrupadasacabados_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public consultaproduccion_agrupadasacabados_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( consultaproduccion_agrupadasacabados_wp_impl.class ));
   }

   public consultaproduccion_agrupadasacabados_wp_impl( int remoteHandle ,
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
            AV39Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39Emprcod", AV39Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV40Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barcod), "ZZZZZZZ9")));
               AV41Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41Barcodreo", GXutil.str( AV41Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barcodreo), "9")));
               AV42Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42Barcodpar", AV42Barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42Barcodpar, ""))));
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
      nRC_GXsfl_33 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_33"))) ;
      nGXsfl_33_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_33_idx"))) ;
      sGXsfl_33_idx = httpContext.GetPar( "sGXsfl_33_idx") ;
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
      AV14FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV39Emprcod = httpContext.GetPar( "Emprcod") ;
      AV40Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV41Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV42Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV18ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV19TFAc_Barcod = (int)(GXutil.lval( httpContext.GetPar( "TFAc_Barcod"))) ;
      AV20TFAc_Barcod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAc_Barcod_To"))) ;
      AV21TFAc_BarReo = (byte)(GXutil.lval( httpContext.GetPar( "TFAc_BarReo"))) ;
      AV22TFAc_BarReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFAc_BarReo_To"))) ;
      AV23TFAc_BarPar = httpContext.GetPar( "TFAc_BarPar") ;
      AV24TFAc_BarPar_Sel = httpContext.GetPar( "TFAc_BarPar_Sel") ;
      AV25TFAc_Metros = CommonUtil.decimalVal( httpContext.GetPar( "TFAc_Metros"), ".") ;
      AV26TFAc_Metros_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAc_Metros_To"), ".") ;
      AV27TFAc_Kilos = CommonUtil.decimalVal( httpContext.GetPar( "TFAc_Kilos"), ".") ;
      AV28TFAc_Kilos_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAc_Kilos_To"), ".") ;
      AV29TFAc_Pzs = (short)(GXutil.lval( httpContext.GetPar( "TFAc_Pzs"))) ;
      AV30TFAc_Pzs_To = (short)(GXutil.lval( httpContext.GetPar( "TFAc_Pzs_To"))) ;
      AV61Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV39Emprcod, AV40Barcod, AV41Barcodreo, AV42Barcodpar, AV18ManageFiltersExecutionStep, AV19TFAc_Barcod, AV20TFAc_Barcod_To, AV21TFAc_BarReo, AV22TFAc_BarReo_To, AV23TFAc_BarPar, AV24TFAc_BarPar_Sel, AV25TFAc_Metros, AV26TFAc_Metros_To, AV27TFAc_Kilos, AV28TFAc_Kilos_To, AV29TFAc_Pzs, AV30TFAc_Pzs_To, AV61Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
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
      pa1O32( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1O32( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.consultaproduccion_agrupadasacabados_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV40Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42Barcodpar))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42Barcodpar, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV14FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_33, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV16ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV16ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV37GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV38GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV18ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_BARCOD", GXutil.ltrim( localUtil.ntoc( AV19TFAc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_BARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV20TFAc_Barcod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_BARREO", GXutil.ltrim( localUtil.ntoc( AV21TFAc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_BARREO_TO", GXutil.ltrim( localUtil.ntoc( AV22TFAc_BarReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_BARPAR", GXutil.rtrim( AV23TFAc_BarPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_BARPAR_SEL", GXutil.rtrim( AV24TFAc_BarPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_METROS", GXutil.ltrim( localUtil.ntoc( AV25TFAc_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_METROS_TO", GXutil.ltrim( localUtil.ntoc( AV26TFAc_Metros_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_KILOS", GXutil.ltrim( localUtil.ntoc( AV27TFAc_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_KILOS_TO", GXutil.ltrim( localUtil.ntoc( AV28TFAc_Kilos_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_PZS", GXutil.ltrim( localUtil.ntoc( AV29TFAc_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFAC_PZS_TO", GXutil.ltrim( localUtil.ntoc( AV30TFAc_Pzs_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV61Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV39Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV40Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV41Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV42Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42Barcodpar, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we1O32( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1O32( ) ;
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
      return formatLink("app.formulaciontinte.consultaproduccion_agrupadasacabados_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV40Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV41Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42Barcodpar))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta de Hdrs Agrupadas para Acabados", "") ;
   }

   public void wb1O30( )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_15_1O32( true) ;
      }
      else
      {
         wb_table1_15_1O32( false) ;
      }
      return  ;
   }

   public void wb_table1_15_1O32e( boolean wbgen )
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
         startgridcontrol33( ) ;
      }
      if ( wbEnd == 33 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_33 = (int)(nGXsfl_33_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV37GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV38GridPageCount);
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV35DDO_TitleSettingsIcons);
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
      if ( wbEnd == 33 )
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

   public void start1O32( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta de Hdrs Agrupadas para Acabados", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1O30( ) ;
   }

   public void ws1O32( )
   {
      start1O32( ) ;
      evt1O32( ) ;
   }

   public void evt1O32( )
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
                           e111O32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121O32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131O32 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141O32 ();
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
                           nGXsfl_33_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_332( ) ;
                           A6031Ac_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtAc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6032Ac_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtAc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6033Ac_BarPar = httpContext.cgiGet( edtAc_BarPar_Internalname) ;
                           A6034Ac_Metros = localUtil.ctond( httpContext.cgiGet( edtAc_Metros_Internalname)) ;
                           n6034Ac_Metros = false ;
                           A6035Ac_Kilos = localUtil.ctond( httpContext.cgiGet( edtAc_Kilos_Internalname)) ;
                           n6035Ac_Kilos = false ;
                           A6036Ac_Pzs = (short)(localUtil.ctol( httpContext.cgiGet( edtAc_Pzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n6036Ac_Pzs = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151O32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e161O32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171O32 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV14FilterFullText) != 0 )
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

   public void we1O32( )
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

   public void pa1O32( )
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
      subsflControlProps_332( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         sendrow_332( ) ;
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV14FilterFullText ,
                                 String AV39Emprcod ,
                                 int AV40Barcod ,
                                 byte AV41Barcodreo ,
                                 String AV42Barcodpar ,
                                 byte AV18ManageFiltersExecutionStep ,
                                 int AV19TFAc_Barcod ,
                                 int AV20TFAc_Barcod_To ,
                                 byte AV21TFAc_BarReo ,
                                 byte AV22TFAc_BarReo_To ,
                                 String AV23TFAc_BarPar ,
                                 String AV24TFAc_BarPar_Sel ,
                                 java.math.BigDecimal AV25TFAc_Metros ,
                                 java.math.BigDecimal AV26TFAc_Metros_To ,
                                 java.math.BigDecimal AV27TFAc_Kilos ,
                                 java.math.BigDecimal AV28TFAc_Kilos_To ,
                                 short AV29TFAc_Pzs ,
                                 short AV30TFAc_Pzs_To ,
                                 String AV61Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161O32 ();
      GRID_nCurrentRecord = 0 ;
      rf1O32( ) ;
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
      rf1O32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV61Pgmname = "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WP" ;
      Gx_err = (short)(0) ;
   }

   public void rf1O32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(33) ;
      /* Execute user event: Refresh */
      e161O32 ();
      nGXsfl_33_idx = 1 ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_332( ) ;
      bGXsfl_33_Refreshing = true ;
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
         subsflControlProps_332( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ,
                                              Integer.valueOf(AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod) ,
                                              Integer.valueOf(AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to) ,
                                              Byte.valueOf(AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo) ,
                                              Byte.valueOf(AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to) ,
                                              AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ,
                                              AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ,
                                              AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ,
                                              AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ,
                                              AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ,
                                              AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ,
                                              Short.valueOf(AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs) ,
                                              Short.valueOf(AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to) ,
                                              Integer.valueOf(A6031Ac_Barcod) ,
                                              Byte.valueOf(A6032Ac_BarReo) ,
                                              A6033Ac_BarPar ,
                                              A6034Ac_Metros ,
                                              A6035Ac_Kilos ,
                                              Short.valueOf(A6036Ac_Pzs) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV39Emprcod ,
                                              Integer.valueOf(AV40Barcod) ,
                                              Byte.valueOf(AV41Barcodreo) ,
                                              AV42Barcodpar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
         lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
         lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
         lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
         lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
         lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
         lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar), 1, "%") ;
         /* Using cursor H01O32 */
         pr_default.execute(0, new Object[] {AV39Emprcod, Integer.valueOf(AV40Barcod), Byte.valueOf(AV41Barcodreo), AV42Barcodpar, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, Integer.valueOf(AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod), Integer.valueOf(AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to), Byte.valueOf(AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo), Byte.valueOf(AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to), lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar, AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel, AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros, AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to, AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos, AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to, Short.valueOf(AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs), Short.valueOf(AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_33_idx = 1 ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01O32_A396EmprCod[0] ;
            A129BarCod = H01O32_A129BarCod[0] ;
            A132BarCodReo = H01O32_A132BarCodReo[0] ;
            A130BarCodPar = H01O32_A130BarCodPar[0] ;
            A6036Ac_Pzs = H01O32_A6036Ac_Pzs[0] ;
            n6036Ac_Pzs = H01O32_n6036Ac_Pzs[0] ;
            A6035Ac_Kilos = H01O32_A6035Ac_Kilos[0] ;
            n6035Ac_Kilos = H01O32_n6035Ac_Kilos[0] ;
            A6034Ac_Metros = H01O32_A6034Ac_Metros[0] ;
            n6034Ac_Metros = H01O32_n6034Ac_Metros[0] ;
            A6033Ac_BarPar = H01O32_A6033Ac_BarPar[0] ;
            A6032Ac_BarReo = H01O32_A6032Ac_BarReo[0] ;
            A6031Ac_Barcod = H01O32_A6031Ac_Barcod[0] ;
            e171O32 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(33) ;
         wb1O30( ) ;
      }
      bGXsfl_33_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1O32( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV61Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV61Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV39Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV40Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV41Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV42Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42Barcodpar, ""))));
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
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV14FilterFullText ;
      AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV19TFAc_Barcod ;
      AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV20TFAc_Barcod_To ;
      AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV21TFAc_BarReo ;
      AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV22TFAc_BarReo_To ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV23TFAc_BarPar ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV24TFAc_BarPar_Sel ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV25TFAc_Metros ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV26TFAc_Metros_To ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV27TFAc_Kilos ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV28TFAc_Kilos_To ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV29TFAc_Pzs ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV30TFAc_Pzs_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ,
                                           Integer.valueOf(AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod) ,
                                           Integer.valueOf(AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to) ,
                                           Byte.valueOf(AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo) ,
                                           Byte.valueOf(AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to) ,
                                           AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ,
                                           AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ,
                                           AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ,
                                           AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ,
                                           AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ,
                                           AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ,
                                           Short.valueOf(AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs) ,
                                           Short.valueOf(AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to) ,
                                           Integer.valueOf(A6031Ac_Barcod) ,
                                           Byte.valueOf(A6032Ac_BarReo) ,
                                           A6033Ac_BarPar ,
                                           A6034Ac_Metros ,
                                           A6035Ac_Kilos ,
                                           Short.valueOf(A6036Ac_Pzs) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV39Emprcod ,
                                           Integer.valueOf(AV40Barcod) ,
                                           Byte.valueOf(AV41Barcodreo) ,
                                           AV42Barcodpar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.BOOLEAN,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext), "%", "") ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = GXutil.padr( GXutil.rtrim( AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar), 1, "%") ;
      /* Using cursor H01O33 */
      pr_default.execute(1, new Object[] {AV39Emprcod, Integer.valueOf(AV40Barcod), Byte.valueOf(AV41Barcodreo), AV42Barcodpar, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext, Integer.valueOf(AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod), Integer.valueOf(AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to), Byte.valueOf(AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo), Byte.valueOf(AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to), lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar, AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel, AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros, AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to, AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos, AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to, Short.valueOf(AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs), Short.valueOf(AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to)});
      GRID_nRecordCount = H01O33_AGRID_nRecordCount[0] ;
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
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV14FilterFullText ;
      AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV19TFAc_Barcod ;
      AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV20TFAc_Barcod_To ;
      AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV21TFAc_BarReo ;
      AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV22TFAc_BarReo_To ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV23TFAc_BarPar ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV24TFAc_BarPar_Sel ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV25TFAc_Metros ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV26TFAc_Metros_To ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV27TFAc_Kilos ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV28TFAc_Kilos_To ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV29TFAc_Pzs ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV30TFAc_Pzs_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV39Emprcod, AV40Barcod, AV41Barcodreo, AV42Barcodpar, AV18ManageFiltersExecutionStep, AV19TFAc_Barcod, AV20TFAc_Barcod_To, AV21TFAc_BarReo, AV22TFAc_BarReo_To, AV23TFAc_BarPar, AV24TFAc_BarPar_Sel, AV25TFAc_Metros, AV26TFAc_Metros_To, AV27TFAc_Kilos, AV28TFAc_Kilos_To, AV29TFAc_Pzs, AV30TFAc_Pzs_To, AV61Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV14FilterFullText ;
      AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV19TFAc_Barcod ;
      AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV20TFAc_Barcod_To ;
      AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV21TFAc_BarReo ;
      AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV22TFAc_BarReo_To ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV23TFAc_BarPar ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV24TFAc_BarPar_Sel ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV25TFAc_Metros ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV26TFAc_Metros_To ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV27TFAc_Kilos ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV28TFAc_Kilos_To ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV29TFAc_Pzs ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV30TFAc_Pzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV39Emprcod, AV40Barcod, AV41Barcodreo, AV42Barcodpar, AV18ManageFiltersExecutionStep, AV19TFAc_Barcod, AV20TFAc_Barcod_To, AV21TFAc_BarReo, AV22TFAc_BarReo_To, AV23TFAc_BarPar, AV24TFAc_BarPar_Sel, AV25TFAc_Metros, AV26TFAc_Metros_To, AV27TFAc_Kilos, AV28TFAc_Kilos_To, AV29TFAc_Pzs, AV30TFAc_Pzs_To, AV61Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV14FilterFullText ;
      AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV19TFAc_Barcod ;
      AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV20TFAc_Barcod_To ;
      AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV21TFAc_BarReo ;
      AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV22TFAc_BarReo_To ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV23TFAc_BarPar ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV24TFAc_BarPar_Sel ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV25TFAc_Metros ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV26TFAc_Metros_To ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV27TFAc_Kilos ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV28TFAc_Kilos_To ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV29TFAc_Pzs ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV30TFAc_Pzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV39Emprcod, AV40Barcod, AV41Barcodreo, AV42Barcodpar, AV18ManageFiltersExecutionStep, AV19TFAc_Barcod, AV20TFAc_Barcod_To, AV21TFAc_BarReo, AV22TFAc_BarReo_To, AV23TFAc_BarPar, AV24TFAc_BarPar_Sel, AV25TFAc_Metros, AV26TFAc_Metros_To, AV27TFAc_Kilos, AV28TFAc_Kilos_To, AV29TFAc_Pzs, AV30TFAc_Pzs_To, AV61Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV14FilterFullText ;
      AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV19TFAc_Barcod ;
      AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV20TFAc_Barcod_To ;
      AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV21TFAc_BarReo ;
      AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV22TFAc_BarReo_To ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV23TFAc_BarPar ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV24TFAc_BarPar_Sel ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV25TFAc_Metros ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV26TFAc_Metros_To ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV27TFAc_Kilos ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV28TFAc_Kilos_To ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV29TFAc_Pzs ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV30TFAc_Pzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV39Emprcod, AV40Barcod, AV41Barcodreo, AV42Barcodpar, AV18ManageFiltersExecutionStep, AV19TFAc_Barcod, AV20TFAc_Barcod_To, AV21TFAc_BarReo, AV22TFAc_BarReo_To, AV23TFAc_BarPar, AV24TFAc_BarPar_Sel, AV25TFAc_Metros, AV26TFAc_Metros_To, AV27TFAc_Kilos, AV28TFAc_Kilos_To, AV29TFAc_Pzs, AV30TFAc_Pzs_To, AV61Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV14FilterFullText ;
      AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV19TFAc_Barcod ;
      AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV20TFAc_Barcod_To ;
      AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV21TFAc_BarReo ;
      AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV22TFAc_BarReo_To ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV23TFAc_BarPar ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV24TFAc_BarPar_Sel ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV25TFAc_Metros ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV26TFAc_Metros_To ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV27TFAc_Kilos ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV28TFAc_Kilos_To ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV29TFAc_Pzs ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV30TFAc_Pzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14FilterFullText, AV39Emprcod, AV40Barcod, AV41Barcodreo, AV42Barcodpar, AV18ManageFiltersExecutionStep, AV19TFAc_Barcod, AV20TFAc_Barcod_To, AV21TFAc_BarReo, AV22TFAc_BarReo_To, AV23TFAc_BarPar, AV24TFAc_BarPar_Sel, AV25TFAc_Metros, AV26TFAc_Metros_To, AV27TFAc_Kilos, AV28TFAc_Kilos_To, AV29TFAc_Pzs, AV30TFAc_Pzs_To, AV61Pgmname, AV12OrderedBy, AV13OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV61Pgmname = "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WP" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1O30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151O32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV16ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV35DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV37GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV38GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV14FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV14FilterFullText) != 0 )
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
      e151O32 ();
      if (returnInSub) return;
   }

   public void e151O32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV45Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      consultaproduccion_agrupadasacabados_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      GXv_char2[0] = AV39Emprcod ;
      GXv_char3[0] = AV46Emprnom ;
      GXv_char4[0] = AV47Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      consultaproduccion_agrupadasacabados_wp_impl.this.AV39Emprcod = GXv_char2[0] ;
      consultaproduccion_agrupadasacabados_wp_impl.this.AV46Emprnom = GXv_char3[0] ;
      consultaproduccion_agrupadasacabados_wp_impl.this.AV47Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Emprcod", AV39Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Consulta de Hdrs Agrupadas para Acabados", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV35DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV35DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e161O32( )
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
      if ( AV18ManageFiltersExecutionStep == 1 )
      {
         AV18ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV18ManageFiltersExecutionStep == 2 )
      {
         AV18ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV37GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridCurrentPage), 10, 0));
      AV38GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridPageCount), 10, 0));
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = AV14FilterFullText ;
      AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod = AV19TFAc_Barcod ;
      AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to = AV20TFAc_Barcod_To ;
      AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo = AV21TFAc_BarReo ;
      AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to = AV22TFAc_BarReo_To ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = AV23TFAc_BarPar ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = AV24TFAc_BarPar_Sel ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = AV25TFAc_Metros ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = AV26TFAc_Metros_To ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = AV27TFAc_Kilos ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = AV28TFAc_Kilos_To ;
      AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs = AV29TFAc_Pzs ;
      AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to = AV30TFAc_Pzs_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV16ManageFiltersData", AV16ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121O32( )
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
         AV36PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV36PageToGo) ;
      }
   }

   public void e131O32( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141O32( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Ac_Barcod") == 0 )
         {
            AV19TFAc_Barcod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFAc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFAc_Barcod), 8, 0));
            AV20TFAc_Barcod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFAc_Barcod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFAc_Barcod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Ac_BarReo") == 0 )
         {
            AV21TFAc_BarReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFAc_BarReo", GXutil.str( AV21TFAc_BarReo, 1, 0));
            AV22TFAc_BarReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFAc_BarReo_To", GXutil.str( AV22TFAc_BarReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Ac_BarPar") == 0 )
         {
            AV23TFAc_BarPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFAc_BarPar", AV23TFAc_BarPar);
            AV24TFAc_BarPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFAc_BarPar_Sel", AV24TFAc_BarPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Ac_Metros") == 0 )
         {
            AV25TFAc_Metros = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFAc_Metros", GXutil.ltrimstr( AV25TFAc_Metros, 9, 2));
            AV26TFAc_Metros_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAc_Metros_To", GXutil.ltrimstr( AV26TFAc_Metros_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Ac_Kilos") == 0 )
         {
            AV27TFAc_Kilos = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAc_Kilos", GXutil.ltrimstr( AV27TFAc_Kilos, 9, 2));
            AV28TFAc_Kilos_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAc_Kilos_To", GXutil.ltrimstr( AV28TFAc_Kilos_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Ac_Pzs") == 0 )
         {
            AV29TFAc_Pzs = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAc_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAc_Pzs), 4, 0));
            AV30TFAc_Pzs_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAc_Pzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFAc_Pzs_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171O32( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(33) ;
      }
      sendrow_332( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_33_Refreshing )
      {
         httpContext.doAjaxLoad(33, GridRow);
      }
   }

   public void e111O32( )
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
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPFilters")),GXutil.URLEncode(GXutil.rtrim(AV61Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV18ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV18ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18ManageFiltersExecutionStep", GXutil.str( AV18ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV17ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         consultaproduccion_agrupadasacabados_wp_impl.this.GXt_char1 = GXv_char4[0] ;
         AV17ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV17ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV61Pgmname+"GridState", AV17ManageFiltersXml) ;
            AV10GridState.fromxml(AV17ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV16ManageFiltersData", AV16ManageFiltersData);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 = AV16ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9[0] ;
      AV16ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV14FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
      AV19TFAc_Barcod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19TFAc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFAc_Barcod), 8, 0));
      AV20TFAc_Barcod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20TFAc_Barcod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFAc_Barcod_To), 8, 0));
      AV21TFAc_BarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21TFAc_BarReo", GXutil.str( AV21TFAc_BarReo, 1, 0));
      AV22TFAc_BarReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22TFAc_BarReo_To", GXutil.str( AV22TFAc_BarReo_To, 1, 0));
      AV23TFAc_BarPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23TFAc_BarPar", AV23TFAc_BarPar);
      AV24TFAc_BarPar_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24TFAc_BarPar_Sel", AV24TFAc_BarPar_Sel);
      AV25TFAc_Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25TFAc_Metros", GXutil.ltrimstr( AV25TFAc_Metros, 9, 2));
      AV26TFAc_Metros_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFAc_Metros_To", GXutil.ltrimstr( AV26TFAc_Metros_To, 9, 2));
      AV27TFAc_Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TFAc_Kilos", GXutil.ltrimstr( AV27TFAc_Kilos, 9, 2));
      AV28TFAc_Kilos_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28TFAc_Kilos_To", GXutil.ltrimstr( AV28TFAc_Kilos_To, 9, 2));
      AV29TFAc_Pzs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TFAc_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAc_Pzs), 4, 0));
      AV30TFAc_Pzs_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30TFAc_Pzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFAc_Pzs_To), 4, 0));
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
      if ( GXutil.strcmp(AV15Session.getValue(AV61Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV61Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV61Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
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
      AV62GXV1 = 1 ;
      while ( AV62GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV62GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV14FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14FilterFullText", AV14FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARCOD") == 0 )
         {
            AV19TFAc_Barcod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFAc_Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFAc_Barcod), 8, 0));
            AV20TFAc_Barcod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFAc_Barcod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFAc_Barcod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARREO") == 0 )
         {
            AV21TFAc_BarReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFAc_BarReo", GXutil.str( AV21TFAc_BarReo, 1, 0));
            AV22TFAc_BarReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFAc_BarReo_To", GXutil.str( AV22TFAc_BarReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARPAR") == 0 )
         {
            AV23TFAc_BarPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFAc_BarPar", AV23TFAc_BarPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_BARPAR_SEL") == 0 )
         {
            AV24TFAc_BarPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFAc_BarPar_Sel", AV24TFAc_BarPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_METROS") == 0 )
         {
            AV25TFAc_Metros = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFAc_Metros", GXutil.ltrimstr( AV25TFAc_Metros, 9, 2));
            AV26TFAc_Metros_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAc_Metros_To", GXutil.ltrimstr( AV26TFAc_Metros_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_KILOS") == 0 )
         {
            AV27TFAc_Kilos = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAc_Kilos", GXutil.ltrimstr( AV27TFAc_Kilos, 9, 2));
            AV28TFAc_Kilos_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAc_Kilos_To", GXutil.ltrimstr( AV28TFAc_Kilos_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFAC_PZS") == 0 )
         {
            AV29TFAc_Pzs = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAc_Pzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAc_Pzs), 4, 0));
            AV30TFAc_Pzs_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAc_Pzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFAc_Pzs_To), 4, 0));
         }
         AV62GXV1 = (int)(AV62GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV24TFAc_BarPar_Sel)==0), AV24TFAc_BarPar_Sel, GXv_char4) ;
      consultaproduccion_agrupadasacabados_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFAc_BarPar)==0), AV23TFAc_BarPar, GXv_char4) ;
      consultaproduccion_agrupadasacabados_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV19TFAc_Barcod) ? "" : GXutil.str( AV19TFAc_Barcod, 8, 0))+"|"+((0==AV21TFAc_BarReo) ? "" : GXutil.str( AV21TFAc_BarReo, 1, 0))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFAc_Metros)==0) ? "" : GXutil.str( AV25TFAc_Metros, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFAc_Kilos)==0) ? "" : GXutil.str( AV27TFAc_Kilos, 9, 2))+"|"+((0==AV29TFAc_Pzs) ? "" : GXutil.str( AV29TFAc_Pzs, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV20TFAc_Barcod_To) ? "" : GXutil.str( AV20TFAc_Barcod_To, 8, 0))+"|"+((0==AV22TFAc_BarReo_To) ? "" : GXutil.str( AV22TFAc_BarReo_To, 1, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFAc_Metros_To)==0) ? "" : GXutil.str( AV26TFAc_Metros_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFAc_Kilos_To)==0) ? "" : GXutil.str( AV28TFAc_Kilos_To, 9, 2))+"|"+((0==AV30TFAc_Pzs_To) ? "" : GXutil.str( AV30TFAc_Pzs_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV15Session.getValue(AV61Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV14FilterFullText)==0), (short)(0), AV14FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFAC_BARCOD", "", !((0==AV19TFAc_Barcod)&&(0==AV20TFAc_Barcod_To)), (short)(0), GXutil.trim( GXutil.str( AV19TFAc_Barcod, 8, 0)), GXutil.trim( GXutil.str( AV20TFAc_Barcod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFAC_BARREO", "", !((0==AV21TFAc_BarReo)&&(0==AV22TFAc_BarReo_To)), (short)(0), GXutil.trim( GXutil.str( AV21TFAc_BarReo, 1, 0)), GXutil.trim( GXutil.str( AV22TFAc_BarReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFAC_BARPAR", "", !(GXutil.strcmp("", AV23TFAc_BarPar)==0), (short)(0), AV23TFAc_BarPar, "", !(GXutil.strcmp("", AV24TFAc_BarPar_Sel)==0), AV24TFAc_BarPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFAC_METROS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFAc_Metros)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFAc_Metros_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV25TFAc_Metros, 9, 2)), GXutil.trim( GXutil.str( AV26TFAc_Metros_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFAC_KILOS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFAc_Kilos)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFAc_Kilos_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV27TFAc_Kilos, 9, 2)), GXutil.trim( GXutil.str( AV28TFAc_Kilos_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      GXv_SdtWWPGridState10[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState10, "TFAC_PZS", "", !((0==AV29TFAc_Pzs)&&(0==AV30TFAc_Pzs_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFAc_Pzs, 4, 0)), GXutil.trim( GXutil.str( AV30TFAc_Pzs_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState10[0] ;
      if ( ! (GXutil.strcmp("", AV39Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV39Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV40Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV40Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV41Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV41Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV42Barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV42Barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV61Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV61Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.HDRACA_TRN" );
      AV15Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_15_1O32( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV16ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_20_1O32( true) ;
      }
      else
      {
         wb_table2_20_1O32( false) ;
      }
      return  ;
   }

   public void wb_table2_20_1O32e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_15_1O32e( true) ;
      }
      else
      {
         wb_table1_15_1O32e( false) ;
      }
   }

   public void wb_table2_20_1O32( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_33_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV14FilterFullText, GXutil.rtrim( localUtil.format( AV14FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_FormulacionTinte\\ConsultaProduccion_AgrupadasAcabados_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_20_1O32e( true) ;
      }
      else
      {
         wb_table2_20_1O32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV39Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Emprcod", AV39Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39Emprcod, "@!"))));
      AV40Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40Barcod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40Barcod), "ZZZZZZZ9")));
      AV41Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Barcodreo", GXutil.str( AV41Barcodreo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barcodreo), "9")));
      AV42Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42Barcodpar", AV42Barcodpar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42Barcodpar, ""))));
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
      pa1O32( ) ;
      ws1O32( ) ;
      we1O32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116134626", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/consultaproduccion_agrupadasacabados_wp.js", "?202682116134626", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_332( )
   {
      edtAc_Barcod_Internalname = "AC_BARCOD_"+sGXsfl_33_idx ;
      edtAc_BarReo_Internalname = "AC_BARREO_"+sGXsfl_33_idx ;
      edtAc_BarPar_Internalname = "AC_BARPAR_"+sGXsfl_33_idx ;
      edtAc_Metros_Internalname = "AC_METROS_"+sGXsfl_33_idx ;
      edtAc_Kilos_Internalname = "AC_KILOS_"+sGXsfl_33_idx ;
      edtAc_Pzs_Internalname = "AC_PZS_"+sGXsfl_33_idx ;
   }

   public void subsflControlProps_fel_332( )
   {
      edtAc_Barcod_Internalname = "AC_BARCOD_"+sGXsfl_33_fel_idx ;
      edtAc_BarReo_Internalname = "AC_BARREO_"+sGXsfl_33_fel_idx ;
      edtAc_BarPar_Internalname = "AC_BARPAR_"+sGXsfl_33_fel_idx ;
      edtAc_Metros_Internalname = "AC_METROS_"+sGXsfl_33_fel_idx ;
      edtAc_Kilos_Internalname = "AC_KILOS_"+sGXsfl_33_fel_idx ;
      edtAc_Pzs_Internalname = "AC_PZS_"+sGXsfl_33_fel_idx ;
   }

   public void sendrow_332( )
   {
      subsflControlProps_332( ) ;
      wb1O30( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_33_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_33_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_33_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Barcod_Internalname,GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6031Ac_Barcod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_BarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6032Ac_BarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_BarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_BarPar_Internalname,GXutil.rtrim( A6033Ac_BarPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_BarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Metros_Internalname,GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6034Ac_Metros, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Metros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Kilos_Internalname,GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6035Ac_Kilos, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Kilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAc_Pzs_Internalname,GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6036Ac_Pzs), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAc_Pzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1O32( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_33_idx = ((subGrid_Islastpage==1)&&(nGXsfl_33_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_332( ) ;
      }
      /* End function sendrow_332 */
   }

   public void startgridcontrol33( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"33\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6031Ac_Barcod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6032Ac_BarReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6033Ac_BarPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6034Ac_Metros, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6035Ac_Kilos, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6036Ac_Pzs, (byte)(4), (byte)(0), ".", "")));
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
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtAc_Barcod_Internalname = "AC_BARCOD" ;
      edtAc_BarReo_Internalname = "AC_BARREO" ;
      edtAc_BarPar_Internalname = "AC_BARPAR" ;
      edtAc_Metros_Internalname = "AC_METROS" ;
      edtAc_Kilos_Internalname = "AC_KILOS" ;
      edtAc_Pzs_Internalname = "AC_PZS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
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
      edtAc_Pzs_Jsonclick = "" ;
      edtAc_Kilos_Jsonclick = "" ;
      edtAc_Metros_Jsonclick = "" ;
      edtAc_BarPar_Jsonclick = "" ;
      edtAc_BarReo_Jsonclick = "" ;
      edtAc_Barcod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|||" ;
      Ddo_grid_Includedatalist = "||T|||" ;
      Ddo_grid_Filterisrange = "T|T||T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6" ;
      Ddo_grid_Columnids = "0:Ac_Barcod|1:Ac_BarReo|2:Ac_BarPar|3:Ac_Metros|4:Ac_Kilos|5:Ac_Pzs" ;
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
      Form.setCaption( httpContext.getMessage( "Consulta de Hdrs Agrupadas para Acabados", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV19TFAc_Barcod',fld:'vTFAC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20TFAc_Barcod_To',fld:'vTFAC_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV21TFAc_BarReo',fld:'vTFAC_BARREO',pic:'9'},{av:'AV22TFAc_BarReo_To',fld:'vTFAC_BARREO_TO',pic:'9'},{av:'AV23TFAc_BarPar',fld:'vTFAC_BARPAR',pic:''},{av:'AV24TFAc_BarPar_Sel',fld:'vTFAC_BARPAR_SEL',pic:''},{av:'AV25TFAc_Metros',fld:'vTFAC_METROS',pic:'ZZZZZ9.99'},{av:'AV26TFAc_Metros_To',fld:'vTFAC_METROS_TO',pic:'ZZZZZ9.99'},{av:'AV27TFAc_Kilos',fld:'vTFAC_KILOS',pic:'ZZZZZ9.99'},{av:'AV28TFAc_Kilos_To',fld:'vTFAC_KILOS_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAc_Pzs',fld:'vTFAC_PZS',pic:'ZZZ9'},{av:'AV30TFAc_Pzs_To',fld:'vTFAC_PZS_TO',pic:'ZZZ9'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV16ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121O32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19TFAc_Barcod',fld:'vTFAC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20TFAc_Barcod_To',fld:'vTFAC_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV21TFAc_BarReo',fld:'vTFAC_BARREO',pic:'9'},{av:'AV22TFAc_BarReo_To',fld:'vTFAC_BARREO_TO',pic:'9'},{av:'AV23TFAc_BarPar',fld:'vTFAC_BARPAR',pic:''},{av:'AV24TFAc_BarPar_Sel',fld:'vTFAC_BARPAR_SEL',pic:''},{av:'AV25TFAc_Metros',fld:'vTFAC_METROS',pic:'ZZZZZ9.99'},{av:'AV26TFAc_Metros_To',fld:'vTFAC_METROS_TO',pic:'ZZZZZ9.99'},{av:'AV27TFAc_Kilos',fld:'vTFAC_KILOS',pic:'ZZZZZ9.99'},{av:'AV28TFAc_Kilos_To',fld:'vTFAC_KILOS_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAc_Pzs',fld:'vTFAC_PZS',pic:'ZZZ9'},{av:'AV30TFAc_Pzs_To',fld:'vTFAC_PZS_TO',pic:'ZZZ9'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131O32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19TFAc_Barcod',fld:'vTFAC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20TFAc_Barcod_To',fld:'vTFAC_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV21TFAc_BarReo',fld:'vTFAC_BARREO',pic:'9'},{av:'AV22TFAc_BarReo_To',fld:'vTFAC_BARREO_TO',pic:'9'},{av:'AV23TFAc_BarPar',fld:'vTFAC_BARPAR',pic:''},{av:'AV24TFAc_BarPar_Sel',fld:'vTFAC_BARPAR_SEL',pic:''},{av:'AV25TFAc_Metros',fld:'vTFAC_METROS',pic:'ZZZZZ9.99'},{av:'AV26TFAc_Metros_To',fld:'vTFAC_METROS_TO',pic:'ZZZZZ9.99'},{av:'AV27TFAc_Kilos',fld:'vTFAC_KILOS',pic:'ZZZZZ9.99'},{av:'AV28TFAc_Kilos_To',fld:'vTFAC_KILOS_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAc_Pzs',fld:'vTFAC_PZS',pic:'ZZZ9'},{av:'AV30TFAc_Pzs_To',fld:'vTFAC_PZS_TO',pic:'ZZZ9'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141O32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19TFAc_Barcod',fld:'vTFAC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20TFAc_Barcod_To',fld:'vTFAC_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV21TFAc_BarReo',fld:'vTFAC_BARREO',pic:'9'},{av:'AV22TFAc_BarReo_To',fld:'vTFAC_BARREO_TO',pic:'9'},{av:'AV23TFAc_BarPar',fld:'vTFAC_BARPAR',pic:''},{av:'AV24TFAc_BarPar_Sel',fld:'vTFAC_BARPAR_SEL',pic:''},{av:'AV25TFAc_Metros',fld:'vTFAC_METROS',pic:'ZZZZZ9.99'},{av:'AV26TFAc_Metros_To',fld:'vTFAC_METROS_TO',pic:'ZZZZZ9.99'},{av:'AV27TFAc_Kilos',fld:'vTFAC_KILOS',pic:'ZZZZZ9.99'},{av:'AV28TFAc_Kilos_To',fld:'vTFAC_KILOS_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAc_Pzs',fld:'vTFAC_PZS',pic:'ZZZ9'},{av:'AV30TFAc_Pzs_To',fld:'vTFAC_PZS_TO',pic:'ZZZ9'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29TFAc_Pzs',fld:'vTFAC_PZS',pic:'ZZZ9'},{av:'AV30TFAc_Pzs_To',fld:'vTFAC_PZS_TO',pic:'ZZZ9'},{av:'AV27TFAc_Kilos',fld:'vTFAC_KILOS',pic:'ZZZZZ9.99'},{av:'AV28TFAc_Kilos_To',fld:'vTFAC_KILOS_TO',pic:'ZZZZZ9.99'},{av:'AV25TFAc_Metros',fld:'vTFAC_METROS',pic:'ZZZZZ9.99'},{av:'AV26TFAc_Metros_To',fld:'vTFAC_METROS_TO',pic:'ZZZZZ9.99'},{av:'AV23TFAc_BarPar',fld:'vTFAC_BARPAR',pic:''},{av:'AV24TFAc_BarPar_Sel',fld:'vTFAC_BARPAR_SEL',pic:''},{av:'AV21TFAc_BarReo',fld:'vTFAC_BARREO',pic:'9'},{av:'AV22TFAc_BarReo_To',fld:'vTFAC_BARREO_TO',pic:'9'},{av:'AV19TFAc_Barcod',fld:'vTFAC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20TFAc_Barcod_To',fld:'vTFAC_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171O32',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111O32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV39Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV41Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV42Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV19TFAc_Barcod',fld:'vTFAC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20TFAc_Barcod_To',fld:'vTFAC_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV21TFAc_BarReo',fld:'vTFAC_BARREO',pic:'9'},{av:'AV22TFAc_BarReo_To',fld:'vTFAC_BARREO_TO',pic:'9'},{av:'AV23TFAc_BarPar',fld:'vTFAC_BARPAR',pic:''},{av:'AV24TFAc_BarPar_Sel',fld:'vTFAC_BARPAR_SEL',pic:''},{av:'AV25TFAc_Metros',fld:'vTFAC_METROS',pic:'ZZZZZ9.99'},{av:'AV26TFAc_Metros_To',fld:'vTFAC_METROS_TO',pic:'ZZZZZ9.99'},{av:'AV27TFAc_Kilos',fld:'vTFAC_KILOS',pic:'ZZZZZ9.99'},{av:'AV28TFAc_Kilos_To',fld:'vTFAC_KILOS_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAc_Pzs',fld:'vTFAC_PZS',pic:'ZZZ9'},{av:'AV30TFAc_Pzs_To',fld:'vTFAC_PZS_TO',pic:'ZZZ9'},{av:'AV61Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV18ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV14FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV19TFAc_Barcod',fld:'vTFAC_BARCOD',pic:'ZZZZZZZ9'},{av:'AV20TFAc_Barcod_To',fld:'vTFAC_BARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV21TFAc_BarReo',fld:'vTFAC_BARREO',pic:'9'},{av:'AV22TFAc_BarReo_To',fld:'vTFAC_BARREO_TO',pic:'9'},{av:'AV23TFAc_BarPar',fld:'vTFAC_BARPAR',pic:''},{av:'AV24TFAc_BarPar_Sel',fld:'vTFAC_BARPAR_SEL',pic:''},{av:'AV25TFAc_Metros',fld:'vTFAC_METROS',pic:'ZZZZZ9.99'},{av:'AV26TFAc_Metros_To',fld:'vTFAC_METROS_TO',pic:'ZZZZZ9.99'},{av:'AV27TFAc_Kilos',fld:'vTFAC_KILOS',pic:'ZZZZZ9.99'},{av:'AV28TFAc_Kilos_To',fld:'vTFAC_KILOS_TO',pic:'ZZZZZ9.99'},{av:'AV29TFAc_Pzs',fld:'vTFAC_PZS',pic:'ZZZ9'},{av:'AV30TFAc_Pzs_To',fld:'vTFAC_PZS_TO',pic:'ZZZ9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV16ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ac_pzs',iparms:[]");
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
      wcpOAV39Emprcod = "" ;
      wcpOAV42Barcodpar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV39Emprcod = "" ;
      AV42Barcodpar = "" ;
      AV14FilterFullText = "" ;
      AV23TFAc_BarPar = "" ;
      AV24TFAc_BarPar_Sel = "" ;
      AV25TFAc_Metros = DecimalUtil.ZERO ;
      AV26TFAc_Metros_To = DecimalUtil.ZERO ;
      AV27TFAc_Kilos = DecimalUtil.ZERO ;
      AV28TFAc_Kilos_To = DecimalUtil.ZERO ;
      AV61Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV16ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV35DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A6033Ac_BarPar = "" ;
      A6034Ac_Metros = DecimalUtil.ZERO ;
      A6035Ac_Kilos = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = "" ;
      lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = "" ;
      AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext = "" ;
      AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel = "" ;
      AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar = "" ;
      AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros = DecimalUtil.ZERO ;
      AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to = DecimalUtil.ZERO ;
      AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos = DecimalUtil.ZERO ;
      AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      H01O32_A396EmprCod = new String[] {""} ;
      H01O32_A129BarCod = new int[1] ;
      H01O32_A132BarCodReo = new byte[1] ;
      H01O32_A130BarCodPar = new String[] {""} ;
      H01O32_A6036Ac_Pzs = new short[1] ;
      H01O32_n6036Ac_Pzs = new boolean[] {false} ;
      H01O32_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O32_n6035Ac_Kilos = new boolean[] {false} ;
      H01O32_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01O32_n6034Ac_Metros = new boolean[] {false} ;
      H01O32_A6033Ac_BarPar = new String[] {""} ;
      H01O32_A6032Ac_BarReo = new byte[1] ;
      H01O32_A6031Ac_Barcod = new int[1] ;
      H01O33_AGRID_nRecordCount = new long[1] ;
      AV45Station = "" ;
      GXv_char2 = new String[1] ;
      AV46Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV47Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV17ManageFiltersXml = "" ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9 = new GXBaseCollection[1] ;
      AV15Session = httpContext.getWebSession();
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState10 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      TempTags = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.consultaproduccion_agrupadasacabados_wp__default(),
         new Object[] {
             new Object[] {
            H01O32_A396EmprCod, H01O32_A129BarCod, H01O32_A132BarCodReo, H01O32_A130BarCodPar, H01O32_A6036Ac_Pzs, H01O32_n6036Ac_Pzs, H01O32_A6035Ac_Kilos, H01O32_n6035Ac_Kilos, H01O32_A6034Ac_Metros, H01O32_n6034Ac_Metros,
            H01O32_A6033Ac_BarPar, H01O32_A6032Ac_BarReo, H01O32_A6031Ac_Barcod
            }
            , new Object[] {
            H01O33_AGRID_nRecordCount
            }
         }
      );
      AV61Pgmname = "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WP" ;
      /* GeneXus formulas. */
      AV61Pgmname = "FormulacionTinte.ConsultaProduccion_AgrupadasAcabados_WP" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV41Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV41Barcodreo ;
   private byte AV18ManageFiltersExecutionStep ;
   private byte AV21TFAc_BarReo ;
   private byte AV22TFAc_BarReo_To ;
   private byte gxajaxcallmode ;
   private byte A6032Ac_BarReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo ;
   private byte AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to ;
   private byte A132BarCodReo ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV29TFAc_Pzs ;
   private short AV30TFAc_Pzs_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A6036Ac_Pzs ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs ;
   private short AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to ;
   private int wcpOAV40Barcod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_33 ;
   private int AV40Barcod ;
   private int nGXsfl_33_idx=1 ;
   private int AV19TFAc_Barcod ;
   private int AV20TFAc_Barcod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A6031Ac_Barcod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod ;
   private int AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to ;
   private int A129BarCod ;
   private int AV36PageToGo ;
   private int AV62GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV37GridCurrentPage ;
   private long AV38GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV25TFAc_Metros ;
   private java.math.BigDecimal AV26TFAc_Metros_To ;
   private java.math.BigDecimal AV27TFAc_Kilos ;
   private java.math.BigDecimal AV28TFAc_Kilos_To ;
   private java.math.BigDecimal A6034Ac_Metros ;
   private java.math.BigDecimal A6035Ac_Kilos ;
   private java.math.BigDecimal AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ;
   private java.math.BigDecimal AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ;
   private java.math.BigDecimal AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ;
   private java.math.BigDecimal AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ;
   private String wcpOAV39Emprcod ;
   private String wcpOAV42Barcodpar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV39Emprcod ;
   private String AV42Barcodpar ;
   private String sGXsfl_33_idx="0001" ;
   private String AV23TFAc_BarPar ;
   private String AV24TFAc_BarPar_Sel ;
   private String AV61Pgmname ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAc_Barcod_Internalname ;
   private String edtAc_BarReo_Internalname ;
   private String A6033Ac_BarPar ;
   private String edtAc_BarPar_Internalname ;
   private String edtAc_Metros_Internalname ;
   private String edtAc_Kilos_Internalname ;
   private String edtAc_Pzs_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ;
   private String AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ;
   private String AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV45Station ;
   private String GXv_char2[] ;
   private String AV46Emprnom ;
   private String GXv_char3[] ;
   private String AV47Usurcod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String TempTags ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_33_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtAc_Barcod_Jsonclick ;
   private String edtAc_BarReo_Jsonclick ;
   private String edtAc_BarPar_Jsonclick ;
   private String edtAc_Metros_Jsonclick ;
   private String edtAc_Kilos_Jsonclick ;
   private String edtAc_Pzs_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean n6034Ac_Metros ;
   private boolean n6035Ac_Kilos ;
   private boolean n6036Ac_Pzs ;
   private boolean bGXsfl_33_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV17ManageFiltersXml ;
   private String AV14FilterFullText ;
   private String lV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ;
   private String AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01O32_A396EmprCod ;
   private int[] H01O32_A129BarCod ;
   private byte[] H01O32_A132BarCodReo ;
   private String[] H01O32_A130BarCodPar ;
   private short[] H01O32_A6036Ac_Pzs ;
   private boolean[] H01O32_n6036Ac_Pzs ;
   private java.math.BigDecimal[] H01O32_A6035Ac_Kilos ;
   private boolean[] H01O32_n6035Ac_Kilos ;
   private java.math.BigDecimal[] H01O32_A6034Ac_Metros ;
   private boolean[] H01O32_n6034Ac_Metros ;
   private String[] H01O32_A6033Ac_BarPar ;
   private byte[] H01O32_A6032Ac_BarReo ;
   private int[] H01O32_A6031Ac_Barcod ;
   private long[] H01O33_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV16ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState10[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV35DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class consultaproduccion_agrupadasacabados_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01O32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ,
                                          int AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod ,
                                          int AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to ,
                                          byte AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo ,
                                          byte AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to ,
                                          String AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ,
                                          String AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ,
                                          java.math.BigDecimal AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ,
                                          java.math.BigDecimal AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ,
                                          java.math.BigDecimal AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ,
                                          java.math.BigDecimal AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ,
                                          short AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs ,
                                          short AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to ,
                                          int A6031Ac_Barcod ,
                                          byte A6032Ac_BarReo ,
                                          String A6033Ac_BarPar ,
                                          java.math.BigDecimal A6034Ac_Metros ,
                                          java.math.BigDecimal A6035Ac_Kilos ,
                                          short A6036Ac_Pzs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV39Emprcod ,
                                          int AV40Barcod ,
                                          byte AV41Barcodreo ,
                                          String AV42Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[27];
      Object[] GXv_Object12 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Pzs, Ac_Kilos, Ac_Metros, Ac_BarPar, Ac_BarReo, Ac_Barcod" ;
      sFromString = " FROM TXPHDRACA" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Ac_Barcod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_BarReo,'90'), 2) like '%' || ?) or ( UPPER(Ac_BarPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Ac_Metros,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_Kilos,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_Pzs,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
         GXv_int11[5] = (byte)(1) ;
         GXv_int11[6] = (byte)(1) ;
         GXv_int11[7] = (byte)(1) ;
         GXv_int11[8] = (byte)(1) ;
         GXv_int11[9] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod) )
      {
         addWhere(sWhereString, "(Ac_Barcod >= ?)");
      }
      else
      {
         GXv_int11[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to) )
      {
         addWhere(sWhereString, "(Ac_Barcod <= ?)");
      }
      else
      {
         GXv_int11[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo) )
      {
         addWhere(sWhereString, "(Ac_BarReo >= ?)");
      }
      else
      {
         GXv_int11[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to) )
      {
         addWhere(sWhereString, "(Ac_BarReo <= ?)");
      }
      else
      {
         GXv_int11[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Ac_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel)==0) )
      {
         addWhere(sWhereString, "(Ac_BarPar = ?)");
      }
      else
      {
         GXv_int11[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros)==0) )
      {
         addWhere(sWhereString, "(Ac_Metros >= ?)");
      }
      else
      {
         GXv_int11[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to)==0) )
      {
         addWhere(sWhereString, "(Ac_Metros <= ?)");
      }
      else
      {
         GXv_int11[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos)==0) )
      {
         addWhere(sWhereString, "(Ac_Kilos >= ?)");
      }
      else
      {
         GXv_int11[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to)==0) )
      {
         addWhere(sWhereString, "(Ac_Kilos <= ?)");
      }
      else
      {
         GXv_int11[19] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs) )
      {
         addWhere(sWhereString, "(Ac_Pzs >= ?)");
      }
      else
      {
         GXv_int11[20] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to) )
      {
         addWhere(sWhereString, "(Ac_Pzs <= ?)");
      }
      else
      {
         GXv_int11[21] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY Ac_Barcod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY Ac_Barcod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY Ac_BarReo" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY Ac_BarReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY Ac_BarPar" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY Ac_BarPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY Ac_Metros" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY Ac_Metros DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY Ac_Kilos" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY Ac_Kilos DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY Ac_Pzs" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY Ac_Pzs DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, Ac_Barcod, Ac_BarReo, Ac_BarPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   protected Object[] conditional_H01O33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext ,
                                          int AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod ,
                                          int AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to ,
                                          byte AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo ,
                                          byte AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to ,
                                          String AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel ,
                                          String AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar ,
                                          java.math.BigDecimal AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros ,
                                          java.math.BigDecimal AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to ,
                                          java.math.BigDecimal AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos ,
                                          java.math.BigDecimal AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to ,
                                          short AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs ,
                                          short AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to ,
                                          int A6031Ac_Barcod ,
                                          byte A6032Ac_BarReo ,
                                          String A6033Ac_BarPar ,
                                          java.math.BigDecimal A6034Ac_Metros ,
                                          java.math.BigDecimal A6035Ac_Kilos ,
                                          short A6036Ac_Pzs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV39Emprcod ,
                                          int AV40Barcod ,
                                          byte AV41Barcodreo ,
                                          String AV42Barcodpar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[22];
      Object[] GXv_Object14 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHDRACA" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      if ( ! (GXutil.strcmp("", AV48Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(Ac_Barcod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_BarReo,'90'), 2) like '%' || ?) or ( UPPER(Ac_BarPar) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(Ac_Metros,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_Kilos,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(Ac_Pzs,'9990'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int13[4] = (byte)(1) ;
         GXv_int13[5] = (byte)(1) ;
         GXv_int13[6] = (byte)(1) ;
         GXv_int13[7] = (byte)(1) ;
         GXv_int13[8] = (byte)(1) ;
         GXv_int13[9] = (byte)(1) ;
      }
      if ( ! (0==AV49Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_2_tfac_barcod) )
      {
         addWhere(sWhereString, "(Ac_Barcod >= ?)");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (0==AV50Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_3_tfac_barcod_to) )
      {
         addWhere(sWhereString, "(Ac_Barcod <= ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (0==AV51Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_4_tfac_barreo) )
      {
         addWhere(sWhereString, "(Ac_BarReo >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (0==AV52Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_5_tfac_barreo_to) )
      {
         addWhere(sWhereString, "(Ac_BarReo <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel)==0) && ( ! (GXutil.strcmp("", AV53Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_6_tfac_barpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(Ac_BarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_7_tfac_barpar_sel)==0) )
      {
         addWhere(sWhereString, "(Ac_BarPar = ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_8_tfac_metros)==0) )
      {
         addWhere(sWhereString, "(Ac_Metros >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_9_tfac_metros_to)==0) )
      {
         addWhere(sWhereString, "(Ac_Metros <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV57Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_10_tfac_kilos)==0) )
      {
         addWhere(sWhereString, "(Ac_Kilos >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV58Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_11_tfac_kilos_to)==0) )
      {
         addWhere(sWhereString, "(Ac_Kilos <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( ! (0==AV59Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_12_tfac_pzs) )
      {
         addWhere(sWhereString, "(Ac_Pzs >= ?)");
      }
      else
      {
         GXv_int13[20] = (byte)(1) ;
      }
      if ( ! (0==AV60Formulaciontinte_consultaproduccion_agrupadasacabados_wpds_13_tfac_pzs_to) )
      {
         addWhere(sWhereString, "(Ac_Pzs <= ?)");
      }
      else
      {
         GXv_int13[21] = (byte)(1) ;
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
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
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
                  return conditional_H01O32(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] );
            case 1 :
                  return conditional_H01O33(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).byteValue() , ((Number) dynConstraints[4]).byteValue() , (String)dynConstraints[5] , (String)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).byteValue() , (String)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).byteValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , (String)dynConstraints[28] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01O32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01O33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((int[]) buf[12])[0] = rslt.getInt(10);
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
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
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
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 1);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
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

