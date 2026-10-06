package app.pedidosclientesindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientorollos_ins_pieza_impl extends GXDataArea
{
   public mantenimientorollos_ins_pieza_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientorollos_ins_pieza_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientorollos_ins_pieza_impl.class ));
   }

   public mantenimientorollos_ins_pieza_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "emprcod") ;
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
            AV46emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46emprcod", AV46emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV50BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50BarCod), 8, 0));
               AV51BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodReo", GXutil.str( AV51BarCodReo, 1, 0));
               AV47BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47BarCodPar", AV47BarCodPar);
               AV101Flag = (byte)(GXutil.lval( httpContext.GetPar( "Flag"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV101Flag", GXutil.str( AV101Flag, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Flag), "9")));
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
      nRC_GXsfl_71 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_71"))) ;
      nGXsfl_71_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_71_idx"))) ;
      sGXsfl_71_idx = httpContext.GetPar( "sGXsfl_71_idx") ;
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
      AV46emprcod = httpContext.GetPar( "emprcod") ;
      AV50BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV51BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV47BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV44TFBarNHdr = httpContext.GetPar( "TFBarNHdr") ;
      AV45TFBarNHdr_Sel = httpContext.GetPar( "TFBarNHdr_Sel") ;
      AV21TFProCod = httpContext.GetPar( "TFProCod") ;
      AV22TFProCod_Sel = httpContext.GetPar( "TFProCod_Sel") ;
      AV23TFBarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin"))) ;
      AV24TFBarOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFBarOrdLin_To"))) ;
      AV25TFFasCod = httpContext.GetPar( "TFFasCod") ;
      AV26TFFasCod_Sel = httpContext.GetPar( "TFFasCod_Sel") ;
      AV27TFFasDsc = httpContext.GetPar( "TFFasDsc") ;
      AV28TFFasDsc_Sel = httpContext.GetPar( "TFFasDsc_Sel") ;
      AV29TFMaqCodBis = httpContext.GetPar( "TFMaqCodBis") ;
      AV30TFMaqCodBis_Sel = httpContext.GetPar( "TFMaqCodBis_Sel") ;
      AV31TFBarFasKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm"), ".") ;
      AV32TFBarFasKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasKgm_To"), ".") ;
      AV33TFBarFasMtr = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr"), ".") ;
      AV34TFBarFasMtr_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarFasMtr_To"), ".") ;
      AV35TFBarTieRea = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea"), ".") ;
      AV36TFBarTieRea_To = CommonUtil.decimalVal( httpContext.GetPar( "TFBarTieRea_To"), ".") ;
      AV37TFBarFecRea = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecRea")) ;
      AV104Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV90Col_Procod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV86Col_Barordlin);
      AV101Flag = (byte)(GXutil.lval( httpContext.GetPar( "Flag"))) ;
      AV85barordlin2 = (short)(GXutil.lval( httpContext.GetPar( "barordlin2"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV87Col_Fascod);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV88Col_FasDsc);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV89Col_Maqcodbis);
      AV60NumPzsFs = (short)(GXutil.lval( httpContext.GetPar( "NumPzsFs"))) ;
      AV61NumPzsFs2 = (short)(GXutil.lval( httpContext.GetPar( "NumPzsFs2"))) ;
      AV63Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV66Const = CommonUtil.decimalVal( httpContext.GetPar( "Const"), ".") ;
      AV73MetPieDCP = httpContext.GetPar( "MetPieDCP") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV50BarCod, AV51BarCodReo, AV47BarCodPar, AV44TFBarNHdr, AV45TFBarNHdr_Sel, AV21TFProCod, AV22TFProCod_Sel, AV23TFBarOrdLin, AV24TFBarOrdLin_To, AV25TFFasCod, AV26TFFasCod_Sel, AV27TFFasDsc, AV28TFFasDsc_Sel, AV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasKgm, AV32TFBarFasKgm_To, AV33TFBarFasMtr, AV34TFBarFasMtr_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFecRea, AV104Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90Col_Procod, AV86Col_Barordlin, AV101Flag, AV85barordlin2, AV87Col_Fascod, AV88Col_FasDsc, AV89Col_Maqcodbis, AV60NumPzsFs, AV61NumPzsFs2, AV63Moda21, AV66Const, AV73MetPieDCP) ;
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
      pa26L2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start26L2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidosclientesindetalle.mantenimientorollos_ins_pieza", new String[] {GXutil.URLEncode(GXutil.rtrim(AV46emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV47BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV101Flag,1,0))}, new String[] {"emprcod","BarCod","BarCodReo","BarCodPar","Flag"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV85barordlin2), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60NumPzsFs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61NumPzsFs2), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONST", getSecureSignedToken( "", localUtil.format( AV66Const, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEDCP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73MetPieDCP, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Flag), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoRollos_ins_Pieza");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\mantenimientorollos_ins_pieza:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_71", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_71, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR", GXutil.rtrim( AV44TFBarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNHDR_SEL", GXutil.rtrim( AV45TFBarNHdr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD", GXutil.rtrim( AV21TFProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPROCOD_SEL", GXutil.rtrim( AV22TFProCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV23TFBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV24TFBarOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD", GXutil.rtrim( AV25TFFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCOD_SEL", GXutil.rtrim( AV26TFFasCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC", GXutil.rtrim( AV27TFFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASDSC_SEL", GXutil.rtrim( AV28TFFasDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODBIS", GXutil.rtrim( AV29TFMaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFMAQCODBIS_SEL", GXutil.rtrim( AV30TFMaqCodBis_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASKGM", GXutil.ltrim( localUtil.ntoc( AV31TFBarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASKGM_TO", GXutil.ltrim( localUtil.ntoc( AV32TFBarFasKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASMTR", GXutil.ltrim( localUtil.ntoc( AV33TFBarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFASMTR_TO", GXutil.ltrim( localUtil.ntoc( AV34TFBarFasMtr_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIEREA", GXutil.ltrim( localUtil.ntoc( AV35TFBarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARTIEREA_TO", GXutil.ltrim( localUtil.ntoc( AV36TFBarTieRea_To, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECREA", localUtil.dtoc( AV37TFBarFecRea, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOL_PROCOD", AV90Col_Procod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOL_PROCOD", AV90Col_Procod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOL_BARORDLIN", AV86Col_Barordlin);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOL_BARORDLIN", AV86Col_Barordlin);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN2", GXutil.ltrim( localUtil.ntoc( AV85barordlin2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV85barordlin2), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOL_FASCOD", AV87Col_Fascod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOL_FASCOD", AV87Col_Fascod);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOL_FASDSC", AV88Col_FasDsc);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOL_FASDSC", AV88Col_FasDsc);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOL_MAQCODBIS", AV89Col_Maqcodbis);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOL_MAQCODBIS", AV89Col_Maqcodbis);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV48Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV84barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV76FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASDSC", GXutil.rtrim( AV75FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS", GXutil.ltrim( localUtil.ntoc( AV60NumPzsFs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60NumPzsFs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS2", GXutil.ltrim( localUtil.ntoc( AV61NumPzsFs2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61NumPzsFs2), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV46emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUM_PZ", GXutil.ltrim( localUtil.ntoc( AV62Num_pz, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV63Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONST", GXutil.ltrim( localUtil.ntoc( AV66Const, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONST", getSecureSignedToken( "", localUtil.format( AV66Const, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODBIS", GXutil.rtrim( AV94MaqCodBis));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEDCP", GXutil.rtrim( AV73MetPieDCP));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEDCP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73MetPieDCP, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV43Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV77Albreccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOPECOD", GXutil.ltrim( localUtil.ntoc( AV78OpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHISPROTUR", GXutil.ltrim( localUtil.ntoc( AV79Hisprotur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIELOC", GXutil.rtrim( AV80MetPieLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV91i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEAS", GXutil.ltrim( localUtil.ntoc( AV93lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we26L2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt26L2( ) ;
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
      return formatLink("app.pedidosclientesindetalle.mantenimientorollos_ins_pieza", new String[] {GXutil.URLEncode(GXutil.rtrim(AV46emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV50BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV51BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV47BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV101Flag,1,0))}, new String[] {"emprcod","BarCod","BarCodReo","BarCodPar","Flag"})  ;
   }

   public String getPgmname( )
   {
      return "PedidosClienteSinDetalle.MantenimientoRollos_ins_Pieza" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Fases de Produccion HDR", "") ;
   }

   public void wb26L0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV50BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV51BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV51BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV51BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV47BarCodPar), GXutil.rtrim( localUtil.format( AV47BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFlag_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFlag_Internalname, GXutil.ltrim( localUtil.ntoc( AV101Flag, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFlag_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV101Flag), "9") : localUtil.format( DecimalUtil.doubleToDec(AV101Flag), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFlag_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFlag_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_32_26L2( true) ;
      }
      else
      {
         wb_table1_32_26L2( false) ;
      }
      return  ;
   }

   public void wb_table1_32_26L2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiemet_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiemet_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiemet_Internalname, GXutil.ltrim( localUtil.ntoc( AV81MetPiemet, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpiemet_Enabled!=0) ? localUtil.format( AV81MetPiemet, "ZZZZZ9.99") : localUtil.format( AV81MetPiemet, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiemet_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiemet_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpieanc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpieanc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpieanc_Internalname, GXutil.ltrim( localUtil.ntoc( AV82MetPieAnc, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpieanc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV82MetPieAnc), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV82MetPieAnc), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpieanc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpieanc_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMetpiemtd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMetpiemtd_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetpiemtd_Internalname, GXutil.ltrim( localUtil.ntoc( AV83MetPieMtD, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetpiemtd_Enabled!=0) ? localUtil.format( AV83MetPieMtD, "ZZZZ9.99") : localUtil.format( AV83MetPieMtD, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetpiemtd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetpiemtd_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1126l1_client"+"'", TempTags, "", 2, "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 71, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol71( ) ;
      }
      if ( wbEnd == 71 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_71 = (int)(nGXsfl_71_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV104Pgmname), GXutil.rtrim( localUtil.format( AV104Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_97_26L2( true) ;
      }
      else
      {
         wb_table2_97_26L2( false) ;
      }
      return  ;
   }

   public void wb_table2_97_26L2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecreaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_71_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecreaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecreaauxdate_Internalname, localUtil.format(AV38DDO_BarFecReaAuxDate, "99/99/99"), localUtil.format( AV38DDO_BarFecReaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecreaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecreaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_PedidosClienteSinDetalle\\MantenimientoRollos_ins_Pieza.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 71 )
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

   public void start26L2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Fases de Produccion HDR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup26L0( ) ;
   }

   public void ws26L2( )
   {
      start26L2( ) ;
      evt26L2( ) ;
   }

   public void evt26L2( )
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
                           e1226L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1326L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1426L2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
                           AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
                           AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
                           AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
                           AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
                           AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
                           AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
                           AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
                           AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
                           AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
                           AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
                           AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
                           AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
                           AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
                           AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
                           AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
                           AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
                           AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
                           AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
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
                           nGXsfl_71_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_712( ) ;
                           AV95Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV95Seleccionar);
                           A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
                           n3837BarFasKgm = false ;
                           A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
                           n3838BarFasMtr = false ;
                           A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
                           A160BarFecRea = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecRea_Internalname), 0)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1526L2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1626L2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1726L2 ();
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

   public void we26L2( )
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

   public void pa26L2( )
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
            GX_FocusControl = edtavMetpiemet_Internalname ;
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
      subsflControlProps_712( ) ;
      while ( nGXsfl_71_idx <= nRC_GXsfl_71 )
      {
         sendrow_712( ) ;
         nGXsfl_71_idx = ((subGrid_Islastpage==1)&&(nGXsfl_71_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV46emprcod ,
                                 int AV50BarCod ,
                                 byte AV51BarCodReo ,
                                 String AV47BarCodPar ,
                                 String AV44TFBarNHdr ,
                                 String AV45TFBarNHdr_Sel ,
                                 String AV21TFProCod ,
                                 String AV22TFProCod_Sel ,
                                 short AV23TFBarOrdLin ,
                                 short AV24TFBarOrdLin_To ,
                                 String AV25TFFasCod ,
                                 String AV26TFFasCod_Sel ,
                                 String AV27TFFasDsc ,
                                 String AV28TFFasDsc_Sel ,
                                 String AV29TFMaqCodBis ,
                                 String AV30TFMaqCodBis_Sel ,
                                 java.math.BigDecimal AV31TFBarFasKgm ,
                                 java.math.BigDecimal AV32TFBarFasKgm_To ,
                                 java.math.BigDecimal AV33TFBarFasMtr ,
                                 java.math.BigDecimal AV34TFBarFasMtr_To ,
                                 java.math.BigDecimal AV35TFBarTieRea ,
                                 java.math.BigDecimal AV36TFBarTieRea_To ,
                                 java.util.Date AV37TFBarFecRea ,
                                 String AV104Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 GXSimpleCollection<String> AV90Col_Procod ,
                                 GXSimpleCollection<Short> AV86Col_Barordlin ,
                                 byte AV101Flag ,
                                 short AV85barordlin2 ,
                                 GXSimpleCollection<String> AV87Col_Fascod ,
                                 GXSimpleCollection<String> AV88Col_FasDsc ,
                                 GXSimpleCollection<String> AV89Col_Maqcodbis ,
                                 short AV60NumPzsFs ,
                                 short AV61NumPzsFs2 ,
                                 short AV63Moda21 ,
                                 java.math.BigDecimal AV66Const ,
                                 String AV73MetPieDCP )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1626L2 ();
      GRID_nCurrentRecord = 0 ;
      rf26L2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoRollos_ins_Pieza");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidosclientesindetalle\\mantenimientorollos_ins_pieza:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A758ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCODBIS", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A603MaqCodBis, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCODBIS", GXutil.rtrim( A603MaqCodBis));
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
      rf26L2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV104Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_ins_Pieza" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf26L2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(71) ;
      /* Execute user event: Refresh */
      e1626L2 ();
      nGXsfl_71_idx = 1 ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_712( ) ;
      bGXsfl_71_Refreshing = true ;
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
         subsflControlProps_712( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                              AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                              AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                              AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                              Short.valueOf(AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) ,
                                              Short.valueOf(AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) ,
                                              AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                              AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                              AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                              AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                              AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                              AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                              AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                              AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                              AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                              AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                              AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                              AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                              AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A758ProCod ,
                                              Short.valueOf(A194BarOrdLin) ,
                                              A457FasCod ,
                                              A460FasDsc ,
                                              A603MaqCodBis ,
                                              A3837BarFasKgm ,
                                              A3838BarFasMtr ,
                                              A215BarTieRea ,
                                              A160BarFecRea ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV46emprcod ,
                                              Integer.valueOf(AV50BarCod) ,
                                              Byte.valueOf(AV51BarCodReo) ,
                                              AV47BarCodPar ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr), 11, "%") ;
         lV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = GXutil.padr( GXutil.rtrim( AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod), 8, "%") ;
         lV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = GXutil.padr( GXutil.rtrim( AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod), 8, "%") ;
         lV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc), 28, "%") ;
         lV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis), 6, "%") ;
         /* Using cursor H026L2 */
         pr_default.execute(0, new Object[] {AV46emprcod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV47BarCodPar, lV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr, AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel, lV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod, AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel, Short.valueOf(AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin), Short.valueOf(AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to), lV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod, AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel, lV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc, AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel, lV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis, AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel, AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm, AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to, AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr, AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to, AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea, AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to, AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_71_idx = 1 ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H026L2_A396EmprCod[0] ;
            A160BarFecRea = H026L2_A160BarFecRea[0] ;
            A215BarTieRea = H026L2_A215BarTieRea[0] ;
            A3838BarFasMtr = H026L2_A3838BarFasMtr[0] ;
            n3838BarFasMtr = H026L2_n3838BarFasMtr[0] ;
            A3837BarFasKgm = H026L2_A3837BarFasKgm[0] ;
            n3837BarFasKgm = H026L2_n3837BarFasKgm[0] ;
            A603MaqCodBis = H026L2_A603MaqCodBis[0] ;
            A460FasDsc = H026L2_A460FasDsc[0] ;
            A457FasCod = H026L2_A457FasCod[0] ;
            A194BarOrdLin = H026L2_A194BarOrdLin[0] ;
            A758ProCod = H026L2_A758ProCod[0] ;
            A130BarCodPar = H026L2_A130BarCodPar[0] ;
            A132BarCodReo = H026L2_A132BarCodReo[0] ;
            A129BarCod = H026L2_A129BarCod[0] ;
            A460FasDsc = H026L2_A460FasDsc[0] ;
            A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
            e1726L2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(71) ;
         wb26L0( ) ;
      }
      bGXsfl_71_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes26L2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN2", GXutil.ltrim( localUtil.ntoc( AV85barordlin2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV85barordlin2), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS", GXutil.ltrim( localUtil.ntoc( AV60NumPzsFs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60NumPzsFs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMPZSFS2", GXutil.ltrim( localUtil.ntoc( AV61NumPzsFs2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61NumPzsFs2), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV63Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONST", GXutil.ltrim( localUtil.ntoc( AV66Const, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONST", getSecureSignedToken( "", localUtil.format( AV66Const, "ZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETPIEDCP", GXutil.rtrim( AV73MetPieDCP));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMETPIEDCP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV73MetPieDCP, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARORDLIN"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PROCOD"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, GXutil.rtrim( localUtil.format( A758ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FASCOD"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, GXutil.rtrim( localUtil.format( A457FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_MAQCODBIS"+"_"+sGXsfl_71_idx, getSecureSignedToken( sGXsfl_71_idx, GXutil.rtrim( localUtil.format( A603MaqCodBis, ""))));
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
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
      AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
      AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                           AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                           AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                           AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                           Short.valueOf(AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) ,
                                           Short.valueOf(AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) ,
                                           AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                           AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                           AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                           AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                           AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                           AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                           AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                           AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                           AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                           AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                           AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                           AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                           AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A758ProCod ,
                                           Short.valueOf(A194BarOrdLin) ,
                                           A457FasCod ,
                                           A460FasDsc ,
                                           A603MaqCodBis ,
                                           A3837BarFasKgm ,
                                           A3838BarFasMtr ,
                                           A215BarTieRea ,
                                           A160BarFecRea ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV46emprcod ,
                                           Integer.valueOf(AV50BarCod) ,
                                           Byte.valueOf(AV51BarCodReo) ,
                                           AV47BarCodPar ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = GXutil.padr( GXutil.rtrim( AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr), 11, "%") ;
      lV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = GXutil.padr( GXutil.rtrim( AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod), 8, "%") ;
      lV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = GXutil.padr( GXutil.rtrim( AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod), 8, "%") ;
      lV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = GXutil.padr( GXutil.rtrim( AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc), 28, "%") ;
      lV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = GXutil.padr( GXutil.rtrim( AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis), 6, "%") ;
      /* Using cursor H026L3 */
      pr_default.execute(1, new Object[] {AV46emprcod, Integer.valueOf(AV50BarCod), Byte.valueOf(AV51BarCodReo), AV47BarCodPar, lV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr, AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel, lV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod, AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel, Short.valueOf(AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin), Short.valueOf(AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to), lV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod, AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel, lV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc, AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel, lV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis, AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel, AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm, AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to, AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr, AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to, AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea, AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to, AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea});
      GRID_nRecordCount = H026L3_AGRID_nRecordCount[0] ;
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
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
      AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
      AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV50BarCod, AV51BarCodReo, AV47BarCodPar, AV44TFBarNHdr, AV45TFBarNHdr_Sel, AV21TFProCod, AV22TFProCod_Sel, AV23TFBarOrdLin, AV24TFBarOrdLin_To, AV25TFFasCod, AV26TFFasCod_Sel, AV27TFFasDsc, AV28TFFasDsc_Sel, AV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasKgm, AV32TFBarFasKgm_To, AV33TFBarFasMtr, AV34TFBarFasMtr_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFecRea, AV104Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90Col_Procod, AV86Col_Barordlin, AV101Flag, AV85barordlin2, AV87Col_Fascod, AV88Col_FasDsc, AV89Col_Maqcodbis, AV60NumPzsFs, AV61NumPzsFs2, AV63Moda21, AV66Const, AV73MetPieDCP) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
      AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
      AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
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
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV50BarCod, AV51BarCodReo, AV47BarCodPar, AV44TFBarNHdr, AV45TFBarNHdr_Sel, AV21TFProCod, AV22TFProCod_Sel, AV23TFBarOrdLin, AV24TFBarOrdLin_To, AV25TFFasCod, AV26TFFasCod_Sel, AV27TFFasDsc, AV28TFFasDsc_Sel, AV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasKgm, AV32TFBarFasKgm_To, AV33TFBarFasMtr, AV34TFBarFasMtr_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFecRea, AV104Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90Col_Procod, AV86Col_Barordlin, AV101Flag, AV85barordlin2, AV87Col_Fascod, AV88Col_FasDsc, AV89Col_Maqcodbis, AV60NumPzsFs, AV61NumPzsFs2, AV63Moda21, AV66Const, AV73MetPieDCP) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
      AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
      AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
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
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV50BarCod, AV51BarCodReo, AV47BarCodPar, AV44TFBarNHdr, AV45TFBarNHdr_Sel, AV21TFProCod, AV22TFProCod_Sel, AV23TFBarOrdLin, AV24TFBarOrdLin_To, AV25TFFasCod, AV26TFFasCod_Sel, AV27TFFasDsc, AV28TFFasDsc_Sel, AV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasKgm, AV32TFBarFasKgm_To, AV33TFBarFasMtr, AV34TFBarFasMtr_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFecRea, AV104Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90Col_Procod, AV86Col_Barordlin, AV101Flag, AV85barordlin2, AV87Col_Fascod, AV88Col_FasDsc, AV89Col_Maqcodbis, AV60NumPzsFs, AV61NumPzsFs2, AV63Moda21, AV66Const, AV73MetPieDCP) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
      AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
      AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
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
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV50BarCod, AV51BarCodReo, AV47BarCodPar, AV44TFBarNHdr, AV45TFBarNHdr_Sel, AV21TFProCod, AV22TFProCod_Sel, AV23TFBarOrdLin, AV24TFBarOrdLin_To, AV25TFFasCod, AV26TFFasCod_Sel, AV27TFFasDsc, AV28TFFasDsc_Sel, AV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasKgm, AV32TFBarFasKgm_To, AV33TFBarFasMtr, AV34TFBarFasMtr_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFecRea, AV104Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90Col_Procod, AV86Col_Barordlin, AV101Flag, AV85barordlin2, AV87Col_Fascod, AV88Col_FasDsc, AV89Col_Maqcodbis, AV60NumPzsFs, AV61NumPzsFs2, AV63Moda21, AV66Const, AV73MetPieDCP) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
      AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
      AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
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
         gxgrgrid_refresh( subGrid_Rows, AV46emprcod, AV50BarCod, AV51BarCodReo, AV47BarCodPar, AV44TFBarNHdr, AV45TFBarNHdr_Sel, AV21TFProCod, AV22TFProCod_Sel, AV23TFBarOrdLin, AV24TFBarOrdLin_To, AV25TFFasCod, AV26TFFasCod_Sel, AV27TFFasDsc, AV28TFFasDsc_Sel, AV29TFMaqCodBis, AV30TFMaqCodBis_Sel, AV31TFBarFasKgm, AV32TFBarFasKgm_To, AV33TFBarFasMtr, AV34TFBarFasMtr_To, AV35TFBarTieRea, AV36TFBarTieRea_To, AV37TFBarFecRea, AV104Pgmname, AV12OrderedBy, AV13OrderedDsc, AV90Col_Procod, AV86Col_Barordlin, AV101Flag, AV85barordlin2, AV87Col_Fascod, AV88Col_FasDsc, AV89Col_Maqcodbis, AV60NumPzsFs, AV61NumPzsFs2, AV63Moda21, AV66Const, AV73MetPieDCP) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV104Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_ins_Pieza" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup26L0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1526L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV39DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOL_BARORDLIN"), AV86Col_Barordlin);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOL_PROCOD"), AV90Col_Procod);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOL_MAQCODBIS"), AV89Col_Maqcodbis);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOL_FASDSC"), AV88Col_FasDsc);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOL_FASCOD"), AV87Col_Fascod);
         /* Read saved values. */
         nRC_GXsfl_71 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_71"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV91i = (short)(localUtil.ctol( httpContext.cgiGet( "vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV94MaqCodBis = httpContext.cgiGet( "vMAQCODBIS") ;
         AV75FasDsc = httpContext.cgiGet( "vFASDSC") ;
         AV76FasCod = httpContext.cgiGet( "vFASCOD") ;
         AV84barordlin = (short)(localUtil.ctol( httpContext.cgiGet( "vBARORDLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48Procod = httpContext.cgiGet( "vPROCOD") ;
         AV93lineas = (short)(localUtil.ctol( httpContext.cgiGet( "vLINEAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetpiemet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetpiemet_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEMET");
            GX_FocusControl = edtavMetpiemet_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81MetPiemet = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81MetPiemet", GXutil.ltrimstr( AV81MetPiemet, 9, 2));
         }
         else
         {
            AV81MetPiemet = localUtil.ctond( httpContext.cgiGet( edtavMetpiemet_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81MetPiemet", GXutil.ltrimstr( AV81MetPiemet, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavMetpieanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavMetpieanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEANC");
            GX_FocusControl = edtavMetpieanc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82MetPieAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82MetPieAnc), 3, 0));
         }
         else
         {
            AV82MetPieAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtavMetpieanc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82MetPieAnc), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETPIEMTD");
            GX_FocusControl = edtavMetpiemtd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83MetPieMtD = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83MetPieMtD", GXutil.ltrimstr( AV83MetPieMtD, 8, 2));
         }
         else
         {
            AV83MetPieMtD = localUtil.ctond( httpContext.cgiGet( edtavMetpiemtd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83MetPieMtD", GXutil.ltrimstr( AV83MetPieMtD, 8, 2));
         }
         AV104Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecreaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECREAAUXDATE");
            GX_FocusControl = edtavDdo_barfecreaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_BarFecReaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_BarFecReaAuxDate", localUtil.format(AV38DDO_BarFecReaAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_BarFecReaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecreaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_BarFecReaAuxDate", localUtil.format(AV38DDO_BarFecReaAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_71_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
         if ( nGXsfl_71_idx > 0 )
         {
            AV95Seleccionar = GXutil.strtobool( httpContext.cgiGet( chkavSeleccionar.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV95Seleccionar);
            A13696BarNHdr = httpContext.cgiGet( edtBarNHdr_Internalname) ;
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
            n3838BarFasMtr = false ;
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            A160BarFecRea = localUtil.ctod( httpContext.cgiGet( edtBarFecRea_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoRollos_ins_Pieza");
         AV104Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV104Pgmname", AV104Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV104Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidosclientesindetalle\\mantenimientorollos_ins_pieza:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1526L2 ();
      if (returnInSub) return;
   }

   public void e1526L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV43Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char1 = GXv_char2[0] ;
      AV43Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Station", AV43Station);
      GXv_char2[0] = AV46emprcod ;
      GXv_char3[0] = AV52EmprNom ;
      GXv_char4[0] = AV53UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientorollos_ins_pieza_impl.this.AV46emprcod = GXv_char2[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV52EmprNom = GXv_char3[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV53UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46emprcod", AV46emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Fases de Produccion HDR", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV39DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV39DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      GXt_int7 = (byte)(AV63Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV46emprcod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_int7 = GXv_int8[0] ;
      AV63Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV63Moda21), "ZZZ9")));
      GXt_int7 = (byte)(AV60NumPzsFs) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV46emprcod, httpContext.getMessage( "NPFF", ""), GXv_int8) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_int7 = GXv_int8[0] ;
      AV60NumPzsFs = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60NumPzsFs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60NumPzsFs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60NumPzsFs), "ZZZ9")));
      GXt_int7 = (byte)(AV61NumPzsFs2) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV46emprcod, httpContext.getMessage( "NPFF2", ""), GXv_int8) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_int7 = GXv_int8[0] ;
      AV61NumPzsFs2 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61NumPzsFs2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61NumPzsFs2), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMPZSFS2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV61NumPzsFs2), "ZZZ9")));
      GXt_int9 = AV65Valcont ;
      GXv_char4[0] = AV46emprcod ;
      GXv_char3[0] = httpContext.getMessage( "GRMCTE", "") ;
      GXv_int10[0] = GXt_int9 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int10) ;
      mantenimientorollos_ins_pieza_impl.this.AV46emprcod = GXv_char4[0] ;
      mantenimientorollos_ins_pieza_impl.this.GXt_int9 = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46emprcod", AV46emprcod);
      AV65Valcont = (short)(GXt_int9) ;
      AV66Const = DecimalUtil.doubleToDec(AV65Valcont) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Const", GXutil.ltrimstr( AV66Const, 6, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONST", getSecureSignedToken( "", localUtil.format( AV66Const, "ZZ9.99")));
      GXv_int11[0] = AV54Ancho ;
      GXv_decimal12[0] = AV55grm2 ;
      GXv_int13[0] = AV85barordlin2 ;
      new app.pedidosclientesindetalle.mantenimientorollos_ultima_pieza(remoteHandle, context).execute( AV46emprcod, AV50BarCod, AV51BarCodReo, AV47BarCodPar, GXv_int11, GXv_decimal12, GXv_int13) ;
      mantenimientorollos_ins_pieza_impl.this.AV54Ancho = GXv_int11[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV55grm2 = GXv_decimal12[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV85barordlin2 = GXv_int13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85barordlin2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85barordlin2), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV85barordlin2), "ZZZ9")));
      AV86Col_Barordlin.clear();
      AV90Col_Procod.clear();
      AV87Col_Fascod.clear();
      AV88Col_FasDsc.clear();
      AV89Col_Maqcodbis.clear();
      AV82MetPieAnc = AV54Ancho ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82MetPieAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82MetPieAnc), 3, 0));
      AV83MetPieMtD = AV55grm2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83MetPieMtD", GXutil.ltrimstr( AV83MetPieMtD, 8, 2));
   }

   public void e1626L2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext14[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext14) ;
      AV6WWPContext = GXv_SdtWWPContext14[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = AV44TFBarNHdr ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = AV45TFBarNHdr_Sel ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = AV21TFProCod ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = AV22TFProCod_Sel ;
      AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin = AV23TFBarOrdLin ;
      AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to = AV24TFBarOrdLin_To ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = AV25TFFasCod ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = AV26TFFasCod_Sel ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = AV27TFFasDsc ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = AV28TFFasDsc_Sel ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = AV29TFMaqCodBis ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = AV30TFMaqCodBis_Sel ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = AV31TFBarFasKgm ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = AV32TFBarFasKgm_To ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = AV33TFBarFasMtr ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = AV34TFBarFasMtr_To ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = AV35TFBarTieRea ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = AV36TFBarTieRea_To ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = AV37TFBarFecRea ;
   }

   public void e1226L2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNHdr") == 0 )
         {
            AV44TFBarNHdr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFBarNHdr", AV44TFBarNHdr);
            AV45TFBarNHdr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarNHdr_Sel", AV45TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ProCod") == 0 )
         {
            AV21TFProCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFProCod", AV21TFProCod);
            AV22TFProCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFProCod_Sel", AV22TFProCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarOrdLin") == 0 )
         {
            AV23TFBarOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFBarOrdLin), 4, 0));
            AV24TFBarOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCod") == 0 )
         {
            AV25TFFasCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFFasCod", AV25TFFasCod);
            AV26TFFasCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasCod_Sel", AV26TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDsc") == 0 )
         {
            AV27TFFasDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasDsc", AV27TFFasDsc);
            AV28TFFasDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFasDsc_Sel", AV28TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "MaqCodBis") == 0 )
         {
            AV29TFMaqCodBis = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMaqCodBis", AV29TFMaqCodBis);
            AV30TFMaqCodBis_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMaqCodBis_Sel", AV30TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasKgm") == 0 )
         {
            AV31TFBarFasKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarFasKgm", GXutil.ltrimstr( AV31TFBarFasKgm, 9, 2));
            AV32TFBarFasKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarFasKgm_To", GXutil.ltrimstr( AV32TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFasMtr") == 0 )
         {
            AV33TFBarFasMtr = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarFasMtr", GXutil.ltrimstr( AV33TFBarFasMtr, 9, 2));
            AV34TFBarFasMtr_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarFasMtr_To", GXutil.ltrimstr( AV34TFBarFasMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarTieRea") == 0 )
         {
            AV35TFBarTieRea = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarTieRea", GXutil.ltrimstr( AV35TFBarTieRea, 5, 2));
            AV36TFBarTieRea_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarTieRea_To", GXutil.ltrimstr( AV36TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecRea") == 0 )
         {
            AV37TFBarFecRea = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarFecRea", localUtil.format(AV37TFBarFecRea, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1726L2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV95Seleccionar = false ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV95Seleccionar);
      AV91i = (short)(1) ;
      while ( AV91i <= AV90Col_Procod.size() )
      {
         if ( ( GXutil.strcmp((String)AV90Col_Procod.elementAt(-1+AV91i), A758ProCod) == 0 ) && ( ((Number) AV86Col_Barordlin.elementAt(-1+AV91i)).shortValue() == A194BarOrdLin ) )
         {
            AV95Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV95Seleccionar);
            if (true) break;
         }
         AV91i = (short)(AV91i+1) ;
      }
      if ( AV101Flag == 1 )
      {
         if ( A194BarOrdLin == AV85barordlin2 )
         {
            AV86Col_Barordlin.add((short)(A194BarOrdLin), 0);
            AV90Col_Procod.add(A758ProCod, 0);
            AV87Col_Fascod.add(A457FasCod, 0);
            AV88Col_FasDsc.add(A460FasDsc, 0);
            AV89Col_Maqcodbis.add(A603MaqCodBis, 0);
            AV95Seleccionar = true ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV95Seleccionar);
            AV101Flag = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101Flag", GXutil.str( AV101Flag, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Flag), "9")));
         }
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(71) ;
      }
      sendrow_712( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_71_Refreshing )
      {
         httpContext.doAjaxLoad(71, GridRow);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV86Col_Barordlin", AV86Col_Barordlin);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV90Col_Procod", AV90Col_Procod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV87Col_Fascod", AV87Col_Fascod);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88Col_FasDsc", AV88Col_FasDsc);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV89Col_Maqcodbis", AV89Col_Maqcodbis);
   }

   public void e1326L2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1426L2( )
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

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      if ( ( ( AV60NumPzsFs == 1 ) ) || ( ( AV61NumPzsFs2 == 1 ) ) )
      {
         GXv_char4[0] = AV46emprcod ;
         GXv_int10[0] = AV50BarCod ;
         GXv_int8[0] = AV51BarCodReo ;
         GXv_char3[0] = AV47BarCodPar ;
         GXv_char2[0] = AV48Procod ;
         GXv_int13[0] = AV84barordlin ;
         GXv_int15[0] = AV62Num_pz ;
         new app.pnumpzsfs(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_char3, GXv_char2, GXv_int13, GXv_int15) ;
         mantenimientorollos_ins_pieza_impl.this.AV46emprcod = GXv_char4[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV50BarCod = GXv_int10[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV51BarCodReo = GXv_int8[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV47BarCodPar = GXv_char3[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV48Procod = GXv_char2[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV84barordlin = GXv_int13[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV62Num_pz = GXv_int15[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46emprcod", AV46emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV50BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodReo", GXutil.str( AV51BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47BarCodPar", AV47BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV48Procod", AV48Procod);
         httpContext.ajax_rsp_assign_attri("", false, "AV84barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84barordlin), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62Num_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Num_pz), 5, 0));
         AV64BarPiecod = GXutil.padl( GXutil.trim( GXutil.str( AV84barordlin, 4, 0)), (short)(4), "0") + GXutil.padl( GXutil.trim( GXutil.str( AV62Num_pz, 5, 0)), (short)(5), "0") ;
      }
      else
      {
         GXv_char4[0] = AV46emprcod ;
         GXv_int15[0] = AV50BarCod ;
         GXv_int8[0] = AV51BarCodReo ;
         GXv_char3[0] = AV47BarCodPar ;
         GXv_int10[0] = AV62Num_pz ;
         new app.pnumrol(remoteHandle, context).execute( GXv_char4, GXv_int15, GXv_int8, GXv_char3, GXv_int10) ;
         mantenimientorollos_ins_pieza_impl.this.AV46emprcod = GXv_char4[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV50BarCod = GXv_int15[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV51BarCodReo = GXv_int8[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV47BarCodPar = GXv_char3[0] ;
         mantenimientorollos_ins_pieza_impl.this.AV62Num_pz = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46emprcod", AV46emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV50BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodReo", GXutil.str( AV51BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV47BarCodPar", AV47BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV62Num_pz", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62Num_pz), 5, 0));
         AV64BarPiecod = GXutil.padl( GXutil.trim( GXutil.str( AV62Num_pz, 8, 0)), (short)(5), "0") ;
      }
      AV59ancho2 = DecimalUtil.doubleToDec(AV82MetPieAnc/ (double) (100)) ;
      AV58BarPieMet = AV81MetPiemet ;
      AV55grm2 = AV83MetPieMtD ;
      AV57BarPieKil = (AV83MetPieMtD.multiply(AV59ancho2)).multiply(AV58BarPieMet).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      if ( AV63Moda21 == 1 )
      {
         AV58BarPieMet = AV58BarPieMet.subtract(((AV58BarPieMet.multiply(AV66Const)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         AV57BarPieKil = ((AV55grm2.multiply(AV59ancho2)).multiply(AV58BarPieMet).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
      }
      AV68Lecfec = GXutil.today( ) ;
      AV69Barpieanc = AV82MetPieAnc ;
      AV74MetPieobs = AV46emprcod + AV94MaqCodBis + localUtil.dtoc( AV68Lecfec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + GXutil.str( AV84barordlin, 8, 0) ;
      AV70BarPieobs = " " ;
      AV71MetPieId = " " ;
      AV72Calidad = (byte)(((GXutil.strcmp(AV73MetPieDCP, httpContext.getMessage( "S", ""))==0) ? 1 : 0)) ;
      GXv_int15[0] = AV50BarCod ;
      GXv_int8[0] = AV51BarCodReo ;
      GXv_char4[0] = AV47BarCodPar ;
      GXv_char3[0] = AV64BarPiecod ;
      GXv_decimal12[0] = AV58BarPieMet ;
      GXv_decimal16[0] = AV57BarPieKil ;
      GXv_int13[0] = AV69Barpieanc ;
      GXv_char2[0] = AV43Station ;
      GXv_char17[0] = AV74MetPieobs ;
      GXv_int10[0] = AV77Albreccod ;
      GXv_char18[0] = AV70BarPieobs ;
      GXv_char19[0] = AV71MetPieId ;
      GXv_int20[0] = (byte)(0) ;
      GXv_char21[0] = " " ;
      GXv_char22[0] = " " ;
      GXv_decimal23[0] = AV83MetPieMtD ;
      GXv_char24[0] = AV76FasCod ;
      GXv_char25[0] = AV75FasDsc ;
      GXv_date26[0] = AV68Lecfec ;
      GXv_int27[0] = AV78OpeCod ;
      GXv_int28[0] = AV79Hisprotur ;
      GXv_int11[0] = (short)(0) ;
      GXv_char29[0] = AV80MetPieLoc ;
      GXv_int30[0] = AV72Calidad ;
      new app.pcosi00(remoteHandle, context).execute( AV46emprcod, GXv_int15, GXv_int8, GXv_char4, GXv_char3, GXv_decimal12, GXv_decimal16, GXv_int13, GXv_char2, GXv_char17, GXv_int10, GXv_char18, GXv_char19, GXv_int20, GXv_char21, GXv_char22, GXv_decimal23, GXv_char24, GXv_char25, GXv_date26, GXv_int27, GXv_int28, GXv_int11, GXv_char29, GXv_int30) ;
      mantenimientorollos_ins_pieza_impl.this.AV50BarCod = GXv_int15[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV51BarCodReo = GXv_int8[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV47BarCodPar = GXv_char4[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV64BarPiecod = GXv_char3[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV58BarPieMet = GXv_decimal12[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV57BarPieKil = GXv_decimal16[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV69Barpieanc = GXv_int13[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV43Station = GXv_char2[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV74MetPieobs = GXv_char17[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV77Albreccod = GXv_int10[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV70BarPieobs = GXv_char18[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV71MetPieId = GXv_char19[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV83MetPieMtD = GXv_decimal23[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV76FasCod = GXv_char24[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV75FasDsc = GXv_char25[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV68Lecfec = GXv_date26[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV78OpeCod = GXv_int27[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV79Hisprotur = GXv_int28[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV80MetPieLoc = GXv_char29[0] ;
      mantenimientorollos_ins_pieza_impl.this.AV72Calidad = GXv_int30[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodReo", GXutil.str( AV51BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarCodPar", AV47BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV43Station", AV43Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV77Albreccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Albreccod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV83MetPieMtD", GXutil.ltrimstr( AV83MetPieMtD, 8, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV76FasCod", AV76FasCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV75FasDsc", AV75FasDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV78OpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78OpeCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV79Hisprotur", GXutil.str( AV79Hisprotur, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV80MetPieLoc", AV80MetPieLoc);
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV104Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV104Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV104Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV124GXV1 = 1 ;
      while ( AV124GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV124GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR") == 0 )
         {
            AV44TFBarNHdr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFBarNHdr", AV44TFBarNHdr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNHDR_SEL") == 0 )
         {
            AV45TFBarNHdr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarNHdr_Sel", AV45TFBarNHdr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD") == 0 )
         {
            AV21TFProCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFProCod", AV21TFProCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPROCOD_SEL") == 0 )
         {
            AV22TFProCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFProCod_Sel", AV22TFProCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARORDLIN") == 0 )
         {
            AV23TFBarOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFBarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFBarOrdLin), 4, 0));
            AV24TFBarOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFBarOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFBarOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD") == 0 )
         {
            AV25TFFasCod = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFFasCod", AV25TFFasCod);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCOD_SEL") == 0 )
         {
            AV26TFFasCod_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFFasCod_Sel", AV26TFFasCod_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC") == 0 )
         {
            AV27TFFasDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFFasDsc", AV27TFFasDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSC_SEL") == 0 )
         {
            AV28TFFasDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFFasDsc_Sel", AV28TFFasDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS") == 0 )
         {
            AV29TFMaqCodBis = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFMaqCodBis", AV29TFMaqCodBis);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFMAQCODBIS_SEL") == 0 )
         {
            AV30TFMaqCodBis_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFMaqCodBis_Sel", AV30TFMaqCodBis_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASKGM") == 0 )
         {
            AV31TFBarFasKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarFasKgm", GXutil.ltrimstr( AV31TFBarFasKgm, 9, 2));
            AV32TFBarFasKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarFasKgm_To", GXutil.ltrimstr( AV32TFBarFasKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFASMTR") == 0 )
         {
            AV33TFBarFasMtr = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarFasMtr", GXutil.ltrimstr( AV33TFBarFasMtr, 9, 2));
            AV34TFBarFasMtr_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarFasMtr_To", GXutil.ltrimstr( AV34TFBarFasMtr_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARTIEREA") == 0 )
         {
            AV35TFBarTieRea = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarTieRea", GXutil.ltrimstr( AV35TFBarTieRea, 5, 2));
            AV36TFBarTieRea_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarTieRea_To", GXutil.ltrimstr( AV36TFBarTieRea_To, 5, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECREA") == 0 )
         {
            AV37TFBarFecRea = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarFecRea", localUtil.format(AV37TFBarFecRea, "99/99/99"));
         }
         AV124GXV1 = (int)(AV124GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char29[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFBarNHdr_Sel)==0), AV45TFBarNHdr_Sel, GXv_char29) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char1 = GXv_char29[0] ;
      GXt_char31 = "" ;
      GXv_char25[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFProCod_Sel)==0), AV22TFProCod_Sel, GXv_char25) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char31 = GXv_char25[0] ;
      GXt_char32 = "" ;
      GXv_char24[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFFasCod_Sel)==0), AV26TFFasCod_Sel, GXv_char24) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char32 = GXv_char24[0] ;
      GXt_char33 = "" ;
      GXv_char22[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFFasDsc_Sel)==0), AV28TFFasDsc_Sel, GXv_char22) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char33 = GXv_char22[0] ;
      GXt_char34 = "" ;
      GXv_char21[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFMaqCodBis_Sel)==0), AV30TFMaqCodBis_Sel, GXv_char21) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char34 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char31+"||"+GXt_char32+"|"+GXt_char33+"|"+GXt_char34+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char34 = "" ;
      GXv_char29[0] = GXt_char34 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFBarNHdr)==0), AV44TFBarNHdr, GXv_char29) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char34 = GXv_char29[0] ;
      GXt_char33 = "" ;
      GXv_char25[0] = GXt_char33 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFProCod)==0), AV21TFProCod, GXv_char25) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char33 = GXv_char25[0] ;
      GXt_char32 = "" ;
      GXv_char24[0] = GXt_char32 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFFasCod)==0), AV25TFFasCod, GXv_char24) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char32 = GXv_char24[0] ;
      GXt_char31 = "" ;
      GXv_char22[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFFasDsc)==0), AV27TFFasDsc, GXv_char22) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char31 = GXv_char22[0] ;
      GXt_char1 = "" ;
      GXv_char21[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFMaqCodBis)==0), AV29TFMaqCodBis, GXv_char21) ;
      mantenimientorollos_ins_pieza_impl.this.GXt_char1 = GXv_char21[0] ;
      Ddo_grid_Filteredtext_set = GXt_char34+"|"+GXt_char33+"|"+((0==AV23TFBarOrdLin) ? "" : GXutil.str( AV23TFBarOrdLin, 4, 0))+"|"+GXt_char32+"|"+GXt_char31+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarFasKgm)==0) ? "" : GXutil.str( AV31TFBarFasKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarFasMtr)==0) ? "" : GXutil.str( AV33TFBarFasMtr, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0) ? "" : GXutil.str( AV35TFBarTieRea, 5, 2))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFBarFecRea)) ? "" : localUtil.dtoc( AV37TFBarFecRea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV24TFBarOrdLin_To) ? "" : GXutil.str( AV24TFBarOrdLin_To, 4, 0))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarFasKgm_To)==0) ? "" : GXutil.str( AV32TFBarFasKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarFasMtr_To)==0) ? "" : GXutil.str( AV34TFBarFasMtr_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0) ? "" : GXutil.str( AV36TFBarTieRea_To, 5, 2))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV104Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARNHDR", "", !(GXutil.strcmp("", AV44TFBarNHdr)==0), (short)(0), AV44TFBarNHdr, "", !(GXutil.strcmp("", AV45TFBarNHdr_Sel)==0), AV45TFBarNHdr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFPROCOD", "", !(GXutil.strcmp("", AV21TFProCod)==0), (short)(0), AV21TFProCod, "", !(GXutil.strcmp("", AV22TFProCod_Sel)==0), AV22TFProCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARORDLIN", "", !((0==AV23TFBarOrdLin)&&(0==AV24TFBarOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV23TFBarOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV24TFBarOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFFASCOD", "", !(GXutil.strcmp("", AV25TFFasCod)==0), (short)(0), AV25TFFasCod, "", !(GXutil.strcmp("", AV26TFFasCod_Sel)==0), AV26TFFasCod_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFFASDSC", "", !(GXutil.strcmp("", AV27TFFasDsc)==0), (short)(0), AV27TFFasDsc, "", !(GXutil.strcmp("", AV28TFFasDsc_Sel)==0), AV28TFFasDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFMAQCODBIS", "", !(GXutil.strcmp("", AV29TFMaqCodBis)==0), (short)(0), AV29TFMaqCodBis, "", !(GXutil.strcmp("", AV30TFMaqCodBis_Sel)==0), AV30TFMaqCodBis_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARFASKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFBarFasKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFBarFasKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV31TFBarFasKgm, 9, 2)), GXutil.trim( GXutil.str( AV32TFBarFasKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARFASMTR", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFBarFasMtr)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV34TFBarFasMtr_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV33TFBarFasMtr, 9, 2)), GXutil.trim( GXutil.str( AV34TFBarFasMtr_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARTIEREA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV35TFBarTieRea)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV36TFBarTieRea_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV35TFBarTieRea, 5, 2)), GXutil.trim( GXutil.str( AV36TFBarTieRea_To, 5, 2))) ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      GXv_SdtWWPGridState35[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState35, "TFBARFECREA", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV37TFBarFecRea)), (short)(0), GXutil.trim( localUtil.dtoc( AV37TFBarFecRea, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState35[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV104Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV104Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TBARFAS" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_97_26L2( boolean wbgen )
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
         wb_table2_97_26L2e( true) ;
      }
      else
      {
         wb_table2_97_26L2e( false) ;
      }
   }

   public void wb_table1_32_26L2( boolean wbgen )
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
         wb_table1_32_26L2e( true) ;
      }
      else
      {
         wb_table1_32_26L2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV46emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46emprcod", AV46emprcod);
      AV50BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50BarCod), 8, 0));
      AV51BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51BarCodReo", GXutil.str( AV51BarCodReo, 1, 0));
      AV47BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarCodPar", AV47BarCodPar);
      AV101Flag = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101Flag", GXutil.str( AV101Flag, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101Flag), "9")));
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
      pa26L2( ) ;
      ws26L2( ) ;
      we26L2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615022", true, true);
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
      httpContext.AddJavascriptSource("pedidosclientesindetalle/mantenimientorollos_ins_pieza.js", "?20268211615022", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_712( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_71_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_71_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_71_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_71_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_71_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_71_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_71_idx ;
      edtBarFasKgm_Internalname = "BARFASKGM_"+sGXsfl_71_idx ;
      edtBarFasMtr_Internalname = "BARFASMTR_"+sGXsfl_71_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_71_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_71_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_71_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_71_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_71_idx ;
   }

   public void subsflControlProps_fel_712( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_71_fel_idx );
      edtBarNHdr_Internalname = "BARNHDR_"+sGXsfl_71_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_71_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_71_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_71_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_71_fel_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_71_fel_idx ;
      edtBarFasKgm_Internalname = "BARFASKGM_"+sGXsfl_71_fel_idx ;
      edtBarFasMtr_Internalname = "BARFASMTR_"+sGXsfl_71_fel_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_71_fel_idx ;
      edtBarFecRea_Internalname = "BARFECREA_"+sGXsfl_71_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_71_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_71_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_71_fel_idx ;
   }

   public void sendrow_712( )
   {
      subsflControlProps_712( ) ;
      wb26L0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_71_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_71_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_71_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'',false,'"+sGXsfl_71_idx+"',71)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_71_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_71_Refreshing);
         chkavSeleccionar.setCheckedValue( "false" );
         AV95Seleccionar = GXutil.strtobool( GXutil.booltostr( AV95Seleccionar)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV95Seleccionar);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),GXutil.booltostr( AV95Seleccionar),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,72);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNHdr_Internalname,GXutil.rtrim( A13696BarNHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecRea_Internalname,localUtil.format(A160BarFecRea, "99/99/99"),localUtil.format( A160BarFecRea, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes26L2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_71_idx = ((subGrid_Islastpage==1)&&(nGXsfl_71_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_712( ) ;
      }
      /* End function sendrow_712 */
   }

   public void startgridcontrol71( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"71\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "KIlos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tiempo Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Fin", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV95Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13696BarNHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A160BarFecRea, "99/99/99"));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavFlag_Internalname = "vFLAG" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavMetpiemet_Internalname = "vMETPIEMET" ;
      edtavMetpieanc_Internalname = "vMETPIEANC" ;
      edtavMetpiemtd_Internalname = "vMETPIEMTD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
      edtBarNHdr_Internalname = "BARNHDR" ;
      edtProCod_Internalname = "PROCOD" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      edtBarFasKgm_Internalname = "BARFASKGM" ;
      edtBarFasMtr_Internalname = "BARFASMTR" ;
      edtBarTieRea_Internalname = "BARTIEREA" ;
      edtBarFecRea_Internalname = "BARFECREA" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_barfecreaauxdate_Internalname = "vDDO_BARFECREAAUXDATE" ;
      divDdo_barfecreaauxdates_Internalname = "DDO_BARFECREAAUXDATES" ;
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
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtBarFecRea_Jsonclick = "" ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarFasMtr_Jsonclick = "" ;
      edtBarFasKgm_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtBarNHdr_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecreaauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavMetpiemtd_Jsonclick = "" ;
      edtavMetpiemtd_Enabled = 1 ;
      edtavMetpieanc_Jsonclick = "" ;
      edtavMetpieanc_Enabled = 1 ;
      edtavMetpiemet_Jsonclick = "" ;
      edtavMetpiemet_Enabled = 1 ;
      edtavFlag_Jsonclick = "" ;
      edtavFlag_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma la seleccion?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_grid_Datalistproc = "PedidosClienteSinDetalle.MantenimientoRollos_ins_PiezaGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic|Dynamic|Dynamic||||" ;
      Ddo_grid_Includedatalist = "T|T||T|T|T||||" ;
      Ddo_grid_Filterisrange = "||T||||T|T|T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character|Character|Character|Numeric|Numeric|Numeric|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "|T|T|T|T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "|2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "1:BarNHdr|2:ProCod|3:BarOrdLin|4:FasCod|5:FasDsc|6:MaqCodBis|7:BarFasKgm|8:BarFasMtr|9:BarTieRea|10:BarFecRea" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Datos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Fases de Produccion HDR", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECCIONAR_" + sGXsfl_71_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_71_Refreshing);
      chkavSeleccionar.setCheckedValue( "false" );
      AV95Seleccionar = GXutil.strtobool( GXutil.booltostr( AV95Seleccionar)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV95Seleccionar);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV44TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV45TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV21TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV22TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV23TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV24TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV25TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV26TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV27TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV28TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV29TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV30TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV31TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV32TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV33TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV34TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true},{av:'AV85barordlin2',fld:'vBARORDLIN2',pic:'ZZZ9',hsh:true},{av:'AV60NumPzsFs',fld:'vNUMPZSFS',pic:'ZZZ9',hsh:true},{av:'AV61NumPzsFs2',fld:'vNUMPZSFS2',pic:'ZZZ9',hsh:true},{av:'AV63Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV66Const',fld:'vCONST',pic:'ZZ9.99',hsh:true},{av:'AV73MetPieDCP',fld:'vMETPIEDCP',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1226L2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV44TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV45TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV21TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV22TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV23TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV24TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV25TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV26TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV27TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV28TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV29TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV30TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV31TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV32TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV33TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV34TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true},{av:'AV85barordlin2',fld:'vBARORDLIN2',pic:'ZZZ9',hsh:true},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV60NumPzsFs',fld:'vNUMPZSFS',pic:'ZZZ9',hsh:true},{av:'AV61NumPzsFs2',fld:'vNUMPZSFS2',pic:'ZZZ9',hsh:true},{av:'AV63Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV66Const',fld:'vCONST',pic:'ZZ9.99',hsh:true},{av:'AV73MetPieDCP',fld:'vMETPIEDCP',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV37TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV33TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV34TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV31TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV32TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV29TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV30TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV27TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV28TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV25TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV26TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV23TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV24TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV21TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV22TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV44TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV45TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1726L2',iparms:[{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:'',hsh:true},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true},{av:'AV85barordlin2',fld:'vBARORDLIN2',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!',hsh:true},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'A603MaqCodBis',fld:'MAQCODBIS',pic:'',hsh:true},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV95Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1126L1',iparms:[{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV95Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'AV81MetPiemet',fld:'vMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV48Procod',fld:'vPROCOD',pic:''},{av:'AV84barordlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV76FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV75FasDsc',fld:'vFASDSC',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV48Procod',fld:'vPROCOD',pic:''},{av:'AV84barordlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV76FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV75FasDsc',fld:'vFASDSC',pic:''},{av:'AV94MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1326L2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV60NumPzsFs',fld:'vNUMPZSFS',pic:'ZZZ9',hsh:true},{av:'AV61NumPzsFs2',fld:'vNUMPZSFS2',pic:'ZZZ9',hsh:true},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV48Procod',fld:'vPROCOD',pic:''},{av:'AV84barordlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV62Num_pz',fld:'vNUM_PZ',pic:'ZZZZ9'},{av:'AV82MetPieAnc',fld:'vMETPIEANC',pic:'ZZ9'},{av:'AV81MetPiemet',fld:'vMETPIEMET',pic:'ZZZZZ9.99'},{av:'AV83MetPieMtD',fld:'vMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV63Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV66Const',fld:'vCONST',pic:'ZZ9.99',hsh:true},{av:'AV94MaqCodBis',fld:'vMAQCODBIS',pic:''},{av:'AV73MetPieDCP',fld:'vMETPIEDCP',pic:'@!',hsh:true},{av:'AV43Station',fld:'vSTATION',pic:''},{av:'AV77Albreccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV76FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV75FasDsc',fld:'vFASDSC',pic:''},{av:'AV78OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV79Hisprotur',fld:'vHISPROTUR',pic:'9'},{av:'AV80MetPieLoc',fld:'vMETPIELOC',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV84barordlin',fld:'vBARORDLIN',pic:'ZZZ9'},{av:'AV48Procod',fld:'vPROCOD',pic:''},{av:'AV62Num_pz',fld:'vNUM_PZ',pic:'ZZZZ9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV80MetPieLoc',fld:'vMETPIELOC',pic:''},{av:'AV79Hisprotur',fld:'vHISPROTUR',pic:'9'},{av:'AV78OpeCod',fld:'vOPECOD',pic:'ZZZZZ9'},{av:'AV75FasDsc',fld:'vFASDSC',pic:''},{av:'AV76FasCod',fld:'vFASCOD',pic:'@!'},{av:'AV83MetPieMtD',fld:'vMETPIEMTD',pic:'ZZZZ9.99'},{av:'AV77Albreccod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV43Station',fld:'vSTATION',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1426L2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true},{av:'AV85barordlin2',fld:'vBARORDLIN2',pic:'ZZZ9',hsh:true},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV60NumPzsFs',fld:'vNUMPZSFS',pic:'ZZZ9',hsh:true},{av:'AV61NumPzsFs2',fld:'vNUMPZSFS2',pic:'ZZZ9',hsh:true},{av:'AV63Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV66Const',fld:'vCONST',pic:'ZZ9.99',hsh:true},{av:'AV73MetPieDCP',fld:'vMETPIEDCP',pic:'@!',hsh:true},{av:'AV44TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV45TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV21TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV22TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV23TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV24TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV25TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV26TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV27TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV28TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV29TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV30TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV31TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV32TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV33TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV34TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true},{av:'AV85barordlin2',fld:'vBARORDLIN2',pic:'ZZZ9',hsh:true},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV60NumPzsFs',fld:'vNUMPZSFS',pic:'ZZZ9',hsh:true},{av:'AV61NumPzsFs2',fld:'vNUMPZSFS2',pic:'ZZZ9',hsh:true},{av:'AV63Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV66Const',fld:'vCONST',pic:'ZZ9.99',hsh:true},{av:'AV73MetPieDCP',fld:'vMETPIEDCP',pic:'@!',hsh:true},{av:'AV44TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV45TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV21TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV22TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV23TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV24TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV25TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV26TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV27TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV28TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV29TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV30TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV31TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV32TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV33TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV34TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true},{av:'AV85barordlin2',fld:'vBARORDLIN2',pic:'ZZZ9',hsh:true},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV60NumPzsFs',fld:'vNUMPZSFS',pic:'ZZZ9',hsh:true},{av:'AV61NumPzsFs2',fld:'vNUMPZSFS2',pic:'ZZZ9',hsh:true},{av:'AV63Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV66Const',fld:'vCONST',pic:'ZZ9.99',hsh:true},{av:'AV73MetPieDCP',fld:'vMETPIEDCP',pic:'@!',hsh:true},{av:'AV44TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV45TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV21TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV22TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV23TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV24TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV25TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV26TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV27TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV28TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV29TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV30TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV31TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV32TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV33TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV34TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV46emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV51BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV47BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV90Col_Procod',fld:'vCOL_PROCOD',pic:''},{av:'AV86Col_Barordlin',fld:'vCOL_BARORDLIN',pic:''},{av:'AV101Flag',fld:'vFLAG',pic:'9',hsh:true},{av:'AV85barordlin2',fld:'vBARORDLIN2',pic:'ZZZ9',hsh:true},{av:'AV87Col_Fascod',fld:'vCOL_FASCOD',pic:''},{av:'AV88Col_FasDsc',fld:'vCOL_FASDSC',pic:''},{av:'AV89Col_Maqcodbis',fld:'vCOL_MAQCODBIS',pic:''},{av:'AV60NumPzsFs',fld:'vNUMPZSFS',pic:'ZZZ9',hsh:true},{av:'AV61NumPzsFs2',fld:'vNUMPZSFS2',pic:'ZZZ9',hsh:true},{av:'AV63Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV66Const',fld:'vCONST',pic:'ZZ9.99',hsh:true},{av:'AV73MetPieDCP',fld:'vMETPIEDCP',pic:'@!',hsh:true},{av:'AV44TFBarNHdr',fld:'vTFBARNHDR',pic:''},{av:'AV45TFBarNHdr_Sel',fld:'vTFBARNHDR_SEL',pic:''},{av:'AV21TFProCod',fld:'vTFPROCOD',pic:''},{av:'AV22TFProCod_Sel',fld:'vTFPROCOD_SEL',pic:''},{av:'AV23TFBarOrdLin',fld:'vTFBARORDLIN',pic:'ZZZ9'},{av:'AV24TFBarOrdLin_To',fld:'vTFBARORDLIN_TO',pic:'ZZZ9'},{av:'AV25TFFasCod',fld:'vTFFASCOD',pic:'@!'},{av:'AV26TFFasCod_Sel',fld:'vTFFASCOD_SEL',pic:'@!'},{av:'AV27TFFasDsc',fld:'vTFFASDSC',pic:''},{av:'AV28TFFasDsc_Sel',fld:'vTFFASDSC_SEL',pic:''},{av:'AV29TFMaqCodBis',fld:'vTFMAQCODBIS',pic:''},{av:'AV30TFMaqCodBis_Sel',fld:'vTFMAQCODBIS_SEL',pic:''},{av:'AV31TFBarFasKgm',fld:'vTFBARFASKGM',pic:'ZZZZZ9.99'},{av:'AV32TFBarFasKgm_To',fld:'vTFBARFASKGM_TO',pic:'ZZZZZ9.99'},{av:'AV33TFBarFasMtr',fld:'vTFBARFASMTR',pic:'ZZZZZ9.99'},{av:'AV34TFBarFasMtr_To',fld:'vTFBARFASMTR_TO',pic:'ZZZZZ9.99'},{av:'AV35TFBarTieRea',fld:'vTFBARTIEREA',pic:'Z9.99'},{av:'AV36TFBarTieRea_To',fld:'vTFBARTIEREA_TO',pic:'Z9.99'},{av:'AV37TFBarFecRea',fld:'vTFBARFECREA',pic:''},{av:'AV104Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
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
      wcpOAV46emprcod = "" ;
      wcpOAV47BarCodPar = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV46emprcod = "" ;
      AV47BarCodPar = "" ;
      AV44TFBarNHdr = "" ;
      AV45TFBarNHdr_Sel = "" ;
      AV21TFProCod = "" ;
      AV22TFProCod_Sel = "" ;
      AV25TFFasCod = "" ;
      AV26TFFasCod_Sel = "" ;
      AV27TFFasDsc = "" ;
      AV28TFFasDsc_Sel = "" ;
      AV29TFMaqCodBis = "" ;
      AV30TFMaqCodBis_Sel = "" ;
      AV31TFBarFasKgm = DecimalUtil.ZERO ;
      AV32TFBarFasKgm_To = DecimalUtil.ZERO ;
      AV33TFBarFasMtr = DecimalUtil.ZERO ;
      AV34TFBarFasMtr_To = DecimalUtil.ZERO ;
      AV35TFBarTieRea = DecimalUtil.ZERO ;
      AV36TFBarTieRea_To = DecimalUtil.ZERO ;
      AV37TFBarFecRea = GXutil.nullDate() ;
      AV104Pgmname = "" ;
      AV90Col_Procod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV86Col_Barordlin = new GXSimpleCollection<Short>(Short.class, "internal", "");
      AV87Col_Fascod = new GXSimpleCollection<String>(String.class, "internal", "");
      AV88Col_FasDsc = new GXSimpleCollection<String>(String.class, "internal", "");
      AV89Col_Maqcodbis = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66Const = DecimalUtil.ZERO ;
      AV73MetPieDCP = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV48Procod = "" ;
      AV76FasCod = "" ;
      AV75FasDsc = "" ;
      AV94MaqCodBis = "" ;
      AV43Station = "" ;
      AV80MetPieLoc = "" ;
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
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV81MetPiemet = DecimalUtil.ZERO ;
      AV83MetPieMtD = DecimalUtil.ZERO ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV38DDO_BarFecReaAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = "" ;
      AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel = "" ;
      AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = "" ;
      AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel = "" ;
      AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = "" ;
      AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel = "" ;
      AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = "" ;
      AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel = "" ;
      AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = "" ;
      AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel = "" ;
      AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm = DecimalUtil.ZERO ;
      AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to = DecimalUtil.ZERO ;
      AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr = DecimalUtil.ZERO ;
      AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to = DecimalUtil.ZERO ;
      AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea = DecimalUtil.ZERO ;
      AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to = DecimalUtil.ZERO ;
      AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea = GXutil.nullDate() ;
      A13696BarNHdr = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      scmdbuf = "" ;
      lV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr = "" ;
      lV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod = "" ;
      lV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod = "" ;
      lV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc = "" ;
      lV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis = "" ;
      A396EmprCod = "" ;
      H026L2_A396EmprCod = new String[] {""} ;
      H026L2_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      H026L2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026L2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026L2_n3838BarFasMtr = new boolean[] {false} ;
      H026L2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H026L2_n3837BarFasKgm = new boolean[] {false} ;
      H026L2_A603MaqCodBis = new String[] {""} ;
      H026L2_A460FasDsc = new String[] {""} ;
      H026L2_A457FasCod = new String[] {""} ;
      H026L2_A194BarOrdLin = new short[1] ;
      H026L2_A758ProCod = new String[] {""} ;
      H026L2_A130BarCodPar = new String[] {""} ;
      H026L2_A132BarCodReo = new byte[1] ;
      H026L2_A129BarCod = new int[1] ;
      H026L3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV52EmprNom = "" ;
      AV53UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV55grm2 = DecimalUtil.ZERO ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext14 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV64BarPiecod = "" ;
      AV59ancho2 = DecimalUtil.ZERO ;
      AV58BarPieMet = DecimalUtil.ZERO ;
      AV57BarPieKil = DecimalUtil.ZERO ;
      AV68Lecfec = GXutil.nullDate() ;
      AV74MetPieobs = "" ;
      AV70BarPieobs = "" ;
      AV71MetPieId = "" ;
      GXv_int15 = new int[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_int13 = new short[1] ;
      GXv_char2 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_int20 = new byte[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      GXv_date26 = new java.util.Date[1] ;
      GXv_int27 = new int[1] ;
      GXv_int28 = new byte[1] ;
      GXv_int11 = new short[1] ;
      GXv_int30 = new byte[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char34 = "" ;
      GXv_char29 = new String[1] ;
      GXt_char33 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char32 = "" ;
      GXv_char24 = new String[1] ;
      GXt_char31 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char21 = new String[1] ;
      GXv_SdtWWPGridState35 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidosclientesindetalle.mantenimientorollos_ins_pieza__default(),
         new Object[] {
             new Object[] {
            H026L2_A396EmprCod, H026L2_A160BarFecRea, H026L2_A215BarTieRea, H026L2_A3838BarFasMtr, H026L2_n3838BarFasMtr, H026L2_A3837BarFasKgm, H026L2_n3837BarFasKgm, H026L2_A603MaqCodBis, H026L2_A460FasDsc, H026L2_A457FasCod,
            H026L2_A194BarOrdLin, H026L2_A758ProCod, H026L2_A130BarCodPar, H026L2_A132BarCodReo, H026L2_A129BarCod
            }
            , new Object[] {
            H026L3_AGRID_nRecordCount
            }
         }
      );
      AV104Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_ins_Pieza" ;
      /* GeneXus formulas. */
      AV104Pgmname = "PedidosClienteSinDetalle.MantenimientoRollos_ins_Pieza" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV51BarCodReo ;
   private byte wcpOAV101Flag ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV51BarCodReo ;
   private byte AV101Flag ;
   private byte gxajaxcallmode ;
   private byte AV79Hisprotur ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte AV72Calidad ;
   private byte GXv_int8[] ;
   private byte GXv_int20[] ;
   private byte GXv_int28[] ;
   private byte GXv_int30[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV23TFBarOrdLin ;
   private short AV24TFBarOrdLin_To ;
   private short AV12OrderedBy ;
   private short AV85barordlin2 ;
   private short AV60NumPzsFs ;
   private short AV61NumPzsFs2 ;
   private short AV63Moda21 ;
   private short AV84barordlin ;
   private short AV91i ;
   private short AV93lineas ;
   private short wbEnd ;
   private short wbStart ;
   private short AV82MetPieAnc ;
   private short AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ;
   private short AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV65Valcont ;
   private short AV54Ancho ;
   private short AV69Barpieanc ;
   private short GXv_int13[] ;
   private short GXv_int11[] ;
   private int wcpOAV50BarCod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_71 ;
   private int AV50BarCod ;
   private int nGXsfl_71_idx=1 ;
   private int AV62Num_pz ;
   private int AV77Albreccod ;
   private int AV78OpeCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavFlag_Enabled ;
   private int edtavMetpiemet_Enabled ;
   private int edtavMetpieanc_Enabled ;
   private int edtavMetpiemtd_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int9 ;
   private int GXv_int15[] ;
   private int GXv_int10[] ;
   private int GXv_int27[] ;
   private int AV124GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV31TFBarFasKgm ;
   private java.math.BigDecimal AV32TFBarFasKgm_To ;
   private java.math.BigDecimal AV33TFBarFasMtr ;
   private java.math.BigDecimal AV34TFBarFasMtr_To ;
   private java.math.BigDecimal AV35TFBarTieRea ;
   private java.math.BigDecimal AV36TFBarTieRea_To ;
   private java.math.BigDecimal AV66Const ;
   private java.math.BigDecimal AV81MetPiemet ;
   private java.math.BigDecimal AV83MetPieMtD ;
   private java.math.BigDecimal AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ;
   private java.math.BigDecimal AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ;
   private java.math.BigDecimal AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ;
   private java.math.BigDecimal AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ;
   private java.math.BigDecimal AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ;
   private java.math.BigDecimal AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal AV55grm2 ;
   private java.math.BigDecimal AV59ancho2 ;
   private java.math.BigDecimal AV58BarPieMet ;
   private java.math.BigDecimal AV57BarPieKil ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private String wcpOAV46emprcod ;
   private String wcpOAV47BarCodPar ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV46emprcod ;
   private String AV47BarCodPar ;
   private String sGXsfl_71_idx="0001" ;
   private String AV44TFBarNHdr ;
   private String AV45TFBarNHdr_Sel ;
   private String AV21TFProCod ;
   private String AV22TFProCod_Sel ;
   private String AV25TFFasCod ;
   private String AV26TFFasCod_Sel ;
   private String AV27TFFasDsc ;
   private String AV28TFFasDsc_Sel ;
   private String AV29TFMaqCodBis ;
   private String AV30TFMaqCodBis_Sel ;
   private String AV104Pgmname ;
   private String AV73MetPieDCP ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV48Procod ;
   private String AV76FasCod ;
   private String AV75FasDsc ;
   private String AV94MaqCodBis ;
   private String AV43Station ;
   private String AV80MetPieLoc ;
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
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavFlag_Internalname ;
   private String edtavFlag_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavMetpiemet_Internalname ;
   private String TempTags ;
   private String edtavMetpiemet_Jsonclick ;
   private String edtavMetpieanc_Internalname ;
   private String edtavMetpieanc_Jsonclick ;
   private String edtavMetpiemtd_Internalname ;
   private String edtavMetpiemtd_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_barfecreaauxdates_Internalname ;
   private String edtavDdo_barfecreaauxdate_Internalname ;
   private String edtavDdo_barfecreaauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ;
   private String AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ;
   private String AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ;
   private String AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ;
   private String AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ;
   private String AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ;
   private String AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ;
   private String AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ;
   private String AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ;
   private String AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ;
   private String A13696BarNHdr ;
   private String edtBarNHdr_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String edtBarFasKgm_Internalname ;
   private String edtBarFasMtr_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtBarFecRea_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String scmdbuf ;
   private String lV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ;
   private String lV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ;
   private String lV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ;
   private String lV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ;
   private String lV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV52EmprNom ;
   private String AV53UsurCod ;
   private String AV64BarPiecod ;
   private String AV70BarPieobs ;
   private String AV71MetPieId ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXt_char34 ;
   private String GXv_char29[] ;
   private String GXt_char33 ;
   private String GXv_char25[] ;
   private String GXt_char32 ;
   private String GXv_char24[] ;
   private String GXt_char31 ;
   private String GXv_char22[] ;
   private String GXt_char1 ;
   private String GXv_char21[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_71_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarNHdr_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtBarFasKgm_Jsonclick ;
   private String edtBarFasMtr_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtBarFecRea_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV37TFBarFecRea ;
   private java.util.Date AV38DDO_BarFecReaAuxDate ;
   private java.util.Date AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date AV68Lecfec ;
   private java.util.Date GXv_date26[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV95Seleccionar ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean bGXsfl_71_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV74MetPieobs ;
   private GXSimpleCollection<Short> AV86Col_Barordlin ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H026L2_A396EmprCod ;
   private java.util.Date[] H026L2_A160BarFecRea ;
   private java.math.BigDecimal[] H026L2_A215BarTieRea ;
   private java.math.BigDecimal[] H026L2_A3838BarFasMtr ;
   private boolean[] H026L2_n3838BarFasMtr ;
   private java.math.BigDecimal[] H026L2_A3837BarFasKgm ;
   private boolean[] H026L2_n3837BarFasKgm ;
   private String[] H026L2_A603MaqCodBis ;
   private String[] H026L2_A460FasDsc ;
   private String[] H026L2_A457FasCod ;
   private short[] H026L2_A194BarOrdLin ;
   private String[] H026L2_A758ProCod ;
   private String[] H026L2_A130BarCodPar ;
   private byte[] H026L2_A132BarCodReo ;
   private int[] H026L2_A129BarCod ;
   private long[] H026L3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV90Col_Procod ;
   private GXSimpleCollection<String> AV87Col_Fascod ;
   private GXSimpleCollection<String> AV88Col_FasDsc ;
   private GXSimpleCollection<String> AV89Col_Maqcodbis ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV39DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState35[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext14[] ;
}

final  class mantenimientorollos_ins_pieza__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H026L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                          String AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                          String AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                          String AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                          short AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ,
                                          short AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ,
                                          String AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                          String AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                          String AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                          String AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                          String AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                          String AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                          java.math.BigDecimal AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                          java.math.BigDecimal AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                          java.math.BigDecimal AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                          java.util.Date AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV46emprcod ,
                                          int AV50BarCod ,
                                          byte AV51BarCodReo ,
                                          String AV47BarCodPar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int36 = new byte[28];
      Object[] GXv_Object37 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.BarFecRea, T1.BarTieRea, T1.BarFasMtr, T1.BarFasKgm, T1.MaqCodBis, T2.FasDsc, T1.FasCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod" ;
      sFromString = " FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int36[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int36[7] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int36[8] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int36[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int36[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int36[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int36[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int36[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int36[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int36[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int36[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int36[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int36[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int36[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int36[22] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ProCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarOrdLin" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarOrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.FasDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.FasDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.MaqCodBis" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.MaqCodBis DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasKgm" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFasMtr" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFasMtr DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarTieRea" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarTieRea DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecRea" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecRea DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object37[0] = scmdbuf ;
      GXv_Object37[1] = GXv_int36 ;
      return GXv_Object37 ;
   }

   protected Object[] conditional_H026L3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel ,
                                          String AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr ,
                                          String AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel ,
                                          String AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod ,
                                          short AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin ,
                                          short AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to ,
                                          String AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel ,
                                          String AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod ,
                                          String AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel ,
                                          String AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc ,
                                          String AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel ,
                                          String AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis ,
                                          java.math.BigDecimal AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm ,
                                          java.math.BigDecimal AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to ,
                                          java.math.BigDecimal AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr ,
                                          java.math.BigDecimal AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to ,
                                          java.math.BigDecimal AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea ,
                                          java.math.BigDecimal AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to ,
                                          java.util.Date AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A758ProCod ,
                                          short A194BarOrdLin ,
                                          String A457FasCod ,
                                          String A460FasDsc ,
                                          String A603MaqCodBis ,
                                          java.math.BigDecimal A3837BarFasKgm ,
                                          java.math.BigDecimal A3838BarFasMtr ,
                                          java.math.BigDecimal A215BarTieRea ,
                                          java.util.Date A160BarFecRea ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV46emprcod ,
                                          int AV50BarCod ,
                                          byte AV51BarCodReo ,
                                          String AV47BarCodPar ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int38 = new byte[23];
      Object[] GXv_Object39 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ?)");
      if ( (GXutil.strcmp("", AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) && ( ! (GXutil.strcmp("", AV105Pedidosclientesindetalle_mantenimientorollos_ins_piezads_1_tfbarnhdr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Pedidosclientesindetalle_mantenimientorollos_ins_piezads_2_tfbarnhdr_sel)==0) )
      {
         addWhere(sWhereString, "(RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int38[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) && ( ! (GXutil.strcmp("", AV107Pedidosclientesindetalle_mantenimientorollos_ins_piezads_3_tfprocod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.ProCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Pedidosclientesindetalle_mantenimientorollos_ins_piezads_4_tfprocod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.ProCod = ?)");
      }
      else
      {
         GXv_int38[7] = (byte)(1) ;
      }
      if ( ! (0==AV109Pedidosclientesindetalle_mantenimientorollos_ins_piezads_5_tfbarordlin) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin >= ?)");
      }
      else
      {
         GXv_int38[8] = (byte)(1) ;
      }
      if ( ! (0==AV110Pedidosclientesindetalle_mantenimientorollos_ins_piezads_6_tfbarordlin_to) )
      {
         addWhere(sWhereString, "(T1.BarOrdLin <= ?)");
      }
      else
      {
         GXv_int38[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) && ( ! (GXutil.strcmp("", AV111Pedidosclientesindetalle_mantenimientorollos_ins_piezads_7_tffascod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Pedidosclientesindetalle_mantenimientorollos_ins_piezads_8_tffascod_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCod = ?)");
      }
      else
      {
         GXv_int38[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) && ( ! (GXutil.strcmp("", AV113Pedidosclientesindetalle_mantenimientorollos_ins_piezads_9_tffasdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.FasDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV114Pedidosclientesindetalle_mantenimientorollos_ins_piezads_10_tffasdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.FasDsc = ?)");
      }
      else
      {
         GXv_int38[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) && ( ! (GXutil.strcmp("", AV115Pedidosclientesindetalle_mantenimientorollos_ins_piezads_11_tfmaqcodbis)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.MaqCodBis) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int38[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV116Pedidosclientesindetalle_mantenimientorollos_ins_piezads_12_tfmaqcodbis_sel)==0) )
      {
         addWhere(sWhereString, "(T1.MaqCodBis = ?)");
      }
      else
      {
         GXv_int38[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV117Pedidosclientesindetalle_mantenimientorollos_ins_piezads_13_tfbarfaskgm)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm >= ?)");
      }
      else
      {
         GXv_int38[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV118Pedidosclientesindetalle_mantenimientorollos_ins_piezads_14_tfbarfaskgm_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasKgm <= ?)");
      }
      else
      {
         GXv_int38[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV119Pedidosclientesindetalle_mantenimientorollos_ins_piezads_15_tfbarfasmtr)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr >= ?)");
      }
      else
      {
         GXv_int38[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Pedidosclientesindetalle_mantenimientorollos_ins_piezads_16_tfbarfasmtr_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarFasMtr <= ?)");
      }
      else
      {
         GXv_int38[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Pedidosclientesindetalle_mantenimientorollos_ins_piezads_17_tfbartierea)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea >= ?)");
      }
      else
      {
         GXv_int38[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Pedidosclientesindetalle_mantenimientorollos_ins_piezads_18_tfbartierea_to)==0) )
      {
         addWhere(sWhereString, "(T1.BarTieRea <= ?)");
      }
      else
      {
         GXv_int38[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV123Pedidosclientesindetalle_mantenimientorollos_ins_piezads_19_tfbarfecrea)) )
      {
         addWhere(sWhereString, "(T1.BarFecRea >= ?)");
      }
      else
      {
         GXv_int38[22] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object39[0] = scmdbuf ;
      GXv_Object39[1] = GXv_int38 ;
      return GXv_Object39 ;
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
                  return conditional_H026L2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
            case 1 :
                  return conditional_H026L3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , ((Number) dynConstraints[5]).shortValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.util.Date)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).byteValue() , (String)dynConstraints[21] , (String)dynConstraints[22] , ((Number) dynConstraints[23]).shortValue() , (String)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (java.util.Date)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , ((Number) dynConstraints[35]).byteValue() , (String)dynConstraints[36] , (String)dynConstraints[37] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H026L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H026L3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(6, 6);
               ((String[]) buf[8])[0] = rslt.getString(7, 28);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((short[]) buf[10])[0] = rslt.getShort(9);
               ((String[]) buf[11])[0] = rslt.getString(10, 8);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((byte[]) buf[13])[0] = rslt.getByte(12);
               ((int[]) buf[14])[0] = rslt.getInt(13);
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
                  stmt.setString(sIdx, (String)parms[28], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[45], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[46], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[54]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 11);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 11);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 8);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 28);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 28);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[40], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[42], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               return;
      }
   }

}

