package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class disalb____ww_impl extends GXDataArea
{
   public disalb____ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public disalb____ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( disalb____ww_impl.class ));
   }

   public disalb____ww_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbruni = new HTMLChoice();
      cmbavAlbrreo = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbavDisest = new HTMLChoice();
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
               AV63CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63CliCod), "ZZZZZ9")));
               AV64CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV64CliNom", AV64CliNom);
               AV65DisArtCod = httpContext.GetPar( "DisArtCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65DisArtCod", AV65DisArtCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65DisArtCod, ""))));
               AV66DisArtDsc = httpContext.GetPar( "DisArtDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66DisArtDsc", AV66DisArtDsc);
               AV67DisFec = localUtil.parseDateParm( httpContext.GetPar( "DisFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67DisFec", localUtil.format(AV67DisFec, "99/99/99"));
               AV68DisUnimed = httpContext.GetPar( "DisUnimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68DisUnimed", AV68DisUnimed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68DisUnimed, "@!"))));
               AV96Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV96Cod_Idtx", AV96Cod_Idtx);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_IDTX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96Cod_Idtx, ""))));
               AV97DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV97DisEst", GXutil.str( AV97DisEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97DisEst), "9")));
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
      nRC_GXsfl_120 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_120"))) ;
      nGXsfl_120_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_120_idx"))) ;
      sGXsfl_120_idx = httpContext.GetPar( "sGXsfl_120_idx") ;
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
      A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      AV24TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV25TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV27TFAlbRReo_Sels);
      AV28TFAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt"), ".") ;
      AV29TFAlbRUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt_To"), ".") ;
      AV30TFAlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti"), ".") ;
      AV31TFAlbRUniUti_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33TFAlbRUni_Sels);
      AV34TFAlbRPieEnt = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt"))) ;
      AV35TFAlbRPieEnt_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt_To"))) ;
      AV36TFAlbRPieUti = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti"))) ;
      AV37TFAlbRPieUti_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti_To"))) ;
      AV38TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV39TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV40TFKilos = CommonUtil.decimalVal( httpContext.GetPar( "TFKilos"), ".") ;
      AV41TFKilos_To = CommonUtil.decimalVal( httpContext.GetPar( "TFKilos_To"), ".") ;
      AV42TFMetros = CommonUtil.decimalVal( httpContext.GetPar( "TFMetros"), ".") ;
      AV43TFMetros_To = CommonUtil.decimalVal( httpContext.GetPar( "TFMetros_To"), ".") ;
      AV44TFPiezas = (int)(GXutil.lval( httpContext.GetPar( "TFPiezas"))) ;
      AV45TFPiezas_To = (int)(GXutil.lval( httpContext.GetPar( "TFPiezas_To"))) ;
      AV46TFAlbRLote = httpContext.GetPar( "TFAlbRLote") ;
      AV47TFAlbRLote_Sel = httpContext.GetPar( "TFAlbRLote_Sel") ;
      AV48TFAlbRTelar = httpContext.GetPar( "TFAlbRTelar") ;
      AV49TFAlbRTelar_Sel = httpContext.GetPar( "TFAlbRTelar_Sel") ;
      AV50TFAlbRLu = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRLu"), ".") ;
      AV51TFAlbRLu_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRLu_To"), ".") ;
      AV52TFAlbRMdlCod = httpContext.GetPar( "TFAlbRMdlCod") ;
      AV53TFAlbRMdlCod_Sel = httpContext.GetPar( "TFAlbRMdlCod_Sel") ;
      AV54TFAlbRTara = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRTara"), ".") ;
      AV55TFAlbRTara_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRTara_To"), ".") ;
      AV56TFAlbMaqTej = httpContext.GetPar( "TFAlbMaqTej") ;
      AV57TFAlbMaqTej_Sel = httpContext.GetPar( "TFAlbMaqTej_Sel") ;
      AV107Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV90TotKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotKilos"), ".") ;
      AV92TotMetros = CommonUtil.decimalVal( httpContext.GetPar( "TotMetros"), ".") ;
      AV94TotPiezas = GXutil.lval( httpContext.GetPar( "TotPiezas")) ;
      cmbavDisest.fromJSonString( httpContext.GetNextPar( ));
      AV97DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
      AV68DisUnimed = httpContext.GetPar( "DisUnimed") ;
      AV79AlbRfeni = localUtil.parseDateParm( httpContext.GetPar( "AlbRfeni")) ;
      AV81Albrfenf = localUtil.parseDateParm( httpContext.GetPar( "Albrfenf")) ;
      AV96Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
      AV63CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV65DisArtCod = httpContext.GetPar( "DisArtCod") ;
      AV104Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV27TFAlbRReo_Sels, AV28TFAlbRUniEnt, AV29TFAlbRUniEnt_To, AV30TFAlbRUniUti, AV31TFAlbRUniUti_To, AV33TFAlbRUni_Sels, AV34TFAlbRPieEnt, AV35TFAlbRPieEnt_To, AV36TFAlbRPieUti, AV37TFAlbRPieUti_To, AV38TFAlbRef, AV39TFAlbRef_Sel, AV40TFKilos, AV41TFKilos_To, AV42TFMetros, AV43TFMetros_To, AV44TFPiezas, AV45TFPiezas_To, AV46TFAlbRLote, AV47TFAlbRLote_Sel, AV48TFAlbRTelar, AV49TFAlbRTelar_Sel, AV50TFAlbRLu, AV51TFAlbRLu_To, AV52TFAlbRMdlCod, AV53TFAlbRMdlCod_Sel, AV54TFAlbRTara, AV55TFAlbRTara_To, AV56TFAlbMaqTej, AV57TFAlbMaqTej_Sel, AV107Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90TotKilos, AV92TotMetros, AV94TotPiezas, AV97DisEst, AV68DisUnimed, AV79AlbRfeni, AV81Albrfenf, AV96Cod_Idtx, AV63CliCod, AV65DisArtCod, AV104Moda21) ;
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
      pa2902( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2902( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.disalb____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV64CliNom)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV66DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV67DisFec)),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed)),GXutil.URLEncode(GXutil.rtrim(AV96Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(AV97DisEst,1,0))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKILOS", getSecureSignedToken( "", localUtil.format( AV90TotKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETROS", getSecureSignedToken( "", localUtil.format( AV92TotMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEZAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94TotPiezas), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENI", getSecureSignedToken( "", AV79AlbRfeni));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENF", getSecureSignedToken( "", AV81Albrfenf));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65DisArtCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68DisUnimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_IDTX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96Cod_Idtx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97DisEst), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb____WW");
      forbiddenHiddens.add("Moda21", localUtil.format( DecimalUtil.doubleToDec(AV104Moda21), "ZZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV107Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disalb____ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_120", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_120, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV58DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV24TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV25TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRREO_SELS", AV27TFAlbRReo_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRREO_SELS", AV27TFAlbRReo_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV28TFAlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV29TFAlbRUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV30TFAlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI_TO", GXutil.ltrim( localUtil.ntoc( AV31TFAlbRUniUti_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV33TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV33TFAlbRUni_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV34TFAlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT_TO", GXutil.ltrim( localUtil.ntoc( AV35TFAlbRPieEnt_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV36TFAlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI_TO", GXutil.ltrim( localUtil.ntoc( AV37TFAlbRPieUti_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV38TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV39TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFKILOS", GXutil.ltrim( localUtil.ntoc( AV40TFKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFKILOS_TO", GXutil.ltrim( localUtil.ntoc( AV41TFKilos_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETROS", GXutil.ltrim( localUtil.ntoc( AV42TFMetros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMETROS_TO", GXutil.ltrim( localUtil.ntoc( AV43TFMetros_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPIEZAS", GXutil.ltrim( localUtil.ntoc( AV44TFPiezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPIEZAS_TO", GXutil.ltrim( localUtil.ntoc( AV45TFPiezas_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRLOTE", GXutil.rtrim( AV46TFAlbRLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRLOTE_SEL", GXutil.rtrim( AV47TFAlbRLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRTELAR", GXutil.rtrim( AV48TFAlbRTelar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRTELAR_SEL", GXutil.rtrim( AV49TFAlbRTelar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRLU", GXutil.ltrim( localUtil.ntoc( AV50TFAlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRLU_TO", GXutil.ltrim( localUtil.ntoc( AV51TFAlbRLu_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRMDLCOD", GXutil.rtrim( AV52TFAlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRMDLCOD_SEL", GXutil.rtrim( AV53TFAlbRMdlCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRTARA", GXutil.ltrim( localUtil.ntoc( AV54TFAlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRTARA_TO", GXutil.ltrim( localUtil.ntoc( AV55TFAlbRTara_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBMAQTEJ", GXutil.rtrim( AV56TFAlbMaqTej));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBMAQTEJ_SEL", GXutil.rtrim( AV57TFAlbMaqTej_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKILOS", GXutil.ltrim( localUtil.ntoc( AV90TotKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKILOS", getSecureSignedToken( "", localUtil.format( AV90TotKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETROS", GXutil.ltrim( localUtil.ntoc( AV92TotMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETROS", getSecureSignedToken( "", localUtil.format( AV92TotMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTPIEZAS", GXutil.ltrim( localUtil.ntoc( AV94TotPiezas, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEZAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94TotPiezas), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISUNIMED", GXutil.rtrim( AV68DisUnimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68DisUnimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV77Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV86Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENI", localUtil.dtoc( AV79AlbRfeni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENI", getSecureSignedToken( "", AV79AlbRfeni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENF", localUtil.dtoc( AV81Albrfenf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENF", getSecureSignedToken( "", AV81Albrfenf));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOD_IDTX", GXutil.rtrim( AV96Cod_Idtx));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_IDTX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96Cod_Idtx, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Width", GXutil.rtrim( Dvpanel_tablepedido_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autowidth", GXutil.booltostr( Dvpanel_tablepedido_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoheight", GXutil.booltostr( Dvpanel_tablepedido_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Cls", GXutil.rtrim( Dvpanel_tablepedido_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Title", GXutil.rtrim( Dvpanel_tablepedido_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsible", GXutil.booltostr( Dvpanel_tablepedido_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Collapsed", GXutil.booltostr( Dvpanel_tablepedido_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablepedido_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Iconposition", GXutil.rtrim( Dvpanel_tablepedido_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEPEDIDO_Autoscroll", GXutil.booltostr( Dvpanel_tablepedido_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
         we2902( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2902( ) ;
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
      return formatLink("app.pedidos.disalb____ww", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV63CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV64CliNom)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim(AV66DisArtDsc)),GXutil.URLEncode(GXutil.formatDateParm(AV67DisFec)),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed)),GXutil.URLEncode(GXutil.rtrim(AV96Cod_Idtx)),GXutil.URLEncode(GXutil.ltrimstr(AV97DisEst,1,0))}, new String[] {"EmprCod","DisCod","CliCod","CliNom","DisArtCod","DisArtDsc","DisFec","DisUnimed","Cod_Idtx","DisEst"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.DisAlb____WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entrada de Almacén", "") ;
   }

   public void wb2900( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablepedido.setProperty("Width", Dvpanel_tablepedido_Width);
         ucDvpanel_tablepedido.setProperty("AutoWidth", Dvpanel_tablepedido_Autowidth);
         ucDvpanel_tablepedido.setProperty("AutoHeight", Dvpanel_tablepedido_Autoheight);
         ucDvpanel_tablepedido.setProperty("Cls", Dvpanel_tablepedido_Cls);
         ucDvpanel_tablepedido.setProperty("Title", Dvpanel_tablepedido_Title);
         ucDvpanel_tablepedido.setProperty("Collapsible", Dvpanel_tablepedido_Collapsible);
         ucDvpanel_tablepedido.setProperty("Collapsed", Dvpanel_tablepedido_Collapsed);
         ucDvpanel_tablepedido.setProperty("ShowCollapseIcon", Dvpanel_tablepedido_Showcollapseicon);
         ucDvpanel_tablepedido.setProperty("IconPosition", Dvpanel_tablepedido_Iconposition);
         ucDvpanel_tablepedido.setProperty("AutoScroll", Dvpanel_tablepedido_Autoscroll);
         ucDvpanel_tablepedido.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablepedido_Internalname, "DVPANEL_TABLEPEDIDOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEPEDIDOContainer"+"TablePedido"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepedido_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisCod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtDisCod_Internalname, httpContext.getMessage( "Nº Disp. Int.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisfec_Internalname, httpContext.getMessage( "Fecha", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         httpContext.writeText( "<div id=\""+edtavDisfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisfec_Internalname, localUtil.format(AV67DisFec, "99/99/99"), localUtil.format( AV67DisFec, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDisfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavDisfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV63CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV63CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV64CliNom), GXutil.rtrim( localUtil.format( AV64CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisartcod_Internalname, httpContext.getMessage( "Articulo", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartcod_Internalname, GXutil.rtrim( AV65DisArtCod), GXutil.rtrim( localUtil.format( AV65DisArtCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartcod_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisartdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisartdsc_Internalname, httpContext.getMessage( "Descripcion", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisartdsc_Internalname, GXutil.rtrim( AV66DisArtDsc), GXutil.rtrim( localUtil.format( AV66DisArtDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisartdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisartdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModa21_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavModa21_Internalname, httpContext.getMessage( "Moda 21", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModa21_Internalname, GXutil.ltrim( localUtil.ntoc( AV104Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavModa21_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV104Moda21), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV104Moda21), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModa21_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModa21_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedalbreccod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockalbreccod_Internalname, httpContext.getMessage( "N Recepcion", ""), "", "", lblTextblockalbreccod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_61_2902( true) ;
      }
      else
      {
         wb_table1_61_2902( false) ;
      }
      return  ;
   }

   public void wb_table1_61_2902e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrunient_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrunient_Internalname, httpContext.getMessage( "Unds. Ent.", ""), "col-sm-2 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-10 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrunient_Internalname, GXutil.ltrim( localUtil.ntoc( AV72AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrunient_Enabled!=0) ? localUtil.format( AV72AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( AV72AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrunient_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrunient_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbruniuti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbruniuti_Internalname, httpContext.getMessage( "Unds. Uti.", ""), "col-sm-2 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-10 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbruniuti_Internalname, GXutil.ltrim( localUtil.ntoc( AV73AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbruniuti_Enabled!=0) ? localUtil.format( AV73AlbRUniUti, "ZZZZZ9.99") : localUtil.format( AV73AlbRUniUti, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbruniuti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbruniuti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbruni.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbruni.getInternalname(), httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbruni, cmbavAlbruni.getInternalname(), GXutil.rtrim( AV74AlbRUni), 1, cmbavAlbruni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbruni.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "", true, (byte)(0), "HLP_Pedidos\\DisAlb____WW.htm");
         cmbavAlbruni.setValue( GXutil.rtrim( AV74AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpieent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpieent_Internalname, httpContext.getMessage( "Pzs. Ent.", ""), "col-sm-2 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-10 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpieent_Internalname, GXutil.ltrim( localUtil.ntoc( AV75AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpieent_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV75AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV75AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpieent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpieent_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpieuti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpieuti_Internalname, httpContext.getMessage( "Pzs. Uti.", ""), "col-sm-2 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-10 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpieuti_Internalname, GXutil.ltrim( localUtil.ntoc( AV76AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpieuti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV76AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV76AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpieuti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpieuti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUnient_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUnient_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUnient_Internalname, GXutil.ltrim( localUtil.ntoc( AV82Unient, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( AV82Unient, "ZZZZZ9.99")), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUnient_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUnient_Enabled, 1, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPieent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPieent_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPieent_Internalname, GXutil.ltrim( localUtil.ntoc( AV83PieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV83PieEnt), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPieent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPieent_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavAlbpmppza_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbpmppza_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbpmppza_Internalname, httpContext.getMessage( "Peso 1 Pça", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbpmppza_Internalname, GXutil.ltrim( localUtil.ntoc( AV103AlbPmPPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbpmppza_Enabled!=0) ? localUtil.format( AV103AlbPmPPza, "Z9.999") : localUtil.format( AV103AlbPmPPza, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbpmppza_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavAlbpmppza_Visible, edtavAlbpmppza_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbrreo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbrreo.getInternalname(), httpContext.getMessage( "Rc?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbrreo, cmbavAlbrreo.getInternalname(), GXutil.rtrim( AV89AlbRReo), 1, cmbavAlbrreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbrreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,105);\"", "", true, (byte)(0), "HLP_Pedidos\\DisAlb____WW.htm");
         cmbavAlbrreo.setValue( GXutil.rtrim( AV89AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrreo.getInternalname(), "Values", cmbavAlbrreo.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 120, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtnenter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 120, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol120( ) ;
      }
      if ( wbEnd == 120 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_120 = (int)(nGXsfl_120_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_141_2902( true) ;
      }
      else
      {
         wb_table2_141_2902( false) ;
      }
      return  ;
   }

   public void wb_table2_141_2902e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV107Pgmname), GXutil.rtrim( localUtil.format( AV107Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable1_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable1_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrec_Internalname, httpContext.getMessage( "albrec", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrec_Internalname, GXutil.ltrim( localUtil.ntoc( AV87albrec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV87albrec), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV87albrec), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,183);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrec_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDisalb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDisalb_Internalname, httpContext.getMessage( "disalb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDisalb_Internalname, GXutil.ltrim( localUtil.ntoc( AV98disalb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDisalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV98disalb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV98disalb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,187);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDisalb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDisalb_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_albrec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_albrec_Internalname, httpContext.getMessage( "Clicod_albrec", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_albrec_Internalname, GXutil.ltrim( localUtil.ntoc( AV84Clicod_albrec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_albrec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84Clicod_albrec), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV84Clicod_albrec), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_albrec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_albrec_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV58DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDisest, cmbavDisest.getInternalname(), GXutil.trim( GXutil.str( AV97DisEst, 1, 0)), 1, cmbavDisest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDisest.getVisible(), 0, 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_Pedidos\\DisAlb____WW.htm");
         cmbavDisest.setValue( GXutil.trim( GXutil.str( AV97DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Values", cmbavDisest.ToJavascriptSource(), true);
         wb_table3_198_2902( true) ;
      }
      else
      {
         wb_table3_198_2902( false) ;
      }
      return  ;
   }

   public void wb_table3_198_2902e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_203_2902( true) ;
      }
      else
      {
         wb_table4_203_2902( false) ;
      }
      return  ;
   }

   public void wb_table4_203_2902e( boolean wbgen )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 120 )
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

   public void start2902( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Entrada de Almacén", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2900( ) ;
   }

   public void ws2902( )
   {
      start2902( ) ;
      evt2902( ) ;
   }

   public void evt2902( )
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
                           e112902 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122902 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132902 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e142902 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e152902 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMGBSC_PROMPTALMACEN'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImgBsc_PromptAlmacen' */
                           e162902 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRECCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172902 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
                           AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
                           AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
                           AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
                           AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
                           AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
                           AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
                           AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
                           AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
                           AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
                           AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
                           AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
                           AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
                           AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
                           AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
                           AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
                           AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
                           AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
                           AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
                           AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
                           AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
                           AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
                           AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
                           AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
                           AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
                           AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
                           AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
                           AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
                           AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
                           AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
                           AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
                           AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_120_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1202( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV62GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridActions), 4, 0));
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
                           cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
                           A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A595Kilos = localUtil.ctond( httpContext.cgiGet( edtKilos_Internalname)) ;
                           A631Metros = localUtil.ctond( httpContext.cgiGet( edtMetros_Internalname)) ;
                           A673Piezas = (int)(localUtil.ctol( httpContext.cgiGet( edtPiezas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6463AlbRLote = httpContext.cgiGet( edtAlbRLote_Internalname) ;
                           A6464AlbRTelar = httpContext.cgiGet( edtAlbRTelar_Internalname) ;
                           A6465AlbRLu = localUtil.ctond( httpContext.cgiGet( edtAlbRLu_Internalname)) ;
                           A4602AlbRMdlCod = httpContext.cgiGet( edtAlbRMdlCod_Internalname) ;
                           A6470AlbRTara = localUtil.ctond( httpContext.cgiGet( edtAlbRTara_Internalname)) ;
                           A8035AlbMaqTej = httpContext.cgiGet( edtAlbMaqTej_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e182902 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e192902 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e202902 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e212902 ();
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

   public void we2902( )
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

   public void pa2902( )
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
            GX_FocusControl = edtavModa21_Internalname ;
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
      subsflControlProps_1202( ) ;
      while ( nGXsfl_120_idx <= nRC_GXsfl_120 )
      {
         sendrow_1202( ) ;
         nGXsfl_120_idx = ((subGrid_Islastpage==1)&&(nGXsfl_120_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1202( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A361DisCod ,
                                 int AV24TFAlbRecCod ,
                                 int AV25TFAlbRecCod_To ,
                                 GXSimpleCollection<String> AV27TFAlbRReo_Sels ,
                                 java.math.BigDecimal AV28TFAlbRUniEnt ,
                                 java.math.BigDecimal AV29TFAlbRUniEnt_To ,
                                 java.math.BigDecimal AV30TFAlbRUniUti ,
                                 java.math.BigDecimal AV31TFAlbRUniUti_To ,
                                 GXSimpleCollection<String> AV33TFAlbRUni_Sels ,
                                 int AV34TFAlbRPieEnt ,
                                 int AV35TFAlbRPieEnt_To ,
                                 int AV36TFAlbRPieUti ,
                                 int AV37TFAlbRPieUti_To ,
                                 String AV38TFAlbRef ,
                                 String AV39TFAlbRef_Sel ,
                                 java.math.BigDecimal AV40TFKilos ,
                                 java.math.BigDecimal AV41TFKilos_To ,
                                 java.math.BigDecimal AV42TFMetros ,
                                 java.math.BigDecimal AV43TFMetros_To ,
                                 int AV44TFPiezas ,
                                 int AV45TFPiezas_To ,
                                 String AV46TFAlbRLote ,
                                 String AV47TFAlbRLote_Sel ,
                                 String AV48TFAlbRTelar ,
                                 String AV49TFAlbRTelar_Sel ,
                                 java.math.BigDecimal AV50TFAlbRLu ,
                                 java.math.BigDecimal AV51TFAlbRLu_To ,
                                 String AV52TFAlbRMdlCod ,
                                 String AV53TFAlbRMdlCod_Sel ,
                                 java.math.BigDecimal AV54TFAlbRTara ,
                                 java.math.BigDecimal AV55TFAlbRTara_To ,
                                 String AV56TFAlbMaqTej ,
                                 String AV57TFAlbMaqTej_Sel ,
                                 String AV107Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV90TotKilos ,
                                 java.math.BigDecimal AV92TotMetros ,
                                 long AV94TotPiezas ,
                                 byte AV97DisEst ,
                                 String AV68DisUnimed ,
                                 java.util.Date AV79AlbRfeni ,
                                 java.util.Date AV81Albrfenf ,
                                 String AV96Cod_Idtx ,
                                 int AV63CliCod ,
                                 String AV65DisArtCod ,
                                 short AV104Moda21 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e192902 ();
      GRID_nCurrentRecord = 0 ;
      rf2902( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb____WW");
      forbiddenHiddens.add("Moda21", localUtil.format( DecimalUtil.doubleToDec(AV104Moda21), "ZZZ9"));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV107Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\disalb____ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      if ( cmbavAlbruni.getItemCount() > 0 )
      {
         AV74AlbRUni = cmbavAlbruni.getValidValue(AV74AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRUni", AV74AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbruni.setValue( GXutil.rtrim( AV74AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), true);
      }
      if ( cmbavAlbrreo.getItemCount() > 0 )
      {
         AV89AlbRReo = cmbavAlbrreo.getValidValue(AV89AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRReo", AV89AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbrreo.setValue( GXutil.rtrim( AV89AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrreo.getInternalname(), "Values", cmbavAlbrreo.ToJavascriptSource(), true);
      }
      if ( cmbavDisest.getItemCount() > 0 )
      {
         AV97DisEst = (byte)(GXutil.lval( cmbavDisest.getValidValue(GXutil.trim( GXutil.str( AV97DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97DisEst", GXutil.str( AV97DisEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97DisEst), "9")));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDisest.setValue( GXutil.trim( GXutil.str( AV97DisEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Values", cmbavDisest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2902( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV107Pgmname = "Pedidos.DisAlb____WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Pgmname", AV107Pgmname);
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavDisartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      edtavDisartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      edtavModa21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModa21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModa21_Enabled), 5, 0), true);
      edtavAlbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunient_Enabled), 5, 0), true);
      edtavAlbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbruniuti_Enabled), 5, 0), true);
      cmbavAlbruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbruni.getEnabled(), 5, 0), true);
      edtavAlbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieent_Enabled), 5, 0), true);
      edtavAlbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieuti_Enabled), 5, 0), true);
      edtavAlbpmppza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpmppza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpmppza_Enabled), 5, 0), true);
      cmbavAlbrreo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrreo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbrreo.getEnabled(), 5, 0), true);
      edtavTotvaluekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilos_Enabled), 5, 0), true);
      edtavTotvaluemetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetros_Enabled), 5, 0), true);
      edtavTotvaluepiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluepiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepiezas_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavAlbrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrec_Enabled), 5, 0), true);
      edtavDisalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisalb_Enabled), 5, 0), true);
      edtavClicod_albrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_albrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_albrec_Enabled), 5, 0), true);
   }

   public void rf2902( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(120) ;
      /* Execute user event: Refresh */
      e192902 ();
      nGXsfl_120_idx = 1 ;
      sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1202( ) ;
      bGXsfl_120_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
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
         subsflControlProps_1202( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A55AlbRReo ,
                                              AV110Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                              A56AlbRUni ,
                                              AV115Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                              Integer.valueOf(AV108Pedidos_disalb____wwds_1_tfalbreccod) ,
                                              Integer.valueOf(AV109Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                              Integer.valueOf(AV110Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                              AV111Pedidos_disalb____wwds_4_tfalbrunient ,
                                              AV112Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                              AV113Pedidos_disalb____wwds_6_tfalbruniuti ,
                                              AV114Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                              Integer.valueOf(AV115Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                              Integer.valueOf(AV116Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                              Integer.valueOf(AV117Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                              Integer.valueOf(AV118Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                              Integer.valueOf(AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                              AV121Pedidos_disalb____wwds_14_tfalbref_sel ,
                                              AV120Pedidos_disalb____wwds_13_tfalbref ,
                                              AV122Pedidos_disalb____wwds_15_tfkilos ,
                                              AV123Pedidos_disalb____wwds_16_tfkilos_to ,
                                              AV124Pedidos_disalb____wwds_17_tfmetros ,
                                              AV125Pedidos_disalb____wwds_18_tfmetros_to ,
                                              Integer.valueOf(AV126Pedidos_disalb____wwds_19_tfpiezas) ,
                                              Integer.valueOf(AV127Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                              AV129Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                              AV128Pedidos_disalb____wwds_21_tfalbrlote ,
                                              AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                              AV130Pedidos_disalb____wwds_23_tfalbrtelar ,
                                              AV132Pedidos_disalb____wwds_25_tfalbrlu ,
                                              AV133Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                              AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                              AV134Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                              AV136Pedidos_disalb____wwds_29_tfalbrtara ,
                                              AV137Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                              AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                              AV138Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A58AlbRUniEnt ,
                                              A60AlbRUniUti ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              Integer.valueOf(A54AlbRPieUti) ,
                                              A45AlbRef ,
                                              A595Kilos ,
                                              A631Metros ,
                                              Integer.valueOf(A673Piezas) ,
                                              A6463AlbRLote ,
                                              A6464AlbRTelar ,
                                              A6465AlbRLu ,
                                              A4602AlbRMdlCod ,
                                              A6470AlbRTara ,
                                              A8035AlbMaqTej ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A361DisCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV120Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV120Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
         lV128Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV128Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
         lV130Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV130Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
         lV134Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV134Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
         lV138Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV138Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
         /* Using cursor H02902 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV108Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV109Pedidos_disalb____wwds_2_tfalbreccod_to), AV111Pedidos_disalb____wwds_4_tfalbrunient, AV112Pedidos_disalb____wwds_5_tfalbrunient_to, AV113Pedidos_disalb____wwds_6_tfalbruniuti, AV114Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV116Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV117Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV118Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV120Pedidos_disalb____wwds_13_tfalbref, AV121Pedidos_disalb____wwds_14_tfalbref_sel, AV122Pedidos_disalb____wwds_15_tfkilos, AV123Pedidos_disalb____wwds_16_tfkilos_to, AV124Pedidos_disalb____wwds_17_tfmetros, AV125Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV126Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV127Pedidos_disalb____wwds_20_tfpiezas_to), lV128Pedidos_disalb____wwds_21_tfalbrlote, AV129Pedidos_disalb____wwds_22_tfalbrlote_sel, lV130Pedidos_disalb____wwds_23_tfalbrtelar, AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV132Pedidos_disalb____wwds_25_tfalbrlu, AV133Pedidos_disalb____wwds_26_tfalbrlu_to, lV134Pedidos_disalb____wwds_27_tfalbrmdlcod, AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV136Pedidos_disalb____wwds_29_tfalbrtara, AV137Pedidos_disalb____wwds_30_tfalbrtara_to, lV138Pedidos_disalb____wwds_31_tfalbmaqtej, AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_120_idx = 1 ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1202( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A8035AlbMaqTej = H02902_A8035AlbMaqTej[0] ;
            A6470AlbRTara = H02902_A6470AlbRTara[0] ;
            A4602AlbRMdlCod = H02902_A4602AlbRMdlCod[0] ;
            A6465AlbRLu = H02902_A6465AlbRLu[0] ;
            A6464AlbRTelar = H02902_A6464AlbRTelar[0] ;
            A6463AlbRLote = H02902_A6463AlbRLote[0] ;
            A673Piezas = H02902_A673Piezas[0] ;
            A631Metros = H02902_A631Metros[0] ;
            A595Kilos = H02902_A595Kilos[0] ;
            A45AlbRef = H02902_A45AlbRef[0] ;
            A54AlbRPieUti = H02902_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H02902_A52AlbRPieEnt[0] ;
            A56AlbRUni = H02902_A56AlbRUni[0] ;
            A60AlbRUniUti = H02902_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H02902_A58AlbRUniEnt[0] ;
            A55AlbRReo = H02902_A55AlbRReo[0] ;
            A44AlbRecCod = H02902_A44AlbRecCod[0] ;
            A8035AlbMaqTej = H02902_A8035AlbMaqTej[0] ;
            A6470AlbRTara = H02902_A6470AlbRTara[0] ;
            A4602AlbRMdlCod = H02902_A4602AlbRMdlCod[0] ;
            A6465AlbRLu = H02902_A6465AlbRLu[0] ;
            A6464AlbRTelar = H02902_A6464AlbRTelar[0] ;
            A6463AlbRLote = H02902_A6463AlbRLote[0] ;
            A45AlbRef = H02902_A45AlbRef[0] ;
            A54AlbRPieUti = H02902_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H02902_A52AlbRPieEnt[0] ;
            A56AlbRUni = H02902_A56AlbRUni[0] ;
            A60AlbRUniUti = H02902_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H02902_A58AlbRUniEnt[0] ;
            A55AlbRReo = H02902_A55AlbRReo[0] ;
            e202902 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(120) ;
         wb2900( ) ;
      }
      bGXsfl_120_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2902( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTKILOS", GXutil.ltrim( localUtil.ntoc( AV90TotKilos, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKILOS", getSecureSignedToken( "", localUtil.format( AV90TotKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTMETROS", GXutil.ltrim( localUtil.ntoc( AV92TotMetros, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETROS", getSecureSignedToken( "", localUtil.format( AV92TotMetros, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTPIEZAS", GXutil.ltrim( localUtil.ntoc( AV94TotPiezas, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEZAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94TotPiezas), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENI", localUtil.dtoc( AV79AlbRfeni, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENI", getSecureSignedToken( "", AV79AlbRfeni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRFENF", localUtil.dtoc( AV81Albrfenf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENF", getSecureSignedToken( "", AV81Albrfenf));
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
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV110Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV115Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                           Integer.valueOf(AV108Pedidos_disalb____wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV109Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                           Integer.valueOf(AV110Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                           AV111Pedidos_disalb____wwds_4_tfalbrunient ,
                                           AV112Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                           AV113Pedidos_disalb____wwds_6_tfalbruniuti ,
                                           AV114Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                           Integer.valueOf(AV115Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV116Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV117Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV118Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                           AV121Pedidos_disalb____wwds_14_tfalbref_sel ,
                                           AV120Pedidos_disalb____wwds_13_tfalbref ,
                                           AV122Pedidos_disalb____wwds_15_tfkilos ,
                                           AV123Pedidos_disalb____wwds_16_tfkilos_to ,
                                           AV124Pedidos_disalb____wwds_17_tfmetros ,
                                           AV125Pedidos_disalb____wwds_18_tfmetros_to ,
                                           Integer.valueOf(AV126Pedidos_disalb____wwds_19_tfpiezas) ,
                                           Integer.valueOf(AV127Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                           AV129Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                           AV128Pedidos_disalb____wwds_21_tfalbrlote ,
                                           AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                           AV130Pedidos_disalb____wwds_23_tfalbrtelar ,
                                           AV132Pedidos_disalb____wwds_25_tfalbrlu ,
                                           AV133Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                           AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                           AV134Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                           AV136Pedidos_disalb____wwds_29_tfalbrtara ,
                                           AV137Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                           AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                           AV138Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A45AlbRef ,
                                           A595Kilos ,
                                           A631Metros ,
                                           Integer.valueOf(A673Piezas) ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A6465AlbRLu ,
                                           A4602AlbRMdlCod ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV120Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV120Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
      lV128Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV128Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
      lV130Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV130Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
      lV134Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV134Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
      lV138Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV138Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
      /* Using cursor H02903 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV108Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV109Pedidos_disalb____wwds_2_tfalbreccod_to), AV111Pedidos_disalb____wwds_4_tfalbrunient, AV112Pedidos_disalb____wwds_5_tfalbrunient_to, AV113Pedidos_disalb____wwds_6_tfalbruniuti, AV114Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV116Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV117Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV118Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV120Pedidos_disalb____wwds_13_tfalbref, AV121Pedidos_disalb____wwds_14_tfalbref_sel, AV122Pedidos_disalb____wwds_15_tfkilos, AV123Pedidos_disalb____wwds_16_tfkilos_to, AV124Pedidos_disalb____wwds_17_tfmetros, AV125Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV126Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV127Pedidos_disalb____wwds_20_tfpiezas_to), lV128Pedidos_disalb____wwds_21_tfalbrlote, AV129Pedidos_disalb____wwds_22_tfalbrlote_sel, lV130Pedidos_disalb____wwds_23_tfalbrtelar, AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV132Pedidos_disalb____wwds_25_tfalbrlu, AV133Pedidos_disalb____wwds_26_tfalbrlu_to, lV134Pedidos_disalb____wwds_27_tfalbrmdlcod, AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV136Pedidos_disalb____wwds_29_tfalbrtara, AV137Pedidos_disalb____wwds_30_tfalbrtara_to, lV138Pedidos_disalb____wwds_31_tfalbmaqtej, AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel});
      GRID_nRecordCount = H02903_AGRID_nRecordCount[0] ;
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
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV27TFAlbRReo_Sels, AV28TFAlbRUniEnt, AV29TFAlbRUniEnt_To, AV30TFAlbRUniUti, AV31TFAlbRUniUti_To, AV33TFAlbRUni_Sels, AV34TFAlbRPieEnt, AV35TFAlbRPieEnt_To, AV36TFAlbRPieUti, AV37TFAlbRPieUti_To, AV38TFAlbRef, AV39TFAlbRef_Sel, AV40TFKilos, AV41TFKilos_To, AV42TFMetros, AV43TFMetros_To, AV44TFPiezas, AV45TFPiezas_To, AV46TFAlbRLote, AV47TFAlbRLote_Sel, AV48TFAlbRTelar, AV49TFAlbRTelar_Sel, AV50TFAlbRLu, AV51TFAlbRLu_To, AV52TFAlbRMdlCod, AV53TFAlbRMdlCod_Sel, AV54TFAlbRTara, AV55TFAlbRTara_To, AV56TFAlbMaqTej, AV57TFAlbMaqTej_Sel, AV107Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90TotKilos, AV92TotMetros, AV94TotPiezas, AV97DisEst, AV68DisUnimed, AV79AlbRfeni, AV81Albrfenf, AV96Cod_Idtx, AV63CliCod, AV65DisArtCod, AV104Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV27TFAlbRReo_Sels, AV28TFAlbRUniEnt, AV29TFAlbRUniEnt_To, AV30TFAlbRUniUti, AV31TFAlbRUniUti_To, AV33TFAlbRUni_Sels, AV34TFAlbRPieEnt, AV35TFAlbRPieEnt_To, AV36TFAlbRPieUti, AV37TFAlbRPieUti_To, AV38TFAlbRef, AV39TFAlbRef_Sel, AV40TFKilos, AV41TFKilos_To, AV42TFMetros, AV43TFMetros_To, AV44TFPiezas, AV45TFPiezas_To, AV46TFAlbRLote, AV47TFAlbRLote_Sel, AV48TFAlbRTelar, AV49TFAlbRTelar_Sel, AV50TFAlbRLu, AV51TFAlbRLu_To, AV52TFAlbRMdlCod, AV53TFAlbRMdlCod_Sel, AV54TFAlbRTara, AV55TFAlbRTara_To, AV56TFAlbMaqTej, AV57TFAlbMaqTej_Sel, AV107Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90TotKilos, AV92TotMetros, AV94TotPiezas, AV97DisEst, AV68DisUnimed, AV79AlbRfeni, AV81Albrfenf, AV96Cod_Idtx, AV63CliCod, AV65DisArtCod, AV104Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV27TFAlbRReo_Sels, AV28TFAlbRUniEnt, AV29TFAlbRUniEnt_To, AV30TFAlbRUniUti, AV31TFAlbRUniUti_To, AV33TFAlbRUni_Sels, AV34TFAlbRPieEnt, AV35TFAlbRPieEnt_To, AV36TFAlbRPieUti, AV37TFAlbRPieUti_To, AV38TFAlbRef, AV39TFAlbRef_Sel, AV40TFKilos, AV41TFKilos_To, AV42TFMetros, AV43TFMetros_To, AV44TFPiezas, AV45TFPiezas_To, AV46TFAlbRLote, AV47TFAlbRLote_Sel, AV48TFAlbRTelar, AV49TFAlbRTelar_Sel, AV50TFAlbRLu, AV51TFAlbRLu_To, AV52TFAlbRMdlCod, AV53TFAlbRMdlCod_Sel, AV54TFAlbRTara, AV55TFAlbRTara_To, AV56TFAlbMaqTej, AV57TFAlbMaqTej_Sel, AV107Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90TotKilos, AV92TotMetros, AV94TotPiezas, AV97DisEst, AV68DisUnimed, AV79AlbRfeni, AV81Albrfenf, AV96Cod_Idtx, AV63CliCod, AV65DisArtCod, AV104Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV27TFAlbRReo_Sels, AV28TFAlbRUniEnt, AV29TFAlbRUniEnt_To, AV30TFAlbRUniUti, AV31TFAlbRUniUti_To, AV33TFAlbRUni_Sels, AV34TFAlbRPieEnt, AV35TFAlbRPieEnt_To, AV36TFAlbRPieUti, AV37TFAlbRPieUti_To, AV38TFAlbRef, AV39TFAlbRef_Sel, AV40TFKilos, AV41TFKilos_To, AV42TFMetros, AV43TFMetros_To, AV44TFPiezas, AV45TFPiezas_To, AV46TFAlbRLote, AV47TFAlbRLote_Sel, AV48TFAlbRTelar, AV49TFAlbRTelar_Sel, AV50TFAlbRLu, AV51TFAlbRLu_To, AV52TFAlbRMdlCod, AV53TFAlbRMdlCod_Sel, AV54TFAlbRTara, AV55TFAlbRTara_To, AV56TFAlbMaqTej, AV57TFAlbMaqTej_Sel, AV107Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90TotKilos, AV92TotMetros, AV94TotPiezas, AV97DisEst, AV68DisUnimed, AV79AlbRfeni, AV81Albrfenf, AV96Cod_Idtx, AV63CliCod, AV65DisArtCod, AV104Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A361DisCod, AV24TFAlbRecCod, AV25TFAlbRecCod_To, AV27TFAlbRReo_Sels, AV28TFAlbRUniEnt, AV29TFAlbRUniEnt_To, AV30TFAlbRUniUti, AV31TFAlbRUniUti_To, AV33TFAlbRUni_Sels, AV34TFAlbRPieEnt, AV35TFAlbRPieEnt_To, AV36TFAlbRPieUti, AV37TFAlbRPieUti_To, AV38TFAlbRef, AV39TFAlbRef_Sel, AV40TFKilos, AV41TFKilos_To, AV42TFMetros, AV43TFMetros_To, AV44TFPiezas, AV45TFPiezas_To, AV46TFAlbRLote, AV47TFAlbRLote_Sel, AV48TFAlbRTelar, AV49TFAlbRTelar_Sel, AV50TFAlbRLu, AV51TFAlbRLu_To, AV52TFAlbRMdlCod, AV53TFAlbRMdlCod_Sel, AV54TFAlbRTara, AV55TFAlbRTara_To, AV56TFAlbMaqTej, AV57TFAlbMaqTej_Sel, AV107Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90TotKilos, AV92TotMetros, AV94TotPiezas, AV97DisEst, AV68DisUnimed, AV79AlbRfeni, AV81Albrfenf, AV96Cod_Idtx, AV63CliCod, AV65DisArtCod, AV104Moda21) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV107Pgmname = "Pedidos.DisAlb____WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Pgmname", AV107Pgmname);
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisfec_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavDisartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartcod_Enabled), 5, 0), true);
      edtavDisartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisartdsc_Enabled), 5, 0), true);
      edtavModa21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModa21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModa21_Enabled), 5, 0), true);
      edtavAlbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunient_Enabled), 5, 0), true);
      edtavAlbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbruniuti_Enabled), 5, 0), true);
      cmbavAlbruni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbruni.getEnabled(), 5, 0), true);
      edtavAlbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieent_Enabled), 5, 0), true);
      edtavAlbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieuti_Enabled), 5, 0), true);
      edtavAlbpmppza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpmppza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpmppza_Enabled), 5, 0), true);
      cmbavAlbrreo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrreo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbrreo.getEnabled(), 5, 0), true);
      edtavTotvaluekilos_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluekilos_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluekilos_Enabled), 5, 0), true);
      edtavTotvaluemetros_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluemetros_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluemetros_Enabled), 5, 0), true);
      edtavTotvaluepiezas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluepiezas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluepiezas_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavAlbrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrec_Enabled), 5, 0), true);
      edtavDisalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDisalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisalb_Enabled), 5, 0), true);
      edtavClicod_albrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_albrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_albrec_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2900( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e182902 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV58DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_120 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_120"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablepedido_Width = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Width") ;
         Dvpanel_tablepedido_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autowidth")) ;
         Dvpanel_tablepedido_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoheight")) ;
         Dvpanel_tablepedido_Cls = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Cls") ;
         Dvpanel_tablepedido_Title = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Title") ;
         Dvpanel_tablepedido_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsible")) ;
         Dvpanel_tablepedido_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Collapsed")) ;
         Dvpanel_tablepedido_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Showcollapseicon")) ;
         Dvpanel_tablepedido_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Iconposition") ;
         Dvpanel_tablepedido_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEPEDIDO_Autoscroll")) ;
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavModa21_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavModa21_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMODA21");
            GX_FocusControl = edtavModa21_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV104Moda21 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Moda21), 4, 0));
         }
         else
         {
            AV104Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( edtavModa21_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Moda21), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRECCOD");
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71AlbRecCod), 8, 0));
         }
         else
         {
            AV71AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71AlbRecCod), 8, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIENT");
            GX_FocusControl = edtavAlbrunient_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72AlbRUniEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72AlbRUniEnt", GXutil.ltrimstr( AV72AlbRUniEnt, 9, 2));
         }
         else
         {
            AV72AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72AlbRUniEnt", GXutil.ltrimstr( AV72AlbRUniEnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIUTI");
            GX_FocusControl = edtavAlbruniuti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73AlbRUniUti = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRUniUti", GXutil.ltrimstr( AV73AlbRUniUti, 9, 2));
         }
         else
         {
            AV73AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRUniUti", GXutil.ltrimstr( AV73AlbRUniUti, 9, 2));
         }
         cmbavAlbruni.setName( cmbavAlbruni.getInternalname() );
         cmbavAlbruni.setValue( httpContext.cgiGet( cmbavAlbruni.getInternalname()) );
         AV74AlbRUni = httpContext.cgiGet( cmbavAlbruni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRUni", AV74AlbRUni);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEENT");
            GX_FocusControl = edtavAlbrpieent_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75AlbRPieEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75AlbRPieEnt), 6, 0));
         }
         else
         {
            AV75AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75AlbRPieEnt), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEUTI");
            GX_FocusControl = edtavAlbrpieuti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76AlbRPieUti = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76AlbRPieUti), 6, 0));
         }
         else
         {
            AV76AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76AlbRPieUti), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavUnient_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavUnient_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUNIENT");
            GX_FocusControl = edtavUnient_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82Unient = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82Unient", GXutil.ltrimstr( AV82Unient, 9, 2));
         }
         else
         {
            AV82Unient = localUtil.ctond( httpContext.cgiGet( edtavUnient_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82Unient", GXutil.ltrimstr( AV82Unient, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPIEENT");
            GX_FocusControl = edtavPieent_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83PieEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83PieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83PieEnt), 6, 0));
         }
         else
         {
            AV83PieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtavPieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83PieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83PieEnt), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbpmppza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbpmppza_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPMPPZA");
            GX_FocusControl = edtavAlbpmppza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV103AlbPmPPza = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103AlbPmPPza", GXutil.ltrimstr( AV103AlbPmPPza, 6, 3));
         }
         else
         {
            AV103AlbPmPPza = localUtil.ctond( httpContext.cgiGet( edtavAlbpmppza_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103AlbPmPPza", GXutil.ltrimstr( AV103AlbPmPPza, 6, 3));
         }
         cmbavAlbrreo.setName( cmbavAlbrreo.getInternalname() );
         cmbavAlbrreo.setValue( httpContext.cgiGet( cmbavAlbrreo.getInternalname()) );
         AV89AlbRReo = httpContext.cgiGet( cmbavAlbrreo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRReo", AV89AlbRReo);
         AV91TotValueKilos = httpContext.cgiGet( edtavTotvaluekilos_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91TotValueKilos", AV91TotValueKilos);
         AV93TotValueMetros = httpContext.cgiGet( edtavTotvaluemetros_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93TotValueMetros", AV93TotValueMetros);
         AV95TotValuePiezas = httpContext.cgiGet( edtavTotvaluepiezas_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95TotValuePiezas", AV95TotValuePiezas);
         AV107Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107Pgmname", AV107Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBREC");
            GX_FocusControl = edtavAlbrec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV87albrec = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87albrec), 4, 0));
         }
         else
         {
            AV87albrec = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87albrec), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDisalb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDisalb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISALB");
            GX_FocusControl = edtavDisalb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98disalb = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98disalb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98disalb), 4, 0));
         }
         else
         {
            AV98disalb = (short)(localUtil.ctol( httpContext.cgiGet( edtavDisalb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98disalb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98disalb), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_albrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_albrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD_ALBREC");
            GX_FocusControl = edtavClicod_albrec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84Clicod_albrec = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Clicod_albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Clicod_albrec), 4, 0));
         }
         else
         {
            AV84Clicod_albrec = (short)(localUtil.ctol( httpContext.cgiGet( edtavClicod_albrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84Clicod_albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Clicod_albrec), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DisAlb____WW");
         AV104Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( edtavModa21_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Moda21), 4, 0));
         forbiddenHiddens.add("Moda21", localUtil.format( DecimalUtil.doubleToDec(AV104Moda21), "ZZZ9"));
         AV107Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107Pgmname", AV107Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV107Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\disalb____ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e182902 ();
      if (returnInSub) return;
   }

   public void e182902( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV79AlbRfeni = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79AlbRfeni", localUtil.format(AV79AlbRfeni, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENI", getSecureSignedToken( "", AV79AlbRfeni));
      AV81Albrfenf = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Albrfenf", localUtil.format(AV81Albrfenf, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBRFENF", getSecureSignedToken( "", AV81Albrfenf));
      GXt_char1 = AV99Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      disalb____ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV99Station = GXt_char1 ;
      GXv_char2[0] = AV100EmprCod ;
      GXv_char3[0] = AV101EmprNom ;
      GXv_char4[0] = AV102UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV99Station, GXv_char2, GXv_char3, GXv_char4) ;
      disalb____ww_impl.this.AV100EmprCod = GXv_char2[0] ;
      disalb____ww_impl.this.AV101EmprNom = GXv_char3[0] ;
      disalb____ww_impl.this.AV102UsurCod = GXv_char4[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      cmbavDisest.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDisest.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDisest.getVisible(), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Entrada de Almacén", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV58DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV58DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavAlbreccod_Enabled = (((AV97DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbreccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbreccod_Enabled), 5, 0), true);
      divTablesearch_promptalmacen_Visible = (((AV97DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTablesearch_promptalmacen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablesearch_promptalmacen_Visible), 5, 0), true);
      lblImgbsc_promptalmacen_Visible = (((AV97DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, lblImgbsc_promptalmacen_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblImgbsc_promptalmacen_Visible), 5, 0), true);
      bttBtnenter_Visible = (((AV97DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Visible), 5, 0), true);
      edtavUnient_Enabled = (((AV97DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUnient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUnient_Enabled), 5, 0), true);
      edtavPieent_Enabled = (((AV97DisEst==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPieent_Enabled), 5, 0), true);
      GXt_int7 = (byte)(AV104Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      disalb____ww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV104Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV104Moda21), 4, 0));
      edtavAlbpmppza_Visible = AV104Moda21 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpmppza_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpmppza_Visible), 5, 0), true);
   }

   public void e192902( )
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
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV87albrec = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87albrec), 4, 0));
      AV75AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75AlbRPieEnt), 6, 0));
      AV76AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76AlbRPieUti), 6, 0));
      AV72AlbRUniEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbRUniEnt", GXutil.ltrimstr( AV72AlbRUniEnt, 9, 2));
      AV73AlbRUniUti = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRUniUti", GXutil.ltrimstr( AV73AlbRUniUti, 9, 2));
      AV82Unient = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Unient", GXutil.ltrimstr( AV82Unient, 9, 2));
      AV83PieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83PieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83PieEnt), 6, 0));
      AV71AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71AlbRecCod), 8, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "InvertGridMenu", "", new Object[] {httpContext.getMessage( ".dropdown-menu", "")});
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112902( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV24TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbRecCod), 8, 0));
            AV25TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRReo") == 0 )
         {
            AV26TFAlbRReo_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbRReo_SelsJson", AV26TFAlbRReo_SelsJson);
            AV27TFAlbRReo_Sels.fromJSonString(AV26TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniEnt") == 0 )
         {
            AV28TFAlbRUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbRUniEnt", GXutil.ltrimstr( AV28TFAlbRUniEnt, 9, 2));
            AV29TFAlbRUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbRUniEnt_To", GXutil.ltrimstr( AV29TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniUti") == 0 )
         {
            AV30TFAlbRUniUti = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbRUniUti", GXutil.ltrimstr( AV30TFAlbRUniUti, 9, 2));
            AV31TFAlbRUniUti_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbRUniUti_To", GXutil.ltrimstr( AV31TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV32TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbRUni_SelsJson", AV32TFAlbRUni_SelsJson);
            AV33TFAlbRUni_Sels.fromJSonString(AV32TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieEnt") == 0 )
         {
            AV34TFAlbRPieEnt = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbRPieEnt), 6, 0));
            AV35TFAlbRPieEnt_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieUti") == 0 )
         {
            AV36TFAlbRPieUti = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFAlbRPieUti), 6, 0));
            AV37TFAlbRPieUti_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV38TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFAlbRef", AV38TFAlbRef);
            AV39TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFAlbRef_Sel", AV39TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Kilos") == 0 )
         {
            AV40TFKilos = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFKilos", GXutil.ltrimstr( AV40TFKilos, 9, 2));
            AV41TFKilos_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFKilos_To", GXutil.ltrimstr( AV41TFKilos_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Metros") == 0 )
         {
            AV42TFMetros = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMetros", GXutil.ltrimstr( AV42TFMetros, 9, 2));
            AV43TFMetros_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMetros_To", GXutil.ltrimstr( AV43TFMetros_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Piezas") == 0 )
         {
            AV44TFPiezas = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPiezas), 6, 0));
            AV45TFPiezas_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPiezas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPiezas_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLote") == 0 )
         {
            AV46TFAlbRLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbRLote", AV46TFAlbRLote);
            AV47TFAlbRLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbRLote_Sel", AV47TFAlbRLote_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRTelar") == 0 )
         {
            AV48TFAlbRTelar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbRTelar", AV48TFAlbRTelar);
            AV49TFAlbRTelar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRTelar_Sel", AV49TFAlbRTelar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRLu") == 0 )
         {
            AV50TFAlbRLu = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRLu", GXutil.ltrimstr( AV50TFAlbRLu, 6, 2));
            AV51TFAlbRLu_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbRLu_To", GXutil.ltrimstr( AV51TFAlbRLu_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRMdlCod") == 0 )
         {
            AV52TFAlbRMdlCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRMdlCod", AV52TFAlbRMdlCod);
            AV53TFAlbRMdlCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRMdlCod_Sel", AV53TFAlbRMdlCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRTara") == 0 )
         {
            AV54TFAlbRTara = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRTara", GXutil.ltrimstr( AV54TFAlbRTara, 6, 2));
            AV55TFAlbRTara_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRTara_To", GXutil.ltrimstr( AV55TFAlbRTara_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbMaqTej") == 0 )
         {
            AV56TFAlbMaqTej = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbMaqTej", AV56TFAlbMaqTej);
            AV57TFAlbMaqTej_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbMaqTej_Sel", AV57TFAlbMaqTej_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33TFAlbRUni_Sels", AV33TFAlbRUni_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV27TFAlbRReo_Sels", AV27TFAlbRReo_Sels);
   }

   private void e202902( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      if ( GXutil.strcmp(A55AlbRReo, "SI") == 0 )
      {
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Defectos", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( AV97DisEst == 1 )
      {
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( cmbavGridactions.getItemCount() == 1 )
      {
         cmbavGridactions.setThemeClass( "Invisible" );
      }
      else
      {
         cmbavGridactions.setThemeClass( "ConvertToDDO" );
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(120) ;
      }
      sendrow_1202( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_120_Refreshing )
      {
         httpContext.doAjaxLoad(120, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV62GridActions, 4, 0)) );
   }

   public void e212902( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV62GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DEFECTOS' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV62GridActions == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      AV62GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV62GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e122902( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142902 ();
      if (returnInSub) return;
   }

   public void e142902( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV71AlbRecCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Nº Recepcion", ""));
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV87albrec) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No existe Nº Recepcion", ""));
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV63CliCod != AV84Clicod_albrec )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Cliente Entrada Recepcion diferente Cliente Pedido", ""));
               GX_FocusControl = edtavAlbreccod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( GXutil.strcmp(AV74AlbRUni, AV68DisUnimed) != 0 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Unidades Diferentes", ""));
                  GX_FocusControl = edtavAlbreccod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  if ( GXutil.strcmp(AV74AlbRUni, httpContext.getMessage( "K", "")) == 0 )
                  {
                     AV88UniCtrl = (AV72AlbRUniEnt.subtract(AV73AlbRUniUti)).add(AV77Kilos) ;
                  }
                  else
                  {
                     AV88UniCtrl = (AV72AlbRUniEnt.subtract(AV73AlbRUniUti)).add(AV86Metros) ;
                  }
                  if ( DecimalUtil.compareTo(AV82Unient, AV88UniCtrl) > 0 )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Cant a Disponer ", "")+GXutil.trim( GXutil.str( AV82Unient, 9, 2))+httpContext.getMessage( ", superior a lo Disponible ", "")+GXutil.trim( GXutil.str( AV88UniCtrl, 9, 2)));
                     GX_FocusControl = edtavUnient_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( AV82Unient.doubleValue() == 0 )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Cant a Disponer igual a 0 ¡¡¡", ""));
                        GX_FocusControl = edtavUnient_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                     }
                  }
               }
            }
         }
      }
   }

   public void e132902( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e152902( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e162902( )
   {
      /* 'DoImgBsc_PromptAlmacen' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.pedidos.disalb__albreccod_prompt", new String[] {GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV65DisArtCod)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV68DisUnimed)),GXutil.URLEncode(GXutil.ltrimstr(AV63CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim("T")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.formatDateParm(AV79AlbRfeni)),GXutil.URLEncode(GXutil.formatDateParm(AV81Albrfenf)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Nrecep","Nrefer","Nentre","Unid","CliCod","Opreo","EmprCod","AlbREst","TipEnt","AlbRLoc","AlbRDisCli","AlbRfeni","Albrfenf","Albrent2i","Albreccod"}) , new Object[] {"AV71AlbRecCod"});
      GXv_int10[0] = AV75AlbRPieEnt ;
      GXv_int11[0] = AV76AlbRPieUti ;
      GXv_char4[0] = AV74AlbRUni ;
      GXv_decimal12[0] = AV72AlbRUniEnt ;
      GXv_decimal13[0] = AV73AlbRUniUti ;
      GXv_decimal14[0] = AV77Kilos ;
      GXv_decimal15[0] = AV86Metros ;
      GXv_int16[0] = AV78Piezas ;
      GXv_char3[0] = AV85ALbRlote ;
      GXv_char2[0] = AV89AlbRReo ;
      GXv_int17[0] = AV84Clicod_albrec ;
      GXv_int18[0] = AV87albrec ;
      GXv_int19[0] = AV98disalb ;
      GXv_decimal20[0] = AV82Unient ;
      GXv_int21[0] = AV83PieEnt ;
      GXv_decimal22[0] = AV103AlbPmPPza ;
      new app.pedidos.obtenerdatosentradaalmacen(remoteHandle, context).execute( A396EmprCod, A361DisCod, AV71AlbRecCod, GXv_int10, GXv_int11, GXv_char4, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_int16, GXv_char3, GXv_char2, GXv_int17, GXv_int18, GXv_int19, GXv_decimal20, GXv_int21, GXv_decimal22) ;
      disalb____ww_impl.this.AV75AlbRPieEnt = GXv_int10[0] ;
      disalb____ww_impl.this.AV76AlbRPieUti = GXv_int11[0] ;
      disalb____ww_impl.this.AV74AlbRUni = GXv_char4[0] ;
      disalb____ww_impl.this.AV72AlbRUniEnt = GXv_decimal12[0] ;
      disalb____ww_impl.this.AV73AlbRUniUti = GXv_decimal13[0] ;
      disalb____ww_impl.this.AV77Kilos = GXv_decimal14[0] ;
      disalb____ww_impl.this.AV86Metros = GXv_decimal15[0] ;
      disalb____ww_impl.this.AV78Piezas = GXv_int16[0] ;
      disalb____ww_impl.this.AV85ALbRlote = GXv_char3[0] ;
      disalb____ww_impl.this.AV89AlbRReo = GXv_char2[0] ;
      disalb____ww_impl.this.AV84Clicod_albrec = (short)((short)(GXv_int17[0])) ;
      disalb____ww_impl.this.AV87albrec = GXv_int18[0] ;
      disalb____ww_impl.this.AV98disalb = GXv_int19[0] ;
      disalb____ww_impl.this.AV82Unient = GXv_decimal20[0] ;
      disalb____ww_impl.this.AV83PieEnt = GXv_int21[0] ;
      disalb____ww_impl.this.AV103AlbPmPPza = GXv_decimal22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75AlbRPieEnt), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV76AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76AlbRPieUti), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRUni", AV74AlbRUni);
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbRUniEnt", GXutil.ltrimstr( AV72AlbRUniEnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRUniUti", GXutil.ltrimstr( AV73AlbRUniUti, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV77Kilos", GXutil.ltrimstr( AV77Kilos, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV86Metros", GXutil.ltrimstr( AV86Metros, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRReo", AV89AlbRReo);
      httpContext.ajax_rsp_assign_attri("", false, "AV84Clicod_albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Clicod_albrec), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV87albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87albrec), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV98disalb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98disalb), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV82Unient", GXutil.ltrimstr( AV82Unient, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV83PieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83PieEnt), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV103AlbPmPPza", GXutil.ltrimstr( AV103AlbPmPPza, 6, 3));
      /*  Sending Event outputs  */
      cmbavAlbrreo.setValue( GXutil.rtrim( AV89AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrreo.getInternalname(), "Values", cmbavAlbrreo.ToJavascriptSource(), true);
      cmbavAlbruni.setValue( GXutil.rtrim( AV74AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), true);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S182( )
   {
      /* 'DO DEFECTOS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.defectos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV140Emprcod_selected = A396EmprCod ;
      AV141Discod_selected = A361DisCod ;
      AV142Albreccod_selected = A44AlbRecCod ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.pdisxxx(remoteHandle, context).execute( A396EmprCod, A361DisCod, A44AlbRecCod, DecimalUtil.doubleToDec(0), 0, httpContext.getMessage( "DEL", "")) ;
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      System.out.println( httpContext.getMessage( "voy a PDISXXX", "") );
      new app.pdisxxx(remoteHandle, context).execute( A396EmprCod, A361DisCod, AV71AlbRecCod, AV82Unient, AV83PieEnt, " ") ;
      System.out.println( httpContext.getMessage( "retorno a PDISXXX", "") );
      if ( GXutil.strcmp(AV89AlbRReo, "SI") == 0 )
      {
         httpContext.popup(formatLink("app.defectos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A361DisCod,8,0))}, new String[] {"Mode","EmprCod","DisCod"}) , new Object[] {});
      }
      AV87albrec = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87albrec), 4, 0));
      AV75AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75AlbRPieEnt), 6, 0));
      AV76AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76AlbRPieUti), 6, 0));
      AV72AlbRUniEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbRUniEnt", GXutil.ltrimstr( AV72AlbRUniEnt, 9, 2));
      AV73AlbRUniUti = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRUniUti", GXutil.ltrimstr( AV73AlbRUniUti, 9, 2));
      AV82Unient = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Unient", GXutil.ltrimstr( AV82Unient, 9, 2));
      AV83PieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83PieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83PieEnt), 6, 0));
      AV71AlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71AlbRecCod), 8, 0));
      GX_FocusControl = edtavAlbreccod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV107Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV107Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV107Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV143GXV1 = 1 ;
      while ( AV143GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV143GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV24TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFAlbRecCod), 8, 0));
            AV25TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRREO_SEL") == 0 )
         {
            AV26TFAlbRReo_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFAlbRReo_SelsJson", AV26TFAlbRReo_SelsJson);
            AV27TFAlbRReo_Sels.fromJSonString(AV26TFAlbRReo_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV28TFAlbRUniEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbRUniEnt", GXutil.ltrimstr( AV28TFAlbRUniEnt, 9, 2));
            AV29TFAlbRUniEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbRUniEnt_To", GXutil.ltrimstr( AV29TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV30TFAlbRUniUti = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbRUniUti", GXutil.ltrimstr( AV30TFAlbRUniUti, 9, 2));
            AV31TFAlbRUniUti_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbRUniUti_To", GXutil.ltrimstr( AV31TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV32TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbRUni_SelsJson", AV32TFAlbRUni_SelsJson);
            AV33TFAlbRUni_Sels.fromJSonString(AV32TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV34TFAlbRPieEnt = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFAlbRPieEnt), 6, 0));
            AV35TFAlbRPieEnt_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV36TFAlbRPieUti = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFAlbRPieUti), 6, 0));
            AV37TFAlbRPieUti_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV38TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFAlbRef", AV38TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV39TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFAlbRef_Sel", AV39TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFKILOS") == 0 )
         {
            AV40TFKilos = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFKilos", GXutil.ltrimstr( AV40TFKilos, 9, 2));
            AV41TFKilos_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFKilos_To", GXutil.ltrimstr( AV41TFKilos_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMETROS") == 0 )
         {
            AV42TFMetros = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFMetros", GXutil.ltrimstr( AV42TFMetros, 9, 2));
            AV43TFMetros_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFMetros_To", GXutil.ltrimstr( AV43TFMetros_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPIEZAS") == 0 )
         {
            AV44TFPiezas = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFPiezas), 6, 0));
            AV45TFPiezas_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFPiezas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFPiezas_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE") == 0 )
         {
            AV46TFAlbRLote = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFAlbRLote", AV46TFAlbRLote);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLOTE_SEL") == 0 )
         {
            AV47TFAlbRLote_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFAlbRLote_Sel", AV47TFAlbRLote_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR") == 0 )
         {
            AV48TFAlbRTelar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFAlbRTelar", AV48TFAlbRTelar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTELAR_SEL") == 0 )
         {
            AV49TFAlbRTelar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRTelar_Sel", AV49TFAlbRTelar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRLU") == 0 )
         {
            AV50TFAlbRLu = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRLu", GXutil.ltrimstr( AV50TFAlbRLu, 6, 2));
            AV51TFAlbRLu_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbRLu_To", GXutil.ltrimstr( AV51TFAlbRLu_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD") == 0 )
         {
            AV52TFAlbRMdlCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRMdlCod", AV52TFAlbRMdlCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRMDLCOD_SEL") == 0 )
         {
            AV53TFAlbRMdlCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRMdlCod_Sel", AV53TFAlbRMdlCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRTARA") == 0 )
         {
            AV54TFAlbRTara = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRTara", GXutil.ltrimstr( AV54TFAlbRTara, 6, 2));
            AV55TFAlbRTara_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRTara_To", GXutil.ltrimstr( AV55TFAlbRTara_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ") == 0 )
         {
            AV56TFAlbMaqTej = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbMaqTej", AV56TFAlbMaqTej);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMAQTEJ_SEL") == 0 )
         {
            AV57TFAlbMaqTej_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbMaqTej_Sel", AV57TFAlbMaqTej_Sel);
         }
         AV143GXV1 = (int)(AV143GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV27TFAlbRReo_Sels.size()==0), AV26TFAlbRReo_SelsJson, GXv_char4) ;
      disalb____ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char23 = "" ;
      GXv_char3[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV33TFAlbRUni_Sels.size()==0), AV32TFAlbRUni_SelsJson, GXv_char3) ;
      disalb____ww_impl.this.GXt_char23 = GXv_char3[0] ;
      GXt_char24 = "" ;
      GXv_char2[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFAlbRef_Sel)==0), AV39TFAlbRef_Sel, GXv_char2) ;
      disalb____ww_impl.this.GXt_char24 = GXv_char2[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV47TFAlbRLote_Sel)==0), AV47TFAlbRLote_Sel, GXv_char26) ;
      disalb____ww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFAlbRTelar_Sel)==0), AV49TFAlbRTelar_Sel, GXv_char28) ;
      disalb____ww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFAlbRMdlCod_Sel)==0), AV53TFAlbRMdlCod_Sel, GXv_char30) ;
      disalb____ww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFAlbMaqTej_Sel)==0), AV57TFAlbMaqTej_Sel, GXv_char32) ;
      disalb____ww_impl.this.GXt_char31 = GXv_char32[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|||"+GXt_char23+"|||"+GXt_char24+"||||"+GXt_char25+"|"+GXt_char27+"||"+GXt_char29+"||"+GXt_char31 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char31 = "" ;
      GXv_char32[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFAlbRef)==0), AV38TFAlbRef, GXv_char32) ;
      disalb____ww_impl.this.GXt_char31 = GXv_char32[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV46TFAlbRLote)==0), AV46TFAlbRLote, GXv_char30) ;
      disalb____ww_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV48TFAlbRTelar)==0), AV48TFAlbRTelar, GXv_char28) ;
      disalb____ww_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char25 = "" ;
      GXv_char26[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFAlbRMdlCod)==0), AV52TFAlbRMdlCod, GXv_char26) ;
      disalb____ww_impl.this.GXt_char25 = GXv_char26[0] ;
      GXt_char24 = "" ;
      GXv_char4[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFAlbMaqTej)==0), AV56TFAlbMaqTej, GXv_char4) ;
      disalb____ww_impl.this.GXt_char24 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV24TFAlbRecCod) ? "" : GXutil.str( AV24TFAlbRecCod, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFAlbRUniEnt)==0) ? "" : GXutil.str( AV28TFAlbRUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFAlbRUniUti)==0) ? "" : GXutil.str( AV30TFAlbRUniUti, 9, 2))+"||"+((0==AV34TFAlbRPieEnt) ? "" : GXutil.str( AV34TFAlbRPieEnt, 6, 0))+"|"+((0==AV36TFAlbRPieUti) ? "" : GXutil.str( AV36TFAlbRPieUti, 6, 0))+"|"+GXt_char31+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFKilos)==0) ? "" : GXutil.str( AV40TFKilos, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMetros)==0) ? "" : GXutil.str( AV42TFMetros, 9, 2))+"|"+((0==AV44TFPiezas) ? "" : GXutil.str( AV44TFPiezas, 6, 0))+"|"+GXt_char29+"|"+GXt_char27+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFAlbRLu)==0) ? "" : GXutil.str( AV50TFAlbRLu, 6, 2))+"|"+GXt_char25+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFAlbRTara)==0) ? "" : GXutil.str( AV54TFAlbRTara, 6, 2))+"|"+GXt_char24 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV25TFAlbRecCod_To) ? "" : GXutil.str( AV25TFAlbRecCod_To, 8, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFAlbRUniEnt_To)==0) ? "" : GXutil.str( AV29TFAlbRUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFAlbRUniUti_To)==0) ? "" : GXutil.str( AV31TFAlbRUniUti_To, 9, 2))+"||"+((0==AV35TFAlbRPieEnt_To) ? "" : GXutil.str( AV35TFAlbRPieEnt_To, 6, 0))+"|"+((0==AV37TFAlbRPieUti_To) ? "" : GXutil.str( AV37TFAlbRPieUti_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFKilos_To)==0) ? "" : GXutil.str( AV41TFKilos_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMetros_To)==0) ? "" : GXutil.str( AV43TFMetros_To, 9, 2))+"|"+((0==AV45TFPiezas_To) ? "" : GXutil.str( AV45TFPiezas_To, 6, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbRLu_To)==0) ? "" : GXutil.str( AV51TFAlbRLu_To, 6, 2))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFAlbRTara_To)==0) ? "" : GXutil.str( AV55TFAlbRTara_To, 6, 2))+"|" ;
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
      AV10GridState.fromxml(AV20Session.getValue(AV107Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRECCOD", "", !((0==AV24TFAlbRecCod)&&(0==AV25TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV25TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRREO_SEL", "", !(AV27TFAlbRReo_Sels.size()==0), (short)(0), AV27TFAlbRReo_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFAlbRUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFAlbRUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV28TFAlbRUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV29TFAlbRUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRUNIUTI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFAlbRUniUti)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFAlbRUniUti_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV30TFAlbRUniUti, 9, 2)), GXutil.trim( GXutil.str( AV31TFAlbRUniUti_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRUNI_SEL", "", !(AV33TFAlbRUni_Sels.size()==0), (short)(0), AV33TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRPIEENT", "", !((0==AV34TFAlbRPieEnt)&&(0==AV35TFAlbRPieEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFAlbRPieEnt, 6, 0)), GXutil.trim( GXutil.str( AV35TFAlbRPieEnt_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRPIEUTI", "", !((0==AV36TFAlbRPieUti)&&(0==AV37TFAlbRPieUti_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFAlbRPieUti, 6, 0)), GXutil.trim( GXutil.str( AV37TFAlbRPieUti_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBREF", "", !(GXutil.strcmp("", AV38TFAlbRef)==0), (short)(0), AV38TFAlbRef, "", !(GXutil.strcmp("", AV39TFAlbRef_Sel)==0), AV39TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFKILOS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFKilos)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFKilos_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFKilos, 9, 2)), GXutil.trim( GXutil.str( AV41TFKilos_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFMETROS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV42TFMetros)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFMetros_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV42TFMetros, 9, 2)), GXutil.trim( GXutil.str( AV43TFMetros_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFPIEZAS", "", !((0==AV44TFPiezas)&&(0==AV45TFPiezas_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFPiezas, 6, 0)), GXutil.trim( GXutil.str( AV45TFPiezas_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRLOTE", "", !(GXutil.strcmp("", AV46TFAlbRLote)==0), (short)(0), AV46TFAlbRLote, "", !(GXutil.strcmp("", AV47TFAlbRLote_Sel)==0), AV47TFAlbRLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRTELAR", "", !(GXutil.strcmp("", AV48TFAlbRTelar)==0), (short)(0), AV48TFAlbRTelar, "", !(GXutil.strcmp("", AV49TFAlbRTelar_Sel)==0), AV49TFAlbRTelar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRLU", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFAlbRLu)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFAlbRLu_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFAlbRLu, 6, 2)), GXutil.trim( GXutil.str( AV51TFAlbRLu_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRMDLCOD", "", !(GXutil.strcmp("", AV52TFAlbRMdlCod)==0), (short)(0), AV52TFAlbRMdlCod, "", !(GXutil.strcmp("", AV53TFAlbRMdlCod_Sel)==0), AV53TFAlbRMdlCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBRTARA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV54TFAlbRTara)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV55TFAlbRTara_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV54TFAlbRTara, 6, 2)), GXutil.trim( GXutil.str( AV55TFAlbRTara_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      GXv_SdtWWPGridState33[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState33, "TFALBMAQTEJ", "", !(GXutil.strcmp("", AV56TFAlbMaqTej)==0), (short)(0), AV56TFAlbMaqTej, "", !(GXutil.strcmp("", AV57TFAlbMaqTej_Sel)==0), AV57TFAlbMaqTej_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState33[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV107Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV107Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Pedidos.DisAlb" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( 1 == 2 ) ) )
      {
         divDvpanel_unnamedtable1_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable1_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable1_cell_Internalname, "Class", divDvpanel_unnamedtable1_cell_Class, true);
      }
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV90TotKilos = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TotKilos", GXutil.ltrimstr( AV90TotKilos, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKILOS", getSecureSignedToken( "", localUtil.format( AV90TotKilos, "ZZZZZ9.99")));
      AV92TotMetros = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92TotMetros", GXutil.ltrimstr( AV92TotMetros, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETROS", getSecureSignedToken( "", localUtil.format( AV92TotMetros, "ZZZZZ9.99")));
      AV94TotPiezas = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TotPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TotPiezas), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEZAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94TotPiezas), "ZZZZZ9")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV108Pedidos_disalb____wwds_1_tfalbreccod = AV24TFAlbRecCod ;
      AV109Pedidos_disalb____wwds_2_tfalbreccod_to = AV25TFAlbRecCod_To ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = AV27TFAlbRReo_Sels ;
      AV111Pedidos_disalb____wwds_4_tfalbrunient = AV28TFAlbRUniEnt ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = AV29TFAlbRUniEnt_To ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = AV30TFAlbRUniUti ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = AV31TFAlbRUniUti_To ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = AV33TFAlbRUni_Sels ;
      AV116Pedidos_disalb____wwds_9_tfalbrpieent = AV34TFAlbRPieEnt ;
      AV117Pedidos_disalb____wwds_10_tfalbrpieent_to = AV35TFAlbRPieEnt_To ;
      AV118Pedidos_disalb____wwds_11_tfalbrpieuti = AV36TFAlbRPieUti ;
      AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to = AV37TFAlbRPieUti_To ;
      AV120Pedidos_disalb____wwds_13_tfalbref = AV38TFAlbRef ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = AV39TFAlbRef_Sel ;
      AV122Pedidos_disalb____wwds_15_tfkilos = AV40TFKilos ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = AV41TFKilos_To ;
      AV124Pedidos_disalb____wwds_17_tfmetros = AV42TFMetros ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = AV43TFMetros_To ;
      AV126Pedidos_disalb____wwds_19_tfpiezas = AV44TFPiezas ;
      AV127Pedidos_disalb____wwds_20_tfpiezas_to = AV45TFPiezas_To ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = AV46TFAlbRLote ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = AV47TFAlbRLote_Sel ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = AV48TFAlbRTelar ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = AV49TFAlbRTelar_Sel ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = AV50TFAlbRLu ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = AV51TFAlbRLu_To ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = AV52TFAlbRMdlCod ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = AV53TFAlbRMdlCod_Sel ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = AV54TFAlbRTara ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = AV55TFAlbRTara_To ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = AV56TFAlbMaqTej ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = AV57TFAlbMaqTej_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A55AlbRReo ,
                                           AV110Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                           A56AlbRUni ,
                                           AV115Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                           Integer.valueOf(AV108Pedidos_disalb____wwds_1_tfalbreccod) ,
                                           Integer.valueOf(AV109Pedidos_disalb____wwds_2_tfalbreccod_to) ,
                                           Integer.valueOf(AV110Pedidos_disalb____wwds_3_tfalbrreo_sels.size()) ,
                                           AV111Pedidos_disalb____wwds_4_tfalbrunient ,
                                           AV112Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                           AV113Pedidos_disalb____wwds_6_tfalbruniuti ,
                                           AV114Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                           Integer.valueOf(AV115Pedidos_disalb____wwds_8_tfalbruni_sels.size()) ,
                                           Integer.valueOf(AV116Pedidos_disalb____wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV117Pedidos_disalb____wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV118Pedidos_disalb____wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to) ,
                                           AV121Pedidos_disalb____wwds_14_tfalbref_sel ,
                                           AV120Pedidos_disalb____wwds_13_tfalbref ,
                                           AV122Pedidos_disalb____wwds_15_tfkilos ,
                                           AV123Pedidos_disalb____wwds_16_tfkilos_to ,
                                           AV124Pedidos_disalb____wwds_17_tfmetros ,
                                           AV125Pedidos_disalb____wwds_18_tfmetros_to ,
                                           Integer.valueOf(AV126Pedidos_disalb____wwds_19_tfpiezas) ,
                                           Integer.valueOf(AV127Pedidos_disalb____wwds_20_tfpiezas_to) ,
                                           AV129Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                           AV128Pedidos_disalb____wwds_21_tfalbrlote ,
                                           AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                           AV130Pedidos_disalb____wwds_23_tfalbrtelar ,
                                           AV132Pedidos_disalb____wwds_25_tfalbrlu ,
                                           AV133Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                           AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                           AV134Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                           AV136Pedidos_disalb____wwds_29_tfalbrtara ,
                                           AV137Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                           AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                           AV138Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A45AlbRef ,
                                           A595Kilos ,
                                           A631Metros ,
                                           Integer.valueOf(A673Piezas) ,
                                           A6463AlbRLote ,
                                           A6464AlbRTelar ,
                                           A6465AlbRLu ,
                                           A4602AlbRMdlCod ,
                                           A6470AlbRTara ,
                                           A8035AlbMaqTej ,
                                           A396EmprCod ,
                                           Integer.valueOf(A361DisCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV120Pedidos_disalb____wwds_13_tfalbref = GXutil.padr( GXutil.rtrim( AV120Pedidos_disalb____wwds_13_tfalbref), 16, "%") ;
      lV128Pedidos_disalb____wwds_21_tfalbrlote = GXutil.padr( GXutil.rtrim( AV128Pedidos_disalb____wwds_21_tfalbrlote), 20, "%") ;
      lV130Pedidos_disalb____wwds_23_tfalbrtelar = GXutil.padr( GXutil.rtrim( AV130Pedidos_disalb____wwds_23_tfalbrtelar), 20, "%") ;
      lV134Pedidos_disalb____wwds_27_tfalbrmdlcod = GXutil.padr( GXutil.rtrim( AV134Pedidos_disalb____wwds_27_tfalbrmdlcod), 13, "%") ;
      lV138Pedidos_disalb____wwds_31_tfalbmaqtej = GXutil.padr( GXutil.rtrim( AV138Pedidos_disalb____wwds_31_tfalbmaqtej), 12, "%") ;
      /* Using cursor H02904 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Integer.valueOf(AV108Pedidos_disalb____wwds_1_tfalbreccod), Integer.valueOf(AV109Pedidos_disalb____wwds_2_tfalbreccod_to), AV111Pedidos_disalb____wwds_4_tfalbrunient, AV112Pedidos_disalb____wwds_5_tfalbrunient_to, AV113Pedidos_disalb____wwds_6_tfalbruniuti, AV114Pedidos_disalb____wwds_7_tfalbruniuti_to, Integer.valueOf(AV116Pedidos_disalb____wwds_9_tfalbrpieent), Integer.valueOf(AV117Pedidos_disalb____wwds_10_tfalbrpieent_to), Integer.valueOf(AV118Pedidos_disalb____wwds_11_tfalbrpieuti), Integer.valueOf(AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to), lV120Pedidos_disalb____wwds_13_tfalbref, AV121Pedidos_disalb____wwds_14_tfalbref_sel, AV122Pedidos_disalb____wwds_15_tfkilos, AV123Pedidos_disalb____wwds_16_tfkilos_to, AV124Pedidos_disalb____wwds_17_tfmetros, AV125Pedidos_disalb____wwds_18_tfmetros_to, Integer.valueOf(AV126Pedidos_disalb____wwds_19_tfpiezas), Integer.valueOf(AV127Pedidos_disalb____wwds_20_tfpiezas_to), lV128Pedidos_disalb____wwds_21_tfalbrlote, AV129Pedidos_disalb____wwds_22_tfalbrlote_sel, lV130Pedidos_disalb____wwds_23_tfalbrtelar, AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel, AV132Pedidos_disalb____wwds_25_tfalbrlu, AV133Pedidos_disalb____wwds_26_tfalbrlu_to, lV134Pedidos_disalb____wwds_27_tfalbrmdlcod, AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel, AV136Pedidos_disalb____wwds_29_tfalbrtara, AV137Pedidos_disalb____wwds_30_tfalbrtara_to, lV138Pedidos_disalb____wwds_31_tfalbmaqtej, AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A8035AlbMaqTej = H02904_A8035AlbMaqTej[0] ;
         A6470AlbRTara = H02904_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = H02904_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = H02904_A6465AlbRLu[0] ;
         A6464AlbRTelar = H02904_A6464AlbRTelar[0] ;
         A6463AlbRLote = H02904_A6463AlbRLote[0] ;
         A673Piezas = H02904_A673Piezas[0] ;
         A631Metros = H02904_A631Metros[0] ;
         A595Kilos = H02904_A595Kilos[0] ;
         A45AlbRef = H02904_A45AlbRef[0] ;
         A54AlbRPieUti = H02904_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = H02904_A52AlbRPieEnt[0] ;
         A56AlbRUni = H02904_A56AlbRUni[0] ;
         A60AlbRUniUti = H02904_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = H02904_A58AlbRUniEnt[0] ;
         A55AlbRReo = H02904_A55AlbRReo[0] ;
         A44AlbRecCod = H02904_A44AlbRecCod[0] ;
         A8035AlbMaqTej = H02904_A8035AlbMaqTej[0] ;
         A6470AlbRTara = H02904_A6470AlbRTara[0] ;
         A4602AlbRMdlCod = H02904_A4602AlbRMdlCod[0] ;
         A6465AlbRLu = H02904_A6465AlbRLu[0] ;
         A6464AlbRTelar = H02904_A6464AlbRTelar[0] ;
         A6463AlbRLote = H02904_A6463AlbRLote[0] ;
         A45AlbRef = H02904_A45AlbRef[0] ;
         A54AlbRPieUti = H02904_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = H02904_A52AlbRPieEnt[0] ;
         A56AlbRUni = H02904_A56AlbRUni[0] ;
         A60AlbRUniUti = H02904_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = H02904_A58AlbRUniEnt[0] ;
         A55AlbRReo = H02904_A55AlbRReo[0] ;
         AV90TotKilos = A595Kilos.add(AV90TotKilos) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90TotKilos", GXutil.ltrimstr( AV90TotKilos, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTKILOS", getSecureSignedToken( "", localUtil.format( AV90TotKilos, "ZZZZZ9.99")));
         AV92TotMetros = A631Metros.add(AV92TotMetros) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92TotMetros", GXutil.ltrimstr( AV92TotMetros, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTMETROS", getSecureSignedToken( "", localUtil.format( AV92TotMetros, "ZZZZZ9.99")));
         AV94TotPiezas = (long)(A673Piezas+AV94TotPiezas) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94TotPiezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94TotPiezas), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTPIEZAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94TotPiezas), "ZZZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV91TotValueKilos = localUtil.format( AV90TotKilos, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TotValueKilos", AV91TotValueKilos);
      AV93TotValueMetros = localUtil.format( AV92TotMetros, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93TotValueMetros", AV93TotValueMetros);
      AV95TotValuePiezas = localUtil.format( DecimalUtil.doubleToDec(AV94TotPiezas), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TotValuePiezas", AV95TotValuePiezas);
   }

   public void e172902( )
   {
      /* Albreccod_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_int21[0] = AV75AlbRPieEnt ;
      GXv_int17[0] = AV76AlbRPieUti ;
      GXv_char32[0] = AV74AlbRUni ;
      GXv_decimal22[0] = AV72AlbRUniEnt ;
      GXv_decimal20[0] = AV73AlbRUniUti ;
      GXv_decimal15[0] = AV77Kilos ;
      GXv_decimal14[0] = AV86Metros ;
      GXv_int16[0] = AV78Piezas ;
      GXv_char30[0] = AV85ALbRlote ;
      GXv_char28[0] = AV89AlbRReo ;
      GXv_int11[0] = AV84Clicod_albrec ;
      GXv_int19[0] = AV87albrec ;
      GXv_int18[0] = AV98disalb ;
      GXv_decimal13[0] = AV82Unient ;
      GXv_int10[0] = AV83PieEnt ;
      GXv_decimal12[0] = AV103AlbPmPPza ;
      new app.pedidos.obtenerdatosentradaalmacen(remoteHandle, context).execute( A396EmprCod, A361DisCod, AV71AlbRecCod, GXv_int21, GXv_int17, GXv_char32, GXv_decimal22, GXv_decimal20, GXv_decimal15, GXv_decimal14, GXv_int16, GXv_char30, GXv_char28, GXv_int11, GXv_int19, GXv_int18, GXv_decimal13, GXv_int10, GXv_decimal12) ;
      disalb____ww_impl.this.AV75AlbRPieEnt = GXv_int21[0] ;
      disalb____ww_impl.this.AV76AlbRPieUti = GXv_int17[0] ;
      disalb____ww_impl.this.AV74AlbRUni = GXv_char32[0] ;
      disalb____ww_impl.this.AV72AlbRUniEnt = GXv_decimal22[0] ;
      disalb____ww_impl.this.AV73AlbRUniUti = GXv_decimal20[0] ;
      disalb____ww_impl.this.AV77Kilos = GXv_decimal15[0] ;
      disalb____ww_impl.this.AV86Metros = GXv_decimal14[0] ;
      disalb____ww_impl.this.AV78Piezas = GXv_int16[0] ;
      disalb____ww_impl.this.AV85ALbRlote = GXv_char30[0] ;
      disalb____ww_impl.this.AV89AlbRReo = GXv_char28[0] ;
      disalb____ww_impl.this.AV84Clicod_albrec = (short)((short)(GXv_int11[0])) ;
      disalb____ww_impl.this.AV87albrec = GXv_int19[0] ;
      disalb____ww_impl.this.AV98disalb = GXv_int18[0] ;
      disalb____ww_impl.this.AV82Unient = GXv_decimal13[0] ;
      disalb____ww_impl.this.AV83PieEnt = GXv_int10[0] ;
      disalb____ww_impl.this.AV103AlbPmPPza = GXv_decimal12[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75AlbRPieEnt), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV76AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76AlbRPieUti), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRUni", AV74AlbRUni);
      httpContext.ajax_rsp_assign_attri("", false, "AV72AlbRUniEnt", GXutil.ltrimstr( AV72AlbRUniEnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbRUniUti", GXutil.ltrimstr( AV73AlbRUniUti, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV77Kilos", GXutil.ltrimstr( AV77Kilos, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV86Metros", GXutil.ltrimstr( AV86Metros, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRReo", AV89AlbRReo);
      httpContext.ajax_rsp_assign_attri("", false, "AV84Clicod_albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84Clicod_albrec), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV87albrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87albrec), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV98disalb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98disalb), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV82Unient", GXutil.ltrimstr( AV82Unient, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV83PieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83PieEnt), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV103AlbPmPPza", GXutil.ltrimstr( AV103AlbPmPPza, 6, 3));
      if ( (0==AV87albrec) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº Recepcion", ""));
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( AV63CliCod != AV84Clicod_albrec )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Cliente Entrada Recepcion diferente Cliente Pedido", ""));
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( GXutil.strcmp(AV96Cod_Idtx, " ") != 0 ) && ( GXutil.strcmp(AV85ALbRlote, " ") == 0 ) && ( AV87albrec == 1 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Atençao.Encomenda Inditex mas nao tem o Lote inserido ¡¡¡", ""));
            }
         }
      }
      /*  Sending Event outputs  */
      cmbavAlbrreo.setValue( GXutil.rtrim( AV89AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbrreo.getInternalname(), "Values", cmbavAlbrreo.ToJavascriptSource(), true);
      cmbavAlbruni.setValue( GXutil.rtrim( AV74AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbruni.getInternalname(), "Values", cmbavAlbruni.ToJavascriptSource(), true);
   }

   public void wb_table4_203_2902( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_203_2902e( true) ;
      }
      else
      {
         wb_table4_203_2902e( false) ;
      }
   }

   public void wb_table3_198_2902( boolean wbgen )
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
         wb_table3_198_2902e( true) ;
      }
      else
      {
         wb_table3_198_2902e( false) ;
      }
   }

   public void wb_table2_141_2902( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluekilos_Internalname, httpContext.getMessage( "Tot Value Kilos", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluekilos_Internalname, AV91TotValueKilos, GXutil.rtrim( localUtil.format( AV91TotValueKilos, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluekilos_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluekilos_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluemetros_Internalname, httpContext.getMessage( "Tot Value Metros", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluemetros_Internalname, AV93TotValueMetros, GXutil.rtrim( localUtil.format( AV93TotValueMetros, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluemetros_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluemetros_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluepiezas_Internalname, httpContext.getMessage( "Tot Value Piezas", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 160,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluepiezas_Internalname, AV95TotValuePiezas, GXutil.rtrim( localUtil.format( AV95TotValuePiezas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,160);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluepiezas_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluepiezas_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_141_2902e( true) ;
      }
      else
      {
         wb_table2_141_2902e( false) ;
      }
   }

   public void wb_table1_61_2902( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedalbreccod_Internalname, tblTablemergedalbreccod_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbreccod_Internalname, httpContext.getMessage( "Alb Rec Cod", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_120_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV71AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesearch_promptalmacen_Internalname, divTablesearch_promptalmacen_Visible, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop25", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblImgbsc_promptalmacen_Internalname, httpContext.getMessage( "<i class=\"fas fa-search fa-2x\"></i>", ""), "", "", lblImgbsc_promptalmacen_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOIMGBSC_PROMPTALMACEN\\'."+"'", "", "TextBlock", 5, "", lblImgbsc_promptalmacen_Visible, 1, 0, (short)(1), "HLP_Pedidos\\DisAlb____WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_61_2902e( true) ;
      }
      else
      {
         wb_table1_61_2902e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      A361DisCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")));
      AV63CliCod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63CliCod), "ZZZZZ9")));
      AV64CliNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64CliNom", AV64CliNom);
      AV65DisArtCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65DisArtCod", AV65DisArtCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISARTCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65DisArtCod, ""))));
      AV66DisArtDsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66DisArtDsc", AV66DisArtDsc);
      AV67DisFec = (java.util.Date)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67DisFec", localUtil.format(AV67DisFec, "99/99/99"));
      AV68DisUnimed = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68DisUnimed", AV68DisUnimed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68DisUnimed, "@!"))));
      AV96Cod_Idtx = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96Cod_Idtx", AV96Cod_Idtx);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOD_IDTX", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV96Cod_Idtx, ""))));
      AV97DisEst = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97DisEst", GXutil.str( AV97DisEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97DisEst), "9")));
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
      pa2902( ) ;
      ws2902( ) ;
      we2902( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116151597", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("pedidos/disalb____ww.js", "?202682116151597", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1202( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_120_idx );
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_120_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_120_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_120_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_120_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_120_idx );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_120_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_120_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_120_idx ;
      edtKilos_Internalname = "KILOS_"+sGXsfl_120_idx ;
      edtMetros_Internalname = "METROS_"+sGXsfl_120_idx ;
      edtPiezas_Internalname = "PIEZAS_"+sGXsfl_120_idx ;
      edtAlbRLote_Internalname = "ALBRLOTE_"+sGXsfl_120_idx ;
      edtAlbRTelar_Internalname = "ALBRTELAR_"+sGXsfl_120_idx ;
      edtAlbRLu_Internalname = "ALBRLU_"+sGXsfl_120_idx ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD_"+sGXsfl_120_idx ;
      edtAlbRTara_Internalname = "ALBRTARA_"+sGXsfl_120_idx ;
      edtAlbMaqTej_Internalname = "ALBMAQTEJ_"+sGXsfl_120_idx ;
   }

   public void subsflControlProps_fel_1202( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_120_fel_idx );
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_120_fel_idx ;
      cmbAlbRReo.setInternalname( "ALBRREO_"+sGXsfl_120_fel_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_120_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_120_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_120_fel_idx );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_120_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_120_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_120_fel_idx ;
      edtKilos_Internalname = "KILOS_"+sGXsfl_120_fel_idx ;
      edtMetros_Internalname = "METROS_"+sGXsfl_120_fel_idx ;
      edtPiezas_Internalname = "PIEZAS_"+sGXsfl_120_fel_idx ;
      edtAlbRLote_Internalname = "ALBRLOTE_"+sGXsfl_120_fel_idx ;
      edtAlbRTelar_Internalname = "ALBRTELAR_"+sGXsfl_120_fel_idx ;
      edtAlbRLu_Internalname = "ALBRLU_"+sGXsfl_120_fel_idx ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD_"+sGXsfl_120_fel_idx ;
      edtAlbRTara_Internalname = "ALBRTARA_"+sGXsfl_120_fel_idx ;
      edtAlbMaqTej_Internalname = "ALBMAQTEJ_"+sGXsfl_120_fel_idx ;
   }

   public void sendrow_1202( )
   {
      subsflControlProps_1202( ) ;
      wb2900( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_120_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_120_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_120_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 121,'',false,'"+sGXsfl_120_idx+"',120)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_120_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV62GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV62GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV62GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_120_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","",cmbavGridactions.getThemeClass(),"WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,121);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV62GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_120_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "ALBRREO_" + sGXsfl_120_idx ;
         cmbAlbRReo.setName( GXCCtl );
         cmbAlbRReo.setWebtags( "" );
         cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
         cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
         if ( cmbAlbRReo.getItemCount() > 0 )
         {
            A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRReo,cmbAlbRReo.getInternalname(),GXutil.rtrim( A55AlbRReo),Integer.valueOf(1),cmbAlbRReo.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), !bGXsfl_120_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "ALBRUNI_" + sGXsfl_120_idx ;
         cmbAlbRUni.setName( GXCCtl );
         cmbAlbRUni.setWebtags( "" );
         cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
         cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
         if ( cmbAlbRUni.getItemCount() > 0 )
         {
            A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_120_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtKilos_Internalname,GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A595Kilos, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtKilos_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMetros_Internalname,GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A631Metros, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMetros_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPiezas_Internalname,GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A673Piezas), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPiezas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLote_Internalname,GXutil.rtrim( A6463AlbRLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRTelar_Internalname,GXutil.rtrim( A6464AlbRTelar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRTelar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRLu_Internalname,GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6465AlbRLu, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRLu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRMdlCod_Internalname,GXutil.rtrim( A4602AlbRMdlCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRMdlCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRTara_Internalname,GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6470AlbRTara, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRTara_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMaqTej_Internalname,GXutil.rtrim( A8035AlbMaqTej),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbMaqTej_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(120),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2902( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_120_idx = ((subGrid_Islastpage==1)&&(nGXsfl_120_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_120_idx+1) ;
         sGXsfl_120_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_120_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1202( ) ;
      }
      /* End function sendrow_1202 */
   }

   public void startgridcontrol120( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"120\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+cmbavGridactions.getThemeClass()+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rc?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entradas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Utilizadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entradas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Utilizadas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pgdas.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Jogo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "LFA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maq.", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( cmbavGridactions.getThemeClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A55AlbRReo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A595Kilos, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A631Metros, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A673Piezas, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6463AlbRLote));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6464AlbRTelar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6465AlbRLu, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4602AlbRMdlCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6470AlbRTara, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8035AlbMaqTej));
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
      edtDisCod_Internalname = "DISCOD" ;
      edtavDisfec_Internalname = "vDISFEC" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavDisartcod_Internalname = "vDISARTCOD" ;
      edtavDisartdsc_Internalname = "vDISARTDSC" ;
      edtavModa21_Internalname = "vMODA21" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTablepedido_Internalname = "TABLEPEDIDO" ;
      Dvpanel_tablepedido_Internalname = "DVPANEL_TABLEPEDIDO" ;
      lblTextblockalbreccod_Internalname = "TEXTBLOCKALBRECCOD" ;
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      lblImgbsc_promptalmacen_Internalname = "IMGBSC_PROMPTALMACEN" ;
      divTablesearch_promptalmacen_Internalname = "TABLESEARCH_PROMPTALMACEN" ;
      tblTablemergedalbreccod_Internalname = "TABLEMERGEDALBRECCOD" ;
      divTablesplittedalbreccod_Internalname = "TABLESPLITTEDALBRECCOD" ;
      edtavAlbrunient_Internalname = "vALBRUNIENT" ;
      edtavAlbruniuti_Internalname = "vALBRUNIUTI" ;
      cmbavAlbruni.setInternalname( "vALBRUNI" );
      edtavAlbrpieent_Internalname = "vALBRPIEENT" ;
      edtavAlbrpieuti_Internalname = "vALBRPIEUTI" ;
      edtavUnient_Internalname = "vUNIENT" ;
      edtavPieent_Internalname = "vPIEENT" ;
      edtavAlbpmppza_Internalname = "vALBPMPPZA" ;
      cmbavAlbrreo.setInternalname( "vALBRREO" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtKilos_Internalname = "KILOS" ;
      edtMetros_Internalname = "METROS" ;
      edtPiezas_Internalname = "PIEZAS" ;
      edtAlbRLote_Internalname = "ALBRLOTE" ;
      edtAlbRTelar_Internalname = "ALBRTELAR" ;
      edtAlbRLu_Internalname = "ALBRLU" ;
      edtAlbRMdlCod_Internalname = "ALBRMDLCOD" ;
      edtAlbRTara_Internalname = "ALBRTARA" ;
      edtAlbMaqTej_Internalname = "ALBMAQTEJ" ;
      edtavTotvaluekilos_Internalname = "vTOTVALUEKILOS" ;
      edtavTotvaluemetros_Internalname = "vTOTVALUEMETROS" ;
      edtavTotvaluepiezas_Internalname = "vTOTVALUEPIEZAS" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      divGridtablewithtotalizers_Internalname = "GRIDTABLEWITHTOTALIZERS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      edtavAlbrec_Internalname = "vALBREC" ;
      edtavDisalb_Internalname = "vDISALB" ;
      edtavClicod_albrec_Internalname = "vCLICOD_ALBREC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divDvpanel_unnamedtable1_cell_Internalname = "DVPANEL_UNNAMEDTABLE1_CELL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      cmbavDisest.setInternalname( "vDISEST" );
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtAlbMaqTej_Jsonclick = "" ;
      edtAlbRTara_Jsonclick = "" ;
      edtAlbRMdlCod_Jsonclick = "" ;
      edtAlbRLu_Jsonclick = "" ;
      edtAlbRTelar_Jsonclick = "" ;
      edtAlbRLote_Jsonclick = "" ;
      edtPiezas_Jsonclick = "" ;
      edtMetros_Jsonclick = "" ;
      edtKilos_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      cmbAlbRReo.setJsonclick( "" );
      edtAlbRecCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setThemeClass( "ConvertToDDO" );
      subGrid_Class = "GridWithTotalizer GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      lblImgbsc_promptalmacen_Visible = 1 ;
      divTablesearch_promptalmacen_Visible = 1 ;
      edtavAlbreccod_Jsonclick = "" ;
      edtavTotvaluepiezas_Jsonclick = "" ;
      edtavTotvaluepiezas_Enabled = 1 ;
      edtavTotvaluemetros_Jsonclick = "" ;
      edtavTotvaluemetros_Enabled = 1 ;
      edtavTotvaluekilos_Jsonclick = "" ;
      edtavTotvaluekilos_Enabled = 1 ;
      edtavAlbreccod_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      cmbavDisest.setJsonclick( "" );
      cmbavDisest.setVisible( 1 );
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavClicod_albrec_Jsonclick = "" ;
      edtavClicod_albrec_Enabled = 1 ;
      edtavDisalb_Jsonclick = "" ;
      edtavDisalb_Enabled = 1 ;
      edtavAlbrec_Jsonclick = "" ;
      edtavAlbrec_Enabled = 1 ;
      divDvpanel_unnamedtable1_cell_Class = "col-xs-12" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnenter_Visible = 1 ;
      cmbavAlbrreo.setJsonclick( "" );
      cmbavAlbrreo.setEnabled( 1 );
      edtavAlbpmppza_Jsonclick = "" ;
      edtavAlbpmppza_Enabled = 1 ;
      edtavAlbpmppza_Visible = 1 ;
      edtavPieent_Jsonclick = "" ;
      edtavPieent_Enabled = 1 ;
      edtavUnient_Jsonclick = "" ;
      edtavUnient_Enabled = 1 ;
      edtavAlbrpieuti_Jsonclick = "" ;
      edtavAlbrpieuti_Enabled = 1 ;
      edtavAlbrpieent_Jsonclick = "" ;
      edtavAlbrpieent_Enabled = 1 ;
      cmbavAlbruni.setJsonclick( "" );
      cmbavAlbruni.setEnabled( 1 );
      edtavAlbruniuti_Jsonclick = "" ;
      edtavAlbruniuti_Enabled = 1 ;
      edtavAlbrunient_Jsonclick = "" ;
      edtavAlbrunient_Enabled = 1 ;
      edtavModa21_Jsonclick = "" ;
      edtavModa21_Enabled = 1 ;
      edtavDisartdsc_Jsonclick = "" ;
      edtavDisartdsc_Enabled = 0 ;
      edtavDisartcod_Jsonclick = "" ;
      edtavDisartcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      edtavDisfec_Jsonclick = "" ;
      edtavDisfec_Enabled = 0 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Unidades;Unidades;;Piezas;Piezas;;;;;;;;;;" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "Pedidos.DisAlb____WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|NO:NO,SI:SI|||K:K,M:M||||||||||||" ;
      Ddo_grid_Allowmultipleselection = "|T|||T||||||||||||" ;
      Ddo_grid_Datalisttype = "|FixedValues|||FixedValues|||Dynamic||||Dynamic|Dynamic||Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|||T|||T||||T|T||T||T" ;
      Ddo_grid_Filterisrange = "T||T|T||T|T||T|T|T|||T||T|" ;
      Ddo_grid_Filtertype = "Numeric||Numeric|Numeric||Numeric|Numeric|Character|Numeric|Numeric|Numeric|Character|Character|Numeric|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T||T|T||T|T|T|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17" ;
      Ddo_grid_Columnids = "1:AlbRecCod|2:AlbRReo|3:AlbRUniEnt|4:AlbRUniUti|5:AlbRUni|6:AlbRPieEnt|7:AlbRPieUti|8:AlbRef|9:Kilos|10:Metros|11:Piezas|12:AlbRLote|13:AlbRTelar|14:AlbRLu|15:AlbRMdlCod|16:AlbRTara|17:AlbMaqTej" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "Opcion", "") ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Dvpanel_tablepedido_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Iconposition = "Right" ;
      Dvpanel_tablepedido_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tablepedido_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_tablepedido_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablepedido_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablepedido_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablepedido_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Entrada de Almacén", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbruni.setName( "vALBRUNI" );
      cmbavAlbruni.setWebtags( "" );
      cmbavAlbruni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbavAlbruni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbavAlbruni.getItemCount() > 0 )
      {
         AV74AlbRUni = cmbavAlbruni.getValidValue(AV74AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74AlbRUni", AV74AlbRUni);
      }
      cmbavAlbrreo.setName( "vALBRREO" );
      cmbavAlbrreo.setWebtags( "" );
      cmbavAlbrreo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbavAlbrreo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbavAlbrreo.getItemCount() > 0 )
      {
         AV89AlbRReo = cmbavAlbrreo.getValidValue(AV89AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRReo", AV89AlbRReo);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_120_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV62GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV62GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62GridActions), 4, 0));
      }
      GXCCtl = "ALBRREO_" + sGXsfl_120_idx ;
      cmbAlbRReo.setName( GXCCtl );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_120_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      cmbavDisest.setName( "vDISEST" );
      cmbavDisest.setWebtags( "" );
      cmbavDisest.addItem("1", httpContext.getMessage( "En Pedido", ""), (short)(0));
      cmbavDisest.addItem("3", httpContext.getMessage( "En Produccion", ""), (short)(0));
      if ( cmbavDisest.getItemCount() > 0 )
      {
         AV97DisEst = (byte)(GXutil.lval( cmbavDisest.getValidValue(GXutil.trim( GXutil.str( AV97DisEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97DisEst", GXutil.str( AV97DisEst, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV97DisEst), "9")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e112902',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV32TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV26TFAlbRReo_SelsJson',fld:'vTFALBRREO_SELSJSON',pic:''},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e202902',iparms:[{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV62GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e212902',iparms:[{av:'cmbavGridactions'},{av:'AV62GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV62GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e122902',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e142902',iparms:[{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV84Clicod_albrec',fld:'vCLICOD_ALBREC',pic:'ZZZ9'},{av:'cmbavAlbruni'},{av:'AV74AlbRUni',fld:'vALBRUNI',pic:'@!'},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV77Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV86Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e132902',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'cmbavAlbrreo'},{av:'AV89AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e152902',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOIMGBSC_PROMPTALMACEN'","{handler:'e162902',iparms:[{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOIMGBSC_PROMPTALMACEN'",",oparms:[{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV103AlbPmPPza',fld:'vALBPMPPZA',pic:'Z9.999'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV98disalb',fld:'vDISALB',pic:'ZZZ9'},{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV84Clicod_albrec',fld:'vCLICOD_ALBREC',pic:'ZZZ9'},{av:'cmbavAlbrreo'},{av:'AV89AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV86Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV77Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'cmbavAlbruni'},{av:'AV74AlbRUni',fld:'vALBRUNI',pic:'@!'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED","{handler:'e172902',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true}]");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV103AlbPmPPza',fld:'vALBPMPPZA',pic:'Z9.999'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV98disalb',fld:'vDISALB',pic:'ZZZ9'},{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV84Clicod_albrec',fld:'vCLICOD_ALBREC',pic:'ZZZ9'},{av:'cmbavAlbrreo'},{av:'AV89AlbRReo',fld:'vALBRREO',pic:'@!'},{av:'AV86Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV77Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'cmbavAlbruni'},{av:'AV74AlbRUni',fld:'vALBRUNI',pic:'@!'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9',hsh:true},{av:'cmbavDisest'},{av:'AV97DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV68DisUnimed',fld:'vDISUNIMED',pic:'@!',hsh:true},{av:'AV79AlbRfeni',fld:'vALBRFENI',pic:'',hsh:true},{av:'AV81Albrfenf',fld:'vALBRFENF',pic:'',hsh:true},{av:'AV96Cod_Idtx',fld:'vCOD_IDTX',pic:'',hsh:true},{av:'AV63CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV65DisArtCod',fld:'vDISARTCOD',pic:'',hsh:true},{av:'AV104Moda21',fld:'vMODA21',pic:'ZZZ9'},{av:'AV24TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV25TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV27TFAlbRReo_Sels',fld:'vTFALBRREO_SELS',pic:''},{av:'AV28TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV29TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV30TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV31TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV33TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV34TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV35TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV37TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV38TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV39TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFKilos',fld:'vTFKILOS',pic:'ZZZZZ9.99'},{av:'AV41TFKilos_To',fld:'vTFKILOS_TO',pic:'ZZZZZ9.99'},{av:'AV42TFMetros',fld:'vTFMETROS',pic:'ZZZZZ9.99'},{av:'AV43TFMetros_To',fld:'vTFMETROS_TO',pic:'ZZZZZ9.99'},{av:'AV44TFPiezas',fld:'vTFPIEZAS',pic:'ZZZZZ9'},{av:'AV45TFPiezas_To',fld:'vTFPIEZAS_TO',pic:'ZZZZZ9'},{av:'AV46TFAlbRLote',fld:'vTFALBRLOTE',pic:''},{av:'AV47TFAlbRLote_Sel',fld:'vTFALBRLOTE_SEL',pic:''},{av:'AV48TFAlbRTelar',fld:'vTFALBRTELAR',pic:''},{av:'AV49TFAlbRTelar_Sel',fld:'vTFALBRTELAR_SEL',pic:''},{av:'AV50TFAlbRLu',fld:'vTFALBRLU',pic:'ZZ9.99'},{av:'AV51TFAlbRLu_To',fld:'vTFALBRLU_TO',pic:'ZZ9.99'},{av:'AV52TFAlbRMdlCod',fld:'vTFALBRMDLCOD',pic:''},{av:'AV53TFAlbRMdlCod_Sel',fld:'vTFALBRMDLCOD_SEL',pic:''},{av:'AV54TFAlbRTara',fld:'vTFALBRTARA',pic:'ZZ9.99'},{av:'AV55TFAlbRTara_To',fld:'vTFALBRTARA_TO',pic:'ZZ9.99'},{av:'AV56TFAlbMaqTej',fld:'vTFALBMAQTEJ',pic:''},{av:'AV57TFAlbMaqTej_Sel',fld:'vTFALBMAQTEJ_SEL',pic:''},{av:'AV107Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'A595Kilos',fld:'KILOS',pic:'ZZZZZ9.99'},{av:'A631Metros',fld:'METROS',pic:'ZZZZZ9.99'},{av:'A673Piezas',fld:'PIEZAS',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV87albrec',fld:'vALBREC',pic:'ZZZ9'},{av:'AV75AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV76AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV72AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV73AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV82Unient',fld:'vUNIENT',pic:'ZZZZZ9.99'},{av:'AV83PieEnt',fld:'vPIEENT',pic:'ZZZZZ9'},{av:'AV71AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV90TotKilos',fld:'vTOTKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV92TotMetros',fld:'vTOTMETROS',pic:'ZZZZZ9.99',hsh:true},{av:'AV94TotPiezas',fld:'vTOTPIEZAS',pic:'ZZZZZ9',hsh:true},{av:'AV91TotValueKilos',fld:'vTOTVALUEKILOS',pic:''},{av:'AV93TotValueMetros',fld:'vTOTVALUEMETROS',pic:''},{av:'AV95TotValuePiezas',fld:'vTOTVALUEPIEZAS',pic:''}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALIDV_ALBRUNI","{handler:'validv_Albruni',iparms:[]");
      setEventMetadata("VALIDV_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALIDV_ALBRREO","{handler:'validv_Albrreo',iparms:[]");
      setEventMetadata("VALIDV_ALBRREO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albmaqtej',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOAV64CliNom = "" ;
      wcpOAV65DisArtCod = "" ;
      wcpOAV66DisArtDsc = "" ;
      wcpOAV67DisFec = GXutil.nullDate() ;
      wcpOAV68DisUnimed = "" ;
      wcpOAV96Cod_Idtx = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV64CliNom = "" ;
      AV65DisArtCod = "" ;
      AV66DisArtDsc = "" ;
      AV67DisFec = GXutil.nullDate() ;
      AV68DisUnimed = "" ;
      AV96Cod_Idtx = "" ;
      AV27TFAlbRReo_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV28TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV29TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV30TFAlbRUniUti = DecimalUtil.ZERO ;
      AV31TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV33TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV38TFAlbRef = "" ;
      AV39TFAlbRef_Sel = "" ;
      AV40TFKilos = DecimalUtil.ZERO ;
      AV41TFKilos_To = DecimalUtil.ZERO ;
      AV42TFMetros = DecimalUtil.ZERO ;
      AV43TFMetros_To = DecimalUtil.ZERO ;
      AV46TFAlbRLote = "" ;
      AV47TFAlbRLote_Sel = "" ;
      AV48TFAlbRTelar = "" ;
      AV49TFAlbRTelar_Sel = "" ;
      AV50TFAlbRLu = DecimalUtil.ZERO ;
      AV51TFAlbRLu_To = DecimalUtil.ZERO ;
      AV52TFAlbRMdlCod = "" ;
      AV53TFAlbRMdlCod_Sel = "" ;
      AV54TFAlbRTara = DecimalUtil.ZERO ;
      AV55TFAlbRTara_To = DecimalUtil.ZERO ;
      AV56TFAlbMaqTej = "" ;
      AV57TFAlbMaqTej_Sel = "" ;
      AV107Pgmname = "" ;
      AV90TotKilos = DecimalUtil.ZERO ;
      AV92TotMetros = DecimalUtil.ZERO ;
      AV79AlbRfeni = GXutil.nullDate() ;
      AV81Albrfenf = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV58DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV77Kilos = DecimalUtil.ZERO ;
      AV86Metros = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tablepedido = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      lblTextblockalbreccod_Jsonclick = "" ;
      AV72AlbRUniEnt = DecimalUtil.ZERO ;
      AV73AlbRUniUti = DecimalUtil.ZERO ;
      AV74AlbRUni = "" ;
      AV82Unient = DecimalUtil.ZERO ;
      AV103AlbPmPPza = DecimalUtil.ZERO ;
      AV89AlbRReo = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV110Pedidos_disalb____wwds_3_tfalbrreo_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV111Pedidos_disalb____wwds_4_tfalbrunient = DecimalUtil.ZERO ;
      AV112Pedidos_disalb____wwds_5_tfalbrunient_to = DecimalUtil.ZERO ;
      AV113Pedidos_disalb____wwds_6_tfalbruniuti = DecimalUtil.ZERO ;
      AV114Pedidos_disalb____wwds_7_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV115Pedidos_disalb____wwds_8_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV120Pedidos_disalb____wwds_13_tfalbref = "" ;
      AV121Pedidos_disalb____wwds_14_tfalbref_sel = "" ;
      AV122Pedidos_disalb____wwds_15_tfkilos = DecimalUtil.ZERO ;
      AV123Pedidos_disalb____wwds_16_tfkilos_to = DecimalUtil.ZERO ;
      AV124Pedidos_disalb____wwds_17_tfmetros = DecimalUtil.ZERO ;
      AV125Pedidos_disalb____wwds_18_tfmetros_to = DecimalUtil.ZERO ;
      AV128Pedidos_disalb____wwds_21_tfalbrlote = "" ;
      AV129Pedidos_disalb____wwds_22_tfalbrlote_sel = "" ;
      AV130Pedidos_disalb____wwds_23_tfalbrtelar = "" ;
      AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel = "" ;
      AV132Pedidos_disalb____wwds_25_tfalbrlu = DecimalUtil.ZERO ;
      AV133Pedidos_disalb____wwds_26_tfalbrlu_to = DecimalUtil.ZERO ;
      AV134Pedidos_disalb____wwds_27_tfalbrmdlcod = "" ;
      AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel = "" ;
      AV136Pedidos_disalb____wwds_29_tfalbrtara = DecimalUtil.ZERO ;
      AV137Pedidos_disalb____wwds_30_tfalbrtara_to = DecimalUtil.ZERO ;
      AV138Pedidos_disalb____wwds_31_tfalbmaqtej = "" ;
      AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel = "" ;
      A55AlbRReo = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      A45AlbRef = "" ;
      A595Kilos = DecimalUtil.ZERO ;
      A631Metros = DecimalUtil.ZERO ;
      A6463AlbRLote = "" ;
      A6464AlbRTelar = "" ;
      A6465AlbRLu = DecimalUtil.ZERO ;
      A4602AlbRMdlCod = "" ;
      A6470AlbRTara = DecimalUtil.ZERO ;
      A8035AlbMaqTej = "" ;
      scmdbuf = "" ;
      lV120Pedidos_disalb____wwds_13_tfalbref = "" ;
      lV128Pedidos_disalb____wwds_21_tfalbrlote = "" ;
      lV130Pedidos_disalb____wwds_23_tfalbrtelar = "" ;
      lV134Pedidos_disalb____wwds_27_tfalbrmdlcod = "" ;
      lV138Pedidos_disalb____wwds_31_tfalbmaqtej = "" ;
      H02902_A396EmprCod = new String[] {""} ;
      H02902_A361DisCod = new int[1] ;
      H02902_A8035AlbMaqTej = new String[] {""} ;
      H02902_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02902_A4602AlbRMdlCod = new String[] {""} ;
      H02902_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02902_A6464AlbRTelar = new String[] {""} ;
      H02902_A6463AlbRLote = new String[] {""} ;
      H02902_A673Piezas = new int[1] ;
      H02902_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02902_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02902_A45AlbRef = new String[] {""} ;
      H02902_A54AlbRPieUti = new int[1] ;
      H02902_A52AlbRPieEnt = new int[1] ;
      H02902_A56AlbRUni = new String[] {""} ;
      H02902_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02902_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02902_A55AlbRReo = new String[] {""} ;
      H02902_A44AlbRecCod = new int[1] ;
      H02903_AGRID_nRecordCount = new long[1] ;
      AV91TotValueKilos = "" ;
      AV93TotValueMetros = "" ;
      AV95TotValuePiezas = "" ;
      hsh = "" ;
      AV99Station = "" ;
      AV100EmprCod = "" ;
      AV101EmprNom = "" ;
      AV102UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV26TFAlbRReo_SelsJson = "" ;
      AV32TFAlbRUni_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV88UniCtrl = DecimalUtil.ZERO ;
      AV85ALbRlote = "" ;
      AV140Emprcod_selected = "" ;
      AV20Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char23 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char31 = "" ;
      GXt_char29 = "" ;
      GXt_char27 = "" ;
      GXt_char25 = "" ;
      GXv_char26 = new String[1] ;
      GXt_char24 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState33 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H02904_A396EmprCod = new String[] {""} ;
      H02904_A361DisCod = new int[1] ;
      H02904_A8035AlbMaqTej = new String[] {""} ;
      H02904_A6470AlbRTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02904_A4602AlbRMdlCod = new String[] {""} ;
      H02904_A6465AlbRLu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02904_A6464AlbRTelar = new String[] {""} ;
      H02904_A6463AlbRLote = new String[] {""} ;
      H02904_A673Piezas = new int[1] ;
      H02904_A631Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02904_A595Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02904_A45AlbRef = new String[] {""} ;
      H02904_A54AlbRPieUti = new int[1] ;
      H02904_A52AlbRPieEnt = new int[1] ;
      H02904_A56AlbRUni = new String[] {""} ;
      H02904_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02904_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02904_A55AlbRReo = new String[] {""} ;
      H02904_A44AlbRecCod = new int[1] ;
      GXv_int21 = new int[1] ;
      GXv_int17 = new int[1] ;
      GXv_char32 = new String[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int16 = new int[1] ;
      GXv_char30 = new String[1] ;
      GXv_char28 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int19 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      lblImgbsc_promptalmacen_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.disalb____ww__default(),
         new Object[] {
             new Object[] {
            H02902_A396EmprCod, H02902_A361DisCod, H02902_A8035AlbMaqTej, H02902_A6470AlbRTara, H02902_A4602AlbRMdlCod, H02902_A6465AlbRLu, H02902_A6464AlbRTelar, H02902_A6463AlbRLote, H02902_A673Piezas, H02902_A631Metros,
            H02902_A595Kilos, H02902_A45AlbRef, H02902_A54AlbRPieUti, H02902_A52AlbRPieEnt, H02902_A56AlbRUni, H02902_A60AlbRUniUti, H02902_A58AlbRUniEnt, H02902_A55AlbRReo, H02902_A44AlbRecCod
            }
            , new Object[] {
            H02903_AGRID_nRecordCount
            }
            , new Object[] {
            H02904_A396EmprCod, H02904_A361DisCod, H02904_A8035AlbMaqTej, H02904_A6470AlbRTara, H02904_A4602AlbRMdlCod, H02904_A6465AlbRLu, H02904_A6464AlbRTelar, H02904_A6463AlbRLote, H02904_A673Piezas, H02904_A631Metros,
            H02904_A595Kilos, H02904_A45AlbRef, H02904_A54AlbRPieUti, H02904_A52AlbRPieEnt, H02904_A56AlbRUni, H02904_A60AlbRUniUti, H02904_A58AlbRUniEnt, H02904_A55AlbRReo, H02904_A44AlbRecCod
            }
         }
      );
      AV107Pgmname = "Pedidos.DisAlb____WW" ;
      /* GeneXus formulas. */
      AV107Pgmname = "Pedidos.DisAlb____WW" ;
      Gx_err = (short)(0) ;
      edtavDisfec_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavDisartcod_Enabled = 0 ;
      edtavDisartdsc_Enabled = 0 ;
      edtavModa21_Enabled = 0 ;
      edtavAlbrunient_Enabled = 0 ;
      edtavAlbruniuti_Enabled = 0 ;
      cmbavAlbruni.setEnabled( 0 );
      edtavAlbrpieent_Enabled = 0 ;
      edtavAlbrpieuti_Enabled = 0 ;
      edtavAlbpmppza_Enabled = 0 ;
      cmbavAlbrreo.setEnabled( 0 );
      edtavTotvaluekilos_Enabled = 0 ;
      edtavTotvaluemetros_Enabled = 0 ;
      edtavTotvaluepiezas_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      edtavAlbrec_Enabled = 0 ;
      edtavDisalb_Enabled = 0 ;
      edtavClicod_albrec_Enabled = 0 ;
   }

   private byte wcpOAV97DisEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV97DisEst ;
   private byte gxajaxcallmode ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short AV104Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV87albrec ;
   private short AV98disalb ;
   private short AV84Clicod_albrec ;
   private short AV62GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int19[] ;
   private short GXv_int18[] ;
   private int wcpOA361DisCod ;
   private int wcpOAV63CliCod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_120 ;
   private int A361DisCod ;
   private int AV63CliCod ;
   private int nGXsfl_120_idx=1 ;
   private int AV24TFAlbRecCod ;
   private int AV25TFAlbRecCod_To ;
   private int AV34TFAlbRPieEnt ;
   private int AV35TFAlbRPieEnt_To ;
   private int AV36TFAlbRPieUti ;
   private int AV37TFAlbRPieUti_To ;
   private int AV44TFPiezas ;
   private int AV45TFPiezas_To ;
   private int edtDisCod_Enabled ;
   private int edtavDisfec_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavDisartcod_Enabled ;
   private int edtavDisartdsc_Enabled ;
   private int edtavModa21_Enabled ;
   private int edtavAlbrunient_Enabled ;
   private int edtavAlbruniuti_Enabled ;
   private int AV75AlbRPieEnt ;
   private int edtavAlbrpieent_Enabled ;
   private int AV76AlbRPieUti ;
   private int edtavAlbrpieuti_Enabled ;
   private int edtavUnient_Enabled ;
   private int AV83PieEnt ;
   private int edtavPieent_Enabled ;
   private int edtavAlbpmppza_Visible ;
   private int edtavAlbpmppza_Enabled ;
   private int bttBtnenter_Visible ;
   private int edtavPgmname_Enabled ;
   private int edtavAlbrec_Enabled ;
   private int edtavDisalb_Enabled ;
   private int edtavClicod_albrec_Enabled ;
   private int edtEmprCod_Visible ;
   private int AV108Pedidos_disalb____wwds_1_tfalbreccod ;
   private int AV109Pedidos_disalb____wwds_2_tfalbreccod_to ;
   private int AV116Pedidos_disalb____wwds_9_tfalbrpieent ;
   private int AV117Pedidos_disalb____wwds_10_tfalbrpieent_to ;
   private int AV118Pedidos_disalb____wwds_11_tfalbrpieuti ;
   private int AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to ;
   private int AV126Pedidos_disalb____wwds_19_tfpiezas ;
   private int AV127Pedidos_disalb____wwds_20_tfpiezas_to ;
   private int A44AlbRecCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A673Piezas ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluekilos_Enabled ;
   private int edtavTotvaluemetros_Enabled ;
   private int edtavTotvaluepiezas_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV110Pedidos_disalb____wwds_3_tfalbrreo_sels_size ;
   private int AV115Pedidos_disalb____wwds_8_tfalbruni_sels_size ;
   private int AV71AlbRecCod ;
   private int edtavAlbreccod_Enabled ;
   private int divTablesearch_promptalmacen_Visible ;
   private int lblImgbsc_promptalmacen_Visible ;
   private int AV78Piezas ;
   private int AV141Discod_selected ;
   private int AV142Albreccod_selected ;
   private int AV143GXV1 ;
   private int GXv_int21[] ;
   private int GXv_int17[] ;
   private int GXv_int16[] ;
   private int GXv_int11[] ;
   private int GXv_int10[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV94TotPiezas ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV28TFAlbRUniEnt ;
   private java.math.BigDecimal AV29TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV30TFAlbRUniUti ;
   private java.math.BigDecimal AV31TFAlbRUniUti_To ;
   private java.math.BigDecimal AV40TFKilos ;
   private java.math.BigDecimal AV41TFKilos_To ;
   private java.math.BigDecimal AV42TFMetros ;
   private java.math.BigDecimal AV43TFMetros_To ;
   private java.math.BigDecimal AV50TFAlbRLu ;
   private java.math.BigDecimal AV51TFAlbRLu_To ;
   private java.math.BigDecimal AV54TFAlbRTara ;
   private java.math.BigDecimal AV55TFAlbRTara_To ;
   private java.math.BigDecimal AV90TotKilos ;
   private java.math.BigDecimal AV92TotMetros ;
   private java.math.BigDecimal AV77Kilos ;
   private java.math.BigDecimal AV86Metros ;
   private java.math.BigDecimal AV72AlbRUniEnt ;
   private java.math.BigDecimal AV73AlbRUniUti ;
   private java.math.BigDecimal AV82Unient ;
   private java.math.BigDecimal AV103AlbPmPPza ;
   private java.math.BigDecimal AV111Pedidos_disalb____wwds_4_tfalbrunient ;
   private java.math.BigDecimal AV112Pedidos_disalb____wwds_5_tfalbrunient_to ;
   private java.math.BigDecimal AV113Pedidos_disalb____wwds_6_tfalbruniuti ;
   private java.math.BigDecimal AV114Pedidos_disalb____wwds_7_tfalbruniuti_to ;
   private java.math.BigDecimal AV122Pedidos_disalb____wwds_15_tfkilos ;
   private java.math.BigDecimal AV123Pedidos_disalb____wwds_16_tfkilos_to ;
   private java.math.BigDecimal AV124Pedidos_disalb____wwds_17_tfmetros ;
   private java.math.BigDecimal AV125Pedidos_disalb____wwds_18_tfmetros_to ;
   private java.math.BigDecimal AV132Pedidos_disalb____wwds_25_tfalbrlu ;
   private java.math.BigDecimal AV133Pedidos_disalb____wwds_26_tfalbrlu_to ;
   private java.math.BigDecimal AV136Pedidos_disalb____wwds_29_tfalbrtara ;
   private java.math.BigDecimal AV137Pedidos_disalb____wwds_30_tfalbrtara_to ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A595Kilos ;
   private java.math.BigDecimal A631Metros ;
   private java.math.BigDecimal A6465AlbRLu ;
   private java.math.BigDecimal A6470AlbRTara ;
   private java.math.BigDecimal AV88UniCtrl ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOA396EmprCod ;
   private String wcpOAV64CliNom ;
   private String wcpOAV65DisArtCod ;
   private String wcpOAV66DisArtDsc ;
   private String wcpOAV68DisUnimed ;
   private String wcpOAV96Cod_Idtx ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV64CliNom ;
   private String AV65DisArtCod ;
   private String AV66DisArtDsc ;
   private String AV68DisUnimed ;
   private String AV96Cod_Idtx ;
   private String sGXsfl_120_idx="0001" ;
   private String AV38TFAlbRef ;
   private String AV39TFAlbRef_Sel ;
   private String AV46TFAlbRLote ;
   private String AV47TFAlbRLote_Sel ;
   private String AV48TFAlbRTelar ;
   private String AV49TFAlbRTelar_Sel ;
   private String AV52TFAlbRMdlCod ;
   private String AV53TFAlbRMdlCod_Sel ;
   private String AV56TFAlbMaqTej ;
   private String AV57TFAlbMaqTej_Sel ;
   private String AV107Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tablepedido_Width ;
   private String Dvpanel_tablepedido_Cls ;
   private String Dvpanel_tablepedido_Title ;
   private String Dvpanel_tablepedido_Iconposition ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tablepedido_Internalname ;
   private String divTablepedido_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtavDisfec_Internalname ;
   private String edtavDisfec_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavDisartcod_Internalname ;
   private String edtavDisartcod_Jsonclick ;
   private String edtavDisartdsc_Internalname ;
   private String edtavDisartdsc_Jsonclick ;
   private String edtavModa21_Internalname ;
   private String TempTags ;
   private String edtavModa21_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedalbreccod_Internalname ;
   private String lblTextblockalbreccod_Internalname ;
   private String lblTextblockalbreccod_Jsonclick ;
   private String edtavAlbrunient_Internalname ;
   private String edtavAlbrunient_Jsonclick ;
   private String edtavAlbruniuti_Internalname ;
   private String edtavAlbruniuti_Jsonclick ;
   private String AV74AlbRUni ;
   private String edtavAlbrpieent_Internalname ;
   private String edtavAlbrpieent_Jsonclick ;
   private String edtavAlbrpieuti_Internalname ;
   private String edtavAlbrpieuti_Jsonclick ;
   private String edtavUnient_Internalname ;
   private String edtavUnient_Jsonclick ;
   private String edtavPieent_Internalname ;
   private String edtavPieent_Jsonclick ;
   private String edtavAlbpmppza_Internalname ;
   private String edtavAlbpmppza_Jsonclick ;
   private String AV89AlbRReo ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Internalname ;
   private String divDvpanel_unnamedtable1_cell_Class ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavAlbrec_Internalname ;
   private String edtavAlbrec_Jsonclick ;
   private String edtavDisalb_Internalname ;
   private String edtavDisalb_Jsonclick ;
   private String edtavClicod_albrec_Internalname ;
   private String edtavClicod_albrec_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV120Pedidos_disalb____wwds_13_tfalbref ;
   private String AV121Pedidos_disalb____wwds_14_tfalbref_sel ;
   private String AV128Pedidos_disalb____wwds_21_tfalbrlote ;
   private String AV129Pedidos_disalb____wwds_22_tfalbrlote_sel ;
   private String AV130Pedidos_disalb____wwds_23_tfalbrtelar ;
   private String AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel ;
   private String AV134Pedidos_disalb____wwds_27_tfalbrmdlcod ;
   private String AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ;
   private String AV138Pedidos_disalb____wwds_31_tfalbmaqtej ;
   private String AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel ;
   private String edtAlbRecCod_Internalname ;
   private String A55AlbRReo ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String A56AlbRUni ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String edtKilos_Internalname ;
   private String edtMetros_Internalname ;
   private String edtPiezas_Internalname ;
   private String A6463AlbRLote ;
   private String edtAlbRLote_Internalname ;
   private String A6464AlbRTelar ;
   private String edtAlbRTelar_Internalname ;
   private String edtAlbRLu_Internalname ;
   private String A4602AlbRMdlCod ;
   private String edtAlbRMdlCod_Internalname ;
   private String edtAlbRTara_Internalname ;
   private String A8035AlbMaqTej ;
   private String edtAlbMaqTej_Internalname ;
   private String edtavTotvaluekilos_Internalname ;
   private String edtavTotvaluemetros_Internalname ;
   private String edtavTotvaluepiezas_Internalname ;
   private String scmdbuf ;
   private String lV120Pedidos_disalb____wwds_13_tfalbref ;
   private String lV128Pedidos_disalb____wwds_21_tfalbrlote ;
   private String lV130Pedidos_disalb____wwds_23_tfalbrtelar ;
   private String lV134Pedidos_disalb____wwds_27_tfalbrmdlcod ;
   private String lV138Pedidos_disalb____wwds_31_tfalbmaqtej ;
   private String edtavAlbreccod_Internalname ;
   private String hsh ;
   private String AV99Station ;
   private String AV100EmprCod ;
   private String AV101EmprNom ;
   private String AV102UsurCod ;
   private String divTablesearch_promptalmacen_Internalname ;
   private String lblImgbsc_promptalmacen_Internalname ;
   private String AV85ALbRlote ;
   private String AV140Emprcod_selected ;
   private String GXt_char1 ;
   private String GXt_char23 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char31 ;
   private String GXt_char29 ;
   private String GXt_char27 ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char24 ;
   private String GXv_char4[] ;
   private String GXv_char32[] ;
   private String GXv_char30[] ;
   private String GXv_char28[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluekilos_Jsonclick ;
   private String edtavTotvaluemetros_Jsonclick ;
   private String edtavTotvaluepiezas_Jsonclick ;
   private String tblTablemergedalbreccod_Internalname ;
   private String edtavAlbreccod_Jsonclick ;
   private String lblImgbsc_promptalmacen_Jsonclick ;
   private String sGXsfl_120_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtKilos_Jsonclick ;
   private String edtMetros_Jsonclick ;
   private String edtPiezas_Jsonclick ;
   private String edtAlbRLote_Jsonclick ;
   private String edtAlbRTelar_Jsonclick ;
   private String edtAlbRLu_Jsonclick ;
   private String edtAlbRMdlCod_Jsonclick ;
   private String edtAlbRTara_Jsonclick ;
   private String edtAlbMaqTej_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV67DisFec ;
   private java.util.Date AV67DisFec ;
   private java.util.Date AV79AlbRfeni ;
   private java.util.Date AV81Albrfenf ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tablepedido_Autowidth ;
   private boolean Dvpanel_tablepedido_Autoheight ;
   private boolean Dvpanel_tablepedido_Collapsible ;
   private boolean Dvpanel_tablepedido_Collapsed ;
   private boolean Dvpanel_tablepedido_Showcollapseicon ;
   private boolean Dvpanel_tablepedido_Autoscroll ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_120_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV26TFAlbRReo_SelsJson ;
   private String AV32TFAlbRUni_SelsJson ;
   private String AV91TotValueKilos ;
   private String AV93TotValueMetros ;
   private String AV95TotValuePiezas ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablepedido ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbruni ;
   private HTMLChoice cmbavAlbrreo ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbavDisest ;
   private IDataStoreProvider pr_default ;
   private String[] H02902_A396EmprCod ;
   private int[] H02902_A361DisCod ;
   private String[] H02902_A8035AlbMaqTej ;
   private java.math.BigDecimal[] H02902_A6470AlbRTara ;
   private String[] H02902_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] H02902_A6465AlbRLu ;
   private String[] H02902_A6464AlbRTelar ;
   private String[] H02902_A6463AlbRLote ;
   private int[] H02902_A673Piezas ;
   private java.math.BigDecimal[] H02902_A631Metros ;
   private java.math.BigDecimal[] H02902_A595Kilos ;
   private String[] H02902_A45AlbRef ;
   private int[] H02902_A54AlbRPieUti ;
   private int[] H02902_A52AlbRPieEnt ;
   private String[] H02902_A56AlbRUni ;
   private java.math.BigDecimal[] H02902_A60AlbRUniUti ;
   private java.math.BigDecimal[] H02902_A58AlbRUniEnt ;
   private String[] H02902_A55AlbRReo ;
   private int[] H02902_A44AlbRecCod ;
   private long[] H02903_AGRID_nRecordCount ;
   private String[] H02904_A396EmprCod ;
   private int[] H02904_A361DisCod ;
   private String[] H02904_A8035AlbMaqTej ;
   private java.math.BigDecimal[] H02904_A6470AlbRTara ;
   private String[] H02904_A4602AlbRMdlCod ;
   private java.math.BigDecimal[] H02904_A6465AlbRLu ;
   private String[] H02904_A6464AlbRTelar ;
   private String[] H02904_A6463AlbRLote ;
   private int[] H02904_A673Piezas ;
   private java.math.BigDecimal[] H02904_A631Metros ;
   private java.math.BigDecimal[] H02904_A595Kilos ;
   private String[] H02904_A45AlbRef ;
   private int[] H02904_A54AlbRPieUti ;
   private int[] H02904_A52AlbRPieEnt ;
   private String[] H02904_A56AlbRUni ;
   private java.math.BigDecimal[] H02904_A60AlbRUniUti ;
   private java.math.BigDecimal[] H02904_A58AlbRUniEnt ;
   private String[] H02904_A55AlbRReo ;
   private int[] H02904_A44AlbRecCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV27TFAlbRReo_Sels ;
   private GXSimpleCollection<String> AV33TFAlbRUni_Sels ;
   private GXSimpleCollection<String> AV110Pedidos_disalb____wwds_3_tfalbrreo_sels ;
   private GXSimpleCollection<String> AV115Pedidos_disalb____wwds_8_tfalbruni_sels ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV58DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState33[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class disalb____ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02902( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV110Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV115Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV108Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV109Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV110Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV111Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV112Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV113Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV114Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV115Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV116Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV117Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV118Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV121Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV120Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV122Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV123Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV124Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV125Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV126Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV127Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV129Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV128Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV130Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV132Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV133Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV134Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV136Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV137Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV138Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[37];
      Object[] GXv_Object35 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.DisCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRMdlCod, T2.AlbRLu, T2.AlbRTelar, T2.AlbRLote, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRef, T2.AlbRPieUti," ;
      sSelectString += " T2.AlbRPieEnt, T2.AlbRUni, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRReo, T1.AlbRecCod" ;
      sFromString = " FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV108Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
      }
      if ( AV110Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int34[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int34[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( AV115Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV116Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( ! (0==AV118Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV120Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV130Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV134Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV138Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int34[31] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRReo" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRUniEnt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRUniEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRUniUti" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRUniUti DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRUni" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRUni DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRPieEnt" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRPieEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRPieUti" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRPieUti DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRef" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRef DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Kilos" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Kilos DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Metros" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Metros DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Piezas" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Piezas DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRLote" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRLote DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRTelar" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRTelar DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRLu" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRLu DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRMdlCod" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRMdlCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRTara" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRTara DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbMaqTej" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbMaqTej DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DisCod, T1.AlbRecCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
   }

   protected Object[] conditional_H02903( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV110Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV115Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV108Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV109Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV110Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV111Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV112Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV113Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV114Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV115Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV116Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV117Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV118Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV121Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV120Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV122Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV123Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV124Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV125Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV126Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV127Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV129Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV128Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV130Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV132Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV133Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV134Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV136Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV137Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV138Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int37 = new byte[32];
      Object[] GXv_Object38 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV108Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int37[2] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int37[3] = (byte)(1) ;
      }
      if ( AV110Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int37[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int37[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int37[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int37[7] = (byte)(1) ;
      }
      if ( AV115Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV116Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int37[8] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int37[9] = (byte)(1) ;
      }
      if ( ! (0==AV118Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int37[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int37[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV120Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int37[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int37[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int37[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int37[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int37[17] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int37[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int37[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int37[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV130Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int37[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int37[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int37[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV134Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int37[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int37[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int37[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV138Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int37[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int37[31] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object38[0] = scmdbuf ;
      GXv_Object38[1] = GXv_int37 ;
      return GXv_Object38 ;
   }

   protected Object[] conditional_H02904( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A55AlbRReo ,
                                          GXSimpleCollection<String> AV110Pedidos_disalb____wwds_3_tfalbrreo_sels ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV115Pedidos_disalb____wwds_8_tfalbruni_sels ,
                                          int AV108Pedidos_disalb____wwds_1_tfalbreccod ,
                                          int AV109Pedidos_disalb____wwds_2_tfalbreccod_to ,
                                          int AV110Pedidos_disalb____wwds_3_tfalbrreo_sels_size ,
                                          java.math.BigDecimal AV111Pedidos_disalb____wwds_4_tfalbrunient ,
                                          java.math.BigDecimal AV112Pedidos_disalb____wwds_5_tfalbrunient_to ,
                                          java.math.BigDecimal AV113Pedidos_disalb____wwds_6_tfalbruniuti ,
                                          java.math.BigDecimal AV114Pedidos_disalb____wwds_7_tfalbruniuti_to ,
                                          int AV115Pedidos_disalb____wwds_8_tfalbruni_sels_size ,
                                          int AV116Pedidos_disalb____wwds_9_tfalbrpieent ,
                                          int AV117Pedidos_disalb____wwds_10_tfalbrpieent_to ,
                                          int AV118Pedidos_disalb____wwds_11_tfalbrpieuti ,
                                          int AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to ,
                                          String AV121Pedidos_disalb____wwds_14_tfalbref_sel ,
                                          String AV120Pedidos_disalb____wwds_13_tfalbref ,
                                          java.math.BigDecimal AV122Pedidos_disalb____wwds_15_tfkilos ,
                                          java.math.BigDecimal AV123Pedidos_disalb____wwds_16_tfkilos_to ,
                                          java.math.BigDecimal AV124Pedidos_disalb____wwds_17_tfmetros ,
                                          java.math.BigDecimal AV125Pedidos_disalb____wwds_18_tfmetros_to ,
                                          int AV126Pedidos_disalb____wwds_19_tfpiezas ,
                                          int AV127Pedidos_disalb____wwds_20_tfpiezas_to ,
                                          String AV129Pedidos_disalb____wwds_22_tfalbrlote_sel ,
                                          String AV128Pedidos_disalb____wwds_21_tfalbrlote ,
                                          String AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel ,
                                          String AV130Pedidos_disalb____wwds_23_tfalbrtelar ,
                                          java.math.BigDecimal AV132Pedidos_disalb____wwds_25_tfalbrlu ,
                                          java.math.BigDecimal AV133Pedidos_disalb____wwds_26_tfalbrlu_to ,
                                          String AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel ,
                                          String AV134Pedidos_disalb____wwds_27_tfalbrmdlcod ,
                                          java.math.BigDecimal AV136Pedidos_disalb____wwds_29_tfalbrtara ,
                                          java.math.BigDecimal AV137Pedidos_disalb____wwds_30_tfalbrtara_to ,
                                          String AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel ,
                                          String AV138Pedidos_disalb____wwds_31_tfalbmaqtej ,
                                          int A44AlbRecCod ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          String A45AlbRef ,
                                          java.math.BigDecimal A595Kilos ,
                                          java.math.BigDecimal A631Metros ,
                                          int A673Piezas ,
                                          String A6463AlbRLote ,
                                          String A6464AlbRTelar ,
                                          java.math.BigDecimal A6465AlbRLu ,
                                          String A4602AlbRMdlCod ,
                                          java.math.BigDecimal A6470AlbRTara ,
                                          String A8035AlbMaqTej ,
                                          String A396EmprCod ,
                                          int A361DisCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int40 = new byte[32];
      Object[] GXv_Object41 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.DisCod, T2.AlbMaqTej, T2.AlbRTara, T2.AlbRMdlCod, T2.AlbRLu, T2.AlbRTelar, T2.AlbRLote, T1.Piezas, T1.Metros, T1.Kilos, T2.AlbRef, T2.AlbRPieUti," ;
      scmdbuf += " T2.AlbRPieEnt, T2.AlbRUni, T2.AlbRUniUti, T2.AlbRUniEnt, T2.AlbRReo, T1.AlbRecCod FROM (TXPDISALB T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod" ;
      scmdbuf += " = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DisCod = ?)");
      if ( ! (0==AV108Pedidos_disalb____wwds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int40[2] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidos_disalb____wwds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int40[3] = (byte)(1) ;
      }
      if ( AV110Pedidos_disalb____wwds_3_tfalbrreo_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV110Pedidos_disalb____wwds_3_tfalbrreo_sels, "T2.AlbRReo IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Pedidos_disalb____wwds_4_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int40[4] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Pedidos_disalb____wwds_5_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int40[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Pedidos_disalb____wwds_6_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int40[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV114Pedidos_disalb____wwds_7_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int40[7] = (byte)(1) ;
      }
      if ( AV115Pedidos_disalb____wwds_8_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV115Pedidos_disalb____wwds_8_tfalbruni_sels, "T2.AlbRUni IN (", ")")+")");
      }
      if ( ! (0==AV116Pedidos_disalb____wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int40[8] = (byte)(1) ;
      }
      if ( ! (0==AV117Pedidos_disalb____wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int40[9] = (byte)(1) ;
      }
      if ( ! (0==AV118Pedidos_disalb____wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int40[10] = (byte)(1) ;
      }
      if ( ! (0==AV119Pedidos_disalb____wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T2.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int40[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Pedidos_disalb____wwds_14_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV120Pedidos_disalb____wwds_13_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Pedidos_disalb____wwds_14_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int40[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidos_disalb____wwds_15_tfkilos)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos >= ?)");
      }
      else
      {
         GXv_int40[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Pedidos_disalb____wwds_16_tfkilos_to)==0) )
      {
         addWhere(sWhereString, "(T1.Kilos <= ?)");
      }
      else
      {
         GXv_int40[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Pedidos_disalb____wwds_17_tfmetros)==0) )
      {
         addWhere(sWhereString, "(T1.Metros >= ?)");
      }
      else
      {
         GXv_int40[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Pedidos_disalb____wwds_18_tfmetros_to)==0) )
      {
         addWhere(sWhereString, "(T1.Metros <= ?)");
      }
      else
      {
         GXv_int40[17] = (byte)(1) ;
      }
      if ( ! (0==AV126Pedidos_disalb____wwds_19_tfpiezas) )
      {
         addWhere(sWhereString, "(T1.Piezas >= ?)");
      }
      else
      {
         GXv_int40[18] = (byte)(1) ;
      }
      if ( ! (0==AV127Pedidos_disalb____wwds_20_tfpiezas_to) )
      {
         addWhere(sWhereString, "(T1.Piezas <= ?)");
      }
      else
      {
         GXv_int40[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV129Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) && ( ! (GXutil.strcmp("", AV128Pedidos_disalb____wwds_21_tfalbrlote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV129Pedidos_disalb____wwds_22_tfalbrlote_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLote = ?)");
      }
      else
      {
         GXv_int40[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) && ( ! (GXutil.strcmp("", AV130Pedidos_disalb____wwds_23_tfalbrtelar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRTelar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Pedidos_disalb____wwds_24_tfalbrtelar_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTelar = ?)");
      }
      else
      {
         GXv_int40[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV132Pedidos_disalb____wwds_25_tfalbrlu)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu >= ?)");
      }
      else
      {
         GXv_int40[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV133Pedidos_disalb____wwds_26_tfalbrlu_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRLu <= ?)");
      }
      else
      {
         GXv_int40[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) && ( ! (GXutil.strcmp("", AV134Pedidos_disalb____wwds_27_tfalbrmdlcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRMdlCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV135Pedidos_disalb____wwds_28_tfalbrmdlcod_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRMdlCod = ?)");
      }
      else
      {
         GXv_int40[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Pedidos_disalb____wwds_29_tfalbrtara)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara >= ?)");
      }
      else
      {
         GXv_int40[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Pedidos_disalb____wwds_30_tfalbrtara_to)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRTara <= ?)");
      }
      else
      {
         GXv_int40[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) && ( ! (GXutil.strcmp("", AV138Pedidos_disalb____wwds_31_tfalbmaqtej)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbMaqTej) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int40[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV139Pedidos_disalb____wwds_32_tfalbmaqtej_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbMaqTej = ?)");
      }
      else
      {
         GXv_int40[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DisCod" ;
      GXv_Object41[0] = scmdbuf ;
      GXv_Object41[1] = GXv_int40 ;
      return GXv_Object41 ;
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
                  return conditional_H02902(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Boolean) dynConstraints[52]).booleanValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() );
            case 1 :
                  return conditional_H02903(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , ((Number) dynConstraints[51]).shortValue() , ((Boolean) dynConstraints[52]).booleanValue() , (String)dynConstraints[53] , ((Number) dynConstraints[54]).intValue() );
            case 2 :
                  return conditional_H02904(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.math.BigDecimal)dynConstraints[32] , (java.math.BigDecimal)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , (java.math.BigDecimal)dynConstraints[37] , (java.math.BigDecimal)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).intValue() , (String)dynConstraints[41] , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , (String)dynConstraints[46] , (java.math.BigDecimal)dynConstraints[47] , (String)dynConstraints[48] , (java.math.BigDecimal)dynConstraints[49] , (String)dynConstraints[50] , (String)dynConstraints[51] , ((Number) dynConstraints[52]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02902", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02903", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02904", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[17])[0] = rslt.getString(18, 2);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[17])[0] = rslt.getString(18, 2);
               ((int[]) buf[18])[0] = rslt.getInt(19);
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
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 12);
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 12);
               }
               return;
            case 2 :
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
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 20);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 13);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 12);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 12);
               }
               return;
      }
   }

}

