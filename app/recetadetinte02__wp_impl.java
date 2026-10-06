package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetadetinte02__wp_impl extends GXDataArea
{
   public recetadetinte02__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetadetinte02__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetadetinte02__wp_impl.class ));
   }

   public recetadetinte02__wp_impl( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
            AV27Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV9Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
               AV11Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
               AV10Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
               AV66RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
               Gx_mode = httpContext.GetPar( "Mode") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               AV104varmsg = httpContext.GetPar( "varmsg") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV104varmsg", AV104varmsg);
               AV133TotaldeKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotaldeKilos"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV133TotaldeKilos", GXutil.ltrimstr( AV133TotaldeKilos, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALDEKILOS", getSecureSignedToken( "", localUtil.format( AV133TotaldeKilos, "ZZZZZ9.99")));
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
      nRC_GXsfl_263 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_263"))) ;
      nGXsfl_263_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_263_idx"))) ;
      sGXsfl_263_idx = httpContext.GetPar( "sGXsfl_263_idx") ;
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
      AV27Emprcod = httpContext.GetPar( "Emprcod") ;
      AV9Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV11Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV10Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV66RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
      AV149Acciongridmodificar = (short)(GXutil.lval( httpContext.GetPar( "Acciongridmodificar"))) ;
      AV58Procesosdadosdealta = (short)(GXutil.lval( httpContext.GetPar( "Procesosdadosdealta"))) ;
      AV22CambioPrograma = (short)(GXutil.lval( httpContext.GetPar( "CambioPrograma"))) ;
      AV158Pgmname = httpContext.GetPar( "Pgmname") ;
      AV106UsurCod = httpContext.GetPar( "UsurCod") ;
      AV73Station = httpContext.GetPar( "Station") ;
      AV59Procesoseliminados = (short)(GXutil.lval( httpContext.GetPar( "Procesoseliminados"))) ;
      AV67RecNumPrgIN = httpContext.GetPar( "RecNumPrgIN") ;
      AV107RecFA = CommonUtil.decimalVal( httpContext.GetPar( "RecFA"), ".") ;
      AV69RecTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "RecTotKgm"), ".") ;
      AV71RecTotMtr = CommonUtil.decimalVal( httpContext.GetPar( "RecTotMtr"), ".") ;
      AV20BarVolMaq = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaq"))) ;
      AV44MaqCod = httpContext.GetPar( "MaqCod") ;
      AV64RecetasTinteProcesosQuimicosToJson = httpContext.GetPar( "RecetasTinteProcesosQuimicosToJson") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV15BarMaqcod = httpContext.GetPar( "BarMaqcod") ;
      AV14Barfacabs = CommonUtil.decimalVal( httpContext.GetPar( "Barfacabs"), ".") ;
      AV8BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV144lastvariable = (byte)(GXutil.lval( httpContext.GetPar( "lastvariable"))) ;
      AV145Color = (short)(GXutil.lval( httpContext.GetPar( "Color"))) ;
      AV132TipodeProceso = httpContext.GetPar( "TipodeProceso") ;
      AV133TotaldeKilos = CommonUtil.decimalVal( httpContext.GetPar( "TotaldeKilos"), ".") ;
      AV138ValCos = (short)(GXutil.lval( httpContext.GetPar( "ValCos"))) ;
      AV5Automata = (short)(GXutil.lval( httpContext.GetPar( "Automata"))) ;
      AV112RecipeTinte = (short)(GXutil.lval( httpContext.GetPar( "RecipeTinte"))) ;
      AV23Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      AV45MaqcodOld = httpContext.GetPar( "MaqcodOld") ;
      AV21BarVolMaqOld = (int)(GXutil.lval( httpContext.GetPar( "BarVolMaqOld"))) ;
      AV151FlagFo13 = (byte)(GXutil.lval( httpContext.GetPar( "FlagFo13"))) ;
      AV68RecNumPrgold = httpContext.GetPar( "RecNumPrgold") ;
      AV139Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV52Modif = httpContext.GetPar( "Modif") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV149Acciongridmodificar, AV58Procesosdadosdealta, AV22CambioPrograma, AV158Pgmname, AV106UsurCod, AV73Station, AV59Procesoseliminados, AV67RecNumPrgIN, AV107RecFA, AV69RecTotKgm, AV71RecTotMtr, AV20BarVolMaq, AV44MaqCod, AV64RecetasTinteProcesosQuimicosToJson, Gx_mode, AV15BarMaqcod, AV14Barfacabs, AV8BarAgrEst, AV144lastvariable, AV145Color, AV132TipodeProceso, AV133TotaldeKilos, AV138ValCos, AV5Automata, AV112RecipeTinte, AV23Carvitin, AV45MaqcodOld, AV21BarVolMaqOld, AV151FlagFo13, AV68RecNumPrgold, AV139Moda21, AV52Modif) ;
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
      pa2AX2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2AX2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetadetinte02__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV104varmsg)),GXutil.URLEncode(DecimalUtil.decToString(AV133TotaldeKilos))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Gx_mode","varmsg","TotaldeKilos"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64RecetasTinteProcesosQuimicosToJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BarMaqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV14Barfacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTVARIABLE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV144lastvariable), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPODEPROCESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV132TipodeProceso, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV138ValCos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112RecipeTinte), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MaqcodOld, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarVolMaqOld), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFO13", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV151FlagFo13), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68RecNumPrgold, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALDEKILOS", getSecureSignedToken( "", localUtil.format( AV133TotaldeKilos, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte02__WP");
      forbiddenHiddens.add("Modif", GXutil.rtrim( localUtil.format( AV52Modif, "")));
      forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( AV8BarAgrEst, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV158Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte02__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_263", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_263, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV26DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV26DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQCOD_DATA", AV108MaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQCOD_DATA", AV108MaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vACCIONGRIDMODIFICAR", GXutil.ltrim( localUtil.ntoc( AV149Acciongridmodificar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCESOSDADOSDEALTA", GXutil.ltrim( localUtil.ntoc( AV58Procesosdadosdealta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV27Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV9Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV11Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV10Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV66RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV106UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV73Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCESOSELIMINADOS", GXutil.ltrim( localUtil.ntoc( AV59Procesoseliminados, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECETASTINTEPROCESOSQUIMICOSTOJSON", AV64RecetasTinteProcesosQuimicosToJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64RecetasTinteProcesosQuimicosToJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQCOD", GXutil.rtrim( AV15BarMaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BarMaqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFACABS", GXutil.ltrim( localUtil.ntoc( AV14Barfacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV14Barfacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLASTVARIABLE", GXutil.ltrim( localUtil.ntoc( AV144lastvariable, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTVARIABLE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV144lastvariable), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNOM", GXutil.rtrim( AV134PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORPRDDSCCONTROL", GXutil.rtrim( AV150ForPrdDsccontrol));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPODEPROCESO", GXutil.rtrim( AV132TipodeProceso));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPODEPROCESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV132TipodeProceso, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALDEKILOS", GXutil.ltrim( localUtil.ntoc( AV133TotaldeKilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALDEKILOS", getSecureSignedToken( "", localUtil.format( AV133TotaldeKilos, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCOS", GXutil.ltrim( localUtil.ntoc( AV138ValCos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV138ValCos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTOMATA", GXutil.ltrim( localUtil.ntoc( AV5Automata, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECIPETINTE", GXutil.ltrim( localUtil.ntoc( AV112RecipeTinte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112RecipeTinte), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSUA", GXutil.rtrim( AV18BarSua));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV23Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAG", GXutil.ltrim( localUtil.ntoc( AV32Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODOLD", GXutil.rtrim( AV45MaqcodOld));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MaqcodOld, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARVOLMAQOLD", GXutil.ltrim( localUtil.ntoc( AV21BarVolMaqOld, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarVolMaqOld), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGOPE", GXutil.rtrim( AV33FlagOpe));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFO13", GXutil.ltrim( localUtil.ntoc( AV151FlagFo13, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFO13", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV151FlagFo13), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMED", GXutil.ltrim( localUtil.ntoc( A624MaqVolMed, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMAX", GXutil.ltrim( localUtil.ntoc( A623MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQVOLMIN", GXutil.ltrim( localUtil.ntoc( A625MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQRELBAN", GXutil.ltrim( localUtil.ntoc( A3599MaqRelBan, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUIN", GXutil.ltrim( localUtil.ntoc( AV48Maquin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECNUMPRGOLD", GXutil.rtrim( AV68RecNumPrgold));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68RecNumPrgold, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV139Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE", GXutil.rtrim( A10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANRES", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXIALM", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDTIP", GXutil.rtrim( A1643PrdTip));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Width", GXutil.rtrim( Dvpanel_unnamedtable5_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable5_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable5_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Cls", GXutil.rtrim( Dvpanel_unnamedtable5_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Title", GXutil.rtrim( Dvpanel_unnamedtable5_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable5_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable5_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable5_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE5_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable5_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Width", GXutil.rtrim( Dvpanel_unnamedtable7_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable7_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable7_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Cls", GXutil.rtrim( Dvpanel_unnamedtable7_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Title", GXutil.rtrim( Dvpanel_unnamedtable7_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable7_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable7_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable7_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE7_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable7_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Iteminternalname", GXutil.rtrim( Popover_baragrest_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Trigger", GXutil.rtrim( Popover_baragrest_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_baragrest_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_BARAGREST_Position", GXutil.rtrim( Popover_baragrest_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Confirmtype));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CERRAR_Result", GXutil.rtrim( Dvelop_confirmpanel_cerrar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQCOD_Selectedvalue_get", GXutil.rtrim( Combo_maqcod_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlineas_Result));
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
         we2AX2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2AX2( ) ;
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
      return formatLink("app.recetadetinte02__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV104varmsg)),GXutil.URLEncode(DecimalUtil.decToString(AV133TotaldeKilos))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","Gx_mode","varmsg","TotaldeKilos"})  ;
   }

   public String getPgmname( )
   {
      return "RecetadeTinte02__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Receta Tinte v.02", "") ;
   }

   public void wb2AX0( )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVarmsg_Internalname, AV104varmsg, GXutil.rtrim( localUtil.format( AV104varmsg, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVarmsg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVarmsg_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCambioprograma_Internalname, GXutil.ltrim( localUtil.ntoc( AV22CambioPrograma, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCambioprograma_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22CambioPrograma), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22CambioPrograma), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCambioprograma_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCambioprograma_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModo_Internalname, GXutil.rtrim( AV53Modo), GXutil.rtrim( localUtil.format( AV53Modo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModo_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavModif_Internalname, GXutil.rtrim( AV52Modif), GXutil.rtrim( localUtil.format( AV52Modif, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavModif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavModif_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblLog_Internalname, lblLog_Caption, "", "", lblLog_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "WizardStepDescription", 0, "", 1, 1, 0, (short)(1), "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV16BarNHdr), GXutil.rtrim( localUtil.format( AV16BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV25CliNom), GXutil.rtrim( localUtil.format( AV25CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV17BarSer), GXutil.rtrim( localUtil.format( AV17BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV12BarColNom), GXutil.rtrim( localUtil.format( AV12BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV13BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV19BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV19BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_maqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockcombo_maqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_maqcod.setProperty("Caption", Combo_maqcod_Caption);
         ucCombo_maqcod.setProperty("Cls", Combo_maqcod_Cls);
         ucCombo_maqcod.setProperty("EmptyItem", Combo_maqcod_Emptyitem);
         ucCombo_maqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV26DDO_TitleSettingsIcons);
         ucCombo_maqcod.setProperty("DropDownOptionsData", AV108MaqCod_Data);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmax_Internalname, GXutil.ltrim( localUtil.ntoc( AV49MaqVolMax, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49MaqVolMax), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49MaqVolMax), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmax_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV51MaqVolMin, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolmin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV51MaqVolMin), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV51MaqVolMin), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolmin_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRb_Internalname, GXutil.ltrim( localUtil.ntoc( AV63Rb, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRb_Enabled!=0) ? localUtil.format( AV63Rb, "ZZ9.99") : localUtil.format( AV63Rb, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,105);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRb_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarvolmaq_Internalname, GXutil.ltrim( localUtil.ntoc( AV20BarVolMaq, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarvolmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20BarVolMaq), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20BarVolMaq), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarvolmaq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarvolmaq_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfa_Internalname, GXutil.ltrim( localUtil.ntoc( AV107RecFA, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecfa_Enabled!=0) ? localUtil.format( AV107RecFA, "ZZ9.99") : localUtil.format( AV107RecFA, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfa_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfa_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecnumprgin_Internalname, GXutil.rtrim( AV67RecNumPrgIN), GXutil.rtrim( localUtil.format( AV67RecNumPrgIN, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecnumprgin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecnumprgin_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 CellMarginTop", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncambiar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Cambiar Prog", ""), bttBtncambiar_Jsonclick, 5, httpContext.getMessage( "Cambiar Prog", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCAMBIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV69RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgm_Enabled!=0) ? localUtil.format( AV69RecTotKgm, "ZZZZZZ9.99") : localUtil.format( AV69RecTotKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,127);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV70RecTotKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgs_Enabled!=0) ? localUtil.format( AV70RecTotKgs, "ZZZZZZ9.99") : localUtil.format( AV70RecTotKgs, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgs_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotmtr_Internalname, GXutil.ltrim( localUtil.ntoc( AV71RecTotMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotmtr_Enabled!=0) ? localUtil.format( AV71RecTotMtr, "ZZZZZZ9.99") : localUtil.format( AV71RecTotMtr, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotmtr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotmtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbaragrest_Internalname, httpContext.getMessage( "A?", ""), "", "", lblTextblockbaragrest_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_146_2AX2( true) ;
      }
      else
      {
         wb_table1_146_2AX2( false) ;
      }
      return  ;
   }

   public void wb_table1_146_2AX2e( boolean wbgen )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Receta", ""), bttBtneliminar_Jsonclick, 7, httpContext.getMessage( "Eliminar Receta", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112ax1_client"+"'", TempTags, "", 2, "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 167,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e122ax1_client"+"'", TempTags, "", 2, "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e132ax1_client"+"'", TempTags, "", 2, "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnadd_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Agregar Procesos", ""), bttBtnadd_Jsonclick, 5, httpContext.getMessage( "Agregar Procesos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOADD\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarprocesos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Procesos", ""), bttBtneliminarprocesos_Jsonclick, 5, httpContext.getMessage( "Eliminar Procesos", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOELIMINARPROCESOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable5.setProperty("Width", Dvpanel_unnamedtable5_Width);
         ucDvpanel_unnamedtable5.setProperty("AutoWidth", Dvpanel_unnamedtable5_Autowidth);
         ucDvpanel_unnamedtable5.setProperty("AutoHeight", Dvpanel_unnamedtable5_Autoheight);
         ucDvpanel_unnamedtable5.setProperty("Cls", Dvpanel_unnamedtable5_Cls);
         ucDvpanel_unnamedtable5.setProperty("Title", Dvpanel_unnamedtable5_Title);
         ucDvpanel_unnamedtable5.setProperty("Collapsible", Dvpanel_unnamedtable5_Collapsible);
         ucDvpanel_unnamedtable5.setProperty("Collapsed", Dvpanel_unnamedtable5_Collapsed);
         ucDvpanel_unnamedtable5.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable5_Showcollapseicon);
         ucDvpanel_unnamedtable5.setProperty("IconPosition", Dvpanel_unnamedtable5_Iconposition);
         ucDvpanel_unnamedtable5.setProperty("AutoScroll", Dvpanel_unnamedtable5_Autoscroll);
         ucDvpanel_unnamedtable5.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable5_Internalname, "DVPANEL_UNNAMEDTABLE5Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE5Container"+"UnnamedTable5"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclin_Internalname, "##", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 197,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclin_Internalname, GXutil.ltrim( localUtil.ntoc( AV124RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV124RecLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV124RecLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,197);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecprdnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecprdnum_Internalname, httpContext.getMessage( "Producto", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 201,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecprdnum_Internalname, GXutil.rtrim( AV125RecPrdNum), GXutil.rtrim( localUtil.format( AV125RecPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,201);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecprdnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecprdnum_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 203,'',false,'',0)\"" ;
         ClassString = "CellMarginTop35" + " " + ((GXutil.strcmp(imgUseraction2_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, imgUseraction2_Enabled, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecprddsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecprddsc_Internalname, GXutil.rtrim( AV127RecPrdDsc), GXutil.rtrim( localUtil.format( AV127RecPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,207);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecprddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecprddsc_Enabled, 1, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccon_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccon_Internalname, GXutil.ltrim( localUtil.ntoc( AV128FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccon_Enabled!=0) ? localUtil.format( AV128FacCon, "ZZZZ9.99999") : localUtil.format( AV128FacCon, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,211);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprdume_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdume_Internalname, httpContext.getMessage( "U", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdume_Internalname, GXutil.ltrim( localUtil.ntoc( AV129ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV129ForPrdUMe), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,215);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdume_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprdume_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
         ClassString = "CellMarginTop35" + " " + ((GXutil.strcmp(imgUseraction1_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, imgUseraction1_Enabled, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprddsc_Internalname, httpContext.getMessage( "Des.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprddsc_Internalname, GXutil.rtrim( AV130ForPrdDsc), GXutil.rtrim( localUtil.format( AV130ForPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprddsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdcant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdcant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdcant_Internalname, GXutil.ltrim( localUtil.ntoc( AV131PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdcant_Enabled!=0) ? localUtil.format( AV131PrdCant, "ZZZZZZ9.999") : localUtil.format( AV131PrdCant, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdcant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdcant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclote_Internalname, GXutil.rtrim( AV118RecLote), GXutil.rtrim( localUtil.format( AV118RecLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,233);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfornro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfornro_Internalname, httpContext.getMessage( "Nº", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfornro_Internalname, GXutil.ltrim( localUtil.ntoc( AV119RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecfornro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV119RecForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV119RecForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,237);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfornro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfornro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecprdtnq_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecprdtnq_Internalname, httpContext.getMessage( "Tq", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecprdtnq_Internalname, GXutil.ltrim( localUtil.ntoc( AV120RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRecprdtnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV120RecPrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV120RecPrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecprdtnq_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecprdtnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecmanaut_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecmanaut_Internalname, httpContext.getMessage( "M/A", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 245,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecmanaut_Internalname, GXutil.rtrim( AV121RecManAut), GXutil.rtrim( localUtil.format( AV121RecManAut, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,245);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecmanaut_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecmanaut_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 253,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 255,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarlineas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Lineas (Op)", ""), bttBtneliminarlineas_Jsonclick, 5, httpContext.getMessage( "Eliminar Lineas (Op)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOELIMINARLINEAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 257,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 263, 3, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiar_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", divUnnamedtable6_Height, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol263( ) ;
      }
      if ( wbEnd == 263 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_263 = (int)(nGXsfl_263_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable7_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable7_cell_Class, "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable7.setProperty("Width", Dvpanel_unnamedtable7_Width);
         ucDvpanel_unnamedtable7.setProperty("AutoWidth", Dvpanel_unnamedtable7_Autowidth);
         ucDvpanel_unnamedtable7.setProperty("AutoHeight", Dvpanel_unnamedtable7_Autoheight);
         ucDvpanel_unnamedtable7.setProperty("Cls", Dvpanel_unnamedtable7_Cls);
         ucDvpanel_unnamedtable7.setProperty("Title", Dvpanel_unnamedtable7_Title);
         ucDvpanel_unnamedtable7.setProperty("Collapsible", Dvpanel_unnamedtable7_Collapsible);
         ucDvpanel_unnamedtable7.setProperty("Collapsed", Dvpanel_unnamedtable7_Collapsed);
         ucDvpanel_unnamedtable7.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable7_Showcollapseicon);
         ucDvpanel_unnamedtable7.setProperty("IconPosition", Dvpanel_unnamedtable7_Iconposition);
         ucDvpanel_unnamedtable7.setProperty("AutoScroll", Dvpanel_unnamedtable7_Autoscroll);
         ucDvpanel_unnamedtable7.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable7_Internalname, "DVPANEL_UNNAMEDTABLE7Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE7Container"+"UnnamedTable7"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclinpro_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclinpro_Internalname, "#", " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 305,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinpro_Internalname, GXutil.ltrim( localUtil.ntoc( AV137RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinpro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV137RecLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV137RecLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,305);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinpro_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclinpro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclinmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclinmin_Internalname, httpContext.getMessage( "Min. Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV146RecLinMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinmin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV146RecLinMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV146RecLinMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclinmin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavReclinmax_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavReclinmax_Internalname, httpContext.getMessage( "Max. Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 313,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavReclinmax_Internalname, GXutil.ltrim( localUtil.ntoc( AV143RecLinMax, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavReclinmax_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV143RecLinMax), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV143RecLinMax), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,313);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavReclinmax_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavReclinmax_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNextreclinmin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNextreclinmin_Internalname, httpContext.getMessage( "Min Sig #", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 317,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNextreclinmin_Internalname, GXutil.ltrim( localUtil.ntoc( AV148NextRecLinMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavNextreclinmin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV148NextRecLinMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV148NextRecLinMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,317);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNextreclinmin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNextreclinmin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOldreclote_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOldreclote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 321,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOldreclote_Internalname, GXutil.rtrim( AV114oldRecLote), GXutil.rtrim( localUtil.format( AV114oldRecLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,321);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOldreclote_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOldreclote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCantold_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCantold_Internalname, httpContext.getMessage( "Cantold", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 325,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCantold_Internalname, GXutil.ltrim( localUtil.ntoc( AV115Cantold, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCantold_Enabled!=0) ? localUtil.format( AV115Cantold, "ZZZZZZ9.999") : localUtil.format( AV115Cantold, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,325);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCantold_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCantold_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCanresold_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCanresold_Internalname, httpContext.getMessage( "Can Resold", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCanresold_Internalname, GXutil.ltrim( localUtil.ntoc( AV116CanResold, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCanresold_Enabled!=0) ? localUtil.format( AV116CanResold, "ZZZZ9.99") : localUtil.format( AV116CanResold, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,329);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCanresold_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCanresold_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOldfaccon_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOldfaccon_Internalname, httpContext.getMessage( "Fact.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 333,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOldfaccon_Internalname, GXutil.ltrim( localUtil.ntoc( AV117OldFaccon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOldfaccon_Enabled!=0) ? localUtil.format( AV117OldFaccon, "ZZZZ9.99999") : localUtil.format( AV117OldFaccon, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,333);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOldfaccon_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOldfaccon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdexialm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdexialm_Internalname, httpContext.getMessage( "Almacen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 337,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdexialm_Internalname, GXutil.ltrim( localUtil.ntoc( AV122PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdexialm_Enabled!=0) ? localUtil.format( AV122PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( AV122PrdExiAlm, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,337);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdexialm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdexialm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdcanres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdcanres_Internalname, httpContext.getMessage( "Reservada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 341,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdcanres_Internalname, GXutil.ltrim( localUtil.ntoc( AV123PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdcanres_Enabled!=0) ? localUtil.format( AV123PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( AV123PrdCanRes, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,341);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdcanres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrdcanres_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavLrecet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLrecet_Internalname, httpContext.getMessage( "Lrecet", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 345,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLrecet_Internalname, GXutil.ltrim( localUtil.ntoc( AV140Lrecet, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavLrecet_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV140Lrecet), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV140Lrecet), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,345);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLrecet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLrecet_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblStyle_Internalname, lblStyle_Caption, "", "", lblStyle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_RecetadeTinte02__WP.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV158Pgmname), GXutil.rtrim( localUtil.format( AV158Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, GXutil.rtrim( AV44MaqCod), GXutil.rtrim( localUtil.format( AV44MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,359);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavMaqcod_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         /* User Defined Control */
         ucPopover_baragrest.setProperty("Trigger", Popover_baragrest_Trigger);
         ucPopover_baragrest.setProperty("PopoverWidth", Popover_baragrest_Popoverwidth);
         ucPopover_baragrest.setProperty("Position", Popover_baragrest_Position);
         ucPopover_baragrest.render(context, "dvelop.wwppopover", Popover_baragrest_Internalname, "POPOVER_BARAGRESTContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 361,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV24CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,361);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicod_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetadeTinte02__WP.htm");
         wb_table2_362_2AX2( true) ;
      }
      else
      {
         wb_table2_362_2AX2( false) ;
      }
      return  ;
   }

   public void wb_table2_362_2AX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_367_2AX2( true) ;
      }
      else
      {
         wb_table3_367_2AX2( false) ;
      }
      return  ;
   }

   public void wb_table3_367_2AX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_372_2AX2( true) ;
      }
      else
      {
         wb_table4_372_2AX2( false) ;
      }
      return  ;
   }

   public void wb_table4_372_2AX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_377_2AX2( true) ;
      }
      else
      {
         wb_table5_377_2AX2( false) ;
      }
      return  ;
   }

   public void wb_table5_377_2AX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_382_2AX2( true) ;
      }
      else
      {
         wb_table6_382_2AX2( false) ;
      }
      return  ;
   }

   public void wb_table6_382_2AX2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0389"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0389"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_263_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0389"+"");
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
      if ( wbEnd == 263 )
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

   public void start2AX2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Receta Tinte v.02", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2AX0( ) ;
   }

   public void ws2AX2( )
   {
      start2AX2( ) ;
      evt2AX2( ) ;
   }

   public void evt2AX2( )
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
                           e142AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEAS.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CERRAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192AX2 ();
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
                                 e202AX2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARLINEAS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEliminarLineas' */
                           e212AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiar' */
                           e222AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction2' */
                           e232AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e242AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOADD'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAdd' */
                           e252AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARPROCESOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEliminarProcesos' */
                           e262AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCAMBIAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCambiar' */
                           e272AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECNUMPRGIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e282AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECNUMPRGIN.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e292AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e302AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VMAQCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e312AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORPRDUME.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e322AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECPRDNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e332AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VRECLIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e342AX2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImprimir' */
                           e352AX2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "'DOENVIOAUTOMATA'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "RECLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "RECLIN.CLICK") == 0 ) )
                        {
                           nGXsfl_263_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_2632( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           AV152Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV152Seleccionar);
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
                              AV57PrdRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57PrdRGB), 10, 0));
                           }
                           else
                           {
                              AV57PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57PrdRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV61R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61R), 3, 0));
                           }
                           else
                           {
                              AV61R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61R), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV34G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34G), 3, 0));
                           }
                           else
                           {
                              AV34G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV6B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6B), 3, 0));
                           }
                           else
                           {
                              AV6B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV62R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62R2), 3, 0));
                           }
                           else
                           {
                              AV62R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV35G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35G2), 3, 0));
                           }
                           else
                           {
                              AV35G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV7B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
                           }
                           else
                           {
                              AV7B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
                           }
                           A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
                           n6018ProForFab = false ;
                           A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLOR");
                              GX_FocusControl = edtavColor_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV145Color = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavColor_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145Color), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
                           }
                           else
                           {
                              AV145Color = (short)(localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavColor_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145Color), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
                           }
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e362AX2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e372AX2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e382AX2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOENVIOAUTOMATA'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoEnvioAutomata' */
                                 e392AX2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "RECLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e402AX2 ();
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
                     if ( nCmpId == 389 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0389") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0389", "", sEvt);
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

   public void we2AX2( )
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

   public void pa2AX2( )
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
      subsflControlProps_2632( ) ;
      while ( nGXsfl_263_idx <= nRC_GXsfl_263 )
      {
         sendrow_2632( ) ;
         nGXsfl_263_idx = ((subGrid_Islastpage==1)&&(nGXsfl_263_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_263_idx+1) ;
         sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV27Emprcod ,
                                 int AV9Barcod ,
                                 byte AV11Barcodreo ,
                                 String AV10Barcodpar ,
                                 short AV66RecLinMaq ,
                                 short AV149Acciongridmodificar ,
                                 short AV58Procesosdadosdealta ,
                                 short AV22CambioPrograma ,
                                 String AV158Pgmname ,
                                 String AV106UsurCod ,
                                 String AV73Station ,
                                 short AV59Procesoseliminados ,
                                 String AV67RecNumPrgIN ,
                                 java.math.BigDecimal AV107RecFA ,
                                 java.math.BigDecimal AV69RecTotKgm ,
                                 java.math.BigDecimal AV71RecTotMtr ,
                                 int AV20BarVolMaq ,
                                 String AV44MaqCod ,
                                 String AV64RecetasTinteProcesosQuimicosToJson ,
                                 String Gx_mode ,
                                 String AV15BarMaqcod ,
                                 java.math.BigDecimal AV14Barfacabs ,
                                 String AV8BarAgrEst ,
                                 byte AV144lastvariable ,
                                 short AV145Color ,
                                 String AV132TipodeProceso ,
                                 java.math.BigDecimal AV133TotaldeKilos ,
                                 short AV138ValCos ,
                                 short AV5Automata ,
                                 short AV112RecipeTinte ,
                                 short AV23Carvitin ,
                                 String AV45MaqcodOld ,
                                 int AV21BarVolMaqOld ,
                                 byte AV151FlagFo13 ,
                                 String AV68RecNumPrgold ,
                                 short AV139Moda21 ,
                                 String AV52Modif )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e372AX2 ();
      GRID_nCurrentRecord = 0 ;
      rf2AX2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte02__WP");
      forbiddenHiddens.add("Modif", GXutil.rtrim( localUtil.format( AV52Modif, "")));
      forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( AV8BarAgrEst, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV158Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("recetadetinte02__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOLOR", GXutil.ltrim( localUtil.ntoc( AV145Color, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLINPRO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINPRO", GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_263_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf2AX2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV158Pgmname = "RecetadeTinte02__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV158Pgmname", AV158Pgmname);
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
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColor_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavReclinpro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Enabled), 5, 0), true);
      edtavReclinmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmin_Enabled), 5, 0), true);
      edtavReclinmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmax_Enabled), 5, 0), true);
      edtavNextreclinmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNextreclinmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNextreclinmin_Enabled), 5, 0), true);
      edtavOldreclote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldreclote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldreclote_Enabled), 5, 0), true);
      edtavCantold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantold_Enabled), 5, 0), true);
      edtavCanresold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCanresold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCanresold_Enabled), 5, 0), true);
      edtavOldfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldfaccon_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavLrecet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLrecet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLrecet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2AX2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(263) ;
      /* Execute user event: Refresh */
      e372AX2 ();
      nGXsfl_263_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2632( ) ;
      bGXsfl_263_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
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
         subsflControlProps_2632( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         /* Using cursor H02AX2 */
         pr_default.execute(0, new Object[] {AV27Emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV11Barcodreo), AV10Barcodpar, Short.valueOf(AV66RecLinMaq), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_263_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2632( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4024RecMar = H02AX2_A4024RecMar[0] ;
            A6018ProForFab = H02AX2_A6018ProForFab[0] ;
            n6018ProForFab = H02AX2_n6018ProForFab[0] ;
            A13232PrdRGB = H02AX2_A13232PrdRGB[0] ;
            A5725RecLote = H02AX2_A5725RecLote[0] ;
            A3274RecPrdTnq = H02AX2_A3274RecPrdTnq[0] ;
            A2394RecForNro = H02AX2_A2394RecForNro[0] ;
            A14055RecManAut = H02AX2_A14055RecManAut[0] ;
            A488ForPrdDsc = H02AX2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H02AX2_n488ForPrdDsc[0] ;
            A686PrdCant = H02AX2_A686PrdCant[0] ;
            A431FacCon = H02AX2_A431FacCon[0] ;
            A490ForPrdUMe = H02AX2_A490ForPrdUMe[0] ;
            n490ForPrdUMe = H02AX2_n490ForPrdUMe[0] ;
            A719PrdNum = H02AX2_A719PrdNum[0] ;
            n719PrdNum = H02AX2_n719PrdNum[0] ;
            A875RecPrdDsc = H02AX2_A875RecPrdDsc[0] ;
            A872RecPrdNum = H02AX2_A872RecPrdNum[0] ;
            A811RecLin = H02AX2_A811RecLin[0] ;
            A766ProForDsc = H02AX2_A766ProForDsc[0] ;
            A764ProForCod = H02AX2_A764ProForCod[0] ;
            A1273RecLinPro = H02AX2_A1273RecLinPro[0] ;
            A2804RecLinMaq = H02AX2_A2804RecLinMaq[0] ;
            A130BarCodPar = H02AX2_A130BarCodPar[0] ;
            A132BarCodReo = H02AX2_A132BarCodReo[0] ;
            A129BarCod = H02AX2_A129BarCod[0] ;
            A396EmprCod = H02AX2_A396EmprCod[0] ;
            A13232PrdRGB = H02AX2_A13232PrdRGB[0] ;
            A488ForPrdDsc = H02AX2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H02AX2_n488ForPrdDsc[0] ;
            A764ProForCod = H02AX2_A764ProForCod[0] ;
            A6018ProForFab = H02AX2_A6018ProForFab[0] ;
            n6018ProForFab = H02AX2_n6018ProForFab[0] ;
            A766ProForDsc = H02AX2_A766ProForDsc[0] ;
            e382AX2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(263) ;
         wb2AX0( ) ;
      }
      bGXsfl_263_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2AX2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV73Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECETASTINTEPROCESOSQUIMICOSTOJSON", AV64RecetasTinteProcesosQuimicosToJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64RecetasTinteProcesosQuimicosToJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMAQCOD", GXutil.rtrim( AV15BarMaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BarMaqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFACABS", GXutil.ltrim( localUtil.ntoc( AV14Barfacabs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV14Barfacabs, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLASTVARIABLE", GXutil.ltrim( localUtil.ntoc( AV144lastvariable, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTVARIABLE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV144lastvariable), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPODEPROCESO", GXutil.rtrim( AV132TipodeProceso));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPODEPROCESO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV132TipodeProceso, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCOS", GXutil.ltrim( localUtil.ntoc( AV138ValCos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV138ValCos), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLINPRO"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECLIN"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTOMATA", GXutil.ltrim( localUtil.ntoc( AV5Automata, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Automata), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECIPETINTE", GXutil.ltrim( localUtil.ntoc( AV112RecipeTinte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112RecipeTinte), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV23Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODOLD", GXutil.rtrim( AV45MaqcodOld));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MaqcodOld, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARVOLMAQOLD", GXutil.ltrim( localUtil.ntoc( AV21BarVolMaqOld, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarVolMaqOld), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFO13", GXutil.ltrim( localUtil.ntoc( AV151FlagFo13, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFO13", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV151FlagFo13), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECNUMPRGOLD", GXutil.rtrim( AV68RecNumPrgold));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68RecNumPrgold, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV139Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
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
      /* Using cursor H02AX3 */
      pr_default.execute(1, new Object[] {AV27Emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV11Barcodreo), AV10Barcodpar, Short.valueOf(AV66RecLinMaq)});
      GRID_nRecordCount = H02AX3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV149Acciongridmodificar, AV58Procesosdadosdealta, AV22CambioPrograma, AV158Pgmname, AV106UsurCod, AV73Station, AV59Procesoseliminados, AV67RecNumPrgIN, AV107RecFA, AV69RecTotKgm, AV71RecTotMtr, AV20BarVolMaq, AV44MaqCod, AV64RecetasTinteProcesosQuimicosToJson, Gx_mode, AV15BarMaqcod, AV14Barfacabs, AV8BarAgrEst, AV144lastvariable, AV145Color, AV132TipodeProceso, AV133TotaldeKilos, AV138ValCos, AV5Automata, AV112RecipeTinte, AV23Carvitin, AV45MaqcodOld, AV21BarVolMaqOld, AV151FlagFo13, AV68RecNumPrgold, AV139Moda21, AV52Modif) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV149Acciongridmodificar, AV58Procesosdadosdealta, AV22CambioPrograma, AV158Pgmname, AV106UsurCod, AV73Station, AV59Procesoseliminados, AV67RecNumPrgIN, AV107RecFA, AV69RecTotKgm, AV71RecTotMtr, AV20BarVolMaq, AV44MaqCod, AV64RecetasTinteProcesosQuimicosToJson, Gx_mode, AV15BarMaqcod, AV14Barfacabs, AV8BarAgrEst, AV144lastvariable, AV145Color, AV132TipodeProceso, AV133TotaldeKilos, AV138ValCos, AV5Automata, AV112RecipeTinte, AV23Carvitin, AV45MaqcodOld, AV21BarVolMaqOld, AV151FlagFo13, AV68RecNumPrgold, AV139Moda21, AV52Modif) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV149Acciongridmodificar, AV58Procesosdadosdealta, AV22CambioPrograma, AV158Pgmname, AV106UsurCod, AV73Station, AV59Procesoseliminados, AV67RecNumPrgIN, AV107RecFA, AV69RecTotKgm, AV71RecTotMtr, AV20BarVolMaq, AV44MaqCod, AV64RecetasTinteProcesosQuimicosToJson, Gx_mode, AV15BarMaqcod, AV14Barfacabs, AV8BarAgrEst, AV144lastvariable, AV145Color, AV132TipodeProceso, AV133TotaldeKilos, AV138ValCos, AV5Automata, AV112RecipeTinte, AV23Carvitin, AV45MaqcodOld, AV21BarVolMaqOld, AV151FlagFo13, AV68RecNumPrgold, AV139Moda21, AV52Modif) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV149Acciongridmodificar, AV58Procesosdadosdealta, AV22CambioPrograma, AV158Pgmname, AV106UsurCod, AV73Station, AV59Procesoseliminados, AV67RecNumPrgIN, AV107RecFA, AV69RecTotKgm, AV71RecTotMtr, AV20BarVolMaq, AV44MaqCod, AV64RecetasTinteProcesosQuimicosToJson, Gx_mode, AV15BarMaqcod, AV14Barfacabs, AV8BarAgrEst, AV144lastvariable, AV145Color, AV132TipodeProceso, AV133TotaldeKilos, AV138ValCos, AV5Automata, AV112RecipeTinte, AV23Carvitin, AV45MaqcodOld, AV21BarVolMaqOld, AV151FlagFo13, AV68RecNumPrgold, AV139Moda21, AV52Modif) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV149Acciongridmodificar, AV58Procesosdadosdealta, AV22CambioPrograma, AV158Pgmname, AV106UsurCod, AV73Station, AV59Procesoseliminados, AV67RecNumPrgIN, AV107RecFA, AV69RecTotKgm, AV71RecTotMtr, AV20BarVolMaq, AV44MaqCod, AV64RecetasTinteProcesosQuimicosToJson, Gx_mode, AV15BarMaqcod, AV14Barfacabs, AV8BarAgrEst, AV144lastvariable, AV145Color, AV132TipodeProceso, AV133TotaldeKilos, AV138ValCos, AV5Automata, AV112RecipeTinte, AV23Carvitin, AV45MaqcodOld, AV21BarVolMaqOld, AV151FlagFo13, AV68RecNumPrgold, AV139Moda21, AV52Modif) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV158Pgmname = "RecetadeTinte02__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV158Pgmname", AV158Pgmname);
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
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavColor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavColor_Enabled), 5, 0), !bGXsfl_263_Refreshing);
      edtavReclinpro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinpro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinpro_Enabled), 5, 0), true);
      edtavReclinmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmin_Enabled), 5, 0), true);
      edtavReclinmax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclinmax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclinmax_Enabled), 5, 0), true);
      edtavNextreclinmin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNextreclinmin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNextreclinmin_Enabled), 5, 0), true);
      edtavOldreclote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldreclote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldreclote_Enabled), 5, 0), true);
      edtavCantold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCantold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCantold_Enabled), 5, 0), true);
      edtavCanresold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCanresold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCanresold_Enabled), 5, 0), true);
      edtavOldfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavOldfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavOldfaccon_Enabled), 5, 0), true);
      edtavPrdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdexialm_Enabled), 5, 0), true);
      edtavPrdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdcanres_Enabled), 5, 0), true);
      edtavLrecet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLrecet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLrecet_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2AX0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e362AX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV26DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQCOD_DATA"), AV108MaqCod_Data);
         /* Read saved values. */
         nRC_GXsfl_263 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_263"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV138ValCos = (short)(localUtil.ctol( httpContext.cgiGet( "vVALCOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV133TotaldeKilos = localUtil.ctond( httpContext.cgiGet( "vTOTALDEKILOS")) ;
         AV132TipodeProceso = httpContext.cgiGet( "vTIPODEPROCESO") ;
         AV23Carvitin = (short)(localUtil.ctol( httpContext.cgiGet( "vCARVITIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable5_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Width") ;
         Dvpanel_unnamedtable5_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autowidth")) ;
         Dvpanel_unnamedtable5_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoheight")) ;
         Dvpanel_unnamedtable5_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Cls") ;
         Dvpanel_unnamedtable5_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Title") ;
         Dvpanel_unnamedtable5_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsible")) ;
         Dvpanel_unnamedtable5_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Collapsed")) ;
         Dvpanel_unnamedtable5_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Showcollapseicon")) ;
         Dvpanel_unnamedtable5_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Iconposition") ;
         Dvpanel_unnamedtable5_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE5_Autoscroll")) ;
         Dvpanel_unnamedtable7_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Width") ;
         Dvpanel_unnamedtable7_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autowidth")) ;
         Dvpanel_unnamedtable7_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoheight")) ;
         Dvpanel_unnamedtable7_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Cls") ;
         Dvpanel_unnamedtable7_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Title") ;
         Dvpanel_unnamedtable7_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsible")) ;
         Dvpanel_unnamedtable7_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Collapsed")) ;
         Dvpanel_unnamedtable7_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Showcollapseicon")) ;
         Dvpanel_unnamedtable7_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Iconposition") ;
         Dvpanel_unnamedtable7_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE7_Autoscroll")) ;
         Popover_baragrest_Iteminternalname = httpContext.cgiGet( "POPOVER_BARAGREST_Iteminternalname") ;
         Popover_baragrest_Trigger = httpContext.cgiGet( "POPOVER_BARAGREST_Trigger") ;
         Popover_baragrest_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_BARAGREST_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_baragrest_Position = httpContext.cgiGet( "POPOVER_BARAGREST_Position") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_eliminarlineas_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Title") ;
         Dvelop_confirmpanel_eliminarlineas_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlineas_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlineas_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlineas_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlineas_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlineas_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Confirmtype") ;
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
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Dvelop_confirmpanel_eliminarlineas_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEAS_Result") ;
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
            AV22CambioPrograma = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CambioPrograma), 4, 0));
         }
         else
         {
            AV22CambioPrograma = (short)(localUtil.ctol( httpContext.cgiGet( edtavCambioprograma_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CambioPrograma), 4, 0));
         }
         AV53Modo = httpContext.cgiGet( edtavModo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53Modo", AV53Modo);
         AV52Modif = httpContext.cgiGet( edtavModif_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Modif", AV52Modif);
         AV16BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16BarNHdr", AV16BarNHdr);
         AV25CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25CliNom", AV25CliNom);
         AV17BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarSer", AV17BarSer);
         AV12BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
         }
         else
         {
            AV13BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarTipCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarTipCol), 2, 0));
         }
         else
         {
            AV19BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarTipCol), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMAX");
            GX_FocusControl = edtavMaqvolmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49MaqVolMax = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49MaqVolMax), 5, 0));
         }
         else
         {
            AV49MaqVolMax = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49MaqVolMax), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMAQVOLMIN");
            GX_FocusControl = edtavMaqvolmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51MaqVolMin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51MaqVolMin), 5, 0));
         }
         else
         {
            AV51MaqVolMin = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaqvolmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51MaqVolMin), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRB");
            GX_FocusControl = edtavRb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63Rb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Rb", GXutil.ltrimstr( AV63Rb, 6, 2));
         }
         else
         {
            AV63Rb = localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63Rb", GXutil.ltrimstr( AV63Rb, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARVOLMAQ");
            GX_FocusControl = edtavBarvolmaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20BarVolMaq = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarVolMaq), 5, 0));
         }
         else
         {
            AV20BarVolMaq = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarvolmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarVolMaq), 5, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECFA");
            GX_FocusControl = edtavRecfa_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV107RecFA = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107RecFA", GXutil.ltrimstr( AV107RecFA, 6, 2));
         }
         else
         {
            AV107RecFA = localUtil.ctond( httpContext.cgiGet( edtavRecfa_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107RecFA", GXutil.ltrimstr( AV107RecFA, 6, 2));
         }
         AV67RecNumPrgIN = httpContext.cgiGet( edtavRecnumprgin_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67RecNumPrgIN", AV67RecNumPrgIN);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGM");
            GX_FocusControl = edtavRectotkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV69RecTotKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69RecTotKgm", GXutil.ltrimstr( AV69RecTotKgm, 10, 2));
         }
         else
         {
            AV69RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69RecTotKgm", GXutil.ltrimstr( AV69RecTotKgm, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGS");
            GX_FocusControl = edtavRectotkgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70RecTotKgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70RecTotKgs", GXutil.ltrimstr( AV70RecTotKgs, 10, 2));
         }
         else
         {
            AV70RecTotKgs = localUtil.ctond( httpContext.cgiGet( edtavRectotkgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70RecTotKgs", GXutil.ltrimstr( AV70RecTotKgs, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTMTR");
            GX_FocusControl = edtavRectotmtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71RecTotMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71RecTotMtr", GXutil.ltrimstr( AV71RecTotMtr, 10, 2));
         }
         else
         {
            AV71RecTotMtr = localUtil.ctond( httpContext.cgiGet( edtavRectotmtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71RecTotMtr", GXutil.ltrimstr( AV71RecTotMtr, 10, 2));
         }
         AV8BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarAgrEst", AV8BarAgrEst);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECLIN");
            GX_FocusControl = edtavReclin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV124RecLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124RecLin), 4, 0));
         }
         else
         {
            AV124RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV124RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124RecLin), 4, 0));
         }
         AV125RecPrdNum = httpContext.cgiGet( edtavRecprdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV125RecPrdNum", AV125RecPrdNum);
         AV127RecPrdDsc = httpContext.cgiGet( edtavRecprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127RecPrdDsc", AV127RecPrdDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFaccon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFaccon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCON");
            GX_FocusControl = edtavFaccon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV128FacCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128FacCon", GXutil.ltrimstr( AV128FacCon, 11, 5));
         }
         else
         {
            AV128FacCon = localUtil.ctond( httpContext.cgiGet( edtavFaccon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128FacCon", GXutil.ltrimstr( AV128FacCon, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDUME");
            GX_FocusControl = edtavForprdume_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV129ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
         }
         else
         {
            AV129ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
         }
         AV130ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDCANT");
            GX_FocusControl = edtavPrdcant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV131PrdCant = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
         }
         else
         {
            AV131PrdCant = localUtil.ctond( httpContext.cgiGet( edtavPrdcant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
         }
         AV118RecLote = httpContext.cgiGet( edtavReclote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118RecLote", AV118RecLote);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECFORNRO");
            GX_FocusControl = edtavRecfornro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV119RecForNro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119RecForNro), 2, 0));
         }
         else
         {
            AV119RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtavRecfornro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119RecForNro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRecprdtnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRecprdtnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECPRDTNQ");
            GX_FocusControl = edtavRecprdtnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV120RecPrdTnq = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120RecPrdTnq), 2, 0));
         }
         else
         {
            AV120RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtavRecprdtnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120RecPrdTnq), 2, 0));
         }
         AV121RecManAut = httpContext.cgiGet( edtavRecmanaut_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV121RecManAut", AV121RecManAut);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECLINPRO");
            GX_FocusControl = edtavReclinpro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV137RecLinPro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137RecLinPro), 2, 0));
         }
         else
         {
            AV137RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtavReclinpro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV137RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137RecLinPro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECLINMIN");
            GX_FocusControl = edtavReclinmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV146RecLinMin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146RecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146RecLinMin), 4, 0));
         }
         else
         {
            AV146RecLinMin = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclinmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV146RecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146RecLinMin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavReclinmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECLINMAX");
            GX_FocusControl = edtavReclinmax_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV143RecLinMax = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143RecLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143RecLinMax), 4, 0));
         }
         else
         {
            AV143RecLinMax = (short)(localUtil.ctol( httpContext.cgiGet( edtavReclinmax_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV143RecLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143RecLinMax), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNextreclinmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNextreclinmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNEXTRECLINMIN");
            GX_FocusControl = edtavNextreclinmin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV148NextRecLinMin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148NextRecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NextRecLinMin), 4, 0));
         }
         else
         {
            AV148NextRecLinMin = (short)(localUtil.ctol( httpContext.cgiGet( edtavNextreclinmin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV148NextRecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NextRecLinMin), 4, 0));
         }
         AV114oldRecLote = httpContext.cgiGet( edtavOldreclote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV114oldRecLote", AV114oldRecLote);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCantold_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantold_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTOLD");
            GX_FocusControl = edtavCantold_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV115Cantold = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115Cantold", GXutil.ltrimstr( AV115Cantold, 11, 3));
         }
         else
         {
            AV115Cantold = localUtil.ctond( httpContext.cgiGet( edtavCantold_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV115Cantold", GXutil.ltrimstr( AV115Cantold, 11, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCanresold_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCanresold_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANRESOLD");
            GX_FocusControl = edtavCanresold_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV116CanResold = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116CanResold", GXutil.ltrimstr( AV116CanResold, 8, 2));
         }
         else
         {
            AV116CanResold = localUtil.ctond( httpContext.cgiGet( edtavCanresold_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV116CanResold", GXutil.ltrimstr( AV116CanResold, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavOldfaccon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavOldfaccon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vOLDFACCON");
            GX_FocusControl = edtavOldfaccon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV117OldFaccon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117OldFaccon", GXutil.ltrimstr( AV117OldFaccon, 11, 5));
         }
         else
         {
            AV117OldFaccon = localUtil.ctond( httpContext.cgiGet( edtavOldfaccon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV117OldFaccon", GXutil.ltrimstr( AV117OldFaccon, 11, 5));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDEXIALM");
            GX_FocusControl = edtavPrdexialm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV122PrdExiAlm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
         }
         else
         {
            AV122PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtavPrdexialm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDCANRES");
            GX_FocusControl = edtavPrdcanres_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV123PrdCanRes = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
         }
         else
         {
            AV123PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtavPrdcanres_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavLrecet_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavLrecet_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLRECET");
            GX_FocusControl = edtavLrecet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV140Lrecet = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140Lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140Lrecet), 4, 0));
         }
         else
         {
            AV140Lrecet = (short)(localUtil.ctol( httpContext.cgiGet( edtavLrecet_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV140Lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140Lrecet), 4, 0));
         }
         AV158Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV158Pgmname", AV158Pgmname);
         AV44MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44MaqCod", AV44MaqCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod), 6, 0));
         }
         else
         {
            AV24CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod), 6, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_263_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2632( ) ;
         if ( nGXsfl_263_idx > 0 )
         {
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV152Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV152Seleccionar);
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
               AV57PrdRGB = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57PrdRGB), 10, 0));
            }
            else
            {
               AV57PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57PrdRGB), 10, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
               GX_FocusControl = edtavR_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV61R = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61R), 3, 0));
            }
            else
            {
               AV61R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61R), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
               GX_FocusControl = edtavG_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV34G = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34G), 3, 0));
            }
            else
            {
               AV34G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34G), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
               GX_FocusControl = edtavB_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV6B = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6B), 3, 0));
            }
            else
            {
               AV6B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6B), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
               GX_FocusControl = edtavR2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV62R2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62R2), 3, 0));
            }
            else
            {
               AV62R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62R2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
               GX_FocusControl = edtavG2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV35G2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35G2), 3, 0));
            }
            else
            {
               AV35G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35G2), 3, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
               GX_FocusControl = edtavB2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV7B2 = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
            }
            else
            {
               AV7B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
            }
            A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
            n6018ProForFab = false ;
            A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLOR");
               GX_FocusControl = edtavColor_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV145Color = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColor_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145Color), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
            }
            else
            {
               AV145Color = (short)(localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavColor_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145Color), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"RecetadeTinte02__WP");
         AV52Modif = httpContext.cgiGet( edtavModif_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Modif", AV52Modif);
         forbiddenHiddens.add("Modif", GXutil.rtrim( localUtil.format( AV52Modif, "")));
         AV8BarAgrEst = httpContext.cgiGet( edtavBaragrest_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarAgrEst", AV8BarAgrEst);
         forbiddenHiddens.add("BarAgrEst", GXutil.rtrim( localUtil.format( AV8BarAgrEst, "@!")));
         AV158Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV158Pgmname", AV158Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV158Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("recetadetinte02__wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e362AX2 ();
      if (returnInSub) return;
   }

   public void e362AX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      divTablelog_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablelog_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablelog_Visible), 5, 0), true);
      AV106UsurCod = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV106UsurCod", AV106UsurCod);
      GXt_char1 = AV73Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      recetadetinte02__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV73Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Station", AV73Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      GXv_char2[0] = AV27Emprcod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char4[0] = AV106UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV73Station, GXv_char2, GXv_char3, GXv_char4) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char2[0] ;
      recetadetinte02__wp_impl.this.AV28EmprNom = GXv_char3[0] ;
      recetadetinte02__wp_impl.this.AV106UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV106UsurCod", AV106UsurCod);
      GXt_int5 = (byte)(AV111FlagStdp) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "RECSTD", ""), GXv_int6) ;
      recetadetinte02__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV111FlagStdp = GXt_int5 ;
      GXt_int5 = (byte)(AV112RecipeTinte) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "RCPTTE", ""), GXv_int6) ;
      recetadetinte02__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV112RecipeTinte = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112RecipeTinte", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV112RecipeTinte), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECIPETINTE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV112RecipeTinte), "ZZZ9")));
      GXt_int5 = (byte)(AV23Carvitin) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "CARVIT", ""), GXv_int6) ;
      recetadetinte02__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23Carvitin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Carvitin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23Carvitin), "ZZZ9")));
      GXt_int5 = (byte)(AV5Automata) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "AUTOMA", ""), GXv_int6) ;
      recetadetinte02__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV5Automata = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Automata", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Automata), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vAUTOMATA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV5Automata), "ZZZ9")));
      GXt_int5 = AV151FlagFo13 ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "FO0013", ""), GXv_int6) ;
      recetadetinte02__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV151FlagFo13 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV151FlagFo13", GXutil.str( AV151FlagFo13, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFO13", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV151FlagFo13), "9")));
      AV52Modif = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Modif", AV52Modif);
      AV53Modo = Gx_mode ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Modo", AV53Modo);
      AV16BarNHdr = GXutil.trim( GXutil.str( AV9Barcod, 8, 0)) + "-" + GXutil.str( AV11Barcodreo, 1, 0) + AV10Barcodpar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarNHdr", AV16BarNHdr);
      GXt_char1 = AV73Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      recetadetinte02__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV73Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73Station", AV73Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73Station, ""))));
      GXv_char4[0] = AV27Emprcod ;
      GXv_char3[0] = AV28EmprNom ;
      GXv_char2[0] = AV106UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV73Station, GXv_char4, GXv_char3, GXv_char2) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char4[0] ;
      recetadetinte02__wp_impl.this.AV28EmprNom = GXv_char3[0] ;
      recetadetinte02__wp_impl.this.AV106UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV106UsurCod", AV106UsurCod);
      divUnnamedtable6_Height = 20 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable6_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable6_Height), 9, 0), true);
      divUnnamedtable3_Height = 20 ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable3_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable3_Height), 9, 0), true);
      Popover_baragrest_Iteminternalname = edtavBaragrest_Internalname ;
      ucPopover_baragrest.sendProperty(context, "", false, Popover_baragrest_Internalname, "ItemInternalName", Popover_baragrest_Iteminternalname);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV26DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV26DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Receta Tinte v.02", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      /* Using cursor H02AX6 */
      pr_default.execute(2, new Object[] {AV27Emprcod, Integer.valueOf(AV9Barcod), Byte.valueOf(AV11Barcodreo), AV10Barcodpar, Short.valueOf(AV66RecLinMaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A2804RecLinMaq = H02AX6_A2804RecLinMaq[0] ;
         A130BarCodPar = H02AX6_A130BarCodPar[0] ;
         A132BarCodReo = H02AX6_A132BarCodReo[0] ;
         A129BarCod = H02AX6_A129BarCod[0] ;
         A396EmprCod = H02AX6_A396EmprCod[0] ;
         A602MaqCod = H02AX6_A602MaqCod[0] ;
         A2805RecVolPrd = H02AX6_A2805RecVolPrd[0] ;
         A2806RecFA = H02AX6_A2806RecFA[0] ;
         A5110RecNumPrg = H02AX6_A5110RecNumPrg[0] ;
         A252CliCod = H02AX6_A252CliCod[0] ;
         n252CliCod = H02AX6_n252CliCod[0] ;
         A279CliNom = H02AX6_A279CliNom[0] ;
         A212BarSer = H02AX6_A212BarSer[0] ;
         A135BarColNom = H02AX6_A135BarColNom[0] ;
         A136BarColNum = H02AX6_A136BarColNum[0] ;
         A218BarTipCol = H02AX6_A218BarTipCol[0] ;
         A120BarAgrEst = H02AX6_A120BarAgrEst[0] ;
         A184BarMtr = H02AX6_A184BarMtr[0] ;
         A870BarTotMtr = H02AX6_A870BarTotMtr[0] ;
         A166BarKgm = H02AX6_A166BarKgm[0] ;
         A219BarTotAgr = H02AX6_A219BarTotAgr[0] ;
         A252CliCod = H02AX6_A252CliCod[0] ;
         n252CliCod = H02AX6_n252CliCod[0] ;
         A212BarSer = H02AX6_A212BarSer[0] ;
         A135BarColNom = H02AX6_A135BarColNom[0] ;
         A136BarColNum = H02AX6_A136BarColNum[0] ;
         A218BarTipCol = H02AX6_A218BarTipCol[0] ;
         A120BarAgrEst = H02AX6_A120BarAgrEst[0] ;
         A279CliNom = H02AX6_A279CliNom[0] ;
         A870BarTotMtr = H02AX6_A870BarTotMtr[0] ;
         A219BarTotAgr = H02AX6_A219BarTotAgr[0] ;
         A184BarMtr = H02AX6_A184BarMtr[0] ;
         A166BarKgm = H02AX6_A166BarKgm[0] ;
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
         AV44MaqCod = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44MaqCod", AV44MaqCod);
         AV45MaqcodOld = A602MaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45MaqcodOld", AV45MaqcodOld);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCODOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45MaqcodOld, ""))));
         /* Execute user subroutine: 'MAQUIN' */
         S153 ();
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
         AV20BarVolMaq = A2805RecVolPrd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarVolMaq), 5, 0));
         AV21BarVolMaqOld = A2805RecVolPrd ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarVolMaqOld", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarVolMaqOld), 5, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARVOLMAQOLD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21BarVolMaqOld), "ZZZZ9")));
         AV63Rb = ((A812RecTotKgm.doubleValue()>0) ? DecimalUtil.doubleToDec(A2805RecVolPrd).divide(A812RecTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63Rb", GXutil.ltrimstr( AV63Rb, 6, 2));
         AV65RecfaIN = A2806RecFA ;
         AV67RecNumPrgIN = A5110RecNumPrg ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67RecNumPrgIN", AV67RecNumPrgIN);
         AV68RecNumPrgold = A5110RecNumPrg ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68RecNumPrgold", AV68RecNumPrgold);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECNUMPRGOLD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV68RecNumPrgold, ""))));
         AV69RecTotKgm = A812RecTotKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69RecTotKgm", GXutil.ltrimstr( AV69RecTotKgm, 10, 2));
         AV71RecTotMtr = A871RecTotMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71RecTotMtr", GXutil.ltrimstr( AV71RecTotMtr, 10, 2));
         AV70RecTotKgs = AV69RecTotKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70RecTotKgs", GXutil.ltrimstr( AV70RecTotKgs, 10, 2));
         AV24CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCod), 6, 0));
         AV25CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25CliNom", AV25CliNom);
         AV17BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17BarSer", AV17BarSer);
         AV12BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12BarColNom", AV12BarColNom);
         AV13BarColNum = A136BarColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarColNum), 6, 0));
         AV19BarTipCol = A218BarTipCol ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarTipCol), 2, 0));
         AV8BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarAgrEst", AV8BarAgrEst);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      Combo_maqcod_Selectedvalue_set = AV44MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
      AV107RecFA = AV65RecfaIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107RecFA", GXutil.ltrimstr( AV107RecFA, 6, 2));
      imgPromptagrupada_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPromptagrupada_Internalname, "gximage", imgPromptagrupada_gximage, true);
      AV113Promptagrupada = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      AV160Promptagrupada_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
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
      GXt_int9 = AV138ValCos ;
      GXv_char4[0] = AV27Emprcod ;
      GXv_char3[0] = "030100" ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char4[0] ;
      recetadetinte02__wp_impl.this.GXt_int9 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      AV138ValCos = (short)(GXt_int9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV138ValCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV138ValCos), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALCOS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV138ValCos), "ZZZ9")));
      GXt_int5 = (byte)(AV139Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV27Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      recetadetinte02__wp_impl.this.GXt_int5 = GXv_int6[0] ;
      AV139Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV139Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV139Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV139Moda21), "ZZZ9")));
   }

   public void e372AX2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV105WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV105WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      chkavSeleccionar.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "Columnheaderclass", chkavSeleccionar.getColumnHeaderClass(), !bGXsfl_263_Refreshing);
      edtRecLinPro_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Columnheaderclass", edtRecLinPro_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtProForCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Columnheaderclass", edtProForCod_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtProForDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Columnheaderclass", edtProForDsc_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtRecLin_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Columnheaderclass", edtRecLin_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtRecPrdNum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Columnheaderclass", edtRecPrdNum_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtRecPrdDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Columnheaderclass", edtRecPrdDsc_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtFacCon_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Columnheaderclass", edtFacCon_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtPrdCant_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Columnheaderclass", edtPrdCant_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtForPrdDsc_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Columnheaderclass", edtForPrdDsc_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtRecForNro_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Columnheaderclass", edtRecForNro_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtRecPrdTnq_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Columnheaderclass", edtRecPrdTnq_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtRecLote_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Columnheaderclass", edtRecLote_Columnheaderclass, !bGXsfl_263_Refreshing);
      edtavColor_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtavColor_Internalname, "Columnheaderclass", edtavColor_Columnheaderclass, !bGXsfl_263_Refreshing);
      if ( AV149Acciongridmodificar == 1 )
      {
         AV149Acciongridmodificar = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV149Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149Acciongridmodificar), 4, 0));
      }
      else
      {
         if ( ( AV58Procesosdadosdealta > 0 ) || ( AV22CambioPrograma == 1 ) )
         {
            AV60ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
            AV60ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
            AV60ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
            AV60ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
            AV60ProgressIndicator.show();
            AV60ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
            GXv_char4[0] = AV27Emprcod ;
            GXv_int10[0] = AV9Barcod ;
            GXv_int6[0] = AV11Barcodreo ;
            GXv_char3[0] = AV10Barcodpar ;
            GXv_int12[0] = AV66RecLinMaq ;
            GXv_char2[0] = AV64RecetasTinteProcesosQuimicosToJson ;
            new app.recetadetinte02_prc(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int12, GXv_char2) ;
            recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
            recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int6[0] ;
            recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int12[0] ;
            recetadetinte02__wp_impl.this.AV64RecetasTinteProcesosQuimicosToJson = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV64RecetasTinteProcesosQuimicosToJson", AV64RecetasTinteProcesosQuimicosToJson);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRECETASTINTEPROCESOSQUIMICOSTOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV64RecetasTinteProcesosQuimicosToJson, ""))));
            GXv_char4[0] = AV27Emprcod ;
            GXv_int10[0] = AV9Barcod ;
            GXv_int6[0] = AV11Barcodreo ;
            GXv_char3[0] = AV10Barcodpar ;
            GXv_int12[0] = AV66RecLinMaq ;
            new app.eliminarrecetasincambiodesituacion(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int12) ;
            recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
            recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int6[0] ;
            recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
            GXv_char4[0] = AV27Emprcod ;
            GXv_int10[0] = AV9Barcod ;
            GXv_int6[0] = AV11Barcodreo ;
            GXv_char3[0] = AV10Barcodpar ;
            GXv_int12[0] = AV66RecLinMaq ;
            new app.pdelrec3(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int6, GXv_char3, GXv_int12) ;
            recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
            recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int6[0] ;
            recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int12[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
            AV42Inc_obs = ((AV58Procesosdadosdealta>0) ? httpContext.getMessage( "Receta Tinte, eliminada por cambios en procesos quimicos", "") : httpContext.getMessage( "Receta Tinte, eliminada por cambio de Nº programa", "")) ;
            new app.pctrinc(remoteHandle, context).execute( AV27Emprcod, GXutil.substring( AV158Pgmname, 1, 10), AV106UsurCod, AV73Station, AV42Inc_obs, AV9Barcod, AV11Barcodreo, AV10Barcodpar) ;
            /* Execute user subroutine: 'VOLVERACREARRECETA' */
            S172 ();
            if (returnInSub) return;
            AV60ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
            AV60ProgressIndicator.hide();
            AV52Modif = "Y" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Modif", AV52Modif);
            AV58Procesosdadosdealta = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58Procesosdadosdealta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Procesosdadosdealta), 4, 0));
            lblLog_Caption = ((AV22CambioPrograma==1) ? httpContext.getMessage( "Atencion. Cambio de Programa, se elimina la receta y se vuelve a lazar.Se volvera a enviar al automata!", "") : httpContext.getMessage( "Atencion.Se ha vuelto a crear la receta. Se volvera a enviar al automata!", "")) ;
            httpContext.ajax_rsp_assign_prop("", false, lblLog_Internalname, "Caption", lblLog_Caption, true);
         }
         if ( AV59Procesoseliminados > 0 )
         {
            lblLog_Caption = httpContext.getMessage( "Atencion.Se han eliminado, Procesos. Se volvera a enviar al automata!", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblLog_Internalname, "Caption", lblLog_Caption, true);
            AV52Modif = "Y" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Modif", AV52Modif);
            AV59Procesoseliminados = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59Procesoseliminados", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59Procesoseliminados), 4, 0));
         }
         AV144lastvariable = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV144lastvariable", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144lastvariable), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTVARIABLE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV144lastvariable), "Z9")));
         AV145Color = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavColor_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145Color), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction1_Internalname});
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction2_Internalname});
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   private void e382AX2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( A1273RecLinPro != AV144lastvariable )
      {
         AV145Color = (short)(((0==AV145Color) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavColor_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV145Color), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCOLOR"+"_"+sGXsfl_263_idx, getSecureSignedToken( sGXsfl_263_idx, localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")));
      }
      AV57PrdRGB = ((A13232PrdRGB==0) ? 16777215 : A13232PrdRGB) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57PrdRGB), 10, 0));
      GXv_int12[0] = AV61R ;
      GXv_int13[0] = AV34G ;
      GXv_int14[0] = AV6B ;
      GXv_int15[0] = AV62R2 ;
      GXv_int16[0] = AV35G2 ;
      GXv_int17[0] = AV7B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV57PrdRGB, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16, GXv_int17) ;
      recetadetinte02__wp_impl.this.AV61R = GXv_int12[0] ;
      recetadetinte02__wp_impl.this.AV34G = GXv_int13[0] ;
      recetadetinte02__wp_impl.this.AV6B = GXv_int14[0] ;
      recetadetinte02__wp_impl.this.AV62R2 = GXv_int15[0] ;
      recetadetinte02__wp_impl.this.AV35G2 = GXv_int16[0] ;
      recetadetinte02__wp_impl.this.AV7B2 = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61R), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34G), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6B), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62R2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35G2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7B2), 3, 0));
      edtRecPrdDsc_Backcolor = GXutil.getColor( AV61R, AV34G, AV6B) ;
      edtRecPrdDsc_Forecolor = GXutil.getColor( AV62R2, AV35G2, AV7B2) ;
      if ( A4024RecMar == 1 )
      {
         chkavSeleccionar.setColumnClass( "WWColumn WWColumnDanger WWColumnDangerFirstColumn" );
         edtRecLinPro_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtProForCod_Columnclass = "WWColumn WWColumnDanger" ;
         edtProForDsc_Columnclass = "WWColumn WWColumnDanger" ;
         edtRecLin_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtRecPrdNum_Columnclass = "WWColumn WWColumnDanger" ;
         edtRecPrdDsc_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtFacCon_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtPrdCant_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtForPrdDsc_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtRecForNro_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtRecPrdTnq_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtRecLote_Columnclass = "WWColumn WWColumnDanger hidden-xs" ;
         edtavColor_Columnclass = "WWColumn WWColumnDanger" ;
      }
      else if ( AV145Color == 1 )
      {
         chkavSeleccionar.setColumnClass( "WWColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
         edtRecLinPro_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtProForCod_Columnclass = "WWColumn WWColumnSuccess" ;
         edtProForDsc_Columnclass = "WWColumn WWColumnSuccess" ;
         edtRecLin_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtRecPrdNum_Columnclass = "WWColumn WWColumnSuccess" ;
         edtRecPrdDsc_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtFacCon_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtPrdCant_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtForPrdDsc_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtRecForNro_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtRecPrdTnq_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtRecLote_Columnclass = "WWColumn WWColumnSuccess hidden-xs" ;
         edtavColor_Columnclass = "WWColumn WWColumnSuccess" ;
      }
      else
      {
         chkavSeleccionar.setColumnClass( httpContext.getMessage( "WWColumn", "") );
         edtRecLinPro_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtProForCod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtProForDsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtRecLin_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtRecPrdNum_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtRecPrdDsc_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtFacCon_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtPrdCant_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtForPrdDsc_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtRecForNro_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtRecPrdTnq_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtRecLote_Columnclass = httpContext.getMessage( "WWColumn hidden-xs", "") ;
         edtavColor_Columnclass = httpContext.getMessage( "WWColumn", "") ;
      }
      AV144lastvariable = A1273RecLinPro ;
      httpContext.ajax_rsp_assign_attri("", false, "AV144lastvariable", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV144lastvariable), 2, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLASTVARIABLE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV144lastvariable), "Z9")));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(263) ;
      }
      sendrow_2632( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_263_Refreshing )
      {
         httpContext.doAjaxLoad(263, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e202AX2 ();
      if (returnInSub) return;
   }

   public void e202AX2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV137RecLinPro) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Es necesario el valor en #", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavReclinpro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV125RecPrdNum)==0) )
         {
            GXt_char1 = AV134PrdNom ;
            GXv_char4[0] = AV27Emprcod ;
            GXv_char3[0] = AV125RecPrdNum ;
            GXv_char2[0] = GXt_char1 ;
            new app.pprddsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
            recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV125RecPrdNum = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.GXt_char1 = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV125RecPrdNum", AV125RecPrdNum);
            AV134PrdNom = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV134PrdNom", AV134PrdNom);
            GXt_char1 = AV150ForPrdDsccontrol ;
            GXv_char4[0] = GXt_char1 ;
            new app.get_forprddsc(remoteHandle, context).execute( AV27Emprcod, AV129ForPrdUMe, GXv_char4) ;
            recetadetinte02__wp_impl.this.GXt_char1 = GXv_char4[0] ;
            AV150ForPrdDsccontrol = GXt_char1 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV150ForPrdDsccontrol", AV150ForPrdDsccontrol);
         }
         if ( ( GXutil.strcmp(AV134PrdNom, httpContext.getMessage( "Error", "")) == 0 ) && ! (GXutil.strcmp("", AV125RecPrdNum)==0) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "NO existe Producto", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavRecprdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( GXutil.strcmp(AV150ForPrdDsccontrol, httpContext.getMessage( "Error", "")) == 0 ) && ! (GXutil.strcmp("", AV125RecPrdNum)==0) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "NO es una UNIDAD Valida", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavForprdume_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (0==AV124RecLin) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Se debe de entrar Numero Linea", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavReclin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  GXv_int6[0] = AV32Flag ;
                  GXv_int18[0] = AV136Valcod ;
                  new app.pbusval(remoteHandle, context).execute( AV27Emprcod, AV125RecPrdNum, GXv_int6, GXv_int18) ;
                  recetadetinte02__wp_impl.this.AV32Flag = GXv_int6[0] ;
                  recetadetinte02__wp_impl.this.AV136Valcod = GXv_int18[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV32Flag", GXutil.str( AV32Flag, 1, 0));
                  if ( ( AV136Valcod == 3 ) && ! (GXutil.strcmp("", AV125RecPrdNum)==0) )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "Producto SUPRIMIDO", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavRecprdnum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ( AV128FacCon.doubleValue() > 0 ) && ( AV129ForPrdUMe == 0 ) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "AVISO. NO hay PRODUCTO. Hay Factor, pero NO ha entrado UNIDAD=1,2,3", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavForprdume_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( ! ( ( GXutil.strcmp(AV121RecManAut, httpContext.getMessage( "M", "")) == 0 ) || ( GXutil.strcmp(AV121RecManAut, httpContext.getMessage( "A", "")) == 0 ) ) && ! (GXutil.strcmp("", AV125RecPrdNum)==0) )
                        {
                           lblTbmessage_Caption = httpContext.getMessage( "El valor permitido es M(manual) o A(automatico)", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           GX_FocusControl = edtavRecmanaut_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           /* Execute user subroutine: 'CALCULARCANTIDAD' */
                           S182 ();
                           if (returnInSub) return;
                           if ( AV140Lrecet == 0 )
                           {
                              Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "Desea agregar en proceso(#) ", "")+GXutil.trim( GXutil.str( AV137RecLinPro, 2, 0))+httpContext.getMessage( ", la linea(##) ", "")+GXutil.trim( GXutil.str( AV124RecLin, 4, 0))+"?" ;
                              ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                           }
                           else
                           {
                              Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "Desea modificar la linea ", "")+GXutil.trim( GXutil.str( AV124RecLin, 4, 0))+"?" ;
                              ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                           }
                           this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e152AX2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e212AX2( )
   {
      /* 'DoEliminarLineas' Routine */
      returnInSub = false ;
      AV153lineas = (short)(0) ;
      /* Start For Each Line */
      nRC_GXsfl_263 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_263"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_263_fel_idx = 0 ;
      while ( nGXsfl_263_fel_idx < nRC_GXsfl_263 )
      {
         nGXsfl_263_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_263_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_263_fel_idx+1) ;
         sGXsfl_263_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_2632( ) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV152Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
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
            wbErr = true ;
            AV57PrdRGB = 0 ;
         }
         else
         {
            AV57PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
            GX_FocusControl = edtavR_Internalname ;
            wbErr = true ;
            AV61R = (short)(0) ;
         }
         else
         {
            AV61R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
            GX_FocusControl = edtavG_Internalname ;
            wbErr = true ;
            AV34G = (short)(0) ;
         }
         else
         {
            AV34G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
            GX_FocusControl = edtavB_Internalname ;
            wbErr = true ;
            AV6B = (short)(0) ;
         }
         else
         {
            AV6B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
            GX_FocusControl = edtavR2_Internalname ;
            wbErr = true ;
            AV62R2 = (short)(0) ;
         }
         else
         {
            AV62R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
            GX_FocusControl = edtavG2_Internalname ;
            wbErr = true ;
            AV35G2 = (short)(0) ;
         }
         else
         {
            AV35G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
            GX_FocusControl = edtavB2_Internalname ;
            wbErr = true ;
            AV7B2 = (short)(0) ;
         }
         else
         {
            AV7B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
         n6018ProForFab = false ;
         A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLOR");
            GX_FocusControl = edtavColor_Internalname ;
            wbErr = true ;
            AV145Color = (short)(0) ;
         }
         else
         {
            AV145Color = (short)(localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( AV152Seleccionar )
         {
            AV153lineas = (short)(AV153lineas+1) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_263_fel_idx == 0 )
      {
         nGXsfl_263_idx = 1 ;
         sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2632( ) ;
      }
      nGXsfl_263_fel_idx = 1 ;
      if ( (0==AV153lineas) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha seleccionado lineas (Op)", ""));
      }
      else
      {
         Dvelop_confirmpanel_eliminarlineas_Confirmationtext = httpContext.getMessage( "Ha seleccionado esta(s) linea(s) ", "")+localUtil.format( DecimalUtil.doubleToDec(AV153lineas), "ZZZ9")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_eliminarlineas.sendProperty(context, "", false, Dvelop_confirmpanel_eliminarlineas_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminarlineas_Confirmationtext);
         Dvelop_confirmpanel_eliminarlineas_Confirmationtext = Dvelop_confirmpanel_eliminarlineas_Confirmationtext+httpContext.getMessage( "Confirma su eliminacion?", "") ;
         ucDvelop_confirmpanel_eliminarlineas.sendProperty(context, "", false, Dvelop_confirmpanel_eliminarlineas_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminarlineas_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARLINEASContainer", "Confirm", "", new Object[] {});
      }
      /*  Sending Event outputs  */
   }

   public void e162AX2( )
   {
      /* Dvelop_confirmpanel_eliminarlineas_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlineas_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEAS' */
         S202 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e222AX2( )
   {
      /* 'DoLimpiar' Routine */
      returnInSub = false ;
      AV124RecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124RecLin), 4, 0));
      AV140Lrecet = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140Lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140Lrecet), 4, 0));
      AV125RecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125RecPrdNum", AV125RecPrdNum);
      AV127RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127RecPrdDsc", AV127RecPrdDsc);
      AV129ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
      AV130ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
      AV128FacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128FacCon", GXutil.ltrimstr( AV128FacCon, 11, 5));
      AV131PrdCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
      AV121RecManAut = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121RecManAut", AV121RecManAut);
      AV118RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118RecLote", AV118RecLote);
      AV119RecForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119RecForNro), 2, 0));
      AV120RecPrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120RecPrdTnq), 2, 0));
      AV114oldRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114oldRecLote", AV114oldRecLote);
      AV115Cantold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Cantold", GXutil.ltrimstr( AV115Cantold, 11, 3));
      AV116CanResold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116CanResold", GXutil.ltrimstr( AV116CanResold, 8, 2));
      AV122PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
      AV123PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
      AV135Prdexicc = DecimalUtil.ZERO ;
      AV137RecLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137RecLinPro), 2, 0));
      AV143RecLinMax = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV143RecLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143RecLinMax), 4, 0));
      AV146RecLinMin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146RecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146RecLinMin), 4, 0));
      GX_FocusControl = edtavReclin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e232AX2( )
   {
      /* 'DoUserAction2' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.stocksquimicos.producprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV125RecPrdNum)),GXutil.URLEncode(GXutil.rtrim(AV127RecPrdDsc))}, new String[] {"InOutEmprCod","InOutPrdNum","InOutPrdNom"}) , new Object[] {"AV27Emprcod","AV125RecPrdNum","AV127RecPrdDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e242AX2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.tunmefoprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV129ForPrdUMe,1,0)),GXutil.URLEncode(GXutil.rtrim(AV130ForPrdDsc))}, new String[] {"InOutEmprCod","InOutForPrdUMe","InOutForPrdDsc"}) , new Object[] {"AV27Emprcod","AV129ForPrdUMe","AV130ForPrdDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e172AX2( )
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
   }

   public void e352AX2( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      if ( AV112RecipeTinte == 1 )
      {
         httpContext.popup(formatLink("app.ptintrecipe", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV44MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV18BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(1,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Copias","Output"}) , new Object[] {"AV27Emprcod","AV9Barcod","AV11Barcodreo","AV10Barcodpar","AV44MaqCod","AV18BarSua","AV20BarVolMaq","AV66RecLinMaq","","",""});
      }
      else
      {
         httpContext.popup(formatLink("app.rrecstdp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV44MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV18BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Output"}) , new Object[] {"AV27Emprcod","AV9Barcod","AV11Barcodreo","AV10Barcodpar","AV44MaqCod","AV18BarSua","AV20BarVolMaq","AV66RecLinMaq","",""});
      }
      if ( AV23Carvitin == 1 )
      {
         httpContext.popup(formatLink("app.pinf2recetatinte", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","Output"}) , new Object[] {"AV27Emprcod","AV9Barcod","AV11Barcodreo","AV10Barcodpar","AV66RecLinMaq",""});
      }
      /*  Sending Event outputs  */
   }

   public void e182AX2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S222 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e192AX2( )
   {
      /* Dvelop_confirmpanel_cerrar_Close Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
         {
            /* Execute user subroutine: 'DO ACTION CERRAR' */
            S232 ();
            if (returnInSub) return;
         }
      }
      if ( GXutil.strcmp(Dvelop_confirmpanel_cerrar_Result, "Yes") == 0 )
      {
         if ( ( AV5Automata == 1 ) && ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) ) || ( ( GXutil.strcmp(AV52Modif, "Y") == 0 ) ) )
         {
            if ( ( GXutil.strcmp(AV52Modif, "Y") == 0 ) && ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) != 0 ) )
            {
               GXv_char4[0] = AV27Emprcod ;
               GXv_int10[0] = AV9Barcod ;
               GXv_int18[0] = AV11Barcodreo ;
               GXv_char3[0] = AV10Barcodpar ;
               GXv_int17[0] = AV66RecLinMaq ;
               GXv_int6[0] = (byte)(3) ;
               GXv_char2[0] = AV33FlagOpe ;
               GXv_char19[0] = AV29ErrMensajeautomata ;
               new app.pdyrp030(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int18, GXv_char3, GXv_int17, GXv_int6, GXv_char2, GXv_char19) ;
               recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char4[0] ;
               recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
               recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
               recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char3[0] ;
               recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
               recetadetinte02__wp_impl.this.AV33FlagOpe = GXv_char2[0] ;
               recetadetinte02__wp_impl.this.AV29ErrMensajeautomata = GXv_char19[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV33FlagOpe", AV33FlagOpe);
            }
            GXv_char19[0] = AV27Emprcod ;
            GXv_int10[0] = AV9Barcod ;
            GXv_int18[0] = AV11Barcodreo ;
            GXv_char4[0] = AV10Barcodpar ;
            GXv_int17[0] = AV66RecLinMaq ;
            GXv_int6[0] = (byte)(1) ;
            GXv_char3[0] = AV33FlagOpe ;
            GXv_char2[0] = AV29ErrMensajeautomata ;
            new app.pdyrp030(remoteHandle, context).execute( GXv_char19, GXv_int10, GXv_int18, GXv_char4, GXv_int17, GXv_int6, GXv_char3, GXv_char2) ;
            recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
            recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
            recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
            recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
            recetadetinte02__wp_impl.this.AV33FlagOpe = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.AV29ErrMensajeautomata = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV33FlagOpe", AV33FlagOpe);
         }
      }
      /* Execute user subroutine: 'DO ACTION CERRAR' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e252AX2( )
   {
      /* 'DoAdd' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.recetadetinte06_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","Procesosdadosdealta"}) , new Object[] {"AV58Procesosdadosdealta"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e262AX2( )
   {
      /* 'DoEliminarProcesos' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.recetadetinte04_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","Reclinmaq","Procesoseliminados"}) , new Object[] {"AV59Procesoseliminados"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e272AX2( )
   {
      /* 'DoCambiar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.recetadetinte05_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A2804RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(AV67RecNumPrgIN)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarVolMaq,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV69RecTotKgm)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","RecLinMaq","RecNumPrg","RecVolPrd","Rectotkgm","CambioPrograma"}) , new Object[] {"AV67RecNumPrgIN","AV22CambioPrograma"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e142AX2( )
   {
      /* Combo_maqcod_Onoptionclicked Routine */
      returnInSub = false ;
      AV44MaqCod = Combo_maqcod_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44MaqCod", AV44MaqCod);
      /* Execute user subroutine: 'MAQUIN' */
      S153 ();
      if (returnInSub) return;
      if ( ( AV48Maquin == 1 ) && ( ( AV20BarVolMaq < AV51MaqVolMin ) || ( AV20BarVolMaq > AV49MaqVolMax ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
      }
      /*  Sending Event outputs  */
   }

   public void S192( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.recetatinte91__prc(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV137RecLinPro, AV124RecLin, AV128FacCon, AV129ForPrdUMe, AV131PrdCant, AV119RecForNro, AV118RecLote, AV121RecManAut, AV127RecPrdDsc, AV125RecPrdNum, AV120RecPrdTnq, AV114oldRecLote, AV115Cantold, AV116CanResold, AV117OldFaccon, AV133TotaldeKilos, AV20BarVolMaq, AV138ValCos, AV106UsurCod, AV73Station) ;
      GXv_char19[0] = AV27Emprcod ;
      GXv_int10[0] = AV9Barcod ;
      GXv_int18[0] = AV11Barcodreo ;
      GXv_char4[0] = AV10Barcodpar ;
      GXv_int17[0] = AV66RecLinMaq ;
      new app.pfo0005(remoteHandle, context).execute( GXv_char19, GXv_int10, GXv_int18, GXv_char4, GXv_int17) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
      recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
      recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
      recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
      recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
      AV124RecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124RecLin), 4, 0));
      AV140Lrecet = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV140Lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140Lrecet), 4, 0));
      AV125RecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV125RecPrdNum", AV125RecPrdNum);
      AV127RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127RecPrdDsc", AV127RecPrdDsc);
      AV129ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
      AV130ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
      AV128FacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV128FacCon", GXutil.ltrimstr( AV128FacCon, 11, 5));
      AV131PrdCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
      AV121RecManAut = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121RecManAut", AV121RecManAut);
      AV118RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118RecLote", AV118RecLote);
      AV119RecForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV119RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119RecForNro), 2, 0));
      AV120RecPrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV120RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120RecPrdTnq), 2, 0));
      AV114oldRecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV114oldRecLote", AV114oldRecLote);
      AV115Cantold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Cantold", GXutil.ltrimstr( AV115Cantold, 11, 3));
      AV116CanResold = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116CanResold", GXutil.ltrimstr( AV116CanResold, 8, 2));
      AV122PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
      AV123PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
      AV135Prdexicc = DecimalUtil.ZERO ;
      GX_FocusControl = edtavReclin_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      AV137RecLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137RecLinPro), 2, 0));
      AV143RecLinMax = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV143RecLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143RecLinMax), 4, 0));
      AV146RecLinMin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV146RecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146RecLinMin), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO ACTION ELIMINARLINEAS' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_263 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_263"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_263_fel_idx = 0 ;
      while ( nGXsfl_263_fel_idx < nRC_GXsfl_263 )
      {
         nGXsfl_263_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_263_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_263_fel_idx+1) ;
         sGXsfl_263_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_2632( ) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV152Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
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
            wbErr = true ;
            AV57PrdRGB = 0 ;
         }
         else
         {
            AV57PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
            GX_FocusControl = edtavR_Internalname ;
            wbErr = true ;
            AV61R = (short)(0) ;
         }
         else
         {
            AV61R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
            GX_FocusControl = edtavG_Internalname ;
            wbErr = true ;
            AV34G = (short)(0) ;
         }
         else
         {
            AV34G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
            GX_FocusControl = edtavB_Internalname ;
            wbErr = true ;
            AV6B = (short)(0) ;
         }
         else
         {
            AV6B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
            GX_FocusControl = edtavR2_Internalname ;
            wbErr = true ;
            AV62R2 = (short)(0) ;
         }
         else
         {
            AV62R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
            GX_FocusControl = edtavG2_Internalname ;
            wbErr = true ;
            AV35G2 = (short)(0) ;
         }
         else
         {
            AV35G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
            GX_FocusControl = edtavB2_Internalname ;
            wbErr = true ;
            AV7B2 = (short)(0) ;
         }
         else
         {
            AV7B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A6018ProForFab = httpContext.cgiGet( edtProForFab_Internalname) ;
         n6018ProForFab = false ;
         A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLOR");
            GX_FocusControl = edtavColor_Internalname ;
            wbErr = true ;
            AV145Color = (short)(0) ;
         }
         else
         {
            AV145Color = (short)(localUtil.ctol( httpContext.cgiGet( edtavColor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( AV152Seleccionar )
         {
            new app.recetatinte92__prc(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, A1273RecLinPro, A811RecLin, AV106UsurCod, AV73Station) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_263_fel_idx == 0 )
      {
         nGXsfl_263_idx = 1 ;
         sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2632( ) ;
      }
      nGXsfl_263_fel_idx = 1 ;
      GXv_char19[0] = AV27Emprcod ;
      GXv_int10[0] = AV9Barcod ;
      GXv_int18[0] = AV11Barcodreo ;
      GXv_char4[0] = AV10Barcodpar ;
      GXv_int17[0] = AV66RecLinMaq ;
      new app.pfo0005(remoteHandle, context).execute( GXv_char19, GXv_int10, GXv_int18, GXv_char4, GXv_int17) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
      recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
      recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
      recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
      recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      GXv_char19[0] = AV27Emprcod ;
      GXv_int10[0] = AV9Barcod ;
      GXv_int18[0] = AV11Barcodreo ;
      GXv_char4[0] = AV10Barcodpar ;
      GXv_int17[0] = AV66RecLinMaq ;
      new app.pbajrec(remoteHandle, context).execute( GXv_char19, GXv_int10, GXv_int18, GXv_char4, GXv_int17) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
      recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
      recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
      recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
      recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
      GXv_char19[0] = AV27Emprcod ;
      GXv_int10[0] = AV9Barcod ;
      GXv_int18[0] = AV11Barcodreo ;
      GXv_char4[0] = AV10Barcodpar ;
      GXv_int17[0] = AV66RecLinMaq ;
      new app.pdelrec3(remoteHandle, context).execute( GXv_char19, GXv_int10, GXv_int18, GXv_char4, GXv_int17) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
      recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
      recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
      recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
      recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
      if ( AV5Automata == 1 )
      {
         GXv_char19[0] = AV27Emprcod ;
         GXv_int10[0] = AV9Barcod ;
         GXv_int18[0] = AV11Barcodreo ;
         GXv_char4[0] = AV10Barcodpar ;
         GXv_int17[0] = AV66RecLinMaq ;
         GXv_int6[0] = (byte)(3) ;
         GXv_char3[0] = "" ;
         GXv_char2[0] = AV30ErrorMessage ;
         new app.pdyrp030(remoteHandle, context).execute( GXv_char19, GXv_int10, GXv_int18, GXv_char4, GXv_int17, GXv_int6, GXv_char3, GXv_char2) ;
         recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
         recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
         recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
         recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
         recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
         recetadetinte02__wp_impl.this.AV30ErrorMessage = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
      }
      AV42Inc_obs = httpContext.getMessage( "Receta Tinte, eliminada", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV27Emprcod, GXutil.substring( AV158Pgmname, 1, 10), AV106UsurCod, AV73Station, AV42Inc_obs, AV9Barcod, AV11Barcodreo, AV10Barcodpar) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S222( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S153 ();
      if (returnInSub) return;
      GXv_char19[0] = AV27Emprcod ;
      GXv_char4[0] = AV67RecNumPrgIN ;
      GXv_int18[0] = AV32Flag ;
      new app.pexprograma(remoteHandle, context).execute( GXv_char19, GXv_char4, GXv_int18) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
      recetadetinte02__wp_impl.this.AV67RecNumPrgIN = GXv_char4[0] ;
      recetadetinte02__wp_impl.this.AV32Flag = GXv_int18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV67RecNumPrgIN", AV67RecNumPrgIN);
      httpContext.ajax_rsp_assign_attri("", false, "AV32Flag", GXutil.str( AV32Flag, 1, 0));
      if ( ! (GXutil.strcmp("", AV67RecNumPrgIN)==0) && (0==AV32Flag) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Programa Inexistente", ""));
         GX_FocusControl = edtavRecnumprgin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( AV23Carvitin == 1 ) && ( ( AV20BarVolMaq < AV51MaqVolMin ) || ( AV20BarVolMaq > AV49MaqVolMax ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
         }
         if ( (0==AV23Carvitin) && ( ( AV20BarVolMaq < AV51MaqVolMin ) || ( AV20BarVolMaq > AV49MaqVolMax ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Volumen fuera de rango", ""));
            GX_FocusControl = edtavBarvolmaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char19[0] = AV27Emprcod ;
            GXv_int10[0] = AV9Barcod ;
            GXv_int18[0] = AV11Barcodreo ;
            GXv_char4[0] = AV10Barcodpar ;
            GXv_int17[0] = AV66RecLinMaq ;
            GXv_char3[0] = AV44MaqCod ;
            GXv_int20[0] = AV20BarVolMaq ;
            GXv_decimal21[0] = AV107RecFA ;
            GXv_char2[0] = AV67RecNumPrgIN ;
            new app.prec1(remoteHandle, context).execute( GXv_char19, GXv_int10, GXv_int18, GXv_char4, GXv_int17, GXv_char3, GXv_int20, GXv_decimal21, GXv_char2) ;
            recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
            recetadetinte02__wp_impl.this.AV9Barcod = GXv_int10[0] ;
            recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
            recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
            recetadetinte02__wp_impl.this.AV44MaqCod = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.AV20BarVolMaq = GXv_int20[0] ;
            recetadetinte02__wp_impl.this.AV107RecFA = GXv_decimal21[0] ;
            recetadetinte02__wp_impl.this.AV67RecNumPrgIN = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV44MaqCod", AV44MaqCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV20BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarVolMaq), 5, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV107RecFA", GXutil.ltrimstr( AV107RecFA, 6, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV67RecNumPrgIN", AV67RecNumPrgIN);
            if ( ( GXutil.strcmp(AV44MaqCod, AV45MaqcodOld) != 0 ) || ( AV20BarVolMaq != AV21BarVolMaqOld ) )
            {
               GXv_char19[0] = AV27Emprcod ;
               GXv_int20[0] = AV9Barcod ;
               GXv_int18[0] = AV11Barcodreo ;
               GXv_char4[0] = AV10Barcodpar ;
               GXv_int17[0] = AV66RecLinMaq ;
               GXv_decimal21[0] = AV69RecTotKgm ;
               GXv_int10[0] = AV20BarVolMaq ;
               new app.precrtn2(remoteHandle, context).execute( GXv_char19, GXv_int20, GXv_int18, GXv_char4, GXv_int17, GXv_decimal21, GXv_int10) ;
               recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
               recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
               recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
               recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
               recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
               recetadetinte02__wp_impl.this.AV69RecTotKgm = GXv_decimal21[0] ;
               recetadetinte02__wp_impl.this.AV20BarVolMaq = GXv_int10[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV69RecTotKgm", GXutil.ltrimstr( AV69RecTotKgm, 10, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarVolMaq), 5, 0));
            }
            GXv_char19[0] = AV27Emprcod ;
            GXv_int20[0] = AV9Barcod ;
            GXv_int18[0] = AV11Barcodreo ;
            GXv_char4[0] = AV10Barcodpar ;
            GXv_int17[0] = AV66RecLinMaq ;
            GXv_char3[0] = AV106UsurCod ;
            new app.pusudatm(remoteHandle, context).execute( GXv_char19, GXv_int20, GXv_int18, GXv_char4, GXv_int17, GXv_char3) ;
            recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
            recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
            recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
            recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
            recetadetinte02__wp_impl.this.AV106UsurCod = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV106UsurCod", AV106UsurCod);
            if ( ( AV5Automata == 1 ) && ( ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) == 0 ) ) || ( ( GXutil.strcmp(AV52Modif, "Y") == 0 ) ) )
            {
               if ( ( GXutil.strcmp(AV52Modif, "Y") == 0 ) && ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "INS", "")) != 0 ) )
               {
                  GXv_char19[0] = AV27Emprcod ;
                  GXv_int20[0] = AV9Barcod ;
                  GXv_int18[0] = AV11Barcodreo ;
                  GXv_char4[0] = AV10Barcodpar ;
                  GXv_int17[0] = AV66RecLinMaq ;
                  GXv_int6[0] = (byte)(3) ;
                  GXv_char3[0] = AV33FlagOpe ;
                  GXv_char2[0] = AV29ErrMensajeautomata ;
                  new app.pdyrp030(remoteHandle, context).execute( GXv_char19, GXv_int20, GXv_int18, GXv_char4, GXv_int17, GXv_int6, GXv_char3, GXv_char2) ;
                  recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
                  recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
                  recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
                  recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
                  recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
                  recetadetinte02__wp_impl.this.AV33FlagOpe = GXv_char3[0] ;
                  recetadetinte02__wp_impl.this.AV29ErrMensajeautomata = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV33FlagOpe", AV33FlagOpe);
               }
               GXv_char19[0] = AV27Emprcod ;
               GXv_int20[0] = AV9Barcod ;
               GXv_int18[0] = AV11Barcodreo ;
               GXv_char4[0] = AV10Barcodpar ;
               GXv_int17[0] = AV66RecLinMaq ;
               GXv_int6[0] = (byte)(1) ;
               GXv_char3[0] = AV33FlagOpe ;
               GXv_char2[0] = AV29ErrMensajeautomata ;
               new app.pdyrp030(remoteHandle, context).execute( GXv_char19, GXv_int20, GXv_int18, GXv_char4, GXv_int17, GXv_int6, GXv_char3, GXv_char2) ;
               recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
               recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
               recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int18[0] ;
               recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char4[0] ;
               recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
               recetadetinte02__wp_impl.this.AV33FlagOpe = GXv_char3[0] ;
               recetadetinte02__wp_impl.this.AV29ErrMensajeautomata = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV33FlagOpe", AV33FlagOpe);
            }
            AV154isExiste = false ;
            /* Execute user subroutine: 'ISEXISTE_DATOSLISTADOINCIDENCIASRECETA' */
            S262 ();
            if (returnInSub) return;
            if ( ( AV151FlagFo13 == 1 ) && ( AV154isExiste ) )
            {
               httpContext.popup(formatLink("app.formulaciontinte.listadoincidenciasreceta", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","Output"}) , new Object[] {});
            }
            if ( AV112RecipeTinte == 1 )
            {
               httpContext.popup(formatLink("app.ptintrecipe", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV44MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV18BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(1,9,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Copias","Output"}) , new Object[] {"AV27Emprcod","AV9Barcod","AV11Barcodreo","AV10Barcodpar","AV44MaqCod","AV18BarSua","AV20BarVolMaq","AV66RecLinMaq","","",""});
            }
            else
            {
               httpContext.popup(formatLink("app.rrecstdp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV44MaqCod)),GXutil.URLEncode(GXutil.rtrim(AV18BarSua)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarVolMaq,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarMaqCod","BarSua","Volumen","RecLinMaq","ImpCod","Output"}) , new Object[] {"AV27Emprcod","AV9Barcod","AV11Barcodreo","AV10Barcodpar","AV44MaqCod","AV18BarSua","AV20BarVolMaq","AV66RecLinMaq","",""});
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

   public void S232( )
   {
      /* 'DO ACTION CERRAR' Routine */
      returnInSub = false ;
      AV154isExiste = false ;
      /* Execute user subroutine: 'ISEXISTE_DATOSLISTADOINCIDENCIASRECETA' */
      S262 ();
      if (returnInSub) return;
      if ( ( AV151FlagFo13 == 1 ) && ( AV154isExiste ) )
      {
         httpContext.popup(formatLink("app.formulaciontinte.listadoincidenciasreceta", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV66RecLinMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","RecLinMaq","Output"}) , new Object[] {});
      }
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
      if ( GXutil.strcmp(AV72Session.getValue(AV158Pgmname+"GridState"), "") == 0 )
      {
         AV38GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV158Pgmname+"GridState"), null, null);
      }
      else
      {
         AV38GridState.fromxml(AV72Session.getValue(AV158Pgmname+"GridState"), null, null);
      }
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV38GridState.fromxml(AV72Session.getValue(AV158Pgmname+"GridState"), null, null);
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV158Pgmname+"GridState", AV38GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV102TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV102TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV158Pgmname );
      AV102TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV102TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV41HTTPRequest.getScriptName()+"?"+AV41HTTPRequest.getQuerystring() );
      AV102TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LRECET" );
      AV72Session.setValue("TrnContext", AV102TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
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
      if ( ! ( ( 1 == 0 ) ) )
      {
         divDvpanel_unnamedtable7_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable7_cell_Internalname, "Class", divDvpanel_unnamedtable7_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable7_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable7_cell_Internalname, "Class", divDvpanel_unnamedtable7_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQCOD' Routine */
      returnInSub = false ;
      AV108MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle) ;
      /* Using cursor H02AX7 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A623MaqVolMax = H02AX7_A623MaqVolMax[0] ;
         n623MaqVolMax = H02AX7_n623MaqVolMax[0] ;
         A602MaqCod = H02AX7_A602MaqCod[0] ;
         A625MaqVolMin = H02AX7_A625MaqVolMin[0] ;
         n625MaqVolMin = H02AX7_n625MaqVolMin[0] ;
         A606MaqDsc = H02AX7_A606MaqDsc[0] ;
         n606MaqDsc = H02AX7_n606MaqDsc[0] ;
         AV109Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV109Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A602MaqCod );
         AV109Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( GXutil.trim( A602MaqCod)+"-"+GXutil.trim( A606MaqDsc)+httpContext.getMessage( " Vol. ", "")+GXutil.trim( GXutil.str( A623MaqVolMax, 5, 0))+"/"+GXutil.trim( GXutil.str( A625MaqVolMin, 5, 0)) );
         AV108MaqCod_Data.add(AV109Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV108MaqCod_Data.sort("Title");
      Combo_maqcod_Selectedvalue_set = AV44MaqCod ;
      ucCombo_maqcod.sendProperty(context, "", false, Combo_maqcod_Internalname, "SelectedValue_set", Combo_maqcod_Selectedvalue_set);
   }

   public void e392AX2( )
   {
      /* 'DoEnvioAutomata' Routine */
      returnInSub = false ;
      AV30ErrorMessage = "" ;
      AV60ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV60ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV60ProgressIndicator.setgxTv_SdtProgress_Value( 55 );
      AV60ProgressIndicator.showwithtitle(httpContext.getMessage( "Validando Operacion", ""));
      AV60ProgressIndicator.show();
      AV60ProgressIndicator.setgxTv_SdtProgress_Value( 85 );
      AV60ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV60ProgressIndicator.hide();
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e282AX2( )
   {
      /* Recnumprgin_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV67RecNumPrgIN)==0) )
      {
         GXv_char19[0] = AV27Emprcod ;
         GXv_char4[0] = AV67RecNumPrgIN ;
         GXv_int18[0] = AV32Flag ;
         new app.pexprograma(remoteHandle, context).execute( GXv_char19, GXv_char4, GXv_int18) ;
         recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
         recetadetinte02__wp_impl.this.AV67RecNumPrgIN = GXv_char4[0] ;
         recetadetinte02__wp_impl.this.AV32Flag = GXv_int18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV67RecNumPrgIN", AV67RecNumPrgIN);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Flag", GXutil.str( AV32Flag, 1, 0));
         if ( (0==AV32Flag) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Programa Inexistente", ""));
            GX_FocusControl = edtavRecnumprgin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV22CambioPrograma = (short)(((GXutil.strcmp(AV67RecNumPrgIN, AV68RecNumPrgold)==0) ? 0 : 1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CambioPrograma), 4, 0));
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e292AX2( )
   {
      /* Recnumprgin_Isvalid Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV67RecNumPrgIN)==0) )
      {
         GXv_char19[0] = AV27Emprcod ;
         GXv_char4[0] = AV67RecNumPrgIN ;
         GXv_int18[0] = AV32Flag ;
         new app.pexprograma(remoteHandle, context).execute( GXv_char19, GXv_char4, GXv_int18) ;
         recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
         recetadetinte02__wp_impl.this.AV67RecNumPrgIN = GXv_char4[0] ;
         recetadetinte02__wp_impl.this.AV32Flag = GXv_int18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV67RecNumPrgIN", AV67RecNumPrgIN);
         httpContext.ajax_rsp_assign_attri("", false, "AV32Flag", GXutil.str( AV32Flag, 1, 0));
         if ( (0==AV32Flag) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Programa Inexistente", ""));
            GX_FocusControl = edtavRecnumprgin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV22CambioPrograma = (short)(((GXutil.strcmp(AV67RecNumPrgIN, AV68RecNumPrgold)==0) ? 0 : 1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22CambioPrograma", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CambioPrograma), 4, 0));
            httpContext.doAjaxRefresh();
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e302AX2( )
   {
      /* Maqcod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S153 ();
      if (returnInSub) return;
      if ( ( AV48Maquin == 1 ) && ( ( AV20BarVolMaq < AV51MaqVolMin ) || ( AV20BarVolMaq > AV49MaqVolMax ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e312AX2( )
   {
      /* Maqcod_Isvalid Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'MAQUIN' */
      S153 ();
      if (returnInSub) return;
      if ( ( AV48Maquin == 1 ) && ( ( AV20BarVolMaq < AV51MaqVolMin ) || ( AV20BarVolMaq > AV49MaqVolMax ) ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Aviso.Volumen fuera de rango", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e322AX2( )
   {
      /* Forprdume_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ( ( AV129ForPrdUMe == 1 ) || ( AV129ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV132TipodeProceso, "*") != 0 ) )
      {
         AV131PrdCant = (AV128FacCon.multiply(DecimalUtil.doubleToDec(AV20BarVolMaq))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
      }
      if ( ( AV129ForPrdUMe == 3 ) && ( GXutil.strcmp(AV132TipodeProceso, "*") != 0 ) )
      {
         AV131PrdCant = AV133TotaldeKilos.multiply(AV128FacCon).multiply(DecimalUtil.doubleToDec(AV138ValCos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
      }
      GXt_char1 = AV130ForPrdDsc ;
      GXv_char19[0] = GXt_char1 ;
      new app.get_forprddsc(remoteHandle, context).execute( AV27Emprcod, AV129ForPrdUMe, GXv_char19) ;
      recetadetinte02__wp_impl.this.GXt_char1 = GXv_char19[0] ;
      AV130ForPrdDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
      /*  Sending Event outputs  */
   }

   public void e332AX2( )
   {
      /* Recprdnum_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV125RecPrdNum)==0) )
      {
         GXt_char1 = AV134PrdNom ;
         GXv_char19[0] = AV27Emprcod ;
         GXv_char4[0] = AV125RecPrdNum ;
         GXv_char3[0] = GXt_char1 ;
         new app.pprddsc(remoteHandle, context).execute( GXv_char19, GXv_char4, GXv_char3) ;
         recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char19[0] ;
         recetadetinte02__wp_impl.this.AV125RecPrdNum = GXv_char4[0] ;
         recetadetinte02__wp_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV125RecPrdNum", AV125RecPrdNum);
         AV134PrdNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV134PrdNom", AV134PrdNom);
         if ( GXutil.strcmp(AV134PrdNom, httpContext.getMessage( "Error", "")) == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "NO existe Producto", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavRecprdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV140Lrecet == 0 )
            {
               /* Execute user subroutine: 'PRODUC' */
               S242 ();
               if (returnInSub) return;
               /* Execute user subroutine: 'UNIDAD' */
               S252 ();
               if (returnInSub) return;
            }
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void e342AX2( )
   {
      /* Reclin_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_int18[0] = AV137RecLinPro ;
      GXv_int17[0] = AV141crecet ;
      GXv_int16[0] = AV143RecLinMax ;
      GXv_int15[0] = AV146RecLinMin ;
      GXv_int14[0] = AV147NextReclinmax ;
      GXv_int13[0] = AV148NextRecLinMin ;
      new app.get_reclinprofreclin(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV124RecLin, GXv_int18, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int13) ;
      recetadetinte02__wp_impl.this.AV137RecLinPro = GXv_int18[0] ;
      recetadetinte02__wp_impl.this.AV141crecet = GXv_int17[0] ;
      recetadetinte02__wp_impl.this.AV143RecLinMax = GXv_int16[0] ;
      recetadetinte02__wp_impl.this.AV146RecLinMin = GXv_int15[0] ;
      recetadetinte02__wp_impl.this.AV147NextReclinmax = GXv_int14[0] ;
      recetadetinte02__wp_impl.this.AV148NextRecLinMin = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137RecLinPro), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV143RecLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143RecLinMax), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV146RecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146RecLinMin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV148NextRecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NextRecLinMin), 4, 0));
      if ( AV141crecet == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO hemos encontrado #, donde podamos insertar esta linea ## ", "")+GXutil.str( AV124RecLin, 4, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavReclinpro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV124RecLin) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Se debe de entrar ##", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavReclin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_decimal21[0] = AV128FacCon ;
            GXv_char19[0] = AV130ForPrdDsc ;
            GXv_int18[0] = AV129ForPrdUMe ;
            GXv_decimal22[0] = AV131PrdCant ;
            GXv_int6[0] = AV119RecForNro ;
            GXv_char4[0] = AV118RecLote ;
            GXv_char3[0] = AV121RecManAut ;
            GXv_char2[0] = AV127RecPrdDsc ;
            GXv_char23[0] = AV125RecPrdNum ;
            GXv_int24[0] = AV120RecPrdTnq ;
            GXv_char25[0] = AV114oldRecLote ;
            GXv_decimal26[0] = AV115Cantold ;
            GXv_decimal27[0] = AV116CanResold ;
            GXv_decimal28[0] = AV117OldFaccon ;
            GXv_decimal29[0] = AV122PrdExiAlm ;
            GXv_decimal30[0] = AV123PrdCanRes ;
            GXv_decimal31[0] = AV135Prdexicc ;
            GXv_int17[0] = AV140Lrecet ;
            new app.recetatinte90__prc(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV137RecLinPro, AV124RecLin, GXv_decimal21, GXv_char19, GXv_int18, GXv_decimal22, GXv_int6, GXv_char4, GXv_char3, GXv_char2, GXv_char23, GXv_int24, GXv_char25, GXv_decimal26, GXv_decimal27, GXv_decimal28, GXv_decimal29, GXv_decimal30, GXv_decimal31, GXv_int17) ;
            recetadetinte02__wp_impl.this.AV128FacCon = GXv_decimal21[0] ;
            recetadetinte02__wp_impl.this.AV130ForPrdDsc = GXv_char19[0] ;
            recetadetinte02__wp_impl.this.AV129ForPrdUMe = GXv_int18[0] ;
            recetadetinte02__wp_impl.this.AV131PrdCant = GXv_decimal22[0] ;
            recetadetinte02__wp_impl.this.AV119RecForNro = GXv_int6[0] ;
            recetadetinte02__wp_impl.this.AV118RecLote = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV121RecManAut = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.AV127RecPrdDsc = GXv_char2[0] ;
            recetadetinte02__wp_impl.this.AV125RecPrdNum = GXv_char23[0] ;
            recetadetinte02__wp_impl.this.AV120RecPrdTnq = GXv_int24[0] ;
            recetadetinte02__wp_impl.this.AV114oldRecLote = GXv_char25[0] ;
            recetadetinte02__wp_impl.this.AV115Cantold = GXv_decimal26[0] ;
            recetadetinte02__wp_impl.this.AV116CanResold = GXv_decimal27[0] ;
            recetadetinte02__wp_impl.this.AV117OldFaccon = GXv_decimal28[0] ;
            recetadetinte02__wp_impl.this.AV122PrdExiAlm = GXv_decimal29[0] ;
            recetadetinte02__wp_impl.this.AV123PrdCanRes = GXv_decimal30[0] ;
            recetadetinte02__wp_impl.this.AV135Prdexicc = GXv_decimal31[0] ;
            recetadetinte02__wp_impl.this.AV140Lrecet = GXv_int17[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128FacCon", GXutil.ltrimstr( AV128FacCon, 11, 5));
            httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
            httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
            httpContext.ajax_rsp_assign_attri("", false, "AV119RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119RecForNro), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV118RecLote", AV118RecLote);
            httpContext.ajax_rsp_assign_attri("", false, "AV121RecManAut", AV121RecManAut);
            httpContext.ajax_rsp_assign_attri("", false, "AV127RecPrdDsc", AV127RecPrdDsc);
            httpContext.ajax_rsp_assign_attri("", false, "AV125RecPrdNum", AV125RecPrdNum);
            httpContext.ajax_rsp_assign_attri("", false, "AV120RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120RecPrdTnq), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV114oldRecLote", AV114oldRecLote);
            httpContext.ajax_rsp_assign_attri("", false, "AV115Cantold", GXutil.ltrimstr( AV115Cantold, 11, 3));
            httpContext.ajax_rsp_assign_attri("", false, "AV116CanResold", GXutil.ltrimstr( AV116CanResold, 8, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV117OldFaccon", GXutil.ltrimstr( AV117OldFaccon, 11, 5));
            httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, "AV140Lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140Lrecet), 4, 0));
            edtavRecprdnum_Enabled = ((AV140Lrecet==0) ? 1 : 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavRecprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecprdnum_Enabled), 5, 0), true);
            imgUseraction2_Enabled = ((AV140Lrecet==0) ? 1 : 0) ;
            httpContext.ajax_rsp_assign_prop("", false, imgUseraction2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgUseraction2_Enabled), 5, 0), true);
            edtavRecprddsc_Enabled = ((AV140Lrecet==0) ? 1 : 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavRecprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecprddsc_Enabled), 5, 0), true);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e402AX2( )
   {
      /* RecLin_Click Routine */
      returnInSub = false ;
      AV124RecLin = A811RecLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV124RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV124RecLin), 4, 0));
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_int24[0] = AV137RecLinPro ;
      GXv_int17[0] = AV141crecet ;
      GXv_int16[0] = AV143RecLinMax ;
      GXv_int15[0] = AV146RecLinMin ;
      GXv_int14[0] = AV147NextReclinmax ;
      GXv_int13[0] = AV148NextRecLinMin ;
      new app.get_reclinprofreclin(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV124RecLin, GXv_int24, GXv_int17, GXv_int16, GXv_int15, GXv_int14, GXv_int13) ;
      recetadetinte02__wp_impl.this.AV137RecLinPro = GXv_int24[0] ;
      recetadetinte02__wp_impl.this.AV141crecet = GXv_int17[0] ;
      recetadetinte02__wp_impl.this.AV143RecLinMax = GXv_int16[0] ;
      recetadetinte02__wp_impl.this.AV146RecLinMin = GXv_int15[0] ;
      recetadetinte02__wp_impl.this.AV147NextReclinmax = GXv_int14[0] ;
      recetadetinte02__wp_impl.this.AV148NextRecLinMin = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV137RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV137RecLinPro), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV143RecLinMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV143RecLinMax), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV146RecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV146RecLinMin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV148NextRecLinMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV148NextRecLinMin), 4, 0));
      if ( AV141crecet == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO hemos encontrado #, donde podamos insertar esta linea ## ", "")+GXutil.str( AV124RecLin, 4, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavReclinpro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV124RecLin) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Se debe de entrar ##", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavReclin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            AV149Acciongridmodificar = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV149Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV149Acciongridmodificar), 4, 0));
            GXv_decimal31[0] = AV128FacCon ;
            GXv_char25[0] = AV130ForPrdDsc ;
            GXv_int24[0] = AV129ForPrdUMe ;
            GXv_decimal30[0] = AV131PrdCant ;
            GXv_int18[0] = AV119RecForNro ;
            GXv_char23[0] = AV118RecLote ;
            GXv_char19[0] = AV121RecManAut ;
            GXv_char4[0] = AV127RecPrdDsc ;
            GXv_char3[0] = AV125RecPrdNum ;
            GXv_int6[0] = AV120RecPrdTnq ;
            GXv_char2[0] = AV114oldRecLote ;
            GXv_decimal29[0] = AV115Cantold ;
            GXv_decimal28[0] = AV116CanResold ;
            GXv_decimal27[0] = AV117OldFaccon ;
            GXv_decimal26[0] = AV122PrdExiAlm ;
            GXv_decimal22[0] = AV123PrdCanRes ;
            GXv_decimal21[0] = AV135Prdexicc ;
            GXv_int17[0] = AV140Lrecet ;
            new app.recetatinte90__prc(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, AV137RecLinPro, AV124RecLin, GXv_decimal31, GXv_char25, GXv_int24, GXv_decimal30, GXv_int18, GXv_char23, GXv_char19, GXv_char4, GXv_char3, GXv_int6, GXv_char2, GXv_decimal29, GXv_decimal28, GXv_decimal27, GXv_decimal26, GXv_decimal22, GXv_decimal21, GXv_int17) ;
            recetadetinte02__wp_impl.this.AV128FacCon = GXv_decimal31[0] ;
            recetadetinte02__wp_impl.this.AV130ForPrdDsc = GXv_char25[0] ;
            recetadetinte02__wp_impl.this.AV129ForPrdUMe = GXv_int24[0] ;
            recetadetinte02__wp_impl.this.AV131PrdCant = GXv_decimal30[0] ;
            recetadetinte02__wp_impl.this.AV119RecForNro = GXv_int18[0] ;
            recetadetinte02__wp_impl.this.AV118RecLote = GXv_char23[0] ;
            recetadetinte02__wp_impl.this.AV121RecManAut = GXv_char19[0] ;
            recetadetinte02__wp_impl.this.AV127RecPrdDsc = GXv_char4[0] ;
            recetadetinte02__wp_impl.this.AV125RecPrdNum = GXv_char3[0] ;
            recetadetinte02__wp_impl.this.AV120RecPrdTnq = GXv_int6[0] ;
            recetadetinte02__wp_impl.this.AV114oldRecLote = GXv_char2[0] ;
            recetadetinte02__wp_impl.this.AV115Cantold = GXv_decimal29[0] ;
            recetadetinte02__wp_impl.this.AV116CanResold = GXv_decimal28[0] ;
            recetadetinte02__wp_impl.this.AV117OldFaccon = GXv_decimal27[0] ;
            recetadetinte02__wp_impl.this.AV122PrdExiAlm = GXv_decimal26[0] ;
            recetadetinte02__wp_impl.this.AV123PrdCanRes = GXv_decimal22[0] ;
            recetadetinte02__wp_impl.this.AV135Prdexicc = GXv_decimal21[0] ;
            recetadetinte02__wp_impl.this.AV140Lrecet = GXv_int17[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV128FacCon", GXutil.ltrimstr( AV128FacCon, 11, 5));
            httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
            httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
            httpContext.ajax_rsp_assign_attri("", false, "AV119RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV119RecForNro), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV118RecLote", AV118RecLote);
            httpContext.ajax_rsp_assign_attri("", false, "AV121RecManAut", AV121RecManAut);
            httpContext.ajax_rsp_assign_attri("", false, "AV127RecPrdDsc", AV127RecPrdDsc);
            httpContext.ajax_rsp_assign_attri("", false, "AV125RecPrdNum", AV125RecPrdNum);
            httpContext.ajax_rsp_assign_attri("", false, "AV120RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV120RecPrdTnq), 2, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV114oldRecLote", AV114oldRecLote);
            httpContext.ajax_rsp_assign_attri("", false, "AV115Cantold", GXutil.ltrimstr( AV115Cantold, 11, 3));
            httpContext.ajax_rsp_assign_attri("", false, "AV116CanResold", GXutil.ltrimstr( AV116CanResold, 8, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV117OldFaccon", GXutil.ltrimstr( AV117OldFaccon, 11, 5));
            httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, "AV140Lrecet", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV140Lrecet), 4, 0));
            edtavRecprdnum_Enabled = ((AV140Lrecet==0) ? 1 : 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavRecprdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecprdnum_Enabled), 5, 0), true);
            imgUseraction2_Enabled = ((AV140Lrecet==0) ? 1 : 0) ;
            httpContext.ajax_rsp_assign_prop("", false, imgUseraction2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgUseraction2_Enabled), 5, 0), true);
            edtavRecprddsc_Enabled = ((AV140Lrecet==0) ? 1 : 0) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavRecprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecprddsc_Enabled), 5, 0), true);
            GX_FocusControl = edtavFaccon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
         }
      }
      if ( CommonUtil.decimalVal( GXutil.substring( AV125RecPrdNum, 1, 2), ".").doubleValue() <= 79 )
      {
         imgUseraction1_Enabled = ((AV139Moda21==1) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, imgUseraction1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgUseraction1_Enabled), 5, 0), true);
         imgUseraction2_Enabled = ((AV139Moda21==1) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, imgUseraction2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgUseraction2_Enabled), 5, 0), true);
         edtavForprdume_Enabled = ((AV139Moda21==1) ? 0 : 1) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavForprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprdume_Enabled), 5, 0), true);
      }
      else
      {
         imgUseraction1_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgUseraction1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgUseraction1_Enabled), 5, 0), true);
         imgUseraction2_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, imgUseraction2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgUseraction2_Enabled), 5, 0), true);
         edtavForprdume_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavForprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprdume_Enabled), 5, 0), true);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV60ProgressIndicator", AV60ProgressIndicator);
   }

   public void S153( )
   {
      /* 'MAQUIN' Routine */
      returnInSub = false ;
      AV48Maquin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Maquin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Maquin), 4, 0));
      AV50MaqVolMed = 0 ;
      AV49MaqVolMax = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49MaqVolMax), 5, 0));
      AV51MaqVolMin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51MaqVolMin), 5, 0));
      AV47MaqRelban = (byte)(0) ;
      /* Using cursor H02AX8 */
      pr_default.execute(4, new Object[] {AV27Emprcod, AV44MaqCod});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A602MaqCod = H02AX8_A602MaqCod[0] ;
         A396EmprCod = H02AX8_A396EmprCod[0] ;
         A624MaqVolMed = H02AX8_A624MaqVolMed[0] ;
         n624MaqVolMed = H02AX8_n624MaqVolMed[0] ;
         A623MaqVolMax = H02AX8_A623MaqVolMax[0] ;
         n623MaqVolMax = H02AX8_n623MaqVolMax[0] ;
         A625MaqVolMin = H02AX8_A625MaqVolMin[0] ;
         n625MaqVolMin = H02AX8_n625MaqVolMin[0] ;
         A3599MaqRelBan = H02AX8_A3599MaqRelBan[0] ;
         n3599MaqRelBan = H02AX8_n3599MaqRelBan[0] ;
         AV50MaqVolMed = A624MaqVolMed ;
         AV49MaqVolMax = A623MaqVolMax ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49MaqVolMax", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49MaqVolMax), 5, 0));
         AV51MaqVolMin = A625MaqVolMin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51MaqVolMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51MaqVolMin), 5, 0));
         AV47MaqRelban = A3599MaqRelBan ;
         AV48Maquin = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Maquin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Maquin), 4, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S172( )
   {
      /* 'VOLVERACREARRECETA' Routine */
      returnInSub = false ;
      GXv_char25[0] = AV27Emprcod ;
      GXv_int20[0] = AV9Barcod ;
      GXv_int24[0] = AV11Barcodreo ;
      GXv_char23[0] = AV10Barcodpar ;
      GXv_char19[0] = AV67RecNumPrgIN ;
      GXv_decimal31[0] = AV107RecFA ;
      new app.pdyrp028(remoteHandle, context).execute( GXv_char25, GXv_int20, GXv_int24, GXv_char23, GXv_char19, GXv_decimal31) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char25[0] ;
      recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
      recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int24[0] ;
      recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char23[0] ;
      recetadetinte02__wp_impl.this.AV67RecNumPrgIN = GXv_char19[0] ;
      recetadetinte02__wp_impl.this.AV107RecFA = GXv_decimal31[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV67RecNumPrgIN", AV67RecNumPrgIN);
      httpContext.ajax_rsp_assign_attri("", false, "AV107RecFA", GXutil.ltrimstr( AV107RecFA, 6, 2));
      new app.pdyrp000(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, DecimalUtil.doubleToDec(0), AV69RecTotKgm, AV71RecTotMtr, AV20BarVolMaq, AV44MaqCod, AV67RecNumPrgIN, AV64RecetasTinteProcesosQuimicosToJson, AV73Station, Gx_mode) ;
      GXv_char25[0] = AV27Emprcod ;
      GXv_int20[0] = AV9Barcod ;
      GXv_int24[0] = AV11Barcodreo ;
      GXv_char23[0] = AV10Barcodpar ;
      GXv_int17[0] = AV66RecLinMaq ;
      new app.pdyrp013(remoteHandle, context).execute( GXv_char25, GXv_int20, GXv_int24, GXv_char23, GXv_int17) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char25[0] ;
      recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
      recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int24[0] ;
      recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char23[0] ;
      recetadetinte02__wp_impl.this.AV66RecLinMaq = GXv_int17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
      GXv_char25[0] = AV27Emprcod ;
      GXv_int20[0] = AV9Barcod ;
      GXv_int24[0] = AV11Barcodreo ;
      GXv_char23[0] = AV10Barcodpar ;
      GXv_char19[0] = AV15BarMaqcod ;
      GXv_int10[0] = AV20BarVolMaq ;
      GXv_decimal31[0] = AV14Barfacabs ;
      new app.pdyrp014(remoteHandle, context).execute( GXv_char25, GXv_int20, GXv_int24, GXv_char23, GXv_char19, GXv_int10, GXv_decimal31) ;
      recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char25[0] ;
      recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
      recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int24[0] ;
      recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char23[0] ;
      recetadetinte02__wp_impl.this.AV15BarMaqcod = GXv_char19[0] ;
      recetadetinte02__wp_impl.this.AV20BarVolMaq = GXv_int10[0] ;
      recetadetinte02__wp_impl.this.AV14Barfacabs = GXv_decimal31[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarMaqcod", AV15BarMaqcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BarMaqcod, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarVolMaq), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV14Barfacabs", GXutil.ltrimstr( AV14Barfacabs, 6, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFACABS", getSecureSignedToken( "", localUtil.format( AV14Barfacabs, "ZZ9.99")));
      if ( GXutil.strcmp(AV8BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char25[0] = AV27Emprcod ;
         GXv_int20[0] = AV9Barcod ;
         GXv_int24[0] = AV11Barcodreo ;
         GXv_char23[0] = AV10Barcodpar ;
         GXv_char19[0] = AV15BarMaqcod ;
         GXv_int10[0] = AV20BarVolMaq ;
         new app.pdyrp015(remoteHandle, context).execute( GXv_char25, GXv_int20, GXv_int24, GXv_char23, GXv_char19, GXv_int10) ;
         recetadetinte02__wp_impl.this.AV27Emprcod = GXv_char25[0] ;
         recetadetinte02__wp_impl.this.AV9Barcod = GXv_int20[0] ;
         recetadetinte02__wp_impl.this.AV11Barcodreo = GXv_int24[0] ;
         recetadetinte02__wp_impl.this.AV10Barcodpar = GXv_char23[0] ;
         recetadetinte02__wp_impl.this.AV15BarMaqcod = GXv_char19[0] ;
         recetadetinte02__wp_impl.this.AV20BarVolMaq = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
         httpContext.ajax_rsp_assign_attri("", false, "AV15BarMaqcod", AV15BarMaqcod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15BarMaqcod, ""))));
         httpContext.ajax_rsp_assign_attri("", false, "AV20BarVolMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarVolMaq), 5, 0));
      }
   }

   public void S252( )
   {
      /* 'UNIDAD' Routine */
      returnInSub = false ;
      AV130ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
      /* Using cursor H02AX9 */
      pr_default.execute(5, new Object[] {AV27Emprcod, Byte.valueOf(AV129ForPrdUMe)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A490ForPrdUMe = H02AX9_A490ForPrdUMe[0] ;
         n490ForPrdUMe = H02AX9_n490ForPrdUMe[0] ;
         A396EmprCod = H02AX9_A396EmprCod[0] ;
         A488ForPrdDsc = H02AX9_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H02AX9_n488ForPrdDsc[0] ;
         AV130ForPrdDsc = A488ForPrdDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV130ForPrdDsc", AV130ForPrdDsc);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   public void S242( )
   {
      /* 'PRODUC' Routine */
      returnInSub = false ;
      AV118RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118RecLote", AV118RecLote);
      AV129ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
      AV127RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV127RecPrdDsc", AV127RecPrdDsc);
      AV123PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
      AV122PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
      AV135Prdexicc = DecimalUtil.ZERO ;
      AV121RecManAut = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV121RecManAut", AV121RecManAut);
      /* Using cursor H02AX10 */
      pr_default.execute(6, new Object[] {AV27Emprcod, AV125RecPrdNum});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A719PrdNum = H02AX10_A719PrdNum[0] ;
         n719PrdNum = H02AX10_n719PrdNum[0] ;
         A396EmprCod = H02AX10_A396EmprCod[0] ;
         A10881PrdLote = H02AX10_A10881PrdLote[0] ;
         A4338PrdUMeFo = H02AX10_A4338PrdUMeFo[0] ;
         A718PrdNom = H02AX10_A718PrdNom[0] ;
         A685PrdCanRes = H02AX10_A685PrdCanRes[0] ;
         A704PrdExiAlm = H02AX10_A704PrdExiAlm[0] ;
         A705PrdExiCC = H02AX10_A705PrdExiCC[0] ;
         A1643PrdTip = H02AX10_A1643PrdTip[0] ;
         if ( AV139Moda21 == 0 )
         {
            AV118RecLote = A10881PrdLote ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118RecLote", AV118RecLote);
         }
         AV129ForPrdUMe = A4338PrdUMeFo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV129ForPrdUMe", GXutil.str( AV129ForPrdUMe, 1, 0));
         AV127RecPrdDsc = A718PrdNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV127RecPrdDsc", AV127RecPrdDsc);
         AV123PrdCanRes = A685PrdCanRes ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123PrdCanRes", GXutil.ltrimstr( AV123PrdCanRes, 12, 4));
         AV122PrdExiAlm = A704PrdExiAlm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV122PrdExiAlm", GXutil.ltrimstr( AV122PrdExiAlm, 12, 4));
         AV135Prdexicc = A705PrdExiCC ;
         AV121RecManAut = A1643PrdTip ;
         httpContext.ajax_rsp_assign_attri("", false, "AV121RecManAut", AV121RecManAut);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S182( )
   {
      /* 'CALCULARCANTIDAD' Routine */
      returnInSub = false ;
      if ( ( ( AV129ForPrdUMe == 1 ) || ( AV129ForPrdUMe == 2 ) ) && ( GXutil.strcmp(AV132TipodeProceso, "*") != 0 ) )
      {
         AV131PrdCant = (AV128FacCon.multiply(DecimalUtil.doubleToDec(AV20BarVolMaq))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
      }
      if ( ( AV129ForPrdUMe == 3 ) && ( GXutil.strcmp(AV132TipodeProceso, "*") != 0 ) )
      {
         AV131PrdCant = AV133TotaldeKilos.multiply(AV128FacCon).multiply(DecimalUtil.doubleToDec(AV138ValCos)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV131PrdCant", GXutil.ltrimstr( AV131PrdCant, 11, 3));
      }
   }

   public void S262( )
   {
      /* 'ISEXISTE_DATOSLISTADOINCIDENCIASRECETA' Routine */
      returnInSub = false ;
      GXt_boolean32 = AV154isExiste ;
      GXv_boolean33[0] = GXt_boolean32 ;
      new app.formulaciontinte.isexistelistadoincidenciasreceta(remoteHandle, context).execute( AV27Emprcod, AV9Barcod, AV11Barcodreo, AV10Barcodpar, AV66RecLinMaq, GXv_boolean33) ;
      recetadetinte02__wp_impl.this.GXt_boolean32 = GXv_boolean33[0] ;
      AV154isExiste = GXt_boolean32 ;
   }

   public void wb_table6_382_2AX2( boolean wbgen )
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
         wb_table6_382_2AX2e( true) ;
      }
      else
      {
         wb_table6_382_2AX2e( false) ;
      }
   }

   public void wb_table5_377_2AX2( boolean wbgen )
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
         wb_table5_377_2AX2e( true) ;
      }
      else
      {
         wb_table5_377_2AX2e( false) ;
      }
   }

   public void wb_table4_372_2AX2( boolean wbgen )
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
         wb_table4_372_2AX2e( true) ;
      }
      else
      {
         wb_table4_372_2AX2e( false) ;
      }
   }

   public void wb_table3_367_2AX2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlineas_Internalname, tblTabledvelop_confirmpanel_eliminarlineas_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarlineas.setProperty("Title", Dvelop_confirmpanel_eliminarlineas_Title);
         ucDvelop_confirmpanel_eliminarlineas.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlineas_Confirmationtext);
         ucDvelop_confirmpanel_eliminarlineas.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlineas_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarlineas.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlineas_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarlineas.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlineas_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarlineas.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlineas_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarlineas.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlineas_Confirmtype);
         ucDvelop_confirmpanel_eliminarlineas.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlineas_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARLINEASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARLINEASContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_367_2AX2e( true) ;
      }
      else
      {
         wb_table3_367_2AX2e( false) ;
      }
   }

   public void wb_table2_362_2AX2( boolean wbgen )
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
         wb_table2_362_2AX2e( true) ;
      }
      else
      {
         wb_table2_362_2AX2e( false) ;
      }
   }

   public void wb_table1_146_2AX2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 150,'',false,'" + sGXsfl_263_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaragrest_Internalname, GXutil.rtrim( AV8BarAgrEst), GXutil.rtrim( localUtil.format( AV8BarAgrEst, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,150);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaragrest_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaragrest_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetadeTinte02__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblBaragrest_popoverimage_Internalname, httpContext.getMessage( "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down'></i>", ""), "", "", lblBaragrest_popoverimage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(2), "HLP_RecetadeTinte02__WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_146_2AX2e( true) ;
      }
      else
      {
         wb_table1_146_2AX2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV27Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Emprcod", AV27Emprcod);
      AV9Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Barcod), 8, 0));
      AV11Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Barcodreo", GXutil.str( AV11Barcodreo, 1, 0));
      AV10Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Barcodpar", AV10Barcodpar);
      AV66RecLinMaq = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66RecLinMaq), 4, 0));
      Gx_mode = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV104varmsg = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104varmsg", AV104varmsg);
      AV133TotaldeKilos = (java.math.BigDecimal)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV133TotaldeKilos", GXutil.ltrimstr( AV133TotaldeKilos, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALDEKILOS", getSecureSignedToken( "", localUtil.format( AV133TotaldeKilos, "ZZZZZ9.99")));
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
      pa2AX2( ) ;
      ws2AX2( ) ;
      we2AX2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269178555494", true, true);
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
      httpContext.AddJavascriptSource("recetadetinte02__wp.js", "?20269178555495", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_2632( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_263_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_263_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_263_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_263_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_263_idx ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_263_idx );
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_263_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_263_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_263_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_263_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_263_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_263_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_263_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_263_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_263_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_263_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_263_idx ;
      edtRecManAut_Internalname = "RECMANAUT_"+sGXsfl_263_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_263_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_263_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_263_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_263_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_263_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_263_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_263_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_263_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_263_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_263_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_263_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_263_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_263_idx ;
      edtavColor_Internalname = "vCOLOR_"+sGXsfl_263_idx ;
   }

   public void subsflControlProps_fel_2632( )
   {
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_263_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_263_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_263_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_263_fel_idx ;
      edtRecLinMaq_Internalname = "RECLINMAQ_"+sGXsfl_263_fel_idx ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_263_fel_idx );
      edtRecLinPro_Internalname = "RECLINPRO_"+sGXsfl_263_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_263_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_263_fel_idx ;
      edtRecLin_Internalname = "RECLIN_"+sGXsfl_263_fel_idx ;
      edtRecPrdNum_Internalname = "RECPRDNUM_"+sGXsfl_263_fel_idx ;
      edtRecPrdDsc_Internalname = "RECPRDDSC_"+sGXsfl_263_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_263_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_263_fel_idx ;
      edtFacCon_Internalname = "FACCON_"+sGXsfl_263_fel_idx ;
      edtPrdCant_Internalname = "PRDCANT_"+sGXsfl_263_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_263_fel_idx ;
      edtRecManAut_Internalname = "RECMANAUT_"+sGXsfl_263_fel_idx ;
      edtRecForNro_Internalname = "RECFORNRO_"+sGXsfl_263_fel_idx ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ_"+sGXsfl_263_fel_idx ;
      edtRecLote_Internalname = "RECLOTE_"+sGXsfl_263_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_263_fel_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_263_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_263_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_263_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_263_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_263_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_263_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_263_fel_idx ;
      edtProForFab_Internalname = "PROFORFAB_"+sGXsfl_263_fel_idx ;
      edtRecMar_Internalname = "RECMAR_"+sGXsfl_263_fel_idx ;
      edtavColor_Internalname = "vCOLOR_"+sGXsfl_263_fel_idx ;
   }

   public void sendrow_2632( )
   {
      subsflControlProps_2632( ) ;
      wb2AX0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_263_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_263_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_263_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 269,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_263_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_263_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         AV152Seleccionar = GXutil.strtobool( GXutil.booltostr( AV152Seleccionar)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV152Seleccionar);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV152Seleccionar),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,chkavSeleccionar.getColumnClass(),chkavSeleccionar.getColumnHeaderClass(),TempTags+" onclick="+"\"gx.fn.checkboxClick(269, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,269);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLinPro_Internalname,GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLinPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecLinPro_Columnclass,edtRecLinPro_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProForCod_Columnclass,edtProForCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProForDsc_Columnclass,edtProForDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ERECLIN.CLICK."+sGXsfl_263_idx+"'","","","","",edtRecLin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,edtRecLin_Columnclass,edtRecLin_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdNum_Internalname,GXutil.rtrim( A872RecPrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecPrdNum_Columnclass,edtRecPrdNum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdDsc_Internalname,GXutil.rtrim( A875RecPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Forecolor)+";"+((edtRecPrdDsc_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtRecPrdDsc_Backcolor)+";"),ROClassString,edtRecPrdDsc_Columnclass,edtRecPrdDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCon_Internalname,GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A431FacCon, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFacCon_Columnclass,edtFacCon_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCant_Internalname,GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A686PrdCant, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtPrdCant_Columnclass,edtPrdCant_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtForPrdDsc_Columnclass,edtForPrdDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecManAut_Internalname,GXutil.rtrim( A14055RecManAut),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecManAut_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecForNro_Internalname,GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecForNro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecForNro_Columnclass,edtRecForNro_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecPrdTnq_Internalname,GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecPrdTnq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecPrdTnq_Columnclass,edtRecPrdTnq_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecLote_Internalname,GXutil.rtrim( A5725RecLote),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecLote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtRecLote_Columnclass,edtRecLote_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 286,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV57PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV57PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV57PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,286);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 287,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV61R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV61R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV61R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,287);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 288,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV34G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,288);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 289,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV6B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,289);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 290,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV62R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV62R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV62R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,290);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 291,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV35G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,291);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 292,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV7B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,292);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForFab_Internalname,GXutil.rtrim( A6018ProForFab),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForFab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMar_Internalname,GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecMar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavColor_Enabled!=0)&&(edtavColor_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 295,'',false,'"+sGXsfl_263_idx+"',263)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavColor_Internalname,GXutil.ltrim( localUtil.ntoc( AV145Color, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavColor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV145Color), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavColor_Enabled!=0)&&(edtavColor_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,295);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavColor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavColor_Columnclass,edtavColor_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavColor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(263),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2AX2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_263_idx = ((subGrid_Islastpage==1)&&(nGXsfl_263_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_263_idx+1) ;
         sGXsfl_263_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_263_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2632( ) ;
      }
      /* End function sendrow_2632 */
   }

   public void startgridcontrol263( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"263\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
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
         httpContext.writeValue( "##") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV152Seleccionar));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavSeleccionar.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavSeleccionar.getColumnHeaderClass()));
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV61R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV6B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV35G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV7B2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6018ProForFab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV145Color, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavColor_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavColor_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavColor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBartipcol_Internalname = "vBARTIPCOL" ;
      divUnnamedtable16_Internalname = "UNNAMEDTABLE16" ;
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
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
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
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
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
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      edtavReclin_Internalname = "vRECLIN" ;
      edtavRecprdnum_Internalname = "vRECPRDNUM" ;
      imgUseraction2_Internalname = "USERACTION2" ;
      edtavRecprddsc_Internalname = "vRECPRDDSC" ;
      edtavFaccon_Internalname = "vFACCON" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      imgUseraction1_Internalname = "USERACTION1" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      edtavPrdcant_Internalname = "vPRDCANT" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavReclote_Internalname = "vRECLOTE" ;
      edtavRecfornro_Internalname = "vRECFORNRO" ;
      edtavRecprdtnq_Internalname = "vRECPRDTNQ" ;
      edtavRecmanaut_Internalname = "vRECMANAUT" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtneliminarlineas_Internalname = "BTNELIMINARLINEAS" ;
      bttBtnlimpiar_Internalname = "BTNLIMPIAR" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
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
      edtavColor_Internalname = "vCOLOR" ;
      edtavReclinpro_Internalname = "vRECLINPRO" ;
      edtavReclinmin_Internalname = "vRECLINMIN" ;
      edtavReclinmax_Internalname = "vRECLINMAX" ;
      edtavNextreclinmin_Internalname = "vNEXTRECLINMIN" ;
      edtavOldreclote_Internalname = "vOLDRECLOTE" ;
      edtavCantold_Internalname = "vCANTOLD" ;
      edtavCanresold_Internalname = "vCANRESOLD" ;
      edtavOldfaccon_Internalname = "vOLDFACCON" ;
      edtavPrdexialm_Internalname = "vPRDEXIALM" ;
      edtavPrdcanres_Internalname = "vPRDCANRES" ;
      edtavLrecet_Internalname = "vLRECET" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Dvpanel_unnamedtable7_Internalname = "DVPANEL_UNNAMEDTABLE7" ;
      divDvpanel_unnamedtable7_cell_Internalname = "DVPANEL_UNNAMEDTABLE7_CELL" ;
      divTablacontenido_Internalname = "TABLACONTENIDO" ;
      lblStyle_Internalname = "STYLE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      Popover_baragrest_Internalname = "POPOVER_BARAGREST" ;
      edtavClicod_Internalname = "vCLICOD" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Dvelop_confirmpanel_eliminarlineas_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEAS" ;
      tblTabledvelop_confirmpanel_eliminarlineas_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEAS" ;
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
      edtavColor_Jsonclick = "" ;
      edtavColor_Columnclass = "WWColumn" ;
      edtavColor_Visible = -1 ;
      edtavColor_Enabled = 1 ;
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
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setColumnClass( "WWColumn" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      edtRecLinMaq_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavBaragrest_Jsonclick = "" ;
      edtavBaragrest_Enabled = 1 ;
      edtavColor_Columnheaderclass = "" ;
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
      chkavSeleccionar.setColumnHeaderClass( "" );
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Visible = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblStyle_Caption = "" ;
      edtavLrecet_Jsonclick = "" ;
      edtavLrecet_Enabled = 1 ;
      edtavPrdcanres_Jsonclick = "" ;
      edtavPrdcanres_Enabled = 1 ;
      edtavPrdexialm_Jsonclick = "" ;
      edtavPrdexialm_Enabled = 1 ;
      edtavOldfaccon_Jsonclick = "" ;
      edtavOldfaccon_Enabled = 1 ;
      edtavCanresold_Jsonclick = "" ;
      edtavCanresold_Enabled = 1 ;
      edtavCantold_Jsonclick = "" ;
      edtavCantold_Enabled = 1 ;
      edtavOldreclote_Jsonclick = "" ;
      edtavOldreclote_Enabled = 1 ;
      edtavNextreclinmin_Jsonclick = "" ;
      edtavNextreclinmin_Enabled = 1 ;
      edtavReclinmax_Jsonclick = "" ;
      edtavReclinmax_Enabled = 1 ;
      edtavReclinmin_Jsonclick = "" ;
      edtavReclinmin_Enabled = 1 ;
      edtavReclinpro_Jsonclick = "" ;
      edtavReclinpro_Enabled = 1 ;
      divDvpanel_unnamedtable7_cell_Class = "col-xs-12" ;
      divUnnamedtable6_Height = 0 ;
      edtavRecmanaut_Jsonclick = "" ;
      edtavRecmanaut_Enabled = 1 ;
      edtavRecprdtnq_Jsonclick = "" ;
      edtavRecprdtnq_Enabled = 1 ;
      edtavRecfornro_Jsonclick = "" ;
      edtavRecfornro_Enabled = 1 ;
      edtavReclote_Jsonclick = "" ;
      edtavReclote_Enabled = 1 ;
      edtavPrdcant_Jsonclick = "" ;
      edtavPrdcant_Enabled = 1 ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 1 ;
      imgUseraction1_Enabled = 1 ;
      edtavForprdume_Jsonclick = "" ;
      edtavForprdume_Enabled = 1 ;
      edtavFaccon_Jsonclick = "" ;
      edtavFaccon_Enabled = 1 ;
      edtavRecprddsc_Jsonclick = "" ;
      edtavRecprddsc_Enabled = 1 ;
      imgUseraction2_Enabled = 1 ;
      edtavRecprdnum_Jsonclick = "" ;
      edtavRecprdnum_Enabled = 1 ;
      edtavReclin_Jsonclick = "" ;
      edtavReclin_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
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
      Dvelop_confirmpanel_eliminarlineas_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlineas_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlineas_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlineas_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlineas_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlineas_Confirmationtext = "¿Confirma la eliminacion de lineas?" ;
      Dvelop_confirmpanel_eliminarlineas_Title = "" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma la linea?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Popover_baragrest_Position = "Bottom" ;
      Popover_baragrest_Popoverwidth = 667 ;
      Popover_baragrest_Trigger = "Click" ;
      Popover_baragrest_Iteminternalname = "" ;
      Dvpanel_unnamedtable7_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Iconposition = "Right" ;
      Dvpanel_unnamedtable7_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable7_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Title = httpContext.getMessage( "Pruebas", "") ;
      Dvpanel_unnamedtable7_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable7_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable7_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable7_Width = "100%" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Linea", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento Receta Tinte v.02", "") );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECCIONAR_" + sGXsfl_263_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_263_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      AV152Seleccionar = GXutil.strtobool( GXutil.booltostr( AV152Seleccionar)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV152Seleccionar);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID.LOAD","{handler:'e382AX2',iparms:[{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9',hsh:true},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A4024RecMar',fld:'RECMAR',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV57PrdRGB',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV7B2',fld:'vB2',pic:'ZZ9'},{av:'AV35G2',fld:'vG2',pic:'ZZ9'},{av:'AV62R2',fld:'vR2',pic:'ZZ9'},{av:'AV6B',fld:'vB',pic:'ZZ9'},{av:'AV34G',fld:'vG',pic:'ZZ9'},{av:'AV61R',fld:'vR',pic:'ZZ9'},{av:'edtRecPrdDsc_Backcolor',ctrl:'RECPRDDSC',prop:'Backcolor'},{av:'edtRecPrdDsc_Forecolor',ctrl:'RECPRDDSC',prop:'Forecolor'},{av:'chkavSeleccionar.getColumnClass()',ctrl:'vSELECCIONAR',prop:'Columnclass'},{av:'edtRecLinPro_Columnclass',ctrl:'RECLINPRO',prop:'Columnclass'},{av:'edtProForCod_Columnclass',ctrl:'PROFORCOD',prop:'Columnclass'},{av:'edtProForDsc_Columnclass',ctrl:'PROFORDSC',prop:'Columnclass'},{av:'edtRecLin_Columnclass',ctrl:'RECLIN',prop:'Columnclass'},{av:'edtRecPrdNum_Columnclass',ctrl:'RECPRDNUM',prop:'Columnclass'},{av:'edtRecPrdDsc_Columnclass',ctrl:'RECPRDDSC',prop:'Columnclass'},{av:'edtFacCon_Columnclass',ctrl:'FACCON',prop:'Columnclass'},{av:'edtPrdCant_Columnclass',ctrl:'PRDCANT',prop:'Columnclass'},{av:'edtForPrdDsc_Columnclass',ctrl:'FORPRDDSC',prop:'Columnclass'},{av:'edtRecForNro_Columnclass',ctrl:'RECFORNRO',prop:'Columnclass'},{av:'edtRecPrdTnq_Columnclass',ctrl:'RECPRDTNQ',prop:'Columnclass'},{av:'edtRecLote_Columnclass',ctrl:'RECLOTE',prop:'Columnclass'},{av:'edtavColor_Columnclass',ctrl:'vCOLOR',prop:'Columnclass'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true}]}");
      setEventMetadata("ENTER","{handler:'e202AX2',iparms:[{av:'AV137RecLinPro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV134PrdNom',fld:'vPRDNOM',pic:''},{av:'AV150ForPrdDsccontrol',fld:'vFORPRDDSCCONTROL',pic:''},{av:'AV124RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV128FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV121RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV140Lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV134PrdNom',fld:'vPRDNOM',pic:''},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV150ForPrdDsccontrol',fld:'vFORPRDDSCCONTROL',pic:''},{av:'AV32Flag',fld:'vFLAG',pic:'9'},{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'},{av:'AV131PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e152AX2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV137RecLinPro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV124RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV128FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV131PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV119RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV118RecLote',fld:'vRECLOTE',pic:''},{av:'AV121RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV120RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV114oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV115Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV116CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV117OldFaccon',fld:'vOLDFACCON',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV124RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV140Lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV128FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV131PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV121RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV118RecLote',fld:'vRECLOTE',pic:''},{av:'AV119RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV120RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV114oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV115Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV116CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV122PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV123PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV137RecLinPro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV143RecLinMax',fld:'vRECLINMAX',pic:'ZZZ9'},{av:'AV146RecLinMin',fld:'vRECLINMIN',pic:'ZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOELIMINARLINEAS'","{handler:'e212AX2',iparms:[{av:'AV152Seleccionar',fld:'vSELECCIONAR',grid:263,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_263',ctrl:'GRID',grid:263,prop:'GridRC',grid:263}]");
      setEventMetadata("'DOELIMINARLINEAS'",",oparms:[{av:'Dvelop_confirmpanel_eliminarlineas_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEAS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEAS.CLOSE","{handler:'e162AX2',iparms:[{av:'Dvelop_confirmpanel_eliminarlineas_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEAS',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',grid:263,pic:'ZZZ9',hsh:true},{av:'nRC_GXsfl_263',ctrl:'GRID',grid:263,prop:'GridRC',grid:263},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV152Seleccionar',fld:'vSELECCIONAR',grid:263,pic:''},{av:'A1273RecLinPro',fld:'RECLINPRO',grid:263,pic:'Z9',hsh:true},{av:'A811RecLin',fld:'RECLIN',grid:263,pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEAS.CLOSE",",oparms:[{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOLIMPIAR'","{handler:'e222AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("'DOLIMPIAR'",",oparms:[{av:'AV124RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'AV140Lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV128FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV131PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV121RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV118RecLote',fld:'vRECLOTE',pic:''},{av:'AV119RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV120RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV114oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV115Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV116CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV122PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV123PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV137RecLinPro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV143RecLinMax',fld:'vRECLINMAX',pic:'ZZZ9'},{av:'AV146RecLinMin',fld:'vRECLINMIN',pic:'ZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOUSERACTION2'","{handler:'e232AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''}]");
      setEventMetadata("'DOUSERACTION2'",",oparms:[{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e242AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOELIMINAR'","{handler:'e112AX1',iparms:[]");
      setEventMetadata("'DOELIMINAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e172AX2',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e352AX2',iparms:[{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV18BarSua',fld:'vBARSUA',pic:''},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV18BarSua',fld:'vBARSUA',pic:''},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e122AX1',iparms:[{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_cerrar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'ConfirmationText'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e182AX2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV32Flag',fld:'vFLAG',pic:'9'},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV33FlagOpe',fld:'vFLAGOPE',pic:''},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV18BarSua',fld:'vBARSUA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV32Flag',fld:'vFLAG',pic:'9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV33FlagOpe',fld:'vFLAGOPE',pic:''},{av:'AV18BarSua',fld:'vBARSUA',pic:''},{av:'AV48Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e132AX1',iparms:[{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'Dvelop_confirmpanel_cerrar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE","{handler:'e192AX2',iparms:[{av:'Dvelop_confirmpanel_cerrar_Result',ctrl:'DVELOP_CONFIRMPANEL_CERRAR',prop:'Result'},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV33FlagOpe',fld:'vFLAGOPE',pic:''},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CERRAR.CLOSE",",oparms:[{av:'AV33FlagOpe',fld:'vFLAGOPE',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOADD'","{handler:'e252AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("'DOADD'",",oparms:[{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOELIMINARPROCESOS'","{handler:'e262AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("'DOELIMINARPROCESOS'",",oparms:[{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("'DOCAMBIAR'","{handler:'e272AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'}]");
      setEventMetadata("'DOCAMBIAR'",",oparms:[{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED","{handler:'e142AX2',iparms:[{av:'Combo_maqcod_Selectedvalue_get',ctrl:'COMBO_MAQCOD',prop:'SelectedValue_get'},{av:'AV48Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("COMBO_MAQCOD.ONOPTIONCLICKED",",oparms:[{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV48Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("'DOENVIOAUTOMATA'","{handler:'e392AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''}]");
      setEventMetadata("'DOENVIOAUTOMATA'",",oparms:[{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VRECNUMPRGIN.CONTROLVALUECHANGED","{handler:'e282AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV32Flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VRECNUMPRGIN.CONTROLVALUECHANGED",",oparms:[{av:'AV32Flag',fld:'vFLAG',pic:'9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VRECNUMPRGIN.ISVALID","{handler:'e292AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV32Flag',fld:'vFLAG',pic:'9'}]");
      setEventMetadata("VRECNUMPRGIN.ISVALID",",oparms:[{av:'AV32Flag',fld:'vFLAG',pic:'9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED","{handler:'e302AX2',iparms:[{av:'AV48Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("VMAQCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV48Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("VMAQCOD.ISVALID","{handler:'e312AX2',iparms:[{av:'AV48Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'A624MaqVolMed',fld:'MAQVOLMED',pic:'ZZZZ9'},{av:'A623MaqVolMax',fld:'MAQVOLMAX',pic:'ZZZZ9'},{av:'A625MaqVolMin',fld:'MAQVOLMIN',pic:'ZZZZ9'},{av:'A3599MaqRelBan',fld:'MAQRELBAN',pic:'Z9'}]");
      setEventMetadata("VMAQCOD.ISVALID",",oparms:[{av:'AV48Maquin',fld:'vMAQUIN',pic:'ZZZ9'},{av:'AV49MaqVolMax',fld:'vMAQVOLMAX',pic:'ZZZZ9'},{av:'AV51MaqVolMin',fld:'vMAQVOLMIN',pic:'ZZZZ9'}]}");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED","{handler:'e322AX2',iparms:[{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV128FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED",",oparms:[{av:'AV131PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''}]}");
      setEventMetadata("VRECPRDNUM.CONTROLVALUECHANGED","{handler:'e332AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV140Lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A1643PrdTip',fld:'PRDTIP',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VRECPRDNUM.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV134PrdNom',fld:'vPRDNOM',pic:''},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV118RecLote',fld:'vRECLOTE',pic:''},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV123PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV122PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV121RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VRECLIN.CONTROLVALUECHANGED","{handler:'e342AX2',iparms:[{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV124RecLin',fld:'vRECLIN',pic:'ZZZ9'}]");
      setEventMetadata("VRECLIN.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV148NextRecLinMin',fld:'vNEXTRECLINMIN',pic:'ZZZ9'},{av:'AV146RecLinMin',fld:'vRECLINMIN',pic:'ZZZ9'},{av:'AV143RecLinMax',fld:'vRECLINMAX',pic:'ZZZ9'},{av:'AV137RecLinPro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV140Lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV123PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV122PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV117OldFaccon',fld:'vOLDFACCON',pic:'ZZZZ9.99999'},{av:'AV116CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV115Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV114oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV120RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV121RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV118RecLote',fld:'vRECLOTE',pic:''},{av:'AV119RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV131PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV128FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'edtavRecprdnum_Enabled',ctrl:'vRECPRDNUM',prop:'Enabled'},{av:'imgUseraction2_Enabled',ctrl:'USERACTION2',prop:'Enabled'},{av:'edtavRecprddsc_Enabled',ctrl:'vRECPRDDSC',prop:'Enabled'}]}");
      setEventMetadata("RECLIN.CLICK","{handler:'e402AX2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9',hsh:true},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''}]");
      setEventMetadata("RECLIN.CLICK",",oparms:[{av:'AV124RecLin',fld:'vRECLIN',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV148NextRecLinMin',fld:'vNEXTRECLINMIN',pic:'ZZZ9'},{av:'AV146RecLinMin',fld:'vRECLINMIN',pic:'ZZZ9'},{av:'AV143RecLinMax',fld:'vRECLINMAX',pic:'ZZZ9'},{av:'AV137RecLinPro',fld:'vRECLINPRO',pic:'Z9'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV140Lrecet',fld:'vLRECET',pic:'ZZZ9'},{av:'AV123PrdCanRes',fld:'vPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV122PrdExiAlm',fld:'vPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV117OldFaccon',fld:'vOLDFACCON',pic:'ZZZZ9.99999'},{av:'AV116CanResold',fld:'vCANRESOLD',pic:'ZZZZ9.99'},{av:'AV115Cantold',fld:'vCANTOLD',pic:'ZZZZZZ9.999'},{av:'AV114oldRecLote',fld:'vOLDRECLOTE',pic:''},{av:'AV120RecPrdTnq',fld:'vRECPRDTNQ',pic:'Z9'},{av:'AV125RecPrdNum',fld:'vRECPRDNUM',pic:''},{av:'AV127RecPrdDsc',fld:'vRECPRDDSC',pic:''},{av:'AV121RecManAut',fld:'vRECMANAUT',pic:''},{av:'AV118RecLote',fld:'vRECLOTE',pic:''},{av:'AV119RecForNro',fld:'vRECFORNRO',pic:'Z9'},{av:'AV131PrdCant',fld:'vPRDCANT',pic:'ZZZZZZ9.999'},{av:'AV129ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV130ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV128FacCon',fld:'vFACCON',pic:'ZZZZ9.99999'},{av:'edtavRecprdnum_Enabled',ctrl:'vRECPRDNUM',prop:'Enabled'},{av:'imgUseraction2_Enabled',ctrl:'USERACTION2',prop:'Enabled'},{av:'edtavRecprddsc_Enabled',ctrl:'vRECPRDDSC',prop:'Enabled'},{av:'imgUseraction1_Enabled',ctrl:'USERACTION1',prop:'Enabled'},{av:'edtavForprdume_Enabled',ctrl:'vFORPRDUME',prop:'Enabled'},{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV132TipodeProceso',fld:'vTIPODEPROCESO',pic:'',hsh:true},{av:'AV133TotaldeKilos',fld:'vTOTALDEKILOS',pic:'ZZZZZ9.99',hsh:true},{av:'AV138ValCos',fld:'vVALCOS',pic:'ZZZ9',hsh:true},{av:'AV5Automata',fld:'vAUTOMATA',pic:'ZZZ9',hsh:true},{av:'AV112RecipeTinte',fld:'vRECIPETINTE',pic:'ZZZ9',hsh:true},{av:'AV23Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV45MaqcodOld',fld:'vMAQCODOLD',pic:'',hsh:true},{av:'AV21BarVolMaqOld',fld:'vBARVOLMAQOLD',pic:'ZZZZ9',hsh:true},{av:'AV151FlagFo13',fld:'vFLAGFO13',pic:'9',hsh:true},{av:'AV68RecNumPrgold',fld:'vRECNUMPRGOLD',pic:'',hsh:true},{av:'AV139Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'AV22CambioPrograma',fld:'vCAMBIOPROGRAMA',pic:'ZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV158Pgmname',fld:'vPGMNAME',pic:''},{av:'AV106UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV73Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV69RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV71RecTotMtr',fld:'vRECTOTMTR',pic:'ZZZZZZ9.99'},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV44MaqCod',fld:'vMAQCOD',pic:''},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV8BarAgrEst',fld:'vBARAGREST',pic:'@!'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'chkavSeleccionar.getColumnHeaderClass()',ctrl:'vSELECCIONAR',prop:'Columnheaderclass'},{av:'edtRecLinPro_Columnheaderclass',ctrl:'RECLINPRO',prop:'Columnheaderclass'},{av:'edtProForCod_Columnheaderclass',ctrl:'PROFORCOD',prop:'Columnheaderclass'},{av:'edtProForDsc_Columnheaderclass',ctrl:'PROFORDSC',prop:'Columnheaderclass'},{av:'edtRecLin_Columnheaderclass',ctrl:'RECLIN',prop:'Columnheaderclass'},{av:'edtRecPrdNum_Columnheaderclass',ctrl:'RECPRDNUM',prop:'Columnheaderclass'},{av:'edtRecPrdDsc_Columnheaderclass',ctrl:'RECPRDDSC',prop:'Columnheaderclass'},{av:'edtFacCon_Columnheaderclass',ctrl:'FACCON',prop:'Columnheaderclass'},{av:'edtPrdCant_Columnheaderclass',ctrl:'PRDCANT',prop:'Columnheaderclass'},{av:'edtForPrdDsc_Columnheaderclass',ctrl:'FORPRDDSC',prop:'Columnheaderclass'},{av:'edtRecForNro_Columnheaderclass',ctrl:'RECFORNRO',prop:'Columnheaderclass'},{av:'edtRecPrdTnq_Columnheaderclass',ctrl:'RECPRDTNQ',prop:'Columnheaderclass'},{av:'edtRecLote_Columnheaderclass',ctrl:'RECLOTE',prop:'Columnheaderclass'},{av:'edtavColor_Columnheaderclass',ctrl:'vCOLOR',prop:'Columnheaderclass'},{av:'AV149Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV64RecetasTinteProcesosQuimicosToJson',fld:'vRECETASTINTEPROCESOSQUIMICOSTOJSON',pic:'',hsh:true},{av:'AV66RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV10Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV27Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Modif',fld:'vMODIF',pic:''},{av:'AV58Procesosdadosdealta',fld:'vPROCESOSDADOSDEALTA',pic:'ZZZ9'},{av:'lblLog_Caption',ctrl:'LOG',prop:'Caption'},{av:'AV59Procesoseliminados',fld:'vPROCESOSELIMINADOS',pic:'ZZZ9'},{av:'AV144lastvariable',fld:'vLASTVARIABLE',pic:'Z9',hsh:true},{av:'AV145Color',fld:'vCOLOR',pic:'ZZZ9',hsh:true},{av:'AV107RecFA',fld:'vRECFA',pic:'ZZ9.99'},{av:'AV67RecNumPrgIN',fld:'vRECNUMPRGIN',pic:''},{av:'AV14Barfacabs',fld:'vBARFACABS',pic:'ZZ9.99',hsh:true},{av:'AV20BarVolMaq',fld:'vBARVOLMAQ',pic:'ZZZZ9'},{av:'AV15BarMaqcod',fld:'vBARMAQCOD',pic:'',hsh:true}]}");
      setEventMetadata("VALIDV_RECPRDNUM","{handler:'validv_Recprdnum',iparms:[]");
      setEventMetadata("VALIDV_RECPRDNUM",",oparms:[]}");
      setEventMetadata("VALIDV_FORPRDUME","{handler:'validv_Forprdume',iparms:[]");
      setEventMetadata("VALIDV_FORPRDUME",",oparms:[]}");
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
      setEventMetadata("NULL","{handler:'validv_Color',iparms:[]");
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
      wcpOAV27Emprcod = "" ;
      wcpOAV10Barcodpar = "" ;
      wcpOGx_mode = "" ;
      wcpOAV104varmsg = "" ;
      wcpOAV133TotaldeKilos = DecimalUtil.ZERO ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Dvelop_confirmpanel_eliminarlineas_Result = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      Dvelop_confirmpanel_cerrar_Result = "" ;
      Combo_maqcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV27Emprcod = "" ;
      AV10Barcodpar = "" ;
      Gx_mode = "" ;
      AV104varmsg = "" ;
      AV133TotaldeKilos = DecimalUtil.ZERO ;
      AV158Pgmname = "" ;
      AV106UsurCod = "" ;
      AV73Station = "" ;
      AV67RecNumPrgIN = "" ;
      AV107RecFA = DecimalUtil.ZERO ;
      AV69RecTotKgm = DecimalUtil.ZERO ;
      AV71RecTotMtr = DecimalUtil.ZERO ;
      AV44MaqCod = "" ;
      AV64RecetasTinteProcesosQuimicosToJson = "" ;
      AV15BarMaqcod = "" ;
      AV14Barfacabs = DecimalUtil.ZERO ;
      AV8BarAgrEst = "" ;
      AV132TipodeProceso = "" ;
      AV45MaqcodOld = "" ;
      AV68RecNumPrgold = "" ;
      AV52Modif = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV26DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV108MaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV134PrdNom = "" ;
      AV150ForPrdDsccontrol = "" ;
      AV18BarSua = "" ;
      AV33FlagOpe = "" ;
      A602MaqCod = "" ;
      A10881PrdLote = "" ;
      A718PrdNom = "" ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A1643PrdTip = "" ;
      Combo_maqcod_Selectedvalue_set = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tablelog = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV53Modo = "" ;
      lblLog_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV16BarNHdr = "" ;
      AV25CliNom = "" ;
      AV17BarSer = "" ;
      AV12BarColNom = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_maqcod_Jsonclick = "" ;
      ucCombo_maqcod = new com.genexus.webpanels.GXUserControl();
      AV63Rb = DecimalUtil.ZERO ;
      bttBtncambiar_Jsonclick = "" ;
      AV70RecTotKgs = DecimalUtil.ZERO ;
      lblTextblockbaragrest_Jsonclick = "" ;
      bttBtneliminar_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnadd_Jsonclick = "" ;
      bttBtneliminarprocesos_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      lblTbmessage_Jsonclick = "" ;
      AV125RecPrdNum = "" ;
      imgUseraction2_gximage = "" ;
      sImgUrl = "" ;
      imgUseraction2_Jsonclick = "" ;
      AV127RecPrdDsc = "" ;
      AV128FacCon = DecimalUtil.ZERO ;
      imgUseraction1_gximage = "" ;
      imgUseraction1_Jsonclick = "" ;
      AV130ForPrdDsc = "" ;
      AV131PrdCant = DecimalUtil.ZERO ;
      AV118RecLote = "" ;
      AV121RecManAut = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtneliminarlineas_Jsonclick = "" ;
      bttBtnlimpiar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDvpanel_unnamedtable7 = new com.genexus.webpanels.GXUserControl();
      AV114oldRecLote = "" ;
      AV115Cantold = DecimalUtil.ZERO ;
      AV116CanResold = DecimalUtil.ZERO ;
      AV117OldFaccon = DecimalUtil.ZERO ;
      AV122PrdExiAlm = DecimalUtil.ZERO ;
      AV123PrdCanRes = DecimalUtil.ZERO ;
      lblStyle_Jsonclick = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucPopover_baragrest = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
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
      H02AX2_A4024RecMar = new byte[1] ;
      H02AX2_A6018ProForFab = new String[] {""} ;
      H02AX2_n6018ProForFab = new boolean[] {false} ;
      H02AX2_A13232PrdRGB = new long[1] ;
      H02AX2_A5725RecLote = new String[] {""} ;
      H02AX2_A3274RecPrdTnq = new byte[1] ;
      H02AX2_A2394RecForNro = new byte[1] ;
      H02AX2_A14055RecManAut = new String[] {""} ;
      H02AX2_A488ForPrdDsc = new String[] {""} ;
      H02AX2_n488ForPrdDsc = new boolean[] {false} ;
      H02AX2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX2_A490ForPrdUMe = new byte[1] ;
      H02AX2_n490ForPrdUMe = new boolean[] {false} ;
      H02AX2_A719PrdNum = new String[] {""} ;
      H02AX2_n719PrdNum = new boolean[] {false} ;
      H02AX2_A875RecPrdDsc = new String[] {""} ;
      H02AX2_A872RecPrdNum = new String[] {""} ;
      H02AX2_A811RecLin = new short[1] ;
      H02AX2_A766ProForDsc = new String[] {""} ;
      H02AX2_A764ProForCod = new String[] {""} ;
      H02AX2_A1273RecLinPro = new byte[1] ;
      H02AX2_A2804RecLinMaq = new short[1] ;
      H02AX2_A130BarCodPar = new String[] {""} ;
      H02AX2_A132BarCodReo = new byte[1] ;
      H02AX2_A129BarCod = new int[1] ;
      H02AX2_A396EmprCod = new String[] {""} ;
      H02AX3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV28EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      H02AX6_A2804RecLinMaq = new short[1] ;
      H02AX6_A130BarCodPar = new String[] {""} ;
      H02AX6_A132BarCodReo = new byte[1] ;
      H02AX6_A129BarCod = new int[1] ;
      H02AX6_A396EmprCod = new String[] {""} ;
      H02AX6_A602MaqCod = new String[] {""} ;
      H02AX6_A2805RecVolPrd = new int[1] ;
      H02AX6_A2806RecFA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX6_A5110RecNumPrg = new String[] {""} ;
      H02AX6_A252CliCod = new int[1] ;
      H02AX6_n252CliCod = new boolean[] {false} ;
      H02AX6_A279CliNom = new String[] {""} ;
      H02AX6_A212BarSer = new String[] {""} ;
      H02AX6_A135BarColNom = new String[] {""} ;
      H02AX6_A136BarColNum = new int[1] ;
      H02AX6_A218BarTipCol = new byte[1] ;
      H02AX6_A120BarAgrEst = new String[] {""} ;
      H02AX6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX6_A870BarTotMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX6_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
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
      AV65RecfaIN = DecimalUtil.ZERO ;
      AV113Promptagrupada = "" ;
      imgPromptagrupada_gximage = "" ;
      imgPromptagrupada_Internalname = "" ;
      AV160Promptagrupada_GXI = "" ;
      AV105WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV60ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      AV42Inc_obs = "" ;
      GXv_int12 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminarlineas = new com.genexus.webpanels.GXUserControl();
      AV135Prdexicc = DecimalUtil.ZERO ;
      AV29ErrMensajeautomata = "" ;
      AV30ErrorMessage = "" ;
      AV72Session = httpContext.getWebSession();
      AV38GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV102TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV41HTTPRequest = httpContext.getHttpRequest();
      H02AX7_A396EmprCod = new String[] {""} ;
      H02AX7_A623MaqVolMax = new int[1] ;
      H02AX7_n623MaqVolMax = new boolean[] {false} ;
      H02AX7_A602MaqCod = new String[] {""} ;
      H02AX7_A625MaqVolMin = new int[1] ;
      H02AX7_n625MaqVolMin = new boolean[] {false} ;
      H02AX7_A606MaqDsc = new String[] {""} ;
      H02AX7_n606MaqDsc = new boolean[] {false} ;
      A606MaqDsc = "" ;
      AV109Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_int16 = new short[1] ;
      GXv_int15 = new short[1] ;
      GXv_int14 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_decimal30 = new java.math.BigDecimal[1] ;
      GXv_int18 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal29 = new java.math.BigDecimal[1] ;
      GXv_decimal28 = new java.math.BigDecimal[1] ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      H02AX8_A602MaqCod = new String[] {""} ;
      H02AX8_A396EmprCod = new String[] {""} ;
      H02AX8_A624MaqVolMed = new int[1] ;
      H02AX8_n624MaqVolMed = new boolean[] {false} ;
      H02AX8_A623MaqVolMax = new int[1] ;
      H02AX8_n623MaqVolMax = new boolean[] {false} ;
      H02AX8_A625MaqVolMin = new int[1] ;
      H02AX8_n625MaqVolMin = new boolean[] {false} ;
      H02AX8_A3599MaqRelBan = new byte[1] ;
      H02AX8_n3599MaqRelBan = new boolean[] {false} ;
      GXv_int17 = new short[1] ;
      GXv_decimal31 = new java.math.BigDecimal[1] ;
      GXv_char25 = new String[1] ;
      GXv_int20 = new int[1] ;
      GXv_int24 = new byte[1] ;
      GXv_char23 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int10 = new int[1] ;
      H02AX9_A490ForPrdUMe = new byte[1] ;
      H02AX9_n490ForPrdUMe = new boolean[] {false} ;
      H02AX9_A396EmprCod = new String[] {""} ;
      H02AX9_A488ForPrdDsc = new String[] {""} ;
      H02AX9_n488ForPrdDsc = new boolean[] {false} ;
      H02AX10_A719PrdNum = new String[] {""} ;
      H02AX10_n719PrdNum = new boolean[] {false} ;
      H02AX10_A396EmprCod = new String[] {""} ;
      H02AX10_A10881PrdLote = new String[] {""} ;
      H02AX10_A4338PrdUMeFo = new byte[1] ;
      H02AX10_A718PrdNom = new String[] {""} ;
      H02AX10_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX10_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX10_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AX10_A1643PrdTip = new String[] {""} ;
      GXv_boolean33 = new boolean[1] ;
      ucDvelop_confirmpanel_cerrar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      lblBaragrest_popoverimage_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetadetinte02__wp__default(),
         new Object[] {
             new Object[] {
            H02AX2_A4024RecMar, H02AX2_A6018ProForFab, H02AX2_n6018ProForFab, H02AX2_A13232PrdRGB, H02AX2_A5725RecLote, H02AX2_A3274RecPrdTnq, H02AX2_A2394RecForNro, H02AX2_A14055RecManAut, H02AX2_A488ForPrdDsc, H02AX2_n488ForPrdDsc,
            H02AX2_A686PrdCant, H02AX2_A431FacCon, H02AX2_A490ForPrdUMe, H02AX2_n490ForPrdUMe, H02AX2_A719PrdNum, H02AX2_n719PrdNum, H02AX2_A875RecPrdDsc, H02AX2_A872RecPrdNum, H02AX2_A811RecLin, H02AX2_A766ProForDsc,
            H02AX2_A764ProForCod, H02AX2_A1273RecLinPro, H02AX2_A2804RecLinMaq, H02AX2_A130BarCodPar, H02AX2_A132BarCodReo, H02AX2_A129BarCod, H02AX2_A396EmprCod
            }
            , new Object[] {
            H02AX3_AGRID_nRecordCount
            }
            , new Object[] {
            H02AX6_A2804RecLinMaq, H02AX6_A130BarCodPar, H02AX6_A132BarCodReo, H02AX6_A129BarCod, H02AX6_A396EmprCod, H02AX6_A602MaqCod, H02AX6_A2805RecVolPrd, H02AX6_A2806RecFA, H02AX6_A5110RecNumPrg, H02AX6_A252CliCod,
            H02AX6_n252CliCod, H02AX6_A279CliNom, H02AX6_A212BarSer, H02AX6_A135BarColNom, H02AX6_A136BarColNum, H02AX6_A218BarTipCol, H02AX6_A120BarAgrEst, H02AX6_A184BarMtr, H02AX6_A870BarTotMtr, H02AX6_A166BarKgm,
            H02AX6_A219BarTotAgr
            }
            , new Object[] {
            H02AX7_A396EmprCod, H02AX7_A623MaqVolMax, H02AX7_n623MaqVolMax, H02AX7_A602MaqCod, H02AX7_A625MaqVolMin, H02AX7_n625MaqVolMin, H02AX7_A606MaqDsc, H02AX7_n606MaqDsc
            }
            , new Object[] {
            H02AX8_A602MaqCod, H02AX8_A396EmprCod, H02AX8_A624MaqVolMed, H02AX8_n624MaqVolMed, H02AX8_A623MaqVolMax, H02AX8_n623MaqVolMax, H02AX8_A625MaqVolMin, H02AX8_n625MaqVolMin, H02AX8_A3599MaqRelBan, H02AX8_n3599MaqRelBan
            }
            , new Object[] {
            H02AX9_A490ForPrdUMe, H02AX9_A396EmprCod, H02AX9_A488ForPrdDsc, H02AX9_n488ForPrdDsc
            }
            , new Object[] {
            H02AX10_A719PrdNum, H02AX10_A396EmprCod, H02AX10_A10881PrdLote, H02AX10_A4338PrdUMeFo, H02AX10_A718PrdNom, H02AX10_A685PrdCanRes, H02AX10_A704PrdExiAlm, H02AX10_A705PrdExiCC, H02AX10_A1643PrdTip
            }
         }
      );
      AV158Pgmname = "RecetadeTinte02__WP" ;
      /* GeneXus formulas. */
      AV158Pgmname = "RecetadeTinte02__WP" ;
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
      edtavForprddsc_Enabled = 0 ;
      edtavPrdrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      edtavColor_Enabled = 0 ;
      edtavReclinpro_Enabled = 0 ;
      edtavReclinmin_Enabled = 0 ;
      edtavReclinmax_Enabled = 0 ;
      edtavNextreclinmin_Enabled = 0 ;
      edtavOldreclote_Enabled = 0 ;
      edtavCantold_Enabled = 0 ;
      edtavCanresold_Enabled = 0 ;
      edtavOldfaccon_Enabled = 0 ;
      edtavPrdexialm_Enabled = 0 ;
      edtavPrdcanres_Enabled = 0 ;
      edtavLrecet_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV11Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11Barcodreo ;
   private byte AV144lastvariable ;
   private byte AV151FlagFo13 ;
   private byte gxajaxcallmode ;
   private byte AV32Flag ;
   private byte A3599MaqRelBan ;
   private byte A4338PrdUMeFo ;
   private byte AV19BarTipCol ;
   private byte AV129ForPrdUMe ;
   private byte AV119RecForNro ;
   private byte AV120RecPrdTnq ;
   private byte AV137RecLinPro ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A490ForPrdUMe ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte A218BarTipCol ;
   private byte GXt_int5 ;
   private byte AV136Valcod ;
   private byte GXv_int18[] ;
   private byte GXv_int6[] ;
   private byte AV47MaqRelban ;
   private byte GXv_int24[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV66RecLinMaq ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV66RecLinMaq ;
   private short AV149Acciongridmodificar ;
   private short AV58Procesosdadosdealta ;
   private short AV22CambioPrograma ;
   private short AV59Procesoseliminados ;
   private short AV145Color ;
   private short AV138ValCos ;
   private short AV5Automata ;
   private short AV112RecipeTinte ;
   private short AV23Carvitin ;
   private short AV139Moda21 ;
   private short AV48Maquin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV124RecLin ;
   private short AV146RecLinMin ;
   private short AV143RecLinMax ;
   private short AV148NextRecLinMin ;
   private short AV140Lrecet ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short AV61R ;
   private short AV34G ;
   private short AV6B ;
   private short AV62R2 ;
   private short AV35G2 ;
   private short AV7B2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV111FlagStdp ;
   private short GXv_int12[] ;
   private short AV153lineas ;
   private short AV141crecet ;
   private short AV147NextReclinmax ;
   private short GXv_int16[] ;
   private short GXv_int15[] ;
   private short GXv_int14[] ;
   private short GXv_int13[] ;
   private short GXv_int17[] ;
   private int wcpOAV9Barcod ;
   private int nRC_GXsfl_263 ;
   private int subGrid_Rows ;
   private int AV9Barcod ;
   private int nGXsfl_263_idx=1 ;
   private int AV20BarVolMaq ;
   private int AV21BarVolMaqOld ;
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
   private int AV13BarColNum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int AV49MaqVolMax ;
   private int edtavMaqvolmax_Enabled ;
   private int AV51MaqVolMin ;
   private int edtavMaqvolmin_Enabled ;
   private int edtavRb_Enabled ;
   private int edtavBarvolmaq_Enabled ;
   private int edtavRecfa_Enabled ;
   private int edtavRecnumprgin_Enabled ;
   private int edtavRectotkgm_Enabled ;
   private int edtavRectotkgs_Enabled ;
   private int edtavRectotmtr_Enabled ;
   private int divUnnamedtable3_Height ;
   private int edtavReclin_Enabled ;
   private int edtavRecprdnum_Enabled ;
   private int imgUseraction2_Enabled ;
   private int edtavRecprddsc_Enabled ;
   private int edtavFaccon_Enabled ;
   private int edtavForprdume_Enabled ;
   private int imgUseraction1_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavPrdcant_Enabled ;
   private int edtavReclote_Enabled ;
   private int edtavRecfornro_Enabled ;
   private int edtavRecprdtnq_Enabled ;
   private int edtavRecmanaut_Enabled ;
   private int divUnnamedtable6_Height ;
   private int edtavReclinpro_Enabled ;
   private int edtavReclinmin_Enabled ;
   private int edtavReclinmax_Enabled ;
   private int edtavNextreclinmin_Enabled ;
   private int edtavOldreclote_Enabled ;
   private int edtavCantold_Enabled ;
   private int edtavCanresold_Enabled ;
   private int edtavOldfaccon_Enabled ;
   private int edtavPrdexialm_Enabled ;
   private int edtavPrdcanres_Enabled ;
   private int edtavLrecet_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavMaqcod_Visible ;
   private int AV24CliCod ;
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
   private int edtavColor_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A2805RecVolPrd ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int GXt_int9 ;
   private int edtRecPrdDsc_Backcolor ;
   private int edtRecPrdDsc_Forecolor ;
   private int nGXsfl_263_fel_idx=1 ;
   private int AV50MaqVolMed ;
   private int GXv_int20[] ;
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
   private int edtavColor_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A13232PrdRGB ;
   private long AV57PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV133TotaldeKilos ;
   private java.math.BigDecimal AV133TotaldeKilos ;
   private java.math.BigDecimal AV107RecFA ;
   private java.math.BigDecimal AV69RecTotKgm ;
   private java.math.BigDecimal AV71RecTotMtr ;
   private java.math.BigDecimal AV14Barfacabs ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal AV63Rb ;
   private java.math.BigDecimal AV70RecTotKgs ;
   private java.math.BigDecimal AV128FacCon ;
   private java.math.BigDecimal AV131PrdCant ;
   private java.math.BigDecimal AV115Cantold ;
   private java.math.BigDecimal AV116CanResold ;
   private java.math.BigDecimal AV117OldFaccon ;
   private java.math.BigDecimal AV122PrdExiAlm ;
   private java.math.BigDecimal AV123PrdCanRes ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A2806RecFA ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal A870BarTotMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A871RecTotMtr ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV65RecfaIN ;
   private java.math.BigDecimal AV135Prdexicc ;
   private java.math.BigDecimal GXv_decimal30[] ;
   private java.math.BigDecimal GXv_decimal29[] ;
   private java.math.BigDecimal GXv_decimal28[] ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private java.math.BigDecimal GXv_decimal31[] ;
   private String wcpOAV27Emprcod ;
   private String wcpOAV10Barcodpar ;
   private String wcpOGx_mode ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Dvelop_confirmpanel_eliminarlineas_Result ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String Dvelop_confirmpanel_cerrar_Result ;
   private String Combo_maqcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV27Emprcod ;
   private String AV10Barcodpar ;
   private String Gx_mode ;
   private String sGXsfl_263_idx="0001" ;
   private String AV158Pgmname ;
   private String AV106UsurCod ;
   private String AV73Station ;
   private String AV67RecNumPrgIN ;
   private String AV44MaqCod ;
   private String AV15BarMaqcod ;
   private String AV8BarAgrEst ;
   private String AV132TipodeProceso ;
   private String AV45MaqcodOld ;
   private String AV68RecNumPrgold ;
   private String AV52Modif ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV134PrdNom ;
   private String AV150ForPrdDsccontrol ;
   private String AV18BarSua ;
   private String AV33FlagOpe ;
   private String A602MaqCod ;
   private String A10881PrdLote ;
   private String A718PrdNom ;
   private String A1643PrdTip ;
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
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Dvpanel_unnamedtable7_Width ;
   private String Dvpanel_unnamedtable7_Cls ;
   private String Dvpanel_unnamedtable7_Title ;
   private String Dvpanel_unnamedtable7_Iconposition ;
   private String Popover_baragrest_Iteminternalname ;
   private String Popover_baragrest_Trigger ;
   private String Popover_baragrest_Position ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Dvelop_confirmpanel_eliminarlineas_Title ;
   private String Dvelop_confirmpanel_eliminarlineas_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlineas_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlineas_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlineas_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlineas_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlineas_Confirmtype ;
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
   private String AV53Modo ;
   private String edtavModo_Jsonclick ;
   private String edtavModif_Internalname ;
   private String edtavModif_Jsonclick ;
   private String lblLog_Internalname ;
   private String lblLog_Caption ;
   private String lblLog_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable15_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String AV16BarNHdr ;
   private String edtavBarnhdr_Jsonclick ;
   private String divUnnamedtable16_Internalname ;
   private String edtavClinom_Internalname ;
   private String AV25CliNom ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String AV17BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV12BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable12_Internalname ;
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
   private String divUnnamedtable13_Internalname ;
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
   private String divUnnamedtable14_Internalname ;
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
   private String divUnnamedtable11_Internalname ;
   private String bttBtnadd_Internalname ;
   private String bttBtnadd_Jsonclick ;
   private String bttBtneliminarprocesos_Internalname ;
   private String bttBtneliminarprocesos_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavReclin_Internalname ;
   private String edtavReclin_Jsonclick ;
   private String edtavRecprdnum_Internalname ;
   private String AV125RecPrdNum ;
   private String edtavRecprdnum_Jsonclick ;
   private String imgUseraction2_gximage ;
   private String sImgUrl ;
   private String imgUseraction2_Internalname ;
   private String imgUseraction2_Jsonclick ;
   private String edtavRecprddsc_Internalname ;
   private String AV127RecPrdDsc ;
   private String edtavRecprddsc_Jsonclick ;
   private String edtavFaccon_Internalname ;
   private String edtavFaccon_Jsonclick ;
   private String edtavForprdume_Internalname ;
   private String edtavForprdume_Jsonclick ;
   private String imgUseraction1_gximage ;
   private String imgUseraction1_Internalname ;
   private String imgUseraction1_Jsonclick ;
   private String edtavForprddsc_Internalname ;
   private String AV130ForPrdDsc ;
   private String edtavForprddsc_Jsonclick ;
   private String edtavPrdcant_Internalname ;
   private String edtavPrdcant_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavReclote_Internalname ;
   private String AV118RecLote ;
   private String edtavReclote_Jsonclick ;
   private String edtavRecfornro_Internalname ;
   private String edtavRecfornro_Jsonclick ;
   private String edtavRecprdtnq_Internalname ;
   private String edtavRecprdtnq_Jsonclick ;
   private String edtavRecmanaut_Internalname ;
   private String AV121RecManAut ;
   private String edtavRecmanaut_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtneliminarlineas_Internalname ;
   private String bttBtneliminarlineas_Jsonclick ;
   private String bttBtnlimpiar_Internalname ;
   private String bttBtnlimpiar_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divDvpanel_unnamedtable7_cell_Internalname ;
   private String divDvpanel_unnamedtable7_cell_Class ;
   private String Dvpanel_unnamedtable7_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavReclinpro_Internalname ;
   private String edtavReclinpro_Jsonclick ;
   private String edtavReclinmin_Internalname ;
   private String edtavReclinmin_Jsonclick ;
   private String edtavReclinmax_Internalname ;
   private String edtavReclinmax_Jsonclick ;
   private String edtavNextreclinmin_Internalname ;
   private String edtavNextreclinmin_Jsonclick ;
   private String edtavOldreclote_Internalname ;
   private String AV114oldRecLote ;
   private String edtavOldreclote_Jsonclick ;
   private String edtavCantold_Internalname ;
   private String edtavCantold_Jsonclick ;
   private String edtavCanresold_Internalname ;
   private String edtavCanresold_Jsonclick ;
   private String edtavOldfaccon_Internalname ;
   private String edtavOldfaccon_Jsonclick ;
   private String edtavPrdexialm_Internalname ;
   private String edtavPrdexialm_Jsonclick ;
   private String edtavPrdcanres_Internalname ;
   private String edtavPrdcanres_Jsonclick ;
   private String edtavLrecet_Internalname ;
   private String edtavLrecet_Jsonclick ;
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
   private String edtavColor_Internalname ;
   private String GXCCtl ;
   private String edtavBaragrest_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV28EmprNom ;
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
   private String edtavColor_Columnheaderclass ;
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
   private String edtavColor_Columnclass ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String sGXsfl_263_fel_idx="0001" ;
   private String Dvelop_confirmpanel_eliminarlineas_Internalname ;
   private String A606MaqDsc ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char25[] ;
   private String GXv_char23[] ;
   private String GXv_char19[] ;
   private String tblTabledvelop_confirmpanel_cerrar_Internalname ;
   private String Dvelop_confirmpanel_cerrar_Internalname ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminarlineas_Internalname ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String tblTablemergedbaragrest_Internalname ;
   private String edtavBaragrest_Jsonclick ;
   private String lblBaragrest_popoverimage_Internalname ;
   private String lblBaragrest_popoverimage_Jsonclick ;
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
   private String edtavColor_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Dvpanel_unnamedtable5_Autowidth ;
   private boolean Dvpanel_unnamedtable5_Autoheight ;
   private boolean Dvpanel_unnamedtable5_Collapsible ;
   private boolean Dvpanel_unnamedtable5_Collapsed ;
   private boolean Dvpanel_unnamedtable5_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable5_Autoscroll ;
   private boolean Dvpanel_unnamedtable7_Autowidth ;
   private boolean Dvpanel_unnamedtable7_Autoheight ;
   private boolean Dvpanel_unnamedtable7_Collapsible ;
   private boolean Dvpanel_unnamedtable7_Collapsed ;
   private boolean Dvpanel_unnamedtable7_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable7_Autoscroll ;
   private boolean wbLoad ;
   private boolean bGXsfl_263_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV152Seleccionar ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n488ForPrdDsc ;
   private boolean n6018ProForFab ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean gx_refresh_fired ;
   private boolean AV154isExiste ;
   private boolean n623MaqVolMax ;
   private boolean n625MaqVolMin ;
   private boolean n606MaqDsc ;
   private boolean n624MaqVolMed ;
   private boolean n3599MaqRelBan ;
   private boolean GXt_boolean32 ;
   private boolean GXv_boolean33[] ;
   private String wcpOAV104varmsg ;
   private String AV104varmsg ;
   private String AV64RecetasTinteProcesosQuimicosToJson ;
   private String AV160Promptagrupada_GXI ;
   private String AV42Inc_obs ;
   private String AV29ErrMensajeautomata ;
   private String AV30ErrorMessage ;
   private String AV113Promptagrupada ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV41HTTPRequest ;
   private com.genexus.webpanels.WebSession AV72Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablelog ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqcod ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable7 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucPopover_baragrest ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlineas ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_cerrar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV60ProgressIndicator ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private byte[] H02AX2_A4024RecMar ;
   private String[] H02AX2_A6018ProForFab ;
   private boolean[] H02AX2_n6018ProForFab ;
   private long[] H02AX2_A13232PrdRGB ;
   private String[] H02AX2_A5725RecLote ;
   private byte[] H02AX2_A3274RecPrdTnq ;
   private byte[] H02AX2_A2394RecForNro ;
   private String[] H02AX2_A14055RecManAut ;
   private String[] H02AX2_A488ForPrdDsc ;
   private boolean[] H02AX2_n488ForPrdDsc ;
   private java.math.BigDecimal[] H02AX2_A686PrdCant ;
   private java.math.BigDecimal[] H02AX2_A431FacCon ;
   private byte[] H02AX2_A490ForPrdUMe ;
   private boolean[] H02AX2_n490ForPrdUMe ;
   private String[] H02AX2_A719PrdNum ;
   private boolean[] H02AX2_n719PrdNum ;
   private String[] H02AX2_A875RecPrdDsc ;
   private String[] H02AX2_A872RecPrdNum ;
   private short[] H02AX2_A811RecLin ;
   private String[] H02AX2_A766ProForDsc ;
   private String[] H02AX2_A764ProForCod ;
   private byte[] H02AX2_A1273RecLinPro ;
   private short[] H02AX2_A2804RecLinMaq ;
   private String[] H02AX2_A130BarCodPar ;
   private byte[] H02AX2_A132BarCodReo ;
   private int[] H02AX2_A129BarCod ;
   private String[] H02AX2_A396EmprCod ;
   private long[] H02AX3_AGRID_nRecordCount ;
   private short[] H02AX6_A2804RecLinMaq ;
   private String[] H02AX6_A130BarCodPar ;
   private byte[] H02AX6_A132BarCodReo ;
   private int[] H02AX6_A129BarCod ;
   private String[] H02AX6_A396EmprCod ;
   private String[] H02AX6_A602MaqCod ;
   private int[] H02AX6_A2805RecVolPrd ;
   private java.math.BigDecimal[] H02AX6_A2806RecFA ;
   private String[] H02AX6_A5110RecNumPrg ;
   private int[] H02AX6_A252CliCod ;
   private boolean[] H02AX6_n252CliCod ;
   private String[] H02AX6_A279CliNom ;
   private String[] H02AX6_A212BarSer ;
   private String[] H02AX6_A135BarColNom ;
   private int[] H02AX6_A136BarColNum ;
   private byte[] H02AX6_A218BarTipCol ;
   private String[] H02AX6_A120BarAgrEst ;
   private java.math.BigDecimal[] H02AX6_A184BarMtr ;
   private java.math.BigDecimal[] H02AX6_A870BarTotMtr ;
   private java.math.BigDecimal[] H02AX6_A166BarKgm ;
   private java.math.BigDecimal[] H02AX6_A219BarTotAgr ;
   private String[] H02AX7_A396EmprCod ;
   private int[] H02AX7_A623MaqVolMax ;
   private boolean[] H02AX7_n623MaqVolMax ;
   private String[] H02AX7_A602MaqCod ;
   private int[] H02AX7_A625MaqVolMin ;
   private boolean[] H02AX7_n625MaqVolMin ;
   private String[] H02AX7_A606MaqDsc ;
   private boolean[] H02AX7_n606MaqDsc ;
   private String[] H02AX8_A602MaqCod ;
   private String[] H02AX8_A396EmprCod ;
   private int[] H02AX8_A624MaqVolMed ;
   private boolean[] H02AX8_n624MaqVolMed ;
   private int[] H02AX8_A623MaqVolMax ;
   private boolean[] H02AX8_n623MaqVolMax ;
   private int[] H02AX8_A625MaqVolMin ;
   private boolean[] H02AX8_n625MaqVolMin ;
   private byte[] H02AX8_A3599MaqRelBan ;
   private boolean[] H02AX8_n3599MaqRelBan ;
   private byte[] H02AX9_A490ForPrdUMe ;
   private boolean[] H02AX9_n490ForPrdUMe ;
   private String[] H02AX9_A396EmprCod ;
   private String[] H02AX9_A488ForPrdDsc ;
   private boolean[] H02AX9_n488ForPrdDsc ;
   private String[] H02AX10_A719PrdNum ;
   private boolean[] H02AX10_n719PrdNum ;
   private String[] H02AX10_A396EmprCod ;
   private String[] H02AX10_A10881PrdLote ;
   private byte[] H02AX10_A4338PrdUMeFo ;
   private String[] H02AX10_A718PrdNom ;
   private java.math.BigDecimal[] H02AX10_A685PrdCanRes ;
   private java.math.BigDecimal[] H02AX10_A704PrdExiAlm ;
   private java.math.BigDecimal[] H02AX10_A705PrdExiCC ;
   private String[] H02AX10_A1643PrdTip ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV108MaqCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV26DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV38GridState ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV102TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV105WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV109Combo_DataItem ;
}

final  class recetadetinte02__wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02AX2", "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT  /*+ FIRST_ROWS(51) */ T1.RecMar, T5.ProForFab, T2.PrdRGB, T1.RecLote, T1.RecPrdTnq, T1.RecForNro, T1.RecManAut, T3.ForPrdDsc, T1.PrdCant, T1.FacCon, T1.ForPrdUMe, T1.PrdNum, T1.RecPrdDsc, T1.RecPrdNum, T1.RecLin, T5.ProForDsc, T4.ProForCod, T1.RecLinPro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin) GX_CTE) WHERE GX_ROW_NUMBER BETWEEN ? AND ? OR ? < ? AND GX_ROW_NUMBER >= ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AX3", "SELECT COUNT(*) FROM ((((TXPLRECET T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPCRECET T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar AND T4.RecLinMaq = T1.RecLinMaq AND T4.RecLinPro = T1.RecLinPro) LEFT JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T4.ProForCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AX6", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.MaqCod, T1.RecVolPrd, T1.RecFA, T1.RecNumPrg, T2.CliCod, T3.CliNom, T2.BarSer, T2.BarColNom, T2.BarColNum, T2.BarTipCol, T2.BarAgrEst, COALESCE( T5.BarMtr, 0) AS BarMtr, COALESCE( T4.BarTotMtr, 0) AS BarTotMtr, COALESCE( T5.BarKgm, 0) AS BarKgm, COALESCE( T4.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPRECMAQ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(MtrAgr) AS BarTotMtr FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02AX7", "SELECT EmprCod, MaqVolMax, MaqCod, MaqVolMin, MaqDsc FROM TXPMAQUIN WHERE MaqVolMax > 0 ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AX8", "SELECT MaqCod, EmprCod, MaqVolMed, MaqVolMax, MaqVolMin, MaqRelBan FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02AX9", "SELECT ForPrdUMe, EmprCod, ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? and ForPrdUMe = ? ORDER BY EmprCod, ForPrdUMe ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02AX10", "SELECT PrdNum, EmprCod, PrdLote, PrdUMeFo, PrdNom, PrdCanRes, PrdExiAlm, PrdExiCC, PrdTip FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
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
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

