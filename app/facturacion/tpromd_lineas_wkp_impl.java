package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tpromd_lineas_wkp_impl extends GXDataArea
{
   public tpromd_lineas_wkp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tpromd_lineas_wkp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tpromd_lineas_wkp_impl.class ));
   }

   public tpromd_lineas_wkp_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavForblo = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
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
            AV39emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39emprcod", AV39emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV40CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV40CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9")));
               AV41CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41CliNom", AV41CliNom);
               AV42PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PMDCod), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42PMDCod), "ZZZ9")));
               AV43PMDDsc = httpContext.GetPar( "PMDDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43PMDDsc", AV43PMDDsc);
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
      nRC_GXsfl_107 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_107"))) ;
      nGXsfl_107_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_107_idx"))) ;
      sGXsfl_107_idx = httpContext.GetPar( "sGXsfl_107_idx") ;
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
      AV39emprcod = httpContext.GetPar( "emprcod") ;
      AV40CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV42PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
      AV15TFPMDColNum = (int)(GXutil.lval( httpContext.GetPar( "TFPMDColNum"))) ;
      AV16TFPMDColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPMDColNum_To"))) ;
      AV17TFPMDColCli = httpContext.GetPar( "TFPMDColCli") ;
      AV18TFPMDColCli_Sel = httpContext.GetPar( "TFPMDColCli_Sel") ;
      AV19TFPMDConCod = (int)(GXutil.lval( httpContext.GetPar( "TFPMDConCod"))) ;
      AV20TFPMDConCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFPMDConCod_To"))) ;
      AV21TFPMDColNom = httpContext.GetPar( "TFPMDColNom") ;
      AV22TFPMDColNom_Sel = httpContext.GetPar( "TFPMDColNom_Sel") ;
      AV23TFPMDPreKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreKgm"), ".") ;
      AV24TFPMDPreKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreKgm_To"), ".") ;
      AV25TFPMDEntKgm = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDEntKgm"), ".") ;
      AV26TFPMDEntKgm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDEntKgm_To"), ".") ;
      AV27TFPMDDtoTin = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoTin"), ".") ;
      AV28TFPMDDtoTin_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoTin_To"), ".") ;
      AV29TFPMDDtoAca = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoAca"), ".") ;
      AV30TFPMDDtoAca_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDDtoAca_To"), ".") ;
      AV31TFPMDPreUni = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreUni"), ".") ;
      AV32TFPMDPreUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPMDPreUni_To"), ".") ;
      AV33TFPMDValFch = localUtil.parseDateParm( httpContext.GetPar( "TFPMDValFch")) ;
      AV62Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      A8391PMDCod = (short)(GXutil.lval( httpContext.GetPar( "PMDCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV39emprcod, AV40CliCod, AV42PMDCod, AV15TFPMDColNum, AV16TFPMDColNum_To, AV17TFPMDColCli, AV18TFPMDColCli_Sel, AV19TFPMDConCod, AV20TFPMDConCod_To, AV21TFPMDColNom, AV22TFPMDColNom_Sel, AV23TFPMDPreKgm, AV24TFPMDPreKgm_To, AV25TFPMDEntKgm, AV26TFPMDEntKgm_To, AV27TFPMDDtoTin, AV28TFPMDDtoTin_To, AV29TFPMDDtoAca, AV30TFPMDDtoAca_To, AV31TFPMDPreUni, AV32TFPMDPreUni_To, AV33TFPMDValFch, AV62Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A252CliCod, A8391PMDCod) ;
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
      pa2B62( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2B62( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tpromd_lineas_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV40CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41CliNom)),GXutil.URLEncode(GXutil.ltrimstr(AV42PMDCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV43PMDDsc))}, new String[] {"emprcod","CliCod","CliNom","PMDCod","PMDDsc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42PMDCod), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TProMD_lineas_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tpromd_lineas_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_107", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_107, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV39emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNUM", GXutil.ltrim( localUtil.ntoc( AV15TFPMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV16TFPMDColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLCLI", GXutil.rtrim( AV17TFPMDColCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLCLI_SEL", GXutil.rtrim( AV18TFPMDColCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCONCOD", GXutil.ltrim( localUtil.ntoc( AV19TFPMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCONCOD_TO", GXutil.ltrim( localUtil.ntoc( AV20TFPMDConCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNOM", GXutil.rtrim( AV21TFPMDColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDCOLNOM_SEL", GXutil.rtrim( AV22TFPMDColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREKGM", GXutil.ltrim( localUtil.ntoc( AV23TFPMDPreKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREKGM_TO", GXutil.ltrim( localUtil.ntoc( AV24TFPMDPreKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDENTKGM", GXutil.ltrim( localUtil.ntoc( AV25TFPMDEntKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDENTKGM_TO", GXutil.ltrim( localUtil.ntoc( AV26TFPMDEntKgm_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOTIN", GXutil.ltrim( localUtil.ntoc( AV27TFPMDDtoTin, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOTIN_TO", GXutil.ltrim( localUtil.ntoc( AV28TFPMDDtoTin_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOACA", GXutil.ltrim( localUtil.ntoc( AV29TFPMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDDTOACA_TO", GXutil.ltrim( localUtil.ntoc( AV30TFPMDDtoAca_To, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREUNI", GXutil.ltrim( localUtil.ntoc( AV31TFPMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDPREUNI_TO", GXutil.ltrim( localUtil.ntoc( AV32TFPMDPreUni_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPMDVALFCH", localUtil.dtoc( AV33TFPMDValFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOD", GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROMD1", GXutil.ltrim( localUtil.ntoc( AV57ProMD1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV82Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV83Clicod_selected, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV84Pmdcod_selected, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPMDCOLNUM_SELECTED", GXutil.ltrim( localUtil.ntoc( AV85Pmdcolnum_selected, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
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
         we2B62( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2B62( ) ;
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
      return formatLink("app.facturacion.tpromd_lineas_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV40CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV41CliNom)),GXutil.URLEncode(GXutil.ltrimstr(AV42PMDCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV43PMDDsc))}, new String[] {"emprcod","CliCod","CliNom","PMDCod","PMDDsc"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TProMD_lineas_WKP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Programas, Lineas ", "") ;
   }

   public void wb2B60( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV40CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV41CliNom), GXutil.rtrim( localUtil.format( AV41CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdcod_Internalname, httpContext.getMessage( "Programa", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV42PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42PMDCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42PMDCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdcod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmddsc_Internalname, httpContext.getMessage( "Descripción", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmddsc_Internalname, GXutil.rtrim( AV43PMDDsc), GXutil.rtrim( localUtil.format( AV43PMDDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmddsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdcolnum_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV50PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50PMDColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50PMDColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdcolcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdcolcli_Internalname, httpContext.getMessage( "Cor Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdcolcli_Internalname, GXutil.rtrim( AV51PMDColCli), GXutil.rtrim( localUtil.format( AV51PMDColCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdcolcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdcolcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdconcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdconcod_Internalname, httpContext.getMessage( "Nº Cor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdconcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV52PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdconcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52PMDConCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV52PMDConCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdconcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdconcod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdcolnom_Internalname, httpContext.getMessage( "Nome Cor", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdcolnom_Internalname, GXutil.rtrim( AV53PMDColNom), GXutil.rtrim( localUtil.format( AV53PMDColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavForblo.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavForblo.getInternalname(), httpContext.getMessage( "B?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavForblo, cmbavForblo.getInternalname(), GXutil.rtrim( AV59ForBlo), 1, cmbavForblo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavForblo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "", true, (byte)(0), "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         cmbavForblo.setValue( GXutil.rtrim( AV59ForBlo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavForblo.getInternalname(), "Values", cmbavForblo.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdprekgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdprekgm_Internalname, httpContext.getMessage( "Quilos Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdprekgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV44PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdprekgm_Enabled!=0) ? localUtil.format( AV44PMDPreKgm, "ZZZ,ZZ9.99") : localUtil.format( AV44PMDPreKgm, "ZZZ,ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdprekgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdprekgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdentkgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdentkgm_Internalname, httpContext.getMessage( "Quilos Ent.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdentkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV45PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdentkgm_Enabled!=0) ? localUtil.format( AV45PMDEntKgm, "ZZZ,ZZ9.99 ") : localUtil.format( AV45PMDEntKgm, "ZZZ,ZZ9.99 "))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdentkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdentkgm_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmddtotin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmddtotin_Internalname, httpContext.getMessage( "Desc T(%)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmddtotin_Internalname, GXutil.ltrim( localUtil.ntoc( AV46PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmddtotin_Enabled!=0) ? localUtil.format( AV46PMDDtoTin, "ZZ9.99 ") : localUtil.format( AV46PMDDtoTin, "ZZ9.99 "))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmddtotin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmddtotin_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmddtoaca_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmddtoaca_Internalname, httpContext.getMessage( "Desc A(%)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmddtoaca_Internalname, GXutil.ltrim( localUtil.ntoc( AV47PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmddtoaca_Enabled!=0) ? localUtil.format( AV47PMDDtoAca, "ZZ9.99") : localUtil.format( AV47PMDDtoAca, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmddtoaca_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmddtoaca_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdpreuni_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdpreuni_Internalname, httpContext.getMessage( "Preço Unico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdpreuni_Internalname, GXutil.ltrim( localUtil.ntoc( AV48PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPmdpreuni_Enabled!=0) ? localUtil.format( AV48PMDPreUni, "ZZZZZZ9.999") : localUtil.format( AV48PMDPreUni, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdpreuni_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdpreuni_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPmdvalfch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPmdvalfch_Internalname, httpContext.getMessage( "Validade", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPmdvalfch_Internalname, localUtil.format(AV49PMDValFch, "99/99/99"), localUtil.format( AV49PMDValFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPmdvalfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPmdvalfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnlimpiarvariables_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Limpiar Variables", ""), bttBtnlimpiarvariables_Jsonclick, 5, httpContext.getMessage( "Limpiar Variables", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOLIMPIARVARIABLES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 107, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TProMD_lineas_WKP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\TProMD_lineas_WKP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol107( ) ;
      }
      if ( wbEnd == 107 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_107 = (int)(nGXsfl_107_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV62Pgmname), GXutil.rtrim( localUtil.format( AV62Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV35DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_133_2B62( true) ;
      }
      else
      {
         wb_table1_133_2B62( false) ;
      }
      return  ;
   }

   public void wb_table1_133_2B62e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_pmdvalfchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'" + sGXsfl_107_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_pmdvalfchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_pmdvalfchauxdate_Internalname, localUtil.format(AV34DDO_PMDValFchAuxDate, "99/99/99"), localUtil.format( AV34DDO_PMDValFchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,140);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_pmdvalfchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_pmdvalfchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\TProMD_lineas_WKP.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 107 )
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

   public void start2B62( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Programas, Lineas ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2B60( ) ;
   }

   public void ws2B62( )
   {
      start2B62( ) ;
      evt2B62( ) ;
   }

   public void evt2B62( )
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
                           e112B62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122B62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132B62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142B62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOLIMPIARVARIABLES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoLimpiarvariables' */
                           e152B62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e162B62 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPMDCOLNUM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172B62 ();
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
                                 e182B62 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VPMDCONCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192B62 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_107_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1072( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV58GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
                           A8393PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A8530PMDColCli = httpContext.cgiGet( edtPMDColCli_Internalname) ;
                           A8531PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( edtPMDConCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A8394PMDColNom = httpContext.cgiGet( edtPMDColNom_Internalname) ;
                           A8395PMDPreKgm = localUtil.ctond( httpContext.cgiGet( edtPMDPreKgm_Internalname)) ;
                           A8396PMDEntKgm = localUtil.ctond( httpContext.cgiGet( edtPMDEntKgm_Internalname)) ;
                           A8397PMDDtoTin = localUtil.ctond( httpContext.cgiGet( edtPMDDtoTin_Internalname)) ;
                           A8398PMDDtoAca = localUtil.ctond( httpContext.cgiGet( edtPMDDtoAca_Internalname)) ;
                           A8532PMDPreUni = localUtil.ctond( httpContext.cgiGet( edtPMDPreUni_Internalname)) ;
                           A8399PMDValFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPMDValFch_Internalname), 0)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e202B62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e212B62 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e222B62 ();
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

   public void we2B62( )
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

   public void pa2B62( )
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
            GX_FocusControl = edtavPmdcolnum_Internalname ;
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
      subsflControlProps_1072( ) ;
      while ( nGXsfl_107_idx <= nRC_GXsfl_107 )
      {
         sendrow_1072( ) ;
         nGXsfl_107_idx = ((subGrid_Islastpage==1)&&(nGXsfl_107_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_107_idx+1) ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV39emprcod ,
                                 int AV40CliCod ,
                                 short AV42PMDCod ,
                                 int AV15TFPMDColNum ,
                                 int AV16TFPMDColNum_To ,
                                 String AV17TFPMDColCli ,
                                 String AV18TFPMDColCli_Sel ,
                                 int AV19TFPMDConCod ,
                                 int AV20TFPMDConCod_To ,
                                 String AV21TFPMDColNom ,
                                 String AV22TFPMDColNom_Sel ,
                                 java.math.BigDecimal AV23TFPMDPreKgm ,
                                 java.math.BigDecimal AV24TFPMDPreKgm_To ,
                                 java.math.BigDecimal AV25TFPMDEntKgm ,
                                 java.math.BigDecimal AV26TFPMDEntKgm_To ,
                                 java.math.BigDecimal AV27TFPMDDtoTin ,
                                 java.math.BigDecimal AV28TFPMDDtoTin_To ,
                                 java.math.BigDecimal AV29TFPMDDtoAca ,
                                 java.math.BigDecimal AV30TFPMDDtoAca_To ,
                                 java.math.BigDecimal AV31TFPMDPreUni ,
                                 java.math.BigDecimal AV32TFPMDPreUni_To ,
                                 java.util.Date AV33TFPMDValFch ,
                                 String AV62Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String A396EmprCod ,
                                 int A252CliCod ,
                                 short A8391PMDCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e212B62 ();
      GRID_nCurrentRecord = 0 ;
      rf2B62( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TProMD_lineas_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tpromd_lineas_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOLNUM", GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), ".", "")));
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
      if ( cmbavForblo.getItemCount() > 0 )
      {
         AV59ForBlo = cmbavForblo.getValidValue(AV59ForBlo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ForBlo", AV59ForBlo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavForblo.setValue( GXutil.rtrim( AV59ForBlo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavForblo.getInternalname(), "Values", cmbavForblo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2B62( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV62Pgmname = "Facturacion.TProMD_lineas_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPmdcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmdcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmdcod_Enabled), 5, 0), true);
      edtavPmddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmddsc_Enabled), 5, 0), true);
      edtavPmdcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmdcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmdcolnom_Enabled), 5, 0), true);
      cmbavForblo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavForblo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavForblo.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV15TFPMDColNum ;
      AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV16TFPMDColNum_To ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV17TFPMDColCli ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV18TFPMDColCli_Sel ;
      AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV19TFPMDConCod ;
      AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV20TFPMDConCod_To ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV21TFPMDColNom ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV22TFPMDColNom_Sel ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV23TFPMDPreKgm ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV24TFPMDPreKgm_To ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV25TFPMDEntKgm ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV26TFPMDEntKgm_To ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV27TFPMDDtoTin ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV28TFPMDDtoTin_To ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV29TFPMDDtoAca ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV30TFPMDDtoAca_To ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV31TFPMDPreUni ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV32TFPMDPreUni_To ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV33TFPMDValFch ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) ,
                                           Integer.valueOf(AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) ,
                                           AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                           AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                           Integer.valueOf(AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) ,
                                           Integer.valueOf(AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) ,
                                           AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                           AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                           AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                           AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                           AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                           AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                           AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                           AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                           AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                           AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                           AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                           Integer.valueOf(A8393PMDColNum) ,
                                           A8530PMDColCli ,
                                           Integer.valueOf(A8531PMDConCod) ,
                                           A8395PMDPreKgm ,
                                           A8396PMDEntKgm ,
                                           A8397PMDDtoTin ,
                                           A8398PMDDtoAca ,
                                           A8532PMDPreUni ,
                                           A8399PMDValFch ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                           AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                           A8394PMDColNom ,
                                           AV39emprcod ,
                                           Integer.valueOf(AV40CliCod) ,
                                           Short.valueOf(AV42PMDCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(A8391PMDCod) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT
                                           }
      });
      lV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli), 13, "%") ;
      /* Using cursor H02B62 */
      pr_default.execute(0, new Object[] {AV39emprcod, Integer.valueOf(AV40CliCod), Short.valueOf(AV42PMDCod), Integer.valueOf(AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum), Integer.valueOf(AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to), lV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli, AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel, Integer.valueOf(AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod), Integer.valueOf(AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to), AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm, AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to, AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm, AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to, AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin, AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to, AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca, AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to, AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni, AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to, AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8391PMDCod = H02B62_A8391PMDCod[0] ;
         A8399PMDValFch = H02B62_A8399PMDValFch[0] ;
         A8532PMDPreUni = H02B62_A8532PMDPreUni[0] ;
         A8398PMDDtoAca = H02B62_A8398PMDDtoAca[0] ;
         A8397PMDDtoTin = H02B62_A8397PMDDtoTin[0] ;
         A8396PMDEntKgm = H02B62_A8396PMDEntKgm[0] ;
         A8395PMDPreKgm = H02B62_A8395PMDPreKgm[0] ;
         A8530PMDColCli = H02B62_A8530PMDColCli[0] ;
         A8393PMDColNum = H02B62_A8393PMDColNum[0] ;
         A8531PMDConCod = H02B62_A8531PMDConCod[0] ;
         A252CliCod = H02B62_A252CliCod[0] ;
         A396EmprCod = H02B62_A396EmprCod[0] ;
         GXt_char1 = A8394PMDColNom ;
         GXv_char2[0] = GXt_char1 ;
         new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
         tpromd_lineas_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
         A8394PMDColNom = GXt_char1 ;
         if ( ! ( (GXutil.strcmp("", AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
         {
            if ( (GXutil.strcmp("", AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel) == 0 ) ) )
            {
               GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf2B62( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(107) ;
      /* Execute user event: Refresh */
      e212B62 ();
      nGXsfl_107_idx = 1 ;
      sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1072( ) ;
      bGXsfl_107_Refreshing = true ;
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
         subsflControlProps_1072( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Integer.valueOf(AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) ,
                                              Integer.valueOf(AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) ,
                                              AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                              AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                              Integer.valueOf(AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) ,
                                              Integer.valueOf(AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) ,
                                              AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                              AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                              AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                              AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                              AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                              AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                              AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                              AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                              AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                              AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                              AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                              Integer.valueOf(A8393PMDColNum) ,
                                              A8530PMDColCli ,
                                              Integer.valueOf(A8531PMDConCod) ,
                                              A8395PMDPreKgm ,
                                              A8396PMDEntKgm ,
                                              A8397PMDDtoTin ,
                                              A8398PMDDtoAca ,
                                              A8532PMDPreUni ,
                                              A8399PMDValFch ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                              AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                              A8394PMDColNom ,
                                              AV39emprcod ,
                                              Integer.valueOf(AV40CliCod) ,
                                              Short.valueOf(AV42PMDCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A252CliCod) ,
                                              Short.valueOf(A8391PMDCod) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT
                                              }
         });
         lV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = GXutil.padr( GXutil.rtrim( AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli), 13, "%") ;
         /* Using cursor H02B63 */
         pr_default.execute(1, new Object[] {AV39emprcod, Integer.valueOf(AV40CliCod), Short.valueOf(AV42PMDCod), Integer.valueOf(AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum), Integer.valueOf(AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to), lV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli, AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel, Integer.valueOf(AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod), Integer.valueOf(AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to), AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm, AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to, AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm, AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to, AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin, AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to, AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca, AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to, AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni, AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to, AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch});
         nGXsfl_107_idx = 1 ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A8391PMDCod = H02B63_A8391PMDCod[0] ;
            A8399PMDValFch = H02B63_A8399PMDValFch[0] ;
            A8532PMDPreUni = H02B63_A8532PMDPreUni[0] ;
            A8398PMDDtoAca = H02B63_A8398PMDDtoAca[0] ;
            A8397PMDDtoTin = H02B63_A8397PMDDtoTin[0] ;
            A8396PMDEntKgm = H02B63_A8396PMDEntKgm[0] ;
            A8395PMDPreKgm = H02B63_A8395PMDPreKgm[0] ;
            A8530PMDColCli = H02B63_A8530PMDColCli[0] ;
            A8393PMDColNum = H02B63_A8393PMDColNum[0] ;
            A8531PMDConCod = H02B63_A8531PMDConCod[0] ;
            A252CliCod = H02B63_A252CliCod[0] ;
            A396EmprCod = H02B63_A396EmprCod[0] ;
            GXt_char1 = A8394PMDColNom ;
            GXv_char2[0] = GXt_char1 ;
            new app.facturacion.obtenciondelcolor(remoteHandle, context).execute( A396EmprCod, A252CliCod, A8531PMDConCod, GXv_char2) ;
            tpromd_lineas_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
            A8394PMDColNom = GXt_char1 ;
            if ( ! ( (GXutil.strcmp("", AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom)==0) ) ) || ( GXutil.like( GXutil.upper( A8394PMDColNom) , GXutil.padr( "%" + GXutil.upper( AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom) , 255 , "%"),  ' ' ) ) )
            {
               if ( (GXutil.strcmp("", AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel)==0) || ( ( GXutil.strcmp(A8394PMDColNom, AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel) == 0 ) ) )
               {
                  e222B62 ();
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(107) ;
         wb2B60( ) ;
      }
      bGXsfl_107_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2B62( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV39emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PMDCOD", GXutil.ltrim( localUtil.ntoc( A8391PMDCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A8391PMDCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PMDCOLNUM"+"_"+sGXsfl_107_idx, getSecureSignedToken( sGXsfl_107_idx, localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9")));
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
      AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV15TFPMDColNum ;
      AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV16TFPMDColNum_To ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV17TFPMDColCli ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV18TFPMDColCli_Sel ;
      AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV19TFPMDConCod ;
      AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV20TFPMDConCod_To ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV21TFPMDColNom ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV22TFPMDColNom_Sel ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV23TFPMDPreKgm ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV24TFPMDPreKgm_To ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV25TFPMDEntKgm ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV26TFPMDEntKgm_To ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV27TFPMDDtoTin ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV28TFPMDDtoTin_To ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV29TFPMDDtoAca ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV30TFPMDDtoAca_To ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV31TFPMDPreUni ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV32TFPMDPreUni_To ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV33TFPMDValFch ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV39emprcod, AV40CliCod, AV42PMDCod, AV15TFPMDColNum, AV16TFPMDColNum_To, AV17TFPMDColCli, AV18TFPMDColCli_Sel, AV19TFPMDConCod, AV20TFPMDConCod_To, AV21TFPMDColNom, AV22TFPMDColNom_Sel, AV23TFPMDPreKgm, AV24TFPMDPreKgm_To, AV25TFPMDEntKgm, AV26TFPMDEntKgm_To, AV27TFPMDDtoTin, AV28TFPMDDtoTin_To, AV29TFPMDDtoAca, AV30TFPMDDtoAca_To, AV31TFPMDPreUni, AV32TFPMDPreUni_To, AV33TFPMDValFch, AV62Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A252CliCod, A8391PMDCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV15TFPMDColNum ;
      AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV16TFPMDColNum_To ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV17TFPMDColCli ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV18TFPMDColCli_Sel ;
      AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV19TFPMDConCod ;
      AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV20TFPMDConCod_To ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV21TFPMDColNom ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV22TFPMDColNom_Sel ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV23TFPMDPreKgm ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV24TFPMDPreKgm_To ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV25TFPMDEntKgm ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV26TFPMDEntKgm_To ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV27TFPMDDtoTin ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV28TFPMDDtoTin_To ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV29TFPMDDtoAca ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV30TFPMDDtoAca_To ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV31TFPMDPreUni ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV32TFPMDPreUni_To ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV33TFPMDValFch ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV39emprcod, AV40CliCod, AV42PMDCod, AV15TFPMDColNum, AV16TFPMDColNum_To, AV17TFPMDColCli, AV18TFPMDColCli_Sel, AV19TFPMDConCod, AV20TFPMDConCod_To, AV21TFPMDColNom, AV22TFPMDColNom_Sel, AV23TFPMDPreKgm, AV24TFPMDPreKgm_To, AV25TFPMDEntKgm, AV26TFPMDEntKgm_To, AV27TFPMDDtoTin, AV28TFPMDDtoTin_To, AV29TFPMDDtoAca, AV30TFPMDDtoAca_To, AV31TFPMDPreUni, AV32TFPMDPreUni_To, AV33TFPMDValFch, AV62Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A252CliCod, A8391PMDCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV15TFPMDColNum ;
      AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV16TFPMDColNum_To ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV17TFPMDColCli ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV18TFPMDColCli_Sel ;
      AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV19TFPMDConCod ;
      AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV20TFPMDConCod_To ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV21TFPMDColNom ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV22TFPMDColNom_Sel ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV23TFPMDPreKgm ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV24TFPMDPreKgm_To ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV25TFPMDEntKgm ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV26TFPMDEntKgm_To ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV27TFPMDDtoTin ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV28TFPMDDtoTin_To ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV29TFPMDDtoAca ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV30TFPMDDtoAca_To ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV31TFPMDPreUni ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV32TFPMDPreUni_To ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV33TFPMDValFch ;
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
         gxgrgrid_refresh( subGrid_Rows, AV39emprcod, AV40CliCod, AV42PMDCod, AV15TFPMDColNum, AV16TFPMDColNum_To, AV17TFPMDColCli, AV18TFPMDColCli_Sel, AV19TFPMDConCod, AV20TFPMDConCod_To, AV21TFPMDColNom, AV22TFPMDColNom_Sel, AV23TFPMDPreKgm, AV24TFPMDPreKgm_To, AV25TFPMDEntKgm, AV26TFPMDEntKgm_To, AV27TFPMDDtoTin, AV28TFPMDDtoTin_To, AV29TFPMDDtoAca, AV30TFPMDDtoAca_To, AV31TFPMDPreUni, AV32TFPMDPreUni_To, AV33TFPMDValFch, AV62Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A252CliCod, A8391PMDCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV15TFPMDColNum ;
      AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV16TFPMDColNum_To ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV17TFPMDColCli ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV18TFPMDColCli_Sel ;
      AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV19TFPMDConCod ;
      AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV20TFPMDConCod_To ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV21TFPMDColNom ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV22TFPMDColNom_Sel ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV23TFPMDPreKgm ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV24TFPMDPreKgm_To ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV25TFPMDEntKgm ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV26TFPMDEntKgm_To ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV27TFPMDDtoTin ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV28TFPMDDtoTin_To ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV29TFPMDDtoAca ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV30TFPMDDtoAca_To ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV31TFPMDPreUni ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV32TFPMDPreUni_To ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV33TFPMDValFch ;
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
         gxgrgrid_refresh( subGrid_Rows, AV39emprcod, AV40CliCod, AV42PMDCod, AV15TFPMDColNum, AV16TFPMDColNum_To, AV17TFPMDColCli, AV18TFPMDColCli_Sel, AV19TFPMDConCod, AV20TFPMDConCod_To, AV21TFPMDColNom, AV22TFPMDColNom_Sel, AV23TFPMDPreKgm, AV24TFPMDPreKgm_To, AV25TFPMDEntKgm, AV26TFPMDEntKgm_To, AV27TFPMDDtoTin, AV28TFPMDDtoTin_To, AV29TFPMDDtoAca, AV30TFPMDDtoAca_To, AV31TFPMDPreUni, AV32TFPMDPreUni_To, AV33TFPMDValFch, AV62Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A252CliCod, A8391PMDCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV15TFPMDColNum ;
      AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV16TFPMDColNum_To ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV17TFPMDColCli ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV18TFPMDColCli_Sel ;
      AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV19TFPMDConCod ;
      AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV20TFPMDConCod_To ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV21TFPMDColNom ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV22TFPMDColNom_Sel ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV23TFPMDPreKgm ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV24TFPMDPreKgm_To ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV25TFPMDEntKgm ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV26TFPMDEntKgm_To ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV27TFPMDDtoTin ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV28TFPMDDtoTin_To ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV29TFPMDDtoAca ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV30TFPMDDtoAca_To ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV31TFPMDPreUni ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV32TFPMDPreUni_To ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV33TFPMDValFch ;
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
         gxgrgrid_refresh( subGrid_Rows, AV39emprcod, AV40CliCod, AV42PMDCod, AV15TFPMDColNum, AV16TFPMDColNum_To, AV17TFPMDColCli, AV18TFPMDColCli_Sel, AV19TFPMDConCod, AV20TFPMDConCod_To, AV21TFPMDColNom, AV22TFPMDColNom_Sel, AV23TFPMDPreKgm, AV24TFPMDPreKgm_To, AV25TFPMDEntKgm, AV26TFPMDEntKgm_To, AV27TFPMDDtoTin, AV28TFPMDDtoTin_To, AV29TFPMDDtoAca, AV30TFPMDDtoAca_To, AV31TFPMDPreUni, AV32TFPMDPreUni_To, AV33TFPMDValFch, AV62Pgmname, AV12OrderedBy, AV13OrderedDsc, A396EmprCod, A252CliCod, A8391PMDCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV62Pgmname = "Facturacion.TProMD_lineas_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavPmdcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmdcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmdcod_Enabled), 5, 0), true);
      edtavPmddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmddsc_Enabled), 5, 0), true);
      edtavPmdcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPmdcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPmdcolnom_Enabled), 5, 0), true);
      cmbavForblo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavForblo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavForblo.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2B60( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e202B62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV35DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_107 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_107"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV37GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV38GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV57ProMD1 = (short)(localUtil.ctol( httpContext.cgiGet( "vPROMD1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV82Emprcod_selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         AV83Clicod_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV84Pmdcod_selected = (short)(localUtil.ctol( httpContext.cgiGet( "vPMDCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A8391PMDCod = (short)(localUtil.ctol( httpContext.cgiGet( "PMDCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV85Pmdcolnum_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vPMDCOLNUM_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPmdcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPmdcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDCOLNUM");
            GX_FocusControl = edtavPmdcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50PMDColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50PMDColNum), 6, 0));
         }
         else
         {
            AV50PMDColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavPmdcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50PMDColNum), 6, 0));
         }
         AV51PMDColCli = httpContext.cgiGet( edtavPmdcolcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51PMDColCli", AV51PMDColCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPmdconcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPmdconcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDCONCOD");
            GX_FocusControl = edtavPmdconcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52PMDConCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52PMDConCod), 6, 0));
         }
         else
         {
            AV52PMDConCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavPmdconcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52PMDConCod), 6, 0));
         }
         AV53PMDColNom = httpContext.cgiGet( edtavPmdcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53PMDColNom", AV53PMDColNom);
         cmbavForblo.setName( cmbavForblo.getInternalname() );
         cmbavForblo.setValue( httpContext.cgiGet( cmbavForblo.getInternalname()) );
         AV59ForBlo = httpContext.cgiGet( cmbavForblo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ForBlo", AV59ForBlo);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdprekgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdprekgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDPREKGM");
            GX_FocusControl = edtavPmdprekgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44PMDPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44PMDPreKgm", GXutil.ltrimstr( AV44PMDPreKgm, 9, 2));
         }
         else
         {
            AV44PMDPreKgm = localUtil.ctond( httpContext.cgiGet( edtavPmdprekgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44PMDPreKgm", GXutil.ltrimstr( AV44PMDPreKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdentkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdentkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDENTKGM");
            GX_FocusControl = edtavPmdentkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45PMDEntKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45PMDEntKgm", GXutil.ltrimstr( AV45PMDEntKgm, 9, 2));
         }
         else
         {
            AV45PMDEntKgm = localUtil.ctond( httpContext.cgiGet( edtavPmdentkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45PMDEntKgm", GXutil.ltrimstr( AV45PMDEntKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmddtotin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmddtotin_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDDTOTIN");
            GX_FocusControl = edtavPmddtotin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46PMDDtoTin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46PMDDtoTin", GXutil.ltrimstr( AV46PMDDtoTin, 6, 2));
         }
         else
         {
            AV46PMDDtoTin = localUtil.ctond( httpContext.cgiGet( edtavPmddtotin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46PMDDtoTin", GXutil.ltrimstr( AV46PMDDtoTin, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmddtoaca_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmddtoaca_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDDTOACA");
            GX_FocusControl = edtavPmddtoaca_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47PMDDtoAca = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47PMDDtoAca", GXutil.ltrimstr( AV47PMDDtoAca, 6, 2));
         }
         else
         {
            AV47PMDDtoAca = localUtil.ctond( httpContext.cgiGet( edtavPmddtoaca_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47PMDDtoAca", GXutil.ltrimstr( AV47PMDDtoAca, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPmdpreuni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPmdpreuni_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPMDPREUNI");
            GX_FocusControl = edtavPmdpreuni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48PMDPreUni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48PMDPreUni", GXutil.ltrimstr( AV48PMDPreUni, 14, 5));
         }
         else
         {
            AV48PMDPreUni = localUtil.ctond( httpContext.cgiGet( edtavPmdpreuni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48PMDPreUni", GXutil.ltrimstr( AV48PMDPreUni, 14, 5));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavPmdvalfch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vPMDVALFCH");
            GX_FocusControl = edtavPmdvalfch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV49PMDValFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49PMDValFch", localUtil.format(AV49PMDValFch, "99/99/99"));
         }
         else
         {
            AV49PMDValFch = localUtil.ctod( httpContext.cgiGet( edtavPmdvalfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49PMDValFch", localUtil.format(AV49PMDValFch, "99/99/99"));
         }
         AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_pmdvalfchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PMDVALFCHAUXDATE");
            GX_FocusControl = edtavDdo_pmdvalfchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34DDO_PMDValFchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_PMDValFchAuxDate", localUtil.format(AV34DDO_PMDValFchAuxDate, "99/99/99"));
         }
         else
         {
            AV34DDO_PMDValFchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_pmdvalfchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34DDO_PMDValFchAuxDate", localUtil.format(AV34DDO_PMDValFchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TProMD_lineas_WKP");
         AV62Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62Pgmname", AV62Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV62Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\tpromd_lineas_wkp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e202B62 ();
      if (returnInSub) return;
   }

   public void e202B62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tpromd_lineas_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      GXv_char2[0] = AV39emprcod ;
      GXv_char3[0] = AV55EmprNom ;
      GXv_char4[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      tpromd_lineas_wkp_impl.this.AV39emprcod = GXv_char2[0] ;
      tpromd_lineas_wkp_impl.this.AV55EmprNom = GXv_char3[0] ;
      tpromd_lineas_wkp_impl.this.AV56UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39emprcod", AV39emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Programas, Lineas ", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV35DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV35DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e212B62( )
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
      AV37GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridCurrentPage), 10, 0));
      AV38GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridPageCount), 10, 0));
      GXt_int8 = AV50PMDColNum ;
      GXv_int9[0] = GXt_int8 ;
      new app.facturacion.tpromd_lineas_next(remoteHandle, context).execute( AV39emprcod, AV40CliCod, AV42PMDCod, GXv_int9) ;
      tpromd_lineas_wkp_impl.this.GXt_int8 = GXv_int9[0] ;
      AV50PMDColNum = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50PMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50PMDColNum), 6, 0));
      AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum = AV15TFPMDColNum ;
      AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to = AV16TFPMDColNum_To ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = AV17TFPMDColCli ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = AV18TFPMDColCli_Sel ;
      AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod = AV19TFPMDConCod ;
      AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to = AV20TFPMDConCod_To ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = AV21TFPMDColNom ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = AV22TFPMDColNom_Sel ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = AV23TFPMDPreKgm ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = AV24TFPMDPreKgm_To ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = AV25TFPMDEntKgm ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = AV26TFPMDEntKgm_To ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = AV27TFPMDDtoTin ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = AV28TFPMDDtoTin_To ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = AV29TFPMDDtoAca ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = AV30TFPMDDtoAca_To ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = AV31TFPMDPreUni ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = AV32TFPMDPreUni_To ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = AV33TFPMDValFch ;
      /*  Sending Event outputs  */
   }

   public void e112B62( )
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

   public void e122B62( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132B62( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDColNum") == 0 )
         {
            AV15TFPMDColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFPMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFPMDColNum), 6, 0));
            AV16TFPMDColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFPMDColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFPMDColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDColCli") == 0 )
         {
            AV17TFPMDColCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFPMDColCli", AV17TFPMDColCli);
            AV18TFPMDColCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFPMDColCli_Sel", AV18TFPMDColCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDConCod") == 0 )
         {
            AV19TFPMDConCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFPMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFPMDConCod), 6, 0));
            AV20TFPMDConCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFPMDConCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFPMDConCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDColNom") == 0 )
         {
            AV21TFPMDColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFPMDColNom", AV21TFPMDColNom);
            AV22TFPMDColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFPMDColNom_Sel", AV22TFPMDColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDPreKgm") == 0 )
         {
            AV23TFPMDPreKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPMDPreKgm", GXutil.ltrimstr( AV23TFPMDPreKgm, 9, 2));
            AV24TFPMDPreKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFPMDPreKgm_To", GXutil.ltrimstr( AV24TFPMDPreKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDEntKgm") == 0 )
         {
            AV25TFPMDEntKgm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPMDEntKgm", GXutil.ltrimstr( AV25TFPMDEntKgm, 9, 2));
            AV26TFPMDEntKgm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPMDEntKgm_To", GXutil.ltrimstr( AV26TFPMDEntKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDDtoTin") == 0 )
         {
            AV27TFPMDDtoTin = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPMDDtoTin", GXutil.ltrimstr( AV27TFPMDDtoTin, 6, 2));
            AV28TFPMDDtoTin_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPMDDtoTin_To", GXutil.ltrimstr( AV28TFPMDDtoTin_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDDtoAca") == 0 )
         {
            AV29TFPMDDtoAca = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDDtoAca", GXutil.ltrimstr( AV29TFPMDDtoAca, 6, 2));
            AV30TFPMDDtoAca_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDDtoAca_To", GXutil.ltrimstr( AV30TFPMDDtoAca_To, 6, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDPreUni") == 0 )
         {
            AV31TFPMDPreUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPMDPreUni", GXutil.ltrimstr( AV31TFPMDPreUni, 14, 5));
            AV32TFPMDPreUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPMDPreUni_To", GXutil.ltrimstr( AV32TFPMDPreUni_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PMDValFch") == 0 )
         {
            AV33TFPMDValFch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPMDValFch", localUtil.format(AV33TFPMDValFch, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e222B62( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(107) ;
         }
         sendrow_1072( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_107_Refreshing )
      {
         httpContext.doAjaxLoad(107, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV58GridActions, 4, 0)) );
   }

   public void e142B62( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e152B62( )
   {
      /* 'DoLimpiarvariables' Routine */
      returnInSub = false ;
      AV51PMDColCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51PMDColCli", AV51PMDColCli);
      AV52PMDConCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52PMDConCod), 6, 0));
      AV47PMDDtoAca = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47PMDDtoAca", GXutil.ltrimstr( AV47PMDDtoAca, 6, 2));
      AV46PMDDtoTin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46PMDDtoTin", GXutil.ltrimstr( AV46PMDDtoTin, 6, 2));
      AV45PMDEntKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45PMDEntKgm", GXutil.ltrimstr( AV45PMDEntKgm, 9, 2));
      AV44PMDPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PMDPreKgm", GXutil.ltrimstr( AV44PMDPreKgm, 9, 2));
      AV48PMDPreUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48PMDPreUni", GXutil.ltrimstr( AV48PMDPreUni, 14, 5));
      AV49PMDValFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49PMDValFch", localUtil.format(AV49PMDValFch, "99/99/99"));
      AV53PMDColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53PMDColNom", AV53PMDColNom);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e162B62( )
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
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      AV82Emprcod_selected = A396EmprCod ;
      AV83Clicod_selected = A252CliCod ;
      AV84Pmdcod_selected = A8391PMDCod ;
      AV85Pmdcolnum_selected = A8393PMDColNum ;
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.facturacion.tpromd_linea_del(remoteHandle, context).execute( AV39emprcod, AV40CliCod, A8391PMDCod, A8393PMDColNum) ;
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV62Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV62Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV62Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV86GXV1 = 1 ;
      while ( AV86GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNUM") == 0 )
         {
            AV15TFPMDColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFPMDColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFPMDColNum), 6, 0));
            AV16TFPMDColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFPMDColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFPMDColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI") == 0 )
         {
            AV17TFPMDColCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFPMDColCli", AV17TFPMDColCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLCLI_SEL") == 0 )
         {
            AV18TFPMDColCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFPMDColCli_Sel", AV18TFPMDColCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCONCOD") == 0 )
         {
            AV19TFPMDConCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFPMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFPMDConCod), 6, 0));
            AV20TFPMDConCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFPMDConCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TFPMDConCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM") == 0 )
         {
            AV21TFPMDColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFPMDColNom", AV21TFPMDColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDCOLNOM_SEL") == 0 )
         {
            AV22TFPMDColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFPMDColNom_Sel", AV22TFPMDColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREKGM") == 0 )
         {
            AV23TFPMDPreKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPMDPreKgm", GXutil.ltrimstr( AV23TFPMDPreKgm, 9, 2));
            AV24TFPMDPreKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFPMDPreKgm_To", GXutil.ltrimstr( AV24TFPMDPreKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDENTKGM") == 0 )
         {
            AV25TFPMDEntKgm = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPMDEntKgm", GXutil.ltrimstr( AV25TFPMDEntKgm, 9, 2));
            AV26TFPMDEntKgm_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPMDEntKgm_To", GXutil.ltrimstr( AV26TFPMDEntKgm_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOTIN") == 0 )
         {
            AV27TFPMDDtoTin = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPMDDtoTin", GXutil.ltrimstr( AV27TFPMDDtoTin, 6, 2));
            AV28TFPMDDtoTin_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPMDDtoTin_To", GXutil.ltrimstr( AV28TFPMDDtoTin_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDDTOACA") == 0 )
         {
            AV29TFPMDDtoAca = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFPMDDtoAca", GXutil.ltrimstr( AV29TFPMDDtoAca, 6, 2));
            AV30TFPMDDtoAca_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFPMDDtoAca_To", GXutil.ltrimstr( AV30TFPMDDtoAca_To, 6, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDPREUNI") == 0 )
         {
            AV31TFPMDPreUni = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFPMDPreUni", GXutil.ltrimstr( AV31TFPMDPreUni, 14, 5));
            AV32TFPMDPreUni_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFPMDPreUni_To", GXutil.ltrimstr( AV32TFPMDPreUni_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPMDVALFCH") == 0 )
         {
            AV33TFPMDValFch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFPMDValFch", localUtil.format(AV33TFPMDValFch, "99/99/99"));
         }
         AV86GXV1 = (int)(AV86GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFPMDColCli_Sel)==0), AV18TFPMDColCli_Sel, GXv_char4) ;
      tpromd_lineas_wkp_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFPMDColNom_Sel)==0), AV22TFPMDColNom_Sel, GXv_char3) ;
      tpromd_lineas_wkp_impl.this.GXt_char10 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"||"+GXt_char10+"||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char10 = "" ;
      GXv_char4[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFPMDColCli)==0), AV17TFPMDColCli, GXv_char4) ;
      tpromd_lineas_wkp_impl.this.GXt_char10 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFPMDColNom)==0), AV21TFPMDColNom, GXv_char3) ;
      tpromd_lineas_wkp_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFPMDColNum) ? "" : GXutil.str( AV15TFPMDColNum, 6, 0))+"|"+GXt_char10+"|"+((0==AV19TFPMDConCod) ? "" : GXutil.str( AV19TFPMDConCod, 6, 0))+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFPMDPreKgm)==0) ? "" : GXutil.str( AV23TFPMDPreKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPMDEntKgm)==0) ? "" : GXutil.str( AV25TFPMDEntKgm, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFPMDDtoTin)==0) ? "" : GXutil.str( AV27TFPMDDtoTin, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPMDDtoAca)==0) ? "" : GXutil.str( AV29TFPMDDtoAca, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFPMDPreUni)==0) ? "" : GXutil.str( AV31TFPMDPreUni, 14, 5))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFPMDValFch)) ? "" : localUtil.dtoc( AV33TFPMDValFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFPMDColNum_To) ? "" : GXutil.str( AV16TFPMDColNum_To, 6, 0))+"||"+((0==AV20TFPMDConCod_To) ? "" : GXutil.str( AV20TFPMDConCod_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFPMDPreKgm_To)==0) ? "" : GXutil.str( AV24TFPMDPreKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPMDEntKgm_To)==0) ? "" : GXutil.str( AV26TFPMDEntKgm_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPMDDtoTin_To)==0) ? "" : GXutil.str( AV28TFPMDDtoTin_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPMDDtoAca_To)==0) ? "" : GXutil.str( AV30TFPMDDtoAca_To, 6, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPMDPreUni_To)==0) ? "" : GXutil.str( AV32TFPMDPreUni_To, 14, 5))+"|" ;
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
      AV10GridState.fromxml(AV14Session.getValue(AV62Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDCOLNUM", "", !((0==AV15TFPMDColNum)&&(0==AV16TFPMDColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFPMDColNum, 6, 0)), GXutil.trim( GXutil.str( AV16TFPMDColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDCOLCLI", "", !(GXutil.strcmp("", AV17TFPMDColCli)==0), (short)(0), AV17TFPMDColCli, "", !(GXutil.strcmp("", AV18TFPMDColCli_Sel)==0), AV18TFPMDColCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDCONCOD", "", !((0==AV19TFPMDConCod)&&(0==AV20TFPMDConCod_To)), (short)(0), GXutil.trim( GXutil.str( AV19TFPMDConCod, 6, 0)), GXutil.trim( GXutil.str( AV20TFPMDConCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDCOLNOM", "", !(GXutil.strcmp("", AV21TFPMDColNom)==0), (short)(0), AV21TFPMDColNom, "", !(GXutil.strcmp("", AV22TFPMDColNom_Sel)==0), AV22TFPMDColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDPREKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV23TFPMDPreKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV24TFPMDPreKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV23TFPMDPreKgm, 9, 2)), GXutil.trim( GXutil.str( AV24TFPMDPreKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDENTKGM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TFPMDEntKgm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV26TFPMDEntKgm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV25TFPMDEntKgm, 9, 2)), GXutil.trim( GXutil.str( AV26TFPMDEntKgm_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDDTOTIN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27TFPMDDtoTin)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TFPMDDtoTin_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV27TFPMDDtoTin, 6, 2)), GXutil.trim( GXutil.str( AV28TFPMDDtoTin_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDDTOACA", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFPMDDtoAca)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFPMDDtoAca_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV29TFPMDDtoAca, 6, 2)), GXutil.trim( GXutil.str( AV30TFPMDDtoAca_To, 6, 2))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDPREUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV31TFPMDPreUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFPMDPreUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV31TFPMDPreUni, 14, 5)), GXutil.trim( GXutil.str( AV32TFPMDPreUni_To, 14, 5))) ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      GXv_SdtWWPGridState11[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState11, "TFPMDVALFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33TFPMDValFch)), (short)(0), GXutil.trim( localUtil.dtoc( AV33TFPMDValFch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState11[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV62Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV62Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.TProMD_lineas_TRN" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e172B62( )
   {
      /* Pmdcolnum_Controlvaluechanged Routine */
      returnInSub = false ;
      GXv_decimal12[0] = AV44PMDPreKgm ;
      GXv_decimal13[0] = AV45PMDEntKgm ;
      GXv_decimal14[0] = AV46PMDDtoTin ;
      GXv_decimal15[0] = AV47PMDDtoAca ;
      GXv_date16[0] = AV49PMDValFch ;
      GXv_char4[0] = AV51PMDColCli ;
      GXv_int9[0] = AV52PMDConCod ;
      GXv_decimal17[0] = AV48PMDPreUni ;
      GXv_char3[0] = AV53PMDColNom ;
      GXv_int18[0] = AV57ProMD1 ;
      new app.facturacion.tpromd_lineas_get(remoteHandle, context).execute( AV39emprcod, AV40CliCod, AV42PMDCod, AV50PMDColNum, GXv_decimal12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_date16, GXv_char4, GXv_int9, GXv_decimal17, GXv_char3, GXv_int18) ;
      tpromd_lineas_wkp_impl.this.AV44PMDPreKgm = GXv_decimal12[0] ;
      tpromd_lineas_wkp_impl.this.AV45PMDEntKgm = GXv_decimal13[0] ;
      tpromd_lineas_wkp_impl.this.AV46PMDDtoTin = GXv_decimal14[0] ;
      tpromd_lineas_wkp_impl.this.AV47PMDDtoAca = GXv_decimal15[0] ;
      tpromd_lineas_wkp_impl.this.AV49PMDValFch = GXv_date16[0] ;
      tpromd_lineas_wkp_impl.this.AV51PMDColCli = GXv_char4[0] ;
      tpromd_lineas_wkp_impl.this.AV52PMDConCod = GXv_int9[0] ;
      tpromd_lineas_wkp_impl.this.AV48PMDPreUni = GXv_decimal17[0] ;
      tpromd_lineas_wkp_impl.this.AV53PMDColNom = GXv_char3[0] ;
      tpromd_lineas_wkp_impl.this.AV57ProMD1 = GXv_int18[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44PMDPreKgm", GXutil.ltrimstr( AV44PMDPreKgm, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV45PMDEntKgm", GXutil.ltrimstr( AV45PMDEntKgm, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV46PMDDtoTin", GXutil.ltrimstr( AV46PMDDtoTin, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV47PMDDtoAca", GXutil.ltrimstr( AV47PMDDtoAca, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV49PMDValFch", localUtil.format(AV49PMDValFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV51PMDColCli", AV51PMDColCli);
      httpContext.ajax_rsp_assign_attri("", false, "AV52PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52PMDConCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV48PMDPreUni", GXutil.ltrimstr( AV48PMDPreUni, 14, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV53PMDColNom", AV53PMDColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV57ProMD1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57ProMD1), 4, 0));
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e182B62 ();
      if (returnInSub) return;
   }

   public void e182B62( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV50PMDColNum) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta valor en #", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavPmdcolnum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV46PMDDtoTin)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48PMDPreUni)==0) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Falta valor Desc T(%)", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavPmddtotin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44PMDPreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45PMDEntKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV47PMDDtoAca)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV48PMDPreUni)==0) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Faltan valor en: Quilos Prev.,Quilos Ent.,Desc A(%),Preço Unico  ", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavPmdprekgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV44PMDPreKgm)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV45PMDEntKgm)==0) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Faltan valor en: Quilos Prev.,Quilos Ent.  ", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavPmdprekgm_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  httpContext.doAjaxRefresh();
               }
               else
               {
                  if ( GXutil.strcmp(AV59ForBlo, httpContext.getMessage( "S", "")) == 0 )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "Color Bloqueado", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavPmdconcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                     httpContext.doAjaxRefresh();
                  }
                  else
                  {
                     new app.facturacion.tpromd_lineas_insupd(remoteHandle, context).execute( AV39emprcod, AV40CliCod, AV42PMDCod, AV50PMDColNum, AV44PMDPreKgm, AV45PMDEntKgm, AV46PMDDtoTin, AV47PMDDtoAca, AV49PMDValFch, AV51PMDColCli, AV52PMDConCod, AV48PMDPreUni) ;
                     AV51PMDColCli = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV51PMDColCli", AV51PMDColCli);
                     AV52PMDConCod = 0 ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV52PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52PMDConCod), 6, 0));
                     AV47PMDDtoAca = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV47PMDDtoAca", GXutil.ltrimstr( AV47PMDDtoAca, 6, 2));
                     AV46PMDDtoTin = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV46PMDDtoTin", GXutil.ltrimstr( AV46PMDDtoTin, 6, 2));
                     AV45PMDEntKgm = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV45PMDEntKgm", GXutil.ltrimstr( AV45PMDEntKgm, 9, 2));
                     AV44PMDPreKgm = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV44PMDPreKgm", GXutil.ltrimstr( AV44PMDPreKgm, 9, 2));
                     AV48PMDPreUni = DecimalUtil.ZERO ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV48PMDPreUni", GXutil.ltrimstr( AV48PMDPreUni, 14, 5));
                     AV49PMDValFch = GXutil.nullDate() ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV49PMDValFch", localUtil.format(AV49PMDValFch, "99/99/99"));
                     AV53PMDColNom = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV53PMDColNom", AV53PMDColNom);
                     GX_FocusControl = edtavPmdcolnum_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                     httpContext.doAjaxRefresh();
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e192B62( )
   {
      /* Pmdconcod_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_int9[0] = AV52PMDConCod ;
      GXv_char4[0] = AV53PMDColNom ;
      GXv_char3[0] = AV59ForBlo ;
      new app.facturacion.tpromd_lineas_forcolnom(remoteHandle, context).execute( AV39emprcod, AV40CliCod, GXv_int9, GXv_char4, GXv_char3) ;
      tpromd_lineas_wkp_impl.this.AV52PMDConCod = GXv_int9[0] ;
      tpromd_lineas_wkp_impl.this.AV53PMDColNom = GXv_char4[0] ;
      tpromd_lineas_wkp_impl.this.AV59ForBlo = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52PMDConCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52PMDConCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV53PMDColNom", AV53PMDColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV59ForBlo", AV59ForBlo);
      if ( GXutil.strcmp(AV59ForBlo, "S") == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Color Bloqueado", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavPmdconcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
      cmbavForblo.setValue( GXutil.rtrim( AV59ForBlo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavForblo.getInternalname(), "Values", cmbavForblo.ToJavascriptSource(), true);
   }

   public void wb_table1_133_2B62( boolean wbgen )
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
         wb_table1_133_2B62e( true) ;
      }
      else
      {
         wb_table1_133_2B62e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV39emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39emprcod", AV39emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39emprcod, "@!"))));
      AV40CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV40CliCod), "ZZZZZ9")));
      AV41CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41CliNom", AV41CliNom);
      AV42PMDCod = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42PMDCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42PMDCod), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPMDCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV42PMDCod), "ZZZ9")));
      AV43PMDDsc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43PMDDsc", AV43PMDDsc);
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
      pa2B62( ) ;
      ws2B62( ) ;
      we2B62( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116152029", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tpromd_lineas_wkp.js", "?202682116152030", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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

   public void subsflControlProps_1072( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_107_idx );
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_107_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_107_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_107_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_107_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_107_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_107_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_107_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_107_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_107_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_107_idx ;
   }

   public void subsflControlProps_fel_1072( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_107_fel_idx );
      edtPMDColNum_Internalname = "PMDCOLNUM_"+sGXsfl_107_fel_idx ;
      edtPMDColCli_Internalname = "PMDCOLCLI_"+sGXsfl_107_fel_idx ;
      edtPMDConCod_Internalname = "PMDCONCOD_"+sGXsfl_107_fel_idx ;
      edtPMDColNom_Internalname = "PMDCOLNOM_"+sGXsfl_107_fel_idx ;
      edtPMDPreKgm_Internalname = "PMDPREKGM_"+sGXsfl_107_fel_idx ;
      edtPMDEntKgm_Internalname = "PMDENTKGM_"+sGXsfl_107_fel_idx ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN_"+sGXsfl_107_fel_idx ;
      edtPMDDtoAca_Internalname = "PMDDTOACA_"+sGXsfl_107_fel_idx ;
      edtPMDPreUni_Internalname = "PMDPREUNI_"+sGXsfl_107_fel_idx ;
      edtPMDValFch_Internalname = "PMDVALFCH_"+sGXsfl_107_fel_idx ;
   }

   public void sendrow_1072( )
   {
      subsflControlProps_1072( ) ;
      wb2B60( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_107_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_107_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_107_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 108,'',false,'"+sGXsfl_107_idx+"',107)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_107_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV58GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV58GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV58GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e232b62_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,108);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV58GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_107_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8393PMDColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColCli_Internalname,GXutil.rtrim( A8530PMDColCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDConCod_Internalname,GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A8531PMDConCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDConCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDColNom_Internalname,GXutil.rtrim( A8394PMDColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8395PMDPreKgm, "ZZZ,ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDEntKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8396PMDEntKgm, "ZZZ,ZZ9.99 ")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDEntKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoTin_Internalname,GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8397PMDDtoTin, "ZZ9.99 ")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDDtoAca_Internalname,GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8398PMDDtoAca, "ZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDDtoAca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDPreUni_Internalname,GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A8532PMDPreUni, "ZZZZZZ9.999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDPreUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPMDValFch_Internalname,localUtil.format(A8399PMDValFch, "99/99/99"),localUtil.format( A8399PMDValFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPMDValFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(107),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2B62( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_107_idx = ((subGrid_Islastpage==1)&&(nGXsfl_107_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_107_idx+1) ;
         sGXsfl_107_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_107_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1072( ) ;
      }
      /* End function sendrow_1072 */
   }

   public void startgridcontrol107( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"107\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos Prev.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Quilos Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc T(%)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Desc A(%)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Preço Unico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validade", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8393PMDColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8530PMDColCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8531PMDConCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A8394PMDColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8395PMDPreKgm, (byte)(10), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8396PMDEntKgm, (byte)(11), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8397PMDDtoTin, (byte)(7), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8398PMDDtoAca, (byte)(6), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8532PMDPreUni, (byte)(14), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A8399PMDValFch, "99/99/99"));
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
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavPmdcod_Internalname = "vPMDCOD" ;
      edtavPmddsc_Internalname = "vPMDDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPmdcolnum_Internalname = "vPMDCOLNUM" ;
      edtavPmdcolcli_Internalname = "vPMDCOLCLI" ;
      edtavPmdconcod_Internalname = "vPMDCONCOD" ;
      edtavPmdcolnom_Internalname = "vPMDCOLNOM" ;
      cmbavForblo.setInternalname( "vFORBLO" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavPmdprekgm_Internalname = "vPMDPREKGM" ;
      edtavPmdentkgm_Internalname = "vPMDENTKGM" ;
      edtavPmddtotin_Internalname = "vPMDDTOTIN" ;
      edtavPmddtoaca_Internalname = "vPMDDTOACA" ;
      edtavPmdpreuni_Internalname = "vPMDPREUNI" ;
      edtavPmdvalfch_Internalname = "vPMDVALFCH" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnlimpiarvariables_Internalname = "BTNLIMPIARVARIABLES" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtPMDColNum_Internalname = "PMDCOLNUM" ;
      edtPMDColCli_Internalname = "PMDCOLCLI" ;
      edtPMDConCod_Internalname = "PMDCONCOD" ;
      edtPMDColNom_Internalname = "PMDCOLNOM" ;
      edtPMDPreKgm_Internalname = "PMDPREKGM" ;
      edtPMDEntKgm_Internalname = "PMDENTKGM" ;
      edtPMDDtoTin_Internalname = "PMDDTOTIN" ;
      edtPMDDtoAca_Internalname = "PMDDTOACA" ;
      edtPMDPreUni_Internalname = "PMDPREUNI" ;
      edtPMDValFch_Internalname = "PMDVALFCH" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_pmdvalfchauxdate_Internalname = "vDDO_PMDVALFCHAUXDATE" ;
      divDdo_pmdvalfchauxdates_Internalname = "DDO_PMDVALFCHAUXDATES" ;
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
      edtPMDValFch_Jsonclick = "" ;
      edtPMDPreUni_Jsonclick = "" ;
      edtPMDDtoAca_Jsonclick = "" ;
      edtPMDDtoTin_Jsonclick = "" ;
      edtPMDEntKgm_Jsonclick = "" ;
      edtPMDPreKgm_Jsonclick = "" ;
      edtPMDColNom_Jsonclick = "" ;
      edtPMDConCod_Jsonclick = "" ;
      edtPMDColCli_Jsonclick = "" ;
      edtPMDColNum_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_pmdvalfchauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "" ;
      edtavPmdvalfch_Jsonclick = "" ;
      edtavPmdvalfch_Enabled = 1 ;
      edtavPmdpreuni_Jsonclick = "" ;
      edtavPmdpreuni_Enabled = 1 ;
      edtavPmddtoaca_Jsonclick = "" ;
      edtavPmddtoaca_Enabled = 1 ;
      edtavPmddtotin_Jsonclick = "" ;
      edtavPmddtotin_Enabled = 1 ;
      edtavPmdentkgm_Jsonclick = "" ;
      edtavPmdentkgm_Enabled = 1 ;
      edtavPmdprekgm_Jsonclick = "" ;
      edtavPmdprekgm_Enabled = 1 ;
      cmbavForblo.setJsonclick( "" );
      cmbavForblo.setEnabled( 1 );
      edtavPmdcolnom_Jsonclick = "" ;
      edtavPmdcolnom_Enabled = 1 ;
      edtavPmdconcod_Jsonclick = "" ;
      edtavPmdconcod_Enabled = 1 ;
      edtavPmdcolcli_Jsonclick = "" ;
      edtavPmdcolcli_Enabled = 1 ;
      edtavPmdcolnum_Jsonclick = "" ;
      edtavPmdcolnum_Enabled = 1 ;
      edtavPmddsc_Jsonclick = "" ;
      edtavPmddsc_Enabled = 0 ;
      edtavPmdcod_Jsonclick = "" ;
      edtavPmdcod_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "Facturacion.TProMD_lineas_WKPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic||Dynamic||||||" ;
      Ddo_grid_Includedatalist = "|T||T||||||" ;
      Ddo_grid_Filterisrange = "T||T||T|T|T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Numeric|Character|Numeric|Numeric|Numeric|Numeric|Numeric|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T|T|T||T|T|T|T|T|T" ;
      Ddo_grid_Columnssortvalues = "1|2|3||4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "1:PMDColNum|2:PMDColCli|3:PMDConCod|4:PMDColNom|5:PMDPreKgm|6:PMDEntKgm|7:PMDDtoTin|8:PMDDtoAca|9:PMDPreUni|10:PMDValFch" ;
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
      Form.setCaption( httpContext.getMessage( " Programas, Lineas ", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavForblo.setName( "vFORBLO" );
      cmbavForblo.setWebtags( "" );
      cmbavForblo.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavForblo.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavForblo.getItemCount() > 0 )
      {
         AV59ForBlo = cmbavForblo.getValidValue(AV59ForBlo) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59ForBlo", AV59ForBlo);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_107_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV58GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV58GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV50PMDColNum',fld:'vPMDCOLNUM',pic:'ZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112B62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122B62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132B62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e222B62',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV58GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e232B62',iparms:[{av:'cmbavGridactions'},{av:'AV58GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true},{av:'A8393PMDColNum',fld:'PMDCOLNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV58GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142B62',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true},{av:'A8393PMDColNum',fld:'PMDCOLNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV50PMDColNum',fld:'vPMDCOLNUM',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOLIMPIARVARIABLES'","{handler:'e152B62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOLIMPIARVARIABLES'",",oparms:[{av:'AV51PMDColCli',fld:'vPMDCOLCLI',pic:''},{av:'AV52PMDConCod',fld:'vPMDCONCOD',pic:'ZZZZZ9'},{av:'AV47PMDDtoAca',fld:'vPMDDTOACA',pic:'ZZ9.99'},{av:'AV46PMDDtoTin',fld:'vPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV45PMDEntKgm',fld:'vPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV44PMDPreKgm',fld:'vPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV48PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV49PMDValFch',fld:'vPMDVALFCH',pic:''},{av:'AV53PMDColNom',fld:'vPMDCOLNOM',pic:''},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV50PMDColNum',fld:'vPMDCOLNUM',pic:'ZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e162B62',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPMDCOLNUM.CONTROLVALUECHANGED","{handler:'e172B62',iparms:[{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV50PMDColNum',fld:'vPMDCOLNUM',pic:'ZZZZZ9'}]");
      setEventMetadata("VPMDCOLNUM.CONTROLVALUECHANGED",",oparms:[{av:'AV57ProMD1',fld:'vPROMD1',pic:'ZZZ9'},{av:'AV53PMDColNom',fld:'vPMDCOLNOM',pic:''},{av:'AV48PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV52PMDConCod',fld:'vPMDCONCOD',pic:'ZZZZZ9'},{av:'AV51PMDColCli',fld:'vPMDCOLCLI',pic:''},{av:'AV49PMDValFch',fld:'vPMDVALFCH',pic:''},{av:'AV47PMDDtoAca',fld:'vPMDDTOACA',pic:'ZZ9.99'},{av:'AV46PMDDtoTin',fld:'vPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV45PMDEntKgm',fld:'vPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV44PMDPreKgm',fld:'vPMDPREKGM',pic:'ZZZ,ZZ9.99'}]}");
      setEventMetadata("ENTER","{handler:'e182B62',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV42PMDCod',fld:'vPMDCOD',pic:'ZZZ9',hsh:true},{av:'AV15TFPMDColNum',fld:'vTFPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV16TFPMDColNum_To',fld:'vTFPMDCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV17TFPMDColCli',fld:'vTFPMDCOLCLI',pic:''},{av:'AV18TFPMDColCli_Sel',fld:'vTFPMDCOLCLI_SEL',pic:''},{av:'AV19TFPMDConCod',fld:'vTFPMDCONCOD',pic:'ZZZZZ9'},{av:'AV20TFPMDConCod_To',fld:'vTFPMDCONCOD_TO',pic:'ZZZZZ9'},{av:'AV21TFPMDColNom',fld:'vTFPMDCOLNOM',pic:''},{av:'AV22TFPMDColNom_Sel',fld:'vTFPMDCOLNOM_SEL',pic:''},{av:'AV23TFPMDPreKgm',fld:'vTFPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV24TFPMDPreKgm_To',fld:'vTFPMDPREKGM_TO',pic:'ZZZ,ZZ9.99'},{av:'AV25TFPMDEntKgm',fld:'vTFPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV26TFPMDEntKgm_To',fld:'vTFPMDENTKGM_TO',pic:'ZZZ,ZZ9.99 '},{av:'AV27TFPMDDtoTin',fld:'vTFPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV28TFPMDDtoTin_To',fld:'vTFPMDDTOTIN_TO',pic:'ZZ9.99 '},{av:'AV29TFPMDDtoAca',fld:'vTFPMDDTOACA',pic:'ZZ9.99'},{av:'AV30TFPMDDtoAca_To',fld:'vTFPMDDTOACA_TO',pic:'ZZ9.99'},{av:'AV31TFPMDPreUni',fld:'vTFPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV32TFPMDPreUni_To',fld:'vTFPMDPREUNI_TO',pic:'ZZZZZZ9.999'},{av:'AV33TFPMDValFch',fld:'vTFPMDVALFCH',pic:''},{av:'AV62Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A8391PMDCod',fld:'PMDCOD',pic:'ZZZ9',hsh:true},{av:'AV50PMDColNum',fld:'vPMDCOLNUM',pic:'ZZZZZ9'},{av:'AV46PMDDtoTin',fld:'vPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV48PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV44PMDPreKgm',fld:'vPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV45PMDEntKgm',fld:'vPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV47PMDDtoAca',fld:'vPMDDTOACA',pic:'ZZ9.99'},{av:'cmbavForblo'},{av:'AV59ForBlo',fld:'vFORBLO',pic:'@!'},{av:'AV52PMDConCod',fld:'vPMDCONCOD',pic:'ZZZZZ9'},{av:'AV49PMDValFch',fld:'vPMDVALFCH',pic:''},{av:'AV51PMDColCli',fld:'vPMDCOLCLI',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV51PMDColCli',fld:'vPMDCOLCLI',pic:''},{av:'AV52PMDConCod',fld:'vPMDCONCOD',pic:'ZZZZZ9'},{av:'AV47PMDDtoAca',fld:'vPMDDTOACA',pic:'ZZ9.99'},{av:'AV46PMDDtoTin',fld:'vPMDDTOTIN',pic:'ZZ9.99 '},{av:'AV45PMDEntKgm',fld:'vPMDENTKGM',pic:'ZZZ,ZZ9.99 '},{av:'AV44PMDPreKgm',fld:'vPMDPREKGM',pic:'ZZZ,ZZ9.99'},{av:'AV48PMDPreUni',fld:'vPMDPREUNI',pic:'ZZZZZZ9.999'},{av:'AV49PMDValFch',fld:'vPMDVALFCH',pic:''},{av:'AV53PMDColNom',fld:'vPMDCOLNOM',pic:''},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV50PMDColNum',fld:'vPMDCOLNUM',pic:'ZZZZZ9'}]}");
      setEventMetadata("VPMDCONCOD.CONTROLVALUECHANGED","{handler:'e192B62',iparms:[{av:'AV39emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV40CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV52PMDConCod',fld:'vPMDCONCOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VPMDCONCOD.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'cmbavForblo'},{av:'AV59ForBlo',fld:'vFORBLO',pic:'@!'},{av:'AV53PMDColNom',fld:'vPMDCOLNOM',pic:''},{av:'AV52PMDConCod',fld:'vPMDCONCOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALIDV_CLICOD","{handler:'validv_Clicod',iparms:[]");
      setEventMetadata("VALIDV_CLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_PMDCOD","{handler:'validv_Pmdcod',iparms:[]");
      setEventMetadata("VALIDV_PMDCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDCONCOD","{handler:'valid_Pmdconcod',iparms:[]");
      setEventMetadata("VALID_PMDCONCOD",",oparms:[]}");
      setEventMetadata("VALID_PMDCOLNOM","{handler:'valid_Pmdcolnom',iparms:[]");
      setEventMetadata("VALID_PMDCOLNOM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pmdvalfch',iparms:[]");
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
      wcpOAV39emprcod = "" ;
      wcpOAV41CliNom = "" ;
      wcpOAV43PMDDsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV39emprcod = "" ;
      AV41CliNom = "" ;
      AV43PMDDsc = "" ;
      AV17TFPMDColCli = "" ;
      AV18TFPMDColCli_Sel = "" ;
      AV21TFPMDColNom = "" ;
      AV22TFPMDColNom_Sel = "" ;
      AV23TFPMDPreKgm = DecimalUtil.ZERO ;
      AV24TFPMDPreKgm_To = DecimalUtil.ZERO ;
      AV25TFPMDEntKgm = DecimalUtil.ZERO ;
      AV26TFPMDEntKgm_To = DecimalUtil.ZERO ;
      AV27TFPMDDtoTin = DecimalUtil.ZERO ;
      AV28TFPMDDtoTin_To = DecimalUtil.ZERO ;
      AV29TFPMDDtoAca = DecimalUtil.ZERO ;
      AV30TFPMDDtoAca_To = DecimalUtil.ZERO ;
      AV31TFPMDPreUni = DecimalUtil.ZERO ;
      AV32TFPMDPreUni_To = DecimalUtil.ZERO ;
      AV33TFPMDValFch = GXutil.nullDate() ;
      AV62Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV35DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV82Emprcod_selected = "" ;
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
      AV51PMDColCli = "" ;
      AV53PMDColNom = "" ;
      AV59ForBlo = "" ;
      AV44PMDPreKgm = DecimalUtil.ZERO ;
      AV45PMDEntKgm = DecimalUtil.ZERO ;
      AV46PMDDtoTin = DecimalUtil.ZERO ;
      AV47PMDDtoAca = DecimalUtil.ZERO ;
      AV48PMDPreUni = DecimalUtil.ZERO ;
      AV49PMDValFch = GXutil.nullDate() ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnlimpiarvariables_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV34DDO_PMDValFchAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A8530PMDColCli = "" ;
      A8394PMDColNom = "" ;
      A8395PMDPreKgm = DecimalUtil.ZERO ;
      A8396PMDEntKgm = DecimalUtil.ZERO ;
      A8397PMDDtoTin = DecimalUtil.ZERO ;
      A8398PMDDtoAca = DecimalUtil.ZERO ;
      A8532PMDPreUni = DecimalUtil.ZERO ;
      A8399PMDValFch = GXutil.nullDate() ;
      AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = "" ;
      AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel = "" ;
      AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom = "" ;
      AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel = "" ;
      AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm = DecimalUtil.ZERO ;
      AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to = DecimalUtil.ZERO ;
      AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm = DecimalUtil.ZERO ;
      AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to = DecimalUtil.ZERO ;
      AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin = DecimalUtil.ZERO ;
      AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to = DecimalUtil.ZERO ;
      AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca = DecimalUtil.ZERO ;
      AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to = DecimalUtil.ZERO ;
      AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni = DecimalUtil.ZERO ;
      AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to = DecimalUtil.ZERO ;
      AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch = GXutil.nullDate() ;
      scmdbuf = "" ;
      lV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli = "" ;
      H02B62_A8391PMDCod = new short[1] ;
      H02B62_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      H02B62_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B62_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B62_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B62_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B62_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B62_A8530PMDColCli = new String[] {""} ;
      H02B62_A8393PMDColNum = new int[1] ;
      H02B62_A8531PMDConCod = new int[1] ;
      H02B62_A252CliCod = new int[1] ;
      H02B62_A396EmprCod = new String[] {""} ;
      H02B63_A8391PMDCod = new short[1] ;
      H02B63_A8399PMDValFch = new java.util.Date[] {GXutil.nullDate()} ;
      H02B63_A8532PMDPreUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B63_A8398PMDDtoAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B63_A8397PMDDtoTin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B63_A8396PMDEntKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B63_A8395PMDPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B63_A8530PMDColCli = new String[] {""} ;
      H02B63_A8393PMDColNum = new int[1] ;
      H02B63_A8531PMDConCod = new int[1] ;
      H02B63_A252CliCod = new int[1] ;
      H02B63_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV54Station = "" ;
      GXv_char2 = new String[1] ;
      AV55EmprNom = "" ;
      AV56UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char10 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState11 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int18 = new short[1] ;
      GXv_int9 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tpromd_lineas_wkp__default(),
         new Object[] {
             new Object[] {
            H02B62_A8391PMDCod, H02B62_A8399PMDValFch, H02B62_A8532PMDPreUni, H02B62_A8398PMDDtoAca, H02B62_A8397PMDDtoTin, H02B62_A8396PMDEntKgm, H02B62_A8395PMDPreKgm, H02B62_A8530PMDColCli, H02B62_A8393PMDColNum, H02B62_A8531PMDConCod,
            H02B62_A252CliCod, H02B62_A396EmprCod
            }
            , new Object[] {
            H02B63_A8391PMDCod, H02B63_A8399PMDValFch, H02B63_A8532PMDPreUni, H02B63_A8398PMDDtoAca, H02B63_A8397PMDDtoTin, H02B63_A8396PMDEntKgm, H02B63_A8395PMDPreKgm, H02B63_A8530PMDColCli, H02B63_A8393PMDColNum, H02B63_A8531PMDConCod,
            H02B63_A252CliCod, H02B63_A396EmprCod
            }
         }
      );
      AV62Pgmname = "Facturacion.TProMD_lineas_WKP" ;
      /* GeneXus formulas. */
      AV62Pgmname = "Facturacion.TProMD_lineas_WKP" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavPmdcod_Enabled = 0 ;
      edtavPmddsc_Enabled = 0 ;
      edtavPmdcolnom_Enabled = 0 ;
      cmbavForblo.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
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
   private short wcpOAV42PMDCod ;
   private short AV42PMDCod ;
   private short AV12OrderedBy ;
   private short A8391PMDCod ;
   private short AV57ProMD1 ;
   private short AV84Pmdcod_selected ;
   private short wbEnd ;
   private short wbStart ;
   private short AV58GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int18[] ;
   private int wcpOAV40CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_107 ;
   private int AV40CliCod ;
   private int nGXsfl_107_idx=1 ;
   private int AV15TFPMDColNum ;
   private int AV16TFPMDColNum_To ;
   private int AV19TFPMDConCod ;
   private int AV20TFPMDConCod_To ;
   private int A252CliCod ;
   private int AV83Clicod_selected ;
   private int AV85Pmdcolnum_selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavPmdcod_Enabled ;
   private int edtavPmddsc_Enabled ;
   private int AV50PMDColNum ;
   private int edtavPmdcolnum_Enabled ;
   private int edtavPmdcolcli_Enabled ;
   private int AV52PMDConCod ;
   private int edtavPmdconcod_Enabled ;
   private int edtavPmdcolnom_Enabled ;
   private int edtavPmdprekgm_Enabled ;
   private int edtavPmdentkgm_Enabled ;
   private int edtavPmddtotin_Enabled ;
   private int edtavPmddtoaca_Enabled ;
   private int edtavPmdpreuni_Enabled ;
   private int edtavPmdvalfch_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A8393PMDColNum ;
   private int A8531PMDConCod ;
   private int subGrid_Islastpage ;
   private int AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum ;
   private int AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to ;
   private int AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod ;
   private int AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to ;
   private int GXt_int8 ;
   private int AV36PageToGo ;
   private int AV86GXV1 ;
   private int GXv_int9[] ;
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
   private java.math.BigDecimal AV23TFPMDPreKgm ;
   private java.math.BigDecimal AV24TFPMDPreKgm_To ;
   private java.math.BigDecimal AV25TFPMDEntKgm ;
   private java.math.BigDecimal AV26TFPMDEntKgm_To ;
   private java.math.BigDecimal AV27TFPMDDtoTin ;
   private java.math.BigDecimal AV28TFPMDDtoTin_To ;
   private java.math.BigDecimal AV29TFPMDDtoAca ;
   private java.math.BigDecimal AV30TFPMDDtoAca_To ;
   private java.math.BigDecimal AV31TFPMDPreUni ;
   private java.math.BigDecimal AV32TFPMDPreUni_To ;
   private java.math.BigDecimal AV44PMDPreKgm ;
   private java.math.BigDecimal AV45PMDEntKgm ;
   private java.math.BigDecimal AV46PMDDtoTin ;
   private java.math.BigDecimal AV47PMDDtoAca ;
   private java.math.BigDecimal AV48PMDPreUni ;
   private java.math.BigDecimal A8395PMDPreKgm ;
   private java.math.BigDecimal A8396PMDEntKgm ;
   private java.math.BigDecimal A8397PMDDtoTin ;
   private java.math.BigDecimal A8398PMDDtoAca ;
   private java.math.BigDecimal A8532PMDPreUni ;
   private java.math.BigDecimal AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ;
   private java.math.BigDecimal AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ;
   private java.math.BigDecimal AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ;
   private java.math.BigDecimal AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ;
   private java.math.BigDecimal AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ;
   private java.math.BigDecimal AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ;
   private java.math.BigDecimal AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ;
   private java.math.BigDecimal AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ;
   private java.math.BigDecimal AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ;
   private java.math.BigDecimal AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String wcpOAV39emprcod ;
   private String wcpOAV41CliNom ;
   private String wcpOAV43PMDDsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV39emprcod ;
   private String AV41CliNom ;
   private String AV43PMDDsc ;
   private String sGXsfl_107_idx="0001" ;
   private String AV17TFPMDColCli ;
   private String AV18TFPMDColCli_Sel ;
   private String AV21TFPMDColNom ;
   private String AV22TFPMDColNom_Sel ;
   private String AV62Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV82Emprcod_selected ;
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
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String edtavPmdcod_Internalname ;
   private String edtavPmdcod_Jsonclick ;
   private String edtavPmddsc_Internalname ;
   private String edtavPmddsc_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPmdcolnum_Internalname ;
   private String TempTags ;
   private String edtavPmdcolnum_Jsonclick ;
   private String edtavPmdcolcli_Internalname ;
   private String AV51PMDColCli ;
   private String edtavPmdcolcli_Jsonclick ;
   private String edtavPmdconcod_Internalname ;
   private String edtavPmdconcod_Jsonclick ;
   private String edtavPmdcolnom_Internalname ;
   private String AV53PMDColNom ;
   private String edtavPmdcolnom_Jsonclick ;
   private String AV59ForBlo ;
   private String divUnnamedtable3_Internalname ;
   private String edtavPmdprekgm_Internalname ;
   private String edtavPmdprekgm_Jsonclick ;
   private String edtavPmdentkgm_Internalname ;
   private String edtavPmdentkgm_Jsonclick ;
   private String edtavPmddtotin_Internalname ;
   private String edtavPmddtotin_Jsonclick ;
   private String edtavPmddtoaca_Internalname ;
   private String edtavPmddtoaca_Jsonclick ;
   private String edtavPmdpreuni_Internalname ;
   private String edtavPmdpreuni_Jsonclick ;
   private String edtavPmdvalfch_Internalname ;
   private String edtavPmdvalfch_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnlimpiarvariables_Internalname ;
   private String bttBtnlimpiarvariables_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_pmdvalfchauxdates_Internalname ;
   private String edtavDdo_pmdvalfchauxdate_Internalname ;
   private String edtavDdo_pmdvalfchauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtPMDColNum_Internalname ;
   private String A8530PMDColCli ;
   private String edtPMDColCli_Internalname ;
   private String edtPMDConCod_Internalname ;
   private String A8394PMDColNom ;
   private String edtPMDColNom_Internalname ;
   private String edtPMDPreKgm_Internalname ;
   private String edtPMDEntKgm_Internalname ;
   private String edtPMDDtoTin_Internalname ;
   private String edtPMDDtoAca_Internalname ;
   private String edtPMDPreUni_Internalname ;
   private String edtPMDValFch_Internalname ;
   private String AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ;
   private String AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ;
   private String AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ;
   private String AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ;
   private String scmdbuf ;
   private String lV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ;
   private String hsh ;
   private String AV54Station ;
   private String GXv_char2[] ;
   private String AV55EmprNom ;
   private String AV56UsurCod ;
   private String GXt_char10 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String sGXsfl_107_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPMDColNum_Jsonclick ;
   private String edtPMDColCli_Jsonclick ;
   private String edtPMDConCod_Jsonclick ;
   private String edtPMDColNom_Jsonclick ;
   private String edtPMDPreKgm_Jsonclick ;
   private String edtPMDEntKgm_Jsonclick ;
   private String edtPMDDtoTin_Jsonclick ;
   private String edtPMDDtoAca_Jsonclick ;
   private String edtPMDPreUni_Jsonclick ;
   private String edtPMDValFch_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV33TFPMDValFch ;
   private java.util.Date AV49PMDValFch ;
   private java.util.Date AV34DDO_PMDValFchAuxDate ;
   private java.util.Date A8399PMDValFch ;
   private java.util.Date AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ;
   private java.util.Date GXv_date16[] ;
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
   private boolean bGXsfl_107_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavForblo ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private short[] H02B62_A8391PMDCod ;
   private java.util.Date[] H02B62_A8399PMDValFch ;
   private java.math.BigDecimal[] H02B62_A8532PMDPreUni ;
   private java.math.BigDecimal[] H02B62_A8398PMDDtoAca ;
   private java.math.BigDecimal[] H02B62_A8397PMDDtoTin ;
   private java.math.BigDecimal[] H02B62_A8396PMDEntKgm ;
   private java.math.BigDecimal[] H02B62_A8395PMDPreKgm ;
   private String[] H02B62_A8530PMDColCli ;
   private int[] H02B62_A8393PMDColNum ;
   private int[] H02B62_A8531PMDConCod ;
   private int[] H02B62_A252CliCod ;
   private String[] H02B62_A396EmprCod ;
   private short[] H02B63_A8391PMDCod ;
   private java.util.Date[] H02B63_A8399PMDValFch ;
   private java.math.BigDecimal[] H02B63_A8532PMDPreUni ;
   private java.math.BigDecimal[] H02B63_A8398PMDDtoAca ;
   private java.math.BigDecimal[] H02B63_A8397PMDDtoTin ;
   private java.math.BigDecimal[] H02B63_A8396PMDEntKgm ;
   private java.math.BigDecimal[] H02B63_A8395PMDPreKgm ;
   private String[] H02B63_A8530PMDColCli ;
   private int[] H02B63_A8393PMDColNum ;
   private int[] H02B63_A8531PMDConCod ;
   private int[] H02B63_A252CliCod ;
   private String[] H02B63_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState11[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV35DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class tpromd_lineas_wkp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02B62( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum ,
                                          int AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to ,
                                          String AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                          String AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                          int AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod ,
                                          int AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to ,
                                          java.math.BigDecimal AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                          java.math.BigDecimal AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                          java.math.BigDecimal AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                          java.math.BigDecimal AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                          java.math.BigDecimal AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                          java.math.BigDecimal AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                          java.math.BigDecimal AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                          java.util.Date AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                          String AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                          String A8394PMDColNom ,
                                          String AV39emprcod ,
                                          int AV40CliCod ,
                                          short AV42PMDCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          short A8391PMDCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[20];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT PMDCod, PMDValFch, PMDPreUni, PMDDtoAca, PMDDtoTin, PMDEntKgm, PMDPreKgm, PMDColCli, PMDColNum, PMDConCod, CliCod, EmprCod FROM TXPProMD1" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and PMDCod = ?)");
      if ( ! (0==AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(PMDColNum >= ?)");
      }
      else
      {
         GXv_int19[3] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(PMDColNum <= ?)");
      }
      else
      {
         GXv_int19[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(PMDColCli = ?)");
      }
      else
      {
         GXv_int19[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) )
      {
         addWhere(sWhereString, "(PMDConCod >= ?)");
      }
      else
      {
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(PMDConCod <= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(PMDValFch >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDColNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDColCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDColCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDConCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDConCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDPreKgm" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDPreKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDEntKgm" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDEntKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDDtoTin" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDDtoTin DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDDtoAca" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDDtoAca DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDPreUni" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDPreUni DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDValFch" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDValFch DESC" ;
      }
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H02B63( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum ,
                                          int AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to ,
                                          String AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel ,
                                          String AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli ,
                                          int AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod ,
                                          int AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to ,
                                          java.math.BigDecimal AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm ,
                                          java.math.BigDecimal AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to ,
                                          java.math.BigDecimal AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm ,
                                          java.math.BigDecimal AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to ,
                                          java.math.BigDecimal AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin ,
                                          java.math.BigDecimal AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to ,
                                          java.math.BigDecimal AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca ,
                                          java.math.BigDecimal AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to ,
                                          java.math.BigDecimal AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni ,
                                          java.math.BigDecimal AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to ,
                                          java.util.Date AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch ,
                                          int A8393PMDColNum ,
                                          String A8530PMDColCli ,
                                          int A8531PMDConCod ,
                                          java.math.BigDecimal A8395PMDPreKgm ,
                                          java.math.BigDecimal A8396PMDEntKgm ,
                                          java.math.BigDecimal A8397PMDDtoTin ,
                                          java.math.BigDecimal A8398PMDDtoAca ,
                                          java.math.BigDecimal A8532PMDPreUni ,
                                          java.util.Date A8399PMDValFch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Facturacion_tpromd_lineas_wkpds_8_tfpmdcolnom_sel ,
                                          String AV69Facturacion_tpromd_lineas_wkpds_7_tfpmdcolnom ,
                                          String A8394PMDColNom ,
                                          String AV39emprcod ,
                                          int AV40CliCod ,
                                          short AV42PMDCod ,
                                          String A396EmprCod ,
                                          int A252CliCod ,
                                          short A8391PMDCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[20];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT PMDCod, PMDValFch, PMDPreUni, PMDDtoAca, PMDDtoTin, PMDEntKgm, PMDPreKgm, PMDColCli, PMDColNum, PMDConCod, CliCod, EmprCod FROM TXPProMD1" ;
      addWhere(sWhereString, "(EmprCod = ? and CliCod = ? and PMDCod = ?)");
      if ( ! (0==AV63Facturacion_tpromd_lineas_wkpds_1_tfpmdcolnum) )
      {
         addWhere(sWhereString, "(PMDColNum >= ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( ! (0==AV64Facturacion_tpromd_lineas_wkpds_2_tfpmdcolnum_to) )
      {
         addWhere(sWhereString, "(PMDColNum <= ?)");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) && ( ! (GXutil.strcmp("", AV65Facturacion_tpromd_lineas_wkpds_3_tfpmdcolcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(PMDColCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66Facturacion_tpromd_lineas_wkpds_4_tfpmdcolcli_sel)==0) )
      {
         addWhere(sWhereString, "(PMDColCli = ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (0==AV67Facturacion_tpromd_lineas_wkpds_5_tfpmdconcod) )
      {
         addWhere(sWhereString, "(PMDConCod >= ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (0==AV68Facturacion_tpromd_lineas_wkpds_6_tfpmdconcod_to) )
      {
         addWhere(sWhereString, "(PMDConCod <= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV71Facturacion_tpromd_lineas_wkpds_9_tfpmdprekgm)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm >= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV72Facturacion_tpromd_lineas_wkpds_10_tfpmdprekgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreKgm <= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73Facturacion_tpromd_lineas_wkpds_11_tfpmdentkgm)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm >= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Facturacion_tpromd_lineas_wkpds_12_tfpmdentkgm_to)==0) )
      {
         addWhere(sWhereString, "(PMDEntKgm <= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Facturacion_tpromd_lineas_wkpds_13_tfpmddtotin)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin >= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76Facturacion_tpromd_lineas_wkpds_14_tfpmddtotin_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoTin <= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV77Facturacion_tpromd_lineas_wkpds_15_tfpmddtoaca)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca >= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Facturacion_tpromd_lineas_wkpds_16_tfpmddtoaca_to)==0) )
      {
         addWhere(sWhereString, "(PMDDtoAca <= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Facturacion_tpromd_lineas_wkpds_17_tfpmdpreuni)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV80Facturacion_tpromd_lineas_wkpds_18_tfpmdpreuni_to)==0) )
      {
         addWhere(sWhereString, "(PMDPreUni <= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81Facturacion_tpromd_lineas_wkpds_19_tfpmdvalfch)) )
      {
         addWhere(sWhereString, "(PMDValFch >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDColNum" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDColCli" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDColCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDConCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDConCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDPreKgm" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDPreKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDEntKgm" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDEntKgm DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDDtoTin" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDDtoTin DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDDtoAca" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDDtoAca DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDPreUni" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDPreUni DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY PMDValFch" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY PMDValFch DESC" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H02B62(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() );
            case 1 :
                  return conditional_H02B63(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.util.Date)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Boolean) dynConstraints[27]).booleanValue() , (String)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).shortValue() , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , ((Number) dynConstraints[36]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02B62", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02B63", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 13);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
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
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
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
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 13);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 13);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 2);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[31], 2);
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 2);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 5);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[39]);
               }
               return;
      }
   }

}

