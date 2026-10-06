package app.expedicionesautomatizadas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwhdrpzi_impl extends GXDataArea
{
   public webwhdrpzi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwhdrpzi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwhdrpzi_impl.class ));
   }

   public webwhdrpzi_impl( int remoteHandle ,
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
            AV31EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV73OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV73OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OpeCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73OpeCod), "ZZZZZ9")));
               AV75OpeNom = httpContext.GetPar( "OpeNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV75OpeNom", AV75OpeNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75OpeNom, ""))));
               AV65MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV65MaqCod", AV65MaqCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65MaqCod, ""))));
               AV67MaqNom = httpContext.GetPar( "MaqNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV67MaqNom", AV67MaqNom);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67MaqNom, ""))));
               AV37FasCod = httpContext.GetPar( "FasCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV37FasCod", AV37FasCod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37FasCod, "@!"))));
               AV39FasDsc = httpContext.GetPar( "FasDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39FasDsc", AV39FasDsc);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39FasDsc, ""))));
               AV15BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCod), 8, 0));
               AV19BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarCodReo", GXutil.str( AV19BarCodReo, 1, 0));
               AV17BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17BarCodPar", AV17BarCodPar);
               AV21BarOrdlin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdlin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarOrdlin), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarOrdlin), "ZZZ9")));
               AV13BarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncAca1"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarAncAca1), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarAncAca1), "ZZ9")));
               AV70Msg_i = httpContext.GetPar( "Msg_i") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV70Msg_i", AV70Msg_i);
               AV57Lecfec = localUtil.parseDateParm( httpContext.GetPar( "Lecfec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57Lecfec", localUtil.format(AV57Lecfec, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECFEC", getSecureSignedToken( "", AV57Lecfec));
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
      nRC_GXsfl_57 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_57"))) ;
      nGXsfl_57_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_57_idx"))) ;
      sGXsfl_57_idx = httpContext.GetPar( "sGXsfl_57_idx") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
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
      AV41FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV15BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV19BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV17BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV61ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV23ColumnsSelector);
      AV31EmprCod = httpContext.GetPar( "EmprCod") ;
      AV90TFBarPieCod = httpContext.GetPar( "TFBarPieCod") ;
      AV91TFBarPieCod_Sel = httpContext.GetPar( "TFBarPieCod_Sel") ;
      AV102TFBarPieKil = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil"), ".") ;
      AV103TFBarPieKil_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieKil_To"), ".") ;
      AV106TFBarPieMet = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet"), ".") ;
      AV107TFBarPieMet_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarPieMet_To"), ".") ;
      AV86TFBarPieAnc = (short)(GXutil.lval( httpContext.GetPar( "TFBarPieAnc"))) ;
      AV87TFBarPieAnc_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarPieAnc_To"))) ;
      AV94TFBarPieEst = (byte)(GXutil.lval( httpContext.GetPar( "TFBarPieEst"))) ;
      AV95TFBarPieEst_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarPieEst_To"))) ;
      AV144Pgmname = httpContext.GetPar( "Pgmname") ;
      AV77OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV80OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV73OpeCod = (int)(GXutil.lval( httpContext.GetPar( "OpeCod"))) ;
      AV75OpeNom = httpContext.GetPar( "OpeNom") ;
      AV65MaqCod = httpContext.GetPar( "MaqCod") ;
      AV67MaqNom = httpContext.GetPar( "MaqNom") ;
      AV37FasCod = httpContext.GetPar( "FasCod") ;
      AV39FasDsc = httpContext.GetPar( "FasDsc") ;
      AV21BarOrdlin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdlin"))) ;
      AV13BarAncAca1 = (short)(GXutil.lval( httpContext.GetPar( "BarAncAca1"))) ;
      AV70Msg_i = httpContext.GetPar( "Msg_i") ;
      AV57Lecfec = localUtil.parseDateParm( httpContext.GetPar( "Lecfec")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A3858BarTroCod = (short)(GXutil.lval( httpContext.GetPar( "BarTroCod"))) ;
      A4990BarTroCal = (byte)(GXutil.lval( httpContext.GetPar( "BarTroCal"))) ;
      n4990BarTroCal = false ;
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = httpContext.GetPar( "Expedicionesautomatizadas_webwhdrpzids_1_emprcod") ;
      AV121Msg2 = httpContext.GetPar( "Msg2") ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      AV127Turno = (byte)(GXutil.lval( httpContext.GetPar( "Turno"))) ;
      AV72Msg1 = httpContext.GetPar( "Msg1") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV15BarCod, AV19BarCodReo, AV17BarCodPar, AV61ManageFiltersExecutionStep, AV23ColumnsSelector, AV31EmprCod, AV90TFBarPieCod, AV91TFBarPieCod_Sel, AV102TFBarPieKil, AV103TFBarPieKil_To, AV106TFBarPieMet, AV107TFBarPieMet_To, AV86TFBarPieAnc, AV87TFBarPieAnc_To, AV94TFBarPieEst, AV95TFBarPieEst_To, AV144Pgmname, AV77OrderedBy, AV80OrderedDsc, AV73OpeCod, AV75OpeNom, AV65MaqCod, AV67MaqNom, AV37FasCod, AV39FasDsc, AV21BarOrdlin, AV13BarAncAca1, AV70Msg_i, AV57Lecfec, A396EmprCod, A3858BarTroCod, A4990BarTroCal, AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, AV121Msg2, Gx_date, AV127Turno, AV72Msg1) ;
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
      pa1II2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1II2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.expedicionesautomatizadas.webwhdrpzi", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV73OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV75OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV65MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV67MaqNom)),GXutil.URLEncode(GXutil.rtrim(AV37FasCod)),GXutil.URLEncode(GXutil.rtrim(AV39FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarOrdlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarAncAca1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV70Msg_i)),GXutil.URLEncode(GXutil.formatDateParm(AV57Lecfec))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqNom","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","BarOrdlin","BarAncAca1","Msg_i","Lecfec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV144Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Msg2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV127Turno), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73OpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75OpeNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39FasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarOrdlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarAncAca1), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECFEC", getSecureSignedToken( "", AV57Lecfec));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFILTERFULLTEXT", AV41FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_57", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_57, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV59ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV59ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV45GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV29DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV23ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV61ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV31EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIECOD", GXutil.rtrim( AV90TFBarPieCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIECOD_SEL", GXutil.rtrim( AV91TFBarPieCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEKIL", GXutil.ltrim( localUtil.ntoc( AV102TFBarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEKIL_TO", GXutil.ltrim( localUtil.ntoc( AV103TFBarPieKil_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEMET", GXutil.ltrim( localUtil.ntoc( AV106TFBarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEMET_TO", GXutil.ltrim( localUtil.ntoc( AV107TFBarPieMet_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEANC", GXutil.ltrim( localUtil.ntoc( AV86TFBarPieAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEANC_TO", GXutil.ltrim( localUtil.ntoc( AV87TFBarPieAnc_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEEST", GXutil.ltrim( localUtil.ntoc( AV94TFBarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARPIEEST_TO", GXutil.ltrim( localUtil.ntoc( AV95TFBarPieEst_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV144Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV144Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV77OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV80OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV73OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73OpeCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPENOM", GXutil.rtrim( AV75OpeNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75OpeNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV65MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQNOM", GXutil.rtrim( AV67MaqNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67MaqNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV37FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASDSC", GXutil.rtrim( AV39FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39FasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV15BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV19BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV17BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV21BarOrdlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarOrdlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARANCACA1", GXutil.ltrim( localUtil.ntoc( AV13BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarAncAca1), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_I", GXutil.rtrim( AV70Msg_i));
      app.GxWebStd.gx_hidden_field( httpContext, "vLECFEC", localUtil.dtoc( AV57Lecfec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECFEC", getSecureSignedToken( "", AV57Lecfec));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROCOD", GXutil.ltrim( localUtil.ntoc( A3858BarTroCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTROCAL", GXutil.ltrim( localUtil.ntoc( A4990BarTroCal, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV49GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV49GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARTROCAL", GXutil.ltrim( localUtil.ntoc( AV7BarTrocal, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGSAUT", GXutil.ltrim( localUtil.ntoc( A3275BarKgsAut, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vN_PZT", GXutil.ltrim( localUtil.ntoc( AV120N_pzt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vN_PZC", GXutil.ltrim( localUtil.ntoc( AV119N_pzc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG2", GXutil.rtrim( AV121Msg2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Msg2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROF", GXutil.rtrim( AV53HisProf));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASEST", GXutil.ltrim( localUtil.ntoc( AV6BarFasest, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARCODNOM", GXutil.rtrim( AV126Parcodnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIME", GXutil.rtrim( Gx_time));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "vTURNO", GXutil.ltrim( localUtil.ntoc( AV127Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV127Turno), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV72Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Msg1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPRODTI", localUtil.ttoc( AV9HisProdti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROLIN", GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROF", GXutil.rtrim( A557HisProF));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRODTI", localUtil.ttoc( A4440HisProDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD", GXutil.rtrim( AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
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
         we1II2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1II2( ) ;
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
      return formatLink("app.expedicionesautomatizadas.webwhdrpzi", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV73OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV75OpeNom)),GXutil.URLEncode(GXutil.rtrim(AV65MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV67MaqNom)),GXutil.URLEncode(GXutil.rtrim(AV37FasCod)),GXutil.URLEncode(GXutil.rtrim(AV39FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarOrdlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarAncAca1,3,0)),GXutil.URLEncode(GXutil.rtrim(AV70Msg_i)),GXutil.URLEncode(GXutil.formatDateParm(AV57Lecfec))}, new String[] {"EmprCod","OpeCod","OpeNom","MaqCod","MaqNom","FasCod","FasDsc","BarCod","BarCodReo","BarCodPar","BarOrdlin","BarAncAca1","Msg_i","Lecfec"})  ;
   }

   public String getPgmname( )
   {
      return "ExpedicionesAutomatizadas.WebWHDRPZI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla BARPIE", "") ;
   }

   public void wb1II0( )
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
         wb_table1_11_1II2( true) ;
      }
      else
      {
         wb_table1_11_1II2( false) ;
      }
      return  ;
   }

   public void wb_table1_11_1II2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111ii1_client"+"'", TempTags, "", 2, "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table2_39_1II2( true) ;
      }
      else
      {
         wb_table2_39_1II2( false) ;
      }
      return  ;
   }

   public void wb_table2_39_1II2e( boolean wbgen )
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
         startgridcontrol57( ) ;
      }
      if ( wbEnd == 57 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_57 = (int)(nGXsfl_57_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV45GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, "INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV29DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV23ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 57 )
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

   public void start1II2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Tabla BARPIE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1II0( ) ;
   }

   public void ws1II2( )
   {
      start1II2( ) ;
      evt1II2( ) ;
   }

   public void evt1II2( )
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
                           e121II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e171II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOFINHDR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoFinHDR' */
                           e181II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e191II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e201II2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e211II2 ();
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
                           nGXsfl_57_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_572( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV43GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
                           A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
                           A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
                           A1691BarPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1691BarPieAnc = false ;
                           A6116BarPieImp = httpContext.cgiGet( edtBarPieImp_Internalname) ;
                           n6116BarPieImp = false ;
                           A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e221II2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e231II2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e241II2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e251II2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Filterfulltext Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV41FilterFullText) != 0 )
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

   public void we1II2( )
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

   public void pa1II2( )
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
      subsflControlProps_572( ) ;
      while ( nGXsfl_57_idx <= nRC_GXsfl_57 )
      {
         sendrow_572( ) ;
         nGXsfl_57_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV41FilterFullText ,
                                 int AV15BarCod ,
                                 byte AV19BarCodReo ,
                                 String AV17BarCodPar ,
                                 byte AV61ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ,
                                 String AV31EmprCod ,
                                 String AV90TFBarPieCod ,
                                 String AV91TFBarPieCod_Sel ,
                                 java.math.BigDecimal AV102TFBarPieKil ,
                                 java.math.BigDecimal AV103TFBarPieKil_To ,
                                 java.math.BigDecimal AV106TFBarPieMet ,
                                 java.math.BigDecimal AV107TFBarPieMet_To ,
                                 short AV86TFBarPieAnc ,
                                 short AV87TFBarPieAnc_To ,
                                 byte AV94TFBarPieEst ,
                                 byte AV95TFBarPieEst_To ,
                                 String AV144Pgmname ,
                                 short AV77OrderedBy ,
                                 boolean AV80OrderedDsc ,
                                 int AV73OpeCod ,
                                 String AV75OpeNom ,
                                 String AV65MaqCod ,
                                 String AV67MaqNom ,
                                 String AV37FasCod ,
                                 String AV39FasDsc ,
                                 short AV21BarOrdlin ,
                                 short AV13BarAncAca1 ,
                                 String AV70Msg_i ,
                                 java.util.Date AV57Lecfec ,
                                 String A396EmprCod ,
                                 short A3858BarTroCod ,
                                 byte A4990BarTroCal ,
                                 String AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                 String AV121Msg2 ,
                                 java.util.Date Gx_date ,
                                 byte AV127Turno ,
                                 String AV72Msg1 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231II2 ();
      GRID_nCurrentRecord = 0 ;
      rf1II2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIEEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEEST", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIEIMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A6116BarPieImp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEIMP", GXutil.rtrim( A6116BarPieImp));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIEKIL", getSecureSignedToken( "", localUtil.format( A203BarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIEKIL", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
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
      rf1II2( ) ;
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
      Gx_time = GXutil.time( ) ;
      AV144Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI" ;
      Gx_err = (short)(0) ;
   }

   public void rf1II2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(57) ;
      /* Execute user event: Refresh */
      e231II2 ();
      nGXsfl_57_idx = 1 ;
      sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_572( ) ;
      bGXsfl_57_Refreshing = true ;
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
         subsflControlProps_572( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                              AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                              AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                              AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                              AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                              AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                              AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                              Short.valueOf(AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) ,
                                              Short.valueOf(AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) ,
                                              Byte.valueOf(AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) ,
                                              Byte.valueOf(AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) ,
                                              A200BarPieCod ,
                                              A203BarPieKil ,
                                              A205BarPieMet ,
                                              Short.valueOf(A1691BarPieAnc) ,
                                              A6116BarPieImp ,
                                              Byte.valueOf(A201BarPieEst) ,
                                              Short.valueOf(AV77OrderedBy) ,
                                              Boolean.valueOf(AV80OrderedDsc) ,
                                              AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                              Integer.valueOf(AV15BarCod) ,
                                              Byte.valueOf(AV19BarCodReo) ,
                                              AV17BarCodPar ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
         lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
         lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
         lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
         lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
         lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
         lV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod), 9, "%") ;
         /* Using cursor H01II2 */
         pr_default.execute(0, new Object[] {AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV19BarCodReo), AV17BarCodPar, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod, AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel, AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil, AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to, AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet, AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to, Short.valueOf(AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc), Short.valueOf(AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to), Byte.valueOf(AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest), Byte.valueOf(AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A200BarPieCod = H01II2_A200BarPieCod[0] ;
            A130BarCodPar = H01II2_A130BarCodPar[0] ;
            A132BarCodReo = H01II2_A132BarCodReo[0] ;
            A129BarCod = H01II2_A129BarCod[0] ;
            A3275BarKgsAut = H01II2_A3275BarKgsAut[0] ;
            n3275BarKgsAut = H01II2_n3275BarKgsAut[0] ;
            A201BarPieEst = H01II2_A201BarPieEst[0] ;
            A6116BarPieImp = H01II2_A6116BarPieImp[0] ;
            n6116BarPieImp = H01II2_n6116BarPieImp[0] ;
            A1691BarPieAnc = H01II2_A1691BarPieAnc[0] ;
            n1691BarPieAnc = H01II2_n1691BarPieAnc[0] ;
            A205BarPieMet = H01II2_A205BarPieMet[0] ;
            A203BarPieKil = H01II2_A203BarPieKil[0] ;
            e241II2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(57) ;
         wb1II0( ) ;
      }
      bGXsfl_57_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1II2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV144Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV144Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIEEST"+"_"+sGXsfl_57_idx, getSecureSignedToken( sGXsfl_57_idx, localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIEIMP"+"_"+sGXsfl_57_idx, getSecureSignedToken( sGXsfl_57_idx, GXutil.rtrim( localUtil.format( A6116BarPieImp, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARPIEKIL"+"_"+sGXsfl_57_idx, getSecureSignedToken( sGXsfl_57_idx, localUtil.format( A203BarPieKil, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG2", GXutil.rtrim( AV121Msg2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Msg2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "vTURNO", GXutil.ltrim( localUtil.ntoc( AV127Turno, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTURNO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV127Turno), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG1", GXutil.rtrim( AV72Msg1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Msg1, ""))));
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
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV31EmprCod ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV41FilterFullText ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV90TFBarPieCod ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV91TFBarPieCod_Sel ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV102TFBarPieKil ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV103TFBarPieKil_To ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV106TFBarPieMet ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV107TFBarPieMet_To ;
      AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV86TFBarPieAnc ;
      AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV87TFBarPieAnc_To ;
      AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV94TFBarPieEst ;
      AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV95TFBarPieEst_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                           AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                           AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                           AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                           AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                           AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                           AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                           Short.valueOf(AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) ,
                                           Short.valueOf(AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) ,
                                           Byte.valueOf(AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) ,
                                           Byte.valueOf(AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) ,
                                           A200BarPieCod ,
                                           A203BarPieKil ,
                                           A205BarPieMet ,
                                           Short.valueOf(A1691BarPieAnc) ,
                                           A6116BarPieImp ,
                                           Byte.valueOf(A201BarPieEst) ,
                                           Short.valueOf(AV77OrderedBy) ,
                                           Boolean.valueOf(AV80OrderedDsc) ,
                                           AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                           Integer.valueOf(AV15BarCod) ,
                                           Byte.valueOf(AV19BarCodReo) ,
                                           AV17BarCodPar ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = GXutil.concat( GXutil.rtrim( AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext), "%", "") ;
      lV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = GXutil.padr( GXutil.rtrim( AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod), 9, "%") ;
      /* Using cursor H01II3 */
      pr_default.execute(1, new Object[] {AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV19BarCodReo), AV17BarCodPar, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext, lV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod, AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel, AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil, AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to, AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet, AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to, Short.valueOf(AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc), Short.valueOf(AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to), Byte.valueOf(AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest), Byte.valueOf(AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to)});
      GRID_nRecordCount = H01II3_AGRID_nRecordCount[0] ;
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
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV31EmprCod ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV41FilterFullText ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV90TFBarPieCod ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV91TFBarPieCod_Sel ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV102TFBarPieKil ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV103TFBarPieKil_To ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV106TFBarPieMet ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV107TFBarPieMet_To ;
      AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV86TFBarPieAnc ;
      AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV87TFBarPieAnc_To ;
      AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV94TFBarPieEst ;
      AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV95TFBarPieEst_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV15BarCod, AV19BarCodReo, AV17BarCodPar, AV61ManageFiltersExecutionStep, AV23ColumnsSelector, AV31EmprCod, AV90TFBarPieCod, AV91TFBarPieCod_Sel, AV102TFBarPieKil, AV103TFBarPieKil_To, AV106TFBarPieMet, AV107TFBarPieMet_To, AV86TFBarPieAnc, AV87TFBarPieAnc_To, AV94TFBarPieEst, AV95TFBarPieEst_To, AV144Pgmname, AV77OrderedBy, AV80OrderedDsc, AV73OpeCod, AV75OpeNom, AV65MaqCod, AV67MaqNom, AV37FasCod, AV39FasDsc, AV21BarOrdlin, AV13BarAncAca1, AV70Msg_i, AV57Lecfec, A396EmprCod, A3858BarTroCod, A4990BarTroCal, AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, AV121Msg2, Gx_date, AV127Turno, AV72Msg1) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV31EmprCod ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV41FilterFullText ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV90TFBarPieCod ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV91TFBarPieCod_Sel ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV102TFBarPieKil ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV103TFBarPieKil_To ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV106TFBarPieMet ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV107TFBarPieMet_To ;
      AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV86TFBarPieAnc ;
      AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV87TFBarPieAnc_To ;
      AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV94TFBarPieEst ;
      AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV95TFBarPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV15BarCod, AV19BarCodReo, AV17BarCodPar, AV61ManageFiltersExecutionStep, AV23ColumnsSelector, AV31EmprCod, AV90TFBarPieCod, AV91TFBarPieCod_Sel, AV102TFBarPieKil, AV103TFBarPieKil_To, AV106TFBarPieMet, AV107TFBarPieMet_To, AV86TFBarPieAnc, AV87TFBarPieAnc_To, AV94TFBarPieEst, AV95TFBarPieEst_To, AV144Pgmname, AV77OrderedBy, AV80OrderedDsc, AV73OpeCod, AV75OpeNom, AV65MaqCod, AV67MaqNom, AV37FasCod, AV39FasDsc, AV21BarOrdlin, AV13BarAncAca1, AV70Msg_i, AV57Lecfec, A396EmprCod, A3858BarTroCod, A4990BarTroCal, AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, AV121Msg2, Gx_date, AV127Turno, AV72Msg1) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV31EmprCod ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV41FilterFullText ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV90TFBarPieCod ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV91TFBarPieCod_Sel ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV102TFBarPieKil ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV103TFBarPieKil_To ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV106TFBarPieMet ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV107TFBarPieMet_To ;
      AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV86TFBarPieAnc ;
      AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV87TFBarPieAnc_To ;
      AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV94TFBarPieEst ;
      AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV95TFBarPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV15BarCod, AV19BarCodReo, AV17BarCodPar, AV61ManageFiltersExecutionStep, AV23ColumnsSelector, AV31EmprCod, AV90TFBarPieCod, AV91TFBarPieCod_Sel, AV102TFBarPieKil, AV103TFBarPieKil_To, AV106TFBarPieMet, AV107TFBarPieMet_To, AV86TFBarPieAnc, AV87TFBarPieAnc_To, AV94TFBarPieEst, AV95TFBarPieEst_To, AV144Pgmname, AV77OrderedBy, AV80OrderedDsc, AV73OpeCod, AV75OpeNom, AV65MaqCod, AV67MaqNom, AV37FasCod, AV39FasDsc, AV21BarOrdlin, AV13BarAncAca1, AV70Msg_i, AV57Lecfec, A396EmprCod, A3858BarTroCod, A4990BarTroCal, AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, AV121Msg2, Gx_date, AV127Turno, AV72Msg1) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV31EmprCod ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV41FilterFullText ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV90TFBarPieCod ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV91TFBarPieCod_Sel ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV102TFBarPieKil ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV103TFBarPieKil_To ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV106TFBarPieMet ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV107TFBarPieMet_To ;
      AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV86TFBarPieAnc ;
      AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV87TFBarPieAnc_To ;
      AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV94TFBarPieEst ;
      AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV95TFBarPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV15BarCod, AV19BarCodReo, AV17BarCodPar, AV61ManageFiltersExecutionStep, AV23ColumnsSelector, AV31EmprCod, AV90TFBarPieCod, AV91TFBarPieCod_Sel, AV102TFBarPieKil, AV103TFBarPieKil_To, AV106TFBarPieMet, AV107TFBarPieMet_To, AV86TFBarPieAnc, AV87TFBarPieAnc_To, AV94TFBarPieEst, AV95TFBarPieEst_To, AV144Pgmname, AV77OrderedBy, AV80OrderedDsc, AV73OpeCod, AV75OpeNom, AV65MaqCod, AV67MaqNom, AV37FasCod, AV39FasDsc, AV21BarOrdlin, AV13BarAncAca1, AV70Msg_i, AV57Lecfec, A396EmprCod, A3858BarTroCod, A4990BarTroCal, AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, AV121Msg2, Gx_date, AV127Turno, AV72Msg1) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV31EmprCod ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV41FilterFullText ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV90TFBarPieCod ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV91TFBarPieCod_Sel ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV102TFBarPieKil ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV103TFBarPieKil_To ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV106TFBarPieMet ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV107TFBarPieMet_To ;
      AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV86TFBarPieAnc ;
      AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV87TFBarPieAnc_To ;
      AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV94TFBarPieEst ;
      AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV95TFBarPieEst_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV41FilterFullText, AV15BarCod, AV19BarCodReo, AV17BarCodPar, AV61ManageFiltersExecutionStep, AV23ColumnsSelector, AV31EmprCod, AV90TFBarPieCod, AV91TFBarPieCod_Sel, AV102TFBarPieKil, AV103TFBarPieKil_To, AV106TFBarPieMet, AV107TFBarPieMet_To, AV86TFBarPieAnc, AV87TFBarPieAnc_To, AV94TFBarPieEst, AV95TFBarPieEst_To, AV144Pgmname, AV77OrderedBy, AV80OrderedDsc, AV73OpeCod, AV75OpeNom, AV65MaqCod, AV67MaqNom, AV37FasCod, AV39FasDsc, AV21BarOrdlin, AV13BarAncAca1, AV70Msg_i, AV57Lecfec, A396EmprCod, A3858BarTroCod, A4990BarTroCal, AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod, AV121Msg2, Gx_date, AV127Turno, AV72Msg1) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV144Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1II0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e221II2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV59ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV29DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV23ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV45GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV41FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41FilterFullText", AV41FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFILTERFULLTEXT"), AV41FilterFullText) != 0 )
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
      e221II2 ();
      if (returnInSub) return;
   }

   public void e221II2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV72Msg1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN246", ""), (byte)(99), GXv_char2) ;
      webwhdrpzi_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Msg1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72Msg1", AV72Msg1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV72Msg1, ""))));
      GXt_char1 = AV121Msg2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WJLN242", ""), (byte)(99), GXv_char2) ;
      webwhdrpzi_impl.this.GXt_char1 = GXv_char2[0] ;
      AV121Msg2 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121Msg2", AV121Msg2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMSG2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV121Msg2, ""))));
      AV11UsurCod = " " ;
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwhdrpzi_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char4[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwhdrpzi_impl.this.A396EmprCod = GXv_char2[0] ;
      webwhdrpzi_impl.this.AV8EmprNom = GXv_char3[0] ;
      webwhdrpzi_impl.this.AV11UsurCod = GXv_char4[0] ;
      AV31EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      /* Execute user subroutine: 'LHIPRO' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV10Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwhdrpzi_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10Station = GXt_char1 ;
      GXv_char4[0] = AV31EmprCod ;
      GXv_char3[0] = AV8EmprNom ;
      GXv_char2[0] = AV11UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwhdrpzi_impl.this.AV31EmprCod = GXv_char4[0] ;
      webwhdrpzi_impl.this.AV8EmprNom = GXv_char3[0] ;
      webwhdrpzi_impl.this.AV11UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV54HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Tabla BARPIE", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV77OrderedBy < 1 )
      {
         AV77OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV29DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV29DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e231II2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV116WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV116WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV61ManageFiltersExecutionStep == 1 )
      {
         AV61ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61ManageFiltersExecutionStep", GXutil.str( AV61ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV61ManageFiltersExecutionStep == 2 )
      {
         AV61ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61ManageFiltersExecutionStep", GXutil.str( AV61ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S122 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV84Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector"), "") != 0 )
      {
         AV27ColumnsSelectorXML = AV84Session.getValue("ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector") ;
         AV23ColumnsSelector.fromxml(AV27ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S172 ();
         if (returnInSub) return;
      }
      edtBarPieCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieCod_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtBarPieKil_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieKil_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtBarPieMet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieMet_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtBarPieAnc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAnc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieAnc_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtBarPieImp_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieImp_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieImp_Visible), 5, 0), !bGXsfl_57_Refreshing);
      edtBarPieEst_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV23ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPieEst_Visible), 5, 0), !bGXsfl_57_Refreshing);
      AV45GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_57_Refreshing);
      edtBarPieCod_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieCod_Internalname, "Columnheaderclass", edtBarPieCod_Columnheaderclass, !bGXsfl_57_Refreshing);
      edtBarPieKil_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieKil_Internalname, "Columnheaderclass", edtBarPieKil_Columnheaderclass, !bGXsfl_57_Refreshing);
      edtBarPieMet_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieMet_Internalname, "Columnheaderclass", edtBarPieMet_Columnheaderclass, !bGXsfl_57_Refreshing);
      edtBarPieAnc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieAnc_Internalname, "Columnheaderclass", edtBarPieAnc_Columnheaderclass, !bGXsfl_57_Refreshing);
      edtBarPieImp_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieImp_Internalname, "Columnheaderclass", edtBarPieImp_Columnheaderclass, !bGXsfl_57_Refreshing);
      edtBarPieEst_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPieEst_Internalname, "Columnheaderclass", edtBarPieEst_Columnheaderclass, !bGXsfl_57_Refreshing);
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = AV31EmprCod ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = AV41FilterFullText ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = AV90TFBarPieCod ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = AV91TFBarPieCod_Sel ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = AV102TFBarPieKil ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = AV103TFBarPieKil_To ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = AV106TFBarPieMet ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = AV107TFBarPieMet_To ;
      AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc = AV86TFBarPieAnc ;
      AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to = AV87TFBarPieAnc_To ;
      AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest = AV94TFBarPieEst ;
      AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to = AV95TFBarPieEst_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59ManageFiltersData", AV59ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49GridState", AV49GridState);
   }

   public void e131II2( )
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
         AV82PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV82PageToGo) ;
      }
   }

   public void e141II2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151II2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV77OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OrderedBy), 4, 0));
         AV80OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80OrderedDsc", AV80OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieCod") == 0 )
         {
            AV90TFBarPieCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarPieCod", AV90TFBarPieCod);
            AV91TFBarPieCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarPieCod_Sel", AV91TFBarPieCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieKil") == 0 )
         {
            AV102TFBarPieKil = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFBarPieKil", GXutil.ltrimstr( AV102TFBarPieKil, 9, 2));
            AV103TFBarPieKil_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFBarPieKil_To", GXutil.ltrimstr( AV103TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieMet") == 0 )
         {
            AV106TFBarPieMet = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarPieMet", GXutil.ltrimstr( AV106TFBarPieMet, 9, 2));
            AV107TFBarPieMet_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFBarPieMet_To", GXutil.ltrimstr( AV107TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieAnc") == 0 )
         {
            AV86TFBarPieAnc = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarPieAnc), 4, 0));
            AV87TFBarPieAnc_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarPieAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarPieEst") == 0 )
         {
            AV94TFBarPieEst = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFBarPieEst", GXutil.str( AV94TFBarPieEst, 1, 0));
            AV95TFBarPieEst_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFBarPieEst_To", GXutil.str( AV95TFBarPieEst_To, 1, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e241II2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV7BarTrocal = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarTrocal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarTrocal), 2, 0));
      /* Using cursor H01II4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A3858BarTroCod = H01II4_A3858BarTroCod[0] ;
         A4990BarTroCal = H01II4_A4990BarTroCal[0] ;
         n4990BarTroCal = H01II4_n4990BarTroCal[0] ;
         AV7BarTrocal = A4990BarTroCal ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarTrocal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarTrocal), 2, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", httpContext.getMessage( "Modificar", ""), (short)(0));
      cmbavGridactions.addItem("2", httpContext.getMessage( "Imprimir Etiqueta", ""), (short)(0));
      cmbavGridactions.addItem("3", httpContext.getMessage( "Dividir Pieza", ""), (short)(0));
      cmbavGridactions.addItem("4", httpContext.getMessage( "Imprimir Pieza", ""), (short)(0));
      if ( GXutil.strcmp(A6116BarPieImp, httpContext.getMessage( "S", "")) == 0 )
      {
         cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" );
         edtBarPieCod_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtBarPieKil_Columnclass = "WWColumn WWColumnDanger" ;
         edtBarPieMet_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtBarPieAnc_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtBarPieImp_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtBarPieEst_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
      }
      else if ( ! ( GXutil.strcmp(A6116BarPieImp, httpContext.getMessage( "S", "")) == 0 ) )
      {
         cmbavGridactions.setColumnClass( "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
         edtBarPieCod_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtBarPieKil_Columnclass = "WWColumn WWColumnSuccess" ;
         edtBarPieMet_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtBarPieAnc_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtBarPieImp_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtBarPieEst_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
      }
      else
      {
         cmbavGridactions.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
         edtBarPieCod_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtBarPieKil_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtBarPieMet_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtBarPieAnc_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtBarPieImp_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtBarPieEst_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(57) ;
      }
      sendrow_572( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_57_Refreshing )
      {
         httpContext.doAjaxLoad(57, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV43GridActions, 4, 0)) );
   }

   public void e161II2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV27ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV23ColumnsSelector.fromJSonString(AV27ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector", ((GXutil.strcmp("", AV27ColumnsSelectorXML)==0) ? "" : AV23ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59ManageFiltersData", AV59ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49GridState", AV49GridState);
   }

   public void e121II2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S182 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebWHDRPZIFilters")),GXutil.URLEncode(GXutil.rtrim(AV144Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV61ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61ManageFiltersExecutionStep", GXutil.str( AV61ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ExpedicionesAutomatizadas.WebWHDRPZIFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV61ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61ManageFiltersExecutionStep", GXutil.str( AV61ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV63ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebWHDRPZIFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         webwhdrpzi_impl.this.GXt_char1 = GXv_char4[0] ;
         AV63ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV63ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV144Pgmname+"GridState", AV63ManageFiltersXml) ;
            AV49GridState.fromxml(AV63ManageFiltersXml, null, null);
            AV77OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OrderedBy), 4, 0));
            AV80OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80OrderedDsc", AV80OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S152 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S192 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49GridState", AV49GridState);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59ManageFiltersData", AV59ManageFiltersData);
   }

   public void e251II2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV43GridActions == 1 )
      {
         /* Execute user subroutine: 'DO MODIFICAR' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV43GridActions == 2 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV43GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DIVIDIR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV43GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRESIONPIEZA' */
         S232 ();
         if (returnInSub) return;
      }
      AV43GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV43GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV23ColumnsSelector", AV23ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59ManageFiltersData", AV59ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV49GridState", AV49GridState);
   }

   public void e171II2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.barpie", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void e181II2( )
   {
      /* 'DoFinHDR' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LEER_PZAS' */
      S242 ();
      if (returnInSub) return;
      if ( ( AV120N_pzt == AV119N_pzc ) && ( AV120N_pzt > 0 ) && ( AV119N_pzc > 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion esta FASE tiene TODAS las PIEZAS FINALIZADAS", "") + GXutil.newLine( ) + httpContext.getMessage( "Si confirma Fin HDR, cerrara la FASE", "") + GXutil.newLine( ) + httpContext.getMessage( "Desea Finalizar?", "") + GXutil.newLine( ) ;
         AV122ConfirmacionHDRFinalizada = false ;
         httpContext.popup(formatLink("app.expedicionesautomatizadas.mensajeconfirmarfinhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV65MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(AV57Lecfec)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarOrdlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV37FasCod)),GXutil.URLEncode(GXutil.ltrimstr(AV73OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV121Msg2)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","MaqCod","Lecfec","BarOrdlin","FasCod","OpeCod","Msg2","Msg_i"}) , new Object[] {"AV122ConfirmacionHDRFinalizada","AV70Msg_i"});
      }
      if ( ( AV120N_pzt != AV119N_pzc ) && ( AV120N_pzt > 0 ) && ( AV119N_pzc > 0 ) )
      {
         Gx_msg = httpContext.getMessage( "Atencion esta FASE no esta FINALIZADA,hay PIEZAS sin FINALIZAR", "") + GXutil.newLine( ) + httpContext.getMessage( "Si confirma Fin HDR, cerrara la FASE", "") + GXutil.newLine( ) + httpContext.getMessage( "Desea Finalizar?", "") + GXutil.newLine( ) ;
         AV122ConfirmacionHDRFinalizada = false ;
         httpContext.popup(formatLink("app.expedicionesautomatizadas.mensajeconfirmarfinhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV65MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(AV57Lecfec)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarOrdlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV37FasCod)),GXutil.URLEncode(GXutil.ltrimstr(AV73OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV121Msg2)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","MaqCod","Lecfec","BarOrdlin","FasCod","OpeCod","Msg2","Msg_i"}) , new Object[] {"AV122ConfirmacionHDRFinalizada","AV70Msg_i"});
         /* Window Datatype Object Property */
         AV12Window.setUrl( formatLink("app.expedicionesautomatizadas.mensajeconfirmarfinhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.booltostr(AV122ConfirmacionHDRFinalizada)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV65MaqCod)),GXutil.URLEncode(GXutil.formatDateParm(AV57Lecfec)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarOrdlin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV37FasCod)),GXutil.URLEncode(GXutil.ltrimstr(AV73OpeCod,6,0))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","MaqCod","Lecfec","BarOrdlin","FasCod","OpeCod","Msg2","Msg_i"})  );
         AV12Window.setReturnParms(new Object[] {"AV122ConfirmacionHDRFinalizada",});
         httpContext.newWindow(AV12Window);
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e191II2( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LHIPRO' */
      S112 ();
      if (returnInSub) return;
      if ( ( GXutil.strcmp(AV53HisProf, httpContext.getMessage( "N", "")) == 0 ) || ( AV6BarFasest < 2 ) )
      {
         AV124ParCod = (short)(0) ;
         callWebObject(formatLink("app.expedicionesautomatizadas.webwparpzi", new String[] {GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV124ParCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV126Parcodnom))}, new String[] {"EmprCod","Parcod","Parcodnom"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
         Gx_msg = httpContext.getMessage( "Atencion esta FASE no esta FINALIZADA", "") + GXutil.newLine( ) + httpContext.getMessage( "Si confirma la SALIDA, generara un PARO = ", "") + GXutil.str( AV124ParCod, 4, 0) + " " + AV126Parcodnom + GXutil.newLine( ) + httpContext.getMessage( "Desea SALIR?", "") + GXutil.newLine( ) ;
         AV125ConfirmacionSalir = false ;
         /* Window Datatype Object Property */
         AV12Window.setUrl( formatLink("app.expedicionesautomatizadas.mensajeconfirmarsalir", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.booltostr(AV125ConfirmacionSalir)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV65MaqCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV73OpeCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV37FasCod)),GXutil.URLEncode(GXutil.ltrimstr(AV21BarOrdlin,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV124ParCod,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_time)),GXutil.URLEncode(GXutil.formatDateParm(Gx_date)),GXutil.URLEncode(GXutil.ltrimstr(AV127Turno,1,0)),GXutil.URLEncode(GXutil.formatDateParm(AV57Lecfec)),GXutil.URLEncode(GXutil.rtrim(AV72Msg1)),GXutil.URLEncode(GXutil.rtrim(AV70Msg_i))}, new String[] {"Mensaje","Confirmado","EmprCod","MaqCod","BarCod","BarCodReo","BarCodPar","OpeCod","FasCod","BarOrdlin","ParCod","Time","Today","Turno","Lecfec","Msg1","Msg_i"})  );
         AV12Window.setReturnParms(new Object[] {"AV125ConfirmacionSalir","AV70Msg_i",});
         httpContext.newWindow(AV12Window);
      }
      /*  Sending Event outputs  */
   }

   public void e201II2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV35ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.expedicionesautomatizadas.webwhdrpziexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      webwhdrpzi_impl.this.AV35ExcelFilename = GXv_char4[0] ;
      webwhdrpzi_impl.this.AV33ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV35ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV35ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV33ErrorMessage);
      }
   }

   public void e211II2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.expedicionesautomatizadas.webwhdrpziexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV77OrderedBy, 4, 0))+":"+(AV80OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV23ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieCod", "", "Nº Pieza", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieKil", "", "Kilos", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieMet", "", "Metros", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieAnc", "", "Ancho Acabado Pieza", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieImp", "", "Impresa?", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV23ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "BarPieEst", "", "Estado", true, "") ;
      AV23ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV114UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebWHDRPZIColumnsSelector", GXv_char4) ;
      webwhdrpzi_impl.this.GXt_char1 = GXv_char4[0] ;
      AV114UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV114UserCustomValue)==0) ) )
      {
         AV25ColumnsSelectorAux.fromxml(AV114UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV25ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV23ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV25ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV23ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S122( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV59ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ExpedicionesAutomatizadas.WebWHDRPZIFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV59ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV41FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41FilterFullText", AV41FilterFullText);
      AV90TFBarPieCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarPieCod", AV90TFBarPieCod);
      AV91TFBarPieCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarPieCod_Sel", AV91TFBarPieCod_Sel);
      AV102TFBarPieKil = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102TFBarPieKil", GXutil.ltrimstr( AV102TFBarPieKil, 9, 2));
      AV103TFBarPieKil_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103TFBarPieKil_To", GXutil.ltrimstr( AV103TFBarPieKil_To, 9, 2));
      AV106TFBarPieMet = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarPieMet", GXutil.ltrimstr( AV106TFBarPieMet, 9, 2));
      AV107TFBarPieMet_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107TFBarPieMet_To", GXutil.ltrimstr( AV107TFBarPieMet_To, 9, 2));
      AV86TFBarPieAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarPieAnc), 4, 0));
      AV87TFBarPieAnc_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarPieAnc_To), 4, 0));
      AV94TFBarPieEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94TFBarPieEst", GXutil.str( AV94TFBarPieEst, 1, 0));
      AV95TFBarPieEst_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95TFBarPieEst_To", GXutil.str( AV95TFBarPieEst_To, 1, 0));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S202( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      if ( A201BarPieEst == 1 )
      {
         AV5Bapieobs = "" ;
         callWebObject(formatLink("app.expedicionesautomatizadas.webwmhdpzp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A205BarPieMet)),GXutil.URLEncode(GXutil.ltrimstr(A1691BarPieAnc,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarTrocal,2,0)),GXutil.URLEncode(DecimalUtil.decToString(A3275BarKgsAut)),GXutil.URLEncode(GXutil.rtrim(AV5Bapieobs)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.rtrim(" ")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodpar","BarPieCod","BarPieMet1","BarAncAca1","BarTrocal1","BarPieKil1","BapieObs","dtokg","dtomt","BarPieOrd","BarPieLoc","BarPieTono","BarPieSecu","BarPieST1","BarPieLote1","BarPieDestIN","tiraskgs1","Retazoskgs1","BarPieCliIDout"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No se puede modificar la pieza", ""));
      }
   }

   public void S212( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A6116BarPieImp, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char4[0] = A200BarPieCod ;
         GXv_char3[0] = httpContext.getMessage( "PRN", "") ;
         new app.rhdrpzr(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         webwhdrpzi_impl.this.A200BarPieCod = GXv_char4[0] ;
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El estado de la pieza no es impreso.", ""));
      }
   }

   public void S222( )
   {
      /* 'DO DIVIDIR' Routine */
      returnInSub = false ;
      if ( A201BarPieEst == 0 )
      {
         Gx_msg = httpContext.getMessage( "Ha seleccionado la PIEZA ", "") + A200BarPieCod + GXutil.newLine( ) + httpContext.getMessage( "Desea dividirla en n trozos?", "") + GXutil.newLine( ) ;
         AV128ConfirmarDividir = false ;
         httpContext.popup(formatLink("app.expedicionesautomatizadas.mensajeconfirmardividir", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod)),GXutil.URLEncode(DecimalUtil.decToString(A203BarPieKil)),GXutil.URLEncode(DecimalUtil.decToString(A205BarPieMet))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","BarPieCod","BarPieKil","BarPieMet"}) , new Object[] {"AV128ConfirmarDividir",});
      }
      else
      {
         Gx_msg = httpContext.getMessage( "Esta PIEZA ", "") + A200BarPieCod + GXutil.newLine( ) + httpContext.getMessage( "NO se puede dividir", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
   }

   public void S232( )
   {
      /* 'DO IMPRESIONPIEZA' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A6116BarPieImp, httpContext.getMessage( "S", "")) == 0 )
      {
         Gx_msg = httpContext.getMessage( "Atencion esta Etiqueta ya ha sido impresa ¡¡¡ ", "") + A200BarPieCod ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         Gx_msg = httpContext.getMessage( "Selecciono la Pieza ", "") + A200BarPieCod + GXutil.newLine( ) + httpContext.getMessage( "Confirma la Finalizacion de la misma?", "") + GXutil.newLine( ) ;
         AV118Confirmacion = false ;
         httpContext.popup(formatLink("app.expedicionesautomatizadas.mensajeconfirmarimpresionetiqueta", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_msg)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV17BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV13BarAncAca1,3,0)),GXutil.URLEncode(GXutil.rtrim(A200BarPieCod))}, new String[] {"Mensaje","Confirmado","EmprCod","BarCod","BarCodReo","BarCodPar","BarAncAca1","BarPieCod"}) , new Object[] {"AV118Confirmacion",});
      }
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV84Session.getValue(AV144Pgmname+"GridState"), "") == 0 )
      {
         AV49GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV144Pgmname+"GridState"), null, null);
      }
      else
      {
         AV49GridState.fromxml(AV84Session.getValue(AV144Pgmname+"GridState"), null, null);
      }
      AV77OrderedBy = AV49GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77OrderedBy), 4, 0));
      AV80OrderedDsc = AV49GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80OrderedDsc", AV80OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S192 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV49GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV49GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV49GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S192( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV148GXV1 = 1 ;
      while ( AV148GXV1 <= AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV148GXV1));
         if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV41FilterFullText = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41FilterFullText", AV41FilterFullText);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD") == 0 )
         {
            AV90TFBarPieCod = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90TFBarPieCod", AV90TFBarPieCod);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIECOD_SEL") == 0 )
         {
            AV91TFBarPieCod_Sel = AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91TFBarPieCod_Sel", AV91TFBarPieCod_Sel);
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEKIL") == 0 )
         {
            AV102TFBarPieKil = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV102TFBarPieKil", GXutil.ltrimstr( AV102TFBarPieKil, 9, 2));
            AV103TFBarPieKil_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV103TFBarPieKil_To", GXutil.ltrimstr( AV103TFBarPieKil_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEMET") == 0 )
         {
            AV106TFBarPieMet = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106TFBarPieMet", GXutil.ltrimstr( AV106TFBarPieMet, 9, 2));
            AV107TFBarPieMet_To = CommonUtil.decimalVal( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107TFBarPieMet_To", GXutil.ltrimstr( AV107TFBarPieMet_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEANC") == 0 )
         {
            AV86TFBarPieAnc = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFBarPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86TFBarPieAnc), 4, 0));
            AV87TFBarPieAnc_To = (short)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFBarPieAnc_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87TFBarPieAnc_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARPIEEST") == 0 )
         {
            AV94TFBarPieEst = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFBarPieEst", GXutil.str( AV94TFBarPieEst, 1, 0));
            AV95TFBarPieEst_To = (byte)(GXutil.lval( AV51GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV95TFBarPieEst_To", GXutil.str( AV95TFBarPieEst_To, 1, 0));
         }
         AV148GXV1 = (int)(AV148GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV91TFBarPieCod_Sel)==0), AV91TFBarPieCod_Sel, GXv_char4) ;
      webwhdrpzi_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV90TFBarPieCod)==0), AV90TFBarPieCod, GXv_char4) ;
      webwhdrpzi_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV102TFBarPieKil)==0) ? "" : GXutil.str( AV102TFBarPieKil, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFBarPieMet)==0) ? "" : GXutil.str( AV106TFBarPieMet, 9, 2))+"|"+((0==AV86TFBarPieAnc) ? "" : GXutil.str( AV86TFBarPieAnc, 4, 0))+"||"+((0==AV94TFBarPieEst) ? "" : GXutil.str( AV94TFBarPieEst, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TFBarPieKil_To)==0) ? "" : GXutil.str( AV103TFBarPieKil_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFBarPieMet_To)==0) ? "" : GXutil.str( AV107TFBarPieMet_To, 9, 2))+"|"+((0==AV87TFBarPieAnc_To) ? "" : GXutil.str( AV87TFBarPieAnc_To, 4, 0))+"||"+((0==AV95TFBarPieEst_To) ? "" : GXutil.str( AV95TFBarPieEst_To, 1, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV49GridState.fromxml(AV84Session.getValue(AV144Pgmname+"GridState"), null, null);
      AV49GridState.setgxTv_SdtWWPGridState_Orderedby( AV77OrderedBy );
      AV49GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV80OrderedDsc );
      AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState12[0] = AV49GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV41FilterFullText)==0), (short)(0), AV41FilterFullText, "") ;
      AV49GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV49GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFBARPIECOD", "", !(GXutil.strcmp("", AV90TFBarPieCod)==0), (short)(0), AV90TFBarPieCod, "", !(GXutil.strcmp("", AV91TFBarPieCod_Sel)==0), AV91TFBarPieCod_Sel, "") ;
      AV49GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV49GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFBARPIEKIL", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV102TFBarPieKil)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV103TFBarPieKil_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV102TFBarPieKil, 9, 2)), GXutil.trim( GXutil.str( AV103TFBarPieKil_To, 9, 2))) ;
      AV49GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV49GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFBARPIEMET", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV106TFBarPieMet)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV107TFBarPieMet_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV106TFBarPieMet, 9, 2)), GXutil.trim( GXutil.str( AV107TFBarPieMet_To, 9, 2))) ;
      AV49GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV49GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFBARPIEANC", "", !((0==AV86TFBarPieAnc)&&(0==AV87TFBarPieAnc_To)), (short)(0), GXutil.trim( GXutil.str( AV86TFBarPieAnc, 4, 0)), GXutil.trim( GXutil.str( AV87TFBarPieAnc_To, 4, 0))) ;
      AV49GridState = GXv_SdtWWPGridState12[0] ;
      GXv_SdtWWPGridState12[0] = AV49GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState12, "TFBARPIEEST", "", !((0==AV94TFBarPieEst)&&(0==AV95TFBarPieEst_To)), (short)(0), GXutil.trim( GXutil.str( AV94TFBarPieEst, 1, 0)), GXutil.trim( GXutil.str( AV95TFBarPieEst_To, 1, 0))) ;
      AV49GridState = GXv_SdtWWPGridState12[0] ;
      if ( ! (GXutil.strcmp("", AV31EmprCod)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV31EmprCod );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV73OpeCod) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPECOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV73OpeCod, 6, 0) );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV75OpeNom)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OPENOM" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV75OpeNom );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV65MaqCod)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQCOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV65MaqCod );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV67MaqNom)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MAQNOM" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV67MaqNom );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV37FasCod)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FASCOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV37FasCod );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV39FasDsc)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FASDSC" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV39FasDsc );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV15BarCod) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV15BarCod, 8, 0) );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV19BarCodReo) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV19BarCodReo, 1, 0) );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV17BarCodPar)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV17BarCodPar );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV21BarOrdlin) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARORDLIN" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV21BarOrdlin, 4, 0) );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (0==AV13BarAncAca1) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARANCACA1" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV13BarAncAca1, 3, 0) );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV70Msg_i)==0) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MSG_I" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV70Msg_i );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57Lecfec)) )
      {
         AV51GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&LECFEC" );
         AV51GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV57Lecfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV49GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV51GridStateFilterValue, 0);
      }
      AV49GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV49GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV144Pgmname+"GridState", AV49GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV110TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV110TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV144Pgmname );
      AV110TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV110TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV54HTTPRequest.getScriptName()+"?"+AV54HTTPRequest.getQuerystring() );
      AV110TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "BARPIE" );
      AV112TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV112TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributename( "EmprCod" );
      AV112TrnContextAtt.setgxTv_SdtWWPTransactionContext_Attribute_Attributevalue( AV31EmprCod );
      AV110TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().add(AV112TrnContextAtt, 0);
      AV84Session.setValue("TrnContext", AV110TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LHIPRO' Routine */
      returnInSub = false ;
      AV9HisProdti = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV9HisProdti", localUtil.ttoc( AV9HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV53HisProf = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53HisProf", AV53HisProf);
      /* Using cursor H01II5 */
      pr_default.execute(3, new Object[] {AV31EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV19BarCodReo), AV17BarCodPar, Short.valueOf(AV21BarOrdlin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A129BarCod = H01II5_A129BarCod[0] ;
         A132BarCodReo = H01II5_A132BarCodReo[0] ;
         A130BarCodPar = H01II5_A130BarCodPar[0] ;
         A194BarOrdLin = H01II5_A194BarOrdLin[0] ;
         A557HisProF = H01II5_A557HisProF[0] ;
         A4440HisProDTI = H01II5_A4440HisProDTI[0] ;
         n4440HisProDTI = H01II5_n4440HisProDTI[0] ;
         A561HisProLin = H01II5_A561HisProLin[0] ;
         AV53HisProf = A557HisProF ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53HisProf", AV53HisProf);
         AV9HisProdti = A4440HisProDTI ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9HisProdti", localUtil.ttoc( AV9HisProdti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV6BarFasest = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarFasest", GXutil.str( AV6BarFasest, 1, 0));
      /* Using cursor H01II6 */
      pr_default.execute(4, new Object[] {AV31EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV19BarCodReo), AV17BarCodPar, Short.valueOf(AV21BarOrdlin)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A194BarOrdLin = H01II6_A194BarOrdLin[0] ;
         A130BarCodPar = H01II6_A130BarCodPar[0] ;
         A132BarCodReo = H01II6_A132BarCodReo[0] ;
         A129BarCod = H01II6_A129BarCod[0] ;
         A153BarFasEst = H01II6_A153BarFasEst[0] ;
         AV6BarFasest = A153BarFasEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarFasest", GXutil.str( AV6BarFasest, 1, 0));
         pr_default.readNext(4);
      }
      pr_default.close(4);
   }

   public void S242( )
   {
      /* 'LEER_PZAS' Routine */
      returnInSub = false ;
      AV119N_pzc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119N_pzc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119N_pzc), 4, 0));
      AV120N_pzt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120N_pzt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120N_pzt), 4, 0));
      /* Start For Each Line */
      nRC_GXsfl_57 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_57"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_57_fel_idx = 0 ;
      while ( nGXsfl_57_fel_idx < nRC_GXsfl_57 )
      {
         nGXsfl_57_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_fel_idx+1) ;
         sGXsfl_57_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_572( ) ;
         cmbavGridactions.setName( cmbavGridactions.getInternalname() );
         cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
         AV43GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A200BarPieCod = httpContext.cgiGet( edtBarPieCod_Internalname) ;
         A203BarPieKil = localUtil.ctond( httpContext.cgiGet( edtBarPieKil_Internalname)) ;
         A205BarPieMet = localUtil.ctond( httpContext.cgiGet( edtBarPieMet_Internalname)) ;
         A1691BarPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPieAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1691BarPieAnc = false ;
         A6116BarPieImp = httpContext.cgiGet( edtBarPieImp_Internalname) ;
         n6116BarPieImp = false ;
         A201BarPieEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarPieEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         if ( A201BarPieEst == 1 )
         {
            AV119N_pzc = (short)(AV119N_pzc+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119N_pzc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119N_pzc), 4, 0));
         }
         AV120N_pzt = (short)(AV120N_pzt+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120N_pzt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120N_pzt), 4, 0));
         /* End For Each Line */
      }
      if ( nGXsfl_57_fel_idx == 0 )
      {
         nGXsfl_57_idx = 1 ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      nGXsfl_57_fel_idx = 1 ;
   }

   public void wb_table2_39_1II2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV59ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_44_1II2( true) ;
      }
      else
      {
         wb_table3_44_1II2( false) ;
      }
      return  ;
   }

   public void wb_table3_44_1II2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_39_1II2e( true) ;
      }
      else
      {
         wb_table2_39_1II2e( false) ;
      }
   }

   public void wb_table3_44_1II2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_57_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV41FilterFullText, GXutil.rtrim( localUtil.format( AV41FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_44_1II2e( true) ;
      }
      else
      {
         wb_table3_44_1II2e( false) ;
      }
   }

   public void wb_table1_11_1II2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnfinhdr_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Fin HDR", ""), bttBtnfinhdr_Jsonclick, 5, httpContext.getMessage( "Fin HDR", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOFINHDR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 57, 2, 0)+","+"null"+");", httpContext.getMessage( "Salir Sin Finalizar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Salir Sin Finalizar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ExpedicionesAutomatizadas\\WebWHDRPZI.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_11_1II2e( true) ;
      }
      else
      {
         wb_table1_11_1II2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV31EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      AV73OpeCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73OpeCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPECOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV73OpeCod), "ZZZZZ9")));
      AV75OpeNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75OpeNom", AV75OpeNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOPENOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75OpeNom, ""))));
      AV65MaqCod = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65MaqCod", AV65MaqCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV65MaqCod, ""))));
      AV67MaqNom = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67MaqNom", AV67MaqNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67MaqNom, ""))));
      AV37FasCod = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37FasCod", AV37FasCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV37FasCod, "@!"))));
      AV39FasDsc = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39FasDsc", AV39FasDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39FasDsc, ""))));
      AV15BarCod = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15BarCod), 8, 0));
      AV19BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarCodReo", GXutil.str( AV19BarCodReo, 1, 0));
      AV17BarCodPar = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarCodPar", AV17BarCodPar);
      AV21BarOrdlin = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21BarOrdlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarOrdlin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarOrdlin), "ZZZ9")));
      AV13BarAncAca1 = ((Number) GXutil.testNumericType( getParm(obj,11), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarAncAca1), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARANCACA1", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarAncAca1), "ZZ9")));
      AV70Msg_i = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Msg_i", AV70Msg_i);
      AV57Lecfec = (java.util.Date)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Lecfec", localUtil.format(AV57Lecfec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLECFEC", getSecureSignedToken( "", AV57Lecfec));
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
      pa1II2( ) ;
      ws1II2( ) ;
      we1II2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116134833", true, true);
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
      httpContext.AddJavascriptSource("expedicionesautomatizadas/webwhdrpzi.js", "?202682116134833", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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

   public void subsflControlProps_572( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_57_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_57_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_57_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_57_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_57_idx ;
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_57_idx ;
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_57_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_57_idx ;
      edtBarPieAnc_Internalname = "BARPIEANC_"+sGXsfl_57_idx ;
      edtBarPieImp_Internalname = "BARPIEIMP_"+sGXsfl_57_idx ;
      edtBarPieEst_Internalname = "BARPIEEST_"+sGXsfl_57_idx ;
   }

   public void subsflControlProps_fel_572( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_57_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_57_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_57_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_57_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_57_fel_idx ;
      edtBarPieCod_Internalname = "BARPIECOD_"+sGXsfl_57_fel_idx ;
      edtBarPieKil_Internalname = "BARPIEKIL_"+sGXsfl_57_fel_idx ;
      edtBarPieMet_Internalname = "BARPIEMET_"+sGXsfl_57_fel_idx ;
      edtBarPieAnc_Internalname = "BARPIEANC_"+sGXsfl_57_fel_idx ;
      edtBarPieImp_Internalname = "BARPIEIMP_"+sGXsfl_57_fel_idx ;
      edtBarPieEst_Internalname = "BARPIEEST_"+sGXsfl_57_fel_idx ;
   }

   public void sendrow_572( )
   {
      subsflControlProps_572( ) ;
      wb1II0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_57_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_57_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_57_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_57_idx+"',57)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_57_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV43GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV43GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV43GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_57_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV43GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_57_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarPieCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieCod_Internalname,GXutil.rtrim( A200BarPieCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPieCod_Columnclass,edtBarPieCod_Columnheaderclass,Integer.valueOf(edtBarPieCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieKil_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieKil_Internalname,GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A203BarPieKil, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieKil_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPieKil_Columnclass,edtBarPieKil_Columnheaderclass,Integer.valueOf(edtBarPieKil_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieMet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieMet_Internalname,GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A205BarPieMet, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieMet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPieMet_Columnclass,edtBarPieMet_Columnheaderclass,Integer.valueOf(edtBarPieMet_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieAnc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieAnc_Internalname,GXutil.ltrim( localUtil.ntoc( A1691BarPieAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1691BarPieAnc), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieAnc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPieAnc_Columnclass,edtBarPieAnc_Columnheaderclass,Integer.valueOf(edtBarPieAnc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarPieImp_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieImp_Internalname,GXutil.rtrim( A6116BarPieImp),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPieImp_Columnclass,edtBarPieImp_Columnheaderclass,Integer.valueOf(edtBarPieImp_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarPieEst_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPieEst_Internalname,GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A201BarPieEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPieEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtBarPieEst_Columnclass,edtBarPieEst_Columnheaderclass,Integer.valueOf(edtBarPieEst_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(57),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1II2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_57_idx = ((subGrid_Islastpage==1)&&(nGXsfl_57_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_57_idx+1) ;
         sGXsfl_57_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_57_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_572( ) ;
      }
      /* End function sendrow_572 */
   }

   public void startgridcontrol57( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"57\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieKil_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieMet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieAnc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ancho Acabado Pieza", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieImp_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Impresa?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarPieEst_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A200BarPieCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPieCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPieCod_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A203BarPieKil, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPieKil_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPieKil_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieKil_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A205BarPieMet, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPieMet_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPieMet_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieMet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1691BarPieAnc, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPieAnc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPieAnc_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieAnc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6116BarPieImp));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPieImp_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPieImp_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieImp_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A201BarPieEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtBarPieEst_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtBarPieEst_Columnheaderclass));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarPieEst_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnfinhdr_Internalname = "BTNFINHDR" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtninsert_Internalname = "BTNINSERT" ;
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
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarPieCod_Internalname = "BARPIECOD" ;
      edtBarPieKil_Internalname = "BARPIEKIL" ;
      edtBarPieMet_Internalname = "BARPIEMET" ;
      edtBarPieAnc_Internalname = "BARPIEANC" ;
      edtBarPieImp_Internalname = "BARPIEIMP" ;
      edtBarPieEst_Internalname = "BARPIEEST" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Innewwindow1_Internalname = "INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtBarPieEst_Jsonclick = "" ;
      edtBarPieEst_Columnclass = "WWColumn hidden-xs" ;
      edtBarPieImp_Jsonclick = "" ;
      edtBarPieImp_Columnclass = "WWColumn hidden-xs" ;
      edtBarPieAnc_Jsonclick = "" ;
      edtBarPieAnc_Columnclass = "WWColumn hidden-xs" ;
      edtBarPieMet_Jsonclick = "" ;
      edtBarPieMet_Columnclass = "WWColumn hidden-xs" ;
      edtBarPieKil_Jsonclick = "" ;
      edtBarPieKil_Columnclass = "WWColumn" ;
      edtBarPieCod_Jsonclick = "" ;
      edtBarPieCod_Columnclass = "WWColumn hidden-xs" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtBarPieEst_Columnheaderclass = "" ;
      edtBarPieImp_Columnheaderclass = "" ;
      edtBarPieAnc_Columnheaderclass = "" ;
      edtBarPieMet_Columnheaderclass = "" ;
      edtBarPieKil_Columnheaderclass = "" ;
      edtBarPieCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      edtBarPieEst_Visible = -1 ;
      edtBarPieImp_Visible = -1 ;
      edtBarPieAnc_Visible = -1 ;
      edtBarPieMet_Visible = -1 ;
      edtBarPieKil_Visible = -1 ;
      edtBarPieCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
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
      Ddo_grid_Datalistproc = "ExpedicionesAutomatizadas.WebWHDRPZIGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|||||" ;
      Ddo_grid_Includedatalist = "T|||||" ;
      Ddo_grid_Filterisrange = "|T|T|T||T" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric||Numeric" ;
      Ddo_grid_Includefilter = "T|T|T|T||T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T||T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5||6" ;
      Ddo_grid_Columnids = "5:BarPieCod|6:BarPieKil|7:BarPieMet|8:BarPieAnc|9:BarPieImp|10:BarPieEst" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Tabla BARPIE", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_57_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV43GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV43GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD',pic:'@!'},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV75OpeNom',fld:'vOPENOM',pic:'',hsh:true},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV67MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV39FasDsc',fld:'vFASDSC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV13BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarPieCod_Visible',ctrl:'BARPIECOD',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPieAnc_Visible',ctrl:'BARPIEANC',prop:'Visible'},{av:'edtBarPieImp_Visible',ctrl:'BARPIEIMP',prop:'Visible'},{av:'edtBarPieEst_Visible',ctrl:'BARPIEEST',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtBarPieCod_Columnheaderclass',ctrl:'BARPIECOD',prop:'Columnheaderclass'},{av:'edtBarPieKil_Columnheaderclass',ctrl:'BARPIEKIL',prop:'Columnheaderclass'},{av:'edtBarPieMet_Columnheaderclass',ctrl:'BARPIEMET',prop:'Columnheaderclass'},{av:'edtBarPieAnc_Columnheaderclass',ctrl:'BARPIEANC',prop:'Columnheaderclass'},{av:'edtBarPieImp_Columnheaderclass',ctrl:'BARPIEIMP',prop:'Columnheaderclass'},{av:'edtBarPieEst_Columnheaderclass',ctrl:'BARPIEEST',prop:'Columnheaderclass'},{av:'AV59ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV49GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131II2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV75OpeNom',fld:'vOPENOM',pic:'',hsh:true},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV67MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV39FasDsc',fld:'vFASDSC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV13BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD',pic:'@!'},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141II2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV75OpeNom',fld:'vOPENOM',pic:'',hsh:true},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV67MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV39FasDsc',fld:'vFASDSC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV13BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD',pic:'@!'},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151II2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV75OpeNom',fld:'vOPENOM',pic:'',hsh:true},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV67MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV39FasDsc',fld:'vFASDSC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV13BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD',pic:'@!'},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e241II2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'A6116BarPieImp',fld:'BARPIEIMP',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV7BarTrocal',fld:'vBARTROCAL',pic:'9'},{av:'cmbavGridactions'},{av:'AV43GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtBarPieCod_Columnclass',ctrl:'BARPIECOD',prop:'Columnclass'},{av:'edtBarPieKil_Columnclass',ctrl:'BARPIEKIL',prop:'Columnclass'},{av:'edtBarPieMet_Columnclass',ctrl:'BARPIEMET',prop:'Columnclass'},{av:'edtBarPieAnc_Columnclass',ctrl:'BARPIEANC',prop:'Columnclass'},{av:'edtBarPieImp_Columnclass',ctrl:'BARPIEIMP',prop:'Columnclass'},{av:'edtBarPieEst_Columnclass',ctrl:'BARPIEEST',prop:'Columnclass'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e161II2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV75OpeNom',fld:'vOPENOM',pic:'',hsh:true},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV67MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV39FasDsc',fld:'vFASDSC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV13BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD',pic:'@!'},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtBarPieCod_Visible',ctrl:'BARPIECOD',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPieAnc_Visible',ctrl:'BARPIEANC',prop:'Visible'},{av:'edtBarPieImp_Visible',ctrl:'BARPIEIMP',prop:'Visible'},{av:'edtBarPieEst_Visible',ctrl:'BARPIEEST',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtBarPieCod_Columnheaderclass',ctrl:'BARPIECOD',prop:'Columnheaderclass'},{av:'edtBarPieKil_Columnheaderclass',ctrl:'BARPIEKIL',prop:'Columnheaderclass'},{av:'edtBarPieMet_Columnheaderclass',ctrl:'BARPIEMET',prop:'Columnheaderclass'},{av:'edtBarPieAnc_Columnheaderclass',ctrl:'BARPIEANC',prop:'Columnheaderclass'},{av:'edtBarPieImp_Columnheaderclass',ctrl:'BARPIEIMP',prop:'Columnheaderclass'},{av:'edtBarPieEst_Columnheaderclass',ctrl:'BARPIEEST',prop:'Columnheaderclass'},{av:'AV59ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV49GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121II2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV75OpeNom',fld:'vOPENOM',pic:'',hsh:true},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV67MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV39FasDsc',fld:'vFASDSC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV13BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD',pic:'@!'},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV49GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV49GridState',fld:'vGRIDSTATE',pic:''},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarPieCod_Visible',ctrl:'BARPIECOD',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPieAnc_Visible',ctrl:'BARPIEANC',prop:'Visible'},{av:'edtBarPieImp_Visible',ctrl:'BARPIEIMP',prop:'Visible'},{av:'edtBarPieEst_Visible',ctrl:'BARPIEEST',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtBarPieCod_Columnheaderclass',ctrl:'BARPIECOD',prop:'Columnheaderclass'},{av:'edtBarPieKil_Columnheaderclass',ctrl:'BARPIEKIL',prop:'Columnheaderclass'},{av:'edtBarPieMet_Columnheaderclass',ctrl:'BARPIEMET',prop:'Columnheaderclass'},{av:'edtBarPieAnc_Columnheaderclass',ctrl:'BARPIEANC',prop:'Columnheaderclass'},{av:'edtBarPieImp_Columnheaderclass',ctrl:'BARPIEIMP',prop:'Columnheaderclass'},{av:'edtBarPieEst_Columnheaderclass',ctrl:'BARPIEEST',prop:'Columnheaderclass'},{av:'AV59ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e251II2',iparms:[{av:'cmbavGridactions'},{av:'AV43GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV90TFBarPieCod',fld:'vTFBARPIECOD',pic:''},{av:'AV91TFBarPieCod_Sel',fld:'vTFBARPIECOD_SEL',pic:''},{av:'AV102TFBarPieKil',fld:'vTFBARPIEKIL',pic:'ZZZZZ9.99'},{av:'AV103TFBarPieKil_To',fld:'vTFBARPIEKIL_TO',pic:'ZZZZZ9.99'},{av:'AV106TFBarPieMet',fld:'vTFBARPIEMET',pic:'ZZZZZ9.99'},{av:'AV107TFBarPieMet_To',fld:'vTFBARPIEMET_TO',pic:'ZZZZZ9.99'},{av:'AV86TFBarPieAnc',fld:'vTFBARPIEANC',pic:'ZZZ9'},{av:'AV87TFBarPieAnc_To',fld:'vTFBARPIEANC_TO',pic:'ZZZ9'},{av:'AV94TFBarPieEst',fld:'vTFBARPIEEST',pic:'9'},{av:'AV95TFBarPieEst_To',fld:'vTFBARPIEEST_TO',pic:'9'},{av:'AV144Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV77OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV80OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV75OpeNom',fld:'vOPENOM',pic:'',hsh:true},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV67MaqNom',fld:'vMAQNOM',pic:'',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV39FasDsc',fld:'vFASDSC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV13BarAncAca1',fld:'vBARANCACA1',pic:'ZZ9',hsh:true},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3858BarTroCod',fld:'BARTROCOD',pic:'ZZZ9'},{av:'A4990BarTroCal',fld:'BARTROCAL',pic:'9'},{av:'AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod',fld:'vEXPEDICIONESAUTOMATIZADAS_WEBWHDRPZIDS_1_EMPRCOD',pic:'@!'},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'A201BarPieEst',fld:'BARPIEEST',pic:'9',hsh:true},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A1691BarPieAnc',fld:'BARPIEANC',pic:'ZZZ9'},{av:'AV7BarTrocal',fld:'vBARTROCAL',pic:'9'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'A6116BarPieImp',fld:'BARPIEIMP',pic:'',hsh:true},{av:'A203BarPieKil',fld:'BARPIEKIL',pic:'ZZZZZ9.99',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV43GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A3275BarKgsAut',fld:'BARKGSAUT',pic:'ZZZZZ9.99'},{av:'AV7BarTrocal',fld:'vBARTROCAL',pic:'9'},{av:'A1691BarPieAnc',fld:'BARPIEANC',pic:'ZZZ9'},{av:'A205BarPieMet',fld:'BARPIEMET',pic:'ZZZZZ9.99'},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV61ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV23ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtBarPieCod_Visible',ctrl:'BARPIECOD',prop:'Visible'},{av:'edtBarPieKil_Visible',ctrl:'BARPIEKIL',prop:'Visible'},{av:'edtBarPieMet_Visible',ctrl:'BARPIEMET',prop:'Visible'},{av:'edtBarPieAnc_Visible',ctrl:'BARPIEANC',prop:'Visible'},{av:'edtBarPieImp_Visible',ctrl:'BARPIEIMP',prop:'Visible'},{av:'edtBarPieEst_Visible',ctrl:'BARPIEEST',prop:'Visible'},{av:'AV45GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtBarPieCod_Columnheaderclass',ctrl:'BARPIECOD',prop:'Columnheaderclass'},{av:'edtBarPieKil_Columnheaderclass',ctrl:'BARPIEKIL',prop:'Columnheaderclass'},{av:'edtBarPieMet_Columnheaderclass',ctrl:'BARPIEMET',prop:'Columnheaderclass'},{av:'edtBarPieAnc_Columnheaderclass',ctrl:'BARPIEANC',prop:'Columnheaderclass'},{av:'edtBarPieImp_Columnheaderclass',ctrl:'BARPIEIMP',prop:'Columnheaderclass'},{av:'edtBarPieEst_Columnheaderclass',ctrl:'BARPIEEST',prop:'Columnheaderclass'},{av:'AV59ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV49GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e171II2',iparms:[{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A200BarPieCod',fld:'BARPIECOD',pic:''}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'A200BarPieCod',fld:'BARPIECOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOFINHDR'","{handler:'e181II2',iparms:[{av:'AV120N_pzt',fld:'vN_PZT',pic:'ZZZ9'},{av:'AV119N_pzc',fld:'vN_PZC',pic:'ZZZ9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV121Msg2',fld:'vMSG2',pic:'',hsh:true},{av:'A201BarPieEst',fld:'BARPIEEST',grid:57,pic:'9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_57',ctrl:'GRID',grid:57,prop:'GridRC',grid:57}]");
      setEventMetadata("'DOFINHDR'",",oparms:[{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV119N_pzc',fld:'vN_PZC',pic:'ZZZ9'},{av:'AV120N_pzt',fld:'vN_PZT',pic:'ZZZ9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e191II2',iparms:[{av:'AV53HisProf',fld:'vHISPROF',pic:'@!'},{av:'AV6BarFasest',fld:'vBARFASEST',pic:'9'},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV126Parcodnom',fld:'vPARCODNOM',pic:''},{av:'AV65MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV15BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV19BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV17BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV73OpeCod',fld:'vOPECOD',pic:'ZZZZZ9',hsh:true},{av:'AV37FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'AV21BarOrdlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'Gx_time',fld:'vTIME',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV127Turno',fld:'vTURNO',pic:'9',hsh:true},{av:'AV57Lecfec',fld:'vLECFEC',pic:'',hsh:true},{av:'AV72Msg1',fld:'vMSG1',pic:'',hsh:true},{av:'AV9HisProdti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A4440HisProDTI',fld:'HISPRODTI',pic:'99/99/99 99:99:99'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'}]");
      setEventMetadata("'DOSALIR'",",oparms:[{av:'AV126Parcodnom',fld:'vPARCODNOM',pic:''},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV70Msg_i',fld:'vMSG_I',pic:''},{av:'AV9HisProdti',fld:'vHISPRODTI',pic:'99/99/99 99:99:99'},{av:'AV53HisProf',fld:'vHISPROF',pic:'@!'},{av:'AV6BarFasest',fld:'vBARFASEST',pic:'9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e201II2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e111II1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e211II2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_BARPIECOD","{handler:'valid_Barpiecod',iparms:[]");
      setEventMetadata("VALID_BARPIECOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barpieest',iparms:[]");
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
      wcpOAV31EmprCod = "" ;
      wcpOAV75OpeNom = "" ;
      wcpOAV65MaqCod = "" ;
      wcpOAV67MaqNom = "" ;
      wcpOAV37FasCod = "" ;
      wcpOAV39FasDsc = "" ;
      wcpOAV17BarCodPar = "" ;
      wcpOAV70Msg_i = "" ;
      wcpOAV57Lecfec = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV31EmprCod = "" ;
      AV75OpeNom = "" ;
      AV65MaqCod = "" ;
      AV67MaqNom = "" ;
      AV37FasCod = "" ;
      AV39FasDsc = "" ;
      AV17BarCodPar = "" ;
      AV70Msg_i = "" ;
      AV57Lecfec = GXutil.nullDate() ;
      A396EmprCod = "" ;
      AV41FilterFullText = "" ;
      AV23ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV90TFBarPieCod = "" ;
      AV91TFBarPieCod_Sel = "" ;
      AV102TFBarPieKil = DecimalUtil.ZERO ;
      AV103TFBarPieKil_To = DecimalUtil.ZERO ;
      AV106TFBarPieMet = DecimalUtil.ZERO ;
      AV107TFBarPieMet_To = DecimalUtil.ZERO ;
      AV144Pgmname = "" ;
      AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod = "" ;
      AV121Msg2 = "" ;
      Gx_date = GXutil.nullDate() ;
      AV72Msg1 = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV59ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV29DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV49GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A3275BarKgsAut = DecimalUtil.ZERO ;
      AV53HisProf = "" ;
      AV126Parcodnom = "" ;
      Gx_time = "" ;
      AV9HisProdti = GXutil.resetTime( GXutil.nullDate() );
      A557HisProF = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
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
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A130BarCodPar = "" ;
      A200BarPieCod = "" ;
      A203BarPieKil = DecimalUtil.ZERO ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A6116BarPieImp = "" ;
      scmdbuf = "" ;
      lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      lV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext = "" ;
      AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel = "" ;
      AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod = "" ;
      AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil = DecimalUtil.ZERO ;
      AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to = DecimalUtil.ZERO ;
      AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet = DecimalUtil.ZERO ;
      AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to = DecimalUtil.ZERO ;
      H01II2_A200BarPieCod = new String[] {""} ;
      H01II2_A130BarCodPar = new String[] {""} ;
      H01II2_A132BarCodReo = new byte[1] ;
      H01II2_A129BarCod = new int[1] ;
      H01II2_A396EmprCod = new String[] {""} ;
      H01II2_A3275BarKgsAut = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01II2_n3275BarKgsAut = new boolean[] {false} ;
      H01II2_A201BarPieEst = new byte[1] ;
      H01II2_A6116BarPieImp = new String[] {""} ;
      H01II2_n6116BarPieImp = new boolean[] {false} ;
      H01II2_A1691BarPieAnc = new short[1] ;
      H01II2_n1691BarPieAnc = new boolean[] {false} ;
      H01II2_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01II2_A203BarPieKil = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01II3_AGRID_nRecordCount = new long[1] ;
      AV11UsurCod = "" ;
      AV10Station = "" ;
      AV8EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV54HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV116WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV84Session = httpContext.getWebSession();
      AV27ColumnsSelectorXML = "" ;
      H01II4_A396EmprCod = new String[] {""} ;
      H01II4_A129BarCod = new int[1] ;
      H01II4_A132BarCodReo = new byte[1] ;
      H01II4_A130BarCodPar = new String[] {""} ;
      H01II4_A200BarPieCod = new String[] {""} ;
      H01II4_A3858BarTroCod = new short[1] ;
      H01II4_A4990BarTroCal = new byte[1] ;
      H01II4_n4990BarTroCal = new boolean[] {false} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV63ManageFiltersXml = "" ;
      Gx_msg = "" ;
      AV12Window = new com.genexus.webpanels.GXWindow();
      AV35ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV114UserCustomValue = "" ;
      AV25ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV5Bapieobs = "" ;
      GXv_char3 = new String[1] ;
      AV51GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState12 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV110TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV112TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      H01II5_A602MaqCod = new String[] {""} ;
      H01II5_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01II5_A396EmprCod = new String[] {""} ;
      H01II5_A129BarCod = new int[1] ;
      H01II5_A132BarCodReo = new byte[1] ;
      H01II5_A130BarCodPar = new String[] {""} ;
      H01II5_A194BarOrdLin = new short[1] ;
      H01II5_A557HisProF = new String[] {""} ;
      H01II5_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H01II5_n4440HisProDTI = new boolean[] {false} ;
      H01II5_A561HisProLin = new int[1] ;
      H01II6_A758ProCod = new String[] {""} ;
      H01II6_A194BarOrdLin = new short[1] ;
      H01II6_A130BarCodPar = new String[] {""} ;
      H01II6_A132BarCodReo = new byte[1] ;
      H01II6_A129BarCod = new int[1] ;
      H01II6_A396EmprCod = new String[] {""} ;
      H01II6_A153BarFasEst = new byte[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      bttBtnfinhdr_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.expedicionesautomatizadas.webwhdrpzi__default(),
         new Object[] {
             new Object[] {
            H01II2_A200BarPieCod, H01II2_A130BarCodPar, H01II2_A132BarCodReo, H01II2_A129BarCod, H01II2_A396EmprCod, H01II2_A3275BarKgsAut, H01II2_n3275BarKgsAut, H01II2_A201BarPieEst, H01II2_A6116BarPieImp, H01II2_n6116BarPieImp,
            H01II2_A1691BarPieAnc, H01II2_n1691BarPieAnc, H01II2_A205BarPieMet, H01II2_A203BarPieKil
            }
            , new Object[] {
            H01II3_AGRID_nRecordCount
            }
            , new Object[] {
            H01II4_A396EmprCod, H01II4_A129BarCod, H01II4_A132BarCodReo, H01II4_A130BarCodPar, H01II4_A200BarPieCod, H01II4_A3858BarTroCod, H01II4_A4990BarTroCal, H01II4_n4990BarTroCal
            }
            , new Object[] {
            H01II5_A602MaqCod, H01II5_A558HisProFec, H01II5_A396EmprCod, H01II5_A129BarCod, H01II5_A132BarCodReo, H01II5_A130BarCodPar, H01II5_A194BarOrdLin, H01II5_A557HisProF, H01II5_A4440HisProDTI, H01II5_n4440HisProDTI,
            H01II5_A561HisProLin
            }
            , new Object[] {
            H01II6_A758ProCod, H01II6_A194BarOrdLin, H01II6_A130BarCodPar, H01II6_A132BarCodReo, H01II6_A129BarCod, H01II6_A396EmprCod, H01II6_A153BarFasEst
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV144Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_time = GXutil.time( ) ;
      AV144Pgmname = "ExpedicionesAutomatizadas.WebWHDRPZI" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV19BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV19BarCodReo ;
   private byte AV61ManageFiltersExecutionStep ;
   private byte AV94TFBarPieEst ;
   private byte AV95TFBarPieEst_To ;
   private byte A4990BarTroCal ;
   private byte AV127Turno ;
   private byte gxajaxcallmode ;
   private byte AV7BarTrocal ;
   private byte AV6BarFasest ;
   private byte A153BarFasEst ;
   private byte A132BarCodReo ;
   private byte A201BarPieEst ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ;
   private byte AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV21BarOrdlin ;
   private short wcpOAV13BarAncAca1 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV21BarOrdlin ;
   private short AV13BarAncAca1 ;
   private short AV86TFBarPieAnc ;
   private short AV87TFBarPieAnc_To ;
   private short AV77OrderedBy ;
   private short A3858BarTroCod ;
   private short AV120N_pzt ;
   private short AV119N_pzc ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV43GridActions ;
   private short A1691BarPieAnc ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ;
   private short AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ;
   private short AV124ParCod ;
   private int wcpOAV73OpeCod ;
   private int wcpOAV15BarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_57 ;
   private int AV73OpeCod ;
   private int AV15BarCod ;
   private int nGXsfl_57_idx=1 ;
   private int A561HisProLin ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtBarPieCod_Visible ;
   private int edtBarPieKil_Visible ;
   private int edtBarPieMet_Visible ;
   private int edtBarPieAnc_Visible ;
   private int edtBarPieImp_Visible ;
   private int edtBarPieEst_Visible ;
   private int AV82PageToGo ;
   private int AV148GXV1 ;
   private int nGXsfl_57_fel_idx=1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV45GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV102TFBarPieKil ;
   private java.math.BigDecimal AV103TFBarPieKil_To ;
   private java.math.BigDecimal AV106TFBarPieMet ;
   private java.math.BigDecimal AV107TFBarPieMet_To ;
   private java.math.BigDecimal A3275BarKgsAut ;
   private java.math.BigDecimal A203BarPieKil ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ;
   private java.math.BigDecimal AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ;
   private java.math.BigDecimal AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ;
   private java.math.BigDecimal AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ;
   private String wcpOAV31EmprCod ;
   private String wcpOAV75OpeNom ;
   private String wcpOAV65MaqCod ;
   private String wcpOAV67MaqNom ;
   private String wcpOAV37FasCod ;
   private String wcpOAV39FasDsc ;
   private String wcpOAV17BarCodPar ;
   private String wcpOAV70Msg_i ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV31EmprCod ;
   private String AV75OpeNom ;
   private String AV65MaqCod ;
   private String AV67MaqNom ;
   private String AV37FasCod ;
   private String AV39FasDsc ;
   private String AV17BarCodPar ;
   private String AV70Msg_i ;
   private String sGXsfl_57_idx="0001" ;
   private String A396EmprCod ;
   private String AV90TFBarPieCod ;
   private String AV91TFBarPieCod_Sel ;
   private String AV144Pgmname ;
   private String AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod ;
   private String AV121Msg2 ;
   private String AV72Msg1 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV53HisProf ;
   private String AV126Parcodnom ;
   private String Gx_time ;
   private String A557HisProF ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A200BarPieCod ;
   private String edtBarPieCod_Internalname ;
   private String edtBarPieKil_Internalname ;
   private String edtBarPieMet_Internalname ;
   private String edtBarPieAnc_Internalname ;
   private String A6116BarPieImp ;
   private String edtBarPieImp_Internalname ;
   private String edtBarPieEst_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ;
   private String AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ;
   private String AV11UsurCod ;
   private String AV10Station ;
   private String AV8EmprNom ;
   private String GXv_char2[] ;
   private String edtBarPieCod_Columnheaderclass ;
   private String edtBarPieKil_Columnheaderclass ;
   private String edtBarPieMet_Columnheaderclass ;
   private String edtBarPieAnc_Columnheaderclass ;
   private String edtBarPieImp_Columnheaderclass ;
   private String edtBarPieEst_Columnheaderclass ;
   private String edtBarPieCod_Columnclass ;
   private String edtBarPieKil_Columnclass ;
   private String edtBarPieMet_Columnclass ;
   private String edtBarPieAnc_Columnclass ;
   private String edtBarPieImp_Columnclass ;
   private String edtBarPieEst_Columnclass ;
   private String Gx_msg ;
   private String AV5Bapieobs ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String sGXsfl_57_fel_idx="0001" ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String tblUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnfinhdr_Internalname ;
   private String bttBtnfinhdr_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarPieCod_Jsonclick ;
   private String edtBarPieKil_Jsonclick ;
   private String edtBarPieMet_Jsonclick ;
   private String edtBarPieAnc_Jsonclick ;
   private String edtBarPieImp_Jsonclick ;
   private String edtBarPieEst_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV9HisProdti ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date wcpOAV57Lecfec ;
   private java.util.Date AV57Lecfec ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV80OrderedDsc ;
   private boolean n4990BarTroCal ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
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
   private boolean n1691BarPieAnc ;
   private boolean n6116BarPieImp ;
   private boolean bGXsfl_57_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n3275BarKgsAut ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV122ConfirmacionHDRFinalizada ;
   private boolean AV125ConfirmacionSalir ;
   private boolean AV128ConfirmarDividir ;
   private boolean AV118Confirmacion ;
   private boolean n4440HisProDTI ;
   private String AV27ColumnsSelectorXML ;
   private String AV63ManageFiltersXml ;
   private String AV114UserCustomValue ;
   private String AV41FilterFullText ;
   private String lV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ;
   private String AV35ExcelFilename ;
   private String AV33ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWindow AV12Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV54HTTPRequest ;
   private com.genexus.webpanels.WebSession AV84Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H01II2_A200BarPieCod ;
   private String[] H01II2_A130BarCodPar ;
   private byte[] H01II2_A132BarCodReo ;
   private int[] H01II2_A129BarCod ;
   private String[] H01II2_A396EmprCod ;
   private java.math.BigDecimal[] H01II2_A3275BarKgsAut ;
   private boolean[] H01II2_n3275BarKgsAut ;
   private byte[] H01II2_A201BarPieEst ;
   private String[] H01II2_A6116BarPieImp ;
   private boolean[] H01II2_n6116BarPieImp ;
   private short[] H01II2_A1691BarPieAnc ;
   private boolean[] H01II2_n1691BarPieAnc ;
   private java.math.BigDecimal[] H01II2_A205BarPieMet ;
   private java.math.BigDecimal[] H01II2_A203BarPieKil ;
   private long[] H01II3_AGRID_nRecordCount ;
   private String[] H01II4_A396EmprCod ;
   private int[] H01II4_A129BarCod ;
   private byte[] H01II4_A132BarCodReo ;
   private String[] H01II4_A130BarCodPar ;
   private String[] H01II4_A200BarPieCod ;
   private short[] H01II4_A3858BarTroCod ;
   private byte[] H01II4_A4990BarTroCal ;
   private boolean[] H01II4_n4990BarTroCal ;
   private String[] H01II5_A602MaqCod ;
   private java.util.Date[] H01II5_A558HisProFec ;
   private String[] H01II5_A396EmprCod ;
   private int[] H01II5_A129BarCod ;
   private byte[] H01II5_A132BarCodReo ;
   private String[] H01II5_A130BarCodPar ;
   private short[] H01II5_A194BarOrdLin ;
   private String[] H01II5_A557HisProF ;
   private java.util.Date[] H01II5_A4440HisProDTI ;
   private boolean[] H01II5_n4440HisProDTI ;
   private int[] H01II5_A561HisProLin ;
   private String[] H01II6_A758ProCod ;
   private short[] H01II6_A194BarOrdLin ;
   private String[] H01II6_A130BarCodPar ;
   private byte[] H01II6_A132BarCodReo ;
   private int[] H01II6_A129BarCod ;
   private String[] H01II6_A396EmprCod ;
   private byte[] H01II6_A153BarFasEst ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV59ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV23ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV29DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV49GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState12[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV51GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV110TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV112TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV116WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class webwhdrpzi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01II2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                          String AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                          String AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                          java.math.BigDecimal AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                          java.math.BigDecimal AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                          java.math.BigDecimal AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                          short AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ,
                                          short AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ,
                                          byte AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ,
                                          byte AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ,
                                          String A200BarPieCod ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          short A1691BarPieAnc ,
                                          String A6116BarPieImp ,
                                          byte A201BarPieEst ,
                                          short AV77OrderedBy ,
                                          boolean AV80OrderedDsc ,
                                          String AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                          int AV15BarCod ,
                                          byte AV19BarCodReo ,
                                          String AV17BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int13 = new byte[25];
      Object[] GXv_Object14 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " BarPieCod, BarCodPar, BarCodReo, BarCod, EmprCod, BarKgsAut, BarPieEst, BarPieImp, BarPieAnc, BarPieMet, BarPieKil" ;
      sFromString = " FROM TXPBARPIE" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(BarPieKil > 0)");
      if ( ! (GXutil.strcmp("", AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieAnc,'9990'), 2) like '%' || ?) or ( UPPER(BarPieImp) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieEst,'90'), 2) like '%' || ?))");
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
      if ( (GXutil.strcmp("", AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int13[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(BarPieCod = ?)");
      }
      else
      {
         GXv_int13[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(BarPieKil >= ?)");
      }
      else
      {
         GXv_int13[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(BarPieKil <= ?)");
      }
      else
      {
         GXv_int13[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(BarPieMet >= ?)");
      }
      else
      {
         GXv_int13[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(BarPieMet <= ?)");
      }
      else
      {
         GXv_int13[15] = (byte)(1) ;
      }
      if ( ! (0==AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) )
      {
         addWhere(sWhereString, "(BarPieAnc >= ?)");
      }
      else
      {
         GXv_int13[16] = (byte)(1) ;
      }
      if ( ! (0==AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) )
      {
         addWhere(sWhereString, "(BarPieAnc <= ?)");
      }
      else
      {
         GXv_int13[17] = (byte)(1) ;
      }
      if ( ! (0==AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) )
      {
         addWhere(sWhereString, "(BarPieEst >= ?)");
      }
      else
      {
         GXv_int13[18] = (byte)(1) ;
      }
      if ( ! (0==AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(BarPieEst <= ?)");
      }
      else
      {
         GXv_int13[19] = (byte)(1) ;
      }
      if ( AV77OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar" ;
      }
      else if ( ( AV77OrderedBy == 2 ) && ! AV80OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarPieCod" ;
      }
      else if ( ( AV77OrderedBy == 2 ) && ( AV80OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarPieCod DESC" ;
      }
      else if ( ( AV77OrderedBy == 3 ) && ! AV80OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarPieKil" ;
      }
      else if ( ( AV77OrderedBy == 3 ) && ( AV80OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarPieKil DESC" ;
      }
      else if ( ( AV77OrderedBy == 4 ) && ! AV80OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarPieMet" ;
      }
      else if ( ( AV77OrderedBy == 4 ) && ( AV80OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarPieMet DESC" ;
      }
      else if ( ( AV77OrderedBy == 5 ) && ! AV80OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarPieAnc" ;
      }
      else if ( ( AV77OrderedBy == 5 ) && ( AV80OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarPieAnc DESC" ;
      }
      else if ( ( AV77OrderedBy == 6 ) && ! AV80OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod, BarPieEst" ;
      }
      else if ( ( AV77OrderedBy == 6 ) && ( AV80OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC, BarPieEst DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object14[0] = scmdbuf ;
      GXv_Object14[1] = GXv_int13 ;
      return GXv_Object14 ;
   }

   protected Object[] conditional_H01II3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext ,
                                          String AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel ,
                                          String AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod ,
                                          java.math.BigDecimal AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil ,
                                          java.math.BigDecimal AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to ,
                                          java.math.BigDecimal AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet ,
                                          java.math.BigDecimal AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to ,
                                          short AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc ,
                                          short AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to ,
                                          byte AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest ,
                                          byte AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to ,
                                          String A200BarPieCod ,
                                          java.math.BigDecimal A203BarPieKil ,
                                          java.math.BigDecimal A205BarPieMet ,
                                          short A1691BarPieAnc ,
                                          String A6116BarPieImp ,
                                          byte A201BarPieEst ,
                                          short AV77OrderedBy ,
                                          boolean AV80OrderedDsc ,
                                          String AV131Expedicionesautomatizadas_webwhdrpzids_1_emprcod ,
                                          int AV15BarCod ,
                                          byte AV19BarCodReo ,
                                          String AV17BarCodPar ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[20];
      Object[] GXv_Object16 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPBARPIE" ;
      addWhere(sWhereString, "(EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)");
      addWhere(sWhereString, "(BarPieKil > 0)");
      if ( ! (GXutil.strcmp("", AV132Expedicionesautomatizadas_webwhdrpzids_2_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(BarPieCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieKil,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieMet,'999990.99'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(BarPieAnc,'9990'), 2) like '%' || ?) or ( UPPER(BarPieImp) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(BarPieEst,'90'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
         GXv_int15[5] = (byte)(1) ;
         GXv_int15[6] = (byte)(1) ;
         GXv_int15[7] = (byte)(1) ;
         GXv_int15[8] = (byte)(1) ;
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) && ( ! (GXutil.strcmp("", AV133Expedicionesautomatizadas_webwhdrpzids_3_tfbarpiecod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(BarPieCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Expedicionesautomatizadas_webwhdrpzids_4_tfbarpiecod_sel)==0) )
      {
         addWhere(sWhereString, "(BarPieCod = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV135Expedicionesautomatizadas_webwhdrpzids_5_tfbarpiekil)==0) )
      {
         addWhere(sWhereString, "(BarPieKil >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV136Expedicionesautomatizadas_webwhdrpzids_6_tfbarpiekil_to)==0) )
      {
         addWhere(sWhereString, "(BarPieKil <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV137Expedicionesautomatizadas_webwhdrpzids_7_tfbarpiemet)==0) )
      {
         addWhere(sWhereString, "(BarPieMet >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV138Expedicionesautomatizadas_webwhdrpzids_8_tfbarpiemet_to)==0) )
      {
         addWhere(sWhereString, "(BarPieMet <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (0==AV139Expedicionesautomatizadas_webwhdrpzids_9_tfbarpieanc) )
      {
         addWhere(sWhereString, "(BarPieAnc >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (0==AV140Expedicionesautomatizadas_webwhdrpzids_10_tfbarpieanc_to) )
      {
         addWhere(sWhereString, "(BarPieAnc <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (0==AV141Expedicionesautomatizadas_webwhdrpzids_11_tfbarpieest) )
      {
         addWhere(sWhereString, "(BarPieEst >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (0==AV142Expedicionesautomatizadas_webwhdrpzids_12_tfbarpieest_to) )
      {
         addWhere(sWhereString, "(BarPieEst <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV77OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 2 ) && ! AV80OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 2 ) && ( AV80OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 3 ) && ! AV80OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 3 ) && ( AV80OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 4 ) && ! AV80OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 4 ) && ( AV80OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 5 ) && ! AV80OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 5 ) && ( AV80OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 6 ) && ! AV80OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV77OrderedBy == 6 ) && ( AV80OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
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
                  return conditional_H01II2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] );
            case 1 :
                  return conditional_H01II3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (java.math.BigDecimal)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , ((Number) dynConstraints[17]).shortValue() , ((Boolean) dynConstraints[18]).booleanValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01II2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01II3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01II4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod, BarTroCal FROM TXPBARTRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarPieCod = ? and BarTroCod = 9999 ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod, BarTroCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01II5", "SELECT * FROM (SELECT MaqCod, HisProFec, EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProF, HisProDTI, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01II6", "SELECT ProCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, EmprCod, BarFasEst FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 9);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(10);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 9);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[42]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[22]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 9);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 9);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 2);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 2);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[34], 2);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[35], 2);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

