package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte02_wp_impl extends GXDataArea
{
   public recetadetinte02_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte02_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte02_wp_impl.class ));
   }

   public recetadetinte02_wp_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGrupodeaccionesgrid = new HTMLChoice();
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
            AV48Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV52Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
               AV49Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
               AV50Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
               AV51RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
               Gx_mode = httpContext.GetPar( "Mode") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               AV130varmsg = httpContext.GetPar( "varmsg") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV130varmsg", AV130varmsg);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVARMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV130varmsg, ""))));
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
      nRC_GXsfl_187 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_187"))) ;
      nGXsfl_187_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_187_idx"))) ;
      sGXsfl_187_idx = httpContext.GetPar( "sGXsfl_187_idx") ;
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
      AV48Emprcod = httpContext.GetPar( "Emprcod") ;
      AV52Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV49Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV50Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV51RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      AV100Procesosdadosdealta = (short)(GXutil.lval( httpContext.GetPar( "Procesosdadosdealta"))) ;
      AV122CambioPrograma = (short)(GXutil.lval( httpContext.GetPar( "CambioPrograma"))) ;
      AV142Pgmname = httpContext.GetPar( "Pgmname") ;
      AV72UsurCod = httpContext.GetPar( "UsurCod") ;
      AV73Station = httpContext.GetPar( "Station") ;
      AV126Procesoseliminados = (short)(GXutil.lval( httpContext.GetPar( "Procesoseliminados"))) ;
      AV24TFRecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro"))) ;
      AV25TFRecLinPro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecLinPro_To"))) ;
      AV86TFProForCod = httpContext.GetPar( "TFProForCod") ;
      AV87TFProForCod_Sel = httpContext.GetPar( "TFProForCod_Sel") ;
      AV88TFProForDsc = httpContext.GetPar( "TFProForDsc") ;
      AV89TFProForDsc_Sel = httpContext.GetPar( "TFProForDsc_Sel") ;
      AV26TFRecLin = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin"))) ;
      AV27TFRecLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFRecLin_To"))) ;
      AV28TFRecPrdNum = httpContext.GetPar( "TFRecPrdNum") ;
      AV29TFRecPrdNum_Sel = httpContext.GetPar( "TFRecPrdNum_Sel") ;
      AV82TFRecPrdDsc = httpContext.GetPar( "TFRecPrdDsc") ;
      AV83TFRecPrdDsc_Sel = httpContext.GetPar( "TFRecPrdDsc_Sel") ;
      AV34TFFacCon = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon"), ".") ;
      AV35TFFacCon_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacCon_To"), ".") ;
      AV36TFPrdCant = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant"), ".") ;
      AV37TFPrdCant_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCant_To"), ".") ;
      AV32TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV33TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV38TFRecForNro = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro"))) ;
      AV39TFRecForNro_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecForNro_To"))) ;
      AV40TFRecPrdTnq = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq"))) ;
      AV41TFRecPrdTnq_To = (byte)(GXutil.lval( httpContext.GetPar( "TFRecPrdTnq_To"))) ;
      AV42TFRecLote = httpContext.GetPar( "TFRecLote") ;
      AV43TFRecLote_Sel = httpContext.GetPar( "TFRecLote_Sel") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV130varmsg = httpContext.GetPar( "varmsg") ;
      AV65RecNumPrgIN = httpContext.GetPar( "RecNumPrgIN") ;
      AV68RecFA = CommonUtil.decimalVal( httpContext.GetPar( "RecFA"), ".") ;
      AV84RecTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "RecTotKgm"), ".") ;
      AV106RecTotMtr = CommonUtil.decimalVal( httpContext.GetPar( "RecTotMtr"), ".") ;
      AV66BarVolMaq = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaq"))) ;
      AV53MaqCod = httpContext.GetPar( "MaqCod") ;
      AV104RecetasTinteProcesosQuimicosToJson = httpContext.GetPar( "RecetasTinteProcesosQuimicosToJson") ;
      AV109BarMaqcod = httpContext.GetPar( "BarMaqcod") ;
      AV107Barfacabs = CommonUtil.decimalVal( httpContext.GetPar( "Barfacabs"), ".") ;
      AV108BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV118FecPan = localUtil.parseDateParm( httpContext.GetPar( "FecPan")) ;
      AV127Automata = (short)(GXutil.lval( httpContext.GetPar( "Automata"))) ;
      AV137RecipeTinte = (short)(GXutil.lval( httpContext.GetPar( "RecipeTinte"))) ;
      AV92Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      AV70MaqcodOld = httpContext.GetPar( "MaqcodOld") ;
      AV71BarVolMaqOld = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaqOld"))) ;
      AV120RecNumPrgold = httpContext.GetPar( "RecNumPrgold") ;
      AV117BarNHdr = httpContext.GetPar( "BarNHdr") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV52Barcod, AV49Barcodreo, AV50Barcodpar, AV51RecLinMaq, AV100Procesosdadosdealta, AV122CambioPrograma, AV142Pgmname, AV72UsurCod, AV73Station, AV126Procesoseliminados, AV24TFRecLinPro, AV25TFRecLinPro_To, AV86TFProForCod, AV87TFProForCod_Sel, AV88TFProForDsc, AV89TFProForDsc_Sel, AV26TFRecLin, AV27TFRecLin_To, AV28TFRecPrdNum, AV29TFRecPrdNum_Sel, AV82TFRecPrdDsc, AV83TFRecPrdDsc_Sel, AV34TFFacCon, AV35TFFacCon_To, AV36TFPrdCant, AV37TFPrdCant_To, AV32TFForPrdDsc, AV33TFForPrdDsc_Sel, AV38TFRecForNro, AV39TFRecForNro_To, AV40TFRecPrdTnq, AV41TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV130varmsg, AV65RecNumPrgIN, AV68RecFA, AV84RecTotKgm, AV106RecTotMtr, AV66BarVolMaq, AV53MaqCod, AV104RecetasTinteProcesosQuimicosToJson, AV109BarMaqcod, AV107Barfacabs, AV108BarAgrEst, AV118FecPan, AV127Automata, AV137RecipeTinte, AV92Carvitin, AV70MaqcodOld, AV71BarVolMaqOld, AV120RecNumPrgold, AV117BarNHdr) ;
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
      pa1G42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1G42( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetadetinte02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV130varmsg))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Gx_mode","varmsg"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104RecetasTinteProcesosQuimicosToJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109BarMaqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV107Barfacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV118FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV127Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV137RecipeTinte), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70MaqcodOld, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71BarVolMaqOld), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120RecNumPrgold, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVARMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV130varmsg, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte02_WP");
      forbiddenHiddens.add("BarNHdr", GXutil.rtrim( localUtil.format( AV117BarNHdr, "")));
      forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( AV108BarAgrEst, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte02_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_187", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_187, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV133MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV133MaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCESOSDADOSDEALTA", GXutil.ltrim( localUtil.ntoc( AV100Procesosdadosdealta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV48Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV52Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV49Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV50Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV51RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV72UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV73Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCESOSELIMINADOS", GXutil.ltrim( localUtil.ntoc( AV126Procesoseliminados, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO", GXutil.ltrim( localUtil.ntoc( AV24TFRecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLINPRO_TO", GXutil.ltrim( localUtil.ntoc( AV25TFRecLinPro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD", GXutil.rtrim( AV86TFProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD_SEL", GXutil.rtrim( AV87TFProForCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC", GXutil.rtrim( AV88TFProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC_SEL", GXutil.rtrim( AV89TFProForDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN", GXutil.ltrim( localUtil.ntoc( AV26TFRecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLIN_TO", GXutil.ltrim( localUtil.ntoc( AV27TFRecLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM", GXutil.rtrim( AV28TFRecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDNUM_SEL", GXutil.rtrim( AV29TFRecPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC", GXutil.rtrim( AV82TFRecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDDSC_SEL", GXutil.rtrim( AV83TFRecPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCON", GXutil.ltrim( localUtil.ntoc( AV34TFFacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACCON_TO", GXutil.ltrim( localUtil.ntoc( AV35TFFacCon_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT", GXutil.ltrim( localUtil.ntoc( AV36TFPrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDCANT_TO", GXutil.ltrim( localUtil.ntoc( AV37TFPrdCant_To, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV32TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV33TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFORNRO", GXutil.ltrim( localUtil.ntoc( AV38TFRecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECFORNRO_TO", GXutil.ltrim( localUtil.ntoc( AV39TFRecForNro_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDTNQ", GXutil.ltrim( localUtil.ntoc( AV40TFRecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECPRDTNQ_TO", GXutil.ltrim( localUtil.ntoc( AV41TFRecPrdTnq_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE", GXutil.rtrim( AV42TFRecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECLOTE_SEL", GXutil.rtrim( AV43TFRecLote_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECETASTINTEPROCESOSQUIMICOSTOJSON", AV104RecetasTinteProcesosQuimicosToJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104RecetasTinteProcesosQuimicosToJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQCOD", GXutil.rtrim( AV109BarMaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109BarMaqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFACABS", GXutil.ltrim( localUtil.ntoc( AV107Barfacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV107Barfacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV118FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV118FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTOMATA", GXutil.ltrim( localUtil.ntoc( AV127Automata, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV127Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECIPETINTE", GXutil.ltrim( localUtil.ntoc( AV137RecipeTinte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV137RecipeTinte), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSUA", GXutil.rtrim( AV91BarSua));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV92Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV121Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODOLD", GXutil.rtrim( AV70MaqcodOld));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70MaqcodOld, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARVOLMAQOLD", GXutil.ltrim( localUtil.ntoc( AV71BarVolMaqOld, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71BarVolMaqOld), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGOPE", GXutil.rtrim( AV124FlagOpe));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMED", GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMAX", GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMIN", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQRELBAN", GXutil.ltrim( localUtil.ntoc( A3599MaqRelBan, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUIN", GXutil.ltrim( localUtil.ntoc( AV54Maquin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECNUMPRGOLD", GXutil.rtrim( AV120RecNumPrgold));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120RecNumPrgold, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Width", GXutil.rtrim( Dvpanel_tablelog_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Autowidth", GXutil.booltostr( Dvpanel_tablelog_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Autoheight", GXutil.booltostr( Dvpanel_tablelog_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Cls", GXutil.rtrim( Dvpanel_tablelog_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Title", GXutil.rtrim( Dvpanel_tablelog_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Collapsible", GXutil.booltostr( Dvpanel_tablelog_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Collapsed", GXutil.booltostr( Dvpanel_tablelog_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Showcollapseicon", GXutil.booltostr( Dvpanel_tablelog_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Iconposition", GXutil.rtrim( Dvpanel_tablelog_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLELOG_Autoscroll", GXutil.booltostr( Dvpanel_tablelog_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Cls", GXutil.rtrim( Combo_maqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_maqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Emptyitem", GXutil.booltostr( Combo_maqcod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Iteminternalname", GXutil.rtrim( Popover_baragrest_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Trigger", GXutil.rtrim( Popover_baragrest_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_baragrest_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Position", GXutil.rtrim( Popover_baragrest_Position));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Title", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Title", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_elimimarproceso_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
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
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
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
         we1G42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1G42( ) ;
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
      return formatLink("app.recetadetinte02_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV130varmsg))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Gx_mode","varmsg"})  ;
   }

   public String getPgmname( )
   {
      return "RecetadeTinte02_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Receta de Tinte (Mto)", "") ;
   }

   public void wb1G40( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablacontenido_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_tablelog_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_tablelog_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablelog.setProperty("Width", Dvpanel_tablelog_Width);
         ucDvpanel_tablelog.setProperty("AutoWidth", Dvpanel_tablelog_Autowidth);
         ucDvpanel_tablelog.setProperty("AutoHeight", Dvpanel_tablelog_Autoheight);
         ucDvpanel_tablelog.setProperty("Cls", Dvpanel_tablelog_Cls);
         ucDvpanel_tablelog.setProperty("Title", Dvpanel_tablelog_Title);
         ucDvpanel_tablelog.setProperty("Collapsible", Dvpanel_tablelog_Collapsible);
         ucDvpanel_tablelog.setProperty("Collapsed", Dvpanel_tablelog_Collapsed);
         ucDvpanel_tablelog.setProperty("ShowCollapseIcon", Dvpanel_tablelog_Showcollapseicon);
         ucDvpanel_tablelog.setProperty("IconPosition", Dvpanel_tablelog_Iconposition);
         ucDvpanel_tablelog.setProperty("AutoScroll", Dvpanel_tablelog_Autoscroll);
         ucDvpanel_tablelog.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablelog_Internalname, "DVPANEL_TABLELOGContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLELOGContainer"+"TableLog"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablelog_Internalname, divTablelog_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVarmsg_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVarmsg_Internalname, AV130varmsg, GXutil.rtrim( localUtil.format( AV130varmsg, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVarmsg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVarmsg_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCambioprograma_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCambioprograma_Internalname, httpContext.getMessage( "Cambio de Programa", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCambioprograma_Internalname, GXutil.ltrim( localUtil.ntoc( AV122CambioPrograma, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCambioprograma_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV122CambioPrograma), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV122CambioPrograma), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCambioprograma_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCambioprograma_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavModo_Internalname, httpContext.getMessage( "Modo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModo_Internalname, GXutil.rtrim( AV123Modo), GXutil.rtrim( localUtil.format( AV123Modo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavModif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavModif_Internalname, httpContext.getMessage( "Variable Control (Modif)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModif_Internalname, GXutil.rtrim( AV93Modif), GXutil.rtrim( localUtil.format( AV93Modif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModif_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblLog_Internalname, lblLog_Caption, "", "", lblLog_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_RecetadeTinte02_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV117BarNHdr), GXutil.rtrim( localUtil.format( AV117BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV95CliNom), GXutil.rtrim( localUtil.format( AV95CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV96BarSer), GXutil.rtrim( localUtil.format( AV96BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV97BarColNom), GXutil.rtrim( localUtil.format( AV97BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV98BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV98BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV98BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipcol_Internalname, httpContext.getMessage( "TC", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV99BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV99BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV99BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV133MaqCod_Data);
         ucCombo_maqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqcod_Internalname, "COMBO_MAQCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolmax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolmax_Internalname, httpContext.getMessage( "Vol. Max", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmax_Internalname, GXutil.ltrim( localUtil.ntoc( AV56MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV56MaqVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV56MaqVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolmin_Internalname, httpContext.getMessage( "Vol. Min.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV57MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV57MaqVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV57MaqVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRb_Internalname, httpContext.getMessage( "Rb", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRb_Internalname, GXutil.ltrim( localUtil.ntoc( AV64Rb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRb_Enabled!=0) ? localUtil.format( AV64Rb, "ZZ9.99") : localUtil.format( AV64Rb, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRb_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarvolmaq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarvolmaq_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarvolmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV66BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarvolmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV66BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV66BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarvolmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarvolmaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfa_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfa_Internalname, httpContext.getMessage( "Fact. Abs.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfa_Internalname, GXutil.ltrim( localUtil.ntoc( AV68RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecfa_Enabled!=0) ? localUtil.format( AV68RecFA, "ZZ9.99") : localUtil.format( AV68RecFA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfa_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecnumprgin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecnumprgin_Internalname, httpContext.getMessage( "Nº Programa", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecnumprgin_Internalname, GXutil.rtrim( AV65RecNumPrgIN), GXutil.rtrim( localUtil.format( AV65RecNumPrgIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecnumprgin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecnumprgin_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncambiar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 187, 3, 0)+","+"null"+");", httpContext.getMessage( "Cambiar Prog", ""), bttBtncambiar_Jsonclick, 5, httpContext.getMessage( "Cambiar Prog", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCAMBIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotkgm_Internalname, httpContext.getMessage( "Kilos Tot.", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV84RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgm_Enabled!=0) ? localUtil.format( AV84RecTotKgm, "ZZZZZZ9.99") : localUtil.format( AV84RecTotKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotkgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotkgs_Internalname, httpContext.getMessage( "Kilos Hdr", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV85RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgs_Enabled!=0) ? localUtil.format( AV85RecTotKgs, "ZZZZZZ9.99") : localUtil.format( AV85RecTotKgs, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRectotmtr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotmtr_Internalname, httpContext.getMessage( "Metros Tot.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV106RecTotMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotmtr_Enabled!=0) ? localUtil.format( AV106RecTotMtr, "ZZZZZZ9.99") : localUtil.format( AV106RecTotMtr, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotmtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbaragrest_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbaragrest_Internalname, httpContext.getMessage( "A?", ""), "", "", lblTextblockbaragrest_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_146_1G42( true) ;
      }
      else
      {
         wb_table1_146_1G42( false) ;
      }
      return  ;
   }

   public void wb_table1_146_1G42e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", divUnnamedtable3_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 187, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Receta", ""), bttBtneliminar_Jsonclick, 7, httpContext.getMessage( "Eliminar Receta", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111g41_client"+"'", TempTags, "", 2, "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 187, 3, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 187, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121g41_client"+"'", TempTags, "", 2, "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 187, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e131g41_client"+"'", TempTags, "", 2, "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnadd_Internalname, "gx.evt.setGridEvt("+GXutil.str( 187, 3, 0)+","+"null"+");", httpContext.getMessage( "Agregar Procesos", ""), bttBtnadd_Jsonclick, 5, httpContext.getMessage( "Agregar Procesos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOADD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarprocesos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 187, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Procesos", ""), bttBtneliminarprocesos_Jsonclick, 5, httpContext.getMessage( "Eliminar Procesos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOELIMINARPROCESOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", divUnnamedtable5_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol187( ) ;
      }
      if ( wbEnd == 187 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_187 = (int)(nGXsfl_187_idx-1) ;
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblStyle_Internalname, lblStyle_Caption, "", "", lblStyle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_RecetadeTinte02_WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV142Pgmname), GXutil.rtrim( localUtil.format( AV142Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 232,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV53MaqCod), GXutil.rtrim( localUtil.format( AV53MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,232);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         /* User Defined Control */
         ucPopover_baragrest.setProperty("Trigger", Popover_baragrest_Trigger);
         ucPopover_baragrest.setProperty("PopoverWidth", Popover_baragrest_Popoverwidth);
         ucPopover_baragrest.setProperty("Position", Popover_baragrest_Position);
         ucPopover_baragrest.render(context, "dvelop.wwppopover", Popover_baragrest_Internalname, "POPOVER_BARAGRESTContainer");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 235,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV94CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV94CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,235);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02_WP.htm");
         wb_table2_236_1G42( true) ;
      }
      else
      {
         wb_table2_236_1G42( false) ;
      }
      return  ;
   }

   public void wb_table2_236_1G42e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_241_1G42( true) ;
      }
      else
      {
         wb_table3_241_1G42( false) ;
      }
      return  ;
   }

   public void wb_table3_241_1G42e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_246_1G42( true) ;
      }
      else
      {
         wb_table4_246_1G42( false) ;
      }
      return  ;
   }

   public void wb_table4_246_1G42e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_251_1G42( true) ;
      }
      else
      {
         wb_table5_251_1G42( false) ;
      }
      return  ;
   }

   public void wb_table5_251_1G42e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0258"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0258"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_187_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0258"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 187 )
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

   public void start1G42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Receta de Tinte (Mto)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1G40( ) ;
   }

   public void ws1G42( )
   {
      start1G42( ) ;
      evt1G42( ) ;
   }

   public void evt1G42( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_MAQCOD.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CERRAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOADD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAdd' */
                           e201G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARPROCESOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEliminarProcesos' */
                           e211G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCAMBIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCambiar' */
                           e221G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECNUMPRGIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e231G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECNUMPRGIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e241G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e251G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e261G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImprimir' */
                           e271G42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
                           AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
                           AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
                           AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
                           AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
                           AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
                           AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
                           AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
                           AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
                           AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
                           AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
                           AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
                           AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
                           AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
                           AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
                           AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
                           AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
                           AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
                           AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
                           AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
                           AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
                           AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
                           AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
                           AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 26), "VGRUPODEACCIONESGRID.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "'DOENVIOAUTOMATA'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 26), "VGRUPODEACCIONESGRID.CLICK") == 0 ) )
                        {
                           nGXsfl_187_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_187_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_187_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1872( ) ;
                           cmbavGrupodeaccionesgrid.setName( cmbavGrupodeaccionesgrid.getInternalname() );
                           cmbavGrupodeaccionesgrid.setValue( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()) );
                           AV111GrupodeaccionesGrid = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111GrupodeaccionesGrid), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
                           A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
                           A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           n719PrdNum = false ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n490ForPrdUMe = false ;
                           A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
                           A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A14055RecManAut = httpContext.cgiGet( edtRecManAut_Internalname) ;
                           A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
                           A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
                              GX_FocusControl = edtavPrdrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV75PrdRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PrdRGB), 10, 0));
                           }
                           else
                           {
                              AV75PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PrdRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV76R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
                           }
                           else
                           {
                              AV76R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV77G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
                           }
                           else
                           {
                              AV77G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV78B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
                           }
                           else
                           {
                              AV78B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV79R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
                           }
                           else
                           {
                              AV79R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV80G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
                           }
                           else
                           {
                              AV80G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV81B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
                           }
                           else
                           {
                              AV81B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
                           }
                           A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
                           n6018ProForFab = false ;
                           A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e281G42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e291G42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e301G42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRUPODEACCIONESGRID.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e311G42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOENVIOAUTOMATA'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoEnvioAutomata' */
                                 e321G42 ();
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
                     if ( nCmpId == 258 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0258") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0258", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1G42( )
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

   public void pa1G42( )
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
            GX_FocusControl = edtavCambioprograma_Internalname ;
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
      subsflControlProps_1872( ) ;
      while ( nGXsfl_187_idx <= nRC_GXsfl_187 )
      {
         sendrow_1872( ) ;
         nGXsfl_187_idx = ((subGrid_Islastpage==1)&&(nGXsfl_187_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_187_idx+1) ;
         sGXsfl_187_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_187_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1872( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV48Emprcod ,
                                 int AV52Barcod ,
                                 byte AV49Barcodreo ,
                                 String AV50Barcodpar ,
                                 short AV51RecLinMaq ,
                                 short AV100Procesosdadosdealta ,
                                 short AV122CambioPrograma ,
                                 String AV142Pgmname ,
                                 String AV72UsurCod ,
                                 String AV73Station ,
                                 short AV126Procesoseliminados ,
                                 byte AV24TFRecLinPro ,
                                 byte AV25TFRecLinPro_To ,
                                 String AV86TFProForCod ,
                                 String AV87TFProForCod_Sel ,
                                 String AV88TFProForDsc ,
                                 String AV89TFProForDsc_Sel ,
                                 short AV26TFRecLin ,
                                 short AV27TFRecLin_To ,
                                 String AV28TFRecPrdNum ,
                                 String AV29TFRecPrdNum_Sel ,
                                 String AV82TFRecPrdDsc ,
                                 String AV83TFRecPrdDsc_Sel ,
                                 java.math.BigDecimal AV34TFFacCon ,
                                 java.math.BigDecimal AV35TFFacCon_To ,
                                 java.math.BigDecimal AV36TFPrdCant ,
                                 java.math.BigDecimal AV37TFPrdCant_To ,
                                 String AV32TFForPrdDsc ,
                                 String AV33TFForPrdDsc_Sel ,
                                 byte AV38TFRecForNro ,
                                 byte AV39TFRecForNro_To ,
                                 byte AV40TFRecPrdTnq ,
                                 byte AV41TFRecPrdTnq_To ,
                                 String AV42TFRecLote ,
                                 String AV43TFRecLote_Sel ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String Gx_mode ,
                                 String AV130varmsg ,
                                 String AV65RecNumPrgIN ,
                                 java.math.BigDecimal AV68RecFA ,
                                 java.math.BigDecimal AV84RecTotKgm ,
                                 java.math.BigDecimal AV106RecTotMtr ,
                                 int AV66BarVolMaq ,
                                 String AV53MaqCod ,
                                 String AV104RecetasTinteProcesosQuimicosToJson ,
                                 String AV109BarMaqcod ,
                                 java.math.BigDecimal AV107Barfacabs ,
                                 String AV108BarAgrEst ,
                                 java.util.Date AV118FecPan ,
                                 short AV127Automata ,
                                 short AV137RecipeTinte ,
                                 short AV92Carvitin ,
                                 String AV70MaqcodOld ,
                                 int AV71BarVolMaqOld ,
                                 String AV120RecNumPrgold ,
                                 String AV117BarNHdr )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e291G42 ();
      GRID_nCurrentRecord = 0 ;
      rf1G42( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte02_WP");
      forbiddenHiddens.add("BarNHdr", GXutil.rtrim( localUtil.format( AV117BarNHdr, "")));
      forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( AV108BarAgrEst, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte02_wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLIN", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_187_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1G42( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV142Pgmname = "RecetadeTinte02_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
      Gx_err = (short)(0) ;
      edtavVarmsg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVarmsg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVarmsg_Enabled), 5, 0), true);
      edtavCambioprograma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCambioprograma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCambioprograma_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavModif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif_Enabled), 5, 0), true);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavMaqvolmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmax_Enabled), 5, 0), true);
      edtavMaqvolmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmin_Enabled), 5, 0), true);
      edtavRecnumprgin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecnumprgin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecnumprgin_Enabled), 5, 0), true);
      edtavRectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgm_Enabled), 5, 0), true);
      edtavRectotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgs_Enabled), 5, 0), true);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1G42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(187) ;
      /* Execute user event: Refresh */
      e291G42 ();
      nGXsfl_187_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_187_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_187_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1872( ) ;
      bGXsfl_187_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1872( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(AV145Recetadetinte02_wpds_1_tfreclinpro) ,
                                              Byte.valueOf(AV146Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                              AV148Recetadetinte02_wpds_4_tfproforcod_sel ,
                                              AV147Recetadetinte02_wpds_3_tfproforcod ,
                                              AV150Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                              AV149Recetadetinte02_wpds_5_tfprofordsc ,
                                              Short.valueOf(AV151Recetadetinte02_wpds_7_tfreclin) ,
                                              Short.valueOf(AV152Recetadetinte02_wpds_8_tfreclin_to) ,
                                              AV154Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                              AV153Recetadetinte02_wpds_9_tfrecprdnum ,
                                              AV156Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                              AV155Recetadetinte02_wpds_11_tfrecprddsc ,
                                              AV157Recetadetinte02_wpds_13_tffaccon ,
                                              AV158Recetadetinte02_wpds_14_tffaccon_to ,
                                              AV159Recetadetinte02_wpds_15_tfprdcant ,
                                              AV160Recetadetinte02_wpds_16_tfprdcant_to ,
                                              AV162Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                              AV161Recetadetinte02_wpds_17_tfforprddsc ,
                                              Byte.valueOf(AV163Recetadetinte02_wpds_19_tfrecfornro) ,
                                              Byte.valueOf(AV164Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                              Byte.valueOf(AV165Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                              Byte.valueOf(AV166Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                              AV168Recetadetinte02_wpds_24_tfreclote_sel ,
                                              AV167Recetadetinte02_wpds_23_tfreclote ,
                                              Byte.valueOf(A1273RecLinPro) ,
                                              A764ProForCod ,
                                              A766ProForDsc ,
                                              Short.valueOf(A811RecLin) ,
                                              A872RecPrdNum ,
                                              A875RecPrdDsc ,
                                              A431FacCon ,
                                              A686PrdCant ,
                                              A488ForPrdDsc ,
                                              Byte.valueOf(A2394RecForNro) ,
                                              Byte.valueOf(A3274RecPrdTnq) ,
                                              A5725RecLote ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV48Emprcod ,
                                              Integer.valueOf(AV52Barcod) ,
                                              Byte.valueOf(AV49Barcodreo) ,
                                              AV50Barcodpar ,
                                              Short.valueOf(AV51RecLinMaq) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Short.valueOf(A2804RecLinMaq) } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                              }
         });
         lV147Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV147Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
         lV149Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV149Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
         lV153Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV153Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
         lV155Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV155Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
         lV161Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV161Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
         lV167Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV167Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
         /* Using cursor H01G42 */
         pr_default.execute(0, new Object[] {AV48Emprcod, Integer.valueOf(AV52Barcod), Byte.valueOf(AV49Barcodreo), AV50Barcodpar, Short.valueOf(AV51RecLinMaq), Byte.valueOf(AV145Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV146Recetadetinte02_wpds_2_tfreclinpro_to), lV147Recetadetinte02_wpds_3_tfproforcod, AV148Recetadetinte02_wpds_4_tfproforcod_sel, lV149Recetadetinte02_wpds_5_tfprofordsc, AV150Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV151Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV152Recetadetinte02_wpds_8_tfreclin_to), lV153Recetadetinte02_wpds_9_tfrecprdnum, AV154Recetadetinte02_wpds_10_tfrecprdnum_sel, lV155Recetadetinte02_wpds_11_tfrecprddsc, AV156Recetadetinte02_wpds_12_tfrecprddsc_sel, AV157Recetadetinte02_wpds_13_tffaccon, AV158Recetadetinte02_wpds_14_tffaccon_to, AV159Recetadetinte02_wpds_15_tfprdcant, AV160Recetadetinte02_wpds_16_tfprdcant_to, lV161Recetadetinte02_wpds_17_tfforprddsc, AV162Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV163Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV164Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV165Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV166Recetadetinte02_wpds_22_tfrecprdtnq_to), lV167Recetadetinte02_wpds_23_tfreclote, AV168Recetadetinte02_wpds_24_tfreclote_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_187_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_187_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_187_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1872( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4024RecMar = H01G42_A4024RecMar[0] ;
            A6018ProForFab = H01G42_A6018ProForFab[0] ;
            n6018ProForFab = H01G42_n6018ProForFab[0] ;
            A13232PrdRGB = H01G42_A13232PrdRGB[0] ;
            A5725RecLote = H01G42_A5725RecLote[0] ;
            A3274RecPrdTnq = H01G42_A3274RecPrdTnq[0] ;
            A2394RecForNro = H01G42_A2394RecForNro[0] ;
            A14055RecManAut = H01G42_A14055RecManAut[0] ;
            A488ForPrdDsc = H01G42_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01G42_n488ForPrdDsc[0] ;
            A686PrdCant = H01G42_A686PrdCant[0] ;
            A431FacCon = H01G42_A431FacCon[0] ;
            A490ForPrdUMe = H01G42_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H01G42_n490ForPrdUMe[0] ;
            A719PrdNum = H01G42_A719PrdNum[0] ;
            n719PrdNum = H01G42_n719PrdNum[0] ;
            A875RecPrdDsc = H01G42_A875RecPrdDsc[0] ;
            A872RecPrdNum = H01G42_A872RecPrdNum[0] ;
            A811RecLin = H01G42_A811RecLin[0] ;
            A766ProForDsc = H01G42_A766ProForDsc[0] ;
            A764ProForCod = H01G42_A764ProForCod[0] ;
            A1273RecLinPro = H01G42_A1273RecLinPro[0] ;
            A2804RecLinMaq = H01G42_A2804RecLinMaq[0] ;
            A130BarCodPar = H01G42_A130BarCodPar[0] ;
            A132BarCodReo = H01G42_A132BarCodReo[0] ;
            A129BarCod = H01G42_A129BarCod[0] ;
            A396EmprCod = H01G42_A396EmprCod[0] ;
            A13232PrdRGB = H01G42_A13232PrdRGB[0] ;
            A488ForPrdDsc = H01G42_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H01G42_n488ForPrdDsc[0] ;
            A764ProForCod = H01G42_A764ProForCod[0] ;
            A6018ProForFab = H01G42_A6018ProForFab[0] ;
            n6018ProForFab = H01G42_n6018ProForFab[0] ;
            A766ProForDsc = H01G42_A766ProForDsc[0] ;
            e301G42 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(187) ;
         wb1G40( ) ;
      }
      bGXsfl_187_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1G42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV73Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECETASTINTEPROCESOSQUIMICOSTOJSON", AV104RecetasTinteProcesosQuimicosToJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104RecetasTinteProcesosQuimicosToJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQCOD", GXutil.rtrim( AV109BarMaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109BarMaqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFACABS", GXutil.ltrim( localUtil.ntoc( AV107Barfacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV107Barfacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLIN"+"_"+sGXsfl_187_idx, getSecureSignedToken( sGXsfl_187_idx, localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECPAN", localUtil.dtoc( AV118FecPan, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECPAN", getSecureSignedToken( "", AV118FecPan));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTOMATA", GXutil.ltrim( localUtil.ntoc( AV127Automata, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV127Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECIPETINTE", GXutil.ltrim( localUtil.ntoc( AV137RecipeTinte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV137RecipeTinte), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV92Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODOLD", GXutil.rtrim( AV70MaqcodOld));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70MaqcodOld, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARVOLMAQOLD", GXutil.ltrim( localUtil.ntoc( AV71BarVolMaqOld, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71BarVolMaqOld), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECNUMPRGOLD", GXutil.rtrim( AV120RecNumPrgold));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120RecNumPrgold, ""))));
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
      AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
      AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
      AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
      AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
      AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
      AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
      AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
      AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
      AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
      AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
      AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
      AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(AV145Recetadetinte02_wpds_1_tfreclinpro) ,
                                           Byte.valueOf(AV146Recetadetinte02_wpds_2_tfreclinpro_to) ,
                                           AV148Recetadetinte02_wpds_4_tfproforcod_sel ,
                                           AV147Recetadetinte02_wpds_3_tfproforcod ,
                                           AV150Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                           AV149Recetadetinte02_wpds_5_tfprofordsc ,
                                           Short.valueOf(AV151Recetadetinte02_wpds_7_tfreclin) ,
                                           Short.valueOf(AV152Recetadetinte02_wpds_8_tfreclin_to) ,
                                           AV154Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                           AV153Recetadetinte02_wpds_9_tfrecprdnum ,
                                           AV156Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                           AV155Recetadetinte02_wpds_11_tfrecprddsc ,
                                           AV157Recetadetinte02_wpds_13_tffaccon ,
                                           AV158Recetadetinte02_wpds_14_tffaccon_to ,
                                           AV159Recetadetinte02_wpds_15_tfprdcant ,
                                           AV160Recetadetinte02_wpds_16_tfprdcant_to ,
                                           AV162Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                           AV161Recetadetinte02_wpds_17_tfforprddsc ,
                                           Byte.valueOf(AV163Recetadetinte02_wpds_19_tfrecfornro) ,
                                           Byte.valueOf(AV164Recetadetinte02_wpds_20_tfrecfornro_to) ,
                                           Byte.valueOf(AV165Recetadetinte02_wpds_21_tfrecprdtnq) ,
                                           Byte.valueOf(AV166Recetadetinte02_wpds_22_tfrecprdtnq_to) ,
                                           AV168Recetadetinte02_wpds_24_tfreclote_sel ,
                                           AV167Recetadetinte02_wpds_23_tfreclote ,
                                           Byte.valueOf(A1273RecLinPro) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           Short.valueOf(A811RecLin) ,
                                           A872RecPrdNum ,
                                           A875RecPrdDsc ,
                                           A431FacCon ,
                                           A686PrdCant ,
                                           A488ForPrdDsc ,
                                           Byte.valueOf(A2394RecForNro) ,
                                           Byte.valueOf(A3274RecPrdTnq) ,
                                           A5725RecLote ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV48Emprcod ,
                                           Integer.valueOf(AV52Barcod) ,
                                           Byte.valueOf(AV49Barcodreo) ,
                                           AV50Barcodpar ,
                                           Short.valueOf(AV51RecLinMaq) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Short.valueOf(A2804RecLinMaq) } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.SHORT
                                           }
      });
      lV147Recetadetinte02_wpds_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV147Recetadetinte02_wpds_3_tfproforcod), 6, "%") ;
      lV149Recetadetinte02_wpds_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV149Recetadetinte02_wpds_5_tfprofordsc), 30, "%") ;
      lV153Recetadetinte02_wpds_9_tfrecprdnum = GXutil.padr( GXutil.rtrim( AV153Recetadetinte02_wpds_9_tfrecprdnum), 6, "%") ;
      lV155Recetadetinte02_wpds_11_tfrecprddsc = GXutil.padr( GXutil.rtrim( AV155Recetadetinte02_wpds_11_tfrecprddsc), 26, "%") ;
      lV161Recetadetinte02_wpds_17_tfforprddsc = GXutil.padr( GXutil.rtrim( AV161Recetadetinte02_wpds_17_tfforprddsc), 5, "%") ;
      lV167Recetadetinte02_wpds_23_tfreclote = GXutil.padr( GXutil.rtrim( AV167Recetadetinte02_wpds_23_tfreclote), 26, "%") ;
      /* Using cursor H01G43 */
      pr_default.execute(1, new Object[] {AV48Emprcod, Integer.valueOf(AV52Barcod), Byte.valueOf(AV49Barcodreo), AV50Barcodpar, Short.valueOf(AV51RecLinMaq), Byte.valueOf(AV145Recetadetinte02_wpds_1_tfreclinpro), Byte.valueOf(AV146Recetadetinte02_wpds_2_tfreclinpro_to), lV147Recetadetinte02_wpds_3_tfproforcod, AV148Recetadetinte02_wpds_4_tfproforcod_sel, lV149Recetadetinte02_wpds_5_tfprofordsc, AV150Recetadetinte02_wpds_6_tfprofordsc_sel, Short.valueOf(AV151Recetadetinte02_wpds_7_tfreclin), Short.valueOf(AV152Recetadetinte02_wpds_8_tfreclin_to), lV153Recetadetinte02_wpds_9_tfrecprdnum, AV154Recetadetinte02_wpds_10_tfrecprdnum_sel, lV155Recetadetinte02_wpds_11_tfrecprddsc, AV156Recetadetinte02_wpds_12_tfrecprddsc_sel, AV157Recetadetinte02_wpds_13_tffaccon, AV158Recetadetinte02_wpds_14_tffaccon_to, AV159Recetadetinte02_wpds_15_tfprdcant, AV160Recetadetinte02_wpds_16_tfprdcant_to, lV161Recetadetinte02_wpds_17_tfforprddsc, AV162Recetadetinte02_wpds_18_tfforprddsc_sel, Byte.valueOf(AV163Recetadetinte02_wpds_19_tfrecfornro), Byte.valueOf(AV164Recetadetinte02_wpds_20_tfrecfornro_to), Byte.valueOf(AV165Recetadetinte02_wpds_21_tfrecprdtnq), Byte.valueOf(AV166Recetadetinte02_wpds_22_tfrecprdtnq_to), lV167Recetadetinte02_wpds_23_tfreclote, AV168Recetadetinte02_wpds_24_tfreclote_sel});
      GRID_nRecordCount = H01G43_AGRID_nRecordCount[0] ;
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
      AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
      AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
      AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
      AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
      AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
      AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
      AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
      AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
      AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
      AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
      AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
      AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV52Barcod, AV49Barcodreo, AV50Barcodpar, AV51RecLinMaq, AV100Procesosdadosdealta, AV122CambioPrograma, AV142Pgmname, AV72UsurCod, AV73Station, AV126Procesoseliminados, AV24TFRecLinPro, AV25TFRecLinPro_To, AV86TFProForCod, AV87TFProForCod_Sel, AV88TFProForDsc, AV89TFProForDsc_Sel, AV26TFRecLin, AV27TFRecLin_To, AV28TFRecPrdNum, AV29TFRecPrdNum_Sel, AV82TFRecPrdDsc, AV83TFRecPrdDsc_Sel, AV34TFFacCon, AV35TFFacCon_To, AV36TFPrdCant, AV37TFPrdCant_To, AV32TFForPrdDsc, AV33TFForPrdDsc_Sel, AV38TFRecForNro, AV39TFRecForNro_To, AV40TFRecPrdTnq, AV41TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV130varmsg, AV65RecNumPrgIN, AV68RecFA, AV84RecTotKgm, AV106RecTotMtr, AV66BarVolMaq, AV53MaqCod, AV104RecetasTinteProcesosQuimicosToJson, AV109BarMaqcod, AV107Barfacabs, AV108BarAgrEst, AV118FecPan, AV127Automata, AV137RecipeTinte, AV92Carvitin, AV70MaqcodOld, AV71BarVolMaqOld, AV120RecNumPrgold, AV117BarNHdr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
      AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
      AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
      AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
      AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
      AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
      AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
      AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
      AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
      AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
      AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
      AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV52Barcod, AV49Barcodreo, AV50Barcodpar, AV51RecLinMaq, AV100Procesosdadosdealta, AV122CambioPrograma, AV142Pgmname, AV72UsurCod, AV73Station, AV126Procesoseliminados, AV24TFRecLinPro, AV25TFRecLinPro_To, AV86TFProForCod, AV87TFProForCod_Sel, AV88TFProForDsc, AV89TFProForDsc_Sel, AV26TFRecLin, AV27TFRecLin_To, AV28TFRecPrdNum, AV29TFRecPrdNum_Sel, AV82TFRecPrdDsc, AV83TFRecPrdDsc_Sel, AV34TFFacCon, AV35TFFacCon_To, AV36TFPrdCant, AV37TFPrdCant_To, AV32TFForPrdDsc, AV33TFForPrdDsc_Sel, AV38TFRecForNro, AV39TFRecForNro_To, AV40TFRecPrdTnq, AV41TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV130varmsg, AV65RecNumPrgIN, AV68RecFA, AV84RecTotKgm, AV106RecTotMtr, AV66BarVolMaq, AV53MaqCod, AV104RecetasTinteProcesosQuimicosToJson, AV109BarMaqcod, AV107Barfacabs, AV108BarAgrEst, AV118FecPan, AV127Automata, AV137RecipeTinte, AV92Carvitin, AV70MaqcodOld, AV71BarVolMaqOld, AV120RecNumPrgold, AV117BarNHdr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
      AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
      AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
      AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
      AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
      AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
      AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
      AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
      AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
      AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
      AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
      AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV52Barcod, AV49Barcodreo, AV50Barcodpar, AV51RecLinMaq, AV100Procesosdadosdealta, AV122CambioPrograma, AV142Pgmname, AV72UsurCod, AV73Station, AV126Procesoseliminados, AV24TFRecLinPro, AV25TFRecLinPro_To, AV86TFProForCod, AV87TFProForCod_Sel, AV88TFProForDsc, AV89TFProForDsc_Sel, AV26TFRecLin, AV27TFRecLin_To, AV28TFRecPrdNum, AV29TFRecPrdNum_Sel, AV82TFRecPrdDsc, AV83TFRecPrdDsc_Sel, AV34TFFacCon, AV35TFFacCon_To, AV36TFPrdCant, AV37TFPrdCant_To, AV32TFForPrdDsc, AV33TFForPrdDsc_Sel, AV38TFRecForNro, AV39TFRecForNro_To, AV40TFRecPrdTnq, AV41TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV130varmsg, AV65RecNumPrgIN, AV68RecFA, AV84RecTotKgm, AV106RecTotMtr, AV66BarVolMaq, AV53MaqCod, AV104RecetasTinteProcesosQuimicosToJson, AV109BarMaqcod, AV107Barfacabs, AV108BarAgrEst, AV118FecPan, AV127Automata, AV137RecipeTinte, AV92Carvitin, AV70MaqcodOld, AV71BarVolMaqOld, AV120RecNumPrgold, AV117BarNHdr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
      AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
      AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
      AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
      AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
      AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
      AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
      AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
      AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
      AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
      AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
      AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV52Barcod, AV49Barcodreo, AV50Barcodpar, AV51RecLinMaq, AV100Procesosdadosdealta, AV122CambioPrograma, AV142Pgmname, AV72UsurCod, AV73Station, AV126Procesoseliminados, AV24TFRecLinPro, AV25TFRecLinPro_To, AV86TFProForCod, AV87TFProForCod_Sel, AV88TFProForDsc, AV89TFProForDsc_Sel, AV26TFRecLin, AV27TFRecLin_To, AV28TFRecPrdNum, AV29TFRecPrdNum_Sel, AV82TFRecPrdDsc, AV83TFRecPrdDsc_Sel, AV34TFFacCon, AV35TFFacCon_To, AV36TFPrdCant, AV37TFPrdCant_To, AV32TFForPrdDsc, AV33TFForPrdDsc_Sel, AV38TFRecForNro, AV39TFRecForNro_To, AV40TFRecPrdTnq, AV41TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV130varmsg, AV65RecNumPrgIN, AV68RecFA, AV84RecTotKgm, AV106RecTotMtr, AV66BarVolMaq, AV53MaqCod, AV104RecetasTinteProcesosQuimicosToJson, AV109BarMaqcod, AV107Barfacabs, AV108BarAgrEst, AV118FecPan, AV127Automata, AV137RecipeTinte, AV92Carvitin, AV70MaqcodOld, AV71BarVolMaqOld, AV120RecNumPrgold, AV117BarNHdr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
      AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
      AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
      AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
      AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
      AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
      AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
      AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
      AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
      AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
      AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
      AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Emprcod, AV52Barcod, AV49Barcodreo, AV50Barcodpar, AV51RecLinMaq, AV100Procesosdadosdealta, AV122CambioPrograma, AV142Pgmname, AV72UsurCod, AV73Station, AV126Procesoseliminados, AV24TFRecLinPro, AV25TFRecLinPro_To, AV86TFProForCod, AV87TFProForCod_Sel, AV88TFProForDsc, AV89TFProForDsc_Sel, AV26TFRecLin, AV27TFRecLin_To, AV28TFRecPrdNum, AV29TFRecPrdNum_Sel, AV82TFRecPrdDsc, AV83TFRecPrdDsc_Sel, AV34TFFacCon, AV35TFFacCon_To, AV36TFPrdCant, AV37TFPrdCant_To, AV32TFForPrdDsc, AV33TFForPrdDsc_Sel, AV38TFRecForNro, AV39TFRecForNro_To, AV40TFRecPrdTnq, AV41TFRecPrdTnq_To, AV42TFRecLote, AV43TFRecLote_Sel, AV12OrderedBy, AV13OrderedDsc, Gx_mode, AV130varmsg, AV65RecNumPrgIN, AV68RecFA, AV84RecTotKgm, AV106RecTotMtr, AV66BarVolMaq, AV53MaqCod, AV104RecetasTinteProcesosQuimicosToJson, AV109BarMaqcod, AV107Barfacabs, AV108BarAgrEst, AV118FecPan, AV127Automata, AV137RecipeTinte, AV92Carvitin, AV70MaqcodOld, AV71BarVolMaqOld, AV120RecNumPrgold, AV117BarNHdr) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV142Pgmname = "RecetadeTinte02_WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
      Gx_err = (short)(0) ;
      edtavVarmsg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavVarmsg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavVarmsg_Enabled), 5, 0), true);
      edtavCambioprograma_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCambioprograma_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCambioprograma_Enabled), 5, 0), true);
      edtavModo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModo_Enabled), 5, 0), true);
      edtavModif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavModif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavModif_Enabled), 5, 0), true);
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnum_Enabled), 5, 0), true);
      edtavBartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipcol_Enabled), 5, 0), true);
      edtavMaqvolmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmax_Enabled), 5, 0), true);
      edtavMaqvolmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolmin_Enabled), 5, 0), true);
      edtavRecnumprgin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecnumprgin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecnumprgin_Enabled), 5, 0), true);
      edtavRectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgm_Enabled), 5, 0), true);
      edtavRectotkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgs_Enabled), 5, 0), true);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_187_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1G40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e281G42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV133MaqCod_Data);
         /* Read saved values. */
         nRC_GXsfl_187 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_187"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV92Carvitin = (short)(localUtil.ctol( httpContext.cgiGet( "vCARVITIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "vMODE") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tablelog_Width = httpContext.cgiGet( "DVPANEL_TABLELOG_Width") ;
         Dvpanel_tablelog_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELOG_Autowidth")) ;
         Dvpanel_tablelog_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELOG_Autoheight")) ;
         Dvpanel_tablelog_Cls = httpContext.cgiGet( "DVPANEL_TABLELOG_Cls") ;
         Dvpanel_tablelog_Title = httpContext.cgiGet( "DVPANEL_TABLELOG_Title") ;
         Dvpanel_tablelog_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELOG_Collapsible")) ;
         Dvpanel_tablelog_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELOG_Collapsed")) ;
         Dvpanel_tablelog_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELOG_Showcollapseicon")) ;
         Dvpanel_tablelog_Iconposition = httpContext.cgiGet( "DVPANEL_TABLELOG_Iconposition") ;
         Dvpanel_tablelog_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLELOG_Autoscroll")) ;
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
         Combo_maqcod_Cls = httpContext.cgiGet( "COMBO_MAQCOD_Cls") ;
         Combo_maqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_set") ;
         Combo_maqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQCOD_Emptyitem")) ;
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         Popover_baragrest_Iteminternalname = httpContext.cgiGet( "POPOVER_BARAGREST_Iteminternalname") ;
         Popover_baragrest_Trigger = httpContext.cgiGet( "POPOVER_BARAGREST_Trigger") ;
         Popover_baragrest_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_BARAGREST_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_baragrest_Position = httpContext.cgiGet( "POPOVER_BARAGREST_Position") ;
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
         Dvelop_confirmpanel_elimimarproceso_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Title") ;
         Dvelop_confirmpanel_elimimarproceso_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmationtext") ;
         Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Nobuttoncaption") ;
         Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Yesbuttonposition") ;
         Dvelop_confirmpanel_elimimarproceso_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Confirmtype") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_cerrar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Title") ;
         Dvelop_confirmpanel_cerrar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmationtext") ;
         Dvelop_confirmpanel_cerrar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_cerrar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_cerrar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_elimimarproceso_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO_Result") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         Dvelop_confirmpanel_cerrar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CERRAR_Result") ;
         Combo_maqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQCOD_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCambioprograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCambioprograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCAMBIOPROGRAMA");
            GX_FocusControl = edtavCambioprograma_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV122CambioPrograma = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122CambioPrograma), 4, 0));
         }
         else
         {
            AV122CambioPrograma = (short)(localUtil.ctol( httpContext.cgiGet( edtavCambioprograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122CambioPrograma), 4, 0));
         }
         AV123Modo = httpContext.cgiGet( edtavModo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123Modo", AV123Modo);
         AV93Modif = httpContext.cgiGet( edtavModif_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Modif", AV93Modif);
         AV117BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117BarNHdr", AV117BarNHdr);
         AV95CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95CliNom", AV95CliNom);
         AV96BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96BarSer", AV96BarSer);
         AV97BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97BarColNom", AV97BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV98BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarColNum), 6, 0));
         }
         else
         {
            AV98BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV98BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV99BarTipCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99BarTipCol), 2, 0));
         }
         else
         {
            AV99BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99BarTipCol), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMAX");
            GX_FocusControl = edtavMaqvolmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56MaqVolMax = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
         }
         else
         {
            AV56MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMIN");
            GX_FocusControl = edtavMaqvolmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57MaqVolMin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57MaqVolMin), 5, 0));
         }
         else
         {
            AV57MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57MaqVolMin), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRB");
            GX_FocusControl = edtavRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV64Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64Rb", GXutil.ltrimstr( AV64Rb, 6, 2));
         }
         else
         {
            AV64Rb = localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64Rb", GXutil.ltrimstr( AV64Rb, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARVOLMAQ");
            GX_FocusControl = edtavBarvolmaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV66BarVolMaq = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarVolMaq), 5, 0));
         }
         else
         {
            AV66BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarVolMaq), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECFA");
            GX_FocusControl = edtavRecfa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV68RecFA = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68RecFA", GXutil.ltrimstr( AV68RecFA, 6, 2));
         }
         else
         {
            AV68RecFA = localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68RecFA", GXutil.ltrimstr( AV68RecFA, 6, 2));
         }
         AV65RecNumPrgIN = httpContext.cgiGet( edtavRecnumprgin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65RecNumPrgIN", AV65RecNumPrgIN);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGM");
            GX_FocusControl = edtavRectotkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84RecTotKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84RecTotKgm", GXutil.ltrimstr( AV84RecTotKgm, 10, 2));
         }
         else
         {
            AV84RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84RecTotKgm", GXutil.ltrimstr( AV84RecTotKgm, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGS");
            GX_FocusControl = edtavRectotkgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85RecTotKgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85RecTotKgs", GXutil.ltrimstr( AV85RecTotKgs, 10, 2));
         }
         else
         {
            AV85RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85RecTotKgs", GXutil.ltrimstr( AV85RecTotKgs, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTMTR");
            GX_FocusControl = edtavRectotmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV106RecTotMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106RecTotMtr", GXutil.ltrimstr( AV106RecTotMtr, 10, 2));
         }
         else
         {
            AV106RecTotMtr = localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV106RecTotMtr", GXutil.ltrimstr( AV106RecTotMtr, 10, 2));
         }
         AV108BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108BarAgrEst", AV108BarAgrEst);
         AV142Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
         AV53MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53MaqCod", AV53MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV94CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94CliCod), 6, 0));
         }
         else
         {
            AV94CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94CliCod), 6, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_187_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_187_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_187_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1872( ) ;
         if ( nGXsfl_187_idx > 0 )
         {
            cmbavGrupodeaccionesgrid.setName( cmbavGrupodeaccionesgrid.getInternalname() );
            cmbavGrupodeaccionesgrid.setValue( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()) );
            AV111GrupodeaccionesGrid = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeaccionesgrid.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111GrupodeaccionesGrid), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
            A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n490ForPrdUMe = false ;
            A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
            A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
            A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
            n488ForPrdDsc = false ;
            A14055RecManAut = httpContext.cgiGet( edtRecManAut_Internalname) ;
            A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
            A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
               GX_FocusControl = edtavPrdrgb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV75PrdRGB = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PrdRGB), 10, 0));
            }
            else
            {
               AV75PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PrdRGB), 10, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
               GX_FocusControl = edtavR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV76R = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
            }
            else
            {
               AV76R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
               GX_FocusControl = edtavG_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV77G = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
            }
            else
            {
               AV77G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
               GX_FocusControl = edtavB_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV78B = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
            }
            else
            {
               AV78B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
               GX_FocusControl = edtavR2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV79R2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
            }
            else
            {
               AV79R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
               GX_FocusControl = edtavG2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV80G2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
            }
            else
            {
               AV80G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
               GX_FocusControl = edtavB2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV81B2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
            }
            else
            {
               AV81B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
            }
            A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
            n6018ProForFab = false ;
            A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte02_WP");
         AV117BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV117BarNHdr", AV117BarNHdr);
         forbiddenHiddens.add("BarNHdr", GXutil.rtrim( localUtil.format( AV117BarNHdr, "")));
         AV108BarAgrEst = httpContext.cgiGet( edtavBaragrest_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108BarAgrEst", AV108BarAgrEst);
         forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( AV108BarAgrEst, "@!")));
         AV142Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV142Pgmname", AV142Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV142Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetadetinte02_wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e281G42 ();
      if (returnInSub) return;
   }

   public void e281G42( )
   {
      /* Start Routine */
      returnInSub = false ;
      divTablelog_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablelog_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablelog_Visible), 5, 0), true);
      AV72UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72UsurCod", AV72UsurCod);
      GXt_char1 = AV73Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte02_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV73Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Station", AV73Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      GXv_char2[0] = AV48Emprcod ;
      GXv_char3[0] = AV74EmprNom ;
      GXv_char4[0] = AV72UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV73Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char2[0] ;
      recetadetinte02_wp_impl.this.AV74EmprNom = GXv_char3[0] ;
      recetadetinte02_wp_impl.this.AV72UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV72UsurCod", AV72UsurCod);
      GXt_int5 = (byte)(AV136FlagStdp) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV48Emprcod, httpContext.getMessage( "RECSTD", ""), GXv_int6) ;
      recetadetinte02_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV136FlagStdp = GXt_int5 ;
      GXt_int5 = (byte)(AV137RecipeTinte) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV48Emprcod, httpContext.getMessage( "RCPTTE", ""), GXv_int6) ;
      recetadetinte02_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV137RecipeTinte = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137RecipeTinte", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137RecipeTinte), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV137RecipeTinte), "ZZZ9")));
      GXt_int5 = (byte)(AV92Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV48Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      recetadetinte02_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV92Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92Carvitin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV92Carvitin), "ZZZ9")));
      GXt_int5 = (byte)(AV127Automata) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV48Emprcod, httpContext.getMessage( "AUTOMA", ""), GXv_int6) ;
      recetadetinte02_wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV127Automata = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127Automata", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV127Automata), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV127Automata), "ZZZ9")));
      AV93Modif = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Modif", AV93Modif);
      AV123Modo = Gx_mode ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123Modo", AV123Modo);
      AV117BarNHdr = GXutil.trim( GXutil.str( AV52Barcod, 8, 0)) + "-" + GXutil.str( AV49Barcodreo, 1, 0) + AV50Barcodpar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV117BarNHdr", AV117BarNHdr);
      GXt_char1 = AV73Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetadetinte02_wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV73Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Station", AV73Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      GXv_char4[0] = AV48Emprcod ;
      GXv_char3[0] = AV74EmprNom ;
      GXv_char2[0] = AV72UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV73Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char4[0] ;
      recetadetinte02_wp_impl.this.AV74EmprNom = GXv_char3[0] ;
      recetadetinte02_wp_impl.this.AV72UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV72UsurCod", AV72UsurCod);
      divUnnamedtable5_Height = 20 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable5_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable5_Height), 9, 0), true);
      divUnnamedtable3_Height = 20 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Height), 9, 0), true);
      Popover_baragrest_Iteminternalname = edtavBaragrest_Internalname ;
      ucPopover_baragrest.sendProperty(context, "", false, Popover_baragrest_Internalname, "ItemInternalName", Popover_baragrest_Iteminternalname);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMAQCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if (returnInSub) return;
      edtavClicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), true);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Receta de Tinte (Mto)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      /* Using cursor H01G46 */
      pr_default.execute(2, new Object[] {AV48Emprcod, Integer.valueOf(AV52Barcod), Byte.valueOf(AV49Barcodreo), AV50Barcodpar, Short.valueOf(AV51RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2804RecLinMaq = H01G46_A2804RecLinMaq[0] ;
         A130BarCodPar = H01G46_A130BarCodPar[0] ;
         A132BarCodReo = H01G46_A132BarCodReo[0] ;
         A129BarCod = H01G46_A129BarCod[0] ;
         A396EmprCod = H01G46_A396EmprCod[0] ;
         A602MaqCod = H01G46_A602MaqCod[0] ;
         A2805RecVolPrd = H01G46_A2805RecVolPrd[0] ;
         A2806RecFA = H01G46_A2806RecFA[0] ;
         A5110RecNumPrg = H01G46_A5110RecNumPrg[0] ;
         A252CliCod = H01G46_A252CliCod[0] ;
         n252CliCod = H01G46_n252CliCod[0] ;
         A279CliNom = H01G46_A279CliNom[0] ;
         A212BarSer = H01G46_A212BarSer[0] ;
         A135BarColNom = H01G46_A135BarColNom[0] ;
         A136BarColNum = H01G46_A136BarColNum[0] ;
         A218BarTipCol = H01G46_A218BarTipCol[0] ;
         A120BarAgrEst = H01G46_A120BarAgrEst[0] ;
         A184BarMtr = H01G46_A184BarMtr[0] ;
         A870BarTotMtr = H01G46_A870BarTotMtr[0] ;
         A166BarKgm = H01G46_A166BarKgm[0] ;
         A219BarTotAgr = H01G46_A219BarTotAgr[0] ;
         A252CliCod = H01G46_A252CliCod[0] ;
         n252CliCod = H01G46_n252CliCod[0] ;
         A212BarSer = H01G46_A212BarSer[0] ;
         A135BarColNom = H01G46_A135BarColNom[0] ;
         A136BarColNum = H01G46_A136BarColNum[0] ;
         A218BarTipCol = H01G46_A218BarTipCol[0] ;
         A120BarAgrEst = H01G46_A120BarAgrEst[0] ;
         A279CliNom = H01G46_A279CliNom[0] ;
         A870BarTotMtr = H01G46_A870BarTotMtr[0] ;
         A219BarTotAgr = H01G46_A219BarTotAgr[0] ;
         A184BarMtr = H01G46_A184BarMtr[0] ;
         A166BarKgm = H01G46_A166BarKgm[0] ;
         if ( A870BarTotMtr.doubleValue() != 0 )
         {
            A871RecTotMtr = A870BarTotMtr.add(A184BarMtr) ;
            httpContext.ajax_rsp_assign_attri("", false, "A871RecTotMtr", GXutil.ltrimstr( A871RecTotMtr, 10, 2));
         }
         else
         {
            A871RecTotMtr = A184BarMtr ;
            httpContext.ajax_rsp_assign_attri("", false, "A871RecTotMtr", GXutil.ltrimstr( A871RecTotMtr, 10, 2));
         }
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         AV53MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53MaqCod", AV53MaqCod);
         AV70MaqcodOld = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70MaqcodOld", AV70MaqcodOld);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70MaqcodOld, ""))));
         /* Execute user subroutine: 'MAQUIN' */
         S163 ();
         if ( returnInSub )
         {
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            pr_default.close(2);
            returnInSub = true;
            if (true) return;
         }
         AV66BarVolMaq = A2805RecVolPrd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarVolMaq), 5, 0));
         AV71BarVolMaqOld = A2805RecVolPrd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71BarVolMaqOld", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71BarVolMaqOld), 5, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV71BarVolMaqOld), "ZZZZ9")));
         AV64Rb = ((A812RecTotKgm.doubleValue()>0) ? DecimalUtil.doubleToDec(A2805RecVolPrd).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64Rb", GXutil.ltrimstr( AV64Rb, 6, 2));
         AV63RecfaIN = A2806RecFA ;
         AV65RecNumPrgIN = A5110RecNumPrg ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65RecNumPrgIN", AV65RecNumPrgIN);
         AV120RecNumPrgold = A5110RecNumPrg ;
         httpContext.ajax_rsp_assign_attri("", false, "AV120RecNumPrgold", AV120RecNumPrgold);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV120RecNumPrgold, ""))));
         AV84RecTotKgm = A812RecTotKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84RecTotKgm", GXutil.ltrimstr( AV84RecTotKgm, 10, 2));
         AV106RecTotMtr = A871RecTotMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV106RecTotMtr", GXutil.ltrimstr( AV106RecTotMtr, 10, 2));
         AV85RecTotKgs = AV84RecTotKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85RecTotKgs", GXutil.ltrimstr( AV85RecTotKgs, 10, 2));
         AV94CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94CliCod), 6, 0));
         AV95CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95CliNom", AV95CliNom);
         AV96BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV96BarSer", AV96BarSer);
         AV97BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV97BarColNom", AV97BarColNom);
         AV98BarColNum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98BarColNum), 6, 0));
         AV99BarTipCol = A218BarTipCol ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99BarTipCol), 2, 0));
         AV108BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108BarAgrEst", AV108BarAgrEst);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      Combo_maqcod_Selectedvalue_set = AV53MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
      AV68RecFA = AV63RecfaIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68RecFA", GXutil.ltrimstr( AV68RecFA, 6, 2));
      imgPromptagrupada_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPromptagrupada_Internalname, "gximage", imgPromptagrupada_gximage, true);
      AV138Promptagrupada = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      AV144Promptagrupada_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      Popover_baragrest_Popoverwidth = 665 ;
      ucPopover_baragrest.sendProperty(context, "", false, Popover_baragrest_Internalname, "PopoverWidth", GXutil.ltrimstr( DecimalUtil.doubleToDec(Popover_baragrest_Popoverwidth), 9, 0));
      lblStyle_Caption = lblStyle_Caption+httpContext.getMessage( "<style id=\"dtpopover\">", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblStyle_Internalname, "Caption", lblStyle_Caption, true);
      lblStyle_Caption = lblStyle_Caption+httpContext.getMessage( "div.popover {", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblStyle_Internalname, "Caption", lblStyle_Caption, true);
      lblStyle_Caption = lblStyle_Caption+httpContext.getMessage( "   min-width: 40vw !important;", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblStyle_Internalname, "Caption", lblStyle_Caption, true);
      lblStyle_Caption = lblStyle_Caption+" }" ;
      httpContext.ajax_rsp_assign_prop("", false, lblStyle_Internalname, "Caption", lblStyle_Caption, true);
      lblStyle_Caption = lblStyle_Caption+httpContext.getMessage( "</style>", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblStyle_Internalname, "Caption", lblStyle_Caption, true);
   }

   public void e291G42( )
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
      S172 ();
      if (returnInSub) return;
      cmbavGrupodeaccionesgrid.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeaccionesgrid.getInternalname(), "Columnheaderclass", cmbavGrupodeaccionesgrid.getColumnHeaderClass(), !bGXsfl_187_Refreshing);
      edtRecLinPro_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Columnheaderclass", edtRecLinPro_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtProForCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Columnheaderclass", edtProForCod_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtProForDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Columnheaderclass", edtProForDsc_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtRecLin_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Columnheaderclass", edtRecLin_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtRecPrdNum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Columnheaderclass", edtRecPrdNum_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtRecPrdDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Columnheaderclass", edtRecPrdDsc_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtFacCon_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Columnheaderclass", edtFacCon_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtPrdCant_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Columnheaderclass", edtPrdCant_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtForPrdDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Columnheaderclass", edtForPrdDsc_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtRecForNro_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Columnheaderclass", edtRecForNro_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtRecPrdTnq_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Columnheaderclass", edtRecPrdTnq_Columnheaderclass, !bGXsfl_187_Refreshing);
      edtRecLote_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Columnheaderclass", edtRecLote_Columnheaderclass, !bGXsfl_187_Refreshing);
      if ( ( AV100Procesosdadosdealta > 0 ) || ( AV122CambioPrograma == 1 ) )
      {
         AV116ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
         AV116ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
         AV116ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
         AV116ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
         AV116ProgressIndicator.show();
         AV116ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
         GXv_char4[0] = AV48Emprcod ;
         GXv_int10[0] = AV52Barcod ;
         GXv_int6[0] = AV49Barcodreo ;
         GXv_char3[0] = AV50Barcodpar ;
         GXv_int11[0] = AV51RecLinMaq ;
         GXv_char2[0] = AV104RecetasTinteProcesosQuimicosToJson ;
         new app.recetadetinte02_prc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int11, GXv_char2) ;
         recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char4[0] ;
         recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
         recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int6[0] ;
         recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char3[0] ;
         recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int11[0] ;
         recetadetinte02_wp_impl.this.AV104RecetasTinteProcesosQuimicosToJson = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV104RecetasTinteProcesosQuimicosToJson", AV104RecetasTinteProcesosQuimicosToJson);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV104RecetasTinteProcesosQuimicosToJson, ""))));
         GXv_char4[0] = AV48Emprcod ;
         GXv_int10[0] = AV52Barcod ;
         GXv_int6[0] = AV49Barcodreo ;
         GXv_char3[0] = AV50Barcodpar ;
         GXv_int11[0] = AV51RecLinMaq ;
         new app.eliminarrecetasincambiodesituacion(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int11) ;
         recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char4[0] ;
         recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
         recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int6[0] ;
         recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char3[0] ;
         recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
         GXv_char4[0] = AV48Emprcod ;
         GXv_int10[0] = AV52Barcod ;
         GXv_int6[0] = AV49Barcodreo ;
         GXv_char3[0] = AV50Barcodpar ;
         GXv_int11[0] = AV51RecLinMaq ;
         new app.pdelrec3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int11) ;
         recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char4[0] ;
         recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
         recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int6[0] ;
         recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char3[0] ;
         recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
         AV90Inc_obs = ((AV100Procesosdadosdealta>0) ? httpContext.getMessage( "Receta Tinte, eliminada por cambios en procesos quimicos", "") : httpContext.getMessage( "Receta Tinte, eliminada por cambio de Nº programa", "")) ;
         new app.pctrinc(remoteHandle, context).execute( AV48Emprcod, GXutil.substring( AV142Pgmname, 1, 10), AV72UsurCod, AV73Station, AV90Inc_obs, AV52Barcod, AV49Barcodreo, AV50Barcodpar) ;
         /* Execute user subroutine: 'VOLVERACREARRECETA' */
         S182 ();
         if (returnInSub) return;
         AV116ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
         AV116ProgressIndicator.hide();
         AV93Modif = "Y" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Modif", AV93Modif);
         AV100Procesosdadosdealta = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100Procesosdadosdealta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Procesosdadosdealta), 4, 0));
         lblLog_Caption = ((AV122CambioPrograma==1) ? httpContext.getMessage( "Atencion. Cambio de Programa, se elimina la receta y se vuelve a lazar.Se volvera a enviar al automata!", "") : httpContext.getMessage( "Atencion.Se ha vuelto a crear la receta. Se volvera a enviar al automata!", "")) ;
         httpContext.ajax_rsp_assign_prop("", false, lblLog_Internalname, "Caption", lblLog_Caption, true);
      }
      if ( AV126Procesoseliminados > 0 )
      {
         lblLog_Caption = httpContext.getMessage( "Atencion.Se han eliminado, Procesos. Se volvera a enviar al automata!", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblLog_Internalname, "Caption", lblLog_Caption, true);
         AV93Modif = httpContext.getMessage( "Y", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Modif", AV93Modif);
         AV126Procesoseliminados = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV126Procesoseliminados", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV126Procesoseliminados), 4, 0));
      }
      AV145Recetadetinte02_wpds_1_tfreclinpro = AV24TFRecLinPro ;
      AV146Recetadetinte02_wpds_2_tfreclinpro_to = AV25TFRecLinPro_To ;
      AV147Recetadetinte02_wpds_3_tfproforcod = AV86TFProForCod ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = AV87TFProForCod_Sel ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = AV88TFProForDsc ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = AV89TFProForDsc_Sel ;
      AV151Recetadetinte02_wpds_7_tfreclin = AV26TFRecLin ;
      AV152Recetadetinte02_wpds_8_tfreclin_to = AV27TFRecLin_To ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = AV28TFRecPrdNum ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = AV29TFRecPrdNum_Sel ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = AV82TFRecPrdDsc ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = AV83TFRecPrdDsc_Sel ;
      AV157Recetadetinte02_wpds_13_tffaccon = AV34TFFacCon ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = AV35TFFacCon_To ;
      AV159Recetadetinte02_wpds_15_tfprdcant = AV36TFPrdCant ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = AV37TFPrdCant_To ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = AV32TFForPrdDsc ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = AV33TFForPrdDsc_Sel ;
      AV163Recetadetinte02_wpds_19_tfrecfornro = AV38TFRecForNro ;
      AV164Recetadetinte02_wpds_20_tfrecfornro_to = AV39TFRecForNro_To ;
      AV165Recetadetinte02_wpds_21_tfrecprdtnq = AV40TFRecPrdTnq ;
      AV166Recetadetinte02_wpds_22_tfrecprdtnq_to = AV41TFRecPrdTnq_To ;
      AV167Recetadetinte02_wpds_23_tfreclote = AV42TFRecLote ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = AV43TFRecLote_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e151G42( )
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
         S152 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLinPro") == 0 )
         {
            AV24TFRecLinPro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFRecLinPro), 2, 0));
            AV25TFRecLinPro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCod") == 0 )
         {
            AV86TFProForCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFProForCod", AV86TFProForCod);
            AV87TFProForCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFProForCod_Sel", AV87TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDsc") == 0 )
         {
            AV88TFProForDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFProForDsc", AV88TFProForDsc);
            AV89TFProForDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFProForDsc_Sel", AV89TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLin") == 0 )
         {
            AV26TFRecLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFRecLin), 4, 0));
            AV27TFRecLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdNum") == 0 )
         {
            AV28TFRecPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFRecPrdNum", AV28TFRecPrdNum);
            AV29TFRecPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFRecPrdNum_Sel", AV29TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdDsc") == 0 )
         {
            AV82TFRecPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFRecPrdDsc", AV82TFRecPrdDsc);
            AV83TFRecPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFRecPrdDsc_Sel", AV83TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacCon") == 0 )
         {
            AV34TFFacCon = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFacCon", GXutil.ltrimstr( AV34TFFacCon, 11, 5));
            AV35TFFacCon_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFFacCon_To", GXutil.ltrimstr( AV35TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCant") == 0 )
         {
            AV36TFPrdCant = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrdCant", GXutil.ltrimstr( AV36TFPrdCant, 11, 3));
            AV37TFPrdCant_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrdCant_To", GXutil.ltrimstr( AV37TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV32TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFForPrdDsc", AV32TFForPrdDsc);
            AV33TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForPrdDsc_Sel", AV33TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecForNro") == 0 )
         {
            AV38TFRecForNro = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFRecForNro), 2, 0));
            AV39TFRecForNro_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecPrdTnq") == 0 )
         {
            AV40TFRecPrdTnq = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFRecPrdTnq), 2, 0));
            AV41TFRecPrdTnq_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFRecPrdTnq_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecLote") == 0 )
         {
            AV42TFRecLote = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFRecLote", AV42TFRecLote);
            AV43TFRecLote_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFRecLote_Sel", AV43TFRecLote_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e301G42( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeaccionesgrid.removeAllItems();
      cmbavGrupodeaccionesgrid.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGrupodeaccionesgrid.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Proceso", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGrupodeaccionesgrid.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar Proceso v02", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      AV75PrdRGB = ((A13232PrdRGB==0) ? 16777215 : A13232PrdRGB) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PrdRGB), 10, 0));
      GXv_int11[0] = AV76R ;
      GXv_int12[0] = AV77G ;
      GXv_int13[0] = AV78B ;
      GXv_int14[0] = AV79R2 ;
      GXv_int15[0] = AV80G2 ;
      GXv_int16[0] = AV81B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV75PrdRGB, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16) ;
      recetadetinte02_wp_impl.this.AV76R = GXv_int11[0] ;
      recetadetinte02_wp_impl.this.AV77G = GXv_int12[0] ;
      recetadetinte02_wp_impl.this.AV78B = GXv_int13[0] ;
      recetadetinte02_wp_impl.this.AV79R2 = GXv_int14[0] ;
      recetadetinte02_wp_impl.this.AV80G2 = GXv_int15[0] ;
      recetadetinte02_wp_impl.this.AV81B2 = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76R), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77G), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78B), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79R2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80G2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81B2), 3, 0));
      edtRecPrdDsc_Backcolor = GXutil.getColor( AV76R, AV77G, AV78B) ;
      edtRecPrdDsc_Forecolor = GXutil.getColor( AV79R2, AV80G2, AV81B2) ;
      cmbavGrupodeaccionesgrid.setColumnClass( ((A4024RecMar==1) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtRecLinPro_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtProForCod_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtProForDsc_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtRecLin_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtRecPrdNum_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtRecPrdDsc_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtFacCon_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtPrdCant_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtForPrdDsc_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtRecForNro_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtRecPrdTnq_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtRecLote_Columnclass = ((A4024RecMar==1) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(187) ;
      }
      sendrow_1872( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_187_Refreshing )
      {
         httpContext.doAjaxLoad(187, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV111GrupodeaccionesGrid, 4, 0)) );
   }

   public void e311G42( )
   {
      /* Grupodeaccionesgrid_Click Routine */
      returnInSub = false ;
      if ( AV111GrupodeaccionesGrid == 1 )
      {
         /* Execute user subroutine: 'DO ELIMIMARPROCESO' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV111GrupodeaccionesGrid == 2 )
      {
         /* Execute user subroutine: 'DO MODIFICARPROCESOV02' */
         S202 ();
         if (returnInSub) return;
      }
      AV111GrupodeaccionesGrid = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111GrupodeaccionesGrid), 4, 0));
      /*  Sending Event outputs  */
      cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV111GrupodeaccionesGrid, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeaccionesgrid.getInternalname(), "Values", cmbavGrupodeaccionesgrid.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e161G42( )
   {
      /* Dvelop_confirmpanel_elimimarproceso_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_elimimarproceso_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMIMARPROCESO' */
         S212 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e171G42( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e271G42( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      if ( AV137RecipeTinte == 1 )
      {
         httpContext.popup(formatLink("app.ptintrecipe", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV53MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV91BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(1,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Copias","Output"}) , new Object[] {"AV48Emprcod","AV52Barcod","AV49Barcodreo","AV50Barcodpar","AV53MaqCod","AV91BarSua","AV66BarVolMaq","AV51RecLinMaq","","",""});
      }
      else
      {
         httpContext.popup(formatLink("app.rrecstdp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV53MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV91BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Output"}) , new Object[] {"AV48Emprcod","AV52Barcod","AV49Barcodreo","AV50Barcodpar","AV53MaqCod","AV91BarSua","AV66BarVolMaq","AV51RecLinMaq","",""});
      }
      if ( AV92Carvitin == 1 )
      {
         httpContext.popup(formatLink("app.pinf2recetatinte", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","Output"}) , new Object[] {"AV48Emprcod","AV52Barcod","AV49Barcodreo","AV50Barcodpar","AV51RecLinMaq",""});
      }
      /*  Sending Event outputs  */
   }

   public void e181G42( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S232 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e191G42( )
   {
      /* Dvelop_confirmpanel_cerrar_Close Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
         {
            /* Execute user subroutine: 'DO ACTION CERRAR' */
            S242 ();
            if (returnInSub) return;
         }
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
      {
         if ( ( AV127Automata == 1 ) && ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) ) || ( ( GXutil.strcmp(AV93Modif, httpContext.getMessage( "Y", "")) == 0 ) ) )
         {
            if ( ( GXutil.strcmp(AV93Modif, httpContext.getMessage( "Y", "")) == 0 ) && ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) != 0 ) )
            {
               GXv_char4[0] = AV48Emprcod ;
               GXv_int10[0] = AV52Barcod ;
               GXv_int6[0] = AV49Barcodreo ;
               GXv_char3[0] = AV50Barcodpar ;
               GXv_int16[0] = AV51RecLinMaq ;
               GXv_int17[0] = (byte)(3) ;
               GXv_char2[0] = AV124FlagOpe ;
               GXv_char18[0] = AV125ErrMensajeautomata ;
               new app.pdyrp030(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int16, GXv_int17, GXv_char2, GXv_char18) ;
               recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char4[0] ;
               recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
               recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int6[0] ;
               recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char3[0] ;
               recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
               recetadetinte02_wp_impl.this.AV124FlagOpe = GXv_char2[0] ;
               recetadetinte02_wp_impl.this.AV125ErrMensajeautomata = GXv_char18[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV124FlagOpe", AV124FlagOpe);
            }
            GXv_char18[0] = AV48Emprcod ;
            GXv_int10[0] = AV52Barcod ;
            GXv_int17[0] = AV49Barcodreo ;
            GXv_char4[0] = AV50Barcodpar ;
            GXv_int16[0] = AV51RecLinMaq ;
            GXv_int6[0] = (byte)(1) ;
            GXv_char3[0] = AV124FlagOpe ;
            GXv_char2[0] = AV125ErrMensajeautomata ;
            new app.pdyrp030(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16, GXv_int6, GXv_char3, GXv_char2) ;
            recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
            recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
            recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
            recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
            recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
            recetadetinte02_wp_impl.this.AV124FlagOpe = GXv_char3[0] ;
            recetadetinte02_wp_impl.this.AV125ErrMensajeautomata = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV124FlagOpe", AV124FlagOpe);
         }
      }
      /* Execute user subroutine: 'DO ACTION CERRAR' */
      S242 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e201G42( )
   {
      /* 'DoAdd' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.recetadetinte06_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","Procesosdadosdealta"}) , new Object[] {"AV100Procesosdadosdealta"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e211G42( )
   {
      /* 'DoEliminarProcesos' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.recetadetinte04_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Reclinmaq","Procesoseliminados"}) , new Object[] {"AV126Procesoseliminados"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e221G42( )
   {
      /* 'DoCambiar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.recetadetinte05_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV65RecNumPrgIN)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarVolMaq,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV84RecTotKgm)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","RecNumPrg","RecVolPrd","Rectotkgm","CambioPrograma"}) , new Object[] {"AV65RecNumPrgIN","AV122CambioPrograma"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e141G42( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV53MaqCod = Combo_maqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53MaqCod", AV53MaqCod);
      /* Execute user subroutine: 'MAQUIN' */
      S163 ();
      if (returnInSub) return;
      if ( ( AV54Maquin == 1 ) && ( ( AV66BarVolMaq < AV57MaqVolMin ) || ( AV66BarVolMaq > AV56MaqVolMax ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
      }
      /*  Sending Event outputs  */
   }

   public void S152( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S192( )
   {
      /* 'DO ELIMIMARPROCESO' Routine */
      returnInSub = false ;
      Dvelop_confirmpanel_elimimarproceso_Confirmationtext = httpContext.getMessage( "¿Desea eliminar el Proceso ", "")+GXutil.trim( A764ProForCod)+" "+GXutil.trim( A766ProForDsc)+"?" ;
      ucDvelop_confirmpanel_elimimarproceso.sendProperty(context, "", false, Dvelop_confirmpanel_elimimarproceso_Internalname, "ConfirmationText", Dvelop_confirmpanel_elimimarproceso_Confirmationtext);
      AV169Emprcod_selected = A396EmprCod ;
      AV170Barcod_selected = A129BarCod ;
      AV171Barcodreo_selected = A132BarCodReo ;
      AV172Barcodpar_selected = A130BarCodPar ;
      AV173Reclinmaq_selected = A2804RecLinMaq ;
      AV174Reclinpro_selected = A1273RecLinPro ;
      AV175Reclin_selected = A811RecLin ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESOContainer", "Confirm", "", new Object[] {});
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMIMARPROCESO' Routine */
      returnInSub = false ;
      GXv_char18[0] = AV48Emprcod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int17[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int16[0] = A2804RecLinMaq ;
      GXv_int6[0] = A1273RecLinPro ;
      new app.pbajrecp(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16, GXv_int6) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.A129BarCod = GXv_int10[0] ;
      recetadetinte02_wp_impl.this.A132BarCodReo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.A130BarCodPar = GXv_char4[0] ;
      recetadetinte02_wp_impl.this.A2804RecLinMaq = GXv_int16[0] ;
      recetadetinte02_wp_impl.this.A1273RecLinPro = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      GXv_char18[0] = AV48Emprcod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int17[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int16[0] = A2804RecLinMaq ;
      GXv_char3[0] = AV72UsurCod ;
      new app.pusudatm(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16, GXv_char3) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.A129BarCod = GXv_int10[0] ;
      recetadetinte02_wp_impl.this.A132BarCodReo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.A130BarCodPar = GXv_char4[0] ;
      recetadetinte02_wp_impl.this.A2804RecLinMaq = GXv_int16[0] ;
      recetadetinte02_wp_impl.this.AV72UsurCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV72UsurCod", AV72UsurCod);
      GXv_char18[0] = AV48Emprcod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int17[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_int16[0] = A2804RecLinMaq ;
      new app.pfo0005(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.A129BarCod = GXv_int10[0] ;
      recetadetinte02_wp_impl.this.A132BarCodReo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.A130BarCodPar = GXv_char4[0] ;
      recetadetinte02_wp_impl.this.A2804RecLinMaq = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      AV93Modif = httpContext.getMessage( "Y", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Modif", AV93Modif);
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO MODIFICARPROCESOV02' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.recetadetinte90__wp", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A1273RecLinPro,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV84RecTotKgm)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarVolMaq,5,0)),GXutil.URLEncode(GXutil.formatDateParm(AV118FecPan)),GXutil.URLEncode(GXutil.rtrim(AV117BarNHdr)),GXutil.URLEncode(GXutil.rtrim(A766ProForDsc)),GXutil.URLEncode(GXutil.rtrim(A6018ProForFab)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","RecLinPro","TotKgs","Volumen","FecPan","Barnhdr","ProForDsc","Proforfab","modif2"}) , new Object[] {"AV93Modif"});
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char18[0] = AV48Emprcod ;
      GXv_int10[0] = AV52Barcod ;
      GXv_int17[0] = AV49Barcodreo ;
      GXv_char4[0] = AV50Barcodpar ;
      GXv_int16[0] = AV51RecLinMaq ;
      new app.pbajrec(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
      recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
      recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
      GXv_char18[0] = AV48Emprcod ;
      GXv_int10[0] = AV52Barcod ;
      GXv_int17[0] = AV49Barcodreo ;
      GXv_char4[0] = AV50Barcodpar ;
      GXv_int16[0] = AV51RecLinMaq ;
      new app.pdelrec3(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
      recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
      recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
      if ( AV127Automata == 1 )
      {
         GXv_char18[0] = AV48Emprcod ;
         GXv_int10[0] = AV52Barcod ;
         GXv_int17[0] = AV49Barcodreo ;
         GXv_char4[0] = AV50Barcodpar ;
         GXv_int16[0] = AV51RecLinMaq ;
         GXv_int6[0] = (byte)(3) ;
         GXv_char3[0] = "" ;
         GXv_char2[0] = AV115ErrorMessage ;
         new app.pdyrp030(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16, GXv_int6, GXv_char3, GXv_char2) ;
         recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
         recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
         recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
         recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
         recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
         recetadetinte02_wp_impl.this.AV115ErrorMessage = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
      }
      AV90Inc_obs = httpContext.getMessage( "Receta Tinte, eliminada", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV48Emprcod, GXutil.substring( AV142Pgmname, 1, 10), AV72UsurCod, AV73Station, AV90Inc_obs, AV52Barcod, AV49Barcodreo, AV50Barcodpar) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S232( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S163 ();
      if (returnInSub) return;
      GXv_char18[0] = AV48Emprcod ;
      GXv_char4[0] = AV65RecNumPrgIN ;
      GXv_int17[0] = AV121Flag ;
      new app.pexprograma(remoteHandle, context).execute( GXv_char18, GXv_char4, GXv_int17) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.AV65RecNumPrgIN = GXv_char4[0] ;
      recetadetinte02_wp_impl.this.AV121Flag = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV65RecNumPrgIN", AV65RecNumPrgIN);
      httpContext.ajax_rsp_assign_attri("", false, "AV121Flag", GXutil.str( AV121Flag, 1, 0));
      if ( ! (GXutil.strcmp("", AV65RecNumPrgIN)==0) && (0==AV121Flag) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Programa Inexistente", ""));
         GX_FocusControl = edtavRecnumprgin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV92Carvitin == 1 ) && ( ( AV66BarVolMaq < AV57MaqVolMin ) || ( AV66BarVolMaq > AV56MaqVolMax ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
         }
         if ( (0==AV92Carvitin) && ( ( AV66BarVolMaq < AV57MaqVolMin ) || ( AV66BarVolMaq > AV56MaqVolMax ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Volumen fuera de rango", ""));
            GX_FocusControl = edtavBarvolmaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char18[0] = AV48Emprcod ;
            GXv_int10[0] = AV52Barcod ;
            GXv_int17[0] = AV49Barcodreo ;
            GXv_char4[0] = AV50Barcodpar ;
            GXv_int16[0] = AV51RecLinMaq ;
            GXv_char3[0] = AV53MaqCod ;
            GXv_int19[0] = AV66BarVolMaq ;
            GXv_decimal20[0] = AV68RecFA ;
            GXv_char2[0] = AV65RecNumPrgIN ;
            new app.prec1(remoteHandle, context).execute( GXv_char18, GXv_int10, GXv_int17, GXv_char4, GXv_int16, GXv_char3, GXv_int19, GXv_decimal20, GXv_char2) ;
            recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
            recetadetinte02_wp_impl.this.AV52Barcod = GXv_int10[0] ;
            recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
            recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
            recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
            recetadetinte02_wp_impl.this.AV53MaqCod = GXv_char3[0] ;
            recetadetinte02_wp_impl.this.AV66BarVolMaq = GXv_int19[0] ;
            recetadetinte02_wp_impl.this.AV68RecFA = GXv_decimal20[0] ;
            recetadetinte02_wp_impl.this.AV65RecNumPrgIN = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV53MaqCod", AV53MaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV66BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarVolMaq), 5, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV68RecFA", GXutil.ltrimstr( AV68RecFA, 6, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV65RecNumPrgIN", AV65RecNumPrgIN);
            if ( ( GXutil.strcmp(AV53MaqCod, AV70MaqcodOld) != 0 ) || ( AV66BarVolMaq != AV71BarVolMaqOld ) )
            {
               GXv_char18[0] = AV48Emprcod ;
               GXv_int19[0] = AV52Barcod ;
               GXv_int17[0] = AV49Barcodreo ;
               GXv_char4[0] = AV50Barcodpar ;
               GXv_int16[0] = AV51RecLinMaq ;
               GXv_decimal20[0] = AV84RecTotKgm ;
               GXv_int10[0] = AV66BarVolMaq ;
               new app.precrtn2(remoteHandle, context).execute( GXv_char18, GXv_int19, GXv_int17, GXv_char4, GXv_int16, GXv_decimal20, GXv_int10) ;
               recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
               recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
               recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
               recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
               recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
               recetadetinte02_wp_impl.this.AV84RecTotKgm = GXv_decimal20[0] ;
               recetadetinte02_wp_impl.this.AV66BarVolMaq = GXv_int10[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV84RecTotKgm", GXutil.ltrimstr( AV84RecTotKgm, 10, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV66BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarVolMaq), 5, 0));
            }
            GXv_char18[0] = AV48Emprcod ;
            GXv_int19[0] = AV52Barcod ;
            GXv_int17[0] = AV49Barcodreo ;
            GXv_char4[0] = AV50Barcodpar ;
            GXv_int16[0] = AV51RecLinMaq ;
            GXv_char3[0] = AV72UsurCod ;
            new app.pusudatm(remoteHandle, context).execute( GXv_char18, GXv_int19, GXv_int17, GXv_char4, GXv_int16, GXv_char3) ;
            recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
            recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
            recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
            recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
            recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
            recetadetinte02_wp_impl.this.AV72UsurCod = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV72UsurCod", AV72UsurCod);
            if ( ( AV127Automata == 1 ) && ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) ) || ( ( GXutil.strcmp(AV93Modif, httpContext.getMessage( "Y", "")) == 0 ) ) )
            {
               if ( ( GXutil.strcmp(AV93Modif, httpContext.getMessage( "Y", "")) == 0 ) && ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) != 0 ) )
               {
                  GXv_char18[0] = AV48Emprcod ;
                  GXv_int19[0] = AV52Barcod ;
                  GXv_int17[0] = AV49Barcodreo ;
                  GXv_char4[0] = AV50Barcodpar ;
                  GXv_int16[0] = AV51RecLinMaq ;
                  GXv_int6[0] = (byte)(3) ;
                  GXv_char3[0] = AV124FlagOpe ;
                  GXv_char2[0] = AV125ErrMensajeautomata ;
                  new app.pdyrp030(remoteHandle, context).execute( GXv_char18, GXv_int19, GXv_int17, GXv_char4, GXv_int16, GXv_int6, GXv_char3, GXv_char2) ;
                  recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
                  recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
                  recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
                  recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
                  recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
                  recetadetinte02_wp_impl.this.AV124FlagOpe = GXv_char3[0] ;
                  recetadetinte02_wp_impl.this.AV125ErrMensajeautomata = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV124FlagOpe", AV124FlagOpe);
               }
               GXv_char18[0] = AV48Emprcod ;
               GXv_int19[0] = AV52Barcod ;
               GXv_int17[0] = AV49Barcodreo ;
               GXv_char4[0] = AV50Barcodpar ;
               GXv_int16[0] = AV51RecLinMaq ;
               GXv_int6[0] = (byte)(1) ;
               GXv_char3[0] = AV124FlagOpe ;
               GXv_char2[0] = AV125ErrMensajeautomata ;
               new app.pdyrp030(remoteHandle, context).execute( GXv_char18, GXv_int19, GXv_int17, GXv_char4, GXv_int16, GXv_int6, GXv_char3, GXv_char2) ;
               recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char18[0] ;
               recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
               recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
               recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char4[0] ;
               recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
               recetadetinte02_wp_impl.this.AV124FlagOpe = GXv_char3[0] ;
               recetadetinte02_wp_impl.this.AV125ErrMensajeautomata = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV124FlagOpe", AV124FlagOpe);
            }
            if ( AV137RecipeTinte == 1 )
            {
               httpContext.popup(formatLink("app.ptintrecipe", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV53MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV91BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(1,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Copias","Output"}) , new Object[] {"AV48Emprcod","AV52Barcod","AV49Barcodreo","AV50Barcodpar","AV53MaqCod","AV91BarSua","AV66BarVolMaq","AV51RecLinMaq","","",""});
            }
            else
            {
               httpContext.popup(formatLink("app.rrecstdp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV48Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV52Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV49Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV50Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV53MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV91BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV66BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Output"}) , new Object[] {"AV48Emprcod","AV52Barcod","AV49Barcodreo","AV50Barcodpar","AV53MaqCod","AV91BarSua","AV66BarVolMaq","AV51RecLinMaq","",""});
            }
            httpContext.setWebReturnParms(new Object[] {});
            httpContext.setWebReturnParmsMetadata(new Object[] {});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
   }

   public void S242( )
   {
      /* 'DO ACTION CERRAR' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV142Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV142Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV142Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if (returnInSub) return;
      AV176GXV1 = 1 ;
      while ( AV176GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV176GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLINPRO") == 0 )
         {
            AV24TFRecLinPro = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFRecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFRecLinPro), 2, 0));
            AV25TFRecLinPro_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFRecLinPro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFRecLinPro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV86TFProForCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86TFProForCod", AV86TFProForCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV87TFProForCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87TFProForCod_Sel", AV87TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV88TFProForDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFProForDsc", AV88TFProForDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV89TFProForDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFProForDsc_Sel", AV89TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECLIN") == 0 )
         {
            AV26TFRecLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFRecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFRecLin), 4, 0));
            AV27TFRecLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFRecLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFRecLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM") == 0 )
         {
            AV28TFRecPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFRecPrdNum", AV28TFRecPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDNUM_SEL") == 0 )
         {
            AV29TFRecPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFRecPrdNum_Sel", AV29TFRecPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC") == 0 )
         {
            AV82TFRecPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82TFRecPrdDsc", AV82TFRecPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDDSC_SEL") == 0 )
         {
            AV83TFRecPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83TFRecPrdDsc_Sel", AV83TFRecPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACCON") == 0 )
         {
            AV34TFFacCon = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFFacCon", GXutil.ltrimstr( AV34TFFacCon, 11, 5));
            AV35TFFacCon_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFFacCon_To", GXutil.ltrimstr( AV35TFFacCon_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANT") == 0 )
         {
            AV36TFPrdCant = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrdCant", GXutil.ltrimstr( AV36TFPrdCant, 11, 3));
            AV37TFPrdCant_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrdCant_To", GXutil.ltrimstr( AV37TFPrdCant_To, 11, 3));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV32TFForPrdDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFForPrdDsc", AV32TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV33TFForPrdDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForPrdDsc_Sel", AV33TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECFORNRO") == 0 )
         {
            AV38TFRecForNro = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFRecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFRecForNro), 2, 0));
            AV39TFRecForNro_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFRecForNro_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39TFRecForNro_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECPRDTNQ") == 0 )
         {
            AV40TFRecPrdTnq = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFRecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40TFRecPrdTnq), 2, 0));
            AV41TFRecPrdTnq_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFRecPrdTnq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41TFRecPrdTnq_To), 2, 0));
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
         AV176GXV1 = (int)(AV176GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char18[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV87TFProForCod_Sel)==0), AV87TFProForCod_Sel, GXv_char18) ;
      recetadetinte02_wp_impl.this.GXt_char1 = GXv_char18[0] ;
      GXt_char21 = "" ;
      GXv_char4[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFProForDsc_Sel)==0), AV89TFProForDsc_Sel, GXv_char4) ;
      recetadetinte02_wp_impl.this.GXt_char21 = GXv_char4[0] ;
      GXt_char22 = "" ;
      GXv_char3[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFRecPrdNum_Sel)==0), AV29TFRecPrdNum_Sel, GXv_char3) ;
      recetadetinte02_wp_impl.this.GXt_char22 = GXv_char3[0] ;
      GXt_char23 = "" ;
      GXv_char2[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV83TFRecPrdDsc_Sel)==0), AV83TFRecPrdDsc_Sel, GXv_char2) ;
      recetadetinte02_wp_impl.this.GXt_char23 = GXv_char2[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFForPrdDsc_Sel)==0), AV33TFForPrdDsc_Sel, GXv_char25) ;
      recetadetinte02_wp_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFRecLote_Sel)==0), AV43TFRecLote_Sel, GXv_char27) ;
      recetadetinte02_wp_impl.this.GXt_char26 = GXv_char27[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char21+"||"+GXt_char22+"|"+GXt_char23+"|||"+GXt_char24+"|||"+GXt_char26 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char26 = "" ;
      GXv_char27[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV86TFProForCod)==0), AV86TFProForCod, GXv_char27) ;
      recetadetinte02_wp_impl.this.GXt_char26 = GXv_char27[0] ;
      GXt_char24 = "" ;
      GXv_char25[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFProForDsc)==0), AV88TFProForDsc, GXv_char25) ;
      recetadetinte02_wp_impl.this.GXt_char24 = GXv_char25[0] ;
      GXt_char23 = "" ;
      GXv_char18[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFRecPrdNum)==0), AV28TFRecPrdNum, GXv_char18) ;
      recetadetinte02_wp_impl.this.GXt_char23 = GXv_char18[0] ;
      GXt_char22 = "" ;
      GXv_char4[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV82TFRecPrdDsc)==0), AV82TFRecPrdDsc, GXv_char4) ;
      recetadetinte02_wp_impl.this.GXt_char22 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFForPrdDsc)==0), AV32TFForPrdDsc, GXv_char3) ;
      recetadetinte02_wp_impl.this.GXt_char21 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFRecLote)==0), AV42TFRecLote, GXv_char2) ;
      recetadetinte02_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV24TFRecLinPro) ? "" : GXutil.str( AV24TFRecLinPro, 2, 0))+"|"+GXt_char26+"|"+GXt_char24+"|"+((0==AV26TFRecLin) ? "" : GXutil.str( AV26TFRecLin, 4, 0))+"|"+GXt_char23+"|"+GXt_char22+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFFacCon)==0) ? "" : GXutil.str( AV34TFFacCon, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFPrdCant)==0) ? "" : GXutil.str( AV36TFPrdCant, 11, 3))+"|"+GXt_char21+"|"+((0==AV38TFRecForNro) ? "" : GXutil.str( AV38TFRecForNro, 2, 0))+"|"+((0==AV40TFRecPrdTnq) ? "" : GXutil.str( AV40TFRecPrdTnq, 2, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV25TFRecLinPro_To) ? "" : GXutil.str( AV25TFRecLinPro_To, 2, 0))+"|||"+((0==AV27TFRecLin_To) ? "" : GXutil.str( AV27TFRecLin_To, 4, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFFacCon_To)==0) ? "" : GXutil.str( AV35TFFacCon_To, 11, 5))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdCant_To)==0) ? "" : GXutil.str( AV37TFPrdCant_To, 11, 3))+"||"+((0==AV39TFRecForNro_To) ? "" : GXutil.str( AV39TFRecForNro_To, 2, 0))+"|"+((0==AV41TFRecPrdTnq_To) ? "" : GXutil.str( AV41TFRecPrdTnq_To, 2, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S172( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV142Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFRECLINPRO", "", !((0==AV24TFRecLinPro)&&(0==AV25TFRecLinPro_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFRecLinPro, 2, 0)), GXutil.trim( GXutil.str( AV25TFRecLinPro_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPROFORCOD", "", !(GXutil.strcmp("", AV86TFProForCod)==0), (short)(0), AV86TFProForCod, "", !(GXutil.strcmp("", AV87TFProForCod_Sel)==0), AV87TFProForCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPROFORDSC", "", !(GXutil.strcmp("", AV88TFProForDsc)==0), (short)(0), AV88TFProForDsc, "", !(GXutil.strcmp("", AV89TFProForDsc_Sel)==0), AV89TFProForDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFRECLIN", "", !((0==AV26TFRecLin)&&(0==AV27TFRecLin_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFRecLin, 4, 0)), GXutil.trim( GXutil.str( AV27TFRecLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFRECPRDNUM", "", !(GXutil.strcmp("", AV28TFRecPrdNum)==0), (short)(0), AV28TFRecPrdNum, "", !(GXutil.strcmp("", AV29TFRecPrdNum_Sel)==0), AV29TFRecPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFRECPRDDSC", "", !(GXutil.strcmp("", AV82TFRecPrdDsc)==0), (short)(0), AV82TFRecPrdDsc, "", !(GXutil.strcmp("", AV83TFRecPrdDsc_Sel)==0), AV83TFRecPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFFACCON", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFFacCon)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFFacCon_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV34TFFacCon, 11, 5)), GXutil.trim( GXutil.str( AV35TFFacCon_To, 11, 5))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFPRDCANT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFPrdCant)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV37TFPrdCant_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV36TFPrdCant, 11, 3)), GXutil.trim( GXutil.str( AV37TFPrdCant_To, 11, 3))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV32TFForPrdDsc)==0), (short)(0), AV32TFForPrdDsc, "", !(GXutil.strcmp("", AV33TFForPrdDsc_Sel)==0), AV33TFForPrdDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFRECFORNRO", "", !((0==AV38TFRecForNro)&&(0==AV39TFRecForNro_To)), (short)(0), GXutil.trim( GXutil.str( AV38TFRecForNro, 2, 0)), GXutil.trim( GXutil.str( AV39TFRecForNro_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFRECPRDTNQ", "", !((0==AV40TFRecPrdTnq)&&(0==AV41TFRecPrdTnq_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFRecPrdTnq, 2, 0)), GXutil.trim( GXutil.str( AV41TFRecPrdTnq_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      GXv_SdtWWPGridState28[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState28, "TFRECLOTE", "", !(GXutil.strcmp("", AV42TFRecLote)==0), (short)(0), AV42TFRecLote, "", !(GXutil.strcmp("", AV43TFRecLote_Sel)==0), AV43TFRecLote_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState28[0] ;
      if ( ! (GXutil.strcmp("", AV48Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV48Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV52Barcod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV52Barcod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV49Barcodreo) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODREO" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV49Barcodreo, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV50Barcodpar)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&BARCODPAR" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50Barcodpar );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV51RecLinMaq) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECLINMAQ" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV51RecLinMaq, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", Gx_mode)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MODE" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( Gx_mode );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV130varmsg)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&VARMSG" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV130varmsg );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV142Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV142Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LRECET" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( 1 == 0 ) ) )
      {
         divDvpanel_tablelog_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablelog_cell_Internalname, "Class", divDvpanel_tablelog_cell_Class, true);
      }
      else
      {
         divDvpanel_tablelog_cell_Class = "col-xs-12 CellMarginTop" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_tablelog_cell_Internalname, "Class", divDvpanel_tablelog_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV133MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle) ;
      /* Using cursor H01G47 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A623MaqVolMax = H01G47_A623MaqVolMax[0] ;
         n623MaqVolMax = H01G47_n623MaqVolMax[0] ;
         A602MaqCod = H01G47_A602MaqCod[0] ;
         A625MaqVolMin = H01G47_A625MaqVolMin[0] ;
         n625MaqVolMin = H01G47_n625MaqVolMin[0] ;
         A606MaqDsc = H01G47_A606MaqDsc[0] ;
         n606MaqDsc = H01G47_n606MaqDsc[0] ;
         AV134Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV134Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV134Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A602MaqCod)+"-"+GXutil.trim( A606MaqDsc)+httpContext.getMessage( " Vol. ", "")+GXutil.trim( GXutil.str( A623MaqVolMax, 5, 0))+"/"+GXutil.trim( GXutil.str( A625MaqVolMin, 5, 0)) );
         AV133MaqCod_Data.add(AV134Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV133MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV53MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void e321G42( )
   {
      /* 'DoEnvioAutomata' Routine */
      returnInSub = false ;
      AV115ErrorMessage = "" ;
      AV116ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV116ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV116ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
      AV116ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
      AV116ProgressIndicator.show();
      AV116ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
      AV116ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV116ProgressIndicator.hide();
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e231G42( )
   {
      /* Recnumprgin_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV65RecNumPrgIN)==0) )
      {
         GXv_char27[0] = AV48Emprcod ;
         GXv_char25[0] = AV65RecNumPrgIN ;
         GXv_int17[0] = AV121Flag ;
         new app.pexprograma(remoteHandle, context).execute( GXv_char27, GXv_char25, GXv_int17) ;
         recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char27[0] ;
         recetadetinte02_wp_impl.this.AV65RecNumPrgIN = GXv_char25[0] ;
         recetadetinte02_wp_impl.this.AV121Flag = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV65RecNumPrgIN", AV65RecNumPrgIN);
         httpContext.ajax_rsp_assign_attri("", false, "AV121Flag", GXutil.str( AV121Flag, 1, 0));
         if ( (0==AV121Flag) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Programa Inexistente", ""));
            GX_FocusControl = edtavRecnumprgin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV122CambioPrograma = (short)(((GXutil.strcmp(AV65RecNumPrgIN, AV120RecNumPrgold)==0) ? 0 : 1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122CambioPrograma), 4, 0));
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e241G42( )
   {
      /* Recnumprgin_Isvalid Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV65RecNumPrgIN)==0) )
      {
         GXv_char27[0] = AV48Emprcod ;
         GXv_char25[0] = AV65RecNumPrgIN ;
         GXv_int17[0] = AV121Flag ;
         new app.pexprograma(remoteHandle, context).execute( GXv_char27, GXv_char25, GXv_int17) ;
         recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char27[0] ;
         recetadetinte02_wp_impl.this.AV65RecNumPrgIN = GXv_char25[0] ;
         recetadetinte02_wp_impl.this.AV121Flag = GXv_int17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV65RecNumPrgIN", AV65RecNumPrgIN);
         httpContext.ajax_rsp_assign_attri("", false, "AV121Flag", GXutil.str( AV121Flag, 1, 0));
         if ( (0==AV121Flag) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Programa Inexistente", ""));
            GX_FocusControl = edtavRecnumprgin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV122CambioPrograma = (short)(((GXutil.strcmp(AV65RecNumPrgIN, AV120RecNumPrgold)==0) ? 0 : 1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV122CambioPrograma), 4, 0));
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV116ProgressIndicator", AV116ProgressIndicator);
   }

   public void e251G42( )
   {
      /* Maqcod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S163 ();
      if (returnInSub) return;
      if ( ( AV54Maquin == 1 ) && ( ( AV66BarVolMaq < AV57MaqVolMin ) || ( AV66BarVolMaq > AV56MaqVolMax ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e261G42( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S163 ();
      if (returnInSub) return;
      if ( ( AV54Maquin == 1 ) && ( ( AV66BarVolMaq < AV57MaqVolMin ) || ( AV66BarVolMaq > AV56MaqVolMax ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
      }
      /*  Sending Event outputs  */
   }

   public void S252( )
   {
      /* 'DO MODIFICARPROCESO2' Routine */
      returnInSub = false ;
   }

   public void S163( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV54Maquin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Maquin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Maquin), 4, 0));
      AV55MaqVolMed = 0 ;
      AV56MaqVolMax = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
      AV57MaqVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57MaqVolMin), 5, 0));
      AV58MaqRelban = (byte)(0) ;
      /* Using cursor H01G48 */
      pr_default.execute(4, new Object[] {AV48Emprcod, AV53MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = H01G48_A602MaqCod[0] ;
         A396EmprCod = H01G48_A396EmprCod[0] ;
         A624MaqVolMed = H01G48_A624MaqVolMed[0] ;
         n624MaqVolMed = H01G48_n624MaqVolMed[0] ;
         A623MaqVolMax = H01G48_A623MaqVolMax[0] ;
         n623MaqVolMax = H01G48_n623MaqVolMax[0] ;
         A625MaqVolMin = H01G48_A625MaqVolMin[0] ;
         n625MaqVolMin = H01G48_n625MaqVolMin[0] ;
         A3599MaqRelBan = H01G48_A3599MaqRelBan[0] ;
         n3599MaqRelBan = H01G48_n3599MaqRelBan[0] ;
         AV55MaqVolMed = A624MaqVolMed ;
         AV56MaqVolMax = A623MaqVolMax ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56MaqVolMax), 5, 0));
         AV57MaqVolMin = A625MaqVolMin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57MaqVolMin), 5, 0));
         AV58MaqRelban = A3599MaqRelBan ;
         AV54Maquin = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Maquin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54Maquin), 4, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S182( )
   {
      /* 'VOLVERACREARRECETA' Routine */
      returnInSub = false ;
      GXv_char27[0] = AV48Emprcod ;
      GXv_int19[0] = AV52Barcod ;
      GXv_int17[0] = AV49Barcodreo ;
      GXv_char25[0] = AV50Barcodpar ;
      GXv_char18[0] = AV65RecNumPrgIN ;
      GXv_decimal20[0] = AV68RecFA ;
      new app.pdyrp028(remoteHandle, context).execute( GXv_char27, GXv_int19, GXv_int17, GXv_char25, GXv_char18, GXv_decimal20) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char27[0] ;
      recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
      recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char25[0] ;
      recetadetinte02_wp_impl.this.AV65RecNumPrgIN = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.AV68RecFA = GXv_decimal20[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV65RecNumPrgIN", AV65RecNumPrgIN);
      httpContext.ajax_rsp_assign_attri("", false, "AV68RecFA", GXutil.ltrimstr( AV68RecFA, 6, 2));
      new app.pdyrp000(remoteHandle, context).execute( AV48Emprcod, AV52Barcod, AV49Barcodreo, AV50Barcodpar, AV51RecLinMaq, DecimalUtil.doubleToDec(0), AV84RecTotKgm, AV106RecTotMtr, AV66BarVolMaq, AV53MaqCod, AV65RecNumPrgIN, AV104RecetasTinteProcesosQuimicosToJson, AV73Station, Gx_mode) ;
      GXv_char27[0] = AV48Emprcod ;
      GXv_int19[0] = AV52Barcod ;
      GXv_int17[0] = AV49Barcodreo ;
      GXv_char25[0] = AV50Barcodpar ;
      GXv_int16[0] = AV51RecLinMaq ;
      new app.pdyrp013(remoteHandle, context).execute( GXv_char27, GXv_int19, GXv_int17, GXv_char25, GXv_int16) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char27[0] ;
      recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
      recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char25[0] ;
      recetadetinte02_wp_impl.this.AV51RecLinMaq = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
      GXv_char27[0] = AV48Emprcod ;
      GXv_int19[0] = AV52Barcod ;
      GXv_int17[0] = AV49Barcodreo ;
      GXv_char25[0] = AV50Barcodpar ;
      GXv_char18[0] = AV109BarMaqcod ;
      GXv_int10[0] = AV66BarVolMaq ;
      GXv_decimal20[0] = AV107Barfacabs ;
      new app.pdyrp014(remoteHandle, context).execute( GXv_char27, GXv_int19, GXv_int17, GXv_char25, GXv_char18, GXv_int10, GXv_decimal20) ;
      recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char27[0] ;
      recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
      recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
      recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char25[0] ;
      recetadetinte02_wp_impl.this.AV109BarMaqcod = GXv_char18[0] ;
      recetadetinte02_wp_impl.this.AV66BarVolMaq = GXv_int10[0] ;
      recetadetinte02_wp_impl.this.AV107Barfacabs = GXv_decimal20[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV109BarMaqcod", AV109BarMaqcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109BarMaqcod, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV66BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarVolMaq), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV107Barfacabs", GXutil.ltrimstr( AV107Barfacabs, 6, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV107Barfacabs, "ZZ9.99")));
      if ( GXutil.strcmp(AV108BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char27[0] = AV48Emprcod ;
         GXv_int19[0] = AV52Barcod ;
         GXv_int17[0] = AV49Barcodreo ;
         GXv_char25[0] = AV50Barcodpar ;
         GXv_char18[0] = AV109BarMaqcod ;
         GXv_int10[0] = AV66BarVolMaq ;
         new app.pdyrp015(remoteHandle, context).execute( GXv_char27, GXv_int19, GXv_int17, GXv_char25, GXv_char18, GXv_int10) ;
         recetadetinte02_wp_impl.this.AV48Emprcod = GXv_char27[0] ;
         recetadetinte02_wp_impl.this.AV52Barcod = GXv_int19[0] ;
         recetadetinte02_wp_impl.this.AV49Barcodreo = GXv_int17[0] ;
         recetadetinte02_wp_impl.this.AV50Barcodpar = GXv_char25[0] ;
         recetadetinte02_wp_impl.this.AV109BarMaqcod = GXv_char18[0] ;
         recetadetinte02_wp_impl.this.AV66BarVolMaq = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV109BarMaqcod", AV109BarMaqcod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV109BarMaqcod, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV66BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66BarVolMaq), 5, 0));
      }
   }

   public void wb_table5_251_1G42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_cerrar_Internalname, tblTabledvelop_confirmpanel_cerrar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_cerrar.setProperty("Title", Dvelop_confirmpanel_cerrar_Title);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmationText", Dvelop_confirmpanel_cerrar_Confirmationtext);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonCaption", Dvelop_confirmpanel_cerrar_Yesbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("NoButtonCaption", Dvelop_confirmpanel_cerrar_Nobuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_cerrar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_cerrar.setProperty("YesButtonPosition", Dvelop_confirmpanel_cerrar_Yesbuttonposition);
         ucDvelop_confirmpanel_cerrar.setProperty("ConfirmType", Dvelop_confirmpanel_cerrar_Confirmtype);
         ucDvelop_confirmpanel_cerrar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_cerrar_Internalname, "DVELOP_CONFIRMPANEL_CERRARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CERRARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_251_1G42e( true) ;
      }
      else
      {
         wb_table5_251_1G42e( false) ;
      }
   }

   public void wb_table4_246_1G42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_246_1G42e( true) ;
      }
      else
      {
         wb_table4_246_1G42e( false) ;
      }
   }

   public void wb_table3_241_1G42( boolean wbgen )
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
         wb_table3_241_1G42e( true) ;
      }
      else
      {
         wb_table3_241_1G42e( false) ;
      }
   }

   public void wb_table2_236_1G42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_elimimarproceso_Internalname, tblTabledvelop_confirmpanel_elimimarproceso_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_elimimarproceso.setProperty("Title", Dvelop_confirmpanel_elimimarproceso_Title);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("ConfirmationText", Dvelop_confirmpanel_elimimarproceso_Confirmationtext);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("YesButtonCaption", Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("NoButtonCaption", Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("CancelButtonCaption", Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("YesButtonPosition", Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition);
         ucDvelop_confirmpanel_elimimarproceso.setProperty("ConfirmType", Dvelop_confirmpanel_elimimarproceso_Confirmtype);
         ucDvelop_confirmpanel_elimimarproceso.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_elimimarproceso_Internalname, "DVELOP_CONFIRMPANEL_ELIMIMARPROCESOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMIMARPROCESOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_236_1G42e( true) ;
      }
      else
      {
         wb_table2_236_1G42e( false) ;
      }
   }

   public void wb_table1_146_1G42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedbaragrest_Internalname, tblTablemergedbaragrest_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaragrest_Internalname, httpContext.getMessage( "Hdr esta agrupada?", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_187_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaragrest_Internalname, GXutil.rtrim( AV108BarAgrEst), GXutil.rtrim( localUtil.format( AV108BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaragrest_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaragrest_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBaragrest_popoverimage_Internalname, httpContext.getMessage( "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>", ""), "", "", lblBaragrest_popoverimage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_RecetadeTinte02_WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_146_1G42e( true) ;
      }
      else
      {
         wb_table1_146_1G42e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV48Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Emprcod", AV48Emprcod);
      AV52Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52Barcod), 8, 0));
      AV49Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Barcodreo", GXutil.str( AV49Barcodreo, 1, 0));
      AV50Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Barcodpar", AV50Barcodpar);
      AV51RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51RecLinMaq), 4, 0));
      Gx_mode = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV130varmsg = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130varmsg", AV130varmsg);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVARMSG", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV130varmsg, ""))));
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
      pa1G42( ) ;
      ws1G42( ) ;
      we1G42( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614555", true, true);
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
      httpContext.AddJavascriptSource("recetadetinte02_wp.js", "?20268211614556", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1872( )
   {
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID_"+sGXsfl_187_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_187_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_187_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_187_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_187_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_187_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_187_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_187_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_187_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_187_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_187_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_187_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_187_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_187_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_187_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_187_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_187_idx ;
      edtRecManAut_Internalname = "RECMANAUT_"+sGXsfl_187_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_187_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_187_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_187_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_187_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_187_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_187_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_187_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_187_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_187_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_187_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_187_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_187_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_187_idx ;
   }

   public void subsflControlProps_fel_1872( )
   {
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID_"+sGXsfl_187_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_187_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_187_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_187_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_187_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_187_fel_idx ;
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_187_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_187_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_187_fel_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_187_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_187_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_187_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_187_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_187_fel_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_187_fel_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_187_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_187_fel_idx ;
      edtRecManAut_Internalname = "RECMANAUT_"+sGXsfl_187_fel_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_187_fel_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_187_fel_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_187_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_187_fel_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_187_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_187_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_187_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_187_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_187_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_187_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_187_fel_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_187_fel_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_187_fel_idx ;
   }

   public void sendrow_1872( )
   {
      subsflControlProps_1872( ) ;
      wb1G40( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_187_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_187_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_187_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeaccionesgrid.getEnabled()!=0)&&(cmbavGrupodeaccionesgrid.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 188,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         if ( ( cmbavGrupodeaccionesgrid.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONESGRID_" + sGXsfl_187_idx ;
            cmbavGrupodeaccionesgrid.setName( GXCCtl );
            cmbavGrupodeaccionesgrid.setWebtags( "" );
            if ( cmbavGrupodeaccionesgrid.getItemCount() > 0 )
            {
               AV111GrupodeaccionesGrid = (short)(GXutil.lval( cmbavGrupodeaccionesgrid.getValidValue(GXutil.trim( GXutil.str( AV111GrupodeaccionesGrid, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111GrupodeaccionesGrid), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeaccionesgrid,cmbavGrupodeaccionesgrid.getInternalname(),GXutil.trim( GXutil.str( AV111GrupodeaccionesGrid, 4, 0)),Integer.valueOf(1),cmbavGrupodeaccionesgrid.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRUPODEACCIONESGRID.CLICK."+sGXsfl_187_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGrupodeaccionesgrid.getColumnClass(),cmbavGrupodeaccionesgrid.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeaccionesgrid.getEnabled()!=0)&&(cmbavGrupodeaccionesgrid.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,188);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeaccionesgrid.setValue( GXutil.trim( GXutil.str( AV111GrupodeaccionesGrid, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGrupodeaccionesgrid.getInternalname(), "Values", cmbavGrupodeaccionesgrid.ToJavascriptSource(), !bGXsfl_187_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecLinPro_Columnclass,edtRecLinPro_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProForCod_Columnclass,edtProForCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProForDsc_Columnclass,edtProForDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecLin_Columnclass,edtRecLin_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecPrdNum_Columnclass,edtRecPrdNum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Forecolor)+";"+((edtRecPrdDsc_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+";"),ROClassString,edtRecPrdDsc_Columnclass,edtRecPrdDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A431FacCon, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFacCon_Columnclass,edtFacCon_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdCant_Columnclass,edtPrdCant_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForPrdDsc_Columnclass,edtForPrdDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecManAut_Internalname,GXutil.rtrim( A14055RecManAut),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecManAut_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecForNro_Columnclass,edtRecForNro_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecPrdTnq_Columnclass,edtRecPrdTnq_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecLote_Columnclass,edtRecLote_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 210,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV75PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV75PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV75PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,210);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 211,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV76R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV76R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV76R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,211);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 212,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV77G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV77G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV77G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,212);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 213,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV78B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV78B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV78B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,213);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 214,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV79R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV79R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 215,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV80G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV80G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV80G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,215);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 216,'',false,'"+sGXsfl_187_idx+"',187)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV81B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,216);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFab_Internalname,GXutil.rtrim( A6018ProForFab),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForFab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMar_Internalname,GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecMar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(187),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1G42( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_187_idx = ((subGrid_Islastpage==1)&&(nGXsfl_187_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_187_idx+1) ;
         sGXsfl_187_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_187_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1872( ) ;
      }
      /* End function sendrow_1872 */
   }

   public void startgridcontrol187( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"187\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M/A", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV111GrupodeaccionesGrid, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGrupodeaccionesgrid.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGrupodeaccionesgrid.getColumnHeaderClass()));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecLinPro_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecLinPro_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtProForCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtProForCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtProForDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtProForDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecLin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecLin_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A872RecPrdNum));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecPrdNum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecPrdNum_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A875RecPrdDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecPrdDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecPrdDsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtRecPrdDsc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFacCon_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFacCon_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtPrdCant_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtPrdCant_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtForPrdDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtForPrdDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14055RecManAut));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecForNro_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecForNro_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecPrdTnq_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecPrdTnq_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5725RecLote));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtRecLote_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtRecLote_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV75PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV77G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV78B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV81B2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6018ProForFab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), ".", "")));
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
      edtavVarmsg_Internalname = "vVARMSG" ;
      edtavCambioprograma_Internalname = "vCAMBIOPROGRAMA" ;
      edtavModo_Internalname = "vMODO" ;
      edtavModif_Internalname = "vMODIF" ;
      lblLog_Internalname = "LOG" ;
      divTablelog_Internalname = "TABLELOG" ;
      Dvpanel_tablelog_Internalname = "DVPANEL_TABLELOG" ;
      divDvpanel_tablelog_cell_Internalname = "DVPANEL_TABLELOG_CELL" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockcombo_maqcod_Internalname = "TEXTBLOCKCOMBO_MAQCOD" ;
      Combo_maqcod_Internalname = "COMBO_MAQCOD" ;
      divTablesplittedmaqcod_Internalname = "TABLESPLITTEDMAQCOD" ;
      edtavMaqvolmax_Internalname = "vMAQVOLMAX" ;
      edtavMaqvolmin_Internalname = "vMAQVOLMIN" ;
      edtavRb_Internalname = "vRB" ;
      edtavBarvolmaq_Internalname = "vBARVOLMAQ" ;
      edtavRecfa_Internalname = "vRECFA" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavRecnumprgin_Internalname = "vRECNUMPRGIN" ;
      bttBtncambiar_Internalname = "BTNCAMBIAR" ;
      edtavRectotkgm_Internalname = "vRECTOTKGM" ;
      edtavRectotkgs_Internalname = "vRECTOTKGS" ;
      edtavRectotmtr_Internalname = "vRECTOTMTR" ;
      lblTextblockbaragrest_Internalname = "TEXTBLOCKBARAGREST" ;
      edtavBaragrest_Internalname = "vBARAGREST" ;
      lblBaragrest_popoverimage_Internalname = "BARAGREST_POPOVERIMAGE" ;
      tblTablemergedbaragrest_Internalname = "TABLEMERGEDBARAGREST" ;
      divTablesplittedbaragrest_Internalname = "TABLESPLITTEDBARAGREST" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtneliminar_Internalname = "BTNELIMINAR" ;
      bttBtnimprimir_Internalname = "BTNIMPRIMIR" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      bttBtnadd_Internalname = "BTNADD" ;
      bttBtneliminarprocesos_Internalname = "BTNELIMINARPROCESOS" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      cmbavGrupodeaccionesgrid.setInternalname( "vGRUPODEACCIONESGRID" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtFacCon_Internalname = "FACCON" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtRecManAut_Internalname = "RECMANAUT" ;
      edtRecForNro_Internalname = "RECFORNRO" ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtPrdRGB_Internalname = "PRDRGB" ;
      edtavPrdrgb_Internalname = "vPRDRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      edtProForFab_Internalname = "PROFORFAB" ;
      edtRecMar_Internalname = "RECMAR" ;
      divTablacontenido_Internalname = "TABLACONTENIDO" ;
      lblStyle_Internalname = "STYLE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      Popover_baragrest_Internalname = "POPOVER_BARAGREST" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtavClicod_Internalname = "vCLICOD" ;
      Dvelop_confirmpanel_elimimarproceso_Internalname = "DVELOP_CONFIRMPANEL_ELIMIMARPROCESO" ;
      tblTabledvelop_confirmpanel_elimimarproceso_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMIMARPROCESO" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Dvelop_confirmpanel_cerrar_Internalname = "DVELOP_CONFIRMPANEL_CERRAR" ;
      tblTabledvelop_confirmpanel_cerrar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CERRAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
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
      edtRecMar_Jsonclick = "" ;
      edtProForFab_Jsonclick = "" ;
      edtavB2_Jsonclick = "" ;
      edtavB2_Visible = 0 ;
      edtavB2_Enabled = 1 ;
      edtavG2_Jsonclick = "" ;
      edtavG2_Visible = 0 ;
      edtavG2_Enabled = 1 ;
      edtavR2_Jsonclick = "" ;
      edtavR2_Visible = 0 ;
      edtavR2_Enabled = 1 ;
      edtavB_Jsonclick = "" ;
      edtavB_Visible = 0 ;
      edtavB_Enabled = 1 ;
      edtavG_Jsonclick = "" ;
      edtavG_Visible = 0 ;
      edtavG_Enabled = 1 ;
      edtavR_Jsonclick = "" ;
      edtavR_Visible = 0 ;
      edtavR_Enabled = 1 ;
      edtavPrdrgb_Jsonclick = "" ;
      edtavPrdrgb_Visible = 0 ;
      edtavPrdrgb_Enabled = 1 ;
      edtPrdRGB_Jsonclick = "" ;
      edtRecLote_Jsonclick = "" ;
      edtRecLote_Columnclass = "WWColumn hidden-xs" ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecPrdTnq_Columnclass = "WWColumn hidden-xs" ;
      edtRecForNro_Jsonclick = "" ;
      edtRecForNro_Columnclass = "WWColumn hidden-xs" ;
      edtRecManAut_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Columnclass = "WWColumn hidden-xs" ;
      edtPrdCant_Jsonclick = "" ;
      edtPrdCant_Columnclass = "WWColumn hidden-xs" ;
      edtFacCon_Jsonclick = "" ;
      edtFacCon_Columnclass = "WWColumn hidden-xs" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdDsc_Columnclass = "WWColumn hidden-xs" ;
      edtRecPrdDsc_Forecolor = (int)(0x000000) ;
      edtRecPrdDsc_Backcolor = -1 ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecPrdNum_Columnclass = "WWColumn" ;
      edtRecLin_Jsonclick = "" ;
      edtRecLin_Columnclass = "WWColumn hidden-xs" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Columnclass = "WWColumn" ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Columnclass = "WWColumn" ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinPro_Columnclass = "WWColumn hidden-xs" ;
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGrupodeaccionesgrid.setJsonclick( "" );
      cmbavGrupodeaccionesgrid.setVisible( -1 );
      cmbavGrupodeaccionesgrid.setEnabled( 1 );
      cmbavGrupodeaccionesgrid.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavBaragrest_Jsonclick = "" ;
      edtavBaragrest_Enabled = 1 ;
      edtRecLote_Columnheaderclass = "" ;
      edtRecPrdTnq_Columnheaderclass = "" ;
      edtRecForNro_Columnheaderclass = "" ;
      edtForPrdDsc_Columnheaderclass = "" ;
      edtPrdCant_Columnheaderclass = "" ;
      edtFacCon_Columnheaderclass = "" ;
      edtRecPrdDsc_Columnheaderclass = "" ;
      edtRecPrdNum_Columnheaderclass = "" ;
      edtRecLin_Columnheaderclass = "" ;
      edtProForDsc_Columnheaderclass = "" ;
      edtProForCod_Columnheaderclass = "" ;
      edtRecLinPro_Columnheaderclass = "" ;
      cmbavGrupodeaccionesgrid.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblStyle_Caption = "" ;
      divUnnamedtable5_Height = 0 ;
      divUnnamedtable3_Height = 0 ;
      edtavRectotmtr_Jsonclick = "" ;
      edtavRectotmtr_Enabled = 1 ;
      edtavRectotkgs_Jsonclick = "" ;
      edtavRectotkgs_Enabled = 1 ;
      edtavRectotkgm_Jsonclick = "" ;
      edtavRectotkgm_Enabled = 1 ;
      edtavRecnumprgin_Jsonclick = "" ;
      edtavRecnumprgin_Enabled = 1 ;
      edtavRecfa_Jsonclick = "" ;
      edtavRecfa_Enabled = 1 ;
      edtavBarvolmaq_Jsonclick = "" ;
      edtavBarvolmaq_Enabled = 1 ;
      edtavRb_Jsonclick = "" ;
      edtavRb_Enabled = 1 ;
      edtavMaqvolmin_Jsonclick = "" ;
      edtavMaqvolmin_Enabled = 1 ;
      edtavMaqvolmax_Jsonclick = "" ;
      edtavMaqvolmax_Enabled = 1 ;
      Combo_maqcod_Caption = "" ;
      edtavBartipcol_Jsonclick = "" ;
      edtavBartipcol_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      lblLog_Caption = httpContext.getMessage( " Observaciones", "") ;
      edtavModif_Jsonclick = "" ;
      edtavModif_Enabled = 1 ;
      edtavModo_Jsonclick = "" ;
      edtavModo_Enabled = 1 ;
      edtavCambioprograma_Jsonclick = "" ;
      edtavCambioprograma_Enabled = 1 ;
      edtavVarmsg_Jsonclick = "" ;
      edtavVarmsg_Enabled = 0 ;
      divTablelog_Visible = 1 ;
      divDvpanel_tablelog_cell_Class = "col-xs-12" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_cerrar_Confirmtype = "1" ;
      Dvelop_confirmpanel_cerrar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_cerrar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_cerrar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_cerrar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_cerrar_Confirmationtext = "¿Desea cerrar?" ;
      Dvelop_confirmpanel_cerrar_Title = "" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la Receta?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Dvelop_confirmpanel_elimimarproceso_Confirmtype = "1" ;
      Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_elimimarproceso_Confirmationtext = "¿Desea eliminar el proceso?" ;
      Dvelop_confirmpanel_elimimarproceso_Title = "" ;
      Ddo_grid_Datalistproc = "RecetadeTinte02_WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||Dynamic|Dynamic|||Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T||T|T|||T|||T" ;
      Ddo_grid_Filterisrange = "T|||T|||T|T||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Character|Character|Numeric|Numeric|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13" ;
      Ddo_grid_Columnids = "6:RecLinPro|7:ProForCod|8:ProForDsc|9:RecLin|10:RecPrdNum|11:RecPrdDsc|14:FacCon|15:PrdCant|16:ForPrdDsc|18:RecForNro|19:RecPrdTnq|20:RecLote" ;
      Ddo_grid_Gridinternalname = "" ;
      Popover_baragrest_Position = "Bottom" ;
      Popover_baragrest_Popoverwidth = 667 ;
      Popover_baragrest_Trigger = "Click" ;
      Popover_baragrest_Iteminternalname = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Maquina, Volumen, Programa", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Combo_maqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqcod_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_tablelog_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablelog_Iconposition = "Right" ;
      Dvpanel_tablelog_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablelog_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tablelog_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablelog_Title = httpContext.getMessage( "Variables control", "") ;
      Dvpanel_tablelog_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablelog_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablelog_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablelog_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Receta de Tinte (Mto)", "") );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONESGRID_" + sGXsfl_187_idx ;
      cmbavGrupodeaccionesgrid.setName( GXCCtl );
      cmbavGrupodeaccionesgrid.setWebtags( "" );
      if ( cmbavGrupodeaccionesgrid.getItemCount() > 0 )
      {
         AV111GrupodeaccionesGrid = (short)(GXutil.lval( cmbavGrupodeaccionesgrid.getValidValue(GXutil.trim( GXutil.str( AV111GrupodeaccionesGrid, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGrupodeaccionesgrid.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111GrupodeaccionesGrid), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151G42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e301G42',iparms:[{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A4024RecMar',fld:'RECMAR',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV111GrupodeaccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'AV75PrdRGB',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV81B2',fld:'vB2',pic:'ZZ9'},{av:'AV80G2',fld:'vG2',pic:'ZZ9'},{av:'AV79R2',fld:'vR2',pic:'ZZ9'},{av:'AV78B',fld:'vB',pic:'ZZ9'},{av:'AV77G',fld:'vG',pic:'ZZ9'},{av:'AV76R',fld:'vR',pic:'ZZ9'},{av:'edtRecPrdDsc_Backcolor',ctrl:'RECPRDDSC',prop:'Backcolor'},{av:'edtRecPrdDsc_Forecolor',ctrl:'RECPRDDSC',prop:'Forecolor'},{av:'edtRecLinPro_Columnclass',ctrl:'RECLINPRO',prop:'Columnclass'},{av:'edtProForCod_Columnclass',ctrl:'PROFORCOD',prop:'Columnclass'},{av:'edtProForDsc_Columnclass',ctrl:'PROFORDSC',prop:'Columnclass'},{av:'edtRecLin_Columnclass',ctrl:'RECLIN',prop:'Columnclass'},{av:'edtRecPrdNum_Columnclass',ctrl:'RECPRDNUM',prop:'Columnclass'},{av:'edtRecPrdDsc_Columnclass',ctrl:'RECPRDDSC',prop:'Columnclass'},{av:'edtFacCon_Columnclass',ctrl:'FACCON',prop:'Columnclass'},{av:'edtPrdCant_Columnclass',ctrl:'PRDCANT',prop:'Columnclass'},{av:'edtForPrdDsc_Columnclass',ctrl:'FORPRDDSC',prop:'Columnclass'},{av:'edtRecForNro_Columnclass',ctrl:'RECFORNRO',prop:'Columnclass'},{av:'edtRecPrdTnq_Columnclass',ctrl:'RECPRDTNQ',prop:'Columnclass'},{av:'edtRecLote_Columnclass',ctrl:'RECLOTE',prop:'Columnclass'}]}");
      setEventMetadata("VGRUPODEACCIONESGRID.CLICK","{handler:'e311G42',iparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV111GrupodeaccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'A6018ProForFab',fld:'PROFORFAB',pic:''}]");
      setEventMetadata("VGRUPODEACCIONESGRID.CLICK",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'AV111GrupodeaccionesGrid',fld:'vGRUPODEACCIONESGRID',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_elimimarproceso_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMIMARPROCESO',prop:'ConfirmationText'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMIMARPROCESO.CLOSE","{handler:'e161G42',iparms:[{av:'Dvelop_confirmpanel_elimimarproceso_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMIMARPROCESO',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMIMARPROCESO.CLOSE",",oparms:[{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e111G41',iparms:[]");
      setEventMetadata("'DOELIMINAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e171G42',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e271G42',iparms:[{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV91BarSua',fld:'vBARSUA',pic:''},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV91BarSua',fld:'vBARSUA',pic:''},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121G41',iparms:[{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_cerrar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'ConfirmationText'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e181G42',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV121Flag',fld:'vFLAG',pic:'9'},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV124FlagOpe',fld:'vFLAGOPE',pic:''},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV91BarSua',fld:'vBARSUA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV121Flag',fld:'vFLAG',pic:'9'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV124FlagOpe',fld:'vFLAGOPE',pic:''},{av:'AV91BarSua',fld:'vBARSUA',pic:''},{av:'AV54Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e131G41',iparms:[{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'Dvelop_confirmpanel_cerrar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE","{handler:'e191G42',iparms:[{av:'Dvelop_confirmpanel_cerrar_Result',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'Result'},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV124FlagOpe',fld:'vFLAGOPE',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE",",oparms:[{av:'AV124FlagOpe',fld:'vFLAGOPE',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOADD'","{handler:'e201G42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''}]");
      setEventMetadata("'DOADD'",",oparms:[{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOELIMINARPROCESOS'","{handler:'e211G42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''}]");
      setEventMetadata("'DOELIMINARPROCESOS'",",oparms:[{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOCAMBIAR'","{handler:'e221G42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("'DOCAMBIAR'",",oparms:[{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e141G42',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV54Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV54Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("'DOENVIOAUTOMATA'","{handler:'e321G42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''}]");
      setEventMetadata("'DOENVIOAUTOMATA'",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VRECNUMPRGIN.CONTROLVALUECHANGED","{handler:'e231G42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV121Flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VRECNUMPRGIN.CONTROLVALUECHANGED",",oparms:[{av:'AV121Flag',fld:'vFLAG',pic:'9'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VRECNUMPRGIN.ISVALID","{handler:'e241G42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV121Flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VRECNUMPRGIN.ISVALID",",oparms:[{av:'AV121Flag',fld:'vFLAG',pic:'9'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED","{handler:'e251G42',iparms:[{av:'AV54Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV54Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e261G42',iparms:[{av:'AV54Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'AV54Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV56MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV57MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV118FecPan',fld:'vFECPAN',pic:'',hsh:true},{av:'AV127Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV137RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV92Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV70MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV71BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV120RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV117BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV122CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV142Pgmname',fld:'vPGMNAME',pic:''},{av:'AV72UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV24TFRecLinPro',fld:'vTFRECLINPRO',pic:'Z9'},{av:'AV25TFRecLinPro_To',fld:'vTFRECLINPRO_TO',pic:'Z9'},{av:'AV86TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV87TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV88TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV89TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV26TFRecLin',fld:'vTFRECLIN',pic:'ZZZ9'},{av:'AV27TFRecLin_To',fld:'vTFRECLIN_TO',pic:'ZZZ9'},{av:'AV28TFRecPrdNum',fld:'vTFRECPRDNUM',pic:''},{av:'AV29TFRecPrdNum_Sel',fld:'vTFRECPRDNUM_SEL',pic:''},{av:'AV82TFRecPrdDsc',fld:'vTFRECPRDDSC',pic:''},{av:'AV83TFRecPrdDsc_Sel',fld:'vTFRECPRDDSC_SEL',pic:''},{av:'AV34TFFacCon',fld:'vTFFACCON',pic:'ZZZZ9.99999'},{av:'AV35TFFacCon_To',fld:'vTFFACCON_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdCant',fld:'vTFPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV37TFPrdCant_To',fld:'vTFPRDCANT_TO',pic:'ZZZZZZ9.999'},{av:'AV32TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV33TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV38TFRecForNro',fld:'vTFRECFORNRO',pic:'Z9'},{av:'AV39TFRecForNro_To',fld:'vTFRECFORNRO_TO',pic:'Z9'},{av:'AV40TFRecPrdTnq',fld:'vTFRECPRDTNQ',pic:'Z9'},{av:'AV41TFRecPrdTnq_To',fld:'vTFRECPRDTNQ_TO',pic:'Z9'},{av:'AV42TFRecLote',fld:'vTFRECLOTE',pic:''},{av:'AV43TFRecLote_Sel',fld:'vTFRECLOTE_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV130varmsg',fld:'vVARMSG',pic:'',hsh:true},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV84RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV53MaqCod',fld:'vMAQCOD',pic:''},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV108BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'cmbavGrupodeaccionesgrid'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'AV104RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV51RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV50Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV49Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV52Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV48Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV93Modif',fld:'vMODIF',pic:''},{av:'AV100Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV126Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV68RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV65RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV66BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV109BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[]}");
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
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Recmar',iparms:[]");
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
      wcpOAV48Emprcod = "" ;
      wcpOAV50Barcodpar = "" ;
      wcpOGx_mode = "" ;
      wcpOAV130varmsg = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_elimimarproceso_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      Dvelop_confirmpanel_cerrar_Result = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV48Emprcod = "" ;
      AV50Barcodpar = "" ;
      Gx_mode = "" ;
      AV130varmsg = "" ;
      AV142Pgmname = "" ;
      AV72UsurCod = "" ;
      AV73Station = "" ;
      AV86TFProForCod = "" ;
      AV87TFProForCod_Sel = "" ;
      AV88TFProForDsc = "" ;
      AV89TFProForDsc_Sel = "" ;
      AV28TFRecPrdNum = "" ;
      AV29TFRecPrdNum_Sel = "" ;
      AV82TFRecPrdDsc = "" ;
      AV83TFRecPrdDsc_Sel = "" ;
      AV34TFFacCon = DecimalUtil.ZERO ;
      AV35TFFacCon_To = DecimalUtil.ZERO ;
      AV36TFPrdCant = DecimalUtil.ZERO ;
      AV37TFPrdCant_To = DecimalUtil.ZERO ;
      AV32TFForPrdDsc = "" ;
      AV33TFForPrdDsc_Sel = "" ;
      AV42TFRecLote = "" ;
      AV43TFRecLote_Sel = "" ;
      AV65RecNumPrgIN = "" ;
      AV68RecFA = DecimalUtil.ZERO ;
      AV84RecTotKgm = DecimalUtil.ZERO ;
      AV106RecTotMtr = DecimalUtil.ZERO ;
      AV53MaqCod = "" ;
      AV104RecetasTinteProcesosQuimicosToJson = "" ;
      AV109BarMaqcod = "" ;
      AV107Barfacabs = DecimalUtil.ZERO ;
      AV108BarAgrEst = "" ;
      AV118FecPan = GXutil.nullDate() ;
      AV70MaqcodOld = "" ;
      AV120RecNumPrgold = "" ;
      AV117BarNHdr = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV133MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV91BarSua = "" ;
      AV124FlagOpe = "" ;
      A602MaqCod = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablelog = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV123Modo = "" ;
      AV93Modif = "" ;
      lblLog_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV95CliNom = "" ;
      AV96BarSer = "" ;
      AV97BarColNom = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      AV64Rb = DecimalUtil.ZERO ;
      bttBtncambiar_Jsonclick = "" ;
      AV85RecTotKgs = DecimalUtil.ZERO ;
      lblTextblockbaragrest_Jsonclick = "" ;
      bttBtneliminar_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnadd_Jsonclick = "" ;
      bttBtneliminarprocesos_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblStyle_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucPopover_baragrest = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV147Recetadetinte02_wpds_3_tfproforcod = "" ;
      AV148Recetadetinte02_wpds_4_tfproforcod_sel = "" ;
      AV149Recetadetinte02_wpds_5_tfprofordsc = "" ;
      AV150Recetadetinte02_wpds_6_tfprofordsc_sel = "" ;
      AV153Recetadetinte02_wpds_9_tfrecprdnum = "" ;
      AV154Recetadetinte02_wpds_10_tfrecprdnum_sel = "" ;
      AV155Recetadetinte02_wpds_11_tfrecprddsc = "" ;
      AV156Recetadetinte02_wpds_12_tfrecprddsc_sel = "" ;
      AV157Recetadetinte02_wpds_13_tffaccon = DecimalUtil.ZERO ;
      AV158Recetadetinte02_wpds_14_tffaccon_to = DecimalUtil.ZERO ;
      AV159Recetadetinte02_wpds_15_tfprdcant = DecimalUtil.ZERO ;
      AV160Recetadetinte02_wpds_16_tfprdcant_to = DecimalUtil.ZERO ;
      AV161Recetadetinte02_wpds_17_tfforprddsc = "" ;
      AV162Recetadetinte02_wpds_18_tfforprddsc_sel = "" ;
      AV167Recetadetinte02_wpds_23_tfreclote = "" ;
      AV168Recetadetinte02_wpds_24_tfreclote_sel = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A872RecPrdNum = "" ;
      A875RecPrdDsc = "" ;
      A719PrdNum = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      A686PrdCant = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A14055RecManAut = "" ;
      A5725RecLote = "" ;
      A6018ProForFab = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV147Recetadetinte02_wpds_3_tfproforcod = "" ;
      lV149Recetadetinte02_wpds_5_tfprofordsc = "" ;
      lV153Recetadetinte02_wpds_9_tfrecprdnum = "" ;
      lV155Recetadetinte02_wpds_11_tfrecprddsc = "" ;
      lV161Recetadetinte02_wpds_17_tfforprddsc = "" ;
      lV167Recetadetinte02_wpds_23_tfreclote = "" ;
      H01G42_A4024RecMar = new byte[1] ;
      H01G42_A6018ProForFab = new String[] {""} ;
      H01G42_n6018ProForFab = new boolean[] {false} ;
      H01G42_A13232PrdRGB = new long[1] ;
      H01G42_A5725RecLote = new String[] {""} ;
      H01G42_A3274RecPrdTnq = new byte[1] ;
      H01G42_A2394RecForNro = new byte[1] ;
      H01G42_A14055RecManAut = new String[] {""} ;
      H01G42_A488ForPrdDsc = new String[] {""} ;
      H01G42_n488ForPrdDsc = new boolean[] {false} ;
      H01G42_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G42_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G42_A490ForPrdUMe = new byte[1] ;
      H01G42_n490ForPrdUMe = new boolean[] {false} ;
      H01G42_A719PrdNum = new String[] {""} ;
      H01G42_n719PrdNum = new boolean[] {false} ;
      H01G42_A875RecPrdDsc = new String[] {""} ;
      H01G42_A872RecPrdNum = new String[] {""} ;
      H01G42_A811RecLin = new short[1] ;
      H01G42_A766ProForDsc = new String[] {""} ;
      H01G42_A764ProForCod = new String[] {""} ;
      H01G42_A1273RecLinPro = new byte[1] ;
      H01G42_A2804RecLinMaq = new short[1] ;
      H01G42_A130BarCodPar = new String[] {""} ;
      H01G42_A132BarCodReo = new byte[1] ;
      H01G42_A129BarCod = new int[1] ;
      H01G42_A396EmprCod = new String[] {""} ;
      H01G43_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV74EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      H01G46_A2804RecLinMaq = new short[1] ;
      H01G46_A130BarCodPar = new String[] {""} ;
      H01G46_A132BarCodReo = new byte[1] ;
      H01G46_A129BarCod = new int[1] ;
      H01G46_A396EmprCod = new String[] {""} ;
      H01G46_A602MaqCod = new String[] {""} ;
      H01G46_A2805RecVolPrd = new int[1] ;
      H01G46_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G46_A5110RecNumPrg = new String[] {""} ;
      H01G46_A252CliCod = new int[1] ;
      H01G46_n252CliCod = new boolean[] {false} ;
      H01G46_A279CliNom = new String[] {""} ;
      H01G46_A212BarSer = new String[] {""} ;
      H01G46_A135BarColNom = new String[] {""} ;
      H01G46_A136BarColNum = new int[1] ;
      H01G46_A218BarTipCol = new byte[1] ;
      H01G46_A120BarAgrEst = new String[] {""} ;
      H01G46_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G46_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G46_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01G46_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A2806RecFA = DecimalUtil.ZERO ;
      A5110RecNumPrg = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A120BarAgrEst = "" ;
      A184BarMtr = DecimalUtil.ZERO ;
      A870BarTotMtr = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      A871RecTotMtr = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV63RecfaIN = DecimalUtil.ZERO ;
      AV138Promptagrupada = "" ;
      imgPromptagrupada_gximage = "" ;
      imgPromptagrupada_Internalname = "" ;
      AV144Promptagrupada_GXI = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV116ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV90Inc_obs = "" ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int15 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV125ErrMensajeautomata = "" ;
      ucDvelop_confirmpanel_elimimarproceso = new com.genexus.webpanels.GXUserControl();
      AV169Emprcod_selected = "" ;
      AV172Barcodpar_selected = "" ;
      AV115ErrorMessage = "" ;
      GXv_int6 = new byte[1] ;
      AV20Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char26 = "" ;
      GXt_char24 = "" ;
      GXt_char23 = "" ;
      GXt_char22 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char21 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState28 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01G47_A396EmprCod = new String[] {""} ;
      H01G47_A623MaqVolMax = new int[1] ;
      H01G47_n623MaqVolMax = new boolean[] {false} ;
      H01G47_A602MaqCod = new String[] {""} ;
      H01G47_A625MaqVolMin = new int[1] ;
      H01G47_n625MaqVolMin = new boolean[] {false} ;
      H01G47_A606MaqDsc = new String[] {""} ;
      H01G47_n606MaqDsc = new boolean[] {false} ;
      A606MaqDsc = "" ;
      AV134Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H01G48_A602MaqCod = new String[] {""} ;
      H01G48_A396EmprCod = new String[] {""} ;
      H01G48_A624MaqVolMed = new int[1] ;
      H01G48_n624MaqVolMed = new boolean[] {false} ;
      H01G48_A623MaqVolMax = new int[1] ;
      H01G48_n623MaqVolMax = new boolean[] {false} ;
      H01G48_A625MaqVolMin = new int[1] ;
      H01G48_n625MaqVolMin = new boolean[] {false} ;
      H01G48_A3599MaqRelBan = new byte[1] ;
      H01G48_n3599MaqRelBan = new boolean[] {false} ;
      GXv_int16 = new short[1] ;
      GXv_decimal20 = new java.math.BigDecimal[1] ;
      GXv_char27 = new String[1] ;
      GXv_int19 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char25 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int10 = new int[1] ;
      ucDvelop_confirmpanel_cerrar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      lblBaragrest_popoverimage_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte02_wp__default(),
         new Object[] {
             new Object[] {
            H01G42_A4024RecMar, H01G42_A6018ProForFab, H01G42_n6018ProForFab, H01G42_A13232PrdRGB, H01G42_A5725RecLote, H01G42_A3274RecPrdTnq, H01G42_A2394RecForNro, H01G42_A14055RecManAut, H01G42_A488ForPrdDsc, H01G42_n488ForPrdDsc,
            H01G42_A686PrdCant, H01G42_A431FacCon, H01G42_A490ForPrdUMe, H01G42_n490ForPrdUMe, H01G42_A719PrdNum, H01G42_n719PrdNum, H01G42_A875RecPrdDsc, H01G42_A872RecPrdNum, H01G42_A811RecLin, H01G42_A766ProForDsc,
            H01G42_A764ProForCod, H01G42_A1273RecLinPro, H01G42_A2804RecLinMaq, H01G42_A130BarCodPar, H01G42_A132BarCodReo, H01G42_A129BarCod, H01G42_A396EmprCod
            }
            , new Object[] {
            H01G43_AGRID_nRecordCount
            }
            , new Object[] {
            H01G46_A2804RecLinMaq, H01G46_A130BarCodPar, H01G46_A132BarCodReo, H01G46_A129BarCod, H01G46_A396EmprCod, H01G46_A602MaqCod, H01G46_A2805RecVolPrd, H01G46_A2806RecFA, H01G46_A5110RecNumPrg, H01G46_A252CliCod,
            H01G46_n252CliCod, H01G46_A279CliNom, H01G46_A212BarSer, H01G46_A135BarColNom, H01G46_A136BarColNum, H01G46_A218BarTipCol, H01G46_A120BarAgrEst, H01G46_A184BarMtr, H01G46_A870BarTotMtr, H01G46_A166BarKgm,
            H01G46_A219BarTotAgr
            }
            , new Object[] {
            H01G47_A396EmprCod, H01G47_A623MaqVolMax, H01G47_n623MaqVolMax, H01G47_A602MaqCod, H01G47_A625MaqVolMin, H01G47_n625MaqVolMin, H01G47_A606MaqDsc, H01G47_n606MaqDsc
            }
            , new Object[] {
            H01G48_A602MaqCod, H01G48_A396EmprCod, H01G48_A624MaqVolMed, H01G48_n624MaqVolMed, H01G48_A623MaqVolMax, H01G48_n623MaqVolMax, H01G48_A625MaqVolMin, H01G48_n625MaqVolMin, H01G48_A3599MaqRelBan, H01G48_n3599MaqRelBan
            }
         }
      );
      AV142Pgmname = "RecetadeTinte02_WP" ;
      /* GeneXus formulas. */
      AV142Pgmname = "RecetadeTinte02_WP" ;
      Gx_err = (short)(0) ;
      edtavVarmsg_Enabled = 0 ;
      edtavCambioprograma_Enabled = 0 ;
      edtavModo_Enabled = 0 ;
      edtavModif_Enabled = 0 ;
      edtavBarnhdr_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
      edtavMaqvolmax_Enabled = 0 ;
      edtavMaqvolmin_Enabled = 0 ;
      edtavRecnumprgin_Enabled = 0 ;
      edtavRectotkgm_Enabled = 0 ;
      edtavRectotkgs_Enabled = 0 ;
      edtavBaragrest_Enabled = 0 ;
      edtavPrdrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV49Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV49Barcodreo ;
   private byte AV24TFRecLinPro ;
   private byte AV25TFRecLinPro_To ;
   private byte AV38TFRecForNro ;
   private byte AV39TFRecForNro_To ;
   private byte AV40TFRecPrdTnq ;
   private byte AV41TFRecPrdTnq_To ;
   private byte gxajaxcallmode ;
   private byte AV121Flag ;
   private byte A3599MaqRelBan ;
   private byte AV99BarTipCol ;
   private byte AV145Recetadetinte02_wpds_1_tfreclinpro ;
   private byte AV146Recetadetinte02_wpds_2_tfreclinpro_to ;
   private byte AV163Recetadetinte02_wpds_19_tfrecfornro ;
   private byte AV164Recetadetinte02_wpds_20_tfrecfornro_to ;
   private byte AV165Recetadetinte02_wpds_21_tfrecprdtnq ;
   private byte AV166Recetadetinte02_wpds_22_tfrecprdtnq_to ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte A218BarTipCol ;
   private byte AV171Barcodreo_selected ;
   private byte AV174Reclinpro_selected ;
   private byte GXv_int6[] ;
   private byte AV58MaqRelban ;
   private byte GXv_int17[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV51RecLinMaq ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV51RecLinMaq ;
   private short AV100Procesosdadosdealta ;
   private short AV122CambioPrograma ;
   private short AV126Procesoseliminados ;
   private short AV26TFRecLin ;
   private short AV27TFRecLin_To ;
   private short AV12OrderedBy ;
   private short AV127Automata ;
   private short AV137RecipeTinte ;
   private short AV92Carvitin ;
   private short AV54Maquin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV151Recetadetinte02_wpds_7_tfreclin ;
   private short AV152Recetadetinte02_wpds_8_tfreclin_to ;
   private short AV111GrupodeaccionesGrid ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV76R ;
   private short AV77G ;
   private short AV78B ;
   private short AV79R2 ;
   private short AV80G2 ;
   private short AV81B2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV136FlagStdp ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short GXv_int13[] ;
   private short GXv_int14[] ;
   private short GXv_int15[] ;
   private short AV173Reclinmaq_selected ;
   private short AV175Reclin_selected ;
   private short GXv_int16[] ;
   private int wcpOAV52Barcod ;
   private int nRC_GXsfl_187 ;
   private int subGrid_Rows ;
   private int AV52Barcod ;
   private int nGXsfl_187_idx=1 ;
   private int AV66BarVolMaq ;
   private int AV71BarVolMaqOld ;
   private int A624MaqVolMed ;
   private int A623MaqVolMax ;
   private int A625MaqVolMin ;
   private int Popover_baragrest_Popoverwidth ;
   private int divTablelog_Visible ;
   private int edtavVarmsg_Enabled ;
   private int edtavCambioprograma_Enabled ;
   private int edtavModo_Enabled ;
   private int edtavModif_Enabled ;
   private int edtavBarnhdr_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV98BarColNum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int AV56MaqVolMax ;
   private int edtavMaqvolmax_Enabled ;
   private int AV57MaqVolMin ;
   private int edtavMaqvolmin_Enabled ;
   private int edtavRb_Enabled ;
   private int edtavBarvolmaq_Enabled ;
   private int edtavRecfa_Enabled ;
   private int edtavRecnumprgin_Enabled ;
   private int edtavRectotkgm_Enabled ;
   private int edtavRectotkgs_Enabled ;
   private int edtavRectotmtr_Enabled ;
   private int divUnnamedtable3_Height ;
   private int divUnnamedtable5_Height ;
   private int edtavPgmname_Enabled ;
   private int edtavMaqcod_Visible ;
   private int AV94CliCod ;
   private int edtavClicod_Visible ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int edtavBaragrest_Enabled ;
   private int edtavPrdrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A2805RecVolPrd ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int edtRecPrdDsc_Backcolor ;
   private int edtRecPrdDsc_Forecolor ;
   private int AV170Barcod_selected ;
   private int AV176GXV1 ;
   private int AV55MaqVolMed ;
   private int GXv_int19[] ;
   private int GXv_int10[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrdrgb_Visible ;
   private int edtavR_Visible ;
   private int edtavG_Visible ;
   private int edtavB_Visible ;
   private int edtavR2_Visible ;
   private int edtavG2_Visible ;
   private int edtavB2_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A13232PrdRGB ;
   private long AV75PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV34TFFacCon ;
   private java.math.BigDecimal AV35TFFacCon_To ;
   private java.math.BigDecimal AV36TFPrdCant ;
   private java.math.BigDecimal AV37TFPrdCant_To ;
   private java.math.BigDecimal AV68RecFA ;
   private java.math.BigDecimal AV84RecTotKgm ;
   private java.math.BigDecimal AV106RecTotMtr ;
   private java.math.BigDecimal AV107Barfacabs ;
   private java.math.BigDecimal AV64Rb ;
   private java.math.BigDecimal AV85RecTotKgs ;
   private java.math.BigDecimal AV157Recetadetinte02_wpds_13_tffaccon ;
   private java.math.BigDecimal AV158Recetadetinte02_wpds_14_tffaccon_to ;
   private java.math.BigDecimal AV159Recetadetinte02_wpds_15_tfprdcant ;
   private java.math.BigDecimal AV160Recetadetinte02_wpds_16_tfprdcant_to ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV63RecfaIN ;
   private java.math.BigDecimal GXv_decimal20[] ;
   private String wcpOAV48Emprcod ;
   private String wcpOAV50Barcodpar ;
   private String wcpOGx_mode ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_elimimarproceso_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String Dvelop_confirmpanel_cerrar_Result ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV48Emprcod ;
   private String AV50Barcodpar ;
   private String Gx_mode ;
   private String sGXsfl_187_idx="0001" ;
   private String AV142Pgmname ;
   private String AV72UsurCod ;
   private String AV73Station ;
   private String AV86TFProForCod ;
   private String AV87TFProForCod_Sel ;
   private String AV88TFProForDsc ;
   private String AV89TFProForDsc_Sel ;
   private String AV28TFRecPrdNum ;
   private String AV29TFRecPrdNum_Sel ;
   private String AV82TFRecPrdDsc ;
   private String AV83TFRecPrdDsc_Sel ;
   private String AV32TFForPrdDsc ;
   private String AV33TFForPrdDsc_Sel ;
   private String AV42TFRecLote ;
   private String AV43TFRecLote_Sel ;
   private String AV65RecNumPrgIN ;
   private String AV53MaqCod ;
   private String AV109BarMaqcod ;
   private String AV108BarAgrEst ;
   private String AV70MaqcodOld ;
   private String AV120RecNumPrgold ;
   private String AV117BarNHdr ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV91BarSua ;
   private String AV124FlagOpe ;
   private String A602MaqCod ;
   private String Dvpanel_tablelog_Width ;
   private String Dvpanel_tablelog_Cls ;
   private String Dvpanel_tablelog_Title ;
   private String Dvpanel_tablelog_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_maqcod_Cls ;
   private String Combo_maqcod_Selectedvalue_set ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Popover_baragrest_Iteminternalname ;
   private String Popover_baragrest_Trigger ;
   private String Popover_baragrest_Position ;
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
   private String Dvelop_confirmpanel_elimimarproceso_Title ;
   private String Dvelop_confirmpanel_elimimarproceso_Confirmationtext ;
   private String Dvelop_confirmpanel_elimimarproceso_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_elimimarproceso_Nobuttoncaption ;
   private String Dvelop_confirmpanel_elimimarproceso_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_elimimarproceso_Yesbuttonposition ;
   private String Dvelop_confirmpanel_elimimarproceso_Confirmtype ;
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Dvelop_confirmpanel_cerrar_Title ;
   private String Dvelop_confirmpanel_cerrar_Confirmationtext ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_cerrar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_cerrar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablacontenido_Internalname ;
   private String divDvpanel_tablelog_cell_Internalname ;
   private String divDvpanel_tablelog_cell_Class ;
   private String Dvpanel_tablelog_Internalname ;
   private String divTablelog_Internalname ;
   private String edtavVarmsg_Internalname ;
   private String edtavVarmsg_Jsonclick ;
   private String edtavCambioprograma_Internalname ;
   private String TempTags ;
   private String edtavCambioprograma_Jsonclick ;
   private String edtavModo_Internalname ;
   private String AV123Modo ;
   private String edtavModo_Jsonclick ;
   private String edtavModif_Internalname ;
   private String AV93Modif ;
   private String edtavModif_Jsonclick ;
   private String lblLog_Internalname ;
   private String lblLog_Caption ;
   private String lblLog_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable10_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtavClinom_Internalname ;
   private String AV95CliNom ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String AV96BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV97BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String divTablesplittedmaqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Internalname ;
   private String lblTextblockcombo_maqcod_Jsonclick ;
   private String Combo_maqcod_Caption ;
   private String Combo_maqcod_Internalname ;
   private String edtavMaqvolmax_Internalname ;
   private String edtavMaqvolmax_Jsonclick ;
   private String edtavMaqvolmin_Internalname ;
   private String edtavMaqvolmin_Jsonclick ;
   private String edtavRb_Internalname ;
   private String edtavRb_Jsonclick ;
   private String edtavBarvolmaq_Internalname ;
   private String edtavBarvolmaq_Jsonclick ;
   private String edtavRecfa_Internalname ;
   private String edtavRecfa_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavRecnumprgin_Internalname ;
   private String edtavRecnumprgin_Jsonclick ;
   private String bttBtncambiar_Internalname ;
   private String bttBtncambiar_Jsonclick ;
   private String edtavRectotkgm_Internalname ;
   private String edtavRectotkgm_Jsonclick ;
   private String edtavRectotkgs_Internalname ;
   private String edtavRectotkgs_Jsonclick ;
   private String edtavRectotmtr_Internalname ;
   private String edtavRectotmtr_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String divTablesplittedbaragrest_Internalname ;
   private String lblTextblockbaragrest_Internalname ;
   private String lblTextblockbaragrest_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String bttBtneliminar_Internalname ;
   private String bttBtneliminar_Jsonclick ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String bttBtnadd_Internalname ;
   private String bttBtnadd_Jsonclick ;
   private String bttBtneliminarprocesos_Internalname ;
   private String bttBtneliminarprocesos_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String lblStyle_Internalname ;
   private String lblStyle_Caption ;
   private String lblStyle_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String Popover_baragrest_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV147Recetadetinte02_wpds_3_tfproforcod ;
   private String AV148Recetadetinte02_wpds_4_tfproforcod_sel ;
   private String AV149Recetadetinte02_wpds_5_tfprofordsc ;
   private String AV150Recetadetinte02_wpds_6_tfprofordsc_sel ;
   private String AV153Recetadetinte02_wpds_9_tfrecprdnum ;
   private String AV154Recetadetinte02_wpds_10_tfrecprdnum_sel ;
   private String AV155Recetadetinte02_wpds_11_tfrecprddsc ;
   private String AV156Recetadetinte02_wpds_12_tfrecprddsc_sel ;
   private String AV161Recetadetinte02_wpds_17_tfforprddsc ;
   private String AV162Recetadetinte02_wpds_18_tfforprddsc_sel ;
   private String AV167Recetadetinte02_wpds_23_tfreclote ;
   private String AV168Recetadetinte02_wpds_24_tfreclote_sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinPro_Internalname ;
   private String A764ProForCod ;
   private String edtProForCod_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String edtRecLin_Internalname ;
   private String A872RecPrdNum ;
   private String edtRecPrdNum_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String edtFacCon_Internalname ;
   private String edtPrdCant_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String A14055RecManAut ;
   private String edtRecManAut_Internalname ;
   private String edtRecForNro_Internalname ;
   private String edtRecPrdTnq_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Internalname ;
   private String edtPrdRGB_Internalname ;
   private String edtavPrdrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String A6018ProForFab ;
   private String edtProForFab_Internalname ;
   private String edtRecMar_Internalname ;
   private String GXCCtl ;
   private String edtavBaragrest_Internalname ;
   private String scmdbuf ;
   private String lV147Recetadetinte02_wpds_3_tfproforcod ;
   private String lV149Recetadetinte02_wpds_5_tfprofordsc ;
   private String lV153Recetadetinte02_wpds_9_tfrecprdnum ;
   private String lV155Recetadetinte02_wpds_11_tfrecprddsc ;
   private String lV161Recetadetinte02_wpds_17_tfforprddsc ;
   private String lV167Recetadetinte02_wpds_23_tfreclote ;
   private String hsh ;
   private String AV74EmprNom ;
   private String A5110RecNumPrg ;
   private String A279CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A120BarAgrEst ;
   private String imgPromptagrupada_gximage ;
   private String imgPromptagrupada_Internalname ;
   private String edtRecLinPro_Columnheaderclass ;
   private String edtProForCod_Columnheaderclass ;
   private String edtProForDsc_Columnheaderclass ;
   private String edtRecLin_Columnheaderclass ;
   private String edtRecPrdNum_Columnheaderclass ;
   private String edtRecPrdDsc_Columnheaderclass ;
   private String edtFacCon_Columnheaderclass ;
   private String edtPrdCant_Columnheaderclass ;
   private String edtForPrdDsc_Columnheaderclass ;
   private String edtRecForNro_Columnheaderclass ;
   private String edtRecPrdTnq_Columnheaderclass ;
   private String edtRecLote_Columnheaderclass ;
   private String edtRecLinPro_Columnclass ;
   private String edtProForCod_Columnclass ;
   private String edtProForDsc_Columnclass ;
   private String edtRecLin_Columnclass ;
   private String edtRecPrdNum_Columnclass ;
   private String edtRecPrdDsc_Columnclass ;
   private String edtFacCon_Columnclass ;
   private String edtPrdCant_Columnclass ;
   private String edtForPrdDsc_Columnclass ;
   private String edtRecForNro_Columnclass ;
   private String edtRecPrdTnq_Columnclass ;
   private String edtRecLote_Columnclass ;
   private String Dvelop_confirmpanel_elimimarproceso_Internalname ;
   private String AV169Emprcod_selected ;
   private String AV172Barcodpar_selected ;
   private String GXt_char26 ;
   private String GXt_char24 ;
   private String GXt_char23 ;
   private String GXt_char22 ;
   private String GXv_char4[] ;
   private String GXt_char21 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A606MaqDsc ;
   private String GXv_char27[] ;
   private String GXv_char25[] ;
   private String GXv_char18[] ;
   private String tblTabledvelop_confirmpanel_cerrar_Internalname ;
   private String Dvelop_confirmpanel_cerrar_Internalname ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_elimimarproceso_Internalname ;
   private String tblTablemergedbaragrest_Internalname ;
   private String edtavBaragrest_Jsonclick ;
   private String lblBaragrest_popoverimage_Internalname ;
   private String lblBaragrest_popoverimage_Jsonclick ;
   private String sGXsfl_187_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtFacCon_Jsonclick ;
   private String edtPrdCant_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtRecManAut_Jsonclick ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Jsonclick ;
   private String edtRecLote_Jsonclick ;
   private String edtPrdRGB_Jsonclick ;
   private String edtavPrdrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String edtProForFab_Jsonclick ;
   private String edtRecMar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV118FecPan ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_tablelog_Autowidth ;
   private boolean Dvpanel_tablelog_Autoheight ;
   private boolean Dvpanel_tablelog_Collapsible ;
   private boolean Dvpanel_tablelog_Collapsed ;
   private boolean Dvpanel_tablelog_Showcollapseicon ;
   private boolean Dvpanel_tablelog_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_maqcod_Emptyitem ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean bGXsfl_187_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n6018ProForFab ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean gx_refresh_fired ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private boolean n606MaqDsc ;
   private boolean n624MaqVolMed ;
   private boolean n3599MaqRelBan ;
   private String wcpOAV130varmsg ;
   private String AV130varmsg ;
   private String AV104RecetasTinteProcesosQuimicosToJson ;
   private String AV144Promptagrupada_GXI ;
   private String AV90Inc_obs ;
   private String AV125ErrMensajeautomata ;
   private String AV115ErrorMessage ;
   private String AV138Promptagrupada ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablelog ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucPopover_baragrest ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_elimimarproceso ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cerrar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV116ProgressIndicator ;
   private HTMLChoice cmbavGrupodeaccionesgrid ;
   private IDataStoreProvider pr_default ;
   private byte[] H01G42_A4024RecMar ;
   private String[] H01G42_A6018ProForFab ;
   private boolean[] H01G42_n6018ProForFab ;
   private long[] H01G42_A13232PrdRGB ;
   private String[] H01G42_A5725RecLote ;
   private byte[] H01G42_A3274RecPrdTnq ;
   private byte[] H01G42_A2394RecForNro ;
   private String[] H01G42_A14055RecManAut ;
   private String[] H01G42_A488ForPrdDsc ;
   private boolean[] H01G42_n488ForPrdDsc ;
   private java.math.BigDecimal[] H01G42_A686PrdCant ;
   private java.math.BigDecimal[] H01G42_A431FacCon ;
   private byte[] H01G42_A490ForPrdUMe ;
   private boolean[] H01G42_n490ForPrdUMe ;
   private String[] H01G42_A719PrdNum ;
   private boolean[] H01G42_n719PrdNum ;
   private String[] H01G42_A875RecPrdDsc ;
   private String[] H01G42_A872RecPrdNum ;
   private short[] H01G42_A811RecLin ;
   private String[] H01G42_A766ProForDsc ;
   private String[] H01G42_A764ProForCod ;
   private byte[] H01G42_A1273RecLinPro ;
   private short[] H01G42_A2804RecLinMaq ;
   private String[] H01G42_A130BarCodPar ;
   private byte[] H01G42_A132BarCodReo ;
   private int[] H01G42_A129BarCod ;
   private String[] H01G42_A396EmprCod ;
   private long[] H01G43_AGRID_nRecordCount ;
   private short[] H01G46_A2804RecLinMaq ;
   private String[] H01G46_A130BarCodPar ;
   private byte[] H01G46_A132BarCodReo ;
   private int[] H01G46_A129BarCod ;
   private String[] H01G46_A396EmprCod ;
   private String[] H01G46_A602MaqCod ;
   private int[] H01G46_A2805RecVolPrd ;
   private java.math.BigDecimal[] H01G46_A2806RecFA ;
   private String[] H01G46_A5110RecNumPrg ;
   private int[] H01G46_A252CliCod ;
   private boolean[] H01G46_n252CliCod ;
   private String[] H01G46_A279CliNom ;
   private String[] H01G46_A212BarSer ;
   private String[] H01G46_A135BarColNom ;
   private int[] H01G46_A136BarColNum ;
   private byte[] H01G46_A218BarTipCol ;
   private String[] H01G46_A120BarAgrEst ;
   private java.math.BigDecimal[] H01G46_A184BarMtr ;
   private java.math.BigDecimal[] H01G46_A870BarTotMtr ;
   private java.math.BigDecimal[] H01G46_A166BarKgm ;
   private java.math.BigDecimal[] H01G46_A219BarTotAgr ;
   private String[] H01G47_A396EmprCod ;
   private int[] H01G47_A623MaqVolMax ;
   private boolean[] H01G47_n623MaqVolMax ;
   private String[] H01G47_A602MaqCod ;
   private int[] H01G47_A625MaqVolMin ;
   private boolean[] H01G47_n625MaqVolMin ;
   private String[] H01G47_A606MaqDsc ;
   private boolean[] H01G47_n606MaqDsc ;
   private String[] H01G48_A602MaqCod ;
   private String[] H01G48_A396EmprCod ;
   private int[] H01G48_A624MaqVolMed ;
   private boolean[] H01G48_n624MaqVolMed ;
   private int[] H01G48_A623MaqVolMax ;
   private boolean[] H01G48_n623MaqVolMax ;
   private int[] H01G48_A625MaqVolMin ;
   private boolean[] H01G48_n625MaqVolMin ;
   private byte[] H01G48_A3599MaqRelBan ;
   private boolean[] H01G48_n3599MaqRelBan ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV133MaqCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState28[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV134Combo_DataItem ;
}

final  class recetadetinte02_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01G42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV145Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV146Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV148Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV147Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV150Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV149Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV151Recetadetinte02_wpds_7_tfreclin ,
                                          short AV152Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV154Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV153Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV156Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV155Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV157Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV158Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV159Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV160Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV162Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV161Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV163Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV164Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV165Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV166Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV168Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV167Recetadetinte02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV48Emprcod ,
                                          int AV52Barcod ,
                                          byte AV49Barcodreo ,
                                          String AV50Barcodpar ,
                                          short AV51RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[34];
      Object[] GXv_Object30 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.RecMar, T5.ProForFab, T2.PrdRGB, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T1.RecManAut, T3.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.ForPrdUMe," ;
      sSelectString += " T1.PrdNum, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T5.ProForDsc, T4.ProForCod, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod" ;
      sFromString = " FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe" ;
      sFromString += " = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND" ;
      sFromString += " T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (0==AV145Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (0==AV146Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV147Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForCod = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV149Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProForDsc = ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (0==AV151Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (0==AV152Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV153Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV159Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV161Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( ! (0==AV163Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (0==AV164Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV165Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV166Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV167Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Recetadetinte02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
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
         sOrderString += " ORDER BY T4.ProForCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.ProForCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T5.ProForDsc" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T5.ProForDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLin" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdNum" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FacCon" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FacCon DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdCant" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdCant DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.ForPrdDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecForNro" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecForNro DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecPrdTnq" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecPrdTnq DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecLote" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecLote DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object30[0] = scmdbuf ;
      GXv_Object30[1] = GXv_int29 ;
      return GXv_Object30 ;
   }

   protected Object[] conditional_H01G43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte AV145Recetadetinte02_wpds_1_tfreclinpro ,
                                          byte AV146Recetadetinte02_wpds_2_tfreclinpro_to ,
                                          String AV148Recetadetinte02_wpds_4_tfproforcod_sel ,
                                          String AV147Recetadetinte02_wpds_3_tfproforcod ,
                                          String AV150Recetadetinte02_wpds_6_tfprofordsc_sel ,
                                          String AV149Recetadetinte02_wpds_5_tfprofordsc ,
                                          short AV151Recetadetinte02_wpds_7_tfreclin ,
                                          short AV152Recetadetinte02_wpds_8_tfreclin_to ,
                                          String AV154Recetadetinte02_wpds_10_tfrecprdnum_sel ,
                                          String AV153Recetadetinte02_wpds_9_tfrecprdnum ,
                                          String AV156Recetadetinte02_wpds_12_tfrecprddsc_sel ,
                                          String AV155Recetadetinte02_wpds_11_tfrecprddsc ,
                                          java.math.BigDecimal AV157Recetadetinte02_wpds_13_tffaccon ,
                                          java.math.BigDecimal AV158Recetadetinte02_wpds_14_tffaccon_to ,
                                          java.math.BigDecimal AV159Recetadetinte02_wpds_15_tfprdcant ,
                                          java.math.BigDecimal AV160Recetadetinte02_wpds_16_tfprdcant_to ,
                                          String AV162Recetadetinte02_wpds_18_tfforprddsc_sel ,
                                          String AV161Recetadetinte02_wpds_17_tfforprddsc ,
                                          byte AV163Recetadetinte02_wpds_19_tfrecfornro ,
                                          byte AV164Recetadetinte02_wpds_20_tfrecfornro_to ,
                                          byte AV165Recetadetinte02_wpds_21_tfrecprdtnq ,
                                          byte AV166Recetadetinte02_wpds_22_tfrecprdtnq_to ,
                                          String AV168Recetadetinte02_wpds_24_tfreclote_sel ,
                                          String AV167Recetadetinte02_wpds_23_tfreclote ,
                                          byte A1273RecLinPro ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          short A811RecLin ,
                                          String A872RecPrdNum ,
                                          String A875RecPrdDsc ,
                                          java.math.BigDecimal A431FacCon ,
                                          java.math.BigDecimal A686PrdCant ,
                                          String A488ForPrdDsc ,
                                          byte A2394RecForNro ,
                                          byte A3274RecPrdTnq ,
                                          String A5725RecLote ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV48Emprcod ,
                                          int AV52Barcod ,
                                          byte AV49Barcodreo ,
                                          String AV50Barcodpar ,
                                          short AV51RecLinMaq ,
                                          String A396EmprCod ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          short A2804RecLinMaq )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int31 = new byte[29];
      Object[] GXv_Object32 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar =" ;
      scmdbuf += " T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?)");
      if ( ! (0==AV145Recetadetinte02_wpds_1_tfreclinpro) )
      {
         addWhere(sWhereString, "(T1.RecLinPro >= ?)");
      }
      else
      {
         GXv_int31[5] = (byte)(1) ;
      }
      if ( ! (0==AV146Recetadetinte02_wpds_2_tfreclinpro_to) )
      {
         addWhere(sWhereString, "(T1.RecLinPro <= ?)");
      }
      else
      {
         GXv_int31[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV148Recetadetinte02_wpds_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV147Recetadetinte02_wpds_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV148Recetadetinte02_wpds_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T4.ProForCod = ?)");
      }
      else
      {
         GXv_int31[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV150Recetadetinte02_wpds_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV149Recetadetinte02_wpds_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T5.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV150Recetadetinte02_wpds_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T5.ProForDsc = ?)");
      }
      else
      {
         GXv_int31[10] = (byte)(1) ;
      }
      if ( ! (0==AV151Recetadetinte02_wpds_7_tfreclin) )
      {
         addWhere(sWhereString, "(T1.RecLin >= ?)");
      }
      else
      {
         GXv_int31[11] = (byte)(1) ;
      }
      if ( ! (0==AV152Recetadetinte02_wpds_8_tfreclin_to) )
      {
         addWhere(sWhereString, "(T1.RecLin <= ?)");
      }
      else
      {
         GXv_int31[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV154Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV153Recetadetinte02_wpds_9_tfrecprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV154Recetadetinte02_wpds_10_tfrecprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdNum = ?)");
      }
      else
      {
         GXv_int31[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV156Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV155Recetadetinte02_wpds_11_tfrecprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV156Recetadetinte02_wpds_12_tfrecprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecPrdDsc = ?)");
      }
      else
      {
         GXv_int31[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV157Recetadetinte02_wpds_13_tffaccon)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon >= ?)");
      }
      else
      {
         GXv_int31[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV158Recetadetinte02_wpds_14_tffaccon_to)==0) )
      {
         addWhere(sWhereString, "(T1.FacCon <= ?)");
      }
      else
      {
         GXv_int31[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV159Recetadetinte02_wpds_15_tfprdcant)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant >= ?)");
      }
      else
      {
         GXv_int31[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV160Recetadetinte02_wpds_16_tfprdcant_to)==0) )
      {
         addWhere(sWhereString, "(T1.PrdCant <= ?)");
      }
      else
      {
         GXv_int31[20] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV162Recetadetinte02_wpds_18_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV161Recetadetinte02_wpds_17_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV162Recetadetinte02_wpds_18_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int31[22] = (byte)(1) ;
      }
      if ( ! (0==AV163Recetadetinte02_wpds_19_tfrecfornro) )
      {
         addWhere(sWhereString, "(T1.RecForNro >= ?)");
      }
      else
      {
         GXv_int31[23] = (byte)(1) ;
      }
      if ( ! (0==AV164Recetadetinte02_wpds_20_tfrecfornro_to) )
      {
         addWhere(sWhereString, "(T1.RecForNro <= ?)");
      }
      else
      {
         GXv_int31[24] = (byte)(1) ;
      }
      if ( ! (0==AV165Recetadetinte02_wpds_21_tfrecprdtnq) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq >= ?)");
      }
      else
      {
         GXv_int31[25] = (byte)(1) ;
      }
      if ( ! (0==AV166Recetadetinte02_wpds_22_tfrecprdtnq_to) )
      {
         addWhere(sWhereString, "(T1.RecPrdTnq <= ?)");
      }
      else
      {
         GXv_int31[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV168Recetadetinte02_wpds_24_tfreclote_sel)==0) && ( ! (GXutil.strcmp("", AV167Recetadetinte02_wpds_23_tfreclote)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.RecLote) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int31[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV168Recetadetinte02_wpds_24_tfreclote_sel)==0) )
      {
         addWhere(sWhereString, "(T1.RecLote = ?)");
      }
      else
      {
         GXv_int31[28] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object32[0] = scmdbuf ;
      GXv_Object32[1] = GXv_int31 ;
      return GXv_Object32 ;
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
                  return conditional_H01G42(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
            case 1 :
                  return conditional_H01G43(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , ((Number) dynConstraints[1]).byteValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).byteValue() , ((Number) dynConstraints[21]).byteValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).byteValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).shortValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , (java.math.BigDecimal)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).byteValue() , ((Number) dynConstraints[34]).byteValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).shortValue() , ((Boolean) dynConstraints[37]).booleanValue() , (String)dynConstraints[38] , ((Number) dynConstraints[39]).intValue() , ((Number) dynConstraints[40]).byteValue() , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , ((Number) dynConstraints[45]).byteValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01G42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01G43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01G46", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.MaqCod, T1.RecVolPrd, T1.RecFA, T1.RecNumPrg, T2.CliCod, T3.CliNom, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T2.BarAgrEst, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T4.BarTotMtr, 0) AS BarTotMtr, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01G47", "SELECT EmprCod, MaqVolMax, MaqCod, MaqVolMin, MaqDsc FROM TXPMAQUIN WHERE MaqVolMax > 0 ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01G48", "SELECT MaqCod, EmprCod, MaqVolMed, MaqVolMax, MaqVolMin, MaqRelBan FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(13, 26);
               ((String[]) buf[17])[0] = rslt.getString(14, 6);
               ((short[]) buf[18])[0] = rslt.getShort(15);
               ((String[]) buf[19])[0] = rslt.getString(16, 30);
               ((String[]) buf[20])[0] = rslt.getString(17, 6);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((short[]) buf[22])[0] = rslt.getShort(19);
               ((String[]) buf[23])[0] = rslt.getString(20, 1);
               ((byte[]) buf[24])[0] = rslt.getByte(21);
               ((int[]) buf[25])[0] = rslt.getInt(22);
               ((String[]) buf[26])[0] = rslt.getString(23, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 30);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[46]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[59]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[60]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[35]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 6);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[41]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 26);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 3);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 3);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 5);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 5);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[54]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[55]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

