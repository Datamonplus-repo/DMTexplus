package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinteincidencias_wc_impl extends GXDataArea
{
   public cierrerecetastinteincidencias_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cierrerecetastinteincidencias_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinteincidencias_wc_impl.class ));
   }

   public cierrerecetastinteincidencias_wc_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            AV49EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV52barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52barcod), "ZZZZZZZ9")));
               AV53barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53barcodreo", GXutil.str( AV53barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53barcodreo), "9")));
               AV54barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54barcodpar", AV54barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54barcodpar, ""))));
               AV55reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55reclinmaq), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55reclinmaq), "ZZZ9")));
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
      nRC_GXsfl_26 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_26"))) ;
      nGXsfl_26_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_26_idx"))) ;
      sGXsfl_26_idx = httpContext.GetPar( "sGXsfl_26_idx") ;
      edtPrdExiCC_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_26_Refreshing);
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
      AV49EmprCod = httpContext.GetPar( "EmprCod") ;
      AV52barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV53barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV54barcodpar = httpContext.GetPar( "barcodpar") ;
      AV55reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "reclinmaq"))) ;
      AV26TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV27TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV63TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV64TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV32TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV33TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV65TFPrdFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdFacCon"), ".") ;
      AV66TFPrdFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdFacCon_To"), ".") ;
      AV67TFPrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant"), ".") ;
      AV68TFPrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant_To"), ".") ;
      AV69TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV70TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV71TFRecForNro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro"))) ;
      AV72TFRecForNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro_To"))) ;
      AV73TFRecPrdTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq"))) ;
      AV74TFRecPrdTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq_To"))) ;
      AV42TFRecLote = httpContext.GetPar( "TFRecLote") ;
      AV43TFRecLote_Sel = httpContext.GetPar( "TFRecLote_Sel") ;
      AV36TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV37TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV38TFPrdExiCC = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiCC"), ".") ;
      AV39TFPrdExiCC_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiCC_To"), ".") ;
      AV80Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtPrdExiCC_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_26_Refreshing);
      AV56consumos = (short)(GXutil.lval( httpContext.GetPar( "consumos"))) ;
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = httpContext.GetPar( "Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod") ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = (int)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod"))) ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo"))) ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = httpContext.GetPar( "Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar") ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = (short)(GXutil.lval( httpContext.GetPar( "Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV52barcod, AV53barcodreo, AV54barcodpar, AV55reclinmaq, AV26TFRecLin, AV27TFRecLin_To, AV63TFRecPrdNum, AV64TFRecPrdNum_Sel, AV32TFRecPrdDsc, AV33TFRecPrdDsc_Sel, AV65TFPrdFacCon, AV66TFPrdFacCon_To, AV67TFPrdCant, AV68TFPrdCant_To, AV69TFForPrdDsc, AV70TFForPrdDsc_Sel, AV71TFRecForNro, AV72TFRecForNro_To, AV73TFRecPrdTnq, AV74TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV36TFPrdExiAlm, AV37TFPrdExiAlm_To, AV38TFPrdExiCC, AV39TFPrdExiCC_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV56consumos, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) ;
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
      pa1X12( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1X12( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.cierrerecetastinteincidencias_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV55reclinmaq,4,0))}, new String[] {"EmprCod","barcod","barcodreo","barcodpar","reclinmaq"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55reclinmaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56consumos), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinteIncidencias_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\cierrerecetastinteincidencias_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_26", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_26, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV49EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV52barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV53barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV54barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV55reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55reclinmaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV26TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV27TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM", GXutil.rtrim( AV63TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM_SEL", GXutil.rtrim( AV64TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC", GXutil.rtrim( AV32TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC_SEL", GXutil.rtrim( AV33TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFACCON", GXutil.ltrim( localUtil.ntoc( AV65TFPrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV66TFPrdFacCon_To, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT", GXutil.ltrim( localUtil.ntoc( AV67TFPrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV68TFPrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV69TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV70TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFORNRO", GXutil.ltrim( localUtil.ntoc( AV71TFRecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFORNRO_TO", GXutil.ltrim( localUtil.ntoc( AV72TFRecForNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDTNQ", GXutil.ltrim( localUtil.ntoc( AV73TFRecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV74TFRecPrdTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE", GXutil.rtrim( AV42TFRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE_SEL", GXutil.rtrim( AV43TFRecLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV36TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV37TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXICC", GXutil.ltrim( localUtil.ntoc( AV38TFPrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDEXICC_TO", GXutil.ltrim( localUtil.ntoc( AV39TFPrdExiCC_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV56consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56consumos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANANY", GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_1_EMPRCOD", GXutil.rtrim( AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_2_BARCOD", GXutil.ltrim( localUtil.ntoc( AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_3_BARCODREO", GXutil.ltrim( localUtil.ntoc( AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_4_BARCODPAR", GXutil.rtrim( AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_5_RECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC_Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
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
         we1X12( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1X12( ) ;
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
      return formatLink("app.formulaciontinte.cierrerecetastinteincidencias_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV52barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV53barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV54barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV55reclinmaq,4,0))}, new String[] {"EmprCod","barcod","barcodreo","barcodpar","reclinmaq"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.CierreRecetasTinteIncidencias_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Detalle de productos en Receta", "") ;
   }

   public void wb1X10( )
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
         wb_table1_15_1X12( true) ;
      }
      else
      {
         wb_table1_15_1X12( false) ;
      }
      return  ;
   }

   public void wb_table1_15_1X12e( boolean wbgen )
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
         startgridcontrol26( ) ;
      }
      if ( wbEnd == 26 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_26 = (int)(nGXsfl_26_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV46GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV80Pgmname), GXutil.rtrim( localUtil.format( AV80Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CierreRecetasTinteIncidencias_WC.htm");
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
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 26 )
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

   public void start1X12( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Detalle de productos en Receta", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1X10( ) ;
   }

   public void ws1X12( )
   {
      start1X12( ) ;
      evt1X12( ) ;
   }

   public void evt1X12( )
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
                           e111X12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121X12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131X12 ();
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
                           nGXsfl_26_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_262( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
                           A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
                           AV77Marca = (byte)(localUtil.ctol( httpContext.cgiGet( edtavMarca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMarca_Internalname, GXutil.str( AV77Marca, 1, 0));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e141X12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e151X12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e161X12 ();
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

   public void we1X12( )
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

   public void pa1X12( )
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
      subsflControlProps_262( ) ;
      while ( nGXsfl_26_idx <= nRC_GXsfl_26 )
      {
         sendrow_262( ) ;
         nGXsfl_26_idx = ((subGrid_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_26_idx+1) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV49EmprCod ,
                                 int AV52barcod ,
                                 byte AV53barcodreo ,
                                 String AV54barcodpar ,
                                 short AV55reclinmaq ,
                                 short AV26TFRecLin ,
                                 short AV27TFRecLin_To ,
                                 String AV63TFRecPrdNum ,
                                 String AV64TFRecPrdNum_Sel ,
                                 String AV32TFRecPrdDsc ,
                                 String AV33TFRecPrdDsc_Sel ,
                                 java.math.BigDecimal AV65TFPrdFacCon ,
                                 java.math.BigDecimal AV66TFPrdFacCon_To ,
                                 java.math.BigDecimal AV67TFPrdCant ,
                                 java.math.BigDecimal AV68TFPrdCant_To ,
                                 String AV69TFForPrdDsc ,
                                 String AV70TFForPrdDsc_Sel ,
                                 byte AV71TFRecForNro ,
                                 byte AV72TFRecForNro_To ,
                                 byte AV73TFRecPrdTnq ,
                                 byte AV74TFRecPrdTnq_To ,
                                 String AV42TFRecLote ,
                                 String AV43TFRecLote_Sel ,
                                 java.math.BigDecimal AV36TFPrdExiAlm ,
                                 java.math.BigDecimal AV37TFPrdExiAlm_To ,
                                 java.math.BigDecimal AV38TFPrdExiCC ,
                                 java.math.BigDecimal AV39TFPrdExiCC_To ,
                                 String AV80Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 short AV56consumos ,
                                 String AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                 int AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ,
                                 byte AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ,
                                 String AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                 short AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e151X12 ();
      GRID_nCurrentRecord = 0 ;
      rf1X12( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinteIncidencias_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\cierrerecetastinteincidencias_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1X12( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV80Pgmname = "FormulacionTinte.CierreRecetasTinteIncidencias_WC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_26_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1X12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(26) ;
      /* Execute user event: Refresh */
      e151X12 ();
      nGXsfl_26_idx = 1 ;
      sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_262( ) ;
      bGXsfl_26_Refreshing = true ;
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
         subsflControlProps_262( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) ,
                                              Short.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) ,
                                              AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                              AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                              AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                              AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                              AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                              AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                              AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                              AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                              AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                              AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                              Byte.valueOf(AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) ,
                                              Byte.valueOf(AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) ,
                                              Byte.valueOf(AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) ,
                                              Byte.valueOf(AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) ,
                                              AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                              AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                              AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                              AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                              AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                              AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                              Short.valueOf(A811RecLin) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              A707PrdFacCon ,
                                              A686PrdCant ,
                                              A488ForPrdDsc ,
                                              Byte.valueOf(A2394RecForNro) ,
                                              Byte.valueOf(A3274RecPrdTnq) ,
                                              A5725RecLote ,
                                              A704PrdExiAlm ,
                                              A705PrdExiCC ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              AV49EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Integer.valueOf(AV52barcod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              Byte.valueOf(AV53barcodreo) ,
                                              A130BarCodPar ,
                                              AV54barcodpar ,
                                              Short.valueOf(A2804RecLinMaq) ,
                                              Short.valueOf(AV55reclinmaq) ,
                                              AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                              Integer.valueOf(AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod) ,
                                              Byte.valueOf(AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo) ,
                                              AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                              Short.valueOf(AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.SHORT
                                              }
         });
         lV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum), 6, "%") ;
         lV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc), 26, "%") ;
         lV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc), 5, "%") ;
         lV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote), 26, "%") ;
         /* Using cursor H01X12 */
         pr_default.execute(0, new Object[] {AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, Integer.valueOf(AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod), Byte.valueOf(AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo), AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, Short.valueOf(AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq), AV49EmprCod, Integer.valueOf(AV52barcod), Byte.valueOf(AV53barcodreo), AV54barcodpar, Short.valueOf(AV55reclinmaq), Short.valueOf(AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin), Short.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to), lV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum, AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel, lV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc, AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to, lV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc, AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel, Byte.valueOf(AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro), Byte.valueOf(AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to), Byte.valueOf(AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq), Byte.valueOf(AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to), lV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote, AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel, AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm, AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to, AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc, AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_26_idx = 1 ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_262( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A719PrdNum = H01X12_A719PrdNum[0] ;
            n719PrdNum = H01X12_n719PrdNum[0] ;
            A490ForPrdUMe = H01X12_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H01X12_n490ForPrdUMe[0] ;
            A1797PrdCanAny = H01X12_A1797PrdCanAny[0] ;
            A705PrdExiCC = H01X12_A705PrdExiCC[0] ;
            A704PrdExiAlm = H01X12_A704PrdExiAlm[0] ;
            A5725RecLote = H01X12_A5725RecLote[0] ;
            A3274RecPrdTnq = H01X12_A3274RecPrdTnq[0] ;
            A2394RecForNro = H01X12_A2394RecForNro[0] ;
            A488ForPrdDsc = H01X12_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01X12_n488ForPrdDsc[0] ;
            A686PrdCant = H01X12_A686PrdCant[0] ;
            A707PrdFacCon = H01X12_A707PrdFacCon[0] ;
            A875RecPrdDsc = H01X12_A875RecPrdDsc[0] ;
            A872RecPrdNum = H01X12_A872RecPrdNum[0] ;
            A811RecLin = H01X12_A811RecLin[0] ;
            A1273RecLinPro = H01X12_A1273RecLinPro[0] ;
            A2804RecLinMaq = H01X12_A2804RecLinMaq[0] ;
            A130BarCodPar = H01X12_A130BarCodPar[0] ;
            A132BarCodReo = H01X12_A132BarCodReo[0] ;
            A129BarCod = H01X12_A129BarCod[0] ;
            A396EmprCod = H01X12_A396EmprCod[0] ;
            A705PrdExiCC = H01X12_A705PrdExiCC[0] ;
            A704PrdExiAlm = H01X12_A704PrdExiAlm[0] ;
            A707PrdFacCon = H01X12_A707PrdFacCon[0] ;
            A488ForPrdDsc = H01X12_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01X12_n488ForPrdDsc[0] ;
            e161X12 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(26) ;
         wb1X10( ) ;
      }
      bGXsfl_26_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1X12( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV49EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV52barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV53barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV54barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV55reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55reclinmaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV56consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56consumos), "ZZZ9")));
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
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV49EmprCod ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV52barcod ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV53barcodreo ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV54barcodpar ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV55reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV26TFRecLin ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV27TFRecLin_To ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV63TFRecPrdNum ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV64TFRecPrdNum_Sel ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV32TFRecPrdDsc ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV33TFRecPrdDsc_Sel ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV65TFPrdFacCon ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV66TFPrdFacCon_To ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV67TFPrdCant ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV68TFPrdCant_To ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV69TFForPrdDsc ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV70TFForPrdDsc_Sel ;
      AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV71TFRecForNro ;
      AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV72TFRecForNro_To ;
      AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV73TFRecPrdTnq ;
      AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV74TFRecPrdTnq_To ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV42TFRecLote ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV43TFRecLote_Sel ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV36TFPrdExiAlm ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV38TFPrdExiCC ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV39TFPrdExiCC_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) ,
                                           Short.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) ,
                                           AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                           AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                           AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                           AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                           AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                           AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                           AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                           AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                           AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                           AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                           Byte.valueOf(AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) ,
                                           Byte.valueOf(AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) ,
                                           Byte.valueOf(AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) ,
                                           Byte.valueOf(AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) ,
                                           AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                           AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                           AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                           AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                           AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                           AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A707PrdFacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           A704PrdExiAlm ,
                                           A705PrdExiCC ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           AV49EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Integer.valueOf(AV52barcod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           Byte.valueOf(AV53barcodreo) ,
                                           A130BarCodPar ,
                                           AV54barcodpar ,
                                           Short.valueOf(A2804RecLinMaq) ,
                                           Short.valueOf(AV55reclinmaq) ,
                                           AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                           Integer.valueOf(AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod) ,
                                           Byte.valueOf(AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo) ,
                                           AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                           Short.valueOf(AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.SHORT
                                           }
      });
      lV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum), 6, "%") ;
      lV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc), 26, "%") ;
      lV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = GXutil.padr( GXutil.rtrim( AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc), 5, "%") ;
      lV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote), 26, "%") ;
      /* Using cursor H01X13 */
      pr_default.execute(1, new Object[] {AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, Integer.valueOf(AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod), Byte.valueOf(AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo), AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, Short.valueOf(AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq), AV49EmprCod, Integer.valueOf(AV52barcod), Byte.valueOf(AV53barcodreo), AV54barcodpar, Short.valueOf(AV55reclinmaq), Short.valueOf(AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin), Short.valueOf(AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to), lV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum, AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel, lV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc, AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to, lV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc, AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel, Byte.valueOf(AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro), Byte.valueOf(AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to), Byte.valueOf(AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq), Byte.valueOf(AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to), lV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote, AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel, AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm, AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to, AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc, AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to});
      GRID_nRecordCount = H01X13_AGRID_nRecordCount[0] ;
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
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV49EmprCod ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV52barcod ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV53barcodreo ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV54barcodpar ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV55reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV26TFRecLin ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV27TFRecLin_To ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV63TFRecPrdNum ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV64TFRecPrdNum_Sel ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV32TFRecPrdDsc ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV33TFRecPrdDsc_Sel ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV65TFPrdFacCon ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV66TFPrdFacCon_To ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV67TFPrdCant ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV68TFPrdCant_To ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV69TFForPrdDsc ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV70TFForPrdDsc_Sel ;
      AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV71TFRecForNro ;
      AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV72TFRecForNro_To ;
      AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV73TFRecPrdTnq ;
      AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV74TFRecPrdTnq_To ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV42TFRecLote ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV43TFRecLote_Sel ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV36TFPrdExiAlm ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV38TFPrdExiCC ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV39TFPrdExiCC_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV52barcod, AV53barcodreo, AV54barcodpar, AV55reclinmaq, AV26TFRecLin, AV27TFRecLin_To, AV63TFRecPrdNum, AV64TFRecPrdNum_Sel, AV32TFRecPrdDsc, AV33TFRecPrdDsc_Sel, AV65TFPrdFacCon, AV66TFPrdFacCon_To, AV67TFPrdCant, AV68TFPrdCant_To, AV69TFForPrdDsc, AV70TFForPrdDsc_Sel, AV71TFRecForNro, AV72TFRecForNro_To, AV73TFRecPrdTnq, AV74TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV36TFPrdExiAlm, AV37TFPrdExiAlm_To, AV38TFPrdExiCC, AV39TFPrdExiCC_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV56consumos, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV49EmprCod ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV52barcod ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV53barcodreo ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV54barcodpar ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV55reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV26TFRecLin ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV27TFRecLin_To ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV63TFRecPrdNum ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV64TFRecPrdNum_Sel ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV32TFRecPrdDsc ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV33TFRecPrdDsc_Sel ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV65TFPrdFacCon ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV66TFPrdFacCon_To ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV67TFPrdCant ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV68TFPrdCant_To ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV69TFForPrdDsc ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV70TFForPrdDsc_Sel ;
      AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV71TFRecForNro ;
      AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV72TFRecForNro_To ;
      AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV73TFRecPrdTnq ;
      AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV74TFRecPrdTnq_To ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV42TFRecLote ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV43TFRecLote_Sel ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV36TFPrdExiAlm ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV38TFPrdExiCC ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV39TFPrdExiCC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV52barcod, AV53barcodreo, AV54barcodpar, AV55reclinmaq, AV26TFRecLin, AV27TFRecLin_To, AV63TFRecPrdNum, AV64TFRecPrdNum_Sel, AV32TFRecPrdDsc, AV33TFRecPrdDsc_Sel, AV65TFPrdFacCon, AV66TFPrdFacCon_To, AV67TFPrdCant, AV68TFPrdCant_To, AV69TFForPrdDsc, AV70TFForPrdDsc_Sel, AV71TFRecForNro, AV72TFRecForNro_To, AV73TFRecPrdTnq, AV74TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV36TFPrdExiAlm, AV37TFPrdExiAlm_To, AV38TFPrdExiCC, AV39TFPrdExiCC_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV56consumos, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV49EmprCod ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV52barcod ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV53barcodreo ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV54barcodpar ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV55reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV26TFRecLin ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV27TFRecLin_To ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV63TFRecPrdNum ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV64TFRecPrdNum_Sel ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV32TFRecPrdDsc ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV33TFRecPrdDsc_Sel ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV65TFPrdFacCon ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV66TFPrdFacCon_To ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV67TFPrdCant ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV68TFPrdCant_To ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV69TFForPrdDsc ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV70TFForPrdDsc_Sel ;
      AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV71TFRecForNro ;
      AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV72TFRecForNro_To ;
      AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV73TFRecPrdTnq ;
      AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV74TFRecPrdTnq_To ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV42TFRecLote ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV43TFRecLote_Sel ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV36TFPrdExiAlm ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV38TFPrdExiCC ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV39TFPrdExiCC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV52barcod, AV53barcodreo, AV54barcodpar, AV55reclinmaq, AV26TFRecLin, AV27TFRecLin_To, AV63TFRecPrdNum, AV64TFRecPrdNum_Sel, AV32TFRecPrdDsc, AV33TFRecPrdDsc_Sel, AV65TFPrdFacCon, AV66TFPrdFacCon_To, AV67TFPrdCant, AV68TFPrdCant_To, AV69TFForPrdDsc, AV70TFForPrdDsc_Sel, AV71TFRecForNro, AV72TFRecForNro_To, AV73TFRecPrdTnq, AV74TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV36TFPrdExiAlm, AV37TFPrdExiAlm_To, AV38TFPrdExiCC, AV39TFPrdExiCC_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV56consumos, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV49EmprCod ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV52barcod ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV53barcodreo ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV54barcodpar ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV55reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV26TFRecLin ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV27TFRecLin_To ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV63TFRecPrdNum ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV64TFRecPrdNum_Sel ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV32TFRecPrdDsc ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV33TFRecPrdDsc_Sel ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV65TFPrdFacCon ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV66TFPrdFacCon_To ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV67TFPrdCant ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV68TFPrdCant_To ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV69TFForPrdDsc ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV70TFForPrdDsc_Sel ;
      AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV71TFRecForNro ;
      AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV72TFRecForNro_To ;
      AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV73TFRecPrdTnq ;
      AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV74TFRecPrdTnq_To ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV42TFRecLote ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV43TFRecLote_Sel ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV36TFPrdExiAlm ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV38TFPrdExiCC ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV39TFPrdExiCC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV52barcod, AV53barcodreo, AV54barcodpar, AV55reclinmaq, AV26TFRecLin, AV27TFRecLin_To, AV63TFRecPrdNum, AV64TFRecPrdNum_Sel, AV32TFRecPrdDsc, AV33TFRecPrdDsc_Sel, AV65TFPrdFacCon, AV66TFPrdFacCon_To, AV67TFPrdCant, AV68TFPrdCant_To, AV69TFForPrdDsc, AV70TFForPrdDsc_Sel, AV71TFRecForNro, AV72TFRecForNro_To, AV73TFRecPrdTnq, AV74TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV36TFPrdExiAlm, AV37TFPrdExiAlm_To, AV38TFPrdExiCC, AV39TFPrdExiCC_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV56consumos, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV49EmprCod ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV52barcod ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV53barcodreo ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV54barcodpar ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV55reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV26TFRecLin ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV27TFRecLin_To ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV63TFRecPrdNum ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV64TFRecPrdNum_Sel ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV32TFRecPrdDsc ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV33TFRecPrdDsc_Sel ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV65TFPrdFacCon ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV66TFPrdFacCon_To ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV67TFPrdCant ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV68TFPrdCant_To ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV69TFForPrdDsc ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV70TFForPrdDsc_Sel ;
      AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV71TFRecForNro ;
      AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV72TFRecForNro_To ;
      AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV73TFRecPrdTnq ;
      AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV74TFRecPrdTnq_To ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV42TFRecLote ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV43TFRecLote_Sel ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV36TFPrdExiAlm ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV38TFPrdExiCC ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV39TFPrdExiCC_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV52barcod, AV53barcodreo, AV54barcodpar, AV55reclinmaq, AV26TFRecLin, AV27TFRecLin_To, AV63TFRecPrdNum, AV64TFRecPrdNum_Sel, AV32TFRecPrdDsc, AV33TFRecPrdDsc_Sel, AV65TFPrdFacCon, AV66TFPrdFacCon_To, AV67TFPrdCant, AV68TFPrdCant_To, AV69TFForPrdDsc, AV70TFForPrdDsc_Sel, AV71TFRecForNro, AV72TFRecForNro_To, AV73TFRecPrdTnq, AV74TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV36TFPrdExiAlm, AV37TFPrdExiAlm_To, AV38TFPrdExiCC, AV39TFPrdExiCC_To, AV80Pgmname, AV12OrderedBy, AV13OrderedDsc, AV56consumos, AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod, AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod, AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo, AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar, AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV80Pgmname = "FormulacionTinte.CierreRecetasTinteIncidencias_WC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_26_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1X10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141X12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_26 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_26"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
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
         /* Read variables values. */
         AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinteIncidencias_WC");
         AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\cierrerecetastinteincidencias_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e141X12 ();
      if (returnInSub) return;
   }

   public void e141X12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV48Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV48Station = GXt_char1 ;
      GXv_char2[0] = AV49EmprCod ;
      GXv_char3[0] = AV50EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char2, GXv_char3, GXv_char4) ;
      cierrerecetastinteincidencias_wc_impl.this.AV49EmprCod = GXv_char2[0] ;
      cierrerecetastinteincidencias_wc_impl.this.AV50EmprNom = GXv_char3[0] ;
      cierrerecetastinteincidencias_wc_impl.this.AV51UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
      GXt_int5 = AV56consumos ;
      GXv_char4[0] = AV49EmprCod ;
      GXv_char3[0] = "011100" ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int6) ;
      cierrerecetastinteincidencias_wc_impl.this.AV49EmprCod = GXv_char4[0] ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
      AV56consumos = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56consumos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV56consumos), "ZZZ9")));
      GXt_int7 = (byte)(AV57todosproductos) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV49EmprCod, httpContext.getMessage( "ALLCP0", ""), GXv_int8) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV57todosproductos = GXt_int7 ;
      GXt_char1 = AV48Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV48Station = GXt_char1 ;
      GXv_char4[0] = AV49EmprCod ;
      GXv_char3[0] = AV50EmprNom ;
      GXv_char2[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV48Station, GXv_char4, GXv_char3, GXv_char2) ;
      cierrerecetastinteincidencias_wc_impl.this.AV49EmprCod = GXv_char4[0] ;
      cierrerecetastinteincidencias_wc_impl.this.AV50EmprNom = GXv_char3[0] ;
      cierrerecetastinteincidencias_wc_impl.this.AV51UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Detalle de productos en Receta", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e151X12( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      edtavMarca_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMarca_Internalname, "Columnheaderclass", edtavMarca_Columnheaderclass, !bGXsfl_26_Refreshing);
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = AV49EmprCod ;
      AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod = AV52barcod ;
      AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo = AV53barcodreo ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = AV54barcodpar ;
      AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq = AV55reclinmaq ;
      AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin = AV26TFRecLin ;
      AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to = AV27TFRecLin_To ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = AV63TFRecPrdNum ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = AV64TFRecPrdNum_Sel ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = AV32TFRecPrdDsc ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = AV33TFRecPrdDsc_Sel ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = AV65TFPrdFacCon ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = AV66TFPrdFacCon_To ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = AV67TFPrdCant ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = AV68TFPrdCant_To ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = AV69TFForPrdDsc ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = AV70TFForPrdDsc_Sel ;
      AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro = AV71TFRecForNro ;
      AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to = AV72TFRecForNro_To ;
      AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq = AV73TFRecPrdTnq ;
      AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to = AV74TFRecPrdTnq_To ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = AV42TFRecLote ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = AV43TFRecLote_Sel ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = AV36TFPrdExiAlm ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = AV37TFPrdExiAlm_To ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = AV38TFPrdExiCC ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = AV39TFPrdExiCC_To ;
      /*  Sending Event outputs  */
   }

   public void e111X12( )
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
         AV45PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV45PageToGo) ;
      }
   }

   public void e121X12( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131X12( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV26TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFRecLin), 4, 0));
            AV27TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV63TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFRecPrdNum", AV63TFRecPrdNum);
            AV64TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFRecPrdNum_Sel", AV64TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV32TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFRecPrdDsc", AV32TFRecPrdDsc);
            AV33TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFRecPrdDsc_Sel", AV33TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdFacCon") == 0 )
         {
            AV65TFPrdFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdFacCon", GXutil.ltrimstr( AV65TFPrdFacCon, 7, 4));
            AV66TFPrdFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdFacCon_To", GXutil.ltrimstr( AV66TFPrdFacCon_To, 7, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCant") == 0 )
         {
            AV67TFPrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdCant", GXutil.ltrimstr( AV67TFPrdCant, 11, 3));
            AV68TFPrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdCant_To", GXutil.ltrimstr( AV68TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV69TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFForPrdDsc", AV69TFForPrdDsc);
            AV70TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFForPrdDsc_Sel", AV70TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecForNro") == 0 )
         {
            AV71TFRecForNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFRecForNro), 2, 0));
            AV72TFRecForNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdTnq") == 0 )
         {
            AV73TFRecPrdTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFRecPrdTnq), 2, 0));
            AV74TFRecPrdTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFRecPrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLote") == 0 )
         {
            AV42TFRecLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFRecLote", AV42TFRecLote);
            AV43TFRecLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFRecLote_Sel", AV43TFRecLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV36TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrdExiAlm", GXutil.ltrimstr( AV36TFPrdExiAlm, 12, 4));
            AV37TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrdExiAlm_To", GXutil.ltrimstr( AV37TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiCC") == 0 )
         {
            AV38TFPrdExiCC = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdExiCC", GXutil.ltrimstr( AV38TFPrdExiCC, 12, 4));
            AV39TFPrdExiCC_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdExiCC_To", GXutil.ltrimstr( AV39TFPrdExiCC_To, 12, 4));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e161X12( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( AV56consumos == 1 )
      {
         AV77Marca = (byte)(((DecimalUtil.compareTo((((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)), A704PrdExiAlm)>0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMarca_Internalname, GXutil.str( AV77Marca, 1, 0));
      }
      else
      {
         AV77Marca = (byte)(((DecimalUtil.compareTo((((A686PrdCant.add(A1797PrdCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A707PrdFacCon)), A705PrdExiCC)>0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavMarca_Internalname, GXutil.str( AV77Marca, 1, 0));
      }
      edtavMarca_Columnclass = ((AV77Marca==1) ? "WWColumn WWColumnDanger WWColumnDangerSingleCell" : "WWColumn") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(26) ;
      }
      sendrow_262( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_26_Refreshing )
      {
         httpContext.doAjaxLoad(26, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV80Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV80Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV80Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV108GXV1 = 1 ;
      while ( AV108GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV108GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV26TFRecLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFRecLin), 4, 0));
            AV27TFRecLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV63TFRecPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFRecPrdNum", AV63TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV64TFRecPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFRecPrdNum_Sel", AV64TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV32TFRecPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFRecPrdDsc", AV32TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV33TFRecPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFRecPrdDsc_Sel", AV33TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDFACCON") == 0 )
         {
            AV65TFPrdFacCon = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFPrdFacCon", GXutil.ltrimstr( AV65TFPrdFacCon, 7, 4));
            AV66TFPrdFacCon_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFPrdFacCon_To", GXutil.ltrimstr( AV66TFPrdFacCon_To, 7, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV67TFPrdCant = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFPrdCant", GXutil.ltrimstr( AV67TFPrdCant, 11, 3));
            AV68TFPrdCant_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFPrdCant_To", GXutil.ltrimstr( AV68TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV69TFForPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFForPrdDsc", AV69TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV70TFForPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFForPrdDsc_Sel", AV70TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV71TFRecForNro = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TFRecForNro), 2, 0));
            AV72TFRecForNro_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV73TFRecPrdTnq = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73TFRecPrdTnq), 2, 0));
            AV74TFRecPrdTnq_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TFRecPrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE") == 0 )
         {
            AV42TFRecLote = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFRecLote", AV42TFRecLote);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLOTE_SEL") == 0 )
         {
            AV43TFRecLote_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFRecLote_Sel", AV43TFRecLote_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV36TFPrdExiAlm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrdExiAlm", GXutil.ltrimstr( AV36TFPrdExiAlm, 12, 4));
            AV37TFPrdExiAlm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrdExiAlm_To", GXutil.ltrimstr( AV37TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXICC") == 0 )
         {
            AV38TFPrdExiCC = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFPrdExiCC", GXutil.ltrimstr( AV38TFPrdExiCC, 12, 4));
            AV39TFPrdExiCC_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFPrdExiCC_To", GXutil.ltrimstr( AV39TFPrdExiCC_To, 12, 4));
         }
         AV108GXV1 = (int)(AV108GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFRecPrdNum_Sel)==0), AV64TFRecPrdNum_Sel, GXv_char4) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFRecPrdDsc_Sel)==0), AV33TFRecPrdDsc_Sel, GXv_char3) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFForPrdDsc_Sel)==0), AV70TFForPrdDsc_Sel, GXv_char2) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFRecLote_Sel)==0), AV43TFRecLote_Sel, GXv_char15) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|||"+GXt_char13+"|||"+GXt_char14+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFRecPrdNum)==0), AV63TFRecPrdNum, GXv_char15) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFRecPrdDsc)==0), AV32TFRecPrdDsc, GXv_char4) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFForPrdDsc)==0), AV69TFForPrdDsc, GXv_char3) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFRecLote)==0), AV42TFRecLote, GXv_char2) ;
      cierrerecetastinteincidencias_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFRecLin) ? "" : GXutil.str( AV26TFRecLin, 4, 0))+"|"+GXt_char14+"|"+GXt_char13+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdFacCon)==0) ? "" : GXutil.str( AV65TFPrdFacCon, 7, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdCant)==0) ? "" : GXutil.str( AV67TFPrdCant, 11, 3))+"|"+GXt_char12+"|"+((0==AV71TFRecForNro) ? "" : GXutil.str( AV71TFRecForNro, 2, 0))+"|"+((0==AV73TFRecPrdTnq) ? "" : GXutil.str( AV73TFRecPrdTnq, 2, 0))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFPrdExiAlm)==0) ? "" : GXutil.str( AV36TFPrdExiAlm, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdExiCC)==0) ? "" : GXutil.str( AV38TFPrdExiCC, 12, 4)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFRecLin_To) ? "" : GXutil.str( AV27TFRecLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdFacCon_To)==0) ? "" : GXutil.str( AV66TFPrdFacCon_To, 7, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFPrdCant_To)==0) ? "" : GXutil.str( AV68TFPrdCant_To, 11, 3))+"||"+((0==AV72TFRecForNro_To) ? "" : GXutil.str( AV72TFRecForNro_To, 2, 0))+"|"+((0==AV74TFRecPrdTnq_To) ? "" : GXutil.str( AV74TFRecPrdTnq_To, 2, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV37TFPrdExiAlm_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdExiCC_To)==0) ? "" : GXutil.str( AV39TFPrdExiCC_To, 12, 4)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
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
      AV10GridState.fromxml(AV22Session.getValue(AV80Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECLIN", "", !((0==AV26TFRecLin)&&(0==AV27TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV27TFRecLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV63TFRecPrdNum)==0), (short)(0), AV63TFRecPrdNum, "", !(GXutil.strcmp("", AV64TFRecPrdNum_Sel)==0), AV64TFRecPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV32TFRecPrdDsc)==0), (short)(0), AV32TFRecPrdDsc, "", !(GXutil.strcmp("", AV33TFRecPrdDsc_Sel)==0), AV33TFRecPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFPrdFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV65TFPrdFacCon, 7, 4)), GXutil.trim( GXutil.str( AV66TFPrdFacCon_To, 7, 4))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFPrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV67TFPrdCant, 11, 3)), GXutil.trim( GXutil.str( AV68TFPrdCant_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV69TFForPrdDsc)==0), (short)(0), AV69TFForPrdDsc, "", !(GXutil.strcmp("", AV70TFForPrdDsc_Sel)==0), AV70TFForPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECFORNRO", "", !((0==AV71TFRecForNro)&&(0==AV72TFRecForNro_To)), (short)(0), GXutil.trim( GXutil.str( AV71TFRecForNro, 2, 0)), GXutil.trim( GXutil.str( AV72TFRecForNro_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECPRDTNQ", "", !((0==AV73TFRecPrdTnq)&&(0==AV74TFRecPrdTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV73TFRecPrdTnq, 2, 0)), GXutil.trim( GXutil.str( AV74TFRecPrdTnq_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECLOTE", "", !(GXutil.strcmp("", AV42TFRecLote)==0), (short)(0), AV42TFRecLote, "", !(GXutil.strcmp("", AV43TFRecLote_Sel)==0), AV43TFRecLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV36TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV37TFPrdExiAlm_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDEXICC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFPrdExiCC)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFPrdExiCC_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFPrdExiCC, 12, 4)), GXutil.trim( GXutil.str( AV39TFPrdExiCC_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      if ( ! (GXutil.strcmp("", AV49EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV49EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV52barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV53barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV53barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV54barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV54barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV55reclinmaq) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECLINMAQ" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV55reclinmaq, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV80Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV80Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LRECET" );
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "emprcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV49EmprCod );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcod" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV52barcod, 8, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcodreo" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV53barcodreo, 1, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "barcodpar" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV54barcodpar );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV9TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "reclinmaq" );
      AV9TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( GXutil.str( AV55reclinmaq, 4, 0) );
      AV8TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV9TrnContextAtt, 0);
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV80Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV80Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV80Pgmname+"GridState"), null, null);
      }
      GXv_char15[0] = AV49EmprCod ;
      GXv_char4[0] = "011100" ;
      if ( ! ( ( new app.pbuscou(remoteHandle, context).executeUdp( GXv_char15, GXv_char4) != 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      cierrerecetastinteincidencias_wc_impl.this.AV49EmprCod = GXv_char15[0] ;
      if ( Cond_result )
      {
         edtPrdExiCC_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Visible), 5, 0), !bGXsfl_26_Refreshing);
         GXv_SdtWWPGridState16[0] = AV10GridState;
         if ( new app.wwpbaseobjects.wwp_deletefilter(remoteHandle, context).executeUdp( GXv_SdtWWPGridState16, "TFPRDEXICC", false) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         AV10GridState = GXv_SdtWWPGridState16[0] ;
         if ( Cond_result )
         {
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV80Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
         }
      }
   }

   public void wb_table1_15_1X12( boolean wbgen )
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
         wb_table1_15_1X12e( true) ;
      }
      else
      {
         wb_table1_15_1X12e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV49EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49EmprCod, "@!"))));
      AV52barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52barcod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52barcod), "ZZZZZZZ9")));
      AV53barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53barcodreo", GXutil.str( AV53barcodreo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV53barcodreo), "9")));
      AV54barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54barcodpar", AV54barcodpar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54barcodpar, ""))));
      AV55reclinmaq = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55reclinmaq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55reclinmaq), "ZZZ9")));
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
      pa1X12( ) ;
      ws1X12( ) ;
      we1X12( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116141864", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/cierrerecetastinteincidencias_wc.js", "?202682116141864", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_262( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_26_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_26_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_26_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_26_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_26_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_26_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_26_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_26_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_26_idx ;
      edtPrdFacCon_Internalname = "PRDFACCON_"+sGXsfl_26_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_26_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_26_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_26_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_26_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_26_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_26_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_26_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_26_idx ;
   }

   public void subsflControlProps_fel_262( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_26_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_26_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_26_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_26_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_26_fel_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_26_fel_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_26_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_26_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_26_fel_idx ;
      edtPrdFacCon_Internalname = "PRDFACCON_"+sGXsfl_26_fel_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_26_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_26_fel_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_26_fel_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_26_fel_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_26_fel_idx ;
      edtPrdExiAlm_Internalname = "PRDEXIALM_"+sGXsfl_26_fel_idx ;
      edtPrdExiCC_Internalname = "PRDEXICC_"+sGXsfl_26_fel_idx ;
      edtavMarca_Internalname = "vMARCA_"+sGXsfl_26_fel_idx ;
   }

   public void sendrow_262( )
   {
      subsflControlProps_262( ) ;
      wb1X10( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_26_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_26_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_26_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A707PrdFacCon, "Z9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiCC_Internalname,GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiCC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdExiCC_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,GXutil.ltrim( localUtil.ntoc( AV77Marca, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavMarca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV77Marca), "9") : localUtil.format( DecimalUtil.doubleToDec(AV77Marca), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavMarca_Columnclass,edtavMarca_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavMarca_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1X12( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_26_idx = ((subGrid_Islastpage==1)&&(nGXsfl_26_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_26_idx+1) ;
         sGXsfl_26_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_26_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_262( ) ;
      }
      /* End function sendrow_262 */
   }

   public void startgridcontrol26( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"26\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiCC_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuarto C.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiCC_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV77Marca, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavMarca_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavMarca_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMarca_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtRecForNro_Internalname = "RECFORNRO" ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtavMarca_Internalname = "vMARCA" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
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
      edtavMarca_Jsonclick = "" ;
      edtavMarca_Columnclass = "WWColumn" ;
      edtavMarca_Enabled = 0 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecForNro_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtPrdCant_Jsonclick = "" ;
      edtPrdFacCon_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavMarca_Columnheaderclass = "" ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;;;;Existencias;Existencias;" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.CierreRecetasTinteIncidencias_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|||Dynamic||" ;
      Ddo_grid_Includedatalist = "|T|T|||T|||T||" ;
      Ddo_grid_Filterisrange = "T|||T|T||T|T||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11" ;
      Ddo_grid_Columnids = "6:RecLin|7:RecPrdNum|8:RecPrdDsc|9:PrdFacCon|10:PrdCant|11:ForPrdDsc|12:RecForNro|13:RecPrdTnq|14:RecLote|15:PrdExiAlm|16:PrdExiCC" ;
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
      Form.setCaption( httpContext.getMessage( "Detalle de productos en Receta", "") );
      edtPrdExiCC_Visible = -1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV52barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV53barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV54barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV55reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV63TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV64TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV32TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV33TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV65TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV66TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV67TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV68TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV69TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV70TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV71TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV72TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV73TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV74TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV36TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtavMarca_Columnheaderclass',ctrl:'vMARCA',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111X12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV52barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV53barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV54barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV55reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV63TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV64TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV32TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV33TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV65TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV66TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV67TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV68TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV69TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV70TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV71TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV72TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV73TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV74TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV36TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'AV56consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121X12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV52barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV53barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV54barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV55reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV63TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV64TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV32TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV33TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV65TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV66TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV67TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV68TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV69TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV70TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV71TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV72TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV73TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV74TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV36TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'AV56consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131X12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV52barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV53barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV54barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV55reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV63TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV64TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV32TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV33TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV65TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV66TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV67TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV68TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV69TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV70TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV71TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV72TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV73TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV74TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV36TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtPrdExiCC_Visible',ctrl:'PRDEXICC',prop:'Visible'},{av:'AV56consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_1_EMPRCOD',pic:'@!'},{av:'AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_2_BARCOD',pic:'ZZZZZZZ9'},{av:'AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_3_BARCODREO',pic:'9'},{av:'AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_4_BARCODPAR',pic:''},{av:'AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq',fld:'vFORMULACIONTINTE_CIERRERECETASTINTEINCIDENCIAS_WCDS_5_RECLINMAQ',pic:'ZZZ9'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV38TFPrdExiCC',fld:'vTFPRDEXICC',pic:'ZZZZZZ9.9999'},{av:'AV39TFPrdExiCC_To',fld:'vTFPRDEXICC_TO',pic:'ZZZZZZ9.9999'},{av:'AV36TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV37TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV73TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV74TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV71TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV72TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV69TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV70TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV67TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV68TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV65TFPrdFacCon',fld:'vTFPRDFACCON',pic:'Z9.9999'},{av:'AV66TFPrdFacCon_To',fld:'vTFPRDFACCON_TO',pic:'Z9.9999'},{av:'AV32TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV33TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV63TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV64TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e161X12',iparms:[{av:'AV56consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A1797PrdCanAny',fld:'PRDCANANY',pic:'ZZZZZZ9.999'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV77Marca',fld:'vMARCA',pic:'9'},{av:'edtavMarca_Columnclass',ctrl:'vMARCA',prop:'Columnclass'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Marca',iparms:[]");
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
      wcpOAV49EmprCod = "" ;
      wcpOAV54barcodpar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV49EmprCod = "" ;
      AV54barcodpar = "" ;
      AV63TFRecPrdNum = "" ;
      AV64TFRecPrdNum_Sel = "" ;
      AV32TFRecPrdDsc = "" ;
      AV33TFRecPrdDsc_Sel = "" ;
      AV65TFPrdFacCon = DecimalUtil.ZERO ;
      AV66TFPrdFacCon_To = DecimalUtil.ZERO ;
      AV67TFPrdCant = DecimalUtil.ZERO ;
      AV68TFPrdCant_To = DecimalUtil.ZERO ;
      AV69TFForPrdDsc = "" ;
      AV70TFForPrdDsc_Sel = "" ;
      AV42TFRecLote = "" ;
      AV43TFRecLote_Sel = "" ;
      AV36TFPrdExiAlm = DecimalUtil.ZERO ;
      AV37TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV38TFPrdExiCC = DecimalUtil.ZERO ;
      AV39TFPrdExiCC_To = DecimalUtil.ZERO ;
      AV80Pgmname = "" ;
      AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod = "" ;
      AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A1797PrdCanAny = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
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
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = "" ;
      lV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = "" ;
      lV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = "" ;
      lV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = "" ;
      AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel = "" ;
      AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum = "" ;
      AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel = "" ;
      AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc = "" ;
      AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon = DecimalUtil.ZERO ;
      AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to = DecimalUtil.ZERO ;
      AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant = DecimalUtil.ZERO ;
      AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to = DecimalUtil.ZERO ;
      AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel = "" ;
      AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc = "" ;
      AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel = "" ;
      AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote = "" ;
      AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm = DecimalUtil.ZERO ;
      AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to = DecimalUtil.ZERO ;
      AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc = DecimalUtil.ZERO ;
      AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to = DecimalUtil.ZERO ;
      H01X12_A719PrdNum = new String[] {""} ;
      H01X12_n719PrdNum = new boolean[] {false} ;
      H01X12_A490ForPrdUMe = new byte[1] ;
      H01X12_n490ForPrdUMe = new boolean[] {false} ;
      H01X12_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X12_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X12_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X12_A5725RecLote = new String[] {""} ;
      H01X12_A3274RecPrdTnq = new byte[1] ;
      H01X12_A2394RecForNro = new byte[1] ;
      H01X12_A488ForPrdDsc = new String[] {""} ;
      H01X12_n488ForPrdDsc = new boolean[] {false} ;
      H01X12_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X12_A875RecPrdDsc = new String[] {""} ;
      H01X12_A872RecPrdNum = new String[] {""} ;
      H01X12_A811RecLin = new short[1] ;
      H01X12_A1273RecLinPro = new byte[1] ;
      H01X12_A2804RecLinMaq = new short[1] ;
      H01X12_A130BarCodPar = new String[] {""} ;
      H01X12_A132BarCodReo = new byte[1] ;
      H01X12_A129BarCod = new int[1] ;
      H01X12_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      H01X13_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV48Station = "" ;
      AV50EmprNom = "" ;
      AV51UsurCod = "" ;
      GXv_int6 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXt_char13 = "" ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV9TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_char15 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinteincidencias_wc__default(),
         new Object[] {
             new Object[] {
            H01X12_A719PrdNum, H01X12_n719PrdNum, H01X12_A490ForPrdUMe, H01X12_n490ForPrdUMe, H01X12_A1797PrdCanAny, H01X12_A705PrdExiCC, H01X12_A704PrdExiAlm, H01X12_A5725RecLote, H01X12_A3274RecPrdTnq, H01X12_A2394RecForNro,
            H01X12_A488ForPrdDsc, H01X12_n488ForPrdDsc, H01X12_A686PrdCant, H01X12_A707PrdFacCon, H01X12_A875RecPrdDsc, H01X12_A872RecPrdNum, H01X12_A811RecLin, H01X12_A1273RecLinPro, H01X12_A2804RecLinMaq, H01X12_A130BarCodPar,
            H01X12_A132BarCodReo, H01X12_A129BarCod, H01X12_A396EmprCod
            }
            , new Object[] {
            H01X13_AGRID_nRecordCount
            }
         }
      );
      AV80Pgmname = "FormulacionTinte.CierreRecetasTinteIncidencias_WC" ;
      /* GeneXus formulas. */
      AV80Pgmname = "FormulacionTinte.CierreRecetasTinteIncidencias_WC" ;
      Gx_err = (short)(0) ;
      edtavMarca_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV53barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV53barcodreo ;
   private byte AV71TFRecForNro ;
   private byte AV72TFRecForNro_To ;
   private byte AV73TFRecPrdTnq ;
   private byte AV74TFRecPrdTnq_To ;
   private byte AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte AV77Marca ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ;
   private byte AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ;
   private byte AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ;
   private byte AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ;
   private byte A490ForPrdUMe ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV55reclinmaq ;
   private short AV55reclinmaq ;
   private short AV26TFRecLin ;
   private short AV27TFRecLin_To ;
   private short AV12OrderedBy ;
   private short AV56consumos ;
   private short AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq ;
   private short wbEnd ;
   private short wbStart ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ;
   private short AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ;
   private short AV57todosproductos ;
   private int wcpOAV52barcod ;
   private int edtPrdExiCC_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_26 ;
   private int AV52barcod ;
   private int nGXsfl_26_idx=1 ;
   private int AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavMarca_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int5 ;
   private int GXv_int6[] ;
   private int AV45PageToGo ;
   private int AV108GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV65TFPrdFacCon ;
   private java.math.BigDecimal AV66TFPrdFacCon_To ;
   private java.math.BigDecimal AV67TFPrdCant ;
   private java.math.BigDecimal AV68TFPrdCant_To ;
   private java.math.BigDecimal AV36TFPrdExiAlm ;
   private java.math.BigDecimal AV37TFPrdExiAlm_To ;
   private java.math.BigDecimal AV38TFPrdExiCC ;
   private java.math.BigDecimal AV39TFPrdExiCC_To ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ;
   private java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ;
   private java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ;
   private java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ;
   private java.math.BigDecimal AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ;
   private java.math.BigDecimal AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ;
   private java.math.BigDecimal AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ;
   private java.math.BigDecimal AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ;
   private String wcpOAV49EmprCod ;
   private String wcpOAV54barcodpar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV49EmprCod ;
   private String AV54barcodpar ;
   private String sGXsfl_26_idx="0001" ;
   private String edtPrdExiCC_Internalname ;
   private String AV63TFRecPrdNum ;
   private String AV64TFRecPrdNum_Sel ;
   private String AV32TFRecPrdDsc ;
   private String AV33TFRecPrdDsc_Sel ;
   private String AV69TFForPrdDsc ;
   private String AV70TFForPrdDsc_Sel ;
   private String AV42TFRecLote ;
   private String AV43TFRecLote_Sel ;
   private String AV80Pgmname ;
   private String AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ;
   private String AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ;
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
   private String Ddo_grid_Datalistproc ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
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
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String edtRecLin_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdCant_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtRecForNro_Internalname ;
   private String edtRecPrdTnq_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtavMarca_Internalname ;
   private String scmdbuf ;
   private String lV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ;
   private String lV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ;
   private String lV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ;
   private String lV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ;
   private String AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ;
   private String AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ;
   private String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ;
   private String AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ;
   private String AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ;
   private String AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ;
   private String AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ;
   private String AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ;
   private String A719PrdNum ;
   private String hsh ;
   private String AV48Station ;
   private String AV50EmprNom ;
   private String AV51UsurCod ;
   private String edtavMarca_Columnheaderclass ;
   private String edtavMarca_Columnclass ;
   private String GXt_char14 ;
   private String GXt_char13 ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char15[] ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_26_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_26_Refreshing=false ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
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
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01X12_A719PrdNum ;
   private boolean[] H01X12_n719PrdNum ;
   private byte[] H01X12_A490ForPrdUMe ;
   private boolean[] H01X12_n490ForPrdUMe ;
   private java.math.BigDecimal[] H01X12_A1797PrdCanAny ;
   private java.math.BigDecimal[] H01X12_A705PrdExiCC ;
   private java.math.BigDecimal[] H01X12_A704PrdExiAlm ;
   private String[] H01X12_A5725RecLote ;
   private byte[] H01X12_A3274RecPrdTnq ;
   private byte[] H01X12_A2394RecForNro ;
   private String[] H01X12_A488ForPrdDsc ;
   private boolean[] H01X12_n488ForPrdDsc ;
   private java.math.BigDecimal[] H01X12_A686PrdCant ;
   private java.math.BigDecimal[] H01X12_A707PrdFacCon ;
   private String[] H01X12_A875RecPrdDsc ;
   private String[] H01X12_A872RecPrdNum ;
   private short[] H01X12_A811RecLin ;
   private byte[] H01X12_A1273RecLinPro ;
   private short[] H01X12_A2804RecLinMaq ;
   private String[] H01X12_A130BarCodPar ;
   private byte[] H01X12_A132BarCodReo ;
   private int[] H01X12_A129BarCod ;
   private String[] H01X12_A396EmprCod ;
   private long[] H01X13_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV9TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class cierrerecetastinteincidencias_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01X12( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ,
                                          short AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ,
                                          String AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                          String AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                          String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                          String AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                          java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                          String AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                          String AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                          byte AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ,
                                          byte AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ,
                                          byte AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ,
                                          byte AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ,
                                          String AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                          String AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                          java.math.BigDecimal AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                          java.math.BigDecimal AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                          java.math.BigDecimal AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                          java.math.BigDecimal AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV52barcod ,
                                          byte A132BarCodReo ,
                                          byte AV53barcodreo ,
                                          String A130BarCodPar ,
                                          String AV54barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV55reclinmaq ,
                                          String AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                          int AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ,
                                          byte AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ,
                                          String AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                          short AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[37];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.PrdNum, T1.ForPrdUMe, T1.PrdCanAny, T2.PrdExiCC, T2.PrdExiAlm, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T3.ForPrdDsc, T1.PrdCant, T2.PrdFacCon, T1.RecPrdDsc," ;
      sSelectString += " T1.RecPrdNum, T1.RecLin, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      sFromString += " = T1.ForPrdUMe)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int17[21] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int17[22] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int17[23] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int17[24] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int17[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int17[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int17[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int17[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int17[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int17[31] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdNum" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdFacCon" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdFacCon DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.PrdCant" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.PrdCant DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T3.ForPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecForNro" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecForNro DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecPrdTnq" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecPrdTnq DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLote" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T1.RecLote DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiAlm" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T2.PrdExiCC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.EmprCod DESC, T1.BarCod DESC, T1.BarCodReo DESC, T1.BarCodPar DESC, T1.RecLinMaq DESC, T2.PrdExiCC DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01X13( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin ,
                                          short AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to ,
                                          String AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel ,
                                          String AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum ,
                                          String AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel ,
                                          String AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc ,
                                          java.math.BigDecimal AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon ,
                                          java.math.BigDecimal AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to ,
                                          java.math.BigDecimal AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant ,
                                          java.math.BigDecimal AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to ,
                                          String AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel ,
                                          String AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc ,
                                          byte AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro ,
                                          byte AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to ,
                                          byte AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq ,
                                          byte AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to ,
                                          String AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel ,
                                          String AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote ,
                                          java.math.BigDecimal AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm ,
                                          java.math.BigDecimal AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to ,
                                          java.math.BigDecimal AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc ,
                                          java.math.BigDecimal AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A707PrdFacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A705PrdExiCC ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          String AV49EmprCod ,
                                          int A129BarCod ,
                                          int AV52barcod ,
                                          byte A132BarCodReo ,
                                          byte AV53barcodreo ,
                                          String A130BarCodPar ,
                                          String AV54barcodpar ,
                                          short A2804RecLinMaq ,
                                          short AV55reclinmaq ,
                                          String AV81Formulaciontinte_cierrerecetastinteincidencias_wcds_1_emprcod ,
                                          int AV82Formulaciontinte_cierrerecetastinteincidencias_wcds_2_barcod ,
                                          byte AV83Formulaciontinte_cierrerecetastinteincidencias_wcds_3_barcodreo ,
                                          String AV84Formulaciontinte_cierrerecetastinteincidencias_wcds_4_barcodpar ,
                                          short AV85Formulaciontinte_cierrerecetastinteincidencias_wcds_5_reclinmaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[32];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ForPrdUMe = T1.ForPrdUMe)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarCod = ?)");
      addWhere(sWhereString, "(T1.BarCodReo = ?)");
      addWhere(sWhereString, "(T1.BarCodPar = ?)");
      addWhere(sWhereString, "(T1.RecLinMaq = ?)");
      if ( ! (0==AV86Formulaciontinte_cierrerecetastinteincidencias_wcds_6_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (0==AV87Formulaciontinte_cierrerecetastinteincidencias_wcds_7_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV88Formulaciontinte_cierrerecetastinteincidencias_wcds_8_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Formulaciontinte_cierrerecetastinteincidencias_wcds_9_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV90Formulaciontinte_cierrerecetastinteincidencias_wcds_10_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Formulaciontinte_cierrerecetastinteincidencias_wcds_11_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Formulaciontinte_cierrerecetastinteincidencias_wcds_12_tfprdfaccon)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Formulaciontinte_cierrerecetastinteincidencias_wcds_13_tfprdfaccon_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdFacCon <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Formulaciontinte_cierrerecetastinteincidencias_wcds_14_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Formulaciontinte_cierrerecetastinteincidencias_wcds_15_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV96Formulaciontinte_cierrerecetastinteincidencias_wcds_16_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Formulaciontinte_cierrerecetastinteincidencias_wcds_17_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV98Formulaciontinte_cierrerecetastinteincidencias_wcds_18_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV99Formulaciontinte_cierrerecetastinteincidencias_wcds_19_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV100Formulaciontinte_cierrerecetastinteincidencias_wcds_20_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_cierrerecetastinteincidencias_wcds_21_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_cierrerecetastinteincidencias_wcds_22_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_cierrerecetastinteincidencias_wcds_23_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV104Formulaciontinte_cierrerecetastinteincidencias_wcds_24_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Formulaciontinte_cierrerecetastinteincidencias_wcds_25_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int19[29] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Formulaciontinte_cierrerecetastinteincidencias_wcds_26_tfprdexicc)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC >= ?)");
      }
      else
      {
         GXv_int19[30] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Formulaciontinte_cierrerecetastinteincidencias_wcds_27_tfprdexicc_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiCC <= ?)");
      }
      else
      {
         GXv_int19[31] = (byte)(1) ;
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
                  return conditional_H01X12(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).shortValue() );
            case 1 :
                  return conditional_H01X13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , ((Number) dynConstraints[33]).shortValue() , ((Boolean) dynConstraints[34]).booleanValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).intValue() , ((Number) dynConstraints[39]).byteValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , (String)dynConstraints[42] , ((Number) dynConstraints[43]).shortValue() , ((Number) dynConstraints[44]).shortValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).byteValue() , (String)dynConstraints[48] , ((Number) dynConstraints[49]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01X12", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,3);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[14])[0] = rslt.getString(12, 26);
               ((String[]) buf[15])[0] = rslt.getString(13, 6);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((byte[]) buf[17])[0] = rslt.getByte(15);
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((String[]) buf[19])[0] = rslt.getString(17, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((int[]) buf[21])[0] = rslt.getInt(19);
               ((String[]) buf[22])[0] = rslt.getString(20, 3);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[47]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[61]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[62]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[67], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[68], 4);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 1 :
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[43]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 6);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 4);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 5);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[56]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 26);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 4);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 4);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 4);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 4);
               }
               return;
      }
   }

}

