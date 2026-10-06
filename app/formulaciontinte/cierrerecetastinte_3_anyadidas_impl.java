package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class cierrerecetastinte_3_anyadidas_impl extends GXDataArea
{
   public cierrerecetastinte_3_anyadidas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public cierrerecetastinte_3_anyadidas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( cierrerecetastinte_3_anyadidas_impl.class ));
   }

   public cierrerecetastinte_3_anyadidas_impl( int remoteHandle ,
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
            AV57EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV58BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58BarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58BarCod), "ZZZZZZZ9")));
               AV59BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59BarCodReo", GXutil.str( AV59BarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo), "9")));
               AV60BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60BarCodPar", AV60BarCodPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarCodPar, ""))));
               AV61RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV61RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61RecLinMaq), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61RecLinMaq), "ZZZ9")));
               AV75FecCieTin = localUtil.parseDateParm( httpContext.GetPar( "FecCieTin")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75FecCieTin", localUtil.format(AV75FecCieTin, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECCIETIN", getSecureSignedToken( "", AV75FecCieTin));
               AV74consumos = (short)(GXutil.lval( httpContext.GetPar( "consumos"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV74consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74consumos), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74consumos), "ZZZ9")));
               AV62Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62Maqcod", AV62Maqcod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Maqcod, ""))));
               AV63Cc_almcod = (byte)(GXutil.lval( httpContext.GetPar( "Cc_almcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63Cc_almcod), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCC_ALMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Cc_almcod), "Z9")));
               AV77fechaCierre = localUtil.parseDateParm( httpContext.GetPar( "fechaCierre")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV77fechaCierre", localUtil.format(AV77fechaCierre, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHACIERRE", getSecureSignedToken( "", AV77fechaCierre));
               AV76flagM = (short)(GXutil.lval( httpContext.GetPar( "flagM"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV76flagM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76flagM), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76flagM), "ZZZ9")));
               AV64recfec = localUtil.parseDateParm( httpContext.GetPar( "recfec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64recfec", localUtil.format(AV64recfec, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV64recfec));
               AV65rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "rectotkgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65rectotkgm", GXutil.ltrimstr( AV65rectotkgm, 10, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECTOTKGM", getSecureSignedToken( "", localUtil.format( AV65rectotkgm, "ZZZZZZ9.99")));
               AV66recvolprd = (int)(GXutil.lval( httpContext.GetPar( "recvolprd"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66recvolprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66recvolprd), 5, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66recvolprd), "ZZZZ9")));
               AV67barnhdr = httpContext.GetPar( "barnhdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67barnhdr", AV67barnhdr);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67barnhdr, ""))));
               AV81HayAnyadidas = httpContext.GetPar( "HayAnyadidas") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81HayAnyadidas", AV81HayAnyadidas);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYANYADIDAS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81HayAnyadidas, ""))));
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
      nRC_GXsfl_42 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_42"))) ;
      nGXsfl_42_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_42_idx"))) ;
      sGXsfl_42_idx = httpContext.GetPar( "sGXsfl_42_idx") ;
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
      AV57EmprCod = httpContext.GetPar( "EmprCod") ;
      AV58BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV59BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV60BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV61RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      AV96Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV36TFRecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro"))) ;
      AV37TFRecLinPro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro_To"))) ;
      AV45TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV46TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV47TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV48TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV49TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV50TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV51TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV52TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV53TFPrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant"), ".") ;
      AV54TFPrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant_To"), ".") ;
      AV55TFPrdCanFin = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanFin"), ".") ;
      AV56TFPrdCanFin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanFin_To"), ".") ;
      AV69FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
      AV73UsurCod = httpContext.GetPar( "UsurCod") ;
      AV71Station = httpContext.GetPar( "Station") ;
      AV65rectotkgm = CommonUtil.decimalVal( httpContext.GetPar( "rectotkgm"), ".") ;
      AV66recvolprd = (int)(GXutil.lval( httpContext.GetPar( "recvolprd"))) ;
      AV67barnhdr = httpContext.GetPar( "barnhdr") ;
      AV81HayAnyadidas = httpContext.GetPar( "HayAnyadidas") ;
      AV64recfec = localUtil.parseDateParm( httpContext.GetPar( "recfec")) ;
      AV76flagM = (short)(GXutil.lval( httpContext.GetPar( "flagM"))) ;
      AV77fechaCierre = localUtil.parseDateParm( httpContext.GetPar( "fechaCierre")) ;
      AV63Cc_almcod = (byte)(GXutil.lval( httpContext.GetPar( "Cc_almcod"))) ;
      AV62Maqcod = httpContext.GetPar( "Maqcod") ;
      AV74consumos = (short)(GXutil.lval( httpContext.GetPar( "consumos"))) ;
      AV75FecCieTin = localUtil.parseDateParm( httpContext.GetPar( "FecCieTin")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar, AV61RecLinMaq, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV36TFRecLinPro, AV37TFRecLinPro_To, AV45TFRecLin, AV46TFRecLin_To, AV47TFRecPrdNum, AV48TFRecPrdNum_Sel, AV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, AV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To, AV69FecPan, AV73UsurCod, AV71Station, AV65rectotkgm, AV66recvolprd, AV67barnhdr, AV81HayAnyadidas, AV64recfec, AV76flagM, AV77fechaCierre, AV63Cc_almcod, AV62Maqcod, AV74consumos, AV75FecCieTin) ;
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
      pa1RS2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1RS2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.cierrerecetastinte_3_anyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV57EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV58BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV60BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV61RecLinMaq,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV75FecCieTin)),GXutil.URLEncode(GXutil.ltrimstr(AV74consumos,4,0)),GXutil.URLEncode(GXutil.rtrim(AV62Maqcod)),GXutil.URLEncode(GXutil.ltrimstr(AV63Cc_almcod,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV77fechaCierre)),GXutil.URLEncode(GXutil.ltrimstr(AV76flagM,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV64recfec)),GXutil.URLEncode(DecimalUtil.decToString(AV65rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV66recvolprd,5,0)),GXutil.URLEncode(GXutil.rtrim(AV67barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV81HayAnyadidas))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","FecCieTin","consumos","Maqcod","Cc_almcod","fechaCierre","flagM","recfec","rectotkgm","recvolprd","barnhdr","HayAnyadidas"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECTOTKGM", getSecureSignedToken( "", localUtil.format( AV65rectotkgm, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66recvolprd), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV69FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67barnhdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYANYADIDAS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81HayAnyadidas, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV64recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76flagM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHACIERRE", getSecureSignedToken( "", AV77fechaCierre));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCC_ALMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Cc_almcod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74consumos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECCIETIN", getSecureSignedToken( "", AV75FecCieTin));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinte_3_Anyadidas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\cierrerecetastinte_3_anyadidas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_42", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_42, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV36TFRecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO_TO", GXutil.ltrim( localUtil.ntoc( AV37TFRecLinPro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV45TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV46TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM", GXutil.rtrim( AV47TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM_SEL", GXutil.rtrim( AV48TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC", GXutil.rtrim( AV49TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC_SEL", GXutil.rtrim( AV50TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV51TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV52TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT", GXutil.ltrim( localUtil.ntoc( AV53TFPrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV54TFPrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANFIN", GXutil.ltrim( localUtil.ntoc( AV55TFPrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANFIN_TO", GXutil.ltrim( localUtil.ntoc( AV56TFPrdCanFin_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANANY", GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV57EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV58BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV59BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV60BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV61RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV65rectotkgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECTOTKGM", getSecureSignedToken( "", localUtil.format( AV65rectotkgm, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECVOLPRD", GXutil.ltrim( localUtil.ntoc( AV66recvolprd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66recvolprd), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV69FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV69FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNHDR", GXutil.rtrim( AV67barnhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67barnhdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV73UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV71Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHAYANYADIDAS", GXutil.rtrim( AV81HayAnyadidas));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYANYADIDAS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81HayAnyadidas, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFEC", localUtil.dtoc( AV64recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV64recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV76flagM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76flagM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHACIERRE", localUtil.dtoc( AV77fechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHACIERRE", getSecureSignedToken( "", AV77fechaCierre));
      app.GxWebStd.gx_hidden_field( httpContext, "vCC_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV63Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCC_ALMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Cc_almcod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV62Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV74consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74consumos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECCIETIN", localUtil.dtoc( AV75FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECCIETIN", getSecureSignedToken( "", AV75FecCieTin));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmardatos_Result));
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
      if ( ! ( WebComp_Wcveranyadidas_ == null ) )
      {
         WebComp_Wcveranyadidas_.componentjscripts();
      }
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
         we1RS2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1RS2( ) ;
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
      return formatLink("app.formulaciontinte.cierrerecetastinte_3_anyadidas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV57EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV58BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV60BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV61RecLinMaq,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV75FecCieTin)),GXutil.URLEncode(GXutil.ltrimstr(AV74consumos,4,0)),GXutil.URLEncode(GXutil.rtrim(AV62Maqcod)),GXutil.URLEncode(GXutil.ltrimstr(AV63Cc_almcod,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV77fechaCierre)),GXutil.URLEncode(GXutil.ltrimstr(AV76flagM,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV64recfec)),GXutil.URLEncode(DecimalUtil.decToString(AV65rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV66recvolprd,5,0)),GXutil.URLEncode(GXutil.rtrim(AV67barnhdr)),GXutil.URLEncode(GXutil.rtrim(AV81HayAnyadidas))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","FecCieTin","consumos","Maqcod","Cc_almcod","fechaCierre","flagM","recfec","rectotkgm","recvolprd","barnhdr","HayAnyadidas"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.CierreRecetasTinte_3_Anyadidas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento de Productos (Receta)", "") ;
   }

   public void wb1RS0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0014"+"", GXutil.rtrim( WebComp_Wcveranyadidas__Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0014"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_42_Refreshing )
            {
               if ( GXutil.len( WebComp_Wcveranyadidas__Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWcveranyadidas_), GXutil.lower( WebComp_Wcveranyadidas__Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0014"+"");
                  }
                  WebComp_Wcveranyadidas_.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWcveranyadidas_), GXutil.lower( WebComp_Wcveranyadidas__Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divAcciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmardatos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 42, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmardatos_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111rs1_client"+"'", TempTags, "", 2, "HLP_FormulacionTinte\\CierreRecetasTinte_3_Anyadidas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 42, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\CierreRecetasTinte_3_Anyadidas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
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
         wb_table1_31_1RS2( true) ;
      }
      else
      {
         wb_table1_31_1RS2( false) ;
      }
      return  ;
   }

   public void wb_table1_31_1RS2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol42( ) ;
      }
      if ( wbEnd == 42 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_42 = (int)(nGXsfl_42_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV96Pgmname), GXutil.rtrim( localUtil.format( AV96Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\CierreRecetasTinte_3_Anyadidas.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_42_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLanyad_Internalname, GXutil.ltrim( localUtil.ntoc( AV80lanyad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV80lanyad), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLanyad_Jsonclick, 0, "Attribute", "", "", "", "", edtavLanyad_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\CierreRecetasTinte_3_Anyadidas.htm");
         wb_table2_74_1RS2( true) ;
      }
      else
      {
         wb_table2_74_1RS2( false) ;
      }
      return  ;
   }

   public void wb_table2_74_1RS2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 42 )
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

   public void start1RS2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento de Productos (Receta)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1RS0( ) ;
   }

   public void ws1RS2( )
   {
      start1RS2( ) ;
      evt1RS2( ) ;
   }

   public void evt1RS2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121RS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMARDATOS.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131RS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e141RS2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VANYADIRPRODUCTO.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 22), "VANYADIRPRODUCTO.CLICK") == 0 ) )
                        {
                           nGXsfl_42_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_422( ) ;
                           AV68AnyadirProducto = httpContext.cgiGet( edtavAnyadirproducto_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavAnyadirproducto_Internalname, AV68AnyadirProducto);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n490ForPrdUMe = false ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
                           A683PrdCanFin = localUtil.ctond( httpContext.cgiGet( edtPrdCanFin_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcumulada_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcumulada_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACUMULADA");
                              GX_FocusControl = edtavAcumulada_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV40Acumulada = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcumulada_Internalname, GXutil.ltrimstr( AV40Acumulada, 11, 3));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACUMULADA"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV40Acumulada, "ZZZZZZ9.999")));
                           }
                           else
                           {
                              AV40Acumulada = localUtil.ctond( httpContext.cgiGet( edtavAcumulada_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavAcumulada_Internalname, GXutil.ltrimstr( AV40Acumulada, 11, 3));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACUMULADA"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV40Acumulada, "ZZZZZZ9.999")));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorcenentrada_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorcenentrada_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORCENENTRADA");
                              GX_FocusControl = edtavPorcenentrada_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41PorcenEntrada = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPorcenentrada_Internalname, GXutil.ltrimstr( AV41PorcenEntrada, 6, 2));
                           }
                           else
                           {
                              AV41PorcenEntrada = localUtil.ctond( httpContext.cgiGet( edtavPorcenentrada_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPorcenentrada_Internalname, GXutil.ltrimstr( AV41PorcenEntrada, 6, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorcenacumulada_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorcenacumulada_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORCENACUMULADA");
                              GX_FocusControl = edtavPorcenacumulada_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV42PorcenAcumulada = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPorcenacumulada_Internalname, GXutil.ltrimstr( AV42PorcenAcumulada, 11, 3));
                           }
                           else
                           {
                              AV42PorcenAcumulada = localUtil.ctond( httpContext.cgiGet( edtavPorcenacumulada_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPorcenacumulada_Internalname, GXutil.ltrimstr( AV42PorcenAcumulada, 11, 3));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantanyadida_Internalname)), DecimalUtil.stringToDec("-999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantanyadida_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTANYADIDA");
                              GX_FocusControl = edtavCantanyadida_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV43Cantanyadida = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantanyadida_Internalname, GXutil.ltrimstr( AV43Cantanyadida, 11, 3));
                           }
                           else
                           {
                              AV43Cantanyadida = localUtil.ctond( httpContext.cgiGet( edtavCantanyadida_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavCantanyadida_Internalname, GXutil.ltrimstr( AV43Cantanyadida, 11, 3));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorcentaje_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorcentaje_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORCENTAJE");
                              GX_FocusControl = edtavPorcentaje_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV44Porcentaje = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPorcentaje_Internalname, GXutil.ltrimstr( AV44Porcentaje, 12, 2));
                           }
                           else
                           {
                              AV44Porcentaje = localUtil.ctond( httpContext.cgiGet( edtavPorcentaje_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPorcentaje_Internalname, GXutil.ltrimstr( AV44Porcentaje, 12, 2));
                           }
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
                           A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
                           n6018ProForFab = false ;
                           A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151RS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e161RS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e171RS2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VANYADIRPRODUCTO.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e181RS2 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 14 )
                     {
                        OldWcveranyadidas_ = httpContext.cgiGet( "W0014") ;
                        if ( ( GXutil.len( OldWcveranyadidas_) == 0 ) || ( GXutil.strcmp(OldWcveranyadidas_, WebComp_Wcveranyadidas__Component) != 0 ) )
                        {
                           WebComp_Wcveranyadidas_ = WebUtils.getWebComponent(getClass(), "app." + OldWcveranyadidas_ + "_impl", remoteHandle, context);
                           WebComp_Wcveranyadidas__Component = OldWcveranyadidas_ ;
                        }
                        if ( GXutil.len( WebComp_Wcveranyadidas__Component) != 0 )
                        {
                           WebComp_Wcveranyadidas_.componentprocess("W0014", "", sEvt);
                        }
                        WebComp_Wcveranyadidas__Component = OldWcveranyadidas_ ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1RS2( )
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

   public void pa1RS2( )
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
            GX_FocusControl = edtavLanyad_Internalname ;
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
      subsflControlProps_422( ) ;
      while ( nGXsfl_42_idx <= nRC_GXsfl_42 )
      {
         sendrow_422( ) ;
         nGXsfl_42_idx = ((subGrid_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV57EmprCod ,
                                 int AV58BarCod ,
                                 byte AV59BarCodReo ,
                                 String AV60BarCodPar ,
                                 short AV61RecLinMaq ,
                                 String AV96Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 byte AV36TFRecLinPro ,
                                 byte AV37TFRecLinPro_To ,
                                 short AV45TFRecLin ,
                                 short AV46TFRecLin_To ,
                                 String AV47TFRecPrdNum ,
                                 String AV48TFRecPrdNum_Sel ,
                                 String AV49TFRecPrdDsc ,
                                 String AV50TFRecPrdDsc_Sel ,
                                 String AV51TFForPrdDsc ,
                                 String AV52TFForPrdDsc_Sel ,
                                 java.math.BigDecimal AV53TFPrdCant ,
                                 java.math.BigDecimal AV54TFPrdCant_To ,
                                 java.math.BigDecimal AV55TFPrdCanFin ,
                                 java.math.BigDecimal AV56TFPrdCanFin_To ,
                                 java.util.Date AV69FecPan ,
                                 String AV73UsurCod ,
                                 String AV71Station ,
                                 java.math.BigDecimal AV65rectotkgm ,
                                 int AV66recvolprd ,
                                 String AV67barnhdr ,
                                 String AV81HayAnyadidas ,
                                 java.util.Date AV64recfec ,
                                 short AV76flagM ,
                                 java.util.Date AV77fechaCierre ,
                                 byte AV63Cc_almcod ,
                                 String AV62Maqcod ,
                                 short AV74consumos ,
                                 java.util.Date AV75FecCieTin )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161RS2 ();
      GRID_nCurrentRecord = 0 ;
      rf1RS2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinte_3_Anyadidas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\cierrerecetastinte_3_anyadidas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINPRO", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLIN", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A872RecPrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDNUM", GXutil.rtrim( A872RecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECPRDDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A875RecPrdDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDSC", GXutil.rtrim( A875RecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDCANT", getSecureSignedToken( "", localUtil.format( A686PrdCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANT", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACUMULADA", getSecureSignedToken( "", localUtil.format( AV40Acumulada, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vACUMULADA", GXutil.ltrim( localUtil.ntoc( AV40Acumulada, (byte)(11), (byte)(3), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_42_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1RS2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV96Pgmname = "FormulacionTinte.CierreRecetasTinte_3_Anyadidas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
      Gx_err = (short)(0) ;
      edtavAnyadirproducto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnyadirproducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnyadirproducto_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavAcumulada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcumulada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAcumulada_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavPorcentaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPorcentaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorcentaje_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1RS2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(42) ;
      /* Execute user event: Refresh */
      e161RS2 ();
      nGXsfl_42_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_422( ) ;
      bGXsfl_42_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcveranyadidas__Component) != 0 )
            {
               WebComp_Wcveranyadidas_.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_422( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV36TFRecLinPro) ,
                                              Byte.valueOf(AV37TFRecLinPro_To) ,
                                              Short.valueOf(AV45TFRecLin) ,
                                              Short.valueOf(AV46TFRecLin_To) ,
                                              AV48TFRecPrdNum_Sel ,
                                              AV47TFRecPrdNum ,
                                              AV50TFRecPrdDsc_Sel ,
                                              AV49TFRecPrdDsc ,
                                              AV52TFForPrdDsc_Sel ,
                                              AV51TFForPrdDsc ,
                                              AV53TFPrdCant ,
                                              AV54TFPrdCant_To ,
                                              AV55TFPrdCanFin ,
                                              AV56TFPrdCanFin_To ,
                                              Byte.valueOf(A1273RecLinPro) ,
                                              Short.valueOf(A811RecLin) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              A488ForPrdDsc ,
                                              A686PrdCant ,
                                              A683PrdCanFin ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV57EmprCod ,
                                              Integer.valueOf(AV58BarCod) ,
                                              Byte.valueOf(AV59BarCodReo) ,
                                              AV60BarCodPar ,
                                              Short.valueOf(AV61RecLinMaq) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV47TFRecPrdNum = GXutil.padr( GXutil.rtrim( AV47TFRecPrdNum), 6, "%") ;
         lV49TFRecPrdDsc = GXutil.padr( GXutil.rtrim( AV49TFRecPrdDsc), 26, "%") ;
         lV51TFForPrdDsc = GXutil.padr( GXutil.rtrim( AV51TFForPrdDsc), 5, "%") ;
         /* Using cursor H01RS2 */
         pr_default.execute(0, new Object[] {AV57EmprCod, Integer.valueOf(AV58BarCod), Byte.valueOf(AV59BarCodReo), AV60BarCodPar, Short.valueOf(AV61RecLinMaq), Byte.valueOf(AV36TFRecLinPro), Byte.valueOf(AV37TFRecLinPro_To), Short.valueOf(AV45TFRecLin), Short.valueOf(AV46TFRecLin_To), lV47TFRecPrdNum, AV48TFRecPrdNum_Sel, lV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, lV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_42_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A719PrdNum = H01RS2_A719PrdNum[0] ;
            n719PrdNum = H01RS2_n719PrdNum[0] ;
            A764ProForCod = H01RS2_A764ProForCod[0] ;
            A1797PrdCanAny = H01RS2_A1797PrdCanAny[0] ;
            A13232PrdRGB = H01RS2_A13232PrdRGB[0] ;
            A6018ProForFab = H01RS2_A6018ProForFab[0] ;
            n6018ProForFab = H01RS2_n6018ProForFab[0] ;
            A766ProForDsc = H01RS2_A766ProForDsc[0] ;
            A683PrdCanFin = H01RS2_A683PrdCanFin[0] ;
            A686PrdCant = H01RS2_A686PrdCant[0] ;
            A488ForPrdDsc = H01RS2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01RS2_n488ForPrdDsc[0] ;
            A875RecPrdDsc = H01RS2_A875RecPrdDsc[0] ;
            A872RecPrdNum = H01RS2_A872RecPrdNum[0] ;
            A811RecLin = H01RS2_A811RecLin[0] ;
            A1273RecLinPro = H01RS2_A1273RecLinPro[0] ;
            A490ForPrdUMe = H01RS2_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H01RS2_n490ForPrdUMe[0] ;
            A2804RecLinMaq = H01RS2_A2804RecLinMaq[0] ;
            A130BarCodPar = H01RS2_A130BarCodPar[0] ;
            A132BarCodReo = H01RS2_A132BarCodReo[0] ;
            A129BarCod = H01RS2_A129BarCod[0] ;
            A396EmprCod = H01RS2_A396EmprCod[0] ;
            A13232PrdRGB = H01RS2_A13232PrdRGB[0] ;
            A488ForPrdDsc = H01RS2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01RS2_n488ForPrdDsc[0] ;
            A764ProForCod = H01RS2_A764ProForCod[0] ;
            A6018ProForFab = H01RS2_A6018ProForFab[0] ;
            n6018ProForFab = H01RS2_n6018ProForFab[0] ;
            A766ProForDsc = H01RS2_A766ProForDsc[0] ;
            e171RS2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(42) ;
         wb1RS0( ) ;
      }
      bGXsfl_42_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1RS2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV57EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV58BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV59BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV60BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV61RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61RecLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLINPRO"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECTOTKGM", GXutil.ltrim( localUtil.ntoc( AV65rectotkgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECTOTKGM", getSecureSignedToken( "", localUtil.format( AV65rectotkgm, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECVOLPRD", GXutil.ltrim( localUtil.ntoc( AV66recvolprd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66recvolprd), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV69FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV69FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARNHDR", GXutil.rtrim( AV67barnhdr));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67barnhdr, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV73UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV71Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLIN"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECPRDNUM"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, GXutil.rtrim( localUtil.format( A872RecPrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECPRDDSC"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, GXutil.rtrim( localUtil.format( A875RecPrdDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHAYANYADIDAS", GXutil.rtrim( AV81HayAnyadidas));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYANYADIDAS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81HayAnyadidas, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFEC", localUtil.dtoc( AV64recfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV64recfec));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGM", GXutil.ltrim( localUtil.ntoc( AV76flagM, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76flagM), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHACIERRE", localUtil.dtoc( AV77fechaCierre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHACIERRE", getSecureSignedToken( "", AV77fechaCierre));
      app.GxWebStd.gx_hidden_field( httpContext, "vCC_ALMCOD", GXutil.ltrim( localUtil.ntoc( AV63Cc_almcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCC_ALMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Cc_almcod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV62Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONSUMOS", GXutil.ltrim( localUtil.ntoc( AV74consumos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74consumos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECCIETIN", localUtil.dtoc( AV75FecCieTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECCIETIN", getSecureSignedToken( "", AV75FecCieTin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDCANT"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( A686PrdCant, "ZZZZZZ9.999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACUMULADA"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV40Acumulada, "ZZZZZZ9.999")));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV36TFRecLinPro) ,
                                           Byte.valueOf(AV37TFRecLinPro_To) ,
                                           Short.valueOf(AV45TFRecLin) ,
                                           Short.valueOf(AV46TFRecLin_To) ,
                                           AV48TFRecPrdNum_Sel ,
                                           AV47TFRecPrdNum ,
                                           AV50TFRecPrdDsc_Sel ,
                                           AV49TFRecPrdDsc ,
                                           AV52TFForPrdDsc_Sel ,
                                           AV51TFForPrdDsc ,
                                           AV53TFPrdCant ,
                                           AV54TFPrdCant_To ,
                                           AV55TFPrdCanFin ,
                                           AV56TFPrdCanFin_To ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A488ForPrdDsc ,
                                           A686PrdCant ,
                                           A683PrdCanFin ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV57EmprCod ,
                                           Integer.valueOf(AV58BarCod) ,
                                           Byte.valueOf(AV59BarCodReo) ,
                                           AV60BarCodPar ,
                                           Short.valueOf(AV61RecLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV47TFRecPrdNum = GXutil.padr( GXutil.rtrim( AV47TFRecPrdNum), 6, "%") ;
      lV49TFRecPrdDsc = GXutil.padr( GXutil.rtrim( AV49TFRecPrdDsc), 26, "%") ;
      lV51TFForPrdDsc = GXutil.padr( GXutil.rtrim( AV51TFForPrdDsc), 5, "%") ;
      /* Using cursor H01RS3 */
      pr_default.execute(1, new Object[] {AV57EmprCod, Integer.valueOf(AV58BarCod), Byte.valueOf(AV59BarCodReo), AV60BarCodPar, Short.valueOf(AV61RecLinMaq), Byte.valueOf(AV36TFRecLinPro), Byte.valueOf(AV37TFRecLinPro_To), Short.valueOf(AV45TFRecLin), Short.valueOf(AV46TFRecLin_To), lV47TFRecPrdNum, AV48TFRecPrdNum_Sel, lV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, lV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To});
      GRID_nRecordCount = H01RS3_AGRID_nRecordCount[0] ;
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
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar, AV61RecLinMaq, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV36TFRecLinPro, AV37TFRecLinPro_To, AV45TFRecLin, AV46TFRecLin_To, AV47TFRecPrdNum, AV48TFRecPrdNum_Sel, AV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, AV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To, AV69FecPan, AV73UsurCod, AV71Station, AV65rectotkgm, AV66recvolprd, AV67barnhdr, AV81HayAnyadidas, AV64recfec, AV76flagM, AV77fechaCierre, AV63Cc_almcod, AV62Maqcod, AV74consumos, AV75FecCieTin) ;
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
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar, AV61RecLinMaq, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV36TFRecLinPro, AV37TFRecLinPro_To, AV45TFRecLin, AV46TFRecLin_To, AV47TFRecPrdNum, AV48TFRecPrdNum_Sel, AV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, AV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To, AV69FecPan, AV73UsurCod, AV71Station, AV65rectotkgm, AV66recvolprd, AV67barnhdr, AV81HayAnyadidas, AV64recfec, AV76flagM, AV77fechaCierre, AV63Cc_almcod, AV62Maqcod, AV74consumos, AV75FecCieTin) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar, AV61RecLinMaq, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV36TFRecLinPro, AV37TFRecLinPro_To, AV45TFRecLin, AV46TFRecLin_To, AV47TFRecPrdNum, AV48TFRecPrdNum_Sel, AV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, AV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To, AV69FecPan, AV73UsurCod, AV71Station, AV65rectotkgm, AV66recvolprd, AV67barnhdr, AV81HayAnyadidas, AV64recfec, AV76flagM, AV77fechaCierre, AV63Cc_almcod, AV62Maqcod, AV74consumos, AV75FecCieTin) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar, AV61RecLinMaq, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV36TFRecLinPro, AV37TFRecLinPro_To, AV45TFRecLin, AV46TFRecLin_To, AV47TFRecPrdNum, AV48TFRecPrdNum_Sel, AV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, AV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To, AV69FecPan, AV73UsurCod, AV71Station, AV65rectotkgm, AV66recvolprd, AV67barnhdr, AV81HayAnyadidas, AV64recfec, AV76flagM, AV77fechaCierre, AV63Cc_almcod, AV62Maqcod, AV74consumos, AV75FecCieTin) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar, AV61RecLinMaq, AV96Pgmname, AV12OrderedBy, AV13OrderedDsc, AV36TFRecLinPro, AV37TFRecLinPro_To, AV45TFRecLin, AV46TFRecLin_To, AV47TFRecPrdNum, AV48TFRecPrdNum_Sel, AV49TFRecPrdDsc, AV50TFRecPrdDsc_Sel, AV51TFForPrdDsc, AV52TFForPrdDsc_Sel, AV53TFPrdCant, AV54TFPrdCant_To, AV55TFPrdCanFin, AV56TFPrdCanFin_To, AV69FecPan, AV73UsurCod, AV71Station, AV65rectotkgm, AV66recvolprd, AV67barnhdr, AV81HayAnyadidas, AV64recfec, AV76flagM, AV77fechaCierre, AV63Cc_almcod, AV62Maqcod, AV74consumos, AV75FecCieTin) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV96Pgmname = "FormulacionTinte.CierreRecetasTinte_3_Anyadidas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
      Gx_err = (short)(0) ;
      edtavAnyadirproducto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAnyadirproducto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAnyadirproducto_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavAcumulada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAcumulada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAcumulada_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavPorcentaje_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPorcentaje_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorcentaje_Enabled), 5, 0), !bGXsfl_42_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1RS0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151RS2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_42 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_42"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_confirmardatos_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Title") ;
         Dvelop_confirmpanel_confirmardatos_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Confirmationtext") ;
         Dvelop_confirmpanel_confirmardatos_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmardatos_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmardatos_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmardatos_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmardatos_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_confirmardatos_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMARDATOS_Result") ;
         /* Read variables values. */
         AV96Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLanyad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLanyad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLANYAD");
            GX_FocusControl = edtavLanyad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80lanyad = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80lanyad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80lanyad), 4, 0));
         }
         else
         {
            AV80lanyad = (short)(localUtil.ctol( httpContext.cgiGet( edtavLanyad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80lanyad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80lanyad), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"CierreRecetasTinte_3_Anyadidas");
         AV96Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96Pgmname", AV96Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV96Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\cierrerecetastinte_3_anyadidas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e151RS2 ();
      if (returnInSub) return;
   }

   public void e151RS2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV71Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV71Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Station", AV71Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Station, ""))));
      GXv_char2[0] = AV57EmprCod ;
      GXv_char3[0] = AV72EmprNom ;
      GXv_char4[0] = AV73UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char2, GXv_char3, GXv_char4) ;
      cierrerecetastinte_3_anyadidas_impl.this.AV57EmprCod = GXv_char2[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV72EmprNom = GXv_char3[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV73UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV73UsurCod", AV73UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, "@!"))));
      GXt_char1 = AV71Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV71Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Station", AV71Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71Station, ""))));
      GXv_char4[0] = AV57EmprCod ;
      GXv_char3[0] = AV72EmprNom ;
      GXv_char2[0] = AV73UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV71Station, GXv_char4, GXv_char3, GXv_char2) ;
      cierrerecetastinte_3_anyadidas_impl.this.AV57EmprCod = GXv_char4[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV72EmprNom = GXv_char3[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV73UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV73UsurCod", AV73UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73UsurCod, "@!"))));
      edtavLanyad_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLanyad_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLanyad_Visible), 5, 0), true);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento de Productos (Receta)", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV38DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV38DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcveranyadidas_ = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcveranyadidas__Component), GXutil.lower( "FormulacionTinte.VerAnyadidas_")) != 0 )
      {
         WebComp_Wcveranyadidas_ = WebUtils.getWebComponent(getClass(), "app.formulaciontinte.veranyadidas__impl", remoteHandle, context);
         WebComp_Wcveranyadidas__Component = "FormulacionTinte.VerAnyadidas_" ;
      }
      if ( GXutil.len( WebComp_Wcveranyadidas__Component) != 0 )
      {
         WebComp_Wcveranyadidas_.setjustcreated();
         WebComp_Wcveranyadidas_.componentprepare(new Object[] {"W0014","",AV57EmprCod,Integer.valueOf(AV58BarCod),Byte.valueOf(AV59BarCodReo),AV60BarCodPar,Short.valueOf(AV61RecLinMaq)});
         WebComp_Wcveranyadidas_.componentbind(new Object[] {"","","","",""});
      }
      AV65rectotkgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65rectotkgm", GXutil.ltrimstr( AV65rectotkgm, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECTOTKGM", getSecureSignedToken( "", localUtil.format( AV65rectotkgm, "ZZZZZZ9.99")));
   }

   public void e161RS2( )
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
   }

   public void e121RS2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinPro") == 0 )
         {
            AV36TFRecLinPro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRecLinPro), 2, 0));
            AV37TFRecLinPro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV45TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFRecLin), 4, 0));
            AV46TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV47TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecPrdNum", AV47TFRecPrdNum);
            AV48TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFRecPrdNum_Sel", AV48TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV49TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFRecPrdDsc", AV49TFRecPrdDsc);
            AV50TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFRecPrdDsc_Sel", AV50TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV51TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFForPrdDsc", AV51TFForPrdDsc);
            AV52TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFForPrdDsc_Sel", AV52TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCant") == 0 )
         {
            AV53TFPrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdCant", GXutil.ltrimstr( AV53TFPrdCant, 11, 3));
            AV54TFPrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdCant_To", GXutil.ltrimstr( AV54TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanFin") == 0 )
         {
            AV55TFPrdCanFin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdCanFin", GXutil.ltrimstr( AV55TFPrdCanFin, 11, 3));
            AV56TFPrdCanFin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdCanFin_To", GXutil.ltrimstr( AV56TFPrdCanFin_To, 11, 3));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171RS2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV68AnyadirProducto = "<i class=\"fa fa-plus\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAnyadirproducto_Internalname, AV68AnyadirProducto);
      AV40Acumulada = A686PrdCant.add(A1797PrdCanAny) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavAcumulada_Internalname, GXutil.ltrimstr( AV40Acumulada, 11, 3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vACUMULADA"+"_"+sGXsfl_42_idx, getSecureSignedToken( sGXsfl_42_idx, localUtil.format( AV40Acumulada, "ZZZZZZ9.999")));
      edtavPorcenentrada_Enabled = 1 ;
      edtavPorcenentrada_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPorcenentrada_Forecolor = GXutil.getColor( 0, 0, 0) ;
      edtavPorcenacumulada_Enabled = 1 ;
      edtavPorcenacumulada_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPorcenacumulada_Forecolor = GXutil.getColor( 0, 0, 0) ;
      edtavCantanyadida_Enabled = 1 ;
      edtavCantanyadida_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavCantanyadida_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV83PrdRgb = ((A13232PrdRGB==0) ? 65793 : A13232PrdRGB) ;
      GXv_int8[0] = AV88R ;
      GXv_int9[0] = AV86G ;
      GXv_int10[0] = AV84B ;
      GXv_int11[0] = AV89R2 ;
      GXv_int12[0] = AV87G2 ;
      GXv_int13[0] = AV85B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV83PrdRgb, GXv_int8, GXv_int9, GXv_int10, GXv_int11, GXv_int12, GXv_int13) ;
      cierrerecetastinte_3_anyadidas_impl.this.AV88R = GXv_int8[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV86G = GXv_int9[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV84B = GXv_int10[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV89R2 = GXv_int11[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV87G2 = GXv_int12[0] ;
      cierrerecetastinte_3_anyadidas_impl.this.AV85B2 = GXv_int13[0] ;
      edtRecPrdDsc_Backcolor = GXutil.getColor( AV88R, AV86G, AV84B) ;
      edtRecPrdDsc_Forecolor = GXutil.getColor( AV89R2, AV87G2, AV85B2) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(42) ;
      }
      sendrow_422( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_42_Refreshing )
      {
         httpContext.doAjaxLoad(42, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e181RS2( )
   {
      /* Anyadirproducto_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.mantenimientoproductosreceta_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV57EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV58BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV59BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV60BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV61RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A1273RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV65rectotkgm)),GXutil.URLEncode(GXutil.ltrimstr(AV66recvolprd,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV69FecPan)),GXutil.URLEncode(GXutil.rtrim(AV67barnhdr)),GXutil.URLEncode(GXutil.rtrim(A766ProForDsc)),GXutil.URLEncode(GXutil.rtrim(A6018ProForFab)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","BarNHdr","ProForDsc","Proforfab","Modif2"}) , new Object[] {"AV70modif"});
      httpContext.doAjaxRefresh();
   }

   public void e131RS2( )
   {
      /* Dvelop_confirmpanel_confirmardatos_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmardatos_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMARDATOS' */
         S152 ();
         if (returnInSub) return;
      }
   }

   public void e141RS2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV57EmprCod,Integer.valueOf(AV58BarCod),Byte.valueOf(AV59BarCodReo),AV60BarCodPar,Short.valueOf(AV61RecLinMaq),localUtil.format( AV75FecCieTin, "99/99/99"),Short.valueOf(AV74consumos),AV62Maqcod,Byte.valueOf(AV63Cc_almcod),localUtil.format( AV77fechaCierre, "99/99/99"),Short.valueOf(AV76flagM),localUtil.format( AV64recfec, "99/99/99"),AV65rectotkgm,Integer.valueOf(AV66recvolprd),AV67barnhdr,AV81HayAnyadidas});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV57EmprCod","AV58BarCod","AV59BarCodReo","AV60BarCodPar","AV61RecLinMaq","AV75FecCieTin","AV74consumos","AV62Maqcod","AV63Cc_almcod","AV77fechaCierre","AV76flagM","AV64recfec","AV65rectotkgm","AV66recvolprd","AV67barnhdr","AV81HayAnyadidas"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
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
      /* 'DO ACTION CONFIRMARDATOS' Routine */
      returnInSub = false ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_42 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_42"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_42_fel_idx = 0 ;
      while ( nGXsfl_42_fel_idx < nRC_GXsfl_42 )
      {
         nGXsfl_42_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_42_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_42_fel_idx+1) ;
         sGXsfl_42_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_422( ) ;
         AV68AnyadirProducto = httpContext.cgiGet( edtavAnyadirproducto_Internalname) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n490ForPrdUMe = false ;
         A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
         A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
         A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
         n488ForPrdDsc = false ;
         A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
         A683PrdCanFin = localUtil.ctond( httpContext.cgiGet( edtPrdCanFin_Internalname)) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAcumulada_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAcumulada_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vACUMULADA");
            GX_FocusControl = edtavAcumulada_Internalname ;
            wbErr = true ;
            AV40Acumulada = DecimalUtil.ZERO ;
         }
         else
         {
            AV40Acumulada = localUtil.ctond( httpContext.cgiGet( edtavAcumulada_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorcenentrada_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorcenentrada_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORCENENTRADA");
            GX_FocusControl = edtavPorcenentrada_Internalname ;
            wbErr = true ;
            AV41PorcenEntrada = DecimalUtil.ZERO ;
         }
         else
         {
            AV41PorcenEntrada = localUtil.ctond( httpContext.cgiGet( edtavPorcenentrada_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorcenacumulada_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorcenacumulada_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORCENACUMULADA");
            GX_FocusControl = edtavPorcenacumulada_Internalname ;
            wbErr = true ;
            AV42PorcenAcumulada = DecimalUtil.ZERO ;
         }
         else
         {
            AV42PorcenAcumulada = localUtil.ctond( httpContext.cgiGet( edtavPorcenacumulada_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantanyadida_Internalname)), DecimalUtil.stringToDec("-999999.999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantanyadida_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTANYADIDA");
            GX_FocusControl = edtavCantanyadida_Internalname ;
            wbErr = true ;
            AV43Cantanyadida = DecimalUtil.ZERO ;
         }
         else
         {
            AV43Cantanyadida = localUtil.ctond( httpContext.cgiGet( edtavCantanyadida_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorcentaje_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorcentaje_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORCENTAJE");
            GX_FocusControl = edtavPorcentaje_Internalname ;
            wbErr = true ;
            AV44Porcentaje = DecimalUtil.ZERO ;
         }
         else
         {
            AV44Porcentaje = localUtil.ctond( httpContext.cgiGet( edtavPorcentaje_Internalname)) ;
         }
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
         n6018ProForFab = false ;
         A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43Cantanyadida)==0) )
         {
            AV78Inc_obs = "Go PMODANY" ;
            new app.pinscrtinc(remoteHandle, context).execute( AV57EmprCod, AV96Pgmname, AV73UsurCod, AV71Station, AV78Inc_obs, AV58BarCod, AV59BarCodReo, AV60BarCodPar) ;
            new app.pmodany(remoteHandle, context).execute( AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar, A1273RecLinPro, A811RecLin, AV43Cantanyadida, AV61RecLinMaq) ;
            AV78Inc_obs = httpContext.getMessage( "Añadidas ", "") + GXutil.trim( GXutil.str( AV58BarCod, 8, 0)) + "-" + GXutil.str( AV59BarCodReo, 1, 0) + AV60BarCodPar + " #=" + GXutil.trim( GXutil.str( AV61RecLinMaq, 4, 0)) + GXutil.newLine( ) ;
            AV78Inc_obs += httpContext.getMessage( "Linea Proceso-Linea ", "") + GXutil.trim( GXutil.str( A1273RecLinPro, 2, 0)) + "/" + GXutil.trim( GXutil.str( A811RecLin, 4, 0)) + GXutil.newLine( ) ;
            AV78Inc_obs += httpContext.getMessage( "Producto            ", "") + GXutil.trim( A872RecPrdNum) + " " + GXutil.trim( A875RecPrdDsc) + GXutil.newLine( ) ;
            AV78Inc_obs += httpContext.getMessage( "Cantidad añadidad   ", "") + GXutil.trim( GXutil.str( AV43Cantanyadida, 11, 3)) ;
            new app.pctrinc(remoteHandle, context).execute( AV57EmprCod, AV96Pgmname, AV73UsurCod, AV71Station, AV78Inc_obs, AV58BarCod, AV59BarCodReo, AV60BarCodPar) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_42_fel_idx == 0 )
      {
         nGXsfl_42_idx = 1 ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      nGXsfl_42_fel_idx = 1 ;
      AV78Inc_obs = "Go PACTANY" ;
      new app.pctrinc(remoteHandle, context).execute( AV57EmprCod, AV96Pgmname, AV73UsurCod, AV71Station, AV78Inc_obs, AV58BarCod, AV59BarCodReo, AV60BarCodPar) ;
      new app.pactany(remoteHandle, context).execute( AV57EmprCod, AV58BarCod, AV59BarCodReo, AV60BarCodPar) ;
      httpContext.setWebReturnParms(new Object[] {AV57EmprCod,Integer.valueOf(AV58BarCod),Byte.valueOf(AV59BarCodReo),AV60BarCodPar,Short.valueOf(AV61RecLinMaq),localUtil.format( AV75FecCieTin, "99/99/99"),Short.valueOf(AV74consumos),AV62Maqcod,Byte.valueOf(AV63Cc_almcod),localUtil.format( AV77fechaCierre, "99/99/99"),Short.valueOf(AV76flagM),localUtil.format( AV64recfec, "99/99/99"),AV65rectotkgm,Integer.valueOf(AV66recvolprd),AV67barnhdr,AV81HayAnyadidas});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV57EmprCod","AV58BarCod","AV59BarCodReo","AV60BarCodPar","AV61RecLinMaq","AV75FecCieTin","AV74consumos","AV62Maqcod","AV63Cc_almcod","AV77fechaCierre","AV76flagM","AV64recfec","AV65rectotkgm","AV66recvolprd","AV67barnhdr","AV81HayAnyadidas"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV96Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV96Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV96Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV98GXV1 = 1 ;
      while ( AV98GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV98GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV36TFRecLinPro = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFRecLinPro), 2, 0));
            AV37TFRecLinPro_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV45TFRecLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFRecLin), 4, 0));
            AV46TFRecLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV47TFRecPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFRecPrdNum", AV47TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV48TFRecPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFRecPrdNum_Sel", AV48TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV49TFRecPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFRecPrdDsc", AV49TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV50TFRecPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFRecPrdDsc_Sel", AV50TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV51TFForPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFForPrdDsc", AV51TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV52TFForPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFForPrdDsc_Sel", AV52TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV53TFPrdCant = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFPrdCant", GXutil.ltrimstr( AV53TFPrdCant, 11, 3));
            AV54TFPrdCant_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFPrdCant_To", GXutil.ltrimstr( AV54TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANFIN") == 0 )
         {
            AV55TFPrdCanFin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFPrdCanFin", GXutil.ltrimstr( AV55TFPrdCanFin, 11, 3));
            AV56TFPrdCanFin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFPrdCanFin_To", GXutil.ltrimstr( AV56TFPrdCanFin_To, 11, 3));
         }
         AV98GXV1 = (int)(AV98GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFRecPrdNum_Sel)==0), AV48TFRecPrdNum_Sel, GXv_char4) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFRecPrdDsc_Sel)==0), AV50TFRecPrdDsc_Sel, GXv_char3) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFForPrdDsc_Sel)==0), AV52TFForPrdDsc_Sel, GXv_char2) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char15 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char14+"|"+GXt_char15+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFRecPrdNum)==0), AV47TFRecPrdNum, GXv_char4) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFRecPrdDsc)==0), AV49TFRecPrdDsc, GXv_char3) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFForPrdDsc)==0), AV51TFForPrdDsc, GXv_char2) ;
      cierrerecetastinte_3_anyadidas_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV36TFRecLinPro) ? "" : GXutil.str( AV36TFRecLinPro, 2, 0))+"|"+((0==AV45TFRecLin) ? "" : GXutil.str( AV45TFRecLin, 4, 0))+"|"+GXt_char15+"|"+GXt_char14+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdCant)==0) ? "" : GXutil.str( AV53TFPrdCant, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdCanFin)==0) ? "" : GXutil.str( AV55TFPrdCanFin, 11, 3)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV37TFRecLinPro_To) ? "" : GXutil.str( AV37TFRecLinPro_To, 2, 0))+"|"+((0==AV46TFRecLin_To) ? "" : GXutil.str( AV46TFRecLin_To, 4, 0))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdCant_To)==0) ? "" : GXutil.str( AV54TFPrdCant_To, 11, 3))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCanFin_To)==0) ? "" : GXutil.str( AV56TFPrdCanFin_To, 11, 3)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV96Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECLINPRO", "", !((0==AV36TFRecLinPro)&&(0==AV37TFRecLinPro_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFRecLinPro, 2, 0)), GXutil.trim( GXutil.str( AV37TFRecLinPro_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECLIN", "", !((0==AV45TFRecLin)&&(0==AV46TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV45TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV46TFRecLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV47TFRecPrdNum)==0), (short)(0), AV47TFRecPrdNum, "", !(GXutil.strcmp("", AV48TFRecPrdNum_Sel)==0), AV48TFRecPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV49TFRecPrdDsc)==0), (short)(0), AV49TFRecPrdDsc, "", !(GXutil.strcmp("", AV50TFRecPrdDsc_Sel)==0), AV50TFRecPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV51TFForPrdDsc)==0), (short)(0), AV51TFForPrdDsc, "", !(GXutil.strcmp("", AV52TFForPrdDsc_Sel)==0), AV52TFForPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV53TFPrdCant, 11, 3)), GXutil.trim( GXutil.str( AV54TFPrdCant_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      GXv_SdtWWPGridState16[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState16, "TFPRDCANFIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdCanFin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCanFin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV55TFPrdCanFin, 11, 3)), GXutil.trim( GXutil.str( AV56TFPrdCanFin_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState16[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV96Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV96Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "MantenimientoProductosReceta_TRN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_74_1RS2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmardatos_Internalname, tblTabledvelop_confirmpanel_confirmardatos_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmardatos.setProperty("Title", Dvelop_confirmpanel_confirmardatos_Title);
         ucDvelop_confirmpanel_confirmardatos.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmardatos_Confirmationtext);
         ucDvelop_confirmpanel_confirmardatos.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmardatos_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmardatos.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmardatos_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmardatos.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmardatos_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmardatos.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmardatos_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmardatos.setProperty("ConfirmType", Dvelop_confirmpanel_confirmardatos_Confirmtype);
         ucDvelop_confirmpanel_confirmardatos.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmardatos_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARDATOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARDATOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_74_1RS2e( true) ;
      }
      else
      {
         wb_table2_74_1RS2e( false) ;
      }
   }

   public void wb_table1_31_1RS2( boolean wbgen )
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
         wb_table1_31_1RS2e( true) ;
      }
      else
      {
         wb_table1_31_1RS2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV57EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57EmprCod", AV57EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV57EmprCod, "@!"))));
      AV58BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58BarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV58BarCod), "ZZZZZZZ9")));
      AV59BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59BarCodReo", GXutil.str( AV59BarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV59BarCodReo), "9")));
      AV60BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarCodPar", AV60BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV60BarCodPar, ""))));
      AV61RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61RecLinMaq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECLINMAQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61RecLinMaq), "ZZZ9")));
      AV75FecCieTin = (java.util.Date)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75FecCieTin", localUtil.format(AV75FecCieTin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECCIETIN", getSecureSignedToken( "", AV75FecCieTin));
      AV74consumos = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74consumos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74consumos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONSUMOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74consumos), "ZZZ9")));
      AV62Maqcod = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Maqcod", AV62Maqcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62Maqcod, ""))));
      AV63Cc_almcod = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Cc_almcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63Cc_almcod), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCC_ALMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Cc_almcod), "Z9")));
      AV77fechaCierre = (java.util.Date)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77fechaCierre", localUtil.format(AV77fechaCierre, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHACIERRE", getSecureSignedToken( "", AV77fechaCierre));
      AV76flagM = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76flagM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76flagM), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76flagM), "ZZZ9")));
      AV64recfec = (java.util.Date)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64recfec", localUtil.format(AV64recfec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECFEC", getSecureSignedToken( "", AV64recfec));
      AV65rectotkgm = (java.math.BigDecimal)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65rectotkgm", GXutil.ltrimstr( AV65rectotkgm, 10, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECTOTKGM", getSecureSignedToken( "", localUtil.format( AV65rectotkgm, "ZZZZZZ9.99")));
      AV66recvolprd = ((Number) GXutil.testNumericType( getParm(obj,13), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66recvolprd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66recvolprd), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECVOLPRD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66recvolprd), "ZZZZ9")));
      AV67barnhdr = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67barnhdr", AV67barnhdr);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARNHDR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67barnhdr, ""))));
      AV81HayAnyadidas = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81HayAnyadidas", AV81HayAnyadidas);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHAYANYADIDAS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81HayAnyadidas, ""))));
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
      pa1RS2( ) ;
      ws1RS2( ) ;
      we1RS2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcveranyadidas_ == null ) )
      {
         if ( GXutil.len( WebComp_Wcveranyadidas__Component) != 0 )
         {
            WebComp_Wcveranyadidas_.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614126", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/cierrerecetastinte_3_anyadidas.js", "?20268211614126", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_422( )
   {
      edtavAnyadirproducto_Internalname = "vANYADIRPRODUCTO_"+sGXsfl_42_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_42_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_42_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_42_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_42_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_42_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_42_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_42_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_42_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_42_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_42_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_42_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_42_idx ;
      edtPrdCanFin_Internalname = "PRDCANFIN_"+sGXsfl_42_idx ;
      edtavAcumulada_Internalname = "vACUMULADA_"+sGXsfl_42_idx ;
      edtavPorcenentrada_Internalname = "vPORCENENTRADA_"+sGXsfl_42_idx ;
      edtavPorcenacumulada_Internalname = "vPORCENACUMULADA_"+sGXsfl_42_idx ;
      edtavCantanyadida_Internalname = "vCANTANYADIDA_"+sGXsfl_42_idx ;
      edtavPorcentaje_Internalname = "vPORCENTAJE_"+sGXsfl_42_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_42_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_42_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_42_idx ;
   }

   public void subsflControlProps_fel_422( )
   {
      edtavAnyadirproducto_Internalname = "vANYADIRPRODUCTO_"+sGXsfl_42_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_42_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_42_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_42_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_42_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_42_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_42_fel_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_42_fel_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_42_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_42_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_42_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_42_fel_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_42_fel_idx ;
      edtPrdCanFin_Internalname = "PRDCANFIN_"+sGXsfl_42_fel_idx ;
      edtavAcumulada_Internalname = "vACUMULADA_"+sGXsfl_42_fel_idx ;
      edtavPorcenentrada_Internalname = "vPORCENENTRADA_"+sGXsfl_42_fel_idx ;
      edtavPorcenacumulada_Internalname = "vPORCENACUMULADA_"+sGXsfl_42_fel_idx ;
      edtavCantanyadida_Internalname = "vCANTANYADIDA_"+sGXsfl_42_fel_idx ;
      edtavPorcentaje_Internalname = "vPORCENTAJE_"+sGXsfl_42_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_42_fel_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_42_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_42_fel_idx ;
   }

   public void sendrow_422( )
   {
      subsflControlProps_422( ) ;
      wb1RS0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_42_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_42_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_42_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAnyadirproducto_Enabled!=0)&&(edtavAnyadirproducto_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'',false,'"+sGXsfl_42_idx+"',42)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAnyadirproducto_Internalname,GXutil.rtrim( AV68AnyadirProducto),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavAnyadirproducto_Enabled!=0)&&(edtavAnyadirproducto_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,43);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVANYADIRPRODUCTO.CLICK."+sGXsfl_42_idx+"'","","",httpContext.getMessage( "Agregar Productos", ""),"",edtavAnyadirproducto_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAnyadirproducto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Forecolor)+";"+((edtRecPrdDsc_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanFin_Internalname,GXutil.ltrim( localUtil.ntoc( A683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A683PrdCanFin, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanFin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavAcumulada_Enabled!=0)&&(edtavAcumulada_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_42_idx+"',42)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavAcumulada_Internalname,GXutil.ltrim( localUtil.ntoc( AV40Acumulada, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavAcumulada_Enabled!=0) ? localUtil.format( AV40Acumulada, "ZZZZZZ9.999") : localUtil.format( AV40Acumulada, "ZZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavAcumulada_Enabled!=0)&&(edtavAcumulada_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavAcumulada_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavAcumulada_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPorcenentrada_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPorcenentrada_Enabled!=0)&&(edtavPorcenentrada_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_42_idx+"',42)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorcenentrada_Internalname,GXutil.ltrim( localUtil.ntoc( AV41PorcenEntrada, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV41PorcenEntrada, "ZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPorcenentrada_Enabled!=0)&&(edtavPorcenentrada_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPorcenentrada_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPorcenentrada_Forecolor)+";"+((edtavPorcenentrada_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPorcenentrada_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPorcenentrada_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPorcenacumulada_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPorcenacumulada_Enabled!=0)&&(edtavPorcenacumulada_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_42_idx+"',42)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorcenacumulada_Internalname,GXutil.ltrim( localUtil.ntoc( AV42PorcenAcumulada, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV42PorcenAcumulada, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavPorcenacumulada_Enabled!=0)&&(edtavPorcenacumulada_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPorcenacumulada_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPorcenacumulada_Forecolor)+";"+((edtavPorcenacumulada_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPorcenacumulada_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPorcenacumulada_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCantanyadida_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantanyadida_Enabled!=0)&&(edtavCantanyadida_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_42_idx+"',42)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantanyadida_Internalname,GXutil.ltrim( localUtil.ntoc( AV43Cantanyadida, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV43Cantanyadida, "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+((edtavCantanyadida_Enabled!=0)&&(edtavCantanyadida_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCantanyadida_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCantanyadida_Forecolor)+";"+((edtavCantanyadida_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCantanyadida_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCantanyadida_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPorcentaje_Enabled!=0)&&(edtavPorcentaje_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_42_idx+"',42)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorcentaje_Internalname,GXutil.ltrim( localUtil.ntoc( AV44Porcentaje, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPorcentaje_Enabled!=0) ? localUtil.format( AV44Porcentaje, "ZZZZZZZZ9.99") : localUtil.format( AV44Porcentaje, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPorcentaje_Enabled!=0)&&(edtavPorcentaje_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPorcentaje_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavPorcentaje_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFab_Internalname,GXutil.rtrim( A6018ProForFab),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForFab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(42),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1RS2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_42_idx = ((subGrid_Islastpage==1)&&(nGXsfl_42_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_42_idx+1) ;
         sGXsfl_42_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_42_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_422( ) ;
      }
      /* End function sendrow_422 */
   }

   public void startgridcontrol42( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"42\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teorica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Acumulada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "% Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "% Acumulada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant. Añadida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso Quimico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo (L o T)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV68AnyadirProducto));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAnyadirproducto_Enabled, (byte)(5), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A683PrdCanFin, (byte)(11), (byte)(3), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40Acumulada, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavAcumulada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41PorcenEntrada, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPorcenentrada_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPorcenentrada_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorcenentrada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42PorcenAcumulada, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPorcenacumulada_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPorcenacumulada_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorcenacumulada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43Cantanyadida, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCantanyadida_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCantanyadida_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCantanyadida_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44Porcentaje, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorcentaje_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6018ProForFab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
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
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmardatos_Internalname = "BTNCONFIRMARDATOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divAcciones_Internalname = "ACCIONES" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavAnyadirproducto_Internalname = "vANYADIRPRODUCTO" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtPrdCanFin_Internalname = "PRDCANFIN" ;
      edtavAcumulada_Internalname = "vACUMULADA" ;
      edtavPorcenentrada_Internalname = "vPORCENENTRADA" ;
      edtavPorcenacumulada_Internalname = "vPORCENACUMULADA" ;
      edtavCantanyadida_Internalname = "vCANTANYADIDA" ;
      edtavPorcentaje_Internalname = "vPORCENTAJE" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForFab_Internalname = "PROFORFAB" ;
      edtPrdRGB_Internalname = "PRDRGB" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtavLanyad_Internalname = "vLANYAD" ;
      Dvelop_confirmpanel_confirmardatos_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMARDATOS" ;
      tblTabledvelop_confirmpanel_confirmardatos_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMARDATOS" ;
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
      edtPrdRGB_Jsonclick = "" ;
      edtProForFab_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtavPorcentaje_Jsonclick = "" ;
      edtavPorcentaje_Visible = -1 ;
      edtavPorcentaje_Enabled = 1 ;
      edtavCantanyadida_Jsonclick = "" ;
      edtavCantanyadida_Forecolor = (int)(0x000000) ;
      edtavCantanyadida_Visible = -1 ;
      edtavCantanyadida_Enabled = 1 ;
      edtavCantanyadida_Backcolor = -1 ;
      edtavPorcenacumulada_Jsonclick = "" ;
      edtavPorcenacumulada_Forecolor = (int)(0x000000) ;
      edtavPorcenacumulada_Visible = -1 ;
      edtavPorcenacumulada_Enabled = 1 ;
      edtavPorcenacumulada_Backcolor = -1 ;
      edtavPorcenentrada_Jsonclick = "" ;
      edtavPorcenentrada_Forecolor = (int)(0x000000) ;
      edtavPorcenentrada_Visible = -1 ;
      edtavPorcenentrada_Enabled = 1 ;
      edtavPorcenentrada_Backcolor = -1 ;
      edtavAcumulada_Jsonclick = "" ;
      edtavAcumulada_Visible = -1 ;
      edtavAcumulada_Enabled = 1 ;
      edtPrdCanFin_Jsonclick = "" ;
      edtPrdCant_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdDsc_Forecolor = (int)(0x000000) ;
      edtRecPrdDsc_Backcolor = -1 ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecLin_Jsonclick = "" ;
      edtRecLinPro_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtavAnyadirproducto_Jsonclick = "" ;
      edtavAnyadirproducto_Visible = -1 ;
      edtavAnyadirproducto_Enabled = 1 ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavLanyad_Jsonclick = "" ;
      edtavLanyad_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = ";;;;;;;;;L;L;L;L;L;L;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;;;;Cantidad;Cantidad;Cantidad;;;;;;;" ;
      Dvelop_confirmpanel_confirmardatos_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmardatos_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmardatos_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmardatos_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmardatos_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmardatos_Confirmationtext = "¿Confirmar Datos?" ;
      Dvelop_confirmpanel_confirmardatos_Title = "" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.CierreRecetasTinte_3_AnyadidasGetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic|Dynamic||" ;
      Ddo_grid_Includedatalist = "||T|T|T||" ;
      Ddo_grid_Filterisrange = "T|T||||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Character|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "7:RecLinPro|8:RecLin|9:RecPrdNum|10:RecPrdDsc|11:ForPrdDsc|12:PrdCant|13:PrdCanFin" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Pesaje Automativo v2", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Mantenimiento de Productos (Receta)", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV69FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121RS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV69FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171RS2',iparms:[{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999',hsh:true},{av:'A1797PrdCanAny',fld:'PRDCANANY',pic:'ZZZZZZ9.999'},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV68AnyadirProducto',fld:'vANYADIRPRODUCTO',pic:''},{av:'AV40Acumulada',fld:'vACUMULADA',pic:'ZZZZZZ9.999',hsh:true},{av:'edtavPorcenentrada_Enabled',ctrl:'vPORCENENTRADA',prop:'Enabled'},{av:'edtavPorcenentrada_Backcolor',ctrl:'vPORCENENTRADA',prop:'Backcolor'},{av:'edtavPorcenentrada_Forecolor',ctrl:'vPORCENENTRADA',prop:'Forecolor'},{av:'edtavPorcenacumulada_Enabled',ctrl:'vPORCENACUMULADA',prop:'Enabled'},{av:'edtavPorcenacumulada_Backcolor',ctrl:'vPORCENACUMULADA',prop:'Backcolor'},{av:'edtavPorcenacumulada_Forecolor',ctrl:'vPORCENACUMULADA',prop:'Forecolor'},{av:'edtavCantanyadida_Enabled',ctrl:'vCANTANYADIDA',prop:'Enabled'},{av:'edtavCantanyadida_Backcolor',ctrl:'vCANTANYADIDA',prop:'Backcolor'},{av:'edtavCantanyadida_Forecolor',ctrl:'vCANTANYADIDA',prop:'Forecolor'},{av:'edtRecPrdDsc_Backcolor',ctrl:'RECPRDDSC',prop:'Backcolor'},{av:'edtRecPrdDsc_Forecolor',ctrl:'RECPRDDSC',prop:'Forecolor'}]}");
      setEventMetadata("VANYADIRPRODUCTO.CLICK","{handler:'e181RS2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'},{av:'AV69FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9',hsh:true},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A6018ProForFab',fld:'PROFORFAB',pic:''}]");
      setEventMetadata("VANYADIRPRODUCTO.CLICK",",oparms:[]}");
      setEventMetadata("'DOCONFIRMARDATOS'","{handler:'e111RS1',iparms:[]");
      setEventMetadata("'DOCONFIRMARDATOS'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMARDATOS.CLOSE","{handler:'e131RS2',iparms:[{av:'Dvelop_confirmpanel_confirmardatos_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMARDATOS',prop:'Result'},{av:'AV43Cantanyadida',fld:'vCANTANYADIDA',grid:42,pic:'ZZZZZZ9.999'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_42',ctrl:'GRID',grid:42,prop:'GridRC',grid:42},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A1273RecLinPro',fld:'RECLINPRO',grid:42,pic:'Z9',hsh:true},{av:'A811RecLin',fld:'RECLIN',grid:42,pic:'ZZZ9',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'A872RecPrdNum',fld:'RECPRDNUM',grid:42,pic:'',hsh:true},{av:'A875RecPrdDsc',fld:'RECPRDDSC',grid:42,pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMARDATOS.CLOSE",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e141RS2',iparms:[{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV69FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV69FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV69FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV58BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV59BarCodReo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV60BarCodPar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV61RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9',hsh:true},{av:'AV69FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV73UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV71Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV65rectotkgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99',hsh:true},{av:'AV66recvolprd',fld:'vRECVOLPRD',pic:'ZZZZ9',hsh:true},{av:'AV67barnhdr',fld:'vBARNHDR',pic:'',hsh:true},{av:'AV81HayAnyadidas',fld:'vHAYANYADIDAS',pic:'',hsh:true},{av:'AV64recfec',fld:'vRECFEC',pic:'',hsh:true},{av:'AV76flagM',fld:'vFLAGM',pic:'ZZZ9',hsh:true},{av:'AV77fechaCierre',fld:'vFECHACIERRE',pic:'',hsh:true},{av:'AV63Cc_almcod',fld:'vCC_ALMCOD',pic:'Z9',hsh:true},{av:'AV62Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV74consumos',fld:'vCONSUMOS',pic:'ZZZ9',hsh:true},{av:'AV75FecCieTin',fld:'vFECCIETIN',pic:'',hsh:true},{av:'AV96Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV36TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV37TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV45TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV46TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV47TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV48TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV49TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV50TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV51TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV52TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV53TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV54TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV55TFPrdCanFin',fld:'vTFPRDCANFIN',pic:'ZZZZZZ9.999'},{av:'AV56TFPrdCanFin_To',fld:'vTFPRDCANFIN_TO',pic:'ZZZZZZ9.999'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Prdrgb',iparms:[]");
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
      wcpOAV57EmprCod = "" ;
      wcpOAV60BarCodPar = "" ;
      wcpOAV75FecCieTin = GXutil.nullDate() ;
      wcpOAV62Maqcod = "" ;
      wcpOAV77fechaCierre = GXutil.nullDate() ;
      wcpOAV64recfec = GXutil.nullDate() ;
      wcpOAV65rectotkgm = DecimalUtil.ZERO ;
      wcpOAV67barnhdr = "" ;
      wcpOAV81HayAnyadidas = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_confirmardatos_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV57EmprCod = "" ;
      AV60BarCodPar = "" ;
      AV75FecCieTin = GXutil.nullDate() ;
      AV62Maqcod = "" ;
      AV77fechaCierre = GXutil.nullDate() ;
      AV64recfec = GXutil.nullDate() ;
      AV65rectotkgm = DecimalUtil.ZERO ;
      AV67barnhdr = "" ;
      AV81HayAnyadidas = "" ;
      AV96Pgmname = "" ;
      AV47TFRecPrdNum = "" ;
      AV48TFRecPrdNum_Sel = "" ;
      AV49TFRecPrdDsc = "" ;
      AV50TFRecPrdDsc_Sel = "" ;
      AV51TFForPrdDsc = "" ;
      AV52TFForPrdDsc_Sel = "" ;
      AV53TFPrdCant = DecimalUtil.ZERO ;
      AV54TFPrdCant_To = DecimalUtil.ZERO ;
      AV55TFPrdCanFin = DecimalUtil.ZERO ;
      AV56TFPrdCanFin_To = DecimalUtil.ZERO ;
      AV69FecPan = GXutil.nullDate() ;
      AV73UsurCod = "" ;
      AV71Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wcveranyadidas__Component = "" ;
      OldWcveranyadidas_ = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnconfirmardatos_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV68AnyadirProducto = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A488ForPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      AV40Acumulada = DecimalUtil.ZERO ;
      AV41PorcenEntrada = DecimalUtil.ZERO ;
      AV42PorcenAcumulada = DecimalUtil.ZERO ;
      AV43Cantanyadida = DecimalUtil.ZERO ;
      AV44Porcentaje = DecimalUtil.ZERO ;
      A766ProForDsc = "" ;
      A6018ProForFab = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV47TFRecPrdNum = "" ;
      lV49TFRecPrdDsc = "" ;
      lV51TFForPrdDsc = "" ;
      H01RS2_A719PrdNum = new String[] {""} ;
      H01RS2_n719PrdNum = new boolean[] {false} ;
      H01RS2_A764ProForCod = new String[] {""} ;
      H01RS2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RS2_A13232PrdRGB = new long[1] ;
      H01RS2_A6018ProForFab = new String[] {""} ;
      H01RS2_n6018ProForFab = new boolean[] {false} ;
      H01RS2_A766ProForDsc = new String[] {""} ;
      H01RS2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RS2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01RS2_A488ForPrdDsc = new String[] {""} ;
      H01RS2_n488ForPrdDsc = new boolean[] {false} ;
      H01RS2_A875RecPrdDsc = new String[] {""} ;
      H01RS2_A872RecPrdNum = new String[] {""} ;
      H01RS2_A811RecLin = new short[1] ;
      H01RS2_A1273RecLinPro = new byte[1] ;
      H01RS2_A490ForPrdUMe = new byte[1] ;
      H01RS2_n490ForPrdUMe = new boolean[] {false} ;
      H01RS2_A2804RecLinMaq = new short[1] ;
      H01RS2_A130BarCodPar = new String[] {""} ;
      H01RS2_A132BarCodReo = new byte[1] ;
      H01RS2_A129BarCod = new int[1] ;
      H01RS2_A396EmprCod = new String[] {""} ;
      A719PrdNum = "" ;
      A764ProForCod = "" ;
      H01RS3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV72EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int8 = new short[1] ;
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV78Inc_obs = "" ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState16 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_confirmardatos = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.cierrerecetastinte_3_anyadidas__default(),
         new Object[] {
             new Object[] {
            H01RS2_A719PrdNum, H01RS2_n719PrdNum, H01RS2_A764ProForCod, H01RS2_A1797PrdCanAny, H01RS2_A13232PrdRGB, H01RS2_A6018ProForFab, H01RS2_n6018ProForFab, H01RS2_A766ProForDsc, H01RS2_A683PrdCanFin, H01RS2_A686PrdCant,
            H01RS2_A488ForPrdDsc, H01RS2_n488ForPrdDsc, H01RS2_A875RecPrdDsc, H01RS2_A872RecPrdNum, H01RS2_A811RecLin, H01RS2_A1273RecLinPro, H01RS2_A490ForPrdUMe, H01RS2_n490ForPrdUMe, H01RS2_A2804RecLinMaq, H01RS2_A130BarCodPar,
            H01RS2_A132BarCodReo, H01RS2_A129BarCod, H01RS2_A396EmprCod
            }
            , new Object[] {
            H01RS3_AGRID_nRecordCount
            }
         }
      );
      AV96Pgmname = "FormulacionTinte.CierreRecetasTinte_3_Anyadidas" ;
      /* GeneXus formulas. */
      AV96Pgmname = "FormulacionTinte.CierreRecetasTinte_3_Anyadidas" ;
      Gx_err = (short)(0) ;
      edtavAnyadirproducto_Enabled = 0 ;
      edtavAcumulada_Enabled = 0 ;
      edtavPorcentaje_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcveranyadidas_ = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV59BarCodReo ;
   private byte wcpOAV63Cc_almcod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV59BarCodReo ;
   private byte AV63Cc_almcod ;
   private byte AV36TFRecLinPro ;
   private byte AV37TFRecLinPro_To ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A490ForPrdUMe ;
   private byte A1273RecLinPro ;
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
   private short wcpOAV61RecLinMaq ;
   private short wcpOAV74consumos ;
   private short wcpOAV76flagM ;
   private short AV61RecLinMaq ;
   private short AV74consumos ;
   private short AV76flagM ;
   private short AV12OrderedBy ;
   private short AV45TFRecLin ;
   private short AV46TFRecLin_To ;
   private short wbEnd ;
   private short wbStart ;
   private short AV80lanyad ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV88R ;
   private short GXv_int8[] ;
   private short AV86G ;
   private short GXv_int9[] ;
   private short AV84B ;
   private short GXv_int10[] ;
   private short AV89R2 ;
   private short GXv_int11[] ;
   private short AV87G2 ;
   private short GXv_int12[] ;
   private short AV85B2 ;
   private short GXv_int13[] ;
   private int wcpOAV58BarCod ;
   private int wcpOAV66recvolprd ;
   private int nRC_GXsfl_42 ;
   private int subGrid_Rows ;
   private int AV58BarCod ;
   private int AV66recvolprd ;
   private int nGXsfl_42_idx=1 ;
   private int edtavPgmname_Enabled ;
   private int edtavLanyad_Visible ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavAnyadirproducto_Enabled ;
   private int edtavAcumulada_Enabled ;
   private int edtavPorcentaje_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtavPorcenentrada_Enabled ;
   private int edtavPorcenentrada_Backcolor ;
   private int edtavPorcenentrada_Forecolor ;
   private int edtavPorcenacumulada_Enabled ;
   private int edtavPorcenacumulada_Backcolor ;
   private int edtavPorcenacumulada_Forecolor ;
   private int edtavCantanyadida_Enabled ;
   private int edtavCantanyadida_Backcolor ;
   private int edtavCantanyadida_Forecolor ;
   private int edtRecPrdDsc_Backcolor ;
   private int edtRecPrdDsc_Forecolor ;
   private int nGXsfl_42_fel_idx=1 ;
   private int AV98GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavAnyadirproducto_Visible ;
   private int edtavAcumulada_Visible ;
   private int edtavPorcenentrada_Visible ;
   private int edtavPorcenacumulada_Visible ;
   private int edtavCantanyadida_Visible ;
   private int edtavPorcentaje_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A13232PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV83PrdRgb ;
   private java.math.BigDecimal wcpOAV65rectotkgm ;
   private java.math.BigDecimal AV65rectotkgm ;
   private java.math.BigDecimal AV53TFPrdCant ;
   private java.math.BigDecimal AV54TFPrdCant_To ;
   private java.math.BigDecimal AV55TFPrdCanFin ;
   private java.math.BigDecimal AV56TFPrdCanFin_To ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal AV40Acumulada ;
   private java.math.BigDecimal AV41PorcenEntrada ;
   private java.math.BigDecimal AV42PorcenAcumulada ;
   private java.math.BigDecimal AV43Cantanyadida ;
   private java.math.BigDecimal AV44Porcentaje ;
   private String wcpOAV57EmprCod ;
   private String wcpOAV60BarCodPar ;
   private String wcpOAV62Maqcod ;
   private String wcpOAV67barnhdr ;
   private String wcpOAV81HayAnyadidas ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_confirmardatos_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV57EmprCod ;
   private String AV60BarCodPar ;
   private String AV62Maqcod ;
   private String AV67barnhdr ;
   private String AV81HayAnyadidas ;
   private String sGXsfl_42_idx="0001" ;
   private String AV96Pgmname ;
   private String AV47TFRecPrdNum ;
   private String AV48TFRecPrdNum_Sel ;
   private String AV49TFRecPrdDsc ;
   private String AV50TFRecPrdDsc_Sel ;
   private String AV51TFForPrdDsc ;
   private String AV52TFForPrdDsc_Sel ;
   private String AV73UsurCod ;
   private String AV71Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_confirmardatos_Title ;
   private String Dvelop_confirmpanel_confirmardatos_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmardatos_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmardatos_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmardatos_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmardatos_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmardatos_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String WebComp_Wcveranyadidas__Component ;
   private String OldWcveranyadidas_ ;
   private String divAcciones_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnconfirmardatos_Internalname ;
   private String bttBtnconfirmardatos_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtavLanyad_Internalname ;
   private String edtavLanyad_Jsonclick ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV68AnyadirProducto ;
   private String edtavAnyadirproducto_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String edtRecLin_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtPrdCant_Internalname ;
   private String edtPrdCanFin_Internalname ;
   private String edtavAcumulada_Internalname ;
   private String edtavPorcenentrada_Internalname ;
   private String edtavPorcenacumulada_Internalname ;
   private String edtavCantanyadida_Internalname ;
   private String edtavPorcentaje_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String A6018ProForFab ;
   private String edtProForFab_Internalname ;
   private String edtPrdRGB_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV47TFRecPrdNum ;
   private String lV49TFRecPrdDsc ;
   private String lV51TFForPrdDsc ;
   private String A719PrdNum ;
   private String A764ProForCod ;
   private String hsh ;
   private String AV72EmprNom ;
   private String sGXsfl_42_fel_idx="0001" ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_confirmardatos_Internalname ;
   private String Dvelop_confirmpanel_confirmardatos_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavAnyadirproducto_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtPrdCanFin_Jsonclick ;
   private String edtavAcumulada_Jsonclick ;
   private String edtavPorcenentrada_Jsonclick ;
   private String edtavPorcenacumulada_Jsonclick ;
   private String edtavCantanyadida_Jsonclick ;
   private String edtavPorcentaje_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForFab_Jsonclick ;
   private String edtPrdRGB_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV75FecCieTin ;
   private java.util.Date wcpOAV77fechaCierre ;
   private java.util.Date wcpOAV64recfec ;
   private java.util.Date AV75FecCieTin ;
   private java.util.Date AV77fechaCierre ;
   private java.util.Date AV64recfec ;
   private java.util.Date AV69FecPan ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean bGXsfl_42_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n6018ProForFab ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcveranyadidas_ ;
   private boolean gx_refresh_fired ;
   private String AV78Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcveranyadidas_ ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmardatos ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01RS2_A719PrdNum ;
   private boolean[] H01RS2_n719PrdNum ;
   private String[] H01RS2_A764ProForCod ;
   private java.math.BigDecimal[] H01RS2_A1797PrdCanAny ;
   private long[] H01RS2_A13232PrdRGB ;
   private String[] H01RS2_A6018ProForFab ;
   private boolean[] H01RS2_n6018ProForFab ;
   private String[] H01RS2_A766ProForDsc ;
   private java.math.BigDecimal[] H01RS2_A683PrdCanFin ;
   private java.math.BigDecimal[] H01RS2_A686PrdCant ;
   private String[] H01RS2_A488ForPrdDsc ;
   private boolean[] H01RS2_n488ForPrdDsc ;
   private String[] H01RS2_A875RecPrdDsc ;
   private String[] H01RS2_A872RecPrdNum ;
   private short[] H01RS2_A811RecLin ;
   private byte[] H01RS2_A1273RecLinPro ;
   private byte[] H01RS2_A490ForPrdUMe ;
   private boolean[] H01RS2_n490ForPrdUMe ;
   private short[] H01RS2_A2804RecLinMaq ;
   private String[] H01RS2_A130BarCodPar ;
   private byte[] H01RS2_A132BarCodReo ;
   private int[] H01RS2_A129BarCod ;
   private String[] H01RS2_A396EmprCod ;
   private long[] H01RS3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState16[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class cierrerecetastinte_3_anyadidas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01RS2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV36TFRecLinPro ,
                                          byte AV37TFRecLinPro_To ,
                                          short AV45TFRecLin ,
                                          short AV46TFRecLin_To ,
                                          String AV48TFRecPrdNum_Sel ,
                                          String AV47TFRecPrdNum ,
                                          String AV50TFRecPrdDsc_Sel ,
                                          String AV49TFRecPrdDsc ,
                                          String AV52TFForPrdDsc_Sel ,
                                          String AV51TFForPrdDsc ,
                                          java.math.BigDecimal AV53TFPrdCant ,
                                          java.math.BigDecimal AV54TFPrdCant_To ,
                                          java.math.BigDecimal AV55TFPrdCanFin ,
                                          java.math.BigDecimal AV56TFPrdCanFin_To ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV57EmprCod ,
                                          int AV58BarCod ,
                                          byte AV59BarCodReo ,
                                          String AV60BarCodPar ,
                                          short AV61RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[24];
      Object[] GXv_Object18 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.PrdNum, T4.ProForCod, T1.PrdCanAny, T2.PrdRGB, T5.ProForFab, T5.ProForDsc, T1.PrdCanFin, T1.PrdCant, T3.ForPrdDsc, T1.RecPrdDsc, T1.RecPrdNum," ;
      sSelectString += " T1.RecLin, T1.RecLinPro, T1.ForPrdUMe, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      sFromString += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND" ;
      sFromString += " T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      if ( ! (0==AV36TFRecLinPro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( ! (0==AV37TFRecLinPro_To) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( ! (0==AV45TFRecLin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV46TFRecLin_To) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFRecPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFRecPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFRecPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFRecPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFRecPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFRecPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFForPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFForPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFForPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdCant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdCant_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdCanFin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCanFin_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLinPro" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLinPro DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCanFin" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCanFin DESC" ;
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

   protected Object[] conditional_H01RS3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV36TFRecLinPro ,
                                          byte AV37TFRecLinPro_To ,
                                          short AV45TFRecLin ,
                                          short AV46TFRecLin_To ,
                                          String AV48TFRecPrdNum_Sel ,
                                          String AV47TFRecPrdNum ,
                                          String AV50TFRecPrdDsc_Sel ,
                                          String AV49TFRecPrdDsc ,
                                          String AV52TFForPrdDsc_Sel ,
                                          String AV51TFForPrdDsc ,
                                          java.math.BigDecimal AV53TFPrdCant ,
                                          java.math.BigDecimal AV54TFPrdCant_To ,
                                          java.math.BigDecimal AV55TFPrdCanFin ,
                                          java.math.BigDecimal AV56TFPrdCanFin_To ,
                                          byte A1273RecLinPro ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          String A488ForPrdDsc ,
                                          java.math.BigDecimal A686PrdCant ,
                                          java.math.BigDecimal A683PrdCanFin ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV57EmprCod ,
                                          int AV58BarCod ,
                                          byte AV59BarCodReo ,
                                          String AV60BarCodPar ,
                                          short AV61RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[19];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      addWhere(sWhereString, "(Not (rtrim(T1.RecPrdNum) IS NULL AND NOT(T1.RecPrdNum IS NULL)))");
      if ( ! (0==AV36TFRecLinPro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (0==AV37TFRecLinPro_To) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (0==AV45TFRecLin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV46TFRecLin_To) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV48TFRecPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV47TFRecPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV48TFRecPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV50TFRecPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV49TFRecPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV50TFRecPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV52TFForPrdDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV51TFForPrdDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV52TFForPrdDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV53TFPrdCant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFPrdCant_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFPrdCanFin)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV56TFPrdCanFin_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCanFin <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
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
                  return conditional_H01RS2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() );
            case 1 :
                  return conditional_H01RS3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , ((Number) dynConstraints[2]).shortValue() , ((Number) dynConstraints[3]).shortValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).shortValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01RS2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01RS3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(3,3);
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,3);
               ((String[]) buf[10])[0] = rslt.getString(9, 5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 26);
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((String[]) buf[22])[0] = rslt.getString(19, 3);
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
                  stmt.setString(sIdx, (String)parms[24], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[28]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 3);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[21]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 26);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 3);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 3);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 3);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 3);
               }
               return;
      }
   }

}

