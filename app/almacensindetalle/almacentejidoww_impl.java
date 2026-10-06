package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class almacentejidoww_impl extends GXDataArea
{
   public almacentejidoww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public almacentejidoww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( almacentejidoww_impl.class ));
   }

   public almacentejidoww_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavVaralbrest = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
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
      AV91AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
      AV88CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV89AlbRFenfrom = localUtil.parseDateParm( httpContext.GetPar( "AlbRFenfrom")) ;
      AV90AlbRFento = localUtil.parseDateParm( httpContext.GetPar( "AlbRFento")) ;
      cmbavVaralbrest.fromJSonString( httpContext.GetNextPar( ));
      AV53VarAlbrEst = (byte)(GXutil.lval( httpContext.GetPar( "VarAlbrEst"))) ;
      AV71EmprCod = httpContext.GetPar( "EmprCod") ;
      AV99LoadGridData = GXutil.strtobool( httpContext.GetPar( "LoadGridData")) ;
      AV34TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV35TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV40TFAlbrHor = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbrHor"))) ;
      AV41TFAlbrHor_To = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbrHor_To"))) ;
      AV44TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV45TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV54TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV55TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      AV56TFAlbRPieEnt = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt"))) ;
      AV57TFAlbRPieEnt_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt_To"))) ;
      AV58TFAlbRPieUti = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti"))) ;
      AV59TFAlbRPieUti_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti_To"))) ;
      AV60TFAlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis"))) ;
      AV61TFAlbRPieDis_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV63TFAlbRUni_Sels);
      AV64TFAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt"), ".") ;
      AV65TFAlbRUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt_To"), ".") ;
      AV66TFAlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti"), ".") ;
      AV67TFAlbRUniUti_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti_To"), ".") ;
      AV68TFAlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis"), ".") ;
      AV69TFAlbRUniDis_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis_To"), ".") ;
      AV103Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV48GridCurrentPage = GXutil.lval( httpContext.GetPar( "GridCurrentPage")) ;
      AV76TotAlbRPieEnt = GXutil.lval( httpContext.GetPar( "TotAlbRPieEnt")) ;
      AV78TotAlbRPieUti = GXutil.lval( httpContext.GetPar( "TotAlbRPieUti")) ;
      AV80TotAlbRPieDis = GXutil.lval( httpContext.GetPar( "TotAlbRPieDis")) ;
      AV82TotAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbRUniEnt"), ".") ;
      AV84TotAlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbRUniUti"), ".") ;
      AV86TotAlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbRUniDis"), ".") ;
      AV70Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV91AlbRecCod, AV88CliCod, AV89AlbRFenfrom, AV90AlbRFento, AV53VarAlbrEst, AV71EmprCod, AV99LoadGridData, AV34TFCliNom, AV35TFCliNom_Sel, AV40TFAlbrHor, AV41TFAlbrHor_To, AV44TFAlbRef, AV45TFAlbRef_Sel, AV54TFAlbRefDsc, AV55TFAlbRefDsc_Sel, AV56TFAlbRPieEnt, AV57TFAlbRPieEnt_To, AV58TFAlbRPieUti, AV59TFAlbRPieUti_To, AV60TFAlbRPieDis, AV61TFAlbRPieDis_To, AV63TFAlbRUni_Sels, AV64TFAlbRUniEnt, AV65TFAlbRUniEnt_To, AV66TFAlbRUniUti, AV67TFAlbRUniUti_To, AV68TFAlbRUniDis, AV69TFAlbRUniDis_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48GridCurrentPage, AV76TotAlbRPieEnt, AV78TotAlbRPieUti, AV80TotAlbRPieDis, AV82TotAlbRUniEnt, AV84TotAlbRUniUti, AV86TotAlbRUniDis, AV70Moda21, Gx_date) ;
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
      pa1PI2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1PI2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.almacentejidoww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOADGRIDDATA", getSecureSignedToken( "", AV99LoadGridData));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV84TotAlbRUniUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV86TotAlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV103Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\almacentejidoww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV91AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV88CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBRFENFROM", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBRFENTO", localUtil.format(AV90AlbRFento, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vVARALBREST", GXutil.ltrim( localUtil.ntoc( AV53VarAlbrEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV48GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV49GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV99LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOADGRIDDATA", getSecureSignedToken( "", AV99LoadGridData));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV34TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV35TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRHOR", localUtil.ttoc( AV40TFAlbrHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRHOR_TO", localUtil.ttoc( AV41TFAlbrHor_To, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV44TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV45TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC", GXutil.rtrim( AV54TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC_SEL", GXutil.rtrim( AV55TFAlbRefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV56TFAlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT_TO", GXutil.ltrim( localUtil.ntoc( AV57TFAlbRPieEnt_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV58TFAlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI_TO", GXutil.ltrim( localUtil.ntoc( AV59TFAlbRPieUti_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV60TFAlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS_TO", GXutil.ltrim( localUtil.ntoc( AV61TFAlbRPieDis_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV63TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV63TFAlbRUni_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV64TFAlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV65TFAlbRUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV66TFAlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI_TO", GXutil.ltrim( localUtil.ntoc( AV67TFAlbRUniUti_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV68TFAlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS_TO", GXutil.ltrim( localUtil.ntoc( AV69TFAlbRUniDis_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV71EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV76TotAlbRPieEnt, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV78TotAlbRPieUti, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV80TotAlbRPieDis, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV82TotAlbRUniEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV84TotAlbRUniUti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV84TotAlbRUniUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV86TotAlbRUniDis, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV86TotAlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV70Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNI_SELSJSON", AV62TFAlbRUni_SelsJson);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERALMACENTEJIDO", AV92FilterAlmacenTejido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERALMACENTEJIDO", AV92FilterAlmacenTejido);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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
         we1PI2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1PI2( ) ;
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
      return formatLink("app.almacensindetalle.almacentejidoww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.AlmacenTejidoWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Almacen Tejido", "") ;
   }

   public void wb1PI0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbreccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbreccod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV91AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV91AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV91AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV88CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV88CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV88CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrfenfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfenfrom_Internalname, httpContext.getMessage( "Fech. Ini.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfenfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfenfrom_Internalname, localUtil.format(AV89AlbRFenfrom, "99/99/99"), localUtil.format( AV89AlbRFenfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfenfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfenfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfenfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfenfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrfento_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrfento_Internalname, httpContext.getMessage( "Fech. Fin.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfento_Internalname, localUtil.format(AV90AlbRFento, "99/99/99"), localUtil.format( AV90AlbRFento, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfento_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavVaralbrest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavVaralbrest.getInternalname(), httpContext.getMessage( "Estado", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavVaralbrest, cmbavVaralbrest.getInternalname(), GXutil.trim( GXutil.str( AV53VarAlbrEst, 1, 0)), 1, cmbavVaralbrest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavVaralbrest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         cmbavVaralbrest.setValue( GXutil.trim( GXutil.str( AV53VarAlbrEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavVaralbrest.getInternalname(), "Values", cmbavVaralbrest.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_72_1PI2( true) ;
      }
      else
      {
         wb_table1_72_1PI2( false) ;
      }
      return  ;
   }

   public void wb_table1_72_1PI2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV48GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV49GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV103Pgmname), GXutil.rtrim( localUtil.format( AV103Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albrhorauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrhorauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrhorauxdate_Internalname, localUtil.format(AV42DDO_AlbrHorAuxDate, "99/99/99"), localUtil.format( AV42DDO_AlbrHorAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrhorauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrhorauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrhorauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrhorauxdateto_Internalname, localUtil.format(AV43DDO_AlbrHorAuxDateTo, "99/99/99"), localUtil.format( AV43DDO_AlbrHorAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrhorauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrhorauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
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

   public void start1PI2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Almacen Tejido", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1PI0( ) ;
   }

   public void ws1PI2( )
   {
      start1PI2( ) ;
      evt1PI2( ) ;
   }

   public void evt1PI2( )
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
                           e111PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e141PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e151PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e161PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VVARALBREST.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRECCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e191PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRFENFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e201PI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRFENTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e211PI2 ();
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
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV50GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A49AlbRFen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbRFen_Internalname), 0)) ;
                           A6179AlbrHor = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtAlbrHor_Internalname), 0)) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
                           cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
                           A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
                           A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
                           A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
                           A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
                           cmbAlbREst.setName( cmbAlbREst.getInternalname() );
                           cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
                           A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e221PI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e231PI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e241PI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e251PI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albreccod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV91AlbRecCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV88CliCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albrfenfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBRFENFROM"), 0), AV89AlbRFenfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albrfento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBRFENTO"), 0), AV90AlbRFento) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Varalbrest Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vVARALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV53VarAlbrEst )
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

   public void we1PI2( )
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

   public void pa1PI2( )
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
            GX_FocusControl = edtavAlbreccod_Internalname ;
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
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV91AlbRecCod ,
                                 int AV88CliCod ,
                                 java.util.Date AV89AlbRFenfrom ,
                                 java.util.Date AV90AlbRFento ,
                                 byte AV53VarAlbrEst ,
                                 String AV71EmprCod ,
                                 boolean AV99LoadGridData ,
                                 String AV34TFCliNom ,
                                 String AV35TFCliNom_Sel ,
                                 java.util.Date AV40TFAlbrHor ,
                                 java.util.Date AV41TFAlbrHor_To ,
                                 String AV44TFAlbRef ,
                                 String AV45TFAlbRef_Sel ,
                                 String AV54TFAlbRefDsc ,
                                 String AV55TFAlbRefDsc_Sel ,
                                 int AV56TFAlbRPieEnt ,
                                 int AV57TFAlbRPieEnt_To ,
                                 int AV58TFAlbRPieUti ,
                                 int AV59TFAlbRPieUti_To ,
                                 int AV60TFAlbRPieDis ,
                                 int AV61TFAlbRPieDis_To ,
                                 GXSimpleCollection<String> AV63TFAlbRUni_Sels ,
                                 java.math.BigDecimal AV64TFAlbRUniEnt ,
                                 java.math.BigDecimal AV65TFAlbRUniEnt_To ,
                                 java.math.BigDecimal AV66TFAlbRUniUti ,
                                 java.math.BigDecimal AV67TFAlbRUniUti_To ,
                                 java.math.BigDecimal AV68TFAlbRUniDis ,
                                 java.math.BigDecimal AV69TFAlbRUniDis_To ,
                                 String AV103Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 long AV48GridCurrentPage ,
                                 long AV76TotAlbRPieEnt ,
                                 long AV78TotAlbRPieUti ,
                                 long AV80TotAlbRPieDis ,
                                 java.math.BigDecimal AV82TotAlbRUniEnt ,
                                 java.math.BigDecimal AV84TotAlbRUniUti ,
                                 java.math.BigDecimal AV86TotAlbRUniDis ,
                                 short AV70Moda21 ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231PI2 ();
      GRID_nCurrentRecord = 0 ;
      rf1PI2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV103Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\almacentejidoww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      if ( cmbavVaralbrest.getItemCount() > 0 )
      {
         AV53VarAlbrEst = (byte)(GXutil.lval( cmbavVaralbrest.getValidValue(GXutil.trim( GXutil.str( AV53VarAlbrEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavVaralbrest.setValue( GXutil.trim( GXutil.str( AV53VarAlbrEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavVaralbrest.getInternalname(), "Values", cmbavVaralbrest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1PI2( ) ;
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
      AV103Pgmname = "AlmacenSinDetalle.AlmacenTejidoWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Pgmname", AV103Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluealbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrpieent_Enabled), 5, 0), true);
      edtavTotvaluealbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrpieuti_Enabled), 5, 0), true);
      edtavTotvaluealbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrpiedis_Enabled), 5, 0), true);
      edtavTotvaluealbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrunient_Enabled), 5, 0), true);
      edtavTotvaluealbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbruniuti_Enabled), 5, 0), true);
      edtavTotvaluealbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrunidis_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1PI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e231PI2 ();
      nGXsfl_52_idx = 1 ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_522( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A56AlbRUni ,
                                              AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                              AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                              AV105Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                              AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                              AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                              AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                              AV109Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                              AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                              AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                              Integer.valueOf(AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent) ,
                                              Integer.valueOf(AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) ,
                                              Integer.valueOf(AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) ,
                                              Integer.valueOf(AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) ,
                                              Integer.valueOf(AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) ,
                                              Integer.valueOf(AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) ,
                                              Integer.valueOf(AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels.size()) ,
                                              AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                              AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                              AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                              AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                              AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                              AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                              Integer.valueOf(AV91AlbRecCod) ,
                                              AV89AlbRFenfrom ,
                                              AV90AlbRFento ,
                                              Integer.valueOf(AV88CliCod) ,
                                              A279CliNom ,
                                              A6179AlbrHor ,
                                              A45AlbRef ,
                                              A3613AlbRefDsc ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              Integer.valueOf(A54AlbRPieUti) ,
                                              A58AlbRUniEnt ,
                                              A60AlbRUniUti ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A49AlbRFen ,
                                              Integer.valueOf(A252CliCod) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              Byte.valueOf(A47AlbREst) ,
                                              Byte.valueOf(AV53VarAlbrEst) ,
                                              AV71EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV105Almacensindetalle_almacentejidowwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV105Almacensindetalle_almacentejidowwds_1_tfclinom), 30, "%") ;
         lV109Almacensindetalle_almacentejidowwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV109Almacensindetalle_almacentejidowwds_5_tfalbref), 16, "%") ;
         lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc), 26, "%") ;
         /* Using cursor H01PI2 */
         pr_default.execute(0, new Object[] {AV71EmprCod, Byte.valueOf(AV53VarAlbrEst), Byte.valueOf(AV53VarAlbrEst), lV105Almacensindetalle_almacentejidowwds_1_tfclinom, AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel, AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor, AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to, lV109Almacensindetalle_almacentejidowwds_5_tfalbref, AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel, lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc, AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel, Integer.valueOf(AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent), Integer.valueOf(AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to), Integer.valueOf(AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti), Integer.valueOf(AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to), Integer.valueOf(AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis), Integer.valueOf(AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to), AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient, AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to, AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti, AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to, AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis, AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to, Integer.valueOf(AV91AlbRecCod), AV89AlbRFenfrom, AV90AlbRFento, Integer.valueOf(AV88CliCod), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_52_idx = 1 ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A47AlbREst = H01PI2_A47AlbREst[0] ;
            A56AlbRUni = H01PI2_A56AlbRUni[0] ;
            A3613AlbRefDsc = H01PI2_A3613AlbRefDsc[0] ;
            A45AlbRef = H01PI2_A45AlbRef[0] ;
            A6179AlbrHor = H01PI2_A6179AlbrHor[0] ;
            A49AlbRFen = H01PI2_A49AlbRFen[0] ;
            A279CliNom = H01PI2_A279CliNom[0] ;
            A252CliCod = H01PI2_A252CliCod[0] ;
            A44AlbRecCod = H01PI2_A44AlbRecCod[0] ;
            A396EmprCod = H01PI2_A396EmprCod[0] ;
            A54AlbRPieUti = H01PI2_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H01PI2_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = H01PI2_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H01PI2_A58AlbRUniEnt[0] ;
            A279CliNom = H01PI2_A279CliNom[0] ;
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
            {
               A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            }
            else
            {
               if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               }
            }
            A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            e241PI2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(52) ;
         wb1PI0( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1PI2( )
   {
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV99LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOADGRIDDATA", getSecureSignedToken( "", AV99LoadGridData));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV71EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV76TotAlbRPieEnt, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV78TotAlbRPieUti, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV80TotAlbRPieDis, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV82TotAlbRUniEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV84TotAlbRUniUti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV84TotAlbRUniUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV86TotAlbRUniDis, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV86TotAlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV70Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                           AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                           AV105Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                           AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                           AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                           AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                           AV109Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                           AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                           AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels.size()) ,
                                           AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                           AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                           AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                           AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                           AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                           AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                           Integer.valueOf(AV91AlbRecCod) ,
                                           AV89AlbRFenfrom ,
                                           AV90AlbRFento ,
                                           Integer.valueOf(AV88CliCod) ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV53VarAlbrEst) ,
                                           AV71EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV105Almacensindetalle_almacentejidowwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV105Almacensindetalle_almacentejidowwds_1_tfclinom), 30, "%") ;
      lV109Almacensindetalle_almacentejidowwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV109Almacensindetalle_almacentejidowwds_5_tfalbref), 16, "%") ;
      lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor H01PI3 */
      pr_default.execute(1, new Object[] {AV71EmprCod, Byte.valueOf(AV53VarAlbrEst), Byte.valueOf(AV53VarAlbrEst), lV105Almacensindetalle_almacentejidowwds_1_tfclinom, AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel, AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor, AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to, lV109Almacensindetalle_almacentejidowwds_5_tfalbref, AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel, lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc, AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel, Integer.valueOf(AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent), Integer.valueOf(AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to), Integer.valueOf(AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti), Integer.valueOf(AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to), Integer.valueOf(AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis), Integer.valueOf(AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to), AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient, AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to, AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti, AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to, AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis, AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to, Integer.valueOf(AV91AlbRecCod), AV89AlbRFenfrom, AV90AlbRFento, Integer.valueOf(AV88CliCod)});
      GRID_nRecordCount = H01PI3_AGRID_nRecordCount[0] ;
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
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV91AlbRecCod, AV88CliCod, AV89AlbRFenfrom, AV90AlbRFento, AV53VarAlbrEst, AV71EmprCod, AV99LoadGridData, AV34TFCliNom, AV35TFCliNom_Sel, AV40TFAlbrHor, AV41TFAlbrHor_To, AV44TFAlbRef, AV45TFAlbRef_Sel, AV54TFAlbRefDsc, AV55TFAlbRefDsc_Sel, AV56TFAlbRPieEnt, AV57TFAlbRPieEnt_To, AV58TFAlbRPieUti, AV59TFAlbRPieUti_To, AV60TFAlbRPieDis, AV61TFAlbRPieDis_To, AV63TFAlbRUni_Sels, AV64TFAlbRUniEnt, AV65TFAlbRUniEnt_To, AV66TFAlbRUniUti, AV67TFAlbRUniUti_To, AV68TFAlbRUniDis, AV69TFAlbRUniDis_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48GridCurrentPage, AV76TotAlbRPieEnt, AV78TotAlbRPieUti, AV80TotAlbRPieDis, AV82TotAlbRUniEnt, AV84TotAlbRUniUti, AV86TotAlbRUniDis, AV70Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91AlbRecCod, AV88CliCod, AV89AlbRFenfrom, AV90AlbRFento, AV53VarAlbrEst, AV71EmprCod, AV99LoadGridData, AV34TFCliNom, AV35TFCliNom_Sel, AV40TFAlbrHor, AV41TFAlbrHor_To, AV44TFAlbRef, AV45TFAlbRef_Sel, AV54TFAlbRefDsc, AV55TFAlbRefDsc_Sel, AV56TFAlbRPieEnt, AV57TFAlbRPieEnt_To, AV58TFAlbRPieUti, AV59TFAlbRPieUti_To, AV60TFAlbRPieDis, AV61TFAlbRPieDis_To, AV63TFAlbRUni_Sels, AV64TFAlbRUniEnt, AV65TFAlbRUniEnt_To, AV66TFAlbRUniUti, AV67TFAlbRUniUti_To, AV68TFAlbRUniDis, AV69TFAlbRUniDis_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48GridCurrentPage, AV76TotAlbRPieEnt, AV78TotAlbRPieUti, AV80TotAlbRPieDis, AV82TotAlbRUniEnt, AV84TotAlbRUniUti, AV86TotAlbRUniDis, AV70Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91AlbRecCod, AV88CliCod, AV89AlbRFenfrom, AV90AlbRFento, AV53VarAlbrEst, AV71EmprCod, AV99LoadGridData, AV34TFCliNom, AV35TFCliNom_Sel, AV40TFAlbrHor, AV41TFAlbrHor_To, AV44TFAlbRef, AV45TFAlbRef_Sel, AV54TFAlbRefDsc, AV55TFAlbRefDsc_Sel, AV56TFAlbRPieEnt, AV57TFAlbRPieEnt_To, AV58TFAlbRPieUti, AV59TFAlbRPieUti_To, AV60TFAlbRPieDis, AV61TFAlbRPieDis_To, AV63TFAlbRUni_Sels, AV64TFAlbRUniEnt, AV65TFAlbRUniEnt_To, AV66TFAlbRUniUti, AV67TFAlbRUniUti_To, AV68TFAlbRUniDis, AV69TFAlbRUniDis_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48GridCurrentPage, AV76TotAlbRPieEnt, AV78TotAlbRPieUti, AV80TotAlbRPieDis, AV82TotAlbRUniEnt, AV84TotAlbRUniUti, AV86TotAlbRUniDis, AV70Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91AlbRecCod, AV88CliCod, AV89AlbRFenfrom, AV90AlbRFento, AV53VarAlbrEst, AV71EmprCod, AV99LoadGridData, AV34TFCliNom, AV35TFCliNom_Sel, AV40TFAlbrHor, AV41TFAlbrHor_To, AV44TFAlbRef, AV45TFAlbRef_Sel, AV54TFAlbRefDsc, AV55TFAlbRefDsc_Sel, AV56TFAlbRPieEnt, AV57TFAlbRPieEnt_To, AV58TFAlbRPieUti, AV59TFAlbRPieUti_To, AV60TFAlbRPieDis, AV61TFAlbRPieDis_To, AV63TFAlbRUni_Sels, AV64TFAlbRUniEnt, AV65TFAlbRUniEnt_To, AV66TFAlbRUniUti, AV67TFAlbRUniUti_To, AV68TFAlbRUniDis, AV69TFAlbRUniDis_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48GridCurrentPage, AV76TotAlbRPieEnt, AV78TotAlbRPieUti, AV80TotAlbRPieDis, AV82TotAlbRUniEnt, AV84TotAlbRUniUti, AV86TotAlbRUniDis, AV70Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV91AlbRecCod, AV88CliCod, AV89AlbRFenfrom, AV90AlbRFento, AV53VarAlbrEst, AV71EmprCod, AV99LoadGridData, AV34TFCliNom, AV35TFCliNom_Sel, AV40TFAlbrHor, AV41TFAlbrHor_To, AV44TFAlbRef, AV45TFAlbRef_Sel, AV54TFAlbRefDsc, AV55TFAlbRefDsc_Sel, AV56TFAlbRPieEnt, AV57TFAlbRPieEnt_To, AV58TFAlbRPieUti, AV59TFAlbRPieUti_To, AV60TFAlbRPieDis, AV61TFAlbRPieDis_To, AV63TFAlbRUni_Sels, AV64TFAlbRUniEnt, AV65TFAlbRUniEnt_To, AV66TFAlbRUniUti, AV67TFAlbRUniUti_To, AV68TFAlbRUniDis, AV69TFAlbRUniDis_To, AV103Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48GridCurrentPage, AV76TotAlbRPieEnt, AV78TotAlbRPieUti, AV80TotAlbRPieDis, AV82TotAlbRUniEnt, AV84TotAlbRUniUti, AV86TotAlbRUniDis, AV70Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV103Pgmname = "AlmacenSinDetalle.AlmacenTejidoWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV103Pgmname", AV103Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluealbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrpieent_Enabled), 5, 0), true);
      edtavTotvaluealbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrpieuti_Enabled), 5, 0), true);
      edtavTotvaluealbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrpiedis_Enabled), 5, 0), true);
      edtavTotvaluealbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrunient_Enabled), 5, 0), true);
      edtavTotvaluealbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbruniuti_Enabled), 5, 0), true);
      edtavTotvaluealbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluealbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbrunidis_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1PI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e221PI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV46DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV48GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV49GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
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
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRECCOD");
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV91AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91AlbRecCod), 8, 0));
         }
         else
         {
            AV91AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91AlbRecCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV88CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88CliCod), 6, 0));
         }
         else
         {
            AV88CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88CliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfenfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFENFROM");
            GX_FocusControl = edtavAlbrfenfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89AlbRFenfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRFenfrom", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
         }
         else
         {
            AV89AlbRFenfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbrfenfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRFenfrom", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFENTO");
            GX_FocusControl = edtavAlbrfento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90AlbRFento = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90AlbRFento", localUtil.format(AV90AlbRFento, "99/99/99"));
         }
         else
         {
            AV90AlbRFento = localUtil.ctod( httpContext.cgiGet( edtavAlbrfento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90AlbRFento", localUtil.format(AV90AlbRFento, "99/99/99"));
         }
         cmbavVaralbrest.setName( cmbavVaralbrest.getInternalname() );
         cmbavVaralbrest.setValue( httpContext.cgiGet( cmbavVaralbrest.getInternalname()) );
         AV53VarAlbrEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavVaralbrest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
         AV77TotValueAlbRPieEnt = httpContext.cgiGet( edtavTotvaluealbrpieent_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77TotValueAlbRPieEnt", AV77TotValueAlbRPieEnt);
         AV79TotValueAlbRPieUti = httpContext.cgiGet( edtavTotvaluealbrpieuti_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79TotValueAlbRPieUti", AV79TotValueAlbRPieUti);
         AV81TotValueAlbRPieDis = httpContext.cgiGet( edtavTotvaluealbrpiedis_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81TotValueAlbRPieDis", AV81TotValueAlbRPieDis);
         AV83TotValueAlbRUniEnt = httpContext.cgiGet( edtavTotvaluealbrunient_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83TotValueAlbRUniEnt", AV83TotValueAlbRUniEnt);
         AV85TotValueAlbRUniUti = httpContext.cgiGet( edtavTotvaluealbruniuti_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85TotValueAlbRUniUti", AV85TotValueAlbRUniUti);
         AV87TotValueAlbRUniDis = httpContext.cgiGet( edtavTotvaluealbrunidis_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87TotValueAlbRUniDis", AV87TotValueAlbRUniDis);
         AV103Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103Pgmname", AV103Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrhorauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRHORAUXDATE");
            GX_FocusControl = edtavDdo_albrhorauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42DDO_AlbrHorAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_AlbrHorAuxDate", localUtil.format(AV42DDO_AlbrHorAuxDate, "99/99/99"));
         }
         else
         {
            AV42DDO_AlbrHorAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrhorauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_AlbrHorAuxDate", localUtil.format(AV42DDO_AlbrHorAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrhorauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRHORAUXDATETO");
            GX_FocusControl = edtavDdo_albrhorauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43DDO_AlbrHorAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43DDO_AlbrHorAuxDateTo", localUtil.format(AV43DDO_AlbrHorAuxDateTo, "99/99/99"));
         }
         else
         {
            AV43DDO_AlbrHorAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrhorauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43DDO_AlbrHorAuxDateTo", localUtil.format(AV43DDO_AlbrHorAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"AlmacenTejidoWW");
         AV103Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV103Pgmname", AV103Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV103Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacensindetalle\\almacentejidoww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBRECCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV91AlbRecCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV88CliCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBRFENFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV89AlbRFenfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBRFENTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV90AlbRFento)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vVARALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV53VarAlbrEst )
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
      e221PI2 ();
      if (returnInSub) return;
   }

   public void e221PI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV53VarAlbrEst = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (0==AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrest()) )
      {
         AV53VarAlbrEst = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfenfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfento())) )
      {
         AV89AlbRFenfrom = AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfenfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRFenfrom", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
         AV90AlbRFento = AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfento() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90AlbRFento", localUtil.format(AV90AlbRFento, "99/99/99"));
      }
      else
      {
         if ( (0==AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albreccod()) )
         {
            AV89AlbRFenfrom = GXutil.dadd(Gx_date,-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRFenfrom", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
            AV90AlbRFento = Gx_date ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90AlbRFento", localUtil.format(AV90AlbRFento, "99/99/99"));
         }
      }
      GXt_char1 = AV72Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      almacentejidoww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Station = GXt_char1 ;
      GXv_char2[0] = AV71EmprCod ;
      GXv_char3[0] = AV73EmprNom ;
      GXv_char4[0] = AV74UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char2, GXv_char3, GXv_char4) ;
      almacentejidoww_impl.this.AV71EmprCod = GXv_char2[0] ;
      almacentejidoww_impl.this.AV73EmprNom = GXv_char3[0] ;
      almacentejidoww_impl.this.AV74UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71EmprCod", AV71EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV71EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Almacen Tejido", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV46DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV46DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV70Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV71EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      almacentejidoww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV70Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Moda21), "ZZZ9")));
   }

   public void e231PI2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         GXv_SdtWWPContext9[0] = AV6WWPContext;
         new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
         AV6WWPContext = GXv_SdtWWPContext9[0] ;
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
         S162 ();
         if (returnInSub) return;
         AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
         AV49GridPageCount = subgrid_fnc_pagecount( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
         /* Execute user subroutine: 'CALCULATETOTALIZERS' */
         S172 ();
         if (returnInSub) return;
         cmbAlbREst.setColumnHeaderClass( "WWColumn" );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Columnheaderclass", cmbAlbREst.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      }
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      Gridpaginationbar_Emptygridcaption = (AV99LoadGridData ? httpContext.getMessage( "WWP_PagingEmptyGridCaption", "") : httpContext.getMessage( "WWP_PressSearchToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      AV48GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridCurrentPage), 10, 0));
      AV49GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridPageCount), 10, 0));
      if ( AV99LoadGridData )
      {
         /* Execute user subroutine: 'CALCULATETOTALIZERS' */
         S172 ();
         if (returnInSub) return;
      }
      cmbAlbREst.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Columnheaderclass", cmbAlbREst.getColumnHeaderClass(), !bGXsfl_52_Refreshing);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "GridLayoutClean", "", new Object[] {});
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
      /*  Sending Event outputs  */
   }

   public void e111PI2( )
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
         AV47PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV47PageToGo) ;
      }
   }

   public void e121PI2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131PI2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV34TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom", AV34TFCliNom);
            AV35TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbrHor") == 0 )
         {
            AV40TFAlbrHor = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFAlbrHor", localUtil.ttoc( AV40TFAlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV41TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFAlbrHor_To", localUtil.ttoc( AV41TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( ! GXutil.dateCompare(GXutil.nullDate(), AV41TFAlbrHor_To) )
            {
               AV41TFAlbrHor_To = GXutil.resetDate(localUtil.ymdhmsToT( (short)(GXutil.year( AV41TFAlbrHor_To)), (byte)(GXutil.month( AV41TFAlbrHor_To)), (byte)(GXutil.day( AV41TFAlbrHor_To)), (byte)(23), (byte)(59), (byte)(59))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41TFAlbrHor_To", localUtil.ttoc( AV41TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV44TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbRef", AV44TFAlbRef);
            AV45TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbRef_Sel", AV45TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRefDsc") == 0 )
         {
            AV54TFAlbRefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRefDsc", AV54TFAlbRefDsc);
            AV55TFAlbRefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRefDsc_Sel", AV55TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieEnt") == 0 )
         {
            AV56TFAlbRPieEnt = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbRPieEnt), 6, 0));
            AV57TFAlbRPieEnt_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieUti") == 0 )
         {
            AV58TFAlbRPieUti = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieUti), 6, 0));
            AV59TFAlbRPieUti_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieDis") == 0 )
         {
            AV60TFAlbRPieDis = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbRPieDis), 6, 0));
            AV61TFAlbRPieDis_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV62TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbRUni_SelsJson", AV62TFAlbRUni_SelsJson);
            AV63TFAlbRUni_Sels.fromJSonString(AV62TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniEnt") == 0 )
         {
            AV64TFAlbRUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbRUniEnt", GXutil.ltrimstr( AV64TFAlbRUniEnt, 9, 2));
            AV65TFAlbRUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbRUniEnt_To", GXutil.ltrimstr( AV65TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniUti") == 0 )
         {
            AV66TFAlbRUniUti = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbRUniUti", GXutil.ltrimstr( AV66TFAlbRUniUti, 9, 2));
            AV67TFAlbRUniUti_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFAlbRUniUti_To", GXutil.ltrimstr( AV67TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniDis") == 0 )
         {
            AV68TFAlbRUniDis = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbRUniDis", GXutil.ltrimstr( AV68TFAlbRUniDis, 9, 2));
            AV69TFAlbRUniDis_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbRUniDis_To", GXutil.ltrimstr( AV69TFAlbRUniDis_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63TFAlbRUni_Sels", AV63TFAlbRUni_Sels);
   }

   private void e241PI2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fas fa-file-powerpoint", "", "", "", "", "", "", ""), (short)(0));
      if ( A47AlbREst == 0 )
      {
         cmbAlbREst.setColumnClass( "WWColumn WWColumnSuccess WWColumnSuccessSingleCell" );
      }
      else if ( A47AlbREst == 1 )
      {
         cmbAlbREst.setColumnClass( "WWColumn WWColumnDanger WWColumnDangerSingleCell" );
      }
      else
      {
         cmbAlbREst.setColumnClass( httpContext.getMessage( "WWColumn", "") );
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(52) ;
      }
      sendrow_522( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
      {
         httpContext.doAjaxLoad(52, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV50GridActions, 4, 0)) );
   }

   public void e251PI2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV50GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV50GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV50GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV50GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S212 ();
         if (returnInSub) return;
      }
      AV50GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV50GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e141PI2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.almacensindetalle.almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e151PI2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.almacensindetalle.almacentejidowwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      almacentejidoww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      almacentejidoww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63TFAlbRUni_Sels", AV63TFAlbRUni_Sels);
   }

   public void e161PI2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.almacensindetalle.almacentejidowwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63TFAlbRUni_Sels", AV63TFAlbRUni_Sels);
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
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.almacensindetalle.almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S192( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.almacensindetalle.almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.almacensindetalle.almacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      if ( AV70Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.ralbmod", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(1,9,0))}, new String[] {"EmprCod","AlbRecCod","Paletes"}) , new Object[] {"A396EmprCod","A44AlbRecCod",""});
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir", ""));
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV103Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV103Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV103Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV126GXV1 = 1 ;
      while ( AV126GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV126GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV34TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliNom", AV34TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV35TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliNom_Sel", AV35TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV40TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFAlbrHor", localUtil.ttoc( AV40TFAlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV41TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFAlbrHor_To", localUtil.ttoc( AV41TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV42DDO_AlbrHorAuxDate = GXutil.resetTime(AV40TFAlbrHor) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_AlbrHorAuxDate", localUtil.format(AV42DDO_AlbrHorAuxDate, "99/99/99"));
            AV43DDO_AlbrHorAuxDateTo = GXutil.resetTime(AV41TFAlbrHor_To) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43DDO_AlbrHorAuxDateTo", localUtil.format(AV43DDO_AlbrHorAuxDateTo, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV44TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFAlbRef", AV44TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV45TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFAlbRef_Sel", AV45TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV54TFAlbRefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRefDsc", AV54TFAlbRefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV55TFAlbRefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbRefDsc_Sel", AV55TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV56TFAlbRPieEnt = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFAlbRPieEnt), 6, 0));
            AV57TFAlbRPieEnt_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV58TFAlbRPieUti = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieUti), 6, 0));
            AV59TFAlbRPieUti_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV60TFAlbRPieDis = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbRPieDis), 6, 0));
            AV61TFAlbRPieDis_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV62TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbRUni_SelsJson", AV62TFAlbRUni_SelsJson);
            AV63TFAlbRUni_Sels.fromJSonString(AV62TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV64TFAlbRUniEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbRUniEnt", GXutil.ltrimstr( AV64TFAlbRUniEnt, 9, 2));
            AV65TFAlbRUniEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbRUniEnt_To", GXutil.ltrimstr( AV65TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV66TFAlbRUniUti = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbRUniUti", GXutil.ltrimstr( AV66TFAlbRUniUti, 9, 2));
            AV67TFAlbRUniUti_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFAlbRUniUti_To", GXutil.ltrimstr( AV67TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV68TFAlbRUniDis = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbRUniDis", GXutil.ltrimstr( AV68TFAlbRUniDis, 9, 2));
            AV69TFAlbRUniDis_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbRUniDis_To", GXutil.ltrimstr( AV69TFAlbRUniDis_To, 9, 2));
         }
         AV126GXV1 = (int)(AV126GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, GXv_char4) ;
      almacentejidoww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV45TFAlbRef_Sel)==0), AV45TFAlbRef_Sel, GXv_char3) ;
      almacentejidoww_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFAlbRefDsc_Sel)==0), AV55TFAlbRefDsc_Sel, GXv_char2) ;
      almacentejidoww_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV63TFAlbRUni_Sels.size()==0), AV62TFAlbRUni_SelsJson, GXv_char13) ;
      almacentejidoww_impl.this.GXt_char12 = GXv_char13[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|||"+GXt_char10+"|"+GXt_char11+"||||"+GXt_char12+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFCliNom)==0), AV34TFCliNom, GXv_char13) ;
      almacentejidoww_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFAlbRef)==0), AV44TFAlbRef, GXv_char4) ;
      almacentejidoww_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFAlbRefDsc)==0), AV54TFAlbRefDsc, GXv_char3) ;
      almacentejidoww_impl.this.GXt_char10 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = "||"+GXt_char12+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV40TFAlbrHor) ? "" : localUtil.dtoc( AV42DDO_AlbrHorAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char11+"|"+GXt_char10+"|"+((0==AV56TFAlbRPieEnt) ? "" : GXutil.str( AV56TFAlbRPieEnt, 6, 0))+"|"+((0==AV58TFAlbRPieUti) ? "" : GXutil.str( AV58TFAlbRPieUti, 6, 0))+"|"+((0==AV60TFAlbRPieDis) ? "" : GXutil.str( AV60TFAlbRPieDis, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFAlbRUniEnt)==0) ? "" : GXutil.str( AV64TFAlbRUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniUti)==0) ? "" : GXutil.str( AV66TFAlbRUniUti, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFAlbRUniDis)==0) ? "" : GXutil.str( AV68TFAlbRUniDis, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+(GXutil.dateCompare(GXutil.nullDate(), AV41TFAlbrHor_To) ? "" : localUtil.dtoc( AV43DDO_AlbrHorAuxDateTo, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|||"+((0==AV57TFAlbRPieEnt_To) ? "" : GXutil.str( AV57TFAlbRPieEnt_To, 6, 0))+"|"+((0==AV59TFAlbRPieUti_To) ? "" : GXutil.str( AV59TFAlbRPieUti_To, 6, 0))+"|"+((0==AV61TFAlbRPieDis_To) ? "" : GXutil.str( AV61TFAlbRPieDis_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbRUniEnt_To)==0) ? "" : GXutil.str( AV65TFAlbRUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFAlbRUniUti_To)==0) ? "" : GXutil.str( AV67TFAlbRUniUti_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFAlbRUniDis_To)==0) ? "" : GXutil.str( AV69TFAlbRUniDis_To, 9, 2))+"|" ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV103Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFCLINOM", "", !(GXutil.strcmp("", AV34TFCliNom)==0), (short)(0), AV34TFCliNom, "", !(GXutil.strcmp("", AV35TFCliNom_Sel)==0), AV35TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRHOR", "", !(GXutil.dateCompare(GXutil.nullDate(), AV40TFAlbrHor)&&GXutil.dateCompare(GXutil.nullDate(), AV41TFAlbrHor_To)), (short)(0), GXutil.trim( localUtil.ttoc( AV40TFAlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), GXutil.trim( localUtil.ttoc( AV41TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBREF", "", !(GXutil.strcmp("", AV44TFAlbRef)==0), (short)(0), AV44TFAlbRef, "", !(GXutil.strcmp("", AV45TFAlbRef_Sel)==0), AV45TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBREFDSC", "", !(GXutil.strcmp("", AV54TFAlbRefDsc)==0), (short)(0), AV54TFAlbRefDsc, "", !(GXutil.strcmp("", AV55TFAlbRefDsc_Sel)==0), AV55TFAlbRefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRPIEENT", "", !((0==AV56TFAlbRPieEnt)&&(0==AV57TFAlbRPieEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV56TFAlbRPieEnt, 6, 0)), GXutil.trim( GXutil.str( AV57TFAlbRPieEnt_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRPIEUTI", "", !((0==AV58TFAlbRPieUti)&&(0==AV59TFAlbRPieUti_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFAlbRPieUti, 6, 0)), GXutil.trim( GXutil.str( AV59TFAlbRPieUti_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRPIEDIS", "", !((0==AV60TFAlbRPieDis)&&(0==AV61TFAlbRPieDis_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFAlbRPieDis, 6, 0)), GXutil.trim( GXutil.str( AV61TFAlbRPieDis_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNI_SEL", "", !(AV63TFAlbRUni_Sels.size()==0), (short)(0), AV63TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV64TFAlbRUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbRUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV64TFAlbRUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV65TFAlbRUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNIUTI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniUti)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFAlbRUniUti_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFAlbRUniUti, 9, 2)), GXutil.trim( GXutil.str( AV67TFAlbRUniUti_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNIDIS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFAlbRUniDis)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFAlbRUniDis_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV68TFAlbRUniDis, 9, 2)), GXutil.trim( GXutil.str( AV69TFAlbRUniDis_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV103Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV103Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AlmacenSinDetalle.AlmacenTejido" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV76TotAlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TotAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), "ZZZZZ9")));
      AV78TotAlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TotAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), "ZZZZZ9")));
      AV80TotAlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TotAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), "ZZZZZ9")));
      AV82TotAlbRUniEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TotAlbRUniEnt", GXutil.ltrimstr( AV82TotAlbRUniEnt, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniEnt, "ZZZZZ9.99")));
      AV84TotAlbRUniUti = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84TotAlbRUniUti", GXutil.ltrimstr( AV84TotAlbRUniUti, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV84TotAlbRUniUti, "ZZZZZ9.99")));
      AV86TotAlbRUniDis = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86TotAlbRUniDis", GXutil.ltrimstr( AV86TotAlbRUniDis, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV86TotAlbRUniDis, "ZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV94L = (short)(subGrid_Rows) ;
      AV96Offset = (short)((AV48GridCurrentPage-1)*AV94L) ;
      AV97Totalset = DecimalUtil.doubleToDec(AV94L) ;
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = AV34TFCliNom ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = AV35TFCliNom_Sel ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = AV40TFAlbrHor ;
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = AV41TFAlbrHor_To ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = AV44TFAlbRef ;
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = AV45TFAlbRef_Sel ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = AV54TFAlbRefDsc ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = AV55TFAlbRefDsc_Sel ;
      AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent = AV56TFAlbRPieEnt ;
      AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to = AV57TFAlbRPieEnt_To ;
      AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti = AV58TFAlbRPieUti ;
      AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to = AV59TFAlbRPieUti_To ;
      AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis = AV60TFAlbRPieDis ;
      AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to = AV61TFAlbRPieDis_To ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = AV63TFAlbRUni_Sels ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = AV64TFAlbRUniEnt ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = AV65TFAlbRUniEnt_To ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = AV66TFAlbRUniUti ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = AV67TFAlbRUniUti_To ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = AV68TFAlbRUniDis ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = AV69TFAlbRUniDis_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                           AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                           AV105Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                           AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                           AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                           AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                           AV109Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                           AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                           AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels.size()) ,
                                           AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                           AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                           AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                           AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                           AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                           AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                           Integer.valueOf(AV91AlbRecCod) ,
                                           AV89AlbRFenfrom ,
                                           AV90AlbRFento ,
                                           Integer.valueOf(AV88CliCod) ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A49AlbRFen ,
                                           Integer.valueOf(A252CliCod) ,
                                           Byte.valueOf(A47AlbREst) ,
                                           Byte.valueOf(AV53VarAlbrEst) ,
                                           AV71EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV105Almacensindetalle_almacentejidowwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV105Almacensindetalle_almacentejidowwds_1_tfclinom), 30, "%") ;
      lV109Almacensindetalle_almacentejidowwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV109Almacensindetalle_almacentejidowwds_5_tfalbref), 16, "%") ;
      lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor H01PI4 */
      pr_default.execute(2, new Object[] {AV71EmprCod, Byte.valueOf(AV53VarAlbrEst), Byte.valueOf(AV53VarAlbrEst), lV105Almacensindetalle_almacentejidowwds_1_tfclinom, AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel, AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor, AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to, lV109Almacensindetalle_almacentejidowwds_5_tfalbref, AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel, lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc, AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel, Integer.valueOf(AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent), Integer.valueOf(AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to), Integer.valueOf(AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti), Integer.valueOf(AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to), Integer.valueOf(AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis), Integer.valueOf(AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to), AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient, AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to, AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti, AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to, AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis, AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to, Integer.valueOf(AV91AlbRecCod), AV89AlbRFenfrom, AV90AlbRFento, Integer.valueOf(AV88CliCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A47AlbREst = H01PI4_A47AlbREst[0] ;
         A252CliCod = H01PI4_A252CliCod[0] ;
         A49AlbRFen = H01PI4_A49AlbRFen[0] ;
         A44AlbRecCod = H01PI4_A44AlbRecCod[0] ;
         A396EmprCod = H01PI4_A396EmprCod[0] ;
         A56AlbRUni = H01PI4_A56AlbRUni[0] ;
         A3613AlbRefDsc = H01PI4_A3613AlbRefDsc[0] ;
         A45AlbRef = H01PI4_A45AlbRef[0] ;
         A6179AlbrHor = H01PI4_A6179AlbrHor[0] ;
         A279CliNom = H01PI4_A279CliNom[0] ;
         A54AlbRPieUti = H01PI4_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = H01PI4_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = H01PI4_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = H01PI4_A58AlbRUniEnt[0] ;
         A279CliNom = H01PI4_A279CliNom[0] ;
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         AV76TotAlbRPieEnt = (long)(A52AlbRPieEnt+AV76TotAlbRPieEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76TotAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), "ZZZZZ9")));
         AV78TotAlbRPieUti = (long)(A54AlbRPieUti+AV78TotAlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78TotAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), "ZZZZZ9")));
         AV80TotAlbRPieDis = (long)(A51AlbRPieDis+AV80TotAlbRPieDis) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80TotAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), "ZZZZZ9")));
         AV82TotAlbRUniEnt = A58AlbRUniEnt.add(AV82TotAlbRUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82TotAlbRUniEnt", GXutil.ltrimstr( AV82TotAlbRUniEnt, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniEnt, "ZZZZZ9.99")));
         AV84TotAlbRUniUti = A60AlbRUniUti.add(AV84TotAlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84TotAlbRUniUti", GXutil.ltrimstr( AV84TotAlbRUniUti, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV84TotAlbRUniUti, "ZZZZZ9.99")));
         AV86TotAlbRUniDis = A57AlbRUniDis.add(AV86TotAlbRUniDis) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86TotAlbRUniDis", GXutil.ltrimstr( AV86TotAlbRUniDis, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV86TotAlbRUniDis, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV77TotValueAlbRPieEnt = localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieEnt), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TotValueAlbRPieEnt", AV77TotValueAlbRPieEnt);
      AV79TotValueAlbRPieUti = localUtil.format( DecimalUtil.doubleToDec(AV78TotAlbRPieUti), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TotValueAlbRPieUti", AV79TotValueAlbRPieUti);
      AV81TotValueAlbRPieDis = localUtil.format( DecimalUtil.doubleToDec(AV80TotAlbRPieDis), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TotValueAlbRPieDis", AV81TotValueAlbRPieDis);
      AV83TotValueAlbRUniEnt = localUtil.format( AV82TotAlbRUniEnt, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TotValueAlbRUniEnt", AV83TotValueAlbRUniEnt);
      AV85TotValueAlbRUniUti = localUtil.format( AV84TotAlbRUniUti, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85TotValueAlbRUniUti", AV85TotValueAlbRUniUti);
      AV87TotValueAlbRUniDis = localUtil.format( AV86TotAlbRUniDis, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87TotValueAlbRUniDis", AV87TotValueAlbRUniDis);
   }

   public void e171PI2( )
   {
      /* Varalbrest_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92FilterAlmacenTejido", AV92FilterAlmacenTejido);
   }

   public void e181PI2( )
   {
      /* Albreccod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV91AlbRecCod) )
      {
         AV89AlbRFenfrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRFenfrom", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
         AV90AlbRFento = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90AlbRFento", localUtil.format(AV90AlbRFento, "99/99/99"));
         AV88CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88CliCod), 6, 0));
         AV53VarAlbrEst = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
      }
      else
      {
         AV89AlbRFenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRFenfrom", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
         AV90AlbRFento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90AlbRFento", localUtil.format(AV90AlbRFento, "99/99/99"));
         AV88CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88CliCod), 6, 0));
         AV53VarAlbrEst = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavVaralbrest.setValue( GXutil.trim( GXutil.str( AV53VarAlbrEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavVaralbrest.getInternalname(), "Values", cmbavVaralbrest.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92FilterAlmacenTejido", AV92FilterAlmacenTejido);
   }

   public void e191PI2( )
   {
      /* Clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92FilterAlmacenTejido", AV92FilterAlmacenTejido);
   }

   public void e201PI2( )
   {
      /* Albrfenfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92FilterAlmacenTejido", AV92FilterAlmacenTejido);
   }

   public void e211PI2( )
   {
      /* Albrfento_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV92FilterAlmacenTejido", AV92FilterAlmacenTejido);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV92FilterAlmacenTejido.fromJSonString(AV93WebSession.getValue(httpContext.getMessage( "&FilterAlmacenTejido", "")), null);
      AV91AlbRecCod = AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albreccod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91AlbRecCod), 8, 0));
      AV88CliCod = AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88CliCod), 6, 0));
      AV89AlbRFenfrom = AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfenfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89AlbRFenfrom", localUtil.format(AV89AlbRFenfrom, "99/99/99"));
      AV90AlbRFento = AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfento() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90AlbRFento", localUtil.format(AV90AlbRFento, "99/99/99"));
      AV53VarAlbrEst = AV92FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrest() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
   }

   public void S222( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV92FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albreccod( AV91AlbRecCod );
      AV92FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Clicod( AV88CliCod );
      AV92FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albrfenfrom( AV89AlbRFenfrom );
      AV92FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albrfento( AV90AlbRFento );
      AV92FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albrest( AV53VarAlbrEst );
      AV93WebSession.setValue(httpContext.getMessage( "&FilterAlmacenTejido", ""), AV92FilterAlmacenTejido.toJSonString(false, true));
   }

   public void wb_table1_72_1PI2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrpieent_Internalname, httpContext.getMessage( "Tot Value Alb RPie Ent", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrpieent_Internalname, AV77TotValueAlbRPieEnt, GXutil.rtrim( localUtil.format( AV77TotValueAlbRPieEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,85);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrpieent_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrpieent_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrpieuti_Internalname, httpContext.getMessage( "Tot Value Alb RPie Uti", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrpieuti_Internalname, AV79TotValueAlbRPieUti, GXutil.rtrim( localUtil.format( AV79TotValueAlbRPieUti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,88);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrpieuti_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrpieuti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrpiedis_Internalname, httpContext.getMessage( "Tot Value Alb RPie Dis", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrpiedis_Internalname, AV81TotValueAlbRPieDis, GXutil.rtrim( localUtil.format( AV81TotValueAlbRPieDis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrpiedis_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrpiedis_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrunient_Internalname, httpContext.getMessage( "Tot Value Alb RUni Ent", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrunient_Internalname, AV83TotValueAlbRUniEnt, GXutil.rtrim( localUtil.format( AV83TotValueAlbRUniEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrunient_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrunient_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbruniuti_Internalname, httpContext.getMessage( "Tot Value Alb RUni Uti", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbruniuti_Internalname, AV85TotValueAlbRUniUti, GXutil.rtrim( localUtil.format( AV85TotValueAlbRUniUti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbruniuti_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbruniuti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrunidis_Internalname, httpContext.getMessage( "Tot Value Alb RUni Dis", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrunidis_Internalname, AV87TotValueAlbRUniDis, GXutil.rtrim( localUtil.format( AV87TotValueAlbRUniDis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrunidis_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrunidis_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\AlmacenTejidoWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_72_1PI2e( true) ;
      }
      else
      {
         wb_table1_72_1PI2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      pa1PI2( ) ;
      ws1PI2( ) ;
      we1PI2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613528", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/almacentejidoww.js", "?20268211613529", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_52_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_52_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_52_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_52_idx ;
      edtAlbrHor_Internalname = "ALBRHOR_"+sGXsfl_52_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_52_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_52_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_52_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_52_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_52_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_52_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_52_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_52_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_52_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_52_idx );
   }

   public void subsflControlProps_fel_522( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_52_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_52_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_52_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_52_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_52_fel_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_52_fel_idx ;
      edtAlbrHor_Internalname = "ALBRHOR_"+sGXsfl_52_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_52_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_52_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_52_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_52_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_52_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_52_fel_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_52_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_52_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_52_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_52_fel_idx );
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wb1PI0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_52_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV50GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV50GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV50GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_52_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,53);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV50GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRFen_Internalname,localUtil.format(A49AlbRFen, "99/99/99"),localUtil.format( A49AlbRFen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRFen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbrHor_Internalname,localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A6179AlbrHor, "99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbrHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbRUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRUNI_" + sGXsfl_52_idx ;
            cmbAlbRUni.setName( GXCCtl );
            cmbAlbRUni.setWebtags( "" );
            cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
            cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
            if ( cmbAlbRUni.getItemCount() > 0 )
            {
               A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbRUni,cmbAlbRUni.getInternalname(),GXutil.rtrim( A56AlbRUni),Integer.valueOf(1),cmbAlbRUni.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbREst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBREST_" + sGXsfl_52_idx ;
            cmbAlbREst.setName( GXCCtl );
            cmbAlbREst.setWebtags( "" );
            cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
            cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
            if ( cmbAlbREst.getItemCount() > 0 )
            {
               A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbREst,cmbAlbREst.getInternalname(),GXutil.trim( GXutil.str( A47AlbREst, 1, 0)),Integer.valueOf(1),cmbAlbREst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbREst.getColumnClass(),cmbAlbREst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_52_Refreshing);
         send_integrity_lvl_hashes1PI2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"52\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Utilizada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entrada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Utilizada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Stock", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A49AlbRFen, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A56AlbRUni));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbREst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbREst.getColumnHeaderClass()));
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavAlbrfenfrom_Internalname = "vALBRFENFROM" ;
      edtavAlbrfento_Internalname = "vALBRFENTO" ;
      cmbavVaralbrest.setInternalname( "vVARALBREST" );
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      edtAlbrHor_Internalname = "ALBRHOR" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      edtavTotvaluealbrpieent_Internalname = "vTOTVALUEALBRPIEENT" ;
      edtavTotvaluealbrpieuti_Internalname = "vTOTVALUEALBRPIEUTI" ;
      edtavTotvaluealbrpiedis_Internalname = "vTOTVALUEALBRPIEDIS" ;
      edtavTotvaluealbrunient_Internalname = "vTOTVALUEALBRUNIENT" ;
      edtavTotvaluealbruniuti_Internalname = "vTOTVALUEALBRUNIUTI" ;
      edtavTotvaluealbrunidis_Internalname = "vTOTVALUEALBRUNIDIS" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albrhorauxdate_Internalname = "vDDO_ALBRHORAUXDATE" ;
      edtavDdo_albrhorauxdateto_Internalname = "vDDO_ALBRHORAUXDATETO" ;
      divDdo_albrhorauxdates_Internalname = "DDO_ALBRHORAUXDATES" ;
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
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setColumnClass( "WWColumn" );
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniEnt_Jsonclick = "" ;
      cmbAlbRUni.setJsonclick( "" );
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbrHor_Jsonclick = "" ;
      edtAlbRFen_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluealbrunidis_Jsonclick = "" ;
      edtavTotvaluealbrunidis_Enabled = 1 ;
      edtavTotvaluealbruniuti_Jsonclick = "" ;
      edtavTotvaluealbruniuti_Enabled = 1 ;
      edtavTotvaluealbrunient_Jsonclick = "" ;
      edtavTotvaluealbrunient_Enabled = 1 ;
      edtavTotvaluealbrpiedis_Jsonclick = "" ;
      edtavTotvaluealbrpiedis_Enabled = 1 ;
      edtavTotvaluealbrpieuti_Jsonclick = "" ;
      edtavTotvaluealbrpieuti_Enabled = 1 ;
      edtavTotvaluealbrpieent_Jsonclick = "" ;
      edtavTotvaluealbrpieent_Enabled = 1 ;
      cmbAlbREst.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albrhorauxdateto_Jsonclick = "" ;
      edtavDdo_albrhorauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavVaralbrest.setJsonclick( "" );
      cmbavVaralbrest.setEnabled( 1 );
      edtavAlbrfento_Jsonclick = "" ;
      edtavAlbrfento_Enabled = 1 ;
      edtavAlbrfenfrom_Jsonclick = "" ;
      edtavAlbrfenfrom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavAlbreccod_Jsonclick = "" ;
      edtavAlbreccod_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Cliente;Cliente;Entrada;;Referencia;Referencia;Piezas;Piezas;Piezas;;Unidades;Unidades;Unidades;" ;
      Ddo_grid_Datalistproc = "AlmacenSinDetalle.AlmacenTejidoWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||K:K,M:M||||" ;
      Ddo_grid_Allowmultipleselection = "||||||||||T||||" ;
      Ddo_grid_Datalisttype = "||Dynamic|||Dynamic|Dynamic||||FixedValues||||" ;
      Ddo_grid_Includedatalist = "||T|||T|T||||T||||" ;
      Ddo_grid_Filterisrange = "||||T|||T|T|T||T|T|T|" ;
      Ddo_grid_Filtertype = "||Character||Date|Character|Character|Numeric|Numeric|Numeric||Numeric|Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "||T||T|T|T|T|T|T||T|T|T|" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T||T|T|T||T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10||11|12|13||14" ;
      Ddo_grid_Columnids = "2:AlbRecCod|3:CliCod|4:CliNom|5:AlbRFen|6:AlbrHor|7:AlbRef|8:AlbRefDsc|9:AlbRPieEnt|10:AlbRPieUti|11:AlbRPieDis|12:AlbRUni|13:AlbRUniEnt|14:AlbRUniUti|15:AlbRUniDis|16:AlbREst" ;
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
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Almacen Tejido", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavVaralbrest.setName( "vVARALBREST" );
      cmbavVaralbrest.setWebtags( "" );
      cmbavVaralbrest.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbavVaralbrest.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      cmbavVaralbrest.addItem("9", httpContext.getMessage( "Todas", ""), (short)(0));
      if ( cmbavVaralbrest.getItemCount() > 0 )
      {
         AV53VarAlbrEst = (byte)(GXutil.lval( cmbavVaralbrest.getValidValue(GXutil.trim( GXutil.str( AV53VarAlbrEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53VarAlbrEst", GXutil.str( AV53VarAlbrEst, 1, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_52_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV50GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV50GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridActions), 4, 0));
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_52_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBREST_" + sGXsfl_52_idx ;
      cmbAlbREst.setName( GXCCtl );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV99LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV70Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbAlbREst'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotValueAlbRPieEnt',fld:'vTOTVALUEALBRPIEENT',pic:''},{av:'AV79TotValueAlbRPieUti',fld:'vTOTVALUEALBRPIEUTI',pic:''},{av:'AV81TotValueAlbRPieDis',fld:'vTOTVALUEALBRPIEDIS',pic:''},{av:'AV83TotValueAlbRUniEnt',fld:'vTOTVALUEALBRUNIENT',pic:''},{av:'AV85TotValueAlbRUniUti',fld:'vTOTVALUEALBRUNIUTI',pic:''},{av:'AV87TotValueAlbRUniDis',fld:'vTOTVALUEALBRUNIDIS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111PI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV99LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV70Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121PI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV99LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV70Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131PI2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV99LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV70Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e241PI2',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'cmbAlbREst'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e251PI2',iparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV99LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV70Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV50GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV49GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbAlbREst'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV77TotValueAlbRPieEnt',fld:'vTOTVALUEALBRPIEENT',pic:''},{av:'AV79TotValueAlbRPieUti',fld:'vTOTVALUEALBRPIEUTI',pic:''},{av:'AV81TotValueAlbRPieDis',fld:'vTOTVALUEALBRPIEDIS',pic:''},{av:'AV83TotValueAlbRUniEnt',fld:'vTOTVALUEALBRUNIENT',pic:''},{av:'AV85TotValueAlbRUniUti',fld:'vTOTVALUEALBRUNIUTI',pic:''},{av:'AV87TotValueAlbRUniDis',fld:'vTOTVALUEALBRUNIDIS',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e141PI2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e151PI2',iparms:[{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV62TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV42DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV43DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV42DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV43DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV99LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV70Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e161PI2',iparms:[{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV62TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV42DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV43DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV68TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV65TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV62TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV63TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV60TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV56TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV57TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV54TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV45TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV44TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV40TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV41TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV42DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV43DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV35TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV34TFCliNom',fld:'vTFCLINOM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV71EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV99LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV103Pgmname',fld:'vPGMNAME',pic:''},{av:'AV48GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV76TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV80TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV82TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV84TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV86TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV70Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("VVARALBREST.CONTROLVALUECHANGED","{handler:'e171PI2',iparms:[{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VVARALBREST.CONTROLVALUECHANGED",",oparms:[{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED","{handler:'e181PI2',iparms:[{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED","{handler:'e191PI2',iparms:[{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VALBRFENFROM.CONTROLVALUECHANGED","{handler:'e201PI2',iparms:[{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VALBRFENFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VALBRFENTO.CONTROLVALUECHANGED","{handler:'e211PI2',iparms:[{av:'AV91AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV88CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV89AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV90AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV53VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VALBRFENTO.CONTROLVALUECHANGED",",oparms:[{av:'AV92FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albrest',iparms:[]");
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
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV89AlbRFenfrom = GXutil.nullDate() ;
      AV90AlbRFento = GXutil.nullDate() ;
      AV71EmprCod = "" ;
      AV34TFCliNom = "" ;
      AV35TFCliNom_Sel = "" ;
      AV40TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV41TFAlbrHor_To = GXutil.resetTime( GXutil.nullDate() );
      AV44TFAlbRef = "" ;
      AV45TFAlbRef_Sel = "" ;
      AV54TFAlbRefDsc = "" ;
      AV55TFAlbRefDsc_Sel = "" ;
      AV63TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV64TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV65TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV66TFAlbRUniUti = DecimalUtil.ZERO ;
      AV67TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV68TFAlbRUniDis = DecimalUtil.ZERO ;
      AV69TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV103Pgmname = "" ;
      AV82TotAlbRUniEnt = DecimalUtil.ZERO ;
      AV84TotAlbRUniUti = DecimalUtil.ZERO ;
      AV86TotAlbRUniDis = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV46DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV62TFAlbRUni_SelsJson = "" ;
      AV92FilterAlmacenTejido = new app.almacensindetalle.SdtFilterAlmacenTejido(remoteHandle, context);
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
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV42DDO_AlbrHorAuxDate = GXutil.nullDate() ;
      AV43DDO_AlbrHorAuxDateTo = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      A6179AlbrHor = GXutil.resetTime( GXutil.nullDate() );
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A56AlbRUni = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV105Almacensindetalle_almacentejidowwds_1_tfclinom = "" ;
      lV109Almacensindetalle_almacentejidowwds_5_tfalbref = "" ;
      lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = "" ;
      AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel = "" ;
      AV105Almacensindetalle_almacentejidowwds_1_tfclinom = "" ;
      AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to = GXutil.resetTime( GXutil.nullDate() );
      AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel = "" ;
      AV109Almacensindetalle_almacentejidowwds_5_tfalbref = "" ;
      AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel = "" ;
      AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc = "" ;
      AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient = DecimalUtil.ZERO ;
      AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to = DecimalUtil.ZERO ;
      AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti = DecimalUtil.ZERO ;
      AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis = DecimalUtil.ZERO ;
      AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to = DecimalUtil.ZERO ;
      H01PI2_A47AlbREst = new byte[1] ;
      H01PI2_A56AlbRUni = new String[] {""} ;
      H01PI2_A3613AlbRefDsc = new String[] {""} ;
      H01PI2_A45AlbRef = new String[] {""} ;
      H01PI2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01PI2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H01PI2_A279CliNom = new String[] {""} ;
      H01PI2_A252CliCod = new int[1] ;
      H01PI2_A44AlbRecCod = new int[1] ;
      H01PI2_A396EmprCod = new String[] {""} ;
      H01PI2_A54AlbRPieUti = new int[1] ;
      H01PI2_A52AlbRPieEnt = new int[1] ;
      H01PI2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PI2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PI3_AGRID_nRecordCount = new long[1] ;
      AV77TotValueAlbRPieEnt = "" ;
      AV79TotValueAlbRPieUti = "" ;
      AV81TotValueAlbRPieDis = "" ;
      AV83TotValueAlbRUniEnt = "" ;
      AV85TotValueAlbRUniUti = "" ;
      AV87TotValueAlbRUniDis = "" ;
      hsh = "" ;
      AV72Station = "" ;
      AV73EmprNom = "" ;
      AV74UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char13 = new String[1] ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char10 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV97Totalset = DecimalUtil.ZERO ;
      H01PI4_A47AlbREst = new byte[1] ;
      H01PI4_A252CliCod = new int[1] ;
      H01PI4_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H01PI4_A44AlbRecCod = new int[1] ;
      H01PI4_A396EmprCod = new String[] {""} ;
      H01PI4_A56AlbRUni = new String[] {""} ;
      H01PI4_A3613AlbRefDsc = new String[] {""} ;
      H01PI4_A45AlbRef = new String[] {""} ;
      H01PI4_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01PI4_A279CliNom = new String[] {""} ;
      H01PI4_A54AlbRPieUti = new int[1] ;
      H01PI4_A52AlbRPieEnt = new int[1] ;
      H01PI4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01PI4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV93WebSession = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.almacentejidoww__default(),
         new Object[] {
             new Object[] {
            H01PI2_A47AlbREst, H01PI2_A56AlbRUni, H01PI2_A3613AlbRefDsc, H01PI2_A45AlbRef, H01PI2_A6179AlbrHor, H01PI2_A49AlbRFen, H01PI2_A279CliNom, H01PI2_A252CliCod, H01PI2_A44AlbRecCod, H01PI2_A396EmprCod,
            H01PI2_A54AlbRPieUti, H01PI2_A52AlbRPieEnt, H01PI2_A60AlbRUniUti, H01PI2_A58AlbRUniEnt
            }
            , new Object[] {
            H01PI3_AGRID_nRecordCount
            }
            , new Object[] {
            H01PI4_A47AlbREst, H01PI4_A252CliCod, H01PI4_A49AlbRFen, H01PI4_A44AlbRecCod, H01PI4_A396EmprCod, H01PI4_A56AlbRUni, H01PI4_A3613AlbRefDsc, H01PI4_A45AlbRef, H01PI4_A6179AlbrHor, H01PI4_A279CliNom,
            H01PI4_A54AlbRPieUti, H01PI4_A52AlbRPieEnt, H01PI4_A60AlbRUniUti, H01PI4_A58AlbRUniEnt
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV103Pgmname = "AlmacenSinDetalle.AlmacenTejidoWW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV103Pgmname = "AlmacenSinDetalle.AlmacenTejidoWW" ;
      Gx_err = (short)(0) ;
      edtavTotvaluealbrpieent_Enabled = 0 ;
      edtavTotvaluealbrpieuti_Enabled = 0 ;
      edtavTotvaluealbrpiedis_Enabled = 0 ;
      edtavTotvaluealbrunient_Enabled = 0 ;
      edtavTotvaluealbruniuti_Enabled = 0 ;
      edtavTotvaluealbrunidis_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV53VarAlbrEst ;
   private byte gxajaxcallmode ;
   private byte A47AlbREst ;
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
   private short AV70Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV50GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV94L ;
   private short AV96Offset ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_52 ;
   private int nGXsfl_52_idx=1 ;
   private int AV91AlbRecCod ;
   private int AV88CliCod ;
   private int AV56TFAlbRPieEnt ;
   private int AV57TFAlbRPieEnt_To ;
   private int AV58TFAlbRPieUti ;
   private int AV59TFAlbRPieUti_To ;
   private int AV60TFAlbRPieDis ;
   private int AV61TFAlbRPieDis_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbreccod_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavAlbrfenfrom_Enabled ;
   private int edtavAlbrfento_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int A52AlbRPieEnt ;
   private int A54AlbRPieUti ;
   private int A51AlbRPieDis ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluealbrpieent_Enabled ;
   private int edtavTotvaluealbrpieuti_Enabled ;
   private int edtavTotvaluealbrpiedis_Enabled ;
   private int edtavTotvaluealbrunient_Enabled ;
   private int edtavTotvaluealbruniuti_Enabled ;
   private int edtavTotvaluealbrunidis_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ;
   private int AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent ;
   private int AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ;
   private int AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ;
   private int AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ;
   private int AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ;
   private int AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ;
   private int AV47PageToGo ;
   private int AV126GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV48GridCurrentPage ;
   private long AV76TotAlbRPieEnt ;
   private long AV78TotAlbRPieUti ;
   private long AV80TotAlbRPieDis ;
   private long AV49GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV64TFAlbRUniEnt ;
   private java.math.BigDecimal AV65TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV66TFAlbRUniUti ;
   private java.math.BigDecimal AV67TFAlbRUniUti_To ;
   private java.math.BigDecimal AV68TFAlbRUniDis ;
   private java.math.BigDecimal AV69TFAlbRUniDis_To ;
   private java.math.BigDecimal AV82TotAlbRUniEnt ;
   private java.math.BigDecimal AV84TotAlbRUniUti ;
   private java.math.BigDecimal AV86TotAlbRUniDis ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient ;
   private java.math.BigDecimal AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ;
   private java.math.BigDecimal AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti ;
   private java.math.BigDecimal AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ;
   private java.math.BigDecimal AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis ;
   private java.math.BigDecimal AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ;
   private java.math.BigDecimal AV97Totalset ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_52_idx="0001" ;
   private String AV71EmprCod ;
   private String AV34TFCliNom ;
   private String AV35TFCliNom_Sel ;
   private String AV44TFAlbRef ;
   private String AV45TFAlbRef_Sel ;
   private String AV54TFAlbRefDsc ;
   private String AV55TFAlbRefDsc_Sel ;
   private String AV103Pgmname ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
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
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String edtavAlbreccod_Internalname ;
   private String edtavAlbreccod_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavAlbrfenfrom_Internalname ;
   private String edtavAlbrfenfrom_Jsonclick ;
   private String edtavAlbrfento_Internalname ;
   private String edtavAlbrfento_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albrhorauxdates_Internalname ;
   private String edtavDdo_albrhorauxdate_Internalname ;
   private String edtavDdo_albrhorauxdate_Jsonclick ;
   private String edtavDdo_albrhorauxdateto_Internalname ;
   private String edtavDdo_albrhorauxdateto_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbrHor_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieDis_Internalname ;
   private String A56AlbRUni ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniDis_Internalname ;
   private String edtavTotvaluealbrpieent_Internalname ;
   private String edtavTotvaluealbrpieuti_Internalname ;
   private String edtavTotvaluealbrpiedis_Internalname ;
   private String edtavTotvaluealbrunient_Internalname ;
   private String edtavTotvaluealbruniuti_Internalname ;
   private String edtavTotvaluealbrunidis_Internalname ;
   private String scmdbuf ;
   private String lV105Almacensindetalle_almacentejidowwds_1_tfclinom ;
   private String lV109Almacensindetalle_almacentejidowwds_5_tfalbref ;
   private String lV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ;
   private String AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel ;
   private String AV105Almacensindetalle_almacentejidowwds_1_tfclinom ;
   private String AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel ;
   private String AV109Almacensindetalle_almacentejidowwds_5_tfalbref ;
   private String AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ;
   private String AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ;
   private String hsh ;
   private String AV72Station ;
   private String AV73EmprNom ;
   private String AV74UsurCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char12 ;
   private String GXv_char13[] ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXt_char10 ;
   private String GXv_char3[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluealbrpieent_Jsonclick ;
   private String edtavTotvaluealbrpieuti_Jsonclick ;
   private String edtavTotvaluealbrpiedis_Jsonclick ;
   private String edtavTotvaluealbrunient_Jsonclick ;
   private String edtavTotvaluealbruniuti_Jsonclick ;
   private String edtavTotvaluealbrunidis_Jsonclick ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRFen_Jsonclick ;
   private String edtAlbrHor_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRUniDis_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV40TFAlbrHor ;
   private java.util.Date AV41TFAlbrHor_To ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor ;
   private java.util.Date AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ;
   private java.util.Date AV89AlbRFenfrom ;
   private java.util.Date AV90AlbRFento ;
   private java.util.Date Gx_date ;
   private java.util.Date AV42DDO_AlbrHorAuxDate ;
   private java.util.Date AV43DDO_AlbrHorAuxDateTo ;
   private java.util.Date A49AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV99LoadGridData ;
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
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV62TFAlbRUni_SelsJson ;
   private String AV77TotValueAlbRPieEnt ;
   private String AV79TotValueAlbRPieUti ;
   private String AV81TotValueAlbRPieDis ;
   private String AV83TotValueAlbRUniEnt ;
   private String AV85TotValueAlbRUniUti ;
   private String AV87TotValueAlbRUniDis ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV93WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ;
   private HTMLChoice cmbavVaralbrest ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private byte[] H01PI2_A47AlbREst ;
   private String[] H01PI2_A56AlbRUni ;
   private String[] H01PI2_A3613AlbRefDsc ;
   private String[] H01PI2_A45AlbRef ;
   private java.util.Date[] H01PI2_A6179AlbrHor ;
   private java.util.Date[] H01PI2_A49AlbRFen ;
   private String[] H01PI2_A279CliNom ;
   private int[] H01PI2_A252CliCod ;
   private int[] H01PI2_A44AlbRecCod ;
   private String[] H01PI2_A396EmprCod ;
   private int[] H01PI2_A54AlbRPieUti ;
   private int[] H01PI2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] H01PI2_A60AlbRUniUti ;
   private java.math.BigDecimal[] H01PI2_A58AlbRUniEnt ;
   private long[] H01PI3_AGRID_nRecordCount ;
   private byte[] H01PI4_A47AlbREst ;
   private int[] H01PI4_A252CliCod ;
   private java.util.Date[] H01PI4_A49AlbRFen ;
   private int[] H01PI4_A44AlbRecCod ;
   private String[] H01PI4_A396EmprCod ;
   private String[] H01PI4_A56AlbRUni ;
   private String[] H01PI4_A3613AlbRefDsc ;
   private String[] H01PI4_A45AlbRef ;
   private java.util.Date[] H01PI4_A6179AlbrHor ;
   private String[] H01PI4_A279CliNom ;
   private int[] H01PI4_A54AlbRPieUti ;
   private int[] H01PI4_A52AlbRPieEnt ;
   private java.math.BigDecimal[] H01PI4_A60AlbRUniUti ;
   private java.math.BigDecimal[] H01PI4_A58AlbRUniEnt ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV63TFAlbRUni_Sels ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV46DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.almacensindetalle.SdtFilterAlmacenTejido AV92FilterAlmacenTejido ;
}

final  class almacentejidoww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01PI2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                          String AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                          String AV105Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                          java.util.Date AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                          java.util.Date AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                          String AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                          String AV109Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                          String AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                          String AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                          int AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent ,
                                          int AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ,
                                          int AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ,
                                          int AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ,
                                          int AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ,
                                          int AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ,
                                          int AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                          int AV91AlbRecCod ,
                                          java.util.Date AV89AlbRFenfrom ,
                                          java.util.Date AV90AlbRFento ,
                                          int AV88CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          byte A47AlbREst ,
                                          byte AV53VarAlbrEst ,
                                          String AV71EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[32];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbREst, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T1.AlbRFen, T2.CliNom, T1.CliCod, T1.AlbRecCod, T1.EmprCod, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      sSelectString += " T1.AlbRUniEnt" ;
      sFromString = " FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( (GXutil.strcmp("", AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Almacensindetalle_almacentejidowwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV109Almacensindetalle_almacentejidowwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( ! (0==AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (0==AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (0==AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int15[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int15[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int15[22] = (byte)(1) ;
      }
      if ( ! (0==AV91AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int15[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89AlbRFenfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int15[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90AlbRFento)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int15[25] = (byte)(1) ;
      }
      if ( ! (0==AV88CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int15[26] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRFen" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRFen DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbrHor" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbrHor DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRef" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRef DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRefDsc" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRefDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRPieEnt" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRPieEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRPieUti" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRPieUti DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRUni" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRUni DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRUniEnt" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRUniEnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRUniUti" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRUniUti DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbREst" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbREst DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H01PI3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                          String AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                          String AV105Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                          java.util.Date AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                          java.util.Date AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                          String AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                          String AV109Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                          String AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                          String AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                          int AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent ,
                                          int AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ,
                                          int AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ,
                                          int AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ,
                                          int AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ,
                                          int AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ,
                                          int AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                          int AV91AlbRecCod ,
                                          java.util.Date AV89AlbRFenfrom ,
                                          java.util.Date AV90AlbRFento ,
                                          int AV88CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          byte A47AlbREst ,
                                          byte AV53VarAlbrEst ,
                                          String AV71EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[27];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( (GXutil.strcmp("", AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Almacensindetalle_almacentejidowwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV109Almacensindetalle_almacentejidowwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (0==AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( ! (0==AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (0==AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (0==AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int18[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int18[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int18[22] = (byte)(1) ;
      }
      if ( ! (0==AV91AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int18[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89AlbRFenfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int18[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90AlbRFento)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int18[25] = (byte)(1) ;
      }
      if ( ! (0==AV88CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int18[26] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   protected Object[] conditional_H01PI4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels ,
                                          String AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel ,
                                          String AV105Almacensindetalle_almacentejidowwds_1_tfclinom ,
                                          java.util.Date AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor ,
                                          java.util.Date AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to ,
                                          String AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel ,
                                          String AV109Almacensindetalle_almacentejidowwds_5_tfalbref ,
                                          String AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel ,
                                          String AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc ,
                                          int AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent ,
                                          int AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to ,
                                          int AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti ,
                                          int AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to ,
                                          int AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis ,
                                          int AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to ,
                                          int AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to ,
                                          int AV91AlbRecCod ,
                                          java.util.Date AV89AlbRFenfrom ,
                                          java.util.Date AV90AlbRFento ,
                                          int AV88CliCod ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          int A44AlbRecCod ,
                                          java.util.Date A49AlbRFen ,
                                          int A252CliCod ,
                                          byte A47AlbREst ,
                                          byte AV53VarAlbrEst ,
                                          String AV71EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[27];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.AlbREst, T1.CliCod, T1.AlbRFen, T1.AlbRecCod, T1.EmprCod, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      scmdbuf += " T1.AlbRUniEnt FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbREst = ? or ? = 9)");
      if ( (GXutil.strcmp("", AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV105Almacensindetalle_almacentejidowwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Almacensindetalle_almacentejidowwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV107Almacensindetalle_almacentejidowwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV108Almacensindetalle_almacentejidowwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV109Almacensindetalle_almacentejidowwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Almacensindetalle_almacentejidowwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV111Almacensindetalle_almacentejidowwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV112Almacensindetalle_almacentejidowwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Almacensindetalle_almacentejidowwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (0==AV114Almacensindetalle_almacentejidowwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV115Almacensindetalle_almacentejidowwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (0==AV116Almacensindetalle_almacentejidowwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (0==AV117Almacensindetalle_almacentejidowwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (0==AV118Almacensindetalle_almacentejidowwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV119Almacensindetalle_almacentejidowwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV120Almacensindetalle_almacentejidowwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV121Almacensindetalle_almacentejidowwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV122Almacensindetalle_almacentejidowwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV123Almacensindetalle_almacentejidowwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Almacensindetalle_almacentejidowwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Almacensindetalle_almacentejidowwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV91AlbRecCod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod = ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89AlbRFenfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen >= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV90AlbRFento)) )
      {
         addWhere(sWhereString, "(T1.AlbRFen <= ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (0==AV88CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
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
                  return conditional_H01PI2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 1 :
                  return conditional_H01PI3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).shortValue() , ((Boolean) dynConstraints[39]).booleanValue() , ((Number) dynConstraints[40]).byteValue() , ((Number) dynConstraints[41]).byteValue() , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 2 :
                  return conditional_H01PI4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , (String)dynConstraints[27] , (java.util.Date)dynConstraints[28] , (String)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).intValue() , (java.math.BigDecimal)dynConstraints[33] , (java.math.BigDecimal)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).intValue() , ((Number) dynConstraints[38]).byteValue() , ((Number) dynConstraints[39]).byteValue() , (String)dynConstraints[40] , (String)dynConstraints[41] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01PI2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PI3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01PI4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((java.util.Date[]) buf[4])[0] = GXutil.resetDate(rslt.getGXDateTime(5));
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 16);
               ((java.util.Date[]) buf[8])[0] = GXutil.resetDate(rslt.getGXDateTime(9));
               ((String[]) buf[9])[0] = rslt.getString(10, 30);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
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
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[33]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[34]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[37], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[38], true);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[50], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[51], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[56]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[57]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[32], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], true);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[28]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[32], true);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], true);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 26);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 26);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[47], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[48], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[49], 2);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               return;
      }
   }

}

