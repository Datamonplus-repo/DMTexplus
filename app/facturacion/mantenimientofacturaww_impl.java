package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mantenimientofacturaww_impl extends GXDataArea
{
   public mantenimientofacturaww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mantenimientofacturaww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mantenimientofacturaww_impl.class ));
   }

   public mantenimientofacturaww_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbFacEst = new HTMLChoice();
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
      nRC_GXsfl_48 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_48"))) ;
      nGXsfl_48_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_48_idx"))) ;
      sGXsfl_48_idx = httpContext.GetPar( "sGXsfl_48_idx") ;
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
      AV84FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
      AV83CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV85FacFchFrom = localUtil.parseDateParm( httpContext.GetPar( "FacFchFrom")) ;
      AV86FacFchTo = localUtil.parseDateParm( httpContext.GetPar( "FacFchTo")) ;
      AV87FacPri = httpContext.GetPar( "FacPri") ;
      AV81EmprCod = httpContext.GetPar( "EmprCod") ;
      AV36TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV37TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV43TFFacImpTot = CommonUtil.decimalVal( httpContext.GetPar( "TFFacImpTot"), ".") ;
      AV44TFFacImpTot_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacImpTot_To"), ".") ;
      AV45TFFacImpPP = CommonUtil.decimalVal( httpContext.GetPar( "TFFacImpPP"), ".") ;
      AV46TFFacImpPP_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacImpPP_To"), ".") ;
      AV47TFFacBasImp = CommonUtil.decimalVal( httpContext.GetPar( "TFFacBasImp"), ".") ;
      AV48TFFacBasImp_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacBasImp_To"), ".") ;
      AV49TFFacIVAImp = CommonUtil.decimalVal( httpContext.GetPar( "TFFacIVAImp"), ".") ;
      AV50TFFacIVAImp_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacIVAImp_To"), ".") ;
      AV51TFFacTot = CommonUtil.decimalVal( httpContext.GetPar( "TFFacTot"), ".") ;
      AV52TFFacTot_To = CommonUtil.decimalVal( httpContext.GetPar( "TFFacTot_To"), ".") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV78TFFacEst_Sels);
      AV116Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV57TotFacImpTot = CommonUtil.decimalVal( httpContext.GetPar( "TotFacImpTot"), ".") ;
      AV59TotFacImpPP = CommonUtil.decimalVal( httpContext.GetPar( "TotFacImpPP"), ".") ;
      AV61TotFacBasImp = CommonUtil.decimalVal( httpContext.GetPar( "TotFacBasImp"), ".") ;
      AV63TotFacIVAImp = CommonUtil.decimalVal( httpContext.GetPar( "TotFacIVAImp"), ".") ;
      AV65TotFacTot = CommonUtil.decimalVal( httpContext.GetPar( "TotFacTot"), ".") ;
      AV74FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      A9606FacHor = localUtil.parseDTimeParm( httpContext.GetPar( "FacHor")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV84FacCod, AV83CliCod, AV85FacFchFrom, AV86FacFchTo, AV87FacPri, AV81EmprCod, AV36TFCliNom, AV37TFCliNom_Sel, AV43TFFacImpTot, AV44TFFacImpTot_To, AV45TFFacImpPP, AV46TFFacImpPP_To, AV47TFFacBasImp, AV48TFFacBasImp_To, AV49TFFacIVAImp, AV50TFFacIVAImp_To, AV51TFFacTot, AV52TFFacTot_To, AV78TFFacEst_Sels, AV116Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotFacImpTot, AV59TotFacImpPP, AV61TotFacBasImp, AV63TotFacIVAImp, AV65TotFacTot, AV74FirmaD, Gx_date, A9606FacHor) ;
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
      pa1ZH2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1ZH2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.mantenimientofacturaww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPTOT", getSecureSignedToken( "", localUtil.format( AV57TotFacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV59TotFacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV61TotFacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV63TotFacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV65TotFacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACHOR", getSecureSignedToken( "", localUtil.format( A9606FacHor, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoFacturaWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV116Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\mantenimientofacturaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFACCOD", GXutil.ltrim( localUtil.ntoc( AV84FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV83CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFACFCHFROM", localUtil.format(AV85FacFchFrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFACFCHTO", localUtil.format(AV86FacFchTo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFACPRI", GXutil.rtrim( AV87FacPri));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_48", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_48, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV36TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV37TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIMPTOT", GXutil.ltrim( localUtil.ntoc( AV43TFFacImpTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIMPTOT_TO", GXutil.ltrim( localUtil.ntoc( AV44TFFacImpTot_To, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIMPPP", GXutil.ltrim( localUtil.ntoc( AV45TFFacImpPP, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIMPPP_TO", GXutil.ltrim( localUtil.ntoc( AV46TFFacImpPP_To, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBASIMP", GXutil.ltrim( localUtil.ntoc( AV47TFFacBasImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACBASIMP_TO", GXutil.ltrim( localUtil.ntoc( AV48TFFacBasImp_To, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV49TFFacIVAImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACIVAIMP_TO", GXutil.ltrim( localUtil.ntoc( AV50TFFacIVAImp_To, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACTOT", GXutil.ltrim( localUtil.ntoc( AV51TFFacTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFACTOT_TO", GXutil.ltrim( localUtil.ntoc( AV52TFFacTot_To, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFFACEST_SELS", AV78TFFacEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFFACEST_SELS", AV78TFFacEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV81EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIMPTOT", GXutil.ltrim( localUtil.ntoc( AV57TotFacImpTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPTOT", getSecureSignedToken( "", localUtil.format( AV57TotFacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIMPPP", GXutil.ltrim( localUtil.ntoc( AV59TotFacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV59TotFacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACBASIMP", GXutil.ltrim( localUtil.ntoc( AV61TotFacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV61TotFacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV63TotFacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV63TotFacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACTOT", GXutil.ltrim( localUtil.ntoc( AV65TotFacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV65TotFacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV74FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPFACCOD", GXutil.ltrim( localUtil.ntoc( AV111pFacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPCLICOD", GXutil.ltrim( localUtil.ntoc( AV110pCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPINIFACFCH", localUtil.dtoc( AV112pIniFacFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "FACHOR", localUtil.ttoc( A9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACHOR", getSecureSignedToken( "", localUtil.format( A9606FacHor, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERMANTENIMIENTOFACTURA_SDT", AV88FilterMantenimientoFactura_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERMANTENIMIENTOFACTURA_SDT", AV88FilterMantenimientoFactura_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECICA", GXutil.ltrim( localUtil.ntoc( A11513FacRecIca, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA1", GXutil.ltrim( localUtil.ntoc( A11514FacImpIca1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPICA", GXutil.ltrim( localUtil.ntoc( A11515FacImpIca, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECI", GXutil.ltrim( localUtil.ntoc( A8346FacRecI, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI1", GXutil.ltrim( localUtil.ntoc( A8348FacImpReI1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COLOMBIA", GXutil.ltrim( localUtil.ntoc( A7209Colombia, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPREI", GXutil.ltrim( localUtil.ntoc( A8347FacImpReI, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECT", GXutil.ltrim( localUtil.ntoc( A7212FacRect, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET1", GXutil.ltrim( localUtil.ntoc( A7214FacImpRet1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPRET", GXutil.ltrim( localUtil.ntoc( A7213FacImpRet, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECPOR", GXutil.ltrim( localUtil.ntoc( A453FacRECPor, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP1", GXutil.ltrim( localUtil.ntoc( A3922FacRecImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACRECIMP", GXutil.ltrim( localUtil.ntoc( A452FacRecImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVAPOR", GXutil.ltrim( localUtil.ntoc( A443FacIVAPor, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIVAIMP1", GXutil.ltrim( localUtil.ntoc( A3921FacIvaImp1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTMTS", GXutil.ltrim( localUtil.ntoc( A14222FacCostMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTKGS", GXutil.ltrim( localUtil.ntoc( A14223FacCostKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTFAC", GXutil.ltrim( localUtil.ntoc( A14224FacCostFac, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENG", GXutil.ltrim( localUtil.ntoc( A14221FacCostEng, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOSTENE", GXutil.ltrim( localUtil.ntoc( A14220FacCostEne, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPTOT1", GXutil.ltrim( localUtil.ntoc( A3918FacImpTot1, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACDTOGEN", GXutil.ltrim( localUtil.ntoc( A433FacDtoGen, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPGEN1", GXutil.ltrim( localUtil.ntoc( A3919FacImpGen1, (byte)(12), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACIMPGEN", GXutil.ltrim( localUtil.ntoc( A439FacImpGen, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we1ZH2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1ZH2( ) ;
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
      return formatLink("app.facturacion.mantenimientofacturaww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.MantenimientoFacturaWW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Mantenimiento Factura", "") ;
   }

   public void wb1ZH0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFaccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFaccod_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFaccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV84FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFaccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84FacCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV84FacCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFaccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFaccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV83CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfchfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfchfrom_Internalname, localUtil.format(AV85FacFchFrom, "99/99/99"), localUtil.format( AV85FacFchFrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacfchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacfchto_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFacfchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacfchto_Internalname, localUtil.format(AV86FacFchTo, "99/99/99"), localUtil.format( AV86FacFchTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacfchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacfchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFacfchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFacfchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacpri_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacpri_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacpri_Internalname, GXutil.rtrim( AV87FacPri), GXutil.rtrim( localUtil.format( AV87FacPri, "9")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacpri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacpri_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_37_1ZH2( true) ;
      }
      else
      {
         wb_table1_37_1ZH2( false) ;
      }
      return  ;
   }

   public void wb_table1_37_1ZH2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol48( ) ;
      }
      if ( wbEnd == 48 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_48 = (int)(nGXsfl_48_idx-1) ;
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
         wb_table2_67_1ZH2( true) ;
      }
      else
      {
         wb_table2_67_1ZH2( false) ;
      }
      return  ;
   }

   public void wb_table2_67_1ZH2e( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV116Pgmname), GXutil.rtrim( localUtil.format( AV116Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
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
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 48 )
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

   public void start1ZH2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Mantenimiento Factura", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1ZH0( ) ;
   }

   public void ws1ZH2( )
   {
      start1ZH2( ) ;
      evt1ZH2( ) ;
   }

   public void evt1ZH2( )
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
                           e111ZH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121ZH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131ZH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACPRI.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141ZH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151ZH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCLICOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e161ZH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACFCHFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e171ZH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACFCHTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e181ZH2 ();
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
                           nGXsfl_48_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_482( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV42GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
                           A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A436FacFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtFacFch_Internalname), 0)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A450FacPri = httpContext.cgiGet( edtFacPri_Internalname) ;
                           A441FacImpTot = localUtil.ctond( httpContext.cgiGet( edtFacImpTot_Internalname)) ;
                           n441FacImpTot = false ;
                           A440FacImpPP = localUtil.ctond( httpContext.cgiGet( edtFacImpPP_Internalname)) ;
                           n440FacImpPP = false ;
                           A429FacBasImp = localUtil.ctond( httpContext.cgiGet( edtFacBasImp_Internalname)) ;
                           A442FacIVAImp = localUtil.ctond( httpContext.cgiGet( edtFacIVAImp_Internalname)) ;
                           A455FacTot = localUtil.ctond( httpContext.cgiGet( edtFacTot_Internalname)) ;
                           A7210FacObs = httpContext.cgiGet( edtFacObs_Internalname) ;
                           A1153FacTipFac = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacTipFac_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           cmbFacEst.setName( cmbFacEst.getInternalname() );
                           cmbFacEst.setValue( httpContext.cgiGet( cmbFacEst.getInternalname()) );
                           A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
                           A965FacCob = httpContext.cgiGet( edtFacCob_Internalname) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e191ZH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e201ZH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e211ZH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e221ZH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Faccod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV84FacCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83CliCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Facfchfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vFACFCHFROM"), 0), AV85FacFchFrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Facfchto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vFACFCHTO"), 0), AV86FacFchTo) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Facpri Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFACPRI"), AV87FacPri) != 0 )
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

   public void we1ZH2( )
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

   public void pa1ZH2( )
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
            GX_FocusControl = edtavFaccod_Internalname ;
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
      subsflControlProps_482( ) ;
      while ( nGXsfl_48_idx <= nRC_GXsfl_48 )
      {
         sendrow_482( ) ;
         nGXsfl_48_idx = ((subGrid_Islastpage==1)&&(nGXsfl_48_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV84FacCod ,
                                 int AV83CliCod ,
                                 java.util.Date AV85FacFchFrom ,
                                 java.util.Date AV86FacFchTo ,
                                 String AV87FacPri ,
                                 String AV81EmprCod ,
                                 String AV36TFCliNom ,
                                 String AV37TFCliNom_Sel ,
                                 java.math.BigDecimal AV43TFFacImpTot ,
                                 java.math.BigDecimal AV44TFFacImpTot_To ,
                                 java.math.BigDecimal AV45TFFacImpPP ,
                                 java.math.BigDecimal AV46TFFacImpPP_To ,
                                 java.math.BigDecimal AV47TFFacBasImp ,
                                 java.math.BigDecimal AV48TFFacBasImp_To ,
                                 java.math.BigDecimal AV49TFFacIVAImp ,
                                 java.math.BigDecimal AV50TFFacIVAImp_To ,
                                 java.math.BigDecimal AV51TFFacTot ,
                                 java.math.BigDecimal AV52TFFacTot_To ,
                                 GXSimpleCollection<Byte> AV78TFFacEst_Sels ,
                                 String AV116Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV57TotFacImpTot ,
                                 java.math.BigDecimal AV59TotFacImpPP ,
                                 java.math.BigDecimal AV61TotFacBasImp ,
                                 java.math.BigDecimal AV63TotFacIVAImp ,
                                 java.math.BigDecimal AV65TotFacTot ,
                                 short AV74FirmaD ,
                                 java.util.Date Gx_date ,
                                 java.util.Date A9606FacHor )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201ZH2 ();
      GRID_nCurrentRecord = 0 ;
      rf1ZH2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoFacturaWW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV116Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\mantenimientofacturaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACCOB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A965FacCob, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCOB", GXutil.rtrim( A965FacCob));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACOBS", getSecureSignedToken( "", A7210FacObs));
      app.GxWebStd.gx_hidden_field( httpContext, "FACOBS", A7210FacObs);
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
      rf1ZH2( ) ;
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
      AV116Pgmname = "Facturacion.MantenimientoFacturaWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluefacimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacimptot_Enabled), 5, 0), true);
      edtavTotvaluefacimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacimppp_Enabled), 5, 0), true);
      edtavTotvaluefacbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacbasimp_Enabled), 5, 0), true);
      edtavTotvaluefacivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacivaimp_Enabled), 5, 0), true);
      edtavTotvaluefactot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefactot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefactot_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A435FacEst) ,
                                           AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                           AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                           AV118Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                           Integer.valueOf(AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels.size()) ,
                                           Integer.valueOf(AV84FacCod) ,
                                           Integer.valueOf(AV83CliCod) ,
                                           AV85FacFchFrom ,
                                           AV86FacFchTo ,
                                           A279CliNom ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A436FacFch ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV120Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                           A441FacImpTot ,
                                           AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                           AV122Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                           A440FacImpPP ,
                                           AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                           AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                           A429FacBasImp ,
                                           AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                           AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                           A442FacIVAImp ,
                                           AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                           AV128Facturacion_mantenimientofacturawwds_11_tffactot ,
                                           A455FacTot ,
                                           AV129Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                           A450FacPri ,
                                           AV87FacPri ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV81EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV118Facturacion_mantenimientofacturawwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV118Facturacion_mantenimientofacturawwds_1_tfclinom), 30, "%") ;
      /* Using cursor H01ZH7 */
      pr_default.execute(0, new Object[] {AV81EmprCod, AV120Facturacion_mantenimientofacturawwds_3_tffacimptot, AV120Facturacion_mantenimientofacturawwds_3_tffacimptot, AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV122Facturacion_mantenimientofacturawwds_5_tffacimppp, AV122Facturacion_mantenimientofacturawwds_5_tffacimppp, AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV87FacPri, lV118Facturacion_mantenimientofacturawwds_1_tfclinom, AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel, Integer.valueOf(AV84FacCod), Integer.valueOf(AV83CliCod), AV85FacFchFrom, AV86FacFchTo});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A7210FacObs = H01ZH7_A7210FacObs[0] ;
         A9606FacHor = H01ZH7_A9606FacHor[0] ;
         A396EmprCod = H01ZH7_A396EmprCod[0] ;
         A965FacCob = H01ZH7_A965FacCob[0] ;
         A435FacEst = H01ZH7_A435FacEst[0] ;
         A1153FacTipFac = H01ZH7_A1153FacTipFac[0] ;
         A450FacPri = H01ZH7_A450FacPri[0] ;
         A279CliNom = H01ZH7_A279CliNom[0] ;
         A252CliCod = H01ZH7_A252CliCod[0] ;
         A436FacFch = H01ZH7_A436FacFch[0] ;
         A430FacCod = H01ZH7_A430FacCod[0] ;
         A11513FacRecIca = H01ZH7_A11513FacRecIca[0] ;
         A8346FacRecI = H01ZH7_A8346FacRecI[0] ;
         n8346FacRecI = H01ZH7_n8346FacRecI[0] ;
         A7212FacRect = H01ZH7_A7212FacRect[0] ;
         A453FacRECPor = H01ZH7_A453FacRECPor[0] ;
         A443FacIVAPor = H01ZH7_A443FacIVAPor[0] ;
         A14224FacCostFac = H01ZH7_A14224FacCostFac[0] ;
         A14223FacCostKgs = H01ZH7_A14223FacCostKgs[0] ;
         A14222FacCostMts = H01ZH7_A14222FacCostMts[0] ;
         A433FacDtoGen = H01ZH7_A433FacDtoGen[0] ;
         A3918FacImpTot1 = H01ZH7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = H01ZH7_n3918FacImpTot1[0] ;
         A7209Colombia = H01ZH7_A7209Colombia[0] ;
         n7209Colombia = H01ZH7_n7209Colombia[0] ;
         A440FacImpPP = H01ZH7_A440FacImpPP[0] ;
         n440FacImpPP = H01ZH7_n440FacImpPP[0] ;
         A441FacImpTot = H01ZH7_A441FacImpTot[0] ;
         n441FacImpTot = H01ZH7_n441FacImpTot[0] ;
         A7209Colombia = H01ZH7_A7209Colombia[0] ;
         n7209Colombia = H01ZH7_n7209Colombia[0] ;
         A279CliNom = H01ZH7_A279CliNom[0] ;
         A441FacImpTot = H01ZH7_A441FacImpTot[0] ;
         n441FacImpTot = H01ZH7_n441FacImpTot[0] ;
         A3918FacImpTot1 = H01ZH7_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = H01ZH7_n3918FacImpTot1[0] ;
         A440FacImpPP = H01ZH7_A440FacImpPP[0] ;
         n440FacImpPP = H01ZH7_n440FacImpPP[0] ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Facturacion_mantenimientofacturawwds_11_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV128Facturacion_mantenimientofacturawwds_11_tffactot) >= 0 ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Facturacion_mantenimientofacturawwds_12_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV129Facturacion_mantenimientofacturawwds_12_tffactot_to) <= 0 ) ) )
                        {
                           GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1ZH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(48) ;
      /* Execute user event: Refresh */
      e201ZH2 ();
      nGXsfl_48_idx = 1 ;
      sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_482( ) ;
      bGXsfl_48_Refreshing = true ;
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
         subsflControlProps_482( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(A435FacEst) ,
                                              AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                              AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                              AV118Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                              Integer.valueOf(AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels.size()) ,
                                              Integer.valueOf(AV84FacCod) ,
                                              Integer.valueOf(AV83CliCod) ,
                                              AV85FacFchFrom ,
                                              AV86FacFchTo ,
                                              A279CliNom ,
                                              Integer.valueOf(A430FacCod) ,
                                              Integer.valueOf(A252CliCod) ,
                                              A436FacFch ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV120Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                              A441FacImpTot ,
                                              AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                              AV122Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                              A440FacImpPP ,
                                              AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                              AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                              A429FacBasImp ,
                                              AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                              AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                              A442FacIVAImp ,
                                              AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                              AV128Facturacion_mantenimientofacturawwds_11_tffactot ,
                                              A455FacTot ,
                                              AV129Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                              A450FacPri ,
                                              AV87FacPri ,
                                              Byte.valueOf(A1153FacTipFac) ,
                                              AV81EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DATE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV118Facturacion_mantenimientofacturawwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV118Facturacion_mantenimientofacturawwds_1_tfclinom), 30, "%") ;
         /* Using cursor H01ZH13 */
         pr_default.execute(1, new Object[] {AV81EmprCod, AV120Facturacion_mantenimientofacturawwds_3_tffacimptot, AV120Facturacion_mantenimientofacturawwds_3_tffacimptot, AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV122Facturacion_mantenimientofacturawwds_5_tffacimppp, AV122Facturacion_mantenimientofacturawwds_5_tffacimppp, AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV87FacPri, lV118Facturacion_mantenimientofacturawwds_1_tfclinom, AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel, Integer.valueOf(AV84FacCod), Integer.valueOf(AV83CliCod), AV85FacFchFrom, AV86FacFchTo});
         nGXsfl_48_idx = 1 ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A7210FacObs = H01ZH13_A7210FacObs[0] ;
            A9606FacHor = H01ZH13_A9606FacHor[0] ;
            A396EmprCod = H01ZH13_A396EmprCod[0] ;
            A965FacCob = H01ZH13_A965FacCob[0] ;
            A435FacEst = H01ZH13_A435FacEst[0] ;
            A1153FacTipFac = H01ZH13_A1153FacTipFac[0] ;
            A450FacPri = H01ZH13_A450FacPri[0] ;
            A279CliNom = H01ZH13_A279CliNom[0] ;
            A252CliCod = H01ZH13_A252CliCod[0] ;
            A436FacFch = H01ZH13_A436FacFch[0] ;
            A430FacCod = H01ZH13_A430FacCod[0] ;
            A11513FacRecIca = H01ZH13_A11513FacRecIca[0] ;
            A8346FacRecI = H01ZH13_A8346FacRecI[0] ;
            n8346FacRecI = H01ZH13_n8346FacRecI[0] ;
            A7212FacRect = H01ZH13_A7212FacRect[0] ;
            A453FacRECPor = H01ZH13_A453FacRECPor[0] ;
            A443FacIVAPor = H01ZH13_A443FacIVAPor[0] ;
            A14224FacCostFac = H01ZH13_A14224FacCostFac[0] ;
            A14223FacCostKgs = H01ZH13_A14223FacCostKgs[0] ;
            A14222FacCostMts = H01ZH13_A14222FacCostMts[0] ;
            A433FacDtoGen = H01ZH13_A433FacDtoGen[0] ;
            A3918FacImpTot1 = H01ZH13_A3918FacImpTot1[0] ;
            n3918FacImpTot1 = H01ZH13_n3918FacImpTot1[0] ;
            A7209Colombia = H01ZH13_A7209Colombia[0] ;
            n7209Colombia = H01ZH13_n7209Colombia[0] ;
            A440FacImpPP = H01ZH13_A440FacImpPP[0] ;
            n440FacImpPP = H01ZH13_n440FacImpPP[0] ;
            A441FacImpTot = H01ZH13_A441FacImpTot[0] ;
            n441FacImpTot = H01ZH13_n441FacImpTot[0] ;
            A7209Colombia = H01ZH13_A7209Colombia[0] ;
            n7209Colombia = H01ZH13_n7209Colombia[0] ;
            A279CliNom = H01ZH13_A279CliNom[0] ;
            A441FacImpTot = H01ZH13_A441FacImpTot[0] ;
            n441FacImpTot = H01ZH13_n441FacImpTot[0] ;
            A3918FacImpTot1 = H01ZH13_A3918FacImpTot1[0] ;
            n3918FacImpTot1 = H01ZH13_n3918FacImpTot1[0] ;
            A440FacImpPP = H01ZH13_A440FacImpPP[0] ;
            n440FacImpPP = H01ZH13_n440FacImpPP[0] ;
            A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
            if ( A7209Colombia == 0 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               if ( A7209Colombia == 1 )
               {
                  A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               }
               else
               {
                  A439FacImpGen = DecimalUtil.doubleToDec(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
               }
            }
            A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
            A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
            A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp) >= 0 ) ) )
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to) <= 0 ) ) )
               {
                  A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
                  A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
                  A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
                  if ( A7209Colombia == 0 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                     }
                     else
                     {
                        A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                     }
                  }
                  A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
                  if ( A7209Colombia == 0 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                     }
                     else
                     {
                        A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                     }
                  }
                  A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
                  if ( A7209Colombia == 0 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
                  }
                  else
                  {
                     if ( A7209Colombia == 1 )
                     {
                        A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                     }
                     else
                     {
                        A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                     }
                  }
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp) >= 0 ) ) )
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to) <= 0 ) ) )
                     {
                        A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                        if ( A7209Colombia == 0 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                        else
                        {
                           if ( A7209Colombia == 1 )
                           {
                              A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                           }
                           else
                           {
                              A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                           }
                        }
                        A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Facturacion_mantenimientofacturawwds_11_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV128Facturacion_mantenimientofacturawwds_11_tffactot) >= 0 ) ) )
                        {
                           if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Facturacion_mantenimientofacturawwds_12_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV129Facturacion_mantenimientofacturawwds_12_tffactot_to) <= 0 ) ) )
                           {
                              e211ZH2 ();
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(48) ;
         wb1ZH0( ) ;
      }
      bGXsfl_48_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1ZH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV81EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIMPTOT", GXutil.ltrim( localUtil.ntoc( AV57TotFacImpTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPTOT", getSecureSignedToken( "", localUtil.format( AV57TotFacImpTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIMPPP", GXutil.ltrim( localUtil.ntoc( AV59TotFacImpPP, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV59TotFacImpPP, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACBASIMP", GXutil.ltrim( localUtil.ntoc( AV61TotFacBasImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV61TotFacBasImp, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACIVAIMP", GXutil.ltrim( localUtil.ntoc( AV63TotFacIVAImp, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV63TotFacIVAImp, "ZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFACTOT", GXutil.ltrim( localUtil.ntoc( AV65TotFacTot, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV65TotFacTot, "ZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV74FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACCOB"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, GXutil.rtrim( localUtil.format( A965FacCob, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACOBS"+"_"+sGXsfl_48_idx, getSecureSignedToken( sGXsfl_48_idx, A7210FacObs));
      app.GxWebStd.gx_hidden_field( httpContext, "FACHOR", localUtil.ttoc( A9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FACHOR", getSecureSignedToken( "", localUtil.format( A9606FacHor, "99/99/99 99:99")));
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
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV84FacCod, AV83CliCod, AV85FacFchFrom, AV86FacFchTo, AV87FacPri, AV81EmprCod, AV36TFCliNom, AV37TFCliNom_Sel, AV43TFFacImpTot, AV44TFFacImpTot_To, AV45TFFacImpPP, AV46TFFacImpPP_To, AV47TFFacBasImp, AV48TFFacBasImp_To, AV49TFFacIVAImp, AV50TFFacIVAImp_To, AV51TFFacTot, AV52TFFacTot_To, AV78TFFacEst_Sels, AV116Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotFacImpTot, AV59TotFacImpPP, AV61TotFacBasImp, AV63TotFacIVAImp, AV65TotFacTot, AV74FirmaD, Gx_date, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV84FacCod, AV83CliCod, AV85FacFchFrom, AV86FacFchTo, AV87FacPri, AV81EmprCod, AV36TFCliNom, AV37TFCliNom_Sel, AV43TFFacImpTot, AV44TFFacImpTot_To, AV45TFFacImpPP, AV46TFFacImpPP_To, AV47TFFacBasImp, AV48TFFacBasImp_To, AV49TFFacIVAImp, AV50TFFacIVAImp_To, AV51TFFacTot, AV52TFFacTot_To, AV78TFFacEst_Sels, AV116Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotFacImpTot, AV59TotFacImpPP, AV61TotFacBasImp, AV63TotFacIVAImp, AV65TotFacTot, AV74FirmaD, Gx_date, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV84FacCod, AV83CliCod, AV85FacFchFrom, AV86FacFchTo, AV87FacPri, AV81EmprCod, AV36TFCliNom, AV37TFCliNom_Sel, AV43TFFacImpTot, AV44TFFacImpTot_To, AV45TFFacImpPP, AV46TFFacImpPP_To, AV47TFFacBasImp, AV48TFFacBasImp_To, AV49TFFacIVAImp, AV50TFFacIVAImp_To, AV51TFFacTot, AV52TFFacTot_To, AV78TFFacEst_Sels, AV116Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotFacImpTot, AV59TotFacImpPP, AV61TotFacBasImp, AV63TotFacIVAImp, AV65TotFacTot, AV74FirmaD, Gx_date, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV84FacCod, AV83CliCod, AV85FacFchFrom, AV86FacFchTo, AV87FacPri, AV81EmprCod, AV36TFCliNom, AV37TFCliNom_Sel, AV43TFFacImpTot, AV44TFFacImpTot_To, AV45TFFacImpPP, AV46TFFacImpPP_To, AV47TFFacBasImp, AV48TFFacBasImp_To, AV49TFFacIVAImp, AV50TFFacIVAImp_To, AV51TFFacTot, AV52TFFacTot_To, AV78TFFacEst_Sels, AV116Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotFacImpTot, AV59TotFacImpPP, AV61TotFacBasImp, AV63TotFacIVAImp, AV65TotFacTot, AV74FirmaD, Gx_date, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
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
         gxgrgrid_refresh( subGrid_Rows, AV84FacCod, AV83CliCod, AV85FacFchFrom, AV86FacFchTo, AV87FacPri, AV81EmprCod, AV36TFCliNom, AV37TFCliNom_Sel, AV43TFFacImpTot, AV44TFFacImpTot_To, AV45TFFacImpPP, AV46TFFacImpPP_To, AV47TFFacBasImp, AV48TFFacBasImp_To, AV49TFFacIVAImp, AV50TFFacIVAImp_To, AV51TFFacTot, AV52TFFacTot_To, AV78TFFacEst_Sels, AV116Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57TotFacImpTot, AV59TotFacImpPP, AV61TotFacBasImp, AV63TotFacIVAImp, AV65TotFacTot, AV74FirmaD, Gx_date, A9606FacHor) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV116Pgmname = "Facturacion.MantenimientoFacturaWW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluefacimptot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacimptot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacimptot_Enabled), 5, 0), true);
      edtavTotvaluefacimppp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacimppp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacimppp_Enabled), 5, 0), true);
      edtavTotvaluefacbasimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacbasimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacbasimp_Enabled), 5, 0), true);
      edtavTotvaluefacivaimp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefacivaimp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefacivaimp_Enabled), 5, 0), true);
      edtavTotvaluefactot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluefactot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluefactot_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1ZH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191ZH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV38DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_48 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_48"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavFaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACCOD");
            GX_FocusControl = edtavFaccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84FacCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84FacCod), 8, 0));
         }
         else
         {
            AV84FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavFaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84FacCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CliCod), 6, 0));
         }
         else
         {
            AV83CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CliCod), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCHFROM");
            GX_FocusControl = edtavFacfchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85FacFchFrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85FacFchFrom", localUtil.format(AV85FacFchFrom, "99/99/99"));
         }
         else
         {
            AV85FacFchFrom = localUtil.ctod( httpContext.cgiGet( edtavFacfchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85FacFchFrom", localUtil.format(AV85FacFchFrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFacfchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFACFCHTO");
            GX_FocusControl = edtavFacfchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV86FacFchTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
         }
         else
         {
            AV86FacFchTo = localUtil.ctod( httpContext.cgiGet( edtavFacfchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
         }
         AV87FacPri = httpContext.cgiGet( edtavFacpri_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87FacPri", AV87FacPri);
         AV58TotValueFacImpTot = httpContext.cgiGet( edtavTotvaluefacimptot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58TotValueFacImpTot", AV58TotValueFacImpTot);
         AV60TotValueFacImpPP = httpContext.cgiGet( edtavTotvaluefacimppp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV60TotValueFacImpPP", AV60TotValueFacImpPP);
         AV62TotValueFacBasImp = httpContext.cgiGet( edtavTotvaluefacbasimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62TotValueFacBasImp", AV62TotValueFacBasImp);
         AV64TotValueFacIVAImp = httpContext.cgiGet( edtavTotvaluefacivaimp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64TotValueFacIVAImp", AV64TotValueFacIVAImp);
         AV66TotValueFacTot = httpContext.cgiGet( edtavTotvaluefactot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66TotValueFacTot", AV66TotValueFacTot);
         AV116Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MantenimientoFacturaWW");
         AV116Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV116Pgmname", AV116Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV116Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\mantenimientofacturaww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV84FacCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83CliCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vFACFCHFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV85FacFchFrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vFACFCHTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV86FacFchTo)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vFACPRI"), AV87FacPri) != 0 )
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
      e191ZH2 ();
      if (returnInSub) return;
   }

   public void e191ZH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facpri(), " ") == 0 )
      {
         AV87FacPri = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87FacPri", AV87FacPri);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto())) )
      {
         AV85FacFchFrom = AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85FacFchFrom", localUtil.format(AV85FacFchFrom, "99/99/99"));
         AV86FacFchTo = AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
      }
      else
      {
         if ( (0==AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Faccod()) )
         {
            AV85FacFchFrom = GXutil.dadd(Gx_date,-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85FacFchFrom", localUtil.format(AV85FacFchFrom, "99/99/99"));
            AV86FacFchTo = Gx_date ;
            httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
         }
      }
      GXt_char1 = AV54Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mantenimientofacturaww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Station = GXt_char1 ;
      GXv_char2[0] = AV81EmprCod ;
      GXv_char3[0] = AV55EmprNom ;
      GXv_char4[0] = AV56UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV54Station, GXv_char2, GXv_char3, GXv_char4) ;
      mantenimientofacturaww_impl.this.AV81EmprCod = GXv_char2[0] ;
      mantenimientofacturaww_impl.this.AV55EmprNom = GXv_char3[0] ;
      mantenimientofacturaww_impl.this.AV56UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81EmprCod", AV81EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81EmprCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Mantenimiento Factura", "") );
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
      GXt_int7 = (byte)(AV74FirmaD) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV81EmprCod, httpContext.getMessage( "FIRDIG", ""), GXv_int8) ;
      mantenimientofacturaww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV74FirmaD = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74FirmaD), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74FirmaD), "ZZZ9")));
      GXt_char1 = AV75ContDsc ;
      GXv_char4[0] = AV81EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "FIRDIG", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      mantenimientofacturaww_impl.this.AV81EmprCod = GXv_char4[0] ;
      mantenimientofacturaww_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81EmprCod", AV81EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV81EmprCod, "@!"))));
      AV75ContDsc = GXt_char1 ;
      GXt_int7 = (byte)(AV89moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV81EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      mantenimientofacturaww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV89moda21 = GXt_int7 ;
      AV76Texto_fd = " " ;
      if ( AV74FirmaD == 1 )
      {
         AV76Texto_fd = httpContext.getMessage( "Assinatura digital é ativada.", "") ;
      }
      GXt_char1 = AV90PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV81EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      mantenimientofacturaww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV90PATHPDF = GXt_char1 ;
   }

   public void e201ZH2( )
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
      AV40GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      AV41GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
      /*  Sending Event outputs  */
   }

   public void e111ZH2( )
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

   public void e121ZH2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e131ZH2( )
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
            AV36TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliNom", AV36TFCliNom);
            AV37TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliNom_Sel", AV37TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacImpTot") == 0 )
         {
            AV43TFFacImpTot = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFFacImpTot", GXutil.ltrimstr( AV43TFFacImpTot, 13, 2));
            AV44TFFacImpTot_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFFacImpTot_To", GXutil.ltrimstr( AV44TFFacImpTot_To, 13, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacImpPP") == 0 )
         {
            AV45TFFacImpPP = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFFacImpPP", GXutil.ltrimstr( AV45TFFacImpPP, 11, 2));
            AV46TFFacImpPP_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFFacImpPP_To", GXutil.ltrimstr( AV46TFFacImpPP_To, 11, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacBasImp") == 0 )
         {
            AV47TFFacBasImp = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFFacBasImp", GXutil.ltrimstr( AV47TFFacBasImp, 13, 2));
            AV48TFFacBasImp_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFFacBasImp_To", GXutil.ltrimstr( AV48TFFacBasImp_To, 13, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacIVAImp") == 0 )
         {
            AV49TFFacIVAImp = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFFacIVAImp", GXutil.ltrimstr( AV49TFFacIVAImp, 11, 2));
            AV50TFFacIVAImp_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFFacIVAImp_To", GXutil.ltrimstr( AV50TFFacIVAImp_To, 11, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacTot") == 0 )
         {
            AV51TFFacTot = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFFacTot", GXutil.ltrimstr( AV51TFFacTot, 13, 2));
            AV52TFFacTot_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFFacTot_To", GXutil.ltrimstr( AV52TFFacTot_To, 13, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FacEst") == 0 )
         {
            AV77TFFacEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFFacEst_SelsJson", AV77TFFacEst_SelsJson);
            AV78TFFacEst_Sels.fromJSonString(GXutil.strReplace( AV77TFFacEst_SelsJson, "\"", ""), null);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV78TFFacEst_Sels", AV78TFFacEst_Sels);
   }

   private void e211ZH2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Vencimientos", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Hash", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(48) ;
         }
         sendrow_482( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_48_Refreshing )
      {
         httpContext.doAjaxLoad(48, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
   }

   public void e221ZH2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      AV111pFacCod = A430FacCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV111pFacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111pFacCod), 8, 0));
      AV112pIniFacFch = A436FacFch ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112pIniFacFch", localUtil.format(AV112pIniFacFch, "99/99/99"));
      AV113pEndFacFch = A436FacFch ;
      AV110pCliCod = A252CliCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110pCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV110pCliCod), 6, 0));
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
         /* Execute user subroutine: 'DO VENCIMIENTOS' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 4 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV42GridActions == 5 )
      {
         /* Execute user subroutine: 'DO HASH' */
         S222 ();
         if (returnInSub) return;
      }
      AV42GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
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
      callWebObject(formatLink("app.facturacion.mantenimientofactura", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      if ( 1 == 0 )
      {
         callWebObject(formatLink("app.facturacion.mantenimientofacturaview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","FacCod","TabCode"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S192( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( ( AV74FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Factura Impresa.NO se permite MODIFICACION.Activado FIRMA DIGITAL", ""));
      }
      else
      {
         if ( GXutil.strcmp(A965FacCob, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Traspasada a Contabilidad", ""));
         }
         else
         {
            if ( ( A435FacEst == 2 ) && ( GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), httpContext.getMessage( "FACTURA ANULADA", "")) != 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Actualizada", ""));
            }
            else
            {
               if ( A1153FacTipFac != 0 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura de Abono o Cargo", ""));
               }
               else
               {
                  if ( ( A435FacEst == 2 ) && ( GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), httpContext.getMessage( "FACTURA ANULADA", "")) == 0 ) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura ANULADA", ""));
                  }
                  else
                  {
                     callWebObject(formatLink("app.facturacion.mantenimientofactura", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) );
                     httpContext.wjLocDisableFrm = (byte)(1) ;
                  }
               }
            }
         }
      }
   }

   public void S202( )
   {
      /* 'DO VENCIMIENTOS' Routine */
      returnInSub = false ;
      if ( ( AV74FirmaD == 1 ) && ( A435FacEst > 0 ) && ( GXutil.strcmp(A450FacPri, "1") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion.Factura Impresa.NO se permite MODIFICACION.Activado FIRMA DIGITAL", ""));
         httpContext.popup(formatLink("app.facturacion.tfacvto", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      else
      {
         if ( GXutil.strcmp(A965FacCob, httpContext.getMessage( "S", "")) == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Traspasada a Contabilidad", ""));
         }
         else
         {
            if ( ( A435FacEst == 2 ) && ( GXutil.strcmp(GXutil.substring( A7210FacObs, 1, 15), httpContext.getMessage( "FACTURA ANULADA", "")) != 0 ) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Factura Actualizada", ""));
            }
            else
            {
               httpContext.popup(formatLink("app.facturacion.tfacvto", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0))}, new String[] {"Mode","EmprCod","FacCod"}) , new Object[] {});
               httpContext.doAjaxRefresh();
            }
         }
      }
   }

   public void S212( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.facturacion.generarjobfactura", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV111pFacCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV110pCliCod,6,0)),GXutil.URLEncode(GXutil.formatDateParm(AV112pIniFacFch))}, new String[] {"FacCodfrom","CliCodfrom","FacFchfrom"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO HASH' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV68Cadena ;
      GXv_char3[0] = AV69firma ;
      new app.obtengocadenaparahashdocumentofactura(remoteHandle, context).execute( A396EmprCod, A430FacCod, A9606FacHor, GXv_char4, GXv_char3) ;
      mantenimientofacturaww_impl.this.AV68Cadena = GXv_char4[0] ;
      mantenimientofacturaww_impl.this.AV69firma = GXv_char3[0] ;
      GXv_char4[0] = AV71Hash ;
      GXv_objcol_SdtMessages_Message10[0] = AV70Messages ;
      GXv_boolean11[0] = AV72ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV68Cadena, GXv_char4, GXv_objcol_SdtMessages_Message10, GXv_boolean11) ;
      mantenimientofacturaww_impl.this.AV71Hash = GXv_char4[0] ;
      AV70Messages = GXv_objcol_SdtMessages_Message10[0] ;
      mantenimientofacturaww_impl.this.AV72ok = GXv_boolean11[0] ;
      if ( AV72ok )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int12[0] = A430FacCod ;
         GXv_char3[0] = AV68Cadena ;
         GXv_char2[0] = AV71Hash ;
         new app.facturacion.actualizohashdocumentofactura(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2) ;
         mantenimientofacturaww_impl.this.A396EmprCod = GXv_char4[0] ;
         mantenimientofacturaww_impl.this.A430FacCod = GXv_int12[0] ;
         mantenimientofacturaww_impl.this.AV68Cadena = GXv_char3[0] ;
         mantenimientofacturaww_impl.this.AV71Hash = GXv_char2[0] ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
      }
      else
      {
         AV131GXV1 = 1 ;
         while ( AV131GXV1 <= AV70Messages.size() )
         {
            AV73Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV70Messages.elementAt(-1+AV131GXV1));
            httpContext.GX_msglist.addItem(AV73Message.getgxTv_SdtMessages_Message_Description());
            AV131GXV1 = (int)(AV131GXV1+1) ;
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV116Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV116Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV116Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV132GXV2 = 1 ;
      while ( AV132GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV132GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV36TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFCliNom", AV36TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV37TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFCliNom_Sel", AV37TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPTOT") == 0 )
         {
            AV43TFFacImpTot = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFFacImpTot", GXutil.ltrimstr( AV43TFFacImpTot, 13, 2));
            AV44TFFacImpTot_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFFacImpTot_To", GXutil.ltrimstr( AV44TFFacImpTot_To, 13, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIMPPP") == 0 )
         {
            AV45TFFacImpPP = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFFacImpPP", GXutil.ltrimstr( AV45TFFacImpPP, 11, 2));
            AV46TFFacImpPP_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFFacImpPP_To", GXutil.ltrimstr( AV46TFFacImpPP_To, 11, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACBASIMP") == 0 )
         {
            AV47TFFacBasImp = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFFacBasImp", GXutil.ltrimstr( AV47TFFacBasImp, 13, 2));
            AV48TFFacBasImp_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFFacBasImp_To", GXutil.ltrimstr( AV48TFFacBasImp_To, 13, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACIVAIMP") == 0 )
         {
            AV49TFFacIVAImp = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFFacIVAImp", GXutil.ltrimstr( AV49TFFacIVAImp, 11, 2));
            AV50TFFacIVAImp_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFFacIVAImp_To", GXutil.ltrimstr( AV50TFFacIVAImp_To, 11, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACTOT") == 0 )
         {
            AV51TFFacTot = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFFacTot", GXutil.ltrimstr( AV51TFFacTot, 13, 2));
            AV52TFFacTot_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFFacTot_To", GXutil.ltrimstr( AV52TFFacTot_To, 13, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFACEST_SEL") == 0 )
         {
            AV77TFFacEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77TFFacEst_SelsJson", AV77TFFacEst_SelsJson);
            AV78TFFacEst_Sels.fromJSonString(AV77TFFacEst_SelsJson, null);
         }
         AV132GXV2 = (int)(AV132GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFCliNom_Sel)==0), AV37TFCliNom_Sel, GXv_char4) ;
      mantenimientofacturaww_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|||||||"+((AV78TFFacEst_Sels.size()==0) ? "" : AV77TFFacEst_SelsJson) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFCliNom)==0), AV36TFCliNom, GXv_char4) ;
      mantenimientofacturaww_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = "|||"+GXt_char1+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFFacImpTot)==0) ? "" : GXutil.str( AV43TFFacImpTot, 13, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFFacImpPP)==0) ? "" : GXutil.str( AV45TFFacImpPP, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFFacBasImp)==0) ? "" : GXutil.str( AV47TFFacBasImp, 13, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFFacIVAImp)==0) ? "" : GXutil.str( AV49TFFacIVAImp, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFFacTot)==0) ? "" : GXutil.str( AV51TFFacTot, 13, 2))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFFacImpTot_To)==0) ? "" : GXutil.str( AV44TFFacImpTot_To, 13, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFFacImpPP_To)==0) ? "" : GXutil.str( AV46TFFacImpPP_To, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFFacBasImp_To)==0) ? "" : GXutil.str( AV48TFFacBasImp_To, 13, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFFacIVAImp_To)==0) ? "" : GXutil.str( AV50TFFacIVAImp_To, 11, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFFacTot_To)==0) ? "" : GXutil.str( AV52TFFacTot_To, 13, 2))+"|" ;
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
      AV10GridState.fromxml(AV22Session.getValue(AV116Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFCLINOM", "", !(GXutil.strcmp("", AV36TFCliNom)==0), (short)(0), AV36TFCliNom, "", !(GXutil.strcmp("", AV37TFCliNom_Sel)==0), AV37TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFACIMPTOT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV43TFFacImpTot)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV44TFFacImpTot_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV43TFFacImpTot, 13, 2)), GXutil.trim( GXutil.str( AV44TFFacImpTot_To, 13, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFACIMPPP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV45TFFacImpPP)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFFacImpPP_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV45TFFacImpPP, 11, 2)), GXutil.trim( GXutil.str( AV46TFFacImpPP_To, 11, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFACBASIMP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFFacBasImp)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFFacBasImp_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV47TFFacBasImp, 13, 2)), GXutil.trim( GXutil.str( AV48TFFacBasImp_To, 13, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFACIVAIMP", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFFacIVAImp)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFFacIVAImp_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV49TFFacIVAImp, 11, 2)), GXutil.trim( GXutil.str( AV50TFFacIVAImp_To, 11, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFACTOT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFFacTot)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV52TFFacTot_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV51TFFacTot, 13, 2)), GXutil.trim( GXutil.str( AV52TFFacTot_To, 13, 2))) ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFFACEST_SEL", "", !(AV78TFFacEst_Sels.size()==0), (short)(0), AV78TFFacEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState13[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV116Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV116Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Facturacion.MantenimientoFactura" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV57TotFacImpTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TotFacImpTot", GXutil.ltrimstr( AV57TotFacImpTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPTOT", getSecureSignedToken( "", localUtil.format( AV57TotFacImpTot, "ZZZZZZZZZ9.99")));
      AV59TotFacImpPP = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TotFacImpPP", GXutil.ltrimstr( AV59TotFacImpPP, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV59TotFacImpPP, "ZZZZZZZ9.99")));
      AV61TotFacBasImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61TotFacBasImp", GXutil.ltrimstr( AV61TotFacBasImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV61TotFacBasImp, "ZZZZZZZZZ9.99")));
      AV63TotFacIVAImp = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TotFacIVAImp", GXutil.ltrimstr( AV63TotFacIVAImp, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV63TotFacIVAImp, "ZZZZZZZ9.99")));
      AV65TotFacTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TotFacTot", GXutil.ltrimstr( AV65TotFacTot, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV65TotFacTot, "ZZZZZZZZZ9.99")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = AV36TFCliNom ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = AV37TFCliNom_Sel ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = AV43TFFacImpTot ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = AV44TFFacImpTot_To ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = AV45TFFacImpPP ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = AV46TFFacImpPP_To ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = AV47TFFacBasImp ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = AV48TFFacBasImp_To ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = AV49TFFacIVAImp ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = AV50TFFacIVAImp_To ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = AV51TFFacTot ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = AV52TFFacTot_To ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = AV78TFFacEst_Sels ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Byte.valueOf(A435FacEst) ,
                                           AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                           AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                           AV118Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                           Integer.valueOf(AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels.size()) ,
                                           Integer.valueOf(AV84FacCod) ,
                                           Integer.valueOf(AV83CliCod) ,
                                           AV85FacFchFrom ,
                                           AV86FacFchTo ,
                                           A279CliNom ,
                                           Integer.valueOf(A430FacCod) ,
                                           Integer.valueOf(A252CliCod) ,
                                           A436FacFch ,
                                           AV120Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                           A441FacImpTot ,
                                           AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                           AV122Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                           A440FacImpPP ,
                                           AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                           AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                           A429FacBasImp ,
                                           AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                           AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                           A442FacIVAImp ,
                                           AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                           AV128Facturacion_mantenimientofacturawwds_11_tffactot ,
                                           A455FacTot ,
                                           AV129Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                           A450FacPri ,
                                           AV87FacPri ,
                                           Byte.valueOf(A1153FacTipFac) ,
                                           AV81EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DATE, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV118Facturacion_mantenimientofacturawwds_1_tfclinom = GXutil.padr( GXutil.rtrim( AV118Facturacion_mantenimientofacturawwds_1_tfclinom), 30, "%") ;
      /* Using cursor H01ZH19 */
      pr_default.execute(2, new Object[] {AV81EmprCod, AV120Facturacion_mantenimientofacturawwds_3_tffacimptot, AV120Facturacion_mantenimientofacturawwds_3_tffacimptot, AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to, AV122Facturacion_mantenimientofacturawwds_5_tffacimppp, AV122Facturacion_mantenimientofacturawwds_5_tffacimppp, AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to, AV87FacPri, lV118Facturacion_mantenimientofacturawwds_1_tfclinom, AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel, Integer.valueOf(AV84FacCod), Integer.valueOf(AV83CliCod), AV85FacFchFrom, AV86FacFchTo});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A1153FacTipFac = H01ZH19_A1153FacTipFac[0] ;
         A436FacFch = H01ZH19_A436FacFch[0] ;
         A252CliCod = H01ZH19_A252CliCod[0] ;
         A450FacPri = H01ZH19_A450FacPri[0] ;
         A430FacCod = H01ZH19_A430FacCod[0] ;
         A396EmprCod = H01ZH19_A396EmprCod[0] ;
         A435FacEst = H01ZH19_A435FacEst[0] ;
         A279CliNom = H01ZH19_A279CliNom[0] ;
         A11513FacRecIca = H01ZH19_A11513FacRecIca[0] ;
         A8346FacRecI = H01ZH19_A8346FacRecI[0] ;
         n8346FacRecI = H01ZH19_n8346FacRecI[0] ;
         A7212FacRect = H01ZH19_A7212FacRect[0] ;
         A453FacRECPor = H01ZH19_A453FacRECPor[0] ;
         A443FacIVAPor = H01ZH19_A443FacIVAPor[0] ;
         A14224FacCostFac = H01ZH19_A14224FacCostFac[0] ;
         A14223FacCostKgs = H01ZH19_A14223FacCostKgs[0] ;
         A14222FacCostMts = H01ZH19_A14222FacCostMts[0] ;
         A433FacDtoGen = H01ZH19_A433FacDtoGen[0] ;
         A3918FacImpTot1 = H01ZH19_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = H01ZH19_n3918FacImpTot1[0] ;
         A7209Colombia = H01ZH19_A7209Colombia[0] ;
         n7209Colombia = H01ZH19_n7209Colombia[0] ;
         A440FacImpPP = H01ZH19_A440FacImpPP[0] ;
         n440FacImpPP = H01ZH19_n440FacImpPP[0] ;
         A441FacImpTot = H01ZH19_A441FacImpTot[0] ;
         n441FacImpTot = H01ZH19_n441FacImpTot[0] ;
         A7209Colombia = H01ZH19_A7209Colombia[0] ;
         n7209Colombia = H01ZH19_n7209Colombia[0] ;
         A279CliNom = H01ZH19_A279CliNom[0] ;
         A441FacImpTot = H01ZH19_A441FacImpTot[0] ;
         n441FacImpTot = H01ZH19_n441FacImpTot[0] ;
         A3918FacImpTot1 = H01ZH19_A3918FacImpTot1[0] ;
         n3918FacImpTot1 = H01ZH19_n3918FacImpTot1[0] ;
         A440FacImpPP = H01ZH19_A440FacImpPP[0] ;
         n440FacImpPP = H01ZH19_n440FacImpPP[0] ;
         A3919FacImpGen1 = A3918FacImpTot1.multiply(A433FacDtoGen).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3919FacImpGen1", GXutil.ltrimstr( A3919FacImpGen1, 12, 3));
         if ( A7209Colombia == 0 )
         {
            A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
         }
         else
         {
            if ( A7209Colombia == 1 )
            {
               A439FacImpGen = GXutil.roundDecimal( A3919FacImpGen1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
            else
            {
               A439FacImpGen = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A439FacImpGen", GXutil.ltrimstr( A439FacImpGen, 11, 2));
            }
         }
         A14221FacCostEng = (A14222FacCostMts.add(A14223FacCostKgs)).multiply(A14224FacCostFac) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14221FacCostEng", GXutil.ltrimstr( A14221FacCostEng, 12, 3));
         A14220FacCostEne = GXutil.roundDecimal( A14221FacCostEng, 2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14220FacCostEne", GXutil.ltrimstr( A14220FacCostEne, 12, 3));
         A429FacBasImp = GXutil.roundDecimal( A441FacImpTot.subtract(A439FacImpGen).subtract(A440FacImpPP).add(A14220FacCostEne), 2) ;
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp) >= 0 ) ) )
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to)==0) || ( ( DecimalUtil.compareTo(A429FacBasImp, AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to) <= 0 ) ) )
            {
               A11514FacImpIca1 = (A429FacBasImp.multiply(A11513FacRecIca)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11514FacImpIca1", GXutil.ltrimstr( A11514FacImpIca1, 12, 3));
               A11515FacImpIca = GXutil.roundDecimal( A11514FacImpIca1, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11515FacImpIca", GXutil.ltrimstr( A11515FacImpIca, 12, 3));
               A7214FacImpRet1 = A429FacBasImp.multiply(A7212FacRect).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7214FacImpRet1", GXutil.ltrimstr( A7214FacImpRet1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A7213FacImpRet = GXutil.roundDecimal( A7214FacImpRet1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
                  else
                  {
                     A7213FacImpRet = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A7213FacImpRet", GXutil.ltrimstr( A7213FacImpRet, 11, 2));
                  }
               }
               A3922FacRecImp1 = A429FacBasImp.multiply(A453FacRECPor).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3922FacRecImp1", GXutil.ltrimstr( A3922FacRecImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 2) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A452FacRecImp = GXutil.roundDecimal( A3922FacRecImp1, 0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
                  else
                  {
                     A452FacRecImp = DecimalUtil.doubleToDec(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A452FacRecImp", GXutil.ltrimstr( A452FacRecImp, 11, 2));
                  }
               }
               A3921FacIvaImp1 = A429FacBasImp.multiply(DecimalUtil.doubleToDec(A443FacIVAPor)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3921FacIvaImp1", GXutil.ltrimstr( A3921FacIvaImp1, 12, 3));
               if ( A7209Colombia == 0 )
               {
                  A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 2) ;
               }
               else
               {
                  if ( A7209Colombia == 1 )
                  {
                     A442FacIVAImp = GXutil.roundDecimal( A3921FacIvaImp1, 0) ;
                  }
                  else
                  {
                     A442FacIVAImp = DecimalUtil.doubleToDec(0) ;
                  }
               }
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp) >= 0 ) ) )
               {
                  if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to)==0) || ( ( DecimalUtil.compareTo(A442FacIVAImp, AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to) <= 0 ) ) )
                  {
                     A8348FacImpReI1 = A442FacIVAImp.multiply(A8346FacRecI).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A8348FacImpReI1", GXutil.ltrimstr( A8348FacImpReI1, 12, 3));
                     if ( A7209Colombia == 0 )
                     {
                        A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 2) ;
                        httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                     }
                     else
                     {
                        if ( A7209Colombia == 1 )
                        {
                           A8347FacImpReI = GXutil.roundDecimal( A8348FacImpReI1, 0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                        else
                        {
                           A8347FacImpReI = DecimalUtil.doubleToDec(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "A8347FacImpReI", GXutil.ltrimstr( A8347FacImpReI, 11, 2));
                        }
                     }
                     A455FacTot = A429FacBasImp.add(A442FacIVAImp).add(A452FacRecImp).subtract(A7213FacImpRet).subtract(A8347FacImpReI).subtract(A11515FacImpIca) ;
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Facturacion_mantenimientofacturawwds_11_tffactot)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV128Facturacion_mantenimientofacturawwds_11_tffactot) >= 0 ) ) )
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Facturacion_mantenimientofacturawwds_12_tffactot_to)==0) || ( ( DecimalUtil.compareTo(A455FacTot, AV129Facturacion_mantenimientofacturawwds_12_tffactot_to) <= 0 ) ) )
                        {
                           AV57TotFacImpTot = A441FacImpTot.add(AV57TotFacImpTot) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV57TotFacImpTot", GXutil.ltrimstr( AV57TotFacImpTot, 18, 2));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPTOT", getSecureSignedToken( "", localUtil.format( AV57TotFacImpTot, "ZZZZZZZZZ9.99")));
                           AV59TotFacImpPP = A440FacImpPP.add(AV59TotFacImpPP) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV59TotFacImpPP", GXutil.ltrimstr( AV59TotFacImpPP, 18, 2));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIMPPP", getSecureSignedToken( "", localUtil.format( AV59TotFacImpPP, "ZZZZZZZ9.99")));
                           AV61TotFacBasImp = A429FacBasImp.add(AV61TotFacBasImp) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV61TotFacBasImp", GXutil.ltrimstr( AV61TotFacBasImp, 18, 2));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACBASIMP", getSecureSignedToken( "", localUtil.format( AV61TotFacBasImp, "ZZZZZZZZZ9.99")));
                           AV63TotFacIVAImp = A442FacIVAImp.add(AV63TotFacIVAImp) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV63TotFacIVAImp", GXutil.ltrimstr( AV63TotFacIVAImp, 18, 2));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACIVAIMP", getSecureSignedToken( "", localUtil.format( AV63TotFacIVAImp, "ZZZZZZZ9.99")));
                           AV65TotFacTot = A455FacTot.add(AV65TotFacTot) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV65TotFacTot", GXutil.ltrimstr( AV65TotFacTot, 18, 2));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFACTOT", getSecureSignedToken( "", localUtil.format( AV65TotFacTot, "ZZZZZZZZZ9.99")));
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV58TotValueFacImpTot = localUtil.format( AV57TotFacImpTot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58TotValueFacImpTot", AV58TotValueFacImpTot);
      AV60TotValueFacImpPP = localUtil.format( AV59TotFacImpPP, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TotValueFacImpPP", AV60TotValueFacImpPP);
      AV62TotValueFacBasImp = localUtil.format( AV61TotFacBasImp, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TotValueFacBasImp", AV62TotValueFacBasImp);
      AV64TotValueFacIVAImp = localUtil.format( AV63TotFacIVAImp, "ZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TotValueFacIVAImp", AV64TotValueFacIVAImp);
      AV66TotValueFacTot = localUtil.format( AV65TotFacTot, "ZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TotValueFacTot", AV66TotValueFacTot);
   }

   public void e141ZH2( )
   {
      /* Facpri_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV87FacPri, "1") == 0 )
      {
         AV86FacFchTo = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV87FacPri, "0") == 0 )
      {
         AV86FacFchTo = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S232 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterMantenimientoFactura_SDT", AV88FilterMantenimientoFactura_SDT);
   }

   public void e151ZH2( )
   {
      /* Faccod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV84FacCod) )
      {
         AV85FacFchFrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85FacFchFrom", localUtil.format(AV85FacFchFrom, "99/99/99"));
         AV86FacFchTo = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
         AV83CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CliCod), 6, 0));
      }
      else
      {
         AV85FacFchFrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85FacFchFrom", localUtil.format(AV85FacFchFrom, "99/99/99"));
         AV86FacFchTo = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
         AV83CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CliCod), 6, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterMantenimientoFactura_SDT", AV88FilterMantenimientoFactura_SDT);
   }

   public void e161ZH2( )
   {
      /* Clicod_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterMantenimientoFactura_SDT", AV88FilterMantenimientoFactura_SDT);
   }

   public void e171ZH2( )
   {
      /* Facfchfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterMantenimientoFactura_SDT", AV88FilterMantenimientoFactura_SDT);
   }

   public void e181ZH2( )
   {
      /* Facfchto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S232 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV88FilterMantenimientoFactura_SDT", AV88FilterMantenimientoFactura_SDT);
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV88FilterMantenimientoFactura_SDT.fromJSonString(AV82WebSession.getValue(httpContext.getMessage( "&FilterMantenimientoFactura_SDT", "")), null);
      AV84FacCod = AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Faccod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV84FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84FacCod), 8, 0));
      AV83CliCod = AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CliCod), 6, 0));
      AV85FacFchFrom = AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85FacFchFrom", localUtil.format(AV85FacFchFrom, "99/99/99"));
      AV86FacFchTo = AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86FacFchTo", localUtil.format(AV86FacFchTo, "99/99/99"));
      AV87FacPri = AV88FilterMantenimientoFactura_SDT.getgxTv_SdtFilterMantenimientoFactura_SDT_Facpri() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87FacPri", AV87FacPri);
   }

   public void S232( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV88FilterMantenimientoFactura_SDT.setgxTv_SdtFilterMantenimientoFactura_SDT_Faccod( AV84FacCod );
      AV88FilterMantenimientoFactura_SDT.setgxTv_SdtFilterMantenimientoFactura_SDT_Clicod( AV83CliCod );
      AV88FilterMantenimientoFactura_SDT.setgxTv_SdtFilterMantenimientoFactura_SDT_Facfchfrom( AV85FacFchFrom );
      AV88FilterMantenimientoFactura_SDT.setgxTv_SdtFilterMantenimientoFactura_SDT_Facfchto( AV86FacFchTo );
      AV88FilterMantenimientoFactura_SDT.setgxTv_SdtFilterMantenimientoFactura_SDT_Facpri( AV87FacPri );
      AV82WebSession.setValue(httpContext.getMessage( "&FilterMantenimientoFactura_SDT", ""), AV88FilterMantenimientoFactura_SDT.toJSonString(false, true));
   }

   public void wb_table2_67_1ZH2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefacimptot_Internalname, httpContext.getMessage( "Tot Value Fac Imp Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefacimptot_Internalname, AV58TotValueFacImpTot, GXutil.rtrim( localUtil.format( AV58TotValueFacImpTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefacimptot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefacimptot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefacimppp_Internalname, httpContext.getMessage( "Tot Value Fac Imp PP", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefacimppp_Internalname, AV60TotValueFacImpPP, GXutil.rtrim( localUtil.format( AV60TotValueFacImpPP, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,80);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefacimppp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefacimppp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefacbasimp_Internalname, httpContext.getMessage( "Tot Value Fac Bas Imp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefacbasimp_Internalname, AV62TotValueFacBasImp, GXutil.rtrim( localUtil.format( AV62TotValueFacBasImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefacbasimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefacbasimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefacivaimp_Internalname, httpContext.getMessage( "Tot Value Fac IVAImp", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefacivaimp_Internalname, AV64TotValueFacIVAImp, GXutil.rtrim( localUtil.format( AV64TotValueFacIVAImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefacivaimp_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefacivaimp_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluefactot_Internalname, httpContext.getMessage( "Tot Value Fac Tot", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'" + sGXsfl_48_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluefactot_Internalname, AV66TotValueFacTot, GXutil.rtrim( localUtil.format( AV66TotValueFacTot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluefactot_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluefactot_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\MantenimientoFacturaWW.htm");
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
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_67_1ZH2e( true) ;
      }
      else
      {
         wb_table2_67_1ZH2e( false) ;
      }
   }

   public void wb_table1_37_1ZH2( boolean wbgen )
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
         wb_table1_37_1ZH2e( true) ;
      }
      else
      {
         wb_table1_37_1ZH2e( false) ;
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
      pa1ZH2( ) ;
      ws1ZH2( ) ;
      we1ZH2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202691019581951", true, true);
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
      httpContext.AddJavascriptSource("facturacion/mantenimientofacturaww.js", "?202691019581952", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_482( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_48_idx );
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_48_idx ;
      edtFacFch_Internalname = "FACFCH_"+sGXsfl_48_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_48_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_48_idx ;
      edtFacPri_Internalname = "FACPRI_"+sGXsfl_48_idx ;
      edtFacImpTot_Internalname = "FACIMPTOT_"+sGXsfl_48_idx ;
      edtFacImpPP_Internalname = "FACIMPPP_"+sGXsfl_48_idx ;
      edtFacBasImp_Internalname = "FACBASIMP_"+sGXsfl_48_idx ;
      edtFacIVAImp_Internalname = "FACIVAIMP_"+sGXsfl_48_idx ;
      edtFacTot_Internalname = "FACTOT_"+sGXsfl_48_idx ;
      edtFacObs_Internalname = "FACOBS_"+sGXsfl_48_idx ;
      edtFacTipFac_Internalname = "FACTIPFAC_"+sGXsfl_48_idx ;
      cmbFacEst.setInternalname( "FACEST_"+sGXsfl_48_idx );
      edtFacCob_Internalname = "FACCOB_"+sGXsfl_48_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_48_idx ;
   }

   public void subsflControlProps_fel_482( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_48_fel_idx );
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_48_fel_idx ;
      edtFacFch_Internalname = "FACFCH_"+sGXsfl_48_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_48_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_48_fel_idx ;
      edtFacPri_Internalname = "FACPRI_"+sGXsfl_48_fel_idx ;
      edtFacImpTot_Internalname = "FACIMPTOT_"+sGXsfl_48_fel_idx ;
      edtFacImpPP_Internalname = "FACIMPPP_"+sGXsfl_48_fel_idx ;
      edtFacBasImp_Internalname = "FACBASIMP_"+sGXsfl_48_fel_idx ;
      edtFacIVAImp_Internalname = "FACIVAIMP_"+sGXsfl_48_fel_idx ;
      edtFacTot_Internalname = "FACTOT_"+sGXsfl_48_fel_idx ;
      edtFacObs_Internalname = "FACOBS_"+sGXsfl_48_fel_idx ;
      edtFacTipFac_Internalname = "FACTIPFAC_"+sGXsfl_48_fel_idx ;
      cmbFacEst.setInternalname( "FACEST_"+sGXsfl_48_fel_idx );
      edtFacCob_Internalname = "FACCOB_"+sGXsfl_48_fel_idx ;
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_48_fel_idx ;
   }

   public void sendrow_482( )
   {
      subsflControlProps_482( ) ;
      wb1ZH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_48_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_48_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_48_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'',false,'"+sGXsfl_48_idx+"',48)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_48_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV42GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_48_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV42GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_48_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCod_Internalname,GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacFch_Internalname,localUtil.format(A436FacFch, "99/99/99"),localUtil.format( A436FacFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacPri_Internalname,GXutil.rtrim( A450FacPri),GXutil.rtrim( localUtil.format( A450FacPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacImpTot_Internalname,GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A441FacImpTot, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacImpTot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacImpPP_Internalname,GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A440FacImpPP, "ZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacImpPP_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacBasImp_Internalname,GXutil.ltrim( localUtil.ntoc( A429FacBasImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A429FacBasImp, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacBasImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacIVAImp_Internalname,GXutil.ltrim( localUtil.ntoc( A442FacIVAImp, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A442FacIVAImp, "ZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacIVAImp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacTot_Internalname,GXutil.ltrim( localUtil.ntoc( A455FacTot, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A455FacTot, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacTot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacObs_Internalname,A7210FacObs,A7210FacObs,"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(32768),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacTipFac_Internalname,GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1153FacTipFac), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacTipFac_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbFacEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FACEST_" + sGXsfl_48_idx ;
            cmbFacEst.setName( GXCCtl );
            cmbFacEst.setWebtags( "" );
            cmbFacEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
            cmbFacEst.addItem("1", httpContext.getMessage( "Impresa", ""), (short)(0));
            cmbFacEst.addItem("2", httpContext.getMessage( "Actualizada", ""), (short)(0));
            if ( cmbFacEst.getItemCount() > 0 )
            {
               A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbFacEst,cmbFacEst.getInternalname(),GXutil.trim( GXutil.str( A435FacEst, 1, 0)),Integer.valueOf(1),cmbFacEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), !bGXsfl_48_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCob_Internalname,GXutil.rtrim( A965FacCob),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(48),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1ZH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_48_idx = ((subGrid_Islastpage==1)&&(nGXsfl_48_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_48_idx+1) ;
         sGXsfl_48_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_48_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_482( ) ;
      }
      /* End function sendrow_482 */
   }

   public void startgridcontrol48( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"48\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total Bruto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. Dto. P.P.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Base Imp.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imp. IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Factura 1-Rec. 0-Vtas.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ctb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A436FacFch, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A450FacPri));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A441FacImpTot, (byte)(13), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A440FacImpPP, (byte)(11), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A429FacBasImp, (byte)(13), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A442FacIVAImp, (byte)(11), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A455FacTot, (byte)(13), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A7210FacObs);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1153FacTipFac, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A435FacEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A965FacCob));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
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
      edtavFaccod_Internalname = "vFACCOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavFacfchfrom_Internalname = "vFACFCHFROM" ;
      edtavFacfchto_Internalname = "vFACFCHTO" ;
      edtavFacpri_Internalname = "vFACPRI" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtFacCod_Internalname = "FACCOD" ;
      edtFacFch_Internalname = "FACFCH" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtFacPri_Internalname = "FACPRI" ;
      edtFacImpTot_Internalname = "FACIMPTOT" ;
      edtFacImpPP_Internalname = "FACIMPPP" ;
      edtFacBasImp_Internalname = "FACBASIMP" ;
      edtFacIVAImp_Internalname = "FACIVAIMP" ;
      edtFacTot_Internalname = "FACTOT" ;
      edtFacObs_Internalname = "FACOBS" ;
      edtFacTipFac_Internalname = "FACTIPFAC" ;
      cmbFacEst.setInternalname( "FACEST" );
      edtFacCob_Internalname = "FACCOB" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtavTotvaluefacimptot_Internalname = "vTOTVALUEFACIMPTOT" ;
      edtavTotvaluefacimppp_Internalname = "vTOTVALUEFACIMPPP" ;
      edtavTotvaluefacbasimp_Internalname = "vTOTVALUEFACBASIMP" ;
      edtavTotvaluefacivaimp_Internalname = "vTOTVALUEFACIVAIMP" ;
      edtavTotvaluefactot_Internalname = "vTOTVALUEFACTOT" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
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
      edtEmprCod_Jsonclick = "" ;
      edtFacCob_Jsonclick = "" ;
      cmbFacEst.setJsonclick( "" );
      edtFacTipFac_Jsonclick = "" ;
      edtFacObs_Jsonclick = "" ;
      edtFacTot_Jsonclick = "" ;
      edtFacIVAImp_Jsonclick = "" ;
      edtFacBasImp_Jsonclick = "" ;
      edtFacImpPP_Jsonclick = "" ;
      edtFacImpTot_Jsonclick = "" ;
      edtFacPri_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtFacFch_Jsonclick = "" ;
      edtFacCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluefactot_Jsonclick = "" ;
      edtavTotvaluefactot_Enabled = 1 ;
      edtavTotvaluefacivaimp_Jsonclick = "" ;
      edtavTotvaluefacivaimp_Enabled = 1 ;
      edtavTotvaluefacbasimp_Jsonclick = "" ;
      edtavTotvaluefacbasimp_Enabled = 1 ;
      edtavTotvaluefacimppp_Jsonclick = "" ;
      edtavTotvaluefacimppp_Enabled = 1 ;
      edtavTotvaluefacimptot_Jsonclick = "" ;
      edtavTotvaluefacimptot_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavFacpri_Jsonclick = "" ;
      edtavFacpri_Enabled = 1 ;
      edtavFacfchto_Jsonclick = "" ;
      edtavFacfchto_Enabled = 1 ;
      edtavFacfchfrom_Jsonclick = "" ;
      edtavFacfchfrom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavFaccod_Jsonclick = "" ;
      edtavFaccod_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "Facturacion.MantenimientoFacturaWWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||||||||||0:Pdte. Imprimir,1:Impresa,2:Actualizada" ;
      Ddo_grid_Allowmultipleselection = "||||||||||T" ;
      Ddo_grid_Datalisttype = "|||Dynamic|||||||FixedValues" ;
      Ddo_grid_Includedatalist = "|||T|||||||T" ;
      Ddo_grid_Filterisrange = "|||||T|T|T|T|T|" ;
      Ddo_grid_Filtertype = "|||Character||Numeric|Numeric|Numeric|Numeric|Numeric|" ;
      Ddo_grid_Includefilter = "|||T||T|T|T|T|T|" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T||||||T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6||||||7" ;
      Ddo_grid_Columnids = "1:FacCod|2:FacFch|3:CliCod|4:CliNom|5:FacPri|6:FacImpTot|7:FacImpPP|8:FacBasImp|9:FacIVAImp|10:FacTot|13:FacEst" ;
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
      Form.setCaption( httpContext.getMessage( " Mantenimiento Factura", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_48_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV42GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV42GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridActions), 4, 0));
      }
      GXCCtl = "FACEST_" + sGXsfl_48_idx ;
      cmbFacEst.setName( GXCCtl );
      cmbFacEst.setWebtags( "" );
      cmbFacEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
      cmbFacEst.addItem("1", httpContext.getMessage( "Impresa", ""), (short)(0));
      cmbFacEst.addItem("2", httpContext.getMessage( "Actualizada", ""), (short)(0));
      if ( cmbFacEst.getItemCount() > 0 )
      {
         A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'},{av:'AV81EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFFacImpTot',fld:'vTFFACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV44TFFacImpTot_To',fld:'vTFFACIMPTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV45TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV46TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV47TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV48TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV49TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV50TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV51TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV52TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV78TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotFacImpTot',fld:'vTOTFACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV59TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV61TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV63TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV74FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'A441FacImpTot',fld:'FACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A429FacBasImp',fld:'FACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'A442FacIVAImp',fld:'FACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'A455FacTot',fld:'FACTOT',pic:'ZZZZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57TotFacImpTot',fld:'vTOTFACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV59TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV61TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV63TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV58TotValueFacImpTot',fld:'vTOTVALUEFACIMPTOT',pic:''},{av:'AV60TotValueFacImpPP',fld:'vTOTVALUEFACIMPPP',pic:''},{av:'AV62TotValueFacBasImp',fld:'vTOTVALUEFACBASIMP',pic:''},{av:'AV64TotValueFacIVAImp',fld:'vTOTVALUEFACIVAIMP',pic:''},{av:'AV66TotValueFacTot',fld:'vTOTVALUEFACTOT',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e111ZH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'},{av:'AV81EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFFacImpTot',fld:'vTFFACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV44TFFacImpTot_To',fld:'vTFFACIMPTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV45TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV46TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV47TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV48TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV49TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV50TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV51TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV52TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV78TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotFacImpTot',fld:'vTOTFACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV59TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV61TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV63TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV74FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e121ZH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'},{av:'AV81EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFFacImpTot',fld:'vTFFACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV44TFFacImpTot_To',fld:'vTFFACIMPTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV45TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV46TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV47TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV48TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV49TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV50TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV51TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV52TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV78TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotFacImpTot',fld:'vTOTFACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV59TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV61TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV63TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV74FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e131ZH2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'},{av:'AV81EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFFacImpTot',fld:'vTFFACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV44TFFacImpTot_To',fld:'vTFFACIMPTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV45TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV46TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV47TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV48TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV49TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV50TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV51TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV52TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV78TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotFacImpTot',fld:'vTOTFACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV59TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV61TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV63TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV74FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TFFacEst_SelsJson',fld:'vTFFACEST_SELSJSON',pic:''},{av:'AV78TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV51TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV52TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV49TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV50TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV47TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV48TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV45TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV46TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV43TFFacImpTot',fld:'vTFFACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV44TFFacImpTot_To',fld:'vTFFACIMPTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211ZH2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e221ZH2',iparms:[{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A436FacFch',fld:'FACFCH',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV74FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'cmbFacEst'},{av:'A435FacEst',fld:'FACEST',pic:'9'},{av:'A450FacPri',fld:'FACPRI',pic:'9'},{av:'A965FacCob',fld:'FACCOB',pic:'',hsh:true},{av:'A7210FacObs',fld:'FACOBS',pic:'',hsh:true},{av:'A1153FacTipFac',fld:'FACTIPFAC',pic:'9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'},{av:'AV81EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV37TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV43TFFacImpTot',fld:'vTFFACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV44TFFacImpTot_To',fld:'vTFFACIMPTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV45TFFacImpPP',fld:'vTFFACIMPPP',pic:'ZZZZZZZ9.99'},{av:'AV46TFFacImpPP_To',fld:'vTFFACIMPPP_TO',pic:'ZZZZZZZ9.99'},{av:'AV47TFFacBasImp',fld:'vTFFACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'AV48TFFacBasImp_To',fld:'vTFFACBASIMP_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV49TFFacIVAImp',fld:'vTFFACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'AV50TFFacIVAImp_To',fld:'vTFFACIVAIMP_TO',pic:'ZZZZZZZ9.99'},{av:'AV51TFFacTot',fld:'vTFFACTOT',pic:'ZZZZZZZZZ9.99'},{av:'AV52TFFacTot_To',fld:'vTFFACTOT_TO',pic:'ZZZZZZZZZ9.99'},{av:'AV78TFFacEst_Sels',fld:'vTFFACEST_SELS',pic:''},{av:'AV116Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57TotFacImpTot',fld:'vTOTFACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV59TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV61TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV63TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99',hsh:true},{av:'AV111pFacCod',fld:'vPFACCOD',pic:'ZZZZZZZ9'},{av:'AV110pCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'AV112pIniFacFch',fld:'vPINIFACFCH',pic:''},{av:'A441FacImpTot',fld:'FACIMPTOT',pic:'ZZZZZZZZZ9.99'},{av:'A440FacImpPP',fld:'FACIMPPP',pic:'ZZZZZZZ9.99'},{av:'A429FacBasImp',fld:'FACBASIMP',pic:'ZZZZZZZZZ9.99'},{av:'A442FacIVAImp',fld:'FACIVAIMP',pic:'ZZZZZZZ9.99'},{av:'A455FacTot',fld:'FACTOT',pic:'ZZZZZZZZZ9.99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'AV111pFacCod',fld:'vPFACCOD',pic:'ZZZZZZZ9'},{av:'AV112pIniFacFch',fld:'vPINIFACFCH',pic:''},{av:'AV110pCliCod',fld:'vPCLICOD',pic:'ZZZZZ9'},{av:'cmbavGridactions'},{av:'AV42GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV41GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV57TotFacImpTot',fld:'vTOTFACIMPTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV59TotFacImpPP',fld:'vTOTFACIMPPP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV61TotFacBasImp',fld:'vTOTFACBASIMP',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV63TotFacIVAImp',fld:'vTOTFACIVAIMP',pic:'ZZZZZZZ9.99',hsh:true},{av:'AV65TotFacTot',fld:'vTOTFACTOT',pic:'ZZZZZZZZZ9.99',hsh:true},{av:'AV58TotValueFacImpTot',fld:'vTOTVALUEFACIMPTOT',pic:''},{av:'AV60TotValueFacImpPP',fld:'vTOTVALUEFACIMPPP',pic:''},{av:'AV62TotValueFacBasImp',fld:'vTOTVALUEFACBASIMP',pic:''},{av:'AV64TotValueFacIVAImp',fld:'vTOTVALUEFACIVAIMP',pic:''},{av:'AV66TotValueFacTot',fld:'vTOTVALUEFACTOT',pic:''}]}");
      setEventMetadata("VFACPRI.CONTROLVALUECHANGED","{handler:'e141ZH2',iparms:[{av:'AV87FacPri',fld:'vFACPRI',pic:'9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''}]");
      setEventMetadata("VFACPRI.CONTROLVALUECHANGED",",oparms:[{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''}]}");
      setEventMetadata("VFACCOD.CONTROLVALUECHANGED","{handler:'e151ZH2',iparms:[{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'}]");
      setEventMetadata("VFACCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''}]}");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED","{handler:'e161ZH2',iparms:[{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'}]");
      setEventMetadata("VCLICOD.CONTROLVALUECHANGED",",oparms:[{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''}]}");
      setEventMetadata("VFACFCHFROM.CONTROLVALUECHANGED","{handler:'e171ZH2',iparms:[{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'}]");
      setEventMetadata("VFACFCHFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''}]}");
      setEventMetadata("VFACFCHTO.CONTROLVALUECHANGED","{handler:'e181ZH2',iparms:[{av:'AV84FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9'},{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV85FacFchFrom',fld:'vFACFCHFROM',pic:''},{av:'AV86FacFchTo',fld:'vFACFCHTO',pic:''},{av:'AV87FacPri',fld:'vFACPRI',pic:'9'}]");
      setEventMetadata("VFACFCHTO.CONTROLVALUECHANGED",",oparms:[{av:'AV88FilterMantenimientoFactura_SDT',fld:'vFILTERMANTENIMIENTOFACTURA_SDT',pic:''}]}");
      setEventMetadata("VALIDV_FACPRI","{handler:'validv_Facpri',iparms:[]");
      setEventMetadata("VALIDV_FACPRI",",oparms:[]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[]");
      setEventMetadata("VALID_FACCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FACIMPTOT","{handler:'valid_Facimptot',iparms:[]");
      setEventMetadata("VALID_FACIMPTOT",",oparms:[]}");
      setEventMetadata("VALID_FACIMPPP","{handler:'valid_Facimppp',iparms:[]");
      setEventMetadata("VALID_FACIMPPP",",oparms:[]}");
      setEventMetadata("VALID_FACBASIMP","{handler:'valid_Facbasimp',iparms:[]");
      setEventMetadata("VALID_FACBASIMP",",oparms:[]}");
      setEventMetadata("VALID_FACIVAIMP","{handler:'valid_Facivaimp',iparms:[]");
      setEventMetadata("VALID_FACIVAIMP",",oparms:[]}");
      setEventMetadata("VALID_FACTOT","{handler:'valid_Factot',iparms:[]");
      setEventMetadata("VALID_FACTOT",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
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
      AV85FacFchFrom = GXutil.nullDate() ;
      AV86FacFchTo = GXutil.nullDate() ;
      AV87FacPri = "" ;
      AV81EmprCod = "" ;
      AV36TFCliNom = "" ;
      AV37TFCliNom_Sel = "" ;
      AV43TFFacImpTot = DecimalUtil.ZERO ;
      AV44TFFacImpTot_To = DecimalUtil.ZERO ;
      AV45TFFacImpPP = DecimalUtil.ZERO ;
      AV46TFFacImpPP_To = DecimalUtil.ZERO ;
      AV47TFFacBasImp = DecimalUtil.ZERO ;
      AV48TFFacBasImp_To = DecimalUtil.ZERO ;
      AV49TFFacIVAImp = DecimalUtil.ZERO ;
      AV50TFFacIVAImp_To = DecimalUtil.ZERO ;
      AV51TFFacTot = DecimalUtil.ZERO ;
      AV52TFFacTot_To = DecimalUtil.ZERO ;
      AV78TFFacEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV116Pgmname = "" ;
      AV57TotFacImpTot = DecimalUtil.ZERO ;
      AV59TotFacImpPP = DecimalUtil.ZERO ;
      AV61TotFacBasImp = DecimalUtil.ZERO ;
      AV63TotFacIVAImp = DecimalUtil.ZERO ;
      AV65TotFacTot = DecimalUtil.ZERO ;
      Gx_date = GXutil.nullDate() ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV38DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV112pIniFacFch = GXutil.nullDate() ;
      AV88FilterMantenimientoFactura_SDT = new app.facturacion.SdtFilterMantenimientoFactura_SDT(remoteHandle, context);
      A11513FacRecIca = DecimalUtil.ZERO ;
      A11514FacImpIca1 = DecimalUtil.ZERO ;
      A11515FacImpIca = DecimalUtil.ZERO ;
      A8346FacRecI = DecimalUtil.ZERO ;
      A8348FacImpReI1 = DecimalUtil.ZERO ;
      A8347FacImpReI = DecimalUtil.ZERO ;
      A7212FacRect = DecimalUtil.ZERO ;
      A7214FacImpRet1 = DecimalUtil.ZERO ;
      A7213FacImpRet = DecimalUtil.ZERO ;
      A453FacRECPor = DecimalUtil.ZERO ;
      A3922FacRecImp1 = DecimalUtil.ZERO ;
      A452FacRecImp = DecimalUtil.ZERO ;
      A3921FacIvaImp1 = DecimalUtil.ZERO ;
      A14222FacCostMts = DecimalUtil.ZERO ;
      A14223FacCostKgs = DecimalUtil.ZERO ;
      A14224FacCostFac = DecimalUtil.ZERO ;
      A14221FacCostEng = DecimalUtil.ZERO ;
      A14220FacCostEne = DecimalUtil.ZERO ;
      A3918FacImpTot1 = DecimalUtil.ZERO ;
      A433FacDtoGen = DecimalUtil.ZERO ;
      A3919FacImpGen1 = DecimalUtil.ZERO ;
      A439FacImpGen = DecimalUtil.ZERO ;
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
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A436FacFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      A450FacPri = "" ;
      A441FacImpTot = DecimalUtil.ZERO ;
      A440FacImpPP = DecimalUtil.ZERO ;
      A429FacBasImp = DecimalUtil.ZERO ;
      A442FacIVAImp = DecimalUtil.ZERO ;
      A455FacTot = DecimalUtil.ZERO ;
      A7210FacObs = "" ;
      A965FacCob = "" ;
      A396EmprCod = "" ;
      AV118Facturacion_mantenimientofacturawwds_1_tfclinom = "" ;
      AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel = "" ;
      AV120Facturacion_mantenimientofacturawwds_3_tffacimptot = DecimalUtil.ZERO ;
      AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to = DecimalUtil.ZERO ;
      AV122Facturacion_mantenimientofacturawwds_5_tffacimppp = DecimalUtil.ZERO ;
      AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to = DecimalUtil.ZERO ;
      AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp = DecimalUtil.ZERO ;
      AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to = DecimalUtil.ZERO ;
      AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp = DecimalUtil.ZERO ;
      AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to = DecimalUtil.ZERO ;
      AV128Facturacion_mantenimientofacturawwds_11_tffactot = DecimalUtil.ZERO ;
      AV129Facturacion_mantenimientofacturawwds_12_tffactot_to = DecimalUtil.ZERO ;
      AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      scmdbuf = "" ;
      lV118Facturacion_mantenimientofacturawwds_1_tfclinom = "" ;
      H01ZH7_A7210FacObs = new String[] {""} ;
      H01ZH7_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZH7_A396EmprCod = new String[] {""} ;
      H01ZH7_A965FacCob = new String[] {""} ;
      H01ZH7_A435FacEst = new byte[1] ;
      H01ZH7_A1153FacTipFac = new byte[1] ;
      H01ZH7_A450FacPri = new String[] {""} ;
      H01ZH7_A279CliNom = new String[] {""} ;
      H01ZH7_A252CliCod = new int[1] ;
      H01ZH7_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZH7_A430FacCod = new int[1] ;
      H01ZH7_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_n8346FacRecI = new boolean[] {false} ;
      H01ZH7_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_A443FacIVAPor = new byte[1] ;
      H01ZH7_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_n3918FacImpTot1 = new boolean[] {false} ;
      H01ZH7_A7209Colombia = new byte[1] ;
      H01ZH7_n7209Colombia = new boolean[] {false} ;
      H01ZH7_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_n440FacImpPP = new boolean[] {false} ;
      H01ZH7_A441FacImpTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH7_n441FacImpTot = new boolean[] {false} ;
      H01ZH13_A7210FacObs = new String[] {""} ;
      H01ZH13_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZH13_A396EmprCod = new String[] {""} ;
      H01ZH13_A965FacCob = new String[] {""} ;
      H01ZH13_A435FacEst = new byte[1] ;
      H01ZH13_A1153FacTipFac = new byte[1] ;
      H01ZH13_A450FacPri = new String[] {""} ;
      H01ZH13_A279CliNom = new String[] {""} ;
      H01ZH13_A252CliCod = new int[1] ;
      H01ZH13_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZH13_A430FacCod = new int[1] ;
      H01ZH13_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_n8346FacRecI = new boolean[] {false} ;
      H01ZH13_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_A443FacIVAPor = new byte[1] ;
      H01ZH13_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_n3918FacImpTot1 = new boolean[] {false} ;
      H01ZH13_A7209Colombia = new byte[1] ;
      H01ZH13_n7209Colombia = new boolean[] {false} ;
      H01ZH13_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_n440FacImpPP = new boolean[] {false} ;
      H01ZH13_A441FacImpTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH13_n441FacImpTot = new boolean[] {false} ;
      AV58TotValueFacImpTot = "" ;
      AV60TotValueFacImpPP = "" ;
      AV62TotValueFacBasImp = "" ;
      AV64TotValueFacIVAImp = "" ;
      AV66TotValueFacTot = "" ;
      hsh = "" ;
      AV54Station = "" ;
      AV55EmprNom = "" ;
      AV56UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV75ContDsc = "" ;
      GXv_int8 = new byte[1] ;
      AV76Texto_fd = "" ;
      AV90PATHPDF = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV77TFFacEst_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV113pEndFacFch = GXutil.nullDate() ;
      AV68Cadena = "" ;
      AV69firma = "" ;
      AV71Hash = "" ;
      AV70Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message10 = new GXBaseCollection[1] ;
      GXv_boolean11 = new boolean[1] ;
      GXv_int12 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV73Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01ZH19_A1153FacTipFac = new byte[1] ;
      H01ZH19_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01ZH19_A252CliCod = new int[1] ;
      H01ZH19_A450FacPri = new String[] {""} ;
      H01ZH19_A430FacCod = new int[1] ;
      H01ZH19_A396EmprCod = new String[] {""} ;
      H01ZH19_A435FacEst = new byte[1] ;
      H01ZH19_A279CliNom = new String[] {""} ;
      H01ZH19_A11513FacRecIca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_A8346FacRecI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_n8346FacRecI = new boolean[] {false} ;
      H01ZH19_A7212FacRect = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_A453FacRECPor = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_A443FacIVAPor = new byte[1] ;
      H01ZH19_A14224FacCostFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_A14223FacCostKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_A14222FacCostMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_A433FacDtoGen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_A3918FacImpTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_n3918FacImpTot1 = new boolean[] {false} ;
      H01ZH19_A7209Colombia = new byte[1] ;
      H01ZH19_n7209Colombia = new boolean[] {false} ;
      H01ZH19_A440FacImpPP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_n440FacImpPP = new boolean[] {false} ;
      H01ZH19_A441FacImpTot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01ZH19_n441FacImpTot = new boolean[] {false} ;
      AV82WebSession = httpContext.getWebSession();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.mantenimientofacturaww__default(),
         new Object[] {
             new Object[] {
            H01ZH7_A7210FacObs, H01ZH7_A9606FacHor, H01ZH7_A396EmprCod, H01ZH7_A965FacCob, H01ZH7_A435FacEst, H01ZH7_A1153FacTipFac, H01ZH7_A450FacPri, H01ZH7_A279CliNom, H01ZH7_A252CliCod, H01ZH7_A436FacFch,
            H01ZH7_A430FacCod, H01ZH7_A11513FacRecIca, H01ZH7_A8346FacRecI, H01ZH7_n8346FacRecI, H01ZH7_A7212FacRect, H01ZH7_A453FacRECPor, H01ZH7_A443FacIVAPor, H01ZH7_A14224FacCostFac, H01ZH7_A14223FacCostKgs, H01ZH7_A14222FacCostMts,
            H01ZH7_A433FacDtoGen, H01ZH7_A3918FacImpTot1, H01ZH7_n3918FacImpTot1, H01ZH7_A7209Colombia, H01ZH7_n7209Colombia, H01ZH7_A440FacImpPP, H01ZH7_n440FacImpPP, H01ZH7_A441FacImpTot, H01ZH7_n441FacImpTot
            }
            , new Object[] {
            H01ZH13_A7210FacObs, H01ZH13_A9606FacHor, H01ZH13_A396EmprCod, H01ZH13_A965FacCob, H01ZH13_A435FacEst, H01ZH13_A1153FacTipFac, H01ZH13_A450FacPri, H01ZH13_A279CliNom, H01ZH13_A252CliCod, H01ZH13_A436FacFch,
            H01ZH13_A430FacCod, H01ZH13_A11513FacRecIca, H01ZH13_A8346FacRecI, H01ZH13_n8346FacRecI, H01ZH13_A7212FacRect, H01ZH13_A453FacRECPor, H01ZH13_A443FacIVAPor, H01ZH13_A14224FacCostFac, H01ZH13_A14223FacCostKgs, H01ZH13_A14222FacCostMts,
            H01ZH13_A433FacDtoGen, H01ZH13_A3918FacImpTot1, H01ZH13_n3918FacImpTot1, H01ZH13_A7209Colombia, H01ZH13_n7209Colombia, H01ZH13_A440FacImpPP, H01ZH13_n440FacImpPP, H01ZH13_A441FacImpTot, H01ZH13_n441FacImpTot
            }
            , new Object[] {
            H01ZH19_A1153FacTipFac, H01ZH19_A436FacFch, H01ZH19_A252CliCod, H01ZH19_A450FacPri, H01ZH19_A430FacCod, H01ZH19_A396EmprCod, H01ZH19_A435FacEst, H01ZH19_A279CliNom, H01ZH19_A11513FacRecIca, H01ZH19_A8346FacRecI,
            H01ZH19_n8346FacRecI, H01ZH19_A7212FacRect, H01ZH19_A453FacRECPor, H01ZH19_A443FacIVAPor, H01ZH19_A14224FacCostFac, H01ZH19_A14223FacCostKgs, H01ZH19_A14222FacCostMts, H01ZH19_A433FacDtoGen, H01ZH19_A3918FacImpTot1, H01ZH19_n3918FacImpTot1,
            H01ZH19_A7209Colombia, H01ZH19_n7209Colombia, H01ZH19_A440FacImpPP, H01ZH19_n440FacImpPP, H01ZH19_A441FacImpTot, H01ZH19_n441FacImpTot
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV116Pgmname = "Facturacion.MantenimientoFacturaWW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV116Pgmname = "Facturacion.MantenimientoFacturaWW" ;
      Gx_err = (short)(0) ;
      edtavTotvaluefacimptot_Enabled = 0 ;
      edtavTotvaluefacimppp_Enabled = 0 ;
      edtavTotvaluefacbasimp_Enabled = 0 ;
      edtavTotvaluefacivaimp_Enabled = 0 ;
      edtavTotvaluefactot_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A7209Colombia ;
   private byte A443FacIVAPor ;
   private byte A1153FacTipFac ;
   private byte A435FacEst ;
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
   private short AV74FirmaD ;
   private short wbEnd ;
   private short wbStart ;
   private short AV42GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV89moda21 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_48 ;
   private int nGXsfl_48_idx=1 ;
   private int AV84FacCod ;
   private int AV83CliCod ;
   private int AV111pFacCod ;
   private int AV110pCliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavFaccod_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavFacfchfrom_Enabled ;
   private int edtavFacfchto_Enabled ;
   private int edtavFacpri_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluefacimptot_Enabled ;
   private int edtavTotvaluefacimppp_Enabled ;
   private int edtavTotvaluefacbasimp_Enabled ;
   private int edtavTotvaluefacivaimp_Enabled ;
   private int edtavTotvaluefactot_Enabled ;
   private int AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels_size ;
   private int AV39PageToGo ;
   private int GXv_int12[] ;
   private int AV131GXV1 ;
   private int AV132GXV2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV40GridCurrentPage ;
   private long AV41GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV43TFFacImpTot ;
   private java.math.BigDecimal AV44TFFacImpTot_To ;
   private java.math.BigDecimal AV45TFFacImpPP ;
   private java.math.BigDecimal AV46TFFacImpPP_To ;
   private java.math.BigDecimal AV47TFFacBasImp ;
   private java.math.BigDecimal AV48TFFacBasImp_To ;
   private java.math.BigDecimal AV49TFFacIVAImp ;
   private java.math.BigDecimal AV50TFFacIVAImp_To ;
   private java.math.BigDecimal AV51TFFacTot ;
   private java.math.BigDecimal AV52TFFacTot_To ;
   private java.math.BigDecimal AV57TotFacImpTot ;
   private java.math.BigDecimal AV59TotFacImpPP ;
   private java.math.BigDecimal AV61TotFacBasImp ;
   private java.math.BigDecimal AV63TotFacIVAImp ;
   private java.math.BigDecimal AV65TotFacTot ;
   private java.math.BigDecimal A11513FacRecIca ;
   private java.math.BigDecimal A11514FacImpIca1 ;
   private java.math.BigDecimal A11515FacImpIca ;
   private java.math.BigDecimal A8346FacRecI ;
   private java.math.BigDecimal A8348FacImpReI1 ;
   private java.math.BigDecimal A8347FacImpReI ;
   private java.math.BigDecimal A7212FacRect ;
   private java.math.BigDecimal A7214FacImpRet1 ;
   private java.math.BigDecimal A7213FacImpRet ;
   private java.math.BigDecimal A453FacRECPor ;
   private java.math.BigDecimal A3922FacRecImp1 ;
   private java.math.BigDecimal A452FacRecImp ;
   private java.math.BigDecimal A3921FacIvaImp1 ;
   private java.math.BigDecimal A14222FacCostMts ;
   private java.math.BigDecimal A14223FacCostKgs ;
   private java.math.BigDecimal A14224FacCostFac ;
   private java.math.BigDecimal A14221FacCostEng ;
   private java.math.BigDecimal A14220FacCostEne ;
   private java.math.BigDecimal A3918FacImpTot1 ;
   private java.math.BigDecimal A433FacDtoGen ;
   private java.math.BigDecimal A3919FacImpGen1 ;
   private java.math.BigDecimal A439FacImpGen ;
   private java.math.BigDecimal A441FacImpTot ;
   private java.math.BigDecimal A440FacImpPP ;
   private java.math.BigDecimal A429FacBasImp ;
   private java.math.BigDecimal A442FacIVAImp ;
   private java.math.BigDecimal A455FacTot ;
   private java.math.BigDecimal AV120Facturacion_mantenimientofacturawwds_3_tffacimptot ;
   private java.math.BigDecimal AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to ;
   private java.math.BigDecimal AV122Facturacion_mantenimientofacturawwds_5_tffacimppp ;
   private java.math.BigDecimal AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to ;
   private java.math.BigDecimal AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp ;
   private java.math.BigDecimal AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ;
   private java.math.BigDecimal AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp ;
   private java.math.BigDecimal AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ;
   private java.math.BigDecimal AV128Facturacion_mantenimientofacturawwds_11_tffactot ;
   private java.math.BigDecimal AV129Facturacion_mantenimientofacturawwds_12_tffactot_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_48_idx="0001" ;
   private String AV87FacPri ;
   private String AV81EmprCod ;
   private String AV36TFCliNom ;
   private String AV37TFCliNom_Sel ;
   private String AV116Pgmname ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String edtavFaccod_Internalname ;
   private String TempTags ;
   private String edtavFaccod_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavFacfchfrom_Internalname ;
   private String edtavFacfchfrom_Jsonclick ;
   private String edtavFacfchto_Internalname ;
   private String edtavFacfchto_Jsonclick ;
   private String edtavFacpri_Internalname ;
   private String edtavFacpri_Jsonclick ;
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
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtFacCod_Internalname ;
   private String edtFacFch_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A450FacPri ;
   private String edtFacPri_Internalname ;
   private String edtFacImpTot_Internalname ;
   private String edtFacImpPP_Internalname ;
   private String edtFacBasImp_Internalname ;
   private String edtFacIVAImp_Internalname ;
   private String edtFacTot_Internalname ;
   private String edtFacObs_Internalname ;
   private String edtFacTipFac_Internalname ;
   private String A965FacCob ;
   private String edtFacCob_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtavTotvaluefacimptot_Internalname ;
   private String edtavTotvaluefacimppp_Internalname ;
   private String edtavTotvaluefacbasimp_Internalname ;
   private String edtavTotvaluefacivaimp_Internalname ;
   private String edtavTotvaluefactot_Internalname ;
   private String AV118Facturacion_mantenimientofacturawwds_1_tfclinom ;
   private String AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel ;
   private String scmdbuf ;
   private String lV118Facturacion_mantenimientofacturawwds_1_tfclinom ;
   private String hsh ;
   private String AV54Station ;
   private String AV55EmprNom ;
   private String AV56UsurCod ;
   private String AV75ContDsc ;
   private String AV90PATHPDF ;
   private String AV68Cadena ;
   private String AV69firma ;
   private String AV71Hash ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluefacimptot_Jsonclick ;
   private String edtavTotvaluefacimppp_Jsonclick ;
   private String edtavTotvaluefacbasimp_Jsonclick ;
   private String edtavTotvaluefacivaimp_Jsonclick ;
   private String edtavTotvaluefactot_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_48_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtFacCod_Jsonclick ;
   private String edtFacFch_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtFacPri_Jsonclick ;
   private String edtFacImpTot_Jsonclick ;
   private String edtFacImpPP_Jsonclick ;
   private String edtFacBasImp_Jsonclick ;
   private String edtFacIVAImp_Jsonclick ;
   private String edtFacTot_Jsonclick ;
   private String edtFacObs_Jsonclick ;
   private String edtFacTipFac_Jsonclick ;
   private String edtFacCob_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A9606FacHor ;
   private java.util.Date AV85FacFchFrom ;
   private java.util.Date AV86FacFchTo ;
   private java.util.Date Gx_date ;
   private java.util.Date AV112pIniFacFch ;
   private java.util.Date A436FacFch ;
   private java.util.Date AV113pEndFacFch ;
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
   private boolean n441FacImpTot ;
   private boolean n440FacImpPP ;
   private boolean n8346FacRecI ;
   private boolean n3918FacImpTot1 ;
   private boolean n7209Colombia ;
   private boolean bGXsfl_48_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV72ok ;
   private boolean GXv_boolean11[] ;
   private String A7210FacObs ;
   private String AV77TFFacEst_SelsJson ;
   private String AV58TotValueFacImpTot ;
   private String AV60TotValueFacImpPP ;
   private String AV62TotValueFacBasImp ;
   private String AV64TotValueFacIVAImp ;
   private String AV66TotValueFacTot ;
   private String AV76Texto_fd ;
   private GXSimpleCollection<Byte> AV78TFFacEst_Sels ;
   private GXSimpleCollection<Byte> AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.WebSession AV82WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbFacEst ;
   private IDataStoreProvider pr_default ;
   private String[] H01ZH7_A7210FacObs ;
   private java.util.Date[] H01ZH7_A9606FacHor ;
   private String[] H01ZH7_A396EmprCod ;
   private String[] H01ZH7_A965FacCob ;
   private byte[] H01ZH7_A435FacEst ;
   private byte[] H01ZH7_A1153FacTipFac ;
   private String[] H01ZH7_A450FacPri ;
   private String[] H01ZH7_A279CliNom ;
   private int[] H01ZH7_A252CliCod ;
   private java.util.Date[] H01ZH7_A436FacFch ;
   private int[] H01ZH7_A430FacCod ;
   private java.math.BigDecimal[] H01ZH7_A11513FacRecIca ;
   private java.math.BigDecimal[] H01ZH7_A8346FacRecI ;
   private boolean[] H01ZH7_n8346FacRecI ;
   private java.math.BigDecimal[] H01ZH7_A7212FacRect ;
   private java.math.BigDecimal[] H01ZH7_A453FacRECPor ;
   private byte[] H01ZH7_A443FacIVAPor ;
   private java.math.BigDecimal[] H01ZH7_A14224FacCostFac ;
   private java.math.BigDecimal[] H01ZH7_A14223FacCostKgs ;
   private java.math.BigDecimal[] H01ZH7_A14222FacCostMts ;
   private java.math.BigDecimal[] H01ZH7_A433FacDtoGen ;
   private java.math.BigDecimal[] H01ZH7_A3918FacImpTot1 ;
   private boolean[] H01ZH7_n3918FacImpTot1 ;
   private byte[] H01ZH7_A7209Colombia ;
   private boolean[] H01ZH7_n7209Colombia ;
   private java.math.BigDecimal[] H01ZH7_A440FacImpPP ;
   private boolean[] H01ZH7_n440FacImpPP ;
   private java.math.BigDecimal[] H01ZH7_A441FacImpTot ;
   private boolean[] H01ZH7_n441FacImpTot ;
   private String[] H01ZH13_A7210FacObs ;
   private java.util.Date[] H01ZH13_A9606FacHor ;
   private String[] H01ZH13_A396EmprCod ;
   private String[] H01ZH13_A965FacCob ;
   private byte[] H01ZH13_A435FacEst ;
   private byte[] H01ZH13_A1153FacTipFac ;
   private String[] H01ZH13_A450FacPri ;
   private String[] H01ZH13_A279CliNom ;
   private int[] H01ZH13_A252CliCod ;
   private java.util.Date[] H01ZH13_A436FacFch ;
   private int[] H01ZH13_A430FacCod ;
   private java.math.BigDecimal[] H01ZH13_A11513FacRecIca ;
   private java.math.BigDecimal[] H01ZH13_A8346FacRecI ;
   private boolean[] H01ZH13_n8346FacRecI ;
   private java.math.BigDecimal[] H01ZH13_A7212FacRect ;
   private java.math.BigDecimal[] H01ZH13_A453FacRECPor ;
   private byte[] H01ZH13_A443FacIVAPor ;
   private java.math.BigDecimal[] H01ZH13_A14224FacCostFac ;
   private java.math.BigDecimal[] H01ZH13_A14223FacCostKgs ;
   private java.math.BigDecimal[] H01ZH13_A14222FacCostMts ;
   private java.math.BigDecimal[] H01ZH13_A433FacDtoGen ;
   private java.math.BigDecimal[] H01ZH13_A3918FacImpTot1 ;
   private boolean[] H01ZH13_n3918FacImpTot1 ;
   private byte[] H01ZH13_A7209Colombia ;
   private boolean[] H01ZH13_n7209Colombia ;
   private java.math.BigDecimal[] H01ZH13_A440FacImpPP ;
   private boolean[] H01ZH13_n440FacImpPP ;
   private java.math.BigDecimal[] H01ZH13_A441FacImpTot ;
   private boolean[] H01ZH13_n441FacImpTot ;
   private byte[] H01ZH19_A1153FacTipFac ;
   private java.util.Date[] H01ZH19_A436FacFch ;
   private int[] H01ZH19_A252CliCod ;
   private String[] H01ZH19_A450FacPri ;
   private int[] H01ZH19_A430FacCod ;
   private String[] H01ZH19_A396EmprCod ;
   private byte[] H01ZH19_A435FacEst ;
   private String[] H01ZH19_A279CliNom ;
   private java.math.BigDecimal[] H01ZH19_A11513FacRecIca ;
   private java.math.BigDecimal[] H01ZH19_A8346FacRecI ;
   private boolean[] H01ZH19_n8346FacRecI ;
   private java.math.BigDecimal[] H01ZH19_A7212FacRect ;
   private java.math.BigDecimal[] H01ZH19_A453FacRECPor ;
   private byte[] H01ZH19_A443FacIVAPor ;
   private java.math.BigDecimal[] H01ZH19_A14224FacCostFac ;
   private java.math.BigDecimal[] H01ZH19_A14223FacCostKgs ;
   private java.math.BigDecimal[] H01ZH19_A14222FacCostMts ;
   private java.math.BigDecimal[] H01ZH19_A433FacDtoGen ;
   private java.math.BigDecimal[] H01ZH19_A3918FacImpTot1 ;
   private boolean[] H01ZH19_n3918FacImpTot1 ;
   private byte[] H01ZH19_A7209Colombia ;
   private boolean[] H01ZH19_n7209Colombia ;
   private java.math.BigDecimal[] H01ZH19_A440FacImpPP ;
   private boolean[] H01ZH19_n440FacImpPP ;
   private java.math.BigDecimal[] H01ZH19_A441FacImpTot ;
   private boolean[] H01ZH19_n441FacImpTot ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV70Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message10[] ;
   private com.genexus.SdtMessages_Message AV73Message ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV38DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.facturacion.SdtFilterMantenimientoFactura_SDT AV88FilterMantenimientoFactura_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class mantenimientofacturaww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01ZH7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A435FacEst ,
                                          GXSimpleCollection<Byte> AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                          String AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                          String AV118Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                          int AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels_size ,
                                          int AV84FacCod ,
                                          int AV83CliCod ,
                                          java.util.Date AV85FacFchFrom ,
                                          java.util.Date AV86FacFchTo ,
                                          String A279CliNom ,
                                          int A430FacCod ,
                                          int A252CliCod ,
                                          java.util.Date A436FacFch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          java.math.BigDecimal AV120Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                          java.math.BigDecimal A441FacImpTot ,
                                          java.math.BigDecimal AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                          java.math.BigDecimal AV122Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                          java.math.BigDecimal A440FacImpPP ,
                                          java.math.BigDecimal AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                          java.math.BigDecimal AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                          java.math.BigDecimal A429FacBasImp ,
                                          java.math.BigDecimal AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                          java.math.BigDecimal AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                          java.math.BigDecimal A442FacIVAImp ,
                                          java.math.BigDecimal AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                          java.math.BigDecimal AV128Facturacion_mantenimientofacturawwds_11_tffactot ,
                                          java.math.BigDecimal A455FacTot ,
                                          java.math.BigDecimal AV129Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                          String A450FacPri ,
                                          String AV87FacPri ,
                                          byte A1153FacTipFac ,
                                          String AV81EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[16];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.FacObs, T1.FacHor, T1.EmprCod, T1.FacCob, T1.FacEst, T1.FacTipFac, T1.FacPri, T3.CliNom, T1.CliCod, T1.FacFch, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect," ;
      scmdbuf += " T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, COALESCE( T5.FacImpTot1, 0) AS FacImpTot1, T2.Colombia, COALESCE( T6.FacImpPP," ;
      scmdbuf += " 0) AS FacImpPP, COALESCE( T4.FacImpTot, 0) AS FacImpTot FROM (((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN (SELECT ROUND(COALESCE( T8.FacImpTot1, 0), 2) + ROUND(CAST(( COALESCE( T8.FacImpTot1, 0) * CAST(T7.FacEnergia" ;
      scmdbuf += " AS NUMERIC(23,10))) / 100 AS NUMERIC(27,10)), 2) AS FacImpTot, T7.EmprCod, T7.FacCod FROM (TXPCFAVEN T7 LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN" ;
      scmdbuf += " ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs" ;
      scmdbuf += " * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd" ;
      scmdbuf += " AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan =" ;
      scmdbuf += " 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T8 ON T8.EmprCod = T7.EmprCod" ;
      scmdbuf += " AND T8.FacCod = T7.FacCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs *" ;
      scmdbuf += " CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS" ;
      scmdbuf += " NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd =" ;
      scmdbuf += " 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod" ;
      scmdbuf += " = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T8.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100" ;
      scmdbuf += " AS NUMERIC(26,10)), 2) WHEN COALESCE( T8.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10))," ;
      scmdbuf += " 0) END AS FacImpPP, T7.EmprCod, T7.FacCod FROM ((TXPCFAVEN T7 INNER JOIN TXPEMPRES T8 ON T8.EmprCod = T7.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND((" ;
      scmdbuf += " CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + (" ;
      scmdbuf += " FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN" ;
      scmdbuf += " (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and" ;
      scmdbuf += " (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA *" ;
      scmdbuf += " CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T7.EmprCod AND T9.FacCod = T7.FacCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacPri = ?)");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( (GXutil.strcmp("", AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV118Facturacion_mantenimientofacturawwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( ! (0==AV84FacCod) )
      {
         addWhere(sWhereString, "(T1.FacCod = ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV83CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85FacFchFrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86FacFchTo)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.FacCod DESC, T1.FacFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacFch" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacPri" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacEst" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacEst DESC" ;
      }
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_H01ZH13( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A435FacEst ,
                                           GXSimpleCollection<Byte> AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                           String AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                           String AV118Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                           int AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels_size ,
                                           int AV84FacCod ,
                                           int AV83CliCod ,
                                           java.util.Date AV85FacFchFrom ,
                                           java.util.Date AV86FacFchTo ,
                                           String A279CliNom ,
                                           int A430FacCod ,
                                           int A252CliCod ,
                                           java.util.Date A436FacFch ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           java.math.BigDecimal AV120Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                           java.math.BigDecimal A441FacImpTot ,
                                           java.math.BigDecimal AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                           java.math.BigDecimal AV122Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                           java.math.BigDecimal A440FacImpPP ,
                                           java.math.BigDecimal AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                           java.math.BigDecimal AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                           java.math.BigDecimal A429FacBasImp ,
                                           java.math.BigDecimal AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                           java.math.BigDecimal AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                           java.math.BigDecimal A442FacIVAImp ,
                                           java.math.BigDecimal AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                           java.math.BigDecimal AV128Facturacion_mantenimientofacturawwds_11_tffactot ,
                                           java.math.BigDecimal A455FacTot ,
                                           java.math.BigDecimal AV129Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                           String A450FacPri ,
                                           String AV87FacPri ,
                                           byte A1153FacTipFac ,
                                           String AV81EmprCod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[16];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT T1.FacObs, T1.FacHor, T1.EmprCod, T1.FacCob, T1.FacEst, T1.FacTipFac, T1.FacPri, T3.CliNom, T1.CliCod, T1.FacFch, T1.FacCod, T1.FacRecIca, T1.FacRecI, T1.FacRect," ;
      scmdbuf += " T1.FacRECPor, T1.FacIVAPor, T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, COALESCE( T5.FacImpTot1, 0) AS FacImpTot1, T2.Colombia, COALESCE( T6.FacImpPP," ;
      scmdbuf += " 0) AS FacImpPP, COALESCE( T4.FacImpTot, 0) AS FacImpTot FROM (((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T3.CliCod = T1.CliCod) INNER JOIN (SELECT ROUND(COALESCE( T8.FacImpTot1, 0), 2) + ROUND(CAST(( COALESCE( T8.FacImpTot1, 0) * CAST(T7.FacEnergia" ;
      scmdbuf += " AS NUMERIC(23,10))) / 100 AS NUMERIC(27,10)), 2) AS FacImpTot, T7.EmprCod, T7.FacCod FROM (TXPCFAVEN T7 LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN" ;
      scmdbuf += " ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs" ;
      scmdbuf += " * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd" ;
      scmdbuf += " AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan =" ;
      scmdbuf += " 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T8 ON T8.EmprCod = T7.EmprCod" ;
      scmdbuf += " AND T8.FacCod = T7.FacCod) ) T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs *" ;
      scmdbuf += " CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS" ;
      scmdbuf += " NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd =" ;
      scmdbuf += " 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod" ;
      scmdbuf += " = T1.FacCod) LEFT JOIN (SELECT CASE  WHEN COALESCE( T8.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100" ;
      scmdbuf += " AS NUMERIC(26,10)), 2) WHEN COALESCE( T8.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10))," ;
      scmdbuf += " 0) END AS FacImpPP, T7.EmprCod, T7.FacCod FROM ((TXPCFAVEN T7 INNER JOIN TXPEMPRES T8 ON T8.EmprCod = T7.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND((" ;
      scmdbuf += " CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + (" ;
      scmdbuf += " FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN" ;
      scmdbuf += " (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and" ;
      scmdbuf += " (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA *" ;
      scmdbuf += " CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T9 ON T9.EmprCod" ;
      scmdbuf += " = T7.EmprCod AND T9.FacCod = T7.FacCod) ) T6 ON T6.EmprCod = T1.EmprCod AND T6.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacPri = ?)");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( (GXutil.strcmp("", AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV118Facturacion_mantenimientofacturawwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( ! (0==AV84FacCod) )
      {
         addWhere(sWhereString, "(T1.FacCod = ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (0==AV83CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85FacFchFrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86FacFchTo)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.EmprCod DESC, T1.FacCod DESC, T1.FacFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacFch" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacFch DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacPri" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacPri DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.FacEst" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.FacEst DESC" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H01ZH19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           byte A435FacEst ,
                                           GXSimpleCollection<Byte> AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels ,
                                           String AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel ,
                                           String AV118Facturacion_mantenimientofacturawwds_1_tfclinom ,
                                           int AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels_size ,
                                           int AV84FacCod ,
                                           int AV83CliCod ,
                                           java.util.Date AV85FacFchFrom ,
                                           java.util.Date AV86FacFchTo ,
                                           String A279CliNom ,
                                           int A430FacCod ,
                                           int A252CliCod ,
                                           java.util.Date A436FacFch ,
                                           java.math.BigDecimal AV120Facturacion_mantenimientofacturawwds_3_tffacimptot ,
                                           java.math.BigDecimal A441FacImpTot ,
                                           java.math.BigDecimal AV121Facturacion_mantenimientofacturawwds_4_tffacimptot_to ,
                                           java.math.BigDecimal AV122Facturacion_mantenimientofacturawwds_5_tffacimppp ,
                                           java.math.BigDecimal A440FacImpPP ,
                                           java.math.BigDecimal AV123Facturacion_mantenimientofacturawwds_6_tffacimppp_to ,
                                           java.math.BigDecimal AV124Facturacion_mantenimientofacturawwds_7_tffacbasimp ,
                                           java.math.BigDecimal A429FacBasImp ,
                                           java.math.BigDecimal AV125Facturacion_mantenimientofacturawwds_8_tffacbasimp_to ,
                                           java.math.BigDecimal AV126Facturacion_mantenimientofacturawwds_9_tffacivaimp ,
                                           java.math.BigDecimal A442FacIVAImp ,
                                           java.math.BigDecimal AV127Facturacion_mantenimientofacturawwds_10_tffacivaimp_to ,
                                           java.math.BigDecimal AV128Facturacion_mantenimientofacturawwds_11_tffactot ,
                                           java.math.BigDecimal A455FacTot ,
                                           java.math.BigDecimal AV129Facturacion_mantenimientofacturawwds_12_tffactot_to ,
                                           String A450FacPri ,
                                           String AV87FacPri ,
                                           byte A1153FacTipFac ,
                                           String AV81EmprCod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[16];
      Object[] GXv_Object21 = new Object[2];
      scmdbuf = "SELECT T1.FacTipFac, T1.FacFch, T1.CliCod, T1.FacPri, T1.FacCod, T1.EmprCod, T1.FacEst, T3.CliNom, T1.FacRecIca, T1.FacRecI, T1.FacRect, T1.FacRECPor, T1.FacIVAPor," ;
      scmdbuf += " T1.FacCostFac, T1.FacCostKgs, T1.FacCostMts, T1.FacDtoGen, COALESCE( T5.FacImpTot1, 0) AS FacImpTot1, T2.Colombia, COALESCE( T6.FacImpPP, 0) AS FacImpPP, COALESCE(" ;
      scmdbuf += " T4.FacImpTot, 0) AS FacImpTot FROM (((((TXPCFAVEN T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND" ;
      scmdbuf += " T3.CliCod = T1.CliCod) INNER JOIN (SELECT ROUND(COALESCE( T8.FacImpTot1, 0), 2) + ROUND(CAST(( COALESCE( T8.FacImpTot1, 0) * CAST(T7.FacEnergia AS NUMERIC(23,10)))" ;
      scmdbuf += " / 100 AS NUMERIC(27,10)), 2) AS FacImpTot, T7.EmprCod, T7.FacCod FROM (TXPCFAVEN T7 LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not" ;
      scmdbuf += " (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE" ;
      scmdbuf += " ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T8 ON T8.EmprCod = T7.EmprCod AND T8.FacCod = T7.FacCod) )" ;
      scmdbuf += " T4 ON T4.EmprCod = T1.EmprCod AND T4.FacCod = T1.FacCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) < FacImpMin" ;
      scmdbuf += " and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts" ;
      scmdbuf += " * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not (FacImpMan =" ;
      scmdbuf += " 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE ( ( FacPreKgs" ;
      scmdbuf += " * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd" ;
      scmdbuf += " AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T5 ON T5.EmprCod = T1.EmprCod AND T5.FacCod = T1.FacCod) LEFT JOIN (SELECT" ;
      scmdbuf += " CASE  WHEN COALESCE( T8.Colombia, 0) = 0 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 2) WHEN COALESCE(" ;
      scmdbuf += " T8.Colombia, 0) = 1 THEN ROUND(CAST(COALESCE( T9.FacImpTot1, 0) * CAST(T7.FacDtoPP AS NUMERIC(23,10)) / 100 AS NUMERIC(26,10)), 0) END AS FacImpPP, T7.EmprCod," ;
      scmdbuf += " T7.FacCod FROM ((TXPCFAVEN T7 INNER JOIN TXPEMPRES T8 ON T8.EmprCod = T7.EmprCod) LEFT JOIN (SELECT EmprCod, FacCod, SUM(ROUND(( CASE  WHEN ( ( FacPreKgs * CAST(FacKgs" ;
      scmdbuf += " AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10))))" ;
      scmdbuf += " < FacImpMin and Not (FacImpMin = 0) and Not (FacPreKgs = 0) and Not (FacKgs = 0) and (FacMts = 0) THEN FacImpMin WHEN (( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10)))" ;
      scmdbuf += " + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds * CAST(FacPreUnd AS NUMERIC(23,10)))) = 0) and Not" ;
      scmdbuf += " (FacImpMan = 0) THEN FacImpMan WHEN Not (FacKgs = 0) and (FacPreKgs = 0) and (FacMts = 0) and (FacPreMts = 0) and (FacImpMan = 0) and (FacPreUnd = 0) THEN 0 ELSE" ;
      scmdbuf += " ( ( FacPreKgs * CAST(FacKgs AS NUMERIC(23,10))) + ( FacPreMts * CAST(FacMts AS NUMERIC(23,10))) + ( FacPreKgsA * CAST(FacKgsA AS NUMERIC(23,10))) + ( FacUnds *" ;
      scmdbuf += " CAST(FacPreUnd AS NUMERIC(23,10)))) END), 2)) AS FacImpTot1 FROM TXPLFAVEN GROUP BY EmprCod, FacCod ) T9 ON T9.EmprCod = T7.EmprCod AND T9.FacCod = T7.FacCod) )" ;
      scmdbuf += " T6 ON T6.EmprCod = T1.EmprCod AND T6.FacCod = T1.FacCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T4.FacImpTot, 0) <= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) >= ?))");
      addWhere(sWhereString, "((? = 0) or ( COALESCE( T6.FacImpPP, 0) <= ?))");
      addWhere(sWhereString, "(T1.FacPri = ?)");
      addWhere(sWhereString, "(T1.FacTipFac = 0)");
      if ( (GXutil.strcmp("", AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV118Facturacion_mantenimientofacturawwds_1_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Facturacion_mantenimientofacturawwds_2_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV130Facturacion_mantenimientofacturawwds_13_tffacest_sels, "T1.FacEst IN (", ")")+")");
      }
      if ( ! (0==AV84FacCod) )
      {
         addWhere(sWhereString, "(T1.FacCod = ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV83CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod = ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV85FacFchFrom)) )
      {
         addWhere(sWhereString, "(T1.FacFch >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86FacFchTo)) )
      {
         addWhere(sWhereString, "(T1.FacFch <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
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
                  return conditional_H01ZH7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 1 :
                  return conditional_H01ZH13(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (java.math.BigDecimal)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , (String)dynConstraints[34] );
            case 2 :
                  return conditional_H01ZH19(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , (java.util.Date)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (java.math.BigDecimal)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , (java.math.BigDecimal)dynConstraints[21] , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , (String)dynConstraints[32] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01ZH7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZH13", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01ZH19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,3);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,3);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,3);
               ((byte[]) buf[16])[0] = rslt.getByte(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(12,3);
               ((byte[]) buf[13])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[30]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

