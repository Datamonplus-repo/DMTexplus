package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn22ww_impl extends GXDataArea
{
   public ttrn22ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn22ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn22ww_impl.class ));
   }

   public ttrn22ww_impl( int remoteHandle ,
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
      nRC_GXsfl_51 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_51"))) ;
      nGXsfl_51_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_51_idx"))) ;
      sGXsfl_51_idx = httpContext.GetPar( "sGXsfl_51_idx") ;
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
      AV88LoadGridData = GXutil.strtobool( httpContext.GetPar( "LoadGridData")) ;
      AV30TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV31TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV54TFAlbrHor = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbrHor"))) ;
      AV55TFAlbrHor_To = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbrHor_To"))) ;
      AV34TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV35TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV36TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV37TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      AV58TFAlbRPieEnt = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt"))) ;
      AV59TFAlbRPieEnt_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieEnt_To"))) ;
      AV60TFAlbRPieUti = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti"))) ;
      AV61TFAlbRPieUti_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieUti_To"))) ;
      AV62TFAlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis"))) ;
      AV63TFAlbRPieDis_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRPieDis_To"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV65TFAlbRUni_Sels);
      AV66TFAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt"), ".") ;
      AV67TFAlbRUniEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniEnt_To"), ".") ;
      AV68TFAlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti"), ".") ;
      AV69TFAlbRUniUti_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniUti_To"), ".") ;
      AV70TFAlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis"), ".") ;
      AV71TFAlbRUniDis_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbRUniDis_To"), ".") ;
      AV91Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV40GridCurrentPage = GXutil.lval( httpContext.GetPar( "GridCurrentPage")) ;
      AV72TotAlbRPieEnt = GXutil.lval( httpContext.GetPar( "TotAlbRPieEnt")) ;
      AV74TotAlbRPieUti = GXutil.lval( httpContext.GetPar( "TotAlbRPieUti")) ;
      AV76TotAlbRPieDis = GXutil.lval( httpContext.GetPar( "TotAlbRPieDis")) ;
      AV78TotAlbRUniEnt = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbRUniEnt"), ".") ;
      AV80TotAlbRUniUti = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbRUniUti"), ".") ;
      AV82TotAlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbRUniDis"), ".") ;
      AV87Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV88LoadGridData, AV30TFCliNom, AV31TFCliNom_Sel, AV54TFAlbrHor, AV55TFAlbrHor_To, AV34TFAlbRef, AV35TFAlbRef_Sel, AV36TFAlbRefDsc, AV37TFAlbRefDsc_Sel, AV58TFAlbRPieEnt, AV59TFAlbRPieEnt_To, AV60TFAlbRPieUti, AV61TFAlbRPieUti_To, AV62TFAlbRPieDis, AV63TFAlbRPieDis_To, AV65TFAlbRUni_Sels, AV66TFAlbRUniEnt, AV67TFAlbRUniEnt_To, AV68TFAlbRUniUti, AV69TFAlbRUniUti_To, AV70TFAlbRUniDis, AV71TFAlbRUniDis_To, AV91Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40GridCurrentPage, AV72TotAlbRPieEnt, AV74TotAlbRPieUti, AV76TotAlbRPieDis, AV78TotAlbRUniEnt, AV80TotAlbRUniUti, AV82TotAlbRUniDis, AV87Moda21, Gx_date) ;
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
      pa2DE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2DE2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn22ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOADGRIDDATA", getSecureSignedToken( "", AV88LoadGridData));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV78TotAlbRUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV80TotAlbRUniUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn22WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV91Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn22ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_51", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_51, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV40GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV41GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV38DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV88LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOADGRIDDATA", getSecureSignedToken( "", AV88LoadGridData));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV30TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV31TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRHOR", localUtil.ttoc( AV54TFAlbrHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRHOR_TO", localUtil.ttoc( AV55TFAlbrHor_To, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV34TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV35TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC", GXutil.rtrim( AV36TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC_SEL", GXutil.rtrim( AV37TFAlbRefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV58TFAlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEENT_TO", GXutil.ltrim( localUtil.ntoc( AV59TFAlbRPieEnt_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV60TFAlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEUTI_TO", GXutil.ltrim( localUtil.ntoc( AV61TFAlbRPieUti_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV62TFAlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRPIEDIS_TO", GXutil.ltrim( localUtil.ntoc( AV63TFAlbRPieDis_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBRUNI_SELS", AV65TFAlbRUni_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBRUNI_SELS", AV65TFAlbRUni_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV66TFAlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIENT_TO", GXutil.ltrim( localUtil.ntoc( AV67TFAlbRUniEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV68TFAlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIUTI_TO", GXutil.ltrim( localUtil.ntoc( AV69TFAlbRUniUti_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV70TFAlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNIDIS_TO", GXutil.ltrim( localUtil.ntoc( AV71TFAlbRUniDis_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV72TotAlbRPieEnt, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV74TotAlbRPieUti, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV76TotAlbRPieDis, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV78TotAlbRUniEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV78TotAlbRUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV80TotAlbRUniUti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV80TotAlbRUniUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV82TotAlbRUniDis, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV87Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRUNI_SELSJSON", AV64TFAlbRUni_SelsJson);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERALMACENTEJIDO", AV44FilterAlmacenTejido);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERALMACENTEJIDO", AV44FilterAlmacenTejido);
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
         we2DE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2DE2( ) ;
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
      return formatLink("app.ttrn22ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrn22WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Entrada Tejido Crudo Almacen", "") ;
   }

   public void wb2DE0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 51, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn22WW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV49AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV49AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV49AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn22WW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV50CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn22WW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfenfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfenfrom_Internalname, localUtil.format(AV52AlbRFenfrom, "99/99/99"), localUtil.format( AV52AlbRFenfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfenfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfenfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfenfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfenfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn22WW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbrfento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrfento_Internalname, localUtil.format(AV53AlbRFento, "99/99/99"), localUtil.format( AV53AlbRFento, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrfento_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrfento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbrfento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbrfento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn22WW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavVaralbrest, cmbavVaralbrest.getInternalname(), GXutil.trim( GXutil.str( AV43VarAlbrEst, 1, 0)), 1, cmbavVaralbrest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavVaralbrest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "", true, (byte)(0), "HLP_TTrn22WW.htm");
         cmbavVaralbrest.setValue( GXutil.trim( GXutil.str( AV43VarAlbrEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavVaralbrest.getInternalname(), "Values", cmbavVaralbrest.ToJavascriptSource(), true);
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
         startgridcontrol51( ) ;
      }
      if ( wbEnd == 51 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_51 = (int)(nGXsfl_51_idx-1) ;
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
         wb_table1_71_2DE2( true) ;
      }
      else
      {
         wb_table1_71_2DE2( false) ;
      }
      return  ;
   }

   public void wb_table1_71_2DE2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV40GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV41GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV91Pgmname), GXutil.rtrim( localUtil.format( AV91Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn22WW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV38DDO_TitleSettingsIcons);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrhorauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrhorauxdate_Internalname, localUtil.format(AV56DDO_AlbrHorAuxDate, "99/99/99"), localUtil.format( AV56DDO_AlbrHorAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrhorauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrhorauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn22WW.htm");
         httpContext.writeTextNL( "</div>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albrhorauxdateto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albrhorauxdateto_Internalname, localUtil.format(AV57DDO_AlbrHorAuxDateTo, "99/99/99"), localUtil.format( AV57DDO_AlbrHorAuxDateTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albrhorauxdateto_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albrhorauxdateto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TTrn22WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 51 )
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

   public void start2DE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Entrada Tejido Crudo Almacen", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2DE0( ) ;
   }

   public void ws2DE2( )
   {
      start2DE2( ) ;
      evt2DE2( ) ;
   }

   public void evt2DE2( )
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
                           e112DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e142DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e152DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e162DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VVARALBREST.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRECCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRFENFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202DE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRFENTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212DE2 ();
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
                           nGXsfl_51_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_512( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV42GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
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
                                 e222DE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e232DE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242DE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e252DE2 ();
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

   public void we2DE2( )
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

   public void pa2DE2( )
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
      subsflControlProps_512( ) ;
      while ( nGXsfl_51_idx <= nRC_GXsfl_51 )
      {
         sendrow_512( ) ;
         nGXsfl_51_idx = ((subGrid_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_512( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 boolean AV88LoadGridData ,
                                 String AV30TFCliNom ,
                                 String AV31TFCliNom_Sel ,
                                 java.util.Date AV54TFAlbrHor ,
                                 java.util.Date AV55TFAlbrHor_To ,
                                 String AV34TFAlbRef ,
                                 String AV35TFAlbRef_Sel ,
                                 String AV36TFAlbRefDsc ,
                                 String AV37TFAlbRefDsc_Sel ,
                                 int AV58TFAlbRPieEnt ,
                                 int AV59TFAlbRPieEnt_To ,
                                 int AV60TFAlbRPieUti ,
                                 int AV61TFAlbRPieUti_To ,
                                 int AV62TFAlbRPieDis ,
                                 int AV63TFAlbRPieDis_To ,
                                 GXSimpleCollection<String> AV65TFAlbRUni_Sels ,
                                 java.math.BigDecimal AV66TFAlbRUniEnt ,
                                 java.math.BigDecimal AV67TFAlbRUniEnt_To ,
                                 java.math.BigDecimal AV68TFAlbRUniUti ,
                                 java.math.BigDecimal AV69TFAlbRUniUti_To ,
                                 java.math.BigDecimal AV70TFAlbRUniDis ,
                                 java.math.BigDecimal AV71TFAlbRUniDis_To ,
                                 String AV91Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 long AV40GridCurrentPage ,
                                 long AV72TotAlbRPieEnt ,
                                 long AV74TotAlbRPieUti ,
                                 long AV76TotAlbRPieDis ,
                                 java.math.BigDecimal AV78TotAlbRUniEnt ,
                                 java.math.BigDecimal AV80TotAlbRUniUti ,
                                 java.math.BigDecimal AV82TotAlbRUniDis ,
                                 short AV87Moda21 ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e232DE2 ();
      GRID_nCurrentRecord = 0 ;
      rf2DE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn22WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV91Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn22ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
         AV43VarAlbrEst = (byte)(GXutil.lval( cmbavVaralbrest.getValidValue(GXutil.trim( GXutil.str( AV43VarAlbrEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavVaralbrest.setValue( GXutil.trim( GXutil.str( AV43VarAlbrEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavVaralbrest.getInternalname(), "Values", cmbavVaralbrest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2DE2( ) ;
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
      AV91Pgmname = "TTrn22WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Pgmname", AV91Pgmname);
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

   public void rf2DE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(51) ;
      /* Execute user event: Refresh */
      e232DE2 ();
      nGXsfl_51_idx = 1 ;
      sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_512( ) ;
      bGXsfl_51_Refreshing = true ;
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
         subsflControlProps_512( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              A56AlbRUni ,
                                              AV107Ttrn22wwds_15_tfalbruni_sels ,
                                              AV94Ttrn22wwds_2_tfclinom_sel ,
                                              AV93Ttrn22wwds_1_tfclinom ,
                                              AV95Ttrn22wwds_3_tfalbrhor ,
                                              AV96Ttrn22wwds_4_tfalbrhor_to ,
                                              AV98Ttrn22wwds_6_tfalbref_sel ,
                                              AV97Ttrn22wwds_5_tfalbref ,
                                              AV100Ttrn22wwds_8_tfalbrefdsc_sel ,
                                              AV99Ttrn22wwds_7_tfalbrefdsc ,
                                              Integer.valueOf(AV101Ttrn22wwds_9_tfalbrpieent) ,
                                              Integer.valueOf(AV102Ttrn22wwds_10_tfalbrpieent_to) ,
                                              Integer.valueOf(AV103Ttrn22wwds_11_tfalbrpieuti) ,
                                              Integer.valueOf(AV104Ttrn22wwds_12_tfalbrpieuti_to) ,
                                              Integer.valueOf(AV105Ttrn22wwds_13_tfalbrpiedis) ,
                                              Integer.valueOf(AV106Ttrn22wwds_14_tfalbrpiedis_to) ,
                                              Integer.valueOf(AV107Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                              AV108Ttrn22wwds_16_tfalbrunient ,
                                              AV109Ttrn22wwds_17_tfalbrunient_to ,
                                              AV110Ttrn22wwds_18_tfalbruniuti ,
                                              AV111Ttrn22wwds_19_tfalbruniuti_to ,
                                              AV112Ttrn22wwds_20_tfalbrunidis ,
                                              AV113Ttrn22wwds_21_tfalbrunidis_to ,
                                              A279CliNom ,
                                              A6179AlbrHor ,
                                              A45AlbRef ,
                                              A3613AlbRefDsc ,
                                              Integer.valueOf(A52AlbRPieEnt) ,
                                              Integer.valueOf(A54AlbRPieUti) ,
                                              A58AlbRUniEnt ,
                                              A60AlbRUniUti ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV93Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV93Ttrn22wwds_1_tfclinom), 30, "%") ;
         lV97Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV97Ttrn22wwds_5_tfalbref), 16, "%") ;
         lV99Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV99Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
         /* Using cursor H02DE2 */
         pr_default.execute(0, new Object[] {lV93Ttrn22wwds_1_tfclinom, AV94Ttrn22wwds_2_tfclinom_sel, AV95Ttrn22wwds_3_tfalbrhor, AV96Ttrn22wwds_4_tfalbrhor_to, lV97Ttrn22wwds_5_tfalbref, AV98Ttrn22wwds_6_tfalbref_sel, lV99Ttrn22wwds_7_tfalbrefdsc, AV100Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV101Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV102Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV103Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV104Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV105Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV106Ttrn22wwds_14_tfalbrpiedis_to), AV108Ttrn22wwds_16_tfalbrunient, AV109Ttrn22wwds_17_tfalbrunient_to, AV110Ttrn22wwds_18_tfalbruniuti, AV111Ttrn22wwds_19_tfalbruniuti_to, AV112Ttrn22wwds_20_tfalbrunidis, AV113Ttrn22wwds_21_tfalbrunidis_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_51_idx = 1 ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_512( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A47AlbREst = H02DE2_A47AlbREst[0] ;
            A56AlbRUni = H02DE2_A56AlbRUni[0] ;
            A3613AlbRefDsc = H02DE2_A3613AlbRefDsc[0] ;
            A45AlbRef = H02DE2_A45AlbRef[0] ;
            A6179AlbrHor = H02DE2_A6179AlbrHor[0] ;
            A49AlbRFen = H02DE2_A49AlbRFen[0] ;
            A279CliNom = H02DE2_A279CliNom[0] ;
            A252CliCod = H02DE2_A252CliCod[0] ;
            A44AlbRecCod = H02DE2_A44AlbRecCod[0] ;
            A396EmprCod = H02DE2_A396EmprCod[0] ;
            A54AlbRPieUti = H02DE2_A54AlbRPieUti[0] ;
            A52AlbRPieEnt = H02DE2_A52AlbRPieEnt[0] ;
            A60AlbRUniUti = H02DE2_A60AlbRUniUti[0] ;
            A58AlbRUniEnt = H02DE2_A58AlbRUniEnt[0] ;
            A279CliNom = H02DE2_A279CliNom[0] ;
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
            e242DE2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(51) ;
         wb2DE0( ) ;
      }
      bGXsfl_51_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DE2( )
   {
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV88LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOADGRIDDATA", getSecureSignedToken( "", AV88LoadGridData));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEENT", GXutil.ltrim( localUtil.ntoc( AV72TotAlbRPieEnt, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( AV74TotAlbRPieUti, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV76TotAlbRPieDis, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIENT", GXutil.ltrim( localUtil.ntoc( AV78TotAlbRUniEnt, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV78TotAlbRUniEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( AV80TotAlbRUniUti, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV80TotAlbRUniUti, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV82TotAlbRUniDis, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniDis, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV87Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
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
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV107Ttrn22wwds_15_tfalbruni_sels ,
                                           AV94Ttrn22wwds_2_tfclinom_sel ,
                                           AV93Ttrn22wwds_1_tfclinom ,
                                           AV95Ttrn22wwds_3_tfalbrhor ,
                                           AV96Ttrn22wwds_4_tfalbrhor_to ,
                                           AV98Ttrn22wwds_6_tfalbref_sel ,
                                           AV97Ttrn22wwds_5_tfalbref ,
                                           AV100Ttrn22wwds_8_tfalbrefdsc_sel ,
                                           AV99Ttrn22wwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV101Ttrn22wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV102Ttrn22wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV103Ttrn22wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV104Ttrn22wwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV105Ttrn22wwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV106Ttrn22wwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV107Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                           AV108Ttrn22wwds_16_tfalbrunient ,
                                           AV109Ttrn22wwds_17_tfalbrunient_to ,
                                           AV110Ttrn22wwds_18_tfalbruniuti ,
                                           AV111Ttrn22wwds_19_tfalbruniuti_to ,
                                           AV112Ttrn22wwds_20_tfalbrunidis ,
                                           AV113Ttrn22wwds_21_tfalbrunidis_to ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV93Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV93Ttrn22wwds_1_tfclinom), 30, "%") ;
      lV97Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV97Ttrn22wwds_5_tfalbref), 16, "%") ;
      lV99Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV99Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor H02DE3 */
      pr_default.execute(1, new Object[] {lV93Ttrn22wwds_1_tfclinom, AV94Ttrn22wwds_2_tfclinom_sel, AV95Ttrn22wwds_3_tfalbrhor, AV96Ttrn22wwds_4_tfalbrhor_to, lV97Ttrn22wwds_5_tfalbref, AV98Ttrn22wwds_6_tfalbref_sel, lV99Ttrn22wwds_7_tfalbrefdsc, AV100Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV101Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV102Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV103Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV104Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV105Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV106Ttrn22wwds_14_tfalbrpiedis_to), AV108Ttrn22wwds_16_tfalbrunient, AV109Ttrn22wwds_17_tfalbrunient_to, AV110Ttrn22wwds_18_tfalbruniuti, AV111Ttrn22wwds_19_tfalbruniuti_to, AV112Ttrn22wwds_20_tfalbrunidis, AV113Ttrn22wwds_21_tfalbrunidis_to});
      GRID_nRecordCount = H02DE3_AGRID_nRecordCount[0] ;
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
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV88LoadGridData, AV30TFCliNom, AV31TFCliNom_Sel, AV54TFAlbrHor, AV55TFAlbrHor_To, AV34TFAlbRef, AV35TFAlbRef_Sel, AV36TFAlbRefDsc, AV37TFAlbRefDsc_Sel, AV58TFAlbRPieEnt, AV59TFAlbRPieEnt_To, AV60TFAlbRPieUti, AV61TFAlbRPieUti_To, AV62TFAlbRPieDis, AV63TFAlbRPieDis_To, AV65TFAlbRUni_Sels, AV66TFAlbRUniEnt, AV67TFAlbRUniEnt_To, AV68TFAlbRUniUti, AV69TFAlbRUniUti_To, AV70TFAlbRUniDis, AV71TFAlbRUniDis_To, AV91Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40GridCurrentPage, AV72TotAlbRPieEnt, AV74TotAlbRPieUti, AV76TotAlbRPieDis, AV78TotAlbRUniEnt, AV80TotAlbRUniUti, AV82TotAlbRUniDis, AV87Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88LoadGridData, AV30TFCliNom, AV31TFCliNom_Sel, AV54TFAlbrHor, AV55TFAlbrHor_To, AV34TFAlbRef, AV35TFAlbRef_Sel, AV36TFAlbRefDsc, AV37TFAlbRefDsc_Sel, AV58TFAlbRPieEnt, AV59TFAlbRPieEnt_To, AV60TFAlbRPieUti, AV61TFAlbRPieUti_To, AV62TFAlbRPieDis, AV63TFAlbRPieDis_To, AV65TFAlbRUni_Sels, AV66TFAlbRUniEnt, AV67TFAlbRUniEnt_To, AV68TFAlbRUniUti, AV69TFAlbRUniUti_To, AV70TFAlbRUniDis, AV71TFAlbRUniDis_To, AV91Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40GridCurrentPage, AV72TotAlbRPieEnt, AV74TotAlbRPieUti, AV76TotAlbRPieDis, AV78TotAlbRUniEnt, AV80TotAlbRUniUti, AV82TotAlbRUniDis, AV87Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88LoadGridData, AV30TFCliNom, AV31TFCliNom_Sel, AV54TFAlbrHor, AV55TFAlbrHor_To, AV34TFAlbRef, AV35TFAlbRef_Sel, AV36TFAlbRefDsc, AV37TFAlbRefDsc_Sel, AV58TFAlbRPieEnt, AV59TFAlbRPieEnt_To, AV60TFAlbRPieUti, AV61TFAlbRPieUti_To, AV62TFAlbRPieDis, AV63TFAlbRPieDis_To, AV65TFAlbRUni_Sels, AV66TFAlbRUniEnt, AV67TFAlbRUniEnt_To, AV68TFAlbRUniUti, AV69TFAlbRUniUti_To, AV70TFAlbRUniDis, AV71TFAlbRUniDis_To, AV91Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40GridCurrentPage, AV72TotAlbRPieEnt, AV74TotAlbRPieUti, AV76TotAlbRPieDis, AV78TotAlbRUniEnt, AV80TotAlbRUniUti, AV82TotAlbRUniDis, AV87Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88LoadGridData, AV30TFCliNom, AV31TFCliNom_Sel, AV54TFAlbrHor, AV55TFAlbrHor_To, AV34TFAlbRef, AV35TFAlbRef_Sel, AV36TFAlbRefDsc, AV37TFAlbRefDsc_Sel, AV58TFAlbRPieEnt, AV59TFAlbRPieEnt_To, AV60TFAlbRPieUti, AV61TFAlbRPieUti_To, AV62TFAlbRPieDis, AV63TFAlbRPieDis_To, AV65TFAlbRUni_Sels, AV66TFAlbRUniEnt, AV67TFAlbRUniEnt_To, AV68TFAlbRUniUti, AV69TFAlbRUniUti_To, AV70TFAlbRUniDis, AV71TFAlbRUniDis_To, AV91Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40GridCurrentPage, AV72TotAlbRPieEnt, AV74TotAlbRPieUti, AV76TotAlbRPieDis, AV78TotAlbRUniEnt, AV80TotAlbRUniUti, AV82TotAlbRUniDis, AV87Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV88LoadGridData, AV30TFCliNom, AV31TFCliNom_Sel, AV54TFAlbrHor, AV55TFAlbrHor_To, AV34TFAlbRef, AV35TFAlbRef_Sel, AV36TFAlbRefDsc, AV37TFAlbRefDsc_Sel, AV58TFAlbRPieEnt, AV59TFAlbRPieEnt_To, AV60TFAlbRPieUti, AV61TFAlbRPieUti_To, AV62TFAlbRPieDis, AV63TFAlbRPieDis_To, AV65TFAlbRUni_Sels, AV66TFAlbRUniEnt, AV67TFAlbRUniEnt_To, AV68TFAlbRUniUti, AV69TFAlbRUniUti_To, AV70TFAlbRUniDis, AV71TFAlbRUniDis_To, AV91Pgmname, AV12OrderedBy, AV13OrderedDsc, AV40GridCurrentPage, AV72TotAlbRPieEnt, AV74TotAlbRPieUti, AV76TotAlbRPieDis, AV78TotAlbRUniEnt, AV80TotAlbRUniUti, AV82TotAlbRUniDis, AV87Moda21, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV91Pgmname = "TTrn22WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91Pgmname", AV91Pgmname);
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

   public void strup2DE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e222DE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_51 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_51"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV41GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
            AV49AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbRecCod), 8, 0));
         }
         else
         {
            AV49AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbRecCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
         }
         else
         {
            AV50CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfenfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFENFROM");
            GX_FocusControl = edtavAlbrfenfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV52AlbRFenfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52AlbRFenfrom", localUtil.format(AV52AlbRFenfrom, "99/99/99"));
         }
         else
         {
            AV52AlbRFenfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbrfenfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52AlbRFenfrom", localUtil.format(AV52AlbRFenfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbrfento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBRFENTO");
            GX_FocusControl = edtavAlbrfento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53AlbRFento = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53AlbRFento", localUtil.format(AV53AlbRFento, "99/99/99"));
         }
         else
         {
            AV53AlbRFento = localUtil.ctod( httpContext.cgiGet( edtavAlbrfento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53AlbRFento", localUtil.format(AV53AlbRFento, "99/99/99"));
         }
         cmbavVaralbrest.setName( cmbavVaralbrest.getInternalname() );
         cmbavVaralbrest.setValue( httpContext.cgiGet( cmbavVaralbrest.getInternalname()) );
         AV43VarAlbrEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavVaralbrest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
         AV73TotValueAlbRPieEnt = httpContext.cgiGet( edtavTotvaluealbrpieent_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73TotValueAlbRPieEnt", AV73TotValueAlbRPieEnt);
         AV75TotValueAlbRPieUti = httpContext.cgiGet( edtavTotvaluealbrpieuti_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75TotValueAlbRPieUti", AV75TotValueAlbRPieUti);
         AV77TotValueAlbRPieDis = httpContext.cgiGet( edtavTotvaluealbrpiedis_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77TotValueAlbRPieDis", AV77TotValueAlbRPieDis);
         AV79TotValueAlbRUniEnt = httpContext.cgiGet( edtavTotvaluealbrunient_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79TotValueAlbRUniEnt", AV79TotValueAlbRUniEnt);
         AV81TotValueAlbRUniUti = httpContext.cgiGet( edtavTotvaluealbruniuti_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81TotValueAlbRUniUti", AV81TotValueAlbRUniUti);
         AV83TotValueAlbRUniDis = httpContext.cgiGet( edtavTotvaluealbrunidis_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83TotValueAlbRUniDis", AV83TotValueAlbRUniDis);
         AV91Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91Pgmname", AV91Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrhorauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRHORAUXDATE");
            GX_FocusControl = edtavDdo_albrhorauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV56DDO_AlbrHorAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56DDO_AlbrHorAuxDate", localUtil.format(AV56DDO_AlbrHorAuxDate, "99/99/99"));
         }
         else
         {
            AV56DDO_AlbrHorAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrhorauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56DDO_AlbrHorAuxDate", localUtil.format(AV56DDO_AlbrHorAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albrhorauxdateto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBRHORAUXDATETO");
            GX_FocusControl = edtavDdo_albrhorauxdateto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57DDO_AlbrHorAuxDateTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DDO_AlbrHorAuxDateTo", localUtil.format(AV57DDO_AlbrHorAuxDateTo, "99/99/99"));
         }
         else
         {
            AV57DDO_AlbrHorAuxDateTo = localUtil.ctod( httpContext.cgiGet( edtavDdo_albrhorauxdateto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DDO_AlbrHorAuxDateTo", localUtil.format(AV57DDO_AlbrHorAuxDateTo, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TTrn22WW");
         AV91Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV91Pgmname", AV91Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV91Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ttrn22ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e222DE2 ();
      if (returnInSub) return;
   }

   public void e222DE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV43VarAlbrEst = (byte)(9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (0==AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrest()) )
      {
         AV43VarAlbrEst = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfenfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfento())) )
      {
         AV52AlbRFenfrom = AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfenfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52AlbRFenfrom", localUtil.format(AV52AlbRFenfrom, "99/99/99"));
         AV53AlbRFento = AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfento() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53AlbRFento", localUtil.format(AV53AlbRFento, "99/99/99"));
      }
      else
      {
         if ( (0==AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albreccod()) )
         {
            AV52AlbRFenfrom = GXutil.dadd(Gx_date,-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52AlbRFenfrom", localUtil.format(AV52AlbRFenfrom, "99/99/99"));
            AV53AlbRFento = Gx_date ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53AlbRFento", localUtil.format(AV53AlbRFento, "99/99/99"));
         }
      }
      GXt_char1 = AV45Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrn22ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV45Station = GXt_char1 ;
      GXv_char2[0] = AV46EmprCod ;
      GXv_char3[0] = AV47EmprNom ;
      GXv_char4[0] = AV48UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn22ww_impl.this.AV46EmprCod = GXv_char2[0] ;
      ttrn22ww_impl.this.AV47EmprNom = GXv_char3[0] ;
      ttrn22ww_impl.this.AV48UsurCod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Entrada Tejido Crudo Almacen", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV38DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV38DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV87Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV46EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      ttrn22ww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV87Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87Moda21), "ZZZ9")));
   }

   public void e232DE2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      if ( 1 == 0 )
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
         AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
         AV41GridPageCount = subgrid_fnc_pagecount( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
         /* Execute user subroutine: 'CALCULATETOTALIZERS' */
         S172 ();
         if (returnInSub) return;
         cmbAlbREst.setColumnHeaderClass( "WWColumn" );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Columnheaderclass", cmbAlbREst.getColumnHeaderClass(), !bGXsfl_51_Refreshing);
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
      Gridpaginationbar_Emptygridcaption = (AV88LoadGridData ? httpContext.getMessage( "WWP_PagingEmptyGridCaption", "") : httpContext.getMessage( "WWP_PressSearchToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      AV41GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      if ( AV88LoadGridData )
      {
         /* Execute user subroutine: 'CALCULATETOTALIZERS' */
         S172 ();
         if (returnInSub) return;
      }
      cmbAlbREst.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Columnheaderclass", cmbAlbREst.getColumnHeaderClass(), !bGXsfl_51_Refreshing);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "GridLayoutClean", "", new Object[] {});
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
      /*  Sending Event outputs  */
   }

   public void e112DE2( )
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
         AV39PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV39PageToGo) ;
      }
   }

   public void e122DE2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132DE2( )
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
            AV30TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliNom", AV30TFCliNom);
            AV31TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbrHor") == 0 )
         {
            AV54TFAlbrHor = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbrHor", localUtil.ttoc( AV54TFAlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV55TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtextto_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbrHor_To", localUtil.ttoc( AV55TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            if ( ! GXutil.dateCompare(GXutil.nullDate(), AV55TFAlbrHor_To) )
            {
               AV55TFAlbrHor_To = GXutil.resetDate(localUtil.ymdhmsToT( (short)(GXutil.year( AV55TFAlbrHor_To)), (byte)(GXutil.month( AV55TFAlbrHor_To)), (byte)(GXutil.day( AV55TFAlbrHor_To)), (byte)(23), (byte)(59), (byte)(59))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbrHor_To", localUtil.ttoc( AV55TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV34TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbRef", AV34TFAlbRef);
            AV35TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbRef_Sel", AV35TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRefDsc") == 0 )
         {
            AV36TFAlbRefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbRefDsc", AV36TFAlbRefDsc);
            AV37TFAlbRefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbRefDsc_Sel", AV37TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieEnt") == 0 )
         {
            AV58TFAlbRPieEnt = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieEnt), 6, 0));
            AV59TFAlbRPieEnt_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieUti") == 0 )
         {
            AV60TFAlbRPieUti = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbRPieUti), 6, 0));
            AV61TFAlbRPieUti_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRPieDis") == 0 )
         {
            AV62TFAlbRPieDis = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFAlbRPieDis), 6, 0));
            AV63TFAlbRPieDis_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUni") == 0 )
         {
            AV64TFAlbRUni_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbRUni_SelsJson", AV64TFAlbRUni_SelsJson);
            AV65TFAlbRUni_Sels.fromJSonString(AV64TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniEnt") == 0 )
         {
            AV66TFAlbRUniEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbRUniEnt", GXutil.ltrimstr( AV66TFAlbRUniEnt, 9, 2));
            AV67TFAlbRUniEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFAlbRUniEnt_To", GXutil.ltrimstr( AV67TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniUti") == 0 )
         {
            AV68TFAlbRUniUti = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbRUniUti", GXutil.ltrimstr( AV68TFAlbRUniUti, 9, 2));
            AV69TFAlbRUniUti_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbRUniUti_To", GXutil.ltrimstr( AV69TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRUniDis") == 0 )
         {
            AV70TFAlbRUniDis = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFAlbRUniDis", GXutil.ltrimstr( AV70TFAlbRUniDis, 9, 2));
            AV71TFAlbRUniDis_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbRUniDis_To", GXutil.ltrimstr( AV71TFAlbRUniDis_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFAlbRUni_Sels", AV65TFAlbRUni_Sels);
   }

   private void e242DE2( )
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
         wbStart = (short)(51) ;
      }
      sendrow_512( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_51_Refreshing )
      {
         httpContext.doAjaxLoad(51, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
   }

   public void e252DE2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV42GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 3 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S212 ();
         if (returnInSub) return;
      }
      AV42GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142DE2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn22", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.ltrimstr(0,9,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void e152DE2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.ttrn22wwexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      ttrn22ww_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      ttrn22ww_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFAlbRUni_Sels", AV65TFAlbRUni_Sels);
   }

   public void e162DE2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.ttrn22wwexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV65TFAlbRUni_Sels", AV65TFAlbRUni_Sels);
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
      callWebObject(formatLink("app.ttrn22", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S192( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn22", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S202( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.ttrn22", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0))}, new String[] {"Mode","EmprCod","AlbRecCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      if ( AV87Moda21 == 1 )
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
      if ( GXutil.strcmp(AV22Session.getValue(AV91Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV91Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV91Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV30TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliNom", AV30TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV31TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliNom_Sel", AV31TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRHOR") == 0 )
         {
            AV54TFAlbrHor = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbrHor", localUtil.ttoc( AV54TFAlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV55TFAlbrHor_To = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFAlbrHor_To", localUtil.ttoc( AV55TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV56DDO_AlbrHorAuxDate = GXutil.resetTime(AV54TFAlbrHor) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56DDO_AlbrHorAuxDate", localUtil.format(AV56DDO_AlbrHorAuxDate, "99/99/99"));
            AV57DDO_AlbrHorAuxDateTo = GXutil.resetTime(AV55TFAlbrHor_To) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57DDO_AlbrHorAuxDateTo", localUtil.format(AV57DDO_AlbrHorAuxDateTo, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV34TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbRef", AV34TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV35TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbRef_Sel", AV35TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV36TFAlbRefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbRefDsc", AV36TFAlbRefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV37TFAlbRefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbRefDsc_Sel", AV37TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEENT") == 0 )
         {
            AV58TFAlbRPieEnt = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbRPieEnt), 6, 0));
            AV59TFAlbRPieEnt_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFAlbRPieEnt_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59TFAlbRPieEnt_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEUTI") == 0 )
         {
            AV60TFAlbRPieUti = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60TFAlbRPieUti), 6, 0));
            AV61TFAlbRPieUti_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbRPieUti_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TFAlbRPieUti_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRPIEDIS") == 0 )
         {
            AV62TFAlbRPieDis = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV62TFAlbRPieDis), 6, 0));
            AV63TFAlbRPieDis_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFAlbRPieDis_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFAlbRPieDis_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNI_SEL") == 0 )
         {
            AV64TFAlbRUni_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFAlbRUni_SelsJson", AV64TFAlbRUni_SelsJson);
            AV65TFAlbRUni_Sels.fromJSonString(AV64TFAlbRUni_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIENT") == 0 )
         {
            AV66TFAlbRUniEnt = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbRUniEnt", GXutil.ltrimstr( AV66TFAlbRUniEnt, 9, 2));
            AV67TFAlbRUniEnt_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67TFAlbRUniEnt_To", GXutil.ltrimstr( AV67TFAlbRUniEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIUTI") == 0 )
         {
            AV68TFAlbRUniUti = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68TFAlbRUniUti", GXutil.ltrimstr( AV68TFAlbRUniUti, 9, 2));
            AV69TFAlbRUniUti_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69TFAlbRUniUti_To", GXutil.ltrimstr( AV69TFAlbRUniUti_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRUNIDIS") == 0 )
         {
            AV70TFAlbRUniDis = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70TFAlbRUniDis", GXutil.ltrimstr( AV70TFAlbRUniDis, 9, 2));
            AV71TFAlbRUniDis_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TFAlbRUniDis_To", GXutil.ltrimstr( AV71TFAlbRUniDis_To, 9, 2));
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFCliNom_Sel)==0), AV31TFCliNom_Sel, GXv_char4) ;
      ttrn22ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFAlbRef_Sel)==0), AV35TFAlbRef_Sel, GXv_char3) ;
      ttrn22ww_impl.this.GXt_char10 = GXv_char3[0] ;
      GXt_char11 = "" ;
      GXv_char2[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFAlbRefDsc_Sel)==0), AV37TFAlbRefDsc_Sel, GXv_char2) ;
      ttrn22ww_impl.this.GXt_char11 = GXv_char2[0] ;
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV65TFAlbRUni_Sels.size()==0), AV64TFAlbRUni_SelsJson, GXv_char13) ;
      ttrn22ww_impl.this.GXt_char12 = GXv_char13[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|||"+GXt_char10+"|"+GXt_char11+"||||"+GXt_char12+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char13[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFCliNom)==0), AV30TFCliNom, GXv_char13) ;
      ttrn22ww_impl.this.GXt_char12 = GXv_char13[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFAlbRef)==0), AV34TFAlbRef, GXv_char4) ;
      ttrn22ww_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char10 = "" ;
      GXv_char3[0] = GXt_char10 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFAlbRefDsc)==0), AV36TFAlbRefDsc, GXv_char3) ;
      ttrn22ww_impl.this.GXt_char10 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = "||"+GXt_char12+"||"+(GXutil.dateCompare(GXutil.nullDate(), AV54TFAlbrHor) ? "" : localUtil.dtoc( AV56DDO_AlbrHorAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char11+"|"+GXt_char10+"|"+((0==AV58TFAlbRPieEnt) ? "" : GXutil.str( AV58TFAlbRPieEnt, 6, 0))+"|"+((0==AV60TFAlbRPieUti) ? "" : GXutil.str( AV60TFAlbRPieUti, 6, 0))+"|"+((0==AV62TFAlbRPieDis) ? "" : GXutil.str( AV62TFAlbRPieDis, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniEnt)==0) ? "" : GXutil.str( AV66TFAlbRUniEnt, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFAlbRUniUti)==0) ? "" : GXutil.str( AV68TFAlbRUniUti, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFAlbRUniDis)==0) ? "" : GXutil.str( AV70TFAlbRUniDis, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||||"+(GXutil.dateCompare(GXutil.nullDate(), AV55TFAlbrHor_To) ? "" : localUtil.dtoc( AV57DDO_AlbrHorAuxDateTo, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|||"+((0==AV59TFAlbRPieEnt_To) ? "" : GXutil.str( AV59TFAlbRPieEnt_To, 6, 0))+"|"+((0==AV61TFAlbRPieUti_To) ? "" : GXutil.str( AV61TFAlbRPieUti_To, 6, 0))+"|"+((0==AV63TFAlbRPieDis_To) ? "" : GXutil.str( AV63TFAlbRPieDis_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFAlbRUniEnt_To)==0) ? "" : GXutil.str( AV67TFAlbRUniEnt_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFAlbRUniUti_To)==0) ? "" : GXutil.str( AV69TFAlbRUniUti_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFAlbRUniDis_To)==0) ? "" : GXutil.str( AV71TFAlbRUniDis_To, 9, 2))+"|" ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV91Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFCLINOM", "", !(GXutil.strcmp("", AV30TFCliNom)==0), (short)(0), AV30TFCliNom, "", !(GXutil.strcmp("", AV31TFCliNom_Sel)==0), AV31TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRHOR", "", !(GXutil.dateCompare(GXutil.nullDate(), AV54TFAlbrHor)&&GXutil.dateCompare(GXutil.nullDate(), AV55TFAlbrHor_To)), (short)(0), GXutil.trim( localUtil.ttoc( AV54TFAlbrHor, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), GXutil.trim( localUtil.ttoc( AV55TFAlbrHor_To, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBREF", "", !(GXutil.strcmp("", AV34TFAlbRef)==0), (short)(0), AV34TFAlbRef, "", !(GXutil.strcmp("", AV35TFAlbRef_Sel)==0), AV35TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBREFDSC", "", !(GXutil.strcmp("", AV36TFAlbRefDsc)==0), (short)(0), AV36TFAlbRefDsc, "", !(GXutil.strcmp("", AV37TFAlbRefDsc_Sel)==0), AV37TFAlbRefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRPIEENT", "", !((0==AV58TFAlbRPieEnt)&&(0==AV59TFAlbRPieEnt_To)), (short)(0), GXutil.trim( GXutil.str( AV58TFAlbRPieEnt, 6, 0)), GXutil.trim( GXutil.str( AV59TFAlbRPieEnt_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRPIEUTI", "", !((0==AV60TFAlbRPieUti)&&(0==AV61TFAlbRPieUti_To)), (short)(0), GXutil.trim( GXutil.str( AV60TFAlbRPieUti, 6, 0)), GXutil.trim( GXutil.str( AV61TFAlbRPieUti_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRPIEDIS", "", !((0==AV62TFAlbRPieDis)&&(0==AV63TFAlbRPieDis_To)), (short)(0), GXutil.trim( GXutil.str( AV62TFAlbRPieDis, 6, 0)), GXutil.trim( GXutil.str( AV63TFAlbRPieDis_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNI_SEL", "", !(AV65TFAlbRUni_Sels.size()==0), (short)(0), AV65TFAlbRUni_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNIENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbRUniEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFAlbRUniEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFAlbRUniEnt, 9, 2)), GXutil.trim( GXutil.str( AV67TFAlbRUniEnt_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNIUTI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV68TFAlbRUniUti)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFAlbRUniUti_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV68TFAlbRUniUti, 9, 2)), GXutil.trim( GXutil.str( AV69TFAlbRUniUti_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRUNIDIS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFAlbRUniDis)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV71TFAlbRUniDis_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV70TFAlbRUniDis, 9, 2)), GXutil.trim( GXutil.str( AV71TFAlbRUniDis_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV91Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV91Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TTrn22" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV72TotAlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TotAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), "ZZZZZ9")));
      AV74TotAlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74TotAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), "ZZZZZ9")));
      AV76TotAlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76TotAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), "ZZZZZ9")));
      AV78TotAlbRUniEnt = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78TotAlbRUniEnt", GXutil.ltrimstr( AV78TotAlbRUniEnt, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV78TotAlbRUniEnt, "ZZZZZ9.99")));
      AV80TotAlbRUniUti = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80TotAlbRUniUti", GXutil.ltrimstr( AV80TotAlbRUniUti, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV80TotAlbRUniUti, "ZZZZZ9.99")));
      AV82TotAlbRUniDis = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82TotAlbRUniDis", GXutil.ltrimstr( AV82TotAlbRUniDis, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniDis, "ZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV84L = (short)(subGrid_Rows) ;
      AV85Offset = (short)((AV40GridCurrentPage-1)*AV84L) ;
      AV86Totalset = DecimalUtil.doubleToDec(AV84L) ;
      AV93Ttrn22wwds_1_tfclinom = AV30TFCliNom ;
      AV94Ttrn22wwds_2_tfclinom_sel = AV31TFCliNom_Sel ;
      AV95Ttrn22wwds_3_tfalbrhor = AV54TFAlbrHor ;
      AV96Ttrn22wwds_4_tfalbrhor_to = AV55TFAlbrHor_To ;
      AV97Ttrn22wwds_5_tfalbref = AV34TFAlbRef ;
      AV98Ttrn22wwds_6_tfalbref_sel = AV35TFAlbRef_Sel ;
      AV99Ttrn22wwds_7_tfalbrefdsc = AV36TFAlbRefDsc ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = AV37TFAlbRefDsc_Sel ;
      AV101Ttrn22wwds_9_tfalbrpieent = AV58TFAlbRPieEnt ;
      AV102Ttrn22wwds_10_tfalbrpieent_to = AV59TFAlbRPieEnt_To ;
      AV103Ttrn22wwds_11_tfalbrpieuti = AV60TFAlbRPieUti ;
      AV104Ttrn22wwds_12_tfalbrpieuti_to = AV61TFAlbRPieUti_To ;
      AV105Ttrn22wwds_13_tfalbrpiedis = AV62TFAlbRPieDis ;
      AV106Ttrn22wwds_14_tfalbrpiedis_to = AV63TFAlbRPieDis_To ;
      AV107Ttrn22wwds_15_tfalbruni_sels = AV65TFAlbRUni_Sels ;
      AV108Ttrn22wwds_16_tfalbrunient = AV66TFAlbRUniEnt ;
      AV109Ttrn22wwds_17_tfalbrunient_to = AV67TFAlbRUniEnt_To ;
      AV110Ttrn22wwds_18_tfalbruniuti = AV68TFAlbRUniUti ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = AV69TFAlbRUniUti_To ;
      AV112Ttrn22wwds_20_tfalbrunidis = AV70TFAlbRUniDis ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = AV71TFAlbRUniDis_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A56AlbRUni ,
                                           AV107Ttrn22wwds_15_tfalbruni_sels ,
                                           AV94Ttrn22wwds_2_tfclinom_sel ,
                                           AV93Ttrn22wwds_1_tfclinom ,
                                           AV95Ttrn22wwds_3_tfalbrhor ,
                                           AV96Ttrn22wwds_4_tfalbrhor_to ,
                                           AV98Ttrn22wwds_6_tfalbref_sel ,
                                           AV97Ttrn22wwds_5_tfalbref ,
                                           AV100Ttrn22wwds_8_tfalbrefdsc_sel ,
                                           AV99Ttrn22wwds_7_tfalbrefdsc ,
                                           Integer.valueOf(AV101Ttrn22wwds_9_tfalbrpieent) ,
                                           Integer.valueOf(AV102Ttrn22wwds_10_tfalbrpieent_to) ,
                                           Integer.valueOf(AV103Ttrn22wwds_11_tfalbrpieuti) ,
                                           Integer.valueOf(AV104Ttrn22wwds_12_tfalbrpieuti_to) ,
                                           Integer.valueOf(AV105Ttrn22wwds_13_tfalbrpiedis) ,
                                           Integer.valueOf(AV106Ttrn22wwds_14_tfalbrpiedis_to) ,
                                           Integer.valueOf(AV107Ttrn22wwds_15_tfalbruni_sels.size()) ,
                                           AV108Ttrn22wwds_16_tfalbrunient ,
                                           AV109Ttrn22wwds_17_tfalbrunient_to ,
                                           AV110Ttrn22wwds_18_tfalbruniuti ,
                                           AV111Ttrn22wwds_19_tfalbruniuti_to ,
                                           AV112Ttrn22wwds_20_tfalbrunidis ,
                                           AV113Ttrn22wwds_21_tfalbrunidis_to ,
                                           A279CliNom ,
                                           A6179AlbrHor ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A52AlbRPieEnt) ,
                                           Integer.valueOf(A54AlbRPieUti) ,
                                           A58AlbRUniEnt ,
                                           A60AlbRUniUti } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL
                                           }
      });
      lV93Ttrn22wwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV93Ttrn22wwds_1_tfclinom), 30, "%") ;
      lV97Ttrn22wwds_5_tfalbref = GXutil.padr( GXutil.rtrim( AV97Ttrn22wwds_5_tfalbref), 16, "%") ;
      lV99Ttrn22wwds_7_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV99Ttrn22wwds_7_tfalbrefdsc), 26, "%") ;
      /* Using cursor H02DE4 */
      pr_default.execute(2, new Object[] {lV93Ttrn22wwds_1_tfclinom, AV94Ttrn22wwds_2_tfclinom_sel, AV95Ttrn22wwds_3_tfalbrhor, AV96Ttrn22wwds_4_tfalbrhor_to, lV97Ttrn22wwds_5_tfalbref, AV98Ttrn22wwds_6_tfalbref_sel, lV99Ttrn22wwds_7_tfalbrefdsc, AV100Ttrn22wwds_8_tfalbrefdsc_sel, Integer.valueOf(AV101Ttrn22wwds_9_tfalbrpieent), Integer.valueOf(AV102Ttrn22wwds_10_tfalbrpieent_to), Integer.valueOf(AV103Ttrn22wwds_11_tfalbrpieuti), Integer.valueOf(AV104Ttrn22wwds_12_tfalbrpieuti_to), Integer.valueOf(AV105Ttrn22wwds_13_tfalbrpiedis), Integer.valueOf(AV106Ttrn22wwds_14_tfalbrpiedis_to), AV108Ttrn22wwds_16_tfalbrunient, AV109Ttrn22wwds_17_tfalbrunient_to, AV110Ttrn22wwds_18_tfalbruniuti, AV111Ttrn22wwds_19_tfalbruniuti_to, AV112Ttrn22wwds_20_tfalbrunidis, AV113Ttrn22wwds_21_tfalbrunidis_to});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H02DE4_A396EmprCod[0] ;
         A252CliCod = H02DE4_A252CliCod[0] ;
         A56AlbRUni = H02DE4_A56AlbRUni[0] ;
         A3613AlbRefDsc = H02DE4_A3613AlbRefDsc[0] ;
         A45AlbRef = H02DE4_A45AlbRef[0] ;
         A6179AlbrHor = H02DE4_A6179AlbrHor[0] ;
         A279CliNom = H02DE4_A279CliNom[0] ;
         A54AlbRPieUti = H02DE4_A54AlbRPieUti[0] ;
         A52AlbRPieEnt = H02DE4_A52AlbRPieEnt[0] ;
         A60AlbRUniUti = H02DE4_A60AlbRUniUti[0] ;
         A58AlbRUniEnt = H02DE4_A58AlbRUniEnt[0] ;
         A279CliNom = H02DE4_A279CliNom[0] ;
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
         AV72TotAlbRPieEnt = (long)(A52AlbRPieEnt+AV72TotAlbRPieEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72TotAlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEENT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), "ZZZZZ9")));
         AV74TotAlbRPieUti = (long)(A54AlbRPieUti+AV74TotAlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74TotAlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEUTI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), "ZZZZZ9")));
         AV76TotAlbRPieDis = (long)(A51AlbRPieDis+AV76TotAlbRPieDis) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76TotAlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRPIEDIS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), "ZZZZZ9")));
         AV78TotAlbRUniEnt = A58AlbRUniEnt.add(AV78TotAlbRUniEnt) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78TotAlbRUniEnt", GXutil.ltrimstr( AV78TotAlbRUniEnt, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIENT", getSecureSignedToken( "", localUtil.format( AV78TotAlbRUniEnt, "ZZZZZ9.99")));
         AV80TotAlbRUniUti = A60AlbRUniUti.add(AV80TotAlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80TotAlbRUniUti", GXutil.ltrimstr( AV80TotAlbRUniUti, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIUTI", getSecureSignedToken( "", localUtil.format( AV80TotAlbRUniUti, "ZZZZZ9.99")));
         AV82TotAlbRUniDis = A57AlbRUniDis.add(AV82TotAlbRUniDis) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82TotAlbRUniDis", GXutil.ltrimstr( AV82TotAlbRUniDis, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTALBRUNIDIS", getSecureSignedToken( "", localUtil.format( AV82TotAlbRUniDis, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV73TotValueAlbRPieEnt = localUtil.format( DecimalUtil.doubleToDec(AV72TotAlbRPieEnt), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TotValueAlbRPieEnt", AV73TotValueAlbRPieEnt);
      AV75TotValueAlbRPieUti = localUtil.format( DecimalUtil.doubleToDec(AV74TotAlbRPieUti), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75TotValueAlbRPieUti", AV75TotValueAlbRPieUti);
      AV77TotValueAlbRPieDis = localUtil.format( DecimalUtil.doubleToDec(AV76TotAlbRPieDis), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77TotValueAlbRPieDis", AV77TotValueAlbRPieDis);
      AV79TotValueAlbRUniEnt = localUtil.format( AV78TotAlbRUniEnt, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79TotValueAlbRUniEnt", AV79TotValueAlbRUniEnt);
      AV81TotValueAlbRUniUti = localUtil.format( AV80TotAlbRUniUti, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81TotValueAlbRUniUti", AV81TotValueAlbRUniUti);
      AV83TotValueAlbRUniDis = localUtil.format( AV82TotAlbRUniDis, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83TotValueAlbRUniDis", AV83TotValueAlbRUniDis);
   }

   public void e172DE2( )
   {
      /* Varalbrest_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44FilterAlmacenTejido", AV44FilterAlmacenTejido);
   }

   public void e182DE2( )
   {
      /* Albreccod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV49AlbRecCod) )
      {
         AV52AlbRFenfrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52AlbRFenfrom", localUtil.format(AV52AlbRFenfrom, "99/99/99"));
         AV53AlbRFento = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53AlbRFento", localUtil.format(AV53AlbRFento, "99/99/99"));
         AV50CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
         AV43VarAlbrEst = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
      }
      else
      {
         AV52AlbRFenfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52AlbRFenfrom", localUtil.format(AV52AlbRFenfrom, "99/99/99"));
         AV53AlbRFento = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53AlbRFento", localUtil.format(AV53AlbRFento, "99/99/99"));
         AV50CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
         AV43VarAlbrEst = (byte)(9) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavVaralbrest.setValue( GXutil.trim( GXutil.str( AV43VarAlbrEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavVaralbrest.getInternalname(), "Values", cmbavVaralbrest.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44FilterAlmacenTejido", AV44FilterAlmacenTejido);
   }

   public void e192DE2( )
   {
      /* Clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44FilterAlmacenTejido", AV44FilterAlmacenTejido);
   }

   public void e202DE2( )
   {
      /* Albrfenfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44FilterAlmacenTejido", AV44FilterAlmacenTejido);
   }

   public void e212DE2( )
   {
      /* Albrfento_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S222 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV44FilterAlmacenTejido", AV44FilterAlmacenTejido);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV44FilterAlmacenTejido.fromJSonString(AV51WebSession.getValue(httpContext.getMessage( "&FilterAlmacenTejido", "")), null);
      AV49AlbRecCod = AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albreccod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49AlbRecCod), 8, 0));
      AV50CliCod = AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
      AV52AlbRFenfrom = AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfenfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52AlbRFenfrom", localUtil.format(AV52AlbRFenfrom, "99/99/99"));
      AV53AlbRFento = AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrfento() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53AlbRFento", localUtil.format(AV53AlbRFento, "99/99/99"));
      AV43VarAlbrEst = AV44FilterAlmacenTejido.getgxTv_SdtFilterAlmacenTejido_Albrest() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
   }

   public void S222( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV44FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albreccod( AV49AlbRecCod );
      AV44FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Clicod( AV50CliCod );
      AV44FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albrfenfrom( AV52AlbRFenfrom );
      AV44FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albrfento( AV53AlbRFento );
      AV44FilterAlmacenTejido.setgxTv_SdtFilterAlmacenTejido_Albrest( AV43VarAlbrEst );
      AV51WebSession.setValue(httpContext.getMessage( "&FilterAlmacenTejido", ""), AV44FilterAlmacenTejido.toJSonString(false, true));
   }

   public void wb_table1_71_2DE2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrpieent_Internalname, AV73TotValueAlbRPieEnt, GXutil.rtrim( localUtil.format( AV73TotValueAlbRPieEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrpieent_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrpieent_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrpieuti_Internalname, httpContext.getMessage( "Tot Value Alb RPie Uti", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrpieuti_Internalname, AV75TotValueAlbRPieUti, GXutil.rtrim( localUtil.format( AV75TotValueAlbRPieUti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrpieuti_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrpieuti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrpiedis_Internalname, httpContext.getMessage( "Tot Value Alb RPie Dis", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrpiedis_Internalname, AV77TotValueAlbRPieDis, GXutil.rtrim( localUtil.format( AV77TotValueAlbRPieDis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrpiedis_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrpiedis_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn22WW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrunient_Internalname, AV79TotValueAlbRUniEnt, GXutil.rtrim( localUtil.format( AV79TotValueAlbRUniEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrunient_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrunient_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbruniuti_Internalname, httpContext.getMessage( "Tot Value Alb RUni Uti", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbruniuti_Internalname, AV81TotValueAlbRUniUti, GXutil.rtrim( localUtil.format( AV81TotValueAlbRUniUti, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbruniuti_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbruniuti_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbrunidis_Internalname, httpContext.getMessage( "Tot Value Alb RUni Dis", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_51_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbrunidis_Internalname, AV83TotValueAlbRUniDis, GXutil.rtrim( localUtil.format( AV83TotValueAlbRUniDis, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbrunidis_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbrunidis_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn22WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_71_2DE2e( true) ;
      }
      else
      {
         wb_table1_71_2DE2e( false) ;
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
      pa2DE2( ) ;
      ws2DE2( ) ;
      we2DE2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116154577", true, true);
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
      httpContext.AddJavascriptSource("ttrn22ww.js", "?202682116154578", false, true);
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

   public void subsflControlProps_512( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_51_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_51_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_51_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_51_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_51_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_51_idx ;
      edtAlbrHor_Internalname = "ALBRHOR_"+sGXsfl_51_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_51_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_51_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_51_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_51_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_51_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_51_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_51_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_51_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_51_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_51_idx );
   }

   public void subsflControlProps_fel_512( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_51_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_51_fel_idx ;
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_51_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_51_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_51_fel_idx ;
      edtAlbRFen_Internalname = "ALBRFEN_"+sGXsfl_51_fel_idx ;
      edtAlbrHor_Internalname = "ALBRHOR_"+sGXsfl_51_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_51_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_51_fel_idx ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT_"+sGXsfl_51_fel_idx ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI_"+sGXsfl_51_fel_idx ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS_"+sGXsfl_51_fel_idx ;
      cmbAlbRUni.setInternalname( "ALBRUNI_"+sGXsfl_51_fel_idx );
      edtAlbRUniEnt_Internalname = "ALBRUNIENT_"+sGXsfl_51_fel_idx ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI_"+sGXsfl_51_fel_idx ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS_"+sGXsfl_51_fel_idx ;
      cmbAlbREst.setInternalname( "ALBREST_"+sGXsfl_51_fel_idx );
   }

   public void sendrow_512( )
   {
      subsflControlProps_512( ) ;
      wb2DE0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_51_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_51_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_51_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_51_idx+"',51)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_51_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV42GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_51_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_51_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRFen_Internalname,localUtil.format(A49AlbRFen, "99/99/99"),localUtil.format( A49AlbRFen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRFen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbrHor_Internalname,localUtil.ttoc( A6179AlbrHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A6179AlbrHor, "99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbrHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieUti_Internalname,GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRPieDis_Internalname,GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRPieDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbRUni.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBRUNI_" + sGXsfl_51_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), !bGXsfl_51_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniUti_Internalname,GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A60AlbRUniUti, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniUti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRUniDis_Internalname,GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A57AlbRUniDis, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRUniDis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(51),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbREst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBREST_" + sGXsfl_51_idx ;
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
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), !bGXsfl_51_Refreshing);
         send_integrity_lvl_hashes2DE2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_51_idx = ((subGrid_Islastpage==1)&&(nGXsfl_51_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_51_idx+1) ;
         sGXsfl_51_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_51_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_512( ) ;
      }
      /* End function sendrow_512 */
   }

   public void startgridcontrol51( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"51\">") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42GridActions, (byte)(4), (byte)(0), ".", "")));
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
      Ddo_grid_Datalistproc = "TTrn22WWGetFilterData" ;
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
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Entrada Tejido Crudo Almacen", "") );
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
         AV43VarAlbrEst = (byte)(GXutil.lval( cmbavVaralbrest.getValidValue(GXutil.trim( GXutil.str( AV43VarAlbrEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43VarAlbrEst", GXutil.str( AV43VarAlbrEst, 1, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_51_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
      }
      GXCCtl = "ALBRUNI_" + sGXsfl_51_idx ;
      cmbAlbRUni.setName( GXCCtl );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
      }
      GXCCtl = "ALBREST_" + sGXsfl_51_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbAlbREst'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotValueAlbRPieEnt',fld:'vTOTVALUEALBRPIEENT',pic:''},{av:'AV75TotValueAlbRPieUti',fld:'vTOTVALUEALBRPIEUTI',pic:''},{av:'AV77TotValueAlbRPieDis',fld:'vTOTVALUEALBRPIEDIS',pic:''},{av:'AV79TotValueAlbRUniEnt',fld:'vTOTVALUEALBRUNIENT',pic:''},{av:'AV81TotValueAlbRUniUti',fld:'vTOTVALUEALBRUNIUTI',pic:''},{av:'AV83TotValueAlbRUniDis',fld:'vTOTVALUEALBRUNIDIS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112DE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122DE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132DE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e242DE2',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'cmbAlbREst'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e252DE2',iparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV88LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbAlbREst'},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV73TotValueAlbRPieEnt',fld:'vTOTVALUEALBRPIEENT',pic:''},{av:'AV75TotValueAlbRPieUti',fld:'vTOTVALUEALBRPIEUTI',pic:''},{av:'AV77TotValueAlbRPieDis',fld:'vTOTVALUEALBRPIEDIS',pic:''},{av:'AV79TotValueAlbRUniEnt',fld:'vTOTVALUEALBRUNIENT',pic:''},{av:'AV81TotValueAlbRUniUti',fld:'vTOTVALUEALBRUNIUTI',pic:''},{av:'AV83TotValueAlbRUniDis',fld:'vTOTVALUEALBRUNIDIS',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e142DE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e152DE2',iparms:[{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV64TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV56DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV57DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV56DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV57DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e162DE2',iparms:[{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV64TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV56DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV57DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV70TFAlbRUniDis',fld:'vTFALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV71TFAlbRUniDis_To',fld:'vTFALBRUNIDIS_TO',pic:'ZZZZZ9.99'},{av:'AV68TFAlbRUniUti',fld:'vTFALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV69TFAlbRUniUti_To',fld:'vTFALBRUNIUTI_TO',pic:'ZZZZZ9.99'},{av:'AV66TFAlbRUniEnt',fld:'vTFALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV67TFAlbRUniEnt_To',fld:'vTFALBRUNIENT_TO',pic:'ZZZZZ9.99'},{av:'AV64TFAlbRUni_SelsJson',fld:'vTFALBRUNI_SELSJSON',pic:''},{av:'AV65TFAlbRUni_Sels',fld:'vTFALBRUNI_SELS',pic:''},{av:'AV62TFAlbRPieDis',fld:'vTFALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV63TFAlbRPieDis_To',fld:'vTFALBRPIEDIS_TO',pic:'ZZZZZ9'},{av:'AV60TFAlbRPieUti',fld:'vTFALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV61TFAlbRPieUti_To',fld:'vTFALBRPIEUTI_TO',pic:'ZZZZZ9'},{av:'AV58TFAlbRPieEnt',fld:'vTFALBRPIEENT',pic:'ZZZZZ9'},{av:'AV59TFAlbRPieEnt_To',fld:'vTFALBRPIEENT_TO',pic:'ZZZZZ9'},{av:'AV37TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV36TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV35TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV34TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbrHor',fld:'vTFALBRHOR',pic:'99:99:99'},{av:'AV55TFAlbrHor_To',fld:'vTFALBRHOR_TO',pic:'99:99:99'},{av:'AV56DDO_AlbrHorAuxDate',fld:'vDDO_ALBRHORAUXDATE',pic:''},{av:'AV57DDO_AlbrHorAuxDateTo',fld:'vDDO_ALBRHORAUXDATETO',pic:''},{av:'AV31TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV30TFCliNom',fld:'vTFCLINOM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88LoadGridData',fld:'vLOADGRIDDATA',pic:'',hsh:true},{av:'AV91Pgmname',fld:'vPGMNAME',pic:''},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV72TotAlbRPieEnt',fld:'vTOTALBRPIEENT',pic:'ZZZZZ9',hsh:true},{av:'AV74TotAlbRPieUti',fld:'vTOTALBRPIEUTI',pic:'ZZZZZ9',hsh:true},{av:'AV76TotAlbRPieDis',fld:'vTOTALBRPIEDIS',pic:'ZZZZZ9',hsh:true},{av:'AV78TotAlbRUniEnt',fld:'vTOTALBRUNIENT',pic:'ZZZZZ9.99',hsh:true},{av:'AV80TotAlbRUniUti',fld:'vTOTALBRUNIUTI',pic:'ZZZZZ9.99',hsh:true},{av:'AV82TotAlbRUniDis',fld:'vTOTALBRUNIDIS',pic:'ZZZZZ9.99',hsh:true},{av:'AV87Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("VVARALBREST.CONTROLVALUECHANGED","{handler:'e172DE2',iparms:[{av:'AV49AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV53AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV43VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VVARALBREST.CONTROLVALUECHANGED",",oparms:[{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED","{handler:'e182DE2',iparms:[{av:'AV49AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV53AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV43VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV52AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV53AlbRFento',fld:'vALBRFENTO',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'cmbavVaralbrest'},{av:'AV43VarAlbrEst',fld:'vVARALBREST',pic:'9'},{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED","{handler:'e192DE2',iparms:[{av:'AV49AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV53AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV43VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VALBRFENFROM.CONTROLVALUECHANGED","{handler:'e202DE2',iparms:[{av:'AV49AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV53AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV43VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VALBRFENFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
      setEventMetadata("VALBRFENTO.CONTROLVALUECHANGED","{handler:'e212DE2',iparms:[{av:'AV49AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV52AlbRFenfrom',fld:'vALBRFENFROM',pic:''},{av:'AV53AlbRFento',fld:'vALBRFENTO',pic:''},{av:'cmbavVaralbrest'},{av:'AV43VarAlbrEst',fld:'vVARALBREST',pic:'9'}]");
      setEventMetadata("VALBRFENTO.CONTROLVALUECHANGED",",oparms:[{av:'AV44FilterAlmacenTejido',fld:'vFILTERALMACENTEJIDO',pic:''}]}");
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
      AV30TFCliNom = "" ;
      AV31TFCliNom_Sel = "" ;
      AV54TFAlbrHor = GXutil.resetTime( GXutil.nullDate() );
      AV55TFAlbrHor_To = GXutil.resetTime( GXutil.nullDate() );
      AV34TFAlbRef = "" ;
      AV35TFAlbRef_Sel = "" ;
      AV36TFAlbRefDsc = "" ;
      AV37TFAlbRefDsc_Sel = "" ;
      AV65TFAlbRUni_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV66TFAlbRUniEnt = DecimalUtil.ZERO ;
      AV67TFAlbRUniEnt_To = DecimalUtil.ZERO ;
      AV68TFAlbRUniUti = DecimalUtil.ZERO ;
      AV69TFAlbRUniUti_To = DecimalUtil.ZERO ;
      AV70TFAlbRUniDis = DecimalUtil.ZERO ;
      AV71TFAlbRUniDis_To = DecimalUtil.ZERO ;
      AV91Pgmname = "" ;
      AV78TotAlbRUniEnt = DecimalUtil.ZERO ;
      AV80TotAlbRUniUti = DecimalUtil.ZERO ;
      AV82TotAlbRUniDis = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV64TFAlbRUni_SelsJson = "" ;
      AV44FilterAlmacenTejido = new app.almacensindetalle.SdtFilterAlmacenTejido(remoteHandle, context);
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
      AV52AlbRFenfrom = GXutil.nullDate() ;
      AV53AlbRFento = GXutil.nullDate() ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV56DDO_AlbrHorAuxDate = GXutil.nullDate() ;
      AV57DDO_AlbrHorAuxDateTo = GXutil.nullDate() ;
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
      AV107Ttrn22wwds_15_tfalbruni_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV93Ttrn22wwds_1_tfclinom = "" ;
      lV97Ttrn22wwds_5_tfalbref = "" ;
      lV99Ttrn22wwds_7_tfalbrefdsc = "" ;
      AV94Ttrn22wwds_2_tfclinom_sel = "" ;
      AV93Ttrn22wwds_1_tfclinom = "" ;
      AV95Ttrn22wwds_3_tfalbrhor = GXutil.resetTime( GXutil.nullDate() );
      AV96Ttrn22wwds_4_tfalbrhor_to = GXutil.resetTime( GXutil.nullDate() );
      AV98Ttrn22wwds_6_tfalbref_sel = "" ;
      AV97Ttrn22wwds_5_tfalbref = "" ;
      AV100Ttrn22wwds_8_tfalbrefdsc_sel = "" ;
      AV99Ttrn22wwds_7_tfalbrefdsc = "" ;
      AV108Ttrn22wwds_16_tfalbrunient = DecimalUtil.ZERO ;
      AV109Ttrn22wwds_17_tfalbrunient_to = DecimalUtil.ZERO ;
      AV110Ttrn22wwds_18_tfalbruniuti = DecimalUtil.ZERO ;
      AV111Ttrn22wwds_19_tfalbruniuti_to = DecimalUtil.ZERO ;
      AV112Ttrn22wwds_20_tfalbrunidis = DecimalUtil.ZERO ;
      AV113Ttrn22wwds_21_tfalbrunidis_to = DecimalUtil.ZERO ;
      H02DE2_A47AlbREst = new byte[1] ;
      H02DE2_A56AlbRUni = new String[] {""} ;
      H02DE2_A3613AlbRefDsc = new String[] {""} ;
      H02DE2_A45AlbRef = new String[] {""} ;
      H02DE2_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      H02DE2_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      H02DE2_A279CliNom = new String[] {""} ;
      H02DE2_A252CliCod = new int[1] ;
      H02DE2_A44AlbRecCod = new int[1] ;
      H02DE2_A396EmprCod = new String[] {""} ;
      H02DE2_A54AlbRPieUti = new int[1] ;
      H02DE2_A52AlbRPieEnt = new int[1] ;
      H02DE2_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DE2_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DE3_AGRID_nRecordCount = new long[1] ;
      AV73TotValueAlbRPieEnt = "" ;
      AV75TotValueAlbRPieUti = "" ;
      AV77TotValueAlbRPieDis = "" ;
      AV79TotValueAlbRUniEnt = "" ;
      AV81TotValueAlbRUniUti = "" ;
      AV83TotValueAlbRUniDis = "" ;
      hsh = "" ;
      AV45Station = "" ;
      AV46EmprCod = "" ;
      AV47EmprNom = "" ;
      AV48UsurCod = "" ;
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
      AV86Totalset = DecimalUtil.ZERO ;
      H02DE4_A44AlbRecCod = new int[1] ;
      H02DE4_A396EmprCod = new String[] {""} ;
      H02DE4_A252CliCod = new int[1] ;
      H02DE4_A56AlbRUni = new String[] {""} ;
      H02DE4_A3613AlbRefDsc = new String[] {""} ;
      H02DE4_A45AlbRef = new String[] {""} ;
      H02DE4_A6179AlbrHor = new java.util.Date[] {GXutil.nullDate()} ;
      H02DE4_A279CliNom = new String[] {""} ;
      H02DE4_A54AlbRPieUti = new int[1] ;
      H02DE4_A52AlbRPieEnt = new int[1] ;
      H02DE4_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02DE4_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV51WebSession = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn22ww__default(),
         new Object[] {
             new Object[] {
            H02DE2_A47AlbREst, H02DE2_A56AlbRUni, H02DE2_A3613AlbRefDsc, H02DE2_A45AlbRef, H02DE2_A6179AlbrHor, H02DE2_A49AlbRFen, H02DE2_A279CliNom, H02DE2_A252CliCod, H02DE2_A44AlbRecCod, H02DE2_A396EmprCod,
            H02DE2_A54AlbRPieUti, H02DE2_A52AlbRPieEnt, H02DE2_A60AlbRUniUti, H02DE2_A58AlbRUniEnt
            }
            , new Object[] {
            H02DE3_AGRID_nRecordCount
            }
            , new Object[] {
            H02DE4_A44AlbRecCod, H02DE4_A396EmprCod, H02DE4_A252CliCod, H02DE4_A56AlbRUni, H02DE4_A3613AlbRefDsc, H02DE4_A45AlbRef, H02DE4_A6179AlbrHor, H02DE4_A279CliNom, H02DE4_A54AlbRPieUti, H02DE4_A52AlbRPieEnt,
            H02DE4_A60AlbRUniUti, H02DE4_A58AlbRUniEnt
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV91Pgmname = "TTrn22WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV91Pgmname = "TTrn22WW" ;
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
   private byte gxajaxcallmode ;
   private byte AV43VarAlbrEst ;
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
   private short AV87Moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV84L ;
   private short AV85Offset ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_51 ;
   private int nGXsfl_51_idx=1 ;
   private int AV58TFAlbRPieEnt ;
   private int AV59TFAlbRPieEnt_To ;
   private int AV60TFAlbRPieUti ;
   private int AV61TFAlbRPieUti_To ;
   private int AV62TFAlbRPieDis ;
   private int AV63TFAlbRPieDis_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV49AlbRecCod ;
   private int edtavAlbreccod_Enabled ;
   private int AV50CliCod ;
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
   private int AV107Ttrn22wwds_15_tfalbruni_sels_size ;
   private int AV101Ttrn22wwds_9_tfalbrpieent ;
   private int AV102Ttrn22wwds_10_tfalbrpieent_to ;
   private int AV103Ttrn22wwds_11_tfalbrpieuti ;
   private int AV104Ttrn22wwds_12_tfalbrpieuti_to ;
   private int AV105Ttrn22wwds_13_tfalbrpiedis ;
   private int AV106Ttrn22wwds_14_tfalbrpiedis_to ;
   private int AV39PageToGo ;
   private int AV114GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV40GridCurrentPage ;
   private long AV72TotAlbRPieEnt ;
   private long AV74TotAlbRPieUti ;
   private long AV76TotAlbRPieDis ;
   private long AV41GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV66TFAlbRUniEnt ;
   private java.math.BigDecimal AV67TFAlbRUniEnt_To ;
   private java.math.BigDecimal AV68TFAlbRUniUti ;
   private java.math.BigDecimal AV69TFAlbRUniUti_To ;
   private java.math.BigDecimal AV70TFAlbRUniDis ;
   private java.math.BigDecimal AV71TFAlbRUniDis_To ;
   private java.math.BigDecimal AV78TotAlbRUniEnt ;
   private java.math.BigDecimal AV80TotAlbRUniUti ;
   private java.math.BigDecimal AV82TotAlbRUniDis ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV108Ttrn22wwds_16_tfalbrunient ;
   private java.math.BigDecimal AV109Ttrn22wwds_17_tfalbrunient_to ;
   private java.math.BigDecimal AV110Ttrn22wwds_18_tfalbruniuti ;
   private java.math.BigDecimal AV111Ttrn22wwds_19_tfalbruniuti_to ;
   private java.math.BigDecimal AV112Ttrn22wwds_20_tfalbrunidis ;
   private java.math.BigDecimal AV113Ttrn22wwds_21_tfalbrunidis_to ;
   private java.math.BigDecimal AV86Totalset ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_51_idx="0001" ;
   private String AV30TFCliNom ;
   private String AV31TFCliNom_Sel ;
   private String AV34TFAlbRef ;
   private String AV35TFAlbRef_Sel ;
   private String AV36TFAlbRefDsc ;
   private String AV37TFAlbRefDsc_Sel ;
   private String AV91Pgmname ;
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
   private String lV93Ttrn22wwds_1_tfclinom ;
   private String lV97Ttrn22wwds_5_tfalbref ;
   private String lV99Ttrn22wwds_7_tfalbrefdsc ;
   private String AV94Ttrn22wwds_2_tfclinom_sel ;
   private String AV93Ttrn22wwds_1_tfclinom ;
   private String AV98Ttrn22wwds_6_tfalbref_sel ;
   private String AV97Ttrn22wwds_5_tfalbref ;
   private String AV100Ttrn22wwds_8_tfalbrefdsc_sel ;
   private String AV99Ttrn22wwds_7_tfalbrefdsc ;
   private String hsh ;
   private String AV45Station ;
   private String AV46EmprCod ;
   private String AV47EmprNom ;
   private String AV48UsurCod ;
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
   private String sGXsfl_51_fel_idx="0001" ;
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
   private java.util.Date AV54TFAlbrHor ;
   private java.util.Date AV55TFAlbrHor_To ;
   private java.util.Date A6179AlbrHor ;
   private java.util.Date AV95Ttrn22wwds_3_tfalbrhor ;
   private java.util.Date AV96Ttrn22wwds_4_tfalbrhor_to ;
   private java.util.Date Gx_date ;
   private java.util.Date AV52AlbRFenfrom ;
   private java.util.Date AV53AlbRFento ;
   private java.util.Date AV56DDO_AlbrHorAuxDate ;
   private java.util.Date AV57DDO_AlbrHorAuxDateTo ;
   private java.util.Date A49AlbRFen ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV88LoadGridData ;
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
   private boolean bGXsfl_51_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV64TFAlbRUni_SelsJson ;
   private String AV73TotValueAlbRPieEnt ;
   private String AV75TotValueAlbRPieUti ;
   private String AV77TotValueAlbRPieDis ;
   private String AV79TotValueAlbRUniEnt ;
   private String AV81TotValueAlbRUniUti ;
   private String AV83TotValueAlbRUniDis ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV51WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV107Ttrn22wwds_15_tfalbruni_sels ;
   private HTMLChoice cmbavVaralbrest ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private byte[] H02DE2_A47AlbREst ;
   private String[] H02DE2_A56AlbRUni ;
   private String[] H02DE2_A3613AlbRefDsc ;
   private String[] H02DE2_A45AlbRef ;
   private java.util.Date[] H02DE2_A6179AlbrHor ;
   private java.util.Date[] H02DE2_A49AlbRFen ;
   private String[] H02DE2_A279CliNom ;
   private int[] H02DE2_A252CliCod ;
   private int[] H02DE2_A44AlbRecCod ;
   private String[] H02DE2_A396EmprCod ;
   private int[] H02DE2_A54AlbRPieUti ;
   private int[] H02DE2_A52AlbRPieEnt ;
   private java.math.BigDecimal[] H02DE2_A60AlbRUniUti ;
   private java.math.BigDecimal[] H02DE2_A58AlbRUniEnt ;
   private long[] H02DE3_AGRID_nRecordCount ;
   private int[] H02DE4_A44AlbRecCod ;
   private String[] H02DE4_A396EmprCod ;
   private int[] H02DE4_A252CliCod ;
   private String[] H02DE4_A56AlbRUni ;
   private String[] H02DE4_A3613AlbRefDsc ;
   private String[] H02DE4_A45AlbRef ;
   private java.util.Date[] H02DE4_A6179AlbrHor ;
   private String[] H02DE4_A279CliNom ;
   private int[] H02DE4_A54AlbRPieUti ;
   private int[] H02DE4_A52AlbRPieEnt ;
   private java.math.BigDecimal[] H02DE4_A60AlbRUniUti ;
   private java.math.BigDecimal[] H02DE4_A58AlbRUniEnt ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV65TFAlbRUni_Sels ;
   private app.almacensindetalle.SdtFilterAlmacenTejido AV44FilterAlmacenTejido ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class ttrn22ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02DE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV107Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV94Ttrn22wwds_2_tfclinom_sel ,
                                          String AV93Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV95Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV96Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV98Ttrn22wwds_6_tfalbref_sel ,
                                          String AV97Ttrn22wwds_5_tfalbref ,
                                          String AV100Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV99Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV101Ttrn22wwds_9_tfalbrpieent ,
                                          int AV102Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV103Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV104Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV105Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV106Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV107Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV108Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV109Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV110Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV111Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV112Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV113Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[25];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.AlbREst, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T1.AlbRFen, T2.CliNom, T1.CliCod, T1.AlbRecCod, T1.EmprCod, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti," ;
      sSelectString += " T1.AlbRUniEnt" ;
      sFromString = " FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      if ( (GXutil.strcmp("", AV94Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV93Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (0==AV104Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( ! (0==AV105Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( AV107Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
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

   protected Object[] conditional_H02DE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV107Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV94Ttrn22wwds_2_tfclinom_sel ,
                                          String AV93Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV95Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV96Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV98Ttrn22wwds_6_tfalbref_sel ,
                                          String AV97Ttrn22wwds_5_tfalbref ,
                                          String AV100Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV99Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV101Ttrn22wwds_9_tfalbrpieent ,
                                          int AV102Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV103Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV104Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV105Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV106Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV107Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV108Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV109Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV110Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV111Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV112Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV113Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[20];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV94Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV93Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (0==AV104Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( ! (0==AV105Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      if ( AV107Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int18[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int18[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int18[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int18[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int18[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int18[19] = (byte)(1) ;
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

   protected Object[] conditional_H02DE4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String A56AlbRUni ,
                                          GXSimpleCollection<String> AV107Ttrn22wwds_15_tfalbruni_sels ,
                                          String AV94Ttrn22wwds_2_tfclinom_sel ,
                                          String AV93Ttrn22wwds_1_tfclinom ,
                                          java.util.Date AV95Ttrn22wwds_3_tfalbrhor ,
                                          java.util.Date AV96Ttrn22wwds_4_tfalbrhor_to ,
                                          String AV98Ttrn22wwds_6_tfalbref_sel ,
                                          String AV97Ttrn22wwds_5_tfalbref ,
                                          String AV100Ttrn22wwds_8_tfalbrefdsc_sel ,
                                          String AV99Ttrn22wwds_7_tfalbrefdsc ,
                                          int AV101Ttrn22wwds_9_tfalbrpieent ,
                                          int AV102Ttrn22wwds_10_tfalbrpieent_to ,
                                          int AV103Ttrn22wwds_11_tfalbrpieuti ,
                                          int AV104Ttrn22wwds_12_tfalbrpieuti_to ,
                                          int AV105Ttrn22wwds_13_tfalbrpiedis ,
                                          int AV106Ttrn22wwds_14_tfalbrpiedis_to ,
                                          int AV107Ttrn22wwds_15_tfalbruni_sels_size ,
                                          java.math.BigDecimal AV108Ttrn22wwds_16_tfalbrunient ,
                                          java.math.BigDecimal AV109Ttrn22wwds_17_tfalbrunient_to ,
                                          java.math.BigDecimal AV110Ttrn22wwds_18_tfalbruniuti ,
                                          java.math.BigDecimal AV111Ttrn22wwds_19_tfalbruniuti_to ,
                                          java.math.BigDecimal AV112Ttrn22wwds_20_tfalbrunidis ,
                                          java.math.BigDecimal AV113Ttrn22wwds_21_tfalbrunidis_to ,
                                          String A279CliNom ,
                                          java.util.Date A6179AlbrHor ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A52AlbRPieEnt ,
                                          int A54AlbRPieUti ,
                                          java.math.BigDecimal A58AlbRUniEnt ,
                                          java.math.BigDecimal A60AlbRUniUti )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[20];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT T1.AlbRecCod, T1.EmprCod, T1.CliCod, T1.AlbRUni, T1.AlbRefDsc, T1.AlbRef, T1.AlbrHor, T2.CliNom, T1.AlbRPieUti, T1.AlbRPieEnt, T1.AlbRUniUti, T1.AlbRUniEnt" ;
      scmdbuf += " FROM (TXPALBREC T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      if ( (GXutil.strcmp("", AV94Ttrn22wwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV93Ttrn22wwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Ttrn22wwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int21[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Ttrn22wwds_3_tfalbrhor) )
      {
         addWhere(sWhereString, "(T1.AlbrHor >= ?)");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV96Ttrn22wwds_4_tfalbrhor_to) )
      {
         addWhere(sWhereString, "(T1.AlbrHor <= ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Ttrn22wwds_6_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV97Ttrn22wwds_5_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ttrn22wwds_6_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRef = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Ttrn22wwds_8_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV99Ttrn22wwds_7_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Ttrn22wwds_8_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (0==AV101Ttrn22wwds_9_tfalbrpieent) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (0==AV102Ttrn22wwds_10_tfalbrpieent_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieEnt <= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (0==AV103Ttrn22wwds_11_tfalbrpieuti) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti >= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (0==AV104Ttrn22wwds_12_tfalbrpieuti_to) )
      {
         addWhere(sWhereString, "(T1.AlbRPieUti <= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (0==AV105Ttrn22wwds_13_tfalbrpiedis) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) >= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV106Ttrn22wwds_14_tfalbrpiedis_to) )
      {
         addWhere(sWhereString, "(( T1.AlbRPieEnt - T1.AlbRPieUti) <= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( AV107Ttrn22wwds_15_tfalbruni_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV107Ttrn22wwds_15_tfalbruni_sels, "T1.AlbRUni IN (", ")")+")");
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Ttrn22wwds_16_tfalbrunient)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt >= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV109Ttrn22wwds_17_tfalbrunient_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniEnt <= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV110Ttrn22wwds_18_tfalbruniuti)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti >= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV111Ttrn22wwds_19_tfalbruniuti_to)==0) )
      {
         addWhere(sWhereString, "(T1.AlbRUniUti <= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV112Ttrn22wwds_20_tfalbrunidis)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) >= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV113Ttrn22wwds_21_tfalbrunidis_to)==0) )
      {
         addWhere(sWhereString, "(( CASE  WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) >= 0 THEN T1.AlbRUniEnt - T1.AlbRUniUti WHEN ( T1.AlbRUniEnt - T1.AlbRUniUti) < 0 THEN 0 END) <= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbRecCod" ;
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
                  return conditional_H02DE2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
            case 1 :
                  return conditional_H02DE3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() );
            case 2 :
                  return conditional_H02DE4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GXSimpleCollection<String>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (String)dynConstraints[23] , (java.util.Date)dynConstraints[24] , (String)dynConstraints[25] , (String)dynConstraints[26] , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).intValue() , (java.math.BigDecimal)dynConstraints[29] , (java.math.BigDecimal)dynConstraints[30] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DE4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((java.util.Date[]) buf[6])[0] = GXutil.resetDate(rslt.getGXDateTime(7));
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
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
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[27], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[28], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
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
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 30);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[22], true);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[23], true);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
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
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
      }
   }

}

