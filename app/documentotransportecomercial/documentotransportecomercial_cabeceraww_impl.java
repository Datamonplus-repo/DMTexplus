package app.documentotransportecomercial ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentotransportecomercial_cabeceraww_impl extends GXDataArea
{
   public documentotransportecomercial_cabeceraww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentotransportecomercial_cabeceraww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentotransportecomercial_cabeceraww_impl.class ));
   }

   public documentotransportecomercial_cabeceraww_impl( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPrioridad = new HTMLChoice();
      cmbavAlbcomstin = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
      cmbAlbComEst = new HTMLChoice();
      cmbAlbComSt = new HTMLChoice();
      cmbAlbComEAT = new HTMLChoice();
      cmbAlbComAT = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "AlbProPri") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "AlbProPri") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "AlbProPri") ;
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
            AV84AlbProPri = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProPri", AV84AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84AlbProPri, "9"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV47ContCod = httpContext.GetPar( "ContCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
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
      nRC_GXsfl_62 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_62"))) ;
      nGXsfl_62_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_62_idx"))) ;
      sGXsfl_62_idx = httpContext.GetPar( "sGXsfl_62_idx") ;
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
      cmbavPrioridad.fromJSonString( httpContext.GetNextPar( ));
      AV48Prioridad = httpContext.GetPar( "Prioridad") ;
      AV73AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
      cmbavAlbcomstin.fromJSonString( httpContext.GetNextPar( ));
      AV81AlbComStIN = httpContext.GetPar( "AlbComStIN") ;
      AV74Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV75Albcomfchfrom = localUtil.parseDateParm( httpContext.GetPar( "Albcomfchfrom")) ;
      AV76Albcomfchto = localUtil.parseDateParm( httpContext.GetPar( "Albcomfchto")) ;
      AV49EmprCod = httpContext.GetPar( "EmprCod") ;
      AV15TFAlbComCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComCod"))) ;
      AV16TFAlbComCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComCod_To"))) ;
      AV19TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV20TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV57TFAlbComEst_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV62TFAlbComSt_Sels);
      AV27TFAlbComHor = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbComHor")) ;
      AV29TFAlbComID = httpContext.GetPar( "TFAlbComID") ;
      AV30TFAlbComID_Sel = httpContext.GetPar( "TFAlbComID_Sel") ;
      AV31TFAlbComATCUD = httpContext.GetPar( "TFAlbComATCUD") ;
      AV32TFAlbComATCUD_Sel = httpContext.GetPar( "TFAlbComATCUD_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV59TFAlbComEAT_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV64TFAlbComAT_Sels);
      AV37TFAlbComFs = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbComFs")) ;
      AV65TFAlbCom4dig = httpContext.GetPar( "TFAlbCom4dig") ;
      AV66TFAlbCom4dig_Sel = httpContext.GetPar( "TFAlbCom4dig_Sel") ;
      AV87Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV84AlbProPri = httpContext.GetPar( "AlbProPri") ;
      AV47ContCod = httpContext.GetPar( "ContCod") ;
      AV60FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV48Prioridad, AV73AlbComCod, AV81AlbComStIN, AV74Clicod, AV75Albcomfchfrom, AV76Albcomfchto, AV49EmprCod, AV15TFAlbComCod, AV16TFAlbComCod_To, AV19TFCliNom, AV20TFCliNom_Sel, AV57TFAlbComEst_Sels, AV62TFAlbComSt_Sels, AV27TFAlbComHor, AV29TFAlbComID, AV30TFAlbComID_Sel, AV31TFAlbComATCUD, AV32TFAlbComATCUD_Sel, AV59TFAlbComEAT_Sels, AV64TFAlbComAT_Sels, AV37TFAlbComFs, AV65TFAlbCom4dig, AV66TFAlbCom4dig_Sel, AV87Pgmname, AV12OrderedBy, AV13OrderedDsc, AV84AlbProPri, AV47ContCod, AV60FirmaD, Gx_date) ;
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
      pa25Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start25Y2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransportecomercial.documentotransportecomercial_cabeceraww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV84AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV47ContCod))}, new String[] {"AlbProPri","ContCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_CabeceraWW");
      forbiddenHiddens.add("Prioridad", GXutil.rtrim( localUtil.format( AV48Prioridad, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV87Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransportecomercial\\documentotransportecomercial_cabeceraww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPRIORIDAD", GXutil.rtrim( AV48Prioridad));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV73AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBCOMSTIN", GXutil.rtrim( AV81AlbComStIN));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV74Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBCOMFCHFROM", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBCOMFCHTO", localUtil.format(AV76Albcomfchto, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_62", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_62, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV43GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV44GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV15TFAlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMCOD_TO", GXutil.ltrim( localUtil.ntoc( AV16TFAlbComCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV19TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV20TFCliNom_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBCOMEST_SELS", AV57TFAlbComEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBCOMEST_SELS", AV57TFAlbComEst_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBCOMST_SELS", AV62TFAlbComSt_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBCOMST_SELS", AV62TFAlbComSt_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMHOR", localUtil.ttoc( AV27TFAlbComHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMID", GXutil.rtrim( AV29TFAlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMID_SEL", GXutil.rtrim( AV30TFAlbComID_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMATCUD", GXutil.rtrim( AV31TFAlbComATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMATCUD_SEL", GXutil.rtrim( AV32TFAlbComATCUD_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBCOMEAT_SELS", AV59TFAlbComEAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBCOMEAT_SELS", AV59TFAlbComEAT_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBCOMAT_SELS", AV64TFAlbComAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBCOMAT_SELS", AV64TFAlbComAT_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOMFS", localUtil.ttoc( AV37TFAlbComFs, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOM4DIG", GXutil.rtrim( AV65TFAlbCom4dig));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBCOM4DIG_SEL", GXutil.rtrim( AV66TFAlbCom4dig_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV84AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV47ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV49EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV67Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV71Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV60FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV52UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV50Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG", GXutil.rtrim( Gx_msg));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW", AV82Filterdocumentotransportecomercial_cabeceraww);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW", AV82Filterdocumentotransportecomercial_cabeceraww);
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
         we25Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt25Y2( ) ;
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
      return formatLink("app.documentotransportecomercial.documentotransportecomercial_cabeceraww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV84AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV47ContCod))}, new String[] {"AlbProPri","ContCod"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Transporte Comercial ", "") ;
   }

   public void wb25Y0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         wb_table1_16_25Y2( true) ;
      }
      else
      {
         wb_table1_16_25Y2( false) ;
      }
      return  ;
   }

   public void wb_table1_16_25Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomcod_Internalname, httpContext.getMessage( "Nº Guia", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV73AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbcomcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV73AlbComCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV73AlbComCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbcomstin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbcomstin.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbcomstin, cmbavAlbcomstin.getInternalname(), GXutil.rtrim( AV81AlbComStIN), 1, cmbavAlbcomstin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbcomstin.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "", true, (byte)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         cmbavAlbcomstin.setValue( GXutil.rtrim( AV81AlbComStIN) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcomstin.getInternalname(), "Values", cmbavAlbcomstin.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV74Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74Clicod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74Clicod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomfchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomfchfrom_Internalname, httpContext.getMessage( "Data Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbcomfchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomfchfrom_Internalname, localUtil.format(AV75Albcomfchfrom, "99/99/99"), localUtil.format( AV75Albcomfchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomfchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomfchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbcomfchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbcomfchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbcomfchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbcomfchto_Internalname, httpContext.getMessage( "Data Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbcomfchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbcomfchto_Internalname, localUtil.format(AV76Albcomfchto, "99/99/99"), localUtil.format( AV76Albcomfchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbcomfchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbcomfchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbcomfchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbcomfchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table2_51_25Y2( true) ;
      }
      else
      {
         wb_table2_51_25Y2( false) ;
      }
      return  ;
   }

   public void wb_table2_51_25Y2e( boolean wbgen )
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
         startgridcontrol62( ) ;
      }
      if ( wbEnd == 62 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_62 = (int)(nGXsfl_62_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV43GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV44GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV87Pgmname), GXutil.rtrim( localUtil.format( AV87Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
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
         app.GxWebStd.gx_div_start( httpContext, divDdo_albcomhorauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albcomhorauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albcomhorauxdate_Internalname, localUtil.format(AV28DDO_AlbComHorAuxDate, "99/99/99"), localUtil.format( AV28DDO_AlbComHorAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albcomhorauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albcomhorauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albcomfsauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albcomfsauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albcomfsauxdate_Internalname, localUtil.format(AV38DDO_AlbComFsAuxDate, "99/99/99"), localUtil.format( AV38DDO_AlbComFsAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albcomfsauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albcomfsauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 62 )
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

   public void start25Y2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento Transporte Comercial ", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup25Y0( ) ;
   }

   public void ws25Y2( )
   {
      start25Y2( ) ;
      evt25Y2( ) ;
   }

   public void evt25Y2( )
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
                           e1125Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1225Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1325Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1425Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPRIORIDAD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1525Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBCOMCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1625Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBCOMSTIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1725Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1825Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBCOMFCHFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1925Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBCOMFCHTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2025Y2 ();
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
                           nGXsfl_62_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_622( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV45GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
                           A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           cmbAlbComEst.setName( cmbAlbComEst.getInternalname() );
                           cmbAlbComEst.setValue( httpContext.cgiGet( cmbAlbComEst.getInternalname()) );
                           A16AlbComEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEst.getInternalname()))) ;
                           cmbAlbComSt.setName( cmbAlbComSt.getInternalname() );
                           cmbAlbComSt.setValue( httpContext.cgiGet( cmbAlbComSt.getInternalname()) );
                           A10738AlbComSt = httpContext.cgiGet( cmbAlbComSt.getInternalname()) ;
                           A17AlbComFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbComFch_Internalname), 0)) ;
                           A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname), 0) ;
                           A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
                           A14248AlbComATCU = httpContext.cgiGet( edtAlbComATCU_Internalname) ;
                           cmbAlbComEAT.setName( cmbAlbComEAT.getInternalname() );
                           cmbAlbComEAT.setValue( httpContext.cgiGet( cmbAlbComEAT.getInternalname()) );
                           A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
                           cmbAlbComAT.setName( cmbAlbComAT.getInternalname() );
                           cmbAlbComAT.setValue( httpContext.cgiGet( cmbAlbComAT.getInternalname()) );
                           A10764AlbComAT = httpContext.cgiGet( cmbAlbComAT.getInternalname()) ;
                           A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname), 0) ;
                           A10014AlbComFd = httpContext.cgiGet( edtAlbComFd_Internalname) ;
                           A14374AlbCom4dig = httpContext.cgiGet( edtAlbCom4dig_Internalname) ;
                           A22AlbComPri = httpContext.cgiGet( edtAlbComPri_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2125Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2225Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2325Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2425Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Prioridad Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIORIDAD"), AV48Prioridad) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albcomcod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV73AlbComCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albcomstin Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBCOMSTIN"), AV81AlbComStIN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV74Clicod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albcomfchfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBCOMFCHFROM"), 0), AV75Albcomfchfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albcomfchto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBCOMFCHTO"), 0), AV76Albcomfchto) ) )
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

   public void we25Y2( )
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

   public void pa25Y2( )
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
            GX_FocusControl = cmbavPrioridad.getInternalname() ;
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
      subsflControlProps_622( ) ;
      while ( nGXsfl_62_idx <= nRC_GXsfl_62 )
      {
         sendrow_622( ) ;
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV48Prioridad ,
                                 int AV73AlbComCod ,
                                 String AV81AlbComStIN ,
                                 int AV74Clicod ,
                                 java.util.Date AV75Albcomfchfrom ,
                                 java.util.Date AV76Albcomfchto ,
                                 String AV49EmprCod ,
                                 int AV15TFAlbComCod ,
                                 int AV16TFAlbComCod_To ,
                                 String AV19TFCliNom ,
                                 String AV20TFCliNom_Sel ,
                                 GXSimpleCollection<Byte> AV57TFAlbComEst_Sels ,
                                 GXSimpleCollection<String> AV62TFAlbComSt_Sels ,
                                 java.util.Date AV27TFAlbComHor ,
                                 String AV29TFAlbComID ,
                                 String AV30TFAlbComID_Sel ,
                                 String AV31TFAlbComATCUD ,
                                 String AV32TFAlbComATCUD_Sel ,
                                 GXSimpleCollection<Byte> AV59TFAlbComEAT_Sels ,
                                 GXSimpleCollection<String> AV64TFAlbComAT_Sels ,
                                 java.util.Date AV37TFAlbComFs ,
                                 String AV65TFAlbCom4dig ,
                                 String AV66TFAlbCom4dig_Sel ,
                                 String AV87Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV84AlbProPri ,
                                 String AV47ContCod ,
                                 short AV60FirmaD ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2225Y2 ();
      GRID_nCurrentRecord = 0 ;
      rf25Y2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_CabeceraWW");
      forbiddenHiddens.add("Prioridad", GXutil.rtrim( localUtil.format( AV48Prioridad, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV87Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransportecomercial\\documentotransportecomercial_cabeceraww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEST", GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMEAT", GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A10738AlbComSt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMST", GXutil.rtrim( A10738AlbComSt));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
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
      if ( cmbavPrioridad.getItemCount() > 0 )
      {
         AV48Prioridad = cmbavPrioridad.getValidValue(AV48Prioridad) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Prioridad", AV48Prioridad);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrioridad.setValue( GXutil.rtrim( AV48Prioridad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Values", cmbavPrioridad.ToJavascriptSource(), true);
      }
      if ( cmbavAlbcomstin.getItemCount() > 0 )
      {
         AV81AlbComStIN = cmbavAlbcomstin.getValidValue(AV81AlbComStIN) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81AlbComStIN", AV81AlbComStIN);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbcomstin.setValue( GXutil.rtrim( AV81AlbComStIN) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbcomstin.getInternalname(), "Values", cmbavAlbcomstin.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf25Y2( ) ;
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
      AV87Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Pgmname", AV87Pgmname);
      Gx_err = (short)(0) ;
      cmbavPrioridad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrioridad.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf25Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(62) ;
      /* Execute user event: Refresh */
      e2225Y2 ();
      nGXsfl_62_idx = 1 ;
      sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_622( ) ;
      bGXsfl_62_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_622( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A16AlbComEst) ,
                                              AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                              A10738AlbComSt ,
                                              AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                              Byte.valueOf(A10739AlbComEAT) ,
                                              AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                              A10764AlbComAT ,
                                              AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                              Integer.valueOf(AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) ,
                                              Integer.valueOf(AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) ,
                                              AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                              AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                              Integer.valueOf(AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels.size()) ,
                                              Integer.valueOf(AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels.size()) ,
                                              AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                              AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                              AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                              AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                              AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                              Integer.valueOf(AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels.size()) ,
                                              Integer.valueOf(AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels.size()) ,
                                              AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                              AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                              AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                              Integer.valueOf(AV73AlbComCod) ,
                                              Integer.valueOf(AV74Clicod) ,
                                              AV75Albcomfchfrom ,
                                              AV76Albcomfchto ,
                                              Integer.valueOf(A14AlbComCod) ,
                                              A279CliNom ,
                                              A4829AlbComHor ,
                                              A10740AlbComID ,
                                              A14248AlbComATCU ,
                                              A10013AlbComFs ,
                                              A10014AlbComFd ,
                                              Integer.valueOf(A252CliCod) ,
                                              A17AlbComFch ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A22AlbComPri ,
                                              AV48Prioridad ,
                                              AV81AlbComStIN ,
                                              AV49EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom), 30, "%") ;
         lV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = GXutil.padr( GXutil.rtrim( AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid), 20, "%") ;
         lV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud), 20, "%") ;
         lV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = GXutil.padr( GXutil.rtrim( AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig), 4, "%") ;
         /* Using cursor H025Y2 */
         pr_default.execute(0, new Object[] {AV49EmprCod, AV48Prioridad, AV81AlbComStIN, AV81AlbComStIN, Integer.valueOf(AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod), Integer.valueOf(AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to), lV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom, AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel, AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor, lV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid, AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel, lV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud, AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel, AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs, lV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig, AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel, Integer.valueOf(AV73AlbComCod), Integer.valueOf(AV74Clicod), AV75Albcomfchfrom, AV76Albcomfchto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_62_idx = 1 ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H025Y2_A396EmprCod[0] ;
            A22AlbComPri = H025Y2_A22AlbComPri[0] ;
            A10013AlbComFs = H025Y2_A10013AlbComFs[0] ;
            A10764AlbComAT = H025Y2_A10764AlbComAT[0] ;
            A10739AlbComEAT = H025Y2_A10739AlbComEAT[0] ;
            A14248AlbComATCU = H025Y2_A14248AlbComATCU[0] ;
            A10740AlbComID = H025Y2_A10740AlbComID[0] ;
            A4829AlbComHor = H025Y2_A4829AlbComHor[0] ;
            A17AlbComFch = H025Y2_A17AlbComFch[0] ;
            A10738AlbComSt = H025Y2_A10738AlbComSt[0] ;
            A16AlbComEst = H025Y2_A16AlbComEst[0] ;
            A279CliNom = H025Y2_A279CliNom[0] ;
            A252CliCod = H025Y2_A252CliCod[0] ;
            A14AlbComCod = H025Y2_A14AlbComCod[0] ;
            A10014AlbComFd = H025Y2_A10014AlbComFd[0] ;
            A279CliNom = H025Y2_A279CliNom[0] ;
            A14374AlbCom4dig = GXutil.substring( A10014AlbComFd, 1, 1) + GXutil.substring( A10014AlbComFd, 11, 1) + GXutil.substring( A10014AlbComFd, 21, 1) + GXutil.substring( A10014AlbComFd, 31, 1) ;
            e2325Y2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(62) ;
         wb25Y0( ) ;
      }
      bGXsfl_62_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes25Y2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV84AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84AlbProPri, "9"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEST"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( DecimalUtil.doubleToDec(A16AlbComEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMEAT"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( DecimalUtil.doubleToDec(A10739AlbComEAT), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBCOMST"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, GXutil.rtrim( localUtil.format( A10738AlbComSt, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_CLICOD"+"_"+sGXsfl_62_idx, getSecureSignedToken( sGXsfl_62_idx, localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV60FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60FirmaD), "ZZZ9")));
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
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV15TFAlbComCod ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV16TFAlbComCod_To ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV19TFCliNom ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV20TFCliNom_Sel ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV57TFAlbComEst_Sels ;
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV62TFAlbComSt_Sels ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV27TFAlbComHor ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV29TFAlbComID ;
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV30TFAlbComID_Sel ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV31TFAlbComATCUD ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV32TFAlbComATCUD_Sel ;
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV59TFAlbComEAT_Sels ;
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV64TFAlbComAT_Sels ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV37TFAlbComFs ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV65TFAlbCom4dig ;
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV66TFAlbCom4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A16AlbComEst) ,
                                           AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                           A10738AlbComSt ,
                                           AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                           Byte.valueOf(A10739AlbComEAT) ,
                                           AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                           A10764AlbComAT ,
                                           AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                           Integer.valueOf(AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) ,
                                           Integer.valueOf(AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) ,
                                           AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                           AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                           Integer.valueOf(AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels.size()) ,
                                           Integer.valueOf(AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels.size()) ,
                                           AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                           AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                           AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                           AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                           AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                           Integer.valueOf(AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels.size()) ,
                                           Integer.valueOf(AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels.size()) ,
                                           AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                           AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                           AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                           Integer.valueOf(AV73AlbComCod) ,
                                           Integer.valueOf(AV74Clicod) ,
                                           AV75Albcomfchfrom ,
                                           AV76Albcomfchto ,
                                           Integer.valueOf(A14AlbComCod) ,
                                           A279CliNom ,
                                           A4829AlbComHor ,
                                           A10740AlbComID ,
                                           A14248AlbComATCU ,
                                           A10013AlbComFs ,
                                           A10014AlbComFd ,
                                           Integer.valueOf(A252CliCod) ,
                                           A17AlbComFch ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A22AlbComPri ,
                                           AV48Prioridad ,
                                           AV81AlbComStIN ,
                                           AV49EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = GXutil.padr( GXutil.rtrim( AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom), 30, "%") ;
      lV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = GXutil.padr( GXutil.rtrim( AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid), 20, "%") ;
      lV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = GXutil.padr( GXutil.rtrim( AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud), 20, "%") ;
      lV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = GXutil.padr( GXutil.rtrim( AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig), 4, "%") ;
      /* Using cursor H025Y3 */
      pr_default.execute(1, new Object[] {AV49EmprCod, AV48Prioridad, AV48Prioridad, AV81AlbComStIN, AV81AlbComStIN, Integer.valueOf(AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod), Integer.valueOf(AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to), lV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom, AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel, AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor, lV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid, AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel, lV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud, AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel, AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs, lV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig, AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel, Integer.valueOf(AV73AlbComCod), Integer.valueOf(AV74Clicod), AV75Albcomfchfrom, AV76Albcomfchto});
      GRID_nRecordCount = H025Y3_AGRID_nRecordCount[0] ;
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
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV15TFAlbComCod ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV16TFAlbComCod_To ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV19TFCliNom ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV20TFCliNom_Sel ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV57TFAlbComEst_Sels ;
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV62TFAlbComSt_Sels ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV27TFAlbComHor ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV29TFAlbComID ;
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV30TFAlbComID_Sel ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV31TFAlbComATCUD ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV32TFAlbComATCUD_Sel ;
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV59TFAlbComEAT_Sels ;
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV64TFAlbComAT_Sels ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV37TFAlbComFs ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV65TFAlbCom4dig ;
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV66TFAlbCom4dig_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV48Prioridad, AV73AlbComCod, AV81AlbComStIN, AV74Clicod, AV75Albcomfchfrom, AV76Albcomfchto, AV49EmprCod, AV15TFAlbComCod, AV16TFAlbComCod_To, AV19TFCliNom, AV20TFCliNom_Sel, AV57TFAlbComEst_Sels, AV62TFAlbComSt_Sels, AV27TFAlbComHor, AV29TFAlbComID, AV30TFAlbComID_Sel, AV31TFAlbComATCUD, AV32TFAlbComATCUD_Sel, AV59TFAlbComEAT_Sels, AV64TFAlbComAT_Sels, AV37TFAlbComFs, AV65TFAlbCom4dig, AV66TFAlbCom4dig_Sel, AV87Pgmname, AV12OrderedBy, AV13OrderedDsc, AV84AlbProPri, AV47ContCod, AV60FirmaD, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV15TFAlbComCod ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV16TFAlbComCod_To ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV19TFCliNom ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV20TFCliNom_Sel ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV57TFAlbComEst_Sels ;
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV62TFAlbComSt_Sels ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV27TFAlbComHor ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV29TFAlbComID ;
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV30TFAlbComID_Sel ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV31TFAlbComATCUD ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV32TFAlbComATCUD_Sel ;
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV59TFAlbComEAT_Sels ;
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV64TFAlbComAT_Sels ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV37TFAlbComFs ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV65TFAlbCom4dig ;
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV66TFAlbCom4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Prioridad, AV73AlbComCod, AV81AlbComStIN, AV74Clicod, AV75Albcomfchfrom, AV76Albcomfchto, AV49EmprCod, AV15TFAlbComCod, AV16TFAlbComCod_To, AV19TFCliNom, AV20TFCliNom_Sel, AV57TFAlbComEst_Sels, AV62TFAlbComSt_Sels, AV27TFAlbComHor, AV29TFAlbComID, AV30TFAlbComID_Sel, AV31TFAlbComATCUD, AV32TFAlbComATCUD_Sel, AV59TFAlbComEAT_Sels, AV64TFAlbComAT_Sels, AV37TFAlbComFs, AV65TFAlbCom4dig, AV66TFAlbCom4dig_Sel, AV87Pgmname, AV12OrderedBy, AV13OrderedDsc, AV84AlbProPri, AV47ContCod, AV60FirmaD, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV15TFAlbComCod ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV16TFAlbComCod_To ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV19TFCliNom ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV20TFCliNom_Sel ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV57TFAlbComEst_Sels ;
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV62TFAlbComSt_Sels ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV27TFAlbComHor ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV29TFAlbComID ;
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV30TFAlbComID_Sel ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV31TFAlbComATCUD ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV32TFAlbComATCUD_Sel ;
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV59TFAlbComEAT_Sels ;
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV64TFAlbComAT_Sels ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV37TFAlbComFs ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV65TFAlbCom4dig ;
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV66TFAlbCom4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Prioridad, AV73AlbComCod, AV81AlbComStIN, AV74Clicod, AV75Albcomfchfrom, AV76Albcomfchto, AV49EmprCod, AV15TFAlbComCod, AV16TFAlbComCod_To, AV19TFCliNom, AV20TFCliNom_Sel, AV57TFAlbComEst_Sels, AV62TFAlbComSt_Sels, AV27TFAlbComHor, AV29TFAlbComID, AV30TFAlbComID_Sel, AV31TFAlbComATCUD, AV32TFAlbComATCUD_Sel, AV59TFAlbComEAT_Sels, AV64TFAlbComAT_Sels, AV37TFAlbComFs, AV65TFAlbCom4dig, AV66TFAlbCom4dig_Sel, AV87Pgmname, AV12OrderedBy, AV13OrderedDsc, AV84AlbProPri, AV47ContCod, AV60FirmaD, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV15TFAlbComCod ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV16TFAlbComCod_To ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV19TFCliNom ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV20TFCliNom_Sel ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV57TFAlbComEst_Sels ;
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV62TFAlbComSt_Sels ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV27TFAlbComHor ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV29TFAlbComID ;
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV30TFAlbComID_Sel ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV31TFAlbComATCUD ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV32TFAlbComATCUD_Sel ;
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV59TFAlbComEAT_Sels ;
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV64TFAlbComAT_Sels ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV37TFAlbComFs ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV65TFAlbCom4dig ;
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV66TFAlbCom4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Prioridad, AV73AlbComCod, AV81AlbComStIN, AV74Clicod, AV75Albcomfchfrom, AV76Albcomfchto, AV49EmprCod, AV15TFAlbComCod, AV16TFAlbComCod_To, AV19TFCliNom, AV20TFCliNom_Sel, AV57TFAlbComEst_Sels, AV62TFAlbComSt_Sels, AV27TFAlbComHor, AV29TFAlbComID, AV30TFAlbComID_Sel, AV31TFAlbComATCUD, AV32TFAlbComATCUD_Sel, AV59TFAlbComEAT_Sels, AV64TFAlbComAT_Sels, AV37TFAlbComFs, AV65TFAlbCom4dig, AV66TFAlbCom4dig_Sel, AV87Pgmname, AV12OrderedBy, AV13OrderedDsc, AV84AlbProPri, AV47ContCod, AV60FirmaD, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV15TFAlbComCod ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV16TFAlbComCod_To ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV19TFCliNom ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV20TFCliNom_Sel ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV57TFAlbComEst_Sels ;
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV62TFAlbComSt_Sels ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV27TFAlbComHor ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV29TFAlbComID ;
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV30TFAlbComID_Sel ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV31TFAlbComATCUD ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV32TFAlbComATCUD_Sel ;
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV59TFAlbComEAT_Sels ;
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV64TFAlbComAT_Sels ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV37TFAlbComFs ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV65TFAlbCom4dig ;
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV66TFAlbCom4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48Prioridad, AV73AlbComCod, AV81AlbComStIN, AV74Clicod, AV75Albcomfchfrom, AV76Albcomfchto, AV49EmprCod, AV15TFAlbComCod, AV16TFAlbComCod_To, AV19TFCliNom, AV20TFCliNom_Sel, AV57TFAlbComEst_Sels, AV62TFAlbComSt_Sels, AV27TFAlbComHor, AV29TFAlbComID, AV30TFAlbComID_Sel, AV31TFAlbComATCUD, AV32TFAlbComATCUD_Sel, AV59TFAlbComEAT_Sels, AV64TFAlbComAT_Sels, AV37TFAlbComFs, AV65TFAlbCom4dig, AV66TFAlbCom4dig_Sel, AV87Pgmname, AV12OrderedBy, AV13OrderedDsc, AV84AlbProPri, AV47ContCod, AV60FirmaD, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV87Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87Pgmname", AV87Pgmname);
      Gx_err = (short)(0) ;
      cmbavPrioridad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrioridad.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup25Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2125Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_62 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_62"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV44GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         cmbavPrioridad.setName( cmbavPrioridad.getInternalname() );
         cmbavPrioridad.setValue( httpContext.cgiGet( cmbavPrioridad.getInternalname()) );
         AV48Prioridad = httpContext.cgiGet( cmbavPrioridad.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Prioridad", AV48Prioridad);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbcomcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbcomcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBCOMCOD");
            GX_FocusControl = edtavAlbcomcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73AlbComCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbComCod), 8, 0));
         }
         else
         {
            AV73AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbcomcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbComCod), 8, 0));
         }
         cmbavAlbcomstin.setName( cmbavAlbcomstin.getInternalname() );
         cmbavAlbcomstin.setValue( httpContext.cgiGet( cmbavAlbcomstin.getInternalname()) );
         AV81AlbComStIN = httpContext.cgiGet( cmbavAlbcomstin.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81AlbComStIN", AV81AlbComStIN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV74Clicod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Clicod), 6, 0));
         }
         else
         {
            AV74Clicod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Clicod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbcomfchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBCOMFCHFROM");
            GX_FocusControl = edtavAlbcomfchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75Albcomfchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75Albcomfchfrom", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
         }
         else
         {
            AV75Albcomfchfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbcomfchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75Albcomfchfrom", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbcomfchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBCOMFCHTO");
            GX_FocusControl = edtavAlbcomfchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76Albcomfchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76Albcomfchto", localUtil.format(AV76Albcomfchto, "99/99/99"));
         }
         else
         {
            AV76Albcomfchto = localUtil.ctod( httpContext.cgiGet( edtavAlbcomfchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76Albcomfchto", localUtil.format(AV76Albcomfchto, "99/99/99"));
         }
         AV87Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87Pgmname", AV87Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albcomhorauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBCOMHORAUXDATE");
            GX_FocusControl = edtavDdo_albcomhorauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28DDO_AlbComHorAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28DDO_AlbComHorAuxDate", localUtil.format(AV28DDO_AlbComHorAuxDate, "99/99/99"));
         }
         else
         {
            AV28DDO_AlbComHorAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albcomhorauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28DDO_AlbComHorAuxDate", localUtil.format(AV28DDO_AlbComHorAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albcomfsauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBCOMFSAUXDATE");
            GX_FocusControl = edtavDdo_albcomfsauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV38DDO_AlbComFsAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbComFsAuxDate", localUtil.format(AV38DDO_AlbComFsAuxDate, "99/99/99"));
         }
         else
         {
            AV38DDO_AlbComFsAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albcomfsauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbComFsAuxDate", localUtil.format(AV38DDO_AlbComFsAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_62_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
         if ( nGXsfl_62_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV45GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
            A14AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            cmbAlbComEst.setName( cmbAlbComEst.getInternalname() );
            cmbAlbComEst.setValue( httpContext.cgiGet( cmbAlbComEst.getInternalname()) );
            A16AlbComEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEst.getInternalname()))) ;
            cmbAlbComSt.setName( cmbAlbComSt.getInternalname() );
            cmbAlbComSt.setValue( httpContext.cgiGet( cmbAlbComSt.getInternalname()) );
            A10738AlbComSt = httpContext.cgiGet( cmbAlbComSt.getInternalname()) ;
            A17AlbComFch = localUtil.ctod( httpContext.cgiGet( edtAlbComFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A4829AlbComHor = localUtil.ctot( httpContext.cgiGet( edtAlbComHor_Internalname)) ;
            A10740AlbComID = httpContext.cgiGet( edtAlbComID_Internalname) ;
            A14248AlbComATCU = httpContext.cgiGet( edtAlbComATCU_Internalname) ;
            cmbAlbComEAT.setName( cmbAlbComEAT.getInternalname() );
            cmbAlbComEAT.setValue( httpContext.cgiGet( cmbAlbComEAT.getInternalname()) );
            A10739AlbComEAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbComEAT.getInternalname()))) ;
            cmbAlbComAT.setName( cmbAlbComAT.getInternalname() );
            cmbAlbComAT.setValue( httpContext.cgiGet( cmbAlbComAT.getInternalname()) );
            A10764AlbComAT = httpContext.cgiGet( cmbAlbComAT.getInternalname()) ;
            A10013AlbComFs = localUtil.ctot( httpContext.cgiGet( edtAlbComFs_Internalname)) ;
            A10014AlbComFd = httpContext.cgiGet( edtAlbComFd_Internalname) ;
            A14374AlbCom4dig = httpContext.cgiGet( edtAlbCom4dig_Internalname) ;
            A22AlbComPri = httpContext.cgiGet( edtAlbComPri_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentoTransporteComercial_CabeceraWW");
         AV48Prioridad = httpContext.cgiGet( cmbavPrioridad.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Prioridad", AV48Prioridad);
         forbiddenHiddens.add("Prioridad", GXutil.rtrim( localUtil.format( AV48Prioridad, "")));
         AV87Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87Pgmname", AV87Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV87Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransportecomercial\\documentotransportecomercial_cabeceraww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIORIDAD"), AV48Prioridad) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBCOMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV73AlbComCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBCOMSTIN"), AV81AlbComStIN) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV74Clicod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBCOMFCHFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV75Albcomfchfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBCOMFCHTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV76Albcomfchto)) ) )
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
      e2125Y2 ();
      if (returnInSub) return;
   }

   public void e2125Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV48Prioridad = AV84AlbProPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Prioridad", AV48Prioridad);
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst())==0) )
      {
         AV81AlbComStIN = "T" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81AlbComStIN", AV81AlbComStIN);
      }
      if ( GXutil.strcmp(AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad(), " ") == 0 )
      {
         AV48Prioridad = AV84AlbProPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Prioridad", AV48Prioridad);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto())) )
      {
         AV75Albcomfchfrom = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Albcomfchfrom", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
         AV76Albcomfchto = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Albcomfchto", localUtil.format(AV76Albcomfchto, "99/99/99"));
      }
      else
      {
         if ( (0==AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod()) )
         {
            AV75Albcomfchfrom = GXutil.dadd(Gx_date,-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75Albcomfchfrom", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
            AV76Albcomfchto = Gx_date ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76Albcomfchto", localUtil.format(AV76Albcomfchto, "99/99/99"));
         }
      }
      GXt_char1 = AV50Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV50Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
      GXv_char2[0] = AV49EmprCod ;
      GXv_char3[0] = AV51EmprNom ;
      GXv_char4[0] = AV52UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV50Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentotransportecomercial_cabeceraww_impl.this.AV49EmprCod = GXv_char2[0] ;
      documentotransportecomercial_cabeceraww_impl.this.AV51EmprNom = GXv_char3[0] ;
      documentotransportecomercial_cabeceraww_impl.this.AV52UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV52UsurCod", AV52UsurCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Documento Transporte Comercial ", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV60FirmaD) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV49EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int8) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV60FirmaD = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60FirmaD), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV60FirmaD), "ZZZ9")));
   }

   public void e2225Y2( )
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
      AV43GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridCurrentPage), 10, 0));
      AV44GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      edtAlbComCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComCod_Internalname, "Columnheaderclass", edtAlbComCod_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtCliCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Columnheaderclass", edtCliCod_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtCliNom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Columnheaderclass", edtCliNom_Columnheaderclass, !bGXsfl_62_Refreshing);
      cmbAlbComEst.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEst.getInternalname(), "Columnheaderclass", cmbAlbComEst.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      cmbAlbComSt.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComSt.getInternalname(), "Columnheaderclass", cmbAlbComSt.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      edtAlbComFch_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFch_Internalname, "Columnheaderclass", edtAlbComFch_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtAlbComHor_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComHor_Internalname, "Columnheaderclass", edtAlbComHor_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtAlbComID_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComID_Internalname, "Columnheaderclass", edtAlbComID_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtAlbComATCU_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComATCU_Internalname, "Columnheaderclass", edtAlbComATCU_Columnheaderclass, !bGXsfl_62_Refreshing);
      cmbAlbComEAT.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Columnheaderclass", cmbAlbComEAT.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      cmbAlbComAT.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbComAT.getInternalname(), "Columnheaderclass", cmbAlbComAT.getColumnHeaderClass(), !bGXsfl_62_Refreshing);
      edtAlbComFs_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbComFs_Internalname, "Columnheaderclass", edtAlbComFs_Columnheaderclass, !bGXsfl_62_Refreshing);
      edtAlbCom4dig_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCom4dig_Internalname, "Columnheaderclass", edtAlbCom4dig_Columnheaderclass, !bGXsfl_62_Refreshing);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "GridLayoutClean", "", new Object[] {});
      AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod = AV15TFAlbComCod ;
      AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to = AV16TFAlbComCod_To ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = AV19TFCliNom ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = AV20TFCliNom_Sel ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = AV57TFAlbComEst_Sels ;
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = AV62TFAlbComSt_Sels ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = AV27TFAlbComHor ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = AV29TFAlbComID ;
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = AV30TFAlbComID_Sel ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = AV31TFAlbComATCUD ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = AV32TFAlbComATCUD_Sel ;
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = AV59TFAlbComEAT_Sels ;
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = AV64TFAlbComAT_Sels ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = AV37TFAlbComFs ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = AV65TFAlbCom4dig ;
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = AV66TFAlbCom4dig_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1125Y2( )
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
         AV42PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV42PageToGo) ;
      }
   }

   public void e1225Y2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1325Y2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComCod") == 0 )
         {
            AV15TFAlbComCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFAlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFAlbComCod), 8, 0));
            AV16TFAlbComCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFAlbComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFAlbComCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV19TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFCliNom", AV19TFCliNom);
            AV20TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFCliNom_Sel", AV20TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComEst") == 0 )
         {
            AV56TFAlbComEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbComEst_SelsJson", AV56TFAlbComEst_SelsJson);
            AV57TFAlbComEst_Sels.fromJSonString(GXutil.strReplace( AV56TFAlbComEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComSt") == 0 )
         {
            AV61TFAlbComSt_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbComSt_SelsJson", AV61TFAlbComSt_SelsJson);
            AV62TFAlbComSt_Sels.fromJSonString(AV61TFAlbComSt_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComHor") == 0 )
         {
            AV27TFAlbComHor = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbComHor", localUtil.ttoc( AV27TFAlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComID") == 0 )
         {
            AV29TFAlbComID = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbComID", AV29TFAlbComID);
            AV30TFAlbComID_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbComID_Sel", AV30TFAlbComID_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComATCUD") == 0 )
         {
            AV31TFAlbComATCUD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbComATCUD", AV31TFAlbComATCUD);
            AV32TFAlbComATCUD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbComATCUD_Sel", AV32TFAlbComATCUD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComEAT") == 0 )
         {
            AV58TFAlbComEAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbComEAT_SelsJson", AV58TFAlbComEAT_SelsJson);
            AV59TFAlbComEAT_Sels.fromJSonString(GXutil.strReplace( AV58TFAlbComEAT_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComAT") == 0 )
         {
            AV63TFAlbComAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFAlbComAT_SelsJson", AV63TFAlbComAT_SelsJson);
            AV64TFAlbComAT_Sels.fromJSonString(AV63TFAlbComAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComFs") == 0 )
         {
            AV37TFAlbComFs = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbComFs", localUtil.ttoc( AV37TFAlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbCom4dig") == 0 )
         {
            AV65TFAlbCom4dig = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbCom4dig", AV65TFAlbCom4dig);
            AV66TFAlbCom4dig_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbCom4dig_Sel", AV66TFAlbCom4dig_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV64TFAlbComAT_Sels", AV64TFAlbComAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV59TFAlbComEAT_Sels", AV59TFAlbComEAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV62TFAlbComSt_Sels", AV62TFAlbComSt_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV57TFAlbComEst_Sels", AV57TFAlbComEst_Sels);
   }

   private void e2325Y2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Anular GUIA", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Lineas", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Generar HASH", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Envio AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Entrada Manual Codigo de AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.setColumnClass( ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtAlbComCod_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtCliCod_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtCliNom_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbAlbComEst.setColumnClass( ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      cmbAlbComSt.setColumnClass( ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      edtAlbComFch_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbComHor_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbComID_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbComATCU_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbAlbComEAT.setColumnClass( ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      cmbAlbComAT.setColumnClass( ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      edtAlbComFs_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtAlbCom4dig_Columnclass = ((GXutil.strcmp(A10738AlbComSt, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(62) ;
      }
      sendrow_622( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_62_Refreshing )
      {
         httpContext.doAjaxLoad(62, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV45GridActions, 4, 0)) );
   }

   public void e2425Y2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV45GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ANULARGUIA' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 4 )
      {
         /* Execute user subroutine: 'DO LINEAS' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 5 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 6 )
      {
         /* Execute user subroutine: 'DO HASH' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 7 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 8 )
      {
         /* Execute user subroutine: 'DO ENVIOAT' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 9 )
      {
         /* Execute user subroutine: 'DO MANUALCODIGOAT' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV45GridActions == 10 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S252 ();
         if (returnInSub) return;
      }
      AV45GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV45GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e1425Y2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV48Prioridad, "9") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay defininido el Tipo de Guia: Guia Remessa o Guia Transporte sem Ecargos", ""));
         GX_FocusControl = cmbavPrioridad.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.strcmp(AV48Prioridad, "1") == 0 )
         {
            AV47ContCod = "100011" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
         }
         else if ( GXutil.strcmp(AV48Prioridad, "0") == 0 )
         {
            AV47ContCod = "100012" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
         }
         httpContext.popup(formatLink("app.documentotransportecomercial.documentotransportecomercial_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV48Prioridad)),GXutil.URLEncode(GXutil.rtrim(AV47ContCod))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri","ContCod"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
      {
         AV47ContCod = "100011" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
      }
      else if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
      {
         AV47ContCod = "100012" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
      }
      httpContext.popup(formatLink("app.documentotransportecomercial.documentotransportecomercial_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV47ContCod))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri","ContCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( A16AlbComEst > 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento Facturado", ""));
      }
      else
      {
         if ( ( A10739AlbComEAT == 3 ) || ! (GXutil.strcmp("", A10740AlbComID)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento comunicado a AT", ""));
         }
         else
         {
            if ( GXutil.strcmp(A22AlbComPri, "1") == 0 )
            {
               AV47ContCod = "100011" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
            }
            else if ( GXutil.strcmp(A22AlbComPri, "0") == 0 )
            {
               AV47ContCod = "100012" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
            }
            callWebObject(formatLink("app.documentotransportecomercial.documentotransportecomercial_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV47ContCod))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri","ContCod"}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
   }

   public void S182( )
   {
      /* 'DO ANULARGUIA' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A10738AlbComSt, "A") == 0 )
      {
         Gx_msg = httpContext.getMessage( "Este Guia foi ANULADA", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( (GXutil.strcmp("", A10740AlbComID)==0) )
         {
            Gx_msg = httpContext.getMessage( "Este guia não tem código AT", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A10739AlbComEAT == 0 )
            {
               Gx_msg = httpContext.getMessage( "Este guia não foi enviado para a AT", "") ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               httpContext.popup(formatLink("app.documentotransportecomercial.documentotransportecomercial_anulacion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A17AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10013AlbComFs)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.rtrim(A10740AlbComID)),GXutil.URLEncode(GXutil.rtrim(AV67Cadena)),GXutil.URLEncode(GXutil.rtrim(AV71Hash))}, new String[] {"EmprCod","AlbProcod","AlbProfch","AlbHhfm","AlbProSal","ALbProPri","ALbLic","Cadena","Hash"}) , new Object[] {"AV49EmprCod","A14AlbComCod","A17AlbComFch","A10013AlbComFs","A4829AlbComHor","A22AlbComPri","A10740AlbComID","AV67Cadena","AV71Hash"});
            }
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO LINEAS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransportecomercial.documentotransportecomercial_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.formatDateParm(A17AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.ltrimstr(A10739AlbComEAT,1,0)),GXutil.URLEncode(GXutil.rtrim(A10740AlbComID)),GXutil.URLEncode(GXutil.ltrimstr(A16AlbComEst,1,0))}, new String[] {"EmprCod","AlbComCod","CliCod","CliNom","AlbComFch","AlbComHor","AlbComPri","AlbComEAT","AlbComID","Albcomest"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.imprimirdocumentocomercial", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"Emprcod","AlbComCod"}) , new Object[] {"AV49EmprCod","A14AlbComCod"});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO HASH' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV67Cadena ;
      GXv_char3[0] = AV68firma ;
      new app.documentotransporteproduccion.obtengocadenaparahashdocumentotransportecomercial(remoteHandle, context).execute( AV49EmprCod, A14AlbComCod, A17AlbComFch, A10013AlbComFs, GXv_char4, GXv_char3) ;
      documentotransportecomercial_cabeceraww_impl.this.AV67Cadena = GXv_char4[0] ;
      documentotransportecomercial_cabeceraww_impl.this.AV68firma = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Cadena", AV67Cadena);
      GXv_char4[0] = AV71Hash ;
      GXv_objcol_SdtMessages_Message10[0] = AV70Messages ;
      GXv_boolean11[0] = AV69ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV67Cadena, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
      documentotransportecomercial_cabeceraww_impl.this.AV71Hash = GXv_char4[0] ;
      AV70Messages = GXv_objcol_SdtMessages_Message10[0] ;
      documentotransportecomercial_cabeceraww_impl.this.AV69ok = GXv_boolean11[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Hash", AV71Hash);
      if ( AV69ok )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
         GXv_char4[0] = AV67Cadena ;
         GXv_char3[0] = AV71Hash ;
         new app.documentotransporteproduccion.actualizohashdocumentotransportecomercial(remoteHandle, context).execute( AV49EmprCod, A14AlbComCod, GXv_char4, GXv_char3) ;
         documentotransportecomercial_cabeceraww_impl.this.AV67Cadena = GXv_char4[0] ;
         documentotransportecomercial_cabeceraww_impl.this.AV71Hash = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Cadena", AV67Cadena);
         httpContext.ajax_rsp_assign_attri("", false, "AV71Hash", AV71Hash);
      }
      else
      {
         AV106GXV1 = 1 ;
         while ( AV106GXV1 <= AV70Messages.size() )
         {
            AV72Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV70Messages.elementAt(-1+AV106GXV1));
            httpContext.GX_msglist.addItem(AV72Message.getgxTv_SdtMessages_Message_Description());
            AV106GXV1 = (int)(AV106GXV1+1) ;
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( A16AlbComEst > 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento FACTURADO", ""));
      }
      else
      {
         if ( AV60FirmaD == 1 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO se puede eliminar. Esta activo FIRMA DIGITAL", ""));
         }
         else
         {
            if ( ( A10739AlbComEAT == 3 ) || ! (GXutil.strcmp("", A10740AlbComID)==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""));
            }
            else
            {
               GXv_char4[0] = AV49EmprCod ;
               GXv_int12[0] = A14AlbComCod ;
               GXv_int13[0] = (short)(0) ;
               GXv_char3[0] = httpContext.getMessage( "C", "") ;
               GXv_char2[0] = AV52UsurCod ;
               GXv_char14[0] = AV50Station ;
               GXv_char15[0] = Gx_msg ;
               new app.pbjbp(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_int13, GXv_char3, GXv_char2, GXv_char14, GXv_char15) ;
               documentotransportecomercial_cabeceraww_impl.this.AV49EmprCod = GXv_char4[0] ;
               documentotransportecomercial_cabeceraww_impl.this.A14AlbComCod = GXv_int12[0] ;
               documentotransportecomercial_cabeceraww_impl.this.AV52UsurCod = GXv_char2[0] ;
               documentotransportecomercial_cabeceraww_impl.this.AV50Station = GXv_char14[0] ;
               documentotransportecomercial_cabeceraww_impl.this.Gx_msg = GXv_char15[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49EmprCod", AV49EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV52UsurCod", AV52UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV50Station", AV50Station);
               httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
               httpContext.doAjaxRefresh();
               if ( 1 == 0 )
               {
                  callWebObject(formatLink("app.documentotransportecomercial.documentotransportecomercial_cabecera", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV47ContCod))}, new String[] {"Mode","EmprCod","AlbComCod","AlbComPri","ContCod"}) );
                  httpContext.wjLocDisableFrm = (byte)(1) ;
               }
            }
         }
      }
   }

   public void S232( )
   {
      /* 'DO ENVIOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A10740AlbComID, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A10740AlbComID ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A10739AlbComEAT == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.documentotransportecomercial.preparoxmldocumentotransportecomercial", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A17AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10013AlbComFs)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.rtrim(AV67Cadena)),GXutil.URLEncode(GXutil.rtrim(AV71Hash))}, new String[] {"EmprCod","AlbProcod","AlbComFch","AlbProSys","AlbProSal","ALbProPri","Cadena","Hash"}) , new Object[] {"AV49EmprCod","A14AlbComCod","A17AlbComFch","A10013AlbComFs","A4829AlbComHor","A22AlbComPri","AV67Cadena","AV71Hash"});
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO MANUALCODIGOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A10740AlbComID, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A10740AlbComID ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A10739AlbComEAT == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_msg", Gx_msg);
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.documentotransportecomercial_manual_at", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A22AlbComPri)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.formatDateParm(A17AlbComFch)),GXutil.URLEncode(GXutil.formatDateTimeParm(A4829AlbComHor)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10013AlbComFs)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","AlbProcod","ALbcomPri","clicod","Albcomfch","AlbComHor","AlbHhfm","CliNif"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S252( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.albaranescomerciales.talcobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV49EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A14AlbComCod,8,0))}, new String[] {"Mode","EmprCod","AlbComCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV87Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV87Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV87Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV107GXV2 = 1 ;
      while ( AV107GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV107GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOD") == 0 )
         {
            AV15TFAlbComCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFAlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFAlbComCod), 8, 0));
            AV16TFAlbComCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFAlbComCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFAlbComCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV19TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFCliNom", AV19TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV20TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFCliNom_Sel", AV20TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEST_SEL") == 0 )
         {
            AV56TFAlbComEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFAlbComEst_SelsJson", AV56TFAlbComEst_SelsJson);
            AV57TFAlbComEst_Sels.fromJSonString(AV56TFAlbComEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMST_SEL") == 0 )
         {
            AV61TFAlbComSt_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbComSt_SelsJson", AV61TFAlbComSt_SelsJson);
            AV62TFAlbComSt_Sels.fromJSonString(AV61TFAlbComSt_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMHOR") == 0 )
         {
            AV27TFAlbComHor = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbComHor", localUtil.ttoc( AV27TFAlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV28DDO_AlbComHorAuxDate = GXutil.resetTime(AV27TFAlbComHor) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28DDO_AlbComHorAuxDate", localUtil.format(AV28DDO_AlbComHorAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID") == 0 )
         {
            AV29TFAlbComID = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbComID", AV29TFAlbComID);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMID_SEL") == 0 )
         {
            AV30TFAlbComID_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFAlbComID_Sel", AV30TFAlbComID_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD") == 0 )
         {
            AV31TFAlbComATCUD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbComATCUD", AV31TFAlbComATCUD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMATCUD_SEL") == 0 )
         {
            AV32TFAlbComATCUD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbComATCUD_Sel", AV32TFAlbComATCUD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMEAT_SEL") == 0 )
         {
            AV58TFAlbComEAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbComEAT_SelsJson", AV58TFAlbComEAT_SelsJson);
            AV59TFAlbComEAT_Sels.fromJSonString(AV58TFAlbComEAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMAT_SEL") == 0 )
         {
            AV63TFAlbComAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFAlbComAT_SelsJson", AV63TFAlbComAT_SelsJson);
            AV64TFAlbComAT_Sels.fromJSonString(AV63TFAlbComAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMFS") == 0 )
         {
            AV37TFAlbComFs = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbComFs", localUtil.ttoc( AV37TFAlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV38DDO_AlbComFsAuxDate = GXutil.resetTime(AV37TFAlbComFs) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38DDO_AlbComFsAuxDate", localUtil.format(AV38DDO_AlbComFsAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOM4DIG") == 0 )
         {
            AV65TFAlbCom4dig = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65TFAlbCom4dig", AV65TFAlbCom4dig);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOM4DIG_SEL") == 0 )
         {
            AV66TFAlbCom4dig_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66TFAlbCom4dig_Sel", AV66TFAlbCom4dig_Sel);
         }
         AV107GXV2 = (int)(AV107GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char15[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFCliNom_Sel)==0), AV20TFCliNom_Sel, GXv_char15) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char1 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char14[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV62TFAlbComSt_Sels.size()==0), AV61TFAlbComSt_SelsJson, GXv_char14) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char16 = GXv_char14[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFAlbComID_Sel)==0), AV30TFAlbComID_Sel, GXv_char4) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char18 = "" ;
      GXv_char3[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFAlbComATCUD_Sel)==0), AV32TFAlbComATCUD_Sel, GXv_char3) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char18 = GXv_char3[0] ;
      GXt_char19 = "" ;
      GXv_char2[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV64TFAlbComAT_Sels.size()==0), AV63TFAlbComAT_SelsJson, GXv_char2) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char19 = GXv_char2[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFAlbCom4dig_Sel)==0), AV66TFAlbCom4dig_Sel, GXv_char21) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+((AV57TFAlbComEst_Sels.size()==0) ? "" : AV56TFAlbComEst_SelsJson)+"|"+GXt_char16+"|||"+GXt_char17+"|"+GXt_char18+"|"+((AV59TFAlbComEAT_Sels.size()==0) ? "" : AV58TFAlbComEAT_SelsJson)+"|"+GXt_char19+"||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFCliNom)==0), AV19TFCliNom, GXv_char21) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char19 = "" ;
      GXv_char15[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFAlbComID)==0), AV29TFAlbComID, GXv_char15) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char19 = GXv_char15[0] ;
      GXt_char18 = "" ;
      GXv_char14[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFAlbComATCUD)==0), AV31TFAlbComATCUD, GXv_char14) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char18 = GXv_char14[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFAlbCom4dig)==0), AV65TFAlbCom4dig, GXv_char4) ;
      documentotransportecomercial_cabeceraww_impl.this.GXt_char17 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFAlbComCod) ? "" : GXutil.str( AV15TFAlbComCod, 8, 0))+"||"+GXt_char20+"||||"+(GXutil.dateCompare(GXutil.nullDate(), AV27TFAlbComHor) ? "" : localUtil.dtoc( AV28DDO_AlbComHorAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char19+"|"+GXt_char18+"|||"+(GXutil.dateCompare(GXutil.nullDate(), AV37TFAlbComFs) ? "" : localUtil.dtoc( AV38DDO_AlbComFsAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFAlbComCod_To) ? "" : GXutil.str( AV16TFAlbComCod_To, 8, 0))+"||||||||||||" ;
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
      AV10GridState.fromxml(AV14Session.getValue(AV87Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMCOD", "", !((0==AV15TFAlbComCod)&&(0==AV16TFAlbComCod_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFAlbComCod, 8, 0)), GXutil.trim( GXutil.str( AV16TFAlbComCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFCLINOM", "", !(GXutil.strcmp("", AV19TFCliNom)==0), (short)(0), AV19TFCliNom, "", !(GXutil.strcmp("", AV20TFCliNom_Sel)==0), AV20TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMEST_SEL", "", !(AV57TFAlbComEst_Sels.size()==0), (short)(0), AV57TFAlbComEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMST_SEL", "", !(AV62TFAlbComSt_Sels.size()==0), (short)(0), AV62TFAlbComSt_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMHOR", "", !GXutil.dateCompare(GXutil.nullDate(), AV27TFAlbComHor), (short)(0), GXutil.trim( localUtil.ttoc( AV27TFAlbComHor, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMID", "", !(GXutil.strcmp("", AV29TFAlbComID)==0), (short)(0), AV29TFAlbComID, "", !(GXutil.strcmp("", AV30TFAlbComID_Sel)==0), AV30TFAlbComID_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMATCUD", "", !(GXutil.strcmp("", AV31TFAlbComATCUD)==0), (short)(0), AV31TFAlbComATCUD, "", !(GXutil.strcmp("", AV32TFAlbComATCUD_Sel)==0), AV32TFAlbComATCUD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMEAT_SEL", "", !(AV59TFAlbComEAT_Sels.size()==0), (short)(0), AV59TFAlbComEAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMAT_SEL", "", !(AV64TFAlbComAT_Sels.size()==0), (short)(0), AV64TFAlbComAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOMFS", "", !GXutil.dateCompare(GXutil.nullDate(), AV37TFAlbComFs), (short)(0), GXutil.trim( localUtil.ttoc( AV37TFAlbComFs, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBCOM4DIG", "", !(GXutil.strcmp("", AV65TFAlbCom4dig)==0), (short)(0), AV65TFAlbCom4dig, "", !(GXutil.strcmp("", AV66TFAlbCom4dig_Sel)==0), AV66TFAlbCom4dig_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV84AlbProPri)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROPRI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV84AlbProPri );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV47ContCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CONTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV47ContCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV87Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV87Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteComercial.DocumentoTransporteComercial_Cabecera" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e1525Y2( )
   {
      /* Prioridad_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV48Prioridad, "1") == 0 )
      {
         AV47ContCod = "100011" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV48Prioridad, "0") == 0 )
      {
         AV47ContCod = "100012" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S262 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82Filterdocumentotransportecomercial_cabeceraww", AV82Filterdocumentotransportecomercial_cabeceraww);
   }

   public void e1625Y2( )
   {
      /* Albcomcod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV73AlbComCod) )
      {
         AV75Albcomfchfrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Albcomfchfrom", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
         AV76Albcomfchto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Albcomfchto", localUtil.format(AV76Albcomfchto, "99/99/99"));
         AV74Clicod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Clicod), 6, 0));
      }
      else
      {
         AV75Albcomfchfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Albcomfchfrom", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
         AV76Albcomfchto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV76Albcomfchto", localUtil.format(AV76Albcomfchto, "99/99/99"));
         AV74Clicod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Clicod), 6, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82Filterdocumentotransportecomercial_cabeceraww", AV82Filterdocumentotransportecomercial_cabeceraww);
   }

   public void e1725Y2( )
   {
      /* Albcomstin_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82Filterdocumentotransportecomercial_cabeceraww", AV82Filterdocumentotransportecomercial_cabeceraww);
   }

   public void e1825Y2( )
   {
      /* Clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82Filterdocumentotransportecomercial_cabeceraww", AV82Filterdocumentotransportecomercial_cabeceraww);
   }

   public void e1925Y2( )
   {
      /* Albcomfchfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82Filterdocumentotransportecomercial_cabeceraww", AV82Filterdocumentotransportecomercial_cabeceraww);
   }

   public void e2025Y2( )
   {
      /* Albcomfchto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S262 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV82Filterdocumentotransportecomercial_cabeceraww", AV82Filterdocumentotransportecomercial_cabeceraww);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV82Filterdocumentotransportecomercial_cabeceraww.fromJSonString(AV83WebSession.getValue(httpContext.getMessage( "Filtedocumentotransportecomercial_cabeceraww", "")), null);
      AV73AlbComCod = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbComCod), 8, 0));
      AV81AlbComStIN = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81AlbComStIN", AV81AlbComStIN);
      AV74Clicod = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74Clicod), 6, 0));
      AV75Albcomfchfrom = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Albcomfchfrom", localUtil.format(AV75Albcomfchfrom, "99/99/99"));
      AV76Albcomfchto = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76Albcomfchto", localUtil.format(AV76Albcomfchto, "99/99/99"));
      AV48Prioridad = AV82Filterdocumentotransportecomercial_cabeceraww.getgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Prioridad", AV48Prioridad);
   }

   public void S262( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV82Filterdocumentotransportecomercial_cabeceraww.setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Clicod( AV74Clicod );
      AV82Filterdocumentotransportecomercial_cabeceraww.setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomcod( AV73AlbComCod );
      AV82Filterdocumentotransportecomercial_cabeceraww.setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomst( AV81AlbComStIN );
      AV82Filterdocumentotransportecomercial_cabeceraww.setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchfrom( AV75Albcomfchfrom );
      AV82Filterdocumentotransportecomercial_cabeceraww.setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Albcomfchto( AV76Albcomfchto );
      AV82Filterdocumentotransportecomercial_cabeceraww.setgxTv_SdtFilterdocumentotransportecomercial_cabeceraww_Prioridad( AV48Prioridad );
      AV83WebSession.setValue(httpContext.getMessage( "Filtedocumentotransportecomercial_cabeceraww", ""), AV82Filterdocumentotransportecomercial_cabeceraww.toJSonString(false, true));
   }

   public void wb_table2_51_25Y2( boolean wbgen )
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
         wb_table2_51_25Y2e( true) ;
      }
      else
      {
         wb_table2_51_25Y2e( false) ;
      }
   }

   public void wb_table1_16_25Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedactiongroup_actions_Internalname, tblTablemergedactiongroup_actions_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 62, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprioridad_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprioridad_Internalname, "", "", "", lblTextblockprioridad_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPrioridad.getInternalname(), httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_62_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrioridad, cmbavPrioridad.getInternalname(), GXutil.rtrim( AV48Prioridad), 1, cmbavPrioridad.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrioridad.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "", true, (byte)(0), "HLP_DocumentoTransporteComercial\\DocumentoTransporteComercial_CabeceraWW.htm");
         cmbavPrioridad.setValue( GXutil.rtrim( AV48Prioridad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Values", cmbavPrioridad.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_16_25Y2e( true) ;
      }
      else
      {
         wb_table1_16_25Y2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV84AlbProPri = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84AlbProPri", AV84AlbProPri);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV84AlbProPri, "9"))));
      AV47ContCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47ContCod", AV47ContCod);
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
      pa25Y2( ) ;
      ws25Y2( ) ;
      we25Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145466", true, true);
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
      httpContext.AddJavascriptSource("documentotransportecomercial/documentotransportecomercial_cabeceraww.js", "?202682116145466", false, true);
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

   public void subsflControlProps_622( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_62_idx );
      edtAlbComCod_Internalname = "ALBCOMCOD_"+sGXsfl_62_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_62_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_62_idx ;
      cmbAlbComEst.setInternalname( "ALBCOMEST_"+sGXsfl_62_idx );
      cmbAlbComSt.setInternalname( "ALBCOMST_"+sGXsfl_62_idx );
      edtAlbComFch_Internalname = "ALBCOMFCH_"+sGXsfl_62_idx ;
      edtAlbComHor_Internalname = "ALBCOMHOR_"+sGXsfl_62_idx ;
      edtAlbComID_Internalname = "ALBCOMID_"+sGXsfl_62_idx ;
      edtAlbComATCU_Internalname = "ALBCOMATCU_"+sGXsfl_62_idx ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT_"+sGXsfl_62_idx );
      cmbAlbComAT.setInternalname( "ALBCOMAT_"+sGXsfl_62_idx );
      edtAlbComFs_Internalname = "ALBCOMFS_"+sGXsfl_62_idx ;
      edtAlbComFd_Internalname = "ALBCOMFD_"+sGXsfl_62_idx ;
      edtAlbCom4dig_Internalname = "ALBCOM4DIG_"+sGXsfl_62_idx ;
      edtAlbComPri_Internalname = "ALBCOMPRI_"+sGXsfl_62_idx ;
   }

   public void subsflControlProps_fel_622( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_62_fel_idx );
      edtAlbComCod_Internalname = "ALBCOMCOD_"+sGXsfl_62_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_62_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_62_fel_idx ;
      cmbAlbComEst.setInternalname( "ALBCOMEST_"+sGXsfl_62_fel_idx );
      cmbAlbComSt.setInternalname( "ALBCOMST_"+sGXsfl_62_fel_idx );
      edtAlbComFch_Internalname = "ALBCOMFCH_"+sGXsfl_62_fel_idx ;
      edtAlbComHor_Internalname = "ALBCOMHOR_"+sGXsfl_62_fel_idx ;
      edtAlbComID_Internalname = "ALBCOMID_"+sGXsfl_62_fel_idx ;
      edtAlbComATCU_Internalname = "ALBCOMATCU_"+sGXsfl_62_fel_idx ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT_"+sGXsfl_62_fel_idx );
      cmbAlbComAT.setInternalname( "ALBCOMAT_"+sGXsfl_62_fel_idx );
      edtAlbComFs_Internalname = "ALBCOMFS_"+sGXsfl_62_fel_idx ;
      edtAlbComFd_Internalname = "ALBCOMFD_"+sGXsfl_62_fel_idx ;
      edtAlbCom4dig_Internalname = "ALBCOM4DIG_"+sGXsfl_62_fel_idx ;
      edtAlbComPri_Internalname = "ALBCOMPRI_"+sGXsfl_62_fel_idx ;
   }

   public void sendrow_622( )
   {
      subsflControlProps_622( ) ;
      wb25Y0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_62_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_62_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_62_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_62_idx+"',62)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_62_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV45GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV45GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV45GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_62_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV45GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_62_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCod_Internalname,GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14AlbComCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbComCod_Columnclass,edtAlbComCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliCod_Columnclass,edtCliCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtCliNom_Columnclass,edtCliNom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbComEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBCOMEST_" + sGXsfl_62_idx ;
            cmbAlbComEst.setName( GXCCtl );
            cmbAlbComEst.setWebtags( "" );
            cmbAlbComEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
            cmbAlbComEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
            cmbAlbComEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
            if ( cmbAlbComEst.getItemCount() > 0 )
            {
               A16AlbComEst = (byte)(GXutil.lval( cmbAlbComEst.getValidValue(GXutil.trim( GXutil.str( A16AlbComEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbComEst,cmbAlbComEst.getInternalname(),GXutil.trim( GXutil.str( A16AlbComEst, 1, 0)),Integer.valueOf(1),cmbAlbComEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbComEst.getColumnClass(),cmbAlbComEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbComEst.setValue( GXutil.trim( GXutil.str( A16AlbComEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEst.getInternalname(), "Values", cmbAlbComEst.ToJavascriptSource(), !bGXsfl_62_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbComSt.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBCOMST_" + sGXsfl_62_idx ;
            cmbAlbComSt.setName( GXCCtl );
            cmbAlbComSt.setWebtags( "" );
            cmbAlbComSt.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
            cmbAlbComSt.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
            cmbAlbComSt.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbAlbComSt.getItemCount() > 0 )
            {
               A10738AlbComSt = cmbAlbComSt.getValidValue(A10738AlbComSt) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbComSt,cmbAlbComSt.getInternalname(),GXutil.rtrim( A10738AlbComSt),Integer.valueOf(1),cmbAlbComSt.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbComSt.getColumnClass(),cmbAlbComSt.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbComSt.setValue( GXutil.rtrim( A10738AlbComSt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComSt.getInternalname(), "Values", cmbAlbComSt.ToJavascriptSource(), !bGXsfl_62_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFch_Internalname,localUtil.format(A17AlbComFch, "99/99/99"),localUtil.format( A17AlbComFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbComFch_Columnclass,edtAlbComFch_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComHor_Internalname,localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4829AlbComHor, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComHor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbComHor_Columnclass,edtAlbComHor_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComID_Internalname,GXutil.rtrim( A10740AlbComID),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbComID_Columnclass,edtAlbComID_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComATCU_Internalname,GXutil.rtrim( A14248AlbComATCU),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComATCU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbComATCU_Columnclass,edtAlbComATCU_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbComEAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBCOMEAT_" + sGXsfl_62_idx ;
            cmbAlbComEAT.setName( GXCCtl );
            cmbAlbComEAT.setWebtags( "" );
            cmbAlbComEAT.addItem("0", httpContext.getMessage( "Não enviado", ""), (short)(0));
            cmbAlbComEAT.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
            if ( cmbAlbComEAT.getItemCount() > 0 )
            {
               A10739AlbComEAT = (byte)(GXutil.lval( cmbAlbComEAT.getValidValue(GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbComEAT,cmbAlbComEAT.getInternalname(),GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)),Integer.valueOf(1),cmbAlbComEAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbComEAT.getColumnClass(),cmbAlbComEAT.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbComEAT.setValue( GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComEAT.getInternalname(), "Values", cmbAlbComEAT.ToJavascriptSource(), !bGXsfl_62_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbComAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBCOMAT_" + sGXsfl_62_idx ;
            cmbAlbComAT.setName( GXCCtl );
            cmbAlbComAT.setWebtags( "" );
            cmbAlbComAT.addItem("", httpContext.getMessage( "Pendiente", ""), (short)(0));
            cmbAlbComAT.addItem("A", httpContext.getMessage( "Automatic", ""), (short)(0));
            cmbAlbComAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
            if ( cmbAlbComAT.getItemCount() > 0 )
            {
               A10764AlbComAT = cmbAlbComAT.getValidValue(A10764AlbComAT) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbComAT,cmbAlbComAT.getInternalname(),GXutil.rtrim( A10764AlbComAT),Integer.valueOf(1),cmbAlbComAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbComAT.getColumnClass(),cmbAlbComAT.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbComAT.setValue( GXutil.rtrim( A10764AlbComAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbComAT.getInternalname(), "Values", cmbAlbComAT.ToJavascriptSource(), !bGXsfl_62_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFs_Internalname,localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10013AlbComFs, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbComFs_Columnclass,edtAlbComFs_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComFd_Internalname,GXutil.rtrim( A10014AlbComFd),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComFd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCom4dig_Internalname,GXutil.rtrim( A14374AlbCom4dig),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCom4dig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbCom4dig_Columnclass,edtAlbCom4dig_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComPri_Internalname,GXutil.rtrim( A22AlbComPri),GXutil.rtrim( localUtil.format( A22AlbComPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbComPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(62),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes25Y2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_62_idx = ((subGrid_Islastpage==1)&&(nGXsfl_62_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_62_idx+1) ;
         sGXsfl_62_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_62_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_622( ) ;
      }
      /* End function sendrow_622 */
   }

   public void startgridcontrol62( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"62\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATCUD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A/M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbComCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbComCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtCliNom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtCliNom_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A16AlbComEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbComEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbComEst.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10738AlbComSt));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbComSt.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbComSt.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A17AlbComFch, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbComFch_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbComFch_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbComHor_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbComHor_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10740AlbComID));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbComID_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbComID_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14248AlbComATCU));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbComATCU_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbComATCU_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10739AlbComEAT, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbComEAT.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbComEAT.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10764AlbComAT));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbComAT.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbComAT.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10013AlbComFs, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbComFs_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbComFs_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10014AlbComFd));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14374AlbCom4dig));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbCom4dig_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbCom4dig_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A22AlbComPri));
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
      lblTextblockprioridad_Internalname = "TEXTBLOCKPRIORIDAD" ;
      cmbavPrioridad.setInternalname( "vPRIORIDAD" );
      divUnnamedtableprioridad_Internalname = "UNNAMEDTABLEPRIORIDAD" ;
      tblTablemergedactiongroup_actions_Internalname = "TABLEMERGEDACTIONGROUP_ACTIONS" ;
      edtavAlbcomcod_Internalname = "vALBCOMCOD" ;
      cmbavAlbcomstin.setInternalname( "vALBCOMSTIN" );
      edtavClicod_Internalname = "vCLICOD" ;
      edtavAlbcomfchfrom_Internalname = "vALBCOMFCHFROM" ;
      edtavAlbcomfchto_Internalname = "vALBCOMFCHTO" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbComCod_Internalname = "ALBCOMCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      cmbAlbComEst.setInternalname( "ALBCOMEST" );
      cmbAlbComSt.setInternalname( "ALBCOMST" );
      edtAlbComFch_Internalname = "ALBCOMFCH" ;
      edtAlbComHor_Internalname = "ALBCOMHOR" ;
      edtAlbComID_Internalname = "ALBCOMID" ;
      edtAlbComATCU_Internalname = "ALBCOMATCU" ;
      cmbAlbComEAT.setInternalname( "ALBCOMEAT" );
      cmbAlbComAT.setInternalname( "ALBCOMAT" );
      edtAlbComFs_Internalname = "ALBCOMFS" ;
      edtAlbComFd_Internalname = "ALBCOMFD" ;
      edtAlbCom4dig_Internalname = "ALBCOM4DIG" ;
      edtAlbComPri_Internalname = "ALBCOMPRI" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albcomhorauxdate_Internalname = "vDDO_ALBCOMHORAUXDATE" ;
      divDdo_albcomhorauxdates_Internalname = "DDO_ALBCOMHORAUXDATES" ;
      edtavDdo_albcomfsauxdate_Internalname = "vDDO_ALBCOMFSAUXDATE" ;
      divDdo_albcomfsauxdates_Internalname = "DDO_ALBCOMFSAUXDATES" ;
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
      edtAlbComPri_Jsonclick = "" ;
      edtAlbCom4dig_Jsonclick = "" ;
      edtAlbCom4dig_Columnclass = "WWColumn" ;
      edtAlbComFd_Jsonclick = "" ;
      edtAlbComFs_Jsonclick = "" ;
      edtAlbComFs_Columnclass = "WWColumn hidden-xs" ;
      cmbAlbComAT.setJsonclick( "" );
      cmbAlbComAT.setColumnClass( "WWColumn" );
      cmbAlbComEAT.setJsonclick( "" );
      cmbAlbComEAT.setColumnClass( "WWColumn" );
      edtAlbComATCU_Jsonclick = "" ;
      edtAlbComATCU_Columnclass = "WWColumn" ;
      edtAlbComID_Jsonclick = "" ;
      edtAlbComID_Columnclass = "WWColumn" ;
      edtAlbComHor_Jsonclick = "" ;
      edtAlbComHor_Columnclass = "WWColumn" ;
      edtAlbComFch_Jsonclick = "" ;
      edtAlbComFch_Columnclass = "WWColumn" ;
      cmbAlbComSt.setJsonclick( "" );
      cmbAlbComSt.setColumnClass( "WWColumn" );
      cmbAlbComEst.setJsonclick( "" );
      cmbAlbComEst.setColumnClass( "WWColumn" );
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Columnclass = "WWColumn" ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Columnclass = "WWColumn" ;
      edtAlbComCod_Jsonclick = "" ;
      edtAlbComCod_Columnclass = "WWColumn" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbavPrioridad.setJsonclick( "" );
      cmbavPrioridad.setEnabled( 1 );
      edtAlbCom4dig_Columnheaderclass = "" ;
      edtAlbComFs_Columnheaderclass = "" ;
      cmbAlbComAT.setColumnHeaderClass( "" );
      cmbAlbComEAT.setColumnHeaderClass( "" );
      edtAlbComATCU_Columnheaderclass = "" ;
      edtAlbComID_Columnheaderclass = "" ;
      edtAlbComHor_Columnheaderclass = "" ;
      edtAlbComFch_Columnheaderclass = "" ;
      cmbAlbComSt.setColumnHeaderClass( "" );
      cmbAlbComEst.setColumnHeaderClass( "" );
      edtCliNom_Columnheaderclass = "" ;
      edtCliCod_Columnheaderclass = "" ;
      edtAlbComCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albcomfsauxdate_Jsonclick = "" ;
      edtavDdo_albcomhorauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavAlbcomfchto_Jsonclick = "" ;
      edtavAlbcomfchto_Enabled = 1 ;
      edtavAlbcomfchfrom_Jsonclick = "" ;
      edtavAlbcomfchfrom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      cmbavAlbcomstin.setJsonclick( "" );
      cmbavAlbcomstin.setEnabled( 1 );
      edtavAlbcomcod_Jsonclick = "" ;
      edtavAlbcomcod_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;Salida;Salida;AT;AT;AT;AT;AT;;AT;" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||0:Pdte. Imprimir,1:Imprimido,2:Facturado|:Em preparação,F:Finalizado,A:Anulado|||||0:Não enviado,3:Enviada a AT|:Pendiente,A:Automatic,M:Manual||" ;
      Ddo_grid_Allowmultipleselection = "|||T|T|||||T|T||" ;
      Ddo_grid_Datalisttype = "||Dynamic|FixedValues|FixedValues|||Dynamic|Dynamic|FixedValues|FixedValues||Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T|T|||T|T|T|T||T" ;
      Ddo_grid_Filterisrange = "T||||||||||||" ;
      Ddo_grid_Filtertype = "Numeric||Character||||Date|Character|Character|||Date|Character" ;
      Ddo_grid_Includefilter = "T||T||||T|T|T|||T|T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|" ;
      Ddo_grid_Columnids = "1:AlbComCod|2:CliCod|3:CliNom|4:AlbComEst|5:AlbComSt|6:AlbComFch|7:AlbComHor|8:AlbComID|9:AlbComATCUD|10:AlbComEAT|11:AlbComAT|12:AlbComFs|14:AlbCom4dig" ;
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
      Form.setCaption( httpContext.getMessage( " Documento Transporte Comercial ", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPrioridad.setName( "vPRIORIDAD" );
      cmbavPrioridad.setWebtags( "" );
      cmbavPrioridad.addItem("9", httpContext.getMessage( "Definir Guia", ""), (short)(0));
      cmbavPrioridad.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavPrioridad.addItem("0", httpContext.getMessage( "Guia Transporte sem Encargos", ""), (short)(0));
      if ( cmbavPrioridad.getItemCount() > 0 )
      {
         AV48Prioridad = cmbavPrioridad.getValidValue(AV48Prioridad) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48Prioridad", AV48Prioridad);
      }
      cmbavAlbcomstin.setName( "vALBCOMSTIN" );
      cmbavAlbcomstin.setWebtags( "" );
      cmbavAlbcomstin.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavAlbcomstin.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbavAlbcomstin.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
      cmbavAlbcomstin.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbavAlbcomstin.getItemCount() > 0 )
      {
         AV81AlbComStIN = cmbavAlbcomstin.getValidValue(AV81AlbComStIN) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81AlbComStIN", AV81AlbComStIN);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_62_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV45GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV45GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GridActions), 4, 0));
      }
      GXCCtl = "ALBCOMEST_" + sGXsfl_62_idx ;
      cmbAlbComEst.setName( GXCCtl );
      cmbAlbComEst.setWebtags( "" );
      cmbAlbComEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
      cmbAlbComEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
      cmbAlbComEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
      if ( cmbAlbComEst.getItemCount() > 0 )
      {
         A16AlbComEst = (byte)(GXutil.lval( cmbAlbComEst.getValidValue(GXutil.trim( GXutil.str( A16AlbComEst, 1, 0))))) ;
      }
      GXCCtl = "ALBCOMST_" + sGXsfl_62_idx ;
      cmbAlbComSt.setName( GXCCtl );
      cmbAlbComSt.setWebtags( "" );
      cmbAlbComSt.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
      cmbAlbComSt.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbAlbComSt.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbComSt.getItemCount() > 0 )
      {
         A10738AlbComSt = cmbAlbComSt.getValidValue(A10738AlbComSt) ;
      }
      GXCCtl = "ALBCOMEAT_" + sGXsfl_62_idx ;
      cmbAlbComEAT.setName( GXCCtl );
      cmbAlbComEAT.setWebtags( "" );
      cmbAlbComEAT.addItem("0", httpContext.getMessage( "Não enviado", ""), (short)(0));
      cmbAlbComEAT.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbComEAT.getItemCount() > 0 )
      {
         A10739AlbComEAT = (byte)(GXutil.lval( cmbAlbComEAT.getValidValue(GXutil.trim( GXutil.str( A10739AlbComEAT, 1, 0))))) ;
      }
      GXCCtl = "ALBCOMAT_" + sGXsfl_62_idx ;
      cmbAlbComAT.setName( GXCCtl );
      cmbAlbComAT.setWebtags( "" );
      cmbAlbComAT.addItem("", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbAlbComAT.addItem("A", httpContext.getMessage( "Automatic", ""), (short)(0));
      cmbAlbComAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbAlbComAT.getItemCount() > 0 )
      {
         A10764AlbComAT = cmbAlbComAT.getValidValue(A10764AlbComAT) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''},{av:'AV15TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV16TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV19TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV20TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFAlbComEst_Sels',fld:'vTFALBCOMEST_SELS',pic:''},{av:'AV62TFAlbComSt_Sels',fld:'vTFALBCOMST_SELS',pic:''},{av:'AV27TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV29TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV30TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV31TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV32TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV59TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV64TFAlbComAT_Sels',fld:'vTFALBCOMAT_SELS',pic:''},{av:'AV37TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV65TFAlbCom4dig',fld:'vTFALBCOM4DIG',pic:''},{av:'AV66TFAlbCom4dig_Sel',fld:'vTFALBCOM4DIG_SEL',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV60FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtAlbComCod_Columnheaderclass',ctrl:'ALBCOMCOD',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'cmbAlbComEst'},{av:'cmbAlbComSt'},{av:'edtAlbComFch_Columnheaderclass',ctrl:'ALBCOMFCH',prop:'Columnheaderclass'},{av:'edtAlbComHor_Columnheaderclass',ctrl:'ALBCOMHOR',prop:'Columnheaderclass'},{av:'edtAlbComID_Columnheaderclass',ctrl:'ALBCOMID',prop:'Columnheaderclass'},{av:'edtAlbComATCU_Columnheaderclass',ctrl:'ALBCOMATCU',prop:'Columnheaderclass'},{av:'cmbAlbComEAT'},{av:'cmbAlbComAT'},{av:'edtAlbComFs_Columnheaderclass',ctrl:'ALBCOMFS',prop:'Columnheaderclass'},{av:'edtAlbCom4dig_Columnheaderclass',ctrl:'ALBCOM4DIG',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1125Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV16TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV19TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV20TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFAlbComEst_Sels',fld:'vTFALBCOMEST_SELS',pic:''},{av:'AV62TFAlbComSt_Sels',fld:'vTFALBCOMST_SELS',pic:''},{av:'AV27TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV29TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV30TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV31TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV32TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV59TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV64TFAlbComAT_Sels',fld:'vTFALBCOMAT_SELS',pic:''},{av:'AV37TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV65TFAlbCom4dig',fld:'vTFALBCOM4DIG',pic:''},{av:'AV66TFAlbCom4dig_Sel',fld:'vTFALBCOM4DIG_SEL',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV60FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1225Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV16TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV19TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV20TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFAlbComEst_Sels',fld:'vTFALBCOMEST_SELS',pic:''},{av:'AV62TFAlbComSt_Sels',fld:'vTFALBCOMST_SELS',pic:''},{av:'AV27TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV29TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV30TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV31TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV32TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV59TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV64TFAlbComAT_Sels',fld:'vTFALBCOMAT_SELS',pic:''},{av:'AV37TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV65TFAlbCom4dig',fld:'vTFALBCOM4DIG',pic:''},{av:'AV66TFAlbCom4dig_Sel',fld:'vTFALBCOM4DIG_SEL',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV60FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1325Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV16TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV19TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV20TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFAlbComEst_Sels',fld:'vTFALBCOMEST_SELS',pic:''},{av:'AV62TFAlbComSt_Sels',fld:'vTFALBCOMST_SELS',pic:''},{av:'AV27TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV29TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV30TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV31TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV32TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV59TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV64TFAlbComAT_Sels',fld:'vTFALBCOMAT_SELS',pic:''},{av:'AV37TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV65TFAlbCom4dig',fld:'vTFALBCOM4DIG',pic:''},{av:'AV66TFAlbCom4dig_Sel',fld:'vTFALBCOM4DIG_SEL',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV60FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV65TFAlbCom4dig',fld:'vTFALBCOM4DIG',pic:''},{av:'AV66TFAlbCom4dig_Sel',fld:'vTFALBCOM4DIG_SEL',pic:''},{av:'AV37TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV63TFAlbComAT_SelsJson',fld:'vTFALBCOMAT_SELSJSON',pic:''},{av:'AV64TFAlbComAT_Sels',fld:'vTFALBCOMAT_SELS',pic:''},{av:'AV58TFAlbComEAT_SelsJson',fld:'vTFALBCOMEAT_SELSJSON',pic:''},{av:'AV59TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV31TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV32TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV29TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV30TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV27TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV61TFAlbComSt_SelsJson',fld:'vTFALBCOMST_SELSJSON',pic:''},{av:'AV62TFAlbComSt_Sels',fld:'vTFALBCOMST_SELS',pic:''},{av:'AV56TFAlbComEst_SelsJson',fld:'vTFALBCOMEST_SELSJSON',pic:''},{av:'AV57TFAlbComEst_Sels',fld:'vTFALBCOMEST_SELS',pic:''},{av:'AV19TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV20TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV15TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV16TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2325Y2',iparms:[{av:'cmbAlbComSt'},{av:'A10738AlbComSt',fld:'ALBCOMST',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV45GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtAlbComCod_Columnclass',ctrl:'ALBCOMCOD',prop:'Columnclass'},{av:'edtCliCod_Columnclass',ctrl:'CLICOD',prop:'Columnclass'},{av:'edtCliNom_Columnclass',ctrl:'CLINOM',prop:'Columnclass'},{av:'cmbAlbComEst'},{av:'cmbAlbComSt'},{av:'edtAlbComFch_Columnclass',ctrl:'ALBCOMFCH',prop:'Columnclass'},{av:'edtAlbComHor_Columnclass',ctrl:'ALBCOMHOR',prop:'Columnclass'},{av:'edtAlbComID_Columnclass',ctrl:'ALBCOMID',prop:'Columnclass'},{av:'edtAlbComATCU_Columnclass',ctrl:'ALBCOMATCU',prop:'Columnclass'},{av:'cmbAlbComEAT'},{av:'cmbAlbComAT'},{av:'edtAlbComFs_Columnclass',ctrl:'ALBCOMFS',prop:'Columnclass'},{av:'edtAlbCom4dig_Columnclass',ctrl:'ALBCOM4DIG',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2425Y2',iparms:[{av:'cmbavGridactions'},{av:'AV45GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV16TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV19TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV20TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFAlbComEst_Sels',fld:'vTFALBCOMEST_SELS',pic:''},{av:'AV62TFAlbComSt_Sels',fld:'vTFALBCOMST_SELS',pic:''},{av:'AV27TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV29TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV30TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV31TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV32TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV59TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV64TFAlbComAT_Sels',fld:'vTFALBCOMAT_SELS',pic:''},{av:'AV37TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV65TFAlbCom4dig',fld:'vTFALBCOM4DIG',pic:''},{av:'AV66TFAlbCom4dig_Sel',fld:'vTFALBCOM4DIG_SEL',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV60FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbAlbComEst'},{av:'A16AlbComEst',fld:'ALBCOMEST',pic:'9',hsh:true},{av:'cmbAlbComEAT'},{av:'A10739AlbComEAT',fld:'ALBCOMEAT',pic:'9',hsh:true},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'cmbAlbComSt'},{av:'A10738AlbComSt',fld:'ALBCOMST',pic:'',hsh:true},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV67Cadena',fld:'vCADENA',pic:''},{av:'AV71Hash',fld:'vHASH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV52UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV45GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'Gx_msg',fld:'vMSG',pic:''},{av:'AV71Hash',fld:'vHASH',pic:''},{av:'AV67Cadena',fld:'vCADENA',pic:''},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'A22AlbComPri',fld:'ALBCOMPRI',pic:'9'},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A17AlbComFch',fld:'ALBCOMFCH',pic:''},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50Station',fld:'vSTATION',pic:''},{av:'AV52UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtAlbComCod_Columnheaderclass',ctrl:'ALBCOMCOD',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'cmbAlbComEst'},{av:'cmbAlbComSt'},{av:'edtAlbComFch_Columnheaderclass',ctrl:'ALBCOMFCH',prop:'Columnheaderclass'},{av:'edtAlbComHor_Columnheaderclass',ctrl:'ALBCOMHOR',prop:'Columnheaderclass'},{av:'edtAlbComID_Columnheaderclass',ctrl:'ALBCOMID',prop:'Columnheaderclass'},{av:'edtAlbComATCU_Columnheaderclass',ctrl:'ALBCOMATCU',prop:'Columnheaderclass'},{av:'cmbAlbComEAT'},{av:'cmbAlbComAT'},{av:'edtAlbComFs_Columnheaderclass',ctrl:'ALBCOMFS',prop:'Columnheaderclass'},{av:'edtAlbCom4dig_Columnheaderclass',ctrl:'ALBCOM4DIG',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1425Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'AV49EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV15TFAlbComCod',fld:'vTFALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV16TFAlbComCod_To',fld:'vTFALBCOMCOD_TO',pic:'ZZZZZZZ9'},{av:'AV19TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV20TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV57TFAlbComEst_Sels',fld:'vTFALBCOMEST_SELS',pic:''},{av:'AV62TFAlbComSt_Sels',fld:'vTFALBCOMST_SELS',pic:''},{av:'AV27TFAlbComHor',fld:'vTFALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'AV29TFAlbComID',fld:'vTFALBCOMID',pic:''},{av:'AV30TFAlbComID_Sel',fld:'vTFALBCOMID_SEL',pic:''},{av:'AV31TFAlbComATCUD',fld:'vTFALBCOMATCUD',pic:''},{av:'AV32TFAlbComATCUD_Sel',fld:'vTFALBCOMATCUD_SEL',pic:''},{av:'AV59TFAlbComEAT_Sels',fld:'vTFALBCOMEAT_SELS',pic:''},{av:'AV64TFAlbComAT_Sels',fld:'vTFALBCOMAT_SELS',pic:''},{av:'AV37TFAlbComFs',fld:'vTFALBCOMFS',pic:'99/99/99 99:99:99'},{av:'AV65TFAlbCom4dig',fld:'vTFALBCOM4DIG',pic:''},{av:'AV66TFAlbCom4dig_Sel',fld:'vTFALBCOM4DIG_SEL',pic:''},{av:'AV87Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV84AlbProPri',fld:'vALBPROPRI',pic:'9',hsh:true},{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV60FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtAlbComCod_Columnheaderclass',ctrl:'ALBCOMCOD',prop:'Columnheaderclass'},{av:'edtCliCod_Columnheaderclass',ctrl:'CLICOD',prop:'Columnheaderclass'},{av:'edtCliNom_Columnheaderclass',ctrl:'CLINOM',prop:'Columnheaderclass'},{av:'cmbAlbComEst'},{av:'cmbAlbComSt'},{av:'edtAlbComFch_Columnheaderclass',ctrl:'ALBCOMFCH',prop:'Columnheaderclass'},{av:'edtAlbComHor_Columnheaderclass',ctrl:'ALBCOMHOR',prop:'Columnheaderclass'},{av:'edtAlbComID_Columnheaderclass',ctrl:'ALBCOMID',prop:'Columnheaderclass'},{av:'edtAlbComATCU_Columnheaderclass',ctrl:'ALBCOMATCU',prop:'Columnheaderclass'},{av:'cmbAlbComEAT'},{av:'cmbAlbComAT'},{av:'edtAlbComFs_Columnheaderclass',ctrl:'ALBCOMFS',prop:'Columnheaderclass'},{av:'edtAlbCom4dig_Columnheaderclass',ctrl:'ALBCOM4DIG',prop:'Columnheaderclass'}]}");
      setEventMetadata("VPRIORIDAD.CONTROLVALUECHANGED","{handler:'e1525Y2',iparms:[{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''}]");
      setEventMetadata("VPRIORIDAD.CONTROLVALUECHANGED",",oparms:[{av:'AV47ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''}]}");
      setEventMetadata("VALBCOMCOD.CONTROLVALUECHANGED","{handler:'e1625Y2',iparms:[{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBCOMCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''}]}");
      setEventMetadata("VALBCOMSTIN.CONTROLVALUECHANGED","{handler:'e1725Y2',iparms:[{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBCOMSTIN.CONTROLVALUECHANGED",",oparms:[{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''}]}");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED","{handler:'e1825Y2',iparms:[{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''}]}");
      setEventMetadata("VALBCOMFCHFROM.CONTROLVALUECHANGED","{handler:'e1925Y2',iparms:[{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBCOMFCHFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''}]}");
      setEventMetadata("VALBCOMFCHTO.CONTROLVALUECHANGED","{handler:'e2025Y2',iparms:[{av:'AV74Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''},{av:'AV73AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'cmbavAlbcomstin'},{av:'AV81AlbComStIN',fld:'vALBCOMSTIN',pic:''},{av:'AV75Albcomfchfrom',fld:'vALBCOMFCHFROM',pic:''},{av:'AV76Albcomfchto',fld:'vALBCOMFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV48Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBCOMFCHTO.CONTROLVALUECHANGED",",oparms:[{av:'AV82Filterdocumentotransportecomercial_cabeceraww',fld:'vFILTERDOCUMENTOTRANSPORTECOMERCIAL_CABECERAWW',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBCOMFD","{handler:'valid_Albcomfd',iparms:[]");
      setEventMetadata("VALID_ALBCOMFD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcompri',iparms:[]");
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
      wcpOAV84AlbProPri = "" ;
      wcpOAV47ContCod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV84AlbProPri = "" ;
      AV47ContCod = "" ;
      AV48Prioridad = "" ;
      AV81AlbComStIN = "" ;
      AV75Albcomfchfrom = GXutil.nullDate() ;
      AV76Albcomfchto = GXutil.nullDate() ;
      AV49EmprCod = "" ;
      AV19TFCliNom = "" ;
      AV20TFCliNom_Sel = "" ;
      AV57TFAlbComEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV62TFAlbComSt_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27TFAlbComHor = GXutil.resetTime( GXutil.nullDate() );
      AV29TFAlbComID = "" ;
      AV30TFAlbComID_Sel = "" ;
      AV31TFAlbComATCUD = "" ;
      AV32TFAlbComATCUD_Sel = "" ;
      AV59TFAlbComEAT_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV64TFAlbComAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV37TFAlbComFs = GXutil.resetTime( GXutil.nullDate() );
      AV65TFAlbCom4dig = "" ;
      AV66TFAlbCom4dig_Sel = "" ;
      AV87Pgmname = "" ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV67Cadena = "" ;
      AV71Hash = "" ;
      AV52UsurCod = "" ;
      AV50Station = "" ;
      Gx_msg = "" ;
      AV82Filterdocumentotransportecomercial_cabeceraww = new app.documentotransportecomercial.SdtFilterdocumentotransportecomercial_cabeceraww(remoteHandle, context);
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
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV28DDO_AlbComHorAuxDate = GXutil.nullDate() ;
      AV38DDO_AlbComFsAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A279CliNom = "" ;
      A10738AlbComSt = "" ;
      A17AlbComFch = GXutil.nullDate() ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10740AlbComID = "" ;
      A14248AlbComATCU = "" ;
      A10764AlbComAT = "" ;
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10014AlbComFd = "" ;
      A14374AlbCom4dig = "" ;
      A22AlbComPri = "" ;
      AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = "" ;
      lV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = "" ;
      lV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = "" ;
      lV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = "" ;
      AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel = "" ;
      AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom = "" ;
      AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor = GXutil.resetTime( GXutil.nullDate() );
      AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel = "" ;
      AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid = "" ;
      AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel = "" ;
      AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud = "" ;
      AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs = GXutil.resetTime( GXutil.nullDate() );
      AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel = "" ;
      AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig = "" ;
      A396EmprCod = "" ;
      H025Y2_A396EmprCod = new String[] {""} ;
      H025Y2_A22AlbComPri = new String[] {""} ;
      H025Y2_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      H025Y2_A10764AlbComAT = new String[] {""} ;
      H025Y2_A10739AlbComEAT = new byte[1] ;
      H025Y2_A14248AlbComATCU = new String[] {""} ;
      H025Y2_A10740AlbComID = new String[] {""} ;
      H025Y2_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      H025Y2_A17AlbComFch = new java.util.Date[] {GXutil.nullDate()} ;
      H025Y2_A10738AlbComSt = new String[] {""} ;
      H025Y2_A16AlbComEst = new byte[1] ;
      H025Y2_A279CliNom = new String[] {""} ;
      H025Y2_A252CliCod = new int[1] ;
      H025Y2_A14AlbComCod = new int[1] ;
      H025Y2_A10014AlbComFd = new String[] {""} ;
      H025Y3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV51EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV56TFAlbComEst_SelsJson = "" ;
      AV61TFAlbComSt_SelsJson = "" ;
      AV58TFAlbComEAT_SelsJson = "" ;
      AV63TFAlbComAT_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV68firma = "" ;
      AV70Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message10 = new GXBaseCollection[1] ;
      GXv_boolean11 = new boolean[1] ;
      AV72Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXv_int12 = new int[1] ;
      GXv_int13 = new short[1] ;
      AV14Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char19 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV83WebSession = httpContext.getWebSession();
      bttBtninsert_Jsonclick = "" ;
      lblTextblockprioridad_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransportecomercial.documentotransportecomercial_cabeceraww__default(),
         new Object[] {
             new Object[] {
            H025Y2_A396EmprCod, H025Y2_A22AlbComPri, H025Y2_A10013AlbComFs, H025Y2_A10764AlbComAT, H025Y2_A10739AlbComEAT, H025Y2_A14248AlbComATCU, H025Y2_A10740AlbComID, H025Y2_A4829AlbComHor, H025Y2_A17AlbComFch, H025Y2_A10738AlbComSt,
            H025Y2_A16AlbComEst, H025Y2_A279CliNom, H025Y2_A252CliCod, H025Y2_A14AlbComCod, H025Y2_A10014AlbComFd
            }
            , new Object[] {
            H025Y3_AGRID_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV87Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV87Pgmname = "DocumentoTransporteComercial.DocumentoTransporteComercial_CabeceraWW" ;
      Gx_err = (short)(0) ;
      cmbavPrioridad.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A16AlbComEst ;
   private byte A10739AlbComEAT ;
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
   private short AV12OrderedBy ;
   private short AV60FirmaD ;
   private short wbEnd ;
   private short wbStart ;
   private short AV45GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int13[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_62 ;
   private int nGXsfl_62_idx=1 ;
   private int AV73AlbComCod ;
   private int AV74Clicod ;
   private int AV15TFAlbComCod ;
   private int AV16TFAlbComCod_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbcomcod_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavAlbcomfchfrom_Enabled ;
   private int edtavAlbcomfchto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A14AlbComCod ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ;
   private int AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ;
   private int AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ;
   private int AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ;
   private int AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ;
   private int AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ;
   private int AV42PageToGo ;
   private int AV106GXV1 ;
   private int GXv_int12[] ;
   private int AV107GXV2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV43GridCurrentPage ;
   private long AV44GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV84AlbProPri ;
   private String wcpOAV47ContCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV84AlbProPri ;
   private String AV47ContCod ;
   private String sGXsfl_62_idx="0001" ;
   private String AV48Prioridad ;
   private String AV81AlbComStIN ;
   private String AV49EmprCod ;
   private String AV19TFCliNom ;
   private String AV20TFCliNom_Sel ;
   private String AV29TFAlbComID ;
   private String AV30TFAlbComID_Sel ;
   private String AV31TFAlbComATCUD ;
   private String AV32TFAlbComATCUD_Sel ;
   private String AV65TFAlbCom4dig ;
   private String AV66TFAlbCom4dig_Sel ;
   private String AV87Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV52UsurCod ;
   private String AV50Station ;
   private String Gx_msg ;
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
   private String edtavAlbcomcod_Internalname ;
   private String TempTags ;
   private String edtavAlbcomcod_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavAlbcomfchfrom_Internalname ;
   private String edtavAlbcomfchfrom_Jsonclick ;
   private String edtavAlbcomfchto_Internalname ;
   private String edtavAlbcomfchto_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
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
   private String divDdo_albcomhorauxdates_Internalname ;
   private String edtavDdo_albcomhorauxdate_Internalname ;
   private String edtavDdo_albcomhorauxdate_Jsonclick ;
   private String divDdo_albcomfsauxdates_Internalname ;
   private String edtavDdo_albcomfsauxdate_Internalname ;
   private String edtavDdo_albcomfsauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbComCod_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A10738AlbComSt ;
   private String edtAlbComFch_Internalname ;
   private String edtAlbComHor_Internalname ;
   private String A10740AlbComID ;
   private String edtAlbComID_Internalname ;
   private String A14248AlbComATCU ;
   private String edtAlbComATCU_Internalname ;
   private String A10764AlbComAT ;
   private String edtAlbComFs_Internalname ;
   private String A10014AlbComFd ;
   private String edtAlbComFd_Internalname ;
   private String A14374AlbCom4dig ;
   private String edtAlbCom4dig_Internalname ;
   private String A22AlbComPri ;
   private String edtAlbComPri_Internalname ;
   private String scmdbuf ;
   private String lV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ;
   private String lV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ;
   private String lV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ;
   private String lV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ;
   private String AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ;
   private String AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ;
   private String AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ;
   private String AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ;
   private String AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ;
   private String AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ;
   private String AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ;
   private String AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV51EmprNom ;
   private String edtAlbComCod_Columnheaderclass ;
   private String edtCliCod_Columnheaderclass ;
   private String edtCliNom_Columnheaderclass ;
   private String edtAlbComFch_Columnheaderclass ;
   private String edtAlbComHor_Columnheaderclass ;
   private String edtAlbComID_Columnheaderclass ;
   private String edtAlbComATCU_Columnheaderclass ;
   private String edtAlbComFs_Columnheaderclass ;
   private String edtAlbCom4dig_Columnheaderclass ;
   private String edtAlbComCod_Columnclass ;
   private String edtCliCod_Columnclass ;
   private String edtCliNom_Columnclass ;
   private String edtAlbComFch_Columnclass ;
   private String edtAlbComHor_Columnclass ;
   private String edtAlbComID_Columnclass ;
   private String edtAlbComATCU_Columnclass ;
   private String edtAlbComFs_Columnclass ;
   private String edtAlbCom4dig_Columnclass ;
   private String GXt_char1 ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char19 ;
   private String GXv_char15[] ;
   private String GXt_char18 ;
   private String GXv_char14[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String tblTablerightheader_Internalname ;
   private String tblTablemergedactiongroup_actions_Internalname ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String divUnnamedtableprioridad_Internalname ;
   private String lblTextblockprioridad_Internalname ;
   private String lblTextblockprioridad_Jsonclick ;
   private String sGXsfl_62_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbComCod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbComFch_Jsonclick ;
   private String edtAlbComHor_Jsonclick ;
   private String edtAlbComID_Jsonclick ;
   private String edtAlbComATCU_Jsonclick ;
   private String edtAlbComFs_Jsonclick ;
   private String edtAlbComFd_Jsonclick ;
   private String edtAlbCom4dig_Jsonclick ;
   private String edtAlbComPri_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV27TFAlbComHor ;
   private java.util.Date AV37TFAlbComFs ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ;
   private java.util.Date AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ;
   private java.util.Date AV75Albcomfchfrom ;
   private java.util.Date AV76Albcomfchto ;
   private java.util.Date Gx_date ;
   private java.util.Date AV28DDO_AlbComHorAuxDate ;
   private java.util.Date AV38DDO_AlbComFsAuxDate ;
   private java.util.Date A17AlbComFch ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_62_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV69ok ;
   private boolean GXv_boolean11[] ;
   private String AV56TFAlbComEst_SelsJson ;
   private String AV61TFAlbComSt_SelsJson ;
   private String AV58TFAlbComEAT_SelsJson ;
   private String AV63TFAlbComAT_SelsJson ;
   private String AV67Cadena ;
   private String AV71Hash ;
   private String AV68firma ;
   private GXSimpleCollection<Byte> AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ;
   private GXSimpleCollection<Byte> AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ;
   private GXSimpleCollection<Byte> AV57TFAlbComEst_Sels ;
   private GXSimpleCollection<Byte> AV59TFAlbComEAT_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.WebSession AV83WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ;
   private GXSimpleCollection<String> AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ;
   private HTMLChoice cmbavPrioridad ;
   private HTMLChoice cmbavAlbcomstin ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbComEst ;
   private HTMLChoice cmbAlbComSt ;
   private HTMLChoice cmbAlbComEAT ;
   private HTMLChoice cmbAlbComAT ;
   private IDataStoreProvider pr_default ;
   private String[] H025Y2_A396EmprCod ;
   private String[] H025Y2_A22AlbComPri ;
   private java.util.Date[] H025Y2_A10013AlbComFs ;
   private String[] H025Y2_A10764AlbComAT ;
   private byte[] H025Y2_A10739AlbComEAT ;
   private String[] H025Y2_A14248AlbComATCU ;
   private String[] H025Y2_A10740AlbComID ;
   private java.util.Date[] H025Y2_A4829AlbComHor ;
   private java.util.Date[] H025Y2_A17AlbComFch ;
   private String[] H025Y2_A10738AlbComSt ;
   private byte[] H025Y2_A16AlbComEst ;
   private String[] H025Y2_A279CliNom ;
   private int[] H025Y2_A252CliCod ;
   private int[] H025Y2_A14AlbComCod ;
   private String[] H025Y2_A10014AlbComFd ;
   private long[] H025Y3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV62TFAlbComSt_Sels ;
   private GXSimpleCollection<String> AV64TFAlbComAT_Sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV70Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message10[] ;
   private com.genexus.SdtMessages_Message AV72Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.documentotransportecomercial.SdtFilterdocumentotransportecomercial_cabeceraww AV82Filterdocumentotransportecomercial_cabeceraww ;
}

final  class documentotransportecomercial_cabeceraww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H025Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                          String A10738AlbComSt ,
                                          GXSimpleCollection<String> AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                          String A10764AlbComAT ,
                                          GXSimpleCollection<String> AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                          int AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ,
                                          int AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ,
                                          String AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                          String AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                          int AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ,
                                          int AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ,
                                          java.util.Date AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                          String AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                          String AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                          String AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                          String AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                          int AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ,
                                          int AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ,
                                          java.util.Date AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                          String AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                          String AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                          int AV73AlbComCod ,
                                          int AV74Clicod ,
                                          java.util.Date AV75Albcomfchfrom ,
                                          java.util.Date AV76Albcomfchto ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A14248AlbComATCU ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10014AlbComFd ,
                                          int A252CliCod ,
                                          java.util.Date A17AlbComFch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A22AlbComPri ,
                                          String AV48Prioridad ,
                                          String AV81AlbComStIN ,
                                          String AV49EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[25];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.AlbComPri, T1.AlbComFs, T1.AlbComAT, T1.AlbComEAT, T1.AlbComATCU, T1.AlbComID, T1.AlbComHor, T1.AlbComFch, T1.AlbComSt, T1.AlbComEst, T2.CliNom," ;
      sSelectString += " T1.CliCod, T1.AlbComCod, T1.AlbComFd" ;
      sFromString = " FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      addWhere(sWhereString, "(T1.AlbComSt = ? or ? = 'T')");
      if ( ! (0==AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (0==AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels, "T1.AlbComSt IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels, "T1.AlbComAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1) = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (0==AV73AlbComCod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (0==AV74Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Albcomfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Albcomfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbComCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComCod DESC" ;
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
         sOrderString += " ORDER BY T1.AlbComEst" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComSt" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComSt DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFch" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComHor" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComHor DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComID" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComID DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComATCU" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComATCU DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComEAT" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComEAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComAT" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbComFs" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbComFs DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbComCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H025Y3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A16AlbComEst ,
                                          GXSimpleCollection<Byte> AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels ,
                                          String A10738AlbComSt ,
                                          GXSimpleCollection<String> AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels ,
                                          byte A10739AlbComEAT ,
                                          GXSimpleCollection<Byte> AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels ,
                                          String A10764AlbComAT ,
                                          GXSimpleCollection<String> AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels ,
                                          int AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod ,
                                          int AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to ,
                                          String AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel ,
                                          String AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom ,
                                          int AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size ,
                                          int AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size ,
                                          java.util.Date AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor ,
                                          String AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel ,
                                          String AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid ,
                                          String AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel ,
                                          String AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud ,
                                          int AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size ,
                                          int AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size ,
                                          java.util.Date AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs ,
                                          String AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel ,
                                          String AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig ,
                                          int AV73AlbComCod ,
                                          int AV74Clicod ,
                                          java.util.Date AV75Albcomfchfrom ,
                                          java.util.Date AV76Albcomfchto ,
                                          int A14AlbComCod ,
                                          String A279CliNom ,
                                          java.util.Date A4829AlbComHor ,
                                          String A10740AlbComID ,
                                          String A14248AlbComATCU ,
                                          java.util.Date A10013AlbComFs ,
                                          String A10014AlbComFd ,
                                          int A252CliCod ,
                                          java.util.Date A17AlbComFch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A22AlbComPri ,
                                          String AV48Prioridad ,
                                          String AV81AlbComStIN ,
                                          String AV49EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[21];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCALCOM T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      addWhere(sWhereString, "(T1.AlbComPri = ?)");
      addWhere(sWhereString, "(T1.AlbComSt = ? or ? = 'T')");
      if ( ! (0==AV89Documentotransportecomercial_documentotransportecomercial_cabecerawwds_1_tfalbcomcod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod >= ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (0==AV90Documentotransportecomercial_documentotransportecomercial_cabecerawwds_2_tfalbcomcod_to) )
      {
         addWhere(sWhereString, "(T1.AlbComCod <= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV91Documentotransportecomercial_documentotransportecomercial_cabecerawwds_3_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Documentotransportecomercial_documentotransportecomercial_cabecerawwds_4_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV93Documentotransportecomercial_documentotransportecomercial_cabecerawwds_5_tfalbcomest_sels, "T1.AlbComEst IN (", ")")+")");
      }
      if ( AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV94Documentotransportecomercial_documentotransportecomercial_cabecerawwds_6_tfalbcomst_sels, "T1.AlbComSt IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV95Documentotransportecomercial_documentotransportecomercial_cabecerawwds_7_tfalbcomhor) )
      {
         addWhere(sWhereString, "(T1.AlbComHor >= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) && ( ! (GXutil.strcmp("", AV96Documentotransportecomercial_documentotransportecomercial_cabecerawwds_8_tfalbcomid)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComID) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV97Documentotransportecomercial_documentotransportecomercial_cabecerawwds_9_tfalbcomid_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComID = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) && ( ! (GXutil.strcmp("", AV98Documentotransportecomercial_documentotransportecomercial_cabecerawwds_10_tfalbcomatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbComATCU) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV99Documentotransportecomercial_documentotransportecomercial_cabecerawwds_11_tfalbcomatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbComATCU = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV100Documentotransportecomercial_documentotransportecomercial_cabecerawwds_12_tfalbcomeat_sels, "T1.AlbComEAT IN (", ")")+")");
      }
      if ( AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV101Documentotransportecomercial_documentotransportecomercial_cabecerawwds_13_tfalbcomat_sels, "T1.AlbComAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV102Documentotransportecomercial_documentotransportecomercial_cabecerawwds_14_tfalbcomfs) )
      {
         addWhere(sWhereString, "(T1.AlbComFs >= ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) && ( ! (GXutil.strcmp("", AV103Documentotransportecomercial_documentotransportecomercial_cabecerawwds_15_tfalbcom4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Documentotransportecomercial_documentotransportecomercial_cabecerawwds_16_tfalbcom4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbComFd, 1, 1) || SUBSTR(T1.AlbComFd, 11, 1) || SUBSTR(T1.AlbComFd, 21, 1) || SUBSTR(T1.AlbComFd, 31, 1) = ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( ! (0==AV73AlbComCod) )
      {
         addWhere(sWhereString, "(T1.AlbComCod = ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( ! (0==AV74Clicod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75Albcomfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch >= ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76Albcomfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbComFch <= ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
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
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H025Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] );
            case 1 :
                  return conditional_H025Y3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , ((Number) dynConstraints[4]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[5] , (String)dynConstraints[6] , (GXSimpleCollection<String>)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).intValue() , (java.util.Date)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , ((Number) dynConstraints[20]).intValue() , (java.util.Date)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).intValue() , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , (String)dynConstraints[29] , (java.util.Date)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , ((Number) dynConstraints[35]).intValue() , (java.util.Date)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Boolean) dynConstraints[38]).booleanValue() , (String)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H025Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H025Y3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 20);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 30);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 200);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[33], false);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[38], false);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[30], false);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 20);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[35], false);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 4);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 4);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[40]);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[41]);
               }
               return;
      }
   }

}

