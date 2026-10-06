package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mtrodorumatinteprocesso_impl extends GXDataArea
{
   public mtrodorumatinteprocesso_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mtrodorumatinteprocesso_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mtrodorumatinteprocesso_impl.class ));
   }

   public mtrodorumatinteprocesso_impl( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavProforfr = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      chkProForAct = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            Gx_mode = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV7CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
               AV8ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
               AV9ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
               AV10ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
               AV11TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
               AV29ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ForNumCol), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29ForNumCol), "ZZZZZZZ9")));
               AV30ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30ForRelBan", GXutil.ltrimstr( AV30ForRelBan, 7, 2));
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
      nRC_GXsfl_78 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_78"))) ;
      nGXsfl_78_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_78_idx"))) ;
      sGXsfl_78_idx = httpContext.GetPar( "sGXsfl_78_idx") ;
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
      AV7CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV8ForSer = httpContext.GetPar( "ForSer") ;
      AV9ForColNom = httpContext.GetPar( "ForColNom") ;
      AV10ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV11TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV95Acciongridmodificar = (short)(GXutil.lval( httpContext.GetPar( "Acciongridmodificar"))) ;
      AV30ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
      AV52TFProForL = (short)(GXutil.lval( httpContext.GetPar( "TFProForL"))) ;
      AV53TFProForL_To = (short)(GXutil.lval( httpContext.GetPar( "TFProForL_To"))) ;
      AV93TFProForCod = httpContext.GetPar( "TFProForCod") ;
      AV94TFProForCod_Sel = httpContext.GetPar( "TFProForCod_Sel") ;
      AV62TFProForDsc = httpContext.GetPar( "TFProForDsc") ;
      AV63TFProForDsc_Sel = httpContext.GetPar( "TFProForDsc_Sel") ;
      AV64TFProForFR = httpContext.GetPar( "TFProForFR") ;
      AV65TFProForFR_Sel = httpContext.GetPar( "TFProForFR_Sel") ;
      AV68TFProForrbn = CommonUtil.decimalVal( httpContext.GetPar( "TFProForrbn"), ".") ;
      AV69TFProForrbn_To = CommonUtil.decimalVal( httpContext.GetPar( "TFProForrbn_To"), ".") ;
      AV77TFProforFabs = CommonUtil.decimalVal( httpContext.GetPar( "TFProforFabs"), ".") ;
      AV78TFProforFabs_To = CommonUtil.decimalVal( httpContext.GetPar( "TFProforFabs_To"), ".") ;
      AV66TFProFoNPrg = (int)(GXutil.lval( httpContext.GetPar( "TFProFoNPrg"))) ;
      AV67TFProFoNPrg_To = (int)(GXutil.lval( httpContext.GetPar( "TFProFoNPrg_To"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV99Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV29ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
      AV51UsurCod = httpContext.GetPar( "UsurCod") ;
      AV81MForEq = (short)(GXutil.lval( httpContext.GetPar( "MForEq"))) ;
      AV82ValCon = (short)(GXutil.lval( httpContext.GetPar( "ValCon"))) ;
      AV83FlagModC = (short)(GXutil.lval( httpContext.GetPar( "FlagModC"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV95Acciongridmodificar, AV30ForRelBan, AV52TFProForL, AV53TFProForL_To, AV93TFProForCod, AV94TFProForCod_Sel, AV62TFProForDsc, AV63TFProForDsc_Sel, AV64TFProForFR, AV65TFProForFR_Sel, AV68TFProForrbn, AV69TFProForrbn_To, AV77TFProforFabs, AV78TFProforFabs_To, AV66TFProFoNPrg, AV67TFProFoNPrg_To, Gx_mode, AV99Pgmname, AV17OrderedBy, AV18OrderedDsc, AV29ForNumCol, AV51UsurCod, AV81MForEq, AV82ValCon, AV83FlagModC) ;
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
      pa2862( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2862( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.mtrodorumatinteprocesso", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8ForSer)),GXutil.URLEncode(GXutil.rtrim(AV9ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV10ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29ForNumCol,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV30ForRelBan))}, new String[] {"Gx_mode","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForNumCol","ForRelBan"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81MForEq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCON", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82ValCon), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV83FlagModC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29ForNumCol), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MtroDorumaTinteProcesso");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV99Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\mtrodorumatinteprocesso:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_78", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_78, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCOD_DATA", AV79ProForCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCOD_DATA", AV79ProForCod_Data);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "vACCIONGRIDMODIFICAR", GXutil.ltrim( localUtil.ntoc( AV95Acciongridmodificar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV49EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV7CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV8ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV9ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV10ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV11TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORL", GXutil.ltrim( localUtil.ntoc( AV52TFProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORL_TO", GXutil.ltrim( localUtil.ntoc( AV53TFProForL_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD", GXutil.rtrim( AV93TFProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORCOD_SEL", GXutil.rtrim( AV94TFProForCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC", GXutil.rtrim( AV62TFProForDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORDSC_SEL", GXutil.rtrim( AV63TFProForDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORFR", GXutil.rtrim( AV64TFProForFR));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORFR_SEL", GXutil.rtrim( AV65TFProForFR_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORRBN", GXutil.ltrim( localUtil.ntoc( AV68TFProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORRBN_TO", GXutil.ltrim( localUtil.ntoc( AV69TFProForrbn_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORFABS", GXutil.ltrim( localUtil.ntoc( AV77TFProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFORFABS_TO", GXutil.ltrim( localUtil.ntoc( AV78TFProforFabs_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFONPRG", GXutil.ltrim( localUtil.ntoc( AV66TFProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROFONPRG_TO", GXutil.ltrim( localUtil.ntoc( AV67TFProFoNPrg_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vFORNUMCOL", GXutil.ltrim( localUtil.ntoc( AV29ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29ForNumCol), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV86EmprCod_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV87CliCod_Selected, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER_SELECTED", GXutil.rtrim( AV88ForSer_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM_SELECTED", GXutil.rtrim( AV89ForColNom_Selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM_SELECTED", GXutil.ltrim( localUtil.ntoc( AV90ForColNum_Selected, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV91TipColCod_Selected, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORL_SELECTED", GXutil.ltrim( localUtil.ntoc( AV92ProForL_Selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV51UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV50Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vMFOREQ", GXutil.ltrim( localUtil.ntoc( AV81MForEq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81MForEq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV84Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCON", GXutil.ltrim( localUtil.ntoc( AV82ValCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCON", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82ValCon), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODC", GXutil.ltrim( localUtil.ntoc( AV83FlagModC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV83FlagModC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSKGMF", GXutil.ltrim( localUtil.ntoc( AV85CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Cls", GXutil.rtrim( Combo_proforcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Selectedvalue_set", GXutil.rtrim( Combo_proforcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Emptyitem", GXutil.booltostr( Combo_proforcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Selectedvalue_get", GXutil.rtrim( Combo_proforcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we2862( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2862( ) ;
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
      return formatLink("app.formulaciontinte.mtrodorumatinteprocesso", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8ForSer)),GXutil.URLEncode(GXutil.rtrim(AV9ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV10ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV29ForNumCol,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV30ForRelBan))}, new String[] {"Gx_mode","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ForNumCol","ForRelBan"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.MtroDorumaTinteProcesso" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mto Formulas Tinte (Procesos)", "") ;
   }

   public void wb2860( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginBottom10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablepanelfrist_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForrelban_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForrelban_Internalname, httpContext.getMessage( "Rb (ficha Color)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForrelban_Internalname, GXutil.ltrim( localUtil.ntoc( AV30ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForrelban_Enabled!=0) ? localUtil.format( AV30ForRelBan, "ZZZ9.99") : localUtil.format( AV30ForRelBan, "ZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForrelban_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForrelban_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTable_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProforl_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforl_Internalname, "#", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_78_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforl_Internalname, GXutil.ltrim( localUtil.ntoc( AV19ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProforl_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19ProForL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19ProForL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforl_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforl_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedproforcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_proforcod_Internalname, httpContext.getMessage( "Processo", ""), "", "", lblTextblockcombo_proforcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_proforcod.setProperty("Caption", Combo_proforcod_Caption);
         ucCombo_proforcod.setProperty("Cls", Combo_proforcod_Cls);
         ucCombo_proforcod.setProperty("EmptyItem", Combo_proforcod_Emptyitem);
         ucCombo_proforcod.setProperty("DropDownOptionsData", AV79ProForCod_Data);
         ucCombo_proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcod_Internalname, "COMBO_PROFORCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavProforfr.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavProforfr.getInternalname(), httpContext.getMessage( "Rb/FAbs", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_78_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavProforfr, cmbavProforfr.getInternalname(), GXutil.rtrim( AV21ProForFR), 1, cmbavProforfr.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavProforfr.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "", true, (byte)(0), "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         cmbavProforfr.setValue( GXutil.rtrim( AV21ProForFR) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavProforfr.getInternalname(), "Values", cmbavProforfr.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProforrbn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforrbn_Internalname, httpContext.getMessage( "Rb", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_78_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforrbn_Internalname, GXutil.ltrim( localUtil.ntoc( AV22ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProforrbn_Enabled!=0) ? localUtil.format( AV22ProForrbn, "ZZ9.99") : localUtil.format( AV22ProForrbn, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforrbn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforrbn_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProforfabs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProforfabs_Internalname, httpContext.getMessage( "FAbs", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_78_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforfabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV23ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProforfabs_Enabled!=0) ? localUtil.format( AV23ProforFabs, "ZZ9.99") : localUtil.format( AV23ProforFabs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforfabs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProforfabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavProfonprg_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavProfonprg_Internalname, httpContext.getMessage( "Nº Programa", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_78_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProfonprg_Internalname, GXutil.ltrim( localUtil.ntoc( AV24ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavProfonprg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24ProFoNPrg), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24ProFoNPrg), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProfonprg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavProfonprg_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         wb_table1_55_2862( true) ;
      }
      else
      {
         wb_table1_55_2862( false) ;
      }
      return  ;
   }

   public void wb_table1_55_2862e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol78( ) ;
      }
      if ( wbEnd == 78 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_78 = (int)(nGXsfl_78_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV99Pgmname), GXutil.rtrim( localUtil.format( AV99Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_78_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavProforcod_Internalname, GXutil.rtrim( AV20ProForCod), GXutil.rtrim( localUtil.format( AV20ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavProforcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavProforcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
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
         wb_table2_116_2862( true) ;
      }
      else
      {
         wb_table2_116_2862( false) ;
      }
      return  ;
   }

   public void wb_table2_116_2862e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 78 )
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

   public void start2862( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mto Formulas Tinte (Procesos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2860( ) ;
   }

   public void ws2862( )
   {
      start2862( ) ;
      evt2862( ) ;
   }

   public void evt2862( )
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
                           e112862 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122862 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132862 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142862 ();
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
                                 e152862 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCOLORANTESWP'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoColorantesWp' */
                           e162862 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPRODUCTOSWP'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoProductosWp' */
                           e172862 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOOBSERVACIONES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoObservaciones' */
                           e182862 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e192862 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROFORL.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202862 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'DOINSERT'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "PROFORL.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "PROFORL.CLICK") == 0 ) )
                        {
                           nGXsfl_78_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_782( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV48GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6061ProForLab = httpContext.cgiGet( edtProForLab_Internalname) ;
                           A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
                           A6549ProForFR = httpContext.cgiGet( edtProForFR_Internalname) ;
                           A8656ProForrbn = localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)) ;
                           A14198ProforFabs = localUtil.ctond( httpContext.cgiGet( edtProforFabs_Internalname)) ;
                           A7802ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( edtProForVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A9707ProForMq = httpContext.cgiGet( edtProForMq_Internalname) ;
                           A10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtProForH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13133ProForAct = ((GXutil.strcmp(httpContext.cgiGet( chkProForAct.getInternalname()), "S")==0) ? "S" : "N") ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e212862 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e222862 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232862 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242862 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoInsert' */
                                 e252862 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "PROFORL.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e262862 ();
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

   public void we2862( )
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

   public void pa2862( )
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
            GX_FocusControl = edtavProforl_Internalname ;
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
      subsflControlProps_782( ) ;
      while ( nGXsfl_78_idx <= nRC_GXsfl_78 )
      {
         sendrow_782( ) ;
         nGXsfl_78_idx = ((subGrid_Islastpage==1)&&(nGXsfl_78_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_78_idx+1) ;
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_782( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV49EmprCod ,
                                 int AV7CliCod ,
                                 String AV8ForSer ,
                                 String AV9ForColNom ,
                                 int AV10ForColNum ,
                                 byte AV11TipColCod ,
                                 short AV95Acciongridmodificar ,
                                 java.math.BigDecimal AV30ForRelBan ,
                                 short AV52TFProForL ,
                                 short AV53TFProForL_To ,
                                 String AV93TFProForCod ,
                                 String AV94TFProForCod_Sel ,
                                 String AV62TFProForDsc ,
                                 String AV63TFProForDsc_Sel ,
                                 String AV64TFProForFR ,
                                 String AV65TFProForFR_Sel ,
                                 java.math.BigDecimal AV68TFProForrbn ,
                                 java.math.BigDecimal AV69TFProForrbn_To ,
                                 java.math.BigDecimal AV77TFProforFabs ,
                                 java.math.BigDecimal AV78TFProforFabs_To ,
                                 int AV66TFProFoNPrg ,
                                 int AV67TFProFoNPrg_To ,
                                 String Gx_mode ,
                                 String AV99Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 int AV29ForNumCol ,
                                 String AV51UsurCod ,
                                 short AV81MForEq ,
                                 short AV82ValCon ,
                                 short AV83FlagModC )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e222862 ();
      GRID_nCurrentRecord = 0 ;
      rf2862( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MtroDorumaTinteProcesso");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV99Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\mtrodorumatinteprocesso:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A494ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORSER", GXutil.rtrim( A494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A482ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOLNOM", GXutil.rtrim( A482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOLNUM", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORL", GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), ".", "")));
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
      if ( cmbavProforfr.getItemCount() > 0 )
      {
         AV21ProForFR = cmbavProforfr.getValidValue(AV21ProForFR) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ProForFR", AV21ProForFR);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavProforfr.setValue( GXutil.rtrim( AV21ProForFR) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavProforfr.getInternalname(), "Values", cmbavProforfr.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2862( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV99Pgmname = "FormulacionTinte.MtroDorumaTinteProcesso" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Pgmname", AV99Pgmname);
      Gx_err = (short)(0) ;
      edtavForrelban_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForrelban_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrelban_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2862( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(78) ;
      /* Execute user event: Refresh */
      e222862 ();
      nGXsfl_78_idx = 1 ;
      sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_782( ) ;
      bGXsfl_78_Refreshing = true ;
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
         subsflControlProps_782( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) ,
                                              Short.valueOf(AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) ,
                                              AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                              AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                              AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                              AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                              AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                              AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                              AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                              AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                              AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                              AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                              Integer.valueOf(AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) ,
                                              Integer.valueOf(AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) ,
                                              Short.valueOf(A1160ProForL) ,
                                              A764ProForCod ,
                                              A766ProForDsc ,
                                              A6549ProForFR ,
                                              A8656ProForrbn ,
                                              A14198ProforFabs ,
                                              Integer.valueOf(A7802ProFoNPrg) ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              AV49EmprCod ,
                                              Integer.valueOf(AV7CliCod) ,
                                              AV8ForSer ,
                                              AV9ForColNom ,
                                              Integer.valueOf(AV10ForColNum) ,
                                              Byte.valueOf(AV11TipColCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              A494ForSer ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              Byte.valueOf(A831TipColCod) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE
                                              }
         });
         lV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod), 6, "%") ;
         lV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc), 30, "%") ;
         lV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr), 1, "%") ;
         /* Using cursor H02862 */
         pr_default.execute(0, new Object[] {AV49EmprCod, Integer.valueOf(AV7CliCod), AV8ForSer, AV9ForColNom, Integer.valueOf(AV10ForColNum), Byte.valueOf(AV11TipColCod), Short.valueOf(AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl), Short.valueOf(AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to), lV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod, AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel, lV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc, AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel, lV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr, AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel, AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn, AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to, AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs, AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to, Integer.valueOf(AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg), Integer.valueOf(AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_78_idx = 1 ;
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_782( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A13133ProForAct = H02862_A13133ProForAct[0] ;
            A10542ProForH2O = H02862_A10542ProForH2O[0] ;
            A9707ProForMq = H02862_A9707ProForMq[0] ;
            A9704ProForVol = H02862_A9704ProForVol[0] ;
            A7802ProFoNPrg = H02862_A7802ProFoNPrg[0] ;
            A14198ProforFabs = H02862_A14198ProforFabs[0] ;
            A8656ProForrbn = H02862_A8656ProForrbn[0] ;
            A6549ProForFR = H02862_A6549ProForFR[0] ;
            A766ProForDsc = H02862_A766ProForDsc[0] ;
            A764ProForCod = H02862_A764ProForCod[0] ;
            A6061ProForLab = H02862_A6061ProForLab[0] ;
            A1160ProForL = H02862_A1160ProForL[0] ;
            A831TipColCod = H02862_A831TipColCod[0] ;
            A483ForColNum = H02862_A483ForColNum[0] ;
            A482ForColNom = H02862_A482ForColNom[0] ;
            A494ForSer = H02862_A494ForSer[0] ;
            A252CliCod = H02862_A252CliCod[0] ;
            A396EmprCod = H02862_A396EmprCod[0] ;
            A13133ProForAct = H02862_A13133ProForAct[0] ;
            A766ProForDsc = H02862_A766ProForDsc[0] ;
            A6061ProForLab = H02862_A6061ProForLab[0] ;
            e232862 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(78) ;
         wb2860( ) ;
      }
      bGXsfl_78_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2862( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_78_idx, getSecureSignedToken( sGXsfl_78_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORSER"+"_"+sGXsfl_78_idx, getSecureSignedToken( sGXsfl_78_idx, GXutil.rtrim( localUtil.format( A494ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNOM"+"_"+sGXsfl_78_idx, getSecureSignedToken( sGXsfl_78_idx, GXutil.rtrim( localUtil.format( A482ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNUM"+"_"+sGXsfl_78_idx, getSecureSignedToken( sGXsfl_78_idx, localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPCOLCOD"+"_"+sGXsfl_78_idx, getSecureSignedToken( sGXsfl_78_idx, localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROFORL"+"_"+sGXsfl_78_idx, getSecureSignedToken( sGXsfl_78_idx, localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV51UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMFOREQ", GXutil.ltrim( localUtil.ntoc( AV81MForEq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81MForEq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCON", GXutil.ltrim( localUtil.ntoc( AV82ValCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCON", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82ValCon), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODC", GXutil.ltrim( localUtil.ntoc( AV83FlagModC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGMODC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV83FlagModC), "ZZZ9")));
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
      AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV52TFProForL ;
      AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV53TFProForL_To ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV93TFProForCod ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV94TFProForCod_Sel ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV62TFProForDsc ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV63TFProForDsc_Sel ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV64TFProForFR ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV65TFProForFR_Sel ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV68TFProForrbn ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV69TFProForrbn_To ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV77TFProforFabs ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV78TFProforFabs_To ;
      AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV66TFProFoNPrg ;
      AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV67TFProFoNPrg_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) ,
                                           Short.valueOf(AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) ,
                                           AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                           AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                           AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                           AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                           AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                           AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                           AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                           AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                           AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                           AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                           Integer.valueOf(AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) ,
                                           Integer.valueOf(AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) ,
                                           Short.valueOf(A1160ProForL) ,
                                           A764ProForCod ,
                                           A766ProForDsc ,
                                           A6549ProForFR ,
                                           A8656ProForrbn ,
                                           A14198ProforFabs ,
                                           Integer.valueOf(A7802ProFoNPrg) ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           AV49EmprCod ,
                                           Integer.valueOf(AV7CliCod) ,
                                           AV8ForSer ,
                                           AV9ForColNom ,
                                           Integer.valueOf(AV10ForColNum) ,
                                           Byte.valueOf(AV11TipColCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           A494ForSer ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           Byte.valueOf(A831TipColCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE
                                           }
      });
      lV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = GXutil.padr( GXutil.rtrim( AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod), 6, "%") ;
      lV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = GXutil.padr( GXutil.rtrim( AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc), 30, "%") ;
      lV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = GXutil.padr( GXutil.rtrim( AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr), 1, "%") ;
      /* Using cursor H02863 */
      pr_default.execute(1, new Object[] {AV49EmprCod, Integer.valueOf(AV7CliCod), AV8ForSer, AV9ForColNom, Integer.valueOf(AV10ForColNum), Byte.valueOf(AV11TipColCod), Short.valueOf(AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl), Short.valueOf(AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to), lV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod, AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel, lV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc, AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel, lV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr, AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel, AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn, AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to, AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs, AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to, Integer.valueOf(AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg), Integer.valueOf(AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to)});
      GRID_nRecordCount = H02863_AGRID_nRecordCount[0] ;
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
      AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV52TFProForL ;
      AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV53TFProForL_To ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV93TFProForCod ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV94TFProForCod_Sel ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV62TFProForDsc ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV63TFProForDsc_Sel ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV64TFProForFR ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV65TFProForFR_Sel ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV68TFProForrbn ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV69TFProForrbn_To ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV77TFProforFabs ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV78TFProforFabs_To ;
      AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV66TFProFoNPrg ;
      AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV67TFProFoNPrg_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV95Acciongridmodificar, AV30ForRelBan, AV52TFProForL, AV53TFProForL_To, AV93TFProForCod, AV94TFProForCod_Sel, AV62TFProForDsc, AV63TFProForDsc_Sel, AV64TFProForFR, AV65TFProForFR_Sel, AV68TFProForrbn, AV69TFProForrbn_To, AV77TFProforFabs, AV78TFProforFabs_To, AV66TFProFoNPrg, AV67TFProFoNPrg_To, Gx_mode, AV99Pgmname, AV17OrderedBy, AV18OrderedDsc, AV29ForNumCol, AV51UsurCod, AV81MForEq, AV82ValCon, AV83FlagModC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV52TFProForL ;
      AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV53TFProForL_To ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV93TFProForCod ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV94TFProForCod_Sel ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV62TFProForDsc ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV63TFProForDsc_Sel ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV64TFProForFR ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV65TFProForFR_Sel ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV68TFProForrbn ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV69TFProForrbn_To ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV77TFProforFabs ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV78TFProforFabs_To ;
      AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV66TFProFoNPrg ;
      AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV67TFProFoNPrg_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV95Acciongridmodificar, AV30ForRelBan, AV52TFProForL, AV53TFProForL_To, AV93TFProForCod, AV94TFProForCod_Sel, AV62TFProForDsc, AV63TFProForDsc_Sel, AV64TFProForFR, AV65TFProForFR_Sel, AV68TFProForrbn, AV69TFProForrbn_To, AV77TFProforFabs, AV78TFProforFabs_To, AV66TFProFoNPrg, AV67TFProFoNPrg_To, Gx_mode, AV99Pgmname, AV17OrderedBy, AV18OrderedDsc, AV29ForNumCol, AV51UsurCod, AV81MForEq, AV82ValCon, AV83FlagModC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV52TFProForL ;
      AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV53TFProForL_To ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV93TFProForCod ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV94TFProForCod_Sel ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV62TFProForDsc ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV63TFProForDsc_Sel ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV64TFProForFR ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV65TFProForFR_Sel ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV68TFProForrbn ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV69TFProForrbn_To ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV77TFProforFabs ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV78TFProforFabs_To ;
      AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV66TFProFoNPrg ;
      AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV67TFProFoNPrg_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV95Acciongridmodificar, AV30ForRelBan, AV52TFProForL, AV53TFProForL_To, AV93TFProForCod, AV94TFProForCod_Sel, AV62TFProForDsc, AV63TFProForDsc_Sel, AV64TFProForFR, AV65TFProForFR_Sel, AV68TFProForrbn, AV69TFProForrbn_To, AV77TFProforFabs, AV78TFProforFabs_To, AV66TFProFoNPrg, AV67TFProFoNPrg_To, Gx_mode, AV99Pgmname, AV17OrderedBy, AV18OrderedDsc, AV29ForNumCol, AV51UsurCod, AV81MForEq, AV82ValCon, AV83FlagModC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV52TFProForL ;
      AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV53TFProForL_To ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV93TFProForCod ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV94TFProForCod_Sel ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV62TFProForDsc ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV63TFProForDsc_Sel ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV64TFProForFR ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV65TFProForFR_Sel ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV68TFProForrbn ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV69TFProForrbn_To ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV77TFProforFabs ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV78TFProforFabs_To ;
      AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV66TFProFoNPrg ;
      AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV67TFProFoNPrg_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV95Acciongridmodificar, AV30ForRelBan, AV52TFProForL, AV53TFProForL_To, AV93TFProForCod, AV94TFProForCod_Sel, AV62TFProForDsc, AV63TFProForDsc_Sel, AV64TFProForFR, AV65TFProForFR_Sel, AV68TFProForrbn, AV69TFProForrbn_To, AV77TFProforFabs, AV78TFProforFabs_To, AV66TFProFoNPrg, AV67TFProFoNPrg_To, Gx_mode, AV99Pgmname, AV17OrderedBy, AV18OrderedDsc, AV29ForNumCol, AV51UsurCod, AV81MForEq, AV82ValCon, AV83FlagModC) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV52TFProForL ;
      AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV53TFProForL_To ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV93TFProForCod ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV94TFProForCod_Sel ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV62TFProForDsc ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV63TFProForDsc_Sel ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV64TFProForFR ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV65TFProForFR_Sel ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV68TFProForrbn ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV69TFProForrbn_To ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV77TFProforFabs ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV78TFProforFabs_To ;
      AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV66TFProFoNPrg ;
      AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV67TFProFoNPrg_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV95Acciongridmodificar, AV30ForRelBan, AV52TFProForL, AV53TFProForL_To, AV93TFProForCod, AV94TFProForCod_Sel, AV62TFProForDsc, AV63TFProForDsc_Sel, AV64TFProForFR, AV65TFProForFR_Sel, AV68TFProForrbn, AV69TFProForrbn_To, AV77TFProforFabs, AV78TFProforFabs_To, AV66TFProFoNPrg, AV67TFProFoNPrg_To, Gx_mode, AV99Pgmname, AV17OrderedBy, AV18OrderedDsc, AV29ForNumCol, AV51UsurCod, AV81MForEq, AV82ValCon, AV83FlagModC) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV99Pgmname = "FormulacionTinte.MtroDorumaTinteProcesso" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99Pgmname", AV99Pgmname);
      Gx_err = (short)(0) ;
      edtavForrelban_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForrelban_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForrelban_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2860( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e212862 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCOD_DATA"), AV79ProForCod_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_78 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_78"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV11TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vTIPCOLCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV10ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "vFORCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV9ForColNom = httpContext.cgiGet( "vFORCOLNOM") ;
         AV8ForSer = httpContext.cgiGet( "vFORSER") ;
         AV7CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV83FlagModC = (short)(localUtil.ctol( httpContext.cgiGet( "vFLAGMODC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV82ValCon = (short)(localUtil.ctol( httpContext.cgiGet( "vVALCON"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV29ForNumCol = (int)(localUtil.ctol( httpContext.cgiGet( "vFORNUMCOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV49EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_proforcod_Cls = httpContext.cgiGet( "COMBO_PROFORCOD_Cls") ;
         Combo_proforcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_set") ;
         Combo_proforcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitem")) ;
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
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
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
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProforl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProforl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFORL");
            GX_FocusControl = edtavProforl_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19ProForL = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ProForL), 4, 0));
         }
         else
         {
            AV19ProForL = (short)(localUtil.ctol( httpContext.cgiGet( edtavProforl_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ProForL), 4, 0));
         }
         cmbavProforfr.setName( cmbavProforfr.getInternalname() );
         cmbavProforfr.setValue( httpContext.cgiGet( cmbavProforfr.getInternalname()) );
         AV21ProForFR = httpContext.cgiGet( cmbavProforfr.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ProForFR", AV21ProForFR);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavProforrbn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavProforrbn_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFORRBN");
            GX_FocusControl = edtavProforrbn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22ProForrbn = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ProForrbn", GXutil.ltrimstr( AV22ProForrbn, 6, 2));
         }
         else
         {
            AV22ProForrbn = localUtil.ctond( httpContext.cgiGet( edtavProforrbn_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ProForrbn", GXutil.ltrimstr( AV22ProForrbn, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavProforfabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavProforfabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFORFABS");
            GX_FocusControl = edtavProforfabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23ProforFabs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23ProforFabs", GXutil.ltrimstr( AV23ProforFabs, 6, 2));
         }
         else
         {
            AV23ProforFabs = localUtil.ctond( httpContext.cgiGet( edtavProforfabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23ProforFabs", GXutil.ltrimstr( AV23ProforFabs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavProfonprg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavProfonprg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPROFONPRG");
            GX_FocusControl = edtavProfonprg_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24ProFoNPrg = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ProFoNPrg), 5, 0));
         }
         else
         {
            AV24ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtavProfonprg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ProFoNPrg), 5, 0));
         }
         AV99Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99Pgmname", AV99Pgmname);
         AV20ProForCod = httpContext.cgiGet( edtavProforcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20ProForCod", AV20ProForCod);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MtroDorumaTinteProcesso");
         AV99Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99Pgmname", AV99Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV99Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\mtrodorumatinteprocesso:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e212862 ();
      if (returnInSub) return;
   }

   public void e212862( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mtrodorumatinteprocesso_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
      GXv_char2[0] = AV49EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char2[0] ;
      mtrodorumatinteprocesso_impl.this.AV25EmprNom = GXv_char3[0] ;
      mtrodorumatinteprocesso_impl.this.AV51UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV51UsurCod", AV51UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51UsurCod, "@!"))));
      edtavProforcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavProforcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavProforcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPROFORCOD' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mto Formulas Tinte (Procesos)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV81MForEq) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV49EmprCod, httpContext.getMessage( "MFOREQ", ""), GXv_int8) ;
      mtrodorumatinteprocesso_impl.this.GXt_int7 = GXv_int8[0] ;
      AV81MForEq = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81MForEq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81MForEq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81MForEq), "ZZZ9")));
      GXt_int9 = AV82ValCon ;
      GXv_char4[0] = AV49EmprCod ;
      GXv_char3[0] = "030100" ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.GXt_int9 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      AV82ValCon = (short)(GXt_int9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82ValCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82ValCon), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCON", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82ValCon), "ZZZ9")));
      AV95Acciongridmodificar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Acciongridmodificar), 4, 0));
   }

   public void e222862( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      if ( AV95Acciongridmodificar == 1 )
      {
         AV95Acciongridmodificar = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Acciongridmodificar), 4, 0));
      }
      else
      {
         GXt_int11 = AV19ProForL ;
         GXv_int12[0] = GXt_int11 ;
         new app.formulaciontinte.getmtoforumatinteprocesso(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, GXv_int12) ;
         mtrodorumatinteprocesso_impl.this.GXt_int11 = GXv_int12[0] ;
         AV19ProForL = GXt_int11 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ProForL), 4, 0));
         AV22ProForrbn = AV30ForRelBan ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22ProForrbn", GXutil.ltrimstr( AV22ProForrbn, 6, 2));
      }
      GXv_SdtWWPContext13[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV6WWPContext = GXv_SdtWWPContext13[0] ;
      /* Execute user subroutine: 'CHECKSECURITYFORACTIONS' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl = AV52TFProForL ;
      AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to = AV53TFProForL_To ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = AV93TFProForCod ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = AV94TFProForCod_Sel ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = AV62TFProForDsc ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = AV63TFProForDsc_Sel ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = AV64TFProForFR ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = AV65TFProForFR_Sel ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = AV68TFProForrbn ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = AV69TFProForrbn_To ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = AV77TFProforFabs ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = AV78TFProforFabs_To ;
      AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg = AV66TFProFoNPrg ;
      AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to = AV67TFProFoNPrg_To ;
      /*  Sending Event outputs  */
   }

   public void e112862( )
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

   public void e122862( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132862( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForL") == 0 )
         {
            AV52TFProForL = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFProForL), 4, 0));
            AV53TFProForL_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFProForL_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFProForL_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForCod") == 0 )
         {
            AV93TFProForCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFProForCod", AV93TFProForCod);
            AV94TFProForCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFProForCod_Sel", AV94TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForDsc") == 0 )
         {
            AV62TFProForDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFProForDsc", AV62TFProForDsc);
            AV63TFProForDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFProForDsc_Sel", AV63TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForFR") == 0 )
         {
            AV64TFProForFR = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFProForFR", AV64TFProForFR);
            AV65TFProForFR_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFProForFR_Sel", AV65TFProForFR_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProForrbn") == 0 )
         {
            AV68TFProForrbn = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFProForrbn", GXutil.ltrimstr( AV68TFProForrbn, 6, 2));
            AV69TFProForrbn_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFProForrbn_To", GXutil.ltrimstr( AV69TFProForrbn_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProforFabs") == 0 )
         {
            AV77TFProforFabs = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFProforFabs", GXutil.ltrimstr( AV77TFProforFabs, 6, 2));
            AV78TFProforFabs_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFProforFabs_To", GXutil.ltrimstr( AV78TFProforFabs_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProFoNPrg") == 0 )
         {
            AV66TFProFoNPrg = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFProFoNPrg), 5, 0));
            AV67TFProFoNPrg_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFProFoNPrg_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFProFoNPrg_To), 5, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e232862( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Ver Proceso", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(78) ;
      }
      sendrow_782( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_78_Refreshing )
      {
         httpContext.doAjaxLoad(78, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
   }

   public void e242862( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV48GridActions == 1 )
      {
         /* Execute user subroutine: 'DO USERACTION1' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV48GridActions == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S182 ();
         if (returnInSub) return;
      }
      AV48GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142862( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e152862 ();
      if (returnInSub) return;
   }

   public void e152862( )
   {
      /* Enter Routine */
      returnInSub = false ;
      new app.setmtoformulatinteprocesso(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV19ProForL, AV20ProForCod, AV21ProForFR, AV22ProForrbn, AV23ProforFabs, AV24ProFoNPrg, AV30ForRelBan) ;
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV51UsurCod, AV50Station) ;
      if ( AV81MForEq == 1 )
      {
         GXv_char4[0] = AV49EmprCod ;
         GXv_int10[0] = AV7CliCod ;
         GXv_char3[0] = AV8ForSer ;
         GXv_char2[0] = AV9ForColNom ;
         GXv_int14[0] = AV10ForColNum ;
         GXv_int8[0] = AV11TipColCod ;
         new app.gestionlaboratorio.pmforeq(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3, GXv_char2, GXv_int14, GXv_int8) ;
         mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char4[0] ;
         mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int10[0] ;
         mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char3[0] ;
         mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char2[0] ;
         mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
         mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      }
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV51UsurCod, AV50Station) ;
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char4[0] = AV49EmprCod ;
      GXv_int14[0] = AV7CliCod ;
      GXv_char3[0] = AV8ForSer ;
      GXv_char2[0] = AV9ForColNom ;
      GXv_int10[0] = AV10ForColNum ;
      GXv_int8[0] = AV11TipColCod ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int16[0] = (int)(DecimalUtil.decToDouble(AV30ForRelBan)) ;
      GXv_char17[0] = " " ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int14, GXv_char3, GXv_char2, GXv_int10, GXv_int8, GXv_decimal15, GXv_int16, GXv_char17, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int14[0] ;
      mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char3[0] ;
      mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char2[0] ;
      mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int10[0] ;
      mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
      mtrodorumatinteprocesso_impl.this.AV30ForRelBan = DecimalUtil.doubleToDec(GXv_int16[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForRelBan", GXutil.ltrimstr( AV30ForRelBan, 7, 2));
      GXv_char17[0] = A396EmprCod ;
      GXv_char4[0] = AV50Station ;
      GXv_decimal18[0] = AV84Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char17, GXv_char4, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.A396EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV50Station = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV84Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV84Valor_cor", GXutil.ltrimstr( AV84Valor_cor, 11, 5));
      GXv_char17[0] = AV49EmprCod ;
      GXv_int16[0] = AV7CliCod ;
      GXv_char4[0] = AV8ForSer ;
      GXv_char3[0] = AV9ForColNom ;
      GXv_int14[0] = AV10ForColNum ;
      GXv_int8[0] = AV11TipColCod ;
      GXv_decimal18[0] = AV84Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int14, GXv_int8, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int16[0] ;
      mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char3[0] ;
      mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
      mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
      mtrodorumatinteprocesso_impl.this.AV84Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV84Valor_cor", GXutil.ltrimstr( AV84Valor_cor, 11, 5));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV84Valor_cor, 11, 5) );
      AV19ProForL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ProForL), 4, 0));
      AV21ProForFR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ProForFR", AV21ProForFR);
      AV22ProForrbn = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ProForrbn", GXutil.ltrimstr( AV22ProForrbn, 6, 2));
      AV23ProforFabs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23ProforFabs", GXutil.ltrimstr( AV23ProforFabs, 6, 2));
      AV24ProFoNPrg = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ProFoNPrg), 5, 0));
      AV20ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ProForCod", AV20ProForCod);
      Combo_proforcod_Selectedvalue_set = GXutil.trim( AV20ProForCod) ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
      GX_FocusControl = edtavProforl_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavProforfr.setValue( GXutil.rtrim( AV21ProForFR) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavProforfr.getInternalname(), "Values", cmbavProforfr.ToJavascriptSource(), true);
   }

   public void e162862( )
   {
      /* 'DoColorantesWp' Routine */
      returnInSub = false ;
      GXt_decimal19 = AV85CosKgmF ;
      GXv_decimal18[0] = GXt_decimal19 ;
      new app.formulaciontinte.getcoskgmf(remoteHandle, context).execute( AV49EmprCod, AV29ForNumCol, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.GXt_decimal19 = GXv_decimal18[0] ;
      AV85CosKgmF = GXt_decimal19 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85CosKgmF", GXutil.ltrimstr( AV85CosKgmF, 13, 5));
      httpContext.popup(formatLink("app.formulaciontinte.colorcolorantes__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82ValCon,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV83FlagModC,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8ForSer)),GXutil.URLEncode(GXutil.rtrim(AV9ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV10ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV30ForRelBan)),GXutil.URLEncode(DecimalUtil.decToString(AV85CosKgmF))}, new String[] {"EmprCod","ForNumCol","ContNum","FlagMod","ForOpcCli","Clicod","Forser","Forcolnom","ForcolNum","Tipcolcod","ForRelBan","CosKgmF"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e172862( )
   {
      /* 'DoProductosWp' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.colorproductosvariables__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV29ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV82ValCon,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV83FlagModC,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8ForSer)),GXutil.URLEncode(GXutil.rtrim(AV9ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV10ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipColCod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV30ForRelBan)),GXutil.URLEncode(DecimalUtil.decToString(AV85CosKgmF))}, new String[] {"EmprCod","ForNumCol","ValCon","FlagModC","Clicod","Forser","Forcolnom","Forcolnum","TipColcod","ForRelBan","CosKgmF"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e182862( )
   {
      /* 'DoObservaciones' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.tobsfor", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8ForSer)),GXutil.URLEncode(GXutil.rtrim(AV9ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV10ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipColCod,2,0))}, new String[] {"Mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e192862( )
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

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'CHECKSECURITYFORACTIONS' Routine */
      returnInSub = false ;
      if ( ! ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) ) )
      {
         bttBtnobservaciones_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtnobservaciones_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnobservaciones_Visible), 5, 0), true);
      }
   }

   public void S172( )
   {
      /* 'DO USERACTION1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.verprocesoquimico", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A764ProForCod)),GXutil.URLEncode(GXutil.rtrim(A766ProForDsc))}, new String[] {"EmprCod","ProForCod","ProForDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV86EmprCod_Selected = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86EmprCod_Selected", AV86EmprCod_Selected);
      AV87CliCod_Selected = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87CliCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87CliCod_Selected), 6, 0));
      AV88ForSer_Selected = A494ForSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88ForSer_Selected", AV88ForSer_Selected);
      AV89ForColNom_Selected = A482ForColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89ForColNom_Selected", AV89ForColNom_Selected);
      AV90ForColNum_Selected = A483ForColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90ForColNum_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90ForColNum_Selected), 6, 0));
      AV91TipColCod_Selected = A831TipColCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91TipColCod_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91TipColCod_Selected), 2, 0));
      AV92ProForL_Selected = A1160ProForL ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92ProForL_Selected", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92ProForL_Selected), 4, 0));
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S192( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.delmtoformulatinteprocesso(remoteHandle, context).execute( AV86EmprCod_Selected, AV87CliCod_Selected, AV88ForSer_Selected, AV89ForColNom_Selected, AV90ForColNum_Selected, AV91TipColCod_Selected, AV92ProForL_Selected) ;
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV51UsurCod, AV50Station) ;
      if ( AV81MForEq == 1 )
      {
         GXv_char17[0] = AV49EmprCod ;
         GXv_int16[0] = AV7CliCod ;
         GXv_char4[0] = AV8ForSer ;
         GXv_char3[0] = AV9ForColNom ;
         GXv_int14[0] = AV10ForColNum ;
         GXv_int8[0] = AV11TipColCod ;
         new app.gestionlaboratorio.pmforeq(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int14, GXv_int8) ;
         mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char17[0] ;
         mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int16[0] ;
         mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char4[0] ;
         mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char3[0] ;
         mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
         mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      }
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV51UsurCod, AV50Station) ;
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char17[0] = AV49EmprCod ;
      GXv_int16[0] = AV7CliCod ;
      GXv_char4[0] = AV8ForSer ;
      GXv_char3[0] = AV9ForColNom ;
      GXv_int14[0] = AV10ForColNum ;
      GXv_int8[0] = AV11TipColCod ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int10[0] = (int)(DecimalUtil.decToDouble(AV30ForRelBan)) ;
      GXv_char2[0] = " " ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int14, GXv_int8, GXv_decimal18, GXv_int10, GXv_char2, GXv_decimal15) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int16[0] ;
      mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char3[0] ;
      mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
      mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
      mtrodorumatinteprocesso_impl.this.AV30ForRelBan = DecimalUtil.doubleToDec(GXv_int10[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForRelBan", GXutil.ltrimstr( AV30ForRelBan, 7, 2));
      GXv_char17[0] = A396EmprCod ;
      GXv_char4[0] = AV50Station ;
      GXv_decimal18[0] = AV84Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char17, GXv_char4, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.A396EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV50Station = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV84Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV84Valor_cor", GXutil.ltrimstr( AV84Valor_cor, 11, 5));
      GXv_char17[0] = AV49EmprCod ;
      GXv_int16[0] = AV7CliCod ;
      GXv_char4[0] = AV8ForSer ;
      GXv_char3[0] = AV9ForColNom ;
      GXv_int14[0] = AV10ForColNum ;
      GXv_int8[0] = AV11TipColCod ;
      GXv_decimal18[0] = AV84Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int14, GXv_int8, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int16[0] ;
      mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char3[0] ;
      mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
      mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
      mtrodorumatinteprocesso_impl.this.AV84Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV84Valor_cor", GXutil.ltrimstr( AV84Valor_cor, 11, 5));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV84Valor_cor, 11, 5) );
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue(AV99Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV99Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV31Session.getValue(AV99Pgmname+"GridState"), null, null);
      }
      AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
      AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18OrderedDsc", AV18OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORL") == 0 )
         {
            AV52TFProForL = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFProForL), 4, 0));
            AV53TFProForL_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFProForL_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFProForL_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD") == 0 )
         {
            AV93TFProForCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFProForCod", AV93TFProForCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORCOD_SEL") == 0 )
         {
            AV94TFProForCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94TFProForCod_Sel", AV94TFProForCod_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC") == 0 )
         {
            AV62TFProForDsc = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFProForDsc", AV62TFProForDsc);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORDSC_SEL") == 0 )
         {
            AV63TFProForDsc_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFProForDsc_Sel", AV63TFProForDsc_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORFR") == 0 )
         {
            AV64TFProForFR = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFProForFR", AV64TFProForFR);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORFR_SEL") == 0 )
         {
            AV65TFProForFR_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFProForFR_Sel", AV65TFProForFR_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORRBN") == 0 )
         {
            AV68TFProForrbn = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFProForrbn", GXutil.ltrimstr( AV68TFProForrbn, 6, 2));
            AV69TFProForrbn_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFProForrbn_To", GXutil.ltrimstr( AV69TFProForrbn_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFORFABS") == 0 )
         {
            AV77TFProforFabs = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFProforFabs", GXutil.ltrimstr( AV77TFProforFabs, 6, 2));
            AV78TFProforFabs_To = CommonUtil.decimalVal( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFProforFabs_To", GXutil.ltrimstr( AV78TFProforFabs_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROFONPRG") == 0 )
         {
            AV66TFProFoNPrg = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TFProFoNPrg), 5, 0));
            AV67TFProFoNPrg_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFProFoNPrg_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67TFProFoNPrg_To), 5, 0));
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char17[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV94TFProForCod_Sel)==0), AV94TFProForCod_Sel, GXv_char17) ;
      mtrodorumatinteprocesso_impl.this.GXt_char1 = GXv_char17[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFProForDsc_Sel)==0), AV63TFProForDsc_Sel, GXv_char4) ;
      mtrodorumatinteprocesso_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char21 = "" ;
      GXv_char3[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFProForFR_Sel)==0), AV65TFProForFR_Sel, GXv_char3) ;
      mtrodorumatinteprocesso_impl.this.GXt_char21 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char20+"|"+GXt_char21+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char21 = "" ;
      GXv_char17[0] = GXt_char21 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV93TFProForCod)==0), AV93TFProForCod, GXv_char17) ;
      mtrodorumatinteprocesso_impl.this.GXt_char21 = GXv_char17[0] ;
      GXt_char20 = "" ;
      GXv_char4[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFProForDsc)==0), AV62TFProForDsc, GXv_char4) ;
      mtrodorumatinteprocesso_impl.this.GXt_char20 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFProForFR)==0), AV64TFProForFR, GXv_char3) ;
      mtrodorumatinteprocesso_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV52TFProForL) ? "" : GXutil.str( AV52TFProForL, 4, 0))+"|"+GXt_char21+"|"+GXt_char20+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFProForrbn)==0) ? "" : GXutil.str( AV68TFProForrbn, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFProforFabs)==0) ? "" : GXutil.str( AV77TFProforFabs, 6, 2))+"|"+((0==AV66TFProFoNPrg) ? "" : GXutil.str( AV66TFProFoNPrg, 5, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV53TFProForL_To) ? "" : GXutil.str( AV53TFProForL_To, 4, 0))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFProForrbn_To)==0) ? "" : GXutil.str( AV69TFProForrbn_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFProforFabs_To)==0) ? "" : GXutil.str( AV78TFProforFabs_To, 6, 2))+"|"+((0==AV67TFProFoNPrg_To) ? "" : GXutil.str( AV67TFProFoNPrg_To, 5, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV15GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV15GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV15GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV31Session.getValue(AV99Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFORL", "", !((0==AV52TFProForL)&&(0==AV53TFProForL_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFProForL, 4, 0)), GXutil.trim( GXutil.str( AV53TFProForL_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFORCOD", "", !(GXutil.strcmp("", AV93TFProForCod)==0), (short)(0), AV93TFProForCod, "", !(GXutil.strcmp("", AV94TFProForCod_Sel)==0), AV94TFProForCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFORDSC", "", !(GXutil.strcmp("", AV62TFProForDsc)==0), (short)(0), AV62TFProForDsc, "", !(GXutil.strcmp("", AV63TFProForDsc_Sel)==0), AV63TFProForDsc_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFORFR", "", !(GXutil.strcmp("", AV64TFProForFR)==0), (short)(0), AV64TFProForFR, "", !(GXutil.strcmp("", AV65TFProForFR_Sel)==0), AV65TFProForFR_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFORRBN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFProForrbn)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFProForrbn_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV68TFProForrbn, 6, 2)), GXutil.trim( GXutil.str( AV69TFProForrbn_To, 6, 2))) ;
      AV15GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFORFABS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV77TFProforFabs)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV78TFProforFabs_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV77TFProforFabs, 6, 2)), GXutil.trim( GXutil.str( AV78TFProforFabs_To, 6, 2))) ;
      AV15GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPROFONPRG", "", !((0==AV66TFProFoNPrg)&&(0==AV67TFProFoNPrg_To)), (short)(0), GXutil.trim( GXutil.str( AV66TFProFoNPrg, 5, 0)), GXutil.trim( GXutil.str( AV67TFProFoNPrg_To, 5, 0))) ;
      AV15GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", Gx_mode)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MODE" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( Gx_mode );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV7CliCod) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV7CliCod, 6, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV8ForSer)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORSER" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV8ForSer );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV9ForColNom)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNOM" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV9ForColNom );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV10ForColNum) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORCOLNUM" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10ForColNum, 6, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV11TipColCod) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&TIPCOLCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV11TipColCod, 2, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV29ForNumCol) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORNUMCOL" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV29ForNumCol, 8, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30ForRelBan)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&FORRELBAN" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV30ForRelBan, 7, 2) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV99Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV99Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "FormulacionTinte.MtoFormulasTinte_Procesos" );
      AV31Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02864 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A13133ProForAct = H02864_A13133ProForAct[0] ;
         A396EmprCod = H02864_A396EmprCod[0] ;
         A13740ProFDsc = H02864_A13740ProFDsc[0] ;
         A764ProForCod = H02864_A764ProForCod[0] ;
         A766ProForDsc = H02864_A766ProForDsc[0] ;
         AV80Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV80Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A764ProForCod );
         AV80Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13740ProFDsc );
         AV79ProForCod_Data.add(AV80Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_proforcod_Selectedvalue_set = AV20ProForCod ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
   }

   public void e252862( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV51UsurCod, AV50Station) ;
      if ( AV81MForEq == 1 )
      {
         GXv_char17[0] = AV49EmprCod ;
         GXv_int16[0] = AV7CliCod ;
         GXv_char4[0] = AV8ForSer ;
         GXv_char3[0] = AV9ForColNom ;
         GXv_int14[0] = AV10ForColNum ;
         GXv_int8[0] = AV11TipColCod ;
         new app.gestionlaboratorio.pmforeq(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int14, GXv_int8) ;
         mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char17[0] ;
         mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int16[0] ;
         mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char4[0] ;
         mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char3[0] ;
         mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
         mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
         httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      }
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV51UsurCod, AV50Station) ;
      GXv_char17[0] = AV49EmprCod ;
      GXv_int16[0] = AV7CliCod ;
      GXv_char4[0] = AV8ForSer ;
      GXv_char3[0] = AV9ForColNom ;
      GXv_int14[0] = AV10ForColNum ;
      GXv_int8[0] = AV11TipColCod ;
      GXv_decimal18[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int10[0] = (int)(DecimalUtil.decToDouble(AV30ForRelBan)) ;
      GXv_char2[0] = " " ;
      GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int14, GXv_int8, GXv_decimal18, GXv_int10, GXv_char2, GXv_decimal15) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int16[0] ;
      mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char3[0] ;
      mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
      mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
      mtrodorumatinteprocesso_impl.this.AV30ForRelBan = DecimalUtil.doubleToDec(GXv_int10[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForRelBan", GXutil.ltrimstr( AV30ForRelBan, 7, 2));
      GXv_char17[0] = A396EmprCod ;
      GXv_char4[0] = AV50Station ;
      GXv_decimal18[0] = AV84Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char17, GXv_char4, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.A396EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV50Station = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV84Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV84Valor_cor", GXutil.ltrimstr( AV84Valor_cor, 11, 5));
      GXv_char17[0] = AV49EmprCod ;
      GXv_int16[0] = AV7CliCod ;
      GXv_char4[0] = AV8ForSer ;
      GXv_char3[0] = AV9ForColNom ;
      GXv_int14[0] = AV10ForColNum ;
      GXv_int8[0] = AV11TipColCod ;
      GXv_decimal18[0] = AV84Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char17, GXv_int16, GXv_char4, GXv_char3, GXv_int14, GXv_int8, GXv_decimal18) ;
      mtrodorumatinteprocesso_impl.this.AV49EmprCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV7CliCod = GXv_int16[0] ;
      mtrodorumatinteprocesso_impl.this.AV8ForSer = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV9ForColNom = GXv_char3[0] ;
      mtrodorumatinteprocesso_impl.this.AV10ForColNum = GXv_int14[0] ;
      mtrodorumatinteprocesso_impl.this.AV11TipColCod = GXv_int8[0] ;
      mtrodorumatinteprocesso_impl.this.AV84Valor_cor = GXv_decimal18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV84Valor_cor", GXutil.ltrimstr( AV84Valor_cor, 11, 5));
      AV20ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ProForCod", AV20ProForCod);
      Combo_proforcod_Selectedvalue_set = AV20ProForCod ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e202862( )
   {
      /* Proforl_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_char17[0] = AV20ProForCod ;
      GXv_char4[0] = AV21ProForFR ;
      GXv_decimal18[0] = AV22ProForrbn ;
      GXv_decimal15[0] = AV23ProforFabs ;
      GXv_int16[0] = AV24ProFoNPrg ;
      new app.obtengovaloresproforl(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV19ProForL, GXv_char17, GXv_char4, GXv_decimal18, GXv_decimal15, GXv_int16) ;
      mtrodorumatinteprocesso_impl.this.AV20ProForCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV21ProForFR = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV22ProForrbn = GXv_decimal18[0] ;
      mtrodorumatinteprocesso_impl.this.AV23ProforFabs = GXv_decimal15[0] ;
      mtrodorumatinteprocesso_impl.this.AV24ProFoNPrg = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ProForCod", AV20ProForCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21ProForFR", AV21ProForFR);
      httpContext.ajax_rsp_assign_attri("", false, "AV22ProForrbn", GXutil.ltrimstr( AV22ProForrbn, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV23ProforFabs", GXutil.ltrimstr( AV23ProforFabs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV24ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ProFoNPrg), 5, 0));
      Combo_proforcod_Selectedvalue_set = AV20ProForCod ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
      /*  Sending Event outputs  */
      cmbavProforfr.setValue( GXutil.rtrim( AV21ProForFR) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavProforfr.getInternalname(), "Values", cmbavProforfr.ToJavascriptSource(), true);
   }

   public void e262862( )
   {
      /* ProForL_Click Routine */
      returnInSub = false ;
      AV95Acciongridmodificar = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV95Acciongridmodificar), 4, 0));
      AV19ProForL = A1160ProForL ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19ProForL), 4, 0));
      GXv_char17[0] = AV20ProForCod ;
      GXv_char4[0] = AV21ProForFR ;
      GXv_decimal18[0] = AV22ProForrbn ;
      GXv_decimal15[0] = AV23ProforFabs ;
      GXv_int16[0] = AV24ProFoNPrg ;
      new app.obtengovaloresproforl(remoteHandle, context).execute( AV49EmprCod, AV7CliCod, AV8ForSer, AV9ForColNom, AV10ForColNum, AV11TipColCod, AV19ProForL, GXv_char17, GXv_char4, GXv_decimal18, GXv_decimal15, GXv_int16) ;
      mtrodorumatinteprocesso_impl.this.AV20ProForCod = GXv_char17[0] ;
      mtrodorumatinteprocesso_impl.this.AV21ProForFR = GXv_char4[0] ;
      mtrodorumatinteprocesso_impl.this.AV22ProForrbn = GXv_decimal18[0] ;
      mtrodorumatinteprocesso_impl.this.AV23ProforFabs = GXv_decimal15[0] ;
      mtrodorumatinteprocesso_impl.this.AV24ProFoNPrg = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20ProForCod", AV20ProForCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21ProForFR", AV21ProForFR);
      httpContext.ajax_rsp_assign_attri("", false, "AV22ProForrbn", GXutil.ltrimstr( AV22ProForrbn, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV23ProforFabs", GXutil.ltrimstr( AV23ProforFabs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV24ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ProFoNPrg), 5, 0));
      Combo_proforcod_Selectedvalue_set = AV20ProForCod ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
      GX_FocusControl = edtavProforcod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavProforfr.setValue( GXutil.rtrim( AV21ProForFR) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavProforfr.getInternalname(), "Values", cmbavProforfr.ToJavascriptSource(), true);
   }

   public void wb_table2_116_2862( boolean wbgen )
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
         wb_table2_116_2862e( true) ;
      }
      else
      {
         wb_table2_116_2862e( false) ;
      }
   }

   public void wb_table1_55_2862( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 78, 2, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncoloranteswp_Internalname, "gx.evt.setGridEvt("+GXutil.str( 78, 2, 0)+","+"null"+");", httpContext.getMessage( "Colorantes (wp)", ""), bttBtncoloranteswp_Jsonclick, 5, httpContext.getMessage( "Colorantes (wp)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCOLORANTESWP\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnproductoswp_Internalname, "gx.evt.setGridEvt("+GXutil.str( 78, 2, 0)+","+"null"+");", httpContext.getMessage( "Productos (#)  (wp)", ""), bttBtnproductoswp_Jsonclick, 5, httpContext.getMessage( "Productos (#)  (wp)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPRODUCTOSWP\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobservaciones_Internalname, "gx.evt.setGridEvt("+GXutil.str( 78, 2, 0)+","+"null"+");", httpContext.getMessage( "Observaciones", ""), bttBtnobservaciones_Jsonclick, 5, httpContext.getMessage( "Observaciones", ""), "", StyleString, ClassString, bttBtnobservaciones_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOOBSERVACIONES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 78, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\MtroDorumaTinteProcesso.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_55_2862e( true) ;
      }
      else
      {
         wb_table1_55_2862e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV7CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCod), 6, 0));
      AV8ForSer = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ForSer", AV8ForSer);
      AV9ForColNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ForColNom", AV9ForColNom);
      AV10ForColNum = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10ForColNum), 6, 0));
      AV11TipColCod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColCod), 2, 0));
      AV29ForNumCol = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29ForNumCol), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV29ForNumCol), "ZZZZZZZ9")));
      AV30ForRelBan = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForRelBan", GXutil.ltrimstr( AV30ForRelBan, 7, 2));
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
      pa2862( ) ;
      ws2862( ) ;
      we2862( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615670", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/mtrodorumatinteprocesso.js", "?20268211615671", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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

   public void subsflControlProps_782( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_78_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_78_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_78_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_78_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_78_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_78_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_78_idx ;
      edtProForL_Internalname = "PROFORL_"+sGXsfl_78_idx ;
      edtProForLab_Internalname = "PROFORLAB_"+sGXsfl_78_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_78_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_78_idx ;
      edtProForFR_Internalname = "PROFORFR_"+sGXsfl_78_idx ;
      edtProForrbn_Internalname = "PROFORRBN_"+sGXsfl_78_idx ;
      edtProforFabs_Internalname = "PROFORFABS_"+sGXsfl_78_idx ;
      edtProFoNPrg_Internalname = "PROFONPRG_"+sGXsfl_78_idx ;
      edtProForVol_Internalname = "PROFORVOL_"+sGXsfl_78_idx ;
      edtProForMq_Internalname = "PROFORMQ_"+sGXsfl_78_idx ;
      edtProForH2O_Internalname = "PROFORH2O_"+sGXsfl_78_idx ;
      chkProForAct.setInternalname( "PROFORACT_"+sGXsfl_78_idx );
   }

   public void subsflControlProps_fel_782( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_78_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_78_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_78_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_78_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_78_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_78_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_78_fel_idx ;
      edtProForL_Internalname = "PROFORL_"+sGXsfl_78_fel_idx ;
      edtProForLab_Internalname = "PROFORLAB_"+sGXsfl_78_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_78_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_78_fel_idx ;
      edtProForFR_Internalname = "PROFORFR_"+sGXsfl_78_fel_idx ;
      edtProForrbn_Internalname = "PROFORRBN_"+sGXsfl_78_fel_idx ;
      edtProforFabs_Internalname = "PROFORFABS_"+sGXsfl_78_fel_idx ;
      edtProFoNPrg_Internalname = "PROFONPRG_"+sGXsfl_78_fel_idx ;
      edtProForVol_Internalname = "PROFORVOL_"+sGXsfl_78_fel_idx ;
      edtProForMq_Internalname = "PROFORMQ_"+sGXsfl_78_fel_idx ;
      edtProForH2O_Internalname = "PROFORH2O_"+sGXsfl_78_fel_idx ;
      chkProForAct.setInternalname( "PROFORACT_"+sGXsfl_78_fel_idx );
   }

   public void sendrow_782( )
   {
      subsflControlProps_782( ) ;
      wb2860( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_78_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_78_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_78_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 79,'',false,'"+sGXsfl_78_idx+"',78)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_78_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV48GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_78_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,79);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_78_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForL_Internalname,GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"EPROFORL.CLICK."+sGXsfl_78_idx+"'","","","","",edtProForL_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForLab_Internalname,GXutil.rtrim( A6061ProForLab),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForLab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFR_Internalname,GXutil.rtrim( A6549ProForFR),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForFR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForrbn_Internalname,GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8656ProForrbn, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForrbn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProforFabs_Internalname,GXutil.ltrim( localUtil.ntoc( A14198ProforFabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A14198ProforFabs, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProforFabs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProFoNPrg_Internalname,GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7802ProFoNPrg), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProFoNPrg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForVol_Internalname,GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9704ProForVol), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForVol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForMq_Internalname,GXutil.rtrim( A9707ProForMq),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForMq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForH2O_Internalname,GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10542ProForH2O), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForH2O_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(78),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "PROFORACT_" + sGXsfl_78_idx ;
         chkProForAct.setName( GXCCtl );
         chkProForAct.setWebtags( "" );
         chkProForAct.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "TitleCaption", chkProForAct.getCaption(), !bGXsfl_78_Refreshing);
         chkProForAct.setCheckedValue( "N" );
         A13133ProForAct = ((GXutil.strcmp(GXutil.rtrim( A13133ProForAct), "S")==0) ? "S" : "N") ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkProForAct.getInternalname(),A13133ProForAct,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         send_integrity_lvl_hashes2862( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_78_idx = ((subGrid_Islastpage==1)&&(nGXsfl_78_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_78_idx+1) ;
         sGXsfl_78_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_78_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_782( ) ;
      }
      /* End function sendrow_782 */
   }

   public void startgridcontrol78( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"78\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso Laboratorio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Processo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb/FA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "FAbs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Programa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina Simulacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero de Aguas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Activo", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6061ProForLab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6549ProForFR));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14198ProforFabs, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A9707ProForMq));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13133ProForAct));
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
      edtavForrelban_Internalname = "vFORRELBAN" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablepanelfrist_Internalname = "TABLEPANELFRIST" ;
      edtavProforl_Internalname = "vPROFORL" ;
      lblTextblockcombo_proforcod_Internalname = "TEXTBLOCKCOMBO_PROFORCOD" ;
      Combo_proforcod_Internalname = "COMBO_PROFORCOD" ;
      divTablesplittedproforcod_Internalname = "TABLESPLITTEDPROFORCOD" ;
      cmbavProforfr.setInternalname( "vPROFORFR" );
      edtavProforrbn_Internalname = "vPROFORRBN" ;
      edtavProforfabs_Internalname = "vPROFORFABS" ;
      edtavProfonprg_Internalname = "vPROFONPRG" ;
      divTable_Internalname = "TABLE" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncoloranteswp_Internalname = "BTNCOLORANTESWP" ;
      bttBtnproductoswp_Internalname = "BTNPRODUCTOSWP" ;
      bttBtnobservaciones_Internalname = "BTNOBSERVACIONES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtForSer_Internalname = "FORSER" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtProForL_Internalname = "PROFORL" ;
      edtProForLab_Internalname = "PROFORLAB" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForFR_Internalname = "PROFORFR" ;
      edtProForrbn_Internalname = "PROFORRBN" ;
      edtProforFabs_Internalname = "PROFORFABS" ;
      edtProFoNPrg_Internalname = "PROFONPRG" ;
      edtProForVol_Internalname = "PROFORVOL" ;
      edtProForMq_Internalname = "PROFORMQ" ;
      edtProForH2O_Internalname = "PROFORH2O" ;
      chkProForAct.setInternalname( "PROFORACT" );
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavProforcod_Internalname = "vPROFORCOD" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      chkProForAct.setCaption( "" );
      edtProForH2O_Jsonclick = "" ;
      edtProForMq_Jsonclick = "" ;
      edtProForVol_Jsonclick = "" ;
      edtProFoNPrg_Jsonclick = "" ;
      edtProforFabs_Jsonclick = "" ;
      edtProForrbn_Jsonclick = "" ;
      edtProForFR_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtProForLab_Jsonclick = "" ;
      edtProForL_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      bttBtnobservaciones_Visible = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavProforcod_Jsonclick = "" ;
      edtavProforcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavProfonprg_Jsonclick = "" ;
      edtavProfonprg_Enabled = 1 ;
      edtavProforfabs_Jsonclick = "" ;
      edtavProforfabs_Enabled = 1 ;
      edtavProforrbn_Jsonclick = "" ;
      edtavProforrbn_Enabled = 1 ;
      cmbavProforfr.setJsonclick( "" );
      cmbavProforfr.setEnabled( 1 );
      edtavProforl_Jsonclick = "" ;
      edtavProforl_Enabled = 1 ;
      edtavForrelban_Jsonclick = "" ;
      edtavForrelban_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.MtroDorumaTinteProcessoGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic|||" ;
      Ddo_grid_Includedatalist = "|T|T|T|||" ;
      Ddo_grid_Filterisrange = "T||||T|T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Numeric|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "7:ProForL|9:ProForCod|10:ProForDsc|11:ProForFR|12:ProForrbn|13:ProforFabs|14:ProFoNPrg" ;
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
      Combo_proforcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_proforcod_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Mto Formulas Tinte (Procesos)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavProforfr.setName( "vPROFORFR" );
      cmbavProforfr.setWebtags( "" );
      cmbavProforfr.addItem("R", httpContext.getMessage( "R", ""), (short)(0));
      cmbavProforfr.addItem("F", httpContext.getMessage( "F", ""), (short)(0));
      if ( cmbavProforfr.getItemCount() > 0 )
      {
         AV21ProForFR = cmbavProforfr.getValidValue(AV21ProForFR) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21ProForFR", AV21ProForFR);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_78_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      }
      GXCCtl = "PROFORACT_" + sGXsfl_78_idx ;
      chkProForAct.setName( GXCCtl );
      chkProForAct.setWebtags( "" );
      chkProForAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkProForAct.getInternalname(), "TitleCaption", chkProForAct.getCaption(), !bGXsfl_78_Refreshing);
      chkProForAct.setCheckedValue( "N" );
      A13133ProForAct = ((GXutil.strcmp(GXutil.rtrim( A13133ProForAct), "S")==0) ? "S" : "N") ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e232862',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e242862',iparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A494ForSer',fld:'FORSER',pic:'',hsh:true},{av:'A482ForColNom',fld:'FORCOLNOM',pic:'',hsh:true},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'A1160ProForL',fld:'PROFORL',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV86EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV87CliCod_Selected',fld:'vCLICOD_SELECTED',pic:'ZZZZZ9'},{av:'AV88ForSer_Selected',fld:'vFORSER_SELECTED',pic:''},{av:'AV89ForColNom_Selected',fld:'vFORCOLNOM_SELECTED',pic:''},{av:'AV90ForColNum_Selected',fld:'vFORCOLNUM_SELECTED',pic:'ZZZZZ9'},{av:'AV91TipColCod_Selected',fld:'vTIPCOLCOD_SELECTED',pic:'Z9'},{av:'AV92ProForL_Selected',fld:'vPROFORL_SELECTED',pic:'ZZZ9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142862',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'AV86EmprCod_Selected',fld:'vEMPRCOD_SELECTED',pic:'@!'},{av:'AV87CliCod_Selected',fld:'vCLICOD_SELECTED',pic:'ZZZZZ9'},{av:'AV88ForSer_Selected',fld:'vFORSER_SELECTED',pic:''},{av:'AV89ForColNom_Selected',fld:'vFORCOLNOM_SELECTED',pic:''},{av:'AV90ForColNum_Selected',fld:'vFORCOLNUM_SELECTED',pic:'ZZZZZ9'},{av:'AV91TipColCod_Selected',fld:'vTIPCOLCOD_SELECTED',pic:'Z9'},{av:'AV92ProForL_Selected',fld:'vPROFORL_SELECTED',pic:'ZZZ9'},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV84Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV84Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("ENTER","{handler:'e152862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV20ProForCod',fld:'vPROFORCOD',pic:''},{av:'cmbavProforfr'},{av:'AV21ProForFR',fld:'vPROFORFR',pic:''},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV23ProforFabs',fld:'vPROFORFABS',pic:'ZZ9.99'},{av:'AV24ProFoNPrg',fld:'vPROFONPRG',pic:'ZZZZ9'},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV84Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV84Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'cmbavProforfr'},{av:'AV21ProForFR',fld:'vPROFORFR',pic:''},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV23ProforFabs',fld:'vPROFORFABS',pic:'ZZ9.99'},{av:'AV24ProFoNPrg',fld:'vPROFONPRG',pic:'ZZZZ9'},{av:'AV20ProForCod',fld:'vPROFORCOD',pic:''},{av:'Combo_proforcod_Selectedvalue_set',ctrl:'COMBO_PROFORCOD',prop:'SelectedValue_set'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("'DOCOLORANTESWP'","{handler:'e162862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOCOLORANTESWP'",",oparms:[{av:'AV85CosKgmF',fld:'vCOSKGMF',pic:'ZZZZZZ9.99999'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("'DOPRODUCTOSWP'","{handler:'e172862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'AV85CosKgmF',fld:'vCOSKGMF',pic:'ZZZZZZ9.99999'}]");
      setEventMetadata("'DOPRODUCTOSWP'",",oparms:[{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("'DOOBSERVACIONES'","{handler:'e182862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOOBSERVACIONES'",",oparms:[{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e192862',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOINSERT'","{handler:'e252862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV84Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV84Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV20ProForCod',fld:'vPROFORCOD',pic:''},{av:'Combo_proforcod_Selectedvalue_set',ctrl:'COMBO_PROFORCOD',prop:'SelectedValue_set'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("VPROFORL.CONTROLVALUECHANGED","{handler:'e202862',iparms:[{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'}]");
      setEventMetadata("VPROFORL.CONTROLVALUECHANGED",",oparms:[{av:'AV24ProFoNPrg',fld:'vPROFONPRG',pic:'ZZZZ9'},{av:'AV23ProforFabs',fld:'vPROFORFABS',pic:'ZZ9.99'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'cmbavProforfr'},{av:'AV21ProForFR',fld:'vPROFORFR',pic:''},{av:'AV20ProForCod',fld:'vPROFORCOD',pic:''},{av:'Combo_proforcod_Selectedvalue_set',ctrl:'COMBO_PROFORCOD',prop:'SelectedValue_set'}]}");
      setEventMetadata("PROFORL.CLICK","{handler:'e262862',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8ForSer',fld:'vFORSER',pic:''},{av:'AV9ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV10ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV30ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV52TFProForL',fld:'vTFPROFORL',pic:'ZZZ9'},{av:'AV53TFProForL_To',fld:'vTFPROFORL_TO',pic:'ZZZ9'},{av:'AV93TFProForCod',fld:'vTFPROFORCOD',pic:''},{av:'AV94TFProForCod_Sel',fld:'vTFPROFORCOD_SEL',pic:''},{av:'AV62TFProForDsc',fld:'vTFPROFORDSC',pic:''},{av:'AV63TFProForDsc_Sel',fld:'vTFPROFORDSC_SEL',pic:''},{av:'AV64TFProForFR',fld:'vTFPROFORFR',pic:''},{av:'AV65TFProForFR_Sel',fld:'vTFPROFORFR_SEL',pic:''},{av:'AV68TFProForrbn',fld:'vTFPROFORRBN',pic:'ZZ9.99'},{av:'AV69TFProForrbn_To',fld:'vTFPROFORRBN_TO',pic:'ZZ9.99'},{av:'AV77TFProforFabs',fld:'vTFPROFORFABS',pic:'ZZ9.99'},{av:'AV78TFProforFabs_To',fld:'vTFPROFORFABS_TO',pic:'ZZ9.99'},{av:'AV66TFProFoNPrg',fld:'vTFPROFONPRG',pic:'ZZZZ9'},{av:'AV67TFProFoNPrg_To',fld:'vTFPROFONPRG_TO',pic:'ZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV99Pgmname',fld:'vPGMNAME',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV29ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV51UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV81MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV82ValCon',fld:'vVALCON',pic:'ZZZ9',hsh:true},{av:'AV83FlagModC',fld:'vFLAGMODC',pic:'ZZZ9',hsh:true},{av:'A1160ProForL',fld:'PROFORL',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("PROFORL.CLICK",",oparms:[{av:'AV95Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV19ProForL',fld:'vPROFORL',pic:'ZZZ9'},{av:'AV24ProFoNPrg',fld:'vPROFONPRG',pic:'ZZZZ9'},{av:'AV23ProforFabs',fld:'vPROFORFABS',pic:'ZZ9.99'},{av:'AV22ProForrbn',fld:'vPROFORRBN',pic:'ZZ9.99'},{av:'cmbavProforfr'},{av:'AV21ProForFR',fld:'vPROFORFR',pic:''},{av:'AV20ProForCod',fld:'vPROFORCOD',pic:''},{av:'Combo_proforcod_Selectedvalue_set',ctrl:'COMBO_PROFORCOD',prop:'SelectedValue_set'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{ctrl:'BTNOBSERVACIONES',prop:'Visible'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Proforact',iparms:[]");
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
      wcpOGx_mode = "" ;
      wcpOAV8ForSer = "" ;
      wcpOAV9ForColNom = "" ;
      wcpOAV30ForRelBan = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Combo_proforcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV8ForSer = "" ;
      AV9ForColNom = "" ;
      AV30ForRelBan = DecimalUtil.ZERO ;
      AV49EmprCod = "" ;
      AV93TFProForCod = "" ;
      AV94TFProForCod_Sel = "" ;
      AV62TFProForDsc = "" ;
      AV63TFProForDsc_Sel = "" ;
      AV64TFProForFR = "" ;
      AV65TFProForFR_Sel = "" ;
      AV68TFProForrbn = DecimalUtil.ZERO ;
      AV69TFProForrbn_To = DecimalUtil.ZERO ;
      AV77TFProforFabs = DecimalUtil.ZERO ;
      AV78TFProforFabs_To = DecimalUtil.ZERO ;
      AV99Pgmname = "" ;
      AV51UsurCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV79ProForCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV86EmprCod_Selected = "" ;
      AV88ForSer_Selected = "" ;
      AV89ForColNom_Selected = "" ;
      AV50Station = "" ;
      AV84Valor_cor = DecimalUtil.ZERO ;
      AV85CosKgmF = DecimalUtil.ZERO ;
      Combo_proforcod_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_proforcod_Jsonclick = "" ;
      ucCombo_proforcod = new com.genexus.webpanels.GXUserControl();
      Combo_proforcod_Caption = "" ;
      AV21ProForFR = "" ;
      AV22ProForrbn = DecimalUtil.ZERO ;
      AV23ProforFabs = DecimalUtil.ZERO ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      AV20ProForCod = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      A6061ProForLab = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      A14198ProforFabs = DecimalUtil.ZERO ;
      A9707ProForMq = "" ;
      A13133ProForAct = "" ;
      scmdbuf = "" ;
      lV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = "" ;
      lV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = "" ;
      lV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = "" ;
      AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel = "" ;
      AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod = "" ;
      AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel = "" ;
      AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc = "" ;
      AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel = "" ;
      AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr = "" ;
      AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn = DecimalUtil.ZERO ;
      AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to = DecimalUtil.ZERO ;
      AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs = DecimalUtil.ZERO ;
      AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to = DecimalUtil.ZERO ;
      H02862_A13133ProForAct = new String[] {""} ;
      H02862_A10542ProForH2O = new short[1] ;
      H02862_A9707ProForMq = new String[] {""} ;
      H02862_A9704ProForVol = new int[1] ;
      H02862_A7802ProFoNPrg = new int[1] ;
      H02862_A14198ProforFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02862_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02862_A6549ProForFR = new String[] {""} ;
      H02862_A766ProForDsc = new String[] {""} ;
      H02862_A764ProForCod = new String[] {""} ;
      H02862_A6061ProForLab = new String[] {""} ;
      H02862_A1160ProForL = new short[1] ;
      H02862_A831TipColCod = new byte[1] ;
      H02862_A483ForColNum = new int[1] ;
      H02862_A482ForColNom = new String[] {""} ;
      H02862_A494ForSer = new String[] {""} ;
      H02862_A252CliCod = new int[1] ;
      H02862_A396EmprCod = new String[] {""} ;
      H02863_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV25EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int12 = new short[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXt_decimal19 = DecimalUtil.ZERO ;
      AV31Session = httpContext.getWebSession();
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char21 = "" ;
      GXt_char20 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      H02864_A13133ProForAct = new String[] {""} ;
      H02864_A396EmprCod = new String[] {""} ;
      H02864_A13740ProFDsc = new String[] {""} ;
      H02864_A764ProForCod = new String[] {""} ;
      H02864_A766ProForDsc = new String[] {""} ;
      A13740ProFDsc = "" ;
      AV80Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_int10 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char17 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int16 = new int[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtncoloranteswp_Jsonclick = "" ;
      bttBtnproductoswp_Jsonclick = "" ;
      bttBtnobservaciones_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.mtrodorumatinteprocesso__default(),
         new Object[] {
             new Object[] {
            H02862_A13133ProForAct, H02862_A10542ProForH2O, H02862_A9707ProForMq, H02862_A9704ProForVol, H02862_A7802ProFoNPrg, H02862_A14198ProforFabs, H02862_A8656ProForrbn, H02862_A6549ProForFR, H02862_A766ProForDsc, H02862_A764ProForCod,
            H02862_A6061ProForLab, H02862_A1160ProForL, H02862_A831TipColCod, H02862_A483ForColNum, H02862_A482ForColNom, H02862_A494ForSer, H02862_A252CliCod, H02862_A396EmprCod
            }
            , new Object[] {
            H02863_AGRID_nRecordCount
            }
            , new Object[] {
            H02864_A13133ProForAct, H02864_A396EmprCod, H02864_A13740ProFDsc, H02864_A764ProForCod, H02864_A766ProForDsc
            }
         }
      );
      AV99Pgmname = "FormulacionTinte.MtroDorumaTinteProcesso" ;
      /* GeneXus formulas. */
      AV99Pgmname = "FormulacionTinte.MtroDorumaTinteProcesso" ;
      Gx_err = (short)(0) ;
      edtavForrelban_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV11TipColCod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11TipColCod ;
   private byte gxajaxcallmode ;
   private byte AV91TipColCod_Selected ;
   private byte A831TipColCod ;
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
   private short AV95Acciongridmodificar ;
   private short AV52TFProForL ;
   private short AV53TFProForL_To ;
   private short AV17OrderedBy ;
   private short AV81MForEq ;
   private short AV82ValCon ;
   private short AV83FlagModC ;
   private short AV92ProForL_Selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV19ProForL ;
   private short AV48GridActions ;
   private short A1160ProForL ;
   private short A10542ProForH2O ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl ;
   private short AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to ;
   private short GXt_int11 ;
   private short GXv_int12[] ;
   private int wcpOAV7CliCod ;
   private int wcpOAV10ForColNum ;
   private int wcpOAV29ForNumCol ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_78 ;
   private int AV7CliCod ;
   private int AV10ForColNum ;
   private int AV29ForNumCol ;
   private int nGXsfl_78_idx=1 ;
   private int AV66TFProFoNPrg ;
   private int AV67TFProFoNPrg_To ;
   private int AV87CliCod_Selected ;
   private int AV90ForColNum_Selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavForrelban_Enabled ;
   private int edtavProforl_Enabled ;
   private int edtavProforrbn_Enabled ;
   private int edtavProforfabs_Enabled ;
   private int AV24ProFoNPrg ;
   private int edtavProfonprg_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavProforcod_Visible ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int A7802ProFoNPrg ;
   private int A9704ProForVol ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg ;
   private int AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to ;
   private int GXt_int9 ;
   private int AV45PageToGo ;
   private int bttBtnobservaciones_Visible ;
   private int AV114GXV1 ;
   private int GXv_int10[] ;
   private int GXv_int14[] ;
   private int GXv_int16[] ;
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
   private java.math.BigDecimal wcpOAV30ForRelBan ;
   private java.math.BigDecimal AV30ForRelBan ;
   private java.math.BigDecimal AV68TFProForrbn ;
   private java.math.BigDecimal AV69TFProForrbn_To ;
   private java.math.BigDecimal AV77TFProforFabs ;
   private java.math.BigDecimal AV78TFProforFabs_To ;
   private java.math.BigDecimal AV84Valor_cor ;
   private java.math.BigDecimal AV85CosKgmF ;
   private java.math.BigDecimal AV22ProForrbn ;
   private java.math.BigDecimal AV23ProforFabs ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal A14198ProforFabs ;
   private java.math.BigDecimal AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ;
   private java.math.BigDecimal AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ;
   private java.math.BigDecimal AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ;
   private java.math.BigDecimal AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ;
   private java.math.BigDecimal GXt_decimal19 ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private String wcpOGx_mode ;
   private String wcpOAV8ForSer ;
   private String wcpOAV9ForColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Combo_proforcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV8ForSer ;
   private String AV9ForColNom ;
   private String sGXsfl_78_idx="0001" ;
   private String AV49EmprCod ;
   private String AV93TFProForCod ;
   private String AV94TFProForCod_Sel ;
   private String AV62TFProForDsc ;
   private String AV63TFProForDsc_Sel ;
   private String AV64TFProForFR ;
   private String AV65TFProForFR_Sel ;
   private String AV99Pgmname ;
   private String AV51UsurCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV86EmprCod_Selected ;
   private String AV88ForSer_Selected ;
   private String AV89ForColNom_Selected ;
   private String AV50Station ;
   private String Combo_proforcod_Cls ;
   private String Combo_proforcod_Selectedvalue_set ;
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
   private String divTablepanelfrist_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavForrelban_Internalname ;
   private String edtavForrelban_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTable_Internalname ;
   private String edtavProforl_Internalname ;
   private String TempTags ;
   private String edtavProforl_Jsonclick ;
   private String divTablesplittedproforcod_Internalname ;
   private String lblTextblockcombo_proforcod_Internalname ;
   private String lblTextblockcombo_proforcod_Jsonclick ;
   private String Combo_proforcod_Caption ;
   private String Combo_proforcod_Internalname ;
   private String AV21ProForFR ;
   private String edtavProforrbn_Internalname ;
   private String edtavProforrbn_Jsonclick ;
   private String edtavProforfabs_Internalname ;
   private String edtavProforfabs_Jsonclick ;
   private String edtavProfonprg_Internalname ;
   private String edtavProfonprg_Jsonclick ;
   private String divTableactions_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavProforcod_Internalname ;
   private String AV20ProForCod ;
   private String edtavProforcod_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String edtProForL_Internalname ;
   private String A6061ProForLab ;
   private String edtProForLab_Internalname ;
   private String A764ProForCod ;
   private String edtProForCod_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String A6549ProForFR ;
   private String edtProForFR_Internalname ;
   private String edtProForrbn_Internalname ;
   private String edtProforFabs_Internalname ;
   private String edtProFoNPrg_Internalname ;
   private String edtProForVol_Internalname ;
   private String A9707ProForMq ;
   private String edtProForMq_Internalname ;
   private String edtProForH2O_Internalname ;
   private String A13133ProForAct ;
   private String scmdbuf ;
   private String lV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ;
   private String lV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ;
   private String lV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ;
   private String AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ;
   private String AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ;
   private String AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ;
   private String AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ;
   private String AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ;
   private String AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ;
   private String hsh ;
   private String AV25EmprNom ;
   private String bttBtnobservaciones_Internalname ;
   private String GXt_char21 ;
   private String GXt_char20 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char17[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncoloranteswp_Internalname ;
   private String bttBtncoloranteswp_Jsonclick ;
   private String bttBtnproductoswp_Internalname ;
   private String bttBtnproductoswp_Jsonclick ;
   private String bttBtnobservaciones_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sGXsfl_78_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtProForL_Jsonclick ;
   private String edtProForLab_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForFR_Jsonclick ;
   private String edtProForrbn_Jsonclick ;
   private String edtProforFabs_Jsonclick ;
   private String edtProFoNPrg_Jsonclick ;
   private String edtProForVol_Jsonclick ;
   private String edtProForMq_Jsonclick ;
   private String edtProForH2O_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
   private boolean Combo_proforcod_Emptyitem ;
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
   private boolean bGXsfl_78_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String A13740ProFDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcod ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavProforfr ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkProForAct ;
   private IDataStoreProvider pr_default ;
   private String[] H02862_A13133ProForAct ;
   private short[] H02862_A10542ProForH2O ;
   private String[] H02862_A9707ProForMq ;
   private int[] H02862_A9704ProForVol ;
   private int[] H02862_A7802ProFoNPrg ;
   private java.math.BigDecimal[] H02862_A14198ProforFabs ;
   private java.math.BigDecimal[] H02862_A8656ProForrbn ;
   private String[] H02862_A6549ProForFR ;
   private String[] H02862_A766ProForDsc ;
   private String[] H02862_A764ProForCod ;
   private String[] H02862_A6061ProForLab ;
   private short[] H02862_A1160ProForL ;
   private byte[] H02862_A831TipColCod ;
   private int[] H02862_A483ForColNum ;
   private String[] H02862_A482ForColNom ;
   private String[] H02862_A494ForSer ;
   private int[] H02862_A252CliCod ;
   private String[] H02862_A396EmprCod ;
   private long[] H02863_AGRID_nRecordCount ;
   private String[] H02864_A13133ProForAct ;
   private String[] H02864_A396EmprCod ;
   private String[] H02864_A13740ProFDsc ;
   private String[] H02864_A764ProForCod ;
   private String[] H02864_A766ProForDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV79ProForCod_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV80Combo_DataItem ;
}

final  class mtrodorumatinteprocesso__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02862( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl ,
                                          short AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to ,
                                          String AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                          String AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                          String AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                          String AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                          String AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                          String AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                          java.math.BigDecimal AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                          java.math.BigDecimal AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                          java.math.BigDecimal AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                          java.math.BigDecimal AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                          int AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg ,
                                          int AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A6549ProForFR ,
                                          java.math.BigDecimal A8656ProForrbn ,
                                          java.math.BigDecimal A14198ProforFabs ,
                                          int A7802ProFoNPrg ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV49EmprCod ,
                                          int AV7CliCod ,
                                          String AV8ForSer ,
                                          String AV9ForColNom ,
                                          int AV10ForColNum ,
                                          byte AV11TipColCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[25];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T2.ProForAct, T1.ProForH2O, T1.ProForMq, T1.ProForVol, T1.ProFoNPrg, T1.ProforFabs, T1.ProForrbn, T1.ProForFR, T2.ProForDsc, T1.ProForCod, T2.ProForLab, T1.ProForL," ;
      sSelectString += " T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T1.EmprCod" ;
      sFromString = " FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ?)");
      if ( ! (0==AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForFR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForFR = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs >= ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs <= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForL" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForL DESC" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForCod" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ProForDsc" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ProForDsc DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForFR" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForFR DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProForrbn" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProForrbn DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProforFabs" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProforFabs DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProFoNPrg" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProFoNPrg DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H02863( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl ,
                                          short AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to ,
                                          String AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel ,
                                          String AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod ,
                                          String AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel ,
                                          String AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc ,
                                          String AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel ,
                                          String AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr ,
                                          java.math.BigDecimal AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn ,
                                          java.math.BigDecimal AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to ,
                                          java.math.BigDecimal AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs ,
                                          java.math.BigDecimal AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to ,
                                          int AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg ,
                                          int AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to ,
                                          short A1160ProForL ,
                                          String A764ProForCod ,
                                          String A766ProForDsc ,
                                          String A6549ProForFR ,
                                          java.math.BigDecimal A8656ProForrbn ,
                                          java.math.BigDecimal A14198ProforFabs ,
                                          int A7802ProFoNPrg ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV49EmprCod ,
                                          int AV7CliCod ,
                                          String AV8ForSer ,
                                          String AV9ForColNom ,
                                          int AV10ForColNum ,
                                          byte AV11TipColCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          String A494ForSer ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          byte A831TipColCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[20];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ?)");
      if ( ! (0==AV100Formulaciontinte_mtrodorumatinteprocessods_1_tfproforl) )
      {
         addWhere(sWhereString, "(T1.ProForL >= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV101Formulaciontinte_mtrodorumatinteprocessods_2_tfproforl_to) )
      {
         addWhere(sWhereString, "(T1.ProForL <= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) && ( ! (GXutil.strcmp("", AV102Formulaciontinte_mtrodorumatinteprocessods_3_tfproforcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV103Formulaciontinte_mtrodorumatinteprocessods_4_tfproforcod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForCod = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) && ( ! (GXutil.strcmp("", AV104Formulaciontinte_mtrodorumatinteprocessods_5_tfprofordsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ProForDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV105Formulaciontinte_mtrodorumatinteprocessods_6_tfprofordsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ProForDsc = ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) && ( ! (GXutil.strcmp("", AV106Formulaciontinte_mtrodorumatinteprocessods_7_tfproforfr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProForFR) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV107Formulaciontinte_mtrodorumatinteprocessods_8_tfproforfr_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProForFR = ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Formulaciontinte_mtrodorumatinteprocessods_9_tfproforrbn)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn >= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Formulaciontinte_mtrodorumatinteprocessods_10_tfproforrbn_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProForrbn <= ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Formulaciontinte_mtrodorumatinteprocessods_11_tfproforfabs)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs >= ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Formulaciontinte_mtrodorumatinteprocessods_12_tfproforfabs_to)==0) )
      {
         addWhere(sWhereString, "(T1.ProforFabs <= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (0==AV112Formulaciontinte_mtrodorumatinteprocessods_13_tfprofonprg) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (0==AV113Formulaciontinte_mtrodorumatinteprocessods_14_tfprofonprg_to) )
      {
         addWhere(sWhereString, "(T1.ProFoNPrg <= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
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
                  return conditional_H02862(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() );
            case 1 :
                  return conditional_H02863(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , ((Number) dynConstraints[30]).intValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02862", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02863", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02864", "SELECT ProForAct, EmprCod, RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, ProForCod, ProForDsc FROM TXPCPROFO WHERE ProForAct = 'S' ORDER BY ProFDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 13);
               ((String[]) buf[15])[0] = rslt.getString(16, 16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
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
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
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
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[26]).shortValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[27]).shortValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 6);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 6);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 1);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 2);
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
      }
   }

}

